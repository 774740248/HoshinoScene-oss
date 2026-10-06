package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gl0 extends a.lj1 implements a.fp0 {
    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.tq0 tq0Var;
        a.b20.q1(obj);
        a.z1 z1Var = a.tq0.n;
        try {
            java.util.HashMap<java.lang.String, java.lang.String> vulkanDeviceInfoMap = com.omarea.vtools.SceneJNI.getVulkanDeviceInfoMap();
            if (vulkanDeviceInfoMap != null && !vulkanDeviceInfoMap.isEmpty() && !vulkanDeviceInfoMap.containsKey("error")) {
                tq0Var = new a.tq0(vulkanDeviceInfoMap);
                return tq0Var;
            }
            tq0Var = new a.tq0();
            return tq0Var;
        } catch (java.lang.Exception unused) {
            return new a.tq0();
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.gl0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
