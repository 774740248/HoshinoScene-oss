package de.robv.android.xposed;

import java.io.File;
/**
 * Minimal compile-time stub of the Xposed framework API.
 *
 * <p>Provides read access to an Xposed module's shared preferences without
 * requiring the module process to run inside the hooked app. See
 * {@link XC_MethodHook} for the rationale of these stubs.
 *
 * <p><b>This file is scaffolding, not recovered application logic.</b>
 */
public class XSharedPreferences {

    private final String packageName;
    private final String fileName;

    /**
     * @param packageName package owning the preference file
     * @param fileName    preference file name (without {@code .xml})
     */
    public XSharedPreferences(String packageName, String fileName) {
        this.packageName = packageName;
        this.fileName = fileName;
    }

    /** Reloads the preferences from disk. */
    public void reload() {
    }

    /** Attempts to make the preference file world-readable. */
    public boolean makeWorldReadable() {
        return true;
    }

    /** @return the {@code File} backing these preferences, or {@code null}. */
    public java.io.File getFile() {
        return null;
    }

    /** @return the boolean preference for {@code key}, or {@code defValue}. */
    public boolean getBoolean(String key, boolean defValue) {
        return defValue;
    }

    /** @return the string preference for {@code key}, or {@code defValue}. */
    public String getString(String key, String defValue) {
        return defValue;
    }

    /** @return the int preference for {@code key}, or {@code defValue}. */
    public int getInt(String key, int defValue) {
        return defValue;
    }

    /** @return the long preference for {@code key}, or {@code defValue}. */
    public long getLong(String key, long defValue) {
        return defValue;
    }

    /** @return the float preference for {@code key}, or {@code defValue}. */
    public float getFloat(String key, float defValue) {
        return defValue;
    }

    /** @return the set preference for {@code key}, or {@code defValue}. */
    public java.util.Set<String> getStringSet(String key, java.util.Set<String> defValues) {
        return defValues;
    }

    /** @return {@code true} if {@code key} is present. */
    public boolean contains(String key) {
        return false;
    }

    /** @return all keys present in these preferences. */
    public java.util.Map<String, ?> getAll() {
        return new java.util.HashMap<>();
    }
}
