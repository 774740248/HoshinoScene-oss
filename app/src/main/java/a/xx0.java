package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xx0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.ArrayList g;
    public final /* synthetic */ a.pm h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0(java.util.ArrayList arrayList, a.pm pmVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = arrayList;
        this.h = pmVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xx0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            java.lang.String propUrl = ((a.c11) it.next()).getPropUrl();
            a.pm pmVar = this.h;
            pmVar.getClass();
            a.d11 d11Var = null;
            try {
                java.net.URLConnection openConnection = new java.net.URL(propUrl).openConnection();
                openConnection.setConnectTimeout(1000);
                openConnection.setConnectTimeout(5000);
                openConnection.connect();
                java.io.InputStream inputStream = openConnection.getInputStream();
                a.wv.v(inputStream, "connection.getInputStream()");
                java.util.List<java.lang.String> y2 = a.yi1.y2(new java.lang.String(a.wv.c1(inputStream), a.bu.f53a), new java.lang.String[]{"\n"});
                a.d11 d11Var2 = new a.d11();
                for (java.lang.String str : y2) {
                    int m2 = a.yi1.m2(str, "=", 0, false, 6);
                    if (m2 > 0) {
                        java.lang.String substring = str.substring(0, m2);
                        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        java.lang.String substring2 = str.substring(m2 + 1);
                        a.wv.v(substring2, "this as java.lang.String).substring(startIndex)");
                        java.lang.String obj2 = a.yi1.F2(substring2).toString();
                        switch (substring.hashCode()) {
                            case -1854767153:
                                if (substring.equals("support")) {
                                    d11Var2.setSupport(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case -1724546052:
                                if (substring.equals("description")) {
                                    d11Var2.setDescription(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case -1406328437:
                                if (substring.equals("author")) {
                                    d11Var2.setAuthor(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case -1326167441:
                                if (substring.equals("donate")) {
                                    d11Var2.setDonate(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case -1321546630:
                                if (substring.equals("template")) {
                                    d11Var2.setTemplate(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case 3355:
                                if (substring.equals("id")) {
                                    d11Var2.setId(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case 3373707:
                                if (substring.equals("name")) {
                                    d11Var2.setName(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case 351608024:
                                if (substring.equals("version")) {
                                    break;
                                } else {
                                    break;
                                }
                            case 688591589:
                                if (substring.equals("versionCode")) {
                                    d11Var2.setVersionCode(obj2);
                                    break;
                                } else {
                                    break;
                                }
                            case 688906115:
                                if (substring.equals("versionName")) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                        d11Var2.setVersionName(obj2);
                    }
                }
                if (d11Var2.getId().length() > 0) {
                    d11Var = d11Var2;
                }
            } catch (java.lang.Exception unused) {
            }
            if (d11Var != null) {
                a.e3 e3Var = (a.e3) pmVar.e;
                e3Var.getClass();
                android.database.sqlite.SQLiteDatabase writableDatabase = e3Var.getWritableDatabase();
                try {
                    writableDatabase.delete("modules", " id = ?", new java.lang.String[]{d11Var.getId()});
                    writableDatabase.execSQL("insert into modules(id, last_update, prop_url, zip_url, notes_url, name, version_name, version_code, author, description, support, donate, template) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new java.lang.Object[]{d11Var.getId(), java.lang.Long.valueOf(d11Var.getLastUpdate()), d11Var.getPropUrl(), d11Var.getZipUrl(), d11Var.getNotesUrl(), d11Var.getName(), d11Var.getVersionName(), d11Var.getVersionCode(), d11Var.getAuthor(), d11Var.getDescription(), d11Var.getSupport(), d11Var.getDonate(), d11Var.getTemplate()});
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.xx0 xx0Var = (a.xx0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        xx0Var.e(no1Var);
        return no1Var;
    }
}
