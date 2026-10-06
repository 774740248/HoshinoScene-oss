package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xp extends a.lj1 implements a.fp0 {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ android.content.Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(boolean z, android.content.Context context, a.ey eyVar) {
        super(2, eyVar);
        this.g = z;
        this.h = context;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xp(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        boolean z = this.g;
        a.b20.q1(obj);
        try {
            java.net.URLConnection openConnection = new java.net.URL("https://vtools.oss-cn-beijing.aliyuncs.com/addin/auto-skip-config-v1.json").openConnection();
            openConnection.setConnectTimeout(15000);
            openConnection.setReadTimeout(20000);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(openConnection.getInputStream()));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            java.lang.String sb2 = sb.toString();
            a.wv.v(sb2, "stringBuilder.toString()");
            int length = sb2.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = a.wv.C(sb2.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            a.jt0 jt0Var = new a.jt0(sb2.subSequence(i, length + 1).toString());
            java.util.List list = jt0Var.f269a;
            if (z) {
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.X("从云端获得 " + list.size() + " 条(自动跳过)数据", 0);
            }
            a.e3 e3Var = new a.e3(this.h, 1);
            try {
                e3Var.getWritableDatabase().execSQL("delete from auto_skip_ids", new java.lang.String[0]);
            } catch (java.lang.Exception unused) {
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                a.lt0 c = jt0Var.c(i2);
                try {
                    e3Var.getWritableDatabase().execSQL("insert into auto_skip_ids(activity, viewId) values (?, ?)", new java.lang.Object[]{c.h("activity"), c.h("viewId")});
                } catch (java.lang.Exception unused2) {
                }
            }
        } catch (java.lang.Exception unused3) {
            if (z) {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.X("获取云端配置数据失败~", 0);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.xp xpVar = (a.xp) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        xpVar.e(no1Var);
        return no1Var;
    }
}
