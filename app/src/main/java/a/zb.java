package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zb implements a.ij0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.model.MagiskModuleUnofficial d;

    public /* synthetic */ zb(com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial, int i) {
        this.c = i;
        this.d = magiskModuleUnofficial;
    }

    public final java.lang.String a() {
        int i = this.c;
        com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return magiskModuleUnofficial.getId();
            case 1:
                java.lang.String name = magiskModuleUnofficial.getName();
                return name == null ? "" : name;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                java.lang.String author = magiskModuleUnofficial.getAuthor();
                return author == null ? "" : author;
            case 3:
                java.lang.String versionName = magiskModuleUnofficial.getVersionName();
                return versionName == null ? "" : versionName;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                java.lang.String versionCode = magiskModuleUnofficial.getVersionCode();
                return versionCode == null ? "" : versionCode;
            case 5:
                java.lang.String downloadUrl = magiskModuleUnofficial.getDownloadUrl();
                return downloadUrl == null ? "" : downloadUrl;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                java.lang.String description = magiskModuleUnofficial.getDescription();
                return description == null ? "" : description;
            default:
                java.lang.String detailContent = magiskModuleUnofficial.getDetailContent();
                return detailContent == null ? "" : detailContent;
        }
    }

    public final void b(java.lang.String str) {
        int i = this.c;
        com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setId(a.yi1.F2(str).toString());
                return;
            case 1:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setName(a.yi1.F2(str).toString());
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setAuthor(a.yi1.F2(str).toString());
                return;
            case 3:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setVersionName(a.yi1.F2(str).toString());
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setVersionCode(a.yi1.F2(str).toString());
                return;
            case 5:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setDownloadUrl(a.yi1.F2(str).toString());
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setDescription(str);
                return;
            default:
                a.wv.w(str, "value");
                magiskModuleUnofficial.setDetailContent(str);
                return;
        }
    }

    @Override // a.ij0
    public final /* bridge */ /* synthetic */ java.lang.Object getValue() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            case 3:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return a();
            case 5:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return a();
            default:
                return a();
        }
    }

    @Override // a.ij0
    public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                b((java.lang.String) obj);
                return;
            case 1:
                b((java.lang.String) obj);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                b((java.lang.String) obj);
                return;
            case 3:
                b((java.lang.String) obj);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                b((java.lang.String) obj);
                return;
            case 5:
                b((java.lang.String) obj);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                b((java.lang.String) obj);
                return;
            default:
                b((java.lang.String) obj);
                return;
        }
    }
}
