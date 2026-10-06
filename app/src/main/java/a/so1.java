package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class so1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f533a = new java.util.concurrent.atomic.AtomicReference();

    public static android.icu.text.DateFormat a(java.lang.String str, java.util.Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static java.util.Calendar b(java.util.Calendar calendar) {
        java.util.Calendar d = d(calendar);
        java.util.Calendar d2 = d(null);
        d2.set(d.get(1), d.get(2), d.get(5));
        return d2;
    }

    public static java.util.Calendar c() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static java.util.Calendar d(java.util.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
