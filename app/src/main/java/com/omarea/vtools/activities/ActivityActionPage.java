package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityActionPage extends a.p5 {
    public static final /* synthetic */ a.gu0[] o;
    public boolean f;
    public com.omarea.krscript.model.PageNode h;
    public a.j41 k;
    public java.util.ArrayList n;
    public final a.yq1 d = a.b20.i(this, 2131361932);
    public final a.b81 e = new a.b81(this, null);
    public final android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());
    public java.lang.String i = "";
    public final a.f3 j = new a.f3(this);
    public final int l = 65400;
    public final int m = 65300;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityActionPage.class, "action_page_fab", "getAction_page_fab()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;");
        a.na1.f375a.getClass();
        o = new a.gu0[]{d81Var};
    }

    public static final void o(com.omarea.vtools.activities.ActivityActionPage activityActionPage, java.lang.String str) {
        activityActionPage.g.post(new a.so(activityActionPage, 10, str));
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.lang.String str;
        if (i == this.l) {
            android.net.Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            a.j41 j41Var = this.k;
            if (j41Var != null) {
                if (data != null) {
                    try {
                        str = a.fs1.B(this, data);
                    } catch (java.lang.Exception unused) {
                        str = null;
                    }
                    a.j41 j41Var2 = this.k;
                    if (j41Var2 != null) {
                        j41Var2.a(str);
                    }
                } else {
                    j41Var.a(null);
                }
            }
            this.k = null;
        } else if (i == this.m) {
            java.lang.String stringExtra = (intent == null || i2 != -1) ? null : intent.getStringExtra("file");
            a.j41 j41Var3 = this.k;
            if (j41Var3 != null) {
                j41Var3.a(stringExtra);
            }
            this.k = null;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        com.omarea.krscript.model.PageNode pageNode;
        java.lang.String str;
        super.onCreate(bundle);
        setContentView(2131558428);
        setBackArrow();
        android.content.Intent intent = getIntent();
        if (intent.getExtras() != null && (extras = intent.getExtras()) != null && (extras.containsKey("page") || extras.containsKey("shortcutId"))) {
            if (extras.containsKey("page")) {
                pageNode = (com.omarea.krscript.model.PageNode) extras.getSerializable("page");
            } else {
                java.lang.String str2 = extras.getString("shortcutId");
                a.wv.w(str2, "shortcutId");
                pageNode = (com.omarea.krscript.model.PageNode) new a.w21(this, 0).c(str2);
            }
            if (pageNode != null) {
                if (extras.containsKey("autoRunItemId")) {
                    str = extras.getString("autoRunItemId");
                } else {
                    str = "";
                }
                this.i = str;
                if (pageNode.getActivity().length() > 0 && new a.w21(this, pageNode.getActivity()).j()) {
                    finish();
                    return;
                }
                if (pageNode.getOnlineHtmlPage().length() > 0) {
                    try {
                        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActionPageOnline.class);
                        intent2.addFlags(268435456);
                        intent2.putExtra("config", pageNode.getOnlineHtmlPage());
                        startActivity(intent2);
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (pageNode.getTitle().length() > 0) {
                    setTitle(pageNode.getTitle());
                }
                this.h = pageNode;
            } else {
                android.widget.Toast.makeText(this, "页面信息无效", 0).show();
                finish();
            }
        }
        com.omarea.krscript.model.PageNode pageNode2 = this.h;
        if (pageNode2 == null) {
            a.wv.M1("currentPageConfig");
            throw null;
        }
        if (pageNode2.getPageConfigPath().length() == 0) {
            com.omarea.krscript.model.PageNode pageNode3 = this.h;
            if (pageNode3 == null) {
                a.wv.M1("currentPageConfig");
                throw null;
            }
            if (pageNode3.getPageConfigSh().length() == 0) {
                setResult(2);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        if (this.n == null) {
            android.content.Context applicationContext = getApplicationContext();
            a.wv.v(applicationContext, "applicationContext");
            com.omarea.krscript.model.PageNode pageNode = this.h;
            java.util.ArrayList<com.omarea.krscript.model.PageMenuOption> arrayList = null;
            if (pageNode == null) {
                a.wv.M1("currentPageConfig");
                throw null;
            }
            if (pageNode.getPageMenuOptionsSh().length() > 0) {
                java.lang.String V = a.wv.V(applicationContext, pageNode.getPageMenuOptionsSh(), pageNode);
                if (!a.wv.e(V, "error")) {
                    a.wv.v(V, "result");
                    for (java.lang.String str : (Iterable<java.lang.String>) a.yi1.y2(V, new java.lang.String[]{"\n"})) {
                        com.omarea.krscript.model.PageMenuOption pageMenuOption = new com.omarea.krscript.model.PageMenuOption(pageNode.getPageConfigPath());
                        if (a.yi1.g2(str, "|")) {
                            java.util.List y2 = a.yi1.y2(str, new java.lang.String[]{"|"});
                            pageMenuOption.setKey((java.lang.String) y2.get(0));
                            pageMenuOption.setTitle((java.lang.String) y2.get(1));
                        } else {
                            pageMenuOption.setKey(str);
                            pageMenuOption.setTitle(str);
                        }
                    }
                }
            } else if (pageNode.getPageMenuOptions() != null) {
                arrayList = pageNode.getPageMenuOptions();
            }
            this.n = arrayList;
        }
        java.util.ArrayList arrayList2 = this.n;
        if (arrayList2 != null && menu != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                java.util.ArrayList arrayList3 = this.n;
                a.wv.s(arrayList3);
                java.lang.Object obj = arrayList3.get(i);
                a.wv.v(obj, "menuOptions!![i]");
                com.omarea.krscript.model.PageMenuOption pageMenuOption2 = (com.omarea.krscript.model.PageMenuOption) obj;
                if (pageMenuOption2.isFab()) {
                    com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) this.d.a(o[0]);
                    floatingActionButton.setVisibility(0);
                    floatingActionButton.setOnClickListener(new a.wi(this, 15, pageMenuOption2));
                    if (a.wv.e(pageMenuOption2.getType(), "file") && pageMenuOption2.getIconPath().length() == 0) {
                        floatingActionButton.setImageDrawable(getDrawable(2131231092));
                    } else if (pageMenuOption2.getIconPath().length() > 0) {
                        android.content.Context context = floatingActionButton.getContext();
                        a.wv.v(context, "context");
                        android.graphics.drawable.Drawable I = a.fs1.I(context, pageMenuOption2, false);
                        if (I != null) {
                            floatingActionButton.setImageDrawable(I);
                        } else {
                            floatingActionButton.setImageDrawable(getDrawable(2131231091));
                        }
                    } else {
                        floatingActionButton.setImageDrawable(getDrawable(2131231091));
                    }
                } else {
                    menu.add(-1, i, i, pageMenuOption2.getTitle());
                }
            }
        }
        return true;
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        if (isTaskRoot()) {
            a.p5.excludeFromRecent$default(this, false, 1, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        a.wv.w(menuItem, "item");
        java.util.ArrayList arrayList = this.n;
        if (arrayList == null) {
            return false;
        }
        a.wv.s(arrayList);
        java.lang.Object obj = arrayList.get(menuItem.getItemId());
        a.wv.v(obj, "menuOptions!![item.itemId]");
        r((com.omarea.krscript.model.PageMenuOption) obj);
        return true;
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f) {
            return;
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.i3(this, this, null), 3);
    }

    public final boolean p(a.j41 j41Var) {
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 2);
            android.widget.Toast.makeText(this, getString(2131952777), 1).show();
            return false;
        }
        try {
            int d = j41Var.d();
            int i = this.m;
            if (d == 1) {
                com.omarea.vtools.activities.ActivityFileSelector.m.getClass();
                startActivityForResult(a.fa0.j(this, null), i);
            } else {
                java.lang.String c = j41Var.c();
                if (c != null && c.length() != 0) {
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
                    intent.putExtra("extension", c);
                    com.omarea.vtools.activities.ActivityFileSelector.m.getClass();
                    intent.putExtra("mode", 0);
                    startActivityForResult(intent, i);
                }
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.GET_CONTENT");
                java.lang.String b = j41Var.b();
                if (b != null) {
                    intent2.setType(b);
                } else {
                    intent2.setType("*/*");
                }
                intent2.addCategory("android.intent.category.OPENABLE");
                startActivityForResult(intent2, this.l);
            }
            this.k = j41Var;
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final void q(com.omarea.krscript.model.PageMenuOption pageMenuOption, java.util.HashMap hashMap) {
        a.so soVar = new a.so(pageMenuOption, 11, this);
        boolean z = getThemeMode().f442a;
        a.fs1 fs1Var = a.l70.A0;
        a.hs hsVar = new a.hs(4);
        com.omarea.krscript.model.PageNode pageNode = this.h;
        if (pageNode == null) {
            a.wv.M1("currentPageConfig");
            throw null;
        }
        java.lang.String pageHandlerSh = pageNode.getPageHandlerSh();
        fs1Var.getClass();
        a.l70 l = a.fs1.l(pageMenuOption, hsVar, soVar, pageHandlerSh, hashMap, z);
        l.V(getSupportFragmentManager(), "");
        l.U(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r0.equals("exit") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r0.equals("reload") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r0.equals("finish") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.equals("refresh") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        recreate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.equals("close") == false) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(com.omarea.krscript.model.PageMenuOption r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getType()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1274442605: goto L46;
                case -934641255: goto L39;
                case 3127582: goto L30;
                case 3143036: goto L1e;
                case 94756344: goto L15;
                case 1085444827: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4e
        Lc:
            java.lang.String r1 = "refresh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L4e
        L15:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
            goto L4e
        L1e:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L4e
        L27:
            a.ss1 r0 = new a.ss1
            r0.<init>(r4, r3)
            r3.p(r0)
            goto L6c
        L30:
            java.lang.String r1 = "exit"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
            goto L4e
        L39:
            java.lang.String r1 = "reload"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L4e
        L42:
            r3.recreate()
            goto L6c
        L46:
            java.lang.String r1 = "finish"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
        L4e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "state"
            java.lang.String r2 = r4.getKey()
            r0.put(r1, r2)
            java.lang.String r1 = "menu_id"
            java.lang.String r2 = r4.getKey()
            r0.put(r1, r2)
            r3.q(r4, r0)
            goto L6c
        L69:
            r3.finish()
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityActionPage.r(com.omarea.krscript.model.PageMenuOption):void");
    }
}
