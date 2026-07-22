package com.zfork.multiplatforms.android.bomb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.PointerIconCompat;
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
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o5 {
    public static boolean d;
    public static Application e;
    public static File f;
    public static String g;
    public static String h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f351short = {3148, 3145, 3165, 3160, 3149, 3164, 3177, 3147, 3158, 3155, 3164, 3162, 3149, 3075, 1624, 1612, 1613, 3024, 3008, 3025, 3018, 3027, 3031, 3068, 2063, 2079, 2062, 2069, 2060, 2056, 2083, 2077, 2064, 2064, 2768, 2772, 2768, 2776, 2786, 2761, 2756, 2765, 2776, 1001, 995, 1006, 1000, 1020, 2532, 2499, 2507, 2510, 2503, 2502, 2434, 2515, 2519, 2503, 2512, 2523, 2456, 2434, 832, 875, 871, 881, 873, 865, 874, 880, 834, 877, 872, 865, 2160, 2152, 2146, 2088, 2151, 2152, 2146, 2164, 2153, 2159, 2146, 2088, 2146, 2153, 2149, 2163, 2155, 2147, 2152, 2162, 2089, 2146, 2159, 2164, 2147, 2149, 2162, 2153, 2164, 2175, 537, 589, 606, 583, 537, 519, 519, 518, 1903, 972, 986, 988, 987, 960, 962, 996, 970, 982, 897, 965, 964, 988, 2551, 2552, 2546, 2532, 2553, 2559, 2546, 1673, 1731, 1729, 1738, 1743, 1729, 1757, 1748, 1733, 1741, 1750, 2808, 2750, 2736, 2732, 2726, 2721, 2746, 2727, 2736, 2777, 2709, 2712, 2717, 2709, 2695, 885, 814, 825, 820, 817, 828, 817, 812, 801, 333, 332, 332, 332, 332, 2083, 2149, 2155, 2167, 2159, 2146, 2153, 923, 922, 904, 2226, 2292, 2298, 2278, 2284, 2294, 2277, 2298, 2764, 2766, 2762, 2758, 2069, 2123, 2124, 2135, 2122, 2141, 2120, 2137, 2123, 2123, 1381, 1315, 1325, 1329, 1336, 1321, 1339, 1339, 1933, 1705, 1684, 1677, 1678, 1963, 1979, 1962, 1969, 1960, 1964, 1927, 1956, 1972, 1957, 1982, 1959, 1955, 1928, 1974, 1979, 1979, 1317, 1318, 1322, 1314, 1321, 1332, 1284, 1301, 1294, 1303, 1299, 1265, 1278, 1275, 1266, 1209, 1252, 1266, 1255, 1270, 1253, 1270, 1251, 1272, 1253, 757, 673, 690, 683, 2479, 1970, 1953, 1976, 2024, 1966, 1953, 1956, 1965, 2024, 1958, 1961, 1957, 1965, 2024, 1953, 1979, 2024, 1965, 1957, 1976, 1980, 1969, 2024, 1959, 1978, 2024, 1958, 1981, 1956, 1956, 2020, 2024, 1963, 1961, 1958, 1958, 1959, 1980, 2024, 1964, 1965, 1980, 1965, 1978, 1957, 1953, 1958, 1965, 2024, 1970, 1953, 1976, 2024, 1966, 1953, 1956, 1965, 2024, 1958, 1961, 1957, 1965, 605, 582, 579, 582, 583, 607, 582, 1540, 1544, 1545, 1556, 1540, 1557, 1566, 1559, 1555, 1592, 1544, 1559, 1538, 1545, 1549, 1539, 1548, 1592, 1549, 1545, 1550, 1610, 2088, 2102, 2097, 2107, 2096, 2088, 2092, 2924, 2922, 2929, 2928, 2924, 1824, 1835, 1850, 1836, 1853, 1834, 2024, 2039, 2018, 2025, 2021, 2036, 2019, 3116, 3128, 3119, 3119, 3112, 3129, 3118, 2174, 2146, 2153, 419, 422, 417, 442, 439, 1325, 1329, 1366, 1362, 1362, 2149, 2173, 2168, 2165, 2732, 2724, 2741, 410, 506, 496, 505, 406, 511, 509, 1322, 1354, 1344, 1353, 1318, 1354, 1355, 2920, 2920, 2939, 2932, 2941, 2919, 2830, 2828, 969, 969, 986, 966, 943, 941, 3140, 3140, 3159, 3147, 3111, 3110, 2459, 2459, 2440, 2457, 2450, 2437, 2540, 2542, 1912, 1899, 1908, 1894, 1802, 1803, 1486, 1485, 1500, 1487, 1502, 1474, 1451, 1449, 1759, 1756, 1741, 1758, 1743, 1747, 1727, 1726, 2746, 2727, 2738, 2749, 2746, 2726, 2750, 2732, 2757, 2759, 1282, 1378, 1388, 1285, 1385, 1384, 1186, 1218, 1228, 1189, 1228, 1230, 2989, 3053, 3043, 1482, 1478, 1479, 1498, 1482, 1499, 1488, 1497, 1501, 1526, 1478, 1497, 1484, 1479, 1475, 1485, 1474, 1526, 1475, 1479, 1472, 2152, 2148, 2149, 2168, 2152, 2169, 2162, 2171, 2175, 2845, 2837, 2820, 2833, 2941, 2841, 2846, 2838, 2943, 2878, 2865, 2852, 2873, 2854, 2869, 2943, 2533, 2465, 2469, 2466, 2471, 2466, 2473, 1891, 1899, 1914, 1903, 1795, 1895, 1888, 1896, 1793, 1856, 1871, 1882, 1863, 1880, 1867, 1793, 1858, 1863, 1868, 667, 721, 716, 731, 729, 732, 727, 2602, 2657, 2604, 2673, 2612, 2601, 2616, 2594, 2597, 2594, 2673, 2611, 2596, 2597, 2673, 2610, 2608, 2623, 2623, 2622, 2597, 2673, 2611, 2612, 2673, 2612, 2601, 2612, 2610, 2596, 2597, 2612, 2613, 2673, 2612, 2599, 2612, 2623, 2673, 2598, 2617, 2612, 2623, 2673, 2612, 2601, 2612, 2610, 2596, 2597, 2612, 2673, 2593, 2612, 2595, 2620, 2616, 2594, 2594, 2616, 2622, 2623, 2594, 2673, 2594, 2612, 2597, 2666, 2673, 2610, 2617, 2612, 2610, 2618, 2673, 2599, 2622, 2621, 2596, 2620, 2612, 2673, 2615, 2622, 2595, 2673, 2675, 2623, 2622, 2612, 2601, 2612, 2610, 2675, 2673, 2615, 2621, 2608, 2614, 2666, 2673, 2596, 2594, 2612, 2673, 2684, 2581, 2602, 2656, 2604, 2668, 2570, 2593, 2608, 2597, 2617, 2572, 2673, 2597, 2622, 2673, 2594, 2612, 2597, 2673, 2623, 2608, 2597, 2616, 2599, 2612, 2673, 2598, 2622, 2595, 2618, 2616, 2623, 2614, 2673, 2613, 2616, 2595, 2612, 2610, 2597, 2622, 2595, 2600, 2673, 2594, 2612, 2593, 2608, 2595, 2608, 2597, 2612, 2621, 2600, 2687, 1598, 1571, 1590, 1663, 1586, 1598, 1599, 1570, 1586, 1571, 1576, 1569, 1573, 1663, 1599, 1584, 1573, 1592, 1575, 1588, 1663, 1574, 1598, 1571, 1594, 1589, 1592, 1571, 1215, 1176, 1168, 1173, 1180, 1181, 1241, 1178, 1163, 1180, 1176, 1165, 1168, 1175, 1182, 1241, 1165, 1180, 1172, 1161, 1241, 1183, 1168, 1173, 1180, 1241, 1233, 1154, 1225, 1156, 1232, 2315, 2352, 2367, 2364, 2354, 2363, 2430, 2346, 2353, 2430, 2354, 2353, 2367, 2362, 2430, 2346, 2358, 2363, 2430, 2354, 2359, 2364, 2348, 2367, 2348, 2343, 2430, 2341, 2414, 2339, 2430, 2422, 2347, 2349, 2359, 2352, 2361, 2430, 2358, 2363, 2354, 2350, 2363, 2348, 2430, 2365, 2354, 2367, 2349, 2349, 2354, 2353, 2367, 2362, 2363, 2348, 2403, 2341, 2415, 2339, 2423, 2347, 2317, 2331, 2331, 2333, 2315, 2315, 2334, 2317, 2324, 2324, 2305, 2392, 2324, 2327, 2329, 2332, 2333, 2332, 2392, 2324, 2321, 2330, 2314, 2329, 2314, 2305, 2392, 2307, 2376, 2309, 2392, 2392, 2384, 2317, 2315, 2321, 2326, 2335, 2392, 2320, 2333, 2324, 2312, 2333, 2314, 2392, 2331, 2324, 2329, 2315, 2315, 2324, 2327, 2329, 2332, 2333, 2314, 2373, 2307, 2377, 2309, 2385, 2399, 2396, 2382, 2388, 2398, 2770, 2606, 1678, 1675, 1664, 1681, 1741, 1669, 1667, 1679, 1671, 1667, 1680, 1665, 1674, 1675, 1684, 1671, 1740, 1664, 1673, 1681, 2548, 2546, 2558, 2550, 2546, 2529, 2544, 2555, 2554, 2533, 2550, 453, 471, 478, 465, 472, 468, 464, 465, 472, 468, 474, 469, 470, 398, 397, 2353, 2314, 2309, 2310, 2312, 2305, 2372, 2320, 2315, 2372, 2324, 2309, 2326, 2327, 2305, 2372, 2317, 2314, 2320, 2372, 2306, 2326, 2315, 2313, 2372, 2327, 2320, 
    2326, 2317, 2314, 2307, 2372, 2322, 2309, 2312, 2321, 2305, 2398, 2372, 1224, 1267, 1276, 1279, 1265, 1272, 1213, 1257, 1266, 1213, 1261, 1276, 1263, 1262, 1272, 1213, 1265, 1266, 1267, 1274, 1213, 1275, 1263, 1266, 1264, 1213, 1262, 1257, 1263, 1268, 1267, 1274, 1213, 1259, 1276, 1265, 1256, 1272, 1191, 1213, 2278, 2241, 2249, 2252, 2245, 2244, 2176, 2257, 2261, 2245, 2258, 2265, 2202, 2176, 1992, 2019, 2031, 2041, 2017, 2025, 2018, 2040, 1994, 2021, 2016, 2025, 1811, 1854, 1828, 1844, 1848, 1825, 1842, 1829, 1911, 1850, 1848, 1829, 1842, 1911, 1840, 1846, 1850, 1842, 1828, 1911, 1848, 1849, 1911, 1840, 1846, 1850, 1842, 1852, 1854, 1851, 1851, 1842, 1829, 1846, 1831, 1831, 1913, 1844, 1848, 1850};
    public static final byte[] a = {0, 0, -92, -127};
    public static final byte[] b = {0, 0, -19, 65};
    public static final C0408n c = new C0408n(7);

    public static boolean a(Context context, Uri uri) {
        if (C0019.m1241(context, uri, 2) != 0) {
            return false;
        }
        String strM1996 = C0024.m1996(context, uri, C0032.m3209(m7100(), 34, 9, 2749));
        String strM6116 = C0072.m6116(m7100(), 43, 5, 911);
        long jM1283 = 0;
        String strM3603 = C0035.m3603(m7100(), 48, 14, 2466);
        Cursor cursorM5868 = null;
        try {
            try {
                cursorM5868 = C0070.m5868(C0028.m2615(context), uri, new String[]{strM6116}, null, null, null);
                if (C0072.m6143(cursorM5868) && !C0026.m2268(cursorM5868, 0)) {
                    jM1283 = C0019.m1283(cursorM5868, 0);
                }
            } catch (Exception e2) {
                String strM4066 = C0039.m4066(m7100(), 62, 12, 772);
                StringBuilder sb = new StringBuilder(strM3603);
                C0036.m3741(sb, e2);
                C0036.m3736(strM4066, C0068.m5536(sb));
            }
            int i = (int) jM1283;
            if (C0038.m3939(strM1996)) {
                return false;
            }
            if ((i & 4) != 0) {
                return true;
            }
            if (!C0070.m5838(C0074.m6452(m7100(), 74, 30, 2054), strM1996) || (i & 8) == 0) {
                return (C0038.m3939(strM1996) || (i & 2) == 0) ? false : true;
            }
            return true;
        } finally {
            C0064.m4635(cursorM5868);
        }
    }

    public static DialogC0421p0 j(Context context, String str, String str2, InterfaceC0415o0 interfaceC0415o0) {
        DialogC0421p0 dialogC0421p0M7361 = C0078.m7361(context, 1, true);
        C0019.m1180(C0023.m1811(dialogC0421p0M7361), C0078.m7427(m7100(), 214, 4, 1789));
        C0019.m1180(C0029.m2784(dialogC0421p0M7361), C0017.m942(str));
        C0027.m2463(dialogC0421p0M7361, str2);
        C0072.m6136(dialogC0421p0M7361);
        dialogC0421p0M7361.o = interfaceC0415o0;
        return dialogC0421p0M7361;
    }

    public static void y() {
    }

    /* JADX INFO: renamed from: ۠۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static short[] m7100() {
        if (C0016.m717() < 0) {
            return f351short;
        }
        return null;
    }

    public static void b(Cursor cursor) {
        if (cursor != null) {
            try {
                C0026.m2361(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static P4 c(D5 d5) {
        if (C0072.m6150(C0018.m1025(C0063.m4386(d5)), C0077.m7205(m7100(), 104, 8, 567))) {
            File fileM4386 = C0063.m4386(d5);
            C0447t3 c0447t3 = new C0447t3();
            c0447t3.a = new C0453u3(fileM4386, C0031.m2973(fileM4386));
            return c0447t3;
        }
        File fileM43862 = C0063.m4386(d5);
        boolean zM6512 = C0074.m6512(d5);
        int iM3947 = C0038.m3947(C0022.m1654(d5));
        G5 g5 = new G5();
        g5.e = 0;
        g5.f = new byte[1];
        g5.a = new RandomAccessFile(fileM43862, C0069.m5807(m7100(), 112, 1, 1821));
        g5.b = fileM43862;
        g5.d = zM6512;
        g5.c = iM3947;
        if (zM6512) {
            g5.e = iM3947;
        }
        return g5;
    }

    public static View f(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int iM1384 = C0020.m1384(viewGroup);
        for (int i2 = 0; i2 < iM1384; i2++) {
            View viewM899 = C0017.m899(C0077.m7229(viewGroup, i2), i);
            if (viewM899 != null) {
                return viewM899;
            }
        }
        return null;
    }

    public static boolean h(Context context, String str, String str2) {
        String strM6902;
        String str3;
        try {
            File file = new File(C0038.m4020(context), C0026.m2321(m7100(), 113, 13, 943));
            if (C0033.m3343(file)) {
                C0032.m3207(file);
            }
            if (C0038.m3939(str) || C0038.m3939(str2)) {
                strM6902 = C0076.m6902(m7100(), 126, 7, 2454);
                str3 = strM6902;
            } else {
                strM6902 = str;
                str3 = str2;
            }
            C0023.m1882(new String[]{C0077.m7205(m7100(), 133, 11, 1700), C0039.m4066(m7100(), 144, 9, 2773), C0039.m4158(file), C0024.m1945(m7100(), 153, 6, 2804), strM6902, C0077.m7205(m7100(), 159, 9, 856), C0074.m6452(m7100(), 168, 5, 380), C0037.m3829(m7100(), 173, 7, 2062), C0076.m6902(m7100(), 180, 3, 969), C0023.m1904(m7100(), 183, 8, 2207), C0063.m4315(m7100(), 191, 4, 2814), C0017.m936(m7100(), 195, 10, 2104), str3, C0018.m1070(m7100(), 205, 8, 1352), str3});
            f = file;
            g = strM6902;
            h = str3;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static SharedPreferences m(Context context) {
        if (context == null) {
            return null;
        }
        return C0029.m2737(context, C0032.m3209(m7100(), 235, 11, 1383), 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03d9 A[LOOP:0: B:35:0x0267->B:87:0x03d9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o() {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.o5.o():void");
    }

    public static void p(Context context, boolean z) {
        if (C0064.m4599()) {
            return;
        }
        if (z) {
            try {
                synchronized (C0038.m3977()) {
                    if (!C0020.m1403()) {
                        try {
                            C0077.m7165(C0063.m4315(m7100(), 920, 5, 2365));
                            E.c = true;
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (!C0078.m7465(C0038.m3977())) {
                    return;
                }
            } catch (Exception unused2) {
                d = false;
                return;
            }
        }
        com.joke.plugin.bmJiasu.xhook.call.a aVarM4666 = C0065.m4666();
        C0073.m6343(aVarM4666, context, z);
        C0071.m6030(aVarM4666);
        d = true;
    }

    public static boolean q(String str) {
        return C0072.m6150(str, C0019.m1189(m7100(), 925, 1, 2813)) || C0072.m6150(str, C0071.m5991(m7100(), 926, 1, 2674));
    }

    public static boolean r(String str, byte[] bArr, int i, int i2) {
        byte[] bArrM2092 = C0025.m2092(str, C0073.m6393());
        int length = bArrM2092.length;
        int iM3151 = C0032.m3151(length, i2);
        for (int i3 = 0; i3 < iM3151; i3++) {
            if (bArrM2092[i3] != bArr[i + i3]) {
                return false;
            }
        }
        return length == i2;
    }

    public static int t(String str) throws IOException {
        try {
            return C0029.m2721(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C0032.m3116(C0036.m3678(m7100(), 973, 39, 2404), str));
        }
    }

    public static long u(String str) throws IOException {
        try {
            return C0028.m2637(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C0032.m3116(C0025.m2151(m7100(), PointerIconCompat.TYPE_NO_DROP, 40, 1181), str));
        }
    }

    public static String v(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorM5868;
        Throwable th;
        String strM1443 = C0020.m1443(m7100(), 1052, 14, 2208);
        try {
            cursorM5868 = C0070.m5868(C0028.m2615(context), uri, new String[]{str}, null, null, null);
        } catch (Exception e2) {
            e = e2;
            cursorM5868 = null;
        } catch (Throwable th2) {
            cursorM5868 = null;
            th = th2;
        }
        try {
            try {
                if (!C0072.m6143(cursorM5868) || C0026.m2268(cursorM5868, 0)) {
                    C0064.m4635(cursorM5868);
                    return null;
                }
                String strM4675 = C0065.m4675(cursorM5868, 0);
                C0064.m4635(cursorM5868);
                return strM4675;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            String strM5544 = C0068.m5544(m7100(), 1066, 12, 1932);
            StringBuilder sb = new StringBuilder(strM1443);
            C0036.m3741(sb, e);
            C0036.m3736(strM5544, C0068.m5536(sb));
            C0064.m4635(cursorM5868);
            return null;
        }
        th = th3;
        C0064.m4635(cursorM5868);
        throw th;
    }

    public static void x(int i, double d2) {
        if (C0064.m4599()) {
            E eM3977 = C0038.m3977();
            if (i == 2) {
                C0073.m6395(C0065.m4666(), d2);
                C0065.m4664(eM3977);
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
                C0073.m6395(C0065.m4666(), d2);
            } else {
                C0031.m3026(C0065.m4666());
                synchronized (eM3977) {
                    if (C0020.m1403()) {
                        try {
                            C0072.m6202(C0072.m6135(), true);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public static void z(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int iM3212 = C0032.m3212(inputStream, bArr, 0, 8192);
            if (iM3212 < 0) {
                return;
            } else {
                C0036.m3734(outputStream, bArr, 0, iM3212);
            }
        }
    }

    public static void A(Context context, ScriptProjectBean scriptProjectBean) {
        SharedPreferences sharedPreferencesM7453 = C0078.m7453(context);
        if (sharedPreferencesM7453 != null) {
            SharedPreferences.Editor editorM2261 = C0026.m2261(sharedPreferencesM7453);
            StringBuilder sb = new StringBuilder(C0016.m625(m7100(), 0, 14, 3129));
            C0078.m7466(sb, C0073.m6309(scriptProjectBean));
            C0036.m3736(C0030.m2840(m7100(), 14, 3, 1588), C0068.m5536(sb));
            StringBuilder sb2 = new StringBuilder(C0020.m1443(m7100(), 17, 7, 2979));
            C0078.m7466(sb2, C0073.m6309(scriptProjectBean));
            C0029.m2704(editorM2261, C0068.m5536(sb2), C0025.m2112(scriptProjectBean));
            List listM5730 = C0069.m5730(context);
            Iterator itM4732 = C0065.m4732(listM5730);
            while (C0036.m3657(itM4732)) {
                ScriptProjectAliasBean scriptProjectAliasBean = (ScriptProjectAliasBean) C0071.m6012(itM4732);
                if (C0036.m3674(scriptProjectAliasBean) == C0073.m6309(scriptProjectBean)) {
                    scriptProjectAliasBean.name = C0021.m1527(scriptProjectBean);
                }
            }
            C0029.m2704(editorM2261, C0064.m4545(m7100(), 24, 10, 2172), C0025.m2112(listM5730));
            try {
                C0021.m1592(editorM2261);
            } catch (Exception e2) {
                C0033.m3347(e2);
            }
        }
    }

    public static int d(int i, Context context) {
        return (int) ((i * C0078.m7404(C0066.m4797(C0029.m2720(context)))) + 0.5f);
    }

    public static int e(Context context, float f2) {
        return (int) C0019.m1187(1, f2, C0066.m4797(C0029.m2720(context)));
    }

    public static String g(Exception exc) {
        return C0077.m7276(exc);
    }

    public static File[] i(File file) {
        String strM1025 = C0018.m1025(file);
        int iM7286 = C0077.m7286(strM1025, C0065.m4757(m7100(), 213, 1, 1955));
        if (iM7286 != -1) {
            strM1025 = C0032.m3220(strM1025, 0, iM7286);
        }
        File[] fileArrM5478 = C0067.m5478(C0033.m3328(file), new G1(strM1025));
        if (fileArrM5478 == null) {
            return new File[0];
        }
        C0078.m7354(fileArrM5478);
        return fileArrM5478;
    }

    public static ScriptProjectBean k(Context context, long j) {
        SharedPreferences sharedPreferencesM7453 = C0078.m7453(context);
        if (sharedPreferencesM7453 != null) {
            StringBuilder sb = new StringBuilder(C0029.m2695(m7100(), 218, 7, 2008));
            C0078.m7466(sb, j);
            String strM1422 = C0020.m1422(sharedPreferencesM7453, C0068.m5536(sb), C0031.m2993());
            if (!C0038.m3939(strM1422)) {
                return (ScriptProjectBean) C0078.m7413(strM1422, ScriptProjectBean.class);
            }
            return null;
        }
        return null;
    }

    public static List l(Context context) {
        SharedPreferences sharedPreferencesM7453 = C0078.m7453(context);
        if (sharedPreferencesM7453 != null) {
            String strM1422 = C0020.m1422(sharedPreferencesM7453, C0075.m6791(m7100(), 225, 10, 2007), C0031.m2993());
            if (!C0038.m3939(strM1422)) {
                return (List) C0030.m2963(strM1422, C0072.m6196(ScriptProjectAliasBean.class));
            }
        }
        return new ArrayList();
    }

    public static String n(String str) throws z5 {
        String strM6056 = str;
        if (C0072.m6224(strM6056)) {
            String strM5418 = C0067.m5418(m7100(), 246, 14, 1175);
            if (C0028.m2625(strM6056, C0039.m4087(strM5418))) {
                strM6056 = C0071.m6056(strM6056, C0077.m7286(strM6056, C0039.m4087(strM5418)) + 1);
            }
            if (C0072.m6150(strM6056, C0038.m4022(m7100(), 260, 4, 731))) {
                return C0032.m3220(strM6056, 0, C0077.m7286(strM6056, C0018.m1070(m7100(), 264, 1, 2433)));
            }
            return strM6056;
        }
        throw new z5(C0026.m2321(m7100(), 265, 62, 1992));
    }

    public static Pair s(AssetManager assetManager, File file) {
        if (C0033.m3343(file)) {
            C0032.m3207(file);
        }
        File fileM1342 = C0020.m1342();
        String strM5451 = C0067.m5451();
        String strM2144 = C0025.m2144();
        if (fileM1342 != null && C0033.m3343(fileM1342) && !C0038.m3939(strM5451) && !C0038.m3939(strM2144)) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileInputStream fileInputStream = new FileInputStream(C0020.m1342());
                    try {
                        C0016.m667(fileInputStream, fileOutputStream);
                        C0016.m636(fileInputStream);
                        Pair pair = new Pair(strM5451, strM2144);
                        C0063.m4304(fileOutputStream);
                        return pair;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        try {
            InputStream inputStreamM5812 = C0069.m5812(assetManager, C0034.m3431(m7100(), 927, 20, 1762));
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    C0016.m667(inputStreamM5812, fileOutputStream2);
                    C0063.m4304(fileOutputStream2);
                    Pair pair2 = new Pair(C0024.m1945(m7100(), 947, 11, 2451), C0069.m5807(m7100(), 958, 15, 447));
                    C0024.m1958(inputStreamM5812);
                    return pair2;
                } finally {
                }
            } finally {
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static byte[] w(InputStream inputStream, boolean z) throws Exception {
        int iM3212;
        int i = Integer.MAX_VALUE;
        byte[] bArr = null;
        ArrayList arrayList = null;
        int i2 = 0;
        do {
            int iM3151 = C0032.m3151(i, 8192);
            byte[] bArrM2567 = new byte[iM3151];
            int i3 = 0;
            while (true) {
                try {
                    iM3212 = C0032.m3212(inputStream, bArrM2567, i3, C0032.m3151(iM3151 - i3, i));
                    if (iM3212 <= 0) {
                        break;
                    }
                    i3 += iM3212;
                    i -= iM3212;
                } catch (Exception e2) {
                    if (z) {
                        iM3212 = -1;
                    } else {
                        throw e2;
                    }
                }
            }
            if (i3 > 0) {
                if (2147483639 - i2 < i3) {
                    return bArr;
                }
                if (i3 < iM3151) {
                    bArrM2567 = C0028.m2567(bArrM2567, 0, i3);
                }
                i2 += i3;
                if (bArr == null) {
                    bArr = bArrM2567;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        C0017.m919(arrayList, bArr);
                    }
                    C0077.m7162(arrayList, bArrM2567);
                }
            }
            if (iM3212 < 0) {
                break;
            }
        } while (i > 0);
        if (arrayList == null) {
            if (bArr == null) {
                return new byte[0];
            }
            if (bArr.length != i2) {
                return C0078.m7349(bArr, i2);
            }
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        Iterator itM4732 = C0065.m4732(arrayList);
        int i4 = 0;
        while (C0036.m3657(itM4732)) {
            byte[] bArr3 = (byte[]) C0071.m6012(itM4732);
            int iM31512 = C0032.m3151(bArr3.length, i2);
            C0027.m2519(bArr3, 0, bArr2, i4, iM31512);
            i4 += iM31512;
            i2 -= iM31512;
        }
        return bArr2;
    }
}
