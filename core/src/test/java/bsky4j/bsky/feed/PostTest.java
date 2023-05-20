package bsky4j.bsky.feed;

import bsky4j.ATProtocolFactory;
import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.atproto.identity.IdentityResolveHandleRequest;
import bsky4j.api.entity.atproto.identity.IdentityResolveHandleResponse;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobResponse;
import bsky4j.api.entity.bsky.feed.FeedDeletePostRequest;
import bsky4j.api.entity.bsky.feed.FeedPostRequest;
import bsky4j.api.entity.bsky.feed.FeedPostResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import bsky4j.model.atproto.repo.RepoStrongRef;
import bsky4j.model.bsky.embed.EmbedImages;
import bsky4j.model.bsky.embed.EmbedImagesImage;
import bsky4j.model.bsky.feed.FeedPostReplyRef;
import bsky4j.model.bsky.richtext.RichtextFacet;
import bsky4j.util.facet.FacetList;
import bsky4j.util.facet.FacetRecord;
import bsky4j.util.facet.FacetType;
import bsky4j.util.facet.FacetUtil;
import com.google.gson.Gson;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PostTest extends AbstractTest {

    @Test
    public void testPost() {

        Response<FeedPostResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().post(
                        FeedPostRequest.builder()
                                .accessJwt(accessJwt)
                                .text("テスト投稿")
                                .build()
                );

        System.out.println(response.get().getUri());
    }

    @Test
    public void testFeedPostWithImage() {
        InputStream stream = getClass().getResourceAsStream("/image/icon.png");

        // Upload Image
        Response<RepoUploadBlobResponse> response1 = ATProtocolFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .repo().uploadBlob(
                        RepoUploadBlobRequest.fromStreamBuilder()
                                .accessJwt(accessJwt)
                                .stream(stream)
                                .name("icon.png")
                                .build()
                );

        System.out.println(response1.get().getBlob().getRef().getLink());


        // Setup Image
        EmbedImages imagesMain = new EmbedImages();
        {
            List<EmbedImagesImage> images = new ArrayList<>();
            imagesMain.setImages(images);

            EmbedImagesImage image = new EmbedImagesImage();
            image.setImage(response1.get().getBlob());
            image.setAlt("image test");
            images.add(image);
        }

        System.out.println(new Gson().toJson(imagesMain));

        // Post With Image
        Response<FeedPostResponse> response2 = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().post(
                        FeedPostRequest.builder()
                                .accessJwt(accessJwt)
                                .text("画像投稿テスト")
                                .embed(imagesMain)
                                .build()
                );

        System.out.println(response2.get().getUri());
    }

    @Test
    public void testFeedPostReplay() {

        Response<FeedPostResponse> root = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().post(
                        FeedPostRequest.builder()
                                .accessJwt(accessJwt)
                                .text("リプライテスト (ルート)")
                                .build()
                );

        Response<FeedPostResponse> parent =
                ((Supplier<Response<FeedPostResponse>>) () -> {

                    RepoStrongRef rootRef = new RepoStrongRef(
                            root.get().getUri(),
                            root.get().getCid()
                    );

                    RepoStrongRef parentRef = new RepoStrongRef(
                            root.get().getUri(),
                            root.get().getCid()
                    );

                    FeedPostReplyRef reply = new FeedPostReplyRef();
                    reply.setParent(parentRef);
                    reply.setRoot(rootRef);

                    return BlueskyFactory
                            .getInstance(Service.BSKY_SOCIAL.getUri())
                            .feed().post(
                                    FeedPostRequest.builder()
                                            .accessJwt(accessJwt)
                                            .text("リプライテスト (親)")
                                            .reply(reply)
                                            .build()
                            );
                }).get();

        System.out.println(parent.get().getUri());

        Response<FeedPostResponse> last =
                ((Supplier<Response<FeedPostResponse>>) () -> {

                    RepoStrongRef rootRef = new RepoStrongRef(
                            parent.get().getUri(),
                            parent.get().getCid()
                    );
                    RepoStrongRef parentRef = new RepoStrongRef(
                            parent.get().getUri(),
                            parent.get().getCid()
                    );

                    FeedPostReplyRef reply = new FeedPostReplyRef();
                    reply.setParent(parentRef);
                    reply.setRoot(rootRef);

                    return BlueskyFactory
                            .getInstance(Service.BSKY_SOCIAL.getUri())
                            .feed().post(
                                    FeedPostRequest.builder()
                                            .accessJwt(accessJwt)
                                            .text("リプライテスト (子)")
                                            .reply(reply)
                                            .build()
                            );
                }).get();

        System.out.println(last.get().getUri());
    }


    @Test
    public void testPostWithFacets() {
        String test = "@uakihir0.com Facet のテスト投稿 https://www.uakihir0.com/blog/p/202305-mario-movie/";
        FacetList list = FacetUtil.extractFacets(test);

        List<String> handles = list.getRecords().stream()
                .filter(i -> i.getType() == FacetType.Mention)
                .map(FacetRecord::getDisplayText)
                .collect(Collectors.toList());

        Map<String, String> handleToDidMap = new HashMap<>();

        for (String handle : handles) {
            Response<IdentityResolveHandleResponse> response = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .identity().resolveHandle(
                            IdentityResolveHandleRequest.builder()
                                    .handle(handle.substring(1))
                                    .build()
                    );
            handleToDidMap.put(handle, response.get().getDid());
        }

        List<RichtextFacet> facets = list.getRichTextFacets(handleToDidMap);

        BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().post(
                        FeedPostRequest.builder()
                                .accessJwt(accessJwt)
                                .facets(facets)
                                .text(list.getDisplayText())
                                .build()
                );
    }

    @Test
    public void testDeleteFeed() {
        String uri;

        { // Create
            Response<FeedPostResponse> response = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .feed().post(
                            FeedPostRequest.builder()
                                    .accessJwt(accessJwt)
                                    .text("テスト（すぐ消す）")
                                    .build()
                    );

            uri = response.get().getUri();
        }

        { // Delete
            BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .feed().deletePost(
                            FeedDeletePostRequest.builder()
                                    .accessJwt(accessJwt)
                                    .uri(uri)
                                    .build()
                    );
        }
    }
}
