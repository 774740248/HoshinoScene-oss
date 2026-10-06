package a;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.omarea.vtools.activities.ActivityFpsSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class v8 implements View.OnClickListener {

    public v8(ActivityFpsSession p0) {
        this(p0, 0L, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityFpsSession d;
    public final /* synthetic */ long e;

    public /* synthetic */ v8(ActivityFpsSession activityFpsSession, long j, int i) {
        this.c = i;
        this.d = activityFpsSession;
        this.e = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TypefaceSpan typefaceSpan;
        TypefaceSpan typefaceSpan2;
        TypefaceSpan typefaceSpan3;
        int i = this.c;
        long j = this.e;
        ActivityFpsSession activityFpsSession = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityFpsSession.I0;
                wv.w(activityFpsSession, "this$0");
                ArrayList q = activityFpsSession.D0.q(j);
                int size = ((ArrayList) qv.e2(q)).size();
                Float[] fArr = new Float[size];
                for (int i2 = 0; i2 < size; i2++) {
                    fArr[i2] = Float.valueOf(0.0f);
                }
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList = (ArrayList) it.next();
                    wv.v(arrayList, "row");
                    Iterator it2 = qv.z2(arrayList).iterator();
                    while (it2.hasNext()) {
                        cs0 cs0Var = (cs0) it2.next();
                        int i3 = cs0Var.f80a;
                        fArr[i3] = Float.valueOf(((Number) cs0Var.b).floatValue() + fArr[i3].floatValue());
                    }
                }
                StringBuilder sb = new StringBuilder("CPU    AVG\n");
                int size2 = q.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append("CPU" + i4 + "   " + ((int) (fArr[i4].floatValue() / size2)) + "\n");
                }
                int i5 = x60.f681a;
                String sb2 = sb.toString();
                wv.v(sb2, "text.toString()");
                SpannableString spannableString = new SpannableString(sb2);
                if (Build.VERSION.SDK_INT >= 28) {
                    File file = new File("/system/fonts/DroidSansMono.ttf");
                    typefaceSpan = z.m(file.exists() ? Typeface.createFromFile(file) : Typeface.MONOSPACE);
                } else {
                    typefaceSpan = new TypefaceSpan("monospace");
                }
                spannableString.setSpan(typefaceSpan, 0, sb2.length(), 18);
                fs1.F(activityFpsSession, "CPU Usage", spannableString, (Runnable) null);
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityFpsSession.I0;
                wv.w(activityFpsSession, "this$0");
                ArrayList p = activityFpsSession.D0.p(j);
                int size3 = ((ArrayList) qv.e2(p)).size();
                Integer[] numArr = new Integer[size3];
                for (int i6 = 0; i6 < size3; i6++) {
                    numArr[i6] = 0;
                }
                Iterator it3 = p.iterator();
                while (it3.hasNext()) {
                    ArrayList arrayList2 = (ArrayList) it3.next();
                    wv.v(arrayList2, "row");
                    Iterator it4 = qv.z2(arrayList2).iterator();
                    while (it4.hasNext()) {
                        cs0 cs0Var2 = (cs0) it4.next();
                        int i7 = cs0Var2.f80a;
                        numArr[i7] = Integer.valueOf(((Number) cs0Var2.b).intValue() + numArr[i7].intValue());
                    }
                }
                StringBuilder sb3 = new StringBuilder("CPU    AVG\n");
                int size4 = p.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    sb3.append("CPU" + i8 + "   " + (numArr[i8].intValue() / size4) + "\n");
                }
                int i9 = x60.f681a;
                String sb4 = sb3.toString();
                wv.v(sb4, "text.toString()");
                SpannableString spannableString2 = new SpannableString(sb4);
                if (Build.VERSION.SDK_INT >= 28) {
                    File file2 = new File("/system/fonts/DroidSansMono.ttf");
                    typefaceSpan2 = z.m(file2.exists() ? Typeface.createFromFile(file2) : Typeface.MONOSPACE);
                } else {
                    typefaceSpan2 = new TypefaceSpan("monospace");
                }
                spannableString2.setSpan(typefaceSpan2, 0, sb4.length(), 18);
                fs1.F(activityFpsSession, "CPU Frequencies", spannableString2, (Runnable) null);
                return;
            default:
                gu0[] gu0VarArr3 = ActivityFpsSession.I0;
                wv.w(activityFpsSession, "this$0");
                ArrayList o = activityFpsSession.D0.o(j);
                int size5 = ((ArrayList) qv.e2(o)).size();
                Integer[] numArr2 = new Integer[size5];
                for (int i10 = 0; i10 < size5; i10++) {
                    numArr2[i10] = 0;
                }
                Iterator it5 = o.iterator();
                while (it5.hasNext()) {
                    ArrayList arrayList3 = (ArrayList) it5.next();
                    wv.v(arrayList3, "row");
                    Iterator it6 = qv.z2(arrayList3).iterator();
                    while (it6.hasNext()) {
                        cs0 cs0Var3 = (cs0) it6.next();
                        int i11 = cs0Var3.f80a;
                        numArr2[i11] = Integer.valueOf(((Number) cs0Var3.b).intValue() + numArr2[i11].intValue());
                    }
                }
                StringBuilder sb5 = new StringBuilder("CPU    AVG\n");
                int size6 = o.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    sb5.append("CPU" + i12 + "   " + (numArr2[i12].intValue() / size6) + "\n");
                }
                int i13 = x60.f681a;
                String sb6 = sb5.toString();
                wv.v(sb6, "text.toString()");
                SpannableString spannableString3 = new SpannableString(sb6);
                if (Build.VERSION.SDK_INT >= 28) {
                    File file3 = new File("/system/fonts/DroidSansMono.ttf");
                    typefaceSpan3 = z.m(file3.exists() ? Typeface.createFromFile(file3) : Typeface.MONOSPACE);
                } else {
                    typefaceSpan3 = new TypefaceSpan("monospace");
                }
                spannableString3.setSpan(typefaceSpan3, 0, sb6.length(), 18);
                fs1.F(activityFpsSession, "CPU Cycles", spannableString3, (Runnable) null);
                return;
        }
    }
}
