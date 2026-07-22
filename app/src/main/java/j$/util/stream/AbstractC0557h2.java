package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.Optional;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0557h2 extends AbstractC0524b implements Stream {
    /* JADX INFO: renamed from: ۟۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m10185(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0557h2) obj).toArray((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m10186() {
        if (C0095.m9210() > 0) {
            return EnumC0543e3.p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static L0 m10187(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0524b) obj).A((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int m10188() {
        if (C0079.m7512() >= 0) {
            return m4.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m10189(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0524b) obj).z((K3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10190(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static L0 m10191(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            return AbstractC0644z0.N((L0) obj, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m10192() {
        if (C0094.m9148() > 0) {
            return m4.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m10193(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((L0) obj).o((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m10194() {
        if (C0105.m11264() > 0) {
            return EnumC0543e3.t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10195(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ۟, reason: not valid java name and contains not printable characters */
    public static F m10196() {
        if (C0087.m8458() <= 0) {
            return J.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10197() {
        if (C0091.m8708() > 0) {
            return EnumC0629w0.ANY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m10198() {
        if (C0090.m8624() > 0) {
            return EnumC0543e3.m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Stream m10199(Object obj, long j, long j2) {
        if (C0097.m10823() >= 0) {
            return AbstractC0644z0.e0((AbstractC0557h2) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m10200(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            ((AbstractC0557h2) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Optional m10201(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0557h2) obj).reduce((BinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10202() {
        if (C0085.m8230() > 0) {
            return EnumC0629w0.NONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10203(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0524b) obj).isParallel();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۢۢ, reason: contains not printable characters */
    public static C0634x0 m10204(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            return AbstractC0644z0.d0((EnumC0629w0) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠۠, reason: contains not printable characters */
    public static int m10205() {
        if (C0084.m8116() > 0) {
            return EnumC0543e3.n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۧ۟, reason: contains not printable characters */
    public static D0 m10206(long j, Object obj) {
        if (C0099.m10878() <= 0) {
            return AbstractC0644z0.D(j, (IntFunction) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10207(Object obj) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0524b) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10208() {
        if (C0101.m11044() < 0) {
            return EnumC0629w0.ALL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static F m10209() {
        if (C0080.m7553() >= 0) {
            return J.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static L0 m10210(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0097.m10823() >= 0) {
            return AbstractC0644z0.E((AbstractC0524b) obj, (j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new K2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C0589o(this, m10198() | m10194(), 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        C0099.m10863(comparator);
        return m10201(this, new j$.util.function.b(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) m10189(this, m10196());
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) m10189(this, m10209());
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new K2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        C0099.m10863(biFunction);
        C0099.m10863(binaryOperator);
        return m10189(this, new F1(C0091.m8670(), binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        C0099.m10863(binaryOperator);
        C0099.m10863(binaryOperator);
        return m10189(this, new F1(C0091.m8670(), binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        C0099.m10863(consumer);
        m10189(this, new P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        C0099.m10863(consumer);
        m10189(this, new P(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        C0099.m10863(comparator);
        return m10201(this, new j$.util.function.b(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC0524b
    final EnumC0548f3 E() {
        return C0091.m8670();
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        C0099.m10863(binaryOperator);
        return (Optional) m10189(this, new D1(C0091.m8670(), binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 B(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z, IntFunction intFunction) {
        return m10210(abstractC0524b, f0Var, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 Q(AbstractC0524b abstractC0524b, Supplier supplier, boolean z) {
        return new I3(abstractC0524b, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean D(j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        boolean zM10190;
        do {
            zM10190 = m10190(interfaceC0597p2);
            if (zM10190) {
                break;
            }
        } while (C0081.m7848(f0Var, interfaceC0597p2));
        return zM10190;
    }

    @Override // j$.util.stream.AbstractC0524b
    final D0 J(long j, IntFunction intFunction) {
        return m10206(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final Iterator iterator() {
        return C0088.m8520(m10207(this));
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        C0099.m10863(predicate);
        return new C0613t(this, m10194(), predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        C0099.m10863(function);
        return new C0613t(this, m10186() | m10205(), function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        C0099.m10863(toIntFunction);
        return new W(this, m10186() | m10205(), toIntFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        C0099.m10863(supplier);
        C0099.m10863(biConsumer);
        C0099.m10863(biConsumer2);
        return m10189(this, new F1(C0091.m8670(), biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        C0099.m10863(toLongFunction);
        return new C0565j0(this, m10186() | m10205(), toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final E mapToDouble(ToDoubleFunction toDoubleFunction) {
        C0099.m10863(toDoubleFunction);
        return new C0638y(this, m10186() | m10205(), toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return C0088.m8558((Long) m10189(this, new H1(2)));
    }

    @Override // j$.util.stream.Stream
    public final Stream b(C0519a c0519a) {
        C0099.m10863(c0519a);
        return new C0613t(this, m10186() | m10205() | m10194(), c0519a, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream q(C0519a c0519a) {
        C0099.m10863(c0519a);
        return new W(this, m10186() | m10205() | m10194(), c0519a, 4);
    }

    @Override // j$.util.stream.Stream
    public final E v(C0519a c0519a) {
        C0099.m10863(c0519a);
        return new C0638y(this, m10186() | m10205() | m10194(), c0519a, 3);
    }

    @Override // j$.util.stream.Stream
    public final LongStream m(C0519a c0519a) {
        C0099.m10863(c0519a);
        return new C0565j0(this, m10186() | m10205() | m10194(), c0519a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        C0099.m10863(consumer);
        return new C0613t(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C0099.m10925(j));
        }
        return m10199(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : m10199(this, j, -1L);
        }
        throw new IllegalArgumentException(C0099.m10925(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        m10188();
        C0099.m10863(predicate);
        return new O3(this, m10188(), predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        m10188();
        C0099.m10863(predicate);
        return new Q3(this, m10192(), predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return m10193(m10191(m10187(this, intFunction), intFunction), intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return m10185(this, new C0545f0(4));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return C0089.m8595((Boolean) m10189(this, m10204(m10197(), predicate)));
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return C0089.m8595((Boolean) m10189(this, m10204(m10208(), predicate)));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return C0089.m8595((Boolean) m10189(this, m10204(m10202(), predicate)));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object objM10189;
        if (!m10203(this) || !C0085.m8225(C0100.m11010(collector), C0100.m10993()) || (m10195(this) && !C0085.m8225(C0100.m11010(collector), C0095.m9177()))) {
            Supplier supplierM11228 = C0104.m11228((Collector) C0099.m10863(collector));
            objM10189 = m10189(this, new M1(C0091.m8670(), C0082.m7972(collector), C0103.m11142(collector), supplierM11228, collector));
        } else {
            objM10189 = C0106.m11328(C0104.m11228(collector));
            m10200(this, new C0600q0(4, C0103.m11142(collector), objM10189));
        }
        return C0085.m8225(C0100.m11010(collector), C0090.m8617()) ? objM10189 : C0087.m8486(C0095.m9163(collector), objM10189);
    }
}
