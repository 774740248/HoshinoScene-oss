package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class up extends a.tg1 {
    public final java.lang.String[] b;
    public final java.lang.String[] c;
    public final java.lang.String[] d;
    public final java.lang.String[] e;
    public final java.lang.String[] f;
    public final java.lang.String[] g;
    public final java.lang.String[] h;
    public final java.lang.String[] i;
    public final java.lang.String[] j;

    public up() {
        super(8);
        this.b = new java.lang.String[]{"允许", "Allow"};
        this.c = new java.lang.String[]{"installation…", "安装准备中", "检测中", "扫描中", "正在准备安装应用"};
        this.d = new java.lang.String[]{"已了解应用的风险检测结果", "我已了解此应用的风险检测结果", "已了解此应用未经安全检查"};
        this.e = new java.lang.String[]{"Update", "继续更新", "更新", "继续安装", "下一步", "下一步", "Next", "Next", "仍然安装"};
        this.f = new java.lang.String[]{"允许本次安装", "安装", "Install", "安裝", "Install"};
        this.g = new java.lang.String[]{"安装中", "Installing", "扫描中"};
        this.h = new java.lang.String[]{"完成", "Done", "OK"};
        this.i = new java.lang.String[]{"你喜欢", "推荐", "广告", "还下载", "还喜欢"};
        this.j = new java.lang.String[]{"Don't", "商店", "安全", "删除", "退出", "取消"};
    }

    public static /* synthetic */ void w(a.up upVar, java.lang.String[] strArr, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.accessibilityservice.AccessibilityService accessibilityService, long j, int i) {
        if ((i & 8) != 0) {
            j = 0;
        }
        upVar.v(strArr, accessibilityNodeInfo, accessibilityService, j, false);
    }

    public static void x(java.lang.String[] strArr, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        for (java.lang.String str : strArr) {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str);
            if (findAccessibilityNodeInfosByText != null && !findAccessibilityNodeInfosByText.isEmpty()) {
                int size = findAccessibilityNodeInfosByText.size();
                for (int i = 0; i < size; i++) {
                    android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = findAccessibilityNodeInfosByText.get(i);
                    a.wv.w(accessibilityNodeInfo2, "node");
                    if (accessibilityNodeInfo2.isCheckable() && !accessibilityNodeInfo2.isChecked()) {
                        try {
                            accessibilityNodeInfo2.setChecked(true);
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                            if (!accessibilityNodeInfo2.isChecked()) {
                                if (!a.tg1.c(accessibilityNodeInfo2)) {
                                }
                            }
                        }
                        java.lang.Thread.sleep(200L);
                    }
                }
            }
        }
    }

    public static void y(android.accessibilityservice.AccessibilityService accessibilityService, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.wv.w(accessibilityService, "service");
        a.wv.w(accessibilityEvent, "event");
        a.cp cpVar = com.omarea.Scene.c;
        if (!a.fs1.s("is_auto_install", false) || accessibilityEvent.getSource() == null) {
            return;
        }
        try {
            android.view.accessibility.AccessibilityNodeInfo source = accessibilityEvent.getSource();
            a.wv.s(source);
            java.lang.String[] strArr = {"继续安装", "Install"};
            for (int i = 0; i < 2; i++) {
                java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText = source.findAccessibilityNodeInfosByText(strArr[i]);
                if (findAccessibilityNodeInfosByText != null && !findAccessibilityNodeInfosByText.isEmpty()) {
                    int size = findAccessibilityNodeInfosByText.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = findAccessibilityNodeInfosByText.get(i2);
                        a.wv.v(accessibilityNodeInfo, "next2Nodes[i]");
                        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
                        java.lang.String obj = accessibilityNodeInfo2.getClassName().toString();
                        java.util.Locale locale = java.util.Locale.getDefault();
                        a.wv.v(locale, "getDefault()");
                        java.lang.String lowerCase = obj.toLowerCase(locale);
                        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (a.yi1.g2(lowerCase, "button")) {
                            if (!accessibilityNodeInfo2.isEnabled()) {
                                accessibilityNodeInfo2.setEnabled(true);
                            }
                            if (!a.tg1.c(accessibilityNodeInfo2)) {
                                a.tg1.s(accessibilityNodeInfo2, accessibilityService);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.String[] r15, android.view.accessibility.AccessibilityNodeInfo r16, android.accessibilityservice.AccessibilityService r17, long r18, boolean r20) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L7:
            if (r5 >= r3) goto Lae
            r6 = r1[r5]
            java.util.List r6 = r2.findAccessibilityNodeInfosByText(r6)
            if (r6 == 0) goto La8
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L19
            goto La8
        L19:
            int r7 = r6.size()
            r8 = r4
        L1e:
            if (r8 >= r7) goto La8
            android.view.accessibility.AccessibilityNodeInfo r9 = r6.get(r8)
            android.view.accessibility.AccessibilityNodeInfo r9 = (android.view.accessibility.AccessibilityNodeInfo) r9
            java.lang.CharSequence r9 = r9.getText()
            a.wv.s(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String[] r10 = r0.j
            int r11 = r10.length
            r12 = r4
        L35:
            if (r12 >= r11) goto L45
            r13 = r10[r12]
            boolean r13 = a.yi1.g2(r9, r13)
            if (r13 == 0) goto L42
        L3f:
            r10 = r17
            goto La4
        L42:
            int r12 = r12 + 1
            goto L35
        L45:
            android.view.accessibility.AccessibilityNodeInfo r9 = r6.get(r8)
            java.lang.String r10 = "nodes[i]"
            a.wv.v(r9, r10)
            android.view.accessibility.AccessibilityNodeInfo r9 = (android.view.accessibility.AccessibilityNodeInfo) r9
            a.tg1.c(r9)
            android.view.accessibility.AccessibilityNodeInfo r9 = r6.get(r8)
            a.wv.v(r9, r10)
            android.view.accessibility.AccessibilityNodeInfo r9 = (android.view.accessibility.AccessibilityNodeInfo) r9
            android.view.accessibility.AccessibilityNodeInfo r9 = a.tg1.d(r9)
            if (r9 == 0) goto L3f
            boolean r10 = r9.isEnabled()
            if (r10 != 0) goto L6c
            r10 = 1
            r9.setEnabled(r10)
        L6c:
            if (r20 == 0) goto L90
            java.lang.String[] r10 = r0.i
            int r11 = r10.length
            r12 = r4
        L72:
            if (r12 >= r11) goto L90
            r13 = r10[r12]
            java.util.List r13 = r2.findAccessibilityNodeInfosByText(r13)
            if (r13 == 0) goto L8d
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L83
            goto L8d
        L83:
            a.cp r9 = com.omarea.Scene.c
            java.lang.String r9 = "界面上疑似存在广告，SCENE跳过自动点击[安装]！"
            a.fs1.X(r9, r4)
        L8a:
            r10 = r17
            goto L9b
        L8d:
            int r12 = r12 + 1
            goto L72
        L90:
            boolean r10 = a.tg1.c(r9)
            if (r10 != 0) goto L8a
            r10 = r17
            a.tg1.s(r9, r10)
        L9b:
            r11 = 0
            int r9 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r9 <= 0) goto La4
            java.lang.Thread.sleep(r18)     // Catch: java.lang.Exception -> La4
        La4:
            int r8 = r8 + 1
            goto L1e
        La8:
            r10 = r17
            int r5 = r5 + 1
            goto L7
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.up.v(java.lang.String[], android.view.accessibility.AccessibilityNodeInfo, android.accessibilityservice.AccessibilityService, long, boolean):void");
    }

    public final void z(android.accessibilityservice.AccessibilityService accessibilityService, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.wv.w(accessibilityService, "service");
        a.wv.w(accessibilityEvent, "event");
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.s("is_auto_install", false) && accessibilityEvent.getSource() != null) {
            try {
                android.view.accessibility.AccessibilityNodeInfo source = accessibilityEvent.getSource();
                a.wv.s(source);
                android.view.accessibility.AccessibilityNodeInfo root = source.getWindow().getRoot();
                java.lang.String[] strArr = this.b;
                a.wv.v(root, "view");
                w(this, strArr, root, accessibilityService, 0L, 24);
                for (java.lang.String str : this.c) {
                    while (true) {
                        java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText = root.findAccessibilityNodeInfosByText(str);
                        if (findAccessibilityNodeInfosByText != null && !findAccessibilityNodeInfosByText.isEmpty()) {
                            java.lang.Thread.sleep(200L);
                        }
                    }
                }
                x(this.d, root);
                w(this, this.e, root, accessibilityService, 200L, 16);
                v(this.f, root, accessibilityService, 200L, true);
                for (java.lang.String str2 : this.g) {
                    while (true) {
                        java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText2 = root.findAccessibilityNodeInfosByText(str2);
                        if (findAccessibilityNodeInfosByText2 != null && !findAccessibilityNodeInfosByText2.isEmpty()) {
                            java.lang.Thread.sleep(200L);
                        }
                    }
                }
                w(this, this.h, root, accessibilityService, 0L, 24);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
