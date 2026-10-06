package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ql1 {
    public static android.graphics.Bitmap b;
    public static int c;
    public static boolean d;

    /* renamed from: a, reason: collision with root package name */
    public static final a.vj1 f470a = new a.vj1(a.b4.k);
    public static final android.util.LruCache e = new android.util.LruCache(3);

    public static android.graphics.Bitmap a(android.app.Activity activity) {
        java.lang.String str = a.pe0.f434a;
        a.cp cpVar = com.omarea.Scene.c;
        android.graphics.Bitmap bitmap = null;
        if (a.ai1.w(a.pe0.d(a.fs1.t(), "windowBg.jpg"))) {
            android.graphics.Point f = f(activity);
            int i = f.x * f.y;
            if (b == null || i != c) {
                c = i;
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.lang.String) f470a.a());
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inSampleSize = 1;
                    android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStream, null, options);
                    fileInputStream.close();
                    bitmap = decodeStream;
                } catch (java.lang.Exception unused) {
                }
                a.wv.v(bitmap, "this");
                d = c(bitmap);
                b = bitmap;
            }
        } else if (b(activity) && a.fs1.D().getInt("app_theme5", -1) == 10) {
            android.app.WallpaperManager wallpaperManager = android.app.WallpaperManager.getInstance(activity);
            int wallpaperId = wallpaperManager.getWallpaperId(1);
            if (b == null || c != wallpaperId) {
                android.app.WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
                if ((wallpaperInfo != null ? wallpaperInfo.getPackageName() : null) == null) {
                    android.graphics.drawable.Drawable drawable = wallpaperManager.getDrawable();
                    a.wv.t(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                }
                c = wallpaperId;
                if (bitmap != null) {
                    d = c(bitmap);
                    b = bitmap;
                }
            }
        }
        return b;
    }

    public static boolean b(android.content.Context context) {
        boolean isExternalStorageManager;
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return a.b20.t(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 && a.b20.t(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        isExternalStorageManager = android.os.Environment.isExternalStorageManager();
        return isExternalStorageManager;
    }

    public static boolean c(android.graphics.Bitmap bitmap) {
        int i;
        int i2;
        int height = bitmap.getHeight() - 1;
        int width = bitmap.getWidth() - 1;
        int i3 = (height <= 4 || width <= 4) ? 1 : 4;
        if (i3 >= 0) {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (true) {
                int i5 = (width / i3) * i4;
                if (i3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        int pixel = bitmap.getPixel(i5, (height / i3) * i6);
                        int red = android.graphics.Color.red(pixel);
                        int blue = android.graphics.Color.blue(pixel);
                        int green = android.graphics.Color.green(pixel);
                        if (red + blue + green > 520 || red > 205 || blue > 205 || green > 205) {
                            i2++;
                        } else {
                            i++;
                        }
                        if (i6 == i3) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        return i > i2;
    }

    public static boolean d(android.content.Context context) {
        a.wv.w(context, "context");
        return (context.getApplicationContext().getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (d(r14) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:6:0x0040, B:8:0x004f, B:10:0x0055, B:15:0x0071, B:19:0x009f, B:24:0x00ab, B:28:0x00b9, B:31:0x00d2, B:33:0x00d6, B:34:0x00db, B:36:0x00df, B:38:0x00ee, B:40:0x00f4, B:41:0x00f7, B:43:0x0105, B:45:0x0113, B:47:0x00d9, B:48:0x00c5, B:49:0x00cc, B:51:0x0097, B:55:0x011d, B:58:0x01bb, B:61:0x01c1, B:63:0x0127, B:65:0x0150, B:67:0x016a, B:68:0x017a, B:69:0x017f, B:71:0x0194, B:72:0x019b, B:74:0x01a2, B:76:0x01ae, B:77:0x01b4, B:79:0x01b8), top: B:5:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:6:0x0040, B:8:0x004f, B:10:0x0055, B:15:0x0071, B:19:0x009f, B:24:0x00ab, B:28:0x00b9, B:31:0x00d2, B:33:0x00d6, B:34:0x00db, B:36:0x00df, B:38:0x00ee, B:40:0x00f4, B:41:0x00f7, B:43:0x0105, B:45:0x0113, B:47:0x00d9, B:48:0x00c5, B:49:0x00cc, B:51:0x0097, B:55:0x011d, B:58:0x01bb, B:61:0x01c1, B:63:0x0127, B:65:0x0150, B:67:0x016a, B:68:0x017a, B:69:0x017f, B:71:0x0194, B:72:0x019b, B:74:0x01a2, B:76:0x01ae, B:77:0x01b4, B:79:0x01b8), top: B:5:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:6:0x0040, B:8:0x004f, B:10:0x0055, B:15:0x0071, B:19:0x009f, B:24:0x00ab, B:28:0x00b9, B:31:0x00d2, B:33:0x00d6, B:34:0x00db, B:36:0x00df, B:38:0x00ee, B:40:0x00f4, B:41:0x00f7, B:43:0x0105, B:45:0x0113, B:47:0x00d9, B:48:0x00c5, B:49:0x00cc, B:51:0x0097, B:55:0x011d, B:58:0x01bb, B:61:0x01c1, B:63:0x0127, B:65:0x0150, B:67:0x016a, B:68:0x017a, B:69:0x017f, B:71:0x0194, B:72:0x019b, B:74:0x01a2, B:76:0x01ae, B:77:0x01b4, B:79:0x01b8), top: B:5:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:6:0x0040, B:8:0x004f, B:10:0x0055, B:15:0x0071, B:19:0x009f, B:24:0x00ab, B:28:0x00b9, B:31:0x00d2, B:33:0x00d6, B:34:0x00db, B:36:0x00df, B:38:0x00ee, B:40:0x00f4, B:41:0x00f7, B:43:0x0105, B:45:0x0113, B:47:0x00d9, B:48:0x00c5, B:49:0x00cc, B:51:0x0097, B:55:0x011d, B:58:0x01bb, B:61:0x01c1, B:63:0x0127, B:65:0x0150, B:67:0x016a, B:68:0x017a, B:69:0x017f, B:71:0x0194, B:72:0x019b, B:74:0x01a2, B:76:0x01ae, B:77:0x01b4, B:79:0x01b8), top: B:5:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:6:0x0040, B:8:0x004f, B:10:0x0055, B:15:0x0071, B:19:0x009f, B:24:0x00ab, B:28:0x00b9, B:31:0x00d2, B:33:0x00d6, B:34:0x00db, B:36:0x00df, B:38:0x00ee, B:40:0x00f4, B:41:0x00f7, B:43:0x0105, B:45:0x0113, B:47:0x00d9, B:48:0x00c5, B:49:0x00cc, B:51:0x0097, B:55:0x011d, B:58:0x01bb, B:61:0x01c1, B:63:0x0127, B:65:0x0150, B:67:0x016a, B:68:0x017a, B:69:0x017f, B:71:0x0194, B:72:0x019b, B:74:0x01a2, B:76:0x01ae, B:77:0x01b4, B:79:0x01b8), top: B:5:0x0040 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.pl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.pl1 e(android.app.Activity r14) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ql1.e(android.app.Activity):a.pl1");
    }

    public static android.graphics.Point f(android.app.Activity activity) {
        android.graphics.Point point;
        android.view.WindowMetrics currentWindowMetrics;
        android.graphics.Rect bounds;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            a.wv.v(bounds, "windowManager.currentWindowMetrics.bounds");
            return new android.graphics.Point(bounds.width(), bounds.height());
        }
        android.view.View decorView = activity.getWindow().getDecorView();
        a.wv.v(decorView, "window.decorView");
        if (decorView.getWidth() <= 0 || decorView.getHeight() <= 0) {
            a.pl1 systemService = (pl1) activity.getSystemService("window");
            a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            point = new android.graphics.Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } else {
            point = new android.graphics.Point(decorView.getWidth(), decorView.getHeight());
        }
        return point;
    }
}
