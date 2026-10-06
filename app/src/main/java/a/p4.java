package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p4 implements a.y60, a.x30 {
    public int c;
    public java.lang.Object d;
    public java.lang.Object e;

    public /* synthetic */ p4(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.p4 g(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p4.g(android.content.res.Resources, int, android.content.res.Resources$Theme):a.p4");
    }

    @Override // a.y60
    public void a(java.util.ArrayList arrayList, boolean[] zArr) {
        java.lang.Boolean bool;
        int i = this.c;
        int i2 = 0;
        java.lang.Object obj = this.d;
        java.lang.Object obj2 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (arrayList.isEmpty()) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X("未选择任意档位，本次修改无效", 0);
                } else {
                    com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = (com.omarea.vtools.activities.ActivityAppDetails) obj;
                    a.wc0 wc0Var = activityAppDetails.T;
                    java.lang.String str = activityAppDetails.L;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String str2 = ((a.ng1) it.next()).c;
                        a.wv.s(str2);
                        arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                    }
                    wc0Var.getClass();
                    a.wv.w(str, "app");
                    wc0Var.g.M(str, a.qv.j2(arrayList2, ",", null, null, null, 62));
                }
                ((android.widget.TextView) obj2).setText(arrayList.size() > 2 ? a.qv.j2(arrayList.subList(0, 2), ",", null, null, null, 62).concat("…") : a.qv.j2(arrayList, ",", null, null, null, 62));
                return;
            case 1:
                a.ma1 ma1Var = (a.ma1) obj;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) obj2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj3 : arrayList3) {
                    if (arrayList.contains((a.ng1) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList(a.op.J1(arrayList4, 10));
                java.util.Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    java.lang.String str3 = ((a.ng1) it2.next()).c;
                    a.wv.s(str3);
                    arrayList5.add(str3);
                }
                ma1Var.c = arrayList5;
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.D().edit().putString("chart_optional", a.qv.j2((java.lang.Iterable) ma1Var.c, ",", null, null, null, 62)).apply();
                int i3 = 0;
                for (java.lang.Object obj4 : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    a.ng1 ng1Var = (a.ng1) obj4;
                    if (zArr[i3]) {
                        java.lang.Object obj5 = ng1Var.e;
                        a.wv.t(obj5, "null cannot be cast to non-null type android.view.View");
                        ((android.view.View) obj5).setVisibility(0);
                    } else {
                        java.lang.Object obj6 = ng1Var.e;
                        a.wv.t(obj6, "null cannot be cast to non-null type android.view.View");
                        ((android.view.View) obj6).setVisibility(8);
                    }
                    i3 = i4;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                if (!arrayList.isEmpty()) {
                    a.ng1 ng1Var2 = (a.ng1) a.qv.e2(arrayList);
                    com.omarea.vtools.activities.ActivityImg activityImg = (com.omarea.vtools.activities.ActivityImg) obj;
                    java.lang.String str4 = (java.lang.String) obj2;
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityImg.l;
                    activityImg.getClass();
                    int i5 = a.x60.f681a;
                    java.lang.String string = activityImg.getString(2131952533);
                    a.wv.v(string, "getString(R.string.img_flash_confirm)");
                    java.lang.String string2 = activityImg.getString(2131952536);
                    a.wv.v(string2, "getString(R.string.img_flash_warn)");
                    a.fs1.i(activityImg, string, a.ai1.l(new java.lang.Object[]{str4, ng1Var2.f381a}, 2, string2, "format(format, *args)"), new a.ua0(activityImg, str4, ng1Var2, 19), null);
                    return;
                }
                return;
            case 3:
                com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings = (com.omarea.vtools.activities.ActivityOtherSettings) obj;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                android.view.View view = (android.view.View) obj2;
                ((a.xe1) activityOtherSettings.s.a()).d(java.lang.Integer.parseInt(view.getTag().toString()), (a.ng1) a.qv.g2(arrayList));
                if (view instanceof android.widget.ImageView) {
                    activityOtherSettings.o((android.widget.ImageView) view);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.qs0 qs0Var = new a.qs0(0, zArr.length - 1, 1);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                a.rs0 it3 = qs0Var.iterator();
                while (it3.e) {
                    java.lang.Object next = it3.next();
                    if (zArr[((java.lang.Number) next).intValue()]) {
                        arrayList6.add(next);
                    }
                }
                if (arrayList6.isEmpty()) {
                    android.widget.Toast.makeText(((com.omarea.vtools.activities.ActivityPerfBench) obj).getContext(), "请至少选择一个核心", 0).show();
                    return;
                } else {
                    ((a.ma1) obj2).c = zArr;
                    return;
                }
            default:
                if (!(zArr.length == 0)) {
                    int length = zArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            bool = null;
                        } else {
                            boolean z = zArr[i6];
                            if (z) {
                                bool = java.lang.Boolean.valueOf(z);
                            } else {
                                i6++;
                            }
                        }
                    }
                    if (bool != null) {
                        a.pl0 pl0Var = (a.pl0) obj2;
                        int length2 = zArr.length;
                        int i7 = 0;
                        while (i2 < length2) {
                            boolean z2 = zArr[i2];
                            pl0Var.I0.getClass();
                            a.ls.t(i7, z2);
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.il0(pl0Var, null), 3);
                            i2++;
                            i7++;
                        }
                        return;
                    }
                }
                android.widget.Toast.makeText((a.p5) obj, ((a.pl0) obj2).m(2131952505), 0).show();
                return;
        }
    }

    @Override // a.x30
    public void b(java.util.ArrayList arrayList) {
        int i = this.c;
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ij0 ij0Var = (a.ij0) obj2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((a.tg) it.next()).getPackageName());
                }
                ij0Var.setValue(arrayList2);
                ((java.lang.Runnable) obj).run();
                return;
            case 1:
                java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((a.tg) it2.next()).getPackageName());
                }
                for (com.omarea.model.AppInfo appInfo : (Iterable<com.omarea.model.AppInfo>) (java.util.List) obj2) {
                    appInfo.setSelected(arrayList3.contains(appInfo.getPackageName()));
                }
                android.content.SharedPreferences.Editor clear = ((android.content.SharedPreferences) obj).edit().clear();
                java.util.Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    a.tg tgVar = (a.tg) it3.next();
                    if (tgVar.getSelected()) {
                        clear.putBoolean(tgVar.getPackageName(), true);
                    }
                }
                clear.apply();
                return;
            default:
                if (!arrayList.isEmpty()) {
                    ((a.bp0) obj2).i(a.qv.e2(arrayList));
                    return;
                }
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = ((com.omarea.vtools.activities.ActivityFastShare) obj).getString(2131952437);
                a.wv.v(string, "getString(R.string.fs_no_app_selected)");
                a.fs1.X(string, 0);
                return;
        }
    }

    public void c(a.da1 da1Var) {
        a.wq1 wq1Var = (a.wq1) ((a.rh1) this.d).getOrDefault(da1Var, null);
        if (wq1Var == null) {
            wq1Var = a.wq1.a();
            ((a.rh1) this.d).put(da1Var, wq1Var);
        }
        wq1Var.f672a |= 1;
    }

    public void d(a.da1 da1Var, a.i91 i91Var) {
        a.wq1 wq1Var = (a.wq1) ((a.rh1) this.d).getOrDefault(da1Var, null);
        if (wq1Var == null) {
            wq1Var = a.wq1.a();
            ((a.rh1) this.d).put(da1Var, wq1Var);
        }
        wq1Var.c = i91Var;
        wq1Var.f672a |= 8;
    }

    public void e(a.da1 da1Var, a.i91 i91Var) {
        a.wq1 wq1Var = (a.wq1) ((a.rh1) this.d).getOrDefault(da1Var, null);
        if (wq1Var == null) {
            wq1Var = a.wq1.a();
            ((a.rh1) this.d).put(da1Var, wq1Var);
        }
        wq1Var.b = i91Var;
        wq1Var.f672a |= 4;
    }

    public void f() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.rh1) this.d).clear();
                ((a.sx0) this.e).a();
                return;
            default:
                int[] iArr = (int[]) this.d;
                if (iArr != null) {
                    java.util.Arrays.fill(iArr, -1);
                }
                this.e = null;
                return;
        }
    }

    public void h(int i) {
        java.lang.Object obj = this.d;
        if (((int[]) obj) == null) {
            int[] iArr = new int[java.lang.Math.max(i, 10) + 1];
            this.d = iArr;
            java.util.Arrays.fill(iArr, -1);
        } else if (i >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.d = iArr3;
            java.lang.System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            java.lang.Object obj2 = this.d;
            java.util.Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public android.view.View i(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int paddingRight;
        android.view.View F;
        a.l91 l91Var = (a.l91) ((a.lp1) this.d);
        int i6 = l91Var.f312a;
        androidx.recyclerview.widget.a aVar = l91Var.b;
        switch (i6) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                paddingLeft = aVar.getPaddingLeft();
                break;
            default:
                paddingLeft = aVar.getPaddingTop();
                break;
        }
        a.l91 l91Var2 = (a.l91) ((a.lp1) this.d);
        int i7 = l91Var2.f312a;
        androidx.recyclerview.widget.a aVar2 = l91Var2.b;
        switch (i7) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                i5 = aVar2.p;
                paddingRight = aVar2.getPaddingRight();
                break;
            default:
                i5 = aVar2.q;
                paddingRight = aVar2.getPaddingBottom();
                break;
        }
        int i8 = i5 - paddingRight;
        int i9 = i2 > i ? 1 : -1;
        android.view.View view = null;
        while (i != i2) {
            a.l91 l91Var3 = (a.l91) ((a.lp1) this.d);
            int i10 = l91Var3.f312a;
            androidx.recyclerview.widget.a aVar3 = l91Var3.b;
            switch (i10) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    F = aVar3.F(i);
                    break;
                default:
                    F = aVar3.F(i);
                    break;
            }
            int b = ((a.l91) ((a.lp1) this.d)).b(F);
            int a2 = ((a.l91) ((a.lp1) this.d)).a(F);
            java.lang.Object obj = this.e;
            a.kp1 kp1Var = (a.kp1) obj;
            kp1Var.b = paddingLeft;
            kp1Var.c = i8;
            kp1Var.d = b;
            kp1Var.e = a2;
            if (i3 != 0) {
                ((a.kp1) obj).f298a = i3;
                if (((a.kp1) obj).a()) {
                    return F;
                }
            }
            if (i4 != 0) {
                java.lang.Object obj2 = this.e;
                ((a.kp1) obj2).f298a = i4;
                if (((a.kp1) obj2).a()) {
                    view = F;
                }
            }
            i += i9;
        }
        return view;
    }

    public java.util.ArrayList j() {
        int i = this.c;
        java.lang.Object obj = this.e;
        return (i < 2700000 || ((java.util.ArrayList) obj).size() != 2) ? ((java.util.ArrayList) obj).size() > 3 ? a.b20.f(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#B177E3")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#00d5d9")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#00B9C2")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc8a1b"))) : a.b20.f(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#B177E3")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#00d5d9")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc8a1b")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc8a1b"))) : a.b20.f(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#00d5d9")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc8a1b")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc8a1b")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc8a1b")));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k(int r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.d
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.util.List r0 = r5.e
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L15
        L13:
            r0 = r1
            goto L72
        L15:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1b
            goto L36
        L1b:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r0 < 0) goto L36
            java.util.List r3 = r5.e
            java.util.List r3 = (java.util.List) r3
            java.util.List r3 = r3.get(r0)
            a.mi1 r3 = (a.mi1) r3
            int r4 = r3.c
            if (r4 != r6) goto L33
            r2 = r3
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L21
        L36:
            if (r2 == 0) goto L3f
            java.util.List r0 = r5.e
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3f:
            java.util.List r0 = r5.e
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L48:
            if (r2 >= r0) goto L5c
            java.util.List r3 = r5.e
            java.util.List r3 = (java.util.List) r3
            java.util.List r3 = r3.get(r2)
            a.mi1 r3 = (a.mi1) r3
            int r3 = r3.c
            if (r3 < r6) goto L59
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L48
        L5c:
            r2 = r1
        L5d:
            if (r2 == r1) goto L13
            java.util.List r0 = r5.e
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = r0.get(r2)
            a.mi1 r0 = (a.mi1) r0
            java.util.List r3 = r5.e
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.c
        L72:
            if (r0 != r1) goto L82
            java.util.List r0 = r5.d
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.d
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.d
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.d
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p4.k(int):int");
    }

    public boolean l() {
        if (((android.graphics.Shader) this.d) == null) {
            java.lang.Object obj = this.e;
            if (((android.content.res.ColorStateList) obj) != null && ((android.content.res.ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public boolean m(android.view.View view) {
        int paddingLeft;
        int i;
        int paddingRight;
        a.kp1 kp1Var = (a.kp1) this.e;
        a.l91 l91Var = (a.l91) ((a.lp1) this.d);
        int i2 = l91Var.f312a;
        androidx.recyclerview.widget.a aVar = l91Var.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                paddingLeft = aVar.getPaddingLeft();
                break;
            default:
                paddingLeft = aVar.getPaddingTop();
                break;
        }
        a.l91 l91Var2 = (a.l91) ((a.lp1) this.d);
        int i3 = l91Var2.f312a;
        androidx.recyclerview.widget.a aVar2 = l91Var2.b;
        switch (i3) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                i = aVar2.p;
                paddingRight = aVar2.getPaddingRight();
                break;
            default:
                i = aVar2.q;
                paddingRight = aVar2.getPaddingBottom();
                break;
        }
        int i4 = i - paddingRight;
        int b = ((a.l91) ((a.lp1) this.d)).b(view);
        int a2 = ((a.l91) ((a.lp1) this.d)).a(view);
        kp1Var.b = paddingLeft;
        kp1Var.c = i4;
        kp1Var.d = b;
        kp1Var.e = a2;
        java.lang.Object obj = this.e;
        ((a.kp1) obj).f298a = 24579;
        return ((a.kp1) obj).a();
    }

    public void n(int i, int i2) {
        int[] iArr = (int[]) this.d;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        h(i3);
        int[] iArr2 = (int[]) this.d;
        java.lang.System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        java.util.Arrays.fill((int[]) this.d, i, i3, -1);
        java.util.List list = (java.util.List) this.e;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            a.mi1 mi1Var = (a.mi1) ((java.util.List) this.e).get(size);
            int i4 = mi1Var.c;
            if (i4 >= i) {
                mi1Var.c = i4 + i2;
            }
        }
    }

    public void o(int i, int i2) {
        int[] iArr = (int[]) this.d;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        h(i3);
        int[] iArr2 = (int[]) this.d;
        java.lang.System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.d;
        java.util.Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        java.util.List list = (java.util.List) this.e;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            a.mi1 mi1Var = (a.mi1) ((java.util.List) this.e).get(size);
            int i4 = mi1Var.c;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((java.util.List) this.e).remove(size);
                } else {
                    mi1Var.c = i4 - i2;
                }
            }
        }
    }

    public boolean p(int[] iArr) {
        if (l()) {
            android.content.res.ColorStateList colorStateList = (android.content.res.ColorStateList) this.e;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public a.i91 q(a.da1 da1Var, int i) {
        a.wq1 wq1Var;
        a.i91 i91Var;
        int e = ((a.rh1) this.d).e(da1Var);
        if (e >= 0 && (wq1Var = (a.wq1) ((a.rh1) this.d).j(e)) != null) {
            int i2 = wq1Var.f672a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                wq1Var.f672a = i3;
                if (i == 4) {
                    i91Var = wq1Var.b;
                } else {
                    if (i != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    i91Var = wq1Var.c;
                }
                if ((i3 & 12) == 0) {
                    ((a.rh1) this.d).i(e);
                    wq1Var.f672a = 0;
                    wq1Var.b = null;
                    wq1Var.c = null;
                    a.wq1.d.b(wq1Var);
                }
                return i91Var;
            }
        }
        return null;
    }

    public void r(a.da1 da1Var) {
        a.wq1 wq1Var = (a.wq1) ((a.rh1) this.d).getOrDefault(da1Var, null);
        if (wq1Var == null) {
            return;
        }
        wq1Var.f672a &= -2;
    }

    public void s(a.da1 da1Var) {
        int f = ((a.sx0) this.e).f() - 1;
        while (true) {
            if (f < 0) {
                break;
            }
            if (da1Var == ((a.sx0) this.e).g(f)) {
                a.sx0 sx0Var = (a.sx0) this.e;
                java.lang.Object[] objArr = sx0Var.e;
                java.lang.Object obj = objArr[f];
                java.lang.Object obj2 = a.sx0.g;
                if (obj != obj2) {
                    objArr[f] = obj2;
                    sx0Var.c = true;
                }
            } else {
                f--;
            }
        }
        a.wq1 wq1Var = (a.wq1) ((a.rh1) this.d).remove(da1Var);
        if (wq1Var != null) {
            wq1Var.f672a = 0;
            wq1Var.b = null;
            wq1Var.c = null;
            a.wq1.d.b(wq1Var);
        }
    }

    public p4() {
        this.d = new a.ls();
        this.e = a.ls.d();
        this.c = a.ls.h(0);
    }

    public /* synthetic */ p4(int i) {
        this.c = i;
        if (i != 1) {
            this.d = new a.rh1();
            this.e = new a.sx0();
        }
    }

    public p4(android.graphics.Shader shader, android.content.res.ColorStateList colorStateList, int i) {
        this.d = shader;
        this.e = colorStateList;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a.kp1, java.lang.Object] */
    public /* synthetic */ p4(a.l91 l91Var) {
        this.c = 2;
        this.d = l91Var;
        a.kp1 obj = new a.kp1();
        obj.f298a = 0;
        this.e = obj;
    }
}
