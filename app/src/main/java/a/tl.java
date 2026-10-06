package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f560a;
    public android.content.res.ColorStateList b = null;
    public android.graphics.PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;
    public final android.widget.TextView g;

    public /* synthetic */ tl(android.widget.TextView textView, int i) {
        this.f560a = i;
        this.g = textView;
    }

    public final void a() {
        android.widget.TextView textView = this.g;
        android.graphics.drawable.Drawable a2 = a.qw.a((android.widget.CompoundButton) textView);
        if (a2 != null) {
            if (this.d || this.e) {
                android.graphics.drawable.Drawable mutate = a2.mutate();
                if (this.d) {
                    a.i90.h(mutate, this.b);
                }
                if (this.e) {
                    a.i90.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((android.widget.CompoundButton) textView).getDrawableState());
                }
                ((android.widget.CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        android.widget.TextView textView = this.g;
        android.graphics.drawable.Drawable checkMarkDrawable = ((android.widget.CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                android.graphics.drawable.Drawable mutate = checkMarkDrawable.mutate();
                if (this.d) {
                    a.i90.h(mutate, this.b);
                }
                if (this.e) {
                    a.i90.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((android.widget.CheckedTextView) textView).getDrawableState());
                }
                ((android.widget.CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:5:0x0030, B:7:0x0036, B:10:0x003c, B:11:0x006d, B:13:0x0073, B:14:0x007d, B:16:0x0083, B:23:0x0050, B:25:0x0056, B:27:0x005c), top: B:4:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:5:0x0030, B:7:0x0036, B:10:0x003c, B:11:0x006d, B:13:0x0073, B:14:0x007d, B:16:0x0083, B:23:0x0050, B:25:0x0056, B:27:0x005c), top: B:4:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:33:0x00b5, B:35:0x00bb, B:38:0x00c1, B:39:0x00f2, B:41:0x00f8, B:42:0x0102, B:44:0x0108, B:50:0x00d5, B:52:0x00db, B:54:0x00e1), top: B:32:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #1 {all -> 0x00d3, blocks: (B:33:0x00b5, B:35:0x00bb, B:38:0x00c1, B:39:0x00f2, B:41:0x00f8, B:42:0x0102, B:44:0x0108, B:50:0x00d5, B:52:0x00db, B:54:0x00e1), top: B:32:0x00b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tl.c(android.util.AttributeSet, int):void");
    }
}
