package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
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
import com.joke.script.bean.ScriptRecordBean;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0479z {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f377short = {1207, 1214, 1192, 1214, 1206, 1212, 1168, 1169, 1169, 1178, 1180, 1163, 1159, 1163, 1162, 1162, 1153, 1159, 1168, 1211, 2781, 2769, 2768, 2768, 2779, 2781, 2762, 2785, 2783, 2770, 2770, 442, 389, 400, 391, 404, 385, 412, 410, 411, 469, 411, 410, 385, 469, 389, 400, 391, 408, 412, 385, 385, 400, 401, 1765, 1730, 1738, 1743, 1734, 1735, 1667, 1751, 1740, 1667, 1729, 1750, 1738, 1743, 1735, 1667, 1735, 1740, 1728, 1750, 1742, 1734, 1741, 1751, 1782, 1745, 1738, 1667, 1733, 1745, 1740, 1742, 1667, 1730, 1667, 1751, 1745, 1734, 1734, 1689, 1667, 2840, 2868, 2862, 2871, 2879, 2939, 2869, 2868, 2863, 2939, 2876, 2878, 2863, 2939, 2879, 2868, 2872, 2862, 2870, 2878, 2869, 2863, 2939, 2834, 2847, 2939, 2877, 2857, 2868, 2870, 2939, 2830, 2857, 2866, 2913, 2939, 1694, 1679, 1679, 1683, 1686, 1692, 1694, 1675, 1686, 1680, 1681, 1744, 1673, 1681, 1691, 1745, 1694, 1681, 1691, 1677, 1680, 1686, 1691, 1745, 1679, 1694, 1692, 1684, 1694, 1688, 1690, 1746, 1694, 1677, 1692, 1687, 1686, 1673, 1690, 2631, 2629, 2645, 2599, 2576, 2582, 2586, 2567, 2577, 2566, 2645, 2616, 2580, 2573, 2588, 2584, 2560, 2584, 2645, 2579, 2586, 2567, 2645, 2612, 2560, 2561, 2586, 2645, 2614, 2585, 2588, 2582, 2590, 2576, 2567, 2645, 2599, 2576, 2582, 2586, 2567, 2577, 2566, 3138, 3141, 3167, 3150, 3148, 3150, 3161, 1169, 1157, 1156, 1186, 1182, 1170, 1171, 1171, 1176, 1182, 1161, 2947, 2951, 2947, 2955, 2993, 2970, 2967, 2974, 2955, 1885, 1861, 1871, 1797, 1866, 1861, 1871, 1881, 1860, 1858, 1871, 1797, 1871, 1860, 1864, 1886, 1862, 1870, 1861, 1887, 1796, 1871, 1858, 1881, 1870, 1864, 1887, 1860, 1881, 1874, 1004, 1000, 1004, 996, 990, 1013, 1016, 1009, 996, 1830, 1854, 1844, 1918, 1841, 1854, 1844, 1826, 1855, 1849, 1844, 1918, 1844, 1855, 1843, 1829, 1853, 1845, 1854, 1828, 1919, 1844, 1849, 1826, 1845, 1843, 1828, 1855, 1826, 1833, 503, 508, 496, 486, 510, 502, 509, 487, 460, 506, 503, 1053, 1078, 1082, 1068, 1076, 1084, 1079, 1069, 1055, 1072, 1077, 1084, 1436, 1467, 1459, 1462, 1471, 1470, 1530, 1451, 1455, 1471, 1448, 1443, 1504, 1530, 776, 790, 785, 795, 784, 776, 1404, 1384, 1385, 1394, 1406, 1393, 1396, 1406, 1398, 1393, 1391, 1378, 1394, 1390, 1318, 1339, 1318, 1197, 1185, 1197, 1253, 1256, 1252, 1258, 1253, 1273, 1197, 1200, 1197, 2583, 2587, 764, 752, 764, 3007, 2987, 2986, 2993, 3005, 2994, 2999, 3005, 2997, 1659, 1645, 1660, 1611, 1661, 1658, 1658, 1645, 1638, 1660, 1624, 1636, 1641, 1638, 1576, 1589, 1576, 995, 1007, 490, 487, 483, 491, 480, 469, 474, 464, 454, 475, 477, 464, 1395, 1396, 1377, 1396, 1397, 1395, 1375, 1378, 1377, 1394, 1375, 1384, 1381, 1385, 1383, 1384, 1396, 1391, 1378, 1382, 1390, 1381, 3036, 3027, 3033, 3023, 3026, 3028, 3033, 832, 847, 856, 839, 841, 847, 858, 839, 833, 832, 881, 844, 847, 860, 881, 838, 843, 839, 841, 838, 858};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ C0479z(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7146() {
        if (C0024.m2011() < 0) {
            return f377short;
        }
        return null;
    }

    public /* synthetic */ C0479z(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public static void k(boolean z) {
        if (C0022.m1686() != null) {
            C0063.m4382(C0022.m1686(), z ? 8 : 0);
        }
    }

    public void b() {
        switch (C0065.m4677(this)) {
            case 6:
                C0020.m1338((DialogC0389j4) C0023.m1892(this));
                C0029.m2786((DialogC0331b0) C0077.m7207((C0408n) C0064.m4580(this)));
                break;
            case 7:
                C0029.m2786((DialogC0331b0) C0077.m7207((C0408n) C0064.m4580(this)));
                break;
            case 8:
                C0020.m1338((DialogC0389j4) C0023.m1892(this));
                C0029.m2786((DialogC0448t4) C0077.m7207((C0408n) C0064.m4580(this)));
                break;
            default:
                C0029.m2786((DialogC0448t4) C0077.m7207((C0408n) C0064.m4580(this)));
                break;
        }
    }

    public C0479z c(String str) {
        Uri uriM4092;
        String strM5807 = C0069.m5807(m7146(), 131, 39, 1791);
        Uri uri = (Uri) C0064.m4580(this);
        Context context = (Context) C0023.m1892(this);
        try {
            uriM4092 = C0039.m4092(C0028.m2615(context), uri, strM5807, str);
        } catch (Exception unused) {
            uriM4092 = null;
        }
        if (uriM4092 != null) {
            return new C0479z(context, uriM4092);
        }
        return null;
    }

    public void d(Context context) {
        L lM3367 = C0033.m3367();
        C0031.m3098(lM3367);
        LinkedHashMap linkedHashMapM7371 = C0078.m7371(lM3367);
        if (C0037.m3811(linkedHashMapM7371) >= 20) {
            C0030.m2968(C0023.m1884(context, C0026.m2321(m7146(), 170, 43, 2677), 0));
            return;
        }
        Iterator itM2001 = C0024.m2001(C0074.m6455(linkedHashMapM7371));
        while (C0036.m3657(itM2001)) {
            Long l = (Long) C0071.m6012(itM2001);
            C0030.m2951(l);
            AutoClickPlanBean autoClickPlanBean = (AutoClickPlanBean) C0067.m5420(linkedHashMapM7371, l);
            if (autoClickPlanBean != null) {
                C0019.m1208(autoClickPlanBean, false);
            }
        }
        C0444t0 c0444t0 = (C0444t0) C0023.m1892(this);
        if (c0444t0 != null) {
            C0073.m6383(c0444t0);
        }
        StringBuilder sb = new StringBuilder(C0016.m625(m7146(), 213, 7, 3115));
        C0036.m3741(sb, context);
        C0036.m3736(C0070.m5942(m7146(), 220, 11, 1277), C0068.m5536(sb));
        C0479z c0479z = (C0479z) C0023.m1892(C0063.m4409());
        if (c0479z != null) {
            C0020.m1331(c0479z);
        }
        C0016.m709(this, context, null);
    }

    public Uri f() {
        return (Uri) C0064.m4580(this);
    }

    public boolean g() {
        return C0070.m5838(C0035.m3603(m7146(), 240, 30, 1835), C0024.m1996((Context) C0023.m1892(this), (Uri) C0064.m4580(this), C0032.m3209(m7146(), 231, 9, 3054)));
    }

    public boolean h() {
        String strM1996 = C0024.m1996((Context) C0023.m1892(this), (Uri) C0064.m4580(this), C0020.m1443(m7146(), 270, 9, 897));
        return (C0070.m5838(C0033.m3330(m7146(), 279, 30, 1872), strM1996) || C0038.m3939(strM1996)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[LOOP:1: B:23:0x00a7->B:25:0x00aa, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zfork.multiplatforms.android.bomb.C0479z[] i() {
        /*
            r62 = this;
            r11 = r62
            java.lang.Object r0 = com.android.apksig.internal.jar.C0023.m1892(r11)
            android.content.Context r0 = (android.content.Context) r0
            android.content.ContentResolver r1 = com.android.apksig.internal.util.C0028.m2615(r0)
            java.lang.Object r2 = com.joke.connectdevice.bean.C0064.m4580(r11)
            r7 = r2
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r2 = com.android.apksig.internal.apk.C0019.m1182(r7)
            android.net.Uri r2 = com.android.apksig.internal.util.C0028.m2605(r7, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            short[] r24 = m7146()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r27 = 403(0x193, float:5.65E-43)
            r25 = 309(0x135, float:4.33E-43)
            r26 = 11
            java.lang.String r24 = com.joke.plugin.gson.internal.bind.C0068.m5544(r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r3 = r24
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r6 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r10 = com.joke.plugin.gson.internal.reflect.C0070.m5868(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
        L40:
            boolean r1 = com.android.apksig.internal.asn1.C0021.m1563(r10)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r1 == 0) goto L56
            java.lang.String r1 = com.joke.connectdevice.bean.C0065.m4675(r10, r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.net.Uri r1 = com.android.apksig.util.C0031.m3036(r7, r1)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            com.android.apksig.internal.apk.stamp.C0017.m919(r8, r1)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            goto L40
        L52:
            r0 = move-exception
            goto Lb7
        L54:
            r1 = move-exception
            goto L5c
        L56:
            com.android.apksig.internal.pkcs7.C0026.m2361(r10)     // Catch: java.lang.RuntimeException -> L5a java.lang.Exception -> L9c
            goto L9c
        L5a:
            r0 = move-exception
            throw r0
        L5c:
            short[] r26 = m7146()     // Catch: java.lang.Throwable -> L52
            r29 = 1113(0x459, float:1.56E-42)
            r27 = 320(0x140, float:4.48E-43)
            r28 = 12
            java.lang.String r26 = com.joke.plugin.gson.reflect.C0072.m6116(r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L52
            r2 = r26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r3.<init>()     // Catch: java.lang.Throwable -> L52
            short[] r44 = m7146()     // Catch: java.lang.Throwable -> L52
            r47 = 1498(0x5da, float:2.099E-42)
            r45 = 332(0x14c, float:4.65E-43)
            r46 = 14
            java.lang.String r44 = com.android.apksig.internal.asn1.C0021.m1650(r44, r45, r46, r47)     // Catch: java.lang.Throwable -> L52
            r4 = r44
            com.zfork.multiplatforms.android.bomb.C0077.m7290(r3, r4)     // Catch: java.lang.Throwable -> L52
            com.android.apksig.zip.C0036.m3741(r3, r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = com.joke.plugin.gson.internal.bind.C0068.m5536(r3)     // Catch: java.lang.Throwable -> L52
            com.android.apksig.zip.C0036.m3736(r2, r1)     // Catch: java.lang.Throwable -> L52
            if (r10 == 0) goto L9c
            com.android.apksig.internal.pkcs7.C0026.m2361(r10)     // Catch: java.lang.RuntimeException -> L9a java.lang.Exception -> L9c
            goto L9c
        L9a:
            r0 = move-exception
            throw r0
        L9c:
            android.net.Uri[] r1 = new android.net.Uri[r9]
            java.lang.Object[] r1 = com.android.apksig.C0039.m4172(r8, r1)
            android.net.Uri[] r1 = (android.net.Uri[]) r1
            int r2 = r1.length
            com.zfork.multiplatforms.android.bomb.z[] r2 = new com.zfork.multiplatforms.android.bomb.C0479z[r2]
        La7:
            int r3 = r1.length
            if (r9 >= r3) goto Lb6
            com.zfork.multiplatforms.android.bomb.z r3 = new com.zfork.multiplatforms.android.bomb.z
            r4 = r1[r9]
            r3.<init>(r0, r4)
            r2[r9] = r3
            int r9 = r9 + 1
            goto La7
        Lb6:
            return r2
        Lb7:
            if (r10 == 0) goto Lbf
            com.android.apksig.internal.pkcs7.C0026.m2361(r10)     // Catch: java.lang.RuntimeException -> Lbd java.lang.Exception -> Lbf
            goto Lbf
        Lbd:
            r0 = move-exception
            throw r0
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0479z.i():com.zfork.multiplatforms.android.bomb.z[]");
    }

    public void j() {
        C0 c0 = (C0) C0064.m4580(this);
        if (C0029.m2785(c0)) {
            if (C0030.m2969(c0)) {
                c0.v = false;
                C0027.m2510(c0, (Context) C0023.m1892(this), false);
                return;
            }
            return;
        }
        LinearLayout linearLayoutM4741 = C0065.m4741(c0);
        if (linearLayoutM4741 == null || !C0030.m2969(c0)) {
            return;
        }
        C0017.m829(linearLayoutM4741);
    }

    public void m(int i, ScriptRecordBean scriptRecordBean) {
        switch (C0065.m4677(this)) {
            case 6:
                C0020.m1338((DialogC0389j4) C0023.m1892(this));
                C0408n c0408n = (C0408n) C0064.m4580(this);
                List listM2173 = C0025.m2173((C0370g4) C0074.m6579((DialogC0331b0) C0077.m7207(c0408n)));
                C0037.m3901(listM2173, i);
                C0017.m930(listM2173, i, scriptRecordBean);
                DialogC0331b0 dialogC0331b0 = (DialogC0331b0) C0077.m7207(c0408n);
                C0370g4 c0370g4 = (C0370g4) C0074.m6579(dialogC0331b0);
                c0370g4.b = listM2173;
                C0071.m6031(c0370g4);
                C0029.m2786(dialogC0331b0);
                break;
            case 7:
                C0408n c0408n2 = (C0408n) C0064.m4580(this);
                List listM21732 = C0025.m2173((C0370g4) C0074.m6579((DialogC0331b0) C0077.m7207(c0408n2)));
                C0037.m3901(listM21732, i);
                C0017.m930(listM21732, i, scriptRecordBean);
                DialogC0331b0 dialogC0331b02 = (DialogC0331b0) C0077.m7207(c0408n2);
                C0370g4 c0370g42 = (C0370g4) C0074.m6579(dialogC0331b02);
                c0370g42.b = listM21732;
                C0071.m6031(c0370g42);
                C0020.m1338((C4) C0023.m1892(this));
                C0029.m2786(dialogC0331b02);
                break;
            case 8:
                C0408n c0408n3 = (C0408n) C0064.m4580(this);
                List<ScriptRecordBean> listM21733 = C0025.m2173(C0021.m1532((DialogC0448t4) C0077.m7207(c0408n3)));
                C0037.m3901(listM21733, i);
                C0017.m930(listM21733, i, scriptRecordBean);
                DialogC0448t4 dialogC0448t4 = (DialogC0448t4) C0077.m7207(c0408n3);
                C0074.m6525(dialogC0448t4).recordList = listM21733;
                C0070.m5957();
                C0063.m4313(C0027.m2454(dialogC0448t4), C0074.m6525(dialogC0448t4));
                C0370g4 c0370g4M1532 = C0021.m1532(dialogC0448t4);
                c0370g4M1532.b = listM21733;
                C0071.m6031(c0370g4M1532);
                C0020.m1338((DialogC0389j4) C0023.m1892(this));
                C0029.m2786(dialogC0448t4);
                break;
            default:
                C0408n c0408n4 = (C0408n) C0064.m4580(this);
                List<ScriptRecordBean> listM21734 = C0025.m2173(C0021.m1532((DialogC0448t4) C0077.m7207(c0408n4)));
                C0037.m3901(listM21734, i);
                C0017.m930(listM21734, i, scriptRecordBean);
                DialogC0448t4 dialogC0448t42 = (DialogC0448t4) C0077.m7207(c0408n4);
                C0074.m6525(dialogC0448t42).recordList = listM21734;
                C0070.m5957();
                C0063.m4313(C0027.m2454(dialogC0448t42), C0074.m6525(dialogC0448t42));
                C0370g4 c0370g4M15322 = C0021.m1532(dialogC0448t42);
                c0370g4M15322.b = listM21734;
                C0071.m6031(c0370g4M15322);
                C0020.m1338((C4) C0023.m1892(this));
                C0029.m2786(dialogC0448t42);
                break;
        }
    }

    public C0479z(Context context, Uri uri) {
        this.a = 10;
        this.b = context;
        this.c = uri;
    }

    public static void a(C0479z c0479z, Context context, long j) {
        SharedPreferences sharedPreferencesM2737;
        boolean zM1592;
        C0030.m2951(c0479z);
        L lM3367 = C0033.m3367();
        AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(lM3367);
        if (autoClickPlanBeanM1632 != null && C0065.m4764(autoClickPlanBeanM1632) == j) {
            O1 o1 = (O1) C0064.m4580(c0479z);
            if (o1 != null) {
                C0063.m4438(o1);
            }
            C0031.m3098(lM3367);
        }
        Long lM5853 = C0070.m5853(j);
        LinkedHashMap linkedHashMapM7371 = C0078.m7371(lM3367);
        if (linkedHashMapM7371 != null) {
            C0069.m5761(linkedHashMapM7371, lM5853);
        }
        if (context == null) {
            sharedPreferencesM2737 = null;
        } else {
            sharedPreferencesM2737 = C0029.m2737(context, C0039.m4066(m7146(), 0, 12, 1279), 0);
        }
        if (sharedPreferencesM2737 != null) {
            SharedPreferences.Editor editorM2261 = C0026.m2261(sharedPreferencesM2737);
            StringBuilder sb = new StringBuilder(C0037.m3829(m7146(), 12, 8, 1252));
            C0078.m7466(sb, j);
            C0027.m2422(editorM2261, C0068.m5536(sb));
            List listM2288 = C0026.m2288(context);
            Iterator itM4732 = C0065.m4732(listM2288);
            while (C0036.m3657(itM4732)) {
                if (C0035.m3579((AutoClickBean) C0071.m6012(itM4732)) == j) {
                    C0025.m2085(itM4732);
                }
            }
            C0029.m2704(editorM2261, C0066.m4828(m7146(), 20, 11, 2750), C0025.m2112(listM2288));
            try {
                zM1592 = C0021.m1592(editorM2261);
            } catch (Exception unused) {
                zM1592 = false;
            }
        } else {
            zM1592 = false;
        }
        if (zM1592) {
            C0028.m2598(c0479z);
        } else if (context != null) {
            C0030.m2968(C0023.m1884(C0031.m2994(context), C0075.m6791(m7146(), 31, 23, 501), 0));
        }
    }

    public static C0479z e(Context context, Uri uri) {
        String strM3139 = C0032.m3139(uri);
        if (C0066.m4901(context, uri)) {
            strM3139 = C0019.m1182(uri);
        }
        if (strM3139 != null) {
            Uri uriM3036 = C0031.m3036(uri, strM3139);
            if (uriM3036 != null) {
                return new C0479z(context, uriM3036);
            }
            StringBuilder sb = new StringBuilder(C0066.m4828(m7146(), 54, 41, 1699));
            C0036.m3741(sb, uri);
            throw new NullPointerException(C0068.m5536(sb));
        }
        StringBuilder sb2 = new StringBuilder(C0028.m2609(m7146(), 95, 36, 2907));
        C0036.m3741(sb2, uri);
        throw new IllegalArgumentException(C0068.m5536(sb2));
    }

    public void l() {
        boolean z;
        Activity activityM3700 = C0036.m3700(C0038.m4007());
        if (activityM3700 != null) {
            List listM2288 = C0026.m2288(activityM3700);
            z = true;
            if (listM2288 != null && C0034.m3427(listM2288) != 0) {
                LinkedHashMap linkedHashMapM7371 = C0078.m7371(C0033.m3367());
                if (linkedHashMapM7371 != null) {
                    C0067.m5425(linkedHashMapM7371);
                }
                if (C0034.m3427(listM2288) > 0 && linkedHashMapM7371 != null) {
                    Iterator itM4732 = C0065.m4732(listM2288);
                    while (C0036.m3657(itM4732)) {
                        AutoClickBean autoClickBean = (AutoClickBean) C0071.m6012(itM4732);
                        if (autoClickBean != null) {
                            AutoClickContentBean autoClickContentBean = (AutoClickContentBean) C0078.m7413(C0078.m7336(autoClickBean), AutoClickContentBean.class);
                            AutoClickPlanBean autoClickPlanBean = new AutoClickPlanBean();
                            C0063.m4366(autoClickPlanBean, C0078.m7336(autoClickBean));
                            C0031.m3102(autoClickPlanBean, C0035.m3579(autoClickBean));
                            C0018.m987(autoClickPlanBean, C0075.m6864(autoClickContentBean));
                            C0032.m3193(autoClickPlanBean, C0034.m3411(autoClickContentBean));
                            C0032.m3241(autoClickPlanBean, C0036.m3731(autoClickContentBean));
                            AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(C0033.m3367());
                            if (autoClickPlanBeanM1632 != null && C0065.m4764(autoClickPlanBean) == C0065.m4764(autoClickPlanBeanM1632)) {
                                C0019.m1208(autoClickPlanBean, true);
                            }
                            List listM2265 = C0026.m2265(autoClickContentBean);
                            if (listM2265 != null) {
                                Iterator itM47322 = C0065.m4732(listM2265);
                                while (C0036.m3657(itM47322)) {
                                    AutoClickPointerBean autoClickPointerBean = (AutoClickPointerBean) C0071.m6012(itM47322);
                                    C0030.m2951(C0033.m3367());
                                    C0063.m4316(autoClickPlanBean, autoClickPointerBean);
                                }
                            }
                            C0038.m3969(linkedHashMapM7371, C0070.m5853(C0035.m3579(autoClickBean)), autoClickPlanBean);
                        }
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        C0444t0 c0444t0 = (C0444t0) C0023.m1892(this);
        if (c0444t0 != null) {
            C0073.m6383(c0444t0);
        }
        if (z) {
            C0039.m4089(this, activityM3700);
        }
    }

    public void n(Context context, AutoClickPlanBean autoClickPlanBean) {
        Activity activityM1666;
        TextView textViewM6336;
        TextView textViewM6898;
        View viewM7407;
        RelativeLayout relativeLayoutM3924;
        View viewM2972;
        View viewM3334;
        View viewM3538;
        ImageView imageViewM1432;
        View viewM6015;
        WindowInsets windowInsetsM3120;
        DisplayCutout displayCutoutM2887;
        if (C0036.m3700(C0038.m4007()) != null) {
            Activity activityM3700 = C0036.m3700(C0038.m4007());
            O1 o1 = new O1();
            o1.a = activityM3700;
            if (C0038.m3998() == null) {
                synchronized (I1.class) {
                    try {
                        if (C0038.m3998() == null) {
                            I1.p = new I1(activityM3700);
                        }
                    } finally {
                    }
                }
            }
            o1.b = C0038.m3998();
            o1.g = autoClickPlanBean;
            o1.c = (WindowManager) C0026.m2310(activityM3700, C0033.m3330(m7146(), 346, 6, 895));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            o1.d = layoutParams;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.packageName = C0038.m3957(activityM3700);
            C0068.m5564(o1).flags = 40;
            if ((C0034.m3437(C0067.m5516(C0027.m2524(activityM3700))) & 1024) == 1024) {
                C0068.m5564(o1).flags = 1320;
            }
            WindowManager.LayoutParams layoutParamsM5564 = C0068.m5564(o1);
            layoutParamsM5564.gravity = 8388659;
            layoutParamsM5564.y = C0035.m3620(16, C0072.m6192(o1));
            Display displayM5833 = C0069.m5833(C0066.m4893(o1));
            Point point = new Point();
            C0035.m3525(displayM5833, point);
            String strM3330 = C0033.m3330(m7146(), 352, 9, 1309);
            StringBuilder sb = new StringBuilder(C0038.m4022(m7146(), 361, 8, 1286));
            C0021.m1551(sb, C0068.m5537(point));
            C0077.m7290(sb, C0031.m3047(m7146(), 369, 12, 1165));
            C0021.m1551(sb, C0025.m2215(point));
            C0077.m7290(sb, C0075.m6791(m7146(), 381, 2, 2615));
            C0021.m1551(sb, C0039.m4103(C0072.m6192(o1)));
            C0077.m7290(sb, C0069.m5807(m7146(), 383, 3, 732));
            C0021.m1551(sb, C0017.m939(C0072.m6192(o1)));
            C0036.m3736(strM3330, C0068.m5536(sb));
            if (autoClickPlanBean == null) {
                o1.g = new AutoClickPlanBean();
            }
            String strM4757 = C0065.m4757(m7146(), 386, 9, 3038);
            StringBuilder sb2 = new StringBuilder(C0077.m7205(m7146(), 395, 17, 1544));
            C0078.m7466(sb2, C0065.m4764(C0074.m6542(o1)));
            C0077.m7290(sb2, C0021.m1650(m7146(), 412, 2, 975));
            C0077.m7290(sb2, C0064.m4632(C0074.m6542(o1)));
            C0023.m1864(strM4757, C0068.m5536(sb2));
            L lM3367 = C0033.m3367();
            AutoClickPlanBean autoClickPlanBeanM6542 = C0074.m6542(o1);
            lM3367.b = autoClickPlanBeanM6542;
            C0019.m1208(autoClickPlanBeanM6542, true);
            lM3367.d = C0068.m5537(point);
            lM3367.e = C0025.m2215(point);
            K1 k1 = new K1(o1, activityM3700);
            if (C0075.m6850(lM3367) == null) {
                lM3367.k = new ArrayList();
            }
            C0017.m919(C0075.m6850(lM3367), k1);
            C0034.m3413(C0029.m2720(activityM3700), C0037.m3880(C0029.m2720(activityM3700), C0063.m4315(m7146(), 426, 17, 1280), C0063.m4315(m7146(), 414, 5, 398), C0068.m5544(m7146(), 419, 7, 436)));
            lM3367.h = false;
            if (C0036.m3700(C0038.m4007()) != null) {
                Activity activityM37002 = C0036.m3700(C0038.m4007());
                C0021.m1608(C0017.m899(C0027.m2395(C0027.m2524(activityM37002)), R.id.content));
                Window windowM2524 = C0027.m2524(activityM37002);
                if (C0063.m4330() >= 28 && (windowInsetsM3120 = C0032.m3120(C0027.m2395(windowM2524))) != null && (displayCutoutM2887 = C0030.m2887(windowInsetsM3120)) != null && C0026.m2242(displayCutoutM2887) != null) {
                    C0065.m4653(displayCutoutM2887);
                }
                Rect rect = new Rect();
                C0064.m4594(C0028.m2566(C0027.m2524(activityM37002), R.id.content), rect);
                C0031.m3018(rect);
                C0039.m4103(activityM37002);
                Resources resourcesM2720 = C0029.m2720(activityM37002);
                int iM3880 = C0037.m3880(resourcesM2720, C0074.m6452(m7146(), 455, 21, 814), C0077.m7205(m7146(), 443, 5, 1291), C0037.m3829(m7146(), 448, 7, AuthApiStatusCodes.AUTH_URL_RESOLUTION));
                if (iM3880 > 0) {
                    C0034.m3413(resourcesM2720, iM3880);
                }
            }
            B1 b1 = new B1();
            I1 i1M5935 = C0070.m5935(o1);
            C0070.m5884(i1M5935, new ViewOnTouchListenerC0481z1(b1, null, i1M5935, C0066.m4893(o1), C0068.m5564(o1)));
            J1 j1 = new J1(o1, activityM3700, 1);
            I1 i1M59352 = C0070.m5935(o1);
            if (i1M59352 != null && (viewM6015 = C0071.m6015(i1M59352)) != null) {
                C0036.m3706(o1, viewM6015);
                C0065.m4727(viewM6015, j1);
            }
            C0030.m2945(C0070.m5935(o1), false);
            C0016.m697(C0070.m5935(o1), false);
            L1 l1 = new L1(o1, activityM3700);
            I1 i1M59353 = C0070.m5935(o1);
            if (i1M59353 != null && (imageViewM1432 = C0020.m1432(i1M59353)) != null) {
                C0036.m3706(o1, imageViewM1432);
                C0065.m4727(imageViewM1432, l1);
            }
            L1 l12 = new L1(o1, 1);
            I1 i1M59354 = C0070.m5935(o1);
            if (i1M59354 != null && (viewM3538 = C0035.m3538(i1M59354)) != null) {
                C0036.m3706(o1, viewM3538);
                C0065.m4727(viewM3538, l12);
            }
            M1 m1 = new M1();
            I1 i1M59355 = C0070.m5935(o1);
            if (i1M59355 != null && (viewM3334 = C0033.m3334(i1M59355)) != null) {
                C0036.m3706(o1, viewM3334);
                C0065.m4727(viewM3334, m1);
            }
            L1 l13 = new L1(o1, 2);
            I1 i1M59356 = C0070.m5935(o1);
            if (i1M59356 != null && (viewM2972 = C0031.m2972(i1M59356)) != null) {
                C0036.m3706(o1, viewM2972);
                C0065.m4727(viewM2972, l13);
            }
            L1 l14 = new L1(o1, 3);
            I1 i1M59357 = C0070.m5935(o1);
            if (i1M59357 != null && (relativeLayoutM3924 = C0038.m3924(i1M59357)) != null) {
                C0036.m3706(o1, relativeLayoutM3924);
                C0065.m4727(relativeLayoutM3924, l14);
            }
            L1 l15 = new L1(o1, 4);
            I1 i1M59358 = C0070.m5935(o1);
            if (i1M59358 != null && (viewM7407 = C0078.m7407(i1M59358)) != null) {
                C0036.m3706(o1, viewM7407);
                C0065.m4727(viewM7407, l15);
            }
            J1 j12 = new J1(o1, activityM3700, 2);
            I1 i1M59359 = C0070.m5935(o1);
            if (i1M59359 != null && (textViewM6898 = C0075.m6898(i1M59359)) != null) {
                C0065.m4727(textViewM6898, j12);
            }
            J1 j13 = new J1(o1, activityM3700, 0);
            I1 i1M593510 = C0070.m5935(o1);
            if (i1M593510 != null && (textViewM6336 = C0073.m6336(i1M593510)) != null) {
                C0065.m4727(textViewM6336, j13);
            }
            o1.f = new O0(activityM3700, o1);
            this.c = o1;
            o1.h = new ViewOnClickListenerC0480z0(this, context, 0);
            boolean zM2708 = C0029.m2708(o1);
            if (zM2708) {
                if (zM2708) {
                    C0037.m3792(C0066.m4893(o1), C0070.m5935(o1), C0068.m5564(o1));
                    return;
                }
                return;
            }
            Activity activityM6192 = C0072.m6192(o1);
            if (!(activityM6192 instanceof Activity) || (!C0016.m610(activityM6192) && !C0074.m6509(C0072.m6192(o1)))) {
                try {
                    if (C0024.m1969(C0070.m5935(o1)) != null) {
                        C0023.m1919(C0066.m4893(o1), C0070.m5935(o1));
                    }
                    C0064.m4522(C0066.m4893(o1), C0070.m5935(o1), C0068.m5564(o1));
                    o1.e = true;
                    O0 o0M6456 = C0074.m6456(o1);
                    if (o0M6456 != null && (activityM1666 = C0022.m1666(o0M6456)) != null) {
                        try {
                            C0029.m2823(C0069.m5791(activityM1666), o0M6456);
                        } catch (Exception e) {
                            C0033.m3347(e);
                        }
                    }
                } catch (WindowManager.BadTokenException e2) {
                    e = e2;
                    C0033.m3347(e);
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    C0033.m3347(e);
                } catch (IllegalStateException e4) {
                    e = e4;
                    C0033.m3347(e);
                } catch (NullPointerException e5) {
                    e = e5;
                    C0033.m3347(e);
                }
                List listM6198 = C0072.m6198(C0074.m6542(o1));
                if (listM6198 != null && C0034.m3427(listM6198) != 0) {
                    int i = 0;
                    while (i < C0034.m3427(listM6198)) {
                        T1 t1 = (T1) C0071.m6078(listM6198, i);
                        int i2 = i + 1;
                        C0073.m6329(t1, C0078.m7464(i2));
                        if (i != C0034.m3427(listM6198) - 1) {
                            C0038.m4001((T1) C0071.m6078(listM6198, i), false);
                        }
                        C0022.m1658(t1);
                        i = i2;
                    }
                    return;
                }
                C0024.m2048(o1);
            }
        }
    }
}
