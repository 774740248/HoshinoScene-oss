package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ti extends a.e91 {
    public java.io.File[] f;
    public final java.lang.Runnable g;
    public java.io.File h;
    public java.io.File i;
    public final a.b81 j;
    public final java.lang.String k;
    public boolean l;
    public final java.lang.String m;
    public final boolean n = true;
    public boolean o;

    public ti(java.io.File file, a.fw fwVar, a.b81 b81Var, java.lang.String str) {
        this.m = "/";
        java.lang.String absolutePath = file.getAbsolutePath();
        a.wv.v(absolutePath, "rootDir.absolutePath");
        this.m = absolutePath;
        this.g = fwVar;
        this.j = b81Var;
        if (str != null) {
            if (a.yi1.B2(str, ".")) {
                this.k = str;
            } else {
                this.k = ".".concat(str);
            }
        }
        q(file);
    }

    @Override // a.e91
    public final int c() {
        if (this.l) {
            java.io.File[] fileArr = this.f;
            return (fileArr != null ? fileArr.length : 0) + 1;
        }
        java.io.File[] fileArr2 = this.f;
        if (fileArr2 != null) {
            return fileArr2.length;
        }
        return 0;
    }

    @Override // a.e91
    public final int e(int i) {
        if (this.l && i == 0) {
            return 0;
        }
        java.io.File p = p(i);
        a.wv.t(p, "null cannot be cast to non-null type java.io.File");
        return p.isDirectory() ? 1 : 2;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        java.lang.String l;
        a.oi oiVar = (a.oi) da1Var;
        boolean z = this.l;
        android.widget.TextView textView = oiVar.v;
        android.widget.ImageView imageView = oiVar.u;
        android.widget.TextView textView2 = oiVar.w;
        if (z && i == 0) {
            textView.setText("...");
            textView2.setText("");
            imageView.setImageResource(2131230938);
            return;
        }
        java.io.File p = p(i);
        a.wv.t(p, "null cannot be cast to non-null type java.io.File");
        textView.setText(p.getName());
        textView2.setText("");
        int e = e(i);
        if (e == 1) {
            imageView.setImageResource(2131230938);
            return;
        }
        if (e != 2) {
            return;
        }
        imageView.setImageResource(2131230931);
        long length = p.length();
        if (length < 1024) {
            l = length + "B";
        } else {
            l = length < 1048576 ? a.ai1.l(new java.lang.Object[]{a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(length / 1024.0d)}, 1, "%.2f", "format(format, *args)")}, 1, "%sKB", "format(format, *args)") : length < 1073741824 ? a.ai1.l(new java.lang.Object[]{a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(length / 1048576.0d)}, 1, "%.2f", "format(format, *args)")}, 1, "%sMB", "format(format, *args)") : a.ai1.l(new java.lang.Object[]{a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(length / 1.073741824E9d)}, 1, "%.2f", "format(format, *args)")}, 1, "%sGB", "format(format, *args)");
        }
        textView2.setText(l);
    }

    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate((i == 0 || i == 1) ? 2131558642 : 2131558643, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "view");
        return new a.oi(this, inflate);
    }

    public final java.io.File p(int i) {
        if (!this.l) {
            java.io.File[] fileArr = this.f;
            a.wv.s(fileArr);
            return fileArr[i];
        }
        if (i != 0) {
            java.io.File[] fileArr2 = this.f;
            a.wv.s(fileArr2);
            return fileArr2[i - 1];
        }
        java.io.File file = this.h;
        a.wv.s(file);
        java.io.File parentFile = file.getParentFile();
        a.wv.s(parentFile);
        return parentFile;
    }

    public final void q(java.io.File file) {
        a.b81 b81Var = this.j;
        a.wv.s(b81Var);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.t().getString(2131952840);
        a.wv.v(string, "Scene.context.getString(R.string.loading)");
        b81Var.b(string);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.si(file, this, null), 3);
    }
}
