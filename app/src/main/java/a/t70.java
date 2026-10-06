package a;

import android.content.Context;
import android.view.View;
import com.omarea.ui.SwitchOptionItemView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class t70 implements View.OnClickListener {

    public t70() {
        this(null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ SwitchOptionItemView d;

    public /* synthetic */ t70(SwitchOptionItemView switchOptionItemView, int i) {
        this.c = i;
        this.d = switchOptionItemView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SwitchOptionItemView switchOptionItemView = this.d;
        switch (i) {
            case 0:
                if (switchOptionItemView.i) {
                    Context context = switchOptionItemView.getContext();
                    wv.v(context, "context");
                    new kf0(context).b();
                    return;
                } else {
                    Context context2 = switchOptionItemView.getContext();
                    wv.v(context2, "context");
                    new kf0(context2);
                    kf0.a(true);
                    return;
                }
            case 1:
                if (switchOptionItemView.i) {
                    Context context3 = switchOptionItemView.getContext();
                    wv.v(context3, "context");
                    new jf0(context3).b();
                    return;
                } else {
                    Context context4 = switchOptionItemView.getContext();
                    wv.v(context4, "context");
                    new jf0(context4);
                    jf0.a(true);
                    return;
                }
            case 2:
                if (!switchOptionItemView.i) {
                    Context context5 = switchOptionItemView.getContext();
                    wv.v(context5, "context");
                    new ph0(context5).a(true);
                    return;
                } else {
                    Context context6 = switchOptionItemView.getContext();
                    wv.v(context6, "context");
                    new ph0(context6).c.getClass();
                    Context context7 = switchOptionItemView.getContext();
                    wv.v(context7, "context");
                    new ph0(context7).b();
                    return;
                }
            case 3:
                if (!switchOptionItemView.i) {
                    Context context8 = switchOptionItemView.getContext();
                    wv.v(context8, "context");
                    new rg0(context8).b();
                    return;
                } else {
                    Context context9 = switchOptionItemView.getContext();
                    wv.v(context9, "context");
                    new rg0(context9).i.getClass();
                    Context context10 = switchOptionItemView.getContext();
                    wv.v(context10, "context");
                    new rg0(context10).c("", 0);
                    return;
                }
            case 4:
                if (switchOptionItemView.i) {
                    Context context11 = switchOptionItemView.getContext();
                    wv.v(context11, "context");
                    new fg0(context11).b();
                    return;
                } else {
                    Context context12 = switchOptionItemView.getContext();
                    wv.v(context12, "context");
                    new fg0(context12);
                    fg0.a(true);
                    return;
                }
            case 5:
                if (switchOptionItemView.i) {
                    Context context13 = switchOptionItemView.getContext();
                    wv.v(context13, "context");
                    new ag0(context13).c();
                    return;
                } else {
                    Context context14 = switchOptionItemView.getContext();
                    wv.v(context14, "context");
                    new ag0(context14).b(true);
                    return;
                }
            default:
                if (switchOptionItemView.i) {
                    Context context15 = switchOptionItemView.getContext();
                    wv.v(context15, "context");
                    new uh0(context15).c();
                    return;
                } else {
                    Context context16 = switchOptionItemView.getContext();
                    wv.v(context16, "context");
                    new uh0(context16);
                    uh0.b();
                    return;
                }
        }
    }
}
