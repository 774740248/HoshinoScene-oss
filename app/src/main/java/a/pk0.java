package a;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.omarea.Scene;
import com.omarea.model.AppInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class pk0 implements View.OnClickListener {

    public pk0(vk0 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ vk0 d;

    public /* synthetic */ pk0(vk0 vk0Var, int i) {
        this.c = i;
        this.d = vk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        int i2 = 0;
        vk0 vk0Var = this.d;
        switch (i) {
            case 0:
                fa0 fa0Var = vk0.g0;
                wv.w(vk0Var, "this$0");
                kk0 K = vk0Var.K();
                nh adapter = vk0Var.T().getAdapter();
                wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppList");
                ArrayList c = adapter.c();
                if (c.isEmpty()) {
                    cp cpVar = Scene.c;
                    fs1.W(2131951880, 0);
                    return;
                }
                final int i3 = 3;
                Object obj = null;
                if (vk0Var.b0 == 3) {
                    a5 a5Var = vk0Var.a0;
                    if (a5Var == null) {
                        wv.M1("myHandler");
                        throw null;
                    }
                    final k40 k40Var = new k40(K, c, a5Var);
                    View inflate = k40Var.f281a.getLayoutInflater().inflate(2131558509, (ViewGroup) null);
                    int i4 = x60.f681a;
                    Activity activity = k40Var.f281a;
                    wv.v(inflate, "view");
                    final v60 m = fs1.m(activity, inflate, true);
                    View findViewById = inflate.findViewById(2131361996);
                    if (findViewById != null) {
                        final int i5 = 10;
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i6 = i5;
                                k40 k40Var2 = k40Var;
                                v60 v60Var = m;
                                switch (i6) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.h();
                                        return;
                                }
                            }
                        });
                    }
                    Iterator it = k40Var.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (k40Var.e(((AppInfo) next).getPackageName())) {
                                obj = next;
                            }
                        }
                    }
                    a.q10.a = obj == null ? 0 : 1;
                    View findViewById2 = inflate.findViewById(2131362027);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(a.q10.a != 0 ? 0 : 8);
                        final int i6 = 11;
                        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i6;
                                k40 k40Var2 = k40Var;
                                v60 v60Var = m;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.h();
                                        return;
                                }
                            }
                        });
                    }
                    View findViewById3 = inflate.findViewById(2131362026);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(a.q10.a != 0 ? 0 : 8);
                        final int i7 = 12;
                        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i7;
                                k40 k40Var2 = k40Var;
                                v60 v60Var = m;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.h();
                                        return;
                                }
                            }
                        });
                    }
                    View findViewById4 = inflate.findViewById(2131361965);
                    if (findViewById4 != null) {
                        final int i8 = 13;
                        findViewById4.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i8;
                                k40 k40Var2 = k40Var;
                                v60 v60Var = m;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var2, "this$0");
                                        v60Var.a();
                                        k40Var2.h();
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (c.size() == 1) {
                    AppInfo appInfo = (AppInfo) qv.e2(c);
                    a5 a5Var2 = vk0Var.a0;
                    if (a5Var2 != null) {
                        new p80(K, appInfo, a5Var2).w();
                        return;
                    } else {
                        wv.M1("myHandler");
                        throw null;
                    }
                }
                if (vk0Var.b0 == 1) {
                    a5 a5Var3 = vk0Var.a0;
                    if (a5Var3 == null) {
                        wv.M1("myHandler");
                        throw null;
                    }
                    final k40 k40Var2 = new k40(K, c, a5Var3);
                    Activity activity2 = k40Var2.f281a;
                    View inflate2 = activity2.getLayoutInflater().inflate(2131558508, (ViewGroup) null);
                    int i9 = x60.f681a;
                    Activity activity3 = k40Var2.f281a;
                    wv.v(inflate2, "dialogView");
                    final v60 m2 = fs1.m(activity3, inflate2, true);
                    View findViewById5 = inflate2.findViewById(2131362017);
                    if (findViewById5 != null) {
                        findViewById5.setVisibility(8);
                    }
                    View findViewById6 = inflate2.findViewById(2131362006);
                    if (findViewById6 != null) {
                        findViewById6.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i2;
                                k40 k40Var22 = k40Var2;
                                v60 v60Var = m2;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.h();
                                        return;
                                }
                            }
                        });
                    }
                    if (Build.VERSION.SDK_INT < 30 || b0.s()) {
                        View findViewById7 = inflate2.findViewById(2131362005);
                        if (findViewById7 != null) {
                            findViewById7.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
        java.lang.Object r3 = null;
                                    int i62 = r3;
                                    k40 k40Var22 = k40Var2;
                                    v60 v60Var = m2;
                                    switch (i62) {
                                        case 0:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.f();
                                            return;
                                        case 1:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.d();
                                            return;
                                        case 2:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.p();
                                            return;
                                        case 3:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.i();
                                            return;
                                        case 4:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.n();
                                            return;
                                        case 5:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.f();
                                            return;
                                        case 6:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.q(false);
                                            return;
                                        case 7:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.i();
                                            return;
                                        case 8:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.g();
                                            return;
                                        case 9:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.n();
                                            return;
                                        case 10:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.o();
                                            return;
                                        case 11:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.o();
                                            return;
                                        case 12:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.o();
                                            return;
                                        default:
                                            wv.w(v60Var, "$dialog");
                                            wv.w(k40Var22, "this$0");
                                            v60Var.a();
                                            k40Var22.h();
                                            return;
                                    }
                                }
                            });
                        }
                    } else {
                        View findViewById8 = inflate2.findViewById(2131362005);
                        if (findViewById8 != null) {
                            findViewById8.setVisibility(8);
                        }
                    }
                    View findViewById9 = inflate2.findViewById(2131362019);
                    if (findViewById9 != null) {
                        final int i10 = 2;
                        findViewById9.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i10;
                                k40 k40Var22 = k40Var2;
                                v60 v60Var = m2;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.h();
                                        return;
                                }
                            }
                        });
                    }
                    View findViewById10 = inflate2.findViewById(2131362010);
                    if (findViewById10 != null) {
                        findViewById10.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i3;
                                k40 k40Var22 = k40Var2;
                                v60 v60Var = m2;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.h();
                                        return;
                                }
                            }
                        });
                    }
                    ((TextView) inflate2.findViewById(2131362018)).setText(activity2.getString(2131952862));
                    View findViewById11 = inflate2.findViewById(2131362002);
                    if (findViewById11 != null) {
                        final int i11 = 4;
                        findViewById11.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = i11;
                                k40 k40Var22 = k40Var2;
                                v60 v60Var = m2;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.h();
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                a5 a5Var4 = vk0Var.a0;
                if (a5Var4 == null) {
                    wv.M1("myHandler");
                    throw null;
                }
                final k40 k40Var3 = new k40(K, c, a5Var4);
                Activity activity4 = k40Var3.f281a;
                View inflate3 = activity4.getLayoutInflater().inflate(2131558507, (ViewGroup) null);
                int i12 = x60.f681a;
                Activity activity5 = k40Var3.f281a;
                wv.v(inflate3, "dialogView");
                final v60 m3 = fs1.m(activity5, inflate3, true);
                View findViewById12 = inflate3.findViewById(2131362017);
                if (findViewById12 != null) {
                    findViewById12.setVisibility(8);
                }
                View findViewById13 = inflate3.findViewById(2131362006);
                if (findViewById13 != null) {
                    final int i13 = 5;
                    findViewById13.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i62 = i13;
                            k40 k40Var22 = k40Var3;
                            v60 v60Var = m3;
                            switch (i62) {
                                case 0:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 1:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.d();
                                    return;
                                case 2:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.p();
                                    return;
                                case 3:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 4:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 5:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 6:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.q(false);
                                    return;
                                case 7:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 8:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.g();
                                    return;
                                case 9:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 10:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 11:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 12:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                default:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.h();
                                    return;
                            }
                        }
                    });
                }
                View findViewById14 = inflate3.findViewById(2131362020);
                if (findViewById14 != null) {
                    final int i14 = 6;
                    findViewById14.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i62 = i14;
                            k40 k40Var22 = k40Var3;
                            v60 v60Var = m3;
                            switch (i62) {
                                case 0:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 1:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.d();
                                    return;
                                case 2:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.p();
                                    return;
                                case 3:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 4:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 5:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 6:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.q(false);
                                    return;
                                case 7:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 8:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.g();
                                    return;
                                case 9:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 10:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 11:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 12:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                default:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.h();
                                    return;
                            }
                        }
                    });
                }
                View findViewById15 = inflate3.findViewById(2131362010);
                if (findViewById15 != null) {
                    final int i15 = 7;
                    findViewById15.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i62 = i15;
                            k40 k40Var22 = k40Var3;
                            v60 v60Var = m3;
                            switch (i62) {
                                case 0:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 1:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.d();
                                    return;
                                case 2:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.p();
                                    return;
                                case 3:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 4:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 5:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 6:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.q(false);
                                    return;
                                case 7:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 8:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.g();
                                    return;
                                case 9:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 10:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 11:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 12:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                default:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.h();
                                    return;
                            }
                        }
                    });
                }
                View findViewById16 = inflate3.findViewById(2131362009);
                if (findViewById16 != null) {
                    q10 q10Var = q10.f457a;
                    if (wv.e(q10.t(), "root")) {
                        findViewById16.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
        java.lang.Object r3 = null;
                                int i62 = r3;
                                k40 k40Var22 = k40Var3;
                                v60 v60Var = m3;
                                switch (i62) {
                                    case 0:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 1:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.d();
                                        return;
                                    case 2:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.p();
                                        return;
                                    case 3:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 4:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 5:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.f();
                                        return;
                                    case 6:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.q(false);
                                        return;
                                    case 7:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.i();
                                        return;
                                    case 8:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.g();
                                        return;
                                    case 9:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.n();
                                        return;
                                    case 10:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 11:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    case 12:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.o();
                                        return;
                                    default:
                                        wv.w(v60Var, "$dialog");
                                        wv.w(k40Var22, "this$0");
                                        v60Var.a();
                                        k40Var22.h();
                                        return;
                                }
                            }
                        });
                    } else {
                        i2 = 8;
                    }
                    findViewById16.setVisibility(i2);
                }
                View findViewById17 = inflate3.findViewById(2131362019);
                if (findViewById17 != null) {
                    findViewById17.setVisibility(8);
                }
                TextView textView = (TextView) inflate3.findViewById(2131362018);
                if (textView != null) {
                    textView.setText(activity4.getString(2131952862));
                }
                View findViewById18 = inflate3.findViewById(2131362002);
                if (findViewById18 != null) {
                    final int i16 = 9;
                    findViewById18.setOnClickListener(new View.OnClickListener() { // from class: a.b40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i62 = i16;
                            k40 k40Var22 = k40Var3;
                            v60 v60Var = m3;
                            switch (i62) {
                                case 0:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 1:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.d();
                                    return;
                                case 2:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.p();
                                    return;
                                case 3:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 4:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 5:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.f();
                                    return;
                                case 6:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.q(false);
                                    return;
                                case 7:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.i();
                                    return;
                                case 8:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.g();
                                    return;
                                case 9:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.n();
                                    return;
                                case 10:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 11:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                case 12:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.o();
                                    return;
                                default:
                                    wv.w(v60Var, "$dialog");
                                    wv.w(k40Var22, "this$0");
                                    v60Var.a();
                                    k40Var22.h();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                fa0 fa0Var2 = vk0.g0;
                wv.w(vk0Var, "this$0");
                view.performHapticFeedback(4);
                nh adapter2 = vk0Var.T().getAdapter();
                wv.t(adapter2, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppList");
                nh nhVar = adapter2;
                nhVar.e(((CompoundButton) view).isChecked());
                nhVar.notifyDataSetChanged();
                vk0Var.U().setVisibility(nhVar.d() ? 0 : 8);
                return;
        }
    }
}
