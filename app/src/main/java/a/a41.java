package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a41 implements a.x30 {
    public final com.omarea.krscript.model.ActionParamInfo c;
    public final a.kk0 d;
    public final boolean e;
    public android.widget.TextView f;
    public android.widget.TextView g;
    public java.util.ArrayList h;

    public a41(com.omarea.krscript.model.ActionParamInfo actionParamInfo, a.kk0 kk0Var) {
        android.view.View decorView;
        a.wv.w(kk0Var, "context");
        this.c = actionParamInfo;
        this.d = kk0Var;
        android.view.Window window = kk0Var.getWindow();
        java.lang.Integer valueOf = (window == null || (decorView = window.getDecorView()) == null) ? null : java.lang.Integer.valueOf(decorView.getSystemUiVisibility());
        this.e = valueOf != null && (valueOf.intValue() & 8192) == 0;
    }

    public final void a() {
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        java.util.ArrayList arrayList = this.h;
        if (arrayList == null) {
            a.wv.M1("packages");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a.tg) it.next()).setSelected(false);
        }
        android.widget.TextView textView = this.f;
        if (textView == null) {
            a.wv.M1("valueView");
            throw null;
        }
        java.lang.CharSequence text = textView.getText();
        com.omarea.krscript.model.ActionParamInfo actionParamInfo = this.c;
        if (actionParamInfo.getMultiple()) {
            a.wv.v(text, "currentValue");
            for (java.lang.String str : (Iterable<java.lang.String>) a.yi1.y2(text, new java.lang.String[]{actionParamInfo.getSeparator()})) {
                java.util.ArrayList arrayList2 = this.h;
                if (arrayList2 == null) {
                    a.wv.M1("packages");
                    throw null;
                }
                java.util.Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (a.wv.e(((a.tg) obj2).getPackageName(), str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                a.tg tgVar = (a.tg) obj2;
                if (tgVar != null) {
                    tgVar.setSelected(true);
                }
            }
        } else {
            java.util.ArrayList arrayList3 = this.h;
            if (arrayList3 == null) {
                a.wv.M1("packages");
                throw null;
            }
            java.util.Iterator it3 = arrayList3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (a.wv.e(((a.tg) obj).getPackageName(), text)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            a.tg tgVar2 = (a.tg) obj;
            if (tgVar2 != null) {
                java.util.ArrayList arrayList4 = this.h;
                if (arrayList4 == null) {
                    a.wv.M1("packages");
                    throw null;
                }
                i = arrayList4.indexOf(tgVar2);
            } else {
                i = -1;
            }
            if (i > -1) {
                java.util.ArrayList arrayList5 = this.h;
                if (arrayList5 == null) {
                    a.wv.M1("packages");
                    throw null;
                }
                ((a.tg) arrayList5.get(i)).setSelected(true);
            }
        }
        java.util.ArrayList arrayList6 = this.h;
        if (arrayList6 == null) {
            a.wv.M1("packages");
            throw null;
        }
        new a.a40(this.e, arrayList6, actionParamInfo.getMultiple(), this).V(this.d.getSupportFragmentManager(), "app-chooser");
    }

    @Override // a.x30
    public final void b(java.util.ArrayList arrayList) {
        com.omarea.krscript.model.ActionParamInfo actionParamInfo = this.c;
        if (actionParamInfo.getMultiple()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a.tg) it.next()).getPackageName());
            }
            java.lang.String j2 = a.qv.j2(arrayList2, actionParamInfo.getSeparator(), null, null, null, 62);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList, 10));
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((a.tg) it2.next()).getAppName());
            }
            java.lang.String j22 = a.qv.j2(arrayList3, "，", null, null, null, 62);
            android.widget.TextView textView = this.f;
            if (textView == null) {
                a.wv.M1("valueView");
                throw null;
            }
            textView.setText(j2);
            android.widget.TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setText(j22);
                return;
            } else {
                a.wv.M1("nameView");
                throw null;
            }
        }
        a.tg tgVar = (a.tg) a.qv.g2(arrayList);
        if (tgVar == null) {
            android.widget.TextView textView3 = this.f;
            if (textView3 == null) {
                a.wv.M1("valueView");
                throw null;
            }
            textView3.setText("");
            android.widget.TextView textView4 = this.g;
            if (textView4 != null) {
                textView4.setText("");
                return;
            } else {
                a.wv.M1("nameView");
                throw null;
            }
        }
        android.widget.TextView textView5 = this.f;
        if (textView5 == null) {
            a.wv.M1("valueView");
            throw null;
        }
        textView5.setText(tgVar.getPackageName());
        android.widget.TextView textView6 = this.g;
        if (textView6 != null) {
            textView6.setText(tgVar.getAppName());
        } else {
            a.wv.M1("nameView");
            throw null;
        }
    }
}
