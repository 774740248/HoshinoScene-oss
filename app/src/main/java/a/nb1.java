package a;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nb1 {
    public static final a.vj1 d = new a.vj1(a.mb1.e);

    /* renamed from: a, reason: collision with root package name */
    public final a.vj1 f376a = new a.vj1(a.mb1.f);
    public java.util.HashMap b = new java.util.HashMap();
    public java.util.HashMap c = new java.util.HashMap();

    public nb1() {
        d();
    }

    public static boolean a(android.content.res.Resources resources, java.lang.String str) {
        a.b10 b10Var;
        int length;
        int i;
        java.io.StringWriter stringWriter;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3 = "resources";
        a.wv.w(resources, "res");
        a.wv.w(str, "exportPath");
        java.lang.reflect.Field[] declaredFields = a.i81.class.getDeclaredFields();
        java.lang.reflect.Field[] declaredFields2 = a.g81.class.getDeclaredFields();
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        a.wv.v(newSerializer, "newSerializer()");
        java.io.StringWriter stringWriter2 = new java.io.StringWriter();
        try {
            newSerializer.setOutput(stringWriter2);
            newSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
            newSerializer.startTag("", "resources");
            newSerializer.text("\n");
            b10Var = new a.b10(2, new a.ab1("[A-Z_]+"));
            a.wv.v(declaredFields, "stringsFiles");
            length = declaredFields.length;
            i = 0;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
        while (true) {
            stringWriter = stringWriter2;
            str2 = str3;
            obj = null;
            if (i >= length) {
                break;
            }
            java.lang.reflect.Field field = declaredFields[i];
            try {
                int i2 = field.getInt(null);
                java.lang.String name = field.getName();
                a.wv.v(name, "resourceName");
                if (!((java.lang.Boolean) b10Var.i(name)).booleanValue()) {
                    java.lang.String string = resources.getString(i2);
                    a.wv.v(string, "res.getString(resourceId)");
                    newSerializer.startTag("", "string");
                    newSerializer.attribute("", "name", name);
                    newSerializer.text(string);
                    newSerializer.endTag("", "string");
                    newSerializer.text("\n");
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            i++;
            stringWriter2 = stringWriter;
            str3 = str2;
            e.printStackTrace();
            return false;
        }
        a.wv.v(declaredFields2, "arrayFiles");
        int length2 = declaredFields2.length;
        int i3 = 0;
        while (i3 < length2) {
            java.lang.reflect.Field field2 = declaredFields2[i3];
            try {
                int i4 = field2.getInt(obj);
                java.lang.String name2 = field2.getName();
                a.wv.v(name2, "resourceName");
                if (!((java.lang.Boolean) b10Var.i(name2)).booleanValue() && !a.yi1.B2(name2, "config_")) {
                    java.lang.String[] stringArray = resources.getStringArray(i4);
                    a.wv.v(stringArray, "res.getStringArray(resourceId)");
                    if (stringArray.length != 0 && a.op.N1(stringArray) != null) {
                        newSerializer.startTag("", "string-array");
                        newSerializer.attribute("", "name", name2);
                        newSerializer.text("\n");
                        int i5 = 0;
                        for (int length3 = stringArray.length; i5 < length3; length3 = length3) {
                            java.lang.String str4 = stringArray[i5];
                            newSerializer.text("  ");
                            newSerializer.startTag("", "item");
                            newSerializer.text(str4);
                            newSerializer.endTag("", "item");
                            newSerializer.text("\n");
                            i5++;
                        }
                        newSerializer.endTag("", "string-array");
                        newSerializer.text("\n");
                    }
                }
            } catch (java.lang.Exception e3) {
                e3.printStackTrace();
            }
            i3++;
            obj = null;
        }
        newSerializer.endTag("", str2);
        newSerializer.endDocument();
        java.lang.String stringWriter3 = stringWriter.toString();
        a.wv.v(stringWriter3, "writer.toString()");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(str));
        try {
            byte[] bytes = stringWriter3.getBytes(a.bu.f53a);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            a.wv.z(fileOutputStream, null);
            return true;
        } finally {
        }
    }

    public static android.content.res.Resources c(android.content.Context context, java.util.Locale locale) {
        a.wv.w(context, "context");
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        android.content.res.Resources resources = context.createConfigurationContext(configuration).getResources();
        a.wv.v(resources, "context.createConfigurat…Context(config).resources");
        return resources;
    }

    public static java.lang.String e(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        java.lang.String str = "";
        for (int i = 0; i < attributeCount; i++) {
            if (a.wv.e(xmlPullParser.getAttributeName(i), "name")) {
                str = xmlPullParser.getAttributeValue(i);
                a.wv.v(str, "parser.getAttributeValue(i)");
            }
        }
        return str;
    }

    public final boolean b() {
        return (this.c.isEmpty() ^ true) || (this.b.isEmpty() ^ true);
    }

    public final void d() {
        java.io.File file = new java.io.File((java.lang.String) this.f376a.a());
        if (file.exists()) {
            org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
            newPullParser.setInput(new java.io.FileInputStream(file), "utf-8");
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                int i = 2;
                if (eventType == 2) {
                    if (a.wv.e(newPullParser.getName(), "string")) {
                        java.lang.String e = e(newPullParser);
                        java.lang.String nextText = newPullParser.nextText();
                        a.wv.v(nextText, "parser.nextText()");
                        hashMap.put(e, a.yi1.v2(a.yi1.v2(a.yi1.v2(nextText, "\\n", "\n"), "\\'", "'"), "\\\\", "\\"));
                    } else if (a.wv.e(newPullParser.getName(), "string-array")) {
                        java.lang.String e2 = e(newPullParser);
                        int next = newPullParser.next();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (true) {
                            if (next != i) {
                                if (next == 3 && !a.wv.e(newPullParser.getName(), "item")) {
                                    break;
                                }
                            } else if (a.wv.e(newPullParser.getName(), "item")) {
                                java.lang.String nextText2 = newPullParser.nextText();
                                a.wv.v(nextText2, "parser.nextText()");
                                arrayList.add(a.yi1.v2(a.yi1.v2(a.yi1.v2(nextText2, "\\n", "\n"), "\\'", "'"), "\\\\", "\\"));
                            }
                            next = newPullParser.next();
                            i = 2;
                        }
                        hashMap2.put(e2, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
                    }
                }
            }
            this.b = hashMap;
            this.c = hashMap2;
        }
    }
}
