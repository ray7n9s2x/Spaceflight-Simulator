package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.InputStream;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0450u0 implements InterfaceC0477y3, InterfaceC0415o0, P0, InterfaceC0395k4, InterfaceC0471x3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f365short = {1499, 1534, 1513, 1460, 1518, 1506, 1518, 582, 624, 609, 565, 605, 634, 633, 625, 565, 609, 636, 632, 624, 1098, 1126, 1151, 1134, 1130, 1138, 1130, 1063, 1107, 1134, 1130, 1122, -1251, 1073, 1079, 1079, 1079, 1079, 1130, 1140, 1071, 1073, 1079, 1140, 1070, 1774, 1775, 1775, 1775, 2785, 2798, 2780, 2786, 2806, 2807, 2796, 2784, 2799, 2794, 2784, 2792, 2780, 2800, 2790, 2790, 2792, 2780, 2785, 2786, 2807, 2733, 2811, 2798, 2799, 571, 564, 518, 568, 556, 557, 566, 570, 565, 560, 570, 562, 518, 554, 572, 572, 562, 518, 557, 561, 556, 564, 571, 518, 560, 570, 566, 567, 631, 553, 567, 574, 1484, 1518, 1505, 1516, 1514, 1507, 835, 851, 850, 851, 850, 851, 850, 839, 885, 866, 881, 2540, 2441, 2441, 2442, 2554, 2550, 2558, 2775, 2776, 2758, 2769, 2782, 2794, 2771, 2777, 2778, 2772, 2753, 2780, 2779, 2770, 2794, 2783, 2780, 2772, 2758, 2752, 2794, 2781, 2780, 2779, 2753, 3077, 3082, 3092, 3075, 3084, 3128, 3076, 3080, 3081, 3073, 3086, 3072};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0450u0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7123() {
        if (C0065.m4647() >= 0) {
            return f365short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0477y3
    public void a(Object obj) {
        switch (C0038.m3936(this)) {
            case 0:
                AutoClickPlanBean autoClickPlanBean = (AutoClickPlanBean) obj;
                C0479z c0479z = (C0479z) C0026.m2297(this);
                Activity activityM3700 = C0036.m3700(C0038.m4007());
                if (activityM3700 != null) {
                    L lM3367 = C0033.m3367();
                    if (C0017.m871(lM3367)) {
                        return;
                    }
                    lM3367.b = autoClickPlanBean;
                    C0019.m1208(autoClickPlanBean, true);
                    DialogC0373h0 dialogC0373h0 = new DialogC0373h0(activityM3700, autoClickPlanBean);
                    dialogC0373h0.s = true;
                    ImageView imageViewM13140 = C0111.m13140(dialogC0373h0);
                    if (imageViewM13140 != null) {
                        C0037.m3860(imageViewM13140, 4);
                    }
                    dialogC0373h0.k = new C0456v0(c0479z, autoClickPlanBean, activityM3700, (Context) C0020.m1329(this));
                    dialogC0373h0.j = new ViewOnClickListenerC0462w0(0);
                    C0030.m2951((C0479z) C0023.m1892(C0063.m4409()));
                    C0024.m2021(true);
                    C0029.m2786(dialogC0373h0);
                    return;
                }
                return;
            case 1:
            case 2:
            default:
                Application application = (Application) C0020.m1329(this);
                String str = (String) obj;
                T t = (T) C0026.m2297(this);
                C0030.m2951(t);
                if (str != null && !C0077.m7292(str)) {
                    C0038.m4006(t, str);
                    return;
                }
                try {
                    InputStream inputStreamM5812 = C0069.m5812(C0036.m3768(application), C0064.m4545(m7123(), 0, 7, 1434));
                    try {
                        C0038.m4006(t, new String(C0027.m2456(inputStreamM5812, false)));
                        if (inputStreamM5812 != null) {
                            C0024.m1958(inputStreamM5812);
                            return;
                        }
                        return;
                    } finally {
                    }
                } catch (Exception unused) {
                    return;
                }
            case 3:
                Integer num = (Integer) obj;
                O1 o1 = (O1) C0026.m2297(this);
                C0030.m2951(o1);
                if (C0025.m2170(num) != -1) {
                    AutoClickPointerBean autoClickPointerBean = new AutoClickPointerBean();
                    C0019.m1231(autoClickPointerBean, C0025.m2170(num));
                    if (C0025.m2170(num) != 2) {
                        C0032.m3161(autoClickPointerBean);
                        return;
                    }
                    C0450u0 c0450u0 = new C0450u0(o1, autoClickPointerBean, 4);
                    Activity activity = (Activity) C0020.m1329(this);
                    DialogC0359f0 dialogC0359f0 = new DialogC0359f0(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
                    dialogC0359f0.a = activity;
                    dialogC0359f0.b = c0450u0;
                    LinearLayout linearLayout = new LinearLayout(activity);
                    C0016.m687(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                    C0025.m2098(linearLayout, 1);
                    C0039.m4187(linearLayout, C0078.m7454(activity));
                    TextView textView = new TextView(activity);
                    C0016.m687(textView, new LinearLayout.LayoutParams(-1, C0035.m3620(45, activity)));
                    C0066.m4801(textView, 17);
                    C0027.m2442(textView, -1);
                    C0016.m722(textView, 2, 16.0f);
                    C0022.m1661(textView, C0035.m3633(1));
                    C0019.m1180(textView, C0037.m3829(m7123(), 7, 13, 533));
                    C0065.m4689(linearLayout, textView);
                    C0065.m4689(linearLayout, C0019.m1222(dialogC0359f0, 0, activity));
                    int iM3620 = C0035.m3620(20, activity);
                    int iM36202 = C0035.m3620(16, activity);
                    int iM36203 = C0035.m3620(100, activity);
                    int iM36204 = C0035.m3620(36, activity);
                    int iM36205 = C0035.m3620(32, activity);
                    TextView textView2 = new TextView(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = iM3620;
                    C0016.m687(textView2, layoutParams);
                    C0019.m1180(textView2, C0023.m1904(m7123(), 20, 25, 1031));
                    C0016.m722(textView2, 2, 14.0f);
                    C0027.m2442(textView2, -1);
                    C0066.m4801(textView2, 17);
                    C0065.m4689(linearLayout, textView2);
                    dialogC0359f0.e = new TextView(activity);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM36203, iM36204);
                    layoutParams2.topMargin = iM36202;
                    layoutParams2.gravity = 1;
                    C0016.m687(C0016.m663(dialogC0359f0), layoutParams2);
                    C0019.m1180(C0016.m663(dialogC0359f0), C0023.m1904(m7123(), 45, 4, 1759));
                    C0016.m722(C0016.m663(dialogC0359f0), 2, 14.0f);
                    C0027.m2442(C0016.m663(dialogC0359f0), -1);
                    C0066.m4801(C0016.m663(dialogC0359f0), 17);
                    C0039.m4187(C0016.m663(dialogC0359f0), C0035.m3590(activity));
                    C0065.m4689(linearLayout, C0016.m663(dialogC0359f0));
                    dialogC0359f0.f = new SeekBar(activity);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.topMargin = iM3620;
                    layoutParams3.leftMargin = iM36205;
                    layoutParams3.rightMargin = iM36205;
                    C0016.m687(C0020.m1401(dialogC0359f0), layoutParams3);
                    C0037.m3801(C0020.m1401(dialogC0359f0), 60000);
                    int iM4330 = C0063.m4330();
                    if (iM4330 >= 26) {
                        C0039.m4181(C0020.m1401(dialogC0359f0));
                    }
                    C0036.m3677(C0020.m1401(dialogC0359f0), 1000);
                    if (iM4330 >= 29) {
                        C0019.m1236(C0020.m1401(dialogC0359f0), C0035.m3620(6, activity));
                    }
                    SeekBar seekBarM1401 = C0020.m1401(dialogC0359f0);
                    C0030.m2951(C0072.m6184());
                    C0020.m1451(seekBarM1401, C0069.m5749(C0017.m936(m7123(), 49, 25, 2691)));
                    C0030.m2951(C0072.m6184());
                    C0072.m6239(C0020.m1401(dialogC0359f0), C0069.m5749(C0078.m7427(m7123(), 74, 32, 601)));
                    C0033.m3298(C0020.m1401(dialogC0359f0), 0);
                    C0078.m7355(C0020.m1401(dialogC0359f0), false);
                    C0065.m4689(linearLayout, C0020.m1401(dialogC0359f0));
                    C0065.m4689(linearLayout, C0019.m1222(dialogC0359f0, iM3620, activity));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    C0016.m687(linearLayout2, new LinearLayout.LayoutParams(-1, C0035.m3620(49, activity)));
                    C0025.m2098(linearLayout2, 0);
                    dialogC0359f0.c = new TextView(activity);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
                    layoutParams4.weight = 1.0f;
                    C0016.m687(C0038.m3956(dialogC0359f0), layoutParams4);
                    C0066.m4801(C0038.m3956(dialogC0359f0), 17);
                    C0019.m1180(C0038.m3956(dialogC0359f0), C0023.m1904(m7123(), 106, 6, 1423));
                    C0027.m2442(C0038.m3956(dialogC0359f0), -1);
                    C0016.m722(C0038.m3956(dialogC0359f0), 2, 14.0f);
                    View view = new View(activity);
                    C0016.m687(view, new ViewGroup.LayoutParams(C0035.m3620(1, activity), -1));
                    C0028.m2660(view, C0031.m2985(C0072.m6116(m7123(), 112, 7, 864)));
                    dialogC0359f0.d = new TextView(activity);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
                    layoutParams5.weight = 1.0f;
                    C0016.m687(C0075.m6834(dialogC0359f0), layoutParams5);
                    C0066.m4801(C0075.m6834(dialogC0359f0), 17);
                    C0019.m1180(C0075.m6834(dialogC0359f0), C0111.m13097(m7123(), 119, 4, 788));
                    C0027.m2442(C0075.m6834(dialogC0359f0), C0031.m2985(C0039.m4066(m7123(), 123, 7, 2511)));
                    C0016.m722(C0075.m6834(dialogC0359f0), 2, 14.0f);
                    C0065.m4689(linearLayout2, C0038.m3956(dialogC0359f0));
                    C0065.m4689(linearLayout2, view);
                    C0065.m4689(linearLayout2, C0075.m6834(dialogC0359f0));
                    C0065.m4689(linearLayout, linearLayout2);
                    C0073.m6392(dialogC0359f0, linearLayout);
                    C0065.m4727(C0038.m3956(dialogC0359f0), new ViewOnClickListenerC0345d0(dialogC0359f0, 0));
                    C0065.m4727(C0075.m6834(dialogC0359f0), new ViewOnClickListenerC0345d0(dialogC0359f0, 1));
                    C0066.m4906(C0020.m1401(dialogC0359f0), new C0352e0(dialogC0359f0));
                    C0029.m2786(dialogC0359f0);
                    return;
                }
                return;
            case 4:
                C0030.m2951((O1) C0026.m2297(this));
                int iM2170 = C0025.m2170((Integer) obj);
                AutoClickPointerBean autoClickPointerBean2 = (AutoClickPointerBean) C0020.m1329(this);
                C0034.m3504(autoClickPointerBean2, iM2170);
                C0032.m3161(autoClickPointerBean2);
                return;
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0415o0
    public void b(DialogC0421p0 dialogC0421p0, int i) {
        G0 g0 = (G0) C0026.m2297(this);
        g0.i = false;
        if (C0065.m4651(dialogC0421p0)) {
            Activity activity = (Activity) C0020.m1329(this);
            String strM5991 = C0071.m5991(m7123(), 130, 25, 2741);
            if (!C0038.m3939(strM5991)) {
                SharedPreferences.Editor editorM2261 = C0026.m2261(C0029.m2737(activity, C0029.m2695(m7123(), ModuleDescriptor.MODULE_VERSION, 12, 3175), 0));
                C0111.m13185(editorM2261, strM5991, true);
                C0072.m6210(editorM2261);
            }
        }
        C0018.m1074(g0);
        if (i == 3) {
            C0034.m3412(g0);
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0395k4
    public void c(boolean z) {
        C0479z c0479z = (C0479z) C0026.m2297(this);
        C0030.m2951(c0479z);
        if (z) {
            C0020.m1338((D4) C0020.m1329(this));
            C0340c2 c0340c2 = (C0340c2) C0064.m4580(c0479z);
            if (C0074.m6539(C0027.m2528(c0340c2)) != null) {
                C0408n c0408nM6120 = C0072.m6120();
                C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
                if (c0408n != null) {
                    C0071.m5989(c0408n, 0, 0);
                    C0037.m3799((C0408n) C0077.m7207(c0408nM6120), true);
                }
                C0361f2 c0361f2M2528 = C0027.m2528(c0340c2);
                C0063.m4382(C0031.m3080(c0361f2M2528), 8);
                C0021.m1646(C0074.m6539(c0361f2M2528));
                C0063.m4382(C0074.m6539(c0361f2M2528), 0);
            }
        }
    }

    public void d(int i, double d, boolean z) {
        Context context = (Context) C0020.m1329(this);
        M0 m0 = (M0) C0026.m2297(this);
        if (i == 2) {
            C0030.m2902(2, d);
        } else if (i == 3) {
            C0030.m2902(3, d);
        }
        try {
            C0026.m2337(C0029.m2734(), new L0(m0, context, d, z), 200L);
        } catch (Exception unused) {
        }
    }
}
