package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ox implements a.px {
    public final android.view.ContentInfo.Builder c;

    public ox(android.content.ClipData clipData, int i) {
        this.c = a.nx.d(clipData, i);
    }

    @Override // a.px
    public final a.sx a() {
        android.view.ContentInfo build;
        build = this.c.build();
        return new a.sx(new a.vu0(build));
    }

    @Override // a.px
    public final void b(android.os.Bundle bundle) {
        this.c.setExtras(bundle);
    }

    @Override // a.px
    public final void d(android.net.Uri uri) {
        this.c.setLinkUri(uri);
    }

    @Override // a.px
    public final void e(int i) {
        this.c.setFlags(i);
    }
}
