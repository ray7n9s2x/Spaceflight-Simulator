package j$.util.concurrent;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes3.dex */
public class z extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    long a;
    int b;
    boolean c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f491short = {1003, 1015, 1021, 391, 384, 391, 410, 391, 399, 386, 391, 404, 395, 394, 2013, 1985, 1995, 3134, 3129, 3134, 3107, 3134, 3126, 3131, 3134, 3117, 3122, 3123, 790, 795, 769, 794, 784, 852, 793, 769, 775, 768, 852, 790, 785, 852, 787, 774, 785, 789, 768, 785, 774, 852, 768, 796, 789, 794, 852, 795, 774, 797, 787, 797, 794, 2356, 2350, 2365, 2338, 2407, 2346, 2354, 2356, 2355, 2407, 2341, 2338, 2407, 2345, 2344, 2345, 2410, 2345, 2338, 2336, 2342, 2355, 2350, 2353, 2338, 946, 959, 933, 958, 948, 1008, 957, 933, 931, 932, 1008, 946, 949, 1008, 951, 930, 949, 945, 932, 949, 930, 1008, 932, 952, 945, 958, 1008, 959, 930, 953, 951, 953, 958, 1420, 1430, 1413, 1434, 1503, 1426, 1418, 1420, 1419, 1503, 1437, 1434, 1503, 1425, 1424, 1425, 1490, 1425, 1434, 1432, 1438, 1419, 1430, 1417, 1434, 544, 557, 567, 556, 550, 610, 559, 567, 561, 566, 610, 544, 551, 610, 549, 560, 551, 547, 566, 551, 560, 610, 566, 554, 547, 556, 610, 557, 560, 555, 549, 555, 556, 984, 962, 977, 974, 907, 966, 990, 984, 991, 907, 969, 974, 907, 965, 964, 965, 902, 965, 974, 972, 970, 991, 962, 989, 974, 1860, 1865, 1875, 1864, 1858, 1798, 1867, 1875, 1877, 1874, 1798, 1860, 1859, 1798, 1857, 1876, 1859, 1863, 1874, 1859, 1876, 1798, 1874, 1870, 1863, 1864, 1798, 1865, 1876, 1871, 1857, 1871, 1864, 1755, 1729, 1746, 1741, 1672, 1733, 1757, 1755, 1756, 1672, 1738, 1741, 1672, 1734, 1735, 1734, 1669, 1734, 1741, 1743, 1737, 1756, 1729, 1758, 1741, 1687, 1677, 1694, 1665, 1732, 1673, 1681, 1687, 1680, 1732, 1670, 1665, 1732, 1674, 1675, 1674, 1737, 1674, 1665, 1667, 1669, 1680, 1677, 1682, 1665, 1549, 1536, 1562, 1537, 1547, 1615, 1538, 1562, 1564, 1563, 1615, 1549, 1546, 1615, 1544, 1565, 1546, 1550, 1563, 1546, 1565, 1615, 1563, 1543, 1550, 1537, 1615, 1536, 1565, 1542, 1544, 1542, 1537, 3275, 3270, 3292, 3271, 3277, 3209, 3268, 3292, 3290, 3293, 3209, 3275, 3276, 3209, 3278, 3291, 3276, 3272, 3293, 3276, 3291, 3209, 3293, 3265, 3272, 3271, 3209, 3270, 3291, 3264, 3278, 3264, 3271, 2117, 2143, 2124, 2131, 2070, 2139, 2115, 2117, 2114, 2070, 2132, 2131, 2070, 2136, 2137, 2136, 2075, 2136, 2131, 2129, 2135, 2114, 2143, 2112, 2131, 1485, 1472, 1498, 1473, 1483, 1423, 1474, 1498, 1500, 1499, 1423, 1485, 1482, 1423, 1503, 1472, 1500, 1478, 1499, 1478, 1497, 1482, 1696, 1709, 1719, 1708, 1702, 1762, 1711, 1719, 1713, 1718, 1762, 1696, 1703, 1762, 1701, 1712, 1703, 1699, 1718, 1703, 1712, 1762, 1718, 1706, 1699, 1708, 1762, 1709, 1712, 1707, 1701, 1707, 1708, 2541, 2528, 2554, 2529, 2539, 2479, 2530, 2554, 2556, 2555, 2479, 2541, 2538, 2479, 2559, 2528, 2556, 2534, 2555, 2534, 2553, 2538, 652, 641, 667, 640, 650, 718, 643, 667, 669, 666, 718, 652, 651, 718, 649, 668, 651, 655, 666, 651, 668, 718, 666, 646, 655, 640, 718, 641, 668, 647, 649, 647, 640, 703, 690, 680, 691, 697, 765, 688, 680, 686, 681, 765, 703, 696, 765, 685, 690, 686, 692, 681, 692, 683, 696, 417, 428, 438, 429, 423, 483, 430, 438, 432, 439, 483, 417, 422, 483, 420, 433, 422, 418, 439, 422, 433, 483, 439, 427, 418, 429, 483, 428, 433, 426, 420, 426, 429};
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField(C0096.m10776(m9058(), 0, 3, 921), C0100.m10964()), new ObjectStreamField(C0088.m8518(m9058(), 3, 11, 494), C0091.m8680())};
    private static final ThreadLocal d = new ThreadLocal();
    private static final AtomicInteger e = new AtomicInteger();
    private static final ThreadLocal f = new u();
    private static final AtomicLong g = new AtomicLong(m9060(C0089.m8596()) ^ m9060(C0085.m8272()));

    /* synthetic */ z(int i) {
        this();
    }

    private static int h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long i(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static double m9046(Object obj, double d2, double d3) {
        return C0092.m8724() <= 0 ? ((z) obj).d(d2, d3) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m9047() {
        if (C0082.m7983() <= 0) {
            return f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9048(Object obj) {
        if (C0087.m8458() < 0) {
            return ((z) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m9049() {
        if (C0094.m9148() >= 0) {
            g();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۧ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m9050() {
        if (C0106.m11345() <= 0) {
            return e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m9051() {
        if (C0096.m10782() > 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static long m9052(Object obj) {
        if (C0087.m8458() < 0) {
            return ((z) obj).j();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۡ۟, reason: not valid java name and contains not printable characters */
    public static AtomicLong m9053() {
        if (C0097.m10823() > 0) {
            return g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۡ, reason: not valid java name and contains not printable characters */
    public static long m9054(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((z) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۥۨۢ, reason: not valid java name and contains not printable characters */
    public static int m9055(Object obj) {
        if (C0079.m7512() > 0) {
            return ((z) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۥۤ, reason: contains not printable characters */
    public static int m9056(Object obj, int i, int i2) {
        if (C0081.m7818() <= 0) {
            return ((z) obj).e(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۡۦ, reason: contains not printable characters */
    public static int m9057(long j) {
        if (C0092.m8724() < 0) {
            return h(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۡ۟, reason: contains not printable characters */
    public static short[] m9058() {
        if (C0080.m7553() >= 0) {
            return f491short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static long m9059(Object obj, long j, long j2) {
        if (C0094.m9148() > 0) {
            return ((z) obj).f(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۦۨ, reason: not valid java name and contains not printable characters */
    public static long m9060(long j) {
        if (C0087.m8458() < 0) {
            return i(j);
        }
        return 0L;
    }

    private z() {
        this.c = true;
    }

    static final void g() {
        int iM9083 = C0093.m9083(m9050(), -1640531527);
        if (iM9083 == 0) {
            iM9083 = 1;
        }
        long jM9060 = m9060(C0089.m8582(m9053(), -4942790177534073029L));
        z zVar = (z) C0099.m10864(m9047());
        zVar.a = jM9060;
        zVar.b = iM9083;
    }

    public static z b() {
        z zVar = (z) C0099.m10864(m9047());
        if (m9055(zVar) == 0) {
            m9049();
        }
        return zVar;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (m9048(this)) {
            throw new UnsupportedOperationException();
        }
    }

    final long j() {
        long jM9054 = m9054(this) - 7046029254386353131L;
        this.a = jM9054;
        return jM9054;
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return C0086.m8311(this) >>> (32 - i);
    }

    final long f(long j, long j2) {
        long jM9060 = m9060(m9052(this));
        if (j >= j2) {
            return jM9060;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (jM9060 & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = jM9060 >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                jM9060 = m9060(m9052(this));
            }
        } else {
            while (true) {
                if (jM9060 >= j && jM9060 < j2) {
                    return jM9060;
                }
                jM9060 = m9060(m9052(this));
            }
        }
    }

    final int e(int i, int i2) {
        int i3;
        int iM9057 = m9057(m9052(this));
        if (i >= i2) {
            return iM9057;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = iM9057 & i5;
        } else if (i4 > 0) {
            int iM90572 = iM9057 >>> 1;
            while (true) {
                int i6 = iM90572 + i5;
                i3 = iM90572 % i4;
                if (i6 - i3 >= 0) {
                    break;
                }
                iM90572 = m9057(m9052(this)) >>> 1;
            }
        } else {
            while (true) {
                if (iM9057 >= i && iM9057 < i2) {
                    return iM9057;
                }
                iM9057 = m9057(m9052(this));
            }
        }
        return i3 + i;
    }

    final double d(double d2, double d3) {
        double dM11055 = (C0101.m11055(this) >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return dM11055;
        }
        double d4 = ((d3 - d2) * dM11055) + d2;
        return d4 >= d3 ? C0087.m8469(C0104.m11203(d3) - 1) : d4;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m9057(m9052(this));
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C0089.m8581(m9058(), 431, 22, 2447));
        }
        int iM9057 = m9057(m9052(this));
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return iM9057 & i2;
        }
        while (true) {
            int i3 = iM9057 >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            iM9057 = m9057(m9052(this));
        }
    }

    public final int nextInt(int i, int i2) {
        if (i >= i2) {
            throw new IllegalArgumentException(C0106.m11346(m9058(), 453, 33, 750));
        }
        return m9056(this, i, i2);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m9060(m9052(this));
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException(C0087.m8474(m9058(), 486, 22, 733));
        }
        long jM9060 = m9060(m9052(this));
        long j2 = j - 1;
        if ((j & j2) == 0) {
            return jM9060 & j2;
        }
        while (true) {
            long j3 = jM9060 >>> 1;
            long j4 = j3 + j2;
            long j5 = j3 % j;
            if (j4 - j5 >= 0) {
                return j5;
            }
            jM9060 = m9060(m9052(this));
        }
    }

    public final long nextLong(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException(C0105.m11310(m9058(), 508, 33, 451));
        }
        return m9059(this, j, j2);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m9060(m9052(this)) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException(C0100.m10962(m9058(), 376, 22, 1455));
        }
        double dM9060 = (m9060(m9052(this)) >>> 11) * 1.1102230246251565E-16d * d2;
        return dM9060 < d2 ? dM9060 : C0087.m8469(C0104.m11203(d2) - 1);
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 >= d3) {
            throw new IllegalArgumentException(C0087.m8474(m9058(), 398, 33, 1730));
        }
        return m9046(this, d2, d3);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m9057(m9052(this)) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m9057(m9052(this)) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocalM9051 = m9051();
        Double d2 = (Double) C0099.m10864(threadLocalM9051);
        if (d2 != null) {
            C0086.m8294(threadLocalM9051, null);
            return C0090.m8616(d2);
        }
        while (true) {
            double dM9085 = (C0093.m9085(this) * 2.0d) - 1.0d;
            double dM90852 = (C0093.m9085(this) * 2.0d) - 1.0d;
            double d3 = (dM90852 * dM90852) + (dM9085 * dM9085);
            if (d3 < 1.0d && d3 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double dM9184 = C0095.m9184((C0099.m10886(d3) * (-2.0d)) / d3);
                C0086.m8294(threadLocalM9051, C0085.m8245(dM90852 * dM9184));
                return dM9085 * dM9184;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j >= 0) {
            return C0097.m10806(C0104.m11241(new x(0L, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException(C0093.m9062(m9058(), 177, 25, 939));
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C0097.m10806(C0104.m11241(new x(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException(C0095.m9204(m9058(), 235, 25, 1704));
        }
        if (i < i2) {
            return C0097.m10806(C0104.m11241(new x(0L, j, i, i2)));
        }
        throw new IllegalArgumentException(C0080.m7573(m9058(), 202, 33, 1830));
    }

    @Override // java.util.Random
    public final IntStream ints(int i, int i2) {
        if (i < i2) {
            return C0097.m10806(C0104.m11241(new x(0L, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException(C0084.m8120(m9058(), 144, 33, 578));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j >= 0) {
            return C0091.m8704(C0100.m10982(new y(0L, j, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException(C0097.m10853(m9058(), 260, 25, 1764));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C0091.m8704(C0100.m10982(new y(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException(C0085.m8236(m9058(), 351, 25, 2102));
        }
        if (j2 < j3) {
            return C0091.m8704(C0100.m10982(new y(0L, j, j2, j3)));
        }
        throw new IllegalArgumentException(C0093.m9062(m9058(), 318, 33, 3241));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C0091.m8704(C0100.m10982(new y(0L, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException(C0092.m8731(m9058(), 285, 33, 1647));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return C0103.m11164(C0103.m11134(new w(0L, j, Double.MAX_VALUE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
        }
        throw new IllegalArgumentException(C0102.m11094(m9058(), 61, 25, 2375));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return C0103.m11164(C0103.m11134(new w(0L, Long.MAX_VALUE, Double.MAX_VALUE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d2, double d3) {
        if (j < 0) {
            throw new IllegalArgumentException(C0095.m9204(m9058(), 119, 25, 1535));
        }
        if (d2 < d3) {
            return C0103.m11164(C0103.m11134(new w(0L, j, d2, d3)));
        }
        throw new IllegalArgumentException(C0091.m8679(m9058(), 86, 33, 976));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d2, double d3) {
        if (d2 < d3) {
            return C0103.m11164(C0103.m11134(new w(0L, Long.MAX_VALUE, d2, d3)));
        }
        throw new IllegalArgumentException(C0100.m10962(m9058(), 28, 33, 884));
    }

    static final int c() {
        return m9055((z) C0099.m10864(m9047()));
    }

    static final int a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((z) C0099.m10864(m9047())).b = i4;
        return i4;
    }

    static {
        if (C0089.m8595((Boolean) C0089.m8602(new v()))) {
            byte[] bArrM10869 = C0099.m10869(8);
            long j = ((long) bArrM10869[0]) & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (((long) bArrM10869[i]) & 255);
            }
            C0104.m11191(m9053(), j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldM7799 = C0081.m7799(objectOutputStream);
        C0084.m8106(putFieldM7799, C0080.m7573(m9058(), 14, 3, 1967), m9054(this));
        C0104.m11237(putFieldM7799, C0091.m8679(m9058(), 17, 11, 3159), true);
        C0102.m11069(objectOutputStream);
    }

    private Object readResolve() {
        return C0101.m11046();
    }
}
