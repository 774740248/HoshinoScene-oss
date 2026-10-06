package de.robv.android.xposed;

/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>Entry point used by Xposed modules to install hooks and emit log messages.
 * See {@link XC_MethodHook} for the rationale of these stubs. The real class is
 * supplied by the Xposed runtime.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public final class XposedBridge {

    private XposedBridge() {
    }

    /**
     * Hooks every constructor of {@code hookClass}.
     *
     * @param hookClass the class whose constructors should be hooked
     * @param callback  the callback invoked around each constructor
     * @return a set describing the hooked members
     */
    public static java.util.Set<XC_MethodHook.Unhook> hookAllConstructors(
            Class<?> hookClass, XC_MethodHook callback) {
        return new java.util.HashSet<>();
    }

    /**
     * Hooks every method of {@code hookClass} matching {@code methodName}.
     *
     * @param hookClass  the target class
     * @param methodName the method name to hook ({@code null} for all)
     * @param callback   the callback invoked around each method
     * @return a set describing the hooked members
     */
    public static java.util.Set<XC_MethodHook.Unhook> hookAllMethods(
            Class<?> hookClass, String methodName, XC_MethodHook callback) {
        return new java.util.HashSet<>();
    }

    /** Writes {@code text} to the Xposed log. */
    public static void log(String text) {
    }

    /** Writes the stack trace of {@code t} to the Xposed log. */
    public static void log(Throwable t) {
    }
}
