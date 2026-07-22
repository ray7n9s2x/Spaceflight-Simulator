package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0408n implements InterfaceC0477y3 {
    public static volatile C0408n c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C0408n(int i) {
        this.a = i;
    }

    public /* synthetic */ C0408n(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    public static C0408n d() {
        if (C0071.m6024() == null) {
            synchronized (C0408n.class) {
                try {
                    if (C0071.m6024() == null) {
                        C0408n c0408n = new C0408n(0);
                        c0408n.b = new ArrayList();
                        c = c0408n;
                    }
                } finally {
                }
            }
        }
        return C0071.m6024();
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0477y3
    public void a(Object obj) {
        Long l = (Long) obj;
        InterfaceC0477y3 interfaceC0477y3M1423 = C0020.m1423((C0444t0) C0077.m7207(this));
        if (interfaceC0477y3M1423 != null) {
            C0111.m13070(interfaceC0477y3M1423, l);
        }
    }

    public void b(int i, ScriptProjectBean scriptProjectBean) {
        if (((C0408n) C0077.m7207(C0072.m6120())) != null) {
            C0063.m4382(C0022.m1686(), 0);
        }
        C0381i2 c0381i2 = (C0381i2) C0077.m7207(this);
        List listM2173 = C0025.m2173(C0024.m1983(c0381i2));
        C0037.m3901(listM2173, i);
        C0017.m930(listM2173, i, new ScriptProjectAliasBean(C0073.m6309(scriptProjectBean), C0021.m1527(scriptProjectBean)));
        C0071.m6031(C0024.m1983(c0381i2));
    }

    public Activity c() {
        ArrayList arrayList = (ArrayList) C0077.m7207(this);
        Activity activity = C0018.m1084(arrayList) > 0 ? (Activity) C0064.m4526(arrayList, C0018.m1084(arrayList) - 1) : null;
        if (activity == null || C0016.m610(activity) || C0074.m6509(activity)) {
            return null;
        }
        return activity;
    }

    public void e(boolean z) {
        C0 c0 = (C0) C0077.m7207(this);
        if (!z) {
            if (!C0029.m2785(c0)) {
                if (C0075.m6887(c0) != null) {
                    C0037.m3862(c0, false);
                    C0063.m4382(C0075.m6887(c0), 8);
                    return;
                }
                return;
            }
            c0.I = false;
            TextView textViewM7394 = C0078.m7394(c0);
            if (textViewM7394 != null) {
                C0063.m4382(textViewM7394, 8);
            }
            LinearLayout linearLayoutM4741 = C0065.m4741(c0);
            if (linearLayoutM4741 != null) {
                C0063.m4382(linearLayoutM4741, 8);
            }
            View viewM6145 = C0072.m6145(c0);
            if (viewM6145 != null) {
                C0063.m4382(viewM6145, 8);
                return;
            }
            return;
        }
        if (!C0029.m2785(c0)) {
            LinearLayout linearLayoutM6887 = C0075.m6887(c0);
            if (linearLayoutM6887 == null || C0016.m655(linearLayoutM6887) != 8) {
                return;
            }
            C0037.m3862(c0, true);
            C0063.m4382(C0075.m6887(c0), 0);
            return;
        }
        c0.I = true;
        TextView textViewM73942 = C0078.m7394(c0);
        if (textViewM73942 != null) {
            C0063.m4382(textViewM73942, 0);
        }
        LinearLayout linearLayoutM47412 = C0065.m4741(c0);
        if (linearLayoutM47412 != null) {
            C0063.m4382(linearLayoutM47412, 0);
        }
        View viewM61452 = C0072.m6145(c0);
        if (viewM61452 != null) {
            C0063.m4382(viewM61452, 0);
        }
    }

    public void f(int i, int i2) {
        C0324a0 c0324a0 = (C0324a0) C0077.m7207(C0031.m3112());
        if (c0324a0 != null) {
            if (C0029.m2785((C0) C0077.m7207(this)) && i == 2) {
                C0065.m4674(c0324a0, C0022.m1686(), C0075.m6775(C0030.m2969((C0) C0077.m7207(this))), i, i2);
            } else {
                C0065.m4674(c0324a0, C0022.m1686(), C0075.m6775(C0030.m2969((C0) C0077.m7207(this))), i, i2);
            }
        }
    }
}
