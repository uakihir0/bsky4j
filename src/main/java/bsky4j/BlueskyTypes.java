package bsky4j;

/**
 * Bluesky/ATProtocol
 * https://atproto.com/docs
 */
public class BlueskyTypes {

    // Actor
    public static String ActorProfile = "app.bsky.actor.profile";
    public static String ActorGetProfile = "app.bsky.actor.getProfile";
    public static String ActorGetProfiles = "app.bsky.actor.getProfiles";
    public static String ActorGetSuggestions = "app.bsky.actor.getSuggestions";
    public static String ActorSearchActors = "app.bsky.actor.searchActors";
    public static String ActorSearchActorsTypeahead = "app.bsky.actor.searchActorsTypeahead";

    // Embed
    public static String EmbedExternal = "app.bsky.embed.external";
    public static String EmbedImages = "app.bsky.embed.images";
    public static String EmbedRecord = "app.bsky.embed.record";
    public static String EmbedRecordWithMedia = "app.bsky.embed.recordWithMedia";

    // Feed
    public static String FeedDefs = "app.bsky.feed.defs";
    public static String FeedGetAuthorFeed = "app.bsky.feed.getAuthorFeed";
    public static String FeedGetLikes = "app.bsky.feed.getLikes";
    public static String FeedGetPostThread = "app.bsky.feed.getPostThread";
    public static String FeedGetRepostedBy = "app.bsky.feed.getRepostedBy";
    public static String FeedGetTimeline = "app.bsky.feed.getTimeline";
    public static String FeedLike = "app.bsky.feed.like";
    public static String FeedPost = "app.bsky.feed.post";
    public static String FeedRepost = "app.bsky.feed.repost";

    // Graph
    public static String GraphFollow = "app.bsky.graph.follow";
    public static String GraphGetFollowers = "app.bsky.graph.getFollowers";
    public static String GraphGetFollows = "app.bsky.graph.getFollows";
    public static String GraphGetMutes = "app.bsky.graph.getMutes";
    public static String GraphMuteActor = "app.bsky.graph.muteActor";
    public static String GraphUnmuteActor = "app.bsky.graph.unmuteActor";

    // Notification
    public static String NotificationGetUnreadCount = "app.bsky.notification.getUnreadCount";
    public static String NotificationListNotifications = "app.bsky.notification.listNotifications";
    public static String NotificationUpdateSeen = "app.bsky.notification.updateSeen";

}