package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.C0650v;
import j$.util.OptionalInt;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.C0106;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0525b0 extends AbstractC0524b implements IntStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f530short = {2386, 2388, 2382, 2377, 2368, 2311, 2414, 2377, 2387, 2420, 2387, 2389, 2370, 2374, 2378, 2313, 2374, 2371, 2374, 2391, 2387, 2319, 2420, 2391, 2379, 2382, 2387, 2370, 2389, 2374, 2387, 2376, 2389, 2331, 2414, 2377, 2387, 2370, 2368, 2370, 2389, 2329, 2311, 2388, 2318, 1776, 1751, 1741, 1770, 1741, 1739, 1756, 1752, 1748, 1687, 1752, 1757, 1752, 1737, 1741, 1681, 1770, 1737, 1749, 1744, 1741, 1756, 1739, 1752, 1741, 1750, 1739, 1669, 1776, 1751, 1741, 1756, 1758, 1756, 1739, 1671, 1689, 1738, 1680, 1313, 1319, 1341, 1338, 1331, 1396, 1309, 1338, 1312, 1287, 1312, 1318, 1329, 1333, 1337, 1402, 1333, 1328, 1333, 1316, 1312, 1404, 1287, 1341, 1338, 1343, 1384, 1309, 1338, 1312, 1329, 1331, 1329, 1318, 1386, 1396, 1319, 1405};

    /* JADX INFO: renamed from: ۟۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static Stream m9987(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0557h2) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m9988() {
        if (C0099.m10878() <= 0) {
            return EnumC0629w0.ANY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static F m9989() {
        if (C0095.m9210() >= 0) {
            return H.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static H0 m9990(Object obj, Object obj2, boolean z) {
        if (C0088.m8503() > 0) {
            return AbstractC0644z0.G((AbstractC0524b) obj, (j$.util.f0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9991() {
        if (C0106.m11345() < 0) {
            return EnumC0543e3.p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Stream m9992(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0525b0) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m9993(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0524b) obj).z((K3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m9994() {
        if (C0094.m9148() > 0) {
            return EnumC0543e3.o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۨ, reason: not valid java name and contains not printable characters */
    public static B0 m9995(long j) {
        if (C0093.m9101() > 0) {
            return AbstractC0644z0.T(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static F m9996() {
        if (C0090.m8624() >= 0) {
            return H.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m9997(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static IntStream m9998(Object obj, long j, long j2) {
        if (C0092.m8724() < 0) {
            return AbstractC0644z0.Z((AbstractC0525b0) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۥ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m9999() {
        if (C0102.m11109() <= 0) {
            return EnumC0629w0.ALL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static int m10000() {
        if (C0099.m10878() < 0) {
            return m4.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10001(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.W m10002(Object obj) {
        if (C0081.m7818() < 0) {
            return V((j$.util.f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static C0634x0 m10003(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return AbstractC0644z0.a0((EnumC0629w0) obj, (IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m10004() {
        if (C0098.m10857() <= 0) {
            return m4.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static L0 m10005(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0524b) obj).A((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m10006() {
        if (C0100.m10983() > 0) {
            return EnumC0543e3.t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m10007() {
        if (C0099.m10878() < 0) {
            return f530short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m10008() {
        if (C0083.m8022() < 0) {
            return EnumC0543e3.q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10009() {
        if (C0099.m10878() <= 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m10010(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0525b0) obj).collect((Supplier) obj2, (ObjIntConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
    public static OptionalInt m10011(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((AbstractC0525b0) obj).reduce((IntBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static j$.util.W m10012(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0525b0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۧ, reason: contains not printable characters */
    public static int m10013(Object obj, int i, Object obj2) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0525b0) obj).reduce(i, (IntBinaryOperator) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۢۧ, reason: contains not printable characters */
    public static EnumC0629w0 m10014() {
        if (C0092.m8724() <= 0) {
            return EnumC0629w0.NONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.J m10015(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0525b0) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static int m10016() {
        if (C0102.m11109() <= 0) {
            return EnumC0543e3.n;
        }
        return 0;
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) m9993(this, m9989());
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) m9993(this, m9996());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new I2(this, m10008() | m9994(), 0);
    }

    public void forEach(IntConsumer intConsumer) {
        C0099.m10863(intConsumer);
        m9993(this, new N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        C0099.m10863(intConsumer);
        m9993(this, new N(intConsumer, true));
    }

    private static j$.util.W V(j$.util.f0 f0Var) {
        if (f0Var instanceof j$.util.W) {
            return (j$.util.W) f0Var;
        }
        if (m10009()) {
            m9997(AbstractC0524b.class, C0103.m11135(m10007(), 0, 45, 2343));
            throw null;
        }
        throw new UnsupportedOperationException(C0100.m10962(m10007(), 45, 39, 1721));
    }

    @Override // j$.util.stream.AbstractC0524b
    final EnumC0548f3 E() {
        return C0079.m7521();
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 B(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z, IntFunction intFunction) {
        return m9990(abstractC0524b, f0Var, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 Q(AbstractC0524b abstractC0524b, Supplier supplier, boolean z) {
        return new C0607r3(abstractC0524b, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean D(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        Object u;
        boolean zM10001;
        j$.util.W wM10002 = m10002(f0Var);
        if (interfaceC0597p2 instanceof IntConsumer) {
            u = (IntConsumer) interfaceC0597p2;
        } else {
            if (m10009()) {
                m9997(AbstractC0524b.class, C0104.m11206(m10007(), 84, 38, 1364));
                throw null;
            }
            C0099.m10863(interfaceC0597p2);
            u = new U(interfaceC0597p2);
        }
        do {
            zM10001 = m10001(interfaceC0597p2);
            if (zM10001) {
                break;
            }
        } while (C0081.m7828(wM10002, u));
        return zM10001;
    }

    @Override // j$.util.stream.AbstractC0524b
    final D0 J(long j, IntFunction intFunction) {
        return m9995(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.J iterator() {
        return C0080.m7560(m10012(this));
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final j$.util.W spliterator() {
        return m10002(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new C0628w(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final E asDoubleStream() {
        return new C0618u(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0613t(this, 0, new C0599q(12), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        C0099.m10863(null);
        return new C0623v(this, m9991() | m10016(), 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        C0099.m10863(intFunction);
        return new C0613t(this, m9991() | m10016(), intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream l() {
        C0099.m10863(null);
        return new C0628w(this, m9991() | m10016(), 2);
    }

    @Override // j$.util.stream.IntStream
    public final E f() {
        C0099.m10863(null);
        return new C0618u(this, m9991() | m10016(), 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        C0099.m10863(intBinaryOperator);
        return C0081.m7858((Integer) m9993(this, new Q1(C0079.m7521(), intBinaryOperator, i)));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream o(R0 r0) {
        C0099.m10863(r0);
        return new W(this, m9991() | m10016() | m10006(), r0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        C0099.m10863(intBinaryOperator);
        return (OptionalInt) m9993(this, new D1(C0079.m7521(), intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        C0099.m10863(intPredicate);
        return new W(this, m10006(), intPredicate, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        C0099.m10863(intConsumer);
        return new W(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C0099.m10925(j));
        }
        return m9998(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : m9998(this, j, -1L);
        }
        throw new IllegalArgumentException(C0099.m10925(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        m10004();
        C0099.m10863(intPredicate);
        return new S3(this, m10004(), intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        m10004();
        C0099.m10863(intPredicate);
        return new U3(this, m10000(), intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return C0088.m8558((Long) m9993(this, new H1(3)));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return C0083.m8018(m9987((AbstractC0557h2) m9992(this)), new C0599q(11));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return m10013(this, 0, new C0599q(16));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return m10011(this, new C0599q(13));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return m10011(this, new C0599q(17));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A average() {
        long j = ((long[]) m10010(this, new C0599q(18), new C0599q(19), new C0599q(20)))[0];
        return j > 0 ? C0097.m10831(r0[1] / j) : C0079.m7523();
    }

    @Override // j$.util.stream.IntStream
    public final C0650v summaryStatistics() {
        return (C0650v) m10010(this, new C0569k(21), new C0599q(14), new C0599q(15));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        C0099.m10863(biConsumer);
        r rVar = new r(biConsumer, 1);
        C0099.m10863(supplier);
        C0099.m10863(objIntConsumer);
        C0099.m10863(rVar);
        return m9993(this, new F1(C0079.m7521(), rVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return C0089.m8595((Boolean) m9993(this, m10003(m9988(), intPredicate)));
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return C0089.m8595((Boolean) m9993(this, m10003(m9999(), intPredicate)));
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return C0089.m8595((Boolean) m9993(this, m10003(m10014(), intPredicate)));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) C0088.m8561(C0086.m8329((H0) m10005(this, new C0599q(10))));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return m10015(this);
    }
}
