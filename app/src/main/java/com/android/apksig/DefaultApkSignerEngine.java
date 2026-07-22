package com.android.apksig;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.stamp.V2SourceStampSigner;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.apk.v1.V1SchemeSigner;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v4.V4SchemeSigner;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.TeeDataSink;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
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
import com.zfork.multiplatforms.android.bomb.C0455v;
import com.zfork.multiplatforms.android.bomb.C0461w;
import com.zfork.multiplatforms.android.bomb.r;
import j$.util.DesugarCollections;
import j$.util.OptionalInt;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultApkSignerEngine implements ApkSignerEngine {
    public static final HashSet H;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f26short = {2781, 2792, 2748, 2800, 2809, 2813, 2799, 2792, 2748, 2803, 2802, 2809, 2748, 2799, 2805, 2811, 2802, 2809, 2798, 2748, 2815, 2803, 2802, 2810, 2805, 2811, 2748, 2801, 2793, 2799, 2792, 2748, 2814, 2809, 2748, 2796, 2798, 2803, 2794, 2805, 2808, 2809, 2808, 2279, 2208, 2225, 2274, 2296, 2294, 2303, 2296, 2303, 2294, 2225, 2292, 2303, 2288, 2291, 2301, 2292, 2293, 2225, 2291, 2276, 2277, 2225, 2277, 2297, 2292, 2225, 2302, 2301, 2293, 2292, 2274, 2277, 2225, 2274, 2296, 2294, 2303, 2292, 2275, 2225, 2296, 2303, 2225, 2277, 2297, 2292, 2225, 2242, 2296, 2294, 2303, 2296, 2303, 2294, 2258, 2292, 2275, 2277, 2296, 2295, 2296, 2290, 2288, 2277, 2292, 2269, 2296, 2303, 2292, 2288, 2294, 2292, 2225, 2296, 2274, 2225, 2300, 2296, 2274, 2274, 2296, 2303, 2294, 2239, 2225, 2225, 2241, 2301, 2292, 2288, 2274, 2292, 2225, 2273, 2275, 2302, 2279, 2296, 2293, 2292, 2225, 2277, 2297, 2292, 2225, 2302, 2301, 2293, 2292, 2274, 2277, 2225, 2274, 2296, 2294, 2303, 2292, 2275, 2225, 2277, 2302, 2225, 2292, 2303, 2288, 2291, 2301, 2292, 2225, 2279, 2208, 2225, 2274, 2296, 2294, 2303, 2296, 2303, 2294, 1600, 1643, 1634, 1644, 1643, 1632, 1573, 1638, 1641, 1642, 1654, 1632, 1633, 307, 290, 313, 338, 283, 257, 338, 278, 279, 272, 263, 277, 277, 275, 272, 286, 279, 338, 346, 257, 279, 279, 338, 275, 284, 278, 256, 285, 283, 278, 328, 278, 279, 272, 263, 277, 277, 275, 272, 286, 279, 338, 275, 262, 262, 256, 283, 272, 263, 262, 279, 347, 338, 275, 284, 278, 338, 262, 282, 283, 257, 338, 279, 284, 277, 283, 284, 279, 338, 283, 257, 338, 273, 285, 284, 276, 283, 277, 263, 256, 279, 278, 338, 262, 285, 338, 256, 279, 276, 263, 257, 279, 338, 262, 285, 338, 257, 283, 277, 284, 338, 278, 279, 272, 263, 277, 277, 275, 272, 286, 279, 338, 307, 290, 313, 257, 2312, 2351, 2343, 2338, 2347, 2346, 2414, 2362, 2337, 2414, 2346, 2347, 2362, 2347, 2364, 2339, 2343, 2336, 2347, 2414, 2361, 2342, 2347, 2362, 2342, 2347, 2364, 2414, 2362, 2342, 2347, 2414, 2319, 2334, 2309, 2414, 2343, 2365, 2414, 2346, 2347, 2348, 2363, 2345, 2345, 2351, 2348, 2338, 2347, 2169, 2115, 2114, 2118, 2115, 2114, 2070, 2167, 2150, 2173, 2070, 2131, 2136, 2114, 2116, 2127, 2070, 2783, 2715, 2718, 2699, 2718, 2783, 2715, 2710, 2713, 2713, 2714, 2701, 2700, 2783, 2713, 2701, 2704, 2706, 2783, 2696, 2711, 2718, 2699, 2783, 2696, 2718, 2700, 2783, 2701, 2714, 2702, 2698, 2714, 2700, 2699, 2714, 2715, 2645, 2674, 2671, 2666, 2666, 2598, 2673, 2663, 2671, 2674, 2671, 2664, 2657, 2598, 2674, 2665, 2598, 2671, 2664, 2677, 2678, 2659, 2661, 2674, 2598, 2665, 2675, 2674, 2678, 2675, 2674, 2598, 2631, 2646, 2637, 2593, 2677, 2598, 912, 897, 922, 1009, 948, 959, 933, 931, 936, 1009, 1717, 1787, 1786, 1761, 1717, 1772, 1776, 1761, 1717, 1786, 1760, 1761, 1765, 1760, 1761, 1717, 1777, 1776, 1766, 1765, 1788, 1761, 1776, 1717, 1761, 1789, 1788, 1766, 1717, 1789, 1780, 1763, 1788, 1787, 1778, 1717, 1783, 1776, 1776, 1787, 1717, 1767, 1776, 1764, 1760, 1776, 1766, 1761, 1776, 1777, 1498, 1437, 1420, 1503, 1477, 1483, 1474, 1485, 1496, 1497, 1502, 1481, 1420, 1412, 1510, 1517, 1534, 1420, 1503, 1477, 1483, 1474, 1485, 1496, 1497, 1502, 1481, 1413, 1420, 1485, 1480, 1480, 1477, 1496, 1477, 1475, 1474, 1420, 1502, 1481, 1501, 1497, 1481, 1503, 1496, 1481, 1480, 1420, 1486, 1493, 1420, 1475, 1497, 1496, 1500, 1497, 1496, 1510, 1485, 1502, 1513, 1474, 1496, 1502, 1477, 1481, 1503, 1412, 1413, 1420, 1476, 1485, 1503, 1474, 1419, 1496, 1420, 1486, 1481, 1481, 1474, 1420, 1482, 1497, 1472, 1482, 1477, 1472, 1472, 1481, 1480, 679, 736, 753, 674, 696, 694, 703, 688, 677, 676, 675, 692, 753, 761, 667, 656, 643, 753, 674, 696, 694, 703, 688, 677, 676, 675, 692, 760, 753, 703, 702, 677, 753, 680, 692, 677, 753, 694, 692, 703, 692, 675, 688, 677, 692, 693, 767, 753, 642, 698, 696, 673, 673, 692, 693, 753, 702, 676, 677, 673, 676, 677, 667, 688, 675, 660, 703, 677, 675, 696, 692, 674, 761, 760, 750, 3265, 3322, 3327, 3322, 3323, 3299, 3322, 3252, 3285, 3268, 3295, 3252, 3271, 3325, 3315, 3322, 3317, 3296, 3297, 3302, 3313, 3252, 3271, 3319, 3324, 3313, 3321, 3313, 3252, 3293, 3280, 3252, 3302, 3313, 3301, 3297, 3313, 3303, 3296, 3313, 3312, 3144, 3186, 3196, 3189, 3198, 3177, 3176, 3131, 3128, 1142, 1079, 1080, 1074, 1142, 1141, 2020, 1964, 1957, 1970, 1953, 2020, 1968, 1964, 1953, 2020, 1975, 1957, 1961, 1953, 2020, 1962, 1957, 1961, 1953, 2046, 2020, 2473, 2471, 2545, 2486, 2471, 2548, 2542, 2528, 2537, 2530, 2549, 2471, 2537, 2534, 2538, 2530, 2548, 2471, 2538, 2546, 2548, 2547, 2471, 2533, 2530, 2471, 2546, 2537, 2542, 2550, 2546, 2530, 490, 453, 463, 473, 452, 450, 463, 486, 458, 453, 450, 461, 462, 472, 479, 389, 467, 454, 455, 3009, 3046, 3054, 3051, 3042, 3043, 2983, 3059, 3048, 2983, 3042, 3049, 3044, 3048, 3043, 3042, 2983, 3060, 3048, 3058, 3061, 3044, 3042, 2983, 3060, 3059, 3046, 3050, 3063, 2983, 3044, 3042, 3061, 3059, 3054, 3041, 3054, 3044, 3046, 3059, 3042, 780, 813, 866, 801, 807, 816, 822, 811, 804, 811, 801, 803, 822, 807, 817, 866, 801, 813, 812, 804, 811, 805, 823, 816, 807, 806, 866, 804, 813, 816, 866, 817, 822, 803, 815, 818, 2274, 2245, 2264, 2269, 2269, 2193, 2246, 2256, 2264, 2245, 2264, 2271, 2262, 2193, 2245, 2270, 2193, 2264, 2271, 2242, 2241, 2260, 2258, 2245, 2193, 2270, 2244, 2245, 2241, 2244, 2245, 2193, 2288, 2273, 2298, 2198, 2242, 2193, 2056, 2090, 2085, 2085, 2084, 2111, 2155, 2095, 2094, 2111, 2094, 2105, 2086, 2082, 2085, 2094, 2155, 2095, 2094, 2089, 2110, 2092, 2092, 2090, 2089, 2087, 2094, 2155, 2104, 2111, 2090, 2111, 2110, 2104, 2155, 2084, 2093, 2155, 2084, 2110, 2111, 2107, 2110, 2111, 2155, 2058, 2075, ZipUtils.GP_FLAG_EFS, 2155, 2089, 2094, 2088, 2090, 2110, 2104, 2094, 2155, 2058, 2085, 2095, 2105, 2084, 2082, 2095, 2054, 2090, 2085, 2082, 2093, 2094, 2104, 2111, 2149, 2099, 2086, 2087, 2155, 2094, 
    2085, 2111, 2105, 2098, 2155, 2088, 2084, 2085, 2111, 2094, 2085, 2111, 2104, 2155, 2083, 2090, 2109, 2094, 2155, 2085, 2084, 2111, 2155, 2098, 2094, 2111, 2155, 2089, 2094, 2094, 2085, 2155, 2105, 2094, 2106, 2110, 2094, 2104, 2111, 2094, 2095, 2311, 2371, 2385, 2306, 2328, 2326, 2335, 2328, 2335, 2326, 2385, 2324, 2335, 2320, 2323, 2333, 2324, 2325, 2385, 2323, 2308, 2309, 2385, 2309, 2329, 2324, 2385, 2334, 2333, 2325, 2324, 2306, 2309, 2385, 2306, 2328, 2326, 2335, 2324, 2307, 2385, 2328, 2335, 2385, 2309, 2329, 2324, 2385, 2338, 2328, 2326, 2335, 2328, 2335, 2326, 2354, 2324, 2307, 2309, 2328, 2327, 2328, 2322, 2320, 2309, 2324, 2365, 2328, 2335, 2324, 2320, 2326, 2324, 2385, 2328, 2306, 2385, 2332, 2328, 2306, 2306, 2328, 2335, 2326, 2399, 2385, 2385, 2337, 2333, 2324, 2320, 2306, 2324, 2385, 2305, 2307, 2334, 2311, 2328, 2325, 2324, 2385, 2309, 2329, 2324, 2385, 2334, 2333, 2325, 2324, 2306, 2309, 2385, 2306, 2328, 2326, 2335, 2324, 2307, 2385, 2309, 2334, 2385, 2324, 2335, 2320, 2323, 2333, 2324, 2385, 2311, 2371, 2385, 2306, 2328, 2326, 2335, 2328, 2335, 2326, 2399, 2953, 2990, 2982, 2979, 2986, 2987, 3055, 3003, 2976, 3055, 2984, 2986, 2977, 2986, 3005, 2990, 3003, 2986, 3055, 2978, 2990, 2977, 2982, 2985, 2986, 3004, 3003, 3055, 2985, 2982, 2979, 2986, 2340, 2381, 2400, 2414, 2412, 2426, 2429, 2387, 2415, 2402, 2343, 2385, 2356, 2343, 2420, 2414, 2400, 2409, 2406, 2419, 2418, 2421, 2402, 2343, 2420, 2404, 2415, 2402, 2410, 2402, 2343, 2408, 2409, 2411, 2430, 2343, 2420, 2418, 2423, 2423, 2408, 2421, 2419, 2420, 2343, 2408, 2409, 2402, 2343, 2420, 2414, 2400, 2409, 2402, 2421, 2364, 2343, 2406, 2343, 2421, 2402, 2422, 2418, 2402, 2420, 2419, 2343, 2416, 2406, 2420, 2343, 2410, 2406, 2403, 2402, 2343, 2419, 2408, 2343, 2423, 2421, 2402, 2420, 2402, 2421, 2417, 2402, 2343, 2419, 2415, 2402, 2343, 2402, 2431, 2414, 2420, 2419, 2414, 2409, 2400, 2343, 2385, 2356, 2343, 2420, 2414, 2400, 2409, 2406, 2419, 2418, 2421, 2402, 2347, 2343, 2405, 2418, 2419, 2343, 2419, 2415, 2402, 2343, 2402, 2409, 2400, 2414, 2409, 2402, 2343, 2414, 2420, 2343, 2404, 2408, 2409, 2401, 2414, 2400, 2418, 2421, 2402, 2403, 2343, 2419, 2408, 2343, 2420, 2414, 2400, 2409, 2343, 2416, 2414, 2419, 2415, 2343, 2406, 2343, 2403, 2414, 2401, 2401, 2402, 2421, 2402, 2409, 2419, 2343, 2420, 2414, 2400, 2409, 2402, 2421, 2644, 2664, 2661, 2592, 2672, 2674, 2671, 2678, 2665, 2660, 2661, 2660, 2592, 2625, 2640, 2635, 2592, 2675, 2665, 2663, 2670, 2665, 2670, 2663, 2592, 2658, 2668, 2671, 2659, 2667, 2592, 2659, 2671, 2670, 2676, 2657, 2665, 2670, 2675, 2592, 1281, 1399, 1298, 1281, 1362, 1352, 1350, 1359, 1348, 1363, 1362, 1306, 1281, 1365, 1353, 1348, 1281, 1399, 1298, 1281, 1362, 1352, 1350, 1359, 1344, 1365, 1364, 1363, 1348, 1281, 1362, 1346, 1353, 1348, 1356, 1348, 1281, 1358, 1359, 1357, 1368, 1281, 1362, 1364, 1361, 1361, 1358, 1363, 1365, 1362, 1281, 1358, 1359, 1348, 1281, 1362, 1352, 1350, 1359, 1348, 1363, 3318, 3284, 3267, 3285, 3267, 3284, 3280, 3279, 3272, 3265, 3206, 3271, 3272, 3206, 3267, 3294, 3279, 3285, 3282, 3279, 3272, 3265, 3206, 3312, 3221, 3206, 3285, 3279, 3265, 3272, 3271, 3282, 3283, 3284, 3267, 3206, 3279, 3285, 3206, 3272, 3273, 3282, 3206, 3285, 3283, 3286, 3286, 3273, 3284, 3282, 3267, 3266, 808, 786, 796, 789, 794, 783, 782, 777, 798, 859, 776, 792, 787, 798, 790, 798, 859, 813, 840, 848, 859, 788, 789, 791, 770, 859, 776, 782, 779, 779, 788, 777, 783, 776, 859, 794, 859, 776, 786, 789, 796, 791, 798, 859, 776, 786, 796, 789, 798, 777, 859, 794, 789, 799, 859, 792, 794, 789, 789, 788, 783, 859, 793, 798, 859, 794, 779, 779, 798, 789, 799, 798, 799, 859, 783, 788, 859, 783, 787, 798, 859, 798, 771, 786, 776, 783, 786, 789, 796, 859, 776, 786, 796, 789, 794, 783, 782, 777, 798, 859, 776, 792, 787, 798, 790, 798, 859, 793, 791, 788, 792, 784, 776, 1446, 1437, 1426, 1425, 1439, 1430, 1491, 1415, 1436, 1491, 1411, 1426, 1409, 1408, 1430, 1491, 1415, 1435, 1430, 1491, 1411, 1409, 1436, 1413, 1434, 1431, 1430, 1431, 1491, 1408, 1434, 1428, 1437, 1434, 1437, 1428, 1491, 1425, 1439, 1436, 1424, 1432, 2079, 2071, 2054, 2067, 2175, 2075, 2076, 2068, 2173, 2079, 2067, 2076, 2075, 2068, 2071, 2049, 2054, 2172, 2079, 2068, 1893, 1886, 1859, 1861, 1856, 1856, 1887, 1858, 1860, 1877, 1876, 1808, 1887, 1861, 1860, 1856, 1861, 1860, 1808, 1856, 1887, 1884, 1881, 1875, 1865, 1802, 1808, 741, 729, 724, 657, 705, 707, 734, 711, 728, 725, 724, 725, 657, 709, 720, 707, 726, 724, 709, 724, 725, 657, 706, 728, 726, 735, 724, 707, 657, 722, 734, 735, 727, 728, 726, 706, 657, 725, 734, 657, 735, 734, 709, 657, 722, 734, 711, 724, 707, 657, 709, 729, 724, 657, 738, 757, 762, 657, 707, 720, 735, 726, 724, 657, 727, 734, 707, 657, 743, 642, 657, 706, 708, 705, 705, 734, 707, 709, 650, 657, 724, 728, 709, 729, 724, 707, 657, 705, 707, 734, 711, 728, 725, 724, 657, 709, 729, 724, 657, 734, 707, 728, 726, 728, 735, 720, 733, 657, 706, 728, 726, 735, 724, 707, 657, 734, 707, 657, 724, 735, 706, 708, 707, 724, 657, 720, 657, 706, 728, 726, 735, 724, 707, 657, 709, 720, 707, 726, 724, 709, 706, 657, 738, 757, 762, 657, 711, 724, 707, 706, 728, 734, 735, 657, 2111, 2052, 2073, 2079, 2074, 2074, 2053, 2072, 2078, 2063, 2062, 2122, 2049, 2063, 2067, 2122, 2059, 2054, 2061, 2053, 2072, 2051, 2078, 2050, 2055, 2122, 1601, 1544, 1554, 1601, 1551, 1550, 1557, 1601, 1554, 1556, 1553, 1553, 1550, 1555, 1557, 1540, 1541, 1601, 1543, 1550, 1555, 1601, 1568, 1585, 1578, 1601, 1586, 1544, 1542, 1551, 1536, 1557, 1556, 1555, 1540, 1601, 1586, 1538, 1545, 1540, 1548, 1540, 1601, 1559, 1618, 1601, 1554, 1544, 1542, 1551, 1544, 1551, 1542, 1657, 1627, 1606, 1631, 1600, 1613, 1612, 1613, 1545, 1602, 1612, 1616, 1545, 1608, 1605, 1614, 1606, 1627, 1600, 1629, 1601, 1604, 1626, 
    1545, 1607, 1606, 1629, 1545, 1626, 1628, 1625, 1625, 1606, 1627, 1629, 1612, 1613, 1545, 1606, 1607, 1545, 1608, 1605, 1605, 1545, 1613, 1612, 1626, 1600, 1627, 1612, 1613, 1545, 1640, 1607, 1613, 1627, 1606, 1600, 1613, 1545, 1658, 1645, 1634, 1545, 1631, 1612, 1627, 1626, 1600, 1606, 1607, 1626, 1519, 1534, 1509, 1422, 1533, 1479, 1481, 1472, 1479, 1472, 1481, 1422, 1516, 1474, 1473, 1485, 1477, 1422, 1487, 1482, 1482, 1479, 1498, 1479, 1473, 1472, 1422, 1473, 1480, 1422, 1501, 1479, 1481, 1472, 1487, 1498, 1499, 1500, 1483, 1414, 1501, 1415, 1422, 1500, 1483, 1503, 1499, 1483, 1501, 1498, 1483, 1482, 1422, 1484, 1495, 1422, 1473, 1499, 1498, 1502, 1499, 1498, 1524, 1479, 1502, 1533, 1483, 1485, 1498, 1479, 1473, 1472, 1501, 1414, 1415, 1422, 1478, 1487, 1501, 1472, 1417, 1498, 1422, 1484, 1483, 1483, 1472, 1422, 1480, 1499, 1474, 1480, 1479, 1474, 1474, 1483, 1482, 1422, 1495, 1483, 1498, 2856, 2834, 2844, 2837, 2846, 2847, 2907, 2874, 2859, 2864, 2907, 2856, 2834, 2844, 2837, 2834, 2837, 2844, 2907, 2873, 2871, 2836, 2840, 2832, 2907, 2837, 2836, 2831, 2907, 2818, 2846, 2831, 2907, 2844, 2846, 2837, 2846, 2825, 2842, 2831, 2846, 2847, 2901, 2907, 2856, 2832, 2834, 2827, 2827, 2846, 2847, 2907, 2836, 2830, 2831, 2827, 2830, 2831, 2849, 2834, 2827, 2856, 2846, 2840, 2831, 2834, 2836, 2837, 2824, 2899, 2898, 2884, 1921, 1958, 1979, 1982, 1982, 2034, 1957, 1971, 1979, 1958, 1979, 1980, 1973, 2034, 1958, 1981, 2034, 1979, 1980, 1953, 1954, 1975, 1969, 1958, 2034, 1979, 1980, 1954, 1959, 1958, 2034, 1939, 1922, 1945, 2037, 1953, 2034, 805, 770, 799, 794, 794, 854, 769, 791, 799, 770, 799, 792, 785, 854, 770, 793, 854, 799, 792, 773, 774, 787, 789, 770, 854, 793, 771, 770, 774, 771, 770, 854, 823, 806, 829, 849, 773, 854, 807, 800, 821, 825, 804, 889, 823, 817, 806, 800, 889, 807, 828, 821, 870, 865, 866, 858, 893, 885, 880, 889, 888, 828, 872, 883, 828, 891, 889, 882, 889, 878, 893, 872, 889, 828, 874, 813, 828, 879, 885, 891, 882, 893, 872, 873, 878, 889, 1484, 1476, 1493, 1472, 1452, 1480, 1487, 1479, 1454, 1484, 1472, 1487, 1480, 1479, 1476, 1490, 1493, 1455, 1484, 1479, 2739, 2716, 2710, 2688, 2717, 2715, 2710, 2751, 2707, 2716, 2715, 2708, 2711, 2689, 2694, 2780, 2698, 2719, 2718, 2952, 2944, 2961, 2948, 3048, 2956, 2955, 2947, 3050, 2952, 2948, 2955, 2956, 2947, 2944, 2966, 2961, 3051, 2952, 2947, 2554, 2456, 2444, 2527, 2501, 2507, 2498, 2501, 2498, 2507, 2444, 2506, 2509, 2501, 2496, 2505, 2504, 2868, 2832, 2826, 2826, 2832, 2839, 2846, 2905, 2863, 2893, 2905, 2838, 2828, 2829, 2825, 2828, 2829, 2905, 2826, 2829, 2827, 2844, 2840, 2836, 2826, 2903, 2991, 2955, 2961, 2961, 2955, 2956, 2949, 3010, 2996, 3030, 3010, 2957, 2967, 2966, 2962, 2967, 2966, 3010, 2948, 2955, 2958, 2951, 3020, 1720, 1754, 1742, 1693, 1671, 1673, 1664, 1671, 1664, 1673, 1742, 1672, 1679, 1671, 1666, 1675, 1674};
    public GetJarEntryDataRequest A;
    public Boolean B;
    public OutputJarSignatureRequestImpl C;
    public boolean D;
    public boolean E;
    public OutputApkSigningBlockRequestImpl F;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final List i;
    public final SignerConfig j;
    public final SigningCertificateLineage k;
    public final boolean l;
    public final int m;
    public final SigningCertificateLineage n;
    public DigestAlgorithm r;
    public boolean s;
    public boolean t;
    public GetJarEntryDataRequest z;
    public List o = C0037.m3866();
    public List p = C0037.m3866();
    public List q = C0037.m3866();
    public Set u = C0019.m1184();
    public final HashMap v = new HashMap();
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public RunnablesExecutor G = C0072.m6189();

    public static class Builder {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f27short = {2075, 2052, 2074, 2058, 2050, 2155, 2116, 2126, 2136, 2117, 2115, 2126, 2051, 1129, 1116, 1032, 1092, 1101, 1097, 1115, 1116, 1032, 1095, 1094, 1101, 1032, 1115, 1089, 1103, 1094, 1101, 1114, 1032, 1099, 1095, 1094, 1102, 1089, 1103, 1032, 1093, 1117, 1115, 1116, 1032, 1098, 1101, 1032, 1112, 1114, 1095, 1118, 1089, 1100, 1101, 1100, 599, 608, 636, 633, 625, 624, 615, 565, 630, 634, 635, 627, 636, 626, 608, 615, 624, 625, 565, 609, 634, 565, 631, 634, 609, 637, 565, 624, 635, 628, 631, 633, 624, 565, 628, 635, 625, 565, 625, 636, 614, 628, 631, 633, 624, 565, 596, 581, 606, 565, 582, 636, 626, 635, 628, 609, 608, 615, 624, 565, 582, 630, 637, 624, 632, 624, 565, 611, 550, 565, 614, 636, 626, 635, 636, 635, 626, 1157, 1209, 1204, 1265, 1187, 1214, 1189, 1200, 1189, 1208, 1214, 1215, 1276, 1212, 1208, 1215, 1276, 1186, 1205, 1210, 1276, 1191, 1204, 1187, 1186, 1208, 1214, 1215, 1277, 1265, 472, 468, 409, 385, 391, 384, 468, 406, 401, 468, 408, 401, 391, 391, 468, 384, 412, 405, 410, 468, 384, 412, 401, 468, 402, 413, 390, 391, 384, 468, 384, 405, 390, 403, 401, 384, 401, 400, 468, 423, 432, 447, 468, 386, 401, 390, 391, 413, 411, 410, 472, 468, 2816, 2850, 2879, 2854, 2873, 2868, 2869, 2868, 2928, 2851, 2873, 2871, 2878, 2869, 2850, 2928, 2867, 2879, 2878, 2870, 2873, 2871, 2851, 2928, 2868, 2879, 2928, 2878, 2879, 2852, 2928, 2877, 2865, 2852, 2867, 2872, 2928, 2852, 2872, 2869, 2928, 2848, 2850, 2879, 2854, 2873, 2868, 2869, 2868, 2928, 2819, 2873, 2871, 2878, 2873, 2878, 2871, 2835, 2869, 2850, 2852, 2873, 2870, 2873, 2867, 2865, 2852, 2869, 2844, 2873, 2878, 2869, 2865, 2871, 2869, 935, 924, 915, 912, 926, 919, 978, 902, 925, 978, 913, 896, 919, 915, 902, 919, 978, 915, 978, 929, 923, 917, 924, 919, 896, 945, 925, 924, 916, 923, 917, 978, 916, 925, 896, 978, 897, 923, 917, 924, 919, 896, 978, 916, 896, 925, 927, 978, 913, 919, 896, 902, 923, 916, 923, 913, 915, 902, 919, 978, 534, 554, 551, 610, 562, 560, 557, 564, 555, 550, 551, 550, 610, 558, 555, 556, 551, 547, 549, 551, 610, 566, 547, 560, 549, 551, 566, 555, 556, 549, 610, 529, 518, 521, 610, 2020, 1965, 1975, 2020, 1962, 1963, 1968, 2020, 1965, 1962, 2020, 1968, 1964, 1953, 2020, 1975, 1965, 1955, 1962, 1965, 1962, 1955, 2020, 1964, 1965, 1975, 1968, 1963, 1974, 1981, 2020, 1963, 1954, 2020, 1968, 1964, 1953, 2020, 1963, 1968, 1964, 1953, 1974, 2020, 1968, 1957, 1974, 1955, 1953, 1968, 1953, 1952, 2020, 1975, 1965, 1955, 1962, 1965, 1962, 1955, 2020, 1959, 1963, 1962, 1954, 1965, 1955, 1975, 1310, 1318, 1343, 1319, 1338, 1315, 1343, 1334, 1395, 1280, 1338, 1332, 1341, 1334, 1313, 1296, 1340, 1341, 1333, 1338, 1332, 1312, 1395, 1316, 1334, 1313, 1334, 1395, 1333, 1340, 1318, 1341, 1335, 1395, 1319, 1330, 1313, 1332, 1334, 1319, 1338, 1341, 1332, 1395, 1280, 1303, 1304, 1395, 1317, 1334, 1313, 1312, 1338, 1340, 1341, 1395, 3081, 3132, 3119, 3130, 3128, 3113, 3128, 3129, 3197, 3118, 3124, 3130, 3123, 3124, 3123, 3130, 3197, 3134, 3122, 3123, 3131, 3124, 3130, 3197, 3124, 3118, 3197, 3123, 3122, 3113, 3197, 3118, 3112, 3117, 3117, 3122, 3119, 3113, 3128, 3129, 3197, 3117, 3119, 3124, 3122, 3119, 3197, 3113, 3122, 3197, 3086, 3097, 3094, 3197, 3115, 3128, 3119, 3118, 3124, 3122, 3123, 3197, 3183, 3173, 3174, 3197, 3119, 3128, 3134, 3128, 3124, 3115, 3128, 3129, 3197, 3115, 3132, 3121, 3112, 3128, 3197, 3129, 3099, 3078, 3103, 3072, 3085, 3084, 3085, 3145, 3076, 3100, 3077, 3101, 3072, 3097, 3077, 3084, 3145, 3098, 3072, 3086, 3079, 3084, 3099, 3098, 3145, 3102, 3073, 3072, 3082, 3073, 3145, 3080, 3099, 3084, 3145, 3097, 3080, 3099, 3101, 3145, 3078, 3087, 3145, 3101, 3073, 3084, 3145, 3130, 3072, 3086, 3079, 3072, 3079, 3086, 3114, 3084, 3099, 3101, 3072, 3087, 3072, 3082, 3080, 3101, 3084, 3109, 3072, 3079, 3084, 3080, 3086, 3084, 3141, 3145, 3083, 3100, 3101, 3145, 3079, 3078, 3101, 3145, 3098, 3072, 3086, 3079, 3072, 3079, 3086, 3145, 3102, 3072, 3101, 3073, 3145, 3112, 3129, 3106, 3145, 3130, 3072, 3086, 3079, 3080, 3101, 3100, 3099, 3084, 3145, 3130, 3082, 3073, 3084, 3076, 3084, 3145, 3103, 3162, 604, 612, 637, 613, 632, 609, 637, 628, 561, 610, 632, 630, 639, 632, 639, 630, 561, 626, 628, 611, 613, 632, 631, 632, 626, 624, 613, 628, 610, 561, 609, 611, 638, 615, 632, 629, 628, 629, 561, 631, 638, 611, 561, 612, 610, 628, 561, 614, 632, 613, 633, 561, 592, 577, 602, 561, 578, 632, 630, 639, 624, 613, 612, 611, 628, 561, 578, 626, 633, 628, 636, 628, 561, 615, 546, 561, 614, 632, 613, 633, 638, 612, 613, 561, 624, 639, 561, 624, 626, 626, 638, 636, 609, 624, 639, 616, 632, 639, 630, 561, 578, 632, 630, 639, 632, 639, 630, 594, 628, 611, 613, 632, 631, 632, 626, 624, 613, 628, 605, 632, 639, 628, 624, 630, 628};
        public List a;
        public List b;
        public SignerConfig c;
        public SigningCertificateLineage d;
        public final int f;
        public boolean i;
        public boolean n;
        public SigningCertificateLineage p;
        public boolean e = true;
        public boolean g = true;
        public boolean h = true;
        public int j = 33;
        public boolean k = false;
        public boolean l = false;
        public boolean m = true;
        public String o = C0063.m4315(m548(), 0, 13, 2090);
        public boolean q = false;
        public boolean r = false;

        /* JADX INFO: renamed from: ۟ۦ۠ۦۡ, reason: not valid java name and contains not printable characters */
        public static short[] m548() {
            if (C0034.m3450() >= 0) {
                return f27short;
            }
            return null;
        }

        public DefaultApkSignerEngine build() {
            int iM2776;
            boolean zM5712 = C0069.m5712(this);
            if (zM5712 && C0070.m5919(this)) {
                throw new IllegalStateException(C0039.m4066(m548(), 56, 77, 533));
            }
            if (zM5712) {
                this.i = false;
            } else if (C0070.m5919(this)) {
                this.i = true;
            }
            C0031.m3093(C0027.m2482(this), new C0455v(1));
            this.b = new ArrayList();
            int i = 0;
            while (true) {
                if (i >= C0034.m3427(C0027.m2482(this))) {
                    break;
                }
                if (C0029.m2776((SignerConfig) C0071.m6078(C0027.m2482(this), i)) > 0) {
                    List listM2482 = C0027.m2482(this);
                    this.b = C0033.m3308(listM2482, i, C0034.m3427(listM2482));
                    this.a = C0033.m3308(C0027.m2482(this), 0, i);
                    break;
                }
                i++;
            }
            if (C0025.m2221(this) != null) {
                if (!C0025.m2084(C0064.m4515(this)) && C0065.m4705(this) >= (iM2776 = C0029.m2776((SignerConfig) C0071.m6078(C0064.m4515(this), 0)))) {
                    StringBuilder sb = new StringBuilder(C0038.m4022(m548(), 133, 30, 1233));
                    C0021.m1551(sb, C0065.m4705(this));
                    C0077.m7290(sb, C0025.m2151(m548(), 163, 52, 500));
                    C0021.m1551(sb, iM2776);
                    throw new IllegalStateException(C0068.m5536(sb));
                }
                try {
                    List listM2627 = C0028.m2627(C0025.m2221(this), C0027.m2482(this));
                    this.a = listM2627;
                    SignerConfig signerConfig = (SignerConfig) C0037.m3901(listM2627, C0034.m3427(listM2627) - 1);
                    SignerConfig.Builder builder = new SignerConfig.Builder(C0111.m13053(signerConfig), C0065.m4779(signerConfig), (List<X509Certificate>) C0111.m13081(signerConfig), C0036.m3748(signerConfig));
                    C0019.m1270(builder, C0025.m2221(this), C0065.m4705(this));
                    C0030.m2966(builder, C0065.m4711(this));
                    C0017.m930(C0064.m4515(this), 0, C0024.m2037(builder));
                } catch (IllegalArgumentException e) {
                    throw new IllegalStateException(C0021.m1650(m548(), 215, 75, 2896), e);
                }
            }
            Iterator itM4732 = C0065.m4732(C0064.m4515(this));
            SigningCertificateLineage signingCertificateLineageM1792 = null;
            int i2 = 0;
            while (C0036.m3657(itM4732)) {
                SignerConfig signerConfig2 = (SignerConfig) C0071.m6012(itM4732);
                int iM27762 = C0029.m2776(signerConfig2);
                if (iM27762 < 28) {
                    throw new IllegalStateException(C0071.m6038(iM27762, C0068.m5544(m548(), 509, 81, 3165)));
                }
                SigningCertificateLineage signingCertificateLineageM1324 = C0020.m1324(signerConfig2);
                if (signingCertificateLineageM1324 == null) {
                    try {
                        signingCertificateLineageM1324 = C0034.m3397(new SigningCertificateLineage.Builder(C0068.m5674(new SigningCertificateLineage.SignerConfig.Builder(C0017.m926(signerConfig2), (X509Certificate) C0071.m6078(C0074.m6529(signerConfig2), 0)))));
                    } catch (NoSuchAlgorithmException | SignatureException | CertificateEncodingException unused) {
                        StringBuilder sb2 = new StringBuilder(C0019.m1189(m548(), 290, 60, PointerIconCompat.TYPE_ALIAS));
                        C0036.m3741(sb2, C0017.m906((X509Certificate) C0071.m6078(C0074.m6529(signerConfig2), 0)));
                        throw new IllegalStateException(C0068.m5536(sb2));
                    }
                }
                if (iM27762 < 33) {
                    iM27762 = 28;
                }
                if (iM27762 == i2) {
                    throw new IllegalStateException(C0071.m6038(iM27762, C0038.m4022(m548(), 453, 56, 1363)));
                }
                if (signingCertificateLineageM1792 == null) {
                    signingCertificateLineageM1792 = signingCertificateLineageM1324;
                } else {
                    try {
                        signingCertificateLineageM1792 = C0023.m1792(signingCertificateLineageM1792, signingCertificateLineageM1324);
                    } catch (IllegalArgumentException e2) {
                        throw new IllegalStateException(C0025.m2086(C0017.m936(m548(), 350, 35, 578), iM27762, C0035.m3603(m548(), 385, 68, 1988)), e2);
                    }
                }
                i2 = iM27762;
            }
            this.p = signingCertificateLineageM1792;
            if (signingCertificateLineageM1792 != null) {
                if (!C0074.m6533(this) && C0034.m3427(C0027.m2482(this)) > 1) {
                    throw new IllegalStateException(C0030.m2840(m548(), 590, 119, 3177));
                }
            } else if (C0074.m6533(this) && C0034.m3427(C0027.m2482(this)) > 1) {
                throw new IllegalStateException(C0016.m625(m548(), 709, 125, 529));
            }
            return new DefaultApkSignerEngine(C0027.m2482(this), C0064.m4515(this), C0019.m1198(this), C0035.m3532(this), C0027.m2414(this), C0068.m5604(this), C0111.m13087(this), C0024.m1985(this), C0074.m6533(this), C0068.m5679(this), C0066.m4888(this), C0065.m4712(this), C0069.m5720(this), C0025.m2221(this), null);
        }

        public Builder setDebuggableApkPermitted(boolean z) {
            this.m = z;
            return this;
        }

        public Builder setMinSdkVersionForRotation(int i) {
            if (i < 33) {
                this.j = 28;
            } else {
                this.j = i;
            }
            return this;
        }

        public Builder setOtherSignersSignaturesPreserved(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setRotationTargetsDevRelease(boolean z) {
            this.k = z;
            return this;
        }

        public Builder setSigningCertificateLineage(SigningCertificateLineage signingCertificateLineage) {
            if (signingCertificateLineage != null) {
                this.i = true;
                this.p = signingCertificateLineage;
            }
            return this;
        }

        public Builder setSourceStampSigningCertificateLineage(SigningCertificateLineage signingCertificateLineage) {
            this.d = signingCertificateLineage;
            return this;
        }

        public Builder setSourceStampTimestampEnabled(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setStampSignerConfig(SignerConfig signerConfig) {
            this.c = signerConfig;
            return this;
        }

        public Builder setV1SigningEnabled(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setV2SigningEnabled(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setV3SigningEnabled(boolean z) {
            this.i = z;
            if (z) {
                this.r = true;
            } else {
                this.q = true;
            }
            return this;
        }

        public Builder setVerityEnabled(boolean z) {
            this.l = z;
            return this;
        }

        public Builder(List<SignerConfig> list, int i) {
            this.i = true;
            if (!C0025.m2084(list)) {
                if (C0034.m3427(list) > 1) {
                    this.i = false;
                }
                this.a = new ArrayList(list);
                this.f = i;
                return;
            }
            throw new IllegalArgumentException(C0034.m3431(m548(), 13, 43, 1064));
        }

        public Builder setCreatedBy(String str) {
            C0030.m2951(str);
            this.o = str;
            return this;
        }
    }

    public static class CompoundInspectJarEntryRequest implements ApkSignerEngine.InspectJarEntryRequest {
        public final String a;
        public final ApkSignerEngine.InspectJarEntryRequest[] b;
        public final Object c = new Object();
        public TeeDataSink d;

        /* JADX INFO: renamed from: ۟ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
        public static ApkSignerEngine.InspectJarEntryRequest[] m549(Object obj) {
            if (C0065.m4647() > 0) {
                return ((CompoundInspectJarEntryRequest) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
        public static TeeDataSink m550(Object obj) {
            if (C0029.m2791() > 0) {
                return ((CompoundInspectJarEntryRequest) obj).d;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢۦ۠۟, reason: not valid java name and contains not printable characters */
        public static Object m551(Object obj) {
            if (C0074.m6454() <= 0) {
                return ((CompoundInspectJarEntryRequest) obj).c;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۡ۟ۢ, reason: not valid java name and contains not printable characters */
        public static String m552(Object obj) {
            if (C0074.m6454() <= 0) {
                return ((CompoundInspectJarEntryRequest) obj).a;
            }
            return null;
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public void done() {
            for (ApkSignerEngine.InspectJarEntryRequest inspectJarEntryRequest : m549(this)) {
                C0077.m7213(inspectJarEntryRequest);
            }
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public DataSink getDataSink() {
            TeeDataSink teeDataSinkM550;
            synchronized (m551(this)) {
                try {
                    if (m550(this) == null) {
                        int length = m549(this).length;
                        DataSink[] dataSinkArr = new DataSink[length];
                        for (int i = 0; i < length; i++) {
                            dataSinkArr[i] = C0037.m3859(m549(this)[i]);
                        }
                        this.d = new TeeDataSink(dataSinkArr);
                    }
                    teeDataSinkM550 = m550(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return teeDataSinkM550;
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public String getEntryName() {
            return m552(this);
        }

        public CompoundInspectJarEntryRequest(String str, ApkSignerEngine.InspectJarEntryRequest[] inspectJarEntryRequestArr, AnonymousClass1 anonymousClass1) {
            this.a = str;
            this.b = inspectJarEntryRequestArr;
        }
    }

    public static class GetJarEntryDataDigestRequest implements ApkSignerEngine.InspectJarEntryRequest {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f28short = {812, 781, 790, 834, 795, 775, 790, 834, 774, 781, 780, 775, 3074, 3119, 3121, 3110, 3106, 3111, 3130, 3171, 3111, 3116, 3117, 3110, 1302, 1403, 1363, 1349, 1349, 1367, 1361, 1363, 1394, 1375, 1361, 1363, 1349, 1346, 1302, 1368, 1369, 1346, 1302, 1367, 1344, 1367, 1375, 1370, 1367, 1364, 1370, 1363};
        public final String a;
        public final String b;
        public final Object c = new Object();
        public boolean d;
        public DataSink e;
        public MessageDigest f;
        public byte[] g;

        /* JADX INFO: renamed from: ۟۟ۤۦۦ, reason: not valid java name and contains not printable characters */
        public static boolean m553(Object obj) {
            if (C0028.m2593() > 0) {
                return ((GetJarEntryDataDigestRequest) obj).d;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
        public static Object m554(Object obj) {
            if (C0078.m7450() > 0) {
                return ((byte[]) obj).clone();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
        public static Object m555(Object obj) {
            if (C0071.m6069() >= 0) {
                return ((GetJarEntryDataDigestRequest) obj).c;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
        public static MessageDigest m556(Object obj) {
            if (C0017.m846() > 0) {
                return ((GetJarEntryDataDigestRequest) obj).f;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
        public static String m557(Object obj) {
            if (C0020.m1385() <= 0) {
                return ((GetJarEntryDataDigestRequest) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠۟ۤ۠, reason: not valid java name and contains not printable characters */
        public static byte[] m558(Object obj) {
            if (C0018.m1064() >= 0) {
                return ((GetJarEntryDataDigestRequest) obj).g;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡ۟۠ۢ, reason: not valid java name and contains not printable characters */
        public static String m559(Object obj) {
            if (C0017.m846() >= 0) {
                return ((GetJarEntryDataDigestRequest) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
        public static short[] m560() {
            if (C0020.m1385() < 0) {
                return f28short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢۦۡۨ, reason: not valid java name and contains not printable characters */
        public static MessageDigest m561(Object obj) {
            if (C0067.m5468() < 0) {
                return ((GetJarEntryDataDigestRequest) obj).b();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۧۤۢ, reason: contains not printable characters */
        public static void m562(Object obj) {
            if (C0031.m3075() > 0) {
                ((GetJarEntryDataDigestRequest) obj).a();
            }
        }

        /* JADX INFO: renamed from: ۨۨ۠ۢ, reason: not valid java name and contains not printable characters */
        public static DataSink m563(Object obj) {
            if (C0016.m717() <= 0) {
                return ((GetJarEntryDataDigestRequest) obj).e;
            }
            return null;
        }

        public static boolean access$500(GetJarEntryDataDigestRequest getJarEntryDataDigestRequest) {
            boolean zM553;
            synchronized (m555(getJarEntryDataDigestRequest)) {
                zM553 = m553(getJarEntryDataDigestRequest);
            }
            return zM553;
        }

        public static byte[] access$600(GetJarEntryDataDigestRequest getJarEntryDataDigestRequest) {
            byte[] bArr;
            synchronized (m555(getJarEntryDataDigestRequest)) {
                try {
                    if (!m553(getJarEntryDataDigestRequest)) {
                        throw new IllegalStateException(C0035.m3603(m560(), 0, 12, 866));
                    }
                    bArr = (byte[]) m554(m558(getJarEntryDataDigestRequest));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bArr;
        }

        public final void a() {
            synchronized (m555(this)) {
                try {
                    if (m553(this)) {
                        throw new IllegalStateException(C0016.m625(m560(), 12, 12, 3139));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final MessageDigest b() {
            MessageDigest messageDigestM556;
            synchronized (m555(this)) {
                if (m556(this) == null) {
                    try {
                        this.f = C0030.m2835(m559(this));
                    } catch (NoSuchAlgorithmException e) {
                        StringBuilder sb = new StringBuilder();
                        C0077.m7290(sb, m559(this));
                        C0077.m7290(sb, C0031.m3047(m560(), 24, 28, 1334));
                        throw new RuntimeException(C0068.m5536(sb), e);
                    }
                }
                messageDigestM556 = m556(this);
            }
            return messageDigestM556;
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public void done() {
            synchronized (m555(this)) {
                try {
                    if (m553(this)) {
                        return;
                    }
                    this.d = true;
                    this.g = C0033.m3355(m561(this));
                    this.f = null;
                    this.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public DataSink getDataSink() {
            DataSink dataSinkM563;
            synchronized (m555(this)) {
                try {
                    m562(this);
                    if (m563(this) == null) {
                        this.e = C0027.m2416(new MessageDigest[]{m561(this)});
                    }
                    dataSinkM563 = m563(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dataSinkM563;
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public String getEntryName() {
            return m557(this);
        }

        public GetJarEntryDataDigestRequest(String str, String str2, AnonymousClass1 anonymousClass1) {
            this.a = str;
            this.b = str2;
        }
    }

    public static class GetJarEntryDataRequest implements ApkSignerEngine.InspectJarEntryRequest {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f29short = {526, 559, 564, 608, 569, 549, 564, 608, 548, 559, 558, 549, 1238, 1275, 1253, 1266, 1270, 1267, 1262, 1207, 1267, 1272, 1273, 1266};
        public final String a;
        public final Object b = new Object();
        public boolean c;
        public DataSink d;
        public ByteArrayOutputStream e;

        /* JADX INFO: renamed from: ۟۟ۦۨۤ, reason: not valid java name and contains not printable characters */
        public static String m564(Object obj) {
            if (C0069.m5781() <= 0) {
                return ((GetJarEntryDataRequest) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۡۨۡۦ, reason: not valid java name and contains not printable characters */
        public static boolean m565(Object obj) {
            if (C0024.m2011() < 0) {
                return ((GetJarEntryDataRequest) obj).c;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۣۣ۟ۥۥ, reason: not valid java name and contains not printable characters */
        public static Object m566(Object obj) {
            if (C0028.m2593() >= 0) {
                return ((GetJarEntryDataRequest) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
        public static ByteArrayOutputStream m567(Object obj) {
            if (C0025.m2132() > 0) {
                return ((GetJarEntryDataRequest) obj).e;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۨۢۦ, reason: not valid java name and contains not printable characters */
        public static void m568(Object obj) {
            if (C0016.m717() <= 0) {
                ((GetJarEntryDataRequest) obj).a();
            }
        }

        /* JADX INFO: renamed from: ۡ۠ۢۨ, reason: not valid java name and contains not printable characters */
        public static DataSink m569(Object obj) {
            if (C0038.m4010() >= 0) {
                return ((GetJarEntryDataRequest) obj).d;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۢۧ۠, reason: contains not printable characters */
        public static short[] m570() {
            if (C0067.m5468() <= 0) {
                return f29short;
            }
            return null;
        }

        public static boolean access$400(GetJarEntryDataRequest getJarEntryDataRequest) {
            boolean zM565;
            synchronized (m566(getJarEntryDataRequest)) {
                zM565 = m565(getJarEntryDataRequest);
            }
            return zM565;
        }

        public static byte[] access$700(GetJarEntryDataRequest getJarEntryDataRequest) {
            byte[] bArrM7297;
            synchronized (m566(getJarEntryDataRequest)) {
                try {
                    if (!m565(getJarEntryDataRequest)) {
                        throw new IllegalStateException(C0024.m1945(m570(), 0, 12, 576));
                    }
                    ByteArrayOutputStream byteArrayOutputStreamM567 = m567(getJarEntryDataRequest);
                    bArrM7297 = byteArrayOutputStreamM567 != null ? C0077.m7297(byteArrayOutputStreamM567) : new byte[0];
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bArrM7297;
        }

        public final void a() {
            synchronized (m566(this)) {
                try {
                    if (m565(this)) {
                        throw new IllegalStateException(C0072.m6116(m570(), 12, 12, 1175));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public void done() {
            synchronized (m566(this)) {
                try {
                    if (m565(this)) {
                        return;
                    }
                    this.c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public DataSink getDataSink() {
            DataSink dataSinkM569;
            synchronized (m566(this)) {
                try {
                    m568(this);
                    if (m567(this) == null) {
                        this.e = new ByteArrayOutputStream();
                    }
                    if (m569(this) == null) {
                        this.d = C0064.m4623(m567(this));
                    }
                    dataSinkM569 = m569(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dataSinkM569;
        }

        @Override // com.android.apksig.ApkSignerEngine.InspectJarEntryRequest
        public String getEntryName() {
            return m564(this);
        }

        public GetJarEntryDataRequest(String str, AnonymousClass1 anonymousClass1) {
            this.a = str;
        }
    }

    public static class OutputApkSigningBlockRequestImpl implements ApkSignerEngine.OutputApkSigningBlockRequest, ApkSignerEngine.OutputApkSigningBlockRequest2 {
        public final byte[] a;
        public final int b;
        public volatile boolean c;

        /* JADX INFO: renamed from: ۟ۦ۠ۤ۟, reason: not valid java name and contains not printable characters */
        public static boolean m571(Object obj) {
            if (C0032.m3184() < 0) {
                return ((OutputApkSigningBlockRequestImpl) obj).c;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۢ۟۠ۡ, reason: not valid java name and contains not printable characters */
        public static int m572(Object obj) {
            if (C0037.m3837() <= 0) {
                return ((OutputApkSigningBlockRequestImpl) obj).b;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
        public static byte[] m573(Object obj) {
            if (C0038.m4010() > 0) {
                return ((OutputApkSigningBlockRequestImpl) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
        public static Object m574(Object obj) {
            if (C0019.m1311() == 0) {
                return ((byte[]) obj).clone();
            }
            return null;
        }

        @Override // com.android.apksig.ApkSignerEngine.OutputApkSigningBlockRequest, com.android.apksig.ApkSignerEngine.OutputApkSigningBlockRequest2
        public void done() {
            this.c = true;
        }

        @Override // com.android.apksig.ApkSignerEngine.OutputApkSigningBlockRequest, com.android.apksig.ApkSignerEngine.OutputApkSigningBlockRequest2
        public byte[] getApkSigningBlock() {
            return (byte[]) m574(m573(this));
        }

        @Override // com.android.apksig.ApkSignerEngine.OutputApkSigningBlockRequest2
        public int getPaddingSizeBeforeApkSigningBlock() {
            return m572(this);
        }

        public OutputApkSigningBlockRequestImpl(byte[] bArr, int i, AnonymousClass1 anonymousClass1) {
            this.a = (byte[]) m574(bArr);
            this.b = i;
        }
    }

    public static class OutputJarSignatureRequestImpl implements ApkSignerEngine.OutputJarSignatureRequest {
        public final List a;
        public volatile boolean b;

        /* JADX INFO: renamed from: ۟۠ۥ۠۟, reason: not valid java name and contains not printable characters */
        public static boolean m575(Object obj) {
            if (C0025.m2132() > 0) {
                return ((OutputJarSignatureRequestImpl) obj).b;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۟ۧۢۨۡ, reason: not valid java name and contains not printable characters */
        public static List m576(Object obj) {
            if (C0038.m4010() >= 0) {
                return DesugarCollections.unmodifiableList((List) obj);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
        public static List m577(Object obj) {
            if (C0031.m3075() > 0) {
                return ((OutputJarSignatureRequestImpl) obj).a;
            }
            return null;
        }

        @Override // com.android.apksig.ApkSignerEngine.OutputJarSignatureRequest
        public void done() {
            this.b = true;
        }

        @Override // com.android.apksig.ApkSignerEngine.OutputJarSignatureRequest
        public List<ApkSignerEngine.OutputJarSignatureRequest.JarEntry> getAdditionalJarEntries() {
            return m577(this);
        }

        public OutputJarSignatureRequestImpl(List list, AnonymousClass1 anonymousClass1) {
            this.a = m576(new ArrayList(list));
        }
    }

    public static class SignerConfig {
        public final String a;
        public final KeyConfig b;
        public final List c;
        public final boolean d;
        public final int e;
        public final boolean f;
        public final SigningCertificateLineage g;

        public static class Builder {

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f30short = {2857, 2817, 2844, 2840, 2837, 2892, 2818, 2829, 2817, 2825, 1779, 1755, 1734, 1730, 1743, 1686, 1752, 1751, 1755, 1747, 1684, 1705, 1714, 1703, 1714, 1711, 1705, 1704, 1766, 1701, 1703, 1704, 1766, 1705, 1704, 1706, 1727, 1766, 1714, 1703, 1716, 1697, 1699, 1714, 1766, 1703, 1766, 1698, 1699, 1712, 1699, 1706, 1705, 1718, 1707, 1699, 1704, 1714, 1766, 1716, 1699, 1706, 1699, 1703, 1717, 1699, 1766, 1696, 1705, 1716, 1766, 1717, 1711, 1697, 1704, 1699, 1716, 1717, 1766, 1714, 1703, 1716, 1697, 1699, 1714, 1711, 1704, 1697, 1766, 1781, 1781, 1766, 1705, 1716, 1766, 1706, 1703, 1714, 1699, 1716, 1902, 1874, 1887, 1818, 1866, 1864, 1877, 1868, 1875, 1886, 1887, 1886, 1818, 1878, 1875, 1876, 1887, 1883, 1885, 1887, 1818, 1886, 1877, 1887, 1865, 1818, 1876, 1877, 1870, 1818, 1881, 1877, 1876, 1870, 1883, 1875, 1876, 1818, 1870, 1874, 1887, 1818, 1865, 1875, 1885, 1876, 1875, 1876, 1885, 1818, 1881, 1887, 1864, 1870, 1875, 1884, 1875, 1881, 1883, 1870, 1887, 1814, 1818, 1513, 1509, 1443, 1450, 1463, 1509, 1457, 1453, 1452, 1462, 1509, 1430, 1452, 1442, 1451, 1440, 1463, 1414, 1450, 1451, 1443, 1452, 1442, 1105, 1094, 1097, 1058, 1142, 1123, 1136, 1125, 1127, 1142, 1127, 1126, 1058, 1137, 1131, 1125, 1132, 1131, 1132, 1125, 1058, 1121, 1133, 1132, 1124, 1131, 1125, 1058, 1131, 1137, 1058, 1133, 1132, 1134, 1147, 1058, 1137, 1143, 1138, 1138, 1133, 1136, 1142, 1127, 1126, 1058, 1141, 1131, 1142, 1130, 1058, 1142, 1130, 1127, 1058, 1108, 1073, 1058, 1137, 1131, 1125, 1132, 1123, 1142, 1143, 1136, 1127, 1058, 1137, 1121, 1130, 1127, 1135, 1127, 1058, 1133, 1132, 1058, 1091, 1132, 1126, 1136, 1133, 1131, 1126, 1058, 1106, 1058, 1066, 1105, 1094, 1097, 1058, 1140, 1127, 1136, 1137, 1131, 1133, 1132, 1058, 1072, 1082, 1067, 1058, 1123, 1132, 1126, 1058, 1134, 1123, 1142, 1127, 1136};
            public final String a;
            public final KeyConfig b;
            public final ArrayList c;
            public final boolean d;
            public int e;
            public boolean f;
            public SigningCertificateLineage g;

            @Deprecated
            public Builder(String str, PrivateKey privateKey, List<X509Certificate> list) {
                this(str, privateKey, list, false);
            }

            /* JADX INFO: renamed from: ۨ۟ۤۢ, reason: not valid java name and contains not printable characters */
            public static short[] m579() {
                if (C0111.m13165() < 0) {
                    return f30short;
                }
                return null;
            }

            public Builder setMinSdkVersion(int i) {
                return C0019.m1270(this, null, i);
            }

            @Deprecated
            public Builder(String str, PrivateKey privateKey, List<X509Certificate> list, boolean z) {
                if (C0077.m7292(str)) {
                    throw new IllegalArgumentException(C0030.m2840(m579(), 10, 10, 1718));
                }
                this.a = str;
                this.b = new KeyConfig.Jca(privateKey);
                this.c = new ArrayList(list);
                this.d = z;
            }

            public static Builder access$2000(Builder builder, boolean z) {
                if (z && C0036.m3733(builder) < 33) {
                    throw new IllegalArgumentException(C0027.m2404(m579(), 20, 80, 1734));
                }
                builder.f = z;
                return builder;
            }

            public SignerConfig build() {
                return new SignerConfig(this, null);
            }

            public Builder setLineageForMinSdkVersion(SigningCertificateLineage signingCertificateLineage, int i) {
                int i2 = i;
                if (i2 < 28) {
                    throw new IllegalArgumentException(C0036.m3678(m579(), 186, 114, 1026));
                }
                if (i2 < 33) {
                    i2 = 28;
                }
                this.e = i2;
                if (signingCertificateLineage != null) {
                    ArrayList arrayListM953 = C0017.m953(this);
                    if (!C0022.m1653(signingCertificateLineage, (X509Certificate) C0064.m4526(arrayListM953, 0))) {
                        StringBuilder sb = new StringBuilder(C0076.m6902(m579(), 100, 63, 1850));
                        C0036.m3741(sb, C0017.m906((X509Certificate) C0064.m4526(arrayListM953, 0)));
                        C0077.m7290(sb, C0069.m5807(m579(), 163, 23, 1477));
                        throw new IllegalArgumentException(C0068.m5536(sb));
                    }
                }
                this.g = signingCertificateLineage;
                return this;
            }

            public Builder(String str, KeyConfig keyConfig, List<X509Certificate> list) {
                this(str, keyConfig, list, false);
            }

            public Builder(String str, KeyConfig keyConfig, List<X509Certificate> list, boolean z) {
                if (!C0077.m7292(str)) {
                    this.a = str;
                    this.b = keyConfig;
                    this.c = new ArrayList(list);
                    this.d = z;
                    return;
                }
                throw new IllegalArgumentException(C0027.m2404(m579(), 0, 10, 2924));
            }
        }

        /* JADX INFO: renamed from: ۡۥۨۥ, reason: not valid java name and contains not printable characters */
        public static List m578(Object obj) {
            if (C0071.m6069() >= 0) {
                return DesugarCollections.unmodifiableList((List) obj);
            }
            return null;
        }

        public List<X509Certificate> getCertificates() {
            return C0032.m3215(this);
        }

        public boolean getDeterministicDsaSigning() {
            return C0024.m1963(this);
        }

        public KeyConfig getKeyConfig() {
            return C0028.m2635(this);
        }

        public int getMinSdkVersion() {
            return C0031.m3077(this);
        }

        public String getName() {
            return C0078.m7384(this);
        }

        @Deprecated
        public PrivateKey getPrivateKey() {
            return (PrivateKey) C0036.m3647(C0028.m2635(this), new r(3), new r(1));
        }

        public boolean getSignerTargetsDevRelease() {
            return C0066.m4834(this);
        }

        public SigningCertificateLineage getSigningCertificateLineage() {
            return C0068.m5571(this);
        }

        public SignerConfig(Builder builder, AnonymousClass1 anonymousClass1) {
            this.a = C0033.m3360(builder);
            this.b = C0111.m13026(builder);
            this.c = m578(new ArrayList(C0065.m4715(builder)));
            this.d = C0038.m3959(builder);
            this.e = C0025.m2143(builder);
            this.f = C0077.m7219(builder);
            this.g = C0068.m5670(builder);
        }
    }

    public DefaultApkSignerEngine(List list, List list2, SignerConfig signerConfig, SigningCertificateLineage signingCertificateLineage, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, SigningCertificateLineage signingCertificateLineage2, AnonymousClass1 anonymousClass1) {
        if (C0025.m2084(list) && C0025.m2084(list2)) {
            throw new IllegalArgumentException(C0064.m4545(m535(), 0, 43, 2716));
        }
        this.a = z2;
        this.b = z3;
        this.c = z4;
        this.d = z5;
        this.t = z2;
        this.D = z3;
        this.E = z4;
        this.e = z6;
        this.f = z7;
        this.g = str;
        this.h = list;
        this.i = list2;
        this.j = signerConfig;
        this.k = signingCertificateLineage;
        this.l = z;
        this.m = i;
        this.n = signingCertificateLineage2;
        if (z2) {
            if (!z4) {
                C0064.m4521(this, list, i);
                return;
            }
            SignerConfig signerConfig2 = !C0025.m2084(list) ? (SignerConfig) C0071.m6078(list, 0) : (SignerConfig) C0071.m6078(list2, 0);
            if (signingCertificateLineage2 != null && C0068.m5602(C0026.m2275(signingCertificateLineage2, (X509Certificate) C0071.m6078(C0074.m6529(signerConfig2), 0))) != 1) {
                throw new IllegalArgumentException(C0032.m3209(m535(), 43, 140, 2193));
            }
            C0064.m4521(this, C0111.m13086(signerConfig2), i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static OutputApkSigningBlockRequestImpl m533(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        if (C0033.m3358() < 0) {
            return ((DefaultApkSignerEngine) obj).i((DataSource) obj2, (DataSource) obj3, (DataSource) obj4, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static IntStream m534(Object obj, Object obj2) {
        if (C0025.m2132() >= 0) {
            return ((Stream) obj).mapToInt((ToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m535() {
        if (C0032.m3184() <= 0) {
            return f26short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m536(Object obj) {
        if (C0016.m717() <= 0) {
            return ((GetJarEntryDataRequest) obj).getEntryName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m537(Object obj) {
        if (C0070.m5903() > 0) {
            return OutputJarSignatureRequestImpl.m575((OutputJarSignatureRequestImpl) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m538(Object obj) {
        if (C0068.m5678() > 0) {
            return OutputApkSigningBlockRequestImpl.m571((OutputApkSigningBlockRequestImpl) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static int m539(Object obj, int i) {
        if (C0076.m6903() < 0) {
            return ((OptionalInt) obj).orElse(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m540(Object obj) {
        if (C0037.m3837() <= 0) {
            return ((IntStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m541(Object obj) {
        if (C0067.m5468() <= 0) {
            return GetJarEntryDataDigestRequest.access$600((GetJarEntryDataDigestRequest) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۣ, reason: contains not printable characters */
    public static boolean m542(Object obj) {
        if (C0018.m1064() > 0) {
            return GetJarEntryDataRequest.access$400((GetJarEntryDataRequest) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۦ, reason: contains not printable characters */
    public static boolean m543(Object obj) {
        if (C0067.m5468() <= 0) {
            return GetJarEntryDataDigestRequest.access$500((GetJarEntryDataDigestRequest) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۤۧ, reason: not valid java name and contains not printable characters */
    public static int[] m544() {
        if (C0038.m4010() > 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠۠, reason: not valid java name and contains not printable characters */
    public static byte[] m545(Object obj) {
        if (C0063.m4427() > 0) {
            return GetJarEntryDataRequest.access$700((GetJarEntryDataRequest) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m546(Object obj) {
        if (C0026.m2298() < 0) {
            return ((GetJarEntryDataDigestRequest) obj).getEntryName();
        }
        return null;
    }

    @Override // com.android.apksig.ApkSignerEngine, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.s = true;
        this.C = null;
        this.z = null;
        this.A = null;
        this.B = null;
        C0067.m5425(C0026.m2248(this));
        C0067.m5425(C0018.m991(this));
        C0067.m5425(C0075.m6807(this));
        C0067.m5425(C0064.m4504(this));
        this.F = null;
    }

    @Override // com.android.apksig.ApkSignerEngine
    public ApkSignerEngine.InspectJarEntryRequest outputJarEntry(String str) {
        GetJarEntryDataRequest getJarEntryDataRequest;
        C0111.m13130(this);
        boolean zM6128 = C0072.m6128(this);
        if (zM6128) {
            this.D = true;
            this.F = null;
        }
        if (!C0111.m13181(this, str)) {
            this.B = null;
        }
        boolean zM2586 = C0028.m2586(this);
        if (!zM2586) {
            if (C0111.m13181(this, str)) {
                return null;
            }
            GetJarEntryDataRequest getJarEntryDataRequest2 = new GetJarEntryDataRequest(str, null);
            this.A = getJarEntryDataRequest2;
            return getJarEntryDataRequest2;
        }
        if (C0033.m3309(str)) {
            if (zM2586) {
                this.t = true;
            }
            if (zM6128) {
                this.D = true;
                this.F = null;
            }
            GetJarEntryDataDigestRequest getJarEntryDataDigestRequest = new GetJarEntryDataDigestRequest(str, C0074.m6523(C0023.m1903(this)), null);
            C0038.m3969(C0026.m2248(this), str, getJarEntryDataDigestRequest);
            C0069.m5761(C0018.m991(this), str);
            if (C0027.m2393(this) || !C0070.m5838(C0030.m2840(m535(), 2366, 19, 2802), str)) {
                return getJarEntryDataDigestRequest;
            }
            GetJarEntryDataRequest getJarEntryDataRequest3 = new GetJarEntryDataRequest(str, null);
            this.A = getJarEntryDataRequest3;
            return new CompoundInspectJarEntryRequest(str, new ApkSignerEngine.InspectJarEntryRequest[]{getJarEntryDataRequest3, getJarEntryDataDigestRequest}, null);
        }
        if (!C0063.m4345(C0111.m13161(this), str)) {
            return null;
        }
        if (zM2586) {
            this.t = true;
        }
        if (zM6128) {
            this.D = true;
            this.F = null;
        }
        if (C0070.m5838(C0030.m2840(m535(), 2385, 20, 3013), str)) {
            getJarEntryDataRequest = new GetJarEntryDataRequest(str, null);
            this.z = getJarEntryDataRequest;
        } else {
            getJarEntryDataRequest = C0111.m13072(C0075.m6807(this), str) ? new GetJarEntryDataRequest(str, null) : null;
        }
        if (getJarEntryDataRequest != null) {
            C0038.m3969(C0064.m4504(this), str, getJarEntryDataRequest);
        }
        return getJarEntryDataRequest;
    }

    @Override // com.android.apksig.ApkSignerEngine
    @Deprecated
    public ApkSignerEngine.OutputApkSigningBlockRequest outputZipSections(DataSource dataSource, DataSource dataSource2, DataSource dataSource3) {
        return m533(this, dataSource, dataSource2, dataSource3, false);
    }

    @Override // com.android.apksig.ApkSignerEngine
    public ApkSignerEngine.OutputApkSigningBlockRequest2 outputZipSections2(DataSource dataSource, DataSource dataSource2, DataSource dataSource3) {
        return m533(this, dataSource, dataSource2, dataSource3, true);
    }

    /* JADX INFO: renamed from: com.android.apksig.DefaultApkSignerEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;

        /* JADX INFO: renamed from: ۣ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
        public static int[] m547() {
            if (C0032.m3184() < 0) {
                return $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0033.m3255().length];
            $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy = iArr;
            try {
                iArr[C0030.m2893(C0023.m1821())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m547()[C0030.m2893(C0026.m2358())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m547()[C0030.m2893(C0016.m619())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashSet hashSet = new HashSet(3);
        H = hashSet;
        C0077.m7232(hashSet, C0021.m1548(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID));
        C0077.m7232(hashSet, C0021.m1548(722016414));
        C0077.m7232(hashSet, C0021.m1548(1845461005));
    }

    public final void a() {
        if (C0018.m978(this)) {
            throw new IllegalStateException(C0069.m5807(m535(), 183, 13, 1541));
        }
    }

    public final void b() {
        if (C0027.m2393(this)) {
            return;
        }
        try {
            if (C0065.m4790(this)) {
                throw new SignatureException(C0020.m1443(m535(), 196, 116, 370));
            }
        } catch (ApkFormatException e) {
            throw new SignatureException(C0026.m2321(m535(), 312, 49, 2382), e);
        }
    }

    public final void c() {
        if (C0071.m6039(this)) {
            OutputJarSignatureRequestImpl outputJarSignatureRequestImplM4900 = C0066.m4900(this);
            if (outputJarSignatureRequestImplM4900 == null) {
                throw new IllegalStateException(C0016.m625(m535(), 604, 75, 721));
            }
            if (!m537(outputJarSignatureRequestImplM4900)) {
                throw new IllegalStateException(C0065.m4757(m535(), InputDeviceCompat.SOURCE_DPAD, 91, 1452));
            }
            Iterator itM2001 = C0024.m2001(C0025.m2117(C0075.m6807(this)));
            while (C0036.m3657(itM2001)) {
                Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
                String str = (String) C0063.m4368(entry);
                byte[] bArr = (byte[]) C0019.m1293(entry);
                GetJarEntryDataRequest getJarEntryDataRequest = (GetJarEntryDataRequest) C0067.m5420(C0064.m4504(this), str);
                if (getJarEntryDataRequest == null) {
                    throw new IllegalStateException(C0074.m6503(C0019.m1189(m535(), 453, 10, 977), str, C0030.m2840(m535(), 463, 50, 1685)));
                }
                if (!m542(getJarEntryDataRequest)) {
                    throw new IllegalStateException(C0032.m3116(C0019.m1189(m535(), 415, 38, 2566), str));
                }
                if (!C0073.m6306(bArr, m545(getJarEntryDataRequest))) {
                    throw new IllegalStateException(C0074.m6503(C0066.m4828(m535(), 361, 17, 2102), str, C0038.m4022(m535(), 378, 37, 2815)));
                }
            }
            this.t = false;
        }
    }

    public final ArrayList e(int i, boolean z) {
        List listM4071 = C0039.m4071(this);
        int iM3427 = C0034.m3427(listM4071);
        List listM1937 = C0024.m1937(this);
        ArrayList arrayList = new ArrayList(C0034.m3427(listM1937) + iM3427);
        for (int i2 = 0; i2 < C0034.m3427(listM4071); i2++) {
            C0017.m919(arrayList, C0036.m3687(this, (SignerConfig) C0071.m6078(listM4071, i2), z, i));
        }
        if (i >= 3) {
            for (int i3 = 0; i3 < C0034.m3427(listM1937); i3++) {
                C0017.m919(arrayList, C0036.m3687(this, (SignerConfig) C0071.m6078(listM1937, i3), z, i));
            }
        }
        return arrayList;
    }

    public final void f(List list, int i) {
        this.q = new ArrayList(C0034.m3427(list));
        HashMap map = new HashMap(C0034.m3427(list));
        DigestAlgorithm digestAlgorithm = null;
        for (int i2 = 0; i2 < C0034.m3427(list); i2++) {
            SignerConfig signerConfig = (SignerConfig) C0071.m6078(list, i2);
            List<X509Certificate> listM13081 = C0111.m13081(signerConfig);
            PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(listM13081, 0));
            String strM2413 = C0027.m2413(C0111.m13053(signerConfig));
            Integer num = (Integer) C0038.m3969(map, strM2413, C0021.m1548(i2));
            if (num != null) {
                StringBuilder sb = new StringBuilder(C0072.m6116(m535(), 720, 9, 3099));
                C0021.m1551(sb, C0025.m2170(num) + 1);
                C0077.m7290(sb, C0035.m3603(m535(), 729, 6, 1110));
                C0021.m1551(sb, i2 + 1);
                C0077.m7290(sb, C0076.m6902(m535(), 735, 21, 1988));
                C0077.m7290(sb, strM2413);
                C0077.m7290(sb, C0072.m6116(m535(), 756, 32, 2439));
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
            DigestAlgorithm digestAlgorithmM7320 = C0078.m7320(publicKeyM6845, i);
            V1SchemeSigner.SignerConfig signerConfig2 = new V1SchemeSigner.SignerConfig();
            signerConfig2.name = strM2413;
            signerConfig2.keyConfig = C0065.m4779(signerConfig);
            signerConfig2.certificates = listM13081;
            signerConfig2.signatureDigestAlgorithm = digestAlgorithmM7320;
            signerConfig2.deterministicDsaSigning = C0036.m3748(signerConfig);
            if (digestAlgorithm == null || C0034.m3419(C0038.m4030(), digestAlgorithmM7320, digestAlgorithm) > 0) {
                digestAlgorithm = digestAlgorithmM7320;
            }
            C0077.m7162(C0078.m7399(this), signerConfig2);
        }
        this.r = digestAlgorithm;
        this.u = C0031.m3072(C0078.m7399(this));
    }

    public final boolean g(String str) {
        return C0027.m2393(this) || !C0070.m5838(C0023.m1904(m535(), 788, 19, 427), str);
    }

    @Override // com.android.apksig.ApkSignerEngine
    public byte[] generateSourceStampCertificateDigest() throws SignatureException {
        SignerConfig signerConfigM4537 = C0064.m4537(this);
        if (C0025.m2084(C0111.m13081(signerConfigM4537))) {
            throw new SignatureException(C0070.m5942(m535(), 848, 36, 834));
        }
        try {
            return C0026.m2259(C0064.m4613((X509Certificate) C0071.m6078(C0111.m13081(signerConfigM4537), 0)));
        } catch (CertificateEncodingException e) {
            throw new SignatureException(C0071.m5991(m535(), 807, 41, 2951), e);
        }
    }

    public final boolean h() {
        Boolean boolM3491 = C0034.m3491(this);
        if (boolM3491 != null) {
            return C0065.m4681(boolM3491);
        }
        GetJarEntryDataRequest getJarEntryDataRequestM6337 = C0073.m6337(this);
        if (getJarEntryDataRequestM6337 == null) {
            throw new IllegalStateException(C0072.m6116(m535(), 922, 119, 2123));
        }
        if (m542(getJarEntryDataRequestM6337)) {
            Boolean boolM6775 = C0075.m6775(C0068.m5643(C0020.m1393(m545(C0073.m6337(this)))));
            this.B = boolM6775;
            return C0065.m4681(boolM6775);
        }
        StringBuilder sb = new StringBuilder(C0066.m4828(m535(), 884, 38, 2225));
        C0077.m7290(sb, m536(C0073.m6337(this)));
        throw new IllegalStateException(C0068.m5536(sb));
    }

    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final OutputApkSigningBlockRequestImpl i(DataSource dataSource, DataSource dataSource2, DataSource dataSource3, boolean z) {
        int i;
        ?? r11;
        int i2;
        ArrayList arrayList;
        ApkSigningBlockUtils.SigningSchemeBlockAndDigests signingSchemeBlockAndDigestsM1392;
        ApkSigningBlockUtils.SigningSchemeBlockAndDigests signingSchemeBlockAndDigestsM2154;
        ArrayList arrayListM6553;
        List listM2799;
        C0111.m13130(this);
        C0069.m5739(this);
        boolean zM3124 = C0032.m3124(this);
        boolean zM6128 = C0072.m6128(this);
        if (!zM6128 && !zM3124 && !C0063.m4318(this)) {
            return null;
        }
        C0027.m2467(this);
        Pair pairM3432 = C0034.m3432(dataSource, z);
        DataSource dataSource4 = (DataSource) C0111.m13157(pairM3432);
        int iM2170 = C0025.m2170((Integer) C0037.m3781(pairM3432));
        DataSource dataSourceM616 = C0016.m616(dataSource4, dataSource3);
        ArrayList arrayList2 = new ArrayList();
        boolean zM1413 = C0020.m1413(this);
        if (zM1413 && (listM2799 = C0029.m2799(this)) != null && !C0025.m2084(listM2799)) {
            C0067.m5504(arrayList2, C0029.m2799(this));
        }
        if (zM6128) {
            if (zM6128) {
                this.D = true;
                this.F = null;
            }
            if (zM3124) {
                arrayListM6553 = new ArrayList();
                List listM4071 = C0039.m4071(this);
                SignerConfig signerConfig = !C0025.m2084(listM4071) ? (SignerConfig) C0071.m6078(listM4071, 0) : (SignerConfig) C0071.m6078(C0024.m1937(this), 0);
                SigningCertificateLineage signingCertificateLineageM6546 = C0074.m6546(this);
                if (signingCertificateLineageM6546 != null && C0068.m5602(C0026.m2275(signingCertificateLineageM6546, (X509Certificate) C0071.m6078(C0074.m6529(signerConfig), 0))) != 1) {
                    throw new IllegalArgumentException(C0038.m4022(m535(), 1041, 141, 2417));
                }
                C0017.m919(arrayListM6553, C0036.m3687(this, signerConfig, z, 2));
            } else {
                arrayListM6553 = C0074.m6553(this, 2, z);
            }
            i2 = 2;
            i = iM2170;
            r11 = 1;
            arrayList = arrayList2;
            signingSchemeBlockAndDigestsM1392 = C0020.m1392(C0039.m4144(this), dataSource4, dataSource2, dataSourceM616, arrayListM6553, C0032.m3124(this), zM1413 ? C0078.m7436(this) : null);
            C0017.m919(arrayList, C0064.m4560(signingSchemeBlockAndDigestsM1392));
        } else {
            i = iM2170;
            r11 = 1;
            i2 = 2;
            arrayList = arrayList2;
            signingSchemeBlockAndDigestsM1392 = null;
        }
        if (zM3124) {
            if (zM3124) {
                this.E = r11;
                this.F = null;
            }
            ArrayList arrayListM6559 = C0074.m6559(this, C0074.m6553(this, 3, z));
            ArrayList arrayListM3872 = C0037.m3872(arrayListM6559);
            if (arrayListM3872 != null && C0018.m1084(arrayListM3872) > 0) {
                C0017.m919(arrayList, C0064.m4560(C0025.m2154(C0039.m4170(C0074.m6459(C0020.m1416(new V3SchemeSigner.Builder(dataSource4, dataSource2, dataSourceM616, arrayListM3872), C0039.m4144(this)), 462663009)))));
            }
            V3SchemeSigner.Builder builderM6459 = C0074.m6459(C0020.m1416(new V3SchemeSigner.Builder(dataSource4, dataSource2, dataSourceM616, arrayListM6559), C0039.m4144(this)), -262969152);
            if (arrayListM3872 != null && !C0066.m4881(arrayListM3872)) {
                C0064.m4603(builderM6459, m539(m540(m534(C0074.m6565(arrayListM3872), new C0461w(3))), 33));
            }
            signingSchemeBlockAndDigestsM2154 = C0025.m2154(C0039.m4170(builderM6459));
            C0017.m919(arrayList, C0064.m4560(signingSchemeBlockAndDigestsM2154));
        } else {
            signingSchemeBlockAndDigestsM2154 = null;
        }
        if (C0063.m4318(this)) {
            ApkSigningBlockUtils.SignerConfig signerConfigM3687 = C0036.m3687(this, C0064.m4537(this), false, 0);
            SigningCertificateLineage signingCertificateLineageM4056 = C0039.m4056(this);
            if (signingCertificateLineageM4056 != null) {
                signerConfigM3687.signingCertificateLineage = C0026.m2275(signingCertificateLineageM4056, (X509Certificate) C0071.m6078(C0066.m4892(signerConfigM3687), 0));
            }
            HashMap map = new HashMap();
            if (zM3124) {
                C0038.m3969(map, C0021.m1548(3), C0039.m4184(signingSchemeBlockAndDigestsM2154));
            }
            if (zM6128) {
                C0038.m3969(map, C0021.m1548(i2), C0039.m4184(signingSchemeBlockAndDigestsM1392));
            }
            if (C0028.m2586(this)) {
                HashMap map2 = new HashMap();
                try {
                    GetJarEntryDataRequest getJarEntryDataRequestM5823 = C0069.m5823(this);
                    C0038.m3969(map2, C0111.m13173(), C0026.m2259(C0017.m913(C0065.m4737(C0023.m1903(this), C0018.m991(this), getJarEntryDataRequestM5823 != null ? m545(getJarEntryDataRequestM5823) : null))));
                    C0038.m3969(map, C0021.m1548(r11), map2);
                } catch (ApkFormatException e) {
                    throw new RuntimeException(C0026.m2321(m535(), 1182, 32, 3023), e);
                }
            }
            C0017.m919(arrayList, C0023.m1838(C0070.m5948(C0026.m2282(new V2SourceStampSigner.Builder(signerConfigM3687, map), C0034.m3424(this)))));
        }
        OutputApkSigningBlockRequestImpl outputApkSigningBlockRequestImpl = new OutputApkSigningBlockRequestImpl(C0027.m2527(arrayList), i, null);
        this.F = outputApkSigningBlockRequestImpl;
        return outputApkSigningBlockRequestImpl;
    }

    @Override // com.android.apksig.ApkSignerEngine
    public Set<String> initWith(byte[] bArr, Set<String> set) {
        V1SchemeVerifier.NamedDigest namedDigest;
        Pair pairM1645 = C0021.m1645(bArr, set, new V1SchemeVerifier.Result());
        String strM6523 = C0074.m6523(C0023.m1903(this));
        Iterator itM2001 = C0024.m2001(C0064.m4524((Map) C0037.m3781(pairM1645)));
        while (true) {
            boolean zM3657 = C0036.m3657(itM2001);
            HashMap mapM991 = C0018.m991(this);
            if (!zM3657) {
                return C0074.m6455(mapM991);
            }
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            String str = (String) C0063.m4368(entry);
            if (C0033.m3309((String) C0063.m4368(entry)) && C0111.m13181(this, str)) {
                Iterator itM4820 = C0066.m4820(C0036.m3745((ManifestParser.Section) C0019.m1293(entry), C0037.m3829(m535(), 1214, 7, 2313), C0018.m960(this), Integer.MAX_VALUE));
                while (true) {
                    if (!C0036.m3657(itM4820)) {
                        namedDigest = null;
                        break;
                    }
                    namedDigest = (V1SchemeVerifier.NamedDigest) C0071.m6012(itM4820);
                    if (C0070.m5838(C0025.m2134(namedDigest), strM6523)) {
                        break;
                    }
                }
                if (namedDigest != null) {
                    C0038.m3969(mapM991, str, C0078.m7416(namedDigest));
                }
            }
        }
    }

    @Override // com.android.apksig.ApkSignerEngine
    public boolean isEligibleForSourceStamp() {
        return C0064.m4537(this) != null && (C0072.m6128(this) || C0032.m3124(this) || C0028.m2586(this));
    }

    public final ArrayList k(ArrayList arrayList) throws InvalidKeyException {
        int iM960 = C0018.m960(this);
        int iM6445 = C0074.m6445(28, iM960);
        if (C0025.m2084(C0039.m4071(this)) && C0029.m2776((SignerConfig) C0071.m6078(C0024.m1937(this), 0)) > iM6445) {
            throw new IllegalArgumentException(C0071.m6038(iM6445, C0019.m1189(m535(), 1744, 154, 689)));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM5469 = Integer.MAX_VALUE;
        for (int iM1084 = C0018.m1084(arrayList) - 1; iM1084 >= 0; iM1084--) {
            ApkSigningBlockUtils.SignerConfig signerConfig = (ApkSigningBlockUtils.SignerConfig) C0064.m4526(arrayList, iM1084);
            if (C0064.m4591(signerConfig) == null) {
                throw new InvalidKeyException(C0074.m6503(C0034.m3431(m535(), 1898, 26, 2154), C0070.m5875(C0075.m6845((X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0))), C0068.m5544(m535(), 1924, 53, 1633)));
            }
            if (iM1084 == C0018.m1084(arrayList) - 1) {
                signerConfig.maxSdkVersion = Integer.MAX_VALUE;
            } else {
                ApkSigningBlockUtils.SignerConfig signerConfig2 = (ApkSigningBlockUtils.SignerConfig) C0064.m4526(arrayList2, C0018.m1084(arrayList2) - 1);
                if (C0032.m3121(signerConfig2)) {
                    signerConfig.maxSdkVersion = C0067.m5469(signerConfig2);
                } else {
                    signerConfig.maxSdkVersion = iM5469 - 1;
                }
            }
            int iM54692 = C0067.m5469(signerConfig);
            if (iM54692 == 34) {
                signerConfig.minSdkVersion = 33;
                signerConfig.signerTargetsDevRelease = true;
            } else if (iM54692 == 0) {
                Iterator itM4732 = C0065.m4732(C0064.m4591(signerConfig));
                int i = Integer.MAX_VALUE;
                while (C0036.m3657(itM4732)) {
                    int iM6026 = C0071.m6026((SignatureAlgorithm) C0071.m6012(itM4732));
                    if (iM6026 < i) {
                        if (iM6026 <= iM960 || iM6026 <= 28) {
                            i = iM6026;
                            break;
                        }
                        i = iM6026;
                    }
                }
                signerConfig.minSdkVersion = i;
            }
            X509Certificate x509Certificate = (X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0);
            SigningCertificateLineage signingCertificateLineageM5590 = C0068.m5590(signerConfig);
            if (signingCertificateLineageM5590 != null && !C0021.m1639(signingCertificateLineageM5590, x509Certificate)) {
                signerConfig.signingCertificateLineage = C0026.m2275(C0068.m5590(signerConfig), x509Certificate);
            }
            C0017.m919(arrayList2, signerConfig);
            iM5469 = C0067.m5469(signerConfig);
            if (C0032.m3121(signerConfig)) {
                if (iM5469 < iM6445) {
                    break;
                }
            } else {
                if (iM5469 <= iM6445) {
                    break;
                }
            }
        }
        if (iM5469 <= 28 || iM5469 <= iM960) {
            return arrayList2;
        }
        throw new InvalidKeyException(C0027.m2404(m535(), 1977, 73, 1577));
    }

    public byte[] produceV4Signature(DataSource dataSource, OutputStream outputStream) throws SignatureException {
        if (outputStream == null) {
            throw new SignatureException(C0074.m6452(m535(), 2422, 26, 2937));
        }
        try {
            ArrayList arrayListM6553 = C0074.m6553(this, 4, true);
            if (C0018.m1084(arrayListM6553) != 1) {
                arrayListM6553 = C0074.m6559(this, arrayListM6553);
            }
            Pair pairM832 = C0017.m832(dataSource, new V4SchemeSigner.SignerConfig(arrayListM6553, C0037.m3872(arrayListM6553)));
            C0111.m13186((V4Signature) C0111.m13157(pairM832), outputStream);
            return (byte[]) C0037.m3781(pairM832);
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException e) {
            throw new SignatureException(C0035.m3603(m535(), 2405, 17, 2476), e);
        }
    }

    @Override // com.android.apksig.ApkSignerEngine
    public void setExecutor(RunnablesExecutor runnablesExecutor) {
        this.G = runnablesExecutor;
    }

    @Override // com.android.apksig.ApkSignerEngine
    public void signV4(DataSource dataSource, File file, boolean z) throws SignatureException {
        if (file == null) {
            if (!z) {
                throw new SignatureException(C0035.m3603(m535(), 2448, 23, 3042));
            }
            return;
        }
        try {
            ArrayList arrayListM6553 = C0074.m6553(this, 4, true);
            if (C0018.m1084(arrayListM6553) != 1) {
                arrayListM6553 = C0074.m6559(this, arrayListM6553);
            }
            C0071.m6045(dataSource, new V4SchemeSigner.SignerConfig(arrayListM6553, C0037.m3872(arrayListM6553)), file);
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException e) {
            if (!z) {
                throw new SignatureException(C0076.m6902(m535(), 2471, 17, 1774), e);
            }
        }
    }

    public static ArrayList j(ArrayList arrayList) {
        if (C0034.m3427(arrayList) == 1) {
            return null;
        }
        int iM539 = m539(m540(m534(C0074.m6565(arrayList), new C0461w(2))), 28);
        ArrayList arrayList2 = new ArrayList();
        Iterator itM4732 = C0065.m4732(arrayList);
        while (C0036.m3657(itM4732)) {
            ApkSigningBlockUtils.SignerConfig signerConfig = (ApkSigningBlockUtils.SignerConfig) C0071.m6012(itM4732);
            int iM5469 = C0067.m5469(signerConfig);
            if (iM5469 >= 33 && (iM5469 > iM539 || (iM5469 >= iM539 && C0032.m3121(signerConfig)))) {
                C0017.m919(arrayList2, signerConfig);
                C0025.m2085(itM4732);
            }
        }
        return arrayList2;
    }

    public final ApkSigningBlockUtils.SignerConfig d(SignerConfig signerConfig, boolean z, int i) {
        List<X509Certificate> listM13081 = C0111.m13081(signerConfig);
        boolean z2 = false;
        PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(listM13081, 0));
        ApkSigningBlockUtils.SignerConfig signerConfig2 = new ApkSigningBlockUtils.SignerConfig();
        signerConfig2.keyConfig = C0065.m4779(signerConfig);
        signerConfig2.certificates = listM13081;
        signerConfig2.minSdkVersion = C0029.m2776(signerConfig);
        signerConfig2.signerTargetsDevRelease = C0070.m5842(signerConfig);
        signerConfig2.signingCertificateLineage = C0020.m1324(signerConfig);
        if (i != 0) {
            boolean zM13174 = C0111.m13174(this);
            int iM960 = C0018.m960(this);
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        try {
                            signerConfig2.signatureAlgorithms = C0063.m4442(publicKeyM6845, iM960, z, C0036.m3748(signerConfig));
                        } catch (InvalidKeyException unused) {
                            signerConfig2.signatureAlgorithms = null;
                        }
                    } else {
                        throw new IllegalArgumentException(C0024.m1945(m535(), 679, 41, 3220));
                    }
                } else {
                    if (z && zM13174) {
                        z2 = true;
                    }
                    try {
                        signerConfig2.signatureAlgorithms = C0038.m4014(publicKeyM6845, iM960, z2, C0036.m3748(signerConfig));
                    } catch (InvalidKeyException unused2) {
                        signerConfig2.signatureAlgorithms = null;
                    }
                }
            } else {
                if (z && zM13174) {
                    z2 = true;
                }
                signerConfig2.signatureAlgorithms = C0035.m3614(publicKeyM6845, iM960, z2, C0036.m3748(signerConfig));
            }
        } else {
            signerConfig2.signatureAlgorithms = C0111.m13086(C0067.m5414());
        }
        return signerConfig2;
    }

    @Override // com.android.apksig.ApkSignerEngine
    public void inputApkSigningBlock(DataSource dataSource) {
        boolean z;
        C0111.m13130(this);
        if (dataSource != null && C0072.m6146(dataSource) != 0 && C0020.m1413(this)) {
            this.p = new ArrayList();
            try {
                Iterator itM4732 = C0065.m4732(C0070.m5951(dataSource));
                boolean z2 = false;
                while (true) {
                    boolean zM3657 = C0036.m3657(itM4732);
                    boolean zM3124 = C0032.m3124(this);
                    if (zM3657) {
                        Pair pair = (Pair) C0071.m6012(itM4732);
                        int iM2170 = C0025.m2170((Integer) C0037.m3781(pair));
                        List listM4071 = C0039.m4071(this);
                        boolean z3 = true;
                        if (iM2170 == 1896449818) {
                            if (C0072.m6128(this)) {
                                List listM2865 = C0030.m2865((byte[]) C0111.m13157(pair));
                                this.o = new ArrayList(C0034.m3427(listM2865));
                                Iterator itM47322 = C0065.m4732(listM2865);
                                while (C0036.m3657(itM47322)) {
                                    Pair pair2 = (Pair) C0071.m6012(itM47322);
                                    List list = (List) C0111.m13157(pair2);
                                    Iterator itM47323 = C0065.m4732(listM4071);
                                    while (true) {
                                        if (C0036.m3657(itM47323)) {
                                            if (C0066.m4903(list, C0111.m13081((SignerConfig) C0071.m6012(itM47323)))) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (!z) {
                                        C0077.m7162(C0078.m7436(this), (byte[]) C0037.m3781(pair2));
                                        z2 = true;
                                    }
                                }
                            } else {
                                C0077.m7162(C0029.m2799(this), pair);
                                z2 = true;
                            }
                        } else if (C0025.m2170((Integer) C0037.m3781(pair)) == -262969152) {
                            if (zM3124) {
                                List listM28652 = C0030.m2865((byte[]) C0111.m13157(pair));
                                if (C0034.m3427(listM28652) <= 1) {
                                    if (C0034.m3427(listM28652) == 1) {
                                        List list2 = (List) C0111.m13157((Pair) C0071.m6078(listM28652, 0));
                                        Iterator itM47324 = C0065.m4732(listM4071);
                                        while (true) {
                                            if (C0036.m3657(itM47324)) {
                                                if (C0066.m4903(list2, C0111.m13081((SignerConfig) C0071.m6012(itM47324)))) {
                                                    break;
                                                }
                                            } else {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                        if (!z3) {
                                            throw new IllegalStateException(C0037.m3829(m535(), 1221, 168, 2311));
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    C0077.m7290(sb, C0036.m3678(m535(), 1389, 40, 2560));
                                    C0021.m1551(sb, C0034.m3427(listM28652));
                                    C0077.m7290(sb, C0111.m13097(m535(), 1429, 61, 1313));
                                    throw new IllegalArgumentException(C0068.m5536(sb));
                                }
                            } else {
                                throw new IllegalStateException(C0026.m2321(m535(), 1490, 52, 3238));
                            }
                        } else if (!C0064.m4525(C0078.m7393(), C0037.m3781(pair))) {
                            C0077.m7162(C0029.m2799(this), pair);
                        }
                    } else {
                        if (zM3124 && z2) {
                            throw new IllegalStateException(C0030.m2840(m535(), 1542, 113, 891));
                        }
                        return;
                    }
                }
            } catch (ApkFormatException e) {
                e = e;
                throw new IllegalArgumentException(C0024.m1945(m535(), 1655, 42, 1523), e);
            } catch (IOException e2) {
                e = e2;
                throw new IllegalArgumentException(C0024.m1945(m535(), 1655, 42, 1523), e);
            } catch (CertificateException e3) {
                e = e3;
                throw new IllegalArgumentException(C0024.m1945(m535(), 1655, 42, 1523), e);
            }
        }
    }

    @Override // com.android.apksig.ApkSignerEngine
    public ApkSignerEngine.InputJarEntryInstructions inputJarEntry(String str) {
        ApkSignerEngine.InputJarEntryInstructions.OutputPolicy outputPolicyM2358;
        C0111.m13130(this);
        if (C0063.m4345(C0111.m13161(this), str)) {
            outputPolicyM2358 = C0016.m619();
        } else if (!C0020.m1413(this) && !C0033.m3309(str)) {
            outputPolicyM2358 = C0023.m1821();
        } else {
            outputPolicyM2358 = C0026.m2358();
        }
        int i = m544()[C0030.m2893(outputPolicyM2358)];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (C0070.m5838(C0020.m1443(m535(), 1697, 20, 2130), str)) {
                        GetJarEntryDataRequest getJarEntryDataRequest = new GetJarEntryDataRequest(str, null);
                        this.z = getJarEntryDataRequest;
                        return new ApkSignerEngine.InputJarEntryInstructions(C0016.m619(), getJarEntryDataRequest);
                    }
                    return new ApkSignerEngine.InputJarEntryInstructions(C0016.m619());
                }
                StringBuilder sb = new StringBuilder(C0063.m4315(m535(), 1717, 27, 1840));
                C0036.m3741(sb, outputPolicyM2358);
                throw new RuntimeException(C0068.m5536(sb));
            }
            return new ApkSignerEngine.InputJarEntryInstructions(C0026.m2358());
        }
        return new ApkSignerEngine.InputJarEntryInstructions(C0023.m1821());
    }

    @Override // com.android.apksig.ApkSignerEngine
    public ApkSignerEngine.InputJarEntryInstructions.OutputPolicy inputJarEntryRemoved(String str) {
        C0111.m13130(this);
        if (C0063.m4345(C0111.m13161(this), str)) {
            return C0016.m619();
        }
        if (!C0020.m1413(this) && !C0033.m3309(str)) {
            return C0023.m1821();
        }
        return C0026.m2358();
    }

    @Override // com.android.apksig.ApkSignerEngine
    public void outputDone() {
        C0111.m13130(this);
        C0069.m5739(this);
        if (C0077.m7305(this) || C0111.m13175(this)) {
            OutputApkSigningBlockRequestImpl outputApkSigningBlockRequestImplM2396 = C0027.m2396(this);
            if (outputApkSigningBlockRequestImplM2396 != null) {
                if (m538(outputApkSigningBlockRequestImplM2396)) {
                    this.F = null;
                    this.D = false;
                    this.E = false;
                    return;
                }
                throw new IllegalStateException(C0021.m1650(m535(), 2050, 101, 1454));
            }
            throw new IllegalStateException(C0076.m6902(m535(), 2151, 72, 2939));
        }
    }

    @Override // com.android.apksig.ApkSignerEngine
    public ApkSignerEngine.OutputJarSignatureRequest outputJarEntries() throws SignatureException {
        byte[] bArrM913;
        List listM1905;
        C0111.m13130(this);
        if (!C0071.m6039(this)) {
            return null;
        }
        GetJarEntryDataRequest getJarEntryDataRequestM5823 = C0069.m5823(this);
        if (getJarEntryDataRequestM5823 != null && !m542(getJarEntryDataRequestM5823)) {
            StringBuilder sb = new StringBuilder(C0019.m1189(m535(), 2223, 37, 2002));
            C0077.m7290(sb, m536(C0069.m5823(this)));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        HashMap mapM2248 = C0026.m2248(this);
        Iterator itM4820 = C0066.m4820(C0020.m1411(mapM2248));
        while (true) {
            boolean zM3657 = C0036.m3657(itM4820);
            HashMap mapM991 = C0018.m991(this);
            String strM4757 = C0065.m4757(m535(), 2260, 38, 886);
            if (zM3657) {
                GetJarEntryDataDigestRequest getJarEntryDataDigestRequest = (GetJarEntryDataDigestRequest) C0071.m6012(itM4820);
                String strM546 = m546(getJarEntryDataDigestRequest);
                if (m543(getJarEntryDataDigestRequest)) {
                    C0038.m3969(mapM991, strM546, m541(getJarEntryDataDigestRequest));
                } else {
                    throw new IllegalStateException(C0032.m3116(strM4757, strM546));
                }
            } else {
                if (C0063.m4318(this)) {
                    MessageDigest messageDigestM2835 = C0030.m2835(C0074.m6523(C0023.m1903(this)));
                    C0063.m4423(messageDigestM2835, C0033.m3289(this));
                    C0038.m3969(mapM991, C0077.m7205(m535(), 2298, 17, 852), C0033.m3355(messageDigestM2835));
                }
                C0067.m5425(mapM2248);
                HashMap mapM4504 = C0064.m4504(this);
                Iterator itM48202 = C0066.m4820(C0020.m1411(mapM4504));
                while (C0036.m3657(itM48202)) {
                    GetJarEntryDataRequest getJarEntryDataRequest = (GetJarEntryDataRequest) C0071.m6012(itM48202);
                    if (!m542(getJarEntryDataRequest)) {
                        StringBuilder sb2 = new StringBuilder(strM4757);
                        C0077.m7290(sb2, m536(getJarEntryDataRequest));
                        throw new IllegalStateException(C0068.m5536(sb2));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (C0072.m6128(this)) {
                    C0017.m919(arrayList, C0021.m1548(2));
                }
                if (C0032.m3124(this)) {
                    C0017.m919(arrayList, C0021.m1548(3));
                }
                GetJarEntryDataRequest getJarEntryDataRequestM58232 = C0069.m5823(this);
                if (getJarEntryDataRequestM58232 != null) {
                    bArrM913 = m545(getJarEntryDataRequestM58232);
                } else {
                    bArrM913 = null;
                }
                if (C0063.m4318(this)) {
                    bArrM913 = C0017.m913(C0065.m4737(C0023.m1903(this), mapM991, bArrM913));
                }
                byte[] bArr = bArrM913;
                C0027.m2467(this);
                OutputJarSignatureRequestImpl outputJarSignatureRequestImplM4900 = C0066.m4900(this);
                HashMap mapM6807 = C0075.m6807(this);
                String strM7205 = C0077.m7205(m535(), 2315, 31, 796);
                if (outputJarSignatureRequestImplM4900 != null && m537(outputJarSignatureRequestImplM4900)) {
                    V1SchemeSigner.OutputManifestFile outputManifestFileM4737 = C0065.m4737(C0023.m1903(this), mapM991, bArr);
                    if (!C0073.m6306(C0017.m913(outputManifestFileM4737), (byte[]) C0067.m5420(mapM6807, C0031.m3047(m535(), 2346, 20, 1409)))) {
                        try {
                            listM1905 = C0021.m1557(C0078.m7399(this), C0023.m1903(this), arrayList, C0030.m2857(this), outputManifestFileM4737);
                        } catch (CertificateException e) {
                            throw new SignatureException(strM7205, e);
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator itM2001 = C0024.m2001(C0025.m2117(mapM6807));
                        while (C0036.m3657(itM2001)) {
                            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
                            String str = (String) C0063.m4368(entry);
                            byte[] bArr2 = (byte[]) C0019.m1293(entry);
                            GetJarEntryDataRequest getJarEntryDataRequest2 = (GetJarEntryDataRequest) C0067.m5420(mapM4504, str);
                            if (getJarEntryDataRequest2 == null) {
                                C0017.m919(arrayList2, C0025.m2158(str, bArr2));
                            } else if (!C0073.m6306(bArr2, m545(getJarEntryDataRequest2))) {
                                C0017.m919(arrayList2, C0025.m2158(str, bArr2));
                            }
                        }
                        if (C0066.m4881(arrayList2)) {
                            return null;
                        }
                        listM1905 = arrayList2;
                    }
                } else {
                    try {
                        listM1905 = C0023.m1905(C0078.m7399(this), C0023.m1903(this), mapM991, arrayList, bArr, C0030.m2857(this));
                    } catch (CertificateException e2) {
                        throw new SignatureException(strM7205, e2);
                    }
                }
                if (C0025.m2084(listM1905)) {
                    this.t = false;
                    return null;
                }
                ArrayList arrayList3 = new ArrayList(C0034.m3427(listM1905));
                Iterator itM4732 = C0065.m4732(listM1905);
                while (C0036.m3657(itM4732)) {
                    Pair pair = (Pair) C0071.m6012(itM4732);
                    String str2 = (String) C0111.m13157(pair);
                    byte[] bArr3 = (byte[]) C0037.m3781(pair);
                    C0017.m919(arrayList3, new ApkSignerEngine.OutputJarSignatureRequest.JarEntry(str2, bArr3));
                    C0038.m3969(mapM6807, str2, bArr3);
                }
                OutputJarSignatureRequestImpl outputJarSignatureRequestImpl = new OutputJarSignatureRequestImpl(arrayList3, null);
                this.C = outputJarSignatureRequestImpl;
                return outputJarSignatureRequestImpl;
            }
        }
    }

    @Override // com.android.apksig.ApkSignerEngine
    public void outputJarEntryRemoved(String str) {
        C0111.m13130(this);
        boolean zM6128 = C0072.m6128(this);
        if (zM6128) {
            this.D = true;
            this.F = null;
        }
        boolean zM2586 = C0028.m2586(this);
        if (!zM2586) {
            return;
        }
        if (C0033.m3309(str)) {
            if (zM2586) {
                this.t = true;
            }
            if (zM6128) {
                this.D = true;
                this.F = null;
            }
            C0069.m5761(C0018.m991(this), str);
            C0069.m5761(C0026.m2248(this), str);
            C0069.m5761(C0064.m4504(this), str);
            return;
        }
        if (C0063.m4345(C0111.m13161(this), str)) {
            if (zM2586) {
                this.t = true;
            }
            if (zM6128) {
                this.D = true;
                this.F = null;
            }
        }
    }
}
