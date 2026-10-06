package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class te {
    public final void a(java.lang.Object obj) {
        a.ue ueVar = (a.ue) this;
        int i = ueVar.f589a;
        a.qe qeVar = ueVar.c;
        java.lang.String str = ueVar.b;
        androidx.activity.result.a aVar = ueVar.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.Integer num = (java.lang.Integer) aVar.c.get(str);
                if (num != null) {
                    aVar.e.add(str);
                    try {
                        aVar.b(num.intValue(), qeVar, obj);
                        return;
                    } catch (java.lang.Exception e) {
                        aVar.e.remove(str);
                        throw e;
                    }
                }
                throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + qeVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                java.lang.Integer num2 = (java.lang.Integer) aVar.c.get(str);
                if (num2 != null) {
                    aVar.e.add(str);
                    try {
                        aVar.b(num2.intValue(), qeVar, obj);
                        return;
                    } catch (java.lang.Exception e2) {
                        aVar.e.remove(str);
                        throw e2;
                    }
                }
                throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + qeVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
