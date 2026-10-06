package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jj1 extends android.view.MenuInflater {
    public static final java.lang.Class[] e;
    public static final java.lang.Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f256a;
    public final java.lang.Object[] b;
    public final android.content.Context c;
    public java.lang.Object d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        e = clsArr;
        f = clsArr;
    }

    public jj1(android.content.Context context) {
        super(context);
        this.c = context;
        java.lang.Object[] objArr = {context};
        this.f256a = objArr;
        this.b = objArr;
    }

    public static java.lang.Object a(android.content.Context context) {
        return (!(context instanceof android.app.Activity) && (context instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(android.content.res.XmlResourceParser xmlResourceParser, android.util.AttributeSet attributeSet, android.view.Menu menu) {
        int i;
        android.content.res.ColorStateList colorStateList;
        a.ij1 ij1Var = new a.ij1(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                java.lang.String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        java.lang.String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    java.lang.String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        ij1Var.b = 0;
                        ij1Var.c = 0;
                        ij1Var.d = 0;
                        ij1Var.e = 0;
                        ij1Var.f = true;
                        ij1Var.g = true;
                    } else if (name2.equals("item")) {
                        if (!ij1Var.h) {
                            a.yz0 yz0Var = ij1Var.z;
                            if (yz0Var == null || !yz0Var.f722a.hasSubMenu()) {
                                ij1Var.h = true;
                                ij1Var.b(ij1Var.f231a.add(ij1Var.b, ij1Var.i, ij1Var.j, ij1Var.k));
                            } else {
                                ij1Var.h = true;
                                ij1Var.b(ij1Var.f231a.addSubMenu(ij1Var.b, ij1Var.i, ij1Var.j, ij1Var.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
                z = z;
            } else {
                if (!z2) {
                    java.lang.String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    a.jj1 jj1Var = ij1Var.E;
                    if (equals) {
                        android.content.res.TypedArray obtainStyledAttributes = jj1Var.c.obtainStyledAttributes(attributeSet, a.u81.p);
                        ij1Var.b = obtainStyledAttributes.getResourceId(1, 0);
                        ij1Var.c = obtainStyledAttributes.getInt(3, 0);
                        ij1Var.d = obtainStyledAttributes.getInt(4, 0);
                        ij1Var.e = obtainStyledAttributes.getInt(5, 0);
                        ij1Var.f = obtainStyledAttributes.getBoolean(2, true);
                        ij1Var.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            android.content.Context context = jj1Var.c;
                            a.nk nkVar = new a.nk(context, context.obtainStyledAttributes(attributeSet, a.u81.q));
                            ij1Var.i = nkVar.x(2, 0);
                            ij1Var.j = (nkVar.o(5, ij1Var.c) & (-65536)) | (nkVar.o(6, ij1Var.d) & 65535);
                            ij1Var.k = nkVar.A(7);
                            ij1Var.l = nkVar.A(8);
                            ij1Var.m = nkVar.x(0, 0);
                            java.lang.String z3 = nkVar.z(9);
                            ij1Var.n = z3 == null ? (char) 0 : z3.charAt(0);
                            ij1Var.o = nkVar.o(16, 4096);
                            java.lang.String z4 = nkVar.z(10);
                            ij1Var.p = z4 == null ? (char) 0 : z4.charAt(0);
                            ij1Var.q = nkVar.o(20, 4096);
                            if (nkVar.C(11)) {
                                ij1Var.r = nkVar.h(11, false) ? 1 : 0;
                            } else {
                                ij1Var.r = ij1Var.e;
                            }
                            ij1Var.s = nkVar.h(3, false);
                            ij1Var.t = nkVar.h(4, ij1Var.f);
                            ij1Var.u = nkVar.h(1, ij1Var.g);
                            ij1Var.v = nkVar.o(21, -1);
                            ij1Var.y = nkVar.z(12);
                            ij1Var.w = nkVar.x(13, 0);
                            ij1Var.x = nkVar.z(15);
                            java.lang.String z5 = nkVar.z(14);
                            boolean z6 = z5 != null;
                            if (z6 && ij1Var.w == 0 && ij1Var.x == null) {
                                ij1Var.z = (a.yz0) ij1Var.a(z5, f, jj1Var.b);
                            } else {
                                if (z6) {
                                    android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                ij1Var.z = null;
                            }
                            ij1Var.A = nkVar.A(17);
                            ij1Var.B = nkVar.A(22);
                            if (nkVar.C(19)) {
                                ij1Var.D = a.m90.b(nkVar.o(19, -1), ij1Var.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                ij1Var.D = null;
                            }
                            if (nkVar.C(18)) {
                                ij1Var.C = nkVar.i(18);
                            } else {
                                ij1Var.C = colorStateList;
                            }
                            nkVar.K();
                            ij1Var.h = false;
                        } else if (name3.equals("menu")) {
                            ij1Var.h = true;
                            android.view.SubMenu addSubMenu = ij1Var.f231a.addSubMenu(ij1Var.b, ij1Var.i, ij1Var.j, ij1Var.k);
                            ij1Var.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                z = z;
            }
            eventType = xmlResourceParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, android.view.Menu menu) {
        if (!(menu instanceof a.gj1)) {
            super.inflate(i, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i);
                    b(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (java.io.IOException e2) {
                    throw new android.view.InflateException("Error inflating menu XML", e2);
                }
            } catch (org.xmlpull.v1.XmlPullParserException e3) {
                throw new android.view.InflateException("Error inflating menu XML", e3);
            }
        } catch (java.lang.Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
