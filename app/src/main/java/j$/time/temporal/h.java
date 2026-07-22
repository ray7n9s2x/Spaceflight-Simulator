package j$.time.temporal;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.EnumC0500d;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ h[] b;

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f451short = {3147, 3150, 3158, 3152, 3136, 3145, 3152, 3166, 3162, 3150, 3165, 3163, 3146, 3165, 1180, 1191, 1210, 1212, 1209, 1209, 1190, 1211, 1213, 1196, 1197, 1257, 1199, 1184, 1196, 1189, 1197, 1267, 1257, 1165, 1192, 1200, 1158, 1199, 1176, 1212, 1192, 1211, 1213, 1196, 1211, 1090, 1145, 1124, 1122, 1127, 1127, 1144, 1125, 1123, 1138, 1139, 1079, 1137, 1150, 1138, 1147, 1139, 1069, 1079, 1107, 1142, 1134, 1112, 1137, 1094, 1122, 1142, 1125, 1123, 1138, 1125, 1962, 1935, 1943, 1953, 1928, 1983, 1947, 1935, 1948, 1946, 1931, 1948};

            @Override // j$.time.temporal.r
            public final w j() {
                return w.k(90L, 92L);
            }

            {
                C0101.m11060(f451short, 0, 14, 3087);
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.DAY_OF_YEAR) && oVar.f(a.MONTH_OF_YEAR) && oVar.f(a.YEAR)) {
                    r rVar = j.a;
                    if (AbstractC0496i.p(oVar).equals(j$.time.chrono.u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0092.m8731(f451short, 45, 31, 1047));
                }
                long jS = oVar.s(h.QUARTER_OF_YEAR);
                if (jS == 1) {
                    long jS2 = oVar.s(a.YEAR);
                    j$.time.chrono.u.d.getClass();
                    return j$.time.chrono.u.m(jS2) ? w.j(1L, 91L) : w.j(1L, 90L);
                }
                if (jS == 2) {
                    return w.j(1L, 91L);
                }
                if (jS == 3 || jS == 4) {
                    return w.j(1L, 92L);
                }
                return j();
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0099.m10897(f451short, 14, 31, 1225));
                }
                int iK = oVar.k(a.DAY_OF_YEAR);
                int iK2 = oVar.k(a.MONTH_OF_YEAR);
                long jS = oVar.s(a.YEAR);
                int[] iArr = h.a;
                int i = (iK2 - 1) / 3;
                j$.time.chrono.u.d.getClass();
                return iK - iArr[i + (j$.time.chrono.u.m(jS) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j) {
                long jK = k(mVar);
                j().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j - jK) + mVar.s(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return C0083.m8037(f451short, 76, 12, 2030);
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f452short = {830, 826, 814, 829, 827, 810, 829, 816, 800, 809, 816, 822, 810, 814, 829, 1906, 1865, 1876, 1874, 1879, 1879, 1864, 1877, 1875, 1858, 1859, 1799, 1857, 1870, 1858, 1867, 1859, 1821, 1799, 1910, 1874, 1862, 1877, 1875, 1858, 1877, 1896, 1857, 1918, 1858, 1862, 1877, 2202, 2209, 2236, 2234, 2239, 2239, 2208, 2237, 2235, 2218, 2219, 2287, 2217, 2214, 2218, 2211, 2219, 2293, 2287, 2206, 2234, 2222, 2237, 2235, 2218, 2237, 2176, 2217, 2198, 2218, 2222, 2237, 2223, 2187, 2207, 2188, 2186, 2203, 2188, 2225, 2200, 2215, 2203, 2207, 2188};

            {
                C0097.m10853(f452short, 0, 15, 879);
            }

            @Override // j$.time.temporal.r
            public final w j() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.MONTH_OF_YEAR)) {
                    r rVar = j.a;
                    if (AbstractC0496i.p(oVar).equals(j$.time.chrono.u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0079.m7503(f452short, 15, 32, 1831));
                }
                return (oVar.s(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0106.m11346(f452short, 47, 32, 2255));
                }
                return j();
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j) {
                long jK = k(mVar);
                j().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j - jK) * 3) + mVar.s(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return C0098.m10856(f452short, 79, 13, 2302);
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f453short = {824, 810, 810, 804, 816, 800, 809, 816, 824, 810, 810, 804, 816, 813, 814, 828, 810, 811, 816, 822, 810, 814, 829, 2817, 2874, 2855, 2849, 2852, 2852, 2875, 2854, 2848, 2865, 2864, 2932, 2866, 2877, 2865, 2872, 2864, 2926, 2932, 2819, 2865, 2865, 2879, 2843, 2866, 2819, 2865, 2865, 2879, 2838, 2869, 2855, 2865, 2864, 2829, 2865, 2869, 2854, 754, 713, 724, 722, 727, 727, 712, 725, 723, 706, 707, 647, 705, 718, 706, 715, 707, 669, 647, 752, 706, 706, 716, 744, 705, 752, 706, 706, 716, 741, 710, 724, 706, 707, 766, 706, 710, 725, 1489, 1507, 1507, 1517, 1481, 1504, 1489, 1507, 1507, 1517, 1476, 1511, 1525, 1507, 1506, 1503, 1507, 1511, 1524};

            @Override // j$.time.temporal.r
            public final w j() {
                return w.k(52L, 53L);
            }

            {
                C0102.m11094(f453short, 0, 23, 879);
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.a;
                    if (AbstractC0496i.p(oVar).equals(j$.time.chrono.u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0081.m7837(f453short, 61, 38, 679));
                }
                return h.F(j$.time.h.E(oVar));
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0083.m8037(f453short, 23, 38, 2900));
                }
                return h.C(j$.time.h.E(oVar));
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j) {
                j().b(j, this);
                return mVar.e(j$.com.android.tools.r8.a.l(j, k(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return C0095.m9204(f453short, 99, 19, 1414);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f454short = {2438, 2452, 2452, 2458, 2446, 2451, 2448, 2434, 2452, 2453, 2446, 2440, 2452, 2448, 2435, 695, 652, 657, 663, 658, 658, 653, 656, 662, 647, 646, 706, 644, 651, 647, 654, 646, 728, 706, 693, 647, 647, 649, 672, 643, 657, 647, 646, 699, 647, 643, 656, 1655, 1612, 1617, 1623, 1618, 1618, 1613, 1616, 1622, 1607, 1606, 1538, 1604, 1611, 1607, 1614, 1606, 1560, 1538, 1653, 1607, 1607, 1609, 1632, 1603, 1617, 1607, 1606, 1659, 1607, 1603, 1616, 2332, 2343, 2362, 2364, 2361, 2361, 2342, 2363, 2365, 2348, 2349, 2409, 2351, 2336, 2348, 2341, 2349, 2419, 2409, 2334, 2348, 2348, 2338, 2315, 2344, 2362, 2348, 2349, 2320, 2348, 2344, 2363, 3179, 3161, 3161, 3159, 3198, 3165, 3151, 3161, 3160, 3173, 3161, 3165, 3150};

            {
                C0100.m10962(f454short, 0, 15, 2513);
            }

            @Override // j$.time.temporal.r
            public final w j() {
                return a.YEAR.j();
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.a;
                    if (AbstractC0496i.p(oVar).equals(j$.time.chrono.u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0105.m11310(f454short, 15, 32, 738));
                }
                return h.G(j$.time.h.E(oVar));
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v(C0105.m11310(f454short, 79, 32, 2377));
                }
                return j();
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j) {
                if (!m(mVar)) {
                    throw new v(C0103.m11135(f454short, 47, 32, 1570));
                }
                int iA = a.YEAR.j().a(j, h.WEEK_BASED_YEAR);
                j$.time.h hVarE = j$.time.h.E(mVar);
                int iK = hVarE.k(a.DAY_OF_WEEK);
                int iC = h.C(hVarE);
                if (iC == 53 && h.H(iA) == 52) {
                    iC = 52;
                }
                return mVar.m(j$.time.h.N(iA, 1, 4).R(((iC - 1) * 7) + (iK - r6.k(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return C0083.m8037(f454short, 111, 13, 3132);
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static w F(j$.time.h hVar) {
        return w.j(1L, H(G(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(int i) {
        j$.time.h hVarN = j$.time.h.N(i, 1, 1);
        if (hVarN.G() != EnumC0500d.THURSDAY) {
            return (hVarN.G() == EnumC0500d.WEDNESDAY && hVarN.L()) ? 53 : 52;
        }
        return 53;
    }

    static int C(j$.time.h hVar) {
        int iOrdinal = hVar.G().ordinal();
        int i = 1;
        int iH = hVar.H() - 1;
        int i2 = (3 - iOrdinal) + iH;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (iH < i4) {
            return (int) w.j(1L, H(G(hVar.X(180).T(-1L)))).d();
        }
        int i5 = ((iH - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && hVar.L())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(j$.time.h hVar) {
        int iJ = hVar.J();
        int iH = hVar.H();
        if (iH <= 3) {
            return iH - hVar.G().ordinal() < -2 ? iJ - 1 : iJ;
        }
        if (iH >= 363) {
            return ((iH - 363) - (hVar.L() ? 1 : 0)) - hVar.G().ordinal() >= 0 ? iJ + 1 : iJ;
        }
        return iJ;
    }
}
