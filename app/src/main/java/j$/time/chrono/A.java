package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements o, Serializable {
    public static final A d;
    private static final A[] e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f394short = {2768, 2808, 2804, 2807, 2804, 2413, 2392, 2384, 2378, 2385, 2390, 2293, 2254, 2249, 2257, 2247, 2258, 2303, 2291, 2281, 2303, 2291, 1507, 1492, 1496, 1478, 1488, 1004, 971, 979, 964, 969, 972, 961, 901, 960, 983, 964, 927, 901, 1727, 1684, 1669, 1684, 1691, 1680, 1670, 1680, 1713, 1684, 1665, 1680, 1749, 1687, 1680, 1683, 1690, 1671, 1680, 1749, 1720, 1680, 1692, 1695, 1692, 1749, 1731, 1749, 1684, 1671, 1680, 1749, 1691, 1690, 1665, 1749, 1670, 1664, 1669, 1669, 1690, 1671, 1665, 1680, 1681, 625, 592, 582, 592, 583, 604, 596, 601, 604, 591, 596, 577, 604, 602, 603, 533, 579, 604, 596, 533, 582, 592, 583, 604, 596, 601, 604, 591, 596, 577, 604, 602, 603, 533, 593, 592, 601, 592, 594, 596, 577, 592};
    private final transient int a;
    private final transient j$.time.h b;
    private final transient String c;

    /* JADX INFO: renamed from: ۟۠ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7624() {
        if (C0090.m8624() > 0) {
            return f394short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7625(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((A) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static A[] m7626() {
        if (C0080.m7553() >= 0) {
            return e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m7627(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((A) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static A m7628(Object obj) {
        if (C0099.m10878() < 0) {
            return ((A) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۦ, reason: contains not printable characters */
    public static j$.time.h m7629() {
        if (C0093.m9101() > 0) {
            return z.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7630(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((A) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static A m7631() {
        if (C0099.m10878() <= 0) {
            return l();
        }
        return null;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return C0085.m8227(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return C0087.m8491(this, (j$.time.temporal.a) rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long s(j$.time.temporal.r rVar) {
        return C0085.m8268(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return C0087.m8454(this, tVar);
    }

    static {
        A a = new A(-1, C0079.m7525(1868, 1, 1), C0088.m8518(m7624(), 0, 5, 2717));
        d = a;
        e = new A[]{a, new A(0, C0079.m7525(1912, 7, 30), C0103.m11135(m7624(), 5, 6, 2361)), new A(1, C0079.m7525(1926, 12, 25), C0088.m8518(m7624(), 11, 5, 2214)), new A(2, C0079.m7525(1989, 1, 8), C0103.m11135(m7624(), 16, 6, 2202)), new A(3, C0079.m7525(2019, 5, 1), C0089.m8581(m7624(), 22, 5, 1457))};
    }

    static A l() {
        return m7626()[r0.length - 1];
    }

    static long D() {
        int iM10813 = 1000000000 - C0097.m10813(m7625(m7631()));
        A[] aArrM7626 = m7626();
        int iM108132 = C0097.m10813(m7625(aArrM7626[0]));
        for (int i = 1; i < aArrM7626.length; i++) {
            A a = aArrM7626[i];
            iM10813 = C0080.m7578(iM10813, (C0097.m10813(m7625(a)) - iM108132) + 1);
            iM108132 = C0097.m10813(m7625(a));
        }
        return iM10813;
    }

    static long C() {
        long jM11072 = C0102.m11072(C0090.m8651(C0090.m8620()));
        for (A a : m7626()) {
            jM11072 = C0088.m8519(jM11072, ((C0080.m7550(m7625(a)) ? 366 : 365) - C0102.m11111(m7625(a))) + 1);
            if (m7628(a) != null) {
                jM11072 = C0088.m8519(jM11072, C0102.m11111(m7625(m7628(a))) - 1);
            }
        }
        return jM11072;
    }

    private A(int i, j$.time.h hVar, String str) {
        this.a = i;
        this.b = hVar;
        this.c = str;
    }

    final j$.time.h o() {
        return m7625(this);
    }

    public static A A(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            A[] aArrM7626 = m7626();
            if (i2 < aArrM7626.length) {
                return aArrM7626[i2];
            }
        }
        StringBuilder sb = new StringBuilder(C0106.m11346(m7624(), 27, 13, 933));
        C0099.m10859(sb, i);
        throw new DateTimeException(C0099.m10924(sb));
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(mVar, C0094.m9140(this), C0091.m8664());
    }

    static A i(j$.time.h hVar) {
        if (C0097.m10821(hVar, m7629())) {
            throw new DateTimeException(C0099.m10897(m7624(), 40, 45, 1781));
        }
        A[] aArrM7626 = m7626();
        for (int length = aArrM7626.length - 1; length >= 0; length--) {
            A a = aArrM7626[length];
            if (C0086.m8290(hVar, m7625(a)) >= 0) {
                return a;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return m7627(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVarM8664 = C0091.m8664();
        if (rVar != aVarM8664) {
            return C0101.m11036(this, rVar);
        }
        return C0079.m7473(C0095.m9203(), aVarM8664);
    }

    final A r() {
        if (this == m7631()) {
            return null;
        }
        return C0082.m7986(m7627(this) + 1);
    }

    public final String toString() {
        return m7630(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0079.m7503(m7624(), 85, 42, 565));
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    final void E(DataOutput dataOutput) {
        C0092.m8730(dataOutput, m7627(this));
    }
}
