package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tp0 implements a.x30 {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.view.KeyEvent.Callback d;

    public /* synthetic */ tp0(android.view.KeyEvent.Callback callback, int i) {
        this.c = i;
        this.d = callback;
    }

    @Override // a.x30
    public final void b(java.util.ArrayList arrayList) {
        int i = this.c;
        android.view.KeyEvent.Callback callback = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.ui.apps.Games games = (com.omarea.ui.apps.Games) callback;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((a.tg) it.next()).getPackageName());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
                a.gu0[] gu0VarArr = com.omarea.ui.apps.Games.l;
                games.getClass();
                if (arrayList3.size() > 0) {
                    android.content.Context context = games.getContext();
                    a.wv.v(context, "context");
                    a.wv.v(context.getResources().getStringArray(2130903050), "context.resources.getStr…y.config_games_blacklist)");
                    a.wv.s(context.getPackageManager());
                    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("games", 0);
                    a.wv.s(sharedPreferences);
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    java.util.Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        edit.putBoolean((java.lang.String) it2.next(), true);
                    }
                    edit.apply();
                    games.h();
                    return;
                }
                return;
            default:
                com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = (com.omarea.vtools.activities.ActivityFreezeApps) callback;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                java.util.Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((a.tg) it3.next()).getPackageName());
                }
                activityFreezeApps.addFreezeApps(new java.util.ArrayList(arrayList4));
                return;
        }
    }
}
