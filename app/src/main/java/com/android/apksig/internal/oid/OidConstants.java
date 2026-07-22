package com.android.apksig.internal.oid;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
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
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class OidConstants {
    public static final Map<String, String> OID_TO_JCA_DIGEST_ALG;
    public static final Map<String, String> OID_TO_JCA_SIGNATURE_ALG;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f103short = {1494, 1481, 1493, 1481, 1503, 1491, 1495, 1481, 1494, 1494, 1492, 1490, 1491, 1502, 1481, 1493, 1481, 1490, 1700, 1723, 1702, 1723, 1700, 1697, 1723, 1702, 1723, 1703, 1723, 1703, 1699, 2484, 2472, 2487, 2480, 2472, 2494, 2482, 2486, 2472, 2487, 2472, 2487, 2486, 2487, 2472, 2485, 2472, 2482, 2472, 2484, 2472, 2482, 1357, 1361, 1358, 1353, 1361, 1351, 1355, 1359, 1361, 1358, 1361, 1358, 1359, 1358, 1361, 1356, 1361, 1355, 1361, 1357, 1361, 1358, 3092, 3080, 3095, 3088, 3080, 3102, 3090, 3094, 3080, 3095, 3080, 3095, 3094, 3095, 3080, 3093, 3080, 3090, 3080, 3092, 3080, 3092, 1914, 1894, 1913, 1918, 1894, 1904, 1916, 1912, 1894, 1913, 1894, 1913, 1912, 1913, 1894, 1915, 1894, 1916, 1894, 1914, 1894, 1915, 2210, 2237, 2209, 2237, 2219, 2215, 2211, 2237, 2210, 2211, 2211, 2215, 2211, 2237, 2215, 2237, 2210, 1516, 1523, 1519, 1523, 1509, 1513, 1517, 1523, 1516, 1517, 1517, 1513, 1512, 1523, 1519, 1523, 1516, 2965, 2954, 2966, 2954, 2972, 2960, 2964, 2954, 2965, 2965, 2967, 2961, 2960, 2973, 2954, 2965, 2954, 2965, 2954, 2960, 1327, 1328, 1324, 1328, 1318, 1322, 1326, 1328, 1327, 1327, 1325, 1323, 1322, 1319, 1328, 1327, 1328, 1327, 1328, 1327, 1492, 1483, 1495, 1483, 1501, 1489, 1493, 1483, 1492, 1493, 1493, 1489, 1493, 1483, 1489, 1483, 1494, 3153, 3150, 3154, 3150, 3160, 3156, 3152, 3150, 3153, 3152, 3152, 3156, 3157, 3150, 3156, 3150, 3153, 2561, 2590, 2562, 2590, 2568, 2564, 2560, 2590, 2561, 2561, 2563, 2565, 2564, 2569, 2590, 2561, 2590, 2561, 2590, 2565, 557, 561, 558, 553, 561, 551, 555, 559, 561, 558, 561, 558, 559, 558, 561, 556, 561, 555, 561, 556, 561, 558, 1662, 1633, 1661, 1633, 1655, 1659, 1663, 1633, 1662, 1663, 1663, 1659, 1658, 1633, 1659, 1633, 1660, 1633, 1662, 1914, 1893, 1913, 1893, 1907, 1919, 1915, 1893, 1914, 1914, 1912, 1918, 1919, 1906, 1893, 1914, 1893, 1914, 1893, 1914, 1919, 2793, 2805, 2794, 2797, 2805, 2787, 2799, 2795, 2805, 2794, 2805, 2794, 2795, 2794, 2805, 2792, 2805, 2799, 2805, 2792, 2805, 2793, 1580, 1587, 1583, 1587, 1573, 1577, 1581, 1587, 1580, 1581, 1581, 1577, 1576, 1587, 1577, 1587, 1582, 1587, 1583, 3206, 3225, 3205, 3225, 3215, 3203, 3207, 3225, 3206, 3206, 3204, 3202, 3203, 3214, 3225, 3206, 3225, 3206, 3225, 3206, 3206, 2929, 2925, 2930, 2933, 2925, 2939, 2935, 2931, 2925, 2930, 2925, 2930, 2931, 2930, 2925, 2928, 2925, 2935, 2925, 2928, 2925, 2928, 1278, 1249, 1277, 1249, 1271, 1275, 1279, 1249, 1278, 1279, 1279, 1275, 1274, 1249, 1275, 1249, 1276, 1249, 1276, 363, 372, 360, 372, 354, 366, 362, 372, 363, 363, 361, 367, 366, 355, 372, 363, 372, 363, 372, 363, 360, 2165, 2153, 2166, 2161, 2153, 2175, 2163, 2167, 2153, 2166, 2153, 2166, 2167, 2166, 2153, 2164, 2153, 2163, 2153, 2164, 2153, 2163, 609, 638, 610, 638, 616, 612, 608, 638, 609, 608, 608, 612, 613, 638, 612, 638, 611, 638, 612, 674, 701, 673, 701, 683, 679, 675, 701, 674, 674, 672, 678, 679, 682, 701, 674, 701, 674, 701, 674, 672, 2224, 2223, 2227, 2223, 2233, 2229, 2225, 2223, 2224, 2224, 2226, 2228, 2229, 2232, 2223, 2227, 2223, 2228, 537, 518, 538, 518, 528, 540, 536, 518, 537, 537, 539, 541, 540, 529, 518, 537, 518, 537, 518, 537, 2669, 2674, 2670, 2674, 2660, 2664, 2668, 2674, 2669, 2669, 2671, 2665, 2664, 2661, 2674, 2669, 2674, 2669, 2674, 2664, 2491, 2468, 2488, 2468, 2482, 2494, 2490, 2468, 2491, 2491, 2489, 2495, 2494, 2483, 2468, 2491, 2468, 2491, 2468, 2495, 3263, 3232, 3260, 3232, 3254, 3258, 3262, 3232, 3263, 3263, 3261, 3259, 3258, 3255, 3232, 3263, 3232, 3263, 3232, 3263, 3258, 1738, 1749, 1737, 1749, 1731, 1743, 1739, 1749, 1738, 1738, 1736, 1742, 1743, 1730, 1749, 1738, 1749, 1738, 1749, 1738, 1738, 1033, 1046, 1034, 1046, 1024, 1036, 1032, 1046, 1033, 1033, 1035, 1037, 1036, 1025, 1046, 1033, 1046, 1033, 1046, 1033, 1034, 1699, 1724, 1696, 1724, 1706, 1702, 1698, 1724, 1699, 1699, 1697, 1703, 1702, 1707, 1724, 1699, 1724, 1699, 1724, 1699, 1697, 1518, 1521, 1516, 1521, 1518, 1515, 1521, 1516, 1521, 1517, 1521, 1517, 1513, 2754, 2782, 2753, 2758, 2782, 2760, 2756, 2752, 2782, 2753, 2782, 2753, 2752, 2753, 2782, 2755, 2782, 2756, 2782, 2754, 2782, 2756, 2196, 2184, 2199, 2192, 2184, 2206, 2194, 2198, 2184, 2199, 2184, 2199, 2198, 2199, 2184, 2197, 2184, 2194, 2184, 2196, 2184, 2199, 1604, 1624, 1607, 1600, 1624, 1614, 1602, 1606, 1624, 1607, 1624, 1607, 1606, 1607, 1624, 1605, 1624, 1602, 1624, 1604, 1624, 1604, 1363, 1359, 1360, 1367, 1359, 1369, 1365, 1361, 1359, 1360, 1359, 1360, 1361, 1360, 1359, 1362, 1359, 1365, 1359, 1363, 1359, 1362, 3032, 3015, 3035, 3015, 3025, 3037, 3033, 3015, 3032, 3033, 3033, 3037, 3033, 3015, 3037, 3015, 3034, 2849, 2877, 2850, 2853, 2877, 2859, 2855, 2851, 2877, 2850, 2877, 2850, 2851, 2850, 2877, 2848, 2877, 2855, 2877, 2848, 2877, 2850, 1034, 1046, 1033, 1038, 1046, 1024, 1036, 1032, 1046, 1033, 1046, 1033, 1032, 1033, 1046, 1035, 1046, 1036, 1046, 1035, 1046, 1034, 875, 884, 872, 884, 866, 878, 874, 884, 875, 874, 874, 878, 874, 884, 878, 884, 875, 2571, 2580, 2568, 2580, 2562, 2574, 2570, 2580, 2571, 2570, 2570, 2574, 2575, 2580, 2568, 2580, 2571, 718, 721, 717, 721, 711, 715, 719, 721, 718, 719, 719, 715, 714, 721, 715, 721, 718, 577, 606, 578, 606, 584, 580, 576, 606, 577, 576, 576, 580, 581, 606, 580, 606, 579, 606, 577, 2903, 2888, 2900, 2888, 2910, 2898, 2902, 2888, 2903, 2902, 2902, 2898, 2899, 2888, 2898, 2888, 2901, 2888, 2900, 2381, 2386, 2382, 2386, 2372, 2376, 2380, 2386, 2381, 2380, 2380, 2376, 2377, 2386, 2376, 2386, 2383, 2386, 2383, 1674, 1685, 1673, 1685, 1667, 1679, 1675, 1685, 1674, 1675, 1675, 1679, 1678, 1685, 1679, 1685, 1672, 1685, 1679, 1310, 1303, 1382, 2551, 2540, 2533, 2441, 2453, 2638, 2645, 2652, 2608, 2607, 2607, 2601, 903, 924, 917, 1017, 998, 993, 994, 2873, 2850, 2859, 2887, 2905, 2898, 2910, 3277, 3286, 3295, 3251, 3243, 3247, 3244, 984, 977, 928, 994, 1020, 993, 1021, 967, 966, 980, 1141, 1134, 1127, 1047, 1105, 1103, 1106, 1102, 
    1140, 1141, 1127, 400, 395, 386, 497, 497, 503, 436, 426, 439, 427, 401, 400, 386, 3302, 3325, 3316, 3207, 3200, 3203, 3266, 3292, 3265, 3293, 3303, 3302, 3316, 3040, 3067, 3058, 2944, 2955, 2951, 3012, 3034, 3015, 3035, 3041, 3040, 3058, 1089, 1114, 1107, 1063, 1059, 1056, 1125, 1147, 1126, 1146, 1088, 1089, 1107, 1384, 1395, 1402, 1290, 1356, 1362, 1359, 1363, 1407, 1384, 1402, 1623, 1612, 1605, 1590, 1590, 1584, 1651, 1645, 1648, 1644, 1600, 1623, 1605, 1080, 1059, 1066, 1113, 1118, 1117, 1052, 1026, 1055, 1027, 1071, 1080, 1066, 1972, 1967, 1958, 2006, 1936, 1934, 1939, 1935, 1954, 1956, 1955, 1972, 1958, 693, 686, 679, 724, 724, 722, 657, 655, 658, 654, 675, 677, 674, 693, 679, 516, 543, 534, 613, 610, 609, 544, 574, 547, 575, 530, 532, 531, 516, 534, 2998, 2989, 2980, 3030, 3037, 3025, 2962, 2956, 2961, 2957, 2976, 2982, 2977, 2998, 2980, 546, 569, 560, 580, 576, 579, 518, 536, 517, 537, 564, 562, 565, 546, 560, 728, 710, 731, 711, 2139, 2117, 2136, 2116};
    public static final String OID_DIGEST_MD5 = C0023.m1904(m2081(), 0, 18, 1511);
    public static final String OID_DIGEST_SHA1 = C0018.m1070(m2081(), 18, 13, 1685);
    public static final String OID_DIGEST_SHA224 = C0026.m2321(m2081(), 31, 22, 2438);
    public static final String OID_DIGEST_SHA256 = C0065.m4757(m2081(), 53, 22, 1407);
    public static final String OID_DIGEST_SHA384 = C0071.m5991(m2081(), 75, 22, 3110);
    public static final String OID_DIGEST_SHA512 = C0072.m6116(m2081(), 97, 22, 1864);
    public static final String OID_SIG_DSA = C0016.m625(m2081(), 119, 17, 2195);
    public static final String OID_SIG_EC_PUBLIC_KEY = C0023.m1904(m2081(), 136, 17, 1501);
    public static final String OID_SIG_MD5_WITH_RSA = C0067.m5418(m2081(), 153, 20, 2980);
    public static final String OID_SIG_RSA = C0026.m2321(m2081(), 173, 20, 1310);
    public static final String OID_SIG_SHA1_WITH_DSA = C0063.m4315(m2081(), 193, 17, 1509);
    public static final String OID_SIG_SHA1_WITH_ECDSA = C0070.m5942(m2081(), 210, 17, 3168);
    public static final String OID_SIG_SHA1_WITH_RSA = C0035.m3603(m2081(), 227, 20, 2608);
    public static final String OID_SIG_SHA224_WITH_DSA = C0075.m6791(m2081(), 247, 22, 543);
    public static final String OID_SIG_SHA224_WITH_ECDSA = C0072.m6116(m2081(), 269, 19, 1615);
    public static final String OID_SIG_SHA224_WITH_RSA = C0078.m7427(m2081(), 288, 21, 1867);
    public static final String OID_SIG_SHA256_WITH_DSA = C0068.m5544(m2081(), 309, 22, 2779);
    public static final String OID_SIG_SHA256_WITH_ECDSA = C0064.m4545(m2081(), 331, 19, 1565);
    public static final String OID_SIG_SHA256_WITH_RSA = C0032.m3209(m2081(), 350, 21, 3255);
    public static final String OID_SIG_SHA384_WITH_DSA = C0077.m7205(m2081(), 371, 22, 2883);
    public static final String OID_SIG_SHA384_WITH_ECDSA = C0037.m3829(m2081(), 393, 19, 1231);
    public static final String OID_SIG_SHA384_WITH_RSA = C0016.m625(m2081(), 412, 21, 346);
    public static final String OID_SIG_SHA512_WITH_DSA = C0022.m1728(m2081(), 433, 22, 2119);
    public static final String OID_SIG_SHA512_WITH_ECDSA = C0077.m7205(m2081(), 455, 19, 592);
    public static final String OID_SIG_SHA512_WITH_RSA = C0035.m3603(m2081(), 474, 21, 659);
    public static final Map<String, List<InclusiveIntRange>> SUPPORTED_SIG_ALG_OIDS = new HashMap();

    public static class OidToUserFriendlyNameMapper {
        public static final HashMap a;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f104short = {2975, 2944, 2972, 2944, 2966, 2970, 2974, 2944, 2975, 2975, 2973, 2971, 2970, 2967, 2944, 2972, 2944, 2971, 3011, 3018, 3003, 2433, 2462, 2435, 2462, 2433, 2436, 2462, 2435, 2462, 2434, 2462, 2434, 2438, 420, 447, 438, 474, 454, 2255, 2259, 2252, 2251, 2259, 2245, 2249, 2253, 2259, 2252, 2259, 2252, 2253, 2252, 2259, 2254, 2259, 2249, 2259, 2255, 2259, 2249, 1374, 1349, 1356, 1312, 1343, 1343, 1337, 1326, 1330, 1325, 1322, 1330, 1316, 1320, 1324, 1330, 1325, 1330, 1325, 1324, 1325, 1330, 1327, 1330, 1320, 1330, 1326, 1330, 1325, 1188, 1215, 1206, 1242, 1221, 1218, 1217, 2291, 2287, 2288, 2295, 2287, 2297, 2293, 2289, 2287, 2288, 2287, 2288, 2289, 2288, 2287, 2290, 2287, 2293, 2287, 2291, 2287, 2291, 476, 455, 462, 418, 444, 439, 443, 1557, 1545, 1558, 1553, 1545, 1567, 1555, 1559, 1545, 1558, 1545, 1558, 1559, 1558, 1545, 1556, 1545, 1555, 1545, 1557, 1545, 1556, 1936, 1931, 1922, 2030, 2038, 2034, 2033, 2715, 2692, 2712, 2692, 2706, 2718, 2714, 2692, 2715, 2715, 2713, 2719, 2718, 2707, 2692, 2715, 2692, 2715, 2692, 2715, 1000, 1001, 1019, 3119, 3120, 3116, 3120, 3110, 3114, 3118, 3120, 3119, 3119, 3117, 3115, 3114, 3111, 3120, 3119, 3120, 3119, 3120, 3114, 2934, 2943, 2830, 2843, 2892, 2898, 2895, 2899, 2843, 2921, 2920, 2938, 1947, 1924, 1944, 1924, 1938, 1950, 1946, 1924, 1947, 1947, 1945, 1951, 1950, 1939, 1924, 1947, 1924, 1947, 1924, 1951, 3159, 3148, 3141, 3113, 3125, 3108, 3187, 3181, 3184, 3180, 3108, 3158, 3159, 3141, 1659, 1636, 1656, 1636, 1650, 1662, 1658, 1636, 1659, 1659, 1657, 1663, 1662, 1651, 1636, 1659, 1636, 1659, 1636, 1659, 1662, 2707, 2696, 2689, 2797, 2802, 2802, 2804, 2784, 2743, 2729, 2740, 2728, 2784, 2706, 2707, 2689, 2890, 2901, 2889, 2901, 2883, 2895, 2891, 2901, 2890, 2890, 2888, 2894, 2895, 2882, 2901, 2890, 2901, 2890, 2901, 2890, 2890, 841, 850, 859, 823, 808, 815, 812, 826, 877, 883, 878, 882, 826, 840, 841, 859, 2818, 2845, 2817, 2845, 2827, 2823, 2819, 2845, 2818, 2818, 2816, 2822, 2823, 2826, 2845, 2818, 2845, 2818, 2845, 2818, 2817, 1769, 1778, 1787, 1687, 1673, 1666, 1678, 1690, 1741, 1747, 1742, 1746, 1690, 1768, 1769, 1787, 383, 352, 380, 352, 374, 378, 382, 352, 383, 383, 381, 379, 378, 375, 352, 383, 352, 383, 352, 383, 381, 2589, 2566, 2575, 2659, 2683, 2687, 2684, 2670, 2617, 2599, 2618, 2598, 2670, 2588, 2589, 2575, 759, 744, 756, 744, 766, 754, 758, 744, 759, 758, 758, 754, 758, 744, 754, 744, 759, 956, 939, 953, 3317, 3306, 3318, 3306, 3324, 3312, 3316, 3306, 3317, 3316, 3316, 3312, 3316, 3306, 3312, 3306, 3319, 2070, 2061, 2052, 2152, 2164, 2149, 2098, 2092, 2097, 2093, 2149, 2049, 2070, 2052, 509, 481, 510, 505, 481, 503, 507, 511, 481, 510, 481, 510, 511, 510, 481, 508, 481, 507, 481, 508, 481, 510, 1927, 1948, 1941, 2041, 2022, 2022, 2016, 2036, 1955, 1981, 1952, 1980, 2036, 1936, 1927, 1941, 2364, 2336, 2367, 2360, 2336, 2358, 2362, 2366, 2336, 2367, 2336, 2367, 2366, 2367, 2336, 2365, 2336, 2362, 2336, 2365, 2336, 2364, 462, 469, 476, 432, 431, 424, 427, 445, 490, 500, 489, 501, 445, 473, 462, 476, 791, 779, 788, 787, 779, 797, 785, 789, 779, 788, 779, 788, 789, 788, 779, 790, 779, 785, 779, 790, 779, 790, 851, 840, 833, 813, 819, 824, 820, 800, 887, 873, 884, 872, 800, 836, 851, 833, 1273, 1253, 1274, 1277, 1253, 1267, 1279, 1275, 1253, 1274, 1253, 1274, 1275, 1274, 1253, 1272, 1253, 1279, 1253, 1272, 1253, 1279, 2497, 2522, 2515, 2495, 2471, 2467, 2464, 2482, 2533, 2555, 2534, 2554, 2482, 2518, 2497, 2515, 1731, 1756, 1728, 1756, 1738, 1734, 1730, 1756, 1731, 1730, 1730, 1734, 1735, 1756, 1728, 1756, 1731, 590, 584, 591, 600, 586, 1031, 1048, 1028, 1048, 1038, 1026, 1030, 1048, 1031, 1030, 1030, 1026, 1027, 1048, 1026, 1048, 1031, 2604, 2615, 2622, 2642, 2638, 2655, 2568, 2582, 2571, 2583, 2655, 2618, 2620, 2619, 2604, 2622, 1836, 1843, 1839, 1843, 1829, 1833, 1837, 1843, 1836, 1837, 1837, 1833, 1832, 1843, 1833, 1843, 1838, 1843, 1836, 865, 890, 883, 799, 768, 768, 774, 786, 837, 859, 838, 858, 786, 887, 881, 886, 865, 883, 1505, 1534, 1506, 1534, 1512, 1508, 1504, 1534, 1505, 1504, 1504, 1508, 1509, 1534, 1508, 1534, 1507, 1534, 1506, 1580, 1591, 1598, 1618, 1613, 1610, 1609, 1631, 1544, 1558, 1547, 1559, 1631, 1594, 1596, 1595, 1580, 1598, 2943, 2912, 2940, 2912, 2934, 2938, 2942, 2912, 2943, 2942, 2942, 2938, 2939, 2912, 2938, 2912, 2941, 2912, 2941, 1668, 1695, 1686, 1786, 1764, 1775, 1763, 1783, 1696, 1726, 1699, 1727, 1783, 1682, 1684, 1683, 1668, 1686, 1422, 1425, 1421, 1425, 1415, 1419, 1423, 1425, 1422, 1423, 1423, 1419, 1418, 1425, 1419, 1425, 1420, 1425, 1419, 959, 932, 941, 961, 985, 989, 990, 972, 923, 901, 920, 900, 972, 937, 943, 936, 959, 941};

        /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
        public static short[] m2083() {
            if (C0070.m5903() > 0) {
                return f104short;
            }
            return null;
        }

        static {
            HashMap map = new HashMap();
            a = map;
            C0038.m3969(map, C0032.m3209(m2083(), 0, 18, 2990), C0070.m5942(m2083(), 18, 3, 2958));
            C0038.m3969(map, C0065.m4757(m2083(), 21, 13, 2480), C0025.m2151(m2083(), 34, 5, 503));
            C0038.m3969(map, C0023.m1904(m2083(), 39, 22, 2301), C0029.m2695(m2083(), 61, 7, 1293));
            C0038.m3969(map, C0030.m2840(m2083(), 68, 22, 1308), C0037.m3829(m2083(), 90, 7, 1271));
            C0038.m3969(map, C0026.m2321(m2083(), 97, 22, 2241), C0016.m625(m2083(), 119, 7, 399));
            C0038.m3969(map, C0074.m6452(m2083(), 126, 22, 1575), C0067.m5418(m2083(), 148, 7, 1987));
            C0038.m3969(map, C0029.m2695(m2083(), ModuleDescriptor.MODULE_VERSION, 20, 2730), C0034.m3431(m2083(), 175, 3, 954));
            C0038.m3969(map, C0076.m6902(m2083(), 178, 20, 3102), C0032.m3209(m2083(), 198, 12, 2875));
            C0038.m3969(map, C0023.m1904(m2083(), 210, 20, 1962), C0063.m4315(m2083(), 230, 14, 3076));
            C0038.m3969(map, C0028.m2609(m2083(), 244, 21, 1610), C0023.m1904(m2083(), 265, 16, 2752));
            C0038.m3969(map, C0111.m13097(m2083(), 281, 21, 2939), C0035.m3603(m2083(), 302, 16, 794));
            C0038.m3969(map, C0017.m936(m2083(), 318, 21, 2867), C0064.m4545(m2083(), 339, 16, 1722));
            C0038.m3969(map, C0034.m3431(m2083(), 355, 21, 334), C0031.m3047(m2083(), 376, 16, 2638));
            C0038.m3969(map, C0018.m1070(m2083(), 392, 17, 710), C0021.m1650(m2083(), 409, 3, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW));
            C0038.m3969(map, C0034.m3431(m2083(), 412, 17, 3268), C0031.m3047(m2083(), 429, 14, 2117));
            C0038.m3969(map, C0023.m1904(m2083(), 443, 22, 463), C0069.m5807(m2083(), 465, 16, 2004));
            C0038.m3969(map, C0020.m1443(m2083(), 481, 22, 2318), C0024.m1945(m2083(), 503, 16, 413));
            C0038.m3969(map, C0035.m3603(m2083(), 519, 22, 805), C0076.m6902(m2083(), 541, 16, 768));
            C0038.m3969(map, C0074.m6452(m2083(), 557, 22, 1227), C0075.m6791(m2083(), 579, 16, 2450));
            C0038.m3969(map, C0070.m5942(m2083(), 595, 17, 1778), C0064.m4545(m2083(), 612, 5, 523));
            C0038.m3969(map, C0070.m5942(m2083(), 617, 17, 1078), C0024.m1945(m2083(), 634, 16, 2687));
            C0038.m3969(map, C0020.m1443(m2083(), 650, 19, 1821), C0020.m1443(m2083(), 669, 18, 818));
            C0038.m3969(map, C0068.m5544(m2083(), 687, 19, 1488), C0077.m7205(m2083(), 706, 18, 1663));
            C0038.m3969(map, C0069.m5807(m2083(), 724, 19, 2894), C0033.m3330(m2083(), 743, 18, 1751));
            C0038.m3969(map, C0063.m4315(m2083(), 761, 19, 1471), C0074.m6452(m2083(), 780, 18, 1004));
        }

        public static String getUserFriendlyNameForOid(String str) {
            return (String) C0067.m5420(C0078.m7383(), str);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m2081() {
        if (C0018.m1064() > 0) {
            return f103short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2082(Object obj, Object obj2, Object obj3) {
        if (C0076.m6903() < 0) {
            addSupportedSigAlg((String) obj, (String) obj2, (InclusiveIntRange[]) obj3);
        }
    }

    static {
        InclusiveIntRange[] inclusiveIntRangeArr = {C0030.m2938(0)};
        String strM625 = C0016.m625(m2081(), 495, 18, 2177);
        String strM2695 = C0029.m2695(m2081(), InputDeviceCompat.SOURCE_DPAD, 20, 552);
        m2082(strM625, strM2695, inclusiveIntRangeArr);
        InclusiveIntRange[] inclusiveIntRangeArr2 = {C0018.m1093(0, 8), C0030.m2938(21)};
        String strM3330 = C0033.m3330(m2081(), 533, 20, 2652);
        m2082(strM625, strM3330, inclusiveIntRangeArr2);
        InclusiveIntRange[] inclusiveIntRangeArr3 = {C0018.m1093(21, 23)};
        String strM4066 = C0039.m4066(m2081(), 553, 20, 2442);
        m2082(strM625, strM4066, inclusiveIntRangeArr3);
        InclusiveIntRange[] inclusiveIntRangeArr4 = {C0018.m1093(21, 23)};
        String strM2609 = C0028.m2609(m2081(), 573, 21, 3214);
        m2082(strM625, strM2609, inclusiveIntRangeArr4);
        InclusiveIntRange[] inclusiveIntRangeArr5 = {C0018.m1093(21, 23)};
        String strM2840 = C0030.m2840(m2081(), 594, 21, 1787);
        m2082(strM625, strM2840, inclusiveIntRangeArr5);
        InclusiveIntRange[] inclusiveIntRangeArr6 = {C0018.m1093(21, 23)};
        String strM7205 = C0077.m7205(m2081(), 615, 21, 1080);
        m2082(strM625, strM7205, inclusiveIntRangeArr6);
        InclusiveIntRange[] inclusiveIntRangeArr7 = {C0018.m1093(21, 23)};
        String strM33302 = C0033.m3330(m2081(), 636, 21, 1682);
        m2082(strM625, strM33302, inclusiveIntRangeArr7);
        InclusiveIntRange[] inclusiveIntRangeArr8 = {C0030.m2938(0)};
        String strM4022 = C0038.m4022(m2081(), 657, 13, 1503);
        m2082(strM4022, strM2695, inclusiveIntRangeArr8);
        m2082(strM4022, strM3330, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM4066, new InclusiveIntRange[]{C0030.m2938(0)});
        m2082(strM4022, strM2609, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM2840, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM7205, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM33302, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        InclusiveIntRange[] inclusiveIntRangeArr9 = {C0018.m1093(0, 8), C0030.m2938(21)};
        String strM5942 = C0070.m5942(m2081(), 670, 22, 2800);
        m2082(strM5942, strM2695, inclusiveIntRangeArr9);
        m2082(strM5942, strM3330, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM4066, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM2609, new InclusiveIntRange[]{C0018.m1093(0, 8), C0030.m2938(21)});
        m2082(strM5942, strM2840, new InclusiveIntRange[]{C0018.m1093(21, 21)});
        m2082(strM5942, strM7205, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM33302, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        InclusiveIntRange[] inclusiveIntRangeArr10 = {C0018.m1093(0, 8), C0030.m2938(18)};
        String strM26952 = C0029.m2695(m2081(), 692, 22, 2214);
        m2082(strM26952, strM2695, inclusiveIntRangeArr10);
        m2082(strM26952, strM3330, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM4066, new InclusiveIntRange[]{C0018.m1093(21, 21)});
        m2082(strM26952, strM2609, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM2840, new InclusiveIntRange[]{C0018.m1093(0, 8), C0030.m2938(18)});
        m2082(strM26952, strM7205, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM33302, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        InclusiveIntRange[] inclusiveIntRangeArr11 = {C0030.m2938(18)};
        String strM13097 = C0111.m13097(m2081(), 714, 22, 1654);
        m2082(strM13097, strM2695, inclusiveIntRangeArr11);
        m2082(strM13097, strM3330, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM4066, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM2609, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM2840, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM7205, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM13097, strM33302, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        InclusiveIntRange[] inclusiveIntRangeArr12 = {C0030.m2938(18)};
        String strM3603 = C0035.m3603(m2081(), 736, 22, 1377);
        m2082(strM3603, strM2695, inclusiveIntRangeArr12);
        m2082(strM3603, strM3330, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM4066, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM2609, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM2840, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM7205, new InclusiveIntRange[]{C0018.m1093(21, 21)});
        m2082(strM3603, strM33302, new InclusiveIntRange[]{C0030.m2938(21)});
        InclusiveIntRange[] inclusiveIntRangeArr13 = {C0018.m1093(21, 23)};
        String strM4828 = C0066.m4828(m2081(), 758, 17, 3049);
        m2082(strM625, strM4828, inclusiveIntRangeArr13);
        InclusiveIntRange[] inclusiveIntRangeArr14 = {C0018.m1093(21, 23)};
        String strM3829 = C0037.m3829(m2081(), 775, 22, 2835);
        m2082(strM625, strM3829, inclusiveIntRangeArr14);
        InclusiveIntRange[] inclusiveIntRangeArr15 = {C0018.m1093(21, 23)};
        String strM3047 = C0031.m3047(m2081(), 797, 22, 1080);
        m2082(strM625, strM3047, inclusiveIntRangeArr15);
        InclusiveIntRange[] inclusiveIntRangeArr16 = {C0030.m2938(0)};
        String strM30472 = C0031.m3047(m2081(), 819, 17, 858);
        m2082(strM4022, strM30472, inclusiveIntRangeArr16);
        m2082(strM4022, strM4828, new InclusiveIntRange[]{C0030.m2938(9)});
        m2082(strM4022, strM3829, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM3047, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM30472, new InclusiveIntRange[]{C0030.m2938(22)});
        m2082(strM5942, strM4828, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM3829, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM5942, strM3047, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM30472, new InclusiveIntRange[]{C0030.m2938(22)});
        m2082(strM26952, strM4828, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM3829, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM3047, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM13097, strM4828, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM3829, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM3047, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM4828, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM3829, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM3047, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        InclusiveIntRange[] inclusiveIntRangeArr17 = {C0030.m2938(18)};
        String strM1904 = C0023.m1904(m2081(), 836, 17, 2618);
        m2082(strM4022, strM1904, inclusiveIntRangeArr17);
        m2082(strM5942, strM1904, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM26952, strM1904, new InclusiveIntRange[]{C0030.m2938(18)});
        m2082(strM13097, strM1904, new InclusiveIntRange[]{C0030.m2938(18)});
        m2082(strM3603, strM1904, new InclusiveIntRange[]{C0030.m2938(18)});
        InclusiveIntRange[] inclusiveIntRangeArr18 = {C0018.m1093(21, 23)};
        String strM1443 = C0020.m1443(m2081(), 853, 17, 767);
        m2082(strM625, strM1443, inclusiveIntRangeArr18);
        InclusiveIntRange[] inclusiveIntRangeArr19 = {C0018.m1093(21, 23)};
        String strM28402 = C0030.m2840(m2081(), 870, 19, 624);
        m2082(strM625, strM28402, inclusiveIntRangeArr19);
        InclusiveIntRange[] inclusiveIntRangeArr20 = {C0018.m1093(21, 23)};
        String strM33303 = C0033.m3330(m2081(), 889, 19, 2918);
        m2082(strM625, strM33303, inclusiveIntRangeArr20);
        InclusiveIntRange[] inclusiveIntRangeArr21 = {C0018.m1093(21, 23)};
        String strM5418 = C0067.m5418(m2081(), 908, 19, 2428);
        m2082(strM625, strM5418, inclusiveIntRangeArr21);
        InclusiveIntRange[] inclusiveIntRangeArr22 = {C0018.m1093(21, 23)};
        String strM3678 = C0036.m3678(m2081(), 927, 19, 1723);
        m2082(strM625, strM3678, inclusiveIntRangeArr22);
        m2082(strM4022, strM1443, new InclusiveIntRange[]{C0030.m2938(18)});
        m2082(strM4022, strM28402, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM33303, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM5418, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM4022, strM3678, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM1443, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM28402, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM5942, strM33303, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM5418, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM5942, strM3678, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM1443, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM28402, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM33303, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM26952, strM5418, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM26952, strM3678, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM1443, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM28402, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM33303, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM13097, strM5418, new InclusiveIntRange[]{C0030.m2938(21)});
        m2082(strM13097, strM3678, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM1443, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM28402, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM33303, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM5418, new InclusiveIntRange[]{C0018.m1093(21, 23)});
        m2082(strM3603, strM3678, new InclusiveIntRange[]{C0030.m2938(21)});
        HashMap map = new HashMap();
        OID_TO_JCA_DIGEST_ALG = map;
        C0035.m3624(map, strM625, C0017.m936(m2081(), 946, 3, 1363));
        C0035.m3624(map, strM4022, C0017.m936(m2081(), 949, 5, 2468));
        C0035.m3624(map, strM5942, C0024.m1945(m2081(), 954, 7, 2589));
        C0035.m3624(map, strM26952, C0037.m3829(m2081(), 961, 7, 980));
        C0035.m3624(map, strM13097, C0075.m6791(m2081(), 968, 7, 2922));
        C0035.m3624(map, strM3603, C0021.m1650(m2081(), 975, 7, 3230));
        HashMap map2 = new HashMap();
        OID_TO_JCA_SIGNATURE_ALG = map2;
        C0035.m3624(map2, strM3330, C0023.m1904(m2081(), 982, 10, 917));
        C0035.m3624(map2, strM4066, C0074.m6452(m2081(), 992, 11, 1062));
        C0035.m3624(map2, strM2609, C0033.m3330(m2081(), PointerIconCompat.TYPE_HELP, 13, 451));
        C0035.m3624(map2, strM2840, C0030.m2840(m2081(), PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 13, 3253));
        C0035.m3624(map2, strM7205, C0067.m5418(m2081(), 1029, 13, 2995));
        C0035.m3624(map2, strM33302, C0076.m6902(m2081(), 1042, 13, 1042));
        C0035.m3624(map2, strM4828, C0026.m2321(m2081(), 1055, 11, 1339));
        C0035.m3624(map2, strM3829, C0068.m5544(m2081(), 1066, 13, 1540));
        C0035.m3624(map2, strM3047, C0067.m5418(m2081(), 1079, 13, 1131));
        C0035.m3624(map2, strM1443, C0111.m13097(m2081(), 1092, 13, 2023));
        C0035.m3624(map2, strM28402, C0111.m13097(m2081(), 1105, 15, 742));
        C0035.m3624(map2, strM33303, C0074.m6452(m2081(), 1120, 15, 599));
        C0035.m3624(map2, strM5418, C0039.m4066(m2081(), 1135, 15, 3045));
        C0035.m3624(map2, strM3678, C0030.m2840(m2081(), 1150, 15, 625));
    }

    public static void addSupportedSigAlg(String str, String str2, InclusiveIntRange... inclusiveIntRangeArr) {
        Map mapM7209 = C0077.m7209();
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, str);
        C0077.m7290(sb, C0069.m5807(m2081(), 1165, 4, 687));
        C0077.m7290(sb, str2);
        C0035.m3624(mapM7209, C0068.m5536(sb), C0021.m1596(inclusiveIntRangeArr));
    }

    public static List<InclusiveIntRange> getSigAlgSupportedApiLevels(String str, String str2) {
        Map mapM7209 = C0077.m7209();
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, str);
        C0077.m7290(sb, C0020.m1443(m2081(), 1169, 4, 2092));
        C0077.m7290(sb, str2);
        List<InclusiveIntRange> list = (List) C0072.m6108(mapM7209, C0068.m5536(sb));
        return list != null ? list : C0037.m3866();
    }
}
