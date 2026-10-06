package de.robv.android.xposed;

/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>Reflection helpers used by Xposed modules to locate and hook methods and to
 * read/write fields of obfuscated classes. See {@link XC_MethodHook} for the
 * rationale of these stubs. The real class is supplied by the Xposed runtime.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public final class XposedHelpers {

    private XposedHelpers() {
    }

    /**
     * Finds and hooks a single method.
     *
     * @param className   fully qualified class name (or a {@link Class})
     * @param classLoader loader used to resolve {@code className}
     * @param methodName  method to hook
     * @param parameterTypesAndCallback trailing argument types followed by an
     *        {@link XC_MethodHook} instance
     * @return the installed hook handle
     */
    public static XC_MethodHook.Unhook findAndHookMethod(
            String className, ClassLoader classLoader, String methodName,
            Object... parameterTypesAndCallback) {
        return null;
    }

    /**
     * Finds and hooks a single method on a known class.
     *
     * @param clazz       the target class
     * @param methodName  method to hook
     * @param parameterTypesAndCallback trailing argument types followed by an
     *        {@link XC_MethodHook} instance
     * @return the installed hook handle
     */
    public static XC_MethodHook.Unhook findAndHookMethod(
            Class<?> clazz, String methodName, Object... parameterTypesAndCallback) {
        return null;
    }

    /** Invokes an instance method reflectively. */
    public static Object callMethod(Object obj, String methodName, Object... args) {
        return null;
    }

    /** Invokes a static method reflectively. */
    public static Object callStaticMethod(Class<?> clazz, String methodName, Object... args) {
        return null;
    }

    /** @return the value of field {@code fieldName} on {@code obj}. */
    public static Object getObjectField(Object obj, String fieldName) {
        return null;
    }

    /** Sets the value of a reference-typed field. */
    public static void setObjectField(Object obj, String fieldName, Object value) {
    }

    /** Sets the value of an {@code int}-typed field. */
    public static void setIntField(Object obj, String fieldName, int value) {
    }

    /** Finds a class by name using the supplied loader. */
    public static Class<?> findClass(String className, ClassLoader classLoader) {
        return null;
    }

    /** Explicitly initialises a class (runs its static initialiser). */
    public static Class<?> findClassIfExists(String className, ClassLoader classLoader) {
        return null;
    }
}
