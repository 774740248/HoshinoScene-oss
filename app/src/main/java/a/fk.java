package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fk extends android.widget.BaseAdapter {
    public final android.content.Context c;
    public final java.util.ArrayList d;

    public fk(com.omarea.vtools.activities.ActivitySwap activitySwap, java.util.ArrayList arrayList) {
        this.c = activitySwap;
        this.d = arrayList;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.HashMap getItem(int i) {
        return (java.util.HashMap) this.d.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, a.ek] */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        a.ek ekVar;
        if (view == null) {
            a.ek obj = new a.ek();
            android.view.View inflate = android.view.View.inflate(this.c, 2131558652, null);
            obj.f124a = (android.widget.TextView) inflate.findViewById(2131362662);
            obj.b = (android.widget.TextView) inflate.findViewById(2131362667);
            obj.c = (android.widget.TextView) inflate.findViewById(2131362664);
            obj.d = (android.widget.TextView) inflate.findViewById(2131362668);
            obj.e = (android.widget.TextView) inflate.findViewById(2131362663);
            inflate.setTag(obj);
            ekVar = obj;
            view2 = inflate;
        } else {
            view2 = view;
            ekVar = (a.ek) view.getTag();
        }
        ekVar.f124a.setText((java.lang.CharSequence) getItem(i).get("path"));
        ekVar.b.setText((java.lang.CharSequence) getItem(i).get("type"));
        ekVar.c.setText((java.lang.CharSequence) getItem(i).get("size"));
        ekVar.d.setText((java.lang.CharSequence) getItem(i).get("used"));
        ekVar.e.setText((java.lang.CharSequence) getItem(i).get("priority"));
        return view2;
    }
}
