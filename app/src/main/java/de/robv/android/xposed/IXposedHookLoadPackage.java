package de.robv.android.xposed;

/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>Implemented by Xposed modules that want to inspect every app as it is loaded
 * (the {@code handleLoadPackage} callback). See {@link XC_MethodHook} for the
 * rationale of these stubs.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public interface IXposedHookLoadPackage {

    /**
     * Invoked by the framework for every package that is loaded.
     *
     * @param lpparam information about the package being loaded
     * @throws Throwable if the hook logic fails
     */
    void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam lpparam)
            throws Throwable;
}
