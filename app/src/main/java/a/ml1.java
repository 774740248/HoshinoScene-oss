package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ml1 implements android.view.ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ActionMode.Callback f355a;
    public final android.widget.TextView b;
    public java.lang.Class c;
    public java.lang.reflect.Method d;
    public boolean e;
    public boolean f = false;

    public ml1(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
        this.f355a = callback;
        this.b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f355a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f355a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f355a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        android.widget.TextView textView = this.b;
        android.content.Context context = textView.getContext();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (!this.f) {
            this.f = true;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.c = cls;
                this.d = cls.getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                this.e = true;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                this.c = null;
                this.d = null;
                this.e = false;
            }
        }
        try {
            java.lang.reflect.Method declaredMethod = (this.e && this.c.isInstance(menu)) ? this.d : menu.getClass().getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                android.view.MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, java.lang.Integer.valueOf(size));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (context instanceof android.app.Activity) {
                for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            java.lang.String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) arrayList.get(i);
                android.view.MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                android.content.Intent putExtra = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof android.text.Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                android.content.pm.ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
        }
        return this.f355a.onPrepareActionMode(actionMode, menu);
    }
}
