package a;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.omarea.vtools.activities.ActivityAppActivity;
import com.omarea.vtools.activities.ActivityQuickStart;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {

    public q3() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityInfo d;
    public final /* synthetic */ ActivityAppActivity e;

    public /* synthetic */ q3(ActivityInfo activityInfo, ActivityAppActivity activityAppActivity, int i) {
        this.c = i;
        this.d = activityInfo;
        this.e = activityAppActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        Context context = this.e;
        ActivityInfo activityInfo = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityAppActivity.n;
                wv.w(activityInfo, "$activityInfo");
                wv.w(context, "this$0");
                if (!activityInfo.enabled) {
                    Toast.makeText(context, context.getString(2131951848), 1).show();
                    return;
                }
                if (!activityInfo.exported && !wv.e(activityInfo.packageName, context.getContext().getPackageName())) {
                    context.p();
                    return;
                }
                try {
                    context.startActivity(context.o());
                    return;
                } catch (ActivityNotFoundException unused) {
                    activityInfo.exported = false;
                    context.p();
                    return;
                } catch (SecurityException unused2) {
                    activityInfo.exported = false;
                    context.p();
                    return;
                } catch (Exception e) {
                    Toast.makeText(context, "Exception " + e.getMessage(), 1).show();
                    return;
                }
            default:
                gu0[] gu0VarArr2 = ActivityAppActivity.n;
                wv.w(activityInfo, "$activityInfo");
                wv.w(context, "this$0");
                if (!activityInfo.enabled) {
                    Toast.makeText(context, context.getString(2131951848), 1).show();
                    return;
                }
                boolean z = !activityInfo.exported;
                Intent o = context.o();
                gu0[] gu0VarArr3 = ActivityAppActivity.n;
                String obj = ((ActivityAppActivity) context).i.a(gu0VarArr3[5]).getText().toString();
                Drawable drawable = ((ImageView) ((ActivityAppActivity) context).g.a(gu0VarArr3[3])).getDrawable();
                wv.v(drawable, "edit_icon.drawable");
                wv.w(obj, "title");
                try {
                    Object systemService = context.getSystemService("shortcut");
                    wv.t(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
                    ShortcutManager shortcutManager = (ShortcutManager) systemService;
                    if (shortcutManager.isRequestPinShortcutSupported()) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.putExtras(o);
                        if (z) {
                            intent.setClassName(context, new ComponentName(context, (Class<?>) ActivityQuickStart.class).getClassName());
                            intent.setFlags(1082130432);
                            ComponentName component = o.getComponent();
                            intent.putExtra("packageName", component != null ? component.getPackageName() : null);
                            ComponentName component2 = o.getComponent();
                            intent.putExtra("className", component2 != null ? component2.getClassName() : null);
                        } else {
                            intent.setComponent(o.getComponent());
                        }
                        ComponentName component3 = o.getComponent();
                        wv.s(component3);
                        String packageName = component3.getPackageName();
                        ComponentName component4 = o.getComponent();
                        wv.s(component4);
                        String str = packageName + "/" + component4.getClassName();
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, str);
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        drawable.draw(canvas);
                        ShortcutInfo.Builder intent2 = builder.setIcon(Icon.createWithBitmap(createBitmap)).setShortLabel(obj).setIntent(intent);
                        if (z) {
                            intent2.setActivity(new ComponentName(context, (Class<?>) ActivityQuickStart.class));
                        }
                        ShortcutInfo build = intent2.build();
                        wv.v(build, "Builder(context, id)\n   …                 .build()");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(), 201326592);
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                        wv.v(pinnedShortcuts, "shortcutManager.pinnedShortcuts");
                        Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                shortcutManager.requestPinShortcut(build, broadcast.getIntentSender());
                            } else if (wv.e(it.next().getId(), str)) {
                                shortcutManager.updateShortcuts(new x2(build, 1));
                            }
                        }
                    }
                    Toast.makeText(context, "OK", 0).show();
                    return;
                } catch (Exception e2) {
                    Log.e("ShortcutManager", e2.getMessage());
                    Toast.makeText(context, context.getString(2131951860), 0).show();
                    return;
                }
        }
    }
}
