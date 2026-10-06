package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wy extends a.h {
    /* [修复] 从 smali 还原：super 只能调用一次，i==1→(xy.d, vy.f)，否则 (gy.c, vy.e) */
    public wy(int i) {
        super(i == 1 ? a.xy.d : a.gy.c, i == 1 ? a.vy.f : a.vy.e);
    }
}
