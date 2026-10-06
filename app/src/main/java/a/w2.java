package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f647a;
    public final a.kk0 b;
    public final java.lang.String[] c = {"bool", "checkbox", "switch"};

    public w2(android.widget.LinearLayout linearLayout, a.kk0 kk0Var) {
        this.f647a = linearLayout;
        this.b = kk0Var;
    }

    public static java.lang.String b(com.omarea.krscript.model.ActionParamInfo actionParamInfo) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String title = actionParamInfo.getTitle();
        if (title != null && title.length() != 0) {
            sb.append(actionParamInfo.getTitle());
            sb.append(" ");
        }
        java.lang.String label = actionParamInfo.getLabel();
        if (label != null && label.length() != 0) {
            sb.append(actionParamInfo.getLabel());
            sb.append(" ");
        }
        sb.append("(");
        sb.append(actionParamInfo.getName());
        sb.append(") ");
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "tips.toString()");
        return sb2;
    }

    public final void a(android.view.View view, com.omarea.krscript.model.ActionParamInfo actionParamInfo) {
        android.view.View inflate = android.view.LayoutInflater.from(this.b).inflate(2131558598, (android.view.ViewGroup) null);
        java.lang.String title = actionParamInfo.getTitle();
        if (title == null || title.length() == 0) {
            ((android.widget.TextView) inflate.findViewById(2131362712)).setVisibility(8);
        } else {
            ((android.widget.TextView) inflate.findViewById(2131362712)).setText(actionParamInfo.getTitle());
        }
        java.lang.String label = actionParamInfo.getLabel();
        if (label == null || label.length() == 0 || a.op.K1(this.c, actionParamInfo.getType())) {
            ((android.widget.TextView) inflate.findViewById(2131362702)).setVisibility(8);
        } else {
            ((android.widget.TextView) inflate.findViewById(2131362702)).setText(actionParamInfo.getLabel());
        }
        java.lang.String desc = actionParamInfo.getDesc();
        if (desc == null || desc.length() == 0) {
            ((android.widget.TextView) inflate.findViewById(2131362697)).setVisibility(8);
        } else {
            ((android.widget.TextView) inflate.findViewById(2131362697)).setText(actionParamInfo.getDesc());
        }
        ((android.widget.FrameLayout) inflate.findViewById(2131362701)).addView(view);
        this.f647a.addView(inflate);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a.wv.t(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 16;
    }

    public final java.util.HashMap c(java.util.ArrayList arrayList) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.omarea.krscript.model.ActionParamInfo actionParamInfo = (com.omarea.krscript.model.ActionParamInfo) it.next();
            if (actionParamInfo.getName() != null) {
                android.view.View findViewWithTag = this.f647a.findViewWithTag(actionParamInfo.getName());
                boolean z = findViewWithTag instanceof android.widget.EditText;
                a.kk0 kk0Var = this.b;
                if (z) {
                    java.lang.String obj = ((android.widget.EditText) findViewWithTag).getText().toString();
                    if (obj.length() > 0) {
                        if (a.wv.e(actionParamInfo.getType(), "int") || a.wv.e(actionParamInfo.getType(), "number")) {
                            try {
                                int parseInt = java.lang.Integer.parseInt(obj);
                                if (parseInt < actionParamInfo.getMin()) {
                                    throw new java.lang.Exception(b(actionParamInfo) + " " + parseInt + " < " + actionParamInfo.getMin() + " !!!");
                                }
                                if (parseInt > actionParamInfo.getMax()) {
                                    throw new java.lang.Exception(b(actionParamInfo) + " " + parseInt + " > " + actionParamInfo.getMax() + " !!!");
                                }
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        } else if (a.wv.e(actionParamInfo.getType(), "color")) {
                            try {
                                android.graphics.Color.parseColor(obj);
                            } catch (java.lang.Exception unused2) {
                                throw new java.lang.Exception(a.ii1.f(b(actionParamInfo), "  \n", kk0Var.getString(2131952677)));
                            }
                        }
                    }
                    actionParamInfo.setValue(obj);
                } else {
                    if (findViewWithTag instanceof android.widget.CheckBox) {
                        actionParamInfo.setValue(((android.widget.CheckBox) findViewWithTag).isChecked() ? "1" : "0");
                    } else if (findViewWithTag instanceof android.widget.Switch) {
                        actionParamInfo.setValue(((android.widget.Switch) findViewWithTag).isChecked() ? "1" : "0");
                    } else if (findViewWithTag instanceof android.widget.SeekBar) {
                        actionParamInfo.setValue(java.lang.String.valueOf(actionParamInfo.getMin() + ((android.widget.SeekBar) findViewWithTag).getProgress()));
                    } else if (findViewWithTag instanceof android.widget.TextView) {
                        actionParamInfo.setValue(((android.widget.TextView) findViewWithTag).getText().toString());
                    } else if (findViewWithTag instanceof android.widget.Spinner) {
                        java.lang.Object selectedItem = ((android.widget.Spinner) findViewWithTag).getSelectedItem();
                        if (selectedItem instanceof a.ng1) {
                            actionParamInfo.setValue(((a.ng1) selectedItem).c);
                        } else if (selectedItem != null) {
                            actionParamInfo.setValue(selectedItem.toString());
                        } else {
                            actionParamInfo.setValue("");
                        }
                    }
                }
                java.lang.String value = actionParamInfo.getValue();
                if (value != null && value.length() != 0) {
                    java.lang.String name = actionParamInfo.getName();
                    a.wv.s(name);
                    java.lang.String value2 = actionParamInfo.getValue();
                    a.wv.s(value2);
                    hashMap.put(name, value2);
                } else {
                    if (actionParamInfo.getRequired()) {
                        throw new java.lang.Exception(a.ii1.e(b(actionParamInfo), kk0Var.getString(2131952204)));
                    }
                    java.lang.String name2 = actionParamInfo.getName();
                    a.wv.s(name2);
                    hashMap.put(name2, "");
                }
            }
        }
        return hashMap;
    }
}
