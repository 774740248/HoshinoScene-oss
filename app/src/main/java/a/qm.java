package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qm {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f471a;
    public final a.vu0 b;

    public qm(android.widget.TextView textView) {
        this.f471a = textView;
        this.b = new a.vu0(textView);
    }

    public final void a(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.f471a.getContext().obtainStyledAttributes(attributeSet, a.u81.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((a.fa0) this.b.d).A(z);
    }

    public final void c(boolean z) {
        ((a.fa0) this.b.d).D(z);
    }
}
