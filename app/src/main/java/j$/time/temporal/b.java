package j$.time.temporal;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.util.C0102;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements u {
    NANOS(C0089.m8581(f450short, 0, 5, 2539)),
    MICROS(C0085.m8236(f450short, 10, 6, 2058)),
    MILLIS(C0079.m7503(f450short, 22, 6, 441)),
    SECONDS(C0104.m11206(f450short, 34, 7, 2115)),
    MINUTES(C0103.m11135(f450short, 48, 7, 1672)),
    HOURS(C0098.m10856(f450short, 62, 5, 2802)),
    HALF_DAYS(C0105.m11310(f450short, 72, 8, 2207)),
    DAYS(C0081.m7837(f450short, 89, 4, 3178)),
    WEEKS(C0082.m7966(f450short, 97, 5, 502)),
    MONTHS(C0104.m11206(f450short, 107, 6, 2985)),
    YEARS(C0086.m8291(f450short, 119, 5, 1516)),
    DECADES(C0085.m8236(f450short, 129, 7, 3027)),
    CENTURIES(C0102.m11094(f450short, 143, 9, 2405)),
    MILLENNIA(C0097.m10853(f450short, 161, 9, 560)),
    ERAS(C0086.m8291(f450short, 179, 4, 411)),
    FOREVER(C0085.m8236(f450short, 187, 7, 2052));


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f450short = {2469, 2442, 2437, 2436, 2456, 2423, 2424, 2423, 2422, 2410, 2119, 2147, 2153, 2168, 2149, 2169, 920, 924, 918, 903, 922, 902, 500, 464, 469, 469, 464, 458, 2047, 2043, 2046, 2046, 2043, 2017, 2064, 2086, 2080, 2092, 2093, 2087, 2096, 1399, 1377, 1383, 1387, 1386, 1376, 1399, 1733, 1761, 1766, 1789, 1788, 1773, 1787, 2641, 2645, 2642, 2633, 2632, 2649, 2639, 2746, 2717, 2695, 2688, 2689, 2876, 2875, 2849, 2854, 2855, 2263, 2302, 2291, 2297, 2267, 2302, 2278, 2284, 2675, 2682, 2679, 2685, 2660, 2687, 2682, 2658, 2664, 3118, 3083, 3091, 3097, 2832, 2837, 2829, 2823, 417, 403, 403, 413, 389, 3049, 3067, 3067, 3061, 3053, 3044, 3014, 3015, 3037, 3009, 3034, 1223, 1221, 1220, 1246, 1218, 1241, 1461, 1417, 1421, 1438, 1439, 3176, 3188, 3184, 3171, 3170, 2967, 2998, 2992, 2994, 2999, 2998, 2976, 2351, 2350, 2344, 2346, 2351, 2350, 2360, 2342, 2304, 2315, 2321, 2320, 2327, 2316, 2304, 2326, 468, 466, 473, 451, 450, 453, 478, 466, 452, 637, 601, 604, 604, 597, 606, 606, 601, 593, 2733, 2729, 2732, 2732, 2725, 2734, 2734, 2729, 2721, 478, 489, 506, 488, 2430, 2409, 2426, 2408, 2114, 2155, 2166, 2145, 2162, 2145, 2166, 478, 471, 458, 477, 462, 477, 458};
    private final String a;

    static {
        j$.time.e eVar = j$.time.e.c;
        j$.time.e.n(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.u
    public final m j(m mVar, long j) {
        return mVar.e(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
