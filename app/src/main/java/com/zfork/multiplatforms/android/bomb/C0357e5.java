package com.zfork.multiplatforms.android.bomb;

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
import com.google.android.gms.location.LocationRequest;
import com.google.common.base.Ascii;
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
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import j$.time.Instant;
import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0357e5 extends FilterInputStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f317short = {1001, 992, 1019, 896, 989, 990, 975, 988, 989, 971, 896, 989, 967, 980, 971, 2543, 2534, 2557, 2438, 2523, 2520, 2505, 2522, 2523, 2509, 2438, 2522, 2509, 2505, 2500, 2523, 2497, 2514, 2509, 692, 701, 678, 733, 640, 643, 658, 641, 640, 662, 733, 669, 658, 670, 662, 1896, 1901, 1898, 1903, 1908, 1893, 1904, 1900, 1468, 1452, 1447, 1446, 1443, 1462, 1473, 1417, 1414, 1411, 1418, 1435, 1430, 1439, 1418, 871, 866, 873, 874, 889, 872, 867, 866, 893, 878, 773, 840, 857, 846, 842, 863, 834, 836, 837, 863, 834, 838, 846, 2609, 2602, 2597, 2601, 2593, 2257, 2248, 2261, 2257, 2265, 768, 777, 774, 778, 770, 3144, 3167, 3138, 3142, 3150, 1892, 1905, 1900, 1896, 1888, 2075, 2049, 2066, 2061, 3027, 3010, 3031, 3019, 1409, 1437, 1424, 923, 917, 920, 1678, 1694, 1685, 1684, 1681, 1668, 1779, 1721, 1720, 1707, 1712, 1716, 1715, 1714, 1711, 3269, 3285, 3294, 3295, 3290, 3279, 3256, 3314, 3315, 3296, 3323, 3319, 3324, 3321, 3300, 282, 281, 264, 283, 282, 268, 1020, 1004, 999, 998, 995, 1014, 897, 989, 970, 974, 963, 988, 966, 981, 970, 3133, 3104, 3108, 3116, 2727, 2717, 2702, 2705, 2772, 2717, 2695, 2772, 2715, 2689, 2688, 2772, 2715, 2706, 2772, 2694, 2709, 2714, 2707, 2705, 2766, 2772, 1749, 1785, 1764, 1764, 1763, 1766, 1762, 1779, 1778, 1718, 1730, 1751, 1732, 1718, 1783, 1764, 1781, 1790, 1791, 1760, 1779, 1720, 1718, 1747, 1784, 1762, 1764, 1775, 1718, 1765, 1791, 1772, 1779, 1718, 1791, 1765, 1718, 1784, 1779, 1777, 1783, 1762, 1791, 1760, 1779, 664, 700, 699, 698, 679, 757, 689, 688, 675, 700, 694, 688, 757, 699, 672, 696, 695, 688, 679, 757, 700, 678, 757, 698, 672, 673, 757, 698, 691, 757, 679, 692, 699, 690, 688, 751, 757, 978, 1022, 995, 995, 996, 993, 997, 1012, 1013, 945, 965, 976, 963, 945, 1008, 995, 1010, 1017, 1016, 999, 1012, 959, 945, 981, 1012, 999, 956, 988, 1016, 1023, 1022, 995, 945, 1016, 994, 945, 1023, 1012, 1014, 1008, 997, 1016, 999, 1012, 1282, 1326, 1317, 1312, 1341, 1391, 1323, 1322, 1337, 1318, 1324, 1322, 1391, 1313, 1338, 1314, 1325, 1322, 1341, 1391, 1318, 1340, 1391, 1312, 1338, 1339, 1391, 1312, 1321, 1391, 1341, 1326, 1313, 1320, 1322, 1397, 1391, 1981, 1937, 1932, 1932, 1931, 1934, 1930, 1947, 1946, 2014, 1962, 1983, 1964, 2014, 1951, 1932, 1949, 1942, 1943, 1928, 1947, 2000, 2014, 1978, 1947, 1928, 2003, 1971, 1951, 1940, 1937, 1932, 2014, 1943, 1933, 2014, 1936, 1947, 1945, 1951, 1930, 1943, 1928, 1947, 2574, 2594, 2623, 2623, 2616, 2621, 2617, 2600, 2601, 2669, 2585, 2572, 2591, 2669, 2604, 2623, 2606, 2597, 2596, 2619, 2600, 2659, 2669, 2590, 2621, 2604, 2623, 2622, 2600, 2669, 2607, 2593, 2594, 2606, 2598, 2622, 2669, 2603, 2594, 2623, 2669, 1347, 1292, 1301, 1286, 1297, 1295, 1282, 1299, 1347, 1286, 1282, 1280, 1291, 1347, 1292, 1303, 1291, 1286, 1297, 1357, 2711, 2732, 2736, 2727, 2723, 2726, 2723, 2720, 2734, 2727, 2786, 2710, 2691, 2704, 2786, 2723, 2736, 2721, 2730, 2731, 2740, 2727, 2796, 2786, 2701, 2724, 2724, 2737, 2727, 2742, 2786, 2723, 2732, 2726, 2786, 2732, 2743, 2735, 2720, 2747, 2742, 2727, 2737, 2786, 2724, 2733, 2736, 2786, 2737, 2738, 2723, 2736, 2737, 2727, 2786, 2720, 2734, 2733, 2721, 2729, 2786, 2731, 2732, 2786, 2878, 2922, 2929, 2929, 2878, 2930, 2943, 2924, 2937, 2939, 2864, 3006, 2962, 2959, 2959, 2952, 2957, 2953, 2968, 2969, 3037, 2985, 3004, 2991, 3037, 2972, 2959, 2974, 2965, 2964, 2955, 2968, 3027, 3037, 2990, 2957, 2972, 2959, 2958, 2968, 3037, 2975, 2961, 2962, 2974, 2966, 3037, 2968, 2949, 2953, 2968, 2963, 2969, 2958, 3037, 2975, 2968, 2948, 2962, 2963, 2969, 3037, 2959, 2968, 2972, 2961, 3037, 2958, 2964, 2951, 2968, 3037, 2962, 2971, 3037, 2953, 2965, 2968, 3037, 2968, 2963, 2953, 2959, 2948, 3027, 3071, 3042, 3042, 3045, 3040, 3044, 3061, 3060, 2992, 3043, 3044, 3042, 3045, 3059, 3044, 2992, 3043, 3040, 3057, 3042, 3043, 3061, 2992, 3060, 3061, 3044, 3061, 3059, 3044, 3061, 3060, 2454, 2480, 2487, 2476, 2465, 2467, 2486, 2471, 2470, 2530, 2454, 2435, 2448, 2530, 2467, 2480, 2465, 2474, 2475, 2484, 2471, 918, 1207, 1152, 1152, 1181, 1152, 1234, 1174, 1175, 1158, 1175, 1169, 1158, 1175, 1174, 1234, 1154, 1171, 1152, 1153, 1179, 1180, 1173, 1234, 1158, 1178, 1175, 1234, 1154, 1171, 1162, 1234, 1178, 1175, 1171, 1174, 1175, 1152, 2932, 2934, 2913, 2921, 2917, 2928, 2929, 2934, 2913, 2852, 2913, 2922, 2912, 2852, 2923, 2914, 2852, 2928, 2917, 2934, 2852, 2917, 2934, 2919, 2924, 2925, 2930, 2913, 2858, 2852, 2880, 2925, 2912, 2922, 2851, 2928, 2852, 2914, 2925, 2922, 2912, 2852, 2913, 2940, 2928, 2913, 2922, 2912, 2913, 2912, 2907, 2924, 2913, 2917, 2912, 2913, 2934, 2852, 2917, 2914, 2928, 2913, 2934, 2852, 2924, 2913, 2917, 2912, 2913, 2934, 2852, 2931, 2925, 2928, 2924, 2852, 2913, 2940, 2928, 2913, 2922, 2912, 2913, 2912, 2852, 2914, 2920, 2917, 2915, 2858, 2293, 2242, 2242, 2271, 2242, 2192, 2260, 2261, 2244, 2261, 2259, 2244, 2261, 2260, 2192, 2240, 2257, 2242, 2243, 2265, 2270, 2263, 2192, 2244, 2264, 2261, 2192, 2264, 2261, 2257, 2260, 2261, 2242, 2008, 2001, 1994, 1969, 2028, 2031, 2046, 2029, 2028, 2042, 1969, 2034, 2046, 2031, 1129, 1768, 1732, 1753, 1753, 1758, 1755, 1759, 1742, 1743, 1675, 1791, 1770, 1785, 1675, 1738, 1753, 1736, 1731, 1730, 1757, 1742, 1669, 1675, 1784, 1755, 1738, 1753, 1752, 1742, 1675, 1752, 1759, 1753, 1758, 1736, 1759, 1675, 1733, 1758, 1734, 1737, 1746, 1759, 1742, 1752, 1675, 1736, 1732, 1733, 1759, 1738, 1730, 1733, 1752, 1675, 1733, 1742, 1740, 1738, 1759, 1730, 1757, 1742, 1675, 1757, 1738, 1735, 1758, 1742, 1289, 1317, 1336, 1336, 1343, 1338, 1342, 1327, 1326, 1386, 1310, 1291, 1304, 1386, 1323, 1336, 1321, 1314, 1315, 1340, 1327, 1380, 1386, 1305, 1338, 1323, 1336, 1337, 1327, 1386, 1337, 1342, 1336, 1343, 1321, 1342, 1386, 1317, 1324, 1324, 1337, 1327, 1342, 1386, 1321, 1317, 1316, 1342, 1323, 1315, 1316, 1337, 1386, 1316, 1327, 1325, 1323, 1342, 1315, 1340, 1327, 1386, 1340, 1323, 1318, 1343, 1327, 1147, 1111, 1098, 1098, 1101, 1096, 1100, 1117, 
    1116, 1048, 1132, 1145, 1130, 1048, 1113, 1098, 1115, 1104, 1105, 1102, 1117, 1046, 1048, 1146, 1113, 1116, 1048, 1118, 1111, 1098, 1109, 1113, 1100, 1048, 1105, 1110, 1048, 1151, 1142, 1133, 1046, 1099, 1096, 1113, 1098, 1099, 1117, 1046, 1109, 1113, 1096, 1048, 1128, 1145, 1120, 1048, 1136, 1117, 1113, 1116, 1117, 1098, 1057, 1037, 1040, 1040, 1047, 1042, 1046, 1031, 1030, 1090, 1078, 1059, 1072, 1090, 1027, 1040, 1025, 1034, 1035, 1044, 1031, 1100, 1090, 1073, 1042, 1027, 1040, 1041, 1031, 1090, 1034, 1031, 1027, 1030, 1031, 1040, 1090, 1024, 1038, 1037, 1025, 1033, 1090, 1036, 1047, 1039, 1024, 1051, 1046, 1031, 1041, 1090, 1025, 1037, 1036, 1046, 1027, 1035, 1036, 1041, 1090, 1036, 1031, 1029, 1027, 1046, 1035, 1044, 1031, 1090, 1044, 1027, 1038, 1047, 1031, 618, 582, 603, 603, 604, 601, 605, 588, 589, 521, 637, 616, 635, 521, 584, 603, 586, 577, 576, 607, 588, 519, 521, 634, 601, 584, 603, 602, 588, 521, 577, 588, 584, 589, 588, 603, 521, 587, 581, 582, 586, 578, 521, 582, 591, 591, 602, 588, 605, 521, 586, 582, 583, 605, 584, 576, 583, 602, 521, 583, 588, 590, 584, 605, 576, 607, 588, 521, 607, 584, 581, 604, 588, 2040, 2004, 1993, 1993, 1998, 1995, 1999, 2014, 2015, 1947, 2031, 2042, 2025, 1947, 2010, 1993, 2008, 2003, 2002, 1997, 2014, 1941, 1947, 2037, 2014, 2012, 2010, 1999, 2002, 1997, 2014, 1947, 1997, 2010, 2007, 1998, 2014, 1947, 2002, 2005, 1947, 1992, 1995, 2010, 1993, 1992, 2014, 1947, 2003, 2014, 2010, 2015, 2014, 1993, 1992, 1947, 2009, 2007, 2004, 2008, 2000, 677, 679, 688, 696, 692, 673, 672, 679, 688, 757, 688, 699, 689, 757, 698, 691, 757, 673, 692, 679, 757, 692, 679, 694, 701, 700, 675, 688, 763, 757, 657, 700, 689, 699, 754, 673, 757, 691, 700, 699, 689, 757, 692, 699, 684, 757, 688, 699, 673, 679, 684, 757, 692, 691, 673, 688, 679, 757, 645, 660, 653, 757, 701, 688, 692, 689, 688, 679, 763, 2582, 2623, 2612, 2621, 2606, 2610, 2682, 2615, 2607, 2601, 2606, 2682, 2612, 2613, 2606, 2682, 2616, 2623, 2682, 2612, 2623, 2621, 2619, 2606, 2611, 2604, 2623, 2656, 2682, 2673, 2647, 2640, 2635, 2630, 2628, 2641, 2624, 2625, 2565, 2673, 2660, 2679, 2565, 2628, 2647, 2630, 2637, 2636, 2643, 2624, 423, 390, 457, 394, 412, 411, 411, 396, 391, 413, 457, 413, 392, 411, 457, 396, 391, 413, 411, 400, 1137, 1111, 1104, 1099, 1094, 1092, 1105, 1088, 1089, 1029, 1137, 1124, 1143, 1029, 1092, 1111, 1094, 1101, 1100, 1107, 1088};
    public final byte[] a;
    public long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public boolean f;
    public long g;
    public long h;
    public ArrayList i;
    public int j;
    public C0350d5 k;
    public final C0412n3 l;
    public HashMap m;
    public final ArrayList n;

    /* JADX INFO: renamed from: ۟۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Instant m7048(Object obj) {
        if (C0071.m6069() > 0) {
            return C0350d5.e((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m7049(Object obj) {
        if (C0068.m5678() > 0) {
            return DesugarCollections.unmodifiableList((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static FileTime m7050(Object obj) {
        if (C0033.m3358() <= 0) {
            return C0065.m4698(AbstractC0336b5.m7034((Instant) obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static InputStream m7051(Object obj) {
        if (C0016.m717() <= 0) {
            return ((FilterInputStream) obj).in;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m7052(Object obj, Object obj2) {
        if (C0020.m1385() <= 0) {
            return Objects.requireNonNull(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static Stream m7053(Object obj, Object obj2) {
        if (C0031.m3075() > 0) {
            return ((Stream) obj).filter((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m7054(Object obj) {
        if (C0031.m3075() > 0) {
            return Objects.requireNonNull(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7055() {
        if (C0071.m6069() >= 0) {
            return f317short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m7056(Object obj) {
        if (C0020.m1385() <= 0) {
            C0065.m4698(AbstractC0343c5.m7037((Instant) obj));
        }
    }

    /* JADX INFO: renamed from: ۣۨۡۥ, reason: not valid java name and contains not printable characters */
    public static Comparator m7057(Object obj) {
        if (C0071.m6069() >= 0) {
            return Comparator$CC.comparingLong((ToLongFunction) obj);
        }
        return null;
    }

    public final void b() {
        List listM3866;
        this.j = -1;
        this.i = new ArrayList();
        C0350d5 c0350d5M4328 = C0063.m4328(this);
        ArrayList arrayListM6880 = C0075.m6880(c0350d5M4328);
        if (arrayListM6880 == null || C0025.m2084(arrayListM6880)) {
            listM3866 = C0037.m3866();
        } else {
            listM3866 = (List) C0111.m13090(C0070.m5920(m7053(C0074.m6565(C0075.m6880(c0350d5M4328)), new C0467x(3)), m7057(new X0(1))), C0023.m1922());
            int iM3427 = C0034.m3427(listM3866);
            int i = 0;
            while (i < iM3427) {
                C0371g5 c0371g5 = (C0371g5) C0071.m6078(listM3866, i);
                i++;
                if (i < iM3427 && C0029.m2798(c0371g5) + C0024.m2050(c0371g5) > C0029.m2798((C0371g5) C0071.m6078(listM3866, i))) {
                    StringBuilder sb = new StringBuilder(C0066.m4828(m7055(), 418, 41, 2637));
                    C0077.m7290(sb, C0031.m3046(c0350d5M4328));
                    C0077.m7290(sb, C0039.m4066(m7055(), 459, 20, 1379));
                    throw new IOException(C0068.m5536(sb));
                }
                if (C0029.m2798(c0371g5) + C0024.m2050(c0371g5) < 0) {
                    StringBuilder sb2 = new StringBuilder(C0074.m6452(m7055(), 479, 64, 2754));
                    C0077.m7290(sb2, C0031.m3046(c0350d5M4328));
                    C0077.m7290(sb2, C0070.m5942(m7055(), 543, 11, 2846));
                    throw new IOException(C0068.m5536(sb2));
                }
            }
            if (!C0025.m2084(listM3866)) {
                C0371g5 c0371g52 = (C0371g5) C0071.m6078(listM3866, iM3427 - 1);
                if (C0029.m2798(c0371g52) + C0024.m2050(c0371g52) > (!C0018.m1053(c0350d5M4328) ? C0063.m4394(c0350d5M4328) : C0018.m956(c0350d5M4328))) {
                    throw new IOException(C0017.m936(m7055(), 554, 73, 3069));
                }
            }
        }
        C0364f5 c0364f5 = new C0364f5();
        Iterator itM4732 = C0065.m4732(listM3866);
        long jM2798 = 0;
        while (C0036.m3657(itM4732)) {
            C0371g5 c0371g53 = (C0371g5) C0071.m6012(itM4732);
            long jM27982 = C0029.m2798(c0371g53) - jM2798;
            if (jM27982 < 0) {
                throw new IOException(C0028.m2609(m7055(), 627, 32, 2960));
            }
            if (jM27982 > 0) {
                C0017.m919(C0027.m2497(this), new Q0(c0364f5, jM27982));
            }
            if (C0024.m2050(c0371g53) > 0) {
                C0017.m919(C0027.m2497(this), new Q0(m7051(this), C0024.m2050(c0371g53)));
            }
            jM2798 = C0029.m2798(c0371g53) + C0024.m2050(c0371g53);
        }
        if (C0066.m4881(C0027.m2497(this))) {
            return;
        }
        this.j = 0;
    }

    public final C0350d5 e() throws IOException {
        boolean z;
        int i = 1;
        if (C0022.m1660(this)) {
            return null;
        }
        if (C0063.m4328(this) != null) {
            C0021.m1561();
            C0017.m873(this, Long.MAX_VALUE, new B2(i));
            if (!C0071.m5994(this)) {
                long jM840 = C0017.m840(this);
                if (jM840 > 0 && jM840 % ((long) C0067.m5464(this).length) != 0) {
                    long jM4575 = C0064.m4575(m7051(this));
                    long jM8402 = C0017.m840(this);
                    byte[] bArrM5464 = C0067.m5464(this);
                    long length = (((jM8402 / ((long) bArrM5464.length)) + 1) * ((long) bArrM5464.length)) - jM8402;
                    long jM873 = C0017.m873(m7051(this), length, new B2(i));
                    if (m7051(this) instanceof FileInputStream) {
                        jM873 = C0029.m2757(jM873, jM4575);
                    }
                    if (jM873 != length) {
                        throw new IOException(C0022.m1728(m7055(), 659, 21, 2498));
                    }
                    C0037.m3916(this, jM873);
                }
            }
        }
        byte[] bArrM5626 = C0068.m5626(this);
        if (bArrM5626 == null) {
            this.k = null;
            return null;
        }
        try {
            C0350d5 c0350d5 = new C0350d5(C0026.m2262(this), bArrM5626, C0017.m932(this));
            this.k = c0350d5;
            this.h = 0L;
            this.g = C0063.m4394(c0350d5);
            if (C0064.m4516(c0350d5) == 75) {
                byte[] bArrM6173 = C0072.m6173(this);
                if (bArrM6173 == null) {
                    return null;
                }
                C0350d5 c0350d5M4328 = C0063.m4328(this);
                C0039.m4067(C0017.m932(this), bArrM6173);
                C0030.m2951(c0350d5M4328);
            }
            if (C0064.m4516(C0063.m4328(this)) == 76) {
                byte[] bArrM61732 = C0072.m6173(this);
                if (bArrM61732 == null) {
                    return null;
                }
                String strM4067 = C0039.m4067(C0017.m932(this), bArrM61732);
                C0038.m4050(C0063.m4328(this), strM4067);
                if (C0039.m4131(C0063.m4328(this))) {
                    String strM6791 = C0075.m6791(m7055(), 680, 1, 953);
                    if (!C0072.m6150(strM4067, strM6791)) {
                        C0038.m4050(C0063.m4328(this), C0032.m3232(strM4067, strM6791));
                    }
                }
            }
            boolean z2 = C0064.m4516(C0063.m4328(this)) == 103;
            String strM5544 = C0068.m5544(m7055(), 681, 37, 1266);
            if (z2) {
                this.m = C0071.m5967(this, C0070.m5882(this), C0026.m2262(this), C0017.m840(this));
                C0018.m1014(this);
                if (C0063.m4328(this) == null) {
                    throw new IOException(strM5544);
                }
            }
            try {
                byte bM4516 = C0064.m4516(C0063.m4328(this));
                if (bM4516 == 120 || bM4516 == 88) {
                    C0069.m5798(this);
                } else if (!C0035.m3592(C0026.m2262(this))) {
                    C0063.m4392(this, C0026.m2262(this), C0070.m5882(this));
                }
                C0350d5 c0350d5M43282 = C0063.m4328(this);
                if (C0064.m4516(c0350d5M43282) == 83) {
                    if (C0030.m2847(c0350d5M43282)) {
                        do {
                            byte[] bArrM56262 = C0068.m5626(this);
                            if (bArrM56262 == null) {
                                throw new IOException(C0078.m7427(m7055(), 718, 90, 2820));
                            }
                            ArrayList arrayList = new ArrayList(C0029.m2797(0, bArrM56262, 21));
                            z = bArrM56262[504] == 1;
                            C0029.m2793(C0075.m6880(C0063.m4328(this)), arrayList);
                        } while (z);
                    }
                    C0039.m4151(this);
                }
                C0350d5 c0350d5M43283 = C0063.m4328(this);
                this.g = C0063.m4394(c0350d5M43283);
                return c0350d5M43283;
            } catch (NumberFormatException e) {
                throw new IOException(strM5544, e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IOException(C0037.m3829(m7055(), 808, 33, 2224), e2);
        }
    }

    public final byte[] f() throws IOException {
        boolean z;
        int i = 1;
        byte[] bArrM949 = C0017.m949(this);
        boolean z2 = false;
        if (bArrM949 != null) {
            int length = C0067.m5464(this).length;
            for (int i2 = 0; i2 < length; i2++) {
                if (bArrM949[i2] != 0) {
                    z = false;
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        this.f = z;
        if (!z || bArrM949 == null) {
            return bArrM949;
        }
        boolean zM925 = C0017.m925(m7051(this));
        if (zM925) {
            C0027.m2480(m7051(this), C0067.m5464(this).length);
        }
        try {
            byte[] bArrM9492 = C0017.m949(this);
            if (bArrM9492 != null) {
                int length2 = C0067.m5464(this).length;
                for (int i3 = 0; i3 < length2; i3++) {
                    if (bArrM9492[i3] != 0) {
                        break;
                    }
                }
                z2 = true;
            } else {
                z2 = true;
            }
            if (!z2 && zM925) {
            }
            long jM1966 = C0024.m1966(this) % ((long) C0016.m613(this));
            if (jM1966 > 0) {
                InputStream inputStreamM7051 = m7051(this);
                long jM613 = ((long) C0016.m613(this)) - jM1966;
                C0021.m1561();
                C0037.m3916(this, C0017.m873(inputStreamM7051, jM613, new B2(i)));
            }
            return null;
        } finally {
            if (zM925) {
                this.b = C0024.m1966(this) - ((long) C0067.m5464(this).length);
                C0036.m3727(m7051(this));
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArrM3897 = C0037.m3897(this);
        if (C0039.m4134(this, bArrM3897, 0, 1) == -1) {
            return -1;
        }
        return bArrM3897[0] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM627;
        int i = 1;
        long jM6272 = 0;
        if (j <= 0 || C0071.m5994(this)) {
            return 0L;
        }
        long jM4575 = C0064.m4575(m7051(this));
        C0350d5 c0350d5M4328 = C0063.m4328(this);
        long jM2757 = C0029.m2757(j, (!C0018.m1053(c0350d5M4328) ? C0063.m4394(c0350d5M4328) : C0018.m956(c0350d5M4328)) - C0031.m3104(this));
        if (C0018.m1053(C0063.m4328(this))) {
            ArrayList arrayListM2497 = C0027.m2497(this);
            if (arrayListM2497 == null || C0066.m4881(arrayListM2497)) {
                jM627 = C0016.m627(m7051(this), jM2757);
            } else {
                while (jM6272 < jM2757 && C0069.m5737(this) < C0018.m1084(C0027.m2497(this))) {
                    jM6272 += C0016.m627((InputStream) C0064.m4526(C0027.m2497(this), C0069.m5737(this)), jM2757 - jM6272);
                    if (jM6272 < jM2757) {
                        this.j = C0069.m5737(this) + 1;
                    }
                }
                jM627 = jM6272;
            }
        } else {
            InputStream inputStreamM7051 = m7051(this);
            C0021.m1561();
            jM627 = C0017.m873(inputStreamM7051, jM2757, new B2(i));
            if (m7051(this) instanceof FileInputStream) {
                jM627 = C0029.m2757(jM627, jM4575);
            }
            if (jM627 != jM2757) {
                throw new IOException(C0025.m2151(m7055(), 1402, 21, 1061));
            }
        }
        C0037.m3916(this, jM627);
        this.h = C0031.m3104(this) + jM627;
        return jM627;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357e5(FileInputStream fileInputStream) {
        super(fileInputStream);
        C0039.m4060();
        Charset charsetM1684 = C0022.m1684();
        this.a = new byte[1];
        if (charsetM1684 == null) {
            C0022.m1684();
        }
        this.c = new byte[256];
        this.m = new HashMap();
        this.n = new ArrayList();
        C0033.m3337();
        Charset charsetM16842 = C0022.m1684();
        try {
            charsetM16842 = C0022.m1684();
        } catch (UnsupportedCharsetException unused) {
        }
        Charset charsetM16843 = C0022.m1684();
        try {
            C0039.m4060();
            charsetM16843 = C0022.m1684();
        } catch (UnsupportedCharsetException unused2) {
        }
        String strM7357 = C0078.m7357(charsetM16843);
        this.l = new C0412n3(charsetM16842, C0111.m13073(strM7357 == null ? C0078.m7357(C0022.m1684()) : strM7357));
        this.d = new byte[512];
        this.e = 10240;
    }

    public final void a(HashMap map, ArrayList arrayList) {
        String strM2321 = C0026.m2321(m7055(), 0, 15, 942);
        String strM5942 = C0070.m5942(m7055(), 15, 19, 2472);
        C0350d5 c0350d5M4328 = C0063.m4328(this);
        C0030.m2951(c0350d5M4328);
        Iterator itM2001 = C0024.m2001(C0025.m2117(map));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            String str = (String) C0063.m4368(entry);
            String str2 = (String) C0019.m1293(entry);
            C0030.m2951(str);
            String strM625 = C0016.m625(m7055(), 34, 15, 755);
            byte b = -1;
            switch (C0027.m2392(str)) {
                case -1916861932:
                    if (C0070.m5838(str, C0071.m5991(m7055(), 149, 15, 3222))) {
                        b = 0;
                    }
                    break;
                case -1916619760:
                    if (C0070.m5838(str, C0074.m6452(m7055(), 134, 15, 1757))) {
                        b = 1;
                    }
                    break;
                case -277496563:
                    if (C0070.m5838(str, strM5942)) {
                        b = 2;
                    }
                    break;
                case -160380561:
                    if (C0070.m5838(str, strM2321)) {
                        b = 3;
                    }
                    break;
                case 102338:
                    if (C0070.m5838(str, C0034.m3431(m7055(), 131, 3, PointerIconCompat.TYPE_GRAB))) {
                        b = 4;
                    }
                    break;
                case 115792:
                    if (C0070.m5838(str, C0016.m625(m7055(), 128, 3, 1524))) {
                        b = 5;
                    }
                    break;
                case 3433509:
                    if (C0070.m5838(str, C0066.m4828(m7055(), 124, 4, 2979))) {
                        b = 6;
                    }
                    break;
                case 3530753:
                    if (C0070.m5838(str, C0078.m7427(m7055(), 120, 4, 2152))) {
                        b = 7;
                    }
                    break;
                case 93141678:
                    if (C0070.m5838(str, C0017.m936(m7055(), 115, 5, 1797))) {
                        b = 8;
                    }
                    break;
                case 94988720:
                    if (C0070.m5838(str, C0076.m6902(m7055(), 110, 5, 3115))) {
                        b = 9;
                    }
                    break;
                case 98496370:
                    if (C0070.m5838(str, C0029.m2695(m7055(), LocationRequest.PRIORITY_NO_POWER, 5, 871))) {
                        b = 10;
                    }
                    break;
                case 104223930:
                    if (C0070.m5838(str, C0035.m3603(m7055(), 100, 5, 2236))) {
                        b = Ascii.VT;
                    }
                    break;
                case 111425664:
                    if (C0070.m5838(str, C0038.m4022(m7055(), 95, 5, 2628))) {
                        b = 12;
                    }
                    break;
                case 304222685:
                    if (C0070.m5838(str, C0069.m5807(m7055(), 72, 23, 811))) {
                        b = Ascii.CR;
                    }
                    break;
                case 530706950:
                    if (C0070.m5838(str, C0064.m4545(m7055(), 57, 15, 1519))) {
                        b = Ascii.SO;
                    }
                    break;
                case 1195018015:
                    if (C0070.m5838(str, C0034.m3431(m7055(), 49, 8, 1796))) {
                        b = Ascii.SI;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    int iM3517 = C0035.m3517(str2);
                    if (iM3517 < 0) {
                        throw new IOException(C0076.m6902(m7055(), 374, 44, 2046));
                    }
                    if (iM3517 < 0) {
                        throw new IllegalArgumentException(C0071.m6038(iM3517, C0021.m1650(m7055(), 337, 37, 1359)));
                    }
                    break;
                    break;
                case 1:
                    int iM35172 = C0035.m3517(str2);
                    if (iM35172 < 0) {
                        throw new IOException(C0022.m1728(m7055(), 293, 44, 913));
                    }
                    if (iM35172 < 0) {
                        throw new IllegalArgumentException(C0071.m6038(iM35172, C0031.m3047(m7055(), 256, 37, 725)));
                    }
                    break;
                    break;
                case 2:
                    c0350d5M4328.g = true;
                    c0350d5M4328.h = true;
                    if (C0111.m13072(map, strM625)) {
                        c0350d5M4328.a = (String) C0067.m5420(map, strM625);
                    }
                    if (C0111.m13072(map, strM5942)) {
                        c0350d5M4328.f = C0035.m3517((String) C0067.m5420(map, strM5942));
                    }
                    break;
                case 3:
                    c0350d5M4328.g = true;
                    c0350d5M4328.f = C0035.m3517((String) C0067.m5420(map, strM2321));
                    if (C0111.m13072(map, strM625)) {
                        c0350d5M4328.a = (String) C0067.m5420(map, strM625);
                    }
                    break;
                case 4:
                    C0073.m6415(str2);
                    break;
                case 5:
                    C0073.m6415(str2);
                    break;
                case 6:
                    C0038.m4050(c0350d5M4328, str2);
                    break;
                case 7:
                    long jM6415 = C0073.m6415(str2);
                    if (jM6415 < 0) {
                        throw new IOException(C0019.m1189(m7055(), 211, 45, 1686));
                    }
                    if (jM6415 < 0) {
                        throw new IllegalArgumentException(C0039.m4094(jM6415, C0018.m1070(m7055(), 189, 22, 2804)));
                    }
                    c0350d5M4328.b = jM6415;
                    break;
                    break;
                case 8:
                    m7056(m7048(str2));
                    break;
                case 9:
                    m7056(m7048(str2));
                    break;
                case 10:
                case 12:
                case 15:
                    break;
                case 11:
                    FileTime fileTimeM7050 = m7050(m7048(str2));
                    m7052(fileTimeM7050, C0022.m1728(m7055(), 185, 4, 3145));
                    C0065.m4723(fileTimeM7050);
                    break;
                case 13:
                    m7056(m7048(str2));
                    break;
                case 14:
                    if (C0070.m5838(C0024.m1945(m7055(), 164, 6, 361), str2)) {
                        c0350d5M4328.i = true;
                        String strM5991 = C0071.m5991(m7055(), 170, 15, 943);
                        if (C0111.m13072(map, strM5991)) {
                            c0350d5M4328.f = C0073.m6415((String) C0067.m5420(map, strM5991));
                        }
                    }
                    break;
                default:
                    C0038.m3969(C0023.m1889(c0350d5M4328), str, str2);
                    break;
            }
        }
        C0063.m4328(this).d = arrayList;
    }

    public final void c(long j) {
        if (j != -1) {
            this.b = C0024.m1966(this) + j;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayListM2497 = C0027.m2497(this);
        if (arrayListM2497 != null) {
            Iterator itM4154 = C0039.m4154(arrayListM2497);
            while (C0036.m3657(itM4154)) {
                C0024.m1958((InputStream) C0071.m6012(itM4154));
            }
        }
        C0024.m1958(m7051(this));
    }

    public final byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte[] bArrM4310 = C0063.m4310(this);
            int iM3621 = C0035.m3621(this, bArrM4310);
            if (iM3621 < 0) {
                break;
            }
            C0067.m5408(byteArrayOutputStream, bArrM4310, 0, iM3621);
        }
        C0018.m1014(this);
        if (C0063.m4328(this) == null) {
            return null;
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        while (length > 0 && bArrM7297[length - 1] == 0) {
            length--;
        }
        return length != bArrM7297.length ? C0078.m7349(bArrM7297, length) : bArrM7297;
    }

    public final boolean g() {
        C0350d5 c0350d5M4328 = C0063.m4328(this);
        return c0350d5M4328 != null && C0039.m4131(c0350d5M4328);
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        HashMap mapM5967 = C0071.m5967(this, arrayList, C0026.m2262(this), C0017.m840(this));
        String strM3209 = C0032.m3209(m7055(), 841, 14, 1951);
        long j = 0;
        char c = 1;
        if (C0111.m13072(mapM5967, strM3209)) {
            String str = (String) C0067.m5420(mapM5967, strM3209);
            ArrayList arrayList2 = new ArrayList();
            String[] strArrM2222 = C0025.m2222(str, C0078.m7427(m7055(), 855, 1, 1093));
            if (strArrM2222.length % 2 == 1) {
                throw new IOException(C0031.m3047(m7055(), 992, 62, 1080));
            }
            for (int i = 0; i < strArrM2222.length; i += 2) {
                long jM6415 = C0073.m6415(strArrM2222[i]);
                if (jM6415 < 0) {
                    throw new IOException(C0018.m1070(m7055(), 925, 67, 1354));
                }
                long jM64152 = C0073.m6415(strArrM2222[i + 1]);
                if (jM64152 < 0) {
                    throw new IOException(C0029.m2695(m7055(), 856, 69, 1707));
                }
                C0017.m919(arrayList2, new C0371g5(jM6415, jM64152));
            }
            arrayList = new ArrayList(m7049(arrayList2));
        }
        C0018.m1014(this);
        if (C0063.m4328(this) == null) {
            throw new IOException(C0030.m2840(m7055(), 1263, 69, 725));
        }
        C0063.m4392(this, mapM5967, arrayList);
        if (C0037.m3904(C0063.m4328(this))) {
            InputStream inputStreamM7051 = m7051(this);
            int length = C0067.m5464(this).length;
            ArrayList arrayList3 = new ArrayList();
            long[] jArrM7259 = C0077.m7259(inputStreamM7051);
            long j2 = jArrM7259[0];
            if (j2 < 0) {
                throw new IOException(C0066.m4828(m7055(), 1202, 61, 1979));
            }
            long j3 = jArrM7259[1];
            while (true) {
                long j4 = j2 - 1;
                if (j2 <= j) {
                    long j5 = length;
                    C0017.m873(inputStreamM7051, j5 - (j3 % j5), new B2(0));
                    C0063.m4328(this).d = arrayList3;
                    break;
                }
                long[] jArrM72592 = C0077.m7259(inputStreamM7051);
                long j6 = jArrM72592[0];
                if (j6 < j) {
                    throw new IOException(C0031.m3047(m7055(), 1129, 73, 553));
                }
                long j7 = j3 + jArrM72592[c];
                long[] jArrM72593 = C0077.m7259(inputStreamM7051);
                long j8 = jArrM72593[0];
                if (j8 < j) {
                    throw new IOException(C0067.m5418(m7055(), 1054, 75, 1122));
                }
                j3 = j7 + jArrM72593[1];
                C0017.m919(arrayList3, new C0371g5(j6, j8));
                j2 = j4;
                j = 0;
                c = 1;
            }
        }
        C0039.m4151(this);
    }

    public final byte[] i() {
        int i;
        InputStream inputStreamM7051 = m7051(this);
        byte[] bArrM5464 = C0067.m5464(this);
        C0021.m1561();
        int length = bArrM5464.length;
        if (length < 0 || length > bArrM5464.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        C0071.m6050();
        if (length == 0) {
            i = 0;
        } else {
            m7054(inputStreamM7051);
            if (length < 0) {
                throw new IllegalArgumentException(C0071.m6038(length, C0069.m5807(m7055(), 1332, 29, 2650)));
            }
            int i2 = length;
            while (i2 > 0) {
                int iM3212 = C0032.m3212(inputStreamM7051, bArrM5464, length - i2, i2);
                if (-1 == iM3212) {
                    break;
                }
                i2 -= iM3212;
            }
            i = length - i2;
        }
        C0037.m3916(this, i);
        byte[] bArrM54642 = C0067.m5464(this);
        if (i != bArrM54642.length) {
            return null;
        }
        return bArrM54642;
    }

    public final int j(int i, byte[] bArr, int i2) {
        ArrayList arrayListM2497 = C0027.m2497(this);
        if (arrayListM2497 == null || C0066.m4881(arrayListM2497)) {
            return C0032.m3212(m7051(this), bArr, i, i2);
        }
        if (C0069.m5737(this) >= C0018.m1084(C0027.m2497(this))) {
            return -1;
        }
        int iM3212 = C0032.m3212((InputStream) C0064.m4526(C0027.m2497(this), C0069.m5737(this)), bArr, i, i2);
        if (C0069.m5737(this) == C0018.m1084(C0027.m2497(this)) - 1) {
            return iM3212;
        }
        if (iM3212 == -1) {
            this.j = C0069.m5737(this) + 1;
            return C0064.m4619(this, i, bArr, i2);
        }
        if (iM3212 >= i2) {
            return iM3212;
        }
        this.j = C0069.m5737(this) + 1;
        int iM4619 = C0064.m4619(this, i + iM3212, bArr, i2 - iM3212);
        return iM4619 == -1 ? iM3212 : iM3212 + iM4619;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long jM956;
        if (C0071.m5994(this)) {
            return 0;
        }
        C0350d5 c0350d5M4328 = C0063.m4328(this);
        if (!C0018.m1053(c0350d5M4328)) {
            jM956 = C0063.m4394(c0350d5M4328);
        } else {
            jM956 = C0018.m956(c0350d5M4328);
        }
        long jM3104 = jM956 - C0031.m3104(this);
        if (jM3104 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM3104;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long jM956;
        int iM3212;
        if (i2 == 0) {
            return 0;
        }
        if (C0022.m1660(this) || C0071.m5994(this)) {
            return -1;
        }
        C0350d5 c0350d5M4328 = C0063.m4328(this);
        if (c0350d5M4328 != null) {
            long jM3104 = C0031.m3104(this);
            if (!C0018.m1053(c0350d5M4328)) {
                jM956 = C0063.m4394(c0350d5M4328);
            } else {
                jM956 = C0018.m956(c0350d5M4328);
            }
            if (jM3104 >= jM956) {
                return -1;
            }
            int iM3151 = C0032.m3151(i2, C0025.m2172(this));
            if (C0018.m1053(C0063.m4328(this))) {
                iM3212 = C0064.m4619(this, i, bArr, iM3151);
            } else {
                iM3212 = C0032.m3212(m7051(this), bArr, i, iM3151);
            }
            if (iM3212 != -1) {
                long j = iM3212;
                C0037.m3916(this, j);
                this.h = C0031.m3104(this) + j;
            } else if (iM3151 <= 0) {
                this.f = true;
            } else {
                throw new IOException(C0033.m3330(m7055(), 1361, 21, 2597));
            }
            return iM3212;
        }
        throw new IllegalStateException(C0078.m7427(m7055(), 1382, 20, 489));
    }
}
