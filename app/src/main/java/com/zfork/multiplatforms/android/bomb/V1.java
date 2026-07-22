package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V1 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f288short = {2335, 2307, 2307, 2311, 2308, 2381, 2392, 2392, 2323, 2328, 2304, 2329, 2331, 2328, 2326, 2323, 2393, 2320, 2326, 2330, 2322, 2332, 2334, 2331, 2331, 2322, 2309, 2326, 2311, 2311, 2393, 2324, 2328, 2330, 2392, 2323, 2328, 2304, 2329, 2331, 2328, 2326, 2323, 2392, 2320, 2326, 2330, 2322, 2394, 2332, 2334, 2331, 2331, 2322, 2309, 2394, 2305, 2370, 2393, 2373, 2393, 2372, 2394, 2362, 2360, 2355, 2372, 2394, 2320, 2326, 2330, 2322, 2332, 2334, 2331, 2331, 2322, 2309, 2326, 2311, 2311, 2393, 2324, 2328, 2330, 2393, 2326, 2311, 2332, 3119, 3135, 3118, 3125, 3116, 3112, 3075, 1391, 1407, 1390, 1397, 1388, 1384, 1347, 1405, 1392, 1392};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ V1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: renamed from: ۦۣۤۡ, reason: contains not printable characters */
    public static short[] m7011() {
        if (C0072.m6216() >= 0) {
            return f288short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0375h2 interfaceC0375h2M3746;
        AutoClickPointerBean autoClickPointerBeanM4770 = null;
        Object objM2564 = C0028.m2564(this);
        Object objM3884 = C0037.m3884(this);
        switch (C0028.m2585(this)) {
            case 0:
                W1 w1 = (W1) objM3884;
                C0073.m6305(w1);
                T1 t1M2157 = C0025.m2157(w1);
                if (t1M2157 != null) {
                    if (C0065.m4770(t1M2157) == null) {
                        t1M2157.g = new AutoClickPointerBean();
                    }
                    autoClickPointerBeanM4770 = C0065.m4770(t1M2157);
                }
                Activity activity = (Activity) objM2564;
                C0016.m610(activity);
                C0074.m6509(activity);
                C0029.m2786(new DialogC0385j0(activity, autoClickPointerBeanM4770));
                break;
            case 1:
                T t = (T) objM3884;
                C0030.m2951(t);
                C0070.m5957();
                C0381i2 c0381i2 = (C0381i2) C0077.m7245(t);
                Context contextM1755 = C0022.m1755(c0381i2);
                long jM3674 = C0036.m3674((ScriptProjectAliasBean) objM2564);
                SharedPreferences sharedPreferencesM7453 = C0078.m7453(contextM1755);
                if (sharedPreferencesM7453 != null) {
                    SharedPreferences.Editor editorM2261 = C0026.m2261(sharedPreferencesM7453);
                    StringBuilder sb = new StringBuilder(C0075.m6791(m7011(), 89, 7, 3164));
                    C0078.m7466(sb, jM3674);
                    C0027.m2422(editorM2261, C0068.m5536(sb));
                    List listM5730 = C0069.m5730(contextM1755);
                    Iterator itM4732 = C0065.m4732(listM5730);
                    while (C0036.m3657(itM4732)) {
                        if (C0036.m3674((ScriptProjectAliasBean) C0071.m6012(itM4732)) == jM3674) {
                            C0025.m2085(itM4732);
                        }
                    }
                    C0029.m2704(editorM2261, C0066.m4828(m7011(), 96, 10, 1308), C0025.m2112(listM5730));
                    try {
                        C0021.m1592(editorM2261);
                    } catch (Exception e) {
                        C0033.m3347(e);
                    }
                }
                C0021.m1646(c0381i2);
                PopupWindow popupWindowM4846 = C0066.m4846(c0381i2);
                if (popupWindowM4846 != null) {
                    C0073.m6305(popupWindowM4846);
                    c0381i2.h = null;
                }
                break;
            case 2:
                CloudBean cloudBean = (CloudBean) objM2564;
                C0348d3 c0348d3 = (C0348d3) objM3884;
                C0030.m2951(c0348d3);
                try {
                    if (!C0065.m4750(c0348d3)) {
                        String strM7205 = C0077.m7205(m7011(), 0, 89, 2423);
                        if (!C0038.m3939(C0063.m4340(cloudBean))) {
                            strM7205 = C0063.m4340(cloudBean);
                        }
                        ProgressBar progressBarM2269 = C0026.m2269(c0348d3);
                        if (progressBarM2269 != null) {
                            C0063.m4382(progressBarM2269, 0);
                        }
                        c0348d3.f = true;
                        C0063.m4410(strM7205, new C0341c3(c0348d3, C0039.m4158(C0035.m3588(C0022.m1755(c0348d3)))));
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                T t2 = (T) C0023.m1842((C0370g4) objM3884);
                if (t2 != null && (interfaceC0375h2M3746 = C0036.m3746((C0381i2) C0077.m7245(t2))) != null) {
                    C0063.m4373(C0032.m3197((C0333b2) interfaceC0375h2M3746), (ScriptProjectAliasBean) objM2564);
                    break;
                }
                break;
        }
    }
}
