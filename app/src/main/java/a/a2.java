package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a2 extends a.gk0 implements a.r31 {
    public static final /* synthetic */ int d0 = 0;
    public java.util.ArrayList W;
    public a.b81 X;
    public com.omarea.krscript.model.KrScriptActionHandler Y;
    public com.omarea.krscript.model.AutoRunTask Z;
    public a.pl1 a0;
    public a.ew0 b0;
    public boolean c0;

    /* JADX WARN: Type inference failed for: r5v4, types: [a.mm, java.lang.Object] */
    @Override // a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        java.lang.String key;
        a.wv.w(view, "view");
        this.X = new a.b81(K(), null);
        this.b0 = new a.ew0(L(), true, new com.omarea.krscript.model.GroupNode(""));
        if (this.W != null) {
            android.content.Context L = L();
            java.util.ArrayList arrayList = this.W;
            a.wv.s(arrayList);
            a.ew0 ew0Var = this.b0;
            if (ew0Var == null) {
                a.wv.M1("rootGroup");
                throw null;
            }
            mm obj = (ng1) new a.mm();
            obj.f356a = L;
            obj.b = (CharSequence) arrayList;
            obj.c = (String) this;
            obj.d = ew0Var;
            obj.e = new a.s31((mm) obj);
            obj.f = new a.s31((mm) obj);
            obj.h(ew0Var, arrayList);
            a.ew0 ew0Var2 = this.b0;
            if (ew0Var2 == null) {
                a.wv.M1("rootGroup");
                throw null;
            }
            android.view.View view2 = ew0Var2.c;
            a.wv.v(view2, "layout");
            android.view.View view3 = this.H;
            android.widget.ScrollView scrollView = view3 != null ? (android.widget.ScrollView) view3.findViewById(2131362677) : null;
            if (scrollView != null) {
                scrollView.removeAllViews();
            }
            if (scrollView != null) {
                scrollView.addView(view2);
            }
            com.omarea.krscript.model.AutoRunTask autoRunTask = this.Z;
            if (autoRunTask == null || (key = autoRunTask.getKey()) == null || key.length() == 0) {
                return;
            }
            a.ew0 ew0Var3 = this.b0;
            if (ew0Var3 == null) {
                a.wv.M1("rootGroup");
                throw null;
            }
            java.lang.String key2 = autoRunTask.getKey();
            a.wv.s(key2);
            autoRunTask.onCompleted(java.lang.Boolean.valueOf(ew0Var3.e(key2)));
        }
    }

    public final void S(final com.omarea.krscript.model.ActionNode actionNode, final java.lang.Runnable runnable) {
        final java.lang.String setState = actionNode.getSetState();
        if (setState == null) {
            return;
        }
        if (actionNode.getParams() != null) {
            final java.util.ArrayList<com.omarea.krscript.model.ActionParamInfo> params = actionNode.getParams();
            a.wv.s(params);
            if (!params.isEmpty()) {
                android.view.View inflate = android.view.LayoutInflater.from(L()).inflate(2131558604, (android.view.ViewGroup) null);
                a.wv.t(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                final android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                final android.os.Handler handler = new android.os.Handler();
                a.b81 b81Var = this.X;
                if (b81Var == null) {
                    a.wv.M1("progressBarDialog");
                    throw null;
                }
                java.lang.String string = L().getString(2131953081);
                a.wv.v(string, "requireContext().getString(R.string.onloading)");
                b81Var.b(string);
                new a.p1(new java.lang.Runnable()).start();
                return;
            }
        }
        T(actionNode, setState, runnable, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.r1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [a.r1] */
    public final void T(final com.omarea.krscript.model.RunnableNode runnableNode, java.lang.String str, java.lang.Runnable runnable, java.util.HashMap hashMap) {
        android.content.Context L = L();
        java.lang.String shell = runnableNode.getShell();
        com.omarea.krscript.model.RunnableNode.Companion companion = com.omarea.krscript.model.RunnableNode.Companion;
        final int i = 0;
        if (a.wv.e(shell, companion.getShellModeBgTask())) {
            a.pr.c.U(L, str, hashMap, runnableNode, runnable, new a.r1(this));
            return;
        }
        boolean e = a.wv.e(runnableNode.getShell(), companion.getShellModeHidden());
        final int i2 = 1;
        if (e) {
            if (this.c0) {
                android.widget.Toast.makeText(L, m(2131952676), 0).show();
                return;
            }
            this.c0 = true;
            a.b81 b81Var = this.X;
            if (b81Var == null) {
                a.wv.M1("progressBarDialog");
                throw null;
            }
            a.b81.c(b81Var);
            a.mr0.c.U(L, str, hashMap, runnableNode, runnable, new a.r1(this));
            return;
        }
        final int i3 = 2;
        java.lang.Runnable runnable2 = new a.r1(this);
        a.pl1 pl1Var = this.a0;
        boolean z = pl1Var != null && pl1Var.f442a;
        a.l70.A0.getClass();
        a.l70 l = a.fs1.l(runnableNode, runnable, runnable2, str, hashMap, z);
        l.U(false);
        a.am0 am0Var = this.u;
        a.wv.s(am0Var);
        l.V(am0Var, "");
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [a.ng1, java.lang.Object] */
    public final java.util.ArrayList U(com.omarea.krscript.model.ActionParamInfo actionParamInfo, com.omarea.krscript.model.RunnableNode runnableNode) {
        java.lang.String V;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (actionParamInfo.getOptionsSh().length() == 0) {
            V = "";
        } else {
            V = a.wv.V(L(), actionParamInfo.getOptionsSh(), runnableNode);
            a.wv.v(V, "executeResultRoot(requir…hellScript, nodeInfoBase)");
        }
        if (a.wv.e(V, "error") || a.wv.e(V, "null") || V.length() == 0) {
            if (actionParamInfo.getOptions() == null) {
                return null;
            }
            java.util.ArrayList<a.ng1> options = actionParamInfo.getOptions();
            a.wv.s(options);
            java.util.Iterator<a.ng1> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\n");
            a.wv.v(compile, "compile(pattern)");
            a.yi1.w2(0);
            java.util.regex.Matcher matcher = compile.matcher(V);
            if (matcher.find()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(10);
                int i = 0;
                do {
                    arrayList2.add(V.subSequence(i, matcher.start()).toString());
                    i = matcher.end();
                } while (matcher.find());
                arrayList2.add(V.subSequence(i, V.length()).toString());
                list = arrayList2;
            } else {
                list = a.b20.y0(V.toString());
            }
            boolean isEmpty = list.isEmpty();
            a.qb0 qb0Var = a.qb0.c;
            if (!isEmpty) {
                java.util.ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((java.lang.String) listIterator.previous()).length() != 0) {
                        list2 = a.qv.t2(list, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list2 = qb0Var;
            for (java.lang.String str : (java.lang.String[]) list2.toArray(new java.lang.String[0])) {
                if (a.yi1.g2(str, "|")) {
                    java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\\|");
                    a.wv.v(compile2, "compile(pattern)");
                    a.yi1.w2(0);
                    java.util.regex.Matcher matcher2 = compile2.matcher(str);
                    if (matcher2.find()) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(10);
                        int i2 = 0;
                        do {
                            arrayList3.add(str.subSequence(i2, matcher2.start()).toString());
                            i2 = matcher2.end();
                        } while (matcher2.find());
                        arrayList3.add(str.subSequence(i2, str.length()).toString());
                        list3 = arrayList3;
                    } else {
                        list3 = a.b20.y0(str.toString());
                    }
                    if (!list3.isEmpty()) {
                        java.util.ListIterator listIterator2 = list3.listIterator(list3.size());
                        while (listIterator2.hasPrevious()) {
                            if (((java.lang.String) listIterator2.previous()).length() != 0) {
                                list4 = a.qv.t2(list3, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list4 = qb0Var;
                    java.lang.String[] strArr = (java.lang.String[]) list4.toArray(new java.lang.String[0]);
                    ng1 obj = new ng1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    java.lang.String str2 = strArr[0];
                    obj.f381a = strArr.length > 0 ? strArr[1] : str2;
                    obj.c = str2;
                    arrayList.add(obj);
                } else {
                    ng1 obj2 = new ng1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    obj2.f381a = str;
                    obj2.c = str;
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fa, code lost:
    
        if (a.wv.e(r10, "0") == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean V(com.omarea.krscript.model.ClickableNode r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a2.V(com.omarea.krscript.model.ClickableNode):boolean");
    }

    public final void W(com.omarea.krscript.model.PickerNode pickerNode, java.lang.Runnable runnable) {
        com.omarea.krscript.model.ActionParamInfo actionParamInfo = new com.omarea.krscript.model.ActionParamInfo();
        actionParamInfo.setOptions(pickerNode.getOptions());
        actionParamInfo.setOptionsSh(pickerNode.getOptionsSh());
        actionParamInfo.setSeparator(pickerNode.getSeparator());
        android.os.Handler handler = new android.os.Handler();
        a.b81 b81Var = this.X;
        if (b81Var == null) {
            a.wv.M1("progressBarDialog");
            throw null;
        }
        java.lang.String m = m(2131952714);
        a.wv.v(m, "getString(R.string.kr_param_options_load)");
        b81Var.b(m);
        new java.lang.Thread(new a.q1(pickerNode, actionParamInfo, this, handler, runnable, 0)).start();
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        return layoutInflater.inflate(2131558584, viewGroup, false);
    }
}
