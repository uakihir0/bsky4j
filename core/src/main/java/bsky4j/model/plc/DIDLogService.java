package bsky4j.model.plc;

import com.google.gson.annotations.SerializedName;

public class DIDLogService {

    @SerializedName("atproto_pds")
    private DIDLogPDS atprotoPDS;

    // region
    public DIDLogPDS getAtprotoPDS() {
        return atprotoPDS;
    }

    public void setAtprotoPDS(DIDLogPDS atprotoPDS) {
        this.atprotoPDS = atprotoPDS;
    }
    // endregion
}
