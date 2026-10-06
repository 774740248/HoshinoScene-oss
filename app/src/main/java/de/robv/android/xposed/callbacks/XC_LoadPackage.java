package de.robv.android.xposed.callbacks;

/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>Callback payload delivered to Xposed modules implementing
 * {@code de.robv.android.xposed.IXposedHookLoadPackage}. See
 * {@code de.robv.android.xposed.XC_MethodHook} for the rationale of these stubs.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public abstract class XC_LoadPackage {

    /** Information about the package currently being loaded. */
    public static class LoadPackageParam {
        /** Name of the package (e.g. {@code com.android.systemui}). */
        public String packageName;
        /** Process name associated with the package. */
        public String processName;
        /** Class loader able to resolve the package's classes. */
        public ClassLoader classLoader;
        /** The {@code LoadedApk} instance backing the package. */
        public Object loadedApk;
        /** Whether this package runs inside the system server process. */
        public boolean isFirstApplication;
    }
}
