package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0649u;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.io.C0103;
import java.io.C0104;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
abstract class B extends AbstractC0524b implements E {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f502short = {2940, 2938, 2912, 2919, 2926, 2857, 2893, 2918, 2940, 2923, 2917, 2924, 2906, 2941, 2939, 2924, 2920, 2916, 2855, 2920, 2925, 2920, 2937, 2941, 2849, 2906, 2937, 2917, 2912, 2941, 2924, 2939, 2920, 2941, 2918, 2939, 2869, 2893, 2918, 2940, 2923, 2917, 2924, 2871, 2857, 2938, 2848, 2906, 2929, 2923, 2940, 2930, 2939, 2893, 2922, 2924, 2939, 2943, 2931, 2864, 2943, 2938, 2943, 2926, 2922, 2870, 2893, 2926, 2930, 2935, 2922, 2939, 2924, 2943, 2922, 2929, 2924, 2850, 2906, 2929, 2923, 2940, 2930, 2939, 2848, 2878, 2925, 2871, 709, 707, 729, 734, 727, 656, 756, 735, 709, 722, 732, 725, 739, 708, 706, 725, 721, 733, 670, 721, 724, 721, 704, 708, 664, 739, 729, 734, 731, 652, 756, 735, 709, 722, 732, 725, 654, 656, 707, 665};

