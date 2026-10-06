package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.omarea.common.ui.InputView;
import com.omarea.vtools.activities.ActivityAddin;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class k3 implements Runnable {

    public k3(ActivityAddin p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityAddin d;

    public /* synthetic */ k3(ActivityAddin activityAddin, int i) {
        this.c = i;
        this.d = activityAddin;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [a.ng1, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        final int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        ActivityAddin activityAddin = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityAddin.f;
                wv.w(activityAddin, "$activity");
                p30 p30Var = new p30(activityAddin, 1);
                boolean z = p30Var.f.getThemeMode().a;
                ArrayList arrayList = new ArrayList();
                ng1 obj = new ng1();
                obj.f381a = "全部隐藏";
                obj.c = "wm overscan reset;settings put global policy_control immersive.full=apps,-android,-com.android.systemui";
                arrayList.add(obj);
                ng1 obj2 = new ng1();
                obj2.f381a = "隐藏导航栏";
                obj2.c = "wm overscan reset;settings put global policy_control immersive.navigation=*";
                arrayList.add(obj2);
                ng1 obj3 = new ng1();
                obj3.f381a = "隐藏状态栏";
                obj3.c = "wm overscan reset;settings put global policy_control immersive.status=apps,-android,-com.android.systemui";
                arrayList.add(obj3);
                ng1 obj4 = new ng1();
                obj4.f381a = "恢复默认";
                obj4.c = "wm overscan reset;settings put global policy_control null";
                arrayList.add(obj4);
                ng1 obj5 = new ng1();
                obj5.f381a = "移走导航栏(overscan)";
                Resources resources = p30Var.f.getResources();
                obj5.c = ii1.d("wm overscan 0,0,0,-", resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) + 1);
                arrayList.add(obj5);
                b70 b70Var = new b70(z, arrayList, false, new w1(4, p30Var), 7);
                b70Var.t0 = "请选择操作";
                b70Var.Y();
                b70Var.V(p30Var.f.getSupportFragmentManager(), "immersive-options");
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityAddin.f;
                wv.w(activityAddin, "$context");
                new l1(activityAddin, 13).j();
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityAddin.f;
                wv.w(activityAddin, "$context");
                final v40 v40Var = new v40(activityAddin);
                View inflate = LayoutInflater.from(activityAddin).inflate(2131558495, (ViewGroup) null);
                InputView findViewById = inflate.findViewById(2131362399);
                wv.s(findViewById);
                v40Var.m = findViewById.getEditText();
                InputView findViewById2 = inflate.findViewById(2131362389);
                wv.s(findViewById2);
                v40Var.n = findViewById2.getEditText();
                InputView findViewById3 = inflate.findViewById(2131362400);
                wv.s(findViewById3);
                v40Var.o = findViewById3.getEditText();
                InputView findViewById4 = inflate.findViewById(2131362391);
                wv.s(findViewById4);
                v40Var.p = findViewById4.getEditText();
                InputView findViewById5 = inflate.findViewById(2131362398);
                wv.s(findViewById5);
                v40Var.q = findViewById5.getEditText();
                View findViewById6 = inflate.findViewById(2131362390);
                wv.s(findViewById6);
                ((Button) findViewById6).setOnClickListener(new View.OnClickListener() { // from class: a.u40
                    /* JADX WARN: Type inference failed for: r6v7, types: [a.ng1, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i3;
                        v40 v40Var2 = v40Var;
                        switch (i5) {
                            case 0:
                                wv.w(v40Var2, "this$0");
                                if (!wv.e(v40.a(v40Var2.b, "false"), "true")) {
                                    EditText editText = v40Var2.n;
                                    if (editText == null) {
                                        wv.M1("editBrand");
                                        throw null;
                                    }
                                    editText.setText(Build.BRAND);
                                    EditText editText2 = v40Var2.m;
                                    if (editText2 == null) {
                                        wv.M1("editModel");
                                        throw null;
                                    }
                                    editText2.setText(Build.MODEL);
                                    EditText editText3 = v40Var2.o;
                                    if (editText3 == null) {
                                        wv.M1("editProductName");
                                        throw null;
                                    }
                                    editText3.setText(Build.PRODUCT);
                                    EditText editText4 = v40Var2.p;
                                    if (editText4 == null) {
                                        wv.M1("editDevice");
                                        throw null;
                                    }
                                    editText4.setText(Build.DEVICE);
                                    EditText editText5 = v40Var2.q;
                                    if (editText5 != null) {
                                        editText5.setText(Build.MANUFACTURER);
                                        return;
                                    } else {
                                        wv.M1("editManufacturer");
                                        throw null;
                                    }
                                }
                                EditText editText6 = v40Var2.n;
                                if (editText6 == null) {
                                    wv.M1("editBrand");
                                    throw null;
                                }
                                String str = Build.BRAND;
                                wv.v(str, "BRAND");
                                editText6.setText(v40.a(v40Var2.c, str));
                                EditText editText7 = v40Var2.m;
                                if (editText7 == null) {
                                    wv.M1("editModel");
                                    throw null;
                                }
                                String str2 = Build.MODEL;
                                wv.v(str2, "MODEL");
                                editText7.setText(v40.a(v40Var2.d, str2));
                                EditText editText8 = v40Var2.o;
                                if (editText8 == null) {
                                    wv.M1("editProductName");
                                    throw null;
                                }
                                String str3 = Build.PRODUCT;
                                wv.v(str3, "PRODUCT");
                                editText8.setText(v40.a(v40Var2.e, str3));
                                EditText editText9 = v40Var2.p;
                                if (editText9 == null) {
                                    wv.M1("editDevice");
                                    throw null;
                                }
                                String str4 = Build.DEVICE;
                                wv.v(str4, "DEVICE");
                                editText9.setText(v40.a(v40Var2.f, str4));
                                EditText editText10 = v40Var2.q;
                                if (editText10 == null) {
                                    wv.M1("editManufacturer");
                                    throw null;
                                }
                                String str5 = Build.MANUFACTURER;
                                wv.v(str5, "MANUFACTURER");
                                editText10.setText(v40.a(v40Var2.g, str5));
                                return;
                            case 1:
                                wv.w(v40Var2, "this$0");
                                p5 p5Var = v40Var2.f622a;
                                String[] stringArray = p5Var.getResources().getStringArray(2130903046);
                                wv.v(stringArray, "context.resources.getStr….config_device_templates)");
                                ArrayList arrayList2 = new ArrayList(stringArray.length);
                                for (String str6 : stringArray) {
                                    ng1 obj6 = new ng1();
                                    obj6.f381a = str6;
                                    arrayList2.add(obj6);
                                }
                                ArrayList arrayList3 = new ArrayList(arrayList2);
                                String[] stringArray2 = p5Var.getResources().getStringArray(2130903047);
                                wv.v(stringArray2, "context.resources.getStr…ig_device_templates_data)");
                                new b70(p5Var.getThemeMode().a, arrayList3, false, new y1(arrayList3, v40Var2, stringArray2, 3), 7).V(p5Var.getSupportFragmentManager(), "device-template-chooser");
                                return;
                            default:
                                wv.w(v40Var2, "this$0");
                                int i6 = x60.f681a;
                                p5 p5Var2 = v40Var2.f622a;
                                String string = p5Var2.getString(2131952085);
                                wv.v(string, "context.getString(R.string.btn_help)");
                                String string2 = p5Var2.getString(2131952184);
                                wv.v(string2, "context.getString(R.stri…dialog_addin_device_desc)");
                                fs1.a(p5Var2, string, string2, (Runnable) null);
                                return;
                        }
                    }
                });
                View findViewById7 = inflate.findViewById(2131362403);
                wv.s(findViewById7);
                ((Button) findViewById7).setOnClickListener(new View.OnClickListener() { // from class: a.u40
                    /* JADX WARN: Type inference failed for: r6v7, types: [a.ng1, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        v40 v40Var2 = v40Var;
                        switch (i5) {
                            case 0:
                                wv.w(v40Var2, "this$0");
                                if (!wv.e(v40.a(v40Var2.b, "false"), "true")) {
                                    EditText editText = v40Var2.n;
                                    if (editText == null) {
                                        wv.M1("editBrand");
                                        throw null;
                                    }
                                    editText.setText(Build.BRAND);
                                    EditText editText2 = v40Var2.m;
                                    if (editText2 == null) {
                                        wv.M1("editModel");
                                        throw null;
                                    }
                                    editText2.setText(Build.MODEL);
                                    EditText editText3 = v40Var2.o;
                                    if (editText3 == null) {
                                        wv.M1("editProductName");
                                        throw null;
                                    }
                                    editText3.setText(Build.PRODUCT);
                                    EditText editText4 = v40Var2.p;
                                    if (editText4 == null) {
                                        wv.M1("editDevice");
                                        throw null;
                                    }
                                    editText4.setText(Build.DEVICE);
                                    EditText editText5 = v40Var2.q;
                                    if (editText5 != null) {
                                        editText5.setText(Build.MANUFACTURER);
                                        return;
                                    } else {
                                        wv.M1("editManufacturer");
                                        throw null;
                                    }
                                }
                                EditText editText6 = v40Var2.n;
                                if (editText6 == null) {
                                    wv.M1("editBrand");
                                    throw null;
                                }
                                String str = Build.BRAND;
                                wv.v(str, "BRAND");
                                editText6.setText(v40.a(v40Var2.c, str));
                                EditText editText7 = v40Var2.m;
                                if (editText7 == null) {
                                    wv.M1("editModel");
                                    throw null;
                                }
                                String str2 = Build.MODEL;
                                wv.v(str2, "MODEL");
                                editText7.setText(v40.a(v40Var2.d, str2));
                                EditText editText8 = v40Var2.o;
                                if (editText8 == null) {
                                    wv.M1("editProductName");
                                    throw null;
                                }
                                String str3 = Build.PRODUCT;
                                wv.v(str3, "PRODUCT");
                                editText8.setText(v40.a(v40Var2.e, str3));
                                EditText editText9 = v40Var2.p;
                                if (editText9 == null) {
                                    wv.M1("editDevice");
                                    throw null;
                                }
                                String str4 = Build.DEVICE;
                                wv.v(str4, "DEVICE");
                                editText9.setText(v40.a(v40Var2.f, str4));
                                EditText editText10 = v40Var2.q;
                                if (editText10 == null) {
                                    wv.M1("editManufacturer");
                                    throw null;
                                }
                                String str5 = Build.MANUFACTURER;
                                wv.v(str5, "MANUFACTURER");
                                editText10.setText(v40.a(v40Var2.g, str5));
                                return;
                            case 1:
                                wv.w(v40Var2, "this$0");
                                p5 p5Var = v40Var2.f622a;
                                String[] stringArray = p5Var.getResources().getStringArray(2130903046);
                                wv.v(stringArray, "context.resources.getStr….config_device_templates)");
                                ArrayList arrayList2 = new ArrayList(stringArray.length);
                                for (String str6 : stringArray) {
                                    ng1 obj6 = new ng1();
                                    obj6.f381a = str6;
                                    arrayList2.add(obj6);
                                }
                                ArrayList arrayList3 = new ArrayList(arrayList2);
                                String[] stringArray2 = p5Var.getResources().getStringArray(2130903047);
                                wv.v(stringArray2, "context.resources.getStr…ig_device_templates_data)");
                                new b70(p5Var.getThemeMode().a, arrayList3, false, new y1(arrayList3, v40Var2, stringArray2, 3), 7).V(p5Var.getSupportFragmentManager(), "device-template-chooser");
                                return;
                            default:
                                wv.w(v40Var2, "this$0");
                                int i6 = x60.f681a;
                                p5 p5Var2 = v40Var2.f622a;
                                String string = p5Var2.getString(2131952085);
                                wv.v(string, "context.getString(R.string.btn_help)");
                                String string2 = p5Var2.getString(2131952184);
                                wv.v(string2, "context.getString(R.stri…dialog_addin_device_desc)");
                                fs1.a(p5Var2, string, string2, (Runnable) null);
                                return;
                        }
                    }
                });
                ((Button) inflate.findViewById(2131362411)).setOnClickListener(new View.OnClickListener() { // from class: a.u40
                    /* JADX WARN: Type inference failed for: r6v7, types: [a.ng1, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i2;
                        v40 v40Var2 = v40Var;
                        switch (i5) {
                            case 0:
                                wv.w(v40Var2, "this$0");
                                if (!wv.e(v40.a(v40Var2.b, "false"), "true")) {
                                    EditText editText = v40Var2.n;
                                    if (editText == null) {
                                        wv.M1("editBrand");
                                        throw null;
                                    }
                                    editText.setText(Build.BRAND);
                                    EditText editText2 = v40Var2.m;
                                    if (editText2 == null) {
                                        wv.M1("editModel");
                                        throw null;
                                    }
                                    editText2.setText(Build.MODEL);
                                    EditText editText3 = v40Var2.o;
                                    if (editText3 == null) {
                                        wv.M1("editProductName");
                                        throw null;
                                    }
                                    editText3.setText(Build.PRODUCT);
                                    EditText editText4 = v40Var2.p;
                                    if (editText4 == null) {
                                        wv.M1("editDevice");
                                        throw null;
                                    }
                                    editText4.setText(Build.DEVICE);
                                    EditText editText5 = v40Var2.q;
                                    if (editText5 != null) {
                                        editText5.setText(Build.MANUFACTURER);
                                        return;
                                    } else {
                                        wv.M1("editManufacturer");
                                        throw null;
                                    }
                                }
                                EditText editText6 = v40Var2.n;
                                if (editText6 == null) {
                                    wv.M1("editBrand");
                                    throw null;
                                }
                                String str = Build.BRAND;
                                wv.v(str, "BRAND");
                                editText6.setText(v40.a(v40Var2.c, str));
                                EditText editText7 = v40Var2.m;
                                if (editText7 == null) {
                                    wv.M1("editModel");
                                    throw null;
                                }
                                String str2 = Build.MODEL;
                                wv.v(str2, "MODEL");
                                editText7.setText(v40.a(v40Var2.d, str2));
                                EditText editText8 = v40Var2.o;
                                if (editText8 == null) {
                                    wv.M1("editProductName");
                                    throw null;
                                }
                                String str3 = Build.PRODUCT;
                                wv.v(str3, "PRODUCT");
                                editText8.setText(v40.a(v40Var2.e, str3));
                                EditText editText9 = v40Var2.p;
                                if (editText9 == null) {
                                    wv.M1("editDevice");
                                    throw null;
                                }
                                String str4 = Build.DEVICE;
                                wv.v(str4, "DEVICE");
                                editText9.setText(v40.a(v40Var2.f, str4));
                                EditText editText10 = v40Var2.q;
                                if (editText10 == null) {
                                    wv.M1("editManufacturer");
                                    throw null;
                                }
                                String str5 = Build.MANUFACTURER;
                                wv.v(str5, "MANUFACTURER");
                                editText10.setText(v40.a(v40Var2.g, str5));
                                return;
                            case 1:
                                wv.w(v40Var2, "this$0");
                                p5 p5Var = v40Var2.f622a;
                                String[] stringArray = p5Var.getResources().getStringArray(2130903046);
                                wv.v(stringArray, "context.resources.getStr….config_device_templates)");
                                ArrayList arrayList2 = new ArrayList(stringArray.length);
                                for (String str6 : stringArray) {
                                    ng1 obj6 = new ng1();
                                    obj6.f381a = str6;
                                    arrayList2.add(obj6);
                                }
                                ArrayList arrayList3 = new ArrayList(arrayList2);
                                String[] stringArray2 = p5Var.getResources().getStringArray(2130903047);
                                wv.v(stringArray2, "context.resources.getStr…ig_device_templates_data)");
                                new b70(p5Var.getThemeMode().a, arrayList3, false, new y1(arrayList3, v40Var2, stringArray2, 3), 7).V(p5Var.getSupportFragmentManager(), "device-template-chooser");
                                return;
                            default:
                                wv.w(v40Var2, "this$0");
                                int i6 = x60.f681a;
                                p5 p5Var2 = v40Var2.f622a;
                                String string = p5Var2.getString(2131952085);
                                wv.v(string, "context.getString(R.string.btn_help)");
                                String string2 = p5Var2.getString(2131952184);
                                wv.v(string2, "context.getString(R.stri…dialog_addin_device_desc)");
                                fs1.a(p5Var2, string, string2, (Runnable) null);
                                return;
                        }
                    }
                });
                int i5 = x60.f681a;
                p5 p5Var = v40Var.f622a;
                String string = p5Var.getString(2131952098);
                wv.v(string, "context.getString(R.string.btn_save)");
                fs1.g(p5Var, "", "", inflate, new u60(string, new ya(6, v40Var), 4), (u60) null);
                if (wv.e(v40.a("persist.vtools.device.backuped", "false"), "true")) {
                    EditText editText = v40Var.n;
                    if (editText == null) {
                        wv.M1("editBrand");
                        throw null;
                    }
                    editText.setText(Build.BRAND);
                    EditText editText2 = v40Var.m;
                    if (editText2 == null) {
                        wv.M1("editModel");
                        throw null;
                    }
                    editText2.setText(Build.MODEL);
                    EditText editText3 = v40Var.o;
                    if (editText3 == null) {
                        wv.M1("editProductName");
                        throw null;
                    }
                    editText3.setText(Build.PRODUCT);
                    EditText editText4 = v40Var.p;
                    if (editText4 == null) {
                        wv.M1("editDevice");
                        throw null;
                    }
                    editText4.setText(Build.DEVICE);
                    EditText editText5 = v40Var.q;
                    if (editText5 == null) {
                        wv.M1("editManufacturer");
                        throw null;
                    }
                    editText5.setText(Build.MANUFACTURER);
                }
                try {
                    Object systemService = activityAddin.getSystemService("clipboard");
                    wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
                    ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
                    CharSequence text = itemAt != null ? itemAt.getText() : null;
                    if (text != null && text.length() != 0) {
                        byte[] decode = Base64.decode(yi1.F2(text.toString()).toString(), 0);
                        wv.v(decode, "decode(content.toString().trim(), Base64.DEFAULT)");
                        String str = new String(decode, bu.f53a);
                        Pattern compile = Pattern.compile("^.*@.*@.*@.*@.*$");
                        wv.v(compile, "compile(pattern)");
                        if (compile.matcher(str).matches()) {
                            p5 p5Var2 = v40Var.f622a;
                            String string2 = p5Var2.getString(2131952188);
                            wv.v(string2, "context.getString(R.stri…og_addin_device_template)");
                            String string3 = activityAddin.getString(2131952185);
                            wv.v(string3, "context.getString(R.stri…g_addin_device_detection)");
                            fs1.i(p5Var2, string2, string3, new xa(v40Var, 12, str), (Runnable) null);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                gu0[] gu0VarArr4 = ActivityAddin.f;
                wv.w(activityAddin, "$context");
                new l1(activityAddin, 15).g(1);
                return;
            case 4:
                gu0[] gu0VarArr5 = ActivityAddin.f;
                wv.w(activityAddin, "$context");
                new l1(activityAddin, 15).g(2);
                return;
            default:
                gu0[] gu0VarArr6 = ActivityAddin.f;
                wv.w(activityAddin, "$context");
                new p30(activityAddin, 0).d();
                return;
        }
    }
}
