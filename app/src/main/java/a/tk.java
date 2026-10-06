package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tk implements a.z0 {
    public final /* synthetic */ int c;
    public int d;
    public java.lang.Object e;

    public tk(int i) {
        this.c = i;
        if (i != 6) {
            return;
        }
        this.d = 1;
        this.e = new java.util.ArrayList();
    }

    public final a.uk a() {
        a.uk ukVar = new a.uk(((a.pk) this.e).f440a, this.d);
        a.pk pkVar = (a.pk) this.e;
        android.view.View view = pkVar.e;
        a.sk skVar = ukVar.g;
        int i = 0;
        if (view != null) {
            skVar.o = view;
        } else {
            java.lang.CharSequence charSequence = pkVar.d;
            if (charSequence != null) {
                skVar.d = charSequence;
                android.widget.TextView textView = skVar.m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            android.graphics.drawable.Drawable drawable = pkVar.c;
            if (drawable != null) {
                skVar.k = drawable;
                skVar.j = 0;
                android.widget.ImageView imageView = skVar.l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    skVar.l.setImageDrawable(drawable);
                }
            }
        }
        if (pkVar.g != null) {
            androidx.appcompat.app.AlertController.RecycleListView alertController$RecycleListView = (androidx.appcompat.app.AlertController.RecycleListView) pkVar.b.inflate(skVar.s, (android.view.ViewGroup) null);
            int i2 = pkVar.i ? skVar.t : skVar.u;
            android.widget.ListAdapter listAdapter = pkVar.g;
            if (listAdapter == null) {
                listAdapter = new android.widget.ArrayAdapter(pkVar.f440a, i2, android.R.id.text1, (java.lang.Object[]) null);
            }
            skVar.p = listAdapter;
            skVar.q = pkVar.j;
            if (pkVar.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new a.ok(pkVar, i, skVar));
            }
            if (pkVar.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            skVar.e = alertController$RecycleListView;
        }
        ((a.pk) this.e).getClass();
        ukVar.setCancelable(true);
        ((a.pk) this.e).getClass();
        ukVar.setCanceledOnTouchOutside(true);
        ((a.pk) this.e).getClass();
        ukVar.setOnCancelListener(null);
        ((a.pk) this.e).getClass();
        ukVar.setOnDismissListener(null);
        android.content.DialogInterface.OnKeyListener onKeyListener = ((a.pk) this.e).f;
        if (onKeyListener != null) {
            ukVar.setOnKeyListener(onKeyListener);
        }
        return ukVar;
    }

    public final int b() {
        while (this.d < ((java.lang.String) this.e).length()) {
            java.lang.String str = (java.lang.String) this.e;
            int i = this.d;
            this.d = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                if (charAt == '#') {
                    e();
                } else {
                    if (charAt != '/' || this.d == ((java.lang.String) this.e).length()) {
                        return charAt;
                    }
                    char charAt2 = ((java.lang.String) this.e).charAt(this.d);
                    if (charAt2 == '*') {
                        int i2 = this.d + 1;
                        this.d = i2;
                        int indexOf = ((java.lang.String) this.e).indexOf("*/", i2);
                        if (indexOf == -1) {
                            throw f("Unterminated comment");
                        }
                        this.d = indexOf + 2;
                    } else {
                        if (charAt2 != '/') {
                            return charAt;
                        }
                        this.d++;
                        e();
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c9, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tk.c():java.lang.Object");
    }

    @Override // a.z0
    public final boolean d(android.view.View view) {
        ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.e).A(this.d);
        return true;
    }

    public final void e() {
        while (this.d < ((java.lang.String) this.e).length()) {
            char charAt = ((java.lang.String) this.e).charAt(this.d);
            if (charAt == '\r' || charAt == '\n') {
                this.d++;
                return;
            }
            this.d++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a.kt0, java.lang.Exception] */
    public final a.kt0 f(java.lang.String str) {
        return (kt0) new java.lang.Exception(str + this);
    }

    public final java.lang.String toString() {
        switch (this.c) {
            case 5:
                return " at character " + this.d + " of " + ((java.lang.String) this.e);
            default:
                return super.toString();
        }
    }

    public tk(java.lang.String str) {
        this.c = 5;
        if (str != null && str.startsWith("\ufeff")) {
            str = str.substring(1);
        }
        this.e = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tk(android.content.Context context) {
        this(context, a.uk.l(context, 0));
        this.c = 0;
    }

    public tk(android.content.Context context, int i) {
        this.c = 0;
        this.e = new a.pk(new android.view.ContextThemeWrapper(context, a.uk.l(context, i)));
        this.d = i;
    }

    public tk(int i, a.cj0[] cj0VarArr) {
        this.c = 1;
        this.d = i;
        this.e = cj0VarArr;
    }

    public tk(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, int i) {
        this.c = 4;
        this.e = bottomSheetBehavior;
        this.d = i;
    }
}
