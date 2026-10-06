package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.omarea.ui.HelpIcon;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class hr0 implements View.OnClickListener {

    public hr0() {
        this(0, null, null);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;

    public /* synthetic */ hr0(int i, Context context, String str) {
        this.c = i;
        this.d = context;
        this.e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        String str = this.e;
        Context context = this.d;
        switch (i) {
            case 0:
                int i2 = HelpIcon.c;
                int i3 = x60.f681a;
                wv.s(context);
                wv.v(str, "text");
                fs1.G(context, str, (Runnable) null);
                return;
            default:
                int i4 = HelpIcon.c;
                int i5 = x60.f681a;
                wv.s(context);
                String string = context.getString(2131952501);
                wv.v(string, "context.getString(R.string.help_title)");
                LayoutInflater from = LayoutInflater.from(context);
                wv.v(str, "attrValue");
                View inflate = from.inflate(Integer.parseInt(yi1.v2(str, "@", "")), (ViewGroup) null);
                wv.v(inflate, "from(context).inflate(\n …                        )");
                View u = fs1.u(context, 2131558531, string, "", inflate);
                u.findViewById(2131362098).setOnClickListener(new o60(fs1.m(context, u, true), (Runnable) null, 3));
                return;
        }
    }
}
