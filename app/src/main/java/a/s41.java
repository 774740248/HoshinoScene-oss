package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s41 {

    public s41() {
    }


    /* renamed from: a, reason: collision with root package name */
    public char f515a;
    public float[] b;

    public static void a(android.graphics.Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = java.lang.Math.toRadians(f7);
        double cos = java.lang.Math.cos(radians);
        double sin = java.lang.Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = f5;
        double d8 = d5 / d7;
        double d9 = f6;
        double d10 = ((d4 * cos) + ((-f) * sin)) / d9;
        double d11 = d4;
        double d12 = f4;
        double d13 = ((d12 * sin) + (f3 * cos)) / d7;
        double d14 = ((d12 * cos) + ((-f3) * sin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            android.util.Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            android.util.Log.w("PathParser", "Points are too far apart " + d19);
            float sqrt = (float) (java.lang.Math.sqrt(d19) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = java.lang.Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z == z2) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double atan2 = java.lang.Math.atan2(d10 - d2, d8 - d);
        double atan22 = java.lang.Math.atan2(d14 - d2, d13 - d) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = java.lang.Math.cos(radians);
        double sin2 = java.lang.Math.sin(radians);
        double cos3 = java.lang.Math.cos(atan2);
        double sin3 = java.lang.Math.sin(atan2);
        double d27 = -d7;
        double d28 = d27 * cos2;
        double d29 = d9 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d9 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = d32;
        double d35 = atan22 / ceil;
        int i = 0;
        while (i < ceil) {
            double d36 = atan2 + d35;
            double sin4 = java.lang.Math.sin(d36);
            double cos4 = java.lang.Math.cos(d36);
            double d37 = d35;
            double d38 = (((d7 * cos2) * cos4) + d25) - (d29 * sin4);
            double d39 = d34;
            double d40 = d25;
            double d41 = (d39 * sin4) + (d7 * sin2 * cos4) + d26;
            double d42 = (d28 * sin4) - (d29 * cos4);
            double d43 = (cos4 * d39) + (sin4 * d31);
            double d44 = d36 - atan2;
            double tan = java.lang.Math.tan(d44 / 2.0d);
            double sqrt3 = ((java.lang.Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * java.lang.Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * sqrt3) + d6), (float) ((d33 * sqrt3) + d11), (float) (d38 - (sqrt3 * d42)), (float) (d41 - (sqrt3 * d43)), (float) d38, (float) d41);
            i++;
            atan2 = d36;
            d31 = d31;
            cos2 = cos2;
            ceil = ceil;
            d33 = d43;
            d7 = d7;
            d30 = d42;
            d6 = d38;
            d11 = d41;
            d25 = d40;
            d35 = d37;
            d34 = d39;
        }
    }

    public static void b(a.s41[] s41VarArr, android.graphics.Path path) {
        int i;
        int i2;
        float[] fArr;
        char c;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        a.s41[] s41VarArr2 = s41VarArr;
        int i4 = 6;
        float[] fArr2 = new float[6];
        char c2 = 'm';
        int i5 = 0;
        char c3 = 'm';
        int i6 = 0;
        while (i6 < s41VarArr2.length) {
            a.s41 s41Var = s41VarArr2[i6];
            char c4 = s41Var.f515a;
            float[] fArr3 = s41Var.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            float f20 = fArr2[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    break;
            }
            i = 2;
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i7 = i5;
            while (i7 < fArr3.length) {
                if (c4 != 'A') {
                    if (c4 != 'C') {
                        if (c4 == 'H') {
                            i2 = i7;
                            fArr = fArr3;
                            c = c4;
                            i3 = i6;
                            path.lineTo(fArr[i2], f24);
                            f23 = fArr[i2];
                        } else if (c4 == 'Q') {
                            i2 = i7;
                            fArr = fArr3;
                            c = c4;
                            i3 = i6;
                            int i8 = i2 + 1;
                            int i9 = i2 + 2;
                            int i10 = i2 + 3;
                            path.quadTo(fArr[i2], fArr[i8], fArr[i9], fArr[i10]);
                            f = fArr[i2];
                            f2 = fArr[i8];
                            f23 = fArr[i9];
                            f24 = fArr[i10];
                        } else if (c4 == 'V') {
                            i2 = i7;
                            fArr = fArr3;
                            c = c4;
                            i3 = i6;
                            path.lineTo(f23, fArr[i2]);
                            f24 = fArr[i2];
                        } else if (c4 != 'a') {
                            if (c4 != 'c') {
                                if (c4 == 'h') {
                                    i2 = i7;
                                    path.rLineTo(fArr3[i2], 0.0f);
                                    f23 += fArr3[i2];
                                } else if (c4 == 'q') {
                                    i2 = i7;
                                    float f25 = f24;
                                    float f26 = f23;
                                    int i11 = i2 + 1;
                                    int i12 = i2 + 2;
                                    int i13 = i2 + 3;
                                    path.rQuadTo(fArr3[i2], fArr3[i11], fArr3[i12], fArr3[i13]);
                                    float f27 = f26 + fArr3[i2];
                                    float f28 = fArr3[i11] + f25;
                                    float f29 = f26 + fArr3[i12];
                                    f24 = f25 + fArr3[i13];
                                    f18 = f28;
                                    f17 = f27;
                                    fArr = fArr3;
                                    c = c4;
                                    i3 = i6;
                                    f23 = f29;
                                } else if (c4 == 'v') {
                                    i2 = i7;
                                    path.rLineTo(0.0f, fArr3[i2]);
                                    f24 += fArr3[i2];
                                } else if (c4 == 'L') {
                                    i2 = i7;
                                    int i14 = i2 + 1;
                                    path.lineTo(fArr3[i2], fArr3[i14]);
                                    f23 = fArr3[i2];
                                    f24 = fArr3[i14];
                                } else if (c4 == 'M') {
                                    i2 = i7;
                                    f23 = fArr3[i2];
                                    f24 = fArr3[i2 + 1];
                                    if (i2 > 0) {
                                        path.lineTo(f23, f24);
                                    } else {
                                        path.moveTo(f23, f24);
                                        f22 = f24;
                                        f21 = f23;
                                    }
                                } else if (c4 == 'S') {
                                    i2 = i7;
                                    float f30 = f24;
                                    float f31 = f23;
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f9 = (f30 * 2.0f) - f18;
                                        f10 = (f31 * 2.0f) - f17;
                                    } else {
                                        f10 = f31;
                                        f9 = f30;
                                    }
                                    int i15 = i2 + 1;
                                    int i16 = i2 + 2;
                                    int i17 = i2 + 3;
                                    path.cubicTo(f10, f9, fArr3[i2], fArr3[i15], fArr3[i16], fArr3[i17]);
                                    float f32 = fArr3[i2];
                                    float f33 = fArr3[i15];
                                    f23 = fArr3[i16];
                                    f24 = fArr3[i17];
                                    f18 = f33;
                                    f17 = f32;
                                } else if (c4 == 'T') {
                                    i2 = i7;
                                    float f34 = f24;
                                    float f35 = f23;
                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                        f4 = (f35 * 2.0f) - f17;
                                        f5 = (f34 * 2.0f) - f18;
                                    } else {
                                        f4 = f35;
                                        f5 = f34;
                                    }
                                    int i18 = i2 + 1;
                                    path.quadTo(f4, f5, fArr3[i2], fArr3[i18]);
                                    f6 = fArr3[i2];
                                    f8 = fArr3[i18];
                                    f18 = f5;
                                    f17 = f4;
                                    fArr = fArr3;
                                    c = c4;
                                    i3 = i6;
                                    f23 = f6;
                                    f24 = f8;
                                } else if (c4 == 'l') {
                                    i2 = i7;
                                    int i19 = i2 + 1;
                                    path.rLineTo(fArr3[i2], fArr3[i19]);
                                    f23 += fArr3[i2];
                                    f24 += fArr3[i19];
                                } else if (c4 == c2) {
                                    i2 = i7;
                                    float f36 = fArr3[i2];
                                    f23 += f36;
                                    float f37 = fArr3[i2 + 1];
                                    f24 += f37;
                                    if (i2 > 0) {
                                        path.rLineTo(f36, f37);
                                    } else {
                                        path.rMoveTo(f36, f37);
                                        f22 = f24;
                                        f21 = f23;
                                    }
                                } else if (c4 == 's') {
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i20 = i7 + 1;
                                    int i21 = i7 + 2;
                                    int i22 = i7 + 3;
                                    i2 = i7;
                                    f3 = f24;
                                    float f38 = f23;
                                    path.rCubicTo(f12, f11, fArr3[i7], fArr3[i20], fArr3[i21], fArr3[i22]);
                                    f4 = f38 + fArr3[i2];
                                    f5 = f3 + fArr3[i20];
                                    f6 = f38 + fArr3[i21];
                                    f7 = fArr3[i22];
                                } else if (c4 != 't') {
                                    i2 = i7;
                                } else {
                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                        f13 = f23 - f17;
                                        f14 = f24 - f18;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i23 = i7 + 1;
                                    path.rQuadTo(f13, f14, fArr3[i7], fArr3[i23]);
                                    float f39 = f13 + f23;
                                    float f40 = f14 + f24;
                                    f23 += fArr3[i7];
                                    f24 += fArr3[i23];
                                    f18 = f40;
                                    i2 = i7;
                                    fArr = fArr3;
                                    c = c4;
                                    i3 = i6;
                                    f17 = f39;
                                }
                                fArr = fArr3;
                                c = c4;
                                i3 = i6;
                            } else {
                                i2 = i7;
                                f3 = f24;
                                float f41 = f23;
                                int i24 = i2 + 2;
                                int i25 = i2 + 3;
                                int i26 = i2 + 4;
                                int i27 = i2 + 5;
                                path.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i24], fArr3[i25], fArr3[i26], fArr3[i27]);
                                f4 = f41 + fArr3[i24];
                                f5 = f3 + fArr3[i25];
                                f6 = f41 + fArr3[i26];
                                f7 = fArr3[i27];
                            }
                            f8 = f7 + f3;
                            f18 = f5;
                            f17 = f4;
                            fArr = fArr3;
                            c = c4;
                            i3 = i6;
                            f23 = f6;
                            f24 = f8;
                        } else {
                            i2 = i7;
                            float f42 = f24;
                            float f43 = f23;
                            int i28 = i2 + 5;
                            int i29 = i2 + 6;
                            fArr = fArr3;
                            c = c4;
                            i3 = i6;
                            a(path, f43, f42, fArr3[i28] + f43, fArr3[i29] + f42, fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                            f23 = f43 + fArr[i28];
                            f24 = f42 + fArr[i29];
                        }
                        i7 = i2 + i;
                        c3 = c;
                        c4 = c3;
                        fArr3 = fArr;
                        i6 = i3;
                        c2 = 'm';
                        i5 = 0;
                    } else {
                        i2 = i7;
                        fArr = fArr3;
                        c = c4;
                        i3 = i6;
                        int i30 = i2 + 2;
                        int i31 = i2 + 3;
                        int i32 = i2 + 4;
                        int i33 = i2 + 5;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i30], fArr[i31], fArr[i32], fArr[i33]);
                        f23 = fArr[i32];
                        f24 = fArr[i33];
                        f = fArr[i30];
                        f2 = fArr[i31];
                    }
                    f17 = f;
                    f18 = f2;
                    i7 = i2 + i;
                    c3 = c;
                    c4 = c3;
                    fArr3 = fArr;
                    i6 = i3;
                    c2 = 'm';
                    i5 = 0;
                } else {
                    i2 = i7;
                    fArr = fArr3;
                    c = c4;
                    i3 = i6;
                    int i34 = i2 + 5;
                    int i35 = i2 + 6;
                    a(path, f23, f24, fArr[i34], fArr[i35], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                    f23 = fArr[i34];
                    f24 = fArr[i35];
                }
                f18 = f24;
                f17 = f23;
                i7 = i2 + i;
                c3 = c;
                c4 = c3;
                fArr3 = fArr;
                i6 = i3;
                c2 = 'm';
                i5 = 0;
            }
            int i36 = i6;
            int i37 = i5;
            fArr2[i37] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            i6 = i36 + 1;
            i4 = 6;
            c2 = 'm';
            i5 = i37;
            c3 = s41VarArr[i36].f515a;
            s41VarArr2 = s41VarArr;
        }
    }
}
