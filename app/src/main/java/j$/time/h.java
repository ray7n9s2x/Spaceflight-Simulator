package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC0489b, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f441short = {1290, 1325, 1333, 1314, 1327, 1322, 1319, 1379, 1319, 1314, 1335, 1318, 1379, 1380, 1285, 1318, 1313, 1329, 1334, 1314, 1329, 1338, 1379, 1393, 1402, 1380, 1379, 1314, 1328, 1379, 1380, 2878, 2873, 2928, 2922, 2873, 2935, 2934, 2925, 2873, 2936, 2873, 2933, 2940, 2936, 2921, 2873, 2912, 2940, 2936, 2923, 1736, 1775, 1783, 1760, 1773, 1768, 1765, 1697, 1765, 1760, 1781, 1764, 1697, 1702, 1030, 2414, 3277, 3292, 3284, 3273, 3286, 3275, 3288, 3285, 2945, 3002, 2997, 2998, 3000, 2993, 3060, 2976, 3003, 3060, 3003, 2998, 2976, 2997, 3005, 3002, 3060, 2968, 3003, 2999, 2997, 3000, 2960, 2997, 2976, 2993, 3060, 2994, 2982, 3003, 3001, 3060, 2944, 2993, 3001, 2980, 3003, 2982, 2997, 3000, 2965, 2999, 2999, 2993, 2983, 2983, 3003, 2982, 3054, 3060, 1327, 1376, 1385, 1327, 1403, 1398, 1407, 1386, 1327, 2501, 2558, 2531, 2533, 2528, 2528, 2559, 2530, 2532, 2549, 2548, 2480, 2550, 2553, 2549, 2556, 2548, 2474, 2480, 1257, 1230, 1238, 1217, 1228, 1225, 1220, 1152, 1222, 1225, 1221, 1228, 1220, 1152, 1159, 1264, 1234, 1231, 1228, 1221, 1232, 1236, 1225, 1219, 1261, 1231, 1230, 1236, 1224, 1159, 1152, 1222, 1231, 1234, 1152, 1223, 1221, 1236, 1160, 1161, 1152, 1229, 1221, 1236, 1224, 1231, 1220, 1164, 1152, 1237, 1235, 1221, 1152, 1223, 1221, 1236, 1260, 1231, 1230, 1223, 1160, 1161, 1152, 1225, 1230, 1235, 1236, 1221, 1217, 1220, 2539, 2508, 2516, 2499, 2510, 2507, 2502, 2434, 2500, 2507, 2503, 2510, 2502, 2434, 2437, 2535, 2514, 2509, 2497, 2506, 2534, 2499, 2523, 2437, 2434, 2500, 2509, 2512, 2434, 2501, 2503, 2518, 2442, 2443, 2434, 2511, 2503, 2518, 2506, 2509, 2502, 2446, 2434, 2519, 2513, 2503, 2434, 2501, 2503, 2518, 2542, 2509, 2508, 2501, 2442, 2443, 2434, 2507, 2508, 2513, 2518, 2503, 2499, 2502, 2807, 2805, 2804, 2798, 2802, 3151, 3182, 3192, 3182, 3193, 3170, 3178, 3175, 3170, 3185, 3178, 3199, 3170, 3172, 3173, 3115, 3197, 3170, 3178, 3115, 3192, 3182, 3193, 3170, 3178, 3175, 3170, 3185, 3178, 3199, 3170, 3172, 3173, 3115, 3183, 3182, 3175, 3182, 3180, 3178, 3199, 3182, 2654, 2661, 2680, 2686, 2683, 2683, 2660, 2681, 2687, 2670, 2671, 2603, 2686, 2661, 2658, 2687, 2609, 2603, 467, 488, 501, 499, 502, 502, 489, 500, 498, 483, 482, 422, 480, 495, 483, 490, 482, 444, 422, 2150, 2113, 2137, 2126, 2115, 2118, 2123, 2063, 2123, 2126, 2139, 2122, 2063, 2056, 2155, 2126, 2134, 2144, 2121, 2166, 2122, 2126, 2141, 2063, 2076, 2073, 2073, 2056, 2063, 2126, 2140, 2063, 2056, 1784, 1791, 1718, 1708, 1791, 1713, 1712, 1707, 1791, 1726, 1791, 1715, 1722, 1726, 1711, 1791, 1702, 1722, 1726, 1709, 2317, 2358, 2347, 2349, 2344, 2344, 2359, 2346, 2348, 2365, 2364, 2424, 2366, 2353, 2365, 2356, 2364, 2402, 2424, 2932, 2251, 2262};
    public static final h d = C0079.m7525(-999999999, 1, 1);
    public static final h e = C0079.m7525(999999999, 12, 31);

    /* JADX INFO: renamed from: ۟۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static short m8131(Object obj) {
        if (C0100.m10983() > 0) {
            return ((h) obj).b;
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۨ, reason: not valid java name and contains not printable characters */
    public static h m8132(int i, int i2, int i3) {
        if (C0097.m10823() >= 0) {
            return D(i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int[] m8133() {
        if (C0091.m8708() >= 0) {
            return g.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8134() {
        if (C0080.m7553() >= 0) {
            return f441short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static h m8135(int i, int i2, int i3) {
        if (C0088.m8503() >= 0) {
            return U(i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static short m8136(Object obj) {
        if (C0088.m8503() > 0) {
            return ((h) obj).c;
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۤۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m8137() {
        if (C0102.m11109() < 0) {
            return g.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۦۥ, reason: contains not printable characters */
    public static int m8138(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((h) obj).F((j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m8139(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((h) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m8140(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((h) obj).C((h) obj2);
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C0086.m8290(this, (InterfaceC0489b) obj);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ InterfaceC0489b d(long j, j$.time.temporal.r rVar) {
        return C0105.m11302(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0105.m11302(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ InterfaceC0489b e(long j, j$.time.temporal.u uVar) {
        return C0096.m10763(this, j, uVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0096.m10763(this, j, uVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m m(h hVar) {
        return C0104.m11223(this, hVar);
    }

    static {
        C0079.m7525(1970, 1, 1);
    }

    public static h O(int i, n nVar, int i2) {
        C0090.m8635(C0104.m11201(), i);
        C0079.m7494(nVar, C0079.m7503(m8134(), 287, 5, 2714));
        C0090.m8635(C0084.m8118(), i2);
        return m8132(i, C0086.m8309(nVar), i2);
    }

    public static h N(int i, int i2, int i3) {
        C0090.m8635(C0104.m11201(), i);
        C0090.m8635(C0094.m9136(), i2);
        C0090.m8635(C0084.m8118(), i3);
        return m8132(i, i2, i3);
    }

    public static h P(long j) {
        long j2;
        C0090.m8635(C0095.m9191(), j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new h(C0081.m7859(C0104.m11201(), j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static h E(j$.time.temporal.o oVar) {
        C0079.m7494(oVar, C0106.m11346(m8134(), 67, 8, 3257));
        h hVar = (h) C0088.m8522(oVar, C0097.m10834());
        if (hVar != null) {
            return hVar;
        }
        String strM8091 = C0084.m8091(C0092.m8727(oVar));
        StringBuilder sb = new StringBuilder(C0087.m8474(m8134(), 75, 50, 3028));
        C0082.m7988(sb, oVar);
        C0101.m11052(sb, C0092.m8731(m8134(), 125, 9, 1295));
        C0101.m11052(sb, strM8091);
        throw new DateTimeException(C0099.m10924(sb));
    }

    private static h D(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C0092.m8727(C0103.m11146());
                if (C0079.m7487(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    StringBuilder sb = new StringBuilder(C0097.m10853(m8134(), 0, 31, 1347));
                    C0099.m10859(sb, i);
                    C0101.m11052(sb, C0100.m10962(m8134(), 31, 20, 2841));
                    throw new DateTimeException(C0099.m10924(sb));
                }
                String strM8318 = C0086.m8318(C0095.m9171(i2));
                StringBuilder sb2 = new StringBuilder(C0087.m8474(m8134(), 51, 14, 1665));
                C0101.m11052(sb2, strM8318);
                C0101.m11052(sb2, C0105.m11310(m8134(), 65, 1, 1062));
                C0099.m10859(sb2, i3);
                C0101.m11052(sb2, C0087.m8474(m8134(), 66, 1, 2377));
                throw new DateTimeException(C0099.m10924(sb2));
            }
        }
        return new h(i, i2, i3);
    }

    private static h U(int i, int i2, int i3) {
        int iM7578 = i3;
        if (i2 == 2) {
            C0092.m8727(C0103.m11146());
            iM7578 = C0080.m7578(iM7578, C0079.m7487((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            iM7578 = C0080.m7578(iM7578, 30);
        }
        return new h(i, i2, iM7578);
    }

    private h(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return C0092.m8767(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0094.m9149(rVar, this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!C0084.m8093(aVar)) {
            throw new j$.time.temporal.v(C0101.m11024(C0086.m8291(m8134(), 424, 19, 2392), rVar));
        }
        int i = m8133()[C0105.m11258(aVar)];
        if (i == 1) {
            return C0084.m8080(1L, C0094.m9154(this));
        }
        if (i == 2) {
            return C0084.m8080(1L, C0080.m7550(this) ? 366 : 365);
        }
        if (i == 3) {
            return C0084.m8080(1L, (C0095.m9171(m8131(this)) != C0086.m8316() || C0080.m7550(this)) ? 5L : 4L);
        }
        if (i != 4) {
            return C0090.m8651((j$.time.temporal.a) rVar);
        }
        return C0084.m8080(1L, m8139(this) <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return m8138(this, rVar);
        }
        return C0103.m11167(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == C0095.m9191()) {
                return C0086.m8288(this);
            }
            if (rVar != C0088.m8511()) {
                return m8138(this, rVar);
            }
            return ((((long) m8139(this)) * 12) + ((long) m8131(this))) - 1;
        }
        return C0095.m9198(rVar, this);
    }

    private int F(j$.time.temporal.r rVar) {
        int i;
        int i2 = m8133()[C0105.m11258((j$.time.temporal.a) rVar)];
        short sM8136 = m8136(this);
        int iM8139 = m8139(this);
        switch (i2) {
            case 1:
                return sM8136;
            case 2:
                return C0102.m11111(this);
            case 3:
                i = (sM8136 - 1) / 7;
                break;
            case 4:
                return iM8139 >= 1 ? iM8139 : 1 - iM8139;
            case 5:
                return C0092.m8795(C0093.m9066(this));
            case 6:
                i = (sM8136 - 1) % 7;
                break;
            case 7:
                return ((C0102.m11111(this) - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.v(C0092.m8731(m8134(), 223, 64, 2466));
            case 9:
                return ((C0102.m11111(this) - 1) / 7) + 1;
            case 10:
                return m8131(this);
            case 11:
                throw new j$.time.temporal.v(C0099.m10897(m8134(), 153, 70, 1184));
            case 12:
                return iM8139;
            case 13:
                return iM8139 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(C0101.m11024(C0091.m8679(m8134(), 134, 19, 2448), rVar));
        }
        return i + 1;
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final j$.time.chrono.n a() {
        return C0103.m11146();
    }

    public final int J() {
        return m8139(this);
    }

    public final int I() {
        return m8131(this);
    }

    public final int H() {
        return (C0091.m8672(C0095.m9171(m8131(this)), C0080.m7550(this)) + m8136(this)) - 1;
    }

    public final EnumC0500d G() {
        return C0099.m10932(((int) C0090.m8641(C0086.m8288(this) + 3, 7)) + 1);
    }

    public final boolean L() {
        j$.time.chrono.u uVarM11146 = C0103.m11146();
        long jM8139 = m8139(this);
        C0092.m8727(uVarM11146);
        return C0079.m7487(jM8139);
    }

    public final int M() {
        short sM8131 = m8131(this);
        return sM8131 != 2 ? (sM8131 == 4 || sM8131 == 6 || sM8131 == 9 || sM8131 == 11) ? 30 : 31 : C0080.m7550(this) ? 29 : 28;
    }

    public final h W(j$.time.temporal.p pVar) {
        if (pVar instanceof h) {
            return (h) pVar;
        }
        return (h) C0104.m11212(pVar, this);
    }

    public final h V(long j, j$.time.temporal.r rVar) {
        long j2 = j;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (h) C0090.m8657(rVar, this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        C0090.m8635(aVar, j2);
        int i = m8133()[C0105.m11258(aVar)];
        short sM8136 = m8136(this);
        short sM8131 = m8131(this);
        int iM8139 = m8139(this);
        switch (i) {
            case 1:
                int i2 = (int) j2;
                return sM8136 == i2 ? this : C0079.m7525(iM8139, sM8131, i2);
            case 2:
                return C0094.m9121(this, (int) j2);
            case 3:
                return C0094.m9137(this, C0081.m7854(j2 - C0104.m11214(this, C0091.m8699()), 7));
            case 4:
                if (iM8139 < 1) {
                    j2 = 1 - j2;
                }
                return C0080.m7574(this, (int) j2);
            case 5:
                return C0094.m9137(this, j2 - ((long) C0092.m8795(C0093.m9066(this))));
            case 6:
                return C0094.m9137(this, j2 - C0104.m11214(this, C0093.m9075()));
            case 7:
                return C0094.m9137(this, j2 - C0104.m11214(this, C0084.m8122()));
            case 8:
                return C0083.m8044(j2);
            case 9:
                return C0094.m9137(this, C0081.m7854(j2 - C0104.m11214(this, C0080.m7563()), 7));
            case 10:
                int i3 = (int) j2;
                if (sM8131 == i3) {
                    return this;
                }
                C0090.m8635(C0094.m9136(), i3);
                return m8135(iM8139, i3, sM8136);
            case 11:
                return C0103.m11174(this, j2 - (((((long) iM8139) * 12) + ((long) sM8131)) - 1));
            case 12:
                return C0080.m7574(this, (int) j2);
            case 13:
                return C0104.m11214(this, C0091.m8664()) == j2 ? this : C0080.m7574(this, 1 - iM8139);
            default:
                throw new j$.time.temporal.v(C0101.m11024(C0084.m8120(m8134(), 352, 19, 390), rVar));
        }
    }

    public final h Y(int i) {
        if (m8139(this) == i) {
            return this;
        }
        C0090.m8635(C0104.m11201(), i);
        return m8135(i, m8131(this), m8136(this));
    }

    public final h X(int i) {
        if (C0102.m11111(this) == i) {
            return this;
        }
        j$.time.temporal.a aVarM11201 = C0104.m11201();
        int iM8139 = m8139(this);
        long j = iM8139;
        C0090.m8635(aVarM11201, j);
        C0090.m8635(C0090.m8620(), i);
        C0092.m8727(C0103.m11146());
        boolean zM7487 = C0079.m7487(j);
        if (i == 366 && !zM7487) {
            StringBuilder sb = new StringBuilder(C0098.m10856(m8134(), 371, 33, 2095));
            C0099.m10859(sb, iM8139);
            C0101.m11052(sb, C0081.m7837(m8134(), 404, 20, 1759));
            throw new DateTimeException(C0099.m10924(sb));
        }
        n nVarM9171 = C0095.m9171(((i - 1) / 31) + 1);
        if (i > (C0100.m11008(nVarM9171, zM7487) + C0091.m8672(nVarM9171, zM7487)) - 1) {
            nVarM9171 = C0088.m8513(nVarM9171);
        }
        return new h(iM8139, C0086.m8309(nVarM9171), (i - C0091.m8672(nVarM9171, zM7487)) + 1);
    }

    public final h Q(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (h) C0089.m8580(uVar, this, j);
        }
        switch (m8137()[C0105.m11258((j$.time.temporal.b) uVar)]) {
            case 1:
                return C0094.m9137(this, j);
            case 2:
                return C0094.m9137(this, C0081.m7854(j, 7));
            case 3:
                return C0103.m11174(this, j);
            case 4:
                return C0084.m8108(this, j);
            case 5:
                return C0084.m8108(this, C0081.m7854(j, 10));
            case 6:
                return C0084.m8108(this, C0081.m7854(j, 100));
            case 7:
                return C0084.m8108(this, C0081.m7854(j, 1000));
            case 8:
                j$.time.temporal.a aVarM8664 = C0091.m8664();
                return C0105.m11302(this, C0086.m8284(C0104.m11214(this, aVarM8664), j), aVarM8664);
            default:
                StringBuilder sb = new StringBuilder(C0084.m8120(m8134(), 334, 18, 2571));
                C0082.m7988(sb, uVar);
                throw new j$.time.temporal.v(C0099.m10924(sb));
        }
    }

    public final h T(long j) {
        return j == 0 ? this : m8135(C0081.m7859(C0104.m11201(), ((long) m8139(this)) + j), m8131(this), m8136(this));
    }

    public final h S(long j) {
        if (j == 0) {
            return this;
        }
        long jM8139 = (((long) m8139(this)) * 12) + ((long) (m8131(this) - 1)) + j;
        long j2 = 12;
        return m8135(C0081.m7859(C0104.m11201(), C0102.m11106(jM8139, j2)), ((int) C0090.m8641(jM8139, j2)) + 1, m8136(this));
    }

    public final h R(long j) {
        if (j == 0) {
            return this;
        }
        long jM8136 = ((long) m8136(this)) + j;
        if (jM8136 > 0) {
            short sM8131 = m8131(this);
            int iM8139 = m8139(this);
            if (jM8136 <= 28) {
                return new h(iM8139, sM8131, (int) jM8136);
            }
            if (jM8136 <= 59) {
                long jM9154 = C0094.m9154(this);
                if (jM8136 <= jM9154) {
                    return new h(iM8139, sM8131, (int) jM8136);
                }
                if (sM8131 < 12) {
                    return new h(iM8139, sM8131 + 1, (int) (jM8136 - jM9154));
                }
                int i = iM8139 + 1;
                C0090.m8635(C0104.m11201(), i);
                return new h(i, 1, (int) (jM8136 - jM9154));
            }
        }
        return C0083.m8044(C0086.m8284(C0086.m8288(this), j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0096.m10763(C0096.m10763(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0096.m10763(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        return tVar == C0097.m10834() ? this : C0096.m10751(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0092.m8737(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final InterfaceC0492e u(l lVar) {
        return C0100.m11000(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final long t() {
        long jM8139 = m8139(this);
        long jM8131 = m8131(this);
        long j = 365 * jM8139;
        long jM8136 = (((367 * jM8131) - 362) / 12) + (jM8139 >= 0 ? ((jM8139 + 399) / 400) + (((3 + jM8139) / 4) - ((99 + jM8139) / 100)) + j : j - ((jM8139 / (-400)) + ((jM8139 / (-4)) - (jM8139 / (-100))))) + ((long) (m8136(this) - 1));
        if (jM8131 > 2) {
            jM8136 = !C0080.m7550(this) ? jM8136 - 2 : jM8136 - 1;
        }
        return jM8136 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final int z(InterfaceC0489b interfaceC0489b) {
        if (interfaceC0489b instanceof h) {
            return m8140(this, (h) interfaceC0489b);
        }
        return C0088.m8528(this, interfaceC0489b);
    }

    final int C(h hVar) {
        int iM8139 = m8139(this) - m8139(hVar);
        if (iM8139 != 0) {
            return iM8139;
        }
        int iM8131 = m8131(this) - m8131(hVar);
        return iM8131 == 0 ? m8136(this) - m8136(hVar) : iM8131;
    }

    public final boolean K(h hVar) {
        return hVar instanceof h ? m8140(this, hVar) < 0 : C0086.m8288(this) < C0086.m8288(hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && m8140(this, (h) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final int hashCode() {
        int iM8139 = m8139(this);
        return (((iM8139 << 11) + (m8131(this) << 6)) + m8136(this)) ^ (iM8139 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final String toString() {
        int iM8139 = m8139(this);
        int iM11238 = C0104.m11238(iM8139);
        StringBuilder sb = new StringBuilder(10);
        if (iM11238 >= 1000) {
            if (iM8139 > 9999) {
                C0089.m8573(sb, '+');
            }
            C0099.m10859(sb, iM8139);
        } else if (iM8139 < 0) {
            C0099.m10859(sb, iM8139 - 10000);
            C0099.m10921(sb, 1);
        } else {
            C0099.m10859(sb, iM8139 + 10000);
            C0099.m10921(sb, 0);
        }
        String strM8518 = C0088.m8518(m8134(), 443, 1, 2905);
        String strM11135 = C0103.m11135(m8134(), 444, 2, 2278);
        short sM8131 = m8131(this);
        C0101.m11052(sb, sM8131 < 10 ? strM11135 : strM8518);
        C0099.m10859(sb, sM8131);
        short sM8136 = m8136(this);
        if (sM8136 < 10) {
            strM8518 = strM11135;
        }
        C0101.m11052(sb, strM8518);
        C0099.m10859(sb, sM8136);
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0083.m8037(m8134(), 292, 42, 3083));
    }

    final void Z(DataOutput dataOutput) {
        C0091.m8668(dataOutput, m8139(this));
        C0092.m8730(dataOutput, m8131(this));
        C0092.m8730(dataOutput, m8136(this));
    }
}
