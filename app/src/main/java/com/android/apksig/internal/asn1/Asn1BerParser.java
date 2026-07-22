package com.android.apksig.internal.asn1;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.ber.BerDataValue;
import com.android.apksig.internal.asn1.ber.BerDataValueFormatException;
import com.android.apksig.internal.asn1.ber.BerDataValueReader;
import com.android.apksig.internal.asn1.ber.ByteBufferBerDataValueReader;
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
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Asn1BerParser {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f81short = {2406, 2373, 2391, 2369, 2313, 2325, 2326, 2332, 2308, 2378, 2385, 2377, 2374, 2369, 2390, 2308, 2384, 2379, 2379, 2308, 2376, 2373, 2390, 2371, 2369, 940, 906, 909, 918, 923, 921, 908, 925, 924, 984, 922, 921, 907, 925, 981, 969, 970, 960, 984, 925, 918, 923, 919, 924, 925, 924, 984, 913, 918, 904, 909, 908, 962, 984, 917, 913, 907, 907, 913, 918, 927, 984, 908, 925, 906, 917, 913, 918, 921, 908, 913, 918, 927, 984, 922, 897, 908, 925, 980, 984, 911, 913, 908, 912, 984, 912, 913, 927, 912, 925, 907, 908, 984, 922, 913, 908, 984, 918, 919, 908, 984, 907, 925, 908, 1561, 1592, 1571, 1655, 1590, 1655, 1588, 1592, 1593, 1571, 1590, 1598, 1593, 1586, 1573, 1655, 1571, 1582, 1575, 1586, 1645, 1655, 2273, 2278, 2300, 2285, 2287, 2285, 2298, 2184, 2251, 2249, 2246, 2246, 2247, 2268, 2184, 2250, 2253, 2184, 2266, 2253, 2264, 2266, 2253, 2267, 2253, 2246, 2268, 2253, 2252, 2184, 2249, 2267, 2184, 2241, 2246, 2268, 2194, 2184, 2189, 2201, 2188, 2252, 2184, 2176, 2200, 2256, 2189, 2201, 2188, 2256, 2177, 970, 973, 983, 966, 964, 966, 977, 931, 992, 994, 1005, 1005, 1004, 1015, 931, 993, 998, 931, 1009, 998, 1011, 1009, 998, 1008, 998, 1005, 1015, 998, 999, 931, 994, 1008, 931, 1007, 1004, 1005, 996, 953, 931, 934, 946, 935, 999, 931, 939, 947, 1019, 934, 946, 935, 1019, 938, 2099, 2075, 2054, 2050, 2063, 2134, 2105, 2100, 2108, 2099, 2101, 2082, 2134, 2111, 2098, 2099, 2104, 2082, 2111, 2096, 2111, 2099, 2084, 2183, 1763, 1732, 1756, 1739, 1734, 1731, 1742, 1674, 1771, 1785, 1764, 1668, 1691, 1674, 1739, 1732, 1732, 1733, 1758, 1739, 1758, 1731, 1733, 1732, 1674, 1733, 1732, 1674, 2798, 2747, 2749, 2731, 2730, 2798, 2721, 2720, 2798, 2735, 2798, 2749, 2746, 2735, 2746, 2727, 2733, 2798, 2728, 2727, 2731, 2722, 2730, 2804, 2798, 643, 696, 677, 675, 678, 678, 697, 676, 674, 691, 690, 758, 663, 645, 664, 760, 743, 758, 693, 697, 696, 674, 695, 703, 696, 691, 676, 758, 695, 696, 696, 697, 674, 695, 674, 703, 697, 696, 758, 674, 687, 678, 691, 748, 758, 897, 944, 931, 930, 952, 959, 950, 1009, 946, 958, 959, 933, 944, 952, 959, 948, 931, 1009, 2021, 1963, 1962, 1969, 2021, 1974, 1968, 1973, 1973, 1962, 1975, 1969, 1952, 1953, 597, 622, 613, 632, 624, 613, 611, 628, 613, 612, 544, 612, 609, 628, 609, 544, 630, 609, 620, 629, 613, 544, 626, 613, 609, 612, 544, 609, 627, 544, 398, 384, 485, 472, 464, 453, 451, 468, 453, 452, 384, 1777, 1789, 1727, 1704, 1705, 1789, 1711, 1720, 1724, 1721, 1767, 1789, 1520, 1465, 1443, 1520, 1470, 1471, 1444, 1520, 1457, 1470, 1470, 1471, 1444, 1457, 1444, 1461, 1460, 1520, 1447, 1465, 1444, 1464, 1520, 2556, 2544, 2545, 2539, 2558, 2550, 2545, 2554, 2541, 2524, 2547, 2558, 2540, 2540, 2495, 2466, 2466, 2495, 2545, 2538, 2547, 2547, 2184, 2179, 2180, 2178, 2184, 2190, 2283, 2221, 2210, 2222, 2215, 2223, 2232, 2283, 2218, 2233, 2222, 2283, 2210, 2213, 2223, 2210, 2232, 2239, 2210, 2213, 2220, 2238, 2210, 2232, 2211, 2218, 2217, 2215, 2222, 2283, 2217, 2222, 2216, 2218, 2238, 2232, 2222, 2283, 2239, 2211, 2222, 2226, 2283, 2211, 2218, 2237, 2222, 2283, 2239, 2211, 2222, 2283, 2232, 2218, 2214, 2222, 2283, 2239, 2218, 2220, 2283, 2216, 2215, 2218, 2232, 2232, 2283, 2218, 2213, 2223, 2283, 2213, 2238, 2214, 2217, 2222, 2233, 2289, 2283, 2311, 3216, 3281, 3294, 3284, 3216, 3230, 2667, 2634, 2565, 2634, 2645, 2641, 2636, 2634, 2635, 2646, 2565, 2634, 2627, 2565, 2662, 2669, 2666, 2668, 2662, 2656, 2565, 1639, 1578, 1574, 1587, 1572, 1583, 1570, 1571, 1219, 1252, 1260, 1257, 1248, 1249, 1189, 1265, 1258, 1189, 1260, 1259, 1270, 1265, 1252, 1259, 1265, 1260, 1252, 1265, 1248, 1189, 435, 402, 477, 411, 404, 408, 401, 409, 398, 477, 412, 403, 403, 402, 393, 412, 393, 408, 409, 477, 394, 404, 393, 405, 477, 1251, 1194, 1197, 1251, 1152, 1163, 1164, 1162, 1152, 1158, 1251, 1184, 1199, 1186, 1200, 1200, 1251, 1850, 2747, 2708, 2712, 2705, 2713, 2702, 2781, 2709, 2716, 2699, 2712, 2781, 2697, 2709, 2712, 2781, 2702, 2716, 2704, 2712, 2781, 2708, 2707, 2713, 2712, 2693, 2759, 2781, 2148, 2085, 2090, 2080, 2148, 2154, 1611, 1644, 1636, 1633, 1640, 1641, 1581, 1657, 1634, 1581, 1661, 1644, 1663, 1662, 1640, 1581, 3186, 3166, 3155, 3161, 3152, 3149, 3154, 3162, 3163, 3103, 3163, 3166, 3147, 3166, 3103, 3145, 3166, 3155, 3146, 3162, 1476, 1507, 1515, 1518, 1511, 1510, 1442, 1526, 1517, 1442, 1515, 1516, 1521, 1526, 1507, 1516, 1526, 1515, 1507, 1526, 1511, 1442, 2011, 2039, 2042, 2032, 2041, 2020, 2043, 2035, 2034, 1974, 2034, 2039, 2018, 2039, 1974, 2016, 2039, 2042, 2019, 2035, 1034, 1058, 1087, 1083, 1078, 1135, 1062, 1057, 1087, 1082, 1083, 1507, 1476, 1484, 1481, 1472, 1473, 1413, 1489, 1482, 1413, 1473, 1472, 1478, 1482, 1473, 1472, 1413, 1489, 1482, 1493, 1416, 1481, 1472, 1491, 1472, 1481, 1413, 1473, 1476, 1489, 1476, 1413, 1491, 1476, 1481, 1488, 1472, 630, 606, 579, 583, 586, 531, 602, 605, 579, 582, 583, 731, 764, 756, 753, 760, 761, 701, 745, 754, 701, 761, 760, 766, 754, 761, 760, 701, 745, 754, 749, 688, 753, 760, 747, 760, 753, 701, 761, 764, 745, 764, 701, 747, 764, 753, 744, 760};

    public static final class AnnotatedField {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f82short = {1519, 1498, 1500, 1435, 1493, 1486, 1494, 1497, 1502, 1481, 1435, 1494, 1486, 1480, 1487, 1435, 1497, 1502, 1435, 1480, 1483, 1502, 1496, 1490, 1501, 1490, 1502, 1503, 1435, 1484, 1491, 1502, 1493, 1435, 1487, 1498, 1500, 1500, 1490, 1493, 1500, 1435, 1494, 1492, 1503, 1502, 1435, 1490, 1480, 1435, 1133, 1121, 1059, 1076, 1077, 1121, 1063, 1070, 1076, 1071, 1061, 1121, 711, 754, 756, 691, 766, 762, 736, 766, 754, 743, 752, 763, 701, 691, 726, 747, 739, 758, 752, 743, 758, 759, 681, 691, 1310, 1337, 1329, 1332, 1341, 1340, 1400, 1324, 1335, 1400, 1322, 1341, 1337, 1340, 1400, 1339, 1335, 1334, 1324, 1341, 1334, 1324, 1323, 1400, 1335, 1342, 1400, 1309, 1280, 1288, 1300, 1297, 1307, 1297, 1292, 1400, 1340, 1337, 1324, 1337, 1400, 1326, 1337, 1332, 1325, 1341, 2893, 2936, 2942, 2873, 2932, 2928, 2922, 2932, 2936, 2925, 2938, 2929, 2871, 2873, 2908, 2913, 2921, 2940, 2938, 2925, 2940, 2941, 2873, 2938, 2933, 2936, 2922, 2922, 2851, 2873};
        public final Field a;
        public final Asn1Field b;
        public final Asn1Type c;
        public final int d;
        public final int e;
        public final Asn1Tagging f;
        public final boolean g;

        /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
        public static Asn1Field m1467(Object obj) {
            if (C0034.m3450() > 0) {
                return ((AnnotatedField) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
        public static Asn1Tagging m1468(Object obj) {
            if (C0024.m2011() <= 0) {
                return ((AnnotatedField) obj).f;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟۠۟ۥۥ, reason: not valid java name and contains not printable characters */
        public static short[] m1469() {
            if (C0074.m6454() < 0) {
                return f82short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
        public static Asn1Type m1470(Object obj) {
            if (C0064.m4578() >= 0) {
                return ((AnnotatedField) obj).c;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۨۡۥ, reason: not valid java name and contains not printable characters */
        public static void m1471(Object obj, Object obj2, Object obj3, Object obj4) throws Asn1DecodingException {
            if (C0027.m2460() >= 0) {
                BerToJavaConverter.setFieldValue(obj, (Field) obj2, (Asn1Type) obj3, (BerDataValue) obj4);
            }
        }

        /* JADX INFO: renamed from: ۟ۧ۟۟ۢ, reason: not valid java name and contains not printable characters */
        public static int m1472(Object obj) {
            if (C0023.m1921() > 0) {
                return ((AnnotatedField) obj).d;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۡۢۥۦ, reason: not valid java name and contains not printable characters */
        public static Field m1473(Object obj) {
            if (C0073.m6356() < 0) {
                return ((AnnotatedField) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۧۤۢ, reason: not valid java name and contains not printable characters */
        public static boolean m1474(Object obj) {
            if (C0031.m3075() > 0) {
                return ((AnnotatedField) obj).g;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۨ۟ۥ, reason: not valid java name and contains not printable characters */
        public static int m1475(Object obj) {
            if (C0018.m1064() >= 0) {
                return ((AnnotatedField) obj).e;
            }
            return 0;
        }

        public Asn1Field getAnnotation() {
            return m1467(this);
        }

        public int getBerTagClass() {
            return m1472(this);
        }

        public int getBerTagNumber() {
            return m1475(this);
        }

        public Field getField() {
            return m1473(this);
        }

        public boolean isOptional() {
            return m1474(this);
        }

        public AnnotatedField(Field field, Asn1Field asn1Field) throws Asn1DecodingException {
            int iM7457;
            this.a = field;
            this.b = asn1Field;
            Asn1Type asn1TypeM3713 = C0036.m3713(asn1Field);
            this.c = asn1TypeM3713;
            Asn1TagClass asn1TagClassM6778 = C0075.m6778(asn1Field);
            if (asn1TagClassM6778 == C0038.m3941()) {
                if (C0037.m3857(asn1Field) != -1) {
                    asn1TagClassM6778 = C0022.m1736();
                } else {
                    asn1TagClassM6778 = C0074.m6577();
                }
            }
            this.d = C0028.m2608(asn1TagClassM6778);
            if (C0037.m3857(asn1Field) != -1) {
                iM7457 = C0037.m3857(asn1Field);
            } else if (asn1TypeM3713 != C0073.m6400() && asn1TypeM3713 != C0029.m2773()) {
                iM7457 = C0078.m7457(asn1TypeM3713);
            } else {
                iM7457 = -1;
            }
            this.e = iM7457;
            Asn1Tagging asn1TaggingM3540 = C0035.m3540(asn1Field);
            this.f = asn1TaggingM3540;
            if ((asn1TaggingM3540 != C0025.m2100() && asn1TaggingM3540 != C0070.m5928()) || C0037.m3857(asn1Field) != -1) {
                this.g = C0068.m5659(asn1Field);
            } else {
                StringBuilder sb = new StringBuilder(C0019.m1189(m1469(), 0, 50, 1467));
                C0036.m3741(sb, asn1TaggingM3540);
                throw new Asn1DecodingException(C0068.m5536(sb));
            }
        }

        public void setValueFrom(BerDataValue berDataValue, Object obj) throws Asn1DecodingException {
            BerDataValue berDataValueM3891 = berDataValue;
            int iM6522 = C0074.m6522(berDataValueM3891);
            String strM4828 = C0066.m4828(m1469(), 50, 12, 1089);
            int iM1472 = m1472(this);
            int iM1475 = m1475(this);
            if (iM1475 != -1) {
                int iM2253 = C0026.m2253(berDataValueM3891);
                if (iM6522 != iM1472 || iM2253 != iM1475) {
                    StringBuilder sb = new StringBuilder(C0064.m4545(m1469(), 62, 24, 659));
                    C0077.m7290(sb, C0017.m869(iM1472, iM1475));
                    C0077.m7290(sb, strM4828);
                    C0077.m7290(sb, C0017.m869(iM6522, iM2253));
                    throw new Asn1UnexpectedTagException(C0068.m5536(sb));
                }
            } else if (iM6522 != iM1472) {
                StringBuilder sb2 = new StringBuilder(C0068.m5544(m1469(), 132, 30, 2841));
                C0077.m7290(sb2, C0039.m4061(iM1472));
                C0077.m7290(sb2, strM4828);
                C0077.m7290(sb2, C0039.m4061(iM6522));
                throw new Asn1UnexpectedTagException(C0068.m5536(sb2));
            }
            if (m1468(this) == C0025.m2100()) {
                try {
                    berDataValueM3891 = C0037.m3891(C0032.m3228(berDataValueM3891));
                } catch (BerDataValueFormatException e) {
                    throw new Asn1DecodingException(C0068.m5544(m1469(), 86, 46, 1368), e);
                }
            }
            m1471(obj, m1473(this), m1470(this), berDataValueM3891);
        }
    }

    public static final class BerToJavaConverter {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f83short = {2697, 2734, 2723, 2735, 2738, 2738, 2725, 2723, 2740, 2784, 2725, 2734, 2723, 2735, 2724, 2725, 2724, 2784, 2739, 2729, 2746, 2725, 2784, 2735, 2726, 2784, 2722, 2735, 2735, 2732, 2725, 2721, 2734, 2784, 2742, 2721, 2732, 2741, 2725, 2810, 2784, 3135, 3076, 3097, 3103, 3098, 3098, 3077, 3096, 3102, 3087, 3086, 3146, 3081, 3077, 3076, 3100, 3087, 3096, 3097, 3075, 3077, 3076, 3152, 3146, 3115, 3129, 3108, 3140, 3163, 3146, 819, 871, 892, 819, 2840, 2879, 2871, 2866, 2875, 2874, 2942, 2858, 2865, 2942, 2861, 2875, 2858, 2942, 2856, 2879, 2866, 2859, 2875, 2942, 2865, 2872, 2942, 2989};
        public static final byte[] a = new byte[0];

        /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
        public static short[] m1476() {
            if (C0039.m4109() > 0) {
                return f83short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
        public static int[] m1477() {
            if (C0038.m4010() > 0) {
                return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۥۡۧ, reason: not valid java name and contains not printable characters */
        public static Object m1478(Object obj, Object obj2, Object obj3) {
            if (C0073.m6356() < 0) {
                return convert((Asn1Type) obj, (BerDataValue) obj2, (Class) obj3);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
        public static byte[] m1479() {
            if (C0075.m6893() >= 0) {
                return a;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> T convert(Asn1Type asn1Type, BerDataValue berDataValue, Class<T> cls) throws Asn1DecodingException {
            if (C0023.m1865(ByteBuffer.class, cls)) {
                return (T) C0067.m5497(berDataValue);
            }
            if (C0023.m1865(byte[].class, cls)) {
                ByteBuffer byteBufferM5497 = C0067.m5497(berDataValue);
                if (!C0111.m13127(byteBufferM5497)) {
                    return (T) m1479();
                }
                T t = (T) new byte[C0071.m5984(byteBufferM5497)];
                C0029.m2812(byteBufferM5497, t);
                return t;
            }
            if (C0023.m1865(Asn1OpaqueObject.class, cls)) {
                return (T) new Asn1OpaqueObject(C0028.m2543(berDataValue));
            }
            ByteBuffer byteBufferM54972 = C0067.m5497(berDataValue);
            int i = m1477()[C0030.m2893(asn1Type)];
            if (i == 1) {
                Asn1Class asn1Class = (Asn1Class) C0036.m3675(cls);
                if (asn1Class != null && C0067.m5524(asn1Class) == C0073.m6400()) {
                    return (T) C0035.m3607(berDataValue, cls);
                }
            } else if (i != 2) {
                switch (i) {
                    case 6:
                        if (C0023.m1865(C0072.m6191(), cls) || C0023.m1865(Integer.class, cls)) {
                            return (T) C0021.m1548(C0037.m3882(byteBufferM54972));
                        }
                        if (C0023.m1865(C0066.m4824(), cls) || C0023.m1865(Long.class, cls)) {
                            return (T) C0070.m5853(C0067.m5527(byteBufferM54972));
                        }
                        if (C0023.m1865(BigInteger.class, cls)) {
                            return (T) C0019.m1197(byteBufferM54972);
                        }
                        break;
                    case 7:
                        if (C0023.m1865(String.class, cls)) {
                            return (T) C0018.m1011(byteBufferM54972);
                        }
                        break;
                    case 8:
                    case 9:
                        if (C0023.m1865(String.class, cls)) {
                            return (T) new String(C0071.m6029(byteBufferM54972));
                        }
                        break;
                    case 10:
                        if (C0023.m1865(C0024.m2007(), cls)) {
                            if (C0071.m5984(byteBufferM54972) == 1) {
                                return (T) new Boolean(C0069.m5826(byteBufferM54972) != 0);
                            }
                            StringBuilder sb = new StringBuilder(C0038.m4022(m1476(), 0, 41, 2752));
                            C0021.m1551(sb, C0071.m5984(byteBufferM54972));
                            throw new Asn1DecodingException(C0068.m5536(sb));
                        }
                        break;
                }
            } else {
                Asn1Class asn1Class2 = (Asn1Class) C0036.m3675(cls);
                if (asn1Class2 != null && C0067.m5524(asn1Class2) == C0073.m6354()) {
                    return (T) C0036.m3707(berDataValue, cls);
                }
            }
            StringBuilder sb2 = new StringBuilder(C0027.m2404(m1476(), 41, 30, 3178));
            C0036.m3741(sb2, asn1Type);
            C0077.m7290(sb2, C0034.m3431(m1476(), 71, 4, 787));
            C0077.m7290(sb2, C0038.m3997(cls));
            throw new Asn1DecodingException(C0068.m5536(sb2));
        }

        public static void setFieldValue(Object obj, Field field, Asn1Type asn1Type, BerDataValue berDataValue) throws Asn1DecodingException {
            try {
                int i = m1477()[C0030.m2893(asn1Type)];
                if (i != 4 && i != 5) {
                    C0018.m1091(field, obj, m1478(asn1Type, berDataValue, C0111.m13067(field)));
                } else if (C0023.m1865(Asn1OpaqueObject.class, C0111.m13067(field))) {
                    C0018.m1091(field, obj, m1478(asn1Type, berDataValue, C0111.m13067(field)));
                } else {
                    C0018.m1091(field, obj, C0023.m1858(berDataValue, C0026.m2294(field)));
                }
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder(C0076.m6902(m1476(), 75, 23, 2910));
                C0077.m7290(sb, C0038.m3997(C0030.m2951(obj)));
                C0077.m7290(sb, C0034.m3431(m1476(), 98, 1, 2947));
                C0077.m7290(sb, C0033.m3333(field));
                throw new Asn1DecodingException(C0068.m5536(sb), e);
            }
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1458(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((AnnotatedField) obj).isOptional();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static int[] m1459() {
        if (C0017.m846() > 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m1460() {
        if (C0073.m6356() <= 0) {
            return f81short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1461(Object obj) {
        if (C0018.m1064() > 0) {
            return ((AnnotatedField) obj).getBerTagClass();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m1462(Object obj, Object obj2, Object obj3) throws Asn1DecodingException {
        if (C0071.m6069() > 0) {
            ((AnnotatedField) obj).setValueFrom((BerDataValue) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Asn1Field m1463(Object obj) {
        if (C0020.m1385() < 0) {
            return ((AnnotatedField) obj).getAnnotation();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۥ, reason: contains not printable characters */
    public static Field m1464(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((AnnotatedField) obj).getField();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۠, reason: not valid java name and contains not printable characters */
    public static int m1465(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((AnnotatedField) obj).getBerTagNumber();
        }
        return 0;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.asn1.Asn1BerParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;

        /* JADX INFO: renamed from: ۨ۟۠ۡ, reason: not valid java name and contains not printable characters */
        public static int[] m1466() {
            if (C0069.m5781() < 0) {
                return $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0074.m6478().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Type = iArr;
            try {
                iArr[C0030.m2893(C0073.m6400())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m1466()[C0030.m2893(C0073.m6354())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m1466()[C0030.m2893(C0029.m2724())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m1466()[C0030.m2893(C0032.m3160())] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m1466()[C0030.m2893(C0019.m1252())] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m1466()[C0030.m2893(C0019.m1179())] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                m1466()[C0030.m2893(C0070.m5879())] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m1466()[C0030.m2893(C0066.m4885())] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                m1466()[C0030.m2893(C0069.m5753())] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                m1466()[C0030.m2893(C0072.m6207())] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class Asn1UnexpectedTagException extends Asn1DecodingException {
        public Asn1UnexpectedTagException(String str) {
            super(str);
        }
    }

    public static Object d(BerDataValue berDataValue, Class cls) throws Asn1DecodingException {
        if (cls == null) {
            throw new NullPointerException(C0039.m4066(m1460(), 464, 22, 2463));
        }
        Asn1Class asn1Class = (Asn1Class) C0036.m3675(cls);
        if (asn1Class == null) {
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0038.m3997(cls));
            C0077.m7290(sb, C0030.m2840(m1460(), 441, 23, 1488));
            C0077.m7290(sb, C0038.m3997(Asn1Class.class));
            throw new Asn1DecodingException(C0068.m5536(sb));
        }
        int[] iArrM1459 = m1459();
        int i = iArrM1459[C0030.m2893(C0067.m5524(asn1Class))];
        if (i != 1 && i != 2 && i != 3) {
            StringBuilder sb2 = new StringBuilder(C0038.m4022(m1460(), 311, 45, 726));
            C0036.m3741(sb2, C0067.m5524(asn1Class));
            throw new Asn1DecodingException(C0068.m5536(sb2));
        }
        Asn1Type asn1TypeM5524 = C0067.m5524(asn1Class);
        int i2 = iArrM1459[C0030.m2893(asn1TypeM5524)];
        if (i2 == 1) {
            return C0026.m2312(berDataValue, cls);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return C0068.m5634(berDataValue, cls, true);
            }
            StringBuilder sb3 = new StringBuilder(C0066.m4828(m1460(), 356, 18, 977));
            C0036.m3741(sb3, asn1TypeM5524);
            C0077.m7290(sb3, C0020.m1443(m1460(), 374, 14, 1989));
            throw new Asn1DecodingException(C0068.m5536(sb3));
        }
        int iM7457 = C0078.m7457(asn1TypeM5524);
        if (C0074.m6522(berDataValue) == 0 && C0026.m2253(berDataValue) == iM7457) {
            return C0068.m5634(berDataValue, cls, false);
        }
        StringBuilder sb4 = new StringBuilder(C0028.m2609(m1460(), 388, 30, 512));
        C0077.m7290(sb4, C0038.m3997(cls));
        C0077.m7290(sb4, C0069.m5807(m1460(), 418, 11, 416));
        C0077.m7290(sb4, C0017.m869(0, iM7457));
        C0077.m7290(sb4, C0037.m3829(m1460(), 429, 12, 1757));
        C0077.m7290(sb4, C0017.m869(C0074.m6522(berDataValue), C0026.m2253(berDataValue)));
        throw new Asn1UnexpectedTagException(C0068.m5536(sb4));
    }

    public static ArrayList g(BerDataValue berDataValue, Class cls) throws Asn1DecodingException {
        ArrayList arrayList = new ArrayList();
        BerDataValueReader berDataValueReaderM3228 = C0032.m3228(berDataValue);
        while (true) {
            try {
                BerDataValue berDataValueM3891 = C0037.m3891(berDataValueReaderM3228);
                if (berDataValueM3891 == null) {
                    return arrayList;
                }
                C0017.m919(arrayList, C0023.m1865(ByteBuffer.class, cls) ? C0067.m5497(berDataValueM3891) : C0023.m1865(Asn1OpaqueObject.class, cls) ? new Asn1OpaqueObject(C0028.m2543(berDataValueM3891)) : C0071.m6058(berDataValueM3891, cls));
            } catch (BerDataValueFormatException e) {
                throw new Asn1DecodingException(C0022.m1728(m1460(), 764, 20, 1942), e);
            }
        }
    }

    public static <T> T parse(ByteBuffer byteBuffer, Class<T> cls) throws Asn1DecodingException {
        try {
            BerDataValue berDataValueM1224 = C0019.m1224(new ByteBufferBerDataValueReader(byteBuffer));
            if (berDataValueM1224 != null) {
                return (T) C0071.m6058(berDataValueM1224, cls);
            }
            throw new Asn1DecodingException(C0036.m3678(m1460(), 784, 11, 1103));
        } catch (BerDataValueFormatException e) {
            throw new Asn1DecodingException(C0028.m2609(m1460(), 795, 37, 1445), e);
        }
    }

    public static <T> List<T> parseImplicitSetOf(ByteBuffer byteBuffer, Class<T> cls) throws Asn1DecodingException {
        try {
            BerDataValue berDataValueM1224 = C0019.m1224(new ByteBufferBerDataValueReader(byteBuffer));
            if (berDataValueM1224 != null) {
                return C0029.m2729(berDataValueM1224, cls);
            }
            throw new Asn1DecodingException(C0071.m5991(m1460(), 832, 11, 563));
        } catch (BerDataValueFormatException e) {
            throw new Asn1DecodingException(C0065.m4757(m1460(), 843, 37, 669), e);
        }
    }

    public static long a(ByteBuffer byteBuffer) throws Asn1DecodingException {
        long j = 0;
        if (!C0111.m13127(byteBuffer)) {
            return 0L;
        }
        while (C0111.m13127(byteBuffer)) {
            if (j <= 72057594037927935L) {
                byte bM5826 = C0069.m5826(byteBuffer);
                j = (j << 7) | ((long) (bM5826 & 127));
                if ((bM5826 & 128) == 0) {
                    return j;
                }
            } else {
                throw new Asn1DecodingException(C0036.m3678(m1460(), 0, 25, 2340));
            }
        }
        throw new Asn1DecodingException(C0019.m1189(m1460(), 25, 84, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW));
    }

    public static Class access$000(Field field) throws Asn1DecodingException {
        String strM3938 = C0038.m3938(C0020.m1431(field));
        int iM2051 = C0024.m2051(strM3938, 60);
        String strM936 = C0017.m936(m1460(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 22, 1623);
        if (iM2051 != -1) {
            int i = iM2051 + 1;
            int iM4569 = C0064.m4569(strM3938, 62, i);
            if (iM4569 != -1) {
                return C0039.m4101(C0032.m3220(strM3938, i, iM4569));
            }
            StringBuilder sb = new StringBuilder(strM936);
            C0036.m3741(sb, C0020.m1431(field));
            throw new Asn1DecodingException(C0068.m5536(sb));
        }
        StringBuilder sb2 = new StringBuilder(strM936);
        C0036.m3741(sb2, C0020.m1431(field));
        throw new Asn1DecodingException(C0068.m5536(sb2));
    }

    public static int access$200(ByteBuffer byteBuffer) throws Asn1DecodingException {
        BigInteger bigIntegerM4320 = C0063.m4320(byteBuffer);
        if (C0016.m624(bigIntegerM4320, C0038.m3948(-2147483648L)) >= 0 && C0016.m624(bigIntegerM4320, C0038.m3948(2147483647L)) <= 0) {
            return C0069.m5808(bigIntegerM4320);
        }
        throw new Asn1DecodingException(C0021.m1531(C0029.m2695(m1460(), 131, 51, 2216), new Object[]{bigIntegerM4320}));
    }

    public static long access$300(ByteBuffer byteBuffer) throws Asn1DecodingException {
        BigInteger bigIntegerM4320 = C0063.m4320(byteBuffer);
        if (C0016.m624(bigIntegerM4320, C0038.m3948(Long.MIN_VALUE)) >= 0 && C0016.m624(bigIntegerM4320, C0038.m3948(Long.MAX_VALUE)) <= 0) {
            return C0018.m1087(bigIntegerM4320);
        }
        throw new Asn1DecodingException(C0021.m1531(C0019.m1189(m1460(), 182, 52, 899), new Object[]{bigIntegerM4320}));
    }

    public static String access$500(ByteBuffer byteBuffer) throws Asn1DecodingException {
        if (C0111.m13127(byteBuffer)) {
            long jM3240 = C0032.m3240(byteBuffer);
            int iM2757 = (int) C0029.m2757(jM3240 / 40, 2L);
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0019.m1223(iM2757));
            C0077.m7289(sb, '.');
            C0077.m7290(sb, C0019.m1223(jM3240 - ((long) (iM2757 * 40))));
            while (C0111.m13127(byteBuffer)) {
                long jM32402 = C0032.m3240(byteBuffer);
                C0077.m7289(sb, '.');
                C0077.m7290(sb, C0019.m1223(jM32402));
            }
            return C0068.m5536(sb);
        }
        throw new Asn1DecodingException(C0038.m4022(m1460(), 234, 23, 2166));
    }

    public static ArrayList b(Class cls) throws Asn1DecodingException {
        Field[] fieldArrM2655 = C0028.m2655(cls);
        ArrayList arrayList = new ArrayList(fieldArrM2655.length);
        for (Field field : fieldArrM2655) {
            Asn1Field asn1Field = (Asn1Field) C0029.m2715(field);
            if (asn1Field != null) {
                boolean zM638 = C0016.m638(C0066.m4843(field));
                String strM4828 = C0066.m4828(m1460(), InputDeviceCompat.SOURCE_KEYBOARD, 1, 2217);
                if (!zM638) {
                    try {
                        C0017.m919(arrayList, new AnnotatedField(field, asn1Field));
                    } catch (Asn1DecodingException e) {
                        StringBuilder sb = new StringBuilder(C0025.m2151(m1460(), AndroidBinXmlParser.Chunk.RES_XML_TYPE_START_ELEMENT, 28, 1706));
                        C0077.m7290(sb, C0038.m3997(cls));
                        C0077.m7290(sb, strM4828);
                        C0077.m7290(sb, C0033.m3333(field));
                        throw new Asn1DecodingException(C0068.m5536(sb), e);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    C0077.m7290(sb2, C0038.m3997(Asn1Field.class));
                    C0077.m7290(sb2, C0016.m625(m1460(), 286, 25, 2766));
                    C0077.m7290(sb2, C0038.m3997(cls));
                    C0077.m7290(sb2, strM4828);
                    C0077.m7290(sb2, C0033.m3333(field));
                    throw new Asn1DecodingException(C0068.m5536(sb2));
                }
            }
        }
        return arrayList;
    }

    public static BigInteger c(ByteBuffer byteBuffer) {
        if (!C0111.m13127(byteBuffer)) {
            return C0068.m5582();
        }
        return new BigInteger(C0071.m6029(byteBuffer));
    }

    public static Object e(BerDataValue berDataValue, Class cls) throws Asn1DecodingException {
        ArrayList arrayListM3650 = C0036.m3650(cls);
        if (!C0066.m4881(arrayListM3650)) {
            int i = 0;
            while (i < C0018.m1084(arrayListM3650) - 1) {
                AnnotatedField annotatedField = (AnnotatedField) C0064.m4526(arrayListM3650, i);
                int iM1465 = m1465(annotatedField);
                int iM1461 = m1461(annotatedField);
                i++;
                for (int i2 = i; i2 < C0018.m1084(arrayListM3650); i2++) {
                    AnnotatedField annotatedField2 = (AnnotatedField) C0064.m4526(arrayListM3650, i2);
                    int iM14652 = m1465(annotatedField2);
                    int iM14612 = m1461(annotatedField2);
                    if (iM1465 == iM14652 && iM1461 == iM14612) {
                        StringBuilder sb = new StringBuilder(C0035.m3603(m1460(), 486, 85, 2251));
                        C0077.m7290(sb, C0038.m3997(cls));
                        C0077.m7290(sb, C0072.m6116(m1460(), 571, 1, 2345));
                        C0077.m7290(sb, C0033.m3333(m1464(annotatedField)));
                        C0077.m7290(sb, C0030.m2840(m1460(), 572, 6, 3248));
                        C0077.m7290(sb, C0033.m3333(m1464(annotatedField2)));
                        throw new Asn1DecodingException(C0068.m5536(sb));
                    }
                }
            }
            try {
                Object objM1220 = C0019.m1220(C0066.m4883(cls, null), null);
                Iterator itM4154 = C0039.m4154(arrayListM3650);
                while (C0036.m3657(itM4154)) {
                    try {
                        m1462((AnnotatedField) C0071.m6012(itM4154), berDataValue, objM1220);
                        return objM1220;
                    } catch (Asn1UnexpectedTagException unused) {
                    }
                }
                StringBuilder sb2 = new StringBuilder(C0076.m6902(m1460(), 578, 21, 2597));
                C0077.m7290(sb2, C0038.m3997(cls));
                C0077.m7290(sb2, C0066.m4828(m1460(), 599, 8, 1607));
                throw new Asn1DecodingException(C0068.m5536(sb2));
            } catch (IllegalArgumentException | ReflectiveOperationException e) {
                throw new Asn1DecodingException(C0032.m3232(C0066.m4828(m1460(), 607, 22, 1157), C0038.m3997(cls)), e);
            }
        }
        StringBuilder sb3 = new StringBuilder(C0068.m5544(m1460(), 629, 25, 509));
        C0077.m7290(sb3, C0038.m3997(Asn1Field.class));
        C0077.m7290(sb3, C0064.m4545(m1460(), 654, 17, 1219));
        C0077.m7290(sb3, C0038.m3997(cls));
        throw new Asn1DecodingException(C0068.m5536(sb3));
    }

    public static Object f(BerDataValue berDataValue, Class cls, boolean z) throws Asn1DecodingException {
        BerDataValue berDataValueM3891;
        ArrayList arrayListM3650 = C0036.m3650(cls);
        C0039.m4063(arrayListM3650, new a(0));
        int iM1084 = C0018.m1084(arrayListM3650);
        String strM13097 = C0111.m13097(m1460(), 671, 1, 1812);
        if (iM1084 > 1) {
            Iterator itM4154 = C0039.m4154(arrayListM3650);
            AnnotatedField annotatedField = null;
            while (C0036.m3657(itM4154)) {
                AnnotatedField annotatedField2 = (AnnotatedField) C0071.m6012(itM4154);
                if (annotatedField != null && C0019.m1209(m1463(annotatedField)) == C0019.m1209(m1463(annotatedField2))) {
                    StringBuilder sb = new StringBuilder(C0075.m6791(m1460(), 672, 28, 2813));
                    C0077.m7290(sb, C0038.m3997(cls));
                    C0077.m7290(sb, strM13097);
                    C0077.m7290(sb, C0033.m3333(m1464(annotatedField)));
                    C0077.m7290(sb, C0027.m2404(m1460(), 700, 6, 2116));
                    C0077.m7290(sb, C0033.m3333(m1464(annotatedField2)));
                    throw new Asn1DecodingException(C0068.m5536(sb));
                }
                annotatedField = annotatedField2;
            }
        }
        try {
            Object objM1220 = C0019.m1220(C0066.m4883(cls, null), null);
            BerDataValueReader berDataValueReaderM3228 = C0032.m3228(berDataValue);
            int i = 0;
            while (i < C0018.m1084(arrayListM3650)) {
                if (z && i == 0) {
                    berDataValueM3891 = berDataValue;
                } else {
                    try {
                        berDataValueM3891 = C0037.m3891(berDataValueReaderM3228);
                    } catch (BerDataValueFormatException e) {
                        throw new Asn1DecodingException(C0038.m4022(m1460(), 722, 20, 3135), e);
                    }
                }
                if (berDataValueM3891 == null) {
                    break;
                }
                for (int i2 = i; i2 < C0018.m1084(arrayListM3650); i2++) {
                    AnnotatedField annotatedField3 = (AnnotatedField) C0064.m4526(arrayListM3650, i2);
                    try {
                        if (m1458(annotatedField3)) {
                            try {
                                m1462(annotatedField3, berDataValueM3891, objM1220);
                            } catch (Asn1UnexpectedTagException unused) {
                            }
                        } else {
                            m1462(annotatedField3, berDataValueM3891, objM1220);
                        }
                        i = i2 + 1;
                        break;
                    } catch (Asn1DecodingException e2) {
                        StringBuilder sb2 = new StringBuilder(C0077.m7205(m1460(), 706, 16, 1549));
                        C0077.m7290(sb2, C0038.m3997(cls));
                        C0077.m7290(sb2, strM13097);
                        C0077.m7290(sb2, C0033.m3333(m1464(annotatedField3)));
                        throw new Asn1DecodingException(C0068.m5536(sb2), e2);
                    }
                }
            }
            return objM1220;
        } catch (IllegalArgumentException | ReflectiveOperationException e3) {
            throw new Asn1DecodingException(C0032.m3232(C0016.m625(m1460(), 742, 22, 1410), C0038.m3997(cls)), e3);
        }
    }
}
