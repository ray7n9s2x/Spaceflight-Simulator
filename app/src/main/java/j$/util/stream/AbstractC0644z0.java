package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0644z0 implements K3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f550short = {3170, 3161, 3164, 3161, 3160, 3136, 3161, 3095, 3140, 3167, 3158, 3143, 3154, 3095, 2919, 2880, 2886, 2897, 2901, 2905, 2836, 2887, 2909, 2894, 2897, 2836, 2897, 2892, 2903, 2897, 2897, 2896, 2887, 2836, 2905, 2901, 2892, 2836, 2901, 2886, 2886, 2901, 2893, 2836, 2887, 2909, 2894, 2897, 458, 493, 491, 508, 504, 500, 441, 490, 496, 483, 508, 441, 508, 481, 506, 508, 508, 509, 490, 441, 500, 504, 481, 441, 504, 491, 491, 504, 480, 441, 490, 496, 483, 508, 2547, 2516, 2514, 2501, 2497, 2509, 2432, 2515, 2505, 2522, 2501, 2432, 2501, 2520, 2499, 2501, 2501, 2500, 2515, 2432, 2509, 2497, 2520, 2432, 2497, 2514, 2514, 2497, 2521, 2432, 2515, 2505, 2522, 2501, 964, 995, 997, 1010, 1014, 1018, 951, 996, 1022, 1005, 1010, 951, 1010, 1007, 1012, 1010, 1010, 1011, 996, 951, 1018, 1014, 1007, 951, 1014, 997, 997, 1014, 1006, 951, 996, 1022, 1005, 1010, 1233, 1258, 1263, 1258, 1259, 1267, 1258, 1188, 1271, 1260, 1253, 1268, 1249, 1188, 1338, 1281, 1284, 1281, 1280, 1304, 1281, 1359, 1308, 1287, 1294, 1311, 1290, 1359, 3018, 3053, 3051, 3068, 3064, 3060, 3001, 3050, 3056, 3043, 3068, 3001, 3068, 3041, 3066, 3068, 3068, 3069, 3050, 3001, 3060, 3064, 3041, 3001, 3064, 3051, 3051, 3064, 3040, 3001, 3050, 3056, 3043, 3068, 2932, 2899, 2901, 2882, 2886, 2890, 2823, 2900, 2894, 2909, 2882, 2823, 2882, 2911, 2884, 2882, 2882, 2883, 2900, 2823, 2890, 2886, 2911, 2823, 2886, 2901, 2901, 2886, 2910, 2823, 2900, 2894, 2909, 2882, 448, 487, 481, 502, 498, 510, 435, 480, 506, 489, 502, 435, 502, 491, 496, 502, 502, 503, 480, 435, 510, 498, 491, 435, 498, 481, 481, 498, 490, 435, 480, 506, 489, 502, 2367, 2328, 2334, 2313, 2317, 2305, 2380, 2335, 2309, 2326, 2313, 2380, 2313, 2324, 2319, 2313, 2313, 2312, 2335, 2380, 2305, 2317, 2324, 2380, 2317, 2334, 2334, 2317, 2325, 2380, 2335, 2309, 2326, 2313, 2715, 2704, 2695, 2704, 2783, 2692, 2693, 2712, 2717, 2783, 2690, 2693, 2691, 2708, 2704, 2716, 2783, 2738, 2718, 2717, 2717, 2708, 2706, 2693, 2718, 2691, 2783, 2738, 2713, 2704, 2691, 2704, 2706, 2693, 2708, 2691, 2712, 2690, 2693, 2712, 2706, 2690, 752, 712, 714, 723, 643, 718, 726, 720, 727, 643, 705, 710, 643, 717, 716, 717, 654, 717, 710, 708, 706, 727, 714, 725, 710, 665, 643, 1502, 1510, 1508, 1533, 1453, 1504, 1528, 1534, 1529, 1453, 1519, 1512, 1453, 1507, 1506, 1507, 1440, 1507, 1512, 1514, 1516, 1529, 1508, 1531, 1512, 1463, 1453, 2127, 2125, 2112, 2112, 2121, 2120, 2060, 2139, 2142, 2115, 2114, 2123, 2060, 2125, 2127, 2127, 2121, 2140, 2136, 2060, 2113, 2121, 2136, 2116, 2115, 2120, 634, 578, 576, 601, 521, 580, 604, 602, 605, 521, 587, 588, 521, 583, 582, 583, 516, 583, 588, 590, 584, 605, 576, 607, 588, 531, 521, 2721, 2794, 2727, 2810, 2745, 2747, 2742, 2742, 2739, 2740, 2749, 2810, 2697, 2739, 2740, 2737, 2804, 2709, 2748, 2718, 2741, 2735, 2744, 2742, 2751, 2804, 2747, 2745, 2745, 2751, 2730, 2734, 2802, 2718, 2741, 2735, 2744, 2742, 2751, 2803, 1472, 1528, 1530, 1507, 1459, 1534, 1510, 1504, 1511, 1459, 1521, 1526, 1459, 1533, 1532, 1533, 1470, 1533, 1526, 1524, 1522, 1511, 1530, 1509, 1526, 1449, 1459, 883, 824, 885, 808, 875, 873, 868, 868, 865, 870, 879, 808, 859, 865, 870, 867, 806, 839, 878, 833, 870, 892, 806, 873, 875, 875, 877, 888, 892, 800, 833, 870, 892, 877, 879, 877, 890, 801, 684, 743, 682, 759, 692, 694, 699, 699, 702, 697, 688, 759, 644, 702, 697, 700, 761, 664, 689, 667, 696, 697, 688, 761, 694, 692, 692, 690, 679, 675, 767, 667, 696, 697, 688, 766, 2369, 2371, 2382, 2382, 2375, 2374, 2306, 2389, 2384, 2381, 2380, 2373, 2306, 2371, 2369, 2369, 2375, 2386, 2390, 2306, 2383, 2375, 2390, 2378, 2381, 2374, 569, 571, 566, 566, 575, 574, 634, 557, 552, 565, 564, 573, 634, 571, 569, 569, 575, 554, 558, 634, 567, 575, 558, 562, 565, 574, 391, 416, 422, 433, 437, 441, 500, 423, 445, 430, 433, 500, 433, 428, 439, 433, 433, 432, 423, 500, 441, 437, 428, 500, 437, 422, 422, 437, 429, 500, 423, 445, 430, 433, 1372, 1303, 1370, 1287, 1348, 1350, 1355, 1355, 1358, 1353, 1344, 1287, 1385, 1352, 1347, 1346, 1289, 1384, 1345, 1399, 1365, 1358, 1354, 1358, 1363, 1358, 1361, 1346, 1289, 1350, 1364, 1382, 1365, 1365, 1350, 1374, 1198, 1253, 1192, 1269, 1206, 1204, 1209, 1209, 1212, 1211, 1202, 1269, 1179, 1210, 1201, 1200, 1275, 1178, 1203, 1169, 1210, 1184, 1207, 1209, 1200, 1275, 1206, 1210, 1189, 1196, 1180, 1211, 1185, 1210, 1277, 1169, 1210, 1184, 1207, 1209, 1200, 1166, 1160, 1273, 1269, 1212, 1211, 1185, 1276, 1208, 1267, 1214, 1251, 1184, 1186, 1199, 1199, 1194, 1197, 1188, 1251, 1165, 1196, 1191, 1190, 1261, 1164, 1189, 1162, 1197, 1207, 1261, 1184, 1196, 1203, 1210, 1162, 1197, 1207, 1196, 1259, 1162, 1197, 1207, 1190, 1188, 1190, 1201, 1176, 1182, 1263, 1251, 1194, 1197, 1207, 1258, 826, 881, 828, 865, 802, 800, 813, 813, 808, 815, 806, 865, 783, 814, 805, 804, 879, 782, 807, 776, 815, 821, 879, 802, 814, 817, 824, 776, 815, 821, 814, 873, 781, 814, 815, 806, 794, 796, 877, 865, 808, 815, 821, 872, 1738, 1665, 1740, 1681, 1746, 1744, 1757, 1757, 1752, 1759, 1750, 1681, 1791, 1758, 1749, 1748, 1695, 1790, 1751, 1789, 1758, 1759, 1750, 1695, 1751, 1758, 1731, 1780, 1744, 1746, 1753, 1763, 1748, 1756, 1744, 1752, 1759, 1752, 1759, 1750, 1689, 1778, 1758, 1759, 1730, 1732, 1756, 1748, 1731, 1688, 3261, 3318, 3259, 3302, 3237, 3239, 3242, 3242, 3247, 3240, 3233, 3302, 3208, 3241, 3234, 3235, 3304, 3209, 3232, 3215, 3240, 3250, 3304, 3232, 3241, 3252, 3203, 3239, 3237, 3246, 3220, 3235, 3243, 3239, 3247, 3240, 3247, 3240, 3233, 3310, 3205, 3241, 3240, 3253, 3251, 3243, 3235, 3252, 3311, 2734, 2789, 2728, 2805, 2742, 2740, 2745, 2745, 2748, 2747, 2738, 2805, 2715, 2746, 2737, 2736, 2811, 2714, 2739, 2713, 2746, 2747, 2738, 2811, 2739, 2746, 2727, 2704, 2740, 2742, 2749, 2695, 2736, 2744, 2740, 
    2748, 2747, 2748, 2747, 2738, 2813, 2710, 2746, 2747, 2726, 2720, 2744, 2736, 2727, 2812};
    private static final C0541e1 a = new C0541e1();
    private static final H0 b = new C0531c1();
    private static final J0 c = new C0536d1();
    private static final F0 d = new C0526b1();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    static long B(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static C0541e1 m10676() {
        if (C0092.m8724() < 0) {
            return a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static F0 m10677() {
        if (C0091.m8708() >= 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10678(Object obj) {
        if (C0089.m8594() < 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m10679(Object obj) {
        if (C0083.m8022() <= 0) {
            return EnumC0543e3.m((j$.util.f0) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static int m10680() {
        if (C0095.m9210() >= 0) {
            return EnumC0543e3.t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m10681(Object obj, Object obj2, int i) {
        if (C0083.m8022() <= 0) {
            ((L0) obj).i((Object[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static double[] m10682() {
        if (C0094.m9148() >= 0) {
            return g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m10683(long j) {
        if (C0080.m7553() > 0) {
            return M(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static L0 m10684(Object obj) {
        if (C0090.m8624() > 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m10685(Object obj) {
        if (C0091.m8708() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static A0 m10686(long j) {
        if (C0079.m7512() >= 0) {
            return J(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static D0 m10687(long j, Object obj) {
        if (C0079.m7512() > 0) {
            return D(j, (IntFunction) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static B0 m10688(long j) {
        if (C0089.m8594() < 0) {
            return T(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m10689() {
        if (C0103.m11154() < 0) {
            return f550short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static long m10690(Object obj) {
        if (C0087.m8458() < 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۨ, reason: not valid java name and contains not printable characters */
    public static int m10691() {
        if (C0104.m11196() > 0) {
            return EnumC0543e3.u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static H0 m10692() {
        if (C0098.m10857() <= 0) {
            return b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static void m10693(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static J0 m10694() {
        if (C0100.m10983() >= 0) {
            return c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static L0 m10695(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return N((L0) obj, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۥ, reason: not valid java name and contains not printable characters */
    public static C0 m10696(long j) {
        if (C0105.m11264() >= 0) {
            return V(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10697() {
        if (C0094.m9148() > 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int[] m10698() {
        if (C0094.m9148() > 0) {
            return M0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m10699(Object obj) {
        if (C0083.m8022() < 0) {
            return ((L0) obj).q();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m10700(Object obj, long j) {
        if (C0104.m11196() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m10701() {
        if (C0103.m11154() < 0) {
            return AbstractC0641y2.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۥ, reason: contains not printable characters */
    public static int[] m10702() {
        if (C0097.m10823() >= 0) {
            return e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۧ, reason: contains not printable characters */
    public static long[] m10703() {
        if (C0089.m8594() <= 0) {
            return f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦ, reason: contains not printable characters */
    public static long m10704(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10705(Object obj, Object obj2, Object obj3) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static V1 m10706(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0644z0) obj).f0();
        }
        return null;
    }

    @Override // j$.util.stream.K3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract V1 f0();

    public static C0519a S(Function function) {
        C0519a c0519a = new C0519a(8);
        c0519a.b = function;
        return c0519a;
    }

    public static Set R(Set set) {
        if (set == null || C0106.m11317(set)) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object objM8628 = C0090.m8628(C0090.m8658(set));
        boolean z = objM8628 instanceof EnumC0554h;
        String strM10897 = C0099.m10897(m10689(), 314, 42, 2801);
        if (z) {
            Iterator itM8658 = C0090.m8658(set);
            while (C0087.m8485(itM8658)) {
                try {
                    EnumC0554h enumC0554h = (EnumC0554h) C0090.m8628(itM8658);
                    C0091.m8677(hashSet, enumC0554h == null ? null : enumC0554h == C0100.m10993() ? C0099.m10922() : enumC0554h == C0095.m9177() ? C0100.m10966() : C0085.m8249());
                } catch (ClassCastException e2) {
                    C0086.m8333(strM10897, e2);
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(objM8628 instanceof Collector.Characteristics)) {
            C0086.m8333(strM10897, C0092.m8727(objM8628));
            throw null;
        }
        Iterator itM86582 = C0090.m8658(set);
        while (C0087.m8485(itM86582)) {
            try {
                Collector.Characteristics characteristics = (Collector.Characteristics) C0090.m8628(itM86582);
                C0091.m8677(hashSet, characteristics == null ? null : characteristics == C0099.m10922() ? C0100.m10993() : characteristics == C0100.m10966() ? C0095.m9177() : C0090.m8617());
            } catch (ClassCastException e3) {
                C0086.m8333(strM10897, e3);
                throw null;
            }
        }
        return hashSet;
    }

    static long A(long j, long j2, long j3) {
        if (j >= 0) {
            return C0102.m11093(-1L, C0088.m8519(j - j2, j3));
        }
        return -1L;
    }

    public static Stream g0(j$.util.f0 f0Var, boolean z) {
        C0099.m10863(f0Var);
        return new C0547f2(f0Var, m10679(f0Var), z);
    }

    static j$.util.f0 C(EnumC0548f3 enumC0548f3, j$.util.f0 f0Var, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = m10701()[C0105.m11258(enumC0548f3)];
        if (i == 1) {
            return new C0642y3(f0Var, j, j4);
        }
        if (i == 2) {
            return new C0627v3((j$.util.W) f0Var, j, j4);
        }
        if (i == 3) {
            return new C0632w3((j$.util.Z) f0Var, j, j4);
        }
        if (i != 4) {
            StringBuilder sb = new StringBuilder(C0099.m10897(m10689(), 0, 14, 3127));
            C0082.m7988(sb, enumC0548f3);
            throw new IllegalStateException(C0099.m10924(sb));
        }
        return new C0622u3((j$.util.T) f0Var, j, j4);
    }

    public static C0634x0 d0(EnumC0629w0 enumC0629w0, Predicate predicate) {
        C0099.m10863(predicate);
        C0099.m10863(enumC0629w0);
        return new C0634x0(C0091.m8670(), enumC0629w0, new C0600q0(1, enumC0629w0, predicate));
    }

    static AbstractC0546f1 L(EnumC0548f3 enumC0548f3) {
        int i = m10698()[C0105.m11258(enumC0548f3)];
        if (i == 1) {
            return m10676();
        }
        if (i == 2) {
            return (AbstractC0546f1) m10692();
        }
        if (i == 3) {
            return (AbstractC0546f1) m10694();
        }
        if (i == 4) {
            return (AbstractC0546f1) m10677();
        }
        StringBuilder sb = new StringBuilder(C0089.m8581(m10689(), 164, 14, 1391));
        C0082.m7988(sb, enumC0548f3);
        throw new IllegalStateException(C0099.m10924(sb));
    }

    public static C0634x0 a0(EnumC0629w0 enumC0629w0, IntPredicate intPredicate) {
        C0099.m10863(intPredicate);
        C0099.m10863(enumC0629w0);
        return new C0634x0(C0079.m7521(), enumC0629w0, new C0600q0(0, enumC0629w0, intPredicate));
    }

    public static Stream e0(AbstractC0557h2 abstractC0557h2, long j, long j2) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(C0097.m10853(m10689(), 503, 27, 1427));
            C0087.m8489(sb, j);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        return new C0606r2(abstractC0557h2, m10683(j2), j, j2);
    }

    public static L0 w(L0 l0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == m10690(l0)) {
            return l0;
        }
        j$.util.f0 f0VarM10678 = m10678(l0);
        long j3 = j2 - j;
        D0 d0M10687 = m10687(j3, intFunction);
        m10700(d0M10687, j3);
        for (int i = 0; i < j && C0081.m7848(f0VarM10678, new C0545f0(2)); i++) {
        }
        if (j2 == m10690(l0)) {
            C0088.m8509(f0VarM10678, d0M10687);
        } else {
            for (int i2 = 0; i2 < j3 && C0081.m7848(f0VarM10678, d0M10687); i2++) {
            }
        }
        m10685(d0M10687);
        return m10684(d0M10687);
    }

    static N0 I(EnumC0548f3 enumC0548f3, L0 l0, L0 l02) {
        int i = m10698()[C0105.m11258(enumC0548f3)];
        if (i == 1) {
            return new X0(l0, l02);
        }
        if (i == 2) {
            return new U0((H0) l0, (H0) l02);
        }
        if (i == 3) {
            return new V0((J0) l0, (J0) l02);
        }
        if (i != 4) {
            StringBuilder sb = new StringBuilder(C0098.m10856(m10689(), 150, 14, 1156));
            C0082.m7988(sb, enumC0548f3);
            throw new IllegalStateException(C0099.m10924(sb));
        }
        return new T0((F0) l0, (F0) l02);
    }

    public static IntStream U(j$.util.W w) {
        return new Z(w, m10679(w), false);
    }

    public static C0634x0 c0(EnumC0629w0 enumC0629w0) {
        C0099.m10863(null);
        C0099.m10863(enumC0629w0);
        return new C0634x0(C0097.m10843(), enumC0629w0, new C0595p0(enumC0629w0, 0));
    }

    public static void k() {
        throw new IllegalStateException(C0101.m11060(m10689(), 604, 26, 2338));
    }

    public static C0634x0 Y(EnumC0629w0 enumC0629w0) {
        C0099.m10863(null);
        C0099.m10863(enumC0629w0);
        return new C0634x0(C0079.m7527(), enumC0629w0, new C0595p0(enumC0629w0, 1));
    }

    public static void l() {
        throw new IllegalStateException(C0104.m11206(m10689(), 630, 26, 602));
    }

    static D0 D(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C0551g1(j, intFunction);
        }
        return new C0640y1();
    }

    public static void a() {
        throw new IllegalStateException(C0106.m11346(m10689(), 410, 26, 2092));
    }

    public static void g(InterfaceC0587n2 interfaceC0587n2, Integer num) {
        if (m10697()) {
            m10693(C0092.m8727(interfaceC0587n2), C0084.m8120(m10689(), 530, 38, 776));
            throw null;
        }
        C0093.m9076(interfaceC0587n2, C0081.m7858(num));
    }

    public static LongStream W(j$.util.Z z) {
        return new C0570k0(z, m10679(z), false);
    }

    public static void i(InterfaceC0592o2 interfaceC0592o2, Long l) {
        if (m10697()) {
            m10693(C0092.m8727(interfaceC0592o2), C0088.m8518(m10689(), 568, 36, 727));
            throw null;
        }
        C0093.m9093(interfaceC0592o2, C0088.m8558(l));
    }

    static B0 T(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C0566j1();
        }
        return new C0561i1(j);
    }

    public static void e(InterfaceC0582m2 interfaceC0582m2, Double d2) {
        if (m10697()) {
            m10693(C0092.m8727(interfaceC0582m2), C0080.m7573(m10689(), 463, 40, 2778));
            throw null;
        }
        C0099.m10873(interfaceC0582m2, C0090.m8616(d2));
    }

    public static IntStream Z(AbstractC0525b0 abstractC0525b0, long j, long j2) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(C0102.m11094(m10689(), 383, 27, 1421));
            C0087.m8489(sb, j);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        return new C0616t2(abstractC0525b0, m10683(j2), j, j2);
    }

    static C0 V(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C0610s1();
        }
        return new C0605r1(j);
    }

    public static Object[] m(K0 k0, IntFunction intFunction) {
        if (m10697()) {
            m10693(C0092.m8727(k0), C0095.m9204(m10689(), 690, 36, 1319));
            throw null;
        }
        if (m10690(k0) >= 2147483639) {
            throw new IllegalArgumentException(C0092.m8731(m10689(), 656, 34, 468));
        }
        Object[] objArr = (Object[]) C0095.m9220(intFunction, (int) m10690(k0));
        m10681(k0, objArr, 0);
        return objArr;
    }

    public static E K(j$.util.T t) {
        return new C0643z(t, m10679(t), false);
    }

    static A0 J(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C0521a1();
        }
        return new Z0(j);
    }

    public static L0 E(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z, IntFunction intFunction) {
        long jM10704 = m10704(abstractC0524b, f0Var);
        if (jM10704 < 0 || !C0088.m8562(f0Var, 16384)) {
            R0 r0 = new R0();
            r0.a = intFunction;
            L0 l0 = (L0) C0086.m8299(new Q0(abstractC0524b, f0Var, r0, new C0569k(16), 3));
            return z ? m10695(l0, intFunction) : l0;
        }
        if (jM10704 >= 2147483639) {
            throw new IllegalArgumentException(C0099.m10897(m10689(), 14, 34, 2868));
        }
        Object[] objArr = (Object[]) C0095.m9220(intFunction, (int) jM10704);
        C0086.m8299(new C0630w1(f0Var, abstractC0524b, objArr));
        return new O0(objArr);
    }

    public static void r(H0 h0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            C0094.m9118(h0, (IntConsumer) consumer);
        } else {
            if (m10697()) {
                m10693(C0092.m8727(h0), C0083.m8037(m10689(), 916, 49, 3270));
                throw null;
            }
            C0088.m8509((j$.util.W) C0091.m8714(h0), consumer);
        }
    }

    public static LongStream b0(AbstractC0580m0 abstractC0580m0, long j, long j2) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(C0087.m8474(m10689(), 436, 27, 553));
            C0087.m8489(sb, j);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        return new C0626v2(abstractC0580m0, m10683(j2), j, j2);
    }

    public static void o(H0 h0, Integer[] numArr, int i) {
        if (m10697()) {
            m10693(C0092.m8727(h0), C0097.m10853(m10689(), 775, 47, 1219));
            throw null;
        }
        int[] iArr = (int[]) C0088.m8561(h0);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = C0102.m11105(iArr[i2]);
        }
    }

    public static H0 u(H0 h0, long j, long j2) {
        if (j == 0 && j2 == m10690(h0)) {
            return h0;
        }
        long j3 = j2 - j;
        j$.util.W w = (j$.util.W) C0091.m8714(h0);
        B0 b0M10688 = m10688(j3);
        m10700(b0M10688, j3);
        for (int i = 0; i < j && C0081.m7828(w, new G0(0)); i++) {
        }
        if (j2 == m10690(h0)) {
            C0093.m9078(w, b0M10688);
        } else {
            for (int i2 = 0; i2 < j3 && C0081.m7828(w, b0M10688); i2++) {
            }
        }
        m10685(b0M10688);
        return C0081.m7800(b0M10688);
    }

    public static H0 G(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z) {
        long jM10704 = m10704(abstractC0524b, f0Var);
        if (jM10704 < 0 || !C0088.m8562(f0Var, 16384)) {
            H0 h0 = (H0) C0086.m8299(new Q0(abstractC0524b, f0Var, new C0569k(12), new C0569k(13), 1));
            return z ? C0086.m8329(h0) : h0;
        }
        if (jM10704 >= 2147483639) {
            throw new IllegalArgumentException(C0097.m10853(m10689(), 82, 34, 2464));
        }
        int[] iArr = new int[(int) jM10704];
        C0086.m8299(new C0620u1(f0Var, abstractC0524b, iArr));
        return new C0556h1(iArr);
    }

    public static J0 H(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z) {
        long jM10704 = m10704(abstractC0524b, f0Var);
        if (jM10704 < 0 || !C0088.m8562(f0Var, 16384)) {
            J0 j0 = (J0) C0086.m8299(new Q0(abstractC0524b, f0Var, new C0569k(14), new C0569k(15), 2));
            return z ? C0088.m8563(j0) : j0;
        }
        if (jM10704 >= 2147483639) {
            throw new IllegalArgumentException(C0087.m8474(m10689(), 116, 34, 919));
        }
        long[] jArr = new long[(int) jM10704];
        C0086.m8299(new C0625v1(f0Var, abstractC0524b, jArr));
        return new C0601q1(jArr);
    }

    public static void s(J0 j0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            C0094.m9118(j0, (LongConsumer) consumer);
        } else {
            if (m10697()) {
                m10693(C0092.m8727(j0), C0080.m7573(m10689(), 965, 50, 2773));
                throw null;
            }
            C0088.m8509((j$.util.Z) C0091.m8714(j0), consumer);
        }
    }

    public static void p(J0 j0, Long[] lArr, int i) {
        if (m10697()) {
            m10693(C0092.m8727(j0), C0080.m7573(m10689(), 822, 44, 833));
            throw null;
        }
        long[] jArr = (long[]) C0088.m8561(j0);
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = C0106.m11351(jArr[i2]);
        }
    }

    public static J0 v(J0 j0, long j, long j2) {
        if (j == 0 && j2 == m10690(j0)) {
            return j0;
        }
        long j3 = j2 - j;
        j$.util.Z z = (j$.util.Z) C0091.m8714(j0);
        C0 c0M10696 = m10696(j3);
        m10700(c0M10696, j3);
        for (int i = 0; i < j && C0091.m8667(z, new I0(0)); i++) {
        }
        if (j2 == m10690(j0)) {
            C0079.m7485(z, c0M10696);
        } else {
            for (int i2 = 0; i2 < j3 && C0091.m8667(z, c0M10696); i2++) {
            }
        }
        m10685(c0M10696);
        return C0102.m11118(c0M10696);
    }

    public static F0 F(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z) {
        long jM10704 = m10704(abstractC0524b, f0Var);
        if (jM10704 < 0 || !C0088.m8562(f0Var, 16384)) {
            F0 f0 = (F0) C0086.m8299(new Q0(abstractC0524b, f0Var, new C0569k(10), new C0569k(11), 0));
            return z ? C0094.m9109(f0) : f0;
        }
        if (jM10704 >= 2147483639) {
            throw new IllegalArgumentException(C0104.m11206(m10689(), 48, 34, 409));
        }
        double[] dArr = new double[(int) jM10704];
        C0086.m8299(new C0615t1(f0Var, abstractC0524b, dArr));
        return new Y0(dArr);
    }

    public static E X(B b2, long j, long j2) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(C0083.m8037(m10689(), 356, 27, 675));
            C0087.m8489(sb, j);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        return new C0636x2(b2, m10683(j2), j, j2);
    }

    public static L0 N(L0 l0, IntFunction intFunction) {
        if (m10699(l0) <= 0) {
            return l0;
        }
        long jM10690 = m10690(l0);
        if (jM10690 >= 2147483639) {
            throw new IllegalArgumentException(C0084.m8120(m10689(), 178, 34, 2969));
        }
        Object[] objArr = (Object[]) C0095.m9220(intFunction, (int) jM10690);
        C0086.m8299(new A1(l0, objArr, 1));
        return new O0(objArr);
    }

    public static void q(F0 f0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            C0094.m9118(f0, (DoubleConsumer) consumer);
        } else {
            if (m10697()) {
                m10693(C0092.m8727(f0), C0103.m11135(m10689(), 866, 50, 1713));
                throw null;
            }
            C0088.m8509((j$.util.T) C0091.m8714(f0), consumer);
        }
    }

    public static H0 P(H0 h0) {
        if (m10699(h0) <= 0) {
            return h0;
        }
        long jM10690 = m10690(h0);
        if (jM10690 >= 2147483639) {
            throw new IllegalArgumentException(C0088.m8518(m10689(), 246, 34, 403));
        }
        int[] iArr = new int[(int) jM10690];
        C0086.m8299(new C0645z1(h0, iArr, 0));
        return new C0556h1(iArr);
    }

    public static void n(F0 f0, Double[] dArr, int i) {
        if (m10697()) {
            m10693(C0092.m8727(f0), C0086.m8291(m10689(), 726, 49, 1237));
            throw null;
        }
        double[] dArr2 = (double[]) C0088.m8561(f0);
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = C0085.m8245(dArr2[i2]);
        }
    }

    public static F0 t(F0 f0, long j, long j2) {
        if (j == 0 && j2 == m10690(f0)) {
            return f0;
        }
        long j3 = j2 - j;
        j$.util.T t = (j$.util.T) C0091.m8714(f0);
        A0 a0M10686 = m10686(j3);
        m10700(a0M10686, j3);
        for (int i = 0; i < j && C0104.m11219(t, new E0(0)); i++) {
        }
        if (j2 == m10690(f0)) {
            C0097.m10836(t, a0M10686);
        } else {
            for (int i2 = 0; i2 < j3 && C0104.m11219(t, a0M10686); i2++) {
            }
        }
        m10685(a0M10686);
        return C0090.m8637(a0M10686);
    }

    public static J0 Q(J0 j0) {
        if (m10699(j0) <= 0) {
            return j0;
        }
        long jM10690 = m10690(j0);
        if (jM10690 >= 2147483639) {
            throw new IllegalArgumentException(C0085.m8236(m10689(), 280, 34, 2412));
        }
        long[] jArr = new long[(int) jM10690];
        C0086.m8299(new C0645z1(j0, jArr, 0));
        return new C0601q1(jArr);
    }

    private static int M(long j) {
        return (j != -1 ? m10691() : 0) | m10680();
    }

    public static F0 O(F0 f0) {
        if (m10699(f0) <= 0) {
            return f0;
        }
        long jM10690 = m10690(f0);
        if (jM10690 >= 2147483639) {
            throw new IllegalArgumentException(C0100.m10962(m10689(), 212, 34, 2855));
        }
        double[] dArr = new double[(int) jM10690];
        C0086.m8299(new C0645z1(f0, dArr, 0));
        return new Y0(dArr);
    }

    @Override // j$.util.stream.K3
    public Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        V1 v1M10706 = m10706(this);
        m10705(abstractC0524b, f0Var, v1M10706);
        return C0106.m11328(v1M10706);
    }

    @Override // j$.util.stream.K3
    public Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return C0106.m11328((V1) C0086.m8299(new C0532c2(this, abstractC0524b, f0Var)));
    }
}