    /* JADX INFO: renamed from: ۟۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m9331() {
        if (C0093.m9101() > 0) {
            return EnumC0543e3.p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m9332() {
        if (C0106.m11345() < 0) {
            return EnumC0543e3.q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static F m9333() {
        if (C0101.m11044() <= 0) {
            return G.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static A0 m9334(long j) {
        if (C0100.m10983() > 0) {
            return AbstractC0644z0.J(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m9335(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0100.m10983() > 0) {
            return ((B) obj).collect((Supplier) obj2, (ObjDoubleConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9336() {
        if (C0106.m11345() <= 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9337(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int m9338() {
        if (C0097.m10823() > 0) {
            return EnumC0543e3.n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9339() {
        if (C0105.m11264() >= 0) {
            return f502short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static F m9340() {
        if (C0081.m7818() < 0) {
            return G.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۤ, reason: not valid java name and contains not printable characters */
    public static E m9341(Object obj, long j, long j2) {
        if (C0098.m10857() < 0) {
            return AbstractC0644z0.X((B) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۡ, reason: not valid java name and contains not printable characters */
    public static L0 m9342(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0524b) obj).A((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Stream m9343(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((B) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۤ, reason: not valid java name and contains not printable characters */
    public static Set m9344() {
        if (C0080.m7553() > 0) {
            return Collectors.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m9345(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0524b) obj).z((K3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m9346() {
        if (C0096.m10782() >= 0) {
            return EnumC0543e3.o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Stream m9347(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0557h2) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m9348() {
        if (C0106.m11345() < 0) {
            return EnumC0629w0.ALL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static F0 m9349(Object obj, Object obj2, boolean z) {
        if (C0099.m10878() < 0) {
            return AbstractC0644z0.F((AbstractC0524b) obj, (j$.util.f0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m9350() {
        if (C0081.m7818() <= 0) {
            return m4.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m9351(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((B) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m9352() {
        if (C0091.m8708() >= 0) {
            return EnumC0629w0.NONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.A m9353(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            return ((B) obj).reduce((DoubleBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m9354() {
        if (C0100.m10983() > 0) {
            return m4.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static EnumC0629w0 m9355() {
        if (C0085.m8230() >= 0) {
            return EnumC0629w0.ANY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦۨ, reason: contains not printable characters */
    public static int m9356() {
        if (C0100.m10983() >= 0) {
            return EnumC0543e3.t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9357(Object obj) {
        if (C0091.m8708() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m9358(Object obj) {
        if (C0092.m8724() < 0) {
            return V((j$.util.f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static C0634x0 m9359(Object obj) {
        if (C0099.m10878() < 0) {
            return AbstractC0644z0.Y((EnumC0629w0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.F m9360(Object obj) {
        if (C0101.m11044() < 0) {
            return ((B) obj).iterator();
        }
        return null;
    }

    @Override // j$.util.stream.E
    public final j$.util.A findAny() {
        return (j$.util.A) m9345(this, m9340());
    }

    @Override // j$.util.stream.E
    public final j$.util.A findFirst() {
        return (j$.util.A) m9345(this, m9333());
    }

    @Override // j$.util.stream.E
    public final E sorted() {
        return new H2(this, m9332() | m9346(), 0);
    }

    private static j$.util.T V(j$.util.f0 f0Var) {
        if (f0Var instanceof j$.util.T) {
            return (j$.util.T) f0Var;
        }
        if (m9336()) {
            m9337(AbstractC0524b.class, C0093.m9062(m9339(), 0, 47, 2825));
            throw null;
        }
        throw new UnsupportedOperationException(C0106.m11346(m9339(), 47, 41, 2846));
    }

    @Override // j$.util.stream.E
    public void forEach(DoubleConsumer doubleConsumer) {
        C0099.m10863(doubleConsumer);
        m9345(this, new M(doubleConsumer, false));
    }

    @Override // j$.util.stream.E
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        C0099.m10863(doubleConsumer);
        m9345(this, new M(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC0524b
    final EnumC0548f3 E() {
        return C0079.m7527();
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 B(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z, IntFunction intFunction) {
        return m9349(abstractC0524b, f0Var, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 Q(AbstractC0524b abstractC0524b, Supplier supplier, boolean z) {
        return new C0598p3(abstractC0524b, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean D(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        Object c0594p;
        boolean zM9357;
        j$.util.T tM9358 = m9358(f0Var);
        if (interfaceC0597p2 instanceof DoubleConsumer) {
            c0594p = (DoubleConsumer) interfaceC0597p2;
        } else {
            if (m9336()) {
                m9337(AbstractC0524b.class, C0079.m7503(m9339(), 88, 40, 688));
                throw null;
            }
            C0099.m10863(interfaceC0597p2);
            c0594p = new C0594p(interfaceC0597p2);
        }
        do {
            zM9357 = m9357(interfaceC0597p2);
            if (zM9357) {
                break;
            }
        } while (C0104.m11219(tM9358, c0594p));
        return zM9357;
    }

    @Override // j$.util.stream.AbstractC0524b
    final D0 J(long j, IntFunction intFunction) {
        return m9334(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.F iterator() {
        return C0092.m8781(m9351(this));
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final j$.util.T spliterator() {
        return m9358(super.spliterator());
    }

    @Override // j$.util.stream.E
    public final Stream boxed() {
        return new C0613t(this, 0, new C0599q(0), 0);
    }

    @Override // j$.util.stream.E
    public final E a() {
        C0099.m10863(null);
        return new C0618u(this, m9331() | m9338(), 0);
    }

    @Override // j$.util.stream.E
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        C0099.m10863(doubleFunction);
        return new C0613t(this, m9331() | m9338(), doubleFunction, 0);
    }

    @Override // j$.util.stream.E
    public final IntStream r() {
        C0099.m10863(null);
        return new C0623v(this, m9331() | m9338(), 0);
    }

    @Override // j$.util.stream.E
    public final LongStream i() {
        C0099.m10863(null);
        return new C0628w(this, m9331() | m9338(), 0);
    }

    @Override // j$.util.stream.E
    public final E b(C0519a c0519a) {
        C0099.m10863(c0519a);
        return new C0638y(this, m9331() | m9338() | m9356(), c0519a, 0);
    }

    @Override // j$.util.stream.E
    public final E d() {
        C0099.m10863(null);
        return new C0618u(this, m9356(), 2);
    }

    @Override // j$.util.stream.E
    public final E peek(DoubleConsumer doubleConsumer) {
        C0099.m10863(doubleConsumer);
        return new C0638y(this, doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final E limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C0099.m10925(j));
        }
        return m9341(this, 0L, j);
    }

    @Override // j$.util.stream.E
    public final E skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : m9341(this, j, -1L);
        }
        throw new IllegalArgumentException(C0099.m10925(j));
    }

    @Override // j$.util.stream.E
    public final E c() {
        m9354();
        C0099.m10863(null);
        return new a4(this, m9354(), 0);
    }

    @Override // j$.util.stream.E
    public final E e() {
        m9354();
        C0099.m10863(null);
        return new c4(this, m9350(), 0);
    }

    @Override // j$.util.stream.E
    public final E distinct() {
        return C0100.m10970(m9347((AbstractC0557h2) m9343(this)), new C0599q(1));
    }

    @Override // j$.util.stream.E
    public final double sum() {
        double[] dArr = (double[]) m9335(this, new C0599q(4), new C0569k(5), new C0569k(2));
        m9344();
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (C0088.m8500(d) && C0105.m11255(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.E
    public final j$.util.A min() {
        return m9353(this, new C0569k(26));
    }

    @Override // j$.util.stream.E
    public final j$.util.A max() {
        return m9353(this, new C0599q(3));
    }

    @Override // j$.util.stream.E
    public final j$.util.A average() {
        double[] dArr = (double[]) m9335(this, new C0569k(27), new C0569k(3), new C0569k(4));
        if (dArr[2] <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return C0079.m7523();
        }
        m9344();
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (C0088.m8500(d) && C0105.m11255(d2)) {
            d = d2;
        }
        return C0097.m10831(d / dArr[2]);
    }

    @Override // j$.util.stream.E
    public final C0649u summaryStatistics() {
        return (C0649u) m9335(this, new C0569k(18), new C0569k(28), new C0569k(29));
    }

    @Override // j$.util.stream.E
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        C0099.m10863(biConsumer);
        r rVar = new r(biConsumer, 0);
        C0099.m10863(supplier);
        C0099.m10863(objDoubleConsumer);
        C0099.m10863(rVar);
        return m9345(this, new F1(C0079.m7527(), rVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.E
    public final boolean n() {
        return C0089.m8595((Boolean) m9345(this, m9359(m9355())));
    }

    @Override // j$.util.stream.E
    public final boolean h() {
        return C0089.m8595((Boolean) m9345(this, m9359(m9348())));
    }

    @Override // j$.util.stream.E
    public final boolean u() {
        return C0089.m8595((Boolean) m9345(this, m9359(m9352())));
    }

    @Override // j$.util.stream.E
    public final double[] toArray() {
        return (double[]) C0088.m8561(C0094.m9109((F0) m9342(this, new C0599q(2))));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return m9360(this);
    }

    @Override // j$.util.stream.E
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        C0099.m10863(doubleBinaryOperator);
        return C0090.m8616((Double) m9345(this, new J1(C0079.m7527(), doubleBinaryOperator, d)));
    }

    @Override // j$.util.stream.E
    public final j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        C0099.m10863(doubleBinaryOperator);
        return (j$.util.A) m9345(this, new D1(C0079.m7527(), doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.E
    public final long count() {
        return C0088.m8558((Long) m9345(this, new H1(1)));
    }
}
