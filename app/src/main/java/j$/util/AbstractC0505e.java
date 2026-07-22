package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.io.C0103;
import java.io.C0104;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0505e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f494short = {2007, 1948, 2001, 1932, 1999, 1997, 1984, 1984, 1989, 1986, 1995, 1932, 2047, 2012, 1984, 1989, 2008, 1993, 2014, 1997, 2008, 1987, 2014, 1922, 2019, 1994, 2024, 1987, 2009, 1998, 1984, 1993, 1922, 1994, 1987, 2014, 2025, 1997, 1999, 1988, 2046, 1993, 1985, 1997, 1989, 1986, 1989, 1986, 1995, 1924, 1924, 2024, 1987, 2009, 1998, 1984, 1993, 2031, 1987, 1986, 2015, 2009, 1985, 1993, 2014, 1925, 1932, 1997, 1999, 2008, 1989, 1987, 1986, 1942, 1942, 1997, 1999, 1999, 1993, 2012, 2008, 1925, 1941, 2014, 1939, 1998, 1933, 1935, 1922, 1922, 1927, 1920, 1929, 1998, 1981, 1950, 1922, 1927, 1946, 1931, 1948, 1935, 1946, 1921, 1948, 1984, 1953, 1928, 1959, 1920, 1946, 1984, 1928, 1921, 1948, 1963, 1935, 1933, 1926, 1980, 1931, 1923, 1935, 1927, 1920, 1927, 1920, 1929, 1990, 1990, 1959, 1920, 1946, 1965, 1921, 1920, 1949, 1947, 1923, 1931, 1948, 1991, 1998, 1935, 1933, 1946, 1927, 1921, 1920, 2004, 2004, 1935, 1933, 1933, 1931, 1950, 1946, 1991, 420, 495, 418, 511, 444, 446, 435, 435, 438, 433, 440, 511, 396, 431, 435, 438, 427, 442, 429, 446, 427, 432, 429, 497, 400, 441, 403, 432, 433, 440, 497, 441, 432, 429, 410, 446, 444, 439, 397, 442, 434, 446, 438, 433, 438, 433, 440, 503, 503, 403, 432, 433, 440, 412, 432, 433, 428, 426, 434, 442, 429, 502, 511, 446, 444, 427, 438, 432, 433, 485, 485, 446, 444, 444, 442, 431, 427, 502, 2233, 2290, 2239, 2274, 2209, 2211, 2222, 2222, 2219, 2220, 2213, 2274, 2193, 2226, 2222, 2219, 2230, 2215, 2224, 2211, 2230, 2221, 2224, 2284, 2189, 2212, 2182, 2221, 2231, 2208, 2222, 2215, 2284, 2230, 2224, 2235, 2179, 2214, 2228, 2211, 2220, 2209, 2215, 2282, 2282, 2182, 2221, 2231, 2208, 2222, 2215, 2177, 2221, 2220, 2225, 2231, 2223, 2215, 2224, 2283, 2274, 2211, 2209, 2230, 2219, 2221, 2220, 2296, 2296, 2211, 2209, 2209, 2215, 2226, 2230, 2283, 532, 607, 530, 591, 524, 526, 515, 515, 518, 513, 520, 591, 572, 543, 515, 518, 539, 522, 541, 526, 539, 512, 541, 577, 544, 521, 550, 513, 539, 577, 539, 541, 534, 558, 523, 537, 526, 513, 524, 522, 583, 583, 550, 513, 539, 556, 512, 513, 540, 538, 514, 522, 541, 582, 591, 526, 524, 539, 518, 512, 513, 597, 597, 526, 524, 524, 522, 543, 539, 582, 1661, 1590, 1659, 1574, 1637, 1639, 1642, 1642, 1647, 1640, 1633, 1574, 1621, 1654, 1642, 1647, 1650, 1635, 1652, 1639, 1650, 1641, 1652, 1576, 1609, 1632, 1610, 1641, 1640, 1633, 1576, 1650, 1652, 1663, 1607, 1634, 1648, 1639, 1640, 1637, 1635, 1582, 1582, 1610, 1641, 1640, 1633, 1605, 1641, 1640, 1653, 1651, 1643, 1635, 1652, 1583, 1574, 1639, 1637, 1650, 1647, 1641, 1640, 1596, 1596, 1639, 1637, 1637, 1635, 1654, 1650, 1583};

    /* JADX INFO: renamed from: ۟ۧۢۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m9103() {
        if (C0096.m10782() >= 0) {
            return f494short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9104() {
        if (C0098.m10857() < 0) {
            return v0.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static void m9105(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            v0.a((Class) obj, (String) obj2);
        }
    }

    public static java.util.Optional o(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (C0100.m10968(optional)) {
            return C0091.m8703(C0084.m8085(optional));
        }
        return C0083.m8062();
    }

    public static Optional k(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (C0080.m7583(optional)) {
            return C0096.m10794(C0081.m7853(optional));
        }
        return C0084.m8125();
    }

    public static OptionalDouble p(A a) {
        if (a == null) {
            return null;
        }
        if (C0088.m8502(a)) {
            return C0094.m9133(C0092.m8753(a));
        }
        return C0105.m11300();
    }

    public static A l(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (C0082.m8005(optionalDouble)) {
            return C0097.m10831(C0087.m8463(optionalDouble));
        }
        return C0079.m7523();
    }

    public static OptionalLong r(B b) {
        if (b == null) {
            return null;
        }
        if (C0094.m9141(b)) {
            return C0096.m10781(C0104.m11188(b));
        }
        return C0093.m9084();
    }

    public static B n(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (C0100.m10981(optionalLong)) {
            return C0081.m7817(C0102.m11073(optionalLong));
        }
        return C0089.m8601();
    }

    public static java.util.OptionalInt q(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (C0103.m11166(optionalInt)) {
            return C0105.m11274(C0093.m9102(optionalInt));
        }
        return C0101.m11042();
    }

    public static OptionalInt m(java.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (C0106.m11339(optionalInt)) {
            return C0097.m10820(C0092.m8723(optionalInt));
        }
        return C0105.m11283();
    }

    public static void s(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC0651w) {
            C0091.m8715((InterfaceC0651w) it, consumer);
            return;
        }
        C0099.m10863(consumer);
        while (C0087.m8485(it)) {
            C0083.m8026(consumer, C0090.m8628(it));
        }
    }

    public static C0504d t(Comparator comparator, Comparator comparator2) {
        C0099.m10863(comparator2);
        return new C0504d((EnumC0507g) ((InterfaceC0506f) comparator), comparator2, 0);
    }

    public static long d(f0 f0Var) {
        if ((C0080.m7579(f0Var) & 64) == 0) {
            return -1L;
        }
        return C0082.m7979(f0Var);
    }

    public static boolean e(f0 f0Var, int i) {
        return (C0080.m7579(f0Var) & i) == i;
    }

    public static boolean i(W w, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return C0081.m7828(w, (IntConsumer) consumer);
        }
        if (m9104()) {
            m9105(C0092.m8727(w), C0087.m8474(m9103(), 312, 70, 623));
            throw null;
        }
        C0099.m10863(consumer);
        return C0081.m7828(w, new G(consumer));
    }

    public static void b(W w, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            C0093.m9078(w, (IntConsumer) consumer);
        } else {
            if (m9104()) {
                m9105(C0092.m8727(w), C0096.m10776(m9103(), 82, 76, 2030));
                throw null;
            }
            C0099.m10863(consumer);
            C0093.m9078(w, new G(consumer));
        }
    }

    public static boolean j(Z z, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return C0091.m8667(z, (LongConsumer) consumer);
        }
        if (m9104()) {
            m9105(C0092.m8727(z), C0096.m10776(m9103(), 382, 72, 1542));
            throw null;
        }
        C0099.m10863(consumer);
        return C0091.m8667(z, new K(consumer));
    }

    public static Stream g(Collection collection) {
        return C0100.m10985(C0083.m8024(collection), false);
    }

    public static Stream f(Collection collection) {
        return C0100.m10985(C0083.m8024(collection), true);
    }

    public static void c(Z z, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            C0079.m7485(z, (LongConsumer) consumer);
        } else {
            if (m9104()) {
                m9105(C0092.m8727(z), C0086.m8291(m9103(), 158, 78, 479));
                throw null;
            }
            C0099.m10863(consumer);
            C0079.m7485(z, new K(consumer));
        }
    }

    public static boolean h(T t, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return C0104.m11219(t, (DoubleConsumer) consumer);
        }
        if (m9104()) {
            m9105(C0092.m8727(t), C0092.m8731(m9103(), 236, 76, 2242));
            throw null;
        }
        C0099.m10863(consumer);
        return C0104.m11219(t, new C(consumer));
    }

    public static void a(T t, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            C0097.m10836(t, (DoubleConsumer) consumer);
        } else {
            if (m9104()) {
                m9105(C0092.m8727(t), C0098.m10856(m9103(), 0, 82, 1964));
                throw null;
            }
            C0099.m10863(consumer);
            C0097.m10836(t, new C(consumer));
        }
    }

    public f0 trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        C0099.m10863(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        C0099.m10863(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
