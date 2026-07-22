package p003;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.LocationRequest;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣۣۣۣۣ۟۟۟۟۟۠۟۟ۡ۟۟ۢ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0193 {

    /* JADX INFO: renamed from: ۣۣ۟۟۠ۤ۟۟۠ۥۣ۟۟۠ۦۣۣ۟۟۠ۧ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String f685 = null;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ۟۟۟۠ۨ۠۟۟۠ۨۡ۟۟۠ۨۢ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Context f695 = null;

    /* JADX INFO: renamed from: ۟۟۠ۨۤ۟۟۠ۨۥ۟۟۠ۨۦ۟۟۠ۨۧ۟۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String f696 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟۟۟ۡ۠۟۟ۡۡ۟۟ۡۢ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f698 = false;

    /* JADX INFO: renamed from: ۟۟ۡ۟ۤ۟۟ۡ۟ۥ۟۟ۡ۟ۦ۟۟ۡ۟ۧ۟۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f699 = false;

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ۟۟۟ۡۡ۠۟۟ۡۡۡ۟۟ۡۡۢ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean f702 = false;

    /* JADX INFO: renamed from: ۟۟ۡۡۤ۟۟ۡۡۥ۟۟ۡۡۦ۟۟ۡۡۧ۟۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean f703 = false;

    /* JADX INFO: renamed from: ۣ۟۟ۡۢ۟۟۟ۡۢ۠۟۟ۡۢۡ۟۟ۡۢۢ۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean f704 = false;

    /* JADX INFO: renamed from: ۟۟ۡۢۤ۟۟ۡۢۥ۟۟ۡۢۦ۟۟ۡۢۧ۟۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String f705 = "";

    /* JADX INFO: renamed from: ۟۟ۡۦۤ۟۟ۡۦۥ۟۟ۡۦۦ۟۟ۡۦۧ۟۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String f706 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ۟۟۟ۡۧ۠۟۟ۡۧۡ۟۟ۡۧۢ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String f707 = null;

    /* JADX INFO: renamed from: ۟۟ۡۨۤ۟۟ۡۨۥ۟۟ۡۨۦ۟۟ۡۨۧ۟۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String f710 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟۟۟۟ۢ۟۠۟۟ۢ۟ۡ۟۟ۢ۟ۢ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String f711 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟۟۟ۢ۠۟۟ۢۡ۟۟ۢۢ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] f712 = null;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۤ۟۟ۢ۟ۥ۟۟ۢ۟ۦ۟۟ۢ۟ۧ۟۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String f713 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠۟۟۟ۢ۠۠۟۟ۢ۠ۡ۟۟ۢ۠ۢ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String f714 = "";

    /* JADX INFO: renamed from: ۟۟ۢ۠ۤ۟۟ۢ۠ۥ۟۟ۢ۠ۦ۟۟ۢ۠ۧ۟۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Signature[] f715 = null;

    /* JADX INFO: renamed from: ۣ۟۟ۢۡ۟۟۟ۢۡ۠۟۟ۢۡۡ۟۟ۢۡۢ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String f716 = "";

    /* JADX INFO: renamed from: ۟۟ۢۡۤ۟۟ۢۡۥ۟۟ۢۡۦ۟۟ۢۡۧ۟۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String f717 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ۟۟۟ۢۢ۠۟۟ۢۢۡ۟۟ۢۢۢ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static byte[] f718 = null;

    /* JADX INFO: renamed from: ۟۟ۢۢۤ۟۟ۢۢۥ۟۟ۢۢۦ۟۟ۢۢۧ۟۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String f719 = "";

    /* JADX INFO: renamed from: ۣۣۣۣۣۣ۟۟ۢ۟۟۟ۢ۠۟۟ۢۡ۟۟ۢۢ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String f720 = "";

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ۟۟۟ۢۤ۠۟۟ۢۤۡ۟۟ۢۤۢ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static SigningInfo f722;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f682short = {8914, 1656, 1582, 1656, 1582, 1656, 1582, 1656, 1582, 1656, 429, 390, 386, 391, 401, -9771, -8213, -29777, 30056, 23709, 20891, 20952, -31263, 26146, -27800, 25465, 22910, 25187, -27480, 30884, 22659, 23305, 22231, -25435, 21994, 26684, 31836, 27321, 27598, 2427, 32686, 2427, 26955, 3014, 2972, 3028, 2972, 3033, 2972, 3012, 2972, 3029, 3037, 3026, 2972, 3035, 2972, 3023, 2972, 3029, 21859, 28514, -27707, 21695, 29554, -27501, 29528, 2420, 29679, 29628, -32149, -30434, -30449, 23359, 22651, 482, 32311, 17410, 26599, 29954, 24231, 29603, 23924, 32658, 28924, 21636, 31187, 1602, 1657, 1606, 1637, 1646, 1553, 1553, 1556, 1557, 2584, 2564, 2584, 2564, 2566, 2564, 2575, 30175, 21456, 1269, 1266, 1184, 1190, 1194, 1186, -30965, -32314, 1784, 1765, 1788, 1765, 1768, 1785, 1777, -30139, 21424, -26170, 28987, 21375, -26628, 31562, 21628, 1518, 1512, 1508, 1516, 1506, 1504, 1509, 1509, 1516, 1531, -27452, -27452, -30622, 2137, 2119, 2137, 2119, 2114, 2131, 2141, 1031, 1032, 1026, 1044, 1033, 1027, 1027, 1026, 3284, 3291, 3281, 3271, 3290, 2176, 3280, 3281, 232, 1206, 3300, 2229, 1087, 1146, 1126, 1131, 1139, 3145, 3089, 3091, 3096, 3154, 3086, 3081, 2832, 2847, 2912, 2943, 1869, 1873, 1884, 1865, 1876, 1875, 1872, 1874, 1881, 1870, 1016, 997, 1020, -2470, -2472, -2477, -2482, -2472, -2469, -2472, -8527, -9992, -8527, -10212, -8527, -10231, -8527, -10228, -8527, -10212, -8527, -10223, -8527, -10212, 662, 660, 671, 642, 660, 663, 660, 2897, 2877, 2900, 2877, 2889, 2877, 2904, 2877, 2908, 2877, 2893, 2877, 2902, 2877, 2894, 1210, 1215, 1186, 1203, 1207, 1190, 1213, 1189, 277, 272, 269, 284, 266, 280, 265, 274, 266, 2257, 2245, 3217, 2253, 2248, 2247, 3220, 3035, 3023, 3018, 3015, 3010, 3021, 3022, 1324, 1341, 1318, 1312, 1314, 1321, 1332, 498, 509, 503, 481, 508, 506, 503, 483, 418, 3271, 3273, 3268, 3270, 3278, 3272, 3274, 3265, 1348, 1368, 1365, 1364, 1346, 1375, 1369, 1364, 1373, 1375, 1364, 1746, 1731, 1733, 1742, 1732, 1743, 1729, 1749, 2881, 2894, 2884, 2898, 2895, 2889, 2884, 2905, 2895, 2892, 2895, 1629, 1619, 1603, 1615, 1615, 1614, 1623, 1617, 1857, 1863, 1867, 1859, 1870, 1863, 1887, 1872, 1866, 706, 704, 715, 715, 733, 704, 710, 715, 2956, 2958, 2975, 2950, 2948, 2959, 2968, 2954, 2971, 2944, 639, 515, 513, 522, 608, 525, 513, 2557, 2514, 2520, 2510, 2515, 2517, 2520, 2542, 2521, 2508, 2505, 2526, 2512, 2517, 2527, 2450, 2515, 2510, 2523, 2604, 2621, 2598, 2619, 2596, 2622, 2596, 2594, 2595, 2659, 2594, 2623, 2602, 2543, 2528, 2538, 2556, 2529, 2535, 2538, 2529, 2551, 2555, 2528, 2627, 2662, 2659, 2662, 2672, 2599, 2656, 2662, 2963, 2993, 3002, 2973, 2993, 2995, 3004, 2993, 1118, 1103, 1108, 1106, 1104, 1115, 1114, 1107, 2668, 2666, 2662, 2670, 2671, 2685, 2666, 787, 822, 818, 828, 811, 792, 779, 781, 2570, 2587, 2560, 2570, 2588, 2570, 2585, 2575, 309, 311, 316, 316, 317, 316, 341, 329, 2827, 2823, 2817, 2831, 2821, 2827, 2825, 2818, 2823, 2838, 2829, 2021, 2023, 2028, 2043, 2021, 2025, 2022, 2017, 2025, 2027, 2267, 2266, 2271, 2262, 2247, 2268, 2244, 2255, 988, 990, 981, 989, 988, 985, 1100, 1102, 1093, 1071, 1090, 1102, 1100, 1327, 10229, 1313, 2251, 2216, 2247, 2216, 2245, 1412, 1414, 1421, 1481, 1419, 1424, 2565, 2567, 2572, 2572, 2573, 2572, 2632, 2570, 2577, 575, 1644, 566, 566, 1639, 566, 626, 560, 555, 2347, 2345, 2338, 2351, 2336, 2351, 2339, 2338, 2406, 2340, 2367, 2600, 2604, 2602, 2593, 2600, 2659, 2622, 2596, 2592, 2621, 2593, 2600, 2659, 2622, 2601, 2598, 2622, 2659, 2592, 2604, 2595, 2604, 2602, 2600, 2659, 2571, 2604, 2598, 2600, 2572, 2606, 2617, 2596, 2619, 2596, 2617, 2612, 1680, 1685, 1694, 1668, 1732, 1738, 1699, 1743, 1742, 1746, 1679, 1683, 3148, 3145, 3138, 3160, 3096, 3094, 3199, 3094, 3092, 3086, 3155, 3151, 1907, 1910, 1917, 1918, 1901, 1906, 1856, 1836, 1837, 1841, 1900, 1904, 2703, 2698, 2689, 2690, 2705, 2702, 2748, 2773, 2775, 2765, 2704, 2700, 812, 817, 810, 804, 877, 802, 819, 808, 1619, 1608, 1620, 1625, 1614, 1554, 1629, 1612, 1623, 560, 557, 566, 568, 512, 556, 566, 568, 561, 3115, 3120, 3116, 3105, 3126, 3099, 3127, 3117, 3107, 3114, 903, 937, 932, 934, 942, 1003, 932, 949, 949, 1395, 1407, 1405, 1342, 1399, 1400, 1342, 1399, 1393, 1405, 1397, 1395, 1397, 1406, 1380, 1397, 1378, 2905, 2901, 2903, 2836, 2895, 2890, 2909, 2907, 2910, 2907, 2894, 2907, 2836, 2895, 2890, 2829, 2829, 2824, 2825, 2763, 2759, 2757, 2694, 2779, 2752, 2761, 2758, 2783, 2761, 2758, 2694, 2782, 2753, 2778, 2780, 2781, 2761, 2756, 644, 648, 650, 713, 645, 670, 641, 642, 649, 713, 650, 646, 661, 652, 642, 659, 2684, 2672, 2674, 2609, 2686, 2678, 2664, 2666, 2609, 2674, 2686, 2669, 2676, 2682, 2667, 2083, 2095, 2093, 2158, 2099, 2088, 2081, 2094, 2092, 2089, 2094, 2087, 2158, 2093, 2103, 2106, 2099, 2032, 2044, 2046, 1981, 2025, 2043, 2034, 2045, 2036, 2040, 2044, 2045, 2036, 2034, 2019, 2019, 1981, 2041, 2044, 2040, 2038, 1981, 2033, 2034, 2046, 2038, 2045, 2016, 2043, 2038, 2045, 2018, 2042, 1453, 1441, 1443, 1504, 1444, 1441, 1445, 1451, 1504, 1452, 1455, 1443, 1451, 1440, 1469, 1446, 1451, 1440, 1471, 1447, 2299, 2295, 2293, 2230, 2290, 2295, 2291, 2301, 2230, 2298, 2297, 2293, 2301, 2294, 2283, 2288, 2301, 2294, 2281, 2289, 2230, 2288, 2301, 2292, 2280, 793, 789, 791, 852, 784, 789, 785, 799, 852, 792, 795, 791, 799, 788, 777, 786, 799, 788, 779, 787, 852, 795, 777, 777, 787, 777, 782, 795, 788, 782, 650, 646, 644, 711, 643, 646, 642, 652, 711, 651, 648, 644, 652, 647, 666, 641, 652, 647, 664, 640, 711, 644, 654, 648, 644, 652, 2387, 2399, 2397, 2334, 2394, 2399, 2395, 2389, 2334, 2386, 2385, 2397, 2389, 2398, 2371, 2392, 2389, 2398, 2369, 2393, 2334, 2390, 2399, 2370, 2373, 2397, 1266, 1248, 1255, 1267, 1260, 1248, 1266, 1103, 1091, 1089, 1026, 1101, 1096, 1095, 1093, 1088, 1088, 1097, 1118, 1026, 1119, 1097, 1103, 1091, 1090, 1096, 2621, 2609, 2611, 2672, 2619, 2617, 2672, 2623, 2608, 2618, 2604, 2609, 2615, 2618, 2672, 2591, 2610, 2615, 2606, 2623, 2599, 2585, 2606, 2614, 2609, 2608, 2619, 2018, 2030, 2028, 1967, 
    2037, 2020, 2031, 2018, 2020, 2031, 2037, 1967, 2028, 2028, 450, 462, 460, 399, 468, 463, 456, 462, 463, 465, 448, 472, 1978, 1974, 1972, 2039, 1965, 1976, 1961, 1965, 1976, 1961, 2479, 2467, 2465, 2530, 2488, 2477, 2492, 2488, 2477, 2492, 2530, 2475, 2464, 2467, 2478, 2477, 2464, 645, 649, 651, 712, 651, 643, 658, 647, 712, 644, 649, 670, 1398, 1402, 1400, 1339, 1405, 1392, 1388, 1377, 1396, 1381, 1339, 1400, 1396, 1383, 1406, 1392, 1377, 715, 711, 709, 646, 711, 728, 728, 711, 646, 709, 713, 730, 707, 717, 732, 2430, 2418, 2416, 2355, 2419, 2424, 2428, 2415, 2416, 2424, 2355, 2426, 2428, 2416, 2424, 2430, 2424, 2419, 2409, 2424, 2415, 22300, -31730, 27699, 27064, -1047, -2099, 31601, 24553, 2178, 2195, 2178, -2085, 13435, 1115, 1043, 13748, -1367, 22074, 23662, 1510, 1527, 1510, -1345, 13895, 1224, 1235, 1269, 1277, 1266, 1277, 1899, 1904, 1878, 1886, 1873, 1886, 2407, 2425, 2420, 2404, 2424, 2352, 2417, 2430, 2420, 2352, 2424, 2421, 2425, 2423, 2424, 2404, 2352, 2429, 2405, 2403, 2404, 2352, 2418, 2421, 2352, 2350, 2352, 2336, 3121, 3094, 3102, 3099, 3090, 3091, 3159, 3075, 3096, 3159, 3092, 3077, 3090, 3094, 3075, 3090, 3159, 3093, 3102, 3075, 3098, 3094, 3079, 3159, 3089, 3077, 3096, 3098, 3159, 3091, 3077, 3094, 3072, 3094, 3093, 3099, 3090, 3158, 1193, 1202, 1172, 1180, 1171, 1180, 13367, 581, 581, 581, 582, 3219, 15523, 24808, 20835, 19251, 24137, 29218, -1532, 2080, 2624, 2642, 2642, 2628, 2645, 2642, 2574, 2170, 2097, 2100, 2081, 2100, 2170, 765, 742, 704, 712, 711, 712, 706, 720, 720, 710, 727, 720, 652, 2830, 2837, 2867, 2875, 2868, 2875, 20751, 23935, -31820, 23004, -31344, 31955, 28624, 17569, 1771, 18638, -28221, -28896, 21832, 1775, 18588, 18638, 22350, 23866, -28896, 21832, 21197, 25412, 18485, 32568, 21611, 25594, 21198, 1775, -26876, 29675, -24747, 28130, 1771, 25813, 32239, 1778, 18665, -30440, 31944, 1770, -28896, 21832, 21197, 28743, -28596, 25081, 21198, 1775, -26948, 22414, 21852, 21958, 20971, 24537, -30440, 31944, -26865, 28743, -27859, -24997, 1770, -24897, -28553, 25280, -31174, 28292, -2323, 18412, -24863, -32672, 25134, 25280, 26596, 32231, 27654, 31657, 23166, 23268, -28133, -29542, -29448, 22160, 1640, 1651, 1621, 1629, 1618, 1629, 2645, 2650, 2640, 2630, 2651, 2653, 2640, 2586, 2653, 2650, 2624, 2641, 2650, 2624, 2586, 2645, 2647, 2624, 2653, 2651, 2650, 2586, 2658, 2685, 2673, 2659, 763, 764, 738, 691, 2919, 2874, 2849, 2856, 2855, 2867, 2849, 2848, 2853, 2861, 2872, 2919, 2858, 2854, 2852, 1824, 1897, 1894, 1908, 1917, 1824, 1901, 1889, 1891, 23480, 31070, 31861, -25073, 26964, 28623, -32067, 2777, 31041, 24025, 17660, 28623, 17527, 2776, 1969, 1965, 1965, 1961, 1962, 2019, 1493, 1481, 1481, 1485, 1415, 1873, 1885, 1870, 1879, 1881, 1864, 1798, 608, 630, 635, 612, 625, 634, 558, 26845, 26641, -30776, -31401, 2678, 2644, 2633, 2654, 2684, 2650, 2646, 2654, 2580, 26484, -31757, 23635, 31935, -24891, 27038, 568, 564, 566, 629, 566, 574, 559, 570, 629, 566, 555, 572, 629, 568, 566, 629, 556, 553, 570, 555, 555, 574, 553, 27535, 27459, 26449, 27494, -31590, 23385, 2395, 2394, 2394, 18233, 24452, 28503, 28755, 22294, 23843, 24672, 24748, 32509, 22155, 700, 28239, 28291, 24492, 22692, 3219, 3048, 3060, 3060, 3050, 3061, 3040, 3051, 3062, 3041, 3054, 3044, 3061, 3052, 3007, 2986, 2986, 3047, 3052, 3071, 3012, 3042, 3040, 3051, 3057, 2986, 3060, 3048, 24736, 24684, 29874, 25059, -29115, 30574, 535, 535, 20710, 32226, -676, 25893, 26089, -28333, 22732, 31672, 21454, 2041, 2560, 2587, 2621, 2613, 2618, 2613, 2991, 2982, 3063, 2453, 2432, 2434, 2536, 1254, 1168, 1171, 1172, 1250, 1252, 1169, 1259, 1254, 1250, 1252, 1175, 1251, 1255, 1251, 1248, 1259, 1249, 1253, 1250, 1251, 1252, 1250, 1169, 1249, 1175, 1255, 1171, 1253, 1258, 1252, 1253, 681, 724, 725, 686, 733, 729, 724, 681, 728, 686, 687, 682, 725, 724, 724, 681, 686, 680, 732, 725, 681, 686, 724, 735, 682, 729, 735, 731, 724, 681, 724, 731, 3194, 3198, 3193, 3084, 3199, 3085, 3197, 3199, 3083, 3080, 3082, 3193, 3083, 3192, 3085, 3082, 3192, 3083, 3085, 3192, 3193, 3074, 3197, 3197, 3192, 3194, 3193, 3086, 3194, 3087, 3083, 3082, 872, 793, 877, 876, 791, 879, 795, 795, 874, 796, 879, 875, 798, 795, 879, 798, 796, 793, 874, 874, 797, 799, 797, 872, 879, 798, 797, 877, 798, 875, 793, 799, 2792, 2799, 2797, 2712, 2715, 2714, 2716, 2704, 2704, 2716, 2716, 2794, 2716, 2796, 2704, 2797, 2714, 2799, 2705, 2799, 2792, 2713, 2718, 2712, 2796, 2795, 2704, 2792, 2717, 2796, 2705, 2718, 1650, 1650, 1653, 1654, 1654, 1650, 1648, 1648, 1648, 1573, 1569, 1654, 1573, 1648, 1572, 1572, 1651, 1652, 1655, 1572, 1572, 1654, 1572, 1653, 1654, 1569, 1571, 1655, 1573, 1570, 1571, 1651, 1663, 1576, 1583, 1576, 1576, 1582, 1580, 1662, 1656, 1662, 1657, 1577, 1577, 1657, 1656, 1660, 1662, 1660, 1576, 1651, 1662, 1651, 1656, 1661, 1657, 1579, 1661, 1651, 1657, 1663, 1661, 1657, 1324, 1405, 1326, 1323, 1323, 1327, 1400, 1404, 1400, 1404, 1320, 1405, 1320, 1324, 1403, 1406, 1395, 1320, 1404, 1403, 1404, 1401, 1403, 1403, 1406, 1405, 1320, 1400, 1402, 1402, 1400, 1321, 2161, 2150, 2167, 2166, 2161, 2157, 2083, 2167, 2161, 2166, 2150, 891, 876, 893, 892, 891, 871, 809, 879, 872, 869, 890, 876, 1913, 1890, 1860, 1868, 1859, 1868, 3167, 3164, 3150, 3160, 3091, 3164, 3149, 3158, 24732, 27444, 3179, 3084, 30531, 22576, 3093, 28203, 27154, 3179, 3087, 17275, 17363, 26884, 27415, 30531, 3092, 28203, 16944, 27154, 28204, 31417, 30531, 22576, 3093, 3196, 3155, 3161, 3151, 3154, 3156, 3161, 3182, 3145, 3144, 3161, 3156, 3154, 26884, 24213, -31750, 3092, 1181, 1889, 1910, 1888, 1916, 1894, 1889, 1904, 1910, 1888, 1853, 1906, 1889, 1888, 1904, -28239, 25350, -30724, 28482, -2261, 26146, 31777, 28096, 31343, 23480, 23330, -2243, 1238, 1229, 1259, 1251, 1260, 1251, 894, 869, 835, 843, 836, 843, 444, 447, 429, 443, 413, 433, 432, 426, 443, 422, 426, -29178, 28031, 21443, 22549, 21192, -302, 22262, 20662, 23966, -29219, 29942, 438, 447, 429, 413, 434, 447, 429, 429, 502, 503, 20516, -27449, -302, -29174, 22272, 440, 447, 434, 429, 443, 511, 511, 511, 1808, 1813, 1822, 1804, 1821, 1813, 1806, 
    1813, 1804, 1823, 1811, 1806, 1817, 1874, 1807, 1811, 584, 589, 582, 630, 617, 631, 522, 599, 587, 1819, 1822, 1813, 1818, 1816, 1811, 1881, 1796, 1816, 1180, 1163, 2265, 2265, 577, 605, 520, 597, 638, 623, 623, 576, 638, 635, 623, 627, 618, 620, 560, 638, 635, 623, 2320, 2325, 2334, 2334, 2330, 2321, 2323, 2328, 2386, 2319, 2323, 1105, 1108, 1119, 1099, 1104, 1101, 1043, 1102, 1106, 549, 551, 556, 615, 549, 551, 556, 614, 553, 568, 547, 3050, 3046, 3044, 2983, 3066, 3069, 3068, 3051, 2983, 3034, 3069, 3068, 3051, 3016, 3065, 3065, 1880, 1845, 1815, 1796, 1796, 1817, 1794, 1847, 1798, 1798, 1818, 1823, 1813, 1815, 1794, 1823, 1817, 1816, 3301, 3296, 3307, 3300, 3302, 3309, 3324, 3301, 3308, 3239, 3322, 3302, 1391, 1386, 1377, 1377, 1378, 1386, 1383, 1398, 1395, 1393, 1388, 1399, 1382, 1376, 1399, 1325, 1392, 1388, 2522, 2527, 2516, 2502, 2522, 2519, 2498, 2527, 2520, 2523, 2521, 2514, 2501, 2456, 2501, 2521, 2640, 2645, 2654, 2653, 2638, 2649, 2639, 2578, 2639, 2643, 271, 259, 257, 322, 270, 259, 270, 322, 269, 286, 280, 265, 269, 257, 322, 265, 257, 280, 292, 269, 271, 263, 288, 261, 270, 2323, 2380, 2382, 2387, 2399, 2323, 2383, 2393, 2384, 2394, 2323, 2385, 2397, 2380, 2383, 1928, 1931, 1930, 1933, 1932, 1935, 1934, 1921, 1920, 1923, 1922, 1925, 1924, 1927, 1926, 1945, 1944, 1947, 1946, 1949, 1948, 1951, 1950, 1937, 1936, 1939, 1968, 1257, 1205, 1215, 1205, 1202, 1187, 1195, 1257, 1194, 1199, 1188, 1257, 1191, 1204, 1195, 1458, 1464, 1458, 1461, 1444, 1452, 1518, 1453, 1448, 1443, 1527, 1525, 1518, 1453, 1448, 1443, 1440, 1455, 1445, 1459, 1454, 1448, 1445, 1438, 1459, 1460, 1455, 1461, 1448, 1452, 1444, 1519, 1458, 1454, 1256, 1250, 1256, 1263, 1278, 1270, 1204, 1271, 1266, 1273, 1204, 1271, 1266, 1273, 1274, 1269, 1279, 1257, 1268, 1266, 1279, 1220, 1257, 1262, 1269, 1263, 1266, 1270, 1278, 1205, 1256, 1268, 974, 914, 920, 914, 917, 900, 908, 974, 909, 904, 899, 983, 981, 974, 896, 915, 908, 983, 981, 1064, 1128, 1126, 1799, 1805, 1799, 1792, 1809, 1817, 1883, 1816, 1821, 1814, 1883, 1813, 1798, 1817, 1883, 1607, 1613, 1607, 1600, 1617, 1625, 1563, 1624, 1629, 1622, 1538, 1536, 1563, 1621, 1606, 1625, 1538, 1536, 1563, 2021, 2034, 2034, 2031, 2034, 1421, 1486, 1431, 1424, 1434, 1434, 2015, 1950, 1924, 1925, 1943, 1944, 1925, 1990, 2015, 2058, 2053, 2058, 1415, 1410, 1417, 1435, 1418, 1410, 1433, 1410, 1435, 1416, 1412, 1433, 1422, 1477, 1432, 1412, 3191, 3179, 3186, 3168, 3182, 3177, 3113, 3174, 3191, 3180, 985, 985, 903, 985, 967, 974, 2938, 2938, 1734, 1731, 1736, 1735, 1733, 1742, 1668, 1753, 1733, 914, 901, 3029, 3024, 3035, 3068, 3031, 3034, 3019, 3008, 3017, 3021, 3030, 3019, 3066, 2967, 3018, 3030, 453, 448, 459, 456, 477, 463, 479, 502, 478, 450, 391, 474, 454, 560, 565, 574, 573, 562, 568, 554, 561, 556, 626, 559, 563};

    /* JADX INFO: renamed from: ۟۟۠ۦۤ۟۟۠ۦۥ۟۟۠ۦۦ۟۟۠ۦۧ۟۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String f692 = "iVBORw0KGgoAAAANSUhEUgAAAHYAAAB2CAYAAAAdp2cRAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyNpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMTQ4IDc5LjE2NDAzNiwgMjAxOS8wOC8xMy0wMTowNjo1NyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIDIxLjAgKFdpbmRvd3MpIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjg4QjU5NDk5OUE1RTExRUY5QURCRkE2OTg2RjcwMjU5IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjg4QjU5NDlBOUE1RTExRUY5QURCRkE2OTg2RjcwMjU5Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6ODhCNTk0OTc5QTVFMTFFRjlBREJGQTY5ODZGNzAyNTkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6ODhCNTk0OTg5QTVFMTFFRjlBREJGQTY5ODZGNzAyNTkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz57QrDoAAAMQklEQVR42uxda3BWxRlePiikBB2rJbUVaIPGIAUSuRiiVJTp0KZkqiLiYFtnLFA0P6oMeGmtF2qnjWAE+wMGUZnCVNGS2NbSYBixSjWAwQkJDaBCKmprozQzCAJqsO+T7z305Hy75+z5rmeTfWaeyeS77HfO857d97J79vTLGzREGI4ziGOIo4kjicOJXyUOJZ5DzCcO4M8BR4mfEo8RDxM/IP6b+A7xIHEvcQ/xiMmi9DPMsDFiKfEyYjmxjFiI80jz73xObCfuIDYSXyE2E09Zw6YPZxJnMKdzT8wF0LMbiJuYR6xhw2Mg8SriHGIFMS9ix3eCWE98ivgn4ifWsP6Aj7yFeCOxwJBRr4O4jriKfbQ1rAuTiLcTZxL7GxqvdBHriMuIr0UhGMklJhCfI+4kXmewUQUf+3V8Ls/xufU5w44gPslXdqXofajkc3uSzzX7V9mAAQOz+XsIgu7hoOPiDKQpkYpfiGOJN3MwuJ34WW/0sd8iriEWi76J/cT5xG29ZSgeRHyY+FIfNqrgc4cGNayJ0T32IuIG4jhh4UYL5+htJvbY2RwhWqMmApqgXHm9ScETLpZq4vJsDDkGA8LPEvFJihdEvD4d2aH4i8T1xGut3UIBhY0fEo9H0bBfEvHieLm1U1LALBImOjqj5GMLeDixRk0e5axhQVQMO5TD+IutbVIGNPybSMPUZKqGPYu4hTjK2iStKeIW1jYnhh1M3EwssbZIO0pY28HZNiy+h3pvmbVBxlDGGic145VsHvtr4lyrfcZRzPnuC9kwLOYcV4jePTMTJWDhXpsIWX4Mm8fCsaNMOMTqnVVgqewlYYwbxseiPLjBGjUnyGd/q12iDTMULyVebTXOGb7CBn4+nUPxVOKL1q/mHJgouFLEC0IpGxbLWTB/WGR1jQTeEvElNydSHYqxRmmm1TMyOJt77oup9NhCjsTyrJ6RAnorbkJrTzYqrrZGjSTyOJhNqseOJzbZgCnSgRTuoNgVtsc+YI0aafRjG4Xqsahy7LDaGQFMFuzU7bGLrF7GYJFuj71AxG/XH2A1MwK4y76Y81vfHrvAGtUowIY3B/VYVCveFbnbDsAiOWAbhWHCdWe9t8deZY1qJIay7ZRD8RyrkbGYoxqKsTvLf4StNJkKlBkxtXfE22NnWKMajTy2YcJQXGm1MR6V3qEYBn7fBk7G40Mejk85PbbUGrVX4Mtsy9ND8RSrSa/BFLdhL7V6qFFUdL5Jh3uZ27CXyD5x/MRHUmYLK1f+Vvr7v6n+Vff7s2ZdozxGfDcMLp86RdnWzGuvMUIPxiTHsNjH9xuyhlpbW6U/AEGzgVGj5Dfx1ddv7v67ceOzonZjrfQzs6+fHaqn3X/fvUKlwYPVDxmhBwO2PAOGxSbO0gn1pteapA1NmJid3eTOvyDRMB0dHeLll/5++v8lSx4Qx44dS/hcfn6+WLjwVq3f+cmCuaL80sR7ttHu4sV3GKUH23IMDKvce+ntQ4ekrw8fNiyloW3r1gat7xcUJN7cfeCtAz3+f/PNA2LNmsekbdz045u62wnC3Xf/XPr6M08/00M0E/RgjIZhC1WN1dU+K339wuILAw+kouK7yvfGlQTvEFRePln6+r59+xJe+9ldv1AOk4sWLQz0WzLB2tvbRVXVT43UA50bhh2pagy9AV3di7FjxwYeyOjRFynfwzAZ5Je+PkK+t+TWrfLltEsfXCZ9ffr06d1DrSrahS+W4d577jNZjxEw7Ll+DTY3NycVMJSWlvq+P23alb7vT5w0UerzEDDJ4BdIzZsnN+xDNUu7RfUC7ah+xxA9zoVhz/Fr8L133wsdMKj8gU6E52DkyMSB5OBB/w28VYEUetSddy1OMAR6sywYQTuG63E2DOtbSlQNfX4Bg58/0fErEELWk1RRqU4gVVV1S4//77jzdoXPXdXdjuF6FDh5rBKqIWn8hPGh/Im3J/n5FVWg0Lx7d6BAqkAKPcYpWqD3yvxi46uNp3NWw/UYEhMaNz/LhCosLNT2J4gwN/dMon39iipQeHT141r5niqQQqCEq9/bex2h71/yS632DdCjf2CP9evysmhT5k9e3/W6aN2zR9uvyAIFiKELVSCFXrF+/e+k/s6bsxquxxCtrQpUiXlpSYmWP8FJyHJAlV+RDZMQIwxUgZRuzmq6HjBsYBVblZifN+w8LX8Cv4WAxHuVoQd5K0MqPyO7wpMNpHRyVsP1OArDntIRSZaYFxUVBfoTtz+SXWXeK1qVNjQ2bhdhgUAqaAjH8akCIoP16NLqsarE3Bsw4OryDnVufyS7yrxXtCxtkBS6tYDj8QtqnGFOVZkyWI/uHvuBzomoEnO3KLKozh2Sy4Yw7xUtq7uqqj1BUOWqXtx2262h2464Hh0w7GGdE1El5u6AwRvVIXhxh+Qyv4Ir2u1XZIGCSkQ/IGfVqeE6PS3sxHzE9fivszpRK4UIChi8UV3L7hataM7xK6pAQSWiCn7F/bVPrFXmuGEm5iOux/swrHaCKEvMnYABB+Ete8mmlPz8iixQ8Cv8q7B69SplcR9pTUNDgzTHxffCIMJ6HIJhtR+NKUvMnYBB5k9kV5afX5GlBrKr3A9+qyGc4n5NzXJpjovvhQmkIqzHARh2f6qJOcSQ+RPZleXnV2TpgmIiWTkEq1ZDIKd1ivuIKFFpkkH1fcP02AfDYizQeuaLKjFHwKDjT4L8iiw10Sn8O8AaJ1llCUMmclo3li9/RFmZ0g2kIqoHbNni5LH/TCUxn1E5I8Gf7Ni5U+2bJH5l/vx50s/qFv7h07DGSQbZpIBfZcqZLDBUD9jyI6dWrP2EYlkOJesl9ZLZC78rXRbsqNYxhclZ/VZDqCpTOBbVclQD9Oi2pWPYV1JNzMNURmR+RYY39r+RUs7qDphUWLHiEenruoFUBPV41W1Y7XqdTk6pUynSma3RKfz75azugEkFDG2YYE82kIqaHoKfT+sYtlm3tKiTU7a17Q38zMvbgp+PqwpOdHJWWcCkgmqCXSeQipgeH7ItTxsWMzxbUknM3Xji8bWBbQQFARi+gnqbKmdVBUxKUWmY9LtVJCiQiooehAa2ZY9lMX9JJTF3AF+hcQCBggQNX345q1/ApILfrSJBgVQU9PDa0G4u0ntwUsQfeJiwuQheqLf6GIt6x6hewwJPWX2MRQ/b2S33egcCt9zDG+usTsZhnduosh4LYFtbTCH0t3oZAe1tbfGBWquXMaj1GlVlWKDG6mUMpLZSGRZzTH+1mhmR4kif3eD3eBYsuMEUkH2SRzSBCXVs49QUpscCu6yvjTTqVEYN6rGAfQRaNIG9ib8pfBYiBt1th9nfpVbHyGGZCFhdqvuY0VbOby1yD0wVjREBjxmNaXb7eUJzJaNFxgOmuUFGBXQf5f028SziZKttToHlHKt1Pqj7KG9gEOe346y+OUELpzcndT4cC9EwGsQjQD62GmcdH7P2J3W/EAv5A23sby2yi/msvTZ0fawbWAM5WPBO1hYZBzaeejjsl5IxLIDFtLglrNjqnlH8mXtr6IwkluQPdvGYbx8enDnsYI27kvlyLIUfhkOv4GjNIv0RcEUqgWosxQPoJH5bxFdcWKQHe1nTzlQaiaXhQLCQaqrgWwssUgI0vEJo3m6TacMCuEl0GnG7tU3S2M4adqSjsVgaD6yTD6zO2ig06li7znQ1mGy6o8JnxI02zw0FTMEtIH6azkbTbVjBOdcWDqiwYdFAazspjhJvJK4QGZg5i2XwwJ8mltl0SArMb09mjTKCWIZPoI2Nm5Gr0kB8zlpgluYfmfyhMNN2qeJy4qOi75YhsZ8WyoPbsvFjmfCxKmCy/jHx/2WTX+gjBj1OrCb+QITYBc8kwzpRMyYQ1ov4g5yUD0zsJcPuBuLVxD/yuWcNsRydNPaqu4F77qZeaNRNfG438LlmHbEcC4AFz5UcYP1BJDmTERF08TmU8Tk15fJgshk86QDP+aoi/kjE91MwAR3sWlZm04eaZlgHWDj3fQ44viOidycCln8+T/y9iE+Gn4yagFE1rBtn8tD2PSKeMpirbRQw44J9lHAXIrbdORJl0UwwrDcmwJIc1KGxqxYeNF+Yod9qZz+JvBN7TWJK7ZQpQplmWFWPxg6Z2PkZm/oPJ35NxB+fCmI/voH8F8AuXZ/w38PMfxHfEfHbJ1Djbo16jwzC/wQYAHszjVgoorJEAAAAAElFTkSuQmCC";

    /* JADX INFO: renamed from: ۟۟۠ۧۤ۟۟۠ۧۥ۟۟۠ۧۦ۟۟۠ۧۧ۟۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String f694 = C0205.m13272(f682short, 0, 1, 729);

    /* JADX INFO: renamed from: ۣ۟۟ۡۨ۟۟۟ۡۨ۠۟۟ۡۨۡ۟۟ۡۨۢ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String f709 = C0204.m13267(f682short, 1, 9, 1536);

    /* JADX INFO: renamed from: ۟۟ۢۤ۟۟ۢۥ۟۟ۢۦ۟۟ۢۧ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String f723 = C0204.m13267(f682short, 10, 7, 488);

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟۟۟۟ۡ۟۠۟۟ۡ۟ۡ۟۟ۡ۟ۢ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String[] f697 = {C0203.m13263(f682short, 17, 2, PointerIconCompat.TYPE_CROSSHAIR), C0205.m13272(f682short, 19, 2, 1460), C0204.m13267(f682short, 21, 2, 2696), C0203.m13263(f682short, 23, 2, 962), C0204.m13267(f682short, 25, 2, 1689), C0203.m13263(f682short, 27, 2, 3174), C0207.m13281(f682short, 29, 2, 979), C0207.m13281(f682short, 31, 2, 2324), C0203.m13263(f682short, 33, 2, 3063), C0203.m13263(f682short, 35, 3, 2724), C0204.m13267(f682short, 38, 5, 2390), C0204.m13267(f682short, 43, 17, AuthApiStatusCodes.AUTH_TOKEN_ERROR), C0205.m13272(f682short, 60, 2, 2412), C0203.m13263(f682short, 62, 5, 1526), C0207.m13281(f682short, 67, 2, 2358), C0207.m13281(f682short, 69, 2, 2952), C0205.m13272(f682short, 71, 2, 1650), C0204.m13267(f682short, 73, 2, 2861), C0207.m13281(f682short, 75, 2, 403), C0203.m13263(f682short, 77, 3, 2726), C0207.m13281(f682short, 80, 2, 3079), C0203.m13263(f682short, 82, 2, 3133), C0204.m13267(f682short, 84, 3, 1666), C0203.m13263(f682short, 87, 5, 1536), C0207.m13281(f682short, 92, 4, 1574), C0203.m13263(f682short, 96, 7, 2635), C0207.m13281(f682short, 103, 2, 2030), C0205.m13272(f682short, LocationRequest.PRIORITY_NO_POWER, 6, 1223), C0207.m13281(f682short, 111, 2, 864), C0204.m13267(f682short, 113, 7, 1680), C0207.m13281(f682short, 120, 2, 2272), C0204.m13267(f682short, 122, 2, 658), C0203.m13263(f682short, 124, 4, 532), C0205.m13272(f682short, 128, 10, 1417), C0207.m13281(f682short, 138, 3, 1459), C0203.m13263(f682short, 141, 7, 2098), C0204.m13267(f682short, 148, 8, 1126), C0204.m13267(f682short, 156, 8, 3253), C0205.m13272(f682short, 164, 2, 1240), C0205.m13272(f682short, 166, 2, 2257), C0207.m13281(f682short, 168, 5, 1034), C0204.m13267(f682short, 173, 7, 3196), C0207.m13281(f682short, 180, 4, 2897), C0203.m13263(f682short, 184, 10, 1853), C0205.m13272(f682short, 194, 3, 904), C0205.m13272(f682short, 197, 7, 2423), C0205.m13272(f682short, 204, 14, 1668), C0204.m13267(f682short, 218, 7, 763), C0204.m13267(f682short, 225, 15, 2845), C0205.m13272(f682short, 240, 8, 1238), C0207.m13281(f682short, 248, 9, 345), C0207.m13281(f682short, InputDeviceCompat.SOURCE_KEYBOARD, 7, 2177), C0203.m13263(f682short, 264, 7, 2955), C0207.m13281(f682short, 271, 7, 1357), C0205.m13272(f682short, 278, 9, 403), C0203.m13263(f682short, 287, 8, 3237), C0205.m13272(f682short, 295, 11, 1328), C0205.m13272(f682short, 306, 8, 1702), C0204.m13267(f682short, 314, 11, 2848), C0203.m13263(f682short, 325, 8, 1594), C0207.m13281(f682short, 333, 9, 1830), C0205.m13272(f682short, 342, 8, 687), C0207.m13281(f682short, 350, 10, 3019), C0207.m13281(f682short, 360, 7, 590), C0207.m13281(f682short, 367, 19, 2492), C0207.m13281(f682short, 386, 13, 2637), C0207.m13281(f682short, 399, 11, 2446), C0203.m13263(f682short, 410, 8, 2569), C0204.m13267(f682short, 418, 8, 3038), C0207.m13281(f682short, 426, 8, 1087), C0203.m13263(f682short, 434, 7, 2571), C0203.m13263(f682short, 441, 8, 857), C0205.m13272(f682short, 449, 8, 2635), C0204.m13267(f682short, 457, 8, 376), C0204.m13267(f682short, 465, 11, 2918), C0205.m13272(f682short, 476, 10, 1960), C0205.m13272(f682short, 486, 8, 2199), C0204.m13267(f682short, 494, 6, 913), C0207.m13281(f682short, 500, 7, InputDeviceCompat.SOURCE_GAMEPAD), C0207.m13281(f682short, 507, 3, 1388), C0205.m13272(f682short, 510, 5, 2184), C0203.m13263(f682short, 515, 6, 1513), C0204.m13267(f682short, 521, 9, 2664), C0204.m13267(f682short, 530, 9, 594), C0205.m13272(f682short, 539, 11, 2374)};

    /* JADX INFO: renamed from: ۣۣۣۣۣۣ۟۟۠۟۟۟۠۠۟۟۠ۡ۟۟۠ۢ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String[] f684 = {C0203.m13263(f682short, 550, 37, 2637)};

    /* JADX INFO: renamed from: ۣۣ۟۟ۢۤ۟۟ۢۥۣ۟۟ۢۦۣۣ۟۟ۢۧ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static HashMap<String, String> f721 = new HashMap<>();

    /* JADX INFO: renamed from: ۟۟ۡۧۤ۟۟ۡۧۥ۟۟ۡۧۦ۟۟ۡۧۧ۟۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String[] f708 = {C0203.m13263(f682short, 587, 12, 1788), C0207.m13281(f682short, 599, 12, 3104), C0205.m13272(f682short, 611, 12, 1823), C0203.m13263(f682short, 623, 12, 2787), C0204.m13267(f682short, 635, 8, 835), C0207.m13281(f682short, 643, 9, 1596), C0203.m13263(f682short, 652, 9, 607), C0203.m13263(f682short, 661, 10, 3140)};

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠۟۟۟ۡ۠۠۟۟ۡ۠ۡ۟۟ۡ۠ۢ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean f700 = false;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۤ۟۟ۡ۠ۥ۟۟ۡ۠ۦ۟۟ۡ۠ۧ۟۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f701 = false;
    public static boolean lja_app = false;

    /* JADX INFO: renamed from: ۟۟۠ۤ۟۟۠ۥ۟۟۠ۦ۟۟۠ۧ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String f687 = C0205.m13272(f682short, 671, 9, 965);

    /* JADX INFO: renamed from: ۟۟۠ۥ۟۟۟۠ۥ۠۟۟۠ۥۡ۟۟۠ۥۢ۟۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static HashMap<String, String> f689 = new C0194();

    /* JADX INFO: renamed from: ۟۟۠ۤۤ۟۟۠ۤۥ۟۟۠ۤۦ۟۟۠ۤۧ۟۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String[] f688 = {C0205.m13272(f682short, 680, 17, 1296), C0204.m13267(f682short, 697, 19, 2874), C0203.m13263(f682short, 716, 19, 2728), C0203.m13263(f682short, 735, 16, 743), C0205.m13272(f682short, 751, 15, 2591), C0203.m13263(f682short, 766, 17, 2112), C0205.m13272(f682short, 783, 33, 1939), C0207.m13281(f682short, 816, 20, 1486), C0204.m13267(f682short, 836, 25, 2200), C0207.m13281(f682short, 861, 30, 890), C0205.m13272(f682short, 891, 26, 745), C0203.m13263(f682short, 917, 26, 2352)};

    /* JADX INFO: renamed from: ۟۟۠ۦ۟۟۟۠ۦ۠۟۟۠ۦۡ۟۟۠ۦۢ۟۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String[] f691 = new String[0];

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ۟۟۟۠ۧ۠۟۟۠ۧۡ۟۟۠ۧۢ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String[] f693 = {C0203.m13263(f682short, 943, 7, 1157)};

    /* JADX INFO: renamed from: ۟۟۠ۢۤ۟۟۠ۢۥ۟۟۠ۢۦ۟۟۠ۢۧ۟۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static String[] f683 = {C0204.m13267(f682short, 950, 19, 1068)};

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ۟۟۟۠ۤ۠۟۟۠ۤۡ۟۟۠ۤۢ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String[] f686 = {C0207.m13281(f682short, 969, 27, 2654), C0203.m13263(f682short, 996, 14, 1921), C0205.m13272(f682short, PointerIconCompat.TYPE_ALIAS, 12, 417), C0203.m13263(f682short, 1022, 10, 2009), C0203.m13263(f682short, 1032, 17, 2508), C0203.m13263(f682short, 1049, 12, 742), C0204.m13267(f682short, 1061, 17, 1301), C0203.m13263(f682short, 1078, 15, 680), C0207.m13281(f682short, 1093, 21, 2333)};

    /* JADX INFO: renamed from: ۟۟۠ۥۤ۟۟۠ۥۥ۟۟۠ۥۦ۟۟۠ۥۧ۟۟۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static HashMap<Long, Object[]> f690 = new HashMap<>();

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static long m13223(long j) {
        long j2 = 4294967295L & j;
        Object[] objArr = f690.get(Long.valueOf(j2));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = objArr == null ? 1678 : 1709;
                    break;
                case 204:
                    String str = (String) objArr[0];
                    long jLongValue = ((Long) objArr[1]).longValue();
                    StringBuilder sb = new StringBuilder(C0207.m13281(f682short, 1114, 5, 1267));
                    sb.append(str);
                    sb.append(C0205.m13272(f682short, 1119, 7, 2241));
                    sb.append(j2);
                    String strM13263 = C0203.m13263(f682short, 1126, 3, 1131);
                    sb.append(strM13263);
                    sb.append(Long.toHexString(j2));
                    sb.append(C0205.m13272(f682short, 1129, 8, 1445));
                    sb.append(jLongValue);
                    sb.append(strM13263);
                    sb.append(Long.toHexString(jLongValue));
                    sb.append(C0205.m13272(f682short, 1137, 1, 1622));
                    C0204.m13267(f682short, 1138, 6, 1194);
                    sb.toString();
                    return jLongValue;
                case 239:
                    return j;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Bitmap m13224(Drawable drawable) {
        Bitmap.Config config;
        C0204.m13267(f682short, 1144, 6, 1801);
        boolean z = drawable instanceof BitmapDrawable;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1678 : 1709;
                    break;
                case 204:
                    return ((BitmapDrawable) drawable).getBitmap();
                case 239:
                    try {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = intrinsicWidth <= 0 ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (intrinsicHeight <= 0) {
                                                    i3 = 48736;
                                                }
                                                break;
                                            case 47384:
                                                int opacity = drawable.getOpacity();
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            config = Bitmap.Config.RGB_565;
                                                            break;
                                                        case 503:
                                                            i4 = opacity == -1 ? 48953 : 49635;
                                                            break;
                                                        case 32495:
                                                            config = Bitmap.Config.ARGB_8888;
                                                            int i5 = 49666;
                                                            while (true) {
                                                                i5 ^= 49683;
                                                                switch (i5) {
                                                                    case 17:
                                                                        i5 = 49697;
                                                                        continue;
                                                                    case 50:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                                                drawable.draw(canvas);
                                                return bitmapCreateBitmap;
                                            case 47417:
                                                int i6 = 48767;
                                                while (true) {
                                                    i6 ^= 48784;
                                                    switch (i6) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i6 = 48798;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48705;
                                    }
                                    break;
                            }
                        }
                        C0204.m13267(f682short, 1150, 28, 2320);
                        return null;
                    } catch (Exception e) {
                        C0207.m13281(f682short, 1178, 38, 3191);
                        return null;
                    }
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Drawable m13225(Resources resources, Bitmap bitmap) {
        return new BitmapDrawable(resources, bitmap);
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Drawable m13226(Resources resources, String str) {
        try {
            return m13225(resources, m13238(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m13227(CharSequence charSequence, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zIsEmpty ? 1709 : 1678;
                    break;
                case 204:
                    String strReplace = charSequence.toString().toLowerCase().replace(f694, "");
                    boolean zIsEmpty2 = f721.isEmpty();
                    C0207.m13281(f682short, 1216, 6, 1227);
                    String strM13267 = C0204.m13267(f682short, 1222, 1, 1062);
                    String strM13281 = C0207.m13281(f682short, 1223, 4, 632);
                    String strM13272 = C0205.m13272(f682short, 1227, 2, 3251);
                    String strM13263 = C0203.m13263(f682short, 1229, 6, 1310);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zIsEmpty2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                Iterator<Map.Entry<String, String>> it = f721.entrySet().iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = !zHasNext ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                Map.Entry<String, String> next = it.next();
                                                String key = next.getKey();
                                                boolean zContains = strReplace.contains(key.toLowerCase());
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            String str2 = str + strM13263 + key + strM13272 + ((Object) charSequence) + strM13281 + ((Object) next.getValue()) + strM13267;
                                                            return next.getValue();
                                                        case 239:
                                                            i4 = !zContains ? 48829 : 48860;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    String[] strArr = f697;
                    int length = strArr.length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 48891;
                        while (true) {
                            i6 ^= 48908;
                            switch (i6) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i6 = i5 >= length ? 48953 : 49635;
                                    break;
                                case 32495:
                                    String str3 = strArr[i5];
                                    boolean zContains2 = strReplace.contains(str3.toLowerCase());
                                    int i7 = 49666;
                                    while (true) {
                                        i7 ^= 49683;
                                        switch (i7) {
                                            case 17:
                                                i7 = !zContains2 ? 49728 : 49759;
                                                break;
                                            case 50:
                                                break;
                                            case Base64.mimeLineLength /* 76 */:
                                                String str4 = str + strM13263 + str3 + strM13272 + ((Object) charSequence) + strM13281 + f723 + strM13267;
                                                return f723;
                                            case 83:
                                                i5++;
                                                int i8 = 49790;
                                                while (true) {
                                                    i8 ^= 49807;
                                                    switch (i8) {
                                                        case 18:
                                                            break;
                                                        case 241:
                                                            i8 = 49821;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m13228(Resources resources, int i) {
        return resources.getResourceName(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0215. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0115. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13229(Context context, String str, String str2, boolean z, boolean z2) {
        StringBuilder sb;
        String str3;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStreamOpen;
        int i;
        ZipFile zipFile = null;
        int i2 = 0;
        String strM13263 = C0203.m13263(f682short, 1235, 1, 2063);
        String str4 = "";
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            try {
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = !z ? 1709 : 1678;
                        break;
                    case 204:
                        boolean zContains = str.contains(strM13263);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = !zContains ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    boolean zEndsWith = str2.endsWith(File.separator);
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                str4 = File.separator;
                                                break;
                                            case Base64.mimeLineLength /* 76 */:
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i6 = 48922;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i5 = !zEndsWith ? 48829 : 48860;
                                                break;
                                        }
                                    }
                                    sb2.append(str4);
                                    sb2.append(str.substring(str.indexOf(strM13263) + 1));
                                    sb = sb2;
                                    break;
                                case 500:
                                    int i7 = 1864;
                                    while (true) {
                                        i7 ^= 1881;
                                        switch (i7) {
                                            case 17:
                                                i7 = 48674;
                                                break;
                                            case 47483:
                                                str3 = str2;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        boolean zEndsWith2 = str2.endsWith(File.separator);
                        int i8 = 49790;
                        while (true) {
                            i8 ^= 49807;
                            switch (i8) {
                                case 18:
                                    break;
                                case 51:
                                    str4 = File.separator;
                                    break;
                                case 84:
                                    int i9 = 49914;
                                    while (true) {
                                        i9 ^= 49931;
                                        switch (i9) {
                                            case 497:
                                                i9 = 50596;
                                                continue;
                                            case 1711:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 241:
                                    i8 = !zEndsWith2 ? 49852 : 49883;
                                    break;
                            }
                        }
                        sb3.append(str4);
                        sb3.append(str);
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    i10 = 50720;
                                    continue;
                                case 50:
                                    sb = sb3;
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        String string = sb.toString();
        int i11 = 49666;
        while (true) {
            i11 ^= 49683;
            switch (i11) {
                case 17:
                    i11 = 49697;
                    continue;
                case 50:
                    str3 = string;
                    break;
                default:
                    continue;
            }
            String[] list = context.getAssets().list(str);
            int length = list.length;
            int i12 = 50813;
            while (true) {
                i12 ^= 50830;
                switch (i12) {
                    case 18:
                        break;
                    case 53:
                        File file = new File(str3);
                        int i13 = 51836;
                        while (true) {
                            i13 ^= 51853;
                            switch (i13) {
                                case 241:
                                    i13 = !z2 ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    break;
                                case 2025:
                                    boolean zExists = file.exists();
                                    int i14 = 52611;
                                    while (true) {
                                        i14 ^= 52628;
                                        switch (i14) {
                                            case 23:
                                                i14 = !zExists ? 52673 : 52704;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                break;
                                            case 116:
                                                int iM13262 = C0203.m13262();
                                                int i15 = 52735;
                                                while (true) {
                                                    i15 ^= 52752;
                                                    switch (i15) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                            if (iM13262 <= 0) {
                                                                i15 = 53479;
                                                            }
                                                            break;
                                                        case 7927:
                                                            System.out.println(Double.decode(C0203.m13264("VJxMvh8izUqMm2P0ixzKSD28EvCI")));
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i15 = 52797;
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        File file2 = new File(str2);
                        int i16 = 53510;
                        while (true) {
                            i16 ^= 53527;
                            switch (i16) {
                                case 17:
                                    i16 = !z ? 53572 : 53603;
                                    break;
                                case 50:
                                    break;
                                case 83:
                                    new File(file2.getParent()).mkdirs();
                                    break;
                                case 116:
                                    file2.mkdirs();
                                    int i17 = 53634;
                                    while (true) {
                                        i17 ^= 53651;
                                        switch (i17) {
                                            case 17:
                                                i17 = 53665;
                                                continue;
                                            case 50:
                                                break;
                                            default:
                                                continue;
                                        }
                                        e.printStackTrace();
                                        break;
                                    }
                                    break;
                            }
                        }
                        try {
                            inputStreamOpen = context.getAssets().open(str);
                            i = 53758;
                        } catch (IOException e2) {
                            ZipFile zipFile2 = new ZipFile(context.getPackageCodePath());
                            ZipEntry entry = zipFile2.getEntry(C0204.m13267(f682short, 1236, 7, 2593) + str);
                            int i18 = 54533;
                            while (true) {
                                i18 ^= 54550;
                                switch (i18) {
                                    case 19:
                                        if (entry != null) {
                                            i18 = 54626;
                                        }
                                        break;
                                    case 50:
                                        break;
                                    case 85:
                                        inputStream = null;
                                        break;
                                    case 116:
                                        inputStream = zipFile2.getInputStream(entry);
                                        break;
                                    default:
                                        continue;
                                }
                                i18 = 54595;
                            }
                            int i19 = 54657;
                            while (true) {
                                i19 ^= 54674;
                                switch (i19) {
                                    case 19:
                                        i19 = inputStream != null ? 54719 : 55401;
                                        break;
                                    case 45:
                                        zipFile = zipFile2;
                                        inputStream2 = inputStream;
                                        break;
                                    case 50:
                                        break;
                                    case 3579:
                                        zipFile2.close();
                                        break;
                                }
                                return;
                            }
                        }
                        while (true) {
                            i ^= 53775;
                            switch (i) {
                                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                    i = 54440;
                                    continue;
                                case 1703:
                                    inputStream2 = inputStreamOpen;
                                    break;
                            }
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream2);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                            byte[] bArr = new byte[1048576];
                            while (true) {
                                int i20 = bufferedInputStream.read(bArr);
                                int i21 = 55432;
                                while (true) {
                                    i21 ^= 55449;
                                    switch (i21) {
                                        case 17:
                                            i21 = i20 <= 0 ? 55494 : 55525;
                                            break;
                                        case 62:
                                            break;
                                        case 95:
                                            break;
                                        case 124:
                                            bufferedOutputStream.write(bArr, 0, i20);
                                            int i22 = 55556;
                                            while (true) {
                                                i22 ^= 55573;
                                                switch (i22) {
                                                    case 17:
                                                        i22 = 55587;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                    bufferedInputStream.close();
                                    inputStream2.close();
                                    int i23 = 55680;
                                    while (true) {
                                        i23 ^= 55697;
                                        switch (i23) {
                                            case 17:
                                                i23 = zipFile == null ? 56393 : 56424;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                break;
                                            case 1529:
                                                zipFile.close();
                                                break;
                                        }
                                    }
                                    boolean zStartsWith = str2.startsWith(C0207.m13281(f682short, 1243, 6, 2133));
                                    int i24 = 56455;
                                    while (true) {
                                        i24 ^= 56472;
                                        switch (i24) {
                                            case 31:
                                                if (zStartsWith) {
                                                    i24 = 56548;
                                                }
                                                break;
                                            case 62:
                                                break;
                                            case 93:
                                                break;
                                            case 124:
                                                file.setReadable(true, false);
                                                file.setWritable(true, false);
                                                file.setExecutable(true, false);
                                                int i25 = 56579;
                                                while (true) {
                                                    i25 ^= 56596;
                                                    switch (i25) {
                                                        case 23:
                                                            i25 = 56610;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i24 = 56517;
                                    }
                                }
                            }
                        }
                        break;
                    case 243:
                        i12 = length <= 0 ? 50875 : 51557;
                        break;
                    case 4075:
                        new File(str3).mkdirs();
                        int length2 = list.length;
                        while (true) {
                            int i26 = 51588;
                            while (true) {
                                i26 ^= 51605;
                                switch (i26) {
                                    case 17:
                                        i26 = i2 >= length2 ? 51650 : 51681;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        break;
                                    case 116:
                                        m13229(context, str + strM13263 + list[i2], str2, z, z2);
                                        i2++;
                                        int i27 = 51712;
                                        while (true) {
                                            i27 ^= 51729;
                                            switch (i27) {
                                                case 17:
                                                    i27 = 51743;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                                break;
                            }
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13230(Bitmap bitmap, String str) {
        try {
            File file = new File(str);
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Exception e) {
            C0203.m13263(f682short, 1249, 6, 671);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13231(String str, String str2, boolean z) {
        try {
            ZipFile zipFile = new ZipFile(f696);
            ZipEntry entry = zipFile.getEntry(C0203.m13263(f682short, 1255, 7, 675) + str);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = entry == null ? 1678 : 1709;
                        break;
                    case 204:
                        long size = entry.getSize();
                        File[] fileArrListFiles = f695.getFilesDir().getParentFile().listFiles();
                        int length = fileArrListFiles.length;
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            C0204.m13267(f682short, 1262, 6, 2924);
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = i3 >= length ? 1802 : 1833;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        String str3 = C0207.m13281(f682short, 1346, 4, 1307) + str;
                                        m13229(f695, str, str2, false, true);
                                        int i5 = 51836;
                                        while (true) {
                                            i5 ^= 51853;
                                            switch (i5) {
                                                case 241:
                                                    i5 = !z ? 52549 : 52580;
                                                    break;
                                                case 1963:
                                                    break;
                                                case 1992:
                                                    break;
                                                case 2025:
                                                    f700 = true;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 500:
                                        File file = fileArrListFiles[i3];
                                        boolean zIsDirectory = file.isDirectory();
                                        int i6 = 1864;
                                        while (true) {
                                            i6 ^= 1881;
                                            switch (i6) {
                                                case 17:
                                                    i6 = !zIsDirectory ? 48705 : 48736;
                                                    break;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean zCanRead = file.canRead();
                                                    int i7 = 48767;
                                                    while (true) {
                                                        i7 ^= 48784;
                                                        switch (i7) {
                                                            case 14:
                                                                break;
                                                            case 45:
                                                                break;
                                                            case Base64.mimeLineLength /* 76 */:
                                                                File[] fileArrListFiles2 = file.listFiles();
                                                                int length2 = fileArrListFiles2.length;
                                                                int i8 = 0;
                                                                while (true) {
                                                                    int i9 = 48891;
                                                                    while (true) {
                                                                        i9 ^= 48908;
                                                                        switch (i9) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                break;
                                                                            case 503:
                                                                                i9 = i8 >= length2 ? 48953 : 49635;
                                                                                break;
                                                                            case 32495:
                                                                                File file2 = fileArrListFiles2[i8];
                                                                                boolean zIsFile = file2.isFile();
                                                                                int i10 = 49666;
                                                                                while (true) {
                                                                                    i10 ^= 49683;
                                                                                    switch (i10) {
                                                                                        case 17:
                                                                                            i10 = !zIsFile ? 49728 : 49759;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case Base64.mimeLineLength /* 76 */:
                                                                                            boolean zCanRead2 = file2.canRead();
                                                                                            int i11 = 49790;
                                                                                            while (true) {
                                                                                                i11 ^= 49807;
                                                                                                switch (i11) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 51:
                                                                                                        break;
                                                                                                    case 84:
                                                                                                        long length3 = file2.length();
                                                                                                        int i12 = 49914;
                                                                                                        while (true) {
                                                                                                            i12 ^= 49931;
                                                                                                            switch (i12) {
                                                                                                                case 497:
                                                                                                                    i12 = length3 != size ? 50627 : 50658;
                                                                                                                    break;
                                                                                                                case 1711:
                                                                                                                    break;
                                                                                                                case 1736:
                                                                                                                    break;
                                                                                                                case 1769:
                                                                                                                    String str4 = C0204.m13267(f682short, 1268, 8, 2647) + str + C0205.m13272(f682short, 1276, 53, 1731);
                                                                                                                    int i13 = 50689;
                                                                                                                    while (true) {
                                                                                                                        i13 ^= 50706;
                                                                                                                        switch (i13) {
                                                                                                                            case 19:
                                                                                                                                if (z) {
                                                                                                                                    i13 = 50782;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 45:
                                                                                                                                f706 = file2.getAbsolutePath();
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                break;
                                                                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                                                                f711 = file2.getAbsolutePath();
                                                                                                                                int i14 = 50813;
                                                                                                                                while (true) {
                                                                                                                                    i14 ^= 50830;
                                                                                                                                    switch (i14) {
                                                                                                                                        case 18:
                                                                                                                                            break;
                                                                                                                                        case 243:
                                                                                                                                            i14 = 50844;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i13 = 50751;
                                                                                                                    }
                                                                                                                    zipFile.close();
                                                                                                                    C0205.m13272(f682short, 1329, 17, 2529);
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 241:
                                                                                                        i11 = !zCanRead2 ? 49852 : 49883;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 83:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i8++;
                                                                                int i15 = 51588;
                                                                                while (true) {
                                                                                    i15 ^= 51605;
                                                                                    switch (i15) {
                                                                                        case 17:
                                                                                            i15 = 51619;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i7 = !zCanRead ? 48829 : 48860;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        i2 = i3 + 1;
                                        int i16 = 51712;
                                        while (true) {
                                            i16 ^= 51729;
                                            switch (i16) {
                                                case 17:
                                                    i16 = 51743;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return;
            }
            zipFile.close();
            int i17 = 52611;
            while (true) {
                i17 ^= 52628;
                switch (i17) {
                    case 23:
                        i17 = 52642;
                        break;
                    case 54:
                        return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m13232(Intent intent) {
        StringBuilder sb;
        String className;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = intent != null ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    String action = intent.getAction();
                    C0204.m13267(f682short, 1350, 6, 1546);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = action == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zEquals = intent.getAction().equals(C0205.m13272(f682short, 1356, 26, 2612));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zEquals ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            Uri data = intent.getData();
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        String string = data.toString();
                                                        String str = C0205.m13272(f682short, 1382, 4, 654) + string;
                                                        boolean zContains = string.contains(C0207.m13281(f682short, 1386, 15, 2889));
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i5 = !zContains ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    boolean zContains2 = string.contains(C0205.m13272(f682short, 1401, 9, 1806));
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = !zContains2 ? 49728 : 49759;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        C0205.m13272(f682short, 1410, 14, 2801);
                                                        boolean zStartsWith = string.startsWith(C0205.m13272(f682short, 1424, 6, 2009));
                                                        int i7 = 49790;
                                                        while (true) {
                                                            i7 ^= 49807;
                                                            switch (i7) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    boolean zStartsWith2 = string.startsWith(C0205.m13272(f682short, 1430, 5, 1469));
                                                                    int i8 = 49914;
                                                                    while (true) {
                                                                        i8 ^= 49931;
                                                                        switch (i8) {
                                                                            case 497:
                                                                                i8 = !zStartsWith2 ? 50658 : 50627;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                boolean zStartsWith3 = string.startsWith(C0203.m13263(f682short, 1435, 7, 1852));
                                                                                int i9 = 50689;
                                                                                while (true) {
                                                                                    i9 ^= 50706;
                                                                                    switch (i9) {
                                                                                        case 19:
                                                                                            i9 = !zStartsWith3 ? 50782 : 50751;
                                                                                            break;
                                                                                        case 45:
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case Base64.mimeLineLength /* 76 */:
                                                                                            boolean zStartsWith4 = string.startsWith(C0205.m13272(f682short, 1442, 7, 532));
                                                                                            int i10 = 50813;
                                                                                            while (true) {
                                                                                                i10 ^= 50830;
                                                                                                switch (i10) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i10 = !zStartsWith4 ? 50875 : 51557;
                                                                                                        break;
                                                                                                    case 4075:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i7 = !zStartsWith ? 49883 : 49852;
                                                                    break;
                                                            }
                                                        }
                                                        C0205.m13272(f682short, 1449, 19, 2619);
                                                        break;
                                                    case 239:
                                                        i4 = data == null ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                boolean zEquals2 = intent.getAction().equals(C0207.m13281(f682short, 1468, 23, 603));
                                int i11 = 51588;
                                while (true) {
                                    i11 ^= 51605;
                                    switch (i11) {
                                        case 17:
                                            i11 = !zEquals2 ? 51650 : 51681;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            break;
                                        case 116:
                                            C0203.m13263(f682short, 1491, 15, 2409);
                                            int i12 = 51712;
                                            while (true) {
                                                i12 ^= 51729;
                                                switch (i12) {
                                                    case 17:
                                                        i12 = 51743;
                                                        continue;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    ComponentName component = intent.getComponent();
                    int i13 = 51836;
                    while (true) {
                        i13 ^= 51853;
                        switch (i13) {
                            case 241:
                                i13 = component == null ? 52549 : 52580;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                break;
                            case 2025:
                                int i14 = 0;
                                while (true) {
                                    int length = f683.length;
                                    int i15 = 52611;
                                    while (true) {
                                        i15 ^= 52628;
                                        switch (i15) {
                                            case 23:
                                                i15 = i14 >= length ? 52673 : 52704;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                int i16 = 0;
                                                while (true) {
                                                    int length2 = f686.length;
                                                    int i17 = 53758;
                                                    while (true) {
                                                        i17 ^= 53775;
                                                        switch (i17) {
                                                            case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                                                i17 = i16 >= length2 ? 54471 : 54502;
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                boolean zEquals3 = intent.getComponent().getPackageName().equals(f686[i16]);
                                                                int i18 = 54533;
                                                                while (true) {
                                                                    i18 ^= 54550;
                                                                    switch (i18) {
                                                                        case 19:
                                                                            i18 = !zEquals3 ? 54595 : 54626;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 85:
                                                                            i16++;
                                                                            int i19 = 55432;
                                                                            while (true) {
                                                                                i19 ^= 55449;
                                                                                switch (i19) {
                                                                                    case 17:
                                                                                        i19 = 55463;
                                                                                        break;
                                                                                    case 62:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 116:
                                                                            sb = new StringBuilder(C0205.m13272(f682short, 1511, 5, 3241));
                                                                            className = intent.getComponent().getPackageName();
                                                                            int i20 = 54657;
                                                                            while (true) {
                                                                                i20 ^= 54674;
                                                                                switch (i20) {
                                                                                    case 19:
                                                                                        i20 = 54688;
                                                                                        continue;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 116:
                                                boolean zEquals4 = intent.getComponent().getClassName().equals(f683[i14]);
                                                int i21 = 52735;
                                                while (true) {
                                                    i21 ^= 52752;
                                                    switch (i21) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            i14++;
                                                            int i22 = 53634;
                                                            while (true) {
                                                                i22 ^= 53651;
                                                                switch (i22) {
                                                                    case 17:
                                                                        i22 = 53665;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                            i21 = !zEquals4 ? 52797 : 53479;
                                                            break;
                                                        case 7927:
                                                            sb = new StringBuilder(C0205.m13272(f682short, 1506, 5, 646));
                                                            className = intent.getComponent().getClassName();
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }
                                sb.append(className);
                                break;
                        }
                    }
                    String dataString = intent.getDataString();
                    int i23 = 55556;
                    while (true) {
                        i23 ^= 55573;
                        switch (i23) {
                            case 17:
                                i23 = dataString == null ? 55618 : 55649;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                boolean zContains3 = dataString.contains(C0204.m13267(f682short, 1516, 27, 2949));
                                int i24 = 55680;
                                while (true) {
                                    i24 ^= 55697;
                                    switch (i24) {
                                        case 17:
                                            i24 = !zContains3 ? 56393 : 56424;
                                            break;
                                        case 1467:
                                            break;
                                        case 1496:
                                            break;
                                        case 1529:
                                            String str2 = C0203.m13263(f682short, 1543, 11, 582) + dataString;
                                            int i25 = 56455;
                                            while (true) {
                                                i25 ^= 56472;
                                                switch (i25) {
                                                    case 31:
                                                        i25 = 56486;
                                                        continue;
                                                    case 62:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    int i26 = 0;
                    while (true) {
                        String[] strArr = f691;
                        int length3 = strArr.length;
                        int i27 = 56579;
                        while (true) {
                            i27 ^= 56596;
                            switch (i27) {
                                case 23:
                                    i27 = i26 >= length3 ? 56641 : 1507472;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    break;
                                case 1564036:
                                    boolean zHasExtra = intent.hasExtra(strArr[i26]);
                                    int i28 = 1507503;
                                    while (true) {
                                        i28 ^= 1507520;
                                        switch (i28) {
                                            case 14:
                                                break;
                                            case 45:
                                                i26++;
                                                int i29 = 1507751;
                                                while (true) {
                                                    i29 ^= 1507768;
                                                    switch (i29) {
                                                        case 31:
                                                            i29 = 1508433;
                                                            break;
                                                        case 1513:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 111:
                                                i28 = !zHasExtra ? 1507565 : 1507596;
                                                break;
                                            case 460:
                                                sb = new StringBuilder(C0205.m13272(f682short, 1554, 7, 1987));
                                                sb.append(intent.getSerializableExtra(f691[i26]));
                                                int i30 = 1507627;
                                                while (true) {
                                                    i30 ^= 1507644;
                                                    switch (i30) {
                                                        case 23:
                                                            i30 = 1507658;
                                                            continue;
                                                        case 118:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    sb.toString();
                    int i31 = 53510;
                    while (true) {
                        i31 ^= 53527;
                        switch (i31) {
                            case 17:
                                i31 = 53541;
                                continue;
                            case 50:
                                break;
                        }
                    }
                    break;
            }
            return false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0139. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m13233(byte[] bArr, boolean z) {
        StringBuilder sb;
        byte[] bArrDigest;
        int length;
        int i;
        C0203.m13263(f682short, 1561, 6, 2658);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = bArr == null ? 1678 : 1709;
                    break;
                case 204:
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(C0207.m13281(f682short, 1567, 3, 3010));
                        messageDigest.update(bArr);
                        bArrDigest = messageDigest.digest();
                        length = bArrDigest.length;
                        i = 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                        sb = null;
                    }
                    while (true) {
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i >= length ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    sb = sb2;
                                    break;
                                case 500:
                                    sb2.append(String.format(C0204.m13267(f682short, 1570, 4, 2480), Byte.valueOf(bArrDigest[i])));
                                    i++;
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case Base64.mimeLineLength /* 76 */:
                                    int i6 = 0;
                                    while (true) {
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    break;
                                                case 503:
                                                    i7 = i6 >= 8 ? 48953 : 49635;
                                                    break;
                                                case 32495:
                                                    boolean zEqualsIgnoreCase = sb.toString().equalsIgnoreCase(new String[]{C0203.m13263(f682short, 1574, 32, 1234), C0205.m13272(f682short, 1606, 32, 748), C0203.m13263(f682short, 1638, 32, 3131), C0203.m13263(f682short, 1670, 32, 814), C0207.m13281(f682short, 1702, 32, 2729), C0204.m13267(f682short, 1734, 32, 1607), C0207.m13281(f682short, 1766, 32, 1610), C0207.m13281(f682short, 1798, 32, 1354)}[i6]);
                                                    int i8 = 49666;
                                                    while (true) {
                                                        i8 ^= 49683;
                                                        switch (i8) {
                                                            case 17:
                                                                i8 = !zEqualsIgnoreCase ? 49728 : 49759;
                                                                break;
                                                            case 50:
                                                                break;
                                                            case Base64.mimeLineLength /* 76 */:
                                                                int i9 = 49790;
                                                                while (true) {
                                                                    i9 ^= 49807;
                                                                    switch (i9) {
                                                                        case 18:
                                                                            break;
                                                                        case 51:
                                                                            break;
                                                                        case 84:
                                                                            C0204.m13267(f682short, 1830, 11, 2051);
                                                                            break;
                                                                        case 241:
                                                                            i9 = !z ? 49852 : 49883;
                                                                            break;
                                                                    }
                                                                }
                                                                return true;
                                                            case 83:
                                                                i6++;
                                                                int i10 = 49914;
                                                                while (true) {
                                                                    i10 ^= 49931;
                                                                    switch (i10) {
                                                                        case 497:
                                                                            i10 = 50596;
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 239:
                                    i5 = sb == null ? 48829 : 48860;
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        int i11 = 50689;
        while (true) {
            i11 ^= 50706;
            switch (i11) {
                case 19:
                    i11 = !z ? 50751 : 50782;
                    break;
                case 45:
                    return false;
                case 50:
                    break;
                case Base64.mimeLineLength /* 76 */:
                    C0207.m13281(f682short, 1841, 12, 777);
                    return false;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0021. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0064. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String[] m13234(String[] strArr, String... strArr2) {
        int i;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = strArr != null ? 1678 : 1709;
                    break;
                case 204:
                    return strArr;
                case 239:
                    HashSet hashSet = new HashSet(Arrays.asList(strArr2));
                    int length = strArr.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = i3 >= length ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zContains = hashSet.contains(strArr[i3]);
                                    int i6 = 1864;
                                    while (true) {
                                        i6 ^= 1881;
                                        switch (i6) {
                                            case 17:
                                                i6 = !zContains ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                i4++;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    i3++;
                                    int i7 = 48767;
                                    while (true) {
                                        i7 ^= 48784;
                                        switch (i7) {
                                            case 14:
                                                break;
                                            case 239:
                                                i7 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                            }
                            String[] strArr3 = new String[i4];
                            int length2 = strArr.length;
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                int i10 = 48891;
                                while (true) {
                                    i10 ^= 48908;
                                    switch (i10) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i10 = i9 >= length2 ? 48953 : 49635;
                                            break;
                                        case 32495:
                                            String str = strArr[i9];
                                            boolean zContains2 = hashSet.contains(str);
                                            int i11 = 49666;
                                            while (true) {
                                                i11 ^= 49683;
                                                switch (i11) {
                                                    case 17:
                                                        i11 = !zContains2 ? 49759 : 49728;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        strArr3[i8] = str;
                                                        i = i8 + 1;
                                                        break;
                                                    case 83:
                                                        i = i8;
                                                        break;
                                                }
                                            }
                                            i9++;
                                            int i12 = 49790;
                                            while (true) {
                                                i12 ^= 49807;
                                                switch (i12) {
                                                    case 18:
                                                        break;
                                                    case 241:
                                                        i12 = 49821;
                                                        break;
                                                }
                                            }
                                            i8 = i;
                                            break;
                                    }
                                    return strArr3;
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۠۟۟۟ۡ۟۟۟ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static Drawable m13235(Resources resources, int i) {
        return resources.getDrawable(i);
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۠۟۟۟ۡ۟۟۟ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13236(Context context) {
        int iM13245 = 0;
        C0203.m13263(f682short, 1853, 6, 1819);
        boolean z = f704;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    f704 = true;
                    try {
                        m13237(context);
                        String strM13209 = C0187.m13209(f696);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = strM13209 == null ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zM13233 = m13233(new Signature(strM13209).toByteArray(), true);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = !zM13233 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                f701 = true;
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i4 = 48922;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i5 = 48798;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        C0207.m13281(f682short, 1859, 50, 3133);
                        f714 = strM13209;
                        f715 = null;
                        f712 = null;
                        f711 = f696;
                        boolean z2 = f701;
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = !z2 ? 49759 : 49728;
                                    break;
                                case 50:
                                    break;
                                case Base64.mimeLineLength /* 76 */:
                                    C0113.f575 = new String[0];
                                    break;
                                case 83:
                                    break;
                            }
                        }
                        ClassLoader classLoader = f695.getClassLoader();
                        C0114.m13193(classLoader, C0113.f575, classLoader);
                        boolean z3 = f703;
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                    break;
                                case 51:
                                    break;
                                case 84:
                                    boolean zM13256 = m13256();
                                    int i8 = 49914;
                                    while (true) {
                                        i8 ^= 49931;
                                        switch (i8) {
                                            case 497:
                                                i8 = !zM13256 ? 50627 : 50658;
                                                break;
                                            case 1711:
                                                break;
                                            case 1736:
                                                break;
                                            case 1769:
                                                C0189.m13218(f695, f711, false);
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    i7 = !z3 ? 49852 : 49883;
                                    break;
                            }
                        }
                        String str = f713;
                        String str2 = f696;
                        String str3 = f711;
                        boolean z4 = f703;
                        int i9 = 50689;
                        while (true) {
                            i9 ^= 50706;
                            switch (i9) {
                                case 19:
                                    i9 = !z4 ? 50751 : 50782;
                                    break;
                                case 45:
                                    break;
                                case 50:
                                    break;
                                case Base64.mimeLineLength /* 76 */:
                                    iM13245 = m13245();
                                    int i10 = 50813;
                                    while (true) {
                                        i10 ^= 50830;
                                        switch (i10) {
                                            case 18:
                                                break;
                                            case 243:
                                                i10 = 50844;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                            }
                        }
                        C0114.NativeInit(str, str2, str3, iM13245, m13255(), m13253());
                        m13243();
                        f698 = true;
                        int i11 = 51588;
                        while (true) {
                            i11 ^= 51605;
                            switch (i11) {
                                case 17:
                                    i11 = 51619;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        e.getMessage();
                        return;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x01a6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x01c6. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۠۟۟ۡ۟۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m13237(Context context) {
        String[] strArrRN = C0112.RN();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = strArrRN == null ? 1678 : 1709;
                    break;
                case 204:
                    int length = strArrRN.length;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = length <= 0 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                f708 = strArrRN;
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        f695 = context;
        f713 = context.getPackageName();
        f685 = f695.getApplicationInfo().className;
        f696 = f695.getPackageCodePath();
        StringBuilder sb = new StringBuilder();
        sb.append(f695.getFilesDir().getParent());
        String strM13267 = C0204.m13267(f682short, 1909, 1, 1202);
        sb.append(strM13267);
        sb.append(m13247());
        f720 = sb.toString();
        f705 = m13249();
        String str = f720 + strM13267 + m13247();
        f706 = str;
        m13229(f695, f705, str, false, true);
        f710 = f708[4];
        f711 = f720 + strM13267 + f710;
        String strON = C0112.ON();
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    i3 = strON == null ? 48705 : 48736;
                    break;
                case 47384:
                    break;
                case 47417:
                    f711 = f695.getApplicationInfo().nativeLibraryDir + strM13267 + C0112.ON();
                    break;
                case 47483:
                    break;
            }
        }
        m13231(f710, f711, true);
        f714 = C0187.m13209(f711);
        boolean zExists = new File(f711).exists();
        f702 = zExists;
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    break;
                case Base64.mimeLineLength /* 76 */:
                    try {
                        ZipFile zipFile = new ZipFile(f711);
                        ZipEntry entry = zipFile.getEntry(C0203.m13263(f682short, 1910, 14, 1811));
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i5 = entry == null ? 48953 : 49635;
                                    break;
                                case 32495:
                                    f703 = true;
                                    break;
                            }
                        }
                        zipFile.close();
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = 49697;
                                    continue;
                                case 50:
                                    break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        break;
                    }
                    break;
                case 239:
                    i4 = !zExists ? 48829 : 48860;
                    break;
            }
        }
        m13241();
        f716 = f708[5];
        String str2 = f720 + strM13267 + f716;
        f717 = str2;
        m13229(f695, f716, str2, false, true);
        f719 = C0187.m13209(f717);
        m13239();
        boolean zEquals = f705.equals(f708[1]);
        int i7 = 49790;
        while (true) {
            i7 ^= 49807;
            switch (i7) {
                case 18:
                    break;
                case 51:
                    break;
                case 84:
                    boolean zEquals2 = f705.equals(f708[3]);
                    int i8 = 49914;
                    while (true) {
                        i8 ^= 49931;
                        switch (i8) {
                            case 497:
                                i8 = !zEquals2 ? 50627 : 50658;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                f699 = false;
                                int i9 = 50813;
                                while (true) {
                                    i9 ^= 50830;
                                    switch (i9) {
                                        case 18:
                                            break;
                                        case 243:
                                            i9 = 50844;
                                            break;
                                    }
                                }
                                break;
                            case 1769:
                                int i10 = 50689;
                                while (true) {
                                    i10 ^= 50706;
                                    switch (i10) {
                                        case 19:
                                            i10 = 50720;
                                            break;
                                        case 50:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 241:
                    i7 = !zEquals ? 49883 : 49852;
                    break;
            }
        }
        f699 = true;
        m13251();
        f707 = C0112.class.getPackage().getName();
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Bitmap m13238(String str) {
        try {
            byte[] bArrDecode = android.util.Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x007d. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟۟۠ۤ۟۟۟۠ۥ۟۟۟۠ۦ۟۟۟۠ۧ۟۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m13239() {
        boolean z = f702;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1678 : 1709;
                    break;
                case 204:
                    try {
                        ZipFile zipFile = new ZipFile(f696);
                        ZipFile zipFile2 = new ZipFile(f711);
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                        while (true) {
                            boolean zHasMoreElements = enumerationEntries.hasMoreElements();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = !zHasMoreElements ? 1802 : 1833;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                        String name = zipEntryNextElement.getName();
                                        ZipEntry entry = zipFile.getEntry(name);
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = entry == null ? 48705 : 48736;
                                                    break;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    f690.put(Long.valueOf(entry.getCrc()), new Object[]{name, Long.valueOf(zipEntryNextElement.getCrc())});
                                                    int i4 = 48767;
                                                    while (true) {
                                                        i4 ^= 48784;
                                                        switch (i4) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i4 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                                zipFile.close();
                                zipFile2.close();
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 503:
                                            i5 = 48922;
                                            break;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۟۟۟۠ۤ۟۟۟۠ۥ۟۟۟۠ۦ۟۟۟۠ۧ۟۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Signature[] m13240(String str) {
        String str2 = f689.get(str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str2 == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = str2.equals("");
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zEquals ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                Signature[] signatureArr = {new Signature(str2)};
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return signatureArr;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ۟۟۟۟ۡ۠۟۟۟ۡۡ۟۟۟ۡۢ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m13241() {
        boolean z = f703;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1678 : 1709;
                    break;
                case 204:
                    boolean z2 = f700;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !z2 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                File[] fileArrListFiles = f695.getFilesDir().getParentFile().listFiles();
                                int length = fileArrListFiles.length;
                                int i3 = 0;
                                while (true) {
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = i3 >= length ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                File file = fileArrListFiles[i3];
                                                boolean zIsDirectory = file.isDirectory();
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            boolean zCanRead = file.canRead();
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i6 = !zCanRead ? 48953 : 49635;
                                                                        break;
                                                                    case 32495:
                                                                        File[] fileArrListFiles2 = file.listFiles();
                                                                        int length2 = fileArrListFiles2.length;
                                                                        int i7 = 0;
                                                                        while (true) {
                                                                            int i8 = 49666;
                                                                            while (true) {
                                                                                i8 ^= 49683;
                                                                                switch (i8) {
                                                                                    case 17:
                                                                                        i8 = i7 >= length2 ? 49728 : 49759;
                                                                                        break;
                                                                                    case 50:
                                                                                        break;
                                                                                    case Base64.mimeLineLength /* 76 */:
                                                                                        File file2 = fileArrListFiles2[i7];
                                                                                        boolean zIsFile = file2.isFile();
                                                                                        int i9 = 49790;
                                                                                        while (true) {
                                                                                            i9 ^= 49807;
                                                                                            switch (i9) {
                                                                                                case 18:
                                                                                                    break;
                                                                                                case 51:
                                                                                                    break;
                                                                                                case 84:
                                                                                                    boolean zCanRead2 = file2.canRead();
                                                                                                    int i10 = 49914;
                                                                                                    while (true) {
                                                                                                        i10 ^= 49931;
                                                                                                        switch (i10) {
                                                                                                            case 497:
                                                                                                                i10 = !zCanRead2 ? 50627 : 50658;
                                                                                                                break;
                                                                                                            case 1711:
                                                                                                                break;
                                                                                                            case 1736:
                                                                                                                break;
                                                                                                            case 1769:
                                                                                                                long length3 = file2.length();
                                                                                                                long length4 = new File(f711).length();
                                                                                                                int i11 = 50689;
                                                                                                                while (true) {
                                                                                                                    i11 ^= 50706;
                                                                                                                    switch (i11) {
                                                                                                                        case 19:
                                                                                                                            i11 = length3 == length4 ? 50751 : 50782;
                                                                                                                            break;
                                                                                                                        case 45:
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            break;
                                                                                                                        case Base64.mimeLineLength /* 76 */:
                                                                                                                            String strM13209 = C0187.m13209(file2.getAbsolutePath());
                                                                                                                            int i12 = 50813;
                                                                                                                            while (true) {
                                                                                                                                i12 ^= 50830;
                                                                                                                                switch (i12) {
                                                                                                                                    case 18:
                                                                                                                                        break;
                                                                                                                                    case 53:
                                                                                                                                        break;
                                                                                                                                    case 243:
                                                                                                                                        i12 = strM13209 == null ? 50875 : 51557;
                                                                                                                                        break;
                                                                                                                                    case 4075:
                                                                                                                                        boolean zEquals = strM13209.equals(f714);
                                                                                                                                        int i13 = 51588;
                                                                                                                                        while (true) {
                                                                                                                                            i13 ^= 51605;
                                                                                                                                            switch (i13) {
                                                                                                                                                case 17:
                                                                                                                                                    i13 = !zEquals ? 51650 : 51681;
                                                                                                                                                    break;
                                                                                                                                                case 54:
                                                                                                                                                    break;
                                                                                                                                                case 87:
                                                                                                                                                    break;
                                                                                                                                                case 116:
                                                                                                                                                    C0205.m13272(f682short, 1936, 6, 1204);
                                                                                                                                                    String str = C0203.m13263(f682short, 1924, 12, 2087) + file2.getAbsolutePath();
                                                                                                                                                    file2.delete();
                                                                                                                                                    file2.getParentFile().delete();
                                                                                                                                                    int iM13262 = C0203.m13262();
                                                                                                                                                    int i14 = 51712;
                                                                                                                                                    while (true) {
                                                                                                                                                        i14 ^= 51729;
                                                                                                                                                        switch (i14) {
                                                                                                                                                            case 14:
                                                                                                                                                                break;
                                                                                                                                                            case 17:
                                                                                                                                                                i14 = iM13262 > 0 ? 51774 : 51805;
                                                                                                                                                                break;
                                                                                                                                                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                                                                                                break;
                                                                                                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                                                                                                System.out.println(Long.valueOf(C0205.m13270("z7PKPWt3SquFMt4OLBx")));
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 241:
                                                                                                    i9 = !zIsFile ? 49852 : 49883;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        i7++;
                                                                                        int i15 = 51836;
                                                                                        while (true) {
                                                                                            i15 ^= 51853;
                                                                                            switch (i15) {
                                                                                                case 241:
                                                                                                    i15 = 52518;
                                                                                                    break;
                                                                                                case 1963:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 239:
                                                            i5 = !zIsDirectory ? 48829 : 48860;
                                                            break;
                                                    }
                                                }
                                                i3++;
                                                int i16 = 52611;
                                                while (true) {
                                                    i16 ^= 52628;
                                                    switch (i16) {
                                                        case 23:
                                                            i16 = 52642;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ۟۟۟۟ۡ۠۟۟۟ۡۡ۟۟۟ۡۢ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m13242(String str) {
        try {
            f695.getAssets().open(str).close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۡۤ۟۟۟ۡۥ۟۟۟ۡۦ۟۟۟ۡۧ۟۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m13243() {
        new File(f706).delete();
        new File(f717).delete();
        boolean z = f703;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1709 : 1678;
                    break;
                case 204:
                    new File(f711).delete();
                    f702 = false;
                    break;
                case 239:
                    break;
            }
        }
        int length = new File(f720).listFiles().length;
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    i2 = length > 0 ? 1802 : 1833;
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    new File(f720).delete();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۡۤ۟۟۟ۡۥ۟۟۟ۡۦ۟۟۟ۡۧ۟۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13244(String str) {
        try {
            Class<?> clsLoadClass = f695.getClassLoader().loadClass(str);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = clsLoadClass == null ? 1678 : 1709;
                        break;
                    case 204:
                        return true;
                    case 239:
                        break;
                }
            }
        } catch (Exception e) {
            Context context = f695;
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = context != null ? 1802 : 1833;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case 500:
                        C0204.m13267(f682short, 1942, 6, 796);
                        C0207.m13281(f682short, 1948, 45, 478);
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ۟۟۟۟ۢ۠۟۟۟ۢۡ۟۟۟ۢۢ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m13245() {
        int iN = C0112.N();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iN != 0 ? 1678 : 1709;
                    break;
                case 204:
                    return 0;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iN != 1 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = iN != 2 ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM13248 = m13248(C0207.m13281(f682short, 1993, 16, 1916));
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = !zM13248 ? 49728 : 49759;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                return 4;
                                                                            case 83:
                                                                                boolean zM132482 = m13248(C0203.m13263(f682short, 2009, 9, 548));
                                                                                int i7 = 49790;
                                                                                while (true) {
                                                                                    i7 ^= 49807;
                                                                                    switch (i7) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            boolean zM132483 = m13248(C0203.m13263(f682short, 2018, 9, 1911));
                                                                                            int i8 = 49914;
                                                                                            while (true) {
                                                                                                i8 ^= 49931;
                                                                                                switch (i8) {
                                                                                                    case 497:
                                                                                                        i8 = !zM132483 ? 50658 : 50627;
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        boolean zM13242 = m13242(C0204.m13267(f682short, 2027, 2, 1260));
                                                                                                        int i9 = 50689;
                                                                                                        while (true) {
                                                                                                            i9 ^= 50706;
                                                                                                            switch (i9) {
                                                                                                                case 19:
                                                                                                                    i9 = !zM13242 ? 50751 : 50782;
                                                                                                                    break;
                                                                                                                case 45:
                                                                                                                    boolean zM132422 = m13242(C0205.m13272(f682short, 2029, 2, 2217));
                                                                                                                    int i10 = 51588;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 51605;
                                                                                                                        switch (i10) {
                                                                                                                            case 17:
                                                                                                                                i10 = !zM132422 ? 51681 : 51650;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 87:
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                boolean zM132423 = m13242(C0204.m13267(f682short, 2031, 4, 549));
                                                                                                                                int i11 = 51712;
                                                                                                                                while (true) {
                                                                                                                                    i11 ^= 51729;
                                                                                                                                    switch (i11) {
                                                                                                                                        case 14:
                                                                                                                                            break;
                                                                                                                                        case 17:
                                                                                                                                            i11 = !zM132423 ? 51805 : 51774;
                                                                                                                                            break;
                                                                                                                                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                                                                            break;
                                                                                                                                        case Base64.mimeLineLength /* 76 */:
                                                                                                                                            boolean zM132424 = m13242(C0203.m13263(f682short, 2035, 14, 543));
                                                                                                                                            int i12 = 51836;
                                                                                                                                            while (true) {
                                                                                                                                                i12 ^= 51853;
                                                                                                                                                switch (i12) {
                                                                                                                                                    case 241:
                                                                                                                                                        i12 = !zM132424 ? 52549 : 52580;
                                                                                                                                                        break;
                                                                                                                                                    case 1963:
                                                                                                                                                        break;
                                                                                                                                                    case 1992:
                                                                                                                                                        boolean zM132484 = m13248(C0205.m13272(f682short, 2049, 11, 2428));
                                                                                                                                                        int i13 = 52735;
                                                                                                                                                        while (true) {
                                                                                                                                                            i13 ^= 52752;
                                                                                                                                                            switch (i13) {
                                                                                                                                                                case 14:
                                                                                                                                                                    break;
                                                                                                                                                                case 45:
                                                                                                                                                                    break;
                                                                                                                                                                case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                                                                                                                                    i13 = !zM132484 ? 53479 : 52797;
                                                                                                                                                                    break;
                                                                                                                                                                case 7927:
                                                                                                                                                                    boolean zM132485 = m13248(C0207.m13281(f682short, 2060, 9, 1085));
                                                                                                                                                                    int i14 = 53510;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i14 ^= 53527;
                                                                                                                                                                        switch (i14) {
                                                                                                                                                                            case 17:
                                                                                                                                                                                i14 = !zM132485 ? 53572 : 53603;
                                                                                                                                                                                break;
                                                                                                                                                                            case 50:
                                                                                                                                                                                break;
                                                                                                                                                                            case 83:
                                                                                                                                                                                boolean zM132425 = m13242(C0204.m13267(f682short, 2069, 11, 584));
                                                                                                                                                                                int i15 = 53758;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i15 ^= 53775;
                                                                                                                                                                                    switch (i15) {
                                                                                                                                                                                        case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                                                                                                                                                                            i15 = !zM132425 ? 54471 : 54502;
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 1703:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 1736:
                                                                                                                                                                                            String str = f685;
                                                                                                                                                                                            int i16 = 54533;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i16 ^= 54550;
                                                                                                                                                                                                switch (i16) {
                                                                                                                                                                                                    case 19:
                                                                                                                                                                                                        i16 = str == null ? 54595 : 54626;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 50:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 85:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 116:
                                                                                                                                                                                                        boolean zEquals = str.equals(C0205.m13272(f682short, 2080, 16, 2953));
                                                                                                                                                                                                        int i17 = 54657;
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            i17 ^= 54674;
                                                                                                                                                                                                            switch (i17) {
                                                                                                                                                                                                                case 19:
                                                                                                                                                                                                                    i17 = !zEquals ? 54719 : 55401;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 45:
                                                                                                                                                                                                                    boolean zContains = f685.contains(C0203.m13263(f682short, 2096, 18, 1910));
                                                                                                                                                                                                                    int i18 = 55432;
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        i18 ^= 55449;
                                                                                                                                                                                                                        switch (i18) {
                                                                                                                                                                                                                            case 17:
                                                                                                                                                                                                                                i18 = !zContains ? 55494 : 55525;
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 62:
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 95:
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 124:
                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 50:
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 3579:
                                                                                                                                                                                                                    return 4;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        break;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            int i19 = 0;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                int i20 = 55556;
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    i20 ^= 55573;
                                                                                                                                                                                                    switch (i20) {
                                                                                                                                                                                                        case 17:
                                                                                                                                                                                                            i20 = i19 >= 4 ? 55618 : 55649;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        case 54:
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        case 87:
                                                                                                                                                                                                            boolean zM13244 = m13244(C0204.m13267(f682short, 2170, 25, 364));
                                                                                                                                                                                                            int i21 = 56579;
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                i21 ^= 56596;
                                                                                                                                                                                                                switch (i21) {
                                                                                                                                                                                                                    case 23:
                                                                                                                                                                                                                        i21 = !zM13244 ? 56641 : 1507472;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    case 54:
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    case 85:
                                                                                                                                                                                                                        return 0;
                                                                                                                                                                                                                    case 1564036:
                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        case 116:
                                                                                                                                                                                                            boolean zM132486 = m13248(new String[]{C0205.m13272(f682short, 2144, 16, 2486), C0205.m13272(f682short, 2160, 10, 2620), C0204.m13267(f682short, 2114, 12, 3209), C0207.m13281(f682short, 2126, 18, 1283)}[i19]);
                                                                                                                                                                                                            int i22 = 55680;
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                i22 ^= 55697;
                                                                                                                                                                                                                switch (i22) {
                                                                                                                                                                                                                    case 17:
                                                                                                                                                                                                                        i22 = !zM132486 ? 56393 : 56424;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    case 1467:
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    case 1496:
                                                                                                                                                                                                                        i19++;
                                                                                                                                                                                                                        int i23 = 56455;
                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                            i23 ^= 56472;
                                                                                                                                                                                                                            switch (i23) {
                                                                                                                                                                                                                                case 31:
                                                                                                                                                                                                                                    i23 = 56486;
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                case 62:
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    case 1529:
                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 1769:
                                                                                                                                                                                            return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 116:
                                                                                                                                                                                int i24 = 53634;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i24 ^= 53651;
                                                                                                                                                                                    switch (i24) {
                                                                                                                                                                                        case 17:
                                                                                                                                                                                            i24 = 53665;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        case 50:
                                                                                                                                                                                            break;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 2025:
                                                                                                                                                        int i25 = 52611;
                                                                                                                                                        while (true) {
                                                                                                                                                            i25 ^= 52628;
                                                                                                                                                            switch (i25) {
                                                                                                                                                                case 23:
                                                                                                                                                                    i25 = 52642;
                                                                                                                                                                    continue;
                                                                                                                                                                case 54:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                                                    int i26 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i26 ^= 50830;
                                                                                                                        switch (i26) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                i26 = 50844;
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            return 4;
                                                                                        case 84:
                                                                                            return 4;
                                                                                        case 241:
                                                                                            i7 = !zM132482 ? 49852 : 49883;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    i5 = iN != 4 ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    return 4;
                                                            }
                                                        }
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        return 3;
                                                    case 239:
                                                        i4 = iN != 3 ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            return 2;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                return 1;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ۟۟۟۟ۢ۠۟۟۟ۢۡ۟۟۟ۢۢ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m13246(String str) {
        int i;
        boolean z = false;
        try {
            FileReader fileReader = new FileReader(C0205.m13272(f682short, 2195, 15, 2364));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                            break;
                        case 49:
                            i2 = line == null ? 1678 : 1709;
                            break;
                        case 204:
                            boolean zContains = line.contains(str);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !zContains ? 1802 : 1833;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        z = true;
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
            i = 1864;
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            i ^= 1881;
            switch (i) {
                case 17:
                    i = 48674;
                    break;
                case 47483:
                    return z;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟۟ۢۤ۟۟۟ۢۥ۟۟۟ۢۦ۟۟۟ۢۧ۟۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m13247() {
        Random random = new Random();
        int iNextInt = random.nextInt(10);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= iNextInt + 3 ? 1678 : 1709;
                        break;
                    case 204:
                        sb.append(C0207.m13281(f682short, 2210, 26, 2025).charAt(random.nextInt(26)));
                        i++;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۢۤ۟۟۟ۢۥ۟۟۟ۢۦ۟۟۟ۢۧ۟۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13248(String str) {
        boolean zExists = new File(f695.getApplicationInfo().nativeLibraryDir + C0204.m13267(f682short, 2236, 1, 1951) + str).exists();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zExists ? 1678 : 1709;
                    break;
                case 204:
                    return true;
                case 239:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۟ۤ۟۟۟ۥۣ۟۟۟ۦۣۣ۟۟۟ۧ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m13249() {
        boolean zExists = new File(C0203.m13263(f682short, 2237, 15, 1222)).exists();
        String strM13281 = C0207.m13281(f682short, 2252, 34, 1473);
        String strM13272 = C0205.m13272(f682short, 2286, 32, 1179);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zExists ? 1709 : 1678;
                    break;
                case 204:
                    boolean zExists2 = new File(C0205.m13272(f682short, 2318, 19, 993)).exists();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zExists2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zContains = Build.CPU_ABI.contains(C0205.m13272(f682short, 2337, 3, 1104));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zContains ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            boolean zM13246 = m13246(strM13272);
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM132462 = m13246(strM13281);
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = !zM132462 ? 49728 : 49759;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case Base64.mimeLineLength /* 76 */:
                                                                    return f708[3];
                                                                case 83:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        i4 = !zM13246 ? 48953 : 49635;
                                                        break;
                                                    case 32495:
                                                        return f708[2];
                                                }
                                            }
                                            break;
                                        case 47417:
                                            int i6 = 48767;
                                            while (true) {
                                                i6 ^= 48784;
                                                switch (i6) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i6 = 48798;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        boolean zM132463 = m13246(C0204.m13267(f682short, 2340, 15, 1908));
        int i7 = 49790;
        while (true) {
            i7 ^= 49807;
            switch (i7) {
                case 18:
                    break;
                case 51:
                    boolean zM132464 = m13246(strM13272);
                    int i8 = 49914;
                    while (true) {
                        i8 ^= 49931;
                        switch (i8) {
                            case 497:
                                i8 = !zM132464 ? 50627 : 50658;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                boolean zM132465 = m13246(C0207.m13281(f682short, 2355, 19, 1588));
                                int i9 = 50689;
                                while (true) {
                                    i9 ^= 50706;
                                    switch (i9) {
                                        case 19:
                                            i9 = !zM132465 ? 50751 : 50782;
                                            break;
                                        case 45:
                                            boolean zM132466 = m13246(strM13281);
                                            int i10 = 50813;
                                            while (true) {
                                                i10 ^= 50830;
                                                switch (i10) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i10 = !zM132466 ? 50875 : 51557;
                                                        break;
                                                    case 4075:
                                                        return f708[1];
                                                }
                                            }
                                            break;
                                        case 50:
                                            break;
                                        case Base64.mimeLineLength /* 76 */:
                                            return f708[1];
                                    }
                                }
                                break;
                            case 1769:
                                return f708[0];
                        }
                    }
                    break;
                case 84:
                    return f708[0];
                case 241:
                    i7 = !zM132463 ? 49852 : 49883;
                    break;
            }
        }
        return C0204.m13267(f682short, 2374, 5, 1952);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0064. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۣ۟۟۟ۤ۟۟۟ۥۣ۟۟۟ۦۣۣ۟۟۟ۧ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13250(String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str != null ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    boolean zEquals = str.equals(f713);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zEquals ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zContains = f713.contains(C0203.m13263(f682short, 2379, 6, 1443));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zContains ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zContains2 = f713.contains(C0205.m13272(f682short, 2385, 9, 2033));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        break;
                                                    case 239:
                                                        i4 = !zContains2 ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                lja_app = true;
                                boolean z = lja_app;
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            int i6 = 0;
                                            while (true) {
                                                String[] strArr = f686;
                                                int length = strArr.length;
                                                int i7 = 51712;
                                                while (true) {
                                                    i7 ^= 51729;
                                                    switch (i7) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            i7 = i6 >= length ? 51774 : 51805;
                                                            break;
                                                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            boolean zEquals2 = str.equals(strArr[i6]);
                                                            int i8 = 51836;
                                                            while (true) {
                                                                i8 ^= 51853;
                                                                switch (i8) {
                                                                    case 241:
                                                                        i8 = !zEquals2 ? 52549 : 52580;
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                    case 1992:
                                                                        i6++;
                                                                        int i9 = 52611;
                                                                        while (true) {
                                                                            i9 ^= 52628;
                                                                            switch (i9) {
                                                                                case 23:
                                                                                    i9 = 52642;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2025:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 503:
                                            i5 = !z ? 48953 : 49635;
                                            break;
                                        case 32495:
                                            int i10 = 0;
                                            while (true) {
                                                int length2 = f693.length;
                                                int i11 = 49666;
                                                while (true) {
                                                    i11 ^= 49683;
                                                    switch (i11) {
                                                        case 17:
                                                            i11 = i10 >= length2 ? 49728 : 49759;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            boolean zContains3 = str.toLowerCase().contains(f693[i10].toLowerCase());
                                                            int i12 = 49790;
                                                            while (true) {
                                                                i12 ^= 49807;
                                                                switch (i12) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        i10++;
                                                                        int i13 = 49914;
                                                                        while (true) {
                                                                            i13 ^= 49931;
                                                                            switch (i13) {
                                                                                case 497:
                                                                                    i13 = 50596;
                                                                                    break;
                                                                                case 1711:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 84:
                                                                        break;
                                                                    case 241:
                                                                        i12 = !zContains3 ? 49852 : 49883;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            int i14 = 0;
                                                            while (true) {
                                                                String[] strArr2 = f688;
                                                                int length3 = strArr2.length;
                                                                int i15 = 50689;
                                                                while (true) {
                                                                    i15 ^= 50706;
                                                                    switch (i15) {
                                                                        case 19:
                                                                            i15 = i14 >= length3 ? 50751 : 50782;
                                                                            break;
                                                                        case 45:
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case Base64.mimeLineLength /* 76 */:
                                                                            boolean zEquals3 = str.equals(strArr2[i14]);
                                                                            int i16 = 50813;
                                                                            while (true) {
                                                                                i16 ^= 50830;
                                                                                switch (i16) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 53:
                                                                                        i14++;
                                                                                        int i17 = 51588;
                                                                                        while (true) {
                                                                                            i17 ^= 51605;
                                                                                            switch (i17) {
                                                                                                case 17:
                                                                                                    i17 = 51619;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 243:
                                                                                        i16 = !zEquals3 ? 50875 : 51557;
                                                                                        break;
                                                                                    case 4075:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                break;
                        }
                    }
                    break;
            }
            return true;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001b. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟ۤ۟۟۟۟ۤ۠۟۟۟ۤۡ۟۟۟ۤۢ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m13251() {
        String[][] strArrRW = C0112.RW();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = strArrRW == null ? 1678 : 1709;
                    break;
                case 204:
                    int length = strArrRW.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 >= length ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    String[] strArr = strArrRW[i2];
                                    f721.put(strArr[0], strArr[1]);
                                    i2++;
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                            break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ۟۟۟۟ۤ۠۟۟۟ۤۡ۟۟۟ۤۢ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m13252(String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str != null ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    int i2 = 0;
                    while (true) {
                        String[] strArr = f688;
                        int length = strArr.length;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 >= length ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zEquals = str.equals(strArr[i2]);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = !zEquals ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                i2++;
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i5 = 48798;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۤ۟۟۟ۥ۟۟۟ۦ۟۟۟ۧ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13253() {
        int iDH = C0112.DH();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iDH != 0 ? 1678 : 1709;
                    break;
                case 204:
                    return false;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iDH != 1 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case 500:
                                return true;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۤ۟۟۟ۥ۟۟۟ۦ۟۟۟ۧ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13254(String str) {
        int iYL = C0112.YL();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iYL != 0 ? 1678 : 1709;
                    break;
                case 204:
                    return false;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iYL != 1 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case 500:
                                return true;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۤۤ۟۟۟ۤۥ۟۟۟ۤۦ۟۟۟ۤۧ۟۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m13255() {
        int iHC = C0112.HC();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iHC != 0 ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iHC != 1 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                String str = f707;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = str == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zStartsWith = str.startsWith(C0207.m13281(f682short, 2394, 3, 2141));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        boolean zM13248 = m13248(C0203.m13263(f682short, 2397, 16, 1515));
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    if (!zM13248) {
                                                                        i5 = 49759;
                                                                    }
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case Base64.mimeLineLength /* 76 */:
                                                                    boolean zM13242 = m13242(C0207.m13281(f682short, 2413, 10, 3079));
                                                                    int i6 = 49790;
                                                                    while (true) {
                                                                        i6 ^= 49807;
                                                                        switch (i6) {
                                                                            case 18:
                                                                                break;
                                                                            case 51:
                                                                                break;
                                                                            case 84:
                                                                                boolean zM132422 = m13242(C0207.m13281(f682short, 2423, 6, 937));
                                                                                int i7 = 49914;
                                                                                while (true) {
                                                                                    i7 ^= 49931;
                                                                                    switch (i7) {
                                                                                        case 497:
                                                                                            i7 = !zM132422 ? 50658 : 50627;
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            break;
                                                                                        case 1769:
                                                                                            boolean zM132423 = m13242(C0203.m13263(f682short, 2429, 2, 2826));
                                                                                            int i8 = 50689;
                                                                                            while (true) {
                                                                                                i8 ^= 50706;
                                                                                                switch (i8) {
                                                                                                    case 19:
                                                                                                        i8 = !zM132423 ? 50751 : 50782;
                                                                                                        break;
                                                                                                    case 45:
                                                                                                        boolean zM132482 = m13248(C0205.m13272(f682short, 2431, 9, 1706));
                                                                                                        int i9 = 51588;
                                                                                                        while (true) {
                                                                                                            i9 ^= 51605;
                                                                                                            switch (i9) {
                                                                                                                case 17:
                                                                                                                    if (!zM132482) {
                                                                                                                        i9 = 51681;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 87:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    boolean zM132424 = m13242(C0203.m13263(f682short, 2440, 2, 994));
                                                                                                                    int i10 = 51712;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 51729;
                                                                                                                        switch (i10) {
                                                                                                                            case 14:
                                                                                                                                break;
                                                                                                                            case 17:
                                                                                                                                if (!zM132424) {
                                                                                                                                    i10 = 51805;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                                                                break;
                                                                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                                                                boolean zM132483 = m13248(C0204.m13267(f682short, 2442, 16, AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN));
                                                                                                                                int i11 = 51836;
                                                                                                                                while (true) {
                                                                                                                                    i11 ^= 51853;
                                                                                                                                    switch (i11) {
                                                                                                                                        case 241:
                                                                                                                                            if (zM132483) {
                                                                                                                                                i11 = 52580;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 1963:
                                                                                                                                            break;
                                                                                                                                        case 1992:
                                                                                                                                            break;
                                                                                                                                        case 2025:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    i11 = 52549;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i10 = 51774;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            i9 = 51650;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        break;
                                                                                                    case Base64.mimeLineLength /* 76 */:
                                                                                                        int i12 = 50813;
                                                                                                        while (true) {
                                                                                                            i12 ^= 50830;
                                                                                                            switch (i12) {
                                                                                                                case 18:
                                                                                                                    break;
                                                                                                                case 243:
                                                                                                                    i12 = 50844;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 241:
                                                                                i6 = !zM13242 ? 49883 : 49852;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    break;
                                                            }
                                                            i5 = 49728;
                                                        }
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        int i13 = 48891;
                                                        while (true) {
                                                            i13 ^= 48908;
                                                            switch (i13) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i13 = 48922;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = !zStartsWith ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                break;
                        }
                    }
                    break;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۥ۟۟۟۟ۥ۠۟۟۟ۥۡ۟۟۟ۥۢ۟۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m13256() {
        int iJ = C0112.J();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iJ != 0 ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iJ != 1 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                int i3 = 0;
                                while (true) {
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = i3 >= 2 ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean zM13248 = m13248(new String[]{C0203.m13263(f682short, 2458, 13, 425), C0203.m13263(f682short, 2471, 12, 604)}[i3]);
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            i3++;
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 503:
                                                                        i6 = 48922;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            break;
                                                        case 239:
                                                            i5 = !zM13248 ? 48829 : 48860;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                break;
                        }
                    }
                    break;
            }
            return true;
        }
    }
}
