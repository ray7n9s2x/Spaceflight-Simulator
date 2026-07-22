package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
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
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class O1 implements N0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f270short = {1164, 1200, 1209, 1213, 1199, 1209, 1276, 1192, 1189, 1196, 1209, 1276, 1205, 1202, 1276, 1198, 1209, 1215, 1203, 1198, 1208, 1276, 1202, 1213, 1201, 1209, 2791, 2768, 2774, 2778, 2759, 2769, 2758, 2709, 2754, 2780, 2753, 2781, 2709, 2758, 2772, 2776, 2768, 2709, 2779, 2772, 2776, 2768, 2709, 2772, 2777, 2759, 2768, 2772, 2769, 2764, 2709, 2768, 2765, 2780, 2758, 2753, 2768, 2769, 561, 568, 558, 568, 560, 570, 534, 535, 535, 540, 538, 525, 3155, 3167, 3166, 3166, 3157, 3155, 3140, 3183, 2719, 2707, 2706, 2706, 2713, 2719, 2696, 2723, 2717, 2704, 2704, 1208, 1162, 1181, 1166, 1227, 1192, 1156, 1158, 1179, 1159, 1166, 1183, 1166, 766, 716, 731, 712, 653, 715, 716, 708, 705, 712, 713, 507, 500, 454, 504, 492, 493, 502, 506, 501, 496, 506, 498, 454, 511, 501, 502, 504, 493, 454, 504, 492, 493, 502, 454, 506, 501, 496, 506, 498, 454, 490, 493, 502, 489, 439, 489, 503, 510, 1112, 1111, 1125, 1115, 1103, 1102, 1109, 1113, 1110, 1107, 1113, 1105, 1125, 1116, 1110, 1109, 1115, 1102, 1125, 1115, 1103, 1102, 1109, 1125, 1113, 1110, 1107, 1113, 1105, 1125, 1097, 1102, 1115, 1096, 1102, 1044, 1098, 1108, 1117, 1623, 1623, 1623, 1623, 1539, 1635, 1635, 1539, 1610, 1610, 1550, 1638, 1638, 1556, 1603, 1603, 1556, 1629, 1629, 696, 684, 685, 694, 698, 693, 688, 698, 690, 453, 465, 464, 459, 487, 456, 461, 455, 463, 496, 460, 470, 449, 453, 448, 394, 461, 458, 464, 449, 470, 470, 465, 468, 464, 396, 397, 1531, 1498, 1489, 1488, 1429, 1510, 1488, 1497, 1488, 1494, 1473, 953, 899, 900, 909, 902, 911, 970, 937, 902, 899, 905, 897, 1158, 1197, 1207, 1184, 1198, 1191, 1250, 1153, 1198, 1195, 1185, 1193, 1107, 1140, 1143, 1151, 750, 721, 724, 729, 728, 505, 475, 468, 473, 479, 470};
    public Activity a;
    public I1 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public boolean e;
    public O0 f;
    public AutoClickPlanBean g;
    public ViewOnClickListenerC0480z0 h;

    /* JADX INFO: renamed from: ۧۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6972() {
        if (C0065.m4647() > 0) {
            return f270short;
        }
        return null;
    }

    public static boolean c(O1 o1, AutoClickPlanBean autoClickPlanBean, boolean z) {
        L lM3367 = C0033.m3367();
        Activity activityM6192 = C0072.m6192(o1);
        C0030.m2951(lM3367);
        boolean zM1592 = false;
        if (autoClickPlanBean == null) {
            return false;
        }
        if (C0038.m3939(C0064.m4632(autoClickPlanBean))) {
            C0021.m1581(C0039.m4066(m6972(), 0, 26, 1244));
            return false;
        }
        if (C0078.m7371(lM3367) == null) {
            lM3367.c = new LinkedHashMap();
        }
        AutoClickContentBean autoClickContentBean = new AutoClickContentBean();
        if (C0034.m3390(lM3367, C0064.m4632(autoClickPlanBean), z)) {
            C0021.m1581(C0065.m4757(m6972(), 26, 38, 2741));
            return false;
        }
        long jM704 = 0;
        long jM4764 = !z ? C0065.m4764(autoClickPlanBean) : 0L;
        C0034.m3466(autoClickContentBean, C0064.m4632(autoClickPlanBean));
        C0022.m1691(autoClickContentBean, C0016.m673(autoClickPlanBean));
        C0020.m1448(autoClickContentBean, C0038.m3952(autoClickPlanBean));
        C0025.m2138(autoClickContentBean, C0075.m6866(lM3367));
        C0025.m2159(autoClickContentBean, C0037.m3798(lM3367));
        C0032.m3164(autoClickContentBean, C0068.m5588(autoClickPlanBean));
        lM3367.h = false;
        AutoClickBean autoClickBean = new AutoClickBean();
        C0033.m3366(autoClickBean, C0025.m2112(autoClickContentBean));
        C0028.m2620(autoClickBean, C0037.m3894(autoClickContentBean));
        C0023.m1878(autoClickBean, C0037.m3788(autoClickContentBean));
        C0031.m3002(autoClickBean, C0075.m6864(autoClickContentBean));
        if (jM4764 == 0) {
            long j = 1;
            if (C0037.m3811(C0078.m7371(lM3367)) != 0) {
                Iterator itM2001 = C0024.m2001(C0074.m6455(C0078.m7371(lM3367)));
                while (C0036.m3657(itM2001)) {
                    Long l = (Long) C0071.m6012(itM2001);
                    if (C0016.m704(l) > jM704) {
                        jM704 = C0016.m704(l);
                    }
                }
                j = 1 + jM704;
            }
            C0075.m6798(autoClickBean, j);
        } else {
            C0075.m6798(autoClickBean, jM4764);
        }
        SharedPreferences sharedPreferencesM2737 = activityM6192 == null ? null : C0029.m2737(activityM6192, C0065.m4757(m6972(), 64, 12, 633), 0);
        if (sharedPreferencesM2737 != null) {
            SharedPreferences.Editor editorM2261 = C0026.m2261(sharedPreferencesM2737);
            StringBuilder sb = new StringBuilder(C0069.m5807(m6972(), 76, 8, 3120));
            C0078.m7466(sb, C0035.m3579(autoClickBean));
            C0029.m2704(editorM2261, C0068.m5536(sb), C0025.m2112(autoClickBean));
            List listM2288 = C0026.m2288(activityM6192);
            Iterator itM4732 = C0065.m4732(listM2288);
            boolean z2 = false;
            while (C0036.m3657(itM4732)) {
                AutoClickBean autoClickBean2 = (AutoClickBean) C0071.m6012(itM4732);
                if (C0035.m3579(autoClickBean2) == C0035.m3579(autoClickBean)) {
                    C0031.m3002(autoClickBean2, C0038.m3925(autoClickBean));
                    C0033.m3366(autoClickBean2, C0078.m7336(autoClickBean));
                    z2 = true;
                }
            }
            if (!z2) {
                C0017.m930(listM2288, 0, autoClickBean);
            }
            C0029.m2704(editorM2261, C0017.m936(m6972(), 84, 11, 2812), C0025.m2112(listM2288));
            try {
                zM1592 = C0021.m1592(editorM2261);
            } catch (Exception unused) {
            }
        }
        if (zM1592) {
            C0031.m3102(C0021.m1632(lM3367), C0035.m3579(autoClickBean));
            C0479z c0479z = (C0479z) C0023.m1892(C0063.m4409());
            if (c0479z != null) {
                C0017.m859((C0) C0064.m4580(c0479z), true);
            }
            C0021.m1581(C0070.m5942(m6972(), 95, 13, 1259));
        } else {
            C0021.m1581(C0037.m3829(m6972(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 11, 685));
        }
        return true;
    }

    public static void d(O1 o1, boolean z) {
        I1 i1M5935 = C0070.m5935(o1);
        if (i1M5935 == null) {
            return;
        }
        ImageView imageViewM1432 = C0020.m1432(i1M5935);
        View viewM7407 = C0078.m7407(C0070.m5935(o1));
        View viewM2972 = C0031.m2972(C0070.m5935(o1));
        View viewM6015 = C0071.m6015(C0070.m5935(o1));
        View viewM1843 = C0023.m1843(C0070.m5935(o1));
        RelativeLayout relativeLayoutM3924 = C0038.m3924(C0070.m5935(o1));
        if (z) {
            if (imageViewM1432 != null) {
                C0030.m2951(C0072.m6184());
                C0016.m713(imageViewM1432, C0069.m5749(C0032.m3209(m6972(), 119, 38, 409)));
            }
            if (viewM7407 != null) {
                C0063.m4382(viewM7407, 8);
            }
            if (viewM2972 != null) {
                C0063.m4382(viewM2972, 8);
            }
            if (viewM6015 != null) {
                C0063.m4382(viewM6015, 8);
            }
            if (viewM1843 != null) {
                C0063.m4382(viewM1843, 8);
            }
            if (relativeLayoutM3924 != null) {
                C0063.m4382(relativeLayoutM3924, 8);
            }
            if (C0033.m3334(C0070.m5935(o1)) != null) {
                C0063.m4382(C0033.m3334(C0070.m5935(o1)), 8);
            }
            L lM3367 = C0033.m3367();
            C0030.m2951(lM3367);
            K k = new K(lM3367);
            lM3367.f = k;
            C0065.m4734(k);
            return;
        }
        if (imageViewM1432 != null) {
            C0030.m2951(C0072.m6184());
            C0016.m713(imageViewM1432, C0069.m5749(C0037.m3829(m6972(), 157, 39, 1082)));
        }
        if (viewM7407 != null) {
            C0063.m4382(viewM7407, 0);
        }
        if (viewM2972 != null) {
            C0063.m4382(viewM2972, 0);
        }
        if (viewM6015 != null) {
            C0063.m4382(viewM6015, 0);
        }
        if (relativeLayoutM3924 != null) {
            C0063.m4382(relativeLayoutM3924, 0);
        }
        if (C0033.m3334(C0070.m5935(o1)) != null) {
            C0063.m4382(C0033.m3334(C0070.m5935(o1)), 0);
        }
        L lM33672 = C0033.m3367();
        C0030.m2951(lM33672);
        C0027.m2408();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C0016.m641(C0027.m2408());
        C0031.m3001(simpleDateFormat, C0026.m2321(m6972(), 196, 19, 1582));
        C0070.m5925(simpleDateFormat, date);
        lM33672.g = false;
        H hM3353 = C0033.m3353(lM33672);
        C0017.m854(hM3353, 1001);
        C0017.m854(hM3353, 1002);
        K kM4655 = C0065.m4655(lM33672);
        if (kM4655 != null) {
            C0026.m2365(kM4655);
            C0023.m1864(C0063.m4315(m6972(), 215, 9, 729), C0021.m1650(m6972(), 224, 27, 420));
        }
        lM33672.f = null;
    }

    public static void e(O1 o1) {
        View viewM1843;
        I1 i1M5935 = C0070.m5935(o1);
        if (i1M5935 == null || (viewM1843 = C0023.m1843(i1M5935)) == null) {
            return;
        }
        if (C0016.m655(viewM1843) == 0) {
            C0063.m4382(viewM1843, 8);
        } else {
            C0063.m4382(viewM1843, 0);
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.N0
    public final boolean a() {
        return C0029.m2708(this);
    }

    @Override // com.zfork.multiplatforms.android.bomb.N0
    public final void b() {
        if (C0029.m2708(this)) {
            C0035.m3530(this);
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.N0
    public final void cancel() {
        Activity activityM1666;
        if (C0029.m2708(this)) {
            try {
                try {
                    O0 o0M6456 = C0074.m6456(this);
                    if (o0M6456 != null && (activityM1666 = C0022.m1666(o0M6456)) != null) {
                        try {
                            C0064.m4567(C0069.m5791(activityM1666), o0M6456);
                        } catch (Exception e) {
                            C0033.m3347(e);
                        }
                    }
                    C0023.m1919(C0066.m4893(this), C0070.m5935(this));
                    if (((C0479z) C0023.m1892(C0063.m4409())) != null) {
                        C0024.m2021(false);
                    }
                } catch (IllegalArgumentException | IllegalStateException | NullPointerException e2) {
                    C0033.m3347(e2);
                }
            } finally {
                this.e = false;
            }
        }
    }

    public final void h(View view) {
        I1 i1M5935 = C0070.m5935(this);
        if (i1M5935 == null) {
            return;
        }
        C0070.m5884(view, new A1(new B1(), C0066.m4893(this), C0068.m5564(this), i1M5935));
    }

    public static void g(AutoClickPointerBean autoClickPointerBean) {
        List listM6198;
        int iM3427;
        if (C0036.m3700(C0038.m4007()) != null) {
            Activity activityM3700 = C0036.m3700(C0038.m4007());
            T1 t1 = new T1(activityM3700, autoClickPointerBean);
            AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(C0033.m3367());
            if (autoClickPlanBeanM1632 == null) {
                listM6198 = null;
            } else {
                listM6198 = C0072.m6198(autoClickPlanBeanM1632);
            }
            if (listM6198 != null && C0034.m3427(listM6198) > 0) {
                iM3427 = C0034.m3427(listM6198) + 1;
                Iterator itM4732 = C0065.m4732(listM6198);
                while (C0036.m3657(itM4732)) {
                    C0038.m4001((T1) C0071.m6012(itM4732), false);
                }
            } else {
                iM3427 = 1;
            }
            C0073.m6329(t1, C0078.m7464(iM3427));
            I i = new I(t1, activityM3700, 1);
            P1 p1M2884 = C0030.m2884(t1);
            if (p1M2884 != null) {
                C0065.m4727(p1M2884, new Q1(i, 0));
            }
            P1 p1M2841 = C0030.m2841(t1);
            if (p1M2841 != null) {
                C0065.m4727(p1M2841, new Q1(i, 1));
            }
            C0022.m1658(t1);
            L lM3367 = C0033.m3367();
            AutoClickPlanBean autoClickPlanBeanM16322 = C0021.m1632(lM3367);
            if (autoClickPlanBeanM16322 != null) {
                C0067.m5507(autoClickPlanBeanM16322, t1);
                lM3367.h = true;
            }
        }
    }

    public final void f() {
        if (C0036.m3700(C0038.m4007()) != null) {
            Activity activityM3700 = C0036.m3700(C0038.m4007());
            C0450u0 c0450u0 = new C0450u0(this, activityM3700, 3);
            DialogC0331b0 dialogC0331b0 = new DialogC0331b0(activityM3700, R.style.Theme.Black.NoTitleBar.Fullscreen, 0);
            dialogC0331b0.e = activityM3700;
            dialogC0331b0.f = c0450u0;
            LinearLayout linearLayout = new LinearLayout(activityM3700);
            C0016.m687(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            C0025.m2098(linearLayout, 1);
            C0039.m4187(linearLayout, C0078.m7454(activityM3700));
            TextView textView = new TextView(activityM3700);
            C0016.m687(textView, new LinearLayout.LayoutParams(-1, C0035.m3620(45, activityM3700)));
            C0066.m4801(textView, 17);
            C0027.m2442(textView, -1);
            C0016.m722(textView, 2, 16.0f);
            C0022.m1661(textView, C0035.m3633(1));
            C0019.m1180(textView, C0078.m7427(m6972(), 251, 11, 1461));
            C0065.m4689(linearLayout, textView);
            C0065.m4689(linearLayout, C0067.m5470(dialogC0331b0, activityM3700, 0));
            int iM3620 = C0035.m3620(36, activityM3700);
            int iM36202 = C0035.m3620(16, activityM3700);
            int iM36203 = C0035.m3620(8, activityM3700);
            int iM36204 = C0035.m3620(12, activityM3700);
            dialogC0331b0.d = new TextView(activityM3700);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iM3620);
            layoutParams.leftMargin = iM36202;
            layoutParams.rightMargin = iM36202;
            layoutParams.topMargin = iM36204;
            C0016.m687(C0077.m7279(dialogC0331b0), layoutParams);
            C0019.m1180(C0077.m7279(dialogC0331b0), C0023.m1904(m6972(), 262, 12, 1002));
            C0016.m722(C0077.m7279(dialogC0331b0), 2, 14.0f);
            C0027.m2442(C0077.m7279(dialogC0331b0), -1);
            C0066.m4801(C0077.m7279(dialogC0331b0), 17);
            C0039.m4187(C0077.m7279(dialogC0331b0), C0035.m3590(activityM3700));
            dialogC0331b0.g = new TextView(activityM3700);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iM3620);
            layoutParams2.leftMargin = iM36202;
            layoutParams2.rightMargin = iM36202;
            layoutParams2.topMargin = iM36203;
            C0016.m687((TextView) C0019.m1211(dialogC0331b0), layoutParams2);
            C0019.m1180((TextView) C0019.m1211(dialogC0331b0), C0029.m2695(m6972(), 274, 12, 1218));
            C0016.m722((TextView) C0019.m1211(dialogC0331b0), 2, 14.0f);
            C0027.m2442((TextView) C0019.m1211(dialogC0331b0), -1);
            C0066.m4801((TextView) C0019.m1211(dialogC0331b0), 17);
            C0039.m4187((TextView) C0019.m1211(dialogC0331b0), C0035.m3590(activityM3700));
            dialogC0331b0.c = new TextView(activityM3700);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, iM3620);
            layoutParams3.leftMargin = iM36202;
            layoutParams3.rightMargin = iM36202;
            layoutParams3.topMargin = iM36203;
            C0016.m687(C0024.m1957(dialogC0331b0), layoutParams3);
            C0019.m1180(C0024.m1957(dialogC0331b0), C0028.m2609(m6972(), 286, 4, 1051));
            C0016.m722(C0024.m1957(dialogC0331b0), 2, 14.0f);
            C0027.m2442(C0024.m1957(dialogC0331b0), -1);
            C0066.m4801(C0024.m1957(dialogC0331b0), 17);
            C0039.m4187(C0024.m1957(dialogC0331b0), C0035.m3590(activityM3700));
            dialogC0331b0.b = new TextView(activityM3700);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, iM3620);
            layoutParams4.leftMargin = iM36202;
            layoutParams4.rightMargin = iM36202;
            layoutParams4.topMargin = iM36203;
            C0016.m687(C0063.m4445(dialogC0331b0), layoutParams4);
            C0019.m1180(C0063.m4445(dialogC0331b0), C0078.m7427(m6972(), 290, 5, 701));
            C0016.m722(C0063.m4445(dialogC0331b0), 2, 14.0f);
            C0027.m2442(C0063.m4445(dialogC0331b0), -1);
            C0066.m4801(C0063.m4445(dialogC0331b0), 17);
            C0039.m4187(C0063.m4445(dialogC0331b0), C0035.m3590(activityM3700));
            C0065.m4689(linearLayout, C0077.m7279(dialogC0331b0));
            C0065.m4689(linearLayout, (TextView) C0019.m1211(dialogC0331b0));
            C0065.m4689(linearLayout, C0024.m1957(dialogC0331b0));
            C0065.m4689(linearLayout, C0063.m4445(dialogC0331b0));
            C0065.m4689(linearLayout, C0067.m5470(dialogC0331b0, activityM3700, iM36204));
            dialogC0331b0.h = new TextView(activityM3700);
            C0016.m687((TextView) C0018.m1012(dialogC0331b0), new LinearLayout.LayoutParams(-1, -2));
            C0019.m1180((TextView) C0018.m1012(dialogC0331b0), C0064.m4545(m6972(), 295, 6, 442));
            C0038.m4016((TextView) C0018.m1012(dialogC0331b0), 0, iM36202, 0, iM36202);
            C0016.m722((TextView) C0018.m1012(dialogC0331b0), 2, 14.0f);
            C0027.m2442((TextView) C0018.m1012(dialogC0331b0), -1);
            C0066.m4801((TextView) C0018.m1012(dialogC0331b0), 17);
            C0065.m4689(linearLayout, (TextView) C0018.m1012(dialogC0331b0));
            C0073.m6392(dialogC0331b0, linearLayout);
            C0065.m4727(C0077.m7279(dialogC0331b0), new Z(dialogC0331b0, 0));
            C0065.m4727((TextView) C0019.m1211(dialogC0331b0), new Z(dialogC0331b0, 1));
            C0065.m4727(C0024.m1957(dialogC0331b0), new Z(dialogC0331b0, 2));
            C0065.m4727(C0063.m4445(dialogC0331b0), new Z(dialogC0331b0, 3));
            C0065.m4727((TextView) C0018.m1012(dialogC0331b0), new Z(dialogC0331b0, 4));
            C0063.m4409().c = new C0324a0(0, dialogC0331b0);
            C0029.m2786(dialogC0331b0);
        }
    }
}
