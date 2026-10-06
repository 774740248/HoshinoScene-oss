package de.robv.android.xposed;

/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>Implemented by Xposed modules that need to run code very early, inside the
 * Zygote process, before any app is forked (the {@code initZygote} callback).
 * See {@link XC_MethodHook} for the rationale of these stubs.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public interface IXposedHookZygoteInit {

    /** Handle passed to {@link #initZygote(StartupParam)} describing the module. */
    class StartupParam {
        /** Absolute path of the module APK. */
        public String modulePath;
        /** Whether the module runs in "resource hooking" mode. */
        public boolean startsSystemServer;
    }

    /**
     * Invoked once inside the Zygote process during start-up.
     *
     * @param startupParam information about the module start-up
     * @throws Throwable if the hook logic fails
     */
    void initZygote(StartupParam startupParam) throws Throwable;
}
