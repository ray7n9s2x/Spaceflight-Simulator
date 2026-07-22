package com.android.apksig;

import androidx.core.app.FrameMetricsAggregator;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.RandomAccessFileDataSink;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
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
import com.zfork.multiplatforms.android.bomb.r;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class SigningCertificateLineage {
    public static final int MAGIC = 1056913873;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f33short = {2461, 2495, 2480, 2553, 2474, 2558, 2493, 2495, 2482, 2493, 2475, 2482, 2495, 2474, 2491, 2558, 2483, 2487, 2480, 2487, 2483, 2475, 2483, 2558, 2445, 2458, 2453, 2558, 2472, 2491, 2476, 2477, 2487, 2481, 2480, 2558, 2481, 2488, 2558, 2480, 2475, 2482, 2482, 2558, 2480, 2481, 2490, 2491, 2477, 1702, 1690, 1687, 1746, 1666, 1664, 1693, 1668, 1691, 1686, 1687, 1686, 1746, 1715, 1698, 1721, 1746, 1686, 1693, 1687, 1665, 1746, 1692, 1693, 1670, 1746, 1681, 1693, 1692, 1670, 1683, 1691, 1692, 1746, 1683, 1746, 1668, 1683, 1694, 1691, 1686, 1746, 1700, 1729, 1756, 1731, 1746, 1665, 1691, 1685, 1692, 1683, 1670, 1671, 1664, 1687, 1746, 1680, 1694, 1693, 1681, 1689, 1756, 2306, 2366, 2355, 2422, 2342, 2340, 2361, 2336, 2367, 2354, 2355, 2354, 2422, 2327, 2310, 2333, 2422, 2354, 2361, 2355, 2341, 2422, 2360, 2361, 2338, 2422, 2357, 2361, 2360, 2338, 2359, 2367, 2360, 2422, 2359, 2422, 2336, 2359, 2362, 2367, 2354, 2422, 2304, 2405, 2422, 2360, 2361, 2340, 2422, 2304, 2405, 2424, 2407, 2422, 2341, 2367, 2353, 2360, 2359, 2338, 2339, 2340, 2355, 2422, 2356, 2362, 2361, 2357, 2365, 2424, 2759, 2811, 2806, 2739, 2787, 2785, 2812, 2789, 2810, 2807, 2806, 2807, 2739, 2770, 2755, 2776, 2739, 2807, 2812, 2806, 2784, 2739, 2813, 2812, 2791, 2739, 2800, 2812, 2813, 2791, 2802, 2810, 2813, 2739, 2802, 2739, 2789, 2802, 2815, 2810, 2807, 2739, 2815, 2810, 2813, 2806, 2802, 2804, 2806, 2749, 1444, 2855, 2844, 2835, 2832, 2846, 2839, 2898, 2822, 2845, 2898, 2816, 2839, 2835, 2838, 2898, 2846, 2843, 2817, 2822, 2898, 2845, 2836, 2898, 2817, 2843, 2837, 2844, 2843, 2844, 2837, 2898, 2833, 2839, 2816, 2822, 2843, 2836, 2843, 2833, 2835, 2822, 2839, 2898, 2844, 2845, 2838, 2839, 2817, 2898, 2843, 2844, 2898, 2849, 2843, 2837, 2844, 2843, 2844, 2837, 2865, 2839, 2816, 2822, 2843, 2836, 2843, 2833, 2835, 2822, 2839, 2878, 2843, 2844, 2839, 2835, 2837, 2839, 1223, 1251, 1278, 1276, 1249, 1278, 1259, 1276, 1198, 1245, 1255, 1257, 1248, 1255, 1248, 1257, 1229, 1259, 1276, 1274, 1255, 1256, 1255, 1261, 1263, 1274, 1259, 1218, 1255, 1248, 1259, 1263, 1257, 1259, 1198, 1256, 1249, 1276, 1251, 1263, 1274, 1204, 1198, 1275, 1248, 1276, 1259, 1261, 1249, 1257, 1248, 1255, 1268, 1259, 1258, 1198, 1272, 1259, 1276, 1277, 1255, 1249, 1248, 1184, 589, 617, 628, 630, 619, 628, 609, 630, 548, 599, 621, 611, 618, 621, 618, 611, 583, 609, 630, 624, 621, 610, 621, 615, 613, 624, 609, 584, 621, 618, 609, 613, 611, 609, 548, 610, 619, 630, 617, 613, 624, 574, 548, 585, 581, 579, 589, 583, 548, 620, 609, 613, 608, 609, 630, 548, 617, 621, 631, 617, 613, 624, 615, 620, 554, 931, 903, 922, 920, 901, 922, 911, 920, 970, 953, 899, 909, 900, 899, 900, 909, 937, 911, 920, 926, 899, 908, 899, 905, 907, 926, 911, 934, 899, 900, 911, 907, 909, 911, 970, 908, 901, 920, 903, 907, 926, 976, 970, 899, 900, 921, 927, 908, 908, 899, 905, 899, 911, 900, 926, 970, 910, 907, 926, 907, 970, 908, 901, 920, 970, 898, 911, 907, 910, 911, 920, 964, 452, 449, 468, 449, 499, 463, 469, 466, 451, 453, 384, 413, 413, 384, 462, 469, 460, 460, 773, 2362, 2357, 2352, 2361, 2428, 2401, 2401, 2428, 2354, 2345, 2352, 2352, 2418, 2382, 2371, 2310, 2389, 2383, 2369, 2376, 2371, 2370, 2310, 2370, 2375, 2386, 2375, 2310, 2370, 2377, 2371, 2389, 2310, 2376, 2377, 2386, 2310, 2373, 2377, 2376, 2386, 2375, 2383, 2376, 2310, 2375, 2310, 2384, 2375, 2378, 2383, 2370, 2310, 2378, 2383, 2376, 2371, 2375, 2369, 2371, 2312, 1806, 1827, 1832, 1824, 1853, 1830, 1851, 1831, 1826, 1903, 1838, 1852, 1852, 1824, 1836, 1830, 1838, 1851, 1834, 1835, 1903, 1848, 1830, 1851, 1831, 1903, 1833, 1830, 1853, 1852, 1851, 1903, 1852, 1830, 1832, 1825, 1830, 1825, 1832, 1903, 1836, 1834, 1853, 1851, 1830, 1833, 1830, 1836, 1838, 1851, 1834, 1903, 1830, 1825, 1849, 1838, 1827, 1830, 1835, 1903, 1824, 1825, 1903, 1835, 1834, 1852, 1830, 1853, 1834, 1835, 1903, 1855, 1827, 1838, 1851, 1833, 1824, 1853, 1826, 1903, 1849, 1834, 1853, 1852, 1830, 1824, 1825, 1852, 2442, 2480, 2494, 2487, 2480, 2487, 2494, 2458, 2492, 2475, 2477, 2480, 2495, 2480, 2490, 2488, 2477, 2492, 2453, 2480, 2487, 2492, 2488, 2494, 2492, 2553, 2488, 2485, 2475, 2492, 2488, 2493, 2464, 2553, 2481, 2488, 2474, 2553, 2480, 2477, 2474, 2553, 2495, 2480, 2475, 2474, 2477, 2553, 2487, 2486, 2493, 2492, 2439, 2443, 2442, 2434, 2445, 2435, 2500, 2521, 2521, 2500, 2442, 2449, 2440, 2440, 1845, 1811, 1796, 1794, 1823, 1808, 1823, 1813, 1815, 1794, 1811, 1878, 1886, 836, 845, 771, 770, 793, 845, 779, 770, 792, 771, 777, 845, 772, 771, 845, 793, 773, 776, 845, 830, 772, 778, 771, 772, 771, 778, 814, 776, 799, 793, 772, 779, 772, 782, 780, 793, 776, 801, 772, 771, 776, 780, 778, 776, 1916, 1914, 1901, 1899, 1855, 1826, 1826, 1855, 1905, 1898, 1907, 1907, 624, 598, 577, 583, 602, 597, 602, 592, 594, 583, 598, 531, 605, 604, 583, 531, 597, 604, 582, 605, 599, 531, 602, 605, 531, 608, 602, 596, 605, 602, 605, 596, 624, 598, 577, 583, 602, 597, 602, 592, 594, 583, 598, 639, 602, 605, 598, 594, 596, 598, 1493, 1432, 1437, 1428, 1518, 1480, 1503, 1497, 1476, 1483, 1476, 1486, 1484, 1497, 1480, 1421, 1424, 1424, 1421, 1475, 1496, 1473, 1473, 2370, 2372, 2387, 2389, 2305, 2332, 2332, 2305, 2383, 2388, 2381, 2381, 2765, 2763, 2780, 2778, 2702, 2707, 2707, 2702, 2752, 2779, 2754, 2754, 436, 440, 441, 433, 446, 432, 503, 490, 490, 503, 441, 418, 443, 443, 1874, 1902, 1891, 1830, 1910, 1908, 1897, 1904, 1903, 1890, 1891, 1890, 1830, 1898, 1903, 1896, 1891, 1895, 1889, 1891, 1830, 1890, 1903, 1904, 1891, 1908, 1889, 1891, 1909, 1830, 1888, 1908, 1897, 1899, 1830, 1906, 1902, 1903, 1909, 1830, 1898, 1903, 1896, 1891, 1895, 1889, 1891, 1226, 1270, 1275, 1214, 1262, 1260, 1265, 1256, 1271, 1274, 1275, 1274, 1214, 1266, 1271, 1264, 1275, 1279, 1273, 1275, 1214, 1271, 1261, 1214, 1264, 1265, 1258, 1214, 
    1279, 1214, 1274, 1275, 1261, 1277, 1275, 1264, 1274, 1279, 1264, 1258, 1214, 1265, 1260, 1214, 1279, 1264, 1214, 1279, 1264, 1277, 1275, 1261, 1258, 1265, 1260, 1214, 1265, 1272, 1214, 1258, 1270, 1271, 1261, 1214, 1266, 1271, 1264, 1275, 1279, 1273, 1275, 1901, 1879, 1881, 1872, 1883, 1868, 1917, 1873, 1872, 1880, 1879, 1881, 1869, 1822, 1869, 1867, 1870, 1870, 1874, 1879, 1883, 1882, 1822, 1865, 1878, 1879, 1885, 1878, 1822, 1887, 1868, 1883, 1822, 1872, 1873, 1866, 1822, 1870, 1868, 1883, 1869, 1883, 1872, 1866, 1822, 1879, 1872, 1822, 1866, 1878, 1883, 1822, 1901, 1879, 1881, 1872, 1879, 1872, 1881, 1917, 1883, 1868, 1866, 1879, 1880, 1879, 1885, 1887, 1866, 1883, 1906, 1879, 1872, 1883, 1887, 1881, 1883, 1075, 1065, 1063, 1070, 1061, 1074, 1027, 1071, 1070, 1062, 1065, 1063, 1075, 1120, 1149, 1149, 1120, 1070, 1077, 1068, 1068, 1986, 1984, 1999, 1926, 2005, 1921, 1984, 1989, 1989, 1921, 1999, 1988, 2006, 1921, 1989, 1988, 2002, 1986, 1988, 1999, 1989, 1984, 1999, 2005, 1921, 2005, 1998, 1921, 1997, 1992, 1999, 1988, 1984, 1990, 1988, 1921, 2006, 1992, 2005, 1993, 1921, 1999, 2004, 1997, 1997, 1921, 1992, 1999, 2001, 2004, 2005, 2002, 1679, 1717, 1723, 1714, 1721, 1710, 1695, 1715, 1714, 1722, 1717, 1723, 1788, 1695, 1721, 1710, 1704, 1717, 1722, 1717, 1727, 1725, 1704, 1721, 1788, 1727, 1715, 1714, 1704, 1725, 1717, 1714, 1717, 1714, 1723, 1788, 1708, 1710, 1717, 1706, 1725, 1704, 1721, 1788, 1719, 1721, 1701, 1788, 1704, 1715, 1788, 1711, 1717, 1723, 1714, 1788, 1704, 1716, 1721, 1788, 1714, 1721, 1707, 1788, 1679, 1717, 1723, 1714, 1717, 1714, 1723, 1695, 1721, 1710, 1704, 1717, 1722, 1717, 1727, 1725, 1704, 1721, 1680, 1717, 1714, 1721, 1725, 1723, 1721, 1788, 1710, 1721, 1727, 1715, 1710, 1720, 1788, 1720, 1715, 1721, 1711, 1788, 1714, 1715, 1704, 1788, 1713, 1725, 1704, 1727, 1716, 1788, 1704, 1716, 1721, 1788, 1721, 1700, 1717, 1711, 1704, 1717, 1714, 1723, 1788, 1713, 1715, 1711, 1704, 1788, 1710, 1721, 1727, 1721, 1714, 1704, 1788, 1710, 1721, 1727, 1715, 1710, 1720, 2989, 2959, 2944, 2944, 2945, 2970, 3022, 2973, 2974, 2959, 2969, 2944, 3022, 2954, 2955, 2973, 2957, 2955, 2944, 2954, 2959, 2944, 2970, 3022, 2973, 2951, 2953, 2944, 2951, 2944, 2953, 3022, 2957, 2955, 2972, 2970, 2951, 2952, 2951, 2957, 2959, 2970, 2955, 3022, 2945, 2944, 3022, 2959, 2944, 3022, 2955, 2947, 2974, 2970, 2967, 3022, 3005, 2951, 2953, 2944, 2951, 2944, 2953, 2989, 2955, 2972, 2970, 2951, 2952, 2951, 2957, 2959, 2970, 2955, 2978, 2951, 2944, 2955, 2959, 2953, 2955, 3028, 3022, 2944, 2945, 3022, 2974, 2959, 2972, 2955, 2944, 2970, 3022, 2944, 2945, 2954, 2955, 2115, 2120, 2121, 2124, 2116, 2147, 2113, 2128, 2113, 2114, 2121, 2124, 2121, 2132, 2121, 2117, 2131, ZipUtils.GP_FLAG_EFS, 2077, 2077, ZipUtils.GP_FLAG_EFS, 2126, 2133, 2124, 2124, 2731, 2720, 2721, 2724, 2732, 2792, 2805, 2805, 2792, 2726, 2749, 2724, 2724, 2336, 2353, 2338, 2357, 2366, 2340, 2416, 2413, 2413, 2416, 2366, 2341, 2364, 2364, 1579, 1575, 1574, 1582, 1569, 1583, 1640, 1653, 1653, 1640, 1574, 1597, 1572, 1572, 991, 1017, 1006, 1000, 1013, 1018, 1013, 1023, 1021, 1000, 1017, 956, 948, 2859, 2850, 2924, 2925, 2934, 2850, 2916, 2925, 2935, 2924, 2918, 2850, 2923, 2924, 2850, 2934, 2922, 2919, 2850, 2897, 2923, 2917, 2924, 2923, 2924, 2917, 2881, 2919, 2928, 2934, 2923, 2916, 2923, 2913, 2915, 2934, 2919, 2894, 2923, 2924, 2919, 2915, 2917, 2919, 1440, 1452, 1453, 1445, 1450, 1444, 1507, 1534, 1534, 1507, 1453, 1462, 1455, 1455, 1584, 1589, 1568, 1589, 1543, 1597, 1594, 1599, 1652, 1641, 1641, 1652, 1594, 1569, 1592, 1592, 553, 556, 455, 456, 461, 452, 385, 412, 412, 385, 463, 468, 461, 461};
    public final int a;
    public final List b;

    /* JADX INFO: renamed from: com.android.apksig.SigningCertificateLineage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f34short = {1209, 1179, 1172, 1245, 1166, 1242, 1162, 1179, 1161, 1161, 1242, 1172, 1167, 1174, 1174, 1242, 1193, 1171, 1181, 1172, 1183, 1160, 1209, 1173, 1172, 1180, 1171, 1181, 1161, 1242, 1165, 1170, 1183, 1172, 1242, 1177, 1173, 1172, 1161, 1166, 1160, 1167, 1177, 1166, 1171, 1172, 1181, 1242, 1179, 1242, 1172, 1183, 1165, 1242, 1193, 1171, 1181, 1172, 1171, 1172, 1181, 1209, 1183, 1160, 1166, 1171, 1180, 1171, 1177, 1179, 1166, 1183, 1206, 1171, 1172, 1183, 1179, 1181, 1183, 901, 935, 936, 993, 946, 998, 950, 935, 949, 949, 998, 936, 947, 938, 938, 998, 917, 943, 929, 936, 931, 948, 901, 937, 936, 928, 943, 929, 949, 998, 945, 942, 931, 936, 998, 933, 937, 936, 949, 946, 948, 947, 933, 946, 943, 936, 929, 998, 935, 998, 936, 931, 945, 998, 917, 943, 929, 936, 943, 936, 929, 901, 931, 948, 946, 943, 928, 943, 933, 935, 946, 931, 906, 943, 936, 931, 935, 929, 931, 2388, 2382, 2368, 2377, 2370, 2389, 2404, 2374, 2391, 2374, 2373, 2382, 2379, 2382, 2387, 2382, 2370, 2388, 2311, 2330, 2330, 2311, 2377, 2386, 2379, 2379, 423, 445, 435, 442, 433, 422, 407, 437, 420, 437, 438, 445, 440, 445, 416, 445, 433, 423, 500, 489, 489, 500, 442, 417, 440, 440};
        public final SignerConfig a;
        public final SignerConfig b;
        public SignerCapabilities c;
        public SignerCapabilities d;
        public int e;

        public Builder(SignerConfig signerConfig, SignerConfig signerConfig2) {
            if (signerConfig == null || signerConfig2 == null) {
                throw new NullPointerException(C0078.m7427(m590(), 79, 79, 966));
            }
            this.a = signerConfig;
            this.b = signerConfig2;
        }

        /* JADX INFO: renamed from: ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
        public static short[] m590() {
            if (C0065.m4647() > 0) {
                return f34short;
            }
            return null;
        }

        public SigningCertificateLineage build() {
            if (C0024.m2002(this) < 28) {
                this.e = 28;
            }
            if (C0063.m4396(this) == null) {
                this.c = C0073.m6321(new SignerCapabilities.Builder());
            }
            SignerConfig signerConfigM3351 = C0033.m3351(this);
            SignerConfig signerConfigM1580 = C0021.m1580(this);
            if (signerConfigM1580 == null) {
                return C0025.m2101(C0024.m2002(this), signerConfigM3351, C0063.m4396(this));
            }
            if (C0063.m4298(this) == null) {
                this.d = C0073.m6321(new SignerCapabilities.Builder());
            }
            return C0070.m5908(C0024.m2002(this), signerConfigM3351, C0063.m4396(this), signerConfigM1580, C0063.m4298(this));
        }

        public Builder setMinSdkVersion(int i) {
            this.e = i;
            return this;
        }

        public Builder setNewCapabilities(SignerCapabilities signerCapabilities) {
            if (signerCapabilities == null) {
                throw new NullPointerException(C0033.m3330(m590(), 158, 26, 2343));
            }
            this.d = signerCapabilities;
            return this;
        }

        public Builder setOriginalCapabilities(SignerCapabilities signerCapabilities) {
            if (signerCapabilities == null) {
                throw new NullPointerException(C0076.m6902(m590(), 184, 26, 468));
            }
            this.c = signerCapabilities;
            return this;
        }

        public Builder(SignerConfig signerConfig) {
            if (signerConfig != null) {
                this.a = signerConfig;
                this.b = null;
                return;
            }
            throw new NullPointerException(C0017.m936(m590(), 0, 79, 1274));
        }
    }

    public static class SignerCapabilities {
        public final int a;
        public final int b;

        public static class Builder {
            public int a;
            public int b;

            public Builder() {
                this.a = C0028.m2575();
            }

            public SignerCapabilities build() {
                return new SignerCapabilities(C0019.m1303(this), C0069.m5830(this), null);
            }

            public Builder setAuth(boolean z) {
                this.b = C0069.m5830(this) | 16;
                if (z) {
                    this.a = C0019.m1303(this) | 16;
                } else {
                    this.a = C0019.m1303(this) & (-17);
                }
                return this;
            }

            public Builder setCallerConfiguredCapabilities(SignerCapabilities signerCapabilities) {
                this.a = (C0078.m7397(signerCapabilities) & C0074.m6538(signerCapabilities)) | (C0019.m1303(this) & (~C0078.m7397(signerCapabilities)));
                return this;
            }

            public Builder setInstalledData(boolean z) {
                this.b = C0069.m5830(this) | 1;
                if (z) {
                    this.a = C0019.m1303(this) | 1;
                } else {
                    this.a = C0019.m1303(this) & (-2);
                }
                return this;
            }

            public Builder setPermission(boolean z) {
                this.b = C0069.m5830(this) | 4;
                if (z) {
                    this.a = C0019.m1303(this) | 4;
                } else {
                    this.a = C0019.m1303(this) & (-5);
                }
                return this;
            }

            public Builder setRollback(boolean z) {
                this.b = C0069.m5830(this) | 8;
                if (z) {
                    this.a = C0019.m1303(this) | 8;
                } else {
                    this.a = C0019.m1303(this) & (-9);
                }
                return this;
            }

            public Builder setSharedUid(boolean z) {
                this.b = C0069.m5830(this) | 2;
                if (z) {
                    this.a = C0019.m1303(this) | 2;
                } else {
                    this.a = C0019.m1303(this) & (-3);
                }
                return this;
            }

            public Builder(int i) {
                this.a = i;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SignerCapabilities) {
                return C0032.m3186(this) == C0032.m3186((SignerCapabilities) obj);
            }
            return false;
        }

        public boolean hasAuth() {
            return (C0032.m3186(this) & 16) != 0;
        }

        public boolean hasInstalledData() {
            return (C0032.m3186(this) & 1) != 0;
        }

        public boolean hasPermission() {
            return (C0032.m3186(this) & 4) != 0;
        }

        public boolean hasRollback() {
            return (C0032.m3186(this) & 8) != 0;
        }

        public boolean hasSharedUid() {
            return (C0032.m3186(this) & 2) != 0;
        }

        public int hashCode() {
            return C0032.m3186(this) * 31;
        }

        public SignerCapabilities(int i, int i2, AnonymousClass1 anonymousClass1) {
            this.a = i;
            this.b = i2;
        }
    }

    public static class SignerConfig {
        public final KeyConfig a;
        public final X509Certificate b;

        public static class Builder {
            public final KeyConfig a;
            public final X509Certificate b;

            @Deprecated
            public Builder(PrivateKey privateKey, X509Certificate x509Certificate) {
                this.a = new KeyConfig.Jca(privateKey);
                this.b = x509Certificate;
            }

            public SignerConfig build() {
                return new SignerConfig(C0031.m3000(this), C0111.m13027(this), null);
            }

            public Builder(KeyConfig keyConfig, X509Certificate x509Certificate) {
                this.a = keyConfig;
                this.b = x509Certificate;
            }
        }

        public X509Certificate getCertificate() {
            return C0024.m1976(this);
        }

        public KeyConfig getKeyConfig() {
            return C0077.m7302(this);
        }

        @Deprecated
        public PrivateKey getPrivateKey() {
            return (PrivateKey) C0036.m3647(C0077.m7302(this), new r(5), new r(1));
        }

        public SignerConfig(KeyConfig keyConfig, X509Certificate x509Certificate, AnonymousClass1 anonymousClass1) {
            this.a = keyConfig;
            this.b = x509Certificate;
        }
    }

    public static /* synthetic */ int access$100() {
        return 23;
    }

    public static SigningCertificateLineage readFromApkDataSource(DataSource dataSource) {
        return C0064.m4616(dataSource, true);
    }

    public static SigningCertificateLineage readV31FromApkDataSource(DataSource dataSource) {
        return C0064.m4616(dataSource, false);
    }

    /* JADX INFO: renamed from: ۟ۢۤۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m589() {
        if (C0035.m3569() <= 0) {
            return f33short;
        }
        return null;
    }

    public SignerCapabilities getSignerCapabilities(SignerConfig signerConfig) {
        if (signerConfig != null) {
            return C0069.m5717(this, C0016.m677(signerConfig));
        }
        throw new NullPointerException(C0070.m5942(m589(), 731, 14, 2532));
    }

    public SigningCertificateLineage spawnDescendant(SignerConfig signerConfig, SignerConfig signerConfig2) {
        if (signerConfig == null || signerConfig2 == null) {
            throw new NullPointerException(C0019.m1189(m589(), 1141, 52, 1953));
        }
        return C0019.m1221(this, signerConfig, signerConfig2, C0073.m6321(new SignerCapabilities.Builder()));
    }

    public void updateSignerCapabilities(SignerConfig signerConfig, SignerCapabilities signerCapabilities) {
        if (signerConfig == null) {
            throw new NullPointerException(C0074.m6452(m589(), 1485, 14, 1608));
        }
        C0065.m4720(this, C0016.m677(signerConfig), signerCapabilities);
    }

    public static int a(List list) {
        int iM6026;
        if (list == null) {
            throw new IllegalArgumentException(C0030.m2840(m589(), 0, 49, 2526));
        }
        Iterator itM4732 = C0065.m4732(list);
        int i = 28;
        while (C0036.m3657(itM4732)) {
            SignatureAlgorithm signatureAlgorithmM3756 = C0036.m3756((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6012(itM4732));
            if (signatureAlgorithmM3756 != null && (iM6026 = C0071.m6026(signatureAlgorithmM3756)) > i) {
                i = iM6026;
            }
        }
        return i;
    }

    public static boolean checkLineagesCompatibility(SigningCertificateLineage signingCertificateLineage, SigningCertificateLineage signingCertificateLineage2) {
        ArrayList arrayList = signingCertificateLineage == null ? new ArrayList() : new ArrayList(C0023.m1837(signingCertificateLineage));
        ArrayList arrayList2 = signingCertificateLineage2 == null ? new ArrayList() : new ArrayList(C0023.m1837(signingCertificateLineage2));
        if (C0066.m4881(arrayList)) {
            return true;
        }
        if (C0066.m4881(arrayList2)) {
            return false;
        }
        if (C0018.m1084(arrayList2) >= C0018.m1084(arrayList) && C0111.m13095(C0071.m6076(arrayList2, 0, C0018.m1084(arrayList)), arrayList)) {
            return true;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList(arrayList);
        int iM4517 = C0064.m4517(arrayList3, C0064.m4526(arrayList4, C0018.m1084(arrayList4) - 1));
        return iM4517 >= 0 ? C0111.m13095(C0071.m6076(arrayList3, 0, iM4517 + 1), C0071.m6076(arrayList4, (C0018.m1084(arrayList) - 1) - iM4517, C0018.m1084(arrayList4))) : C0111.m13095(C0071.m6076(arrayList, 0, C0018.m1084(arrayList2)), arrayList2) && C0022.m1760(C0069.m5717(signingCertificateLineage, (X509Certificate) C0064.m4526(arrayList, C0018.m1084(arrayList2) - 1)));
    }

    public static SigningCertificateLineage consolidateLineages(List<SigningCertificateLineage> list) {
        if (list == null || C0025.m2084(list)) {
            return null;
        }
        SigningCertificateLineage signingCertificateLineageM1792 = (SigningCertificateLineage) C0071.m6078(list, 0);
        for (int i = 1; i < C0034.m3427(list); i++) {
            signingCertificateLineageM1792 = C0023.m1792(signingCertificateLineageM1792, (SigningCertificateLineage) C0071.m6078(list, i));
        }
        return signingCertificateLineageM1792;
    }

    public static SigningCertificateLineage readFromApkFile(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0070.m5942(m589(), 232, 1, 1494));
        try {
            SigningCertificateLineage signingCertificateLineageM4853 = C0066.m4853(C0034.m3388(randomAccessFile, 0L, C0028.m2600(randomAccessFile)));
            C0111.m13119(randomAccessFile);
            return signingCertificateLineageM4853;
        } catch (Throwable th) {
            try {
                C0111.m13119(randomAccessFile);
            } catch (Throwable th2) {
                C0072.m6234(th, th2);
            }
            throw th;
        }
    }

    public static SigningCertificateLineage readFromDataSource(DataSource dataSource) throws IOException {
        if (dataSource == null) {
            throw new NullPointerException(C0032.m3209(m589(), FrameMetricsAggregator.EVERY_DURATION, 18, 416));
        }
        ByteBuffer byteBufferM6568 = C0074.m6568(dataSource, 0L, (int) C0072.m6146(dataSource));
        C0064.m4604(byteBufferM6568, C0072.m6217());
        C0074.m6550(byteBufferM6568);
        if (C0071.m5984(byteBufferM6568) < 8) {
            throw new IllegalArgumentException(C0032.m3209(m589(), 439, 72, 1002));
        }
        if (C0064.m4566(byteBufferM6568) != 1056913873) {
            throw new IllegalArgumentException(C0066.m4828(m589(), 374, 65, 516));
        }
        if (C0064.m4566(byteBufferM6568) != 1) {
            throw new IllegalArgumentException(C0070.m5942(m589(), 310, 64, 1166));
        }
        try {
            List listM1756 = C0022.m1756(C0067.m5463(byteBufferM6568));
            return new SigningCertificateLineage(listM1756, C0065.m4759(listM1756));
        } catch (ApkFormatException e) {
            throw new IOException(C0111.m13097(m589(), 233, 77, 2930), e);
        }
    }

    public static SigningCertificateLineage readFromFile(File file) {
        if (file != null) {
            return C0018.m996(C0024.m2036(new RandomAccessFile(file, C0037.m3829(m589(), 529, 1, 887))));
        }
        throw new NullPointerException(C0069.m5807(m589(), 530, 12, 2396));
    }

    public final SigningCertificateLineage c(SignerConfig signerConfig, SignerCapabilities signerCapabilities) {
        int iM3378 = C0033.m3378(this);
        if (!C0025.m2084(C0111.m13147(this))) {
            throw new IllegalStateException(C0078.m7427(m589(), 679, 52, 2521));
        }
        try {
            return new SigningCertificateLineage(C0111.m13086(new V3SigningCertificateLineage.SigningCertificateNode(C0016.m677(signerConfig), null, null, new byte[0], C0035.m3613(signerCapabilities))), iM3378);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(C0025.m2151(m589(), 591, 88, 1871), e);
        }
    }

    public final ByteBuffer d() {
        byte[] bArrM1364 = C0020.m1364(C0111.m13147(this));
        ByteBuffer byteBufferM3516 = C0035.m3516(bArrM1364.length + 12);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0038.m4018(byteBufferM3516, MAGIC);
        C0038.m4018(byteBufferM3516, 1);
        C0038.m4018(byteBufferM3516, bArrM1364.length);
        C0068.m5569(byteBufferM3516, bArrM1364);
        C0020.m1437(byteBufferM3516);
        return byteBufferM3516;
    }

    public byte[] encodeSigningCertificateLineage() {
        return C0020.m1364(C0111.m13147(this));
    }

    public List<X509Certificate> getCertificatesInLineage() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List listM13147 = C0111.m13147(this);
            if (i >= C0034.m3427(listM13147)) {
                return arrayList;
            }
            C0017.m919(arrayList, C0025.m2182((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i)));
            i++;
        }
    }

    public SigningCertificateLineage getSubLineage(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException(C0028.m2609(m589(), 864, 23, 1453));
        }
        int i = 0;
        while (true) {
            List listM13147 = C0111.m13147(this);
            if (i >= C0034.m3427(listM13147)) {
                throw new IllegalArgumentException(C0019.m1189(m589(), 814, 50, 563));
            }
            if (C0023.m1865(C0025.m2182((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i)), x509Certificate)) {
                return new SigningCertificateLineage(new ArrayList(C0033.m3308(listM13147, 0, i + 1)), C0033.m3378(this));
            }
            i++;
        }
    }

    public boolean isCertificateInLineage(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException(C0025.m2151(m589(), 887, 12, 2337));
        }
        int i = 0;
        while (true) {
            List listM13147 = C0111.m13147(this);
            if (i >= C0034.m3427(listM13147)) {
                return false;
            }
            if (C0023.m1865(C0025.m2182((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i)), x509Certificate)) {
                return true;
            }
            i++;
        }
    }

    public boolean isCertificateLatestInLineage(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException(C0039.m4066(m589(), 899, 12, 2734));
        }
        return C0023.m1865(C0025.m2182((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(C0111.m13147(this), C0034.m3427(r0) - 1)), x509Certificate);
    }

    public boolean isSignerInLineage(SignerConfig signerConfig) {
        if (signerConfig != null) {
            return C0022.m1653(this, C0016.m677(signerConfig));
        }
        throw new NullPointerException(C0031.m3047(m589(), 911, 14, 471));
    }

    public SigningCertificateLineage mergeLineageWith(SigningCertificateLineage signingCertificateLineage) {
        SigningCertificateLineage signingCertificateLineage2;
        SigningCertificateLineage signingCertificateLineage3;
        List listM13147;
        int i = 0;
        if (C0022.m1653(signingCertificateLineage, C0025.m2182((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(C0111.m13147(this), 0)))) {
            signingCertificateLineage3 = this;
            signingCertificateLineage2 = signingCertificateLineage;
        } else {
            signingCertificateLineage2 = this;
            signingCertificateLineage3 = signingCertificateLineage;
        }
        List listM131472 = C0111.m13147(signingCertificateLineage3);
        V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM131472, 0);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int iM5602 = C0068.m5602(signingCertificateLineage2);
            listM13147 = C0111.m13147(signingCertificateLineage2);
            if (i >= iM5602) {
                break;
            }
            int i2 = i + 1;
            V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode2 = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i);
            if (C0023.m1865(C0025.m2182(signingCertificateNode2), C0025.m2182(signingCertificateNode))) {
                i = i2;
                break;
            }
            C0017.m919(arrayList, signingCertificateNode2);
            i = i2;
        }
        if (i == C0018.m1084(arrayList)) {
            throw new IllegalArgumentException(C0027.m2404(m589(), 972, 71, 1182));
        }
        C0017.m919(arrayList, signingCertificateNode);
        int i3 = 1;
        while (i < C0068.m5602(signingCertificateLineage2) && i3 < C0068.m5602(signingCertificateLineage3)) {
            int i4 = i + 1;
            V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode3 = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i);
            int i5 = i3 + 1;
            V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode4 = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM131472, i3);
            if (!C0023.m1865(C0025.m2182(signingCertificateNode3), C0025.m2182(signingCertificateNode4))) {
                throw new IllegalArgumentException(C0078.m7427(m589(), 925, 47, 1798));
            }
            C0017.m919(arrayList, signingCertificateNode4);
            i = i4;
            i3 = i5;
        }
        while (i < C0068.m5602(signingCertificateLineage2)) {
            C0017.m919(arrayList, (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i));
            i++;
        }
        while (i3 < C0068.m5602(signingCertificateLineage3)) {
            C0017.m919(arrayList, (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM131472, i3));
            i3++;
        }
        return new SigningCertificateLineage(arrayList, C0032.m3151(C0033.m3378(this), C0033.m3378(signingCertificateLineage)));
    }

    public int size() {
        return C0034.m3427(C0111.m13147(this));
    }

    public List<DefaultApkSignerEngine.SignerConfig> sortSignerConfigs(List<DefaultApkSignerEngine.SignerConfig> list) {
        if (list == null) {
            throw new NullPointerException(C0072.m6116(m589(), 1120, 21, 1088));
        }
        ArrayList arrayList = new ArrayList(C0034.m3427(list));
        int i = 0;
        while (true) {
            List listM13147 = C0111.m13147(this);
            if (i >= C0034.m3427(listM13147)) {
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 < C0034.m3427(list)) {
                    DefaultApkSignerEngine.SignerConfig signerConfig = (DefaultApkSignerEngine.SignerConfig) C0071.m6078(list, i2);
                    if (C0023.m1865(C0025.m2182((V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i)), C0071.m6078(C0111.m13081(signerConfig), 0))) {
                        C0017.m919(arrayList, signerConfig);
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        if (C0018.m1084(arrayList) == C0034.m3427(list)) {
            return arrayList;
        }
        throw new IllegalArgumentException(C0020.m1443(m589(), 1043, 77, 1854));
    }

    public void writeToDataSink(DataSink dataSink) {
        if (dataSink == null) {
            throw new NullPointerException(C0039.m4066(m589(), 1570, 16, 1620));
        }
        C0017.m841(dataSink, C0067.m5505(this));
    }

    public void writeToFile(File file) {
        if (file == null) {
            throw new NullPointerException(C0065.m4757(m589(), 1588, 12, 417));
        }
        C0034.m3452(this, new RandomAccessFileDataSink(new RandomAccessFile(file, C0032.m3209(m589(), 1586, 2, 603))));
    }

    public SigningCertificateLineage(List list, int i) {
        this.a = i;
        this.b = list;
    }

    public static SigningCertificateLineage b(DataSource dataSource, boolean z) throws ApkFormatException {
        String strM4828;
        try {
            ApkUtils.ZipSections zipSectionsM3656 = C0036.m3656(dataSource);
            ArrayList arrayList = new ArrayList();
            try {
                C0017.m919(arrayList, C0019.m1188(dataSource, zipSectionsM3656, 462663009, new ApkSigningBlockUtils.Result(31)));
            } catch (ApkSigningBlockUtils.SignatureNotFoundException unused) {
            }
            if (z) {
                try {
                    C0017.m919(arrayList, C0019.m1188(dataSource, zipSectionsM3656, -262969152, new ApkSigningBlockUtils.Result(3)));
                } catch (ApkSigningBlockUtils.SignatureNotFoundException unused2) {
                }
            }
            if (C0066.m4881(arrayList)) {
                if (!z) {
                    strM4828 = C0071.m5991(m589(), 49, 63, 1778);
                } else {
                    strM4828 = C0066.m4828(m589(), 112, 70, 2390);
                }
                throw new IllegalArgumentException(strM4828);
            }
            ArrayList arrayList2 = new ArrayList(1);
            Iterator itM4154 = C0039.m4154(arrayList);
            while (C0036.m3657(itM4154)) {
                ByteBuffer byteBufferM5463 = C0067.m5463(C0067.m5410((SignatureInfo) C0071.m6012(itM4154)));
                while (C0111.m13127(byteBufferM5463)) {
                    try {
                        C0017.m919(arrayList2, C0065.m4662(C0067.m5463(C0067.m5463(byteBufferM5463))));
                    } catch (IllegalArgumentException unused3) {
                    }
                }
            }
            if (!C0066.m4881(arrayList2)) {
                if (C0018.m1084(arrayList2) > 1) {
                    return C0023.m1794(arrayList2);
                }
                return (SigningCertificateLineage) C0064.m4526(arrayList2, 0);
            }
            throw new IllegalArgumentException(C0023.m1904(m589(), 182, 50, 2707));
        } catch (ZipFormatException e) {
            throw new ApkFormatException(C0033.m3375(e));
        }
    }

    public static SigningCertificateLineage readFromBytes(byte[] bArr) {
        return C0018.m996(C0025.m2149(C0020.m1393(bArr)));
    }

    public static SigningCertificateLineage readFromSignedData(ByteBuffer byteBuffer) {
        C0067.m5463(byteBuffer);
        C0067.m5463(byteBuffer);
        C0064.m4566(byteBuffer);
        C0064.m4566(byteBuffer);
        ByteBuffer byteBufferM5463 = C0067.m5463(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        while (C0111.m13127(byteBufferM5463)) {
            ByteBuffer byteBufferM54632 = C0067.m5463(byteBufferM5463);
            if (C0064.m4566(byteBufferM54632) == 1000370060) {
                C0017.m919(arrayList, C0028.m2569(C0071.m6029(byteBufferM54632)));
            }
        }
        if (!C0066.m4881(arrayList)) {
            if (C0018.m1084(arrayList) > 1) {
                return C0023.m1794(arrayList);
            }
            return (SigningCertificateLineage) C0064.m4526(arrayList, 0);
        }
        throw new IllegalArgumentException(C0026.m2321(m589(), 542, 49, 2342));
    }

    public static SigningCertificateLineage readFromV3AttributeValue(byte[] bArr) {
        List listM1756 = C0022.m1756(C0064.m4604(C0020.m1393(bArr), C0072.m6217()));
        return new SigningCertificateLineage(listM1756, C0065.m4759(listM1756));
    }

    public byte[] getBytes() {
        return C0027.m2445(C0067.m5505(this));
    }

    public void updateSignerCapabilities(X509Certificate x509Certificate, SignerCapabilities signerCapabilities) {
        if (x509Certificate == null) {
            throw new NullPointerException(C0029.m2695(m589(), 1556, 14, 1475));
        }
        int i = 0;
        while (true) {
            List listM13147 = C0111.m13147(this);
            if (i < C0034.m3427(listM13147)) {
                V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i);
                if (C0023.m1865(C0025.m2182(signingCertificateNode), x509Certificate)) {
                    signingCertificateNode.flags = C0035.m3613(C0073.m6321(C0073.m6429(new SignerCapabilities.Builder(C0034.m3500(signingCertificateNode)), signerCapabilities)));
                    return;
                }
                i++;
            } else {
                StringBuilder sb = new StringBuilder(C0068.m5544(m589(), 1499, 13, 924));
                C0036.m3741(sb, C0017.m906(x509Certificate));
                C0077.m7290(sb, C0022.m1728(m589(), 1512, 44, 2818));
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
        }
    }

    public SignerCapabilities getSignerCapabilities(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException(C0026.m2321(m589(), 802, 12, 1823));
        }
        int i = 0;
        while (true) {
            List listM13147 = C0111.m13147(this);
            if (i < C0034.m3427(listM13147)) {
                V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, i);
                if (C0023.m1865(C0025.m2182(signingCertificateNode), x509Certificate)) {
                    return C0073.m6321(new SignerCapabilities.Builder(C0034.m3500(signingCertificateNode)));
                }
                i++;
            } else {
                StringBuilder sb = new StringBuilder(C0020.m1443(m589(), 745, 13, 1910));
                C0036.m3741(sb, C0017.m906(x509Certificate));
                C0077.m7290(sb, C0016.m625(m589(), 758, 44, 877));
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
        }
    }

    public SigningCertificateLineage spawnDescendant(SignerConfig signerConfig, SignerConfig signerConfig2, SignerCapabilities signerCapabilities) {
        if (signerConfig == null) {
            throw new NullPointerException(C0064.m4545(m589(), 1471, 14, 2384));
        }
        if (signerConfig2 == null) {
            throw new NullPointerException(C0064.m4545(m589(), 1458, 13, 2760));
        }
        if (signerCapabilities != null) {
            List listM13147 = C0111.m13147(this);
            if (!C0025.m2084(listM13147)) {
                V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = (V3SigningCertificateLineage.SigningCertificateNode) C0071.m6078(listM13147, C0034.m3427(listM13147) - 1);
                if (C0073.m6306(C0064.m4613(C0025.m2182(signingCertificateNode)), C0064.m4613(C0016.m677(signerConfig)))) {
                    PublicKey publicKeyM6845 = C0075.m6845(C0016.m677(signerConfig));
                    int iM3378 = C0033.m3378(this);
                    SignatureAlgorithm signatureAlgorithm = (SignatureAlgorithm) C0071.m6078(C0038.m4014(publicKeyM6845, iM3378, false, false), 0);
                    ByteBuffer byteBufferM1393 = C0020.m1393(C0023.m1820(C0016.m677(signerConfig2), C0078.m7437(signatureAlgorithm)));
                    C0037.m3886(byteBufferM1393, 4);
                    ByteBuffer byteBufferM3516 = C0035.m3516(C0071.m5984(byteBufferM1393));
                    C0067.m5510(byteBufferM3516, byteBufferM1393);
                    byte[] bArrM2445 = C0027.m2445(byteBufferM3516);
                    ArrayList arrayList = new ArrayList(1);
                    C0017.m919(arrayList, C0016.m677(signerConfig));
                    ApkSigningBlockUtils.SignerConfig signerConfig3 = new ApkSigningBlockUtils.SignerConfig();
                    signerConfig3.keyConfig = C0070.m5871(signerConfig);
                    signerConfig3.certificates = arrayList;
                    signerConfig3.signatureAlgorithms = C0111.m13086(signatureAlgorithm);
                    List listM5550 = C0068.m5550(signerConfig3, bArrM2445);
                    SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(C0025.m2170((Integer) C0111.m13157((Pair) C0071.m6078(listM5550, 0))));
                    byte[] bArr = (byte[]) C0037.m3781((Pair) C0071.m6078(listM5550, 0));
                    signingCertificateNode.sigAlgorithm = signatureAlgorithmM4321;
                    V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode2 = new V3SigningCertificateLineage.SigningCertificateNode(C0016.m677(signerConfig2), signatureAlgorithmM4321, null, bArr, C0035.m3613(signerCapabilities));
                    ArrayList arrayList2 = new ArrayList(listM13147);
                    C0017.m919(arrayList2, signingCertificateNode2);
                    return new SigningCertificateLineage(arrayList2, iM3378);
                }
                throw new IllegalArgumentException(C0070.m5942(m589(), 1193, 143, 1756));
            }
            throw new IllegalArgumentException(C0072.m6116(m589(), 1336, 97, 3054));
        }
        throw new NullPointerException(C0063.m4315(m589(), 1433, 25, 2080));
    }
}
