package bsky4j.model.bsky.notification;

import bsky4j.model.bsky.actor.ActorDefsProfileView;
import bsky4j.model.share.RecordUnion;

public class NotificationListNotificationsNotification {

    private String uri;
    private String cid;
    private ActorDefsProfileView author;

    /**
     * Expected values are 'like', 'repost', 'follow
     * (like, repost, follow, mention, reply, quote)
     */
    private String reason;
    private String reasonSubject;
    private RecordUnion record;
    private Boolean isRead;
    private String indexedAt;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public ActorDefsProfileView getAuthor() {
        return author;
    }

    public void setAuthor(ActorDefsProfileView author) {
        this.author = author;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReasonSubject() {
        return reasonSubject;
    }

    public void setReasonSubject(String reasonSubject) {
        this.reasonSubject = reasonSubject;
    }

    public RecordUnion getRecord() {
        return record;
    }

    public void setRecord(RecordUnion record) {
        this.record = record;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }
    // endregion
}
