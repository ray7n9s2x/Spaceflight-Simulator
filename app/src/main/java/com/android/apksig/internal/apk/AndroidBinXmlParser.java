package com.android.apksig.internal.apk;

import androidx.appcompat.app.AppCompatDelegate;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
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
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
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
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.UShort;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidBinXmlParser {
    public static final int EVENT_END_DOCUMENT = 2;
    public static final int EVENT_END_ELEMENT = 4;
    public static final int EVENT_START_DOCUMENT = 1;
    public static final int EVENT_START_ELEMENT = 3;
    public static final int VALUE_TYPE_BOOLEAN = 4;
    public static final int VALUE_TYPE_INT = 2;
    public static final int VALUE_TYPE_REFERENCE = 3;
    public static final int VALUE_TYPE_STRING = 1;
    public static final int VALUE_TYPE_UNSUPPORTED = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f41short = {2103, 2070, 2137, 2081, 2100, 2101, 2137, 2074, 2065, 2060, 2071, 2066, 2137, 2064, 2071, 2137, 2079, 2064, 2069, 2076, 1470, 1461, 1471, 1531, 1509, 1531, 1464, 1466, 1451, 1466, 1464, 1458, 1455, 1442, 1505, 1531, 1823, 1793, 1823, 280, 275, 281, 349, 321, 349, 270, 265, 284, 271, 265, 327, 349, 437, 425, 437, 1075, 1076, 1057, 1074, 1076, 1146, 1120, 1958, 1965, 1959, 2019, 2045, 2019, 1952, 1954, 1971, 1954, 1952, 1962, 1975, 1978, 2041, 2019, 2369, 2399, 2369, 1096, 1091, 1097, 1037, 1041, 1037, 1118, 1113, 1100, 1119, 1113, 1047, 1037, 550, 570, 550, 499, 500, 481, 498, 500, 442, 416, 1911, 1904, 1914, 1915, 1894, 1854, 1907, 1899, 1901, 1898, 1854, 1916, 1915, 1854, 1826, 1827, 1854, 1919, 1898, 1898, 1900, 1854, 1917, 1905, 1899, 1904, 1898, 1854, 1846, 877, 1924, 1923, 1929, 1928, 1941, 1997, 1920, 1944, 1950, 1945, 1997, 1935, 1928, 1997, 2003, 2000, 1997, 2013, 1430, 1440, 1447, 1447, 1456, 1467, 1441, 1525, 1456, 1443, 1456, 1467, 1441, 1525, 1467, 1466, 1441, 1525, 1460, 1525, 1414, 1409, 1428, 1415, 1409, 1418, 1424, 1433, 1424, 1432, 1424, 1435, 1409, 1870, 1804, 1815, 1818, 1803, 1821, 789, 826, 822, 830, 831, 891, 830, 823, 830, 822, 830, 821, 815, 891, 830, 821, 824, 820, 814, 821, 815, 830, 809, 830, 831, 891, 825, 830, 829, 820, 809, 830, 891, 808, 815, 809, 818, 821, 828, 891, 811, 820, 820, 823, 2576, 2619, 2609, 2677, 2608, 2617, 2608, 2616, 2608, 2619, 2593, 2677, 2614, 2621, 2592, 2619, 2622, 2677, 2593, 2618, 2618, 2677, 2598, 2621, 2618, 2599, 2593, 2683, 2677, 2587, 2608, 2608, 2609, 2677, 2612, 2593, 2677, 2617, 2608, 2612, 2598, 2593, 2677, 2669, 2677, 2615, 2604, 2593, 2608, 2598, 2683, 2677, 2580, 2595, 2612, 2620, 2617, 2612, 2615, 2617, 2608, 2671, 2677, 336, 348, 273, 285, 260, 326, 348, 544, 533, 533, 531, 520, 515, 532, 533, 516, 530, 577, 516, 527, 517, 577, 526, 519, 519, 530, 516, 533, 577, 526, 532, 533, 577, 526, 519, 577, 515, 526, 532, 527, 517, 530, 603, 577, 1407, 1354, 1354, 1356, 1367, 1372, 1355, 1354, 1371, 1357, 1310, 1357, 1354, 1375, 1356, 1354, 1310, 1361, 1368, 1368, 1357, 1371, 1354, 1310, 1361, 1355, 1354, 1310, 1361, 1368, 1310, 1372, 1361, 1355, 1360, 1370, 1357, 1284, 1310, 2111, 2072, 2061, 2078, 2072, 2124, 2057, ZipUtils.GP_FLAG_EFS, 2057, 2049, 2057, 2050, 2072, 2124, 2063, 2052, 2073, 2050, 2055, 2124, 2072, 2051, 2051, 2124, 2079, 2052, 2051, 2078, 2072, 2114, 2124, 2082, 2057, 2057, 2056, 2124, 2061, 2072, 2124, ZipUtils.GP_FLAG_EFS, 2057, 2061, 2079, 2072, 2124, 2142, 2140, 2124, 2062, 2069, 2072, 2057, 2079, 2114, 2124, 2093, 2074, 2061, 2053, ZipUtils.GP_FLAG_EFS, 2061, 2062, ZipUtils.GP_FLAG_EFS, 2057, 2134, 2124, 2243, 2299, 2274, 2298, 2279, 2302, 2274, 2283, 2222, 2300, 2283, 2301, 2273, 2299, 2300, 2285, 2283, 2222, 2275, 2287, 2302, 2301, 2222, 2272, 2273, 2298, 2222, 2301, 2299, 2302, 2302, 2273, 2300, 2298, 2283, 2282, 2086, 2078, 2055, 2079, 2050, 2075, 2055, 2062, 2123, 2072, 2079, 2073, 2050, 2053, 2060, 2123, 2075, 2052, 2052, 2055, 2072, 2123, 2053, 2052, 2079, 2123, 2072, 2078, 2075, 2075, 2052, 2073, 2079, 2062, 2063};
    public final ByteBuffer a;
    public StringPool b;
    public ResourceMap c;
    public int d;
    public int e = 1;
    public String f;
    public String g;
    public int h;
    public ArrayList i;
    public ByteBuffer j;
    public int k;

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.AndroidBinXmlParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Attribute {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f42short = {1490, 1520, 1535, 1535, 1534, 1509, 1457, 1522, 1534, 1524, 1507, 1522, 1524, 1457, 1509, 1534, 1457, 1523, 1534, 1534, 1533, 1524, 1520, 1535, 1451, 1457, 1511, 1520, 1533, 1508, 1524, 1457, 1509, 1512, 1505, 1524, 1457, 2137, 2171, 2164, 2164, 2165, 2158, 2106, 2169, 2165, 2175, 2152, 2169, 2175, 2106, 2158, 2165, 2106, 2163, 2164, 2158, 2080, 2106, 2156, 2171, 2166, 2159, 2175, 2106, 2158, 2147, 2154, 2175, 2106, 1216, 1250, 1261, 1261, 1260, 1271, 1187, 1248, 1260, 1254, 1265, 1248, 1254, 1187, 1271, 1260, 1187, 1264, 1271, 1265, 1258, 1261, 1252, 1209, 1187, 1269, 1250, 1263, 1270, 1254, 1187, 1271, 1274, 1267, 1254, 1187, 2707, 2779, 2866};
        public final long a;
        public final long b;
        public final int c;
        public final int d;
        public final StringPool e;
        public final ResourceMap f;

        /* JADX INFO: renamed from: ۟۠ۥ۟ۨ, reason: not valid java name and contains not printable characters */
        public static int m741(Object obj) {
            if (C0019.m1311() >= 0) {
                return ((Attribute) obj).c;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
        public static long m742(Object obj) {
            if (C0018.m1064() >= 0) {
                return ((Attribute) obj).a;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: ۟ۥ۠ۥۧ, reason: not valid java name and contains not printable characters */
        public static int m743(Object obj, long j) {
            if (C0027.m2460() >= 0) {
                return ((ResourceMap) obj).getResourceId(j);
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
        public static ResourceMap m744(Object obj) {
            if (C0025.m2132() > 0) {
                return ((Attribute) obj).f;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۨۨۤ, reason: not valid java name and contains not printable characters */
        public static int m745(Object obj) {
            if (C0035.m3569() < 0) {
                return ((Attribute) obj).d;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۢ۟۠ۢ, reason: not valid java name and contains not printable characters */
        public static String m746(Object obj, long j) {
            if (C0068.m5678() > 0) {
                return ((StringPool) obj).getString(j);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤۨۨ۟, reason: not valid java name and contains not printable characters */
        public static long m747(Object obj) {
            if (C0111.m13165() <= 0) {
                return ((Attribute) obj).b;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: ۣۧۢ, reason: not valid java name and contains not printable characters */
        public static StringPool m748(Object obj) {
            if (C0073.m6356() <= 0) {
                return ((Attribute) obj).e;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۤۥۣ, reason: not valid java name and contains not printable characters */
        public static short[] m749() {
            if (C0019.m1311() >= 0) {
                return f42short;
            }
            return null;
        }

        public int getIntValue() throws XmlParserException {
            int iM741 = m741(this);
            if (iM741 != 1) {
                switch (iM741) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(C0022.m1728(m749(), 37, 33, 2074));
                        C0021.m1551(sb, iM741);
                        throw new XmlParserException(C0068.m5536(sb));
                }
            }
            return m745(this);
        }

        public String getStringValue() throws XmlParserException {
            int iM745 = m745(this);
            int iM741 = m741(this);
            if (iM741 == 1) {
                StringBuilder sb = new StringBuilder(C0071.m5991(m749(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 1, 2930));
                C0077.m7290(sb, C0021.m1651(iM745));
                return C0068.m5536(sb);
            }
            if (iM741 == 3) {
                return m746(m748(this), ((long) iM745) & 4294967295L);
            }
            switch (iM741) {
                case 16:
                    return C0066.m4886(iM745);
                case 17:
                    StringBuilder sb2 = new StringBuilder(C0038.m4022(m749(), 106, 2, 2723));
                    C0077.m7290(sb2, C0021.m1651(iM745));
                    return C0068.m5536(sb2);
                case 18:
                    return C0077.m7277(iM745 != 0);
                default:
                    StringBuilder sb3 = new StringBuilder(C0038.m4022(m749(), 70, 36, 1155));
                    C0021.m1551(sb3, iM741);
                    throw new XmlParserException(C0068.m5536(sb3));
            }
        }

        public boolean getBooleanValue() throws XmlParserException {
            int iM741 = m741(this);
            if (iM741 == 18) {
                return m745(this) != 0;
            }
            StringBuilder sb = new StringBuilder(C0065.m4757(m749(), 0, 37, 1425));
            C0021.m1551(sb, iM741);
            throw new XmlParserException(C0068.m5536(sb));
        }

        public String getName() {
            return m746(m748(this), m747(this));
        }

        public int getNameResourceId() {
            ResourceMap resourceMapM744 = m744(this);
            if (resourceMapM744 != null) {
                return m743(resourceMapM744, m747(this));
            }
            return 0;
        }

        public int getValueType() {
            return m741(this);
        }

        public Attribute(long j, long j2, int i, int i2, StringPool stringPool, ResourceMap resourceMap, AnonymousClass1 anonymousClass1) {
            this.a = j;
            this.b = j2;
            this.c = i;
            this.d = i2;
            this.e = stringPool;
            this.f = resourceMap;
        }

        public String getNamespace() {
            long jM742 = m742(this);
            if (jM742 != 4294967295L) {
                return m746(m748(this), jM742);
            }
            return C0031.m2993();
        }
    }

    public static class Chunk {
        static final int HEADER_MIN_SIZE_BYTES = 8;
        public static final int RES_XML_TYPE_END_ELEMENT = 259;
        public static final int RES_XML_TYPE_RESOURCE_MAP = 384;
        public static final int RES_XML_TYPE_START_ELEMENT = 258;
        public static final int TYPE_RES_XML = 3;
        public static final int TYPE_STRING_POOL = 1;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f43short = {1248, 1186, 1209, 1204, 1189, 1203, 1494, 1530, 1527, 1533, 1524, 1513, 1526, 1534, 1535, 1467, 1528, 1523, 1518, 1525, 1520, 1441, 1467, 1523, 1534, 1530, 1535, 1534, 1513, 1467, 1519, 1524, 1524, 1467, 1527, 1524, 1525, 1532, 1441, 1467, 2590, 2652, 2631, 2634, 2651, 2637, 2576, 2590, 2685, 2646, 2635, 2640, 2645, 2590, 2637, 2647, 2628, 2651, 2564, 2590, 1940, 1976, 1973, 1983, 1974, 1963, 1972, 1980, 1981, 2041, 1978, 1969, 1964, 1975, 1970, 2019, 2041, 1969, 1980, 1976, 1981, 1980, 1963, 2041, 1965, 1974, 1974, 2041, 1962, 1969, 1974, 1963, 1965, 2019, 2041};
        public final int a;
        public final ByteBuffer b;
        public final ByteBuffer c;

        /* JADX INFO: renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m750(Object obj) {
            if (C0029.m2791() >= 0) {
                return ((Chunk) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۥۤ۟, reason: not valid java name and contains not printable characters */
        public static int m751(Object obj) {
            if (C0028.m2593() >= 0) {
                return ((Chunk) obj).a;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۤۥۦۥ, reason: not valid java name and contains not printable characters */
        public static short[] m752() {
            if (C0018.m1064() >= 0) {
                return f43short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤۨۥۨ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m753(Object obj) {
            if (C0027.m2460() > 0) {
                return ((Chunk) obj).c;
            }
            return null;
        }

        public ByteBuffer getContents() {
            ByteBuffer byteBufferM753 = m753(this);
            ByteBuffer byteBufferM6043 = C0071.m6043(byteBufferM753);
            C0064.m4604(byteBufferM6043, C0033.m3275(byteBufferM753));
            return byteBufferM6043;
        }

        public ByteBuffer getHeader() {
            ByteBuffer byteBufferM750 = m750(this);
            ByteBuffer byteBufferM6043 = C0071.m6043(byteBufferM750);
            C0064.m4604(byteBufferM6043, C0033.m3275(byteBufferM750));
            return byteBufferM6043;
        }

        public int getType() {
            return m751(this);
        }

        public Chunk(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.a = i;
            this.b = byteBuffer;
            this.c = byteBuffer2;
        }

        public static Chunk get(ByteBuffer byteBuffer) throws XmlParserException {
            if (C0071.m5984(byteBuffer) < 8) {
                C0037.m3886(byteBuffer, C0075.m6818(byteBuffer));
                return null;
            }
            int iM3629 = C0035.m3629(byteBuffer);
            int iM13182 = C0111.m13182(byteBuffer);
            int iM131822 = C0111.m13182(byteBuffer);
            long jM5840 = C0070.m5840(byteBuffer);
            if (jM5840 - 8 > C0071.m5984(byteBuffer)) {
                C0037.m3886(byteBuffer, C0075.m6818(byteBuffer));
                return null;
            }
            String strM5807 = C0069.m5807(m752(), 0, 6, 1216);
            if (iM131822 >= 8) {
                if (iM131822 <= jM5840) {
                    int i = iM131822 + iM3629;
                    long j = ((long) iM3629) + jM5840;
                    Chunk chunk = new Chunk(iM13182, C0020.m1354(byteBuffer, iM3629, i), C0073.m6431(byteBuffer, i, j));
                    C0037.m3886(byteBuffer, (int) j);
                    return chunk;
                }
                StringBuilder sb = new StringBuilder(C0021.m1650(m752(), 6, 34, 1435));
                C0021.m1551(sb, iM131822);
                C0077.m7290(sb, C0063.m4315(m752(), 40, 20, 2622));
                C0078.m7466(sb, jM5840);
                C0077.m7290(sb, strM5807);
                throw new XmlParserException(C0068.m5536(sb));
            }
            throw new XmlParserException(C0025.m2086(C0024.m1945(m752(), 60, 35, 2009), iM131822, strM5807));
        }
    }

    public static class ResourceMap {
        public final ByteBuffer a;
        public final int b;

        /* JADX INFO: renamed from: ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m754(Object obj) {
            if (C0073.m6356() < 0) {
                return ((ResourceMap) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣۣۢ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m755(Object obj) {
            if (C0023.m1921() > 0) {
                return ((Chunk) obj).getContents();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۥ۟ۨ, reason: not valid java name and contains not printable characters */
        public static int m756(Object obj) {
            if (C0077.m7272() < 0) {
                return ((ResourceMap) obj).b;
            }
            return 0;
        }

        public int getResourceId(long j) {
            if (j < 0 || j >= m756(this)) {
                return 0;
            }
            return C0067.m5511(m754(this), ((int) j) * 4);
        }

        public ResourceMap(Chunk chunk) {
            ByteBuffer byteBufferM6043 = C0071.m6043(m755(chunk));
            this.a = byteBufferM6043;
            C0064.m4604(byteBufferM6043, C0033.m3275(m755(chunk)));
            this.b = C0071.m5984(byteBufferM6043) / 4;
        }
    }

    public static class StringPool {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f44short = {1776, 1751, 1754, 1743, 1734, 1744, 1667, 1740, 1733, 1733, 1744, 1734, 1751, 1667, 1675, 770, 779, 791, 779, 856, 863, 857, 834, 837, 844, 856, 779, 836, 845, 845, 856, 846, 863, 779, 771, 2455, 2154, 2129, 2129, 2078, 2131, 2143, 2128, 2119, 2078, 2125, 2122, 2119, 2130, 2139, 2125, 2052, 2078, 905, 946, 946, 1021, 944, 956, 947, 932, 1021, 942, 937, 943, 948, 947, 954, 942, 999, 1021, 935, 946, 947, 991, 924, 919, 906, 913, 916, 984, 908, 991, 919, 922, 926, 923, 922, 909, 991, 907, 912, 912, 991, 908, 919, 912, 909, 907, 977, 991, 941, 922, 910, 906, 918, 909, 922, 923, 991, 926, 907, 991, 915, 922, 926, 908, 907, 991, 973, 975, 991, 925, 902, 907, 922, 908, 977, 991, 958, 905, 926, 918, 915, 926, 925, 915, 922, 965, 991, 1424, 1490, 1481, 1476, 1493, 1475, 2794, 2769, 2764, 2762, 2767, 2768, 2765, 2763, 2778, 2779, 2719, 2764, 2763, 2765, 2774, 2769, 2776, 2719, 2774, 2769, 2779, 2778, 2759, 2693, 2719, 2689, 2701, 2752, 2764, 2773, 2711, 2701, 2828, 2829, 2847, 2932, 2913, 1322, 1323, 1337, 1362, 1351, 1375, 1308, 1303, 1310, 1293, 1310, 1308, 1291, 1306, 1293, 1375, 1306, 1297, 1308, 1296, 1307, 1302, 1297, 1304, 1375, 1297, 1296, 1291, 1375, 1292, 1290, 1295, 1295, 1296, 1293, 1291, 1306, 1307, 2098, 2099, 2081, 2122, 2143, 2119, 2050, 2057, 2052, 2056, 2051, 2050, 2051, 2119, 2049, 2056, 2069, 2058, 2119, 2056, 2049, 2119, 2068, 2067, 2069, 2062, 2057, ZipUtils.GP_FLAG_EFS, 2119, 2057, 2056, 2067, 2119, 2089, 2098, 2091, 2091, 2119, 2067, 2050, 2069, 2058, 2062, 2057, 2054, 2067, 2050, 2051, 1382, 1383, 1397, 1310, 1282, 1285, 1407, 1398, 1165, 1164, 1182, 1269, 1257, 1262, 1172, 1181, 1272, 1211, 1200, 1209, 1194, 1209, 1211, 1196, 1213, 1194, 1272, 1213, 1206, 1211, 1207, 1212, 1201, 1206, 1215, 1272, 1206, 1207, 1196, 1272, 1195, 1197, 1192, 1192, 1207, 1194, 1196, 1213, 1212, 1949, 1948, 1934, 2021, 2041, 2046, 2024, 1965, 1958, 1963, 1959, 1964, 1965, 1964, 2024, 1966, 1959, 1978, 1957, 2024, 1959, 1966, 2024, 1979, 1980, 1978, 1953, 1958, 1967, 2024, 1958, 1959, 1980, 2024, 1926, 1949, 1924, 1924, 2024, 1980, 1965, 1978, 1957, 1953, 1958, 1961, 1980, 1965, 1964, 1211, 1180, 1178, 1153, 1158, 1167, 1224, 1180, 1159, 1159, 1224, 1156, 1159, 1158, 1167, 1234, 1224, 2643, 2566, 2586, 2589, 2567, 2626, 2629, 2560, 446, 407, 407, 386, 404, 389, 465, 414, 407, 465, 386, 389, 387, 408, 415, 406, 465, 408, 405, 393, 465, 2883, 2828, 2838, 2839, 2883, 2828, 2821, 2883, 2817, 2828, 2838, 2829, 2823, 2832, 2905, 2883};
        public final ByteBuffer a;
        public final ByteBuffer b;
        public final int c;
        public final boolean d;
        public final HashMap e = new HashMap();

        /* JADX INFO: renamed from: ۟۟ۧۢۢ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m757(Object obj) {
            if (C0028.m2593() >= 0) {
                return ((Chunk) obj).getContents();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟۠۟۟ۧ, reason: not valid java name and contains not printable characters */
        public static int m758(Object obj) {
            if (C0065.m4647() > 0) {
                return ((StringPool) obj).c;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۟ۢ۠۟ۨ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m759(Object obj) {
            if (C0018.m1064() > 0) {
                return ((StringPool) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۦ۟۠, reason: not valid java name and contains not printable characters */
        public static boolean m760(Object obj) {
            if (C0075.m6893() > 0) {
                return ((StringPool) obj).d;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۠ۨۥۤ, reason: not valid java name and contains not printable characters */
        public static HashMap m761(Object obj) {
            if (C0066.m4827() > 0) {
                return ((StringPool) obj).e;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢۤۥۢ, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m762(Object obj) {
            if (C0029.m2791() >= 0) {
                return ((Chunk) obj).getHeader();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۤۨۧ, reason: contains not printable characters */
        public static short[] m763() {
            if (C0017.m846() > 0) {
                return f44short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۦۢ۠, reason: contains not printable characters */
        public static ByteBuffer m764(Object obj) {
            if (C0063.m4427() > 0) {
                return ((StringPool) obj).a;
            }
            return null;
        }

        public StringPool(Chunk chunk) throws XmlParserException {
            long j;
            int iM5984;
            ByteBuffer byteBufferM762 = m762(chunk);
            int iM59842 = C0071.m5984(byteBufferM762);
            C0037.m3886(byteBufferM762, 8);
            if (C0071.m5984(byteBufferM762) < 20) {
                StringBuilder sb = new StringBuilder(C0034.m3431(m763(), 71, 69, 1023));
                C0021.m1551(sb, C0071.m5984(byteBufferM762));
                C0077.m7290(sb, C0027.m2404(m763(), 140, 6, 1456));
                throw new XmlParserException(C0068.m5536(sb));
            }
            long jM5840 = C0070.m5840(byteBufferM762);
            if (jM5840 > 2147483647L) {
                throw new XmlParserException(C0039.m4094(jM5840, C0026.m2321(m763(), 53, 18, 989)));
            }
            int i = (int) jM5840;
            this.c = i;
            long jM58402 = C0070.m5840(byteBufferM762);
            if (jM58402 > 2147483647L) {
                throw new XmlParserException(C0039.m4094(jM58402, C0065.m4757(m763(), 36, 17, 2110)));
            }
            long jM58403 = C0070.m5840(byteBufferM762);
            long jM58404 = C0070.m5840(byteBufferM762);
            long jM58405 = C0070.m5840(byteBufferM762);
            ByteBuffer byteBufferM757 = m757(chunk);
            if (i > 0) {
                long j2 = iM59842;
                j = jM58403;
                int i2 = (int) (jM58404 - j2);
                if (jM58402 <= 0) {
                    iM5984 = C0071.m5984(byteBufferM757);
                } else {
                    if (jM58405 < jM58404) {
                        StringBuilder sb2 = new StringBuilder(C0068.m5544(m763(), 0, 15, 1699));
                        C0078.m7466(sb2, jM58405);
                        C0077.m7290(sb2, C0028.m2609(m763(), 15, 20, 811));
                        C0078.m7466(sb2, jM58404);
                        C0077.m7290(sb2, C0019.m1189(m763(), 35, 1, 2494));
                        throw new XmlParserException(C0068.m5536(sb2));
                    }
                    iM5984 = (int) (jM58405 - j2);
                }
                this.b = C0020.m1354(byteBufferM757, i2, iM5984);
            } else {
                j = jM58403;
                this.b = C0035.m3516(0);
            }
            this.d = (256 & j) != 0;
            this.a = byteBufferM757;
        }

        public String getString(long j) throws XmlParserException {
            byte[] bArrM2445;
            int iM1414;
            String str;
            byte[] bArrM24452;
            int iM14142;
            String strM7205 = C0077.m7205(m763(), 146, 25, 2751);
            if (j < 0) {
                throw new XmlParserException(C0039.m4094(j, strM7205));
            }
            int iM758 = m758(this);
            long j2 = iM758;
            String strM936 = C0017.m936(m763(), 171, 7, 2733);
            if (j >= j2) {
                StringBuilder sb = new StringBuilder(strM7205);
                C0078.m7466(sb, j);
                C0077.m7290(sb, strM936);
                C0021.m1551(sb, iM758 - 1);
                throw new XmlParserException(C0068.m5536(sb));
            }
            int i = (int) j;
            HashMap mapM761 = m761(this);
            String str2 = (String) C0067.m5420(mapM761, C0021.m1548(i));
            if (str2 != null) {
                return str2;
            }
            long jM6304 = C0073.m6304(m764(this), i * 4);
            ByteBuffer byteBufferM759 = m759(this);
            if (jM6304 >= C0074.m6516(byteBufferM759)) {
                StringBuilder sb2 = new StringBuilder(C0063.m4315(m763(), 392, 21, 497));
                C0021.m1551(sb2, i);
                C0077.m7290(sb2, C0066.m4828(m763(), 413, 16, 2915));
                C0078.m7466(sb2, jM6304);
                C0077.m7290(sb2, strM936);
                C0021.m1551(sb2, C0074.m6516(byteBufferM759) - 1);
                throw new XmlParserException(C0068.m5536(sb2));
            }
            C0037.m3886(byteBufferM759, (int) jM6304);
            if (m760(this)) {
                if ((C0019.m1299(byteBufferM759) & 128) != 0) {
                    C0019.m1299(byteBufferM759);
                }
                int iM1299 = C0019.m1299(byteBufferM759);
                if ((iM1299 & 128) != 0) {
                    iM1299 = ((iM1299 & WorkQueueKt.MASK) << 8) | C0019.m1299(byteBufferM759);
                }
                if (C0069.m5719(byteBufferM759)) {
                    bArrM24452 = C0027.m2445(byteBufferM759);
                    iM14142 = C0020.m1414(byteBufferM759) + C0035.m3629(byteBufferM759);
                    C0037.m3886(byteBufferM759, C0035.m3629(byteBufferM759) + iM1299);
                } else {
                    byte[] bArr = new byte[iM1299];
                    C0029.m2812(byteBufferM759, bArr);
                    bArrM24452 = bArr;
                    iM14142 = 0;
                }
                if (bArrM24452[iM14142 + iM1299] != 0) {
                    throw new XmlParserException(C0076.m6902(m763(), 221, 48, 2151));
                }
                try {
                    str = new String(bArrM24452, iM14142, iM1299, C0068.m5544(m763(), 178, 5, 2905));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(C0039.m4066(m763(), 183, 38, 1407), e);
                }
            } else {
                int iM13182 = C0111.m13182(byteBufferM759);
                if ((32768 & iM13182) != 0) {
                    iM13182 = ((iM13182 & 32767) << 16) | C0111.m13182(byteBufferM759);
                }
                if (iM13182 > 1073741823) {
                    throw new XmlParserException(C0025.m2086(C0029.m2695(m763(), 367, 17, 1256), iM13182, C0020.m1443(m763(), Chunk.RES_XML_TYPE_RESOURCE_MAP, 8, 2675)));
                }
                int i2 = iM13182 * 2;
                if (C0069.m5719(byteBufferM759)) {
                    bArrM2445 = C0027.m2445(byteBufferM759);
                    iM1414 = C0020.m1414(byteBufferM759) + C0035.m3629(byteBufferM759);
                    C0037.m3886(byteBufferM759, C0035.m3629(byteBufferM759) + i2);
                } else {
                    byte[] bArr2 = new byte[i2];
                    C0029.m2812(byteBufferM759, bArr2);
                    bArrM2445 = bArr2;
                    iM1414 = 0;
                }
                int i3 = iM1414 + i2;
                if (bArrM2445[i3] != 0 || bArrM2445[i3 + 1] != 0) {
                    throw new XmlParserException(C0031.m3047(m763(), 318, 49, 1992));
                }
                try {
                    str = new String(bArrM2445, iM1414, i2, C0076.m6902(m763(), 269, 8, 1331));
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(C0077.m7205(m763(), 277, 41, 1240), e2);
                }
            }
            C0038.m3969(mapM761, C0021.m1548(i), str);
            return str;
        }
    }

    public static class XmlParserException extends Exception {
        public XmlParserException(String str) {
            super(str);
        }

        public XmlParserException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static Chunk m728(Object obj) {
        if (C0024.m2011() <= 0) {
            return Chunk.get((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m729(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((Attribute) obj).getStringValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m730(Object obj) {
        if (C0023.m1921() > 0) {
            return ((Chunk) obj).getType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m731(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((Attribute) obj).getNamespace();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String m732(Object obj, long j) {
        if (C0074.m6454() < 0) {
            return ((StringPool) obj).getString(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m733(Object obj) {
        if (C0039.m4109() > 0) {
            return ((Attribute) obj).getBooleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۢ, reason: not valid java name and contains not printable characters */
    public static int m734(Object obj) {
        if (C0020.m1385() < 0) {
            return ((Attribute) obj).getValueType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m735(Object obj) {
        if (C0020.m1385() < 0) {
            return ((Attribute) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m736(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Chunk) obj).getContents();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static Attribute m737(Object obj, int i) {
        if (C0023.m1921() > 0) {
            return ((AndroidBinXmlParser) obj).a(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۥ, reason: not valid java name and contains not printable characters */
    public static int m738(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((Attribute) obj).getNameResourceId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m739(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Attribute) obj).getIntValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m740() {
        if (C0078.m7450() > 0) {
            return f41short;
        }
        return null;
    }

    public static ByteBuffer b(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(C0071.m6038(i, C0020.m1443(m740(), 55, 7, 1088)));
        }
        if (i2 < i) {
            StringBuilder sb = new StringBuilder(C0033.m3330(m740(), 39, 13, 381));
            C0021.m1551(sb, i2);
            C0077.m7290(sb, C0020.m1443(m740(), 52, 3, 405));
            C0021.m1551(sb, i);
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        int iM6516 = C0074.m6516(byteBuffer);
        if (i2 > C0074.m6516(byteBuffer)) {
            StringBuilder sb2 = new StringBuilder(C0031.m3047(m740(), 20, 16, 1499));
            C0021.m1551(sb2, i2);
            C0077.m7290(sb2, C0027.m2404(m740(), 36, 3, 1855));
            C0021.m1551(sb2, iM6516);
            throw new IllegalArgumentException(C0068.m5536(sb2));
        }
        int iM6818 = C0075.m6818(byteBuffer);
        int iM3629 = C0035.m3629(byteBuffer);
        try {
            C0037.m3886(byteBuffer, 0);
            C0034.m3392(byteBuffer, i2);
            C0037.m3886(byteBuffer, i);
            ByteBuffer byteBufferM6043 = C0071.m6043(byteBuffer);
            C0064.m4604(byteBufferM6043, C0033.m3275(byteBuffer));
            return byteBufferM6043;
        } finally {
            C0037.m3886(byteBuffer, 0);
            C0034.m3392(byteBuffer, iM6818);
            C0037.m3886(byteBuffer, iM3629);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException(C0039.m4094(j, C0066.m4828(m740(), 97, 7, Chunk.RES_XML_TYPE_RESOURCE_MAP)));
        }
        if (j2 < j) {
            StringBuilder sb = new StringBuilder(C0064.m4545(m740(), 81, 13, 1069));
            C0078.m7466(sb, j2);
            C0077.m7290(sb, C0021.m1650(m740(), 94, 3, 518));
            C0078.m7466(sb, j);
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        int iM6516 = C0074.m6516(byteBuffer);
        if (j2 <= C0074.m6516(byteBuffer)) {
            return C0019.m1199(byteBuffer, (int) j, (int) j2);
        }
        StringBuilder sb2 = new StringBuilder(C0111.m13097(m740(), 62, 16, 1987));
        C0078.m7466(sb2, j2);
        C0077.m7290(sb2, C0033.m3330(m740(), 78, 3, 2401));
        C0021.m1551(sb2, iM6516);
        throw new IllegalArgumentException(C0068.m5536(sb2));
    }

    public final Attribute a(int i) {
        if (C0073.m6424(this) != 3) {
            throw new IndexOutOfBoundsException(C0068.m5544(m740(), 152, 33, 1493));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C0034.m3431(m740(), 134, 18, 2029));
        }
        if (i >= C0111.m13118(this)) {
            StringBuilder sb = new StringBuilder(C0026.m2321(m740(), 104, 29, 1822));
            C0021.m1551(sb, C0111.m13118(this));
            C0077.m7290(sb, C0066.m4828(m740(), 133, 1, 836));
            throw new IndexOutOfBoundsException(C0068.m5536(sb));
        }
        if (C0035.m3566(this) == null) {
            this.i = new ArrayList(C0111.m13118(this));
            for (int i2 = 0; i2 < C0111.m13118(this); i2++) {
                int iM5763 = C0069.m5763(this);
                int i3 = i2 * iM5763;
                ByteBuffer byteBufferM1199 = C0019.m1199(C0032.m3210(this), i3, iM5763 + i3);
                long jM4566 = ((long) C0064.m4566(byteBufferM1199)) & 4294967295L;
                long jM45662 = ((long) C0064.m4566(byteBufferM1199)) & 4294967295L;
                C0037.m3886(byteBufferM1199, C0035.m3629(byteBufferM1199) + 7);
                C0017.m919(C0035.m3566(this), new Attribute(jM4566, jM45662, C0069.m5826(byteBufferM1199) & 255, (int) (((long) C0064.m4566(byteBufferM1199)) & 4294967295L), C0039.m4160(this), C0068.m5545(this), null));
            }
        }
        return (Attribute) C0064.m4526(C0035.m3566(this), i);
    }

    public int getAttributeCount() {
        if (C0073.m6424(this) != 3) {
            return -1;
        }
        return C0111.m13118(this);
    }

    public int getDepth() {
        return C0020.m1351(this);
    }

    public int getEventType() {
        return C0073.m6424(this);
    }

    public String getName() {
        int iM6424 = C0073.m6424(this);
        if (iM6424 == 3 || iM6424 == 4) {
            return C0019.m1177(this);
        }
        return null;
    }

    public String getNamespace() {
        int iM6424 = C0073.m6424(this);
        if (iM6424 == 3 || iM6424 == 4) {
            return C0063.m4411(this);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x024f, code lost:
    
        r69.e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0252, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int next() throws com.android.apksig.internal.apk.AndroidBinXmlParser.XmlParserException {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.internal.apk.AndroidBinXmlParser.next():int");
    }

    public AndroidBinXmlParser(ByteBuffer byteBuffer) throws XmlParserException {
        Chunk chunkM728;
        C0064.m4604(byteBuffer, C0072.m6217());
        while (C0111.m13127(byteBuffer) && (chunkM728 = m728(byteBuffer)) != null) {
            if (m730(chunkM728) == 3) {
                break;
            }
        }
        chunkM728 = null;
        if (chunkM728 != null) {
            this.a = m736(chunkM728);
            return;
        }
        throw new XmlParserException(C0066.m4828(m740(), 0, 20, 2169));
    }

    public static int access$100(ByteBuffer byteBuffer) {
        return C0028.m2656(byteBuffer) & UShort.MAX_VALUE;
    }

    public static long access$200(ByteBuffer byteBuffer) {
        return ((long) C0064.m4566(byteBuffer)) & 4294967295L;
    }

    public static long access$500(ByteBuffer byteBuffer, int i) {
        return ((long) C0067.m5511(byteBuffer, i)) & 4294967295L;
    }

    public static int access$600(ByteBuffer byteBuffer) {
        return C0069.m5826(byteBuffer) & 255;
    }

    public boolean getAttributeBooleanValue(int i) {
        return m733(m737(this, i));
    }

    public int getAttributeIntValue(int i) {
        return m739(m737(this, i));
    }

    public String getAttributeName(int i) {
        return m735(m737(this, i));
    }

    public int getAttributeNameResourceId(int i) {
        return m738(m737(this, i));
    }

    public String getAttributeNamespace(int i) {
        return m731(m737(this, i));
    }

    public String getAttributeStringValue(int i) {
        return m729(m737(this, i));
    }

    public int getAttributeValueType(int i) {
        int iM734 = m734(m737(this, i));
        if (iM734 == 1) {
            return 3;
        }
        if (iM734 == 3) {
            return 1;
        }
        switch (iM734) {
            case 16:
            case 17:
                return 2;
            case 18:
                return 4;
            default:
                return 0;
        }
    }
}
