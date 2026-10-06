package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qx implements a.px, a.rx {
    public final /* synthetic */ int c = 1;
    public final android.content.ClipData d;
    public final int e;
    public int f;
    public android.net.Uri g;
    public android.os.Bundle h;

    public qx(a.qx qxVar) {
        android.content.ClipData clipData = qxVar.d;
        clipData.getClass();
        this.d = clipData;
        int i = qxVar.e;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i <= 5) {
            this.e = i;
            int i2 = qxVar.f;
            if ((i2 & 1) == i2) {
                this.f = i2;
                this.g = qxVar.g;
                this.h = qxVar.h;
                return;
            } else {
                throw new java.lang.IllegalArgumentException("Requested flags 0x" + java.lang.Integer.toHexString(i2) + ", but only 0x" + java.lang.Integer.toHexString(1) + " are allowed");
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
    }

    @Override // a.px
    public final a.sx a() {
        return new a.sx(new a.qx(this));
    }

    @Override // a.px
    public final void b(android.os.Bundle bundle) {
        this.h = bundle;
    }

    @Override // a.rx
    public final android.content.ClipData c() {
        return this.d;
    }

    @Override // a.px
    public final void d(android.net.Uri uri) {
        this.g = uri;
    }

    @Override // a.px
    public final void e(int i) {
        this.f = i;
    }

    @Override // a.rx
    public final int f() {
        return this.f;
    }

    @Override // a.rx
    public final android.view.ContentInfo j() {
        return null;
    }

    @Override // a.rx
    public final int n() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        switch (this.c) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.d.getDescription());
                sb.append(", source=");
                int i = this.e;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? java.lang.String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : java.lang.String.valueOf(i2));
                if (this.g == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + this.g.toString().length() + ")";
                }
                sb.append(str);
                return a.ai1.j(sb, this.h != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public qx(android.content.ClipData clipData, int i) {
        this.d = clipData;
        this.e = i;
    }
}
