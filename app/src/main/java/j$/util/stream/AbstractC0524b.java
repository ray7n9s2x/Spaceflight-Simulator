package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
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
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0524b implements BaseStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f529short = {2687, 2680, 2686, 2665, 2669, 2657, 2604, 2660, 2669, 2687, 2604, 2669, 2656, 2686, 2665, 2669, 2664, 2677, 2604, 2670, 2665, 2665, 2658, 2604, 2659, 2684, 2665, 2686, 2669, 2680, 2665, 2664, 2604, 2681, 2684, 2659, 2658, 2604, 2659, 2686, 2604, 2671, 2656, 2659, 2687, 2665, 2664, 1433, 1413, 1439, 1432, 1417, 1423, 1482, 1419, 1414, 1432, 1423, 1419, 1422, 1427, 1482, 1417, 1413, 1412, 1433, 1439, 1415, 1423, 1422, 1482, 1413, 1432, 1482, 1417, 1414, 1413, 1433, 1423, 1422, 1392, 1399, 1393, 1382, 1378, 1390, 1315, 1387, 1378, 1392, 1315, 1378, 1391, 1393, 1382, 1378, 1383, 1402, 1315, 1377, 1382, 1382, 1389, 1315, 1388, 1395, 1382, 1393, 1378, 1399, 1382, 1383, 1315, 1398, 1395, 1388, 1389, 1315, 1388, 1393, 1315, 1376, 1391, 1388, 1392, 1382, 1383, 395, 442, 425, 442, 439, 439, 446, 439, 507, 446, 429, 442, 439, 430, 442, 431, 434, 436, 437, 507, 434, 424, 507, 437, 436, 431, 507, 424, 430, 427, 427, 436, 425, 431, 446, 447, 1824, 1852, 1830, 1825, 1840, 1846, 1907, 1842, 1855, 1825, 1846, 1842, 1847, 1834, 1907, 1840, 1852, 1853, 1824, 1830, 1854, 1846, 1847, 1907, 1852, 1825, 1907, 1840, 1855, 1852, 1824, 1846, 1847, 990, 985, 991, 968, 972, 960, 909, 965, 972, 990, 909, 972, 961, 991, 968, 972, 969, 980, 909, 975, 968, 968, 963, 909, 962, 989, 968, 991, 972, 985, 968, 969, 909, 984, 989, 962, 963, 909, 962, 991, 909, 974, 961, 962, 990, 968, 969, 1756, 1755, 1757, 1738, 1742, 1730, 1679, 1735, 1742, 1756, 1679, 1742, 1731, 1757, 1738, 1742, 1739, 1750, 1679, 1741, 1738, 1738, 1729, 1679, 1728, 1759, 1738, 1757, 1742, 1755, 1738, 1739, 1679, 1754, 1759, 1728, 1729, 1679, 1728, 1757, 1679, 1740, 1731, 1728, 1756, 1738, 1739, 2942, 2914, 2936, 2943, 2926, 2920, 2861, 2924, 2913, 2943, 2920, 2924, 2921, 2932, 2861, 2926, 2914, 2915, 2942, 2936, 2912, 2920, 2921, 2861, 2914, 2943, 2861, 2926, 2913, 2914, 2942, 2920, 2921, 281, 286, 280, 271, 267, 263, 330, 258, 267, 281, 330, 267, 262, 280, 271, 267, 270, 275, 330, 264, 271, 271, 260, 330, 261, 282, 271, 280, 267, 286, 271, 270, 330, 287, 282, 261, 260, 330, 261, 280, 330, 265, 262, 261, 281, 271, 270, 2335, 2328, 2334, 2313, 2317, 2305, 2380, 2308, 2317, 2335, 2380, 2317, 2304, 2334, 2313, 2317, 2312, 2325, 2380, 2318, 2313, 2313, 2306, 2380, 2307, 2332, 2313, 2334, 2317, 2328, 2313, 2312, 2380, 2329, 2332, 2307, 2306, 2380, 2307, 2334, 2380, 2319, 2304, 2307, 2335, 2313, 2312};
    private final AbstractC0524b a;
    private final AbstractC0524b b;
    protected final int c;
    private AbstractC0524b d;
    private int e;
    private int f;
    private j$.util.f0 g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    /* JADX INFO: renamed from: ۟۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9941(Object obj, int i) {
        if (C0092.m8724() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m9942() {
        if (C0081.m7818() <= 0) {
            return f529short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9943(Object obj, Object obj2, Object obj3) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9944(Object obj) {
        if (C0084.m8116() > 0) {
            return ((AbstractC0524b) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9945(Object obj, Object obj2, Object obj3) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0524b) obj).D((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9946() {
        if (C0101.m11044() <= 0) {
            return EnumC0543e3.u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m9947(Object obj) {
        if (C0094.m9148() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9948(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0084.m8116() >= 0) {
            return ((AbstractC0524b) obj).Q((AbstractC0524b) obj2, (Supplier) obj3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static long m9949(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9950(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m9951(Object obj, long j) {
        if (C0094.m9148() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9952(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0524b) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9953(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m9954() {
        if (C0105.m11264() >= 0) {
            return EnumC0543e3.h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9955() {
        if (C0088.m8503() >= 0) {
            return EnumC0543e3.SHORT_CIRCUIT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ۟, reason: not valid java name and contains not printable characters */
    public static D0 m9956(Object obj, long j, Object obj2) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0524b) obj).J(j, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9957(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0524b) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۠, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m9958(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0524b) obj).E();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m9959() {
        if (C0080.m7553() > 0) {
            return EnumC0543e3.l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9960(Object obj, int i) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0524b) obj).O(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۣ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9961(Object obj, int i, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((AbstractC0524b) obj).N(i, (InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static L0 m9962(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9963(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0524b) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m9964(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0524b) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9965(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0524b) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9966(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0524b) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m9967(Object obj, Object obj2, Object obj3) {
        if (C0093.m9101() > 0) {
            return ((K3) obj).c((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9968() {
        if (C0079.m7512() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9969(Object obj, Object obj2, Object obj3) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0524b) obj).x((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9970(Object obj, Object obj2, Object obj3) {
        if (C0102.m11109() <= 0) {
            ((AbstractC0524b) obj).w((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int m9971(Object obj) {
        if (C0091.m8708() > 0) {
            return ((K3) obj).d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m9972(Object obj, Object obj2, Object obj3) {
        if (C0080.m7553() > 0) {
            return ((K3) obj).b((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۦ, reason: not valid java name and contains not printable characters */
    public static int m9973() {
        if (C0103.m11154() <= 0) {
            return EnumC0543e3.s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9974() {
        if (C0094.m9148() > 0) {
            return EnumC0543e3.t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9975(Object obj) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0524b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static L0 m9976(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0524b) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠۠, reason: contains not printable characters */
    public static int m9977(int i, int i2) {
        if (C0080.m7553() >= 0) {
            return EnumC0543e3.j(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static L0 m9978(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0524b) obj).y((j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static int m9979() {
        if (C0104.m11196() > 0) {
            return EnumC0543e3.g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۤۧ, reason: contains not printable characters */
    public static Runnable m9980(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0524b) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۡ, reason: contains not printable characters */
    public static L0 m9981(Object obj, Object obj2, Object obj3, boolean z, Object obj4) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0524b) obj).B((AbstractC0524b) obj2, (j$.util.f0) obj3, z, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۨ, reason: contains not printable characters */
    public static AbstractC0524b m9982(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0524b) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9983(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0524b) obj).M();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9984(Object obj, Object obj2, Object obj3) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0524b) obj).L((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9985(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0524b) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9986() {
        if (C0106.m11345() <= 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    abstract L0 B(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z, IntFunction intFunction);

    abstract boolean D(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2);

    abstract EnumC0548f3 E();

    abstract D0 J(long j, IntFunction intFunction);

    abstract boolean M();

    abstract InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2);

    abstract j$.util.f0 Q(AbstractC0524b abstractC0524b, Supplier supplier, boolean z);

    AbstractC0524b(j$.util.f0 f0Var, int i, boolean z) {
        this.b = null;
        this.g = f0Var;
        this.a = this;
        int iM9979 = m9979() & i;
        this.c = iM9979;
        this.f = (~(iM9979 << 1)) & m9959();
        this.e = 0;
        this.k = z;
    }

    AbstractC0524b(AbstractC0524b abstractC0524b, int i) {
        if (m9985(abstractC0524b)) {
            throw new IllegalStateException(C0085.m8236(m9942(), 0, 47, 2572));
        }
        abstractC0524b.h = true;
        abstractC0524b.d = this;
        this.b = abstractC0524b;
        this.c = m9954() & i;
        this.f = m9977(i, m9966(abstractC0524b));
        AbstractC0524b abstractC0524bM9975 = m9975(abstractC0524b);
        this.a = abstractC0524bM9975;
        if (m9983(this)) {
            abstractC0524bM9975.i = true;
        }
        this.e = m9964(abstractC0524b) + 1;
    }

    final Object z(K3 k3) {
        if (m9985(this)) {
            throw new IllegalStateException(C0105.m11310(m9942(), 370, 47, 2412));
        }
        this.h = true;
        if (m9965(m9975(this))) {
            return m9967(k3, this, m9960(this, m9971(k3)));
        }
        return m9972(k3, this, m9960(this, m9971(k3)));
    }

    final L0 A(IntFunction intFunction) {
        AbstractC0524b abstractC0524bM9957;
        if (m9985(this)) {
            throw new IllegalStateException(C0099.m10897(m9942(), 80, 47, 1283));
        }
        this.h = true;
        if (m9965(m9975(this)) && (abstractC0524bM9957 = m9957(this)) != null && m9983(this)) {
            this.e = 0;
            return m9976(this, abstractC0524bM9957, m9960(abstractC0524bM9957, 0), intFunction);
        }
        return m9978(this, m9960(this, 0), true, intFunction);
    }

    final j$.util.f0 P() {
        AbstractC0524b abstractC0524bM9975 = m9975(this);
        if (this != abstractC0524bM9975) {
            throw new IllegalStateException();
        }
        if (m9985(this)) {
            throw new IllegalStateException(C0101.m11060(m9942(), 196, 47, 941));
        }
        this.h = true;
        j$.util.f0 f0VarM9963 = m9963(abstractC0524bM9975);
        if (f0VarM9963 != null) {
            abstractC0524bM9975.g = null;
            return f0VarM9963;
        }
        throw new IllegalStateException(C0095.m9204(m9942(), 163, 33, 1875));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final BaseStream sequential() {
        m9975(this).k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final BaseStream parallel() {
        m9975(this).k = true;
        return this;
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0524b abstractC0524bM9975 = m9975(this);
        Runnable runnableM9980 = m9980(abstractC0524bM9975);
        if (runnableM9980 != null) {
            abstractC0524bM9975.j = null;
            C0094.m9128(runnableM9980);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        Runnable j3 = runnable;
        if (m9985(this)) {
            throw new IllegalStateException(C0082.m7966(m9942(), 243, 47, 1711));
        }
        C0099.m10863(j3);
        AbstractC0524b abstractC0524bM9975 = m9975(this);
        Runnable runnableM9980 = m9980(abstractC0524bM9975);
        if (runnableM9980 != null) {
            j3 = new J3(runnableM9980, j3);
        }
        abstractC0524bM9975.j = j3;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public j$.util.f0 spliterator() {
        if (m9985(this)) {
            throw new IllegalStateException(C0083.m8037(m9942(), 323, 47, 362));
        }
        this.h = true;
        AbstractC0524b abstractC0524bM9975 = m9975(this);
        if (this == abstractC0524bM9975) {
            j$.util.f0 f0VarM9963 = m9963(abstractC0524bM9975);
            if (f0VarM9963 != null) {
                abstractC0524bM9975.g = null;
                return f0VarM9963;
            }
            throw new IllegalStateException(C0095.m9204(m9942(), 290, 33, 2829));
        }
        return m9948(this, this, new C0519a(0, this), m9965(abstractC0524bM9975));
    }

    final /* synthetic */ j$.util.f0 I() {
        return m9960(this, 0);
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return m9965(m9975(this));
    }

    final L0 y(j$.util.f0 f0Var, boolean z, IntFunction intFunction) {
        if (m9965(m9975(this))) {
            return m9981(this, this, f0Var, z, intFunction);
        }
        D0 d0M9956 = m9956(this, m9949(this, f0Var), intFunction);
        m9943(this, f0Var, d0M9956);
        return m9962(d0M9956);
    }

    private j$.util.f0 O(int i) {
        int i2;
        int iM9974;
        AbstractC0524b abstractC0524bM9975 = m9975(this);
        j$.util.f0 f0VarM9963 = m9963(abstractC0524bM9975);
        if (f0VarM9963 != null) {
            abstractC0524bM9975.g = null;
            if (m9965(abstractC0524bM9975) && m9944(abstractC0524bM9975)) {
                AbstractC0524b abstractC0524bM9982 = m9982(abstractC0524bM9975);
                int i3 = 1;
                while (abstractC0524bM9975 != this) {
                    int iM9952 = m9952(abstractC0524bM9982);
                    if (m9983(abstractC0524bM9982)) {
                        if (m9941(m9955(), iM9952)) {
                            iM9952 &= ~m9946();
                        }
                        f0VarM9963 = m9984(abstractC0524bM9982, abstractC0524bM9975, f0VarM9963);
                        if (C0088.m8562(f0VarM9963, 64)) {
                            i2 = (~m9974()) & iM9952;
                            iM9974 = m9973();
                        } else {
                            i2 = (~m9973()) & iM9952;
                            iM9974 = m9974();
                        }
                        iM9952 = i2 | iM9974;
                        i3 = 0;
                    }
                    abstractC0524bM9982.e = i3;
                    abstractC0524bM9982.f = m9977(iM9952, m9966(abstractC0524bM9975));
                    i3++;
                    AbstractC0524b abstractC0524b = abstractC0524bM9982;
                    abstractC0524bM9982 = m9982(abstractC0524bM9982);
                    abstractC0524bM9975 = abstractC0524b;
                }
            }
            if (i != 0) {
                this.f = m9977(i, m9966(this));
            }
            return f0VarM9963;
        }
        throw new IllegalStateException(C0087.m8474(m9942(), 47, 33, 1514));
    }

    final EnumC0548f3 F() {
        AbstractC0524b abstractC0524bM9957 = this;
        while (m9964(abstractC0524bM9957) > 0) {
            abstractC0524bM9957 = m9957(abstractC0524bM9957);
        }
        return m9958(abstractC0524bM9957);
    }

    final long C(j$.util.f0 f0Var) {
        if (m9941(m9986(), m9966(this))) {
            return C0088.m8548(f0Var);
        }
        return -1L;
    }

    final InterfaceC0597p2 R(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        m9970(this, f0Var, m9950(this, (InterfaceC0597p2) C0099.m10863(interfaceC0597p2)));
        return interfaceC0597p2;
    }

    final void w(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        C0099.m10863(interfaceC0597p2);
        if (!m9941(m9955(), m9966(this))) {
            m9951(interfaceC0597p2, C0088.m8548(f0Var));
            C0088.m8509(f0Var, interfaceC0597p2);
            m9947(interfaceC0597p2);
            return;
        }
        m9969(this, f0Var, interfaceC0597p2);
    }

    final boolean x(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        AbstractC0524b abstractC0524bM9957 = this;
        while (m9964(abstractC0524bM9957) > 0) {
            abstractC0524bM9957 = m9957(abstractC0524bM9957);
        }
        m9951(interfaceC0597p2, C0088.m8548(f0Var));
        boolean zM9945 = m9945(abstractC0524bM9957, f0Var, interfaceC0597p2);
        m9947(interfaceC0597p2);
        return zM9945;
    }

    final int G() {
        return m9966(this);
    }

    final boolean H() {
        return m9941(m9968(), m9966(this));
    }

    final InterfaceC0597p2 S(InterfaceC0597p2 interfaceC0597p2) {
        InterfaceC0597p2 interfaceC0597p2M9961 = interfaceC0597p2;
        C0099.m10863(interfaceC0597p2M9961);
        AbstractC0524b abstractC0524b = this;
        while (m9964(abstractC0524b) > 0) {
            AbstractC0524b abstractC0524bM9957 = m9957(abstractC0524b);
            interfaceC0597p2M9961 = m9961(abstractC0524b, m9966(abstractC0524bM9957), interfaceC0597p2M9961);
            abstractC0524b = abstractC0524bM9957;
        }
        return interfaceC0597p2M9961;
    }

    final j$.util.f0 T(j$.util.f0 f0Var) {
        return m9964(this) == 0 ? f0Var : m9948(this, this, new C0519a(6, f0Var), m9965(m9975(this)));
    }

    L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        throw new UnsupportedOperationException(C0082.m7966(m9942(), WorkQueueKt.MASK, 36, 475));
    }

    j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9953(m9976(this, abstractC0524b, f0Var, new C0569k(17)));
    }
}
