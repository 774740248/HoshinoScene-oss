package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ho1 extends a.vu0 {
    public static android.graphics.fonts.Font E(android.graphics.fonts.FontFamily fontFamily, int i) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int F = F(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i2);
            int F2 = F(fontStyle, font2.getStyle());
            if (F2 < F) {
                font = font2;
                F = F2;
            }
        }
        return font;
    }

    public static int F(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.vu0
    public final a.cj0 A(int i, a.cj0[] cj0VarArr) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.vu0
    public final android.graphics.Typeface v(android.content.Context context, a.zi0 zi0Var, android.content.res.Resources resources, int i) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (a.aj0 aj0Var : zi0Var.f737a) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, aj0Var.f).setWeight(aj0Var.b).setSlant(aj0Var.c ? 1 : 0).setTtcIndex(aj0Var.e).setFontVariationSettings(aj0Var.d).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(E(build2, i).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // a.vu0
    public final android.graphics.Typeface w(android.content.Context context, a.cj0[] cj0VarArr, int i) {
        int i2;
        android.os.ParcelFileDescriptor openFileDescriptor;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = cj0VarArr.length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            while (i2 < length) {
                a.cj0 cj0Var = cj0VarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cj0Var.f73a, "r", null);
                } catch (java.io.IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(cj0Var.c).setSlant(cj0Var.d ? 1 : 0).setTtcIndex(cj0Var.b).build();
                        if (builder == null) {
                            builder = new android.graphics.fonts.FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(E(build2, i).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // a.vu0
    public final android.graphics.Typeface x(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.vu0
    public final android.graphics.Typeface y(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
