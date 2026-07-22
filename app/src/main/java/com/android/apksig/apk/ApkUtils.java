package com.android.apksig.apk;

import android.R;
import androidx.core.view.InputDeviceCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
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
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ApkUtils {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f38short = {2251, 2276, 2286, 2296, 2277, 2275, 2286, 2247, 2283, 2276, 2275, 2284, 2287, 2297, 2302, 2212, 2290, 2279, 2278, 1662, 1657, 1644, 1632, 1661, 1568, 1646, 1640, 1663, 1657, 1568, 1662, 1637, 1644, 1599, 1592, 1595, 2599, 2674, 2665, 2659, 2658, 2677, 2599, 2658, 2667, 2658, 2666, 2658, 2665, 2675, 2599, 2599, 2671, 2610, 2599, 2607, 2639, 1756, 1767, 1786, 1788, 1785, 1785, 1766, 1787, 1789, 1772, 1773, 1705, 1791, 1768, 1765, 1788, 1772, 1705, 1789, 1776, 1785, 1772, 1701, 1705, 3261, 3249, 3319, 3326, 3299, 3249, 3312, 3301, 3301, 3299, 3320, 3315, 3300, 3301, 3316, 3249, 3044, 3011, 3019, 3022, 3015, 3014, 2946, 3030, 3021, 2946, 3014, 3015, 3030, 3015, 3024, 3023, 3019, 3020, 3015, 2946, 3043, 3058, 3049, 2949, 3025, 2946, 499, 434, 423, 423, 417, 442, 433, 422, 423, 438, 499, 2053, 2131, 2116, 2121, 2128, 2112, 2189, 2230, 2233, 2234, 2228, 2237, 2296, 2220, 2231, 2296, 2236, 2237, 2220, 2237, 2218, 2229, 2225, 2230, 2237, 2296, 2222, 2233, 2228, 2221, 2237, 2296, 2238, 2231, 2218, 2296, 2233, 2220, 2220, 2218, 2225, 2234, 2221, 2220, 2237, 2296, 1195, 1200, 1277, 1265, 1276, 1270, 1279, 1250, 1277, 1269, 1268, 1200, 1266, 1273, 1278, 1265, 1250, 1257, 1200, 1250, 1269, 1251, 1279, 1253, 1250, 1267, 1269, 1194, 1200, 1233, 1278, 1268, 1250, 1279, 1273, 1268, 1245, 1265, 1278, 1273, 1270, 1269, 1251, 1252, 1214, 1256, 1277, 1276, 1149, 1105, 1116, 1110, 1119, 1090, 1117, 1109, 1108, 1040, 1137, 1120, 1147, 1034, 1040, 1118, 1119, 1092, 1040, 1105, 1040, 1130, 1145, 1120, 1040, 1105, 1090, 1107, 1112, 1113, 1094, 1109, 277, 314, 304, 294, 315, 317, 304, 281, 309, 314, 317, 306, 305, 295, 288, 378, 300, 313, 312, 2931, 2900, 2908, 2905, 2896, 2897, 2837, 2881, 2906, 2837, 2887, 2896, 2900, 2897, 2837, 2932, 2907, 2897, 2887, 2906, 2908, 2897, 2936, 2900, 2907, 2908, 2899, 2896, 2886, 2881, 2843, 2893, 2904, 2905, 454, 482, 504, 504, 482, 485, 492, 427, 458, 485, 495, 505, 484, 482, 495, 454, 490, 485, 482, 493, 494, 504, 511, 421, 499, 486, 487, 2948, 2981, 3006, 3050, 2987, 3050, 3004, 2987, 2982, 2979, 2990, 3050, 2960, 2947, 2970, 3050, 2987, 3000, 2985, 2978, 2979, 3004, 2991, 2628, 2645, 2645, 2633, 2636, 2630, 2628, 2641, 2636, 2634, 2635, 1493, 1518, 1505, 1506, 1516, 1509, 1440, 1524, 1519, 1440, 1508, 1509, 1524, 1509, 1522, 1517, 1513, 1518, 1509, 1440, 1527, 1512, 1509, 1524, 1512, 1509, 1522, 1440, 1473, 1488, 1483, 1440, 1513, 1523, 1440, 1508, 1509, 1506, 1525, 1511, 1511, 1505, 1506, 1516, 1509, 1466, 1440, 1473, 1518, 1508, 1522, 1519, 1513, 1508, 1485, 1505, 1518, 1513, 1510, 1509, 1523, 1524, 1454, 1528, 1517, 1516, 1447, 1523, 1440, 1505, 1518, 1508, 1522, 1519, 1513, 1508, 1466, 1508, 1509, 1506, 1525, 1511, 1511, 1505, 1506, 1516, 1509, 1440, 1505, 1524, 1524, 1522, 1513, 1506, 1525, 1524, 1509, 1440, 1525, 1523, 1509, 1523, 1440, 1525, 1518, 1523, 1525, 1520, 1520, 1519, 1522, 1524, 1509, 1508, 1440, 1526, 1505, 1516, 1525, 1509, 1440, 1524, 1529, 1520, 1509, 1454, 1440, 1487, 1518, 1516, 1529, 1440, 1506, 1519, 1519, 1516, 1509, 1505, 1518, 1452, 1440, 1523, 1524, 1522, 1513, 1518, 1511, 1440, 1505, 1518, 1508, 1440, 1513, 1518, 1524, 1440, 1526, 1505, 1516, 1525, 1509, 1523, 1440, 1505, 1522, 1509, 1440, 1523, 1525, 1520, 1520, 1519, 1522, 1524, 1509, 1508, 1454, 2257, 2282, 2277, 2278, 2280, 2273, 2212, 2288, 2283, 2212, 2272, 2273, 2288, 2273, 2294, 2281, 2285, 2282, 2273, 2212, 2291, 2284, 2273, 2288, 2284, 2273, 2294, 2212, 2245, 2260, 2255, 2212, 2285, 2295, 2212, 2272, 2273, 2278, 2289, 2275, 2275, 2277, 2278, 2280, 2273, 2238, 2212, 2245, 2282, 2272, 2294, 2283, 2285, 2272, 2249, 2277, 2282, 2285, 2274, 2273, 2295, 2288, 2218, 2300, 2281, 2280, 2211, 2295, 2212, 2277, 2282, 2272, 2294, 2283, 2285, 2272, 2238, 2272, 2273, 2278, 2289, 2275, 2275, 2277, 2278, 2280, 2273, 2212, 2277, 2288, 2288, 2294, 2285, 2278, 2289, 2288, 2273, 2212, 2294, 2273, 2274, 2273, 2294, 2273, 2282, 2279, 2273, 2295, 2212, 2277, 2212, 2294, 2273, 2295, 2283, 2289, 2294, 2279, 2273, 2218, 2212, 2262, 2273, 2274, 2273, 2294, 2273, 2282, 2279, 2273, 2295, 2212, 2277, 2294, 2273, 2212, 2282, 2283, 2288, 2212, 2295, 2289, 2292, 2292, 2283, 2294, 2288, 2273, 2272, 2212, 2274, 2283, 2294, 2212, 2295, 2273, 2279, 2289, 2294, 2285, 2288, 2301, 2212, 2294, 2273, 2277, 2295, 2283, 2282, 2295, 2218, 2212, 2251, 2282, 2280, 2301, 2212, 2279, 2283, 2282, 2295, 2288, 2277, 2282, 2288, 2212, 2278, 2283, 2283, 2280, 2273, 2277, 2282, 2216, 2212, 2295, 2288, 2294, 2285, 2282, 2275, 2212, 2277, 2282, 2272, 2212, 2285, 2282, 2288, 2212, 2290, 2277, 2280, 2289, 2273, 2295, 2212, 2277, 2294, 2273, 2212, 2295, 2289, 2292, 2292, 2283, 2294, 2288, 2273, 2272, 2218, 476, 474, 477, 461, 2883, 2885, 2882, 2898, 537, 2256, 2283, 2276, 2279, 2281, 2272, 2213, 2289, 2282, 2213, 2273, 2272, 2289, 2272, 2295, 2280, 2284, 2283, 2272, 2213, 2290, 2285, 2272, 2289, 2285, 2272, 2295, 2213, 2244, 2261, 2254, 2213, 2284, 2294, 2213, 2273, 2272, 2279, 2288, 2274, 2274, 2276, 2279, 2281, 2272, 2239, 2213, 2280, 2276, 2281, 2275, 2282, 2295, 2280, 2272, 2273, 2213, 2279, 2284, 2283, 2276, 2295, 2300, 2213, 2295, 2272, 2294, 2282, 2288, 2295, 2278, 2272, 2239, 2213, 2244, 2283, 2273, 2295, 2282, 2284, 2273, 2248, 2276, 2283, 2284, 2275, 2272, 2294, 2289, 2219, 2301, 2280, 2281, 1752, 1748, 1755, 1756, 1747, 1744, 1734, 1729, 1748, 1775, 1760, 1763, 1773, 1764, 1697, 1781, 1774, 1697, 1765, 1764, 1781, 1764, 1779, 1772, 1768, 1775, 1764, 1697, 1728, 1745, 1738, 1702, 1778, 1697, 1772, 1768, 1775, 1768, 1772, 1780, 1772, 1697, 1778, 1780, 1777, 1777, 1774, 1779, 1781, 1764, 1765, 1697, 1728, 1775, 1765, 1779, 1774, 1768, 1765, 1697, 1777, 1773, 1760, 1781, 1767, 1774, 1779, 1772, 1697, 1783, 1764, 1779, 1778, 1768, 1774, 1775, 1697, 1723, 1697, 1748, 1775, 1778, 1780, 1777, 1777, 1774, 1779, 1781, 1764, 1765, 1697, 1762, 1774, 1765, 1764, 1775, 1760, 1772, 1764, 1697, 1768, 1775, 1697, 1728, 1775, 1765, 1779, 1774, 1768, 1765, 1740, 1760, 1775, 1768, 1767, 1764, 
    1778, 1781, 1711, 1785, 1772, 1773, 1702, 1778, 1697, 1772, 1768, 1775, 1746, 1765, 1770, 1751, 1764, 1779, 1778, 1768, 1774, 1775, 1723, 1697, 1699, 2635, 1627, 1629, 1611, 1629, 1539, 1629, 1610, 1605, 2648, 2659, 2668, 2671, 2657, 2664, 2605, 2681, 2658, 2605, 2665, 2664, 2681, 2664, 2687, 2656, 2660, 2659, 2664, 2605, 2636, 2653, 2630, 2602, 2686, 2605, 2656, 2660, 2659, 2660, 2656, 2680, 2656, 2605, 2686, 2680, 2685, 2685, 2658, 2687, 2681, 2664, 2665, 2605, 2636, 2659, 2665, 2687, 2658, 2660, 2665, 2615, 2605, 2680, 2659, 2686, 2680, 2685, 2685, 2658, 2687, 2681, 2664, 2665, 2605, 2683, 2668, 2657, 2680, 2664, 2605, 2681, 2676, 2685, 2664, 2605, 2660, 2659, 2605, 2636, 2659, 2665, 2687, 2658, 2660, 2665, 2624, 2668, 2659, 2660, 2667, 2664, 2686, 2681, 2595, 2677, 2656, 2657, 2602, 2686, 2605, 2656, 2660, 2659, 2654, 2665, 2662, 2651, 2664, 2687, 2686, 2660, 2658, 2659, 2595, 2605, 2626, 2659, 2657, 2676, 2605, 2660, 2659, 2681, 2664, 2666, 2664, 2687, 2605, 2683, 2668, 2657, 2680, 2664, 2686, 2605, 2686, 2680, 2685, 2685, 2658, 2687, 2681, 2664, 2665, 2595, 2996, 2959, 2944, 2947, 2957, 2948, 3009, 2965, 2958, 3009, 2949, 2948, 2965, 2948, 2963, 2956, 2952, 2959, 2948, 3009, 2976, 2993, 2986, 3014, 2962, 3009, 2956, 2952, 2959, 2952, 2956, 2964, 2956, 3009, 2962, 2964, 2961, 2961, 2958, 2963, 2965, 2948, 2949, 3009, 2976, 2959, 2949, 2963, 2958, 2952, 2949, 3009, 2961, 2957, 2944, 2965, 2951, 2958, 2963, 2956, 3009, 2967, 2948, 2963, 2962, 2952, 2958, 2959, 3035, 3009, 2956, 2944, 2957, 2951, 2958, 2963, 2956, 2948, 2949, 3009, 2947, 2952, 2959, 2944, 2963, 2968, 3009, 2963, 2948, 2962, 2958, 2964, 2963, 2946, 2948, 3035, 3009, 2976, 2959, 2949, 2963, 2958, 2952, 2949, 2988, 2944, 2959, 2952, 2951, 2948, 2962, 2965, 3023, 2969, 2956, 2957, 2698, 2694, 2697, 2702, 2689, 2690, 2708, 2707, 484, 501, 503, 511, 501, 499, 497, 2831, 2868, 2875, 2872, 2870, 2879, 2938, 2862, 2869, 2938, 2878, 2879, 2862, 2879, 2856, 2871, 2867, 2868, 2879, 2938, 2843, 2826, 2833, 2938, 2858, 2875, 2873, 2865, 2875, 2877, 2879, 2938, 2868, 2875, 2871, 2879, 2912, 2938, 2871, 2875, 2870, 2876, 2869, 2856, 2871, 2879, 2878, 2938, 2872, 2867, 2868, 2875, 2856, 2851, 2938, 2856, 2879, 2857, 2869, 2863, 2856, 2873, 2879, 2912, 2938, 2843, 2868, 2878, 2856, 2869, 2867, 2878, 2839, 2875, 2868, 2867, 2876, 2879, 2857, 2862, 2932, 2850, 2871, 2870, 1515, 1511, 1512, 1519, 1504, 1507, 1525, 1522, 1158, 1152, 1174, 1152, 1246, 1152, 1175, 1176, 2790, 2794, 2789, 2786, 2797, 2798, 2808, 2815};
    public static final String ANDROID_MANIFEST_ZIP_ENTRY_NAME = C0072.m6116(m595(), 0, 19, 2186);
    public static final String SOURCE_STAMP_CERTIFICATE_HASH_ZIP_ENTRY_NAME = C0024.m1945(m595(), 19, 17, 1549);

    /* JADX INFO: renamed from: com.android.apksig.apk.ApkUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class CodenamesLazyInitializer {
        public static final Pair[] a = {C0025.m2158(C0072.m6228('C'), C0021.m1548(2)), C0025.m2158(C0072.m6228('D'), C0021.m1548(3)), C0025.m2158(C0072.m6228('E'), C0021.m1548(4)), C0025.m2158(C0072.m6228('F'), C0021.m1548(7)), C0025.m2158(C0072.m6228('G'), C0021.m1548(8)), C0025.m2158(C0072.m6228('H'), C0021.m1548(10)), C0025.m2158(C0072.m6228('I'), C0021.m1548(13)), C0025.m2158(C0072.m6228('J'), C0021.m1548(15)), C0025.m2158(C0072.m6228('K'), C0021.m1548(18)), C0025.m2158(C0072.m6228('L'), C0021.m1548(20)), C0025.m2158(C0072.m6228('M'), C0021.m1548(22)), C0025.m2158(C0072.m6228('N'), C0021.m1548(23)), C0025.m2158(C0072.m6228('O'), C0021.m1548(25))};
        public static final Comparator b = new ByFirstComparator(null);

        public static class ByFirstComparator implements Comparator<Pair<Character, Integer>> {
            /* JADX INFO: renamed from: ۤۡ۠۠, reason: not valid java name and contains not printable characters */
            public static int m599(Object obj, Object obj2, Object obj3) {
                if (C0027.m2460() > 0) {
                    return ((ByFirstComparator) obj).compare2((Pair<Character, Integer>) obj2, (Pair<Character, Integer>) obj3);
                }
                return 0;
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Pair<Character, Integer> pair, Pair<Character, Integer> pair2) {
                return m599(this, pair, pair2);
            }

            /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
            public int compare2(Pair<Character, Integer> pair, Pair<Character, Integer> pair2) {
                return C0034.m3387((Character) C0111.m13157(pair)) - C0034.m3387((Character) C0111.m13157(pair2));
            }

            public ByFirstComparator(AnonymousClass1 anonymousClass1) {
            }
        }

        /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
        public static Pair[] m597() {
            if (C0066.m4827() >= 0) {
                return a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
        public static Comparator m598() {
            if (C0071.m6069() >= 0) {
                return b;
            }
            return null;
        }
    }

    public static int a(ByteBuffer byteBuffer, String str, int i) throws ApkFormatException {
        String strM1945 = C0024.m1945(m595(), 36, 15, 2567);
        String strM1070 = C0018.m1070(m595(), 51, 6, 2583);
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            for (int iM4714 = C0065.m4714(androidBinXmlParser); iM4714 != 2; iM4714 = C0030.m2830(androidBinXmlParser)) {
                if (iM4714 == 3 && C0070.m5838(str, C0016.m631(androidBinXmlParser))) {
                    for (int i2 = 0; i2 < C0033.m3301(androidBinXmlParser); i2++) {
                        if (C0078.m7375(androidBinXmlParser, i2) == i) {
                            int iM6800 = C0075.m6800(androidBinXmlParser, i2);
                            if (iM6800 != 1 && iM6800 != 2) {
                                StringBuilder sb = new StringBuilder();
                                C0077.m7290(sb, C0067.m5418(m595(), 57, 24, 1673));
                                C0021.m1551(sb, iM6800);
                                C0077.m7290(sb, C0033.m3330(m595(), 81, 16, 3217));
                                C0077.m7290(sb, C0021.m1531(strM1070, new Object[]{C0021.m1548(i)}));
                                C0077.m7290(sb, strM1945);
                                C0077.m7290(sb, str);
                                throw new ApkFormatException(C0068.m5536(sb));
                            }
                            return C0037.m3870(androidBinXmlParser, i2);
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            C0077.m7290(sb2, C0030.m2840(m595(), 97, 26, 2978));
            C0077.m7290(sb2, str);
            C0077.m7290(sb2, C0034.m3431(m595(), 123, 11, 467));
            C0077.m7290(sb2, C0021.m1531(strM1070, new Object[]{C0021.m1548(i)}));
            C0077.m7290(sb2, C0076.m6902(m595(), 134, 6, 2085));
            throw new ApkFormatException(C0068.m5536(sb2));
        } catch (AndroidBinXmlParser.XmlParserException e) {
            StringBuilder sb3 = new StringBuilder(C0072.m6116(m595(), 140, 40, 2264));
            C0077.m7290(sb3, C0021.m1531(strM1070, new Object[]{C0021.m1548(i)}));
            C0077.m7290(sb3, strM1945);
            C0077.m7290(sb3, str);
            C0077.m7290(sb3, C0021.m1650(m595(), 180, 48, 1168));
            throw new ApkFormatException(C0068.m5536(sb3), e);
        }
    }

    public static ApkSigningBlock findApkSigningBlock(DataSource dataSource) throws ApkFormatException {
        try {
            return C0019.m1287(dataSource, C0036.m3656(dataSource));
        } catch (ZipFormatException e) {
            throw new ApkFormatException(C0063.m4315(m595(), 228, 32, 1072), e);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Pair[] m594() {
        if (C0033.m3358() <= 0) {
            return CodenamesLazyInitializer.m597();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m595() {
        if (C0023.m1921() > 0) {
            return f38short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Comparator m596() {
        if (C0034.m3450() > 0) {
            return CodenamesLazyInitializer.m598();
        }
        return null;
    }

    public static class ApkSigningBlock extends ApkUtilsLite.ApkSigningBlock {
        public ApkSigningBlock(long j, DataSource dataSource) {
            super(j, dataSource);
        }
    }

    public static class ZipSections extends com.android.apksig.zip.ZipSections {
        public ZipSections(long j, long j2, int i, long j3, ByteBuffer byteBuffer) {
            super(j, j2, i, j3, byteBuffer);
        }
    }

    public static boolean getDebuggableFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws ApkFormatException {
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            for (int iM4714 = C0065.m4714(androidBinXmlParser); iM4714 != 2; iM4714 = C0030.m2830(androidBinXmlParser)) {
                if (iM4714 == 3 && C0019.m1237(androidBinXmlParser) == 2 && C0070.m5838(C0020.m1443(m595(), 363, 11, 2597), C0016.m631(androidBinXmlParser)) && C0077.m7292(C0063.m4417(androidBinXmlParser))) {
                    for (int i = 0; i < C0033.m3301(androidBinXmlParser); i++) {
                        if (C0078.m7375(androidBinXmlParser, i) == 16842767) {
                            int iM6800 = C0075.m6800(androidBinXmlParser, i);
                            if (iM6800 != 1 && iM6800 != 2) {
                                if (iM6800 == 3) {
                                    throw new ApkFormatException(C0030.m2840(m595(), 551, 231, 2180));
                                }
                                if (iM6800 != 4) {
                                    throw new ApkFormatException(C0028.m2609(m595(), 374, 177, 1408));
                                }
                            }
                            String strM920 = C0017.m920(androidBinXmlParser, i);
                            return C0070.m5838(C0027.m2404(m595(), 782, 4, 424), strM920) || C0070.m5838(C0072.m6116(m595(), 786, 4, 2839), strM920) || C0070.m5838(C0070.m5942(m595(), 790, 1, 552), strM920);
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (AndroidBinXmlParser.XmlParserException e) {
            throw new ApkFormatException(C0064.m4545(m595(), 791, 93, 2181), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r4 = com.zfork.entry.C0075.m6800(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r4 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r4 != 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r6 = com.android.apksig.C0037.m3870(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        throw new com.android.apksig.apk.MinSdkVersionException(com.android.apksig.util.C0031.m3047(m595(), 1034, 146, 2573));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r6 = com.android.apksig.C0037.m3896(com.android.apksig.internal.apk.stamp.C0017.m920(r0, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r2 = com.joke.script.bean.C0074.m6445(r2, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getMinSdkVersionFromBinaryAndroidManifest(java.nio.ByteBuffer r57) throws com.android.apksig.apk.MinSdkVersionException {
        /*
            r6 = r57
            com.android.apksig.internal.apk.AndroidBinXmlParser r0 = new com.android.apksig.internal.apk.AndroidBinXmlParser     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r0.<init>(r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            int r6 = com.joke.connectdevice.bean.C0065.m4714(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r1 = 1
            r2 = 1
        Ld:
            r3 = 2
            if (r6 == r3) goto L8e
            r4 = 3
            if (r6 != r4) goto L89
            int r6 = com.android.apksig.internal.apk.C0019.m1237(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            if (r6 != r3) goto L89
            short[] r24 = m595()     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r27 = 1582(0x62e, float:2.217E-42)
            r25 = 1026(0x402, float:1.438E-42)
            r26 = 8
            java.lang.String r24 = com.zfork.multiplatforms.android.bomb.C0078.m7427(r24, r25, r26, r27)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r6 = r24
            java.lang.String r4 = com.android.apksig.apk.C0016.m631(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            boolean r6 = com.joke.plugin.gson.internal.reflect.C0070.m5838(r6, r4)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            if (r6 == 0) goto L89
            java.lang.String r6 = com.joke.basetoollib.C0063.m4417(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            boolean r6 = com.zfork.multiplatforms.android.bomb.C0077.m7292(r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            if (r6 == 0) goto L89
            r6 = 0
        L41:
            int r4 = com.android.apksig.zip.C0033.m3301(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            if (r6 >= r4) goto L84
            int r4 = com.zfork.multiplatforms.android.bomb.C0078.m7375(r0, r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r5 = 16843276(0x101020c, float:2.3695027E-38)
            if (r4 != r5) goto L81
            int r4 = com.zfork.entry.C0075.m6800(r0, r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            if (r4 == r1) goto L78
            if (r4 != r3) goto L5f
            int r6 = com.android.apksig.C0037.m3870(r0, r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            goto L85
        L5d:
            r6 = move-exception
            goto L8f
        L5f:
            com.android.apksig.apk.MinSdkVersionException r6 = new com.android.apksig.apk.MinSdkVersionException     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            short[] r32 = m595()     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r35 = 2573(0xa0d, float:3.606E-42)
            r33 = 1034(0x40a, float:1.449E-42)
            r34 = 146(0x92, float:2.05E-43)
            java.lang.String r32 = com.android.apksig.util.C0031.m3047(r32, r33, r34, r35)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            r0 = r32
            r6.<init>(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            throw r6     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
        L78:
            java.lang.String r6 = com.android.apksig.internal.apk.stamp.C0017.m920(r0, r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            int r6 = com.android.apksig.C0037.m3896(r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            goto L85
        L81:
            int r6 = r6 + 1
            goto L41
        L84:
            r6 = 1
        L85:
            int r2 = com.joke.script.bean.C0074.m6445(r2, r6)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
        L89:
            int r6 = com.android.apksig.kms.C0030.m2830(r0)     // Catch: com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException -> L5d
            goto Ld
        L8e:
            return r2
        L8f:
            com.android.apksig.apk.MinSdkVersionException r0 = new com.android.apksig.apk.MinSdkVersionException
            short[] r21 = m595()
            r24 = 3041(0xbe1, float:4.261E-42)
            r22 = 1180(0x49c, float:1.654E-42)
            r23 = 116(0x74, float:1.63E-43)
            java.lang.String r21 = com.android.apksig.internal.oid.C0025.m2151(r21, r22, r23, r24)
            r1 = r21
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.apk.ApkUtils.getMinSdkVersionFromBinaryAndroidManifest(java.nio.ByteBuffer):int");
    }

    public static String getPackageNameFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws ApkFormatException {
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            for (int iM4714 = C0065.m4714(androidBinXmlParser); iM4714 != 2; iM4714 = C0030.m2830(androidBinXmlParser)) {
                if (iM4714 == 3 && C0019.m1237(androidBinXmlParser) == 1 && C0070.m5838(C0023.m1904(m595(), 1296, 8, 2791), C0016.m631(androidBinXmlParser)) && C0077.m7292(C0063.m4417(androidBinXmlParser))) {
                    for (int i = 0; i < C0033.m3301(androidBinXmlParser); i++) {
                        if (C0070.m5838(C0021.m1650(m595(), 1304, 7, 404), C0022.m1762(androidBinXmlParser, i)) && C0077.m7292(C0063.m4417(androidBinXmlParser))) {
                            return C0017.m920(androidBinXmlParser, i);
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (AndroidBinXmlParser.XmlParserException e) {
            throw new ApkFormatException(C0066.m4828(m595(), 1311, 84, 2906), e);
        }
    }

    public static int getTargetSandboxVersionFromBinaryAndroidManifest(ByteBuffer byteBuffer) {
        try {
            return C0037.m3786(byteBuffer, C0032.m3209(m595(), 1395, 8, 1414), R.attr.targetSandboxVersion);
        } catch (ApkFormatException unused) {
            return 1;
        }
    }

    public static int getTargetSdkVersionFromBinaryAndroidManifest(ByteBuffer byteBuffer) {
        try {
            return C0037.m3786(byteBuffer, C0076.m6902(m595(), 1403, 8, 1267), R.attr.targetSdkVersion);
        } catch (ApkFormatException unused) {
            C0038.m3987(byteBuffer);
            try {
                return C0068.m5655(byteBuffer);
            } catch (ApkFormatException unused2) {
                return 1;
            }
        }
    }

    public static int getVersionCodeFromBinaryAndroidManifest(ByteBuffer byteBuffer) {
        return C0037.m3786(byteBuffer, C0029.m2695(m595(), 1411, 8, 2699), R.attr.versionCode);
    }

    public static byte[] computeSha256DigestBytes(byte[] bArr) {
        return C0028.m2551(bArr);
    }

    public static ZipSections findZipSections(DataSource dataSource) {
        com.android.apksig.zip.ZipSections zipSectionsM4556 = C0064.m4556(dataSource);
        return new ZipSections(C0030.m2922(zipSectionsM4556), C0037.m3871(zipSectionsM4556), C0030.m2912(zipSectionsM4556), C0016.m621(zipSectionsM4556), C0070.m5867(zipSectionsM4556));
    }

    public static ByteBuffer getAndroidManifest(DataSource dataSource) throws ApkFormatException {
        CentralDirectoryRecord centralDirectoryRecord;
        try {
            ZipSections zipSectionsM3656 = C0036.m3656(dataSource);
            Iterator itM4732 = C0065.m4732(C0022.m1716(dataSource, zipSectionsM3656));
            while (true) {
                if (C0036.m3657(itM4732)) {
                    centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4732);
                    if (C0070.m5838(C0017.m936(m595(), 260, 19, 340), C0073.m6387(centralDirectoryRecord))) {
                        break;
                    }
                } else {
                    centralDirectoryRecord = null;
                    break;
                }
            }
            if (centralDirectoryRecord != null) {
                DataSource dataSourceM6182 = C0072.m6182(dataSource, 0L, C0030.m2922(zipSectionsM3656));
                try {
                    return C0020.m1393(C0021.m1585(dataSourceM6182, centralDirectoryRecord, C0072.m6146(dataSourceM6182)));
                } catch (ZipFormatException e) {
                    throw new ApkFormatException(C0066.m4828(m595(), 279, 34, 2869), e);
                }
            }
            throw new ApkFormatException(C0037.m3829(m595(), 313, 27, 395));
        } catch (ZipFormatException e2) {
            throw new ApkFormatException(C0019.m1189(m595(), 340, 23, 3018), e2);
        }
    }

    public static long getLongVersionCodeFromBinaryAndroidManifest(ByteBuffer byteBuffer) {
        long jM3786;
        int iM1298 = C0019.m1298(byteBuffer);
        try {
            C0038.m3987(byteBuffer);
            jM3786 = C0037.m3786(byteBuffer, C0028.m2609(m595(), 884, 8, 1717), R.attr.versionCodeMajor);
        } catch (ApkFormatException unused) {
            jM3786 = 0;
        }
        return (jM3786 << 32) | ((long) iM1298);
    }

    public static int getMinSdkVersionForCodename(String str) throws CodenameMinSdkVersionException {
        char cM7212;
        if (C0077.m7292(str)) {
            cM7212 = ' ';
        } else {
            cM7212 = C0077.m7212(str, 0);
        }
        if (cM7212 >= 'A' && cM7212 <= 'Z') {
            Pair[] pairArrM594 = m594();
            int iM2389 = C0027.m2389(pairArrM594, C0025.m2158(C0072.m6228(cM7212), null), m596());
            if (iM2389 >= 0) {
                return C0025.m2170((Integer) C0037.m3781(pairArrM594[iM2389]));
            }
            if ((-1) - iM2389 == 0) {
                return 1;
            }
            Pair pair = pairArrM594[(-2) - iM2389];
            return (cM7212 - C0034.m3387((Character) C0111.m13157(pair))) + C0025.m2170((Integer) C0037.m3781(pair));
        }
        throw new CodenameMinSdkVersionException(C0074.m6503(C0033.m3330(m595(), 892, 133, 1665), str, C0071.m5991(m595(), InputDeviceCompat.SOURCE_GAMEPAD, 1, 2665)), str);
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBufferM6043 = C0071.m6043(byteBuffer);
        C0064.m4604(byteBufferM6043, C0072.m6217());
        C0067.m5417(byteBufferM6043, j);
    }

    public static void updateZipEocdCommentLen(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM6043 = C0071.m6043(byteBuffer);
        C0064.m4604(byteBufferM6043, C0072.m6217());
        C0031.m3085(byteBufferM6043);
    }

    public static ApkSigningBlock findApkSigningBlock(DataSource dataSource, ZipSections zipSections) {
        ApkUtilsLite.ApkSigningBlock apkSigningBlockM1360 = C0020.m1360(dataSource, zipSections);
        return new ApkSigningBlock(C0026.m2367(apkSigningBlockM1360), C0030.m2860(apkSigningBlockM1360));
    }
}
