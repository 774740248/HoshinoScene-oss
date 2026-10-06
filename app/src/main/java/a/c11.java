package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class c11 {
    private long lastUpdate;
    private java.lang.String id = "";
    private java.lang.String propUrl = "";
    private java.lang.String zipUrl = "";
    private java.lang.String notesUrl = "";

    public final java.lang.String getId() {
        return this.id;
    }

    public final long getLastUpdate() {
        return this.lastUpdate;
    }

    public final java.lang.String getNotesUrl() {
        return this.notesUrl;
    }

    public final java.lang.String getPropUrl() {
        return this.propUrl;
    }

    public final java.lang.String getZipUrl() {
        return this.zipUrl;
    }

    public final void setId(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.id = str;
    }

    public final void setLastUpdate(long j) {
        this.lastUpdate = j;
    }

    public final void setNotesUrl(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.notesUrl = str;
    }

    public final void setPropUrl(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.propUrl = str;
    }

    public final void setZipUrl(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.zipUrl = str;
    }
}
