package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q31 {

    public q31() {
        this(null, null, null);
    }

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f461a;
    public java.lang.String b;
    public a.ob1 c;
    public java.lang.String d;
    public java.io.InputStream e;
    public java.lang.String f;
    public java.util.ArrayList g;
    public com.omarea.krscript.model.ActionParamInfo h;
    public com.omarea.krscript.model.NodeInfoBase i;

    public q31(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        a.wv.w(activity, "context");
        a.wv.w(str, "pageConfig");
        this.d = "";
        this.f = "";
        this.f461a = activity;
        this.b = str;
        this.f = str2 == null ? "" : str2;
        this.c = new a.ob1(activity);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    public static void f(com.omarea.krscript.model.PageNode pageNode, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                switch (attributeName.hashCode()) {
                    case -1655966961:
                        if (!attributeName.equals("activity")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setActivity(attributeValue);
                        break;
                    case -1354792126:
                        if (attributeName.equals("config")) {
                            a.wv.v(attributeValue, "attrValue");
                            pageNode.setPageConfigPath(attributeValue);
                            break;
                        } else {
                            break;
                        }
                    case -1317542303:
                        if (!attributeName.equals("load-error")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setLoadFail(attributeValue);
                        break;
                    case -1183762788:
                        if (!attributeName.equals("intent")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setActivity(attributeValue);
                        break;
                    case -1141277068:
                        if (!attributeName.equals("before-load")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setBeforeRead(attributeValue);
                        break;
                    case -1141107932:
                        if (!attributeName.equals("before-read")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setBeforeRead(attributeValue);
                        break;
                    case -907685685:
                        if (!attributeName.equals("script")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageHandlerSh(attributeValue);
                        break;
                    case -804498240:
                        if (attributeName.equals("config-sh")) {
                            a.wv.v(attributeValue, "attrValue");
                            pageNode.setPageConfigSh(attributeValue);
                            break;
                        } else {
                            break;
                        }
                    case 97:
                        if (!attributeName.equals("a")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setActivity(attributeValue);
                        break;
                    case 113762:
                        if (!attributeName.equals("set")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageHandlerSh(attributeValue);
                        break;
                    case 3211051:
                        if (!attributeName.equals("href")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setLink(attributeValue);
                        break;
                    case 3213227:
                        if (attributeName.equals("html")) {
                            a.wv.v(attributeValue, "attrValue");
                            pageNode.setOnlineHtmlPage(attributeValue);
                            break;
                        } else {
                            break;
                        }
                    case 3321850:
                        if (!attributeName.equals("link")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setLink(attributeValue);
                        break;
                    case 336592931:
                        if (!attributeName.equals("load-ok")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setLoadSuccess(attributeValue);
                        break;
                    case 469017116:
                        if (!attributeName.equals("load-success")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setLoadSuccess(attributeValue);
                        break;
                    case 692803402:
                        if (!attributeName.equals("handler")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageHandlerSh(attributeValue);
                        break;
                    case 1342985125:
                        if (!attributeName.equals("load-fail")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setLoadFail(attributeValue);
                        break;
                    case 1374438372:
                        if (!attributeName.equals("options-sh")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageMenuOptionsSh(attributeValue);
                        break;
                    case 1496001079:
                        if (!attributeName.equals("after-load")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setAfterRead(attributeValue);
                        break;
                    case 1496170215:
                        if (!attributeName.equals("after-read")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setAfterRead(attributeValue);
                        break;
                    case 1845386925:
                        if (!attributeName.equals("option-sh")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageMenuOptionsSh(attributeValue);
                        break;
                    case 1845386938:
                        if (!attributeName.equals("option-su")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageMenuOptionsSh(attributeValue);
                        break;
                    case 1988338616:
                        if (!attributeName.equals("handler-sh")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageHandlerSh(attributeValue);
                        break;
                    case 1995135739:
                        if (!attributeName.equals("getstate")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        pageNode.setPageHandlerSh(attributeValue);
                        break;
                }
            }
        }
    }

    public static void g(com.omarea.krscript.model.PickerNode pickerNode, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                switch (attributeName.hashCode()) {
                    case 653829648:
                        if (!attributeName.equals("multiple")) {
                            break;
                        } else {
                            pickerNode.setMultiple(a.wv.e(attributeValue, "multiple") || a.wv.e(attributeValue, "true") || a.wv.e(attributeValue, "1"));
                            continue;
                        }
                    case 1374438372:
                        if (!attributeName.equals("options-sh")) {
                            break;
                        }
                        break;
                    case 1374438385:
                        if (!attributeName.equals("options-su")) {
                            break;
                        }
                        break;
                    case 1732829925:
                        if (!attributeName.equals("separator")) {
                            break;
                        } else {
                            a.wv.v(attributeValue, "attrValue");
                            pickerNode.setSeparator(attributeValue);
                            continue;
                        }
                    case 1845386925:
                        if (!attributeName.equals("option-sh")) {
                            break;
                        }
                        break;
                }
                if (pickerNode.getOptions() == null) {
                    pickerNode.setOptions(new java.util.ArrayList<>());
                }
                a.wv.v(attributeValue, "attrValue");
                pickerNode.setOptionsSh(attributeValue);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.omarea.krscript.model.ClickableNode a(com.omarea.krscript.model.ClickableNode r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q31.a(com.omarea.krscript.model.ClickableNode, org.xmlpull.v1.XmlPullParser):com.omarea.krscript.model.ClickableNode");
    }

    public final void b(com.omarea.krscript.model.NodeInfoBase nodeInfoBase, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                int hashCode = attributeName.hashCode();
                if (hashCode == 3669) {
                    if (!attributeName.equals("sh")) {
                    }
                    a.wv.v(attributeValue, "attrValue");
                    nodeInfoBase.setDescSh(attributeValue);
                    nodeInfoBase.setDesc(c(this.f461a, nodeInfoBase.getDescSh()));
                } else if (hashCode == 3682) {
                    if (!attributeName.equals("su")) {
                    }
                    a.wv.v(attributeValue, "attrValue");
                    nodeInfoBase.setDescSh(attributeValue);
                    nodeInfoBase.setDesc(c(this.f461a, nodeInfoBase.getDescSh()));
                } else if (hashCode == 1556800273) {
                    if (!attributeName.equals("desc-sh")) {
                    }
                    a.wv.v(attributeValue, "attrValue");
                    nodeInfoBase.setDescSh(attributeValue);
                    nodeInfoBase.setDesc(c(this.f461a, nodeInfoBase.getDescSh()));
                }
            }
        }
        if (nodeInfoBase.getDesc().length() == 0) {
            java.lang.String nextText = xmlPullParser.nextText();
            a.wv.v(nextText, "parser.nextText()");
            nodeInfoBase.setDesc(nextText);
        }
    }

    public final java.lang.String c(android.content.Context context, java.lang.String str) {
        if (this.i == null) {
            this.i = new com.omarea.krscript.model.NodeInfoBase(this.d);
        }
        java.lang.String V = a.wv.V(context, str, this.i);
        a.wv.v(V, "executeResultRoot(contex…criptIn, virtualRootNode)");
        return V;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
    public final com.omarea.krscript.model.GroupNode d(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        com.omarea.krscript.model.GroupNode groupNode = new com.omarea.krscript.model.GroupNode(this.d);
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                switch (attributeName.hashCode()) {
                    case -1854767153:
                        if (!attributeName.equals("support")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        groupNode.setSupported(a.wv.e(c(this.f461a, attributeValue), "1"));
                        break;
                    case 3355:
                        if (!attributeName.equals("id")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        groupNode.setKey(a.yi1.F2(attributeValue).toString());
                        break;
                    case 106079:
                        if (!attributeName.equals("key")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        groupNode.setKey(a.yi1.F2(attributeValue).toString());
                        break;
                    case 96955127:
                        if (attributeName.equals("exist")) {
                            a.wv.v(attributeValue, "attrValue");
                            boolean z = true;
                            if (!new java.io.File(attributeValue).exists()) {
                                a.q10 q10Var = a.q10.f457a;
                                java.lang.String L = a.q10.L("path-basic-info", attributeValue, 10000L);
                                if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                                    z = false;
                                }
                            }
                            groupNode.setSupported(z);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 100346066:
                        if (!attributeName.equals("index")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        groupNode.setKey(a.yi1.F2(attributeValue).toString());
                        break;
                    case 110371416:
                        if (attributeName.equals("title")) {
                            a.wv.v(attributeValue, "attrValue");
                            groupNode.setTitle(attributeValue);
                            break;
                        } else {
                            break;
                        }
                    case 466743410:
                        if (!attributeName.equals("visible")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        groupNode.setSupported(a.wv.e(c(this.f461a, attributeValue), "1"));
                        break;
                    case 1943837072:
                        if (!attributeName.equals("visible-sh")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        groupNode.setSupported(a.wv.e(c(this.f461a, attributeValue), "1"));
                        break;
                }
            }
        }
        return groupNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x011c, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.omarea.krscript.model.NodeInfoBase e(com.omarea.krscript.model.NodeInfoBase r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q31.e(com.omarea.krscript.model.NodeInfoBase, org.xmlpull.v1.XmlPullParser):com.omarea.krscript.model.NodeInfoBase");
    }

    public final java.util.ArrayList h() {
        java.io.InputStream inputStream = this.e;
        if (inputStream != null) {
            a.wv.s(inputStream);
            return i(inputStream);
        }
        try {
            a.ej1 ej1Var = new a.ej1(9, this.f461a, this.f);
            java.io.InputStream t = ej1Var.t(this.b);
            if (t == null) {
                return new java.util.ArrayList();
            }
            this.d = (java.lang.String) ej1Var.f;
            return i(t);
        } catch (java.lang.Exception e) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.p31(this, e, 0));
            android.util.Log.e("KrConfig Fail！", e.getMessage());
            return null;
        }
    }

    public final java.util.ArrayList i(java.io.InputStream inputStream) {
        int i;
        java.lang.String str;
        int i2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.omarea.krscript.model.TextNode textNode;
        a.ob1 ob1Var = this.c;
        if (ob1Var == null) {
            a.wv.M1("resourceStringResolver");
            throw null;
        }
        org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
        newPullParser.setInput(inputStream, "utf-8");
        int eventType = newPullParser.getEventType();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        a.wv.v(newSerializer, "newSerializer()");
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
        while (true) {
            str = "";
            i2 = 2;
            str2 = "text";
            if (eventType == 1) {
                break;
            }
            if (eventType == 2) {
                newSerializer.startTag("", newPullParser.getName());
                int attributeCount = newPullParser.getAttributeCount();
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    java.lang.String attributeName = newPullParser.getAttributeName(i3);
                    java.lang.String attributeValue = newPullParser.getAttributeValue(i3);
                    java.lang.String attributeNamespace = newPullParser.getAttributeNamespace(i3);
                    a.wv.v(attributeValue, "attrValue");
                    newSerializer.attribute(attributeNamespace, attributeName, ob1Var.a(attributeValue, false));
                }
            } else if (eventType == 3) {
                newSerializer.endTag("", newPullParser.getName());
            } else if (eventType == 4) {
                java.lang.String text = newPullParser.getText();
                a.wv.v(text, "text");
                newSerializer.text(ob1Var.a(text, false));
            }
            eventType = newPullParser.next();
        }
        newSerializer.endDocument();
        java.lang.String stringWriter2 = stringWriter.toString();
        a.wv.v(stringWriter2, "writer.toString()");
        byte[] bytes = stringWriter2.getBytes(a.bu.f53a);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        try {
            org.xmlpull.v1.XmlPullParser newPullParser2 = android.util.Xml.newPullParser();
            newPullParser2.setInput(byteArrayInputStream, "utf-8");
            int eventType2 = newPullParser2.getEventType();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z = true;
            com.omarea.krscript.model.GroupNode groupNode = null;
            com.omarea.krscript.model.PageNode pageNode = null;
            com.omarea.krscript.model.PickerNode pickerNode = null;
            com.omarea.krscript.model.ActionNode actionNode = null;
            com.omarea.krscript.model.SwitchNode switchNode = null;
            com.omarea.krscript.model.TextNode textNode2 = null;
            for (i = 1; eventType2 != i; i = 1) {
                boolean z2 = z;
                java.lang.String str5 = str2;
                if (eventType2 != i2) {
                    if (eventType2 != 3) {
                        textNode = textNode2;
                        str3 = str5;
                    } else {
                        if (a.wv.e("group", newPullParser2.getName())) {
                            if (groupNode != null && groupNode.getSupported()) {
                                arrayList.add(groupNode);
                            }
                            textNode = textNode2;
                            z = z2;
                            str3 = str5;
                            groupNode = null;
                        } else if (groupNode == null) {
                            textNode = textNode2;
                            str3 = str5;
                            if (a.wv.e("page", newPullParser2.getName())) {
                                if (pageNode != null) {
                                    arrayList.add(pageNode);
                                }
                                str4 = str;
                                z = z2;
                                pageNode = null;
                            } else if (a.wv.e("action", newPullParser2.getName())) {
                                if (actionNode != null) {
                                    if (actionNode.getSetState() == null) {
                                        actionNode.setSetState(str);
                                    }
                                    actionNode.setParams(this.g);
                                    this.g = null;
                                }
                                if (actionNode != null) {
                                    arrayList.add(actionNode);
                                }
                                str4 = str;
                                z = z2;
                                actionNode = null;
                            } else if (a.wv.e("switch", newPullParser2.getName())) {
                                n(switchNode);
                                if (switchNode != null) {
                                    arrayList.add(switchNode);
                                }
                                str4 = str;
                                z = z2;
                                switchNode = null;
                            } else if (a.wv.e("picker", newPullParser2.getName())) {
                                m(pickerNode);
                                if (pickerNode != null) {
                                    arrayList.add(pickerNode);
                                }
                                str4 = str;
                                z = z2;
                                pickerNode = null;
                            } else if (a.wv.e(str3, newPullParser2.getName())) {
                                if (textNode != null) {
                                    arrayList.add(textNode);
                                }
                                str4 = str;
                                z = z2;
                                textNode = null;
                            }
                        } else if (a.wv.e("page", newPullParser2.getName())) {
                            if (pageNode != null) {
                                groupNode.getChildren().add(pageNode);
                            }
                            textNode = textNode2;
                            z = z2;
                            str3 = str5;
                            pageNode = null;
                        } else if (a.wv.e("action", newPullParser2.getName())) {
                            if (actionNode != null) {
                                if (actionNode.getSetState() == null) {
                                    actionNode.setSetState(str);
                                }
                                actionNode.setParams(this.g);
                                this.g = null;
                            }
                            if (actionNode != null) {
                                groupNode.getChildren().add(actionNode);
                            }
                            textNode = textNode2;
                            z = z2;
                            str3 = str5;
                            actionNode = null;
                        } else if (a.wv.e("switch", newPullParser2.getName())) {
                            n(switchNode);
                            if (switchNode != null) {
                                groupNode.getChildren().add(switchNode);
                            }
                            textNode = textNode2;
                            z = z2;
                            str3 = str5;
                            switchNode = null;
                        } else if (a.wv.e("picker", newPullParser2.getName())) {
                            m(pickerNode);
                            if (pickerNode != null) {
                                groupNode.getChildren().add(pickerNode);
                            }
                            textNode = textNode2;
                            z = z2;
                            str3 = str5;
                            pickerNode = null;
                        } else {
                            str3 = str5;
                            textNode = textNode2;
                            if (a.wv.e(str3, newPullParser2.getName())) {
                                if (textNode != null) {
                                    groupNode.getChildren().add(textNode);
                                }
                                str4 = str;
                                z = z2;
                                textNode = null;
                            }
                        }
                        str4 = str;
                    }
                    str4 = str;
                    z = z2;
                } else {
                    com.omarea.krscript.model.TextNode textNode3 = textNode2;
                    str3 = str5;
                    str4 = str;
                    if (a.wv.e("group", newPullParser2.getName())) {
                        if (groupNode != null && groupNode.getSupported()) {
                            arrayList.add(groupNode);
                        }
                        groupNode = d(newPullParser2);
                    } else if (groupNode == null || groupNode.getSupported()) {
                        if (a.wv.e("page", newPullParser2.getName())) {
                            if (!z2 && (pageNode = (com.omarea.krscript.model.PageNode) a(new com.omarea.krscript.model.PageNode(this.d), newPullParser2)) != null) {
                                f(pageNode, newPullParser2);
                            }
                        } else if (a.wv.e("action", newPullParser2.getName())) {
                            actionNode = (com.omarea.krscript.model.ActionNode) k(new com.omarea.krscript.model.ActionNode(this.d), newPullParser2);
                        } else if (a.wv.e("switch", newPullParser2.getName())) {
                            switchNode = (com.omarea.krscript.model.SwitchNode) k(new com.omarea.krscript.model.SwitchNode(this.d), newPullParser2);
                        } else if (a.wv.e("picker", newPullParser2.getName())) {
                            pickerNode = (com.omarea.krscript.model.PickerNode) k(new com.omarea.krscript.model.PickerNode(this.d), newPullParser2);
                            if (pickerNode != null) {
                                g(pickerNode, newPullParser2);
                            }
                        } else if (a.wv.e(str3, newPullParser2.getName())) {
                            textNode3 = (com.omarea.krscript.model.TextNode) e(new com.omarea.krscript.model.TextNode(this.d), newPullParser2);
                        } else if (pageNode != null) {
                            p(pageNode, newPullParser2);
                        } else if (actionNode != null) {
                            o(actionNode, newPullParser2);
                        } else if (switchNode != null) {
                            r(switchNode, newPullParser2);
                        } else if (pickerNode != null) {
                            q(pickerNode, newPullParser2);
                        } else if (textNode3 != null) {
                            s(textNode3, newPullParser2);
                        } else if (a.wv.e("resource", newPullParser2.getName())) {
                            j(newPullParser2);
                        }
                    }
                    textNode = textNode3;
                    z = false;
                }
                str2 = str3;
                str = str4;
                i2 = 2;
                eventType2 = newPullParser2.next();
                textNode2 = textNode;
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.p31(this, e, 1));
            android.util.Log.e("KrConfig Fail！", e.getMessage());
            return null;
        }
    }

    public final void j(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            boolean e = a.wv.e(attributeName, "file");
            android.content.Context context = this.f461a;
            if (e) {
                a.wv.v(attributeValue, "attrValue");
                new a.vc0(context).a(a.yi1.F2(attributeValue).toString());
            } else if (a.wv.e(attributeName, "dir")) {
                a.wv.v(attributeValue, "attrValue");
                new a.vc0(context).c(a.yi1.F2(attributeValue).toString());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f8, code lost:
    
        if (r6.equals("warn") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x011b, code lost:
    
        if (r5.equals("true") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0140, code lost:
    
        r1.setReloadPage(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0125, code lost:
    
        if (r5.equals("page") != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x012c, code lost:
    
        if (r5.equals("1") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0134, code lost:
    
        if (r5.equals("reload-page") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x013c, code lost:
    
        if (r5.equals("reload") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0149, code lost:
    
        if (r6.equals("bg-task") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r6.equals("background-task") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007f, code lost:
    
        if (r6.equals("warning") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fc, code lost:
    
        a.wv.v(r5, "attrValue");
        r1.setWarning(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ab, code lost:
    
        if (r6.equals("interruptible") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b5, code lost:
    
        a.wv.v(r5, "attrValue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bc, code lost:
    
        if (r5.length() != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c3, code lost:
    
        if (a.wv.e(r5, "interruptable") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c9, code lost:
    
        if (a.wv.e(r5, "interruptable") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00cf, code lost:
    
        if (a.wv.e(r5, "true") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d5, code lost:
    
        if (a.wv.e(r5, "1") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d8, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00db, code lost:
    
        r1.setInterruptable(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00da, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b2, code lost:
    
        if (r6.equals("interruptable") == false) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x0112. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.omarea.krscript.model.RunnableNode k(com.omarea.krscript.model.RunnableNode r19, org.xmlpull.v1.XmlPullParser r20) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q31.k(com.omarea.krscript.model.RunnableNode, org.xmlpull.v1.XmlPullParser):com.omarea.krscript.model.RunnableNode");
    }

    public final void l(com.omarea.krscript.model.NodeInfoBase nodeInfoBase, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                int hashCode = attributeName.hashCode();
                if (hashCode == -315611684) {
                    if (!attributeName.equals("summary-sh")) {
                    }
                    a.wv.v(attributeValue, "attrValue");
                    nodeInfoBase.setSummarySh(attributeValue);
                    nodeInfoBase.setSummary(c(this.f461a, nodeInfoBase.getSummarySh()));
                } else if (hashCode == 3669) {
                    if (!attributeName.equals("sh")) {
                    }
                    a.wv.v(attributeValue, "attrValue");
                    nodeInfoBase.setSummarySh(attributeValue);
                    nodeInfoBase.setSummary(c(this.f461a, nodeInfoBase.getSummarySh()));
                } else if (hashCode == 3682) {
                    if (!attributeName.equals("su")) {
                    }
                    a.wv.v(attributeValue, "attrValue");
                    nodeInfoBase.setSummarySh(attributeValue);
                    nodeInfoBase.setSummary(c(this.f461a, nodeInfoBase.getSummarySh()));
                }
            }
        }
        if (nodeInfoBase.getSummary().length() == 0) {
            java.lang.String nextText = xmlPullParser.nextText();
            a.wv.v(nextText, "parser.nextText()");
            nodeInfoBase.setSummary(nextText);
        }
    }

    public final void m(com.omarea.krscript.model.PickerNode pickerNode) {
        if (pickerNode != null) {
            if (pickerNode.getGetState() == null) {
                pickerNode.setGetState("");
            } else {
                pickerNode.setValue(c(this.f461a, pickerNode.getGetState()));
            }
            if (pickerNode.getSetState() == null) {
                pickerNode.setSetState("");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (a.wv.e(r0, "true") != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.omarea.krscript.model.SwitchNode r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L40
            android.content.Context r0 = r2.f461a
            java.lang.String r1 = r3.getGetState()
            java.lang.String r0 = r2.c(r0, r1)
            java.lang.String r1 = "error"
            boolean r1 = a.wv.e(r0, r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "1"
            boolean r1 = a.wv.e(r0, r1)
            if (r1 != 0) goto L2f
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            a.wv.v(r0, r1)
            java.lang.String r1 = "true"
            boolean r0 = a.wv.e(r0, r1)
            if (r0 == 0) goto L31
        L2f:
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            r3.setChecked(r0)
            java.lang.String r0 = r3.getSetState()
            if (r0 != 0) goto L40
            java.lang.String r0 = ""
            r3.setSetState(r0)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q31.n(com.omarea.krscript.model.SwitchNode):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03de, code lost:
    
        if (r10.equals("value-su") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03ee, code lost:
    
        r1.setValueShell(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03ea, code lost:
    
        if (r10.equals("value-sh") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03fb, code lost:
    
        if (r10.equals("support") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r10.equals("visible-sh") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03ff, code lost:
    
        a.wv.v(r11, "attrValue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x040a, code lost:
    
        if (a.wv.e(c(r13, r11), "1") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x040c, code lost:
    
        r1.setSupported(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        if (r10.equals("option-sh") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012a, code lost:
    
        if (r1.getOptions() != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        r1.setOptions(new java.util.ArrayList<>());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        a.wv.v(r11, "script");
        r1.setOptionsSh(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        if (r10.equals("options-su") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0123, code lost:
    
        if (r10.equals("options-sh") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        if (r10.equals("visible") == false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00c3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0393  */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.ng1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.omarea.krscript.model.ActionNode r19, org.xmlpull.v1.XmlPullParser r20) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q31.o(com.omarea.krscript.model.ActionNode, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.omarea.krscript.model.PageNode r13, org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q31.p(com.omarea.krscript.model.PageNode, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [a.ng1, java.lang.Object] */
    public final void q(com.omarea.krscript.model.PickerNode pickerNode, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (a.wv.e("title", xmlPullParser.getName())) {
            java.lang.String nextText = xmlPullParser.nextText();
            a.wv.v(nextText, "parser.nextText()");
            pickerNode.setTitle(nextText);
            return;
        }
        if (a.wv.e("desc", xmlPullParser.getName())) {
            b(pickerNode, xmlPullParser);
            return;
        }
        if (a.wv.e("summary", xmlPullParser.getName())) {
            l(pickerNode, xmlPullParser);
            return;
        }
        if (!a.wv.e("option", xmlPullParser.getName())) {
            if (a.wv.e("getstate", xmlPullParser.getName()) || a.wv.e("get", xmlPullParser.getName())) {
                pickerNode.setGetState(xmlPullParser.nextText());
                return;
            }
            if (a.wv.e("setstate", xmlPullParser.getName()) || a.wv.e("set", xmlPullParser.getName())) {
                pickerNode.setSetState(xmlPullParser.nextText());
                return;
            }
            if (a.wv.e("resource", xmlPullParser.getName())) {
                j(xmlPullParser);
                return;
            } else {
                if (a.wv.e("lock", xmlPullParser.getName()) || a.wv.e("lock-state", xmlPullParser.getName())) {
                    java.lang.String nextText2 = xmlPullParser.nextText();
                    a.wv.v(nextText2, "parser.nextText()");
                    pickerNode.setLockShell(nextText2);
                    return;
                }
                return;
            }
        }
        if (pickerNode.getOptions() == null) {
            pickerNode.setOptions(new java.util.ArrayList<>());
        }
        a.ng1 obj = new a.ng1();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            if (a.wv.e(attributeName, "val") || a.wv.e(attributeName, "value")) {
                obj.c = attributeValue;
            }
        }
        java.lang.String nextText3 = xmlPullParser.nextText();
        obj.f381a = nextText3;
        if (obj.c == null) {
            a.wv.s(nextText3);
            obj.c = nextText3.toString();
        }
        java.util.ArrayList<a.ng1> options = pickerNode.getOptions();
        a.wv.s(options);
        options.add(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    public final void r(com.omarea.krscript.model.SwitchNode switchNode, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String name = xmlPullParser.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1857640538:
                    if (name.equals("summary")) {
                        l(switchNode, xmlPullParser);
                        return;
                    }
                    return;
                case -341064690:
                    if (name.equals("resource")) {
                        j(xmlPullParser);
                        return;
                    }
                    return;
                case -196357777:
                    if (!name.equals("lock-state")) {
                        return;
                    }
                    java.lang.String nextText = xmlPullParser.nextText();
                    a.wv.v(nextText, "parser.nextText()");
                    switchNode.setLockShell(nextText);
                    return;
                case 102230:
                    if (!name.equals("get")) {
                        return;
                    }
                    java.lang.String nextText2 = xmlPullParser.nextText();
                    a.wv.v(nextText2, "parser.nextText()");
                    switchNode.setGetState(nextText2);
                    return;
                case 113762:
                    if (!name.equals("set")) {
                        return;
                    }
                    switchNode.setSetState(xmlPullParser.nextText());
                    return;
                case 3079825:
                    if (name.equals("desc")) {
                        b(switchNode, xmlPullParser);
                        return;
                    }
                    return;
                case 3327275:
                    if (!name.equals("lock")) {
                        return;
                    }
                    java.lang.String nextText3 = xmlPullParser.nextText();
                    a.wv.v(nextText3, "parser.nextText()");
                    switchNode.setLockShell(nextText3);
                    return;
                case 110371416:
                    if (name.equals("title")) {
                        java.lang.String nextText4 = xmlPullParser.nextText();
                        a.wv.v(nextText4, "parser.nextText()");
                        switchNode.setTitle(nextText4);
                        return;
                    }
                    return;
                case 1434023279:
                    if (!name.equals("setstate")) {
                        return;
                    }
                    switchNode.setSetState(xmlPullParser.nextText());
                    return;
                case 1995135739:
                    if (!name.equals("getstate")) {
                        return;
                    }
                    java.lang.String nextText22 = xmlPullParser.nextText();
                    a.wv.v(nextText22, "parser.nextText()");
                    switchNode.setGetState(nextText22);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0085. Please report as an issue. */
    public final void s(com.omarea.krscript.model.TextNode textNode, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        boolean z;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        if (a.wv.e("title", xmlPullParser.getName())) {
            java.lang.String nextText = xmlPullParser.nextText();
            a.wv.v(nextText, "parser.nextText()");
            textNode.setTitle(nextText);
        } else if (a.wv.e("desc", xmlPullParser.getName())) {
            b(textNode, xmlPullParser);
        } else if (a.wv.e("summary", xmlPullParser.getName())) {
            l(textNode, xmlPullParser);
        } else if (a.wv.e("slice", xmlPullParser.getName())) {
            com.omarea.krscript.model.TextNode.TextRow textRow = new com.omarea.krscript.model.TextNode.TextRow();
            int attributeCount = xmlPullParser.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                java.lang.String attributeName = xmlPullParser.getAttributeName(i);
                a.wv.v(attributeName, "parser.getAttributeName(i)");
                java.lang.String lowerCase = attributeName.toLowerCase(java.util.Locale.ROOT);
                a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
                try {
                    z = true;
                } catch (java.lang.Exception unused) {
                }
                switch (lowerCase.hashCode()) {
                    case -1655966961:
                        if (!lowerCase.equals("activity")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setActivity$krscript_release_mini(attributeValue);
                        break;
                    case -1332194002:
                        if (!lowerCase.equals("background")) {
                            break;
                        }
                        textRow.setBgColor$krscript_release_mini(android.graphics.Color.parseColor(attributeValue));
                        break;
                    case -1183762788:
                        if (!lowerCase.equals("intent")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setActivity$krscript_release_mini(attributeValue);
                        break;
                    case -1178781136:
                        if (!lowerCase.equals("italic")) {
                            break;
                        }
                        if (!a.wv.e(attributeValue, "1") && !a.wv.e(attributeValue, "true") && !a.wv.e(attributeValue, "italic")) {
                            z = false;
                        }
                        textRow.setItalic$krscript_release_mini(z);
                        break;
                    case -1026963764:
                        if (!lowerCase.equals("underline")) {
                            break;
                        }
                        if (!a.wv.e(attributeValue, "1") && !a.wv.e(attributeValue, "true") && !a.wv.e(attributeValue, "underline")) {
                            z = false;
                        }
                        textRow.setUnderline$krscript_release_mini(z);
                        break;
                    case -907685685:
                        if (!lowerCase.equals("script")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setOnClickScript$krscript_release_mini(attributeValue);
                        break;
                    case -175307202:
                        if (!lowerCase.equals("bgcolor")) {
                            break;
                        }
                        textRow.setBgColor$krscript_release_mini(android.graphics.Color.parseColor(attributeValue));
                        break;
                    case 97:
                        if (!lowerCase.equals("a")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setActivity$krscript_release_mini(attributeValue);
                        break;
                    case 98:
                        if (!lowerCase.equals("b")) {
                            break;
                        }
                        if (!a.wv.e(attributeValue, "1") && !a.wv.e(attributeValue, "true") && !a.wv.e(attributeValue, "bold")) {
                            z = false;
                        }
                        textRow.setBold$krscript_release_mini(z);
                        break;
                    case 105:
                        if (!lowerCase.equals("i")) {
                            break;
                        }
                        if (!a.wv.e(attributeValue, "1")) {
                            z = false;
                            break;
                        }
                        textRow.setItalic$krscript_release_mini(z);
                        break;
                    case 117:
                        if (!lowerCase.equals("u")) {
                            break;
                        }
                        if (!a.wv.e(attributeValue, "1")) {
                            z = false;
                            break;
                        }
                        textRow.setUnderline$krscript_release_mini(z);
                        break;
                    case 3141:
                        if (!lowerCase.equals("bg")) {
                            break;
                        }
                        textRow.setBgColor$krscript_release_mini(android.graphics.Color.parseColor(attributeValue));
                        break;
                    case 3669:
                        if (lowerCase.equals("sh")) {
                            a.wv.v(attributeValue, "attrValue");
                            textRow.setDynamicTextSh$krscript_release_mini(attributeValue);
                            break;
                        } else {
                            break;
                        }
                    case 113291:
                        if (!lowerCase.equals("run")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setOnClickScript$krscript_release_mini(attributeValue);
                        break;
                    case 3029637:
                        if (!lowerCase.equals("bold")) {
                            break;
                        }
                        if (!a.wv.e(attributeValue, "1")) {
                            z = false;
                            break;
                        }
                        textRow.setBold$krscript_release_mini(z);
                        break;
                    case 3211051:
                        if (!lowerCase.equals("href")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setLink$krscript_release_mini(attributeValue);
                        break;
                    case 3321850:
                        if (!lowerCase.equals("link")) {
                            break;
                        }
                        a.wv.v(attributeValue, "attrValue");
                        textRow.setLink$krscript_release_mini(attributeValue);
                        break;
                    case 3530753:
                        if (lowerCase.equals("size")) {
                            a.wv.v(attributeValue, "attrValue");
                            textRow.setSize$krscript_release_mini(java.lang.Integer.parseInt(attributeValue));
                            break;
                        } else {
                            break;
                        }
                    case 92903173:
                        if (lowerCase.equals("align") && attributeValue != null) {
                            switch (attributeValue.hashCode()) {
                                case -1364013995:
                                    if (attributeValue.equals("center")) {
                                        textRow.setAlign$krscript_release_mini(android.text.Layout.Alignment.ALIGN_CENTER);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -1039745817:
                                    if (attributeValue.equals("normal")) {
                                        textRow.setAlign$krscript_release_mini(android.text.Layout.Alignment.ALIGN_NORMAL);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 3317767:
                                    if (attributeValue.equals("left") && android.os.Build.VERSION.SDK_INT >= 28) {
                                        try {
                                            alignment = android.text.Layout.Alignment.valueOf("ALIGN_LEFT");
                                        } catch (java.lang.IllegalArgumentException unused2) {
                                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                        }
                                        textRow.setAlign$krscript_release_mini(alignment);
                                        break;
                                    }
                                    break;
                                case 108511772:
                                    if (attributeValue.equals("right") && android.os.Build.VERSION.SDK_INT >= 28) {
                                        try {
                                            alignment2 = android.text.Layout.Alignment.valueOf("ALIGN_RIGHT");
                                        } catch (java.lang.IllegalArgumentException unused3) {
                                            alignment2 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                        }
                                        textRow.setAlign$krscript_release_mini(alignment2);
                                        break;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            break;
                        }
                        break;
                    case 94001407:
                        if (lowerCase.equals("break")) {
                            if (!a.wv.e(attributeValue, "1") && !a.wv.e(attributeValue, "true") && !a.wv.e(attributeValue, "break")) {
                                z = false;
                            }
                            textRow.setBreakRow$krscript_release_mini(z);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 94842723:
                        if (!lowerCase.equals("color")) {
                            break;
                        }
                        textRow.setColor$krscript_release_mini(android.graphics.Color.parseColor(attributeValue));
                        break;
                    case 1984457027:
                        if (!lowerCase.equals("foreground")) {
                            break;
                        }
                        textRow.setColor$krscript_release_mini(android.graphics.Color.parseColor(attributeValue));
                        break;
                }
            }
            textRow.setText$krscript_release_mini(xmlPullParser.nextText());
            textNode.getRows().add(textRow);
        } else if (a.wv.e("resource", xmlPullParser.getName())) {
            j(xmlPullParser);
        }
    }
}
