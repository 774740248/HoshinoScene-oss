package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class li extends android.widget.BaseAdapter {
    public final android.content.Context c;
    public final java.util.ArrayList d;
    public final int e;

    public li(android.content.Context context, java.util.ArrayList arrayList) {
        this.c = context;
        this.d = arrayList;
        a.q10 q10Var = a.q10.f457a;
        this.e = a.wv.e(a.q10.t(), "basic") ? 2131558641 : 2131558640;
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 3) {
            return str.length() == 0 ? "0" : str;
        }
        java.lang.String substring = str.substring(0, str.length() - 3);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        java.util.ArrayList arrayList = this.d;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        return (com.omarea.model.CpuCoreInfo) obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.wv.w(viewGroup, "parent");
        if (view == null) {
            view = android.view.View.inflate(this.c, this.e, null);
            a.wv.v(view, "inflate(context, layoutId, null)");
        }
        java.util.ArrayList arrayList = this.d;
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list!![position]");
        com.omarea.model.CpuCoreInfo cpuCoreInfo = (com.omarea.model.CpuCoreInfo) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131362285);
        if (textView != null) {
            textView.setText("CPU" + (i + 1));
        }
        com.omarea.ui.CpuChartBarView cpuChartBarView = (com.omarea.ui.CpuChartBarView) view.findViewById(2131362265);
        if (cpuChartBarView != null) {
            cpuChartBarView.a(100.0f, (100 - ((float) cpuCoreInfo.loadRatio)) + 0.5f);
            cpuChartBarView.invalidate();
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131362287);
        if (textView2 != null) {
            textView2.setText(((int) cpuCoreInfo.loadRatio) + "%");
        }
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(2131362283);
        if (textView3 != null) {
            java.lang.String a2 = a(cpuCoreInfo.currentFreq);
            if (a.wv.e(a2, "0")) {
                textView3.setText("离线");
            } else {
                textView3.setText(a2.concat("MHz"));
            }
        }
        ((android.widget.TextView) view.findViewById(2131362284)).setText(a(cpuCoreInfo.minFreq) + "~" + a(cpuCoreInfo.maxFreq) + "MHz");
        return view;
    }
}
