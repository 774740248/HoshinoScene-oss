package de.robv.android.xposed;

import java.lang.reflect.Member;
import java.util.Set;

/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>The application under recovery is an Xposed module (see
 * {@code com.omarea.xposed.XposedInterface} and the bundled
 * {@code assets/xposed_init} descriptor). The real {@code de.robv.android.xposed.*}
 * classes are injected by the Xposed framework at runtime and are therefore NOT
 * bundled inside the APK - hence they are unavailable for compilation. This stub
 * reproduces exactly the API surface referenced by the recovered sources so that
 * the project compiles. At runtime the genuine Xposed classes take precedence.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public class XC_MethodHook {

    /** Parameter bag passed to {@link #beforeHookedMethod} / {@link #afterHookedMethod}. */
    public static class MethodHookParam {
        /** The arguments of the hooked method. */
        public Object[] args;
        /** The instance the hooked method was invoked on ({@code null} for static). */
        public Object thisObject;
        /** The reflectively resolved member that was hooked. */
        public Member method;
        /** The original (unhooked) return value, if any. */
        private Object result = null;
        private Throwable throwable = null;

        /** @return the result that will be returned to the caller. */
        public Object getResult() {
            return this.result;
        }

        /** Set the value returned to the caller, skipping the original method body. */
        public void setResult(Object result) {
            this.result = result;
        }

        /** @return the throwable that will be propagated to the caller. */
        public Throwable getThrowable() {
            return this.throwable;
        }
    }

    /** Priority constants understood by the Xposed framework. */
    public static final int PRIORITY_HIGHEST = 10000;
    public static final int PRIORITY_HIGH = 8000;
    public static final int PRIORITY_NORMAL = 50;
    public static final int PRIORITY_LOW = 0;
    public static final int PRIORITY_LOWEST = -10000;

    private final int priority;

    public XC_MethodHook() {
        this.priority = PRIORITY_NORMAL;
    }

    public XC_MethodHook(int priority) {
        this.priority = priority;
    }

    /** @return the configured hook priority. */
    public int getPriority() {
        return this.priority;
    }

    /** Handle returned by {@code XposedBridge.hook*} allowing a hook to be removed. */
    public static class Unhook implements java.lang.Comparable<Unhook> {
        private final java.lang.reflect.Member hookedMethod;

        public Unhook(java.lang.reflect.Member hookedMethod) {
            this.hookedMethod = hookedMethod;
        }

        /** @return the member that was hooked. */
        public java.lang.reflect.Member getHookedMethod() {
            return this.hookedMethod;
        }

        @Override
        public int compareTo(Unhook other) {
            if (other == null) {
                return 1;
            }
            return Integer.compare(this.hookedMethod.hashCode(), other.hookedMethod.hashCode());
        }
    }

    /** Called before the hooked method executes. */
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
    }

    /** Called after the hooked method executes. */
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    }
}
