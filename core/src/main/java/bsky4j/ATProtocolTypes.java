package bsky4j;

/**
 * ATProtocol
 * https://atproto.com/docs
 */
public class ATProtocolTypes {

    // Admin
    public static final String AdminGetModerationAction = "com.atproto.admin.getModerationAction";
    public static final String AdminGetModerationActions = "com.atproto.admin.getModerationActions";
    public static final String AdminGetModerationReport = "com.atproto.admin.getModerationReport";
    public static final String AdminGetModerationReports = "com.atproto.admin.getModerationReports";
    public static final String AdminGetRecord = "com.atproto.admin.getRecord";
    public static final String AdminGetRepo = "com.atproto.admin.getRepo";
    public static final String AdminResolveModerationReports = "com.atproto.admin.resolveModerationReports";
    public static final String AdminReverseModerationAction = "com.atproto.admin.reverseModerationAction";
    public static final String AdminSearchRepos = "com.atproto.admin.searchRepos";
    public static final String AdminTakeModerationAction = "com.atproto.admin.takeModerationAction";

    // Identify
    public static final String IdentifyResolveHandle = "com.atproto.identity.resolveHandle";
    public static final String IdentifyUpdateHandle = "com.atproto.identity.updateHandle";

    // Moderation
    public static final String ModerationCreateReport = "com.atproto.moderation.createReport";

    // Repo
    public static final String RepoApplyWrites = "com.atproto.repo.applyWrites";
    public static final String RepoCreateRecord = "com.atproto.repo.createRecord";
    public static final String RepoDeleteRecord = "com.atproto.repo.deleteRecord";
    public static final String RepoDescribeRepo = "com.atproto.repo.describeRepo";
    public static final String RepoGetRecord = "com.atproto.repo.getRecord";
    public static final String RepoListRecords = "com.atproto.repo.listRecords";
    public static final String RepoPutRecord = "com.atproto.repo.putRecord";
    public static final String RepoUploadBlob = "com.atproto.repo.uploadBlob";

    // Server
    public static final String ServerCreateAccount = "com.atproto.server.createAccount";
    public static final String ServerCreateInviteCode = "com.atproto.server.createInviteCode";
    public static final String ServerCreateSession = "com.atproto.server.createSession";
    public static final String ServerDeleteAccount = "com.atproto.server.deleteAccount";
    public static final String ServerDeleteSession = "com.atproto.server.deleteSession";
    public static final String ServerDescribeServer = "com.atproto.server.describeServer";
    public static final String ServerGetSession = "com.atproto.server.getSession";
    public static final String ServerRefreshSession = "com.atproto.server.refreshSession";
    public static final String ServerRequestAccountDelete = "com.atproto.server.requestAccountDelete";
    public static final String ServerRequestPasswordReset = "com.atproto.server.requestPasswordReset";
    public static final String ServerResetPassword = "com.atproto.server.resetPassword";

    // Sync
    public static final String SyncGetBlob = "com.atproto.sync.getBlob";
    public static final String SyncGetBlocks = "com.atproto.sync.getBlocks";
    public static final String SyncGetCheckout = "com.atproto.sync.getCheckout";
    public static final String SyncGetCommitPath = "com.atproto.sync.getCommitPath";
    public static final String SyncGetHead = "com.atproto.sync.getHead";
    public static final String SyncGetRecord = "com.atproto.sync.getRecord";
    public static final String SyncGetRepo = "com.atproto.sync.getRepo";
    public static final String SyncListBlobs = "com.atproto.sync.listBlobs";
    public static final String SyncNotifyOfUpdate = "com.atproto.sync.notifyOfUpdate";
    public static final String SyncRequestCrawl = "com.atproto.sync.requestCrawl";
    public static final String SyncSubscribeRepos = "com.atproto.sync.subscribeRepos";
}
