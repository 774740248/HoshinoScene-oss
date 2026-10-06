package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wu0 implements android.view.LayoutInflater.Factory2 {
    public final android.content.Context c;
    public final a.nb1 d;

    public wu0(android.content.Context context, a.nb1 nb1Var) {
        a.wv.w(context, "context");
        a.wv.w(nb1Var, "override");
        this.c = context;
        this.d = nb1Var;
    }

    public final java.lang.String a(android.util.AttributeSet attributeSet, java.lang.String str) {
        int attributeResourceValue;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (a.wv.e(str, attributeSet.getAttributeName(i)) && (attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0)) != 0) {
                return this.c.getResources().getResourceEntryName(attributeResourceValue);
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        a.wv.w(str, "name");
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        return onCreateView(str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View createView;
        a.wv.w(str, "name");
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        java.lang.Integer num = null;
        if (a.yi1.g2(str, ".")) {
            createView = from.createView(str, null, attributeSet);
            a.wv.v(createView, "{\n            inflater.c…e, null, attrs)\n        }");
        } else {
            try {
                createView = from.createView(str, a.wv.e(str, "WebView") ? "android.webkit." : "android.widget.", attributeSet);
            } catch (java.lang.ClassNotFoundException unused) {
                createView = from.createView(str, "android.view.", attributeSet);
            }
            a.wv.v(createView, "{\n            val prefix…)\n            }\n        }");
        }
        boolean z = createView instanceof android.widget.TextView;
        a.nb1 nb1Var = this.d;
        if (!z && !(createView instanceof com.omarea.ui.NavItem)) {
            if (createView instanceof android.widget.ImageView) {
                int attributeCount = attributeSet.getAttributeCount();
                int i = 0;
                while (true) {
                    if (i >= attributeCount) {
                        break;
                    }
                    if (a.wv.e("tint", attributeSet.getAttributeName(i))) {
                        java.lang.String attributeValue = attributeSet.getAttributeValue(i);
                        a.wv.v(attributeValue, "value");
                        if (a.yi1.B2(attributeValue, "#")) {
                            num = java.lang.Integer.valueOf(android.graphics.Color.parseColor(attributeValue));
                            break;
                        }
                        boolean B2 = a.yi1.B2(attributeValue, "?");
                        android.content.Context context2 = this.c;
                        if (B2) {
                            java.lang.String substring = attributeValue.substring(1);
                            a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                            int parseInt = java.lang.Integer.parseInt(substring);
                            android.util.TypedValue typedValue = new android.util.TypedValue();
                            context2.getTheme().resolveAttribute(parseInt, typedValue, true);
                            num = java.lang.Integer.valueOf(typedValue.data);
                            break;
                        }
                        if (a.yi1.B2(attributeValue, "@")) {
                            java.lang.String substring2 = attributeValue.substring(1);
                            a.wv.v(substring2, "this as java.lang.String).substring(startIndex)");
                            int parseInt2 = java.lang.Integer.parseInt(substring2);
                            java.lang.Object obj = a.zx.f748a;
                            num = java.lang.Integer.valueOf(a.yx.a(context2, parseInt2));
                            break;
                        }
                    }
                    i++;
                }
                if (num != null) {
                    android.widget.ImageView imageView = (android.widget.ImageView) createView;
                    int intValue = num.intValue();
                    if (((intValue >> 24) & 255) == 0) {
                        intValue = android.graphics.Color.argb(255, (intValue >> 16) & 255, (intValue >> 8) & 255, intValue & 255);
                    }
                    imageView.setImageTintList(android.content.res.ColorStateList.valueOf(intValue));
                }
            } else if (createView instanceof android.widget.Spinner) {
                java.lang.String a2 = a(attributeSet, "entries");
                java.lang.String[] strArr = a2 != null ? (java.lang.String[]) nb1Var.c.get(a2) : null;
                if (strArr != null) {
                    ((android.widget.Spinner) createView).setAdapter((android.widget.SpinnerAdapter) new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item, strArr));
                }
            }
        } else {
            try {
                java.lang.String a3 = a(attributeSet, "text");
                java.lang.String str2 = a3 != null ? (java.lang.String) nb1Var.b.get(a3) : null;
                if (str2 != null) {
                    if (createView instanceof android.widget.TextView) {
                        ((android.widget.TextView) createView).setText(str2);
                    } else if (createView instanceof com.omarea.ui.NavItem) {
                        ((com.omarea.ui.NavItem) createView).setText(str2);
                    }
                }
            } catch (java.lang.Throwable th) {
                a.b20.I(th);
            }
            if (createView instanceof android.widget.EditText) {
                try {
                    java.lang.String a4 = a(attributeSet, "hint");
                    java.lang.String str3 = a4 != null ? (java.lang.String) nb1Var.b.get(a4) : null;
                    if (str3 != null) {
                        ((android.widget.EditText) createView).setHint(str3);
                    }
                } catch (java.lang.Throwable th2) {
                    a.b20.I(th2);
                }
            }
        }
        return createView;
    }
}
