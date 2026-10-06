package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sh extends a.da1 {
    public static final /* synthetic */ int C = 0;
    public java.lang.String A;
    public final /* synthetic */ a.wh B;
    public android.widget.TextView u;
    public android.widget.ImageView v;
    public android.widget.TextView w;
    public android.widget.TextView x;
    public android.view.View y;
    public android.widget.TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(a.wh whVar, android.view.View view) {
        super(view);
        this.B = whVar;
        view.setOnClickListener(new a.sg(this, whVar, view, 6));
    }
}
