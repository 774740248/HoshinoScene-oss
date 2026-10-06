package a;

import java.io.Serializable;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tc extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPerfOptions g;
    public final /* synthetic */ a.ma1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(com.omarea.vtools.activities.ActivityPerfOptions activityPerfOptions, a.ma1 ma1Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPerfOptions;
        this.h = ma1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.tc(this.g, this.h, eyVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00dc. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.xy, a.ey] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v13, types: [a.ia1, java.lang.Object, java.io.Serializable] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        int i;
        java.util.Iterator it;
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        com.omarea.sysmbol.PerfOptionsRender perfOptionsRender;
        android.view.View view;
        java.lang.Object obj2;
        android.view.View d;
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityPerfOptions activityPerfOptions = this.g;
        if (!activityPerfOptions.isDestroyed()) {
            a.ma1 ma1Var = this.h;
            if (ma1Var.c != null) {
                int i2 = 0;
                com.omarea.sysmbol.PerfOptionsRender perfOptionsRender2 = (com.omarea.sysmbol.PerfOptionsRender) activityPerfOptions.d.a(com.omarea.vtools.activities.ActivityPerfOptions.g[0]);
                java.util.ArrayList arrayList = (java.util.ArrayList) ma1Var.c;
                java.lang.String str = activityPerfOptions.e;
                a.wv.w(arrayList, "symbolGroups");
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) perfOptionsRender2.getRootView().findViewById(2131362754);
                linearLayout2.removeAllViews();
                a.ia1 obj3 = null;
                if (str != null) {
                    perfOptionsRender2.c = new a.nk(perfOptionsRender2.getContext(), str);
                } else {
                    perfOptionsRender2.c = null;
                }
                java.util.Iterator it2 = a.qv.z2(arrayList).iterator();
                while (it2.hasNext()) {
                    a.cs0 cs0Var = (a.cs0) it2.next();
                    a.sj1 sj1Var = (a.sj1) cs0Var.b;
                    android.view.View d2 = perfOptionsRender2.d(2131558623);
                    int i3 = 2131361825;
                    android.widget.TextView textView2 = (android.widget.TextView) d2.findViewById(2131361825);
                    int i4 = 2131361806;
                    android.widget.TextView textView3 = (android.widget.TextView) d2.findViewById(2131361806);
                    java.lang.String str2 = sj1Var.f526a;
                    if (str2 == null || str2.length() == 0) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(sj1Var.f526a);
                    }
                    java.lang.String str3 = sj1Var.b;
                    if (str3 == null || str3.length() == 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setVisibility(i2);
                        textView3.setText(sj1Var.b);
                    }
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) d2.findViewById(2131362968);
                    linearLayout3.removeAllViews();
                    java.util.Iterator it3 = sj1Var.c.iterator();
                    a.ia1 r12 = obj3;
                    while (it3.hasNext()) {
                        a.tj1 tj1Var = (a.tj1) it3.next();
                        a.wv.v(tj1Var, "item");
                        java.lang.String str4 = tj1Var.f;
                        switch (str4.hashCode()) {
                            case -1034364087:
                                it = it2;
                                linearLayout = linearLayout3;
                                if (str4.equals("number")) {
                                    android.view.View d3 = perfOptionsRender2.d(2131558625);
                                    android.widget.TextView textView4 = (android.widget.TextView) d3.findViewById(2131361825);
                                    android.widget.SeekBar seekBar = (android.widget.SeekBar) d3.findViewById(2131361815);
                                    android.widget.TextView textView5 = (android.widget.TextView) d3.findViewById(2131361806);
                                    android.widget.TextView textView6 = (android.widget.TextView) d3.findViewById(2131361827);
                                    textView4.setText(tj1Var.f559a);
                                    double d4 = tj1Var.i;
                                    if (d4 == 0.0d) {
                                        seekBar.setMax((int) tj1Var.h);
                                        seekBar.setMin((int) tj1Var.g);
                                        textView = textView5;
                                    } else {
                                        textView = textView5;
                                        seekBar.setMax((int) (tj1Var.h / d4));
                                        seekBar.setMin((int) (tj1Var.g / tj1Var.i));
                                    }
                                    a.wv.v(seekBar, "itemSeekBar");
                                    a.u41 c = perfOptionsRender2.c(tj1Var);
                                    a.rj0 rj0Var = new a.rj0(tj1Var, 1);
                                    a.rj0 rj0Var2 = new a.rj0(tj1Var, 0);
                                    perfOptionsRender = perfOptionsRender2;
                                    view = d3;
                                    obj2 = null;
                                    a.wv.M0(a.wv.b(a.z80.b), null, new a.kj0(c, textView6, seekBar, tj1Var, null), 3);
                                    seekBar.setOnSeekBarChangeListener(new a.lj0(textView6, rj0Var, c, rj0Var2));
                                    android.widget.TextView textView7 = textView;
                                    a.wv.v(textView7, "itemDesc");
                                    com.omarea.sysmbol.PerfOptionsRender.e(textView7, tj1Var.b);
                                    d = view;
                                    break;
                                }
                                d = perfOptionsRender2.d(2131558627);
                                android.widget.TextView textView8 = (android.widget.TextView) d.findViewById(2131361825);
                                android.widget.EditText editText = (android.widget.EditText) d.findViewById(2131361808);
                                android.widget.TextView textView9 = (android.widget.TextView) d.findViewById(2131361806);
                                textView8.setText(tj1Var.f559a);
                                a.vj0 vj0Var = new a.vj0();
                                a.wv.v(editText, "itemEditText");
                                vj0Var.a(editText, perfOptionsRender2.c(tj1Var));
                                a.wv.v(textView9, "itemDesc");
                                com.omarea.sysmbol.PerfOptionsRender.e(textView9, tj1Var.b);
                                editText.setHint(tj1Var.e);
                                perfOptionsRender = perfOptionsRender2;
                                obj2 = r12;
                                break;
                            case -906021636:
                                it = it2;
                                linearLayout = linearLayout3;
                                if (str4.equals("select")) {
                                    d = perfOptionsRender2.d(2131558626);
                                    android.widget.TextView textView10 = (android.widget.TextView) d.findViewById(2131361825);
                                    com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) d.findViewById(2131361819);
                                    android.widget.TextView textView11 = (android.widget.TextView) d.findViewById(2131361806);
                                    textView10.setText(tj1Var.f559a);
                                    a.wv.v(textView11, "itemDesc");
                                    com.omarea.sysmbol.PerfOptionsRender.e(textView11, tj1Var.b);
                                    a.uj1[] uj1VarArr = tj1Var.l;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList(uj1VarArr.length);
                                    for (a.uj1 uj1Var : uj1VarArr) {
                                        java.lang.String str5 = uj1Var.f599a;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        java.lang.String str6 = uj1Var.b;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        arrayList2.add(new a.mg1(str5, str6));
                                    }
                                    selectView.setItems(arrayList2);
                                    a.v41 v41Var = new a.v41(tj1Var);
                                    a.wv.M0(a.wv.b(a.z80.b), (xy) r12, new a.x41(perfOptionsRender2, tj1Var, selectView, (ey) r12), 3);
                                    selectView.setOnItemSelected(new a.y41(perfOptionsRender2, tj1Var, v41Var));
                                    perfOptionsRender = perfOptionsRender2;
                                    obj2 = r12;
                                    break;
                                }
                                d = perfOptionsRender2.d(2131558627);
                                android.widget.TextView textView82 = (android.widget.TextView) d.findViewById(2131361825);
                                android.widget.EditText editText2 = (android.widget.EditText) d.findViewById(2131361808);
                                android.widget.TextView textView92 = (android.widget.TextView) d.findViewById(2131361806);
                                textView82.setText(tj1Var.f559a);
                                a.vj0 vj0Var2 = new a.vj0();
                                a.wv.v(editText2, "itemEditText");
                                vj0Var2.a(editText2, perfOptionsRender2.c(tj1Var));
                                a.wv.v(textView92, "itemDesc");
                                com.omarea.sysmbol.PerfOptionsRender.e(textView92, tj1Var.b);
                                editText2.setHint(tj1Var.e);
                                perfOptionsRender = perfOptionsRender2;
                                obj2 = r12;
                            case 3000946:
                                it = it2;
                                if (str4.equals("apps")) {
                                    android.view.View d5 = perfOptionsRender2.d(2131558620);
                                    android.widget.TextView textView12 = (android.widget.TextView) d5.findViewById(2131361825);
                                    android.widget.TextView textView13 = (android.widget.TextView) d5.findViewById(2131361799);
                                    android.widget.TextView textView14 = (android.widget.TextView) d5.findViewById(2131361806);
                                    textView12.setText(tj1Var.f559a);
                                    a.u41 c2 = perfOptionsRender2.c(tj1Var);
                                    a.wv.v(textView14, "itemDesc");
                                    com.omarea.sysmbol.PerfOptionsRender.e(textView14, tj1Var.b);
                                    a.vj1 vj1Var = new a.vj1(new a.cd1(7, perfOptionsRender2));
                                    a.ua0 ua0Var = new a.ua0(c2, textView13, vj1Var, 4);
                                    a.wv.M0(a.wv.b(a.z80.f728a), (xy) r12, new a.t41(ua0Var, (ey) r12), 3);
                                    linearLayout = linearLayout3;
                                    textView13.setOnClickListener(new a.d41(c2, perfOptionsRender2, vj1Var, ua0Var, 2));
                                    d = d5;
                                    perfOptionsRender = perfOptionsRender2;
                                    obj2 = r12;
                                    break;
                                }
                                linearLayout = linearLayout3;
                                d = perfOptionsRender2.d(2131558627);
                                android.widget.TextView textView822 = (android.widget.TextView) d.findViewById(2131361825);
                                android.widget.EditText editText22 = (android.widget.EditText) d.findViewById(2131361808);
                                android.widget.TextView textView922 = (android.widget.TextView) d.findViewById(2131361806);
                                textView822.setText(tj1Var.f559a);
                                a.vj0 vj0Var22 = new a.vj0();
                                a.wv.v(editText22, "itemEditText");
                                vj0Var22.a(editText22, perfOptionsRender2.c(tj1Var));
                                a.wv.v(textView922, "itemDesc");
                                com.omarea.sysmbol.PerfOptionsRender.e(textView922, tj1Var.b);
                                editText22.setHint(tj1Var.e);
                                perfOptionsRender = perfOptionsRender2;
                                obj2 = r12;
                            case 64711720:
                                it = it2;
                                if (str4.equals("boolean")) {
                                    d = perfOptionsRender2.d(2131558621);
                                    android.widget.TextView textView15 = (android.widget.TextView) d.findViewById(2131361825);
                                    android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) d.findViewById(2131361822);
                                    android.widget.TextView textView16 = (android.widget.TextView) d.findViewById(2131361806);
                                    textView15.setText(tj1Var.f559a);
                                    a.wv.v(compoundButton, "itemSwitch");
                                    a.u41 c3 = perfOptionsRender2.c(tj1Var);
                                    a.wv.M0(a.wv.b(a.z80.b), (xy) r12, new a.qj0(c3, compoundButton, (ey) r12), 3);
                                    compoundButton.setOnCheckedChangeListener(new a.uu(2, c3));
                                    a.wv.v(textView16, "itemDesc");
                                    com.omarea.sysmbol.PerfOptionsRender.e(textView16, tj1Var.b);
                                    perfOptionsRender = perfOptionsRender2;
                                    linearLayout = linearLayout3;
                                    obj2 = r12;
                                    break;
                                }
                                linearLayout = linearLayout3;
                                d = perfOptionsRender2.d(2131558627);
                                android.widget.TextView textView8222 = (android.widget.TextView) d.findViewById(2131361825);
                                android.widget.EditText editText222 = (android.widget.EditText) d.findViewById(2131361808);
                                android.widget.TextView textView9222 = (android.widget.TextView) d.findViewById(2131361806);
                                textView8222.setText(tj1Var.f559a);
                                a.vj0 vj0Var222 = new a.vj0();
                                a.wv.v(editText222, "itemEditText");
                                vj0Var222.a(editText222, perfOptionsRender2.c(tj1Var));
                                a.wv.v(textView9222, "itemDesc");
                                com.omarea.sysmbol.PerfOptionsRender.e(textView9222, tj1Var.b);
                                editText222.setHint(tj1Var.e);
                                perfOptionsRender = perfOptionsRender2;
                                obj2 = r12;
                            case 1542263633:
                                if (str4.equals("decimal")) {
                                    android.view.View d6 = perfOptionsRender2.d(2131558622);
                                    android.widget.TextView textView17 = (android.widget.TextView) d6.findViewById(i3);
                                    final android.widget.EditText editText3 = (android.widget.EditText) d6.findViewById(2131361808);
                                    android.widget.TextView textView18 = (android.widget.TextView) d6.findViewById(i4);
                                    textView17.setText(tj1Var.f559a);
                                    a.vj0 vj0Var3 = new a.vj0();
                                    a.wv.v(editText3, "itemEditText");
                                    final a.u41 c4 = perfOptionsRender2.c(tj1Var);
                                    final java.lang.Object obj4 = new java.lang.Object();
                                    /* TODO: jadx type unresolved, defaulted to Object */
                                    it = it2;
                                    view = d6;
                                    a.wv.M0(a.wv.b(a.z80.b), (xy) r12, new a.tj0(c4, (ia1) (obj4), editText3, (ey) r12), 3);
                                    editText3.setOnEditorActionListener(new a.ej0((Serializable) (obj4), c4, vj0Var3, editText3, 0));
                                    editText3.setOnFocusChangeListener(new a.fj0());
                                    if (a.wv.e(vj0Var3.f635a, "change")) {
                                        editText3.addTextChangedListener(new a.uj0((ia1) (obj4), c4, editText3));
                                    } else {
                                        editText3.getViewTreeObserver().addOnGlobalLayoutListener(new a.hj0(editText3, vj0Var3, new a.oj0(editText3, obj4, c4, 1)));
                                    }
                                    a.wv.v(textView18, "itemDesc");
                                    com.omarea.sysmbol.PerfOptionsRender.e(textView18, tj1Var.b);
                                    editText3.setHint(tj1Var.e);
                                    perfOptionsRender = perfOptionsRender2;
                                    linearLayout = linearLayout3;
                                    obj2 = r12;
                                    d = view;
                                    break;
                                }
                            default:
                                it = it2;
                                linearLayout = linearLayout3;
                                d = perfOptionsRender2.d(2131558627);
                                android.widget.TextView textView82222 = (android.widget.TextView) d.findViewById(2131361825);
                                android.widget.EditText editText2222 = (android.widget.EditText) d.findViewById(2131361808);
                                android.widget.TextView textView92222 = (android.widget.TextView) d.findViewById(2131361806);
                                textView82222.setText(tj1Var.f559a);
                                a.vj0 vj0Var2222 = new a.vj0();
                                a.wv.v(editText2222, "itemEditText");
                                vj0Var2222.a(editText2222, perfOptionsRender2.c(tj1Var));
                                a.wv.v(textView92222, "itemDesc");
                                com.omarea.sysmbol.PerfOptionsRender.e(textView92222, tj1Var.b);
                                editText2222.setHint(tj1Var.e);
                                perfOptionsRender = perfOptionsRender2;
                                obj2 = r12;
                                break;
                        }
                        linearLayout.addView(d);
                        r12 = (ia1) (obj2);
                        linearLayout3 = linearLayout;
                        perfOptionsRender2 = perfOptionsRender;
                        it2 = it;
                        i3 = 2131361825;
                        i4 = 2131361806;
                    }
                    java.util.Iterator it4 = it2;
                    com.omarea.sysmbol.PerfOptionsRender perfOptionsRender3 = perfOptionsRender2;
                    java.lang.Object obj5 = r12;
                    if (cs0Var.f80a == 0) {
                        android.view.View findViewById = d2.findViewById(2131361826);
                        i = 0;
                        findViewById.setPadding(findViewById.getPaddingLeft(), 0, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                    } else {
                        i = 0;
                    }
                    linearLayout2.addView(d2);
                    obj3 = (ia1) (obj5);
                    i2 = i;
                    perfOptionsRender2 = perfOptionsRender3;
                    it2 = it4;
                }
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.tc tcVar = (a.tc) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        tcVar.e(no1Var);
        return no1Var;
    }
}
