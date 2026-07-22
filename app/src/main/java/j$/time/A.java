package j$.time;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.function.C0105;
import java.util.function.C0106;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends z implements j$.time.temporal.o, j$.time.temporal.p, Comparable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final int a;
    private final transient String b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f389short = {2219, 2498, 3209, 586, 1059, 3240, 3234, 1884, 1877, 1877, 1856, 1878, 1863, 1914, 1879, 3296, 3271, 3295, 3272, 3269, 3264, 3277, 3209, 3296, 3309, 3209, 3279, 3270, 3291, 3209, 3315, 3270, 3271, 3276, 3302, 3279, 3279, 3290, 3276, 3293, 3205, 3209, 3264, 3271, 3295, 3272, 3269, 3264, 3277, 3209, 3279, 3270, 3291, 3268, 3272, 3293, 3219, 3209, 1878, 1167, 1192, 1200, 1191, 1194, 1199, 1186, 1254, 1167, 1154, 1254, 1184, 1193, 1204, 1254, 1180, 1193, 1192, 1187, 1161, 1184, 1184, 1205, 1187, 1202, 1258, 1254, 1206, 1194, 1203, 1205, 1257, 1195, 1199, 1192, 1203, 1205, 1254, 1192, 1193, 1202, 1254, 1184, 1193, 1203, 1192, 1186, 1254, 1201, 1198, 1187, 1192, 1254, 1187, 1214, 1206, 1187, 1189, 1202, 1187, 1186, 1276, 1254, 1629, 1640, 1641, 1634, 1575, 1640, 1633, 1633, 1652, 1634, 1651, 1575, 1642, 1646, 1641, 1650, 1651, 1634, 1652, 1575, 1638, 1641, 1635, 1575, 1652, 1634, 1636, 1640, 1641, 1635, 1652, 1575, 1642, 1650, 1652, 1651, 1575, 1637, 1634, 1575, 1655, 1640, 1652, 1646, 1651, 1646, 1649, 1634, 1575, 1637, 1634, 1636, 1638, 1650, 1652, 1634, 1575, 1647, 1640, 1650, 1653, 1652, 1575, 1646, 1652, 1575, 1655, 1640, 1652, 1646, 1651, 1646, 1649, 1634, 2684, 2633, 2632, 2627, 2566, 2633, 2624, 2624, 2645, 2627, 2642, 2566, 2635, 2639, 2632, 2643, 2642, 2627, 2645, 2566, 2631, 2632, 2626, 2566, 2645, 2627, 2629, 2633, 2632, 2626, 2645, 2566, 2635, 2643, 2645, 2642, 2566, 2628, 2627, 2566, 2632, 2627, 2625, 2631, 2642, 2639, 2640, 2627, 2566, 2628, 2627, 2629, 2631, 2643, 2645, 2627, 2566, 2638, 2633, 2643, 2644, 2645, 2566, 2639, 2645, 2566, 2632, 2627, 2625, 2631, 2642, 2639, 2640, 2627, 1316, 1297, 1296, 1307, 1374, 1297, 1304, 1304, 1293, 1307, 1290, 1374, 1299, 1303, 1296, 1291, 1290, 1307, 1293, 1374, 1311, 1296, 1306, 1374, 1293, 1307, 1309, 1297, 1296, 1306, 1293, 1374, 1299, 1291, 1293, 1290, 1374, 1302, 1311, 1288, 1307, 1374, 1290, 1302, 1307, 1374, 1293, 1311, 1299, 1307, 1374, 1293, 1303, 1305, 1296, 1190, 1263, 1269, 1190, 1256, 1257, 1266, 1190, 1263, 1256, 1190, 1266, 1262, 1251, 1190, 1268, 1255, 1256, 1249, 1251, 1190, 1195, 1203, 1215, 1190, 1266, 1257, 1190, 1203, 1215, 418, 407, 406, 413, 472, 407, 414, 414, 395, 413, 396, 472, 406, 407, 396, 472, 401, 406, 472, 398, 409, 404, 401, 412, 472, 394, 409, 406, 415, 413, 450, 472, 469, 457, 448, 450, 456, 456, 472, 396, 407, 472, 467, 457, 448, 450, 456, 456, 578, 631, 630, 637, 568, 631, 638, 638, 619, 637, 620, 568, 619, 637, 635, 631, 630, 636, 619, 568, 630, 631, 620, 568, 625, 630, 568, 622, 633, 628, 625, 636, 568, 618, 633, 630, 639, 637, 546, 568, 622, 633, 628, 621, 637, 568, 2516, 2529, 2528, 2539, 2478, 2529, 2536, 2536, 2557, 2539, 2554, 2478, 2531, 2535, 2528, 2555, 2554, 2539, 2557, 2478, 2528, 2529, 2554, 2478, 2535, 2528, 2478, 2552, 2543, 2530, 2535, 2538, 2478, 2556, 2543, 2528, 2537, 2539, 2484, 2478, 2552, 2543, 2530, 2555, 2539, 2478, 1835, 1822, 1823, 1812, 1873, 1822, 1815, 1815, 1794, 1812, 1797, 1873, 1817, 1822, 1796, 1795, 1794, 1873, 1823, 1822, 1797, 1873, 1816, 1823, 1873, 1799, 1808, 1821, 1816, 1813, 1873, 1795, 1808, 1823, 1814, 1812, 1867, 1873, 1799, 1808, 1821, 1796, 1812, 1873, 2925, 2852, 2878, 2925, 2851, 2850, 2873, 2925, 2852, 2851, 2925, 2873, 2853, 2856, 2925, 2879, 2860, 2851, 2858, 2856, 2925, 2912, 2940, 2933, 2925, 2873, 2850, 2925, 2940, 2933, 3004, 2953, 2952, 2947, 3014, 2953, 2944, 2944, 2965, 2947, 2962, 3014, 2952, 2953, 2962, 3014, 2959, 2952, 3014, 2960, 2951, 2954, 2959, 2946, 3014, 2964, 2951, 2952, 2945, 2947, 3036, 3014, 3019, 3031, 3038, 3036, 3030, 3030, 3014, 2962, 2953, 3014, 3021, 3031, 3038, 3036, 3030, 3030, 1506, 1477, 1501, 1482, 1479, 1474, 1487, 1419, 1506, 1519, 1419, 1485, 1476, 1497, 1419, 1521, 1476, 1477, 1486, 1508, 1485, 1485, 1496, 1486, 1503, 1415, 1419, 1480, 1476, 1479, 1476, 1477, 1419, 1477, 1476, 1503, 1419, 1485, 1476, 1502, 1477, 1487, 1419, 1500, 1475, 1486, 1477, 1419, 1486, 1491, 1499, 1486, 1480, 1503, 1486, 1487, 1425, 1419, 1412, 1443, 1467, 1452, 1441, 1444, 1449, 1517, 1412, 1417, 1517, 1451, 1442, 1471, 1517, 1431, 1442, 1443, 1448, 1410, 1451, 1451, 1470, 1448, 1465, 1505, 1517, 1443, 1442, 1443, 1517, 1443, 1464, 1440, 1448, 1471, 1444, 1454, 1517, 1454, 1445, 1452, 1471, 1452, 1454, 1465, 1448, 1471, 1470, 1517, 1451, 1442, 1464, 1443, 1449, 1527, 1517, 2618, 2587, 2573, 2587, 2572, 2583, 2591, 2578, 2583, 2564, 2591, 2570, 2583, 2577, 2576, 2654, 2568, 2583, 2591, 2654, 2573, 2587, 2572, 2583, 2591, 2578, 2583, 2564, 2591, 2570, 2583, 2577, 2576, 2654, 2586, 2587, 2578, 2587, 2585, 2591, 2570, 2587, 2903, 2924, 2929, 2935, 2930, 2930, 2925, 2928, 2934, 2919, 2918, 2850, 2916, 2923, 2919, 2926, 2918, 2872, 2850, 2130, 2153, 2164, 2162, 2167, 2167, 2152, 2165, 2163, 2146, 2147, 2087, 2145, 2158, 2146, 2155, 2147, 2109, 2087};
    private static final ConcurrentHashMap c = new ConcurrentHashMap(16, 4);
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 4);
    public static final A e = C0090.m8622(0);
    public static final A f = C0090.m8622(-64800);
    public static final A g = C0090.m8622(64800);

    /* JADX INFO: renamed from: ۟۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m7591(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            ((A) obj).O((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۦ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m7592() {
        if (C0100.m10983() >= 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7593(Object obj) {
        if (C0080.m7553() > 0) {
            return ((A) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m7594(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((A) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m7595() {
        if (C0089.m8594() <= 0) {
            return f389short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m7596(Object obj, int i, boolean z) {
        if (C0102.m11109() < 0) {
            return M((String) obj, i, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۡ۟, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m7597() {
        if (C0099.m10878() < 0) {
            return c;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C0086.m8332(this, (A) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.A J(java.lang.String r58) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.A.J(java.lang.String):j$.time.A");
    }

    private static int M(String str, int i, boolean z) {
        if (z && C0104.m11233(str, i - 1) != ':') {
            StringBuilder sb = new StringBuilder(C0105.m11310(m7595(), 617, 58, 1451));
            C0082.m7988(sb, str);
            throw new DateTimeException(C0099.m10924(sb));
        }
        char cM11233 = C0104.m11233(str, i);
        char cM112332 = C0104.m11233(str, i + 1);
        if (cM11233 >= '0' && cM11233 <= '9' && cM112332 >= '0' && cM112332 <= '9') {
            return (cM112332 - '0') + ((cM11233 - '0') * 10);
        }
        StringBuilder sb2 = new StringBuilder(C0088.m8518(m7595(), 675, 57, 1485));
        C0082.m7988(sb2, str);
        throw new DateTimeException(C0099.m10924(sb2));
    }

    public static A K(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            StringBuilder sb = new StringBuilder(C0097.m10853(m7595(), 495, 44, 1905));
            C0099.m10859(sb, i);
            C0101.m11052(sb, C0085.m8236(m7595(), 539, 30, 2893));
            throw new DateTimeException(C0099.m10924(sb));
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException(C0079.m7503(m7595(), 122, 74, 1543));
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException(C0106.m11346(m7595(), 196, 74, 2598));
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException(C0083.m8037(m7595(), 270, 55, 1406));
        }
        String strM7503 = C0079.m7503(m7595(), 325, 30, 1158);
        if (i2 < -59 || i2 > 59) {
            StringBuilder sb2 = new StringBuilder(C0101.m11060(m7595(), 449, 46, 2446));
            C0099.m10859(sb2, i2);
            C0101.m11052(sb2, strM7503);
            throw new DateTimeException(C0099.m10924(sb2));
        }
        if (i3 < -59 || i3 > 59) {
            StringBuilder sb3 = new StringBuilder(C0101.m11060(m7595(), 403, 46, 536));
            C0099.m10859(sb3, i3);
            C0101.m11052(sb3, strM7503);
            throw new DateTimeException(C0099.m10924(sb3));
        }
        if (C0104.m11238(i) == 18 && (i2 | i3) != 0) {
            throw new DateTimeException(C0085.m8236(m7595(), 355, 48, 504));
        }
        return C0090.m8622((i2 * 60) + (i * 3600) + i3);
    }

    public static A L(int i) {
        if (i < -64800 || i > 64800) {
            throw new DateTimeException(C0080.m7573(m7595(), 569, 48, 3046));
        }
        if (i % DescriptorProtos.Edition.EDITION_LEGACY_VALUE == 0) {
            Integer numM11105 = C0102.m11105(i);
            ConcurrentHashMap concurrentHashMapM7597 = m7597();
            A a = (A) C0080.m7547(concurrentHashMapM7597, numM11105);
            if (a != null) {
                return a;
            }
            C0095.m9227(concurrentHashMapM7597, numM11105, new A(i));
            A a2 = (A) C0080.m7547(concurrentHashMapM7597, numM11105);
            C0095.m9227(m7592(), m7594(a2), a2);
            return a2;
        }
        return new A(i);
    }

    private A(int i) {
        String strM10924;
        this.a = i;
        if (i == 0) {
            strM10924 = C0082.m7966(m7595(), 0, 1, 2289);
        } else {
            int iM11238 = C0104.m11238(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iM11238 / 3600;
            int i3 = (iM11238 / 60) % 60;
            C0101.m11052(sb, i < 0 ? C0094.m9107(m7595(), 1, 1, 2543) : C0089.m8581(m7595(), 2, 1, 3234));
            C0101.m11052(sb, i2 < 10 ? C0083.m8037(m7595(), 3, 1, 634) : C0102.m11090());
            C0099.m10859(sb, i2);
            String strM9062 = C0093.m9062(m7595(), 4, 1, 1049);
            String strM8037 = C0083.m8037(m7595(), 5, 2, 3218);
            C0101.m11052(sb, i3 < 10 ? strM8037 : strM9062);
            C0099.m10859(sb, i3);
            int i4 = iM11238 % 60;
            if (i4 != 0) {
                C0101.m11052(sb, i4 < 10 ? strM8037 : strM9062);
                C0099.m10859(sb, i4);
            }
            strM10924 = C0099.m10924(sb);
        }
        this.b = strM10924;
    }

    public final int I() {
        return m7593(this);
    }

    @Override // j$.time.z
    public final String i() {
        return m7594(this);
    }

    @Override // j$.time.z
    public final j$.time.zone.f C() {
        return C0090.m8639(this);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == C0088.m8508() : rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return C0101.m11036(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar == C0088.m8508()) {
            return m7593(this);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(C0101.m11024(C0082.m7966(m7595(), 774, 19, 2818), rVar));
        }
        return C0092.m8732(C0101.m11036(this, rVar), C0101.m11045(this, rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar == C0088.m8508()) {
            return m7593(this);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(C0101.m11024(C0104.m11206(m7595(), 793, 19, 2055), rVar));
        }
        return C0095.m9198(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        return (tVar == C0081.m7843() || tVar == C0094.m9122()) ? this : C0096.m10784(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(mVar, m7593(this), C0088.m8508());
    }

    public final int H(A a) {
        return m7593(a) - m7593(this);
    }

    @Override // j$.time.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return m7593(this) == m7593((A) obj);
        }
        return false;
    }

    @Override // j$.time.z
    public final int hashCode() {
        return m7593(this);
    }

    @Override // j$.time.z
    public final String toString() {
        return m7594(this);
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0105.m11310(m7595(), 732, 42, 2686));
    }

    @Override // j$.time.z
    final void G(ObjectOutput objectOutput) {
        C0092.m8730(objectOutput, 8);
        m7591(this, objectOutput);
    }

    final void O(DataOutput dataOutput) {
        int iM7593 = m7593(this);
        int i = iM7593 % DescriptorProtos.Edition.EDITION_LEGACY_VALUE == 0 ? iM7593 / DescriptorProtos.Edition.EDITION_LEGACY_VALUE : WorkQueueKt.MASK;
        C0092.m8730(dataOutput, i);
        if (i == 127) {
            C0091.m8668(dataOutput, iM7593);
        }
    }

    static A N(ObjectInput objectInput) {
        byte bM11126 = C0103.m11126(objectInput);
        return bM11126 == 127 ? C0090.m8622(C0091.m8693(objectInput)) : C0090.m8622(bM11126 * 900);
    }
}
