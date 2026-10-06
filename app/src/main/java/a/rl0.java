package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rl0 implements android.view.LayoutInflater.Factory2 {
    public final a.am0 c;

    public rl0(a.am0 am0Var) {
        this.c = am0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [android.widget.FrameLayout, android.view.View, androidx.fragment.app.FragmentContainerView, android.view.ViewGroup] */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.fragment.app.a f;
        android.view.View view2;
        boolean equals = androidx.fragment.app.FragmentContainerView.class.getName().equals(str);
        a.am0 am0Var = this.c;
        if (equals) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context, attributeSet);
            frameLayout.f = true;
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.q81.b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
            }
            java.lang.String string = obtainStyledAttributes.getString(1);
            obtainStyledAttributes.recycle();
            int id = frameLayout.getId();
            a.gk0 w = am0Var.w(id);
            if (classAttribute != null && w == null) {
                if (id <= 0) {
                    throw new java.lang.IllegalStateException(a.ai1.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                a.ul0 z = am0Var.z();
                context.getClassLoader();
                a.gk0 a2 = z.a(classAttribute);
                a2.F = true;
                a.jk0 jk0Var = a2.v;
                if ((jk0Var == null ? null : jk0Var.W) != null) {
                    a2.F = true;
                }
                a.cq cqVar = new a.cq(am0Var);
                cqVar.o = true;
                a2.G = frameLayout;
                cqVar.e(frameLayout.getId(), a2, string, 1);
                if (!cqVar.g) {
                    a.am0 am0Var2 = cqVar.p;
                    if (am0Var2.q != null && !am0Var2.D) {
                        am0Var2.t(true);
                        cqVar.a(am0Var2.F, am0Var2.G);
                        am0Var2.b = true;
                        try {
                            am0Var2.L(am0Var2.F, am0Var2.G);
                            am0Var2.d();
                            am0Var2.V();
                            am0Var2.q();
                            am0Var2.c.b.values().removeAll(java.util.Collections.singleton(null));
                        } catch (java.lang.Throwable th) {
                            am0Var2.d();
                            throw th;
                        }
                    }
                } else {
                    throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
                }
            }
            java.util.Iterator it = am0Var.c.d().iterator();
            while (it.hasNext()) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) it.next();
                a.gk0 gk0Var = aVar.c;
                if (gk0Var.z == frameLayout.getId() && (view2 = gk0Var.H) != null && view2.getParent() == null) {
                    gk0Var.G = frameLayout;
                    aVar.b();
                }
            }
            return frameLayout;
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.q81.f465a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes2.getString(0);
        }
        int resourceId = obtainStyledAttributes2.getResourceId(1, -1);
        java.lang.String string2 = obtainStyledAttributes2.getString(2);
        obtainStyledAttributes2.recycle();
        if (attributeValue != null) {
            try {
                if (a.gk0.class.isAssignableFrom(a.ul0.b(context.getClassLoader(), attributeValue))) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string2 == null) {
                        throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    a.gk0 w2 = resourceId != -1 ? am0Var.w(resourceId) : null;
                    if (w2 == null && string2 != null) {
                        w2 = am0Var.x(string2);
                    }
                    if (w2 == null && id2 != -1) {
                        w2 = am0Var.w(id2);
                    }
                    if (w2 == null) {
                        a.ul0 z2 = am0Var.z();
                        context.getClassLoader();
                        w2 = z2.a(attributeValue);
                        w2.p = true;
                        w2.y = resourceId != 0 ? resourceId : id2;
                        w2.z = id2;
                        w2.A = string2;
                        w2.q = true;
                        w2.u = am0Var;
                        a.jk0 jk0Var2 = am0Var.q;
                        w2.v = jk0Var2;
                        android.content.Context context2 = jk0Var2.X;
                        w2.F = true;
                        if ((jk0Var2 != null ? jk0Var2.W : null) != null) {
                            w2.F = true;
                        }
                        f = am0Var.a(w2);
                        if (android.util.Log.isLoggable("FragmentManager", 2)) {
                            android.util.Log.v("FragmentManager", "Fragment " + w2 + " has been inflated via the <fragment> tag: id=0x" + java.lang.Integer.toHexString(resourceId));
                        }
                    } else if (!w2.q) {
                        w2.q = true;
                        w2.u = am0Var;
                        a.jk0 jk0Var3 = am0Var.q;
                        w2.v = jk0Var3;
                        android.content.Context context3 = jk0Var3.X;
                        w2.F = true;
                        if ((jk0Var3 != null ? jk0Var3.W : null) != null) {
                            w2.F = true;
                        }
                        f = am0Var.f(w2);
                        if (android.util.Log.isLoggable("FragmentManager", 2)) {
                            android.util.Log.v("FragmentManager", "Retained Fragment " + w2 + " has been re-attached via the <fragment> tag: id=0x" + java.lang.Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + java.lang.Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    w2.G = (android.view.ViewGroup) view;
                    f.k();
                    f.j();
                    android.view.View view3 = w2.H;
                    if (view3 != null) {
                        if (resourceId != 0) {
                            view3.setId(resourceId);
                        }
                        if (w2.H.getTag() == null) {
                            w2.H.setTag(string2);
                        }
                        w2.H.addOnAttachStateChangeListener(new a.ql0(this, f));
                        return w2.H;
                    }
                    throw new java.lang.IllegalStateException(a.ai1.h("Fragment ", attributeValue, " did not create a view."));
                }
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return null;
    }
}
