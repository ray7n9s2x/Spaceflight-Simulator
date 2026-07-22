package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
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
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends FrameLayout {
    public static volatile C0 J;
    public static boolean K;
    public static boolean L;
    public static boolean M;
    public static boolean N;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f233short = {396, 431, 442, 442, 443, 511, 407, 446, 444, 436, 2089, 2086, 2068, 2107, 2087, 2110, 2092, 2082, 2085, 2068, 2093, 2087, 2084, 2090, 2111, 2068, 2086, 2094, 2085, 2110, 2068, 2111, 2090, 2089, 2068, 2104, 2107, 2094, 2094, 2095, 2149, 2107, 2085, 2092, 524, 568, 569, 546, 608, 558, 545, 548, 558, 550, 552, 575, 992, 1007, 989, 1010, 1006, 1015, 997, 1003, 1004, 989, 996, 1006, 1005, 995, 1014, 989, 1007, 999, 1004, 1015, 989, 1014, 995, 992, 989, 995, 1015, 1014, 1005, 989, 993, 1006, 1003, 993, 1001, 940, 1010, 1004, 997, 1876, 1915, 1918, 1908, 1916, 1850, 1861, 1906, 1908, 1912, 1893, 1907, 1906, 1893, 1521, 1534, 1484, 1507, 1535, 1510, 1524, 1530, 1533, 1484, 1525, 1535, 1532, 1522, 1511, 1484, 1534, 1526, 1533, 1510, 1484, 1511, 1522, 1521, 1484, 1504, 1505, 1530, 1507, 1511, 1484, 1520, 1535, 1530, 1520, 1528, 1469, 1507, 1533, 1524, 2089, 2152, 2098, 2106, 2106, 2106, 2106, 2106, 2106, 613, 629, 628, 629, 628, 629, 628, -29196, 29331, 21570, 502, 449, 455, 459, 470, 448, 449, 470, 826, 891, 801, 809, 809, 809, 809, 809, 809, 2719, 2750, 2801, 2691, 2740, 2738, 2750, 2723, 2741, 2801, 2690, 2740, 2749, 2740, 2738, 2725, 2740, 2741, 3027, 2963, 3012, 2963, 3012, 2963, 3012, 607, 592, 610, 589, 593, 584, 602, 596, 595, 610, 592, 600, 595, 584, 610, 596, 606, 594, 595, 531, 589, 595, 602, 935, 936, 922, 949, 937, 944, 930, 940, 939, 922, 931, 937, 938, 932, 945, 922, 936, 928, 939, 944, 922, 935, 932, 934, 942, 1003, 949, 939, 930, 432, 403, 401, 409, 3089, 3102, 3116, 3075, 3103, 3078, 3092, 3098, 3101, 3116, 3102, 3094, 3101, 3078, 3116, 3098, 3088, 3100, 3101, 3165, 3075, 3101, 3092, 3131, 3124, 3078, 3113, 3125, 3116, 3134, 3120, 3127, 3078, 3135, 3125, 3126, 3128, 3117, 3078, 3130, 3125, 3120, 3130, 3122, 3078, 3131, 3128, 3130, 3122, 3191, 3113, 3127, 3134, 987, 971, 986, 961, 984, 988, 1015, 960, 967, 965, 973, 804, 826, 829, 823, 828, 804, 1377, 1393, 1376, 1403, 1378, 1382, 1357, 1395, 1393, 1382, 1403, 1405, 1404, 1357, 1377, 1402, 1395, 1378, 1399, 425, 436, 436, 431, 314, 317, 319, 311, 269, 288, 317, 317, 294, 2796, 2812, 2797, 2806, 2799, 2795, 2752, 2807, 2800, 2802, 2810, 2752, 2796, 2807, 2814, 2799, 2810, 1334, 1329, 1331, 1339, 1281, 1340, 1343, 1341, 1333, 555, 556, 558, 550, 540, 545, 546, 544, 552, 540, 554, 565, 1971, 1955, 1970, 1961, 1968, 1972, 1951, 1961, 1955, 1951, 1954, 1953, 1955, 1963, 907, 908, 910, 902, 956, 913, 902, 896, 908, 913, 903, 1366, 1361, 1363, 1371, 1377, 1356, 1371, 1373, 1361, 1356, 1370, 1377, 1354, 1352, 1815, 1808, 1810, 1818, 1824, 1805, 1818, 1820, 1808, 1805, 1819, 1824, 1814, 1801, 1000, 1016, 1001, 1010, 1003, 1007, 964, 1010, 1016, 964, 1001, 1022, 1016, 1012, 1001, 1023, 2222, 2217, 2219, 2211, 2201, 2226, 2211, 2238, 2226, 826, 829, 831, 823, 781, 806, 823, 810, 806, 781, 827, 804, 556, 572, 557, 566, 559, 555, 512, 566, 572, 512, 555, 570, 551, 555, 2315, 2316, 2318, 2310, 2364, 2304, 2316, 2319, 2316, 2321, 738, 741, 743, 751, 725, 745, 741, 742, 741, 760, 725, 739, 764, 1623, 1607, 1622, 1613, 1620, 1616, 1659, 1613, 1607, 1659, 1607, 1611, 1608, 1611, 1622, 905, 910, 908, 900, 958, 911, 916, 908, 899, 900, 915, 1028, 1027, 1025, 1033, 1075, 1026, 1049, 1025, 1038, 1033, 1054, 1075, 1029, 1050, 858, 842, 859, 832, 857, 861, 886, 832, 842, 886, 839, 860, 836, 843, 844, 859, 2588, 2560, 2573, 2581, 2611, 2560, 2573, 2581, 2563, 2585, 2584, 1951, 1923, 1934, 1942, 1968, 1949, 1920, 1920, 1947, 1842, 1826, 1843, 1832, 1841, 1845, 1822, 1841, 1837, 1824, 1848, 1822, 1837, 1824, 1848, 1838, 1844, 1845, 1822, 1842, 1833, 1824, 1841, 1828, 844, 848, 861, 837, 867, 851, 844, 857, 846, 861, 840, 857, 867, 853, 842, 2302, 2286, 2303, 2276, 2301, 2297, 2258, 2276, 2286, 2258, 2303, 2296, 2275, 2275, 2276, 2275, 2282, 2258, 2301, 2273, 2284, 2292, 1650, 1646, 1635, 1659, 1629, 1638, 1643, 1649, 1650, 1646, 1635, 1659, 1629, 1643, 1652, 2744, 2728, 2745, 2722, 2747, 2751, 2708, 2722, 2728, 2708, 2744, 2723, 2724, 2748, 1728, 1730, 1759, 1754, 1749, 1747, 1732, 1775, 1758, 1745, 1757, 1749, 1141, 1129, 1124, 1148, 1114, 1126, 1129, 1130, 1142, 1120, 1114, 1129, 1124, 1148, 1130, 1136, 1137, 713, 729, 712, 723, 714, 718, 741, 714, 726, 731, 707, 741, 729, 726, 725, 713, 735, 741, 713, 722, 731, 714, 735, 2152, 2164, 2169, 2145, 2119, 2171, 2164, 2167, 2155, 2173, 2119, 2161, 2158, 2978, 2994, 2979, 3000, 2977, 2981, 2958, 3000, 2994, 2958, 2999, 3005, 3006, 2992, 2981, 2958, 2994, 3005, 3006, 2978, 2996, 2940, 2924, 2941, 2918, 2943, 2939, 2896, 2923, 2918, 2926, 2915, 2912, 2920, 2896, 2943, 2941, 2912, 2917, 2922, 2924, 2939, 2896, 2915, 2918, 2940, 2939, 2388, 2390, 2379, 2382, 2369, 2375, 2384, 2427, 2376, 2381, 2391, 2384, 2427, 2380, 2369, 2376, 2388, 2960, 2944, 2961, 2954, 2963, 2967, 3004, 2954, 2944, 3004, 2955, 2950, 2959, 2963, 3072, 3074, 3103, 3098, 3093, 3091, 3076, 3119, 3100, 3097, 3075, 3076, 3119, 3091, 3074, 3093, 3089, 3076, 3093, 3173, 3175, 3194, 3198, 3184, 3190, 3169, 3146, 3184, 3192, 3173, 3169, 3180, 3146, 3171, 3196, 3184, 3170, 1642, 1658, 1643, 1648, 1641, 1645, 1606, 1641, 1643, 1654, 1651, 1660, 1658, 1645, 1606, 1658, 1643, 1660, 1656, 1645, 1660, 1606, 1642, 1649, 1656, 1641, 1660, 2370, 2368, 2397, 2392, 2391, 2385, 2374, 2413, 2398, 2395, 2369, 2374, 2413, 2372, 2395, 2391, 2373, 543, 527, 542, 517, 540, 536, 563, 520, 517, 525, 512, 515, 523, 563, 540, 542, 515, 518, 521, 527, 536, 1512, 1514, 1527, 1522, 1533, 1531, 1516, 1479, 1530, 1529, 1531, 1523, 2006, 1990, 2007, 1996, 2005, 2001, 2042, 1996, 1990, 2042, 2002, 1997, 1996, 2001, 1984, 2042, 1991, 1988, 1990, 1998, 2293, 2295, 2282, 2287, 2272, 2278, 2289, 2266, 2289, 2284, 2289, 2281, 2272, 2723, 2721, 2748, 2745, 2742, 2736, 2727, 2700, 2720, 2742, 2727, 
    2727, 2746, 2749, 2740, 716, 718, 723, 726, 729, 735, 712, 739, 735, 733, 722, 735, 729, 720, 2800, 2784, 2801, 2794, 2803, 2807, 2780, 2803, 2801, 2796, 2793, 2790, 2784, 2807, 2780, 2784, 2786, 2797, 2784, 2790, 2799, 2780, 2800, 2795, 2786, 2803, 2790, 1738, 1736, 1749, 1744, 1759, 1753, 1742, 1765, 1737, 1755, 1740, 1759, 293, 295, 314, 319, 304, 310, 289, 266, 313, 316, 294, 289, 454, 502, 487, 508, 485, 481, 455, 496, 502, 506, 487, 497, 472, 486, 498, 448, 481, 508, 505, 486, 443, 498, 496, 481, 476, 507, 486, 481, 500, 507, 502, 496, 445, 444, 443, 498, 496, 481, 449, 500, 503, 467, 505, 506, 500, 481, 472, 500, 508, 507, 473, 508, 486, 481, 496, 507, 496, 487, 445, 444, 431, 3300, 3312, 3313, 3287, 3287, 3287, 3287, 3287, 3287, 3287, 3287, 1442, 1458, 1443, 1464, 1441, 1445, 1422, 1461, 1464, 1456, 1469, 1470, 1462, 1422, 1456, 1458, 1445, 1464, 1470, 1471, 1471, 1469, 1450, 1463, 1457, 1456, 1409, 1469, 1471, 1456, 1469, 1467, 1458, 2948, 2950, 2961, 2956, 2954, 2955, 3002, 2967, 2944, 2966, 2960, 2952, 2944, 1428, 1430, 1409, 1436, 1434, 1435, 1450, 1414, 1428, 1411, 1424, 1196, 1198, 1209, 1188, 1186, 1187, 1170, 1185, 1188, 1214, 1209, 924, 911, 911, 903, 902, 1017, 1017, 2292, 2263, 2242, 2242, 2243, 2284, 2242, 2270, 432, 447, 417, 438, 441, 397, 435, 423, 422, 445, 397, 433, 445, 444, 436, 443, 437, 2415, 2350, 2420, 2428, 2428, 2428, 2428, 2428, 2428, 1674, 1705, 1724, 1724, 1725, 1682, 1724, 1696, 2043, 2036, 2026, 2045, 2034, 1990, 2040, 2028, 2029, 2038, 1990, 2042, 2038, 2039, 2047, 2032, 2046};
    public final int A;
    public final int B;
    public View.OnTouchListener C;
    public final int D;
    public final int E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public M0 a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public K0 e;
    public C0444t0 f;
    public View g;
    public final View h;
    public final View i;
    public final View j;
    public C0479z k;
    public final LinearLayout l;
    public ImageView m;
    public ImageView n;
    public TextView o;
    public final RelativeLayout p;
    public final FrameLayout q;
    public final LinearLayout r;
    public final LinearLayout s;
    public final TextView t;
    public final View u;
    public boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX INFO: renamed from: ۟ۢۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6912(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((C0) obj).getShow();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6913() {
        if (C0018.m1064() > 0) {
            return f233short;
        }
        return null;
    }

    public void setOnMenuOpenListener(InterfaceC0459v3 interfaceC0459v3) {
    }

    public C0(Activity activity) {
        super(activity);
        this.v = false;
        this.D = -1;
        this.E = -1;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = true;
        int iM4142 = C0039.m4142(50, activity);
        this.w = iM4142;
        this.x = C0039.m4142(45, activity);
        this.y = C0039.m4142(40, activity);
        this.z = C0039.m4142(16, activity);
        this.A = C0039.m4142(14, activity);
        this.B = C0039.m4142(8, activity);
        C0039.m4142(5, activity);
        C0039.m4142(346, activity);
        C0039.m4142(298, activity);
        if (m6912(this) > 1) {
            this.F = false;
            this.p = new RelativeLayout(activity);
            C0016.m687(C0037.m3885(this), new ViewGroup.LayoutParams(-2, -2));
            this.s = new LinearLayout(activity);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, iM4142);
            C0034.m3509(C0075.m6887(this), C0071.m5977());
            C0016.m687(C0075.m6887(this), layoutParams);
            C0025.m2098(C0075.m6887(this), 0);
            LinearLayout linearLayoutM7421 = C0078.m7421(this, activity, C0039.m4142(50, activity));
            this.l = linearLayoutM7421;
            C0065.m4689(C0075.m6887(this), linearLayoutM7421);
            this.r = new LinearLayout(activity);
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(C0039.m4142(245, activity), iM4142);
            C0034.m3509(C0019.m1249(this), C0071.m5977());
            C0016.m687(C0019.m1249(this), layoutParams2);
            C0025.m2098(C0019.m1249(this), 0);
            if (C0064.m4611()) {
                View view = new View(activity);
                this.h = view;
                FrameLayout frameLayoutM6570 = C0074.m6570(this, activity, C0069.m5807(m6913(), 0, 10, 479), C0036.m3678(m6913(), 10, 34, 2123), view);
                this.b = frameLayoutM6570;
                C0039.m4187(frameLayoutM6570, C0069.m5773(activity));
                C0065.m4689(C0019.m1249(this), C0018.m983(this));
                this.D = 0;
            }
            if (C0027.m2473()) {
                View view2 = new View(activity);
                this.i = view2;
                C0063.m4382(view2, 4);
                FrameLayout frameLayoutM65702 = C0074.m6570(this, activity, C0077.m7205(m6913(), 44, 12, 589), C0028.m2609(m6913(), 56, 39, 898), C0026.m2347(this));
                this.c = frameLayoutM65702;
                C0065.m4689(C0019.m1249(this), frameLayoutM65702);
                if (C0032.m3234(this) == -1) {
                    this.D = 1;
                }
                this.E = 1;
            }
            if (C0021.m1586()) {
                View view3 = new View(activity);
                this.j = view3;
                C0063.m4382(view3, 4);
                FrameLayout frameLayoutM65703 = C0074.m6570(this, activity, C0074.m6452(m6913(), 95, 14, 1815), C0036.m3678(m6913(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 40, 1427), C0066.m4859(this));
                this.d = frameLayoutM65703;
                C0065.m4689(C0019.m1249(this), frameLayoutM65703);
                if (C0032.m3234(this) == -1) {
                    this.D = 2;
                }
                this.E = 2;
            }
            C0065.m4689(C0075.m6887(this), C0019.m1249(this));
            C0065.m4689(C0037.m3885(this), C0075.m6887(this));
            this.q = new FrameLayout(activity);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            C0037.m3919(layoutParams3, C0039.m4142(58, activity), C0039.m4142(2, activity), 0, 0);
            C0019.m1232(layoutParams3, 3, C0072.m6212(C0075.m6887(this)));
            C0016.m687(C0037.m3803(this), layoutParams3);
            int iM3234 = C0032.m3234(this);
            if (iM3234 == 0) {
                C0030.m2929(this, iM3234, activity);
                C0017.m870(this, C0032.m3234(this), activity);
            }
            C0065.m4689(C0037.m3885(this), C0037.m3803(this));
            C0065.m4689(this, C0037.m3885(this));
            C0016.m706(this, activity, C0030.m2969(this));
            C0038.m4009(this, activity);
            return;
        }
        if (C0064.m4611()) {
            this.p = new RelativeLayout(activity);
            C0016.m687(C0037.m3885(this), new ViewGroup.LayoutParams(-2, -2));
            LinearLayout linearLayout = new LinearLayout(activity);
            ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-2, -2);
            C0034.m3509(linearLayout, C0071.m5977());
            C0016.m687(linearLayout, layoutParams4);
            C0025.m2098(linearLayout, 0);
            LinearLayout linearLayoutM74212 = C0078.m7421(this, activity, C0039.m4142(48, activity));
            this.l = linearLayoutM74212;
            C0065.m4689(linearLayout, linearLayoutM74212);
            K0 k0M6576 = C0074.m6576(this, activity);
            this.e = k0M6576;
            GradientDrawable gradientDrawable = new GradientDrawable();
            C0077.m7299(gradientDrawable, C0031.m2985(C0028.m2609(m6913(), 149, 9, 2058)));
            C0075.m6785(gradientDrawable, new float[]{C0039.m4142(0, activity), C0039.m4142(0, activity), C0039.m4142(8, activity), C0039.m4142(8, activity), C0039.m4142(8, activity), C0039.m4142(8, activity), C0039.m4142(0, activity), C0039.m4142(0, activity)});
            C0020.m1336(k0M6576, gradientDrawable);
            C0065.m4689(linearLayout, C0074.m6468(this));
            C0065.m4689(C0037.m3885(this), linearLayout);
            C0065.m4689(this, C0037.m3885(this));
            C0039.m4135(this, activity, C0030.m2969(this));
            C0073.m6434(this, activity);
            return;
        }
        boolean zM2473 = C0027.m2473();
        String strM3330 = C0033.m3330(m6913(), 158, 7, 582);
        if (zM2473) {
            this.p = new RelativeLayout(activity);
            C0016.m687(C0037.m3885(this), new ViewGroup.LayoutParams(-2, -2));
            C0039.m4187(C0037.m3885(this), C0075.m6795(activity));
            LinearLayout linearLayoutM1727 = C0022.m1727(this, activity);
            this.l = linearLayoutM1727;
            C0034.m3509(linearLayoutM1727, C0071.m5977());
            C0065.m4689(C0037.m3885(this), C0065.m4741(this));
            this.t = new TextView(activity);
            ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(C0039.m4142(240, activity), C0039.m4142(45, activity));
            C0066.m4801(C0078.m7394(this), 17);
            C0016.m687(C0078.m7394(this), layoutParams5);
            C0019.m1180(C0078.m7394(this), C0070.m5942(m6913(), 165, 3, 554));
            C0027.m2442(C0078.m7394(this), -1);
            C0016.m722(C0078.m7394(this), 2, 16.0f);
            C0022.m1661(C0078.m7394(this), C0035.m3633(1));
            this.u = new View(activity);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(C0039.m4142(240, activity), C0039.m4142(1, activity));
            C0019.m1232(layoutParams6, 3, C0072.m6212(C0065.m4741(this)));
            C0016.m687(C0072.m6145(this), layoutParams6);
            C0028.m2660(C0072.m6145(this), C0031.m2985(strM3330));
            C0065.m4689(C0037.m3885(this), C0078.m7394(this));
            C0065.m4689(C0037.m3885(this), C0072.m6145(this));
            C0444t0 c0444t0M1923 = C0023.m1923(this, activity);
            this.f = c0444t0M1923;
            C0030.m2936(c0444t0M1923, null);
            C0019.m1232((RelativeLayout.LayoutParams) C0039.m4105(C0078.m7386(this)), 3, C0072.m6212(C0065.m4741(this)));
            C0065.m4689(C0037.m3885(this), C0078.m7386(this));
            C0065.m4689(this, C0037.m3885(this));
            C0027.m2510(this, activity, C0030.m2969(this));
            C0063.m4333(this, activity);
            return;
        }
        if (C0021.m1586()) {
            this.p = new RelativeLayout(activity);
            C0016.m687(C0037.m3885(this), new ViewGroup.LayoutParams(-2, -2));
            C0039.m4187(C0037.m3885(this), C0075.m6795(activity));
            LinearLayout linearLayoutM17272 = C0022.m1727(this, activity);
            this.l = linearLayoutM17272;
            C0034.m3509(linearLayoutM17272, C0071.m5977());
            C0065.m4689(C0037.m3885(this), C0065.m4741(this));
            this.t = new TextView(activity);
            ViewGroup.LayoutParams layoutParams7 = new ViewGroup.LayoutParams(C0039.m4142(240, activity), C0039.m4142(45, activity));
            C0066.m4801(C0078.m7394(this), 17);
            C0016.m687(C0078.m7394(this), layoutParams7);
            C0019.m1180(C0078.m7394(this), C0065.m4757(m6913(), 168, 8, 420));
            C0027.m2442(C0078.m7394(this), -1);
            C0016.m722(C0078.m7394(this), 2, 16.0f);
            C0022.m1661(C0078.m7394(this), C0035.m3633(1));
            this.u = new View(activity);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C0039.m4142(240, activity), C0039.m4142(1, activity));
            C0019.m1232(layoutParams8, 3, C0072.m6212(C0065.m4741(this)));
            C0016.m687(C0072.m6145(this), layoutParams8);
            C0028.m2660(C0072.m6145(this), C0031.m2985(strM3330));
            C0065.m4689(C0037.m3885(this), C0078.m7394(this));
            C0065.m4689(C0037.m3885(this), C0072.m6145(this));
            View viewM4334 = C0063.m4334(this, activity);
            this.g = viewM4334;
            if (viewM4334 instanceof C0361f2) {
                C0035.m3526((C0361f2) viewM4334, null);
            }
            C0019.m1232((RelativeLayout.LayoutParams) C0039.m4105(C0027.m2426(this)), 3, C0072.m6212(C0065.m4741(this)));
            C0065.m4689(C0037.m3885(this), C0027.m2426(this));
            C0065.m4689(this, C0037.m3885(this));
            C0027.m2510(this, activity, C0030.m2969(this));
            C0077.m7204(this, activity);
        }
    }

    public static void a(C0 c0, boolean z) {
        if (C0029.m2785(c0)) {
            return;
        }
        if (!z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            C0037.m3919(layoutParams, 0, 0, 0, 0);
            C0016.m687(C0037.m3803(c0), layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            C0037.m3919(layoutParams2, C0039.m4142(58, C0022.m1755(c0)), C0039.m4142(2, C0022.m1755(c0)), 0, 0);
            C0019.m1232(layoutParams2, 3, C0072.m6212(C0075.m6887(c0)));
            C0016.m687(C0037.m3803(c0), layoutParams2);
        }
    }

    public static ShapeDrawable b(Context context) {
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C0039.m4142(8, context);
            fArr2[i] = C0039.m4142(8, context);
        }
        float f = 0;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(f, f, f, f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0063.m4315(m6913(), 176, 9, 793)));
        return shapeDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int getShow() {
        ?? M4611 = C0064.m4611();
        int i = M4611;
        if (C0027.m2473()) {
            i = M4611 + 1;
        }
        return C0021.m1586() ? i + 1 : i;
    }

    public final C0444t0 d(Context context) {
        C0479z c0479z = new C0479z(2);
        this.k = c0479z;
        C0030.m2951(C0072.m6184());
        C0034.m3441(C0024.m2031(), context);
        C0444t0 c0444t0 = new C0444t0(context);
        boolean zM2785 = C0029.m2785(this);
        c0444t0.j = C0035.m3620(240, context);
        c0444t0.k = C0035.m3620(245, context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        C0034.m3509(textView, C0071.m5977());
        C0016.m687(textView, new RelativeLayout.LayoutParams(-1, C0035.m3620(187, context)));
        C0019.m1180(textView, C0031.m3047(m6913(), 185, 18, 2769));
        C0066.m4801(textView, 17);
        C0027.m2442(textView, C0031.m2985(C0069.m5807(m6913(), 203, 7, 3056)));
        C0016.m722(textView, 2, 12.0f);
        RelativeLayout relativeLayoutM5721 = C0069.m5721(c0444t0, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        C0019.m1232(layoutParams, 3, C0072.m6212(textView));
        layoutParams.leftMargin = C0035.m3620(17, context);
        C0016.m687(relativeLayoutM5721, layoutParams);
        C0065.m4689(relativeLayout, textView);
        C0065.m4689(relativeLayout, relativeLayoutM5721);
        c0444t0.b = relativeLayout;
        C0063.m4382(relativeLayout, 4);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        C0037.m3919(layoutParams2, C0035.m3620(12, context), C0035.m3620(12, context), C0035.m3620(12, context), 0);
        C0016.m687(relativeLayout2, layoutParams2);
        O o = new O(context, new ArrayList());
        c0444t0.a = o;
        o.c = new C0408n(c0444t0, 1);
        o.d = new T(c0444t0, 1);
        c0444t0.d = new ListView(context);
        C0016.m687(C0071.m6062(c0444t0), new RelativeLayout.LayoutParams(-1, C0035.m3620(187, context)));
        C0021.m1591(C0071.m6062(c0444t0), 0);
        C0034.m3509(C0071.m6062(c0444t0), C0071.m5977());
        C0019.m1314(C0071.m6062(c0444t0), C0077.m7261(c0444t0));
        C0039.m4153(C0071.m6062(c0444t0), false);
        C0063.m4419(C0071.m6062(c0444t0), 0);
        C0024.m2020(C0071.m6062(c0444t0), new C0427q0(c0444t0));
        C0077.m7164(C0071.m6062(c0444t0), new C0432r0(0));
        RelativeLayout relativeLayoutM57212 = C0069.m5721(c0444t0, context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        C0019.m1232(layoutParams3, 3, C0072.m6212(C0071.m6062(c0444t0)));
        C0016.m687(relativeLayoutM57212, layoutParams3);
        C0065.m4689(relativeLayout2, C0071.m6062(c0444t0));
        C0065.m4689(relativeLayout2, relativeLayoutM57212);
        c0444t0.c = relativeLayout2;
        C0063.m4382(relativeLayout2, 4);
        ProgressBar progressBar = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        C0111.m13050(layoutParams4, 13);
        C0016.m687(progressBar, layoutParams4);
        c0444t0.e = progressBar;
        RelativeLayout relativeLayout3 = new RelativeLayout(context);
        C0016.m687(relativeLayout3, new RelativeLayout.LayoutParams(C0038.m3932(c0444t0), C0073.m6303(c0444t0)));
        if (!zM2785) {
            C0039.m4187(relativeLayout3, C0078.m7454(context));
        }
        C0065.m4689(relativeLayout3, C0070.m5917(c0444t0));
        C0065.m4689(relativeLayout3, C0036.m3739(c0444t0));
        C0065.m4689(relativeLayout3, C0065.m4729(c0444t0));
        C0065.m4689(c0444t0, relativeLayout3);
        c0479z.b = c0444t0;
        C0072.m6199(c0444t0, new C0468x0(c0479z, context, 0));
        C0063.m4299((C0444t0) C0023.m1892(c0479z), new C0468x0(c0479z, context, 1));
        C0075.m6851((C0444t0) C0023.m1892(c0479z), new C0450u0(c0479z, context, 0));
        C0016.m606((C0444t0) C0023.m1892(c0479z), new C0468x0(c0479z, context, 2));
        C0444t0 c0444t02 = (C0444t0) C0023.m1892(c0479z);
        C0063.m4409().b = new C0479z(this, context, 3);
        C0016.m687(c0444t02, new RelativeLayout.LayoutParams(C0039.m4142(245, context), C0039.m4142(260, context)));
        return c0444t02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C0064.m4558()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        View.OnTouchListener onTouchListenerM6386 = C0073.m6386(this);
        if (onTouchListenerM6386 == null || !C0070.m5959(onTouchListenerM6386, this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final LinearLayout e(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        C0034.m3509(linearLayout, C0071.m5977());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, C0039.m4114(this));
        C0025.m2098(linearLayout, 1);
        C0016.m687(linearLayout, layoutParams);
        C0063.m4385(linearLayout, 17);
        this.m = new ImageView(activity);
        int iM13065 = C0111.m13065(this);
        C0016.m687(C0070.m5874(this), new LinearLayout.LayoutParams(iM13065, iM13065));
        C0016.m713(C0070.m5874(this), C0039.m4124(C0037.m3829(m6913(), 210, 23, 573)));
        this.n = new ImageView(activity);
        int iM4183 = C0039.m4183(this);
        C0016.m687(C0066.m4851(this), new LinearLayout.LayoutParams(iM4183, iM4183));
        C0016.m713(C0066.m4851(this), C0039.m4124(C0017.m936(m6913(), 233, 29, 965)));
        TextView textView = new TextView(activity);
        this.o = textView;
        C0027.m2442(textView, -1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        C0016.m687(C0066.m4872(this), layoutParams2);
        layoutParams2.topMargin = C0111.m13148(this);
        C0016.m722(C0066.m4872(this), 2, 9.0f);
        C0019.m1180(C0066.m4872(this), C0038.m4022(m6913(), 262, 4, 498));
        C0065.m4689(linearLayout, C0070.m5874(this));
        C0065.m4689(linearLayout, C0066.m4851(this));
        C0065.m4689(linearLayout, C0066.m4872(this));
        return linearLayout;
    }

    public final LinearLayout f(Activity activity) {
        LinearLayout linearLayout = new LinearLayout(activity);
        C0034.m3509(linearLayout, C0071.m5977());
        int iM4595 = C0064.m4595(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM4595, iM4595);
        C0025.m2098(linearLayout, 1);
        C0016.m687(linearLayout, layoutParams);
        C0063.m4385(linearLayout, 17);
        this.m = new ImageView(activity);
        int iM13065 = C0111.m13065(this);
        C0016.m687(C0070.m5874(this), new LinearLayout.LayoutParams(iM13065, iM13065));
        C0016.m713(C0070.m5874(this), C0039.m4124(C0034.m3431(m6913(), 266, 23, 3187)));
        this.n = new ImageView(activity);
        int iM853 = C0017.m853(this);
        C0016.m687(C0066.m4851(this), new LinearLayout.LayoutParams(iM853, iM853));
        C0016.m713(C0066.m4851(this), C0039.m4124(C0066.m4828(m6913(), 289, 30, 3161)));
        C0065.m4689(linearLayout, C0070.m5874(this));
        C0065.m4689(linearLayout, C0066.m4851(this));
        return linearLayout;
    }

    public final K0 g(Context context) {
        M0 m0 = new M0();
        this.a = m0;
        K0 k0 = new K0(context);
        C0018.m1018(k0, new C0450u0(m0, context, 2));
        C0016.m687(k0, new RelativeLayout.LayoutParams(-2, -2));
        return k0;
    }

    public LinearLayout getLogoView() {
        return C0065.m4741(this);
    }

    public C0361f2 getScriptView() {
        View viewM2426 = C0027.m2426(this);
        if (viewM2426 instanceof C0361f2) {
            return (C0361f2) viewM2426;
        }
        return null;
    }

    public final View h(Context context) {
        String str;
        String str2;
        C0408n c0408nM6120 = C0072.m6120();
        c0408nM6120.b = new C0408n(this, 2);
        C0361f2 c0361f2 = new C0361f2(context);
        c0361f2.n = 0L;
        c0361f2.o = C0074.m6446();
        c0361f2.v = new ArrayList();
        c0361f2.w = true;
        c0361f2.x = new HashMap();
        c0361f2.z = 0L;
        c0361f2.D = null;
        c0361f2.E = new H(c0361f2, C0021.m1643(), 1);
        c0361f2.J = false;
        c0361f2.B = C0075.m6777(context, 110.0f);
        c0361f2.C = C0075.m6777(context, 150.0f);
        c0361f2.q = C0069.m5715(C0020.m1443(m6913(), 319, 11, 936));
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        View viewM3080 = C0031.m3080(c0361f2);
        String strM4757 = C0065.m4757(m6913(), 330, 6, 851);
        String strM3330 = C0033.m3330(m6913(), 336, 19, 1298);
        String strM3603 = C0035.m3603(m6913(), 355, 4, 475);
        if (viewM3080 == null || activityM7370 == null) {
            str = strM4757;
            str2 = strM3330;
        } else {
            c0361f2.A = new int[2];
            C0017.m918(C0027.m2395(C0027.m2524(activityM7370)), C0072.m6139(c0361f2));
            LinearLayout linearLayout = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0077.m7205(m6913(), 359, 9, 338));
            c0361f2.a = linearLayout;
            C0039.m4187(linearLayout, C0018.m1059(C0034.m3431(m6913(), 368, 17, 2719)));
            c0361f2.b = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0029.m2695(m6913(), 385, 9, 1374));
            ImageView imageView = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0077.m7205(m6913(), 394, 12, 579));
            C0039.m4187(imageView, C0071.m6091(C0074.m6452(m6913(), 406, 14, 1984)));
            C0016.m687(imageView, new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 14.0f), C0075.m6777(activityM7370, 14.0f)));
            c0361f2.c = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0016.m625(m6913(), 420, 11, 995));
            c0361f2.e = (TextView) C0029.m2688(C0031.m3080(c0361f2), C0038.m4022(m6913(), 431, 14, 1342));
            ImageView imageView2 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0018.m1070(m6913(), 445, 14, 1919));
            c0361f2.d = imageView2;
            C0039.m4187(imageView2, C0071.m6091(C0077.m7205(m6913(), 459, 16, 923)));
            C0016.m687(C0037.m3868(c0361f2), new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 14.0f), C0075.m6777(activityM7370, 14.0f)));
            c0361f2.f = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0065.m4757(m6913(), 475, 9, 2246));
            ImageView imageView3 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0066.m4828(m6913(), 484, 12, 850));
            C0039.m4187(imageView3, C0071.m6091(C0039.m4066(m6913(), 496, 14, 607)));
            C0016.m687(imageView3, new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 14.0f), C0075.m6777(activityM7370, 14.0f)));
            c0361f2.g = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0025.m2151(m6913(), 510, 10, 2403));
            ImageView imageView4 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0068.m5544(m6913(), 520, 13, 650));
            C0039.m4187(imageView4, C0071.m6091(C0031.m3047(m6913(), 533, 15, 1572)));
            C0016.m687(imageView4, new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 14.0f), C0075.m6777(activityM7370, 14.0f)));
            C0063.m4382(C0033.m3374(c0361f2), 8);
            c0361f2.h = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0069.m5807(m6913(), 548, 11, 993));
            ImageView imageView5 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0076.m6902(m6913(), 559, 14, 1132));
            C0039.m4187(imageView5, C0071.m6091(C0019.m1189(m6913(), 573, 16, 809)));
            C0016.m687(imageView5, new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 14.0f), C0075.m6777(activityM7370, 14.0f)));
            c0361f2.i = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0070.m5942(m6913(), 589, 11, 2668));
            C0039.m4187((LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0027.m2404(m6913(), 600, 9, 2031)), C0018.m1059(C0022.m1728(m6913(), 609, 24, 1857)));
            ImageView imageView6 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0029.m2695(m6913(), 633, 15, 828));
            c0361f2.j = imageView6;
            C0039.m4187(imageView6, C0071.m6091(C0032.m3209(m6913(), 648, 22, 2189)));
            C0016.m687(C0021.m1626(c0361f2), new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 20.0f), C0075.m6777(activityM7370, 20.0f)));
            ImageView imageView7 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0017.m936(m6913(), 670, 15, 1538));
            c0361f2.k = imageView7;
            C0039.m4187(imageView7, C0071.m6091(C0032.m3209(m6913(), 685, 14, 2763)));
            C0016.m687(C0078.m7382(c0361f2), new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 14.0f), C0075.m6777(activityM7370, 14.0f)));
            c0361f2.l = (TextView) C0029.m2688(C0031.m3080(c0361f2), C0035.m3603(m6913(), 699, 12, 1712));
            LinearLayout linearLayout2 = (LinearLayout) C0029.m2688(C0031.m3080(c0361f2), C0029.m2695(m6913(), 711, 17, 1029));
            c0361f2.m = linearLayout2;
            C0039.m4187(linearLayout2, C0018.m1059(C0026.m2321(m6913(), 728, 23, 698)));
            ImageView imageView8 = (ImageView) C0029.m2688(C0031.m3080(c0361f2), C0074.m6452(m6913(), 751, 13, 2072));
            C0039.m4187(imageView8, C0071.m6091(C0075.m6791(m6913(), 764, 21, 3025)));
            C0016.m687(imageView8, new LinearLayout.LayoutParams(C0075.m6777(activityM7370, 7.0f), C0075.m6777(activityM7370, 7.0f)));
            C0065.m4689(c0361f2, C0031.m3080(c0361f2));
            C0381i2 c0381i2 = new C0381i2(activityM7370);
            View viewM5715 = C0069.m5715(C0064.m4545(m6913(), 785, 26, 2831));
            if (viewM5715 != null) {
                LinearLayout linearLayout3 = (LinearLayout) C0029.m2688(viewM5715, strM3603);
                c0381i2.g = linearLayout3;
                C0039.m4187(linearLayout3, C0018.m1059(strM3330));
                C0016.m687(C0016.m657(c0381i2), new LinearLayout.LayoutParams(C0075.m6777(C0022.m1755(c0381i2), 240.0f), C0075.m6777(C0022.m1755(c0381i2), 245.0f)));
                ImageView imageView9 = (ImageView) C0029.m2688(viewM5715, C0066.m4828(m6913(), 811, 17, 2340));
                c0381i2.a = imageView9;
                C0039.m4187(imageView9, C0071.m6091(C0035.m3603(m6913(), 828, 14, 3043)));
                ViewGroup.LayoutParams layoutParamsM4105 = C0039.m4105(C0037.m3863(c0381i2));
                layoutParamsM4105.width = C0075.m6777(C0022.m1755(c0381i2), 20.0f);
                layoutParamsM4105.height = C0075.m6777(C0022.m1755(c0381i2), 20.0f);
                C0016.m687(C0037.m3863(c0381i2), layoutParamsM4105);
                c0381i2.b = (TextView) C0029.m2688(viewM5715, C0067.m5418(m6913(), 842, 19, 3184));
                c0381i2.c = (TextView) C0029.m2688(viewM5715, C0111.m13097(m6913(), 861, 18, 3093));
                TextView textViewM2534 = C0028.m2534(c0381i2);
                String strM7427 = C0078.m7427(m6913(), 879, 27, 1561);
                C0039.m4187(textViewM2534, C0018.m1059(strM7427));
                ListView listView = (ListView) C0029.m2688(viewM5715, C0034.m3431(m6913(), 906, 17, 2354));
                List listM5730 = C0069.m5730(C0022.m1755(c0381i2));
                if (C0034.m3427(listM5730) == 0) {
                    TextView textViewM4648 = C0065.m4648(c0381i2);
                    if (textViewM4648 != null) {
                        C0063.m4382(textViewM4648, 0);
                    }
                } else {
                    TextView textViewM46482 = C0065.m4648(c0381i2);
                    if (textViewM46482 != null) {
                        C0063.m4382(textViewM46482, 8);
                    }
                }
                C0370g4 c0370g4 = new C0370g4();
                c0370g4.b = listM5730;
                c0381i2.d = c0370g4;
                C0019.m1314(listView, c0370g4);
                Activity activityM73702 = C0078.m7370(C0028.m2666());
                if (activityM73702 != null) {
                    DialogC0448t4 dialogC0448t4 = new DialogC0448t4(activityM73702, R.style.Theme.Black.NoTitleBar.Fullscreen);
                    View viewM57152 = C0069.m5715(C0026.m2321(m6913(), 923, 21, 620));
                    if (viewM57152 != null) {
                        LinearLayout linearLayout4 = (LinearLayout) C0029.m2688(viewM57152, strM3603);
                        dialogC0448t4.j = linearLayout4;
                        C0039.m4187(linearLayout4, C0018.m1059(strM3330));
                        Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(C0027.m2454(dialogC0448t4), strM4757));
                        Point point = new Point();
                        C0035.m3525(displayM5833, point);
                        if (C0068.m5537(point) > C0025.m2215(point)) {
                            str = strM4757;
                            str2 = strM3330;
                            C0016.m687(C0016.m725(dialogC0448t4), new FrameLayout.LayoutParams(C0075.m6777(C0027.m2454(dialogC0448t4), 240.0f), C0075.m6777(C0027.m2454(dialogC0448t4), 260.0f)));
                        } else {
                            str = strM4757;
                            str2 = strM3330;
                        }
                        ImageView imageView10 = (ImageView) C0029.m2688(viewM57152, C0069.m5807(m6913(), 944, 12, 1432));
                        dialogC0448t4.a = imageView10;
                        C0039.m4187(imageView10, C0071.m6091(C0067.m5418(m6913(), 956, 20, 1957)));
                        ViewGroup.LayoutParams layoutParamsM41052 = C0039.m4105(C0067.m5529(dialogC0448t4));
                        layoutParamsM41052.width = C0075.m6777(C0027.m2454(dialogC0448t4), 20.0f);
                        layoutParamsM41052.height = C0075.m6777(C0027.m2454(dialogC0448t4), 20.0f);
                        C0016.m687(C0067.m5529(dialogC0448t4), layoutParamsM41052);
                        dialogC0448t4.b = (TextView) C0029.m2688(viewM57152, C0065.m4757(m6913(), 976, 13, 2181));
                        dialogC0448t4.c = (TextView) C0029.m2688(viewM57152, C0072.m6116(m6913(), 989, 15, 2771));
                        TextView textView = (TextView) C0029.m2688(viewM57152, C0065.m4757(m6913(), 1004, 14, 700));
                        dialogC0448t4.d = textView;
                        C0039.m4187(textView, C0018.m1059(C0022.m1728(m6913(), PointerIconCompat.TYPE_ZOOM_IN, 27, 2691)));
                        TextView textView2 = (TextView) C0029.m2688(viewM57152, C0036.m3678(m6913(), 1045, 12, 1722));
                        dialogC0448t4.e = textView2;
                        C0039.m4187(textView2, C0018.m1059(strM7427));
                        ListView listView2 = (ListView) C0029.m2688(viewM57152, C0034.m3431(m6913(), 1057, 12, 341));
                        if (C0068.m5537(point) > C0025.m2215(point)) {
                            C0016.m687(listView2, new LinearLayout.LayoutParams(C0075.m6777(C0027.m2454(dialogC0448t4), 240.0f), C0075.m6777(C0027.m2454(dialogC0448t4), 150.0f)));
                        }
                        C0370g4 c0370g42 = new C0370g4(new ArrayList(), 0);
                        dialogC0448t4.f = c0370g42;
                        C0019.m1314(listView2, c0370g42);
                        Activity activityM73703 = C0078.m7370(C0028.m2666());
                        if (activityM73703 != null) {
                            dialogC0448t4.h = new DialogC0472x4(activityM73703);
                        }
                        C0073.m6392(dialogC0448t4, viewM57152);
                        C0021.m1532(dialogC0448t4).c = new C0408n(dialogC0448t4, 6);
                        C0065.m4727(C0067.m5529(dialogC0448t4), new ViewOnClickListenerC0436r4(dialogC0448t4, 0));
                        C0065.m4727(C0021.m1583(dialogC0448t4), new ViewOnClickListenerC0436r4(dialogC0448t4, 1));
                        int i = 2;
                        C0065.m4727(C0027.m2514(dialogC0448t4), new C0347d2(dialogC0448t4, i));
                        C0065.m4727(C0074.m6482(dialogC0448t4), new ViewOnClickListenerC0436r4(dialogC0448t4, i));
                        C0035.m3602(dialogC0448t4).h = new T(dialogC0448t4, 5);
                    } else {
                        str = strM4757;
                        str2 = strM3330;
                    }
                    c0381i2.f = dialogC0448t4;
                } else {
                    str = strM4757;
                    str2 = strM3330;
                }
                C0077.m7164(listView, new C0432r0(1));
                C0065.m4689(c0381i2, viewM5715);
                C0024.m1983(c0381i2).c = new T(c0381i2, 2);
                C0070.m5854(c0381i2).g = new C0408n(c0381i2, 4);
                C0065.m4727(C0037.m3863(c0381i2), new ViewOnClickListenerC0462w0(2));
                C0065.m4727(C0028.m2534(c0381i2), new ViewOnClickListenerC0391k0(2, c0381i2));
            } else {
                str = strM4757;
                str2 = strM3330;
            }
            c0361f2.p = c0381i2;
            C0016.m687(C0074.m6539(c0361f2), new FrameLayout.LayoutParams(C0075.m6777(activityM7370, 304.0f), -2));
            C0065.m4689(c0361f2, C0074.m6539(c0361f2));
            StringBuilder sb = new StringBuilder(C0037.m3829(m6913(), 1069, 61, 405));
            C0036.m3741(sb, (C0408n) C0077.m7207(c0408nM6120));
            C0036.m3736(C0033.m3330(m6913(), 1130, 11, 3208), C0068.m5536(sb));
            C0063.m4382(C0074.m6539(c0361f2), 8);
            c0361f2.t = new U3(activityM7370);
            C0425p4 c0425p4 = new C0425p4(activityM7370, null, 0);
            Z4 z4 = new Z4(c0425p4);
            c0425p4.a = z4;
            C0022.m1753(z4, activityM7370);
            c0361f2.u = c0425p4;
            C0034.m3479(C0111.m13038(c0361f2), new C0333b2(c0361f2, activityM7370));
            C0016.m687(C0111.m13038(c0361f2), new FrameLayout.LayoutParams(-1, -1));
        }
        if (C0031.m3080(c0361f2) != null) {
            Activity activityM73704 = C0078.m7370(C0028.m2666());
            if (activityM73704 != null) {
                DialogC0331b0 dialogC0331b0 = new DialogC0331b0(activityM73704, R.style.Theme.Black.NoTitleBar.Fullscreen, 1);
                View viewM57153 = C0069.m5715(C0031.m3047(m6913(), 1141, 20, 1489));
                if (viewM57153 != null) {
                    LinearLayout linearLayout5 = (LinearLayout) C0029.m2688(viewM57153, strM3603);
                    dialogC0331b0.g = linearLayout5;
                    C0039.m4187(linearLayout5, C0018.m1059(str2));
                    Display displayM58332 = C0069.m5833((WindowManager) C0026.m2310(C0027.m2454(dialogC0331b0), str));
                    Point point2 = new Point();
                    dialogC0331b0.h = point2;
                    C0035.m3525(displayM58332, point2);
                    Point point3 = (Point) C0018.m1012(dialogC0331b0);
                    if (C0068.m5537(point3) > C0025.m2215(point3)) {
                        C0016.m687((LinearLayout) C0019.m1211(dialogC0331b0), new LinearLayout.LayoutParams(C0075.m6777(C0027.m2454(dialogC0331b0), 240.0f), C0075.m6777(C0027.m2454(dialogC0331b0), 260.0f)));
                    }
                    dialogC0331b0.b = (TextView) C0029.m2688(viewM57153, C0025.m2151(m6913(), 1161, 13, 1502));
                    TextView textView3 = (TextView) C0029.m2688(viewM57153, C0029.m2695(m6913(), 1174, 13, 3045));
                    dialogC0331b0.d = textView3;
                    C0063.m4382(textView3, 8);
                    dialogC0331b0.c = (TextView) C0029.m2688(viewM57153, C0033.m3330(m6913(), 1187, 11, 1525));
                    ListView listView3 = (ListView) C0029.m2688(viewM57153, C0036.m3678(m6913(), 1198, 11, 1229));
                    Point point4 = (Point) C0018.m1012(dialogC0331b0);
                    if (C0068.m5537(point4) > C0025.m2215(point4)) {
                        C0016.m687(listView3, new LinearLayout.LayoutParams(C0075.m6777(C0027.m2454(dialogC0331b0), 240.0f), C0075.m6777(C0027.m2454(dialogC0331b0), 160.0f)));
                    }
                    C0370g4 c0370g43 = new C0370g4(new ArrayList(), 0);
                    dialogC0331b0.f = c0370g43;
                    C0019.m1314(listView3, c0370g43);
                    C0073.m6392(dialogC0331b0, viewM57153);
                    ((C0370g4) C0074.m6579(dialogC0331b0)).c = new C0408n(dialogC0331b0, 5);
                    C0065.m4727(C0024.m1957(dialogC0331b0), new C0377h4(dialogC0331b0, 0));
                    C0065.m4727(C0063.m4445(dialogC0331b0), new C0377h4(dialogC0331b0, 1));
                    C0065.m4727(C0077.m7279(dialogC0331b0), new ViewOnClickListenerC0462w0(dialogC0331b0));
                }
                c0361f2.s = dialogC0331b0;
                dialogC0331b0.e = new C0340c2(c0361f2);
            }
            C0381i2 c0381i2M6539 = C0074.m6539(c0361f2);
            if (c0381i2M6539 != null) {
                C0017.m951(c0381i2M6539, new C0333b2(c0361f2));
                if (activityM73704 != null) {
                    DialogC0472x4 dialogC0472x4 = new DialogC0472x4(activityM73704);
                    c0361f2.r = dialogC0472x4;
                    dialogC0472x4.h = new C0340c2(c0361f2);
                }
            }
            int i2 = 0;
            C0065.m4727(C0031.m2977(c0361f2), new C0347d2(c0361f2, i2));
            C0065.m4727(C0075.m6895(c0361f2), new ViewOnClickListenerC0326a2(c0361f2, i2));
            C0065.m4727(C0074.m6548(c0361f2), new ViewOnClickListenerC0326a2(c0361f2, 1));
            C0065.m4727(C0033.m3374(c0361f2), new ViewOnClickListenerC0462w0(1));
            C0065.m4727(C0071.m6064(c0361f2), new ViewOnClickListenerC0326a2(c0361f2, 2));
            C0065.m4727(C0021.m1626(c0361f2), new ViewOnClickListenerC0326a2(c0361f2, 3));
            C0065.m4727(C0078.m7382(c0361f2), new ViewOnClickListenerC0326a2(c0361f2, 4));
            C0065.m4727(C0026.m2292(c0361f2), new ViewOnClickListenerC0326a2(c0361f2, 5));
        }
        this.g = c0361f2;
        C0016.m687(C0027.m2426(this), new RelativeLayout.LayoutParams(C0039.m4142(245, context), -2));
        return C0027.m2426(this);
    }

    public final FrameLayout i(Activity activity, String str, String str2, View view) {
        FrameLayout frameLayout = new FrameLayout(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, C0039.m4114(this));
        layoutParams.weight = 1.0f;
        C0016.m687(frameLayout, layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        C0034.m3509(linearLayout, C0071.m5977());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        C0025.m2098(linearLayout, 1);
        C0016.m687(linearLayout, layoutParams2);
        C0063.m4385(linearLayout, 17);
        ImageView imageView = new ImageView(activity);
        int iM4183 = C0039.m4183(this);
        C0016.m687(imageView, new LinearLayout.LayoutParams(iM4183, iM4183));
        C0016.m713(imageView, C0039.m4124(str2));
        C0065.m4689(linearLayout, imageView);
        TextView textView = new TextView(activity);
        C0027.m2442(textView, -1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = C0111.m13148(this);
        C0016.m687(textView, layoutParams3);
        C0016.m722(textView, 2, 9.0f);
        C0019.m1180(textView, str);
        C0065.m4689(linearLayout, textView);
        C0065.m4689(frameLayout, linearLayout);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C0039.m4142(16, activity), C0039.m4142(2, activity));
        layoutParams4.gravity = 81;
        C0016.m687(view, layoutParams4);
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C0039.m4142(2, activity);
            fArr2[i] = C0039.m4142(2, activity);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0016.m625(m6913(), 1209, 7, 959)));
        C0039.m4187(view, shapeDrawable);
        C0065.m4689(frameLayout, view);
        return frameLayout;
    }

    public final void j(View view, View view2, View view3, Context context, int i, boolean z, int i2) {
        GradientDrawable gradientDrawableM5773;
        if (i == 0) {
            if (view != null) {
                C0063.m4382(view, 0);
            }
            if (view2 != null) {
                C0063.m4382(view2, 4);
            }
            if (view3 != null) {
                C0063.m4382(view3, 4);
                return;
            }
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (view == null) {
                C0030.m2929(this, i2, context);
            } else {
                C0063.m4382(view, 0);
            }
            if (view2 != null) {
                C0063.m4382(view2, 8);
            }
            if (view3 != null) {
                C0063.m4382(view3, 8);
                return;
            }
            return;
        }
        if (view != null) {
            if (z) {
                gradientDrawableM5773 = new GradientDrawable(C0031.m3044(), new int[]{-2130706433, 0});
                C0075.m6785(gradientDrawableM5773, new float[]{C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(8, context), C0039.m4142(8, context), C0039.m4142(8, context), C0039.m4142(8, context), C0039.m4142(0, context), C0039.m4142(0, context)});
            } else {
                gradientDrawableM5773 = C0069.m5773(context);
            }
            C0039.m4187(view, gradientDrawableM5773);
        }
        if (view2 != null) {
            C0039.m4187(view2, null);
        }
        if (view3 != null) {
            C0039.m4187(view3, null);
        }
    }

    public final void k(int i, Context context) {
        if (i == 0) {
            K0 k0M6576 = C0074.m6576(this, context);
            this.e = k0M6576;
            C0065.m4689(C0037.m3803(this), k0M6576);
        } else if (i == 1) {
            C0444t0 c0444t0M1923 = C0023.m1923(this, context);
            this.f = c0444t0M1923;
            C0065.m4689(C0037.m3803(this), c0444t0M1923);
        } else {
            if (i != 2) {
                return;
            }
            View viewM4334 = C0063.m4334(this, context);
            this.g = viewM4334;
            C0065.m4689(C0037.m3803(this), viewM4334);
        }
    }

    public final void l(boolean z) {
        C0444t0 c0444t0;
        Activity activityM3700;
        if (z) {
            C0479z c0479zM1659 = C0022.m1659(this);
            if (c0479zM1659 != null) {
                C0028.m2598(c0479zM1659);
                return;
            }
            return;
        }
        C0479z c0479zM16592 = C0022.m1659(this);
        if (c0479zM16592 == null || (c0444t0 = (C0444t0) C0023.m1892(c0479zM16592)) == null || C0037.m3898(c0444t0) == null || C0016.m655(C0037.m3898((C0444t0) C0023.m1892(c0479zM16592))) != 0 || (activityM3700 = C0036.m3700(C0038.m4007())) == null) {
            return;
        }
        C0039.m4089(c0479zM16592, activityM3700);
    }

    public final void m(Context context, boolean z) {
        int i = z ? 0 : 8;
        int i2 = z ? 8 : 0;
        if (z) {
            RelativeLayout relativeLayoutM3885 = C0037.m3885(this);
            if (relativeLayoutM3885 != null) {
                C0039.m4187(relativeLayoutM3885, C0075.m6795(context));
            }
        } else {
            RelativeLayout relativeLayoutM38852 = C0037.m3885(this);
            if (relativeLayoutM38852 != null) {
                C0039.m4187(relativeLayoutM38852, null);
            }
        }
        ImageView imageViewM5874 = C0070.m5874(this);
        if (imageViewM5874 != null) {
            C0037.m3860(imageViewM5874, i2);
        }
        ImageView imageViewM4851 = C0066.m4851(this);
        if (imageViewM4851 != null) {
            C0037.m3860(imageViewM4851, i);
        }
        TextView textViewM7394 = C0078.m7394(this);
        if (textViewM7394 != null) {
            C0063.m4382(textViewM7394, i);
        }
        View viewM6145 = C0072.m6145(this);
        if (viewM6145 != null) {
            C0063.m4382(viewM6145, i);
        }
        C0444t0 c0444t0M7386 = C0078.m7386(this);
        if (c0444t0M7386 != null) {
            C0063.m4382(c0444t0M7386, i);
        }
        View viewM2426 = C0027.m2426(this);
        if (viewM2426 != null) {
            C0063.m4382(viewM2426, i);
        }
    }

    public final void n(Context context, boolean z) {
        LinearLayout linearLayoutM6887 = C0075.m6887(this);
        boolean zM4848 = false;
        int i = z ? 0 : 8;
        int i2 = z ? 8 : 0;
        if (z) {
            if (linearLayoutM6887 != null) {
                C0039.m4187(linearLayoutM6887, C0075.m6795(context));
            }
            if (C0027.m2446(this) != null) {
                C0029.m2734();
                if (context != null) {
                    try {
                        String strM625 = C0016.m625(m6913(), 1216, 8, 2215);
                        if (!C0038.m3939(strM625)) {
                            zM4848 = C0066.m4848(C0029.m2737(context, C0039.m4066(m6913(), 1224, 17, 466), 0), strM625, false);
                        }
                    } catch (Exception unused) {
                    }
                }
                C0027.m2435(context, zM4848);
            }
        } else if (linearLayoutM6887 != null) {
            C0039.m4187(linearLayoutM6887, null);
        }
        ImageView imageViewM5874 = C0070.m5874(this);
        if (imageViewM5874 != null) {
            C0037.m3860(imageViewM5874, i2);
        }
        ImageView imageViewM4851 = C0066.m4851(this);
        if (imageViewM4851 != null) {
            C0037.m3860(imageViewM4851, i);
        }
        TextView textViewM4872 = C0066.m4872(this);
        if (textViewM4872 != null) {
            C0063.m4382(textViewM4872, i);
        }
        LinearLayout linearLayoutM1249 = C0019.m1249(this);
        if (linearLayoutM1249 != null) {
            C0063.m4382(linearLayoutM1249, i);
        }
        FrameLayout frameLayoutM983 = C0018.m983(this);
        if (frameLayoutM983 != null) {
            C0063.m4382(frameLayoutM983, i);
        }
        FrameLayout frameLayoutM7182 = C0077.m7182(this);
        if (frameLayoutM7182 != null) {
            C0063.m4382(frameLayoutM7182, i);
        }
        FrameLayout frameLayoutM3803 = C0037.m3803(this);
        if (frameLayoutM3803 != null) {
            C0063.m4382(frameLayoutM3803, i);
        }
    }

    public final void o(Context context, boolean z) {
        LinearLayout linearLayoutM4741 = C0065.m4741(this);
        boolean zM4848 = false;
        int i = z ? 0 : 8;
        int i2 = z ? 8 : 0;
        if (z) {
            if (linearLayoutM4741 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                C0077.m7299(gradientDrawable, C0031.m2985(C0022.m1728(m6913(), 1241, 9, 2380)));
                C0075.m6785(gradientDrawable, new float[]{C0039.m4142(8, context), C0039.m4142(8, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(8, context), C0039.m4142(8, context)});
                C0039.m4187(linearLayoutM4741, gradientDrawable);
            }
            if (C0027.m2446(this) != null) {
                C0029.m2734();
                if (context != null) {
                    try {
                        String strM6902 = C0076.m6902(m6913(), 1250, 8, 1753);
                        if (!C0038.m3939(strM6902)) {
                            zM4848 = C0066.m4848(C0029.m2737(context, C0022.m1728(m6913(), 1258, 17, 1945), 0), strM6902, false);
                        }
                    } catch (Exception unused) {
                    }
                }
                C0027.m2435(context, zM4848);
            }
        } else if (linearLayoutM4741 != null) {
            C0039.m4187(linearLayoutM4741, null);
        }
        ImageView imageViewM5874 = C0070.m5874(this);
        if (imageViewM5874 != null) {
            C0037.m3860(imageViewM5874, i2);
        }
        ImageView imageViewM4851 = C0066.m4851(this);
        if (imageViewM4851 != null) {
            C0037.m3860(imageViewM4851, i);
        }
        TextView textViewM4872 = C0066.m4872(this);
        if (textViewM4872 != null) {
            C0063.m4382(textViewM4872, i);
        }
        K0 k0M6468 = C0074.m6468(this);
        if (k0M6468 != null) {
            C0063.m4382(k0M6468, i);
        }
    }

    public final void p(int i, Context context) {
        if (i == 0) {
            C0019.m1195(this, C0069.m5754(this), C0026.m2347(this), C0066.m4859(this), context, 0, false, i);
            C0019.m1195(this, C0018.m983(this), C0077.m7182(this), C0025.m2189(this), context, 1, false, i);
            C0019.m1195(this, C0074.m6468(this), C0078.m7386(this), C0027.m2426(this), context, 2, false, i);
        } else if (i == 1) {
            C0019.m1195(this, C0026.m2347(this), C0069.m5754(this), C0066.m4859(this), context, 0, C0027.m2430(this) == i, i);
            C0019.m1195(this, C0077.m7182(this), C0018.m983(this), C0025.m2189(this), context, 1, C0027.m2430(this) == i, i);
            C0019.m1195(this, C0078.m7386(this), C0074.m6468(this), C0027.m2426(this), context, 2, C0027.m2430(this) == i, i);
        } else {
            if (i != 2) {
                return;
            }
            C0019.m1195(this, C0066.m4859(this), C0069.m5754(this), C0026.m2347(this), context, 0, C0027.m2430(this) == i, i);
            C0019.m1195(this, C0025.m2189(this), C0018.m983(this), C0077.m7182(this), context, 1, C0027.m2430(this) == i, i);
            C0019.m1195(this, C0027.m2426(this), C0074.m6468(this), C0078.m7386(this), context, 2, C0027.m2430(this) == i, i);
        }
    }

    public void setListener(Context context) {
        LinearLayout linearLayoutM4741 = C0065.m4741(this);
        if (linearLayoutM4741 != null) {
            C0065.m4727(linearLayoutM4741, new A0(this, context, 0));
        }
        FrameLayout frameLayoutM983 = C0018.m983(this);
        if (frameLayoutM983 != null) {
            C0065.m4727(frameLayoutM983, new A0(this, context, 1));
        }
        FrameLayout frameLayoutM7182 = C0077.m7182(this);
        if (frameLayoutM7182 != null) {
            C0065.m4727(frameLayoutM7182, new A0(this, context, 2));
        }
        FrameLayout frameLayoutM2189 = C0025.m2189(this);
        if (frameLayoutM2189 != null) {
            C0065.m4727(frameLayoutM2189, new A0(this, context, 3));
        }
    }

    public void setListenerOnlyAutoClick(Context context) {
        LinearLayout linearLayoutM4741 = C0065.m4741(this);
        if (linearLayoutM4741 != null) {
            C0065.m4727(linearLayoutM4741, new B0(this, context, 1));
        }
        ImageView imageViewM4851 = C0066.m4851(this);
        if (imageViewM4851 != null) {
            C0065.m4727(imageViewM4851, new A0(this, context, 6));
        }
    }

    public void setListenerOnlyMinWinow(Context context) {
        LinearLayout linearLayoutM4741 = C0065.m4741(this);
        if (linearLayoutM4741 != null) {
            C0065.m4727(linearLayoutM4741, new A0(this, context, 7));
        }
        ImageView imageViewM4851 = C0066.m4851(this);
        if (imageViewM4851 != null) {
            C0065.m4727(imageViewM4851, new A0(this, context, 8));
        }
    }

    public void setListenerOnlySpeed(Context context) {
        LinearLayout linearLayoutM4741 = C0065.m4741(this);
        if (linearLayoutM4741 != null) {
            C0065.m4727(linearLayoutM4741, new B0(this, context, 0));
        }
    }

    public void setListenerOnlyTwoOpen(Context context) {
        LinearLayout linearLayoutM4741 = C0065.m4741(this);
        if (linearLayoutM4741 != null) {
            C0065.m4727(linearLayoutM4741, new A0(this, context, 4));
        }
        ImageView imageViewM4851 = C0066.m4851(this);
        if (imageViewM4851 != null) {
            C0065.m4727(imageViewM4851, new A0(this, context, 5));
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.C = onTouchListener;
    }

    public void setSpeedVisible(int i) {
        FrameLayout frameLayoutM983 = C0018.m983(this);
        if (frameLayoutM983 != null) {
            C0063.m4382(frameLayoutM983, i);
        }
    }

    public static GradientDrawable c(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(C0031.m3044(), new int[]{-2130706433, 0});
        C0075.m6785(gradientDrawable, new float[]{C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context), C0039.m4142(0, context)});
        return gradientDrawable;
    }
}
