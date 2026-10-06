package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xe1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f686a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.Set d;
    public final java.util.Set e;
    public final java.util.ArrayList f;

    public xe1(android.content.Context context) {
        a.wv.w(context, "context");
        this.f686a = context;
        this.b = "shortcuts";
        java.lang.String concat = com.omarea.vtools.activities.ActivityFreezeApps.class.getName().concat("2");
        this.c = concat;
        this.d = a.b20.k1(null, null, null, null);
        a.y31[] y31VarArr = {new a.y31(com.omarea.vtools.activities.ActivityProcess.class.getName(), 2131231009), new a.y31(com.omarea.vtools.activities.ActivityFiles.class.getName(), 2131231052), new a.y31(concat, 2131230973), new a.y31(com.omarea.vtools.activities.ActivityApplications.class.getName(), 2131230992), new a.y31(com.omarea.vtools.activities.ActivityPowerStat.class.getName(), 2131230954), new a.y31(com.omarea.vtools.activities.ActivityChargeStat.class.getName(), 2131230983), new a.y31(com.omarea.vtools.activities.ActivityCpuControl.class.getName(), 2131230985), new a.y31(com.omarea.vtools.activities.ActivityFpsSessions.class.getName(), 2131230941)};
        java.util.HashMap hashMap = new java.util.HashMap(a.b20.B0(8));
        a.op.R1(hashMap, y31VarArr);
        java.util.Set entrySet = hashMap.entrySet();
        a.wv.v(entrySet, "hashMapOf<String, Int>(\n…w_float_fps\n    ).entries");
        this.e = entrySet;
        this.f = a.b20.f(c(com.omarea.vtools.activities.ActivityProcess.class.getName(), 2131952919), c(com.omarea.vtools.activities.ActivityFiles.class.getName(), 2131952898), c(concat, 2131952901), c(com.omarea.vtools.activities.ActivityApplications.class.getName(), 2131952890), c(com.omarea.vtools.activities.ActivityPowerStat.class.getName(), 2131952918), c(com.omarea.vtools.activities.ActivityChargeStat.class.getName(), 2131952892), c(com.omarea.vtools.activities.ActivityCpuControl.class.getName(), 2131952895), c(com.omarea.vtools.activities.ActivityFpsSessions.class.getName(), 2131952900));
    }

    public final java.util.ArrayList a() {
        a.ng1 ng1Var;
        java.lang.Object obj;
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E(this.b, null);
        java.lang.Iterable<java.lang.String> y2 = E != null ? a.yi1.y2(E, new java.lang.String[]{","}) : this.d;
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(y2, 10));
        for (java.lang.String str : y2) {
            if (str == null || str.length() == 0) {
                ng1Var = null;
            } else {
                java.util.Iterator it = this.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (a.wv.e(((a.ng1) obj).c, str)) {
                        break;
                    }
                }
                ng1Var = (a.ng1) obj;
            }
            arrayList.add(ng1Var);
        }
        return new java.util.ArrayList(a.qv.w2(arrayList));
    }

    public final int b(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (a.wv.e(((java.util.Map.Entry) obj).getKey(), str)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Integer num = entry != null ? (java.lang.Integer) entry.getValue() : null;
        if (num == null) {
            return 2131231027;
        }
        return num.intValue();
    }

    public final a.ng1 c(java.lang.String str, int i) {
        java.lang.String string = this.f686a.getString(i);
        a.wv.v(string, "context.getString(id)");
        a.ng1 ng1Var = new a.ng1(string, str);
        ng1Var.b = str;
        return ng1Var;
    }

    public final void d(int i, a.ng1 ng1Var) {
        java.lang.String str;
        java.util.ArrayList a2 = a();
        while (a2.size() < 4) {
            a2.add(null);
        }
        a2.set(i, ng1Var);
        a.cp cpVar = com.omarea.Scene.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(a2, 10));
        java.util.Iterator it = a2.iterator();
        while (it.hasNext()) {
            a.ng1 ng1Var2 = (a.ng1) it.next();
            if (ng1Var2 == null || (str = ng1Var2.c) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        a.fs1.O(this.b, a.qv.j2(arrayList, ",", null, null, null, 62));
        android.content.Context context = this.f686a;
        android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int color = context.getColor(2131099704);
        java.util.Iterator it2 = a2.iterator();
        while (it2.hasNext()) {
            a.ng1 ng1Var3 = (a.ng1) it2.next();
            if (ng1Var3 != null) {
                android.graphics.drawable.Drawable drawable = context.getDrawable(b(ng1Var3.c));
                if (drawable == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                a.wv.v(mutate, "checkNotNull(context.getDrawable(icon)).mutate()");
                mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(color, android.graphics.PorterDuff.Mode.SRC_IN));
                int intrinsicWidth = mutate.getIntrinsicWidth();
                if (intrinsicWidth < 1) {
                    intrinsicWidth = 1;
                }
                int intrinsicHeight = mutate.getIntrinsicHeight();
                int i2 = intrinsicHeight >= 1 ? intrinsicHeight : 1;
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(intrinsicWidth, i2, android.graphics.Bitmap.Config.ARGB_8888);
                a.wv.v(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                mutate.setBounds(0, 0, intrinsicWidth, i2);
                mutate.draw(canvas);
                android.graphics.drawable.Icon createWithBitmap = android.graphics.drawable.Icon.createWithBitmap(createBitmap);
                a.wv.v(createWithBitmap, "createWithBitmap(bitmap)");
                android.content.pm.ShortcutInfo.Builder icon = new android.content.pm.ShortcutInfo.Builder(context, java.lang.String.valueOf(ng1Var3.f381a)).setShortLabel(java.lang.String.valueOf(ng1Var3.f381a)).setLongLabel(java.lang.String.valueOf(ng1Var3.f381a)).setDisabledMessage("Disabled").setIcon(createWithBitmap);
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                java.lang.String packageName = context.getPackageName();
                java.lang.String str2 = ng1Var3.c;
                a.wv.s(str2);
                intent.setComponent(new android.content.ComponentName(packageName, str2));
                arrayList2.add(icon.setIntent(intent).build());
            }
        }
        if (shortcutManager == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        shortcutManager.setDynamicShortcuts(arrayList2);
    }
}
