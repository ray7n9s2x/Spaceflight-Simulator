package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0653y;
import j$.util.function.C0094;
import java.io.C0103;
import java.io.C0104;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0580m0 extends AbstractC0524b implements LongStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f542short = {2286, 2280, 2290, 2293, 2300, 2235, 2263, 2292, 2293, 2300, 2248, 2287, 2281, 2302, 2298, 2294, 2229, 2298, 2303, 2298, 2283, 2287, 2227, 2248, 2283, 2295, 2290, 2287, 2302, 2281, 2298, 2287, 2292, 2281, 2215, 2263, 2292, 2293, 2300, 2213, 2235, 2280, 2226, 1121, 1090, 1091, 1098, 1150, 1113, 1119, 1096, 1100, 1088, 1027, 1100, 1097, 1100, 1117, 1113, 1029, 1150, 1117, 1089, 1092, 1113, 1096, 1119, 1100, 1113, 1090, 1119, 1041, 1121, 1090, 1091, 1098, 1043, 1037, 1118, 1028, 460, 458, 464, 471, 478, 409, 501, 470, 471, 478, 490, 461, 459, 476, 472, 468, 407, 472, 477, 472, 457, 461, 401, 490, 464, 471, 466, 389, 501, 470, 471, 478, 391, 409, 458, 400};

    /* JADX INFO: renamed from: ۟۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10329() {
        if (C0085.m8230() >= 0) {
            return EnumC0629w0.ANY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static F m10330() {
        if (C0104.m11196() > 0) {
            return I.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m10331() {
        if (C0079.m7512() >= 0) {
            return EnumC0543e3.t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m10332() {
        if (C0106.m11345() <= 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۢ, reason: not valid java name and contains not printable characters */
    public static int m10333() {
        if (C0092.m8724() < 0) {
            return EnumC0543e3.n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۢ, reason: not valid java name and contains not printable characters */
    public static int m10334() {
        if (C0104.m11196() > 0) {
            return m4.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static F m10335() {
        if (C0085.m8230() > 0) {
            return I.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.Z m10336(Object obj) {
        if (C0099.m10878() <= 0) {
            return V((j$.util.f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m10337() {
        if (C0088.m8503() > 0) {
            return m4.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Stream m10338(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0580m0) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.N m10339(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0580m0) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10340() {
        if (C0099.m10878() < 0) {
            return EnumC0629w0.NONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static long m10341(Object obj, long j, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0580m0) obj).reduce(j, (LongBinaryOperator) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m10342() {
        if (C0084.m8116() > 0) {
            return f542short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static J0 m10343(Object obj, Object obj2, boolean z) {
        if (C0098.m10857() <= 0) {
            return AbstractC0644z0.H((AbstractC0524b) obj, (j$.util.f0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m10344() {
        if (C0102.m11109() <= 0) {
            return EnumC0543e3.p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.B m10345(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0580m0) obj).reduce((LongBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static Object m10346(Object obj, Object obj2) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0524b) obj).z((K3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int m10347() {
        if (C0092.m8724() < 0) {
            return EnumC0543e3.q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m10348(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10349() {
        if (C0092.m8724() < 0) {
            return EnumC0629w0.ALL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m10350() {
        if (C0085.m8230() >= 0) {
            return EnumC0543e3.o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m10351(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0580m0) obj).collect((Supplier) obj2, (ObjLongConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۤ, reason: not valid java name and contains not printable characters */
    public static C0 m10352(long j) {
        if (C0094.m9148() >= 0) {
            return AbstractC0644z0.V(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۦ, reason: contains not printable characters */
    public static C0634x0 m10353(Object obj) {
        if (C0088.m8503() >= 0) {
            return AbstractC0644z0.c0((EnumC0629w0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ, reason: contains not printable characters */
    public static j$.util.Z m10354(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0580m0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۡ, reason: contains not printable characters */
    public static L0 m10355(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0524b) obj).A((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡۧ, reason: contains not printable characters */
    public static LongStream m10356(Object obj, long j, long j2) {
        if (C0090.m8624() >= 0) {
            return AbstractC0644z0.b0((AbstractC0580m0) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10357(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡ۠۟, reason: not valid java name and contains not printable characters */
    public static Stream m10358(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0557h2) obj).distinct();
        }
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B findAny() {
        return (j$.util.B) m10346(this, m10330());
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B findFirst() {
        return (j$.util.B) m10346(this, m10335());
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new J2(this, m10347() | m10350(), 0);
    }

    public void forEach(LongConsumer longConsumer) {
        C0099.m10863(longConsumer);
        m10346(this, new O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        C0099.m10863(longConsumer);
        m10346(this, new O(longConsumer, true));
    }

    private static j$.util.Z V(j$.util.f0 f0Var) {
        if (f0Var instanceof j$.util.Z) {
            return (j$.util.Z) f0Var;
        }
        if (m10332()) {
            m10348(AbstractC0524b.class, C0103.m11135(m10342(), 0, 43, 2203));
            throw null;
        }
        throw new UnsupportedOperationException(C0082.m7966(m10342(), 43, 37, 1069));
    }

    @Override // j$.util.stream.AbstractC0524b
    final EnumC0548f3 E() {
        return C0097.m10843();
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 B(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z, IntFunction intFunction) {
        return m10343(abstractC0524b, f0Var, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 Q(AbstractC0524b abstractC0524b, Supplier supplier, boolean z) {
        return new C0617t3(abstractC0524b, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean D(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        Object c0540e0;
        boolean zM10357;
        j$.util.Z zM10336 = m10336(f0Var);
        if (interfaceC0597p2 instanceof LongConsumer) {
            c0540e0 = (LongConsumer) interfaceC0597p2;
        } else {
            if (m10332()) {
                m10348(AbstractC0524b.class, C0099.m10897(m10342(), 80, 36, 441));
                throw null;
            }
            C0099.m10863(interfaceC0597p2);
            c0540e0 = new C0540e0(interfaceC0597p2);
        }
        do {
            zM10357 = m10357(interfaceC0597p2);
            if (zM10357) {
                break;
            }
        } while (C0091.m8667(zM10336, c0540e0));
        return zM10357;
    }

    @Override // j$.util.stream.AbstractC0524b
    final D0 J(long j, IntFunction intFunction) {
        return m10352(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.N iterator() {
        return C0088.m8538(m10354(this));
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final j$.util.Z spliterator() {
        return m10336(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final E asDoubleStream() {
        return new C0618u(this, m10333(), 5);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new C0613t(this, 0, new C0599q(26), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        C0099.m10863(null);
        return new C0628w(this, m10344() | m10333(), 3);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        C0099.m10863(longFunction);
        return new C0613t(this, m10344() | m10333(), longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final IntStream t() {
        C0099.m10863(null);
        return new C0623v(this, m10344() | m10333(), 3);
    }

    @Override // j$.util.stream.LongStream
    public final E k() {
        C0099.m10863(null);
        return new C0618u(this, m10344() | m10333(), 6);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b(C0519a c0519a) {
        C0099.m10863(c0519a);
        return new C0565j0(this, m10344() | m10333() | m10331(), c0519a, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d() {
        C0099.m10863(null);
        return new C0628w(this, m10331(), 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        C0099.m10863(longConsumer);
        return new C0565j0(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C0099.m10925(j));
        }
        return m10356(this, 0L, j);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : m10356(this, j, -1L);
        }
        throw new IllegalArgumentException(C0099.m10925(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        m10334();
        C0099.m10863(null);
        return new W3(this, m10334(), 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream e() {
        m10334();
        C0099.m10863(null);
        return new Y3(this, m10337(), 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return C0106.m11314(m10358((AbstractC0557h2) m10338(this)), new C0599q(23));
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return m10341(this, 0L, new C0545f0(1));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B min() {
        return m10345(this, new C0599q(22));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B max() {
        return m10345(this, new C0545f0(0));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.A average() {
        long j = ((long[]) m10351(this, new C0599q(27), new C0599q(28), new C0599q(29)))[0];
        return j > 0 ? C0097.m10831(r0[1] / j) : C0079.m7523();
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        C0099.m10863(longBinaryOperator);
        return C0088.m8558((Long) m10346(this, new B1(C0097.m10843(), longBinaryOperator, j)));
    }

    @Override // j$.util.stream.LongStream
    public final C0653y summaryStatistics() {
        return (C0653y) m10351(this, new C0569k(22), new C0599q(21), new C0599q(24));
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        C0099.m10863(biConsumer);
        r rVar = new r(biConsumer, 2);
        C0099.m10863(supplier);
        C0099.m10863(objLongConsumer);
        C0099.m10863(rVar);
        return m10346(this, new F1(C0097.m10843(), rVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean p() {
        return C0089.m8595((Boolean) m10346(this, m10353(m10329())));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B reduce(LongBinaryOperator longBinaryOperator) {
        C0099.m10863(longBinaryOperator);
        return (j$.util.B) m10346(this, new D1(C0097.m10843(), longBinaryOperator, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean s() {
        return C0089.m8595((Boolean) m10346(this, m10353(m10349())));
    }

    @Override // j$.util.stream.LongStream
    public final boolean g() {
        return C0089.m8595((Boolean) m10346(this, m10353(m10340())));
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) C0088.m8561(C0088.m8563((J0) m10355(this, new C0599q(25))));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return m10339(this);
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return C0088.m8558((Long) m10346(this, new H1(0)));
    }
}
