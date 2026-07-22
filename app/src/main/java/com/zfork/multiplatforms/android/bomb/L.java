package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.WindowManager;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f261short = {3077, 3077, 3077, 3077, 3153, 3121, 3121, 3153, 3096, 3096, 3164, 3124, 3124, 3142, 3089, 3089, 3142, 3087, 3087, 2191, 2203, 2202, 2177, 2189, 2178, 2183, 2189, 2181, 488, 508, 509, 486, 458, 485, 480, 490, 482, 435, 425, 505, 485, 488, 487, 453, 486, 486, 505, 455, 508, 484, 436, 2885, 2889, 2841, 2821, 2824, 2823, 2853, 2822, 2822, 2841, 2848, 2823, 2845, 2828, 2843, 2847, 2824, 2821, 2900, 407, 387, 386, 409, 405, 410, 415, 405, 413, 1207, 1204, 1204, 1195, 1275, 1210, 1198, 1199, 1204, 1176, 1207, 1202, 1208, 1200, 1258, 1258, 1275, 3034, 3030, 2950, 2970, 2967, 2968, 3002, 2969, 2969, 2950, 3000, 2947, 2971, 3019, 2741, 2721, 2720, 2747, 2743, 2744, 2749, 2743, 2751, 2385, 2373, 2372, 2399, 2419, 2396, 2393, 2387, 2395, 2404, 2392, 2370, 2389, 2385, 2388, 2320, 2375, 2392, 2399, 2396, 2389, 2320, 2396, 2399, 2399, 2368, 2320, 2390, 2393, 2398, 2393, 2371, 2392, 2389, 2388, 829, 828, 769, 806, 819, 806, 823, 785, 826, 819, 828, 821, 823, 822, 882, 817, 819, 830, 830, 823, 822, 882, 879, 882, 864, 2998, 2978, 2979, 3000, 2996, 3003, 3006, 2996, 3004, 1871, 1883, 1882, 1857, 1869, 1858, 1863, 1869, 1861, 889, 876, 891, 837, 870, 870, 889, 809, 890, 893, 872, 891, 893, 809, 869, 870, 870, 889, 839, 892, 868, 820, 1164, 1176, 1177, 1154, 1166, 1153, 1156, 1166, 1158, 2726, 2738, 2739, 2728, 2692, 2731, 2734, 2724, 2732, 2707, 2735, 2741, 2722, 2726, 2723, 2791, 2740, 2739, 2726, 2741, 2739, 2692, 2731, 2734, 2724, 2732, 2711, 2728, 2734, 2729, 2739, 2722, 2741, 2807, 2807, 2807, 2791, 2657, 2677, 2676, 2671, 2659, 2668, 2665, 2659, 2667, 3183, 3195, 3194, 3169, 3149, 3170, 3175, 3181, 3173, 3124, 3118, 3181, 3170, 3175, 3181, 3173, 3149, 3168, 3194, 3123, 2590, 2578, 2641, 2654, 2651, 2641, 2649, 2683, 2652, 2630, 2647, 2624, 2628, 2643, 2654, 2575, 2746, 2742, 2805, 2810, 2815, 2805, 2813, 2754, 2815, 2811, 2803, 2742, 2731, 2995, 3007, 2995, 3056, 3071, 3066, 3056, 3064, 3031, 3062, 3071, 3058, 3050, 2995, 2990, 2995, 3026, 3038, 3026, 1180, 1160, 1161, 1170, 1182, 1169, 1172, 1182, 1174, 22674, -30277, -1666, 2208, 2238, 3278, 3290, 3291, 3264, 3276, 3267, 3270, 3276, 3268, 23422, -30121, 23178, 23472, -1390, 2730, 2740, 2791, 2810, 2810, 2791, 3298, 3318, 3319, 3308, 3296, 3311, 3306, 3296, 3304, 1251, 1271, 1270, 1261, 1217, 1262, 1259, 1249, 1257, 1238, 1258, 1264, 1255, 1251, 1254, 1186, 1265, 1270, 1251, 1264, 1270, 1217, 1262, 1259, 1249, 1257, 1234, 1261, 1259, 1260, 1270, 1255, 1264, 1203, 1203, 1203, 2188, 2200, 2201, 2178, 2190, 2177, 2180, 2190, 2182, 3088, 3076, 3077, 3102, 3122, 3101, 3096, 3090, 3098, 3109, 3097, 3075, 3092, 3088, 3093, 3153, 3102, 3091, 3077, 3088, 3096, 3103, 3125, 3102, 3078, 3103, 2452, 2432, 2433, 2458, 2454, 2457, 2460, 2454, 2462, 1566, 1546, 1547, 1552, 1596, 1555, 1558, 1564, 1556, 1579, 1559, 1549, 1562, 1566, 1563, 1631, 1552, 1565, 1547, 1566, 1558, 1553, 1586, 1552, 1545, 1562, 1605, 1873, 1885, 1873, 1057, 1077, 1076, 1071, 1059, 1068, 1065, 1059, 1067, 32050, 22113, 23497, 23810, -1069, 2928, 2940, 2928, 591, 579, 591, 2908, 2896, 2908, 3296, 3316, 3317, 3310, 3298, 3309, 3304, 3298, 3306, 903, 915, 914, 905, 933, 906, 911, 901, 909, 946, 910, 916, 899, 903, 898, 966, 905, 900, 914, 903, 911, 904, 939, 905, 912, 899, 966, 917, 911, 924, 899, 966, 987, 966, 3188, 3192, 3188, 1224, 1220, 1224, 541, 529, 541, 750, 762, 763, 736, 748, 739, 742, 748, 740, 1767, 1779, 1778, 1769, 1733, 1770, 1775, 1765, 1773, 1746, 1774, 1780, 1763, 1767, 1762, 1702, 1769, 1764, 1778, 1767, 1775, 1768, 1739, 1769, 1776, 1763, 1702, 1778, 1775, 1771, 1763, 1702, 1723, 1702, 2085, 2089, 2085, 1362, 1374, 1362, 841, 861, 860, 839, 843, 836, 833, 843, 835, 1448, 1468, 1469, 1446, 1418, 1445, 1440, 1450, 1442, 1437, 1441, 1467, 1452, 1448, 1453, 1513, 1446, 1451, 1469, 1448, 1440, 1447, 1412, 1446, 1471, 1452, 1513, 1469, 1440, 1444, 1452, 1513, 1524, 1513, 2901, 2905, 2901, 2181, 2185, 2181, 1402, 1390, 1391, 1396, 1400, 1399, 1394, 1400, 1392, 2192, 2180, 2181, 2206, 2226, 2205, 2200, 2194, 2202, 2213, 2201, 2179, 2196, 2192, 2197, 2257, 2206, 2195, 2181, 2192, 2200, 2207, 2236, 2206, 2183, 2196, 769, 781, 769, 3151, 3139, 3151, 2356, 2360, 2356, 1563, 1551, 1550, 1557, 1561, 1558, 1555, 1561, 1553, 446, 426, 427, 432, 412, 435, 438, 444, 436, 395, 439, 429, 442, 446, 443, 511, 432, 445, 427, 446, 438, 433, 394, 431, 511, 548, 552, 548, 1338, 1334, 1338, 2518, 2505, 2508, 2497, 2496, 2554, 2525, 2877, 2850, 2855, 2858, 2859, 2833, 2871, 2962, 2950, 2951, 2972, 2960, 2975, 2970, 2960, 2968, 2619, 2607, 2606, 2613, 2585, 2614, 2611, 2617, 2609, 2574, 2610, 2600, 2623, 2619, 2622, 2682, 2613, 2616, 2606, 2619, 2611, 2612, 2583, 2613, 2604, 2623, 2682, 2667, 2667, 2682, 2656, 2367, 2355, 2367, 2584, 2572, 2573, 2582, 2586, 2581, 2576, 2586, 2578, 1982, 1962, 1963, 1968, 1948, 1971, 1974, 1980, 1972, 1931, 1975, 1965, 1978, 1982, 1979, 2047, 1968, 1981, 1963, 1982, 1974, 1969, 1930, 1967, 2670, 2682, 2683, 2656, 2668, 2659, 2662, 2668, 2660, -28063, 25623, -2044, 2061, 2067, 921, 909, 908, 919, 923, 916, 913, 923, 915, -26273, 28457, 21282, 21016, -3270, 843, 853, 774, 795, 795, 774, 2717, 2697, 2696, 2707, 2719, 2704, 2709, 2719, 2711, 2600, 2620, 2621, 2598, 2570, 2597, 2592, 2602, 2594, 2589, 2593, 2619, 2604, 2600, 2605, 2665, 2598, 2603, 2621, 2600, 2592, 2599, 2588, 2617, 2563, 2583, 2582, 2573, 2561, 2574, 2571, 2561, 2569, 1331, 1319, 1318, 1341, 1297, 1342, 1339, 1329, 1337, 1286, 1338, 1312, 1335, 1331, 1334, 1394, 1329, 1319, 1312, 1312, 1335, 1340, 1318, 1282, 1341, 1339, 1340, 1318, 1335, 1312, 1394, 1342, 1331, 1313, 1318, 1394, 1329, 1342, 1339, 1329, 1337, 1394, 1332, 1339, 1340, 1339, 1313, 1338, 1335, 1334, 2385, 2373, 2372, 2399, 2387, 2396, 2393, 2387, 2395, 1343, 1323, 1322, 1329, 1309, 1330, 1335, 1341, 1333, 1290, 1334, 1324, 1339, 1343, 1338, 1406, 1325, 1322, 1343, 1324, 1322, 1309, 1330, 
    1335, 1341, 1333, 1294, 1329, 1335, 1328, 1322, 1339, 1324, 1388, 1388, 1388, 1406, 1303, 1328, 1322, 1339, 1324, 1324, 1323, 1326, 1322, 1339, 1338, 1307, 1318, 1341, 1339, 1326, 1322, 1335, 1329, 1328, 643, 663, 662, 653, 641, 654, 651, 641, 649, 3098, 3086, 3087, 3092, 3128, 3095, 3090, 3096, 3088, 3119, 3091, 3081, 3102, 3098, 3103, 3163, 3096, 3086, 3081, 3081, 3102, 3093, 3087, 3163, 3127, 3092, 3092, 3083, 3163, 3101, 3090, 3093, 3090, 3080, 3091, 3102, 3103, 3163, 3095, 3092, 3092, 3083, 3125, 3086, 3094, 3142, 3007, 2987, 2986, 2993, 3005, 2994, 2999, 3005, 2997, 3136, 3157, 3138, 3196, 3167, 3167, 3136, 3088, 3158, 3161, 3166, 3161, 3139, 3160, 3157, 3156, 3088, 3139, 3164, 3157, 3157, 3136, 3085, 1009, 997, 996, 1023, 1011, 1020, 1017, 1011, 1019, 608, 629, 610, 604, 639, 639, 608, 560, 630, 633, 638, 633, 611, 632, 629, 628, 560, 611, 636, 629, 629, 608, 560, 630, 633, 638, 633, 611, 632, 629, 628, 557, 955, 943, 942, 949, 953, 950, 947, 953, 945, 1615, 1627, 1626, 1601, 1645, 1602, 1607, 1613, 1605, 1658, 1606, 1628, 1611, 1615, 1610, 1550, 1629, 1626, 1615, 1628, 1626, 1645, 1602, 1607, 1613, 1605, 1567, 1567, 1567, 1550, 1639, 1600, 1626, 1611, 1628, 1628, 1627, 1630, 1626, 1611, 1610, 1643, 1622, 1613, 1611, 1630, 1626, 1607, 1601, 1600, 1542, 1543, 2996, 2965, 2966, 2961, 2949, 2972, 2948, 3024, 2978, 2965, 2963, 2975, 2946, 2964};
    public AutoClickPlanBean b;
    public int d;
    public int e;
    public K f;
    public boolean g;
    public boolean h;
    public ArrayList k;
    public final ArrayList a = new ArrayList();
    public LinkedHashMap c = new LinkedHashMap();
    public String i = null;
    public final H l = new H(this, C0037.m3783(), 0);
    public final Random j = new Random();

    /* JADX INFO: renamed from: ۡ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6957() {
        if (C0016.m717() <= 0) {
            return f261short;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0b4d A[Catch: all -> 0x0447, TryCatch #2 {all -> 0x0447, InterruptedException -> 0x096a, InterruptedException -> 0x0b99, InterruptedException -> 0x0a78, blocks: (B:72:0x03fa, B:74:0x0408, B:75:0x0444, B:79:0x044a, B:81:0x04b2, B:84:0x0644, B:91:0x06ca, B:97:0x06d7, B:101:0x06e0, B:102:0x0822, B:103:0x090b, B:116:0x0a1e, B:120:0x0a26, B:129:0x0add, B:123:0x0a79, B:125:0x0ad0, B:126:0x0ad7, B:128:0x0ada, B:130:0x0b45, B:132:0x0b4d, B:137:0x0b59, B:139:0x0b85, B:140:0x0b88, B:141:0x0b89, B:143:0x0b9a, B:144:0x0bc7, B:106:0x096b, B:108:0x0971, B:109:0x0998, B:111:0x099b, B:113:0x09a5), top: B:159:0x03fa }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0b57  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.zfork.multiplatforms.android.bomb.L r97, com.zfork.multiplatforms.android.bomb.K r98) {
        /*
            Method dump skipped, instruction units count: 3284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.L.a(com.zfork.multiplatforms.android.bomb.L, com.zfork.multiplatforms.android.bomb.K):void");
    }

    public static void b(AutoClickPlanBean autoClickPlanBean, AutoClickPointerBean autoClickPointerBean) {
        if (autoClickPointerBean == null || autoClickPlanBean == null || C0036.m3700(C0038.m4007()) == null) {
            return;
        }
        Activity activityM3700 = C0036.m3700(C0038.m4007());
        C0024.m2076(autoClickPointerBean, C0065.m4764(autoClickPlanBean));
        T1 t1 = new T1(activityM3700, autoClickPointerBean);
        I i = new I(t1, activityM3700, 0);
        P1 p1M2884 = C0030.m2884(t1);
        if (p1M2884 != null) {
            C0065.m4727(p1M2884, new Q1(i, 0));
        }
        P1 p1M2841 = C0030.m2841(t1);
        if (p1M2841 != null) {
            C0065.m4727(p1M2841, new Q1(i, 1));
        }
        int[] iArr = new int[2];
        C0017.m918(C0027.m2395(C0027.m2524(activityM3700)), iArr);
        WindowManager.LayoutParams layoutParamsM4085 = C0039.m4085(t1);
        layoutParamsM4085.gravity = 8388659;
        layoutParamsM4085.x = (C0075.m6843(autoClickPointerBean) + iArr[0]) - (C0035.m3620(20, activityM3700) / 2);
        C0039.m4085(t1).y = (C0067.m5471(autoClickPointerBean) + iArr[1]) - (C0035.m3620(20, activityM3700) / 2);
        C0067.m5507(autoClickPlanBean, t1);
    }

    public final boolean c(String str, boolean z) {
        LinkedHashMap linkedHashMapM7371 = C0078.m7371(this);
        if (linkedHashMapM7371 == null) {
            return false;
        }
        Iterator itM2001 = C0024.m2001(C0074.m6455(linkedHashMapM7371));
        while (C0036.m3657(itM2001)) {
            AutoClickPlanBean autoClickPlanBean = (AutoClickPlanBean) C0067.m5420(C0078.m7371(this), (Long) C0071.m6012(itM2001));
            if (autoClickPlanBean != null && C0037.m3902(str, C0075.m6864((AutoClickContentBean) C0078.m7413(C0029.m2780(autoClickPlanBean), AutoClickContentBean.class)))) {
                if (!z) {
                    AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(this);
                    if (autoClickPlanBeanM1632 != null && (C0065.m4764(autoClickPlanBeanM1632) == 0 || C0065.m4764(C0021.m1632(this)) != C0065.m4764(autoClickPlanBean))) {
                        return true;
                    }
                } else if (C0021.m1632(this) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String d() {
        LinkedHashMap linkedHashMapM7371 = C0078.m7371(this);
        return C0071.m6038(linkedHashMapM7371 != null ? 1 + C0037.m3811(linkedHashMapM7371) : 1, C0016.m625(m6957(), 1223, 14, 3056));
    }

    public final void e() {
        AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(this);
        if (autoClickPlanBeanM1632 == null) {
            return;
        }
        C0020.m1350(autoClickPlanBeanM1632);
    }

    public static void f(String str) {
        Activity activityM3700 = C0036.m3700(C0038.m4007());
        if (activityM3700 != null) {
            C0030.m2968(C0023.m1884(activityM3700, str, 0));
        }
    }
}
