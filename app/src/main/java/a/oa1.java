package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oa1 {

    public oa1() {
    }

    public static java.lang.String a(a.op0 op0Var) {
        java.lang.String obj = op0Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
