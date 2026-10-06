package a;

import android.view.View;
import android.widget.LinearLayout;
import com.omarea.ui.TabBarView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class xj1 implements View.OnClickListener {

    public xj1() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ TabBarView d;
    public final /* synthetic */ LinearLayout e;

    public /* synthetic */ xj1(TabBarView tabBarView, LinearLayout linearLayout, int i) {
        this.c = i;
        this.d = tabBarView;
        this.e = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        LinearLayout linearLayout = this.e;
        TabBarView tabBarView = this.d;
        switch (i) {
            case 0:
                int i2 = TabBarView.n;
                wv.w(tabBarView, "this$0");
                wv.w(linearLayout, "$tab");
                bp0 bp0Var = tabBarView.c;
                if (bp0Var != null) {
                    bp0Var.i(Integer.valueOf(tabBarView.m.indexOfChild(linearLayout)));
                    return;
                }
                return;
            default:
                int i3 = TabBarView.n;
                wv.w(tabBarView, "this$0");
                wv.w(linearLayout, "$tab");
                bp0 bp0Var2 = tabBarView.d;
                if (bp0Var2 != null) {
                    bp0Var2.i(Integer.valueOf(tabBarView.m.indexOfChild(linearLayout)));
                    return;
                }
                return;
        }
    }
}
