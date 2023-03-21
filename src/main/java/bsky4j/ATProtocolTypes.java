package bsky4j;

/**
 * ATProtocol
 * https://atproto.com/docs
 */
public class ATProtocolTypes {

    // Account
    public static final String AccountCreate = "com.atproto.account.create";
    public static final String AccountCreateInviteCode = "com.atproto.account.createInviteCode";
    public static final String AccountDelete = "com.atproto.account.delete";
    public static final String AccountGet = "com.atproto.account.get";
    public static final String AccountRequestPasswordReset = "com.atproto.account.requestPasswordReset";
    public static final String AccountResetPassword = "com.atproto.account.resetPassword";

    // Blob
    public static final String BlobUpload = "com.atproto.blob.upload";

    // Handle
    public static final String HandleResolve = "com.atproto.handle.resolve";

    // Repo
    public static final String RepoBatchWrite = "com.atproto.repo.batchWrite";
    public static final String RepoCreateRecord = "com.atproto.repo.createRecord";
    public static final String RepoDeleteRecord = "com.atproto.repo.deleteRecord";
    public static final String RepoDescribe = "com.atproto.repo.describe";
    public static final String RepoGetRecord = "com.atproto.repo.getRecord";
    public static final String RepoListRecords = "com.atproto.repo.listRecords";
    public static final String RepoPutRecord = "com.atproto.repo.putRecord";
    public static final String RepoStrongRef = "com.atproto.repo.strongRef";

    // Server
    public static final String ServerGetAccountsConfig = "com.atproto.server.getAccountsConfig";

    // Session
    public static final String SessionGet = "com.atproto.session.get";
    public static final String SessionDelete = "com.atproto.session.delete";
    public static final String SessionCreate = "com.atproto.session.create";
    public static final String SessionRefresh = "com.atproto.session.refresh";

    // Sync
    public static final String SyncGetRepo = "com.atproto.sync.getRepo";
    public static final String SyncGetRoot = "com.atproto.sync.getRoot";
    public static final String SyncUpdateRepo = "com.atproto.sync.updateRepo";
}
