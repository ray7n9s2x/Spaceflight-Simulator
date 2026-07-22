package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends AbstractC0491d {
    private static final long serialVersionUID = -305327627230580483L;
    private final transient j$.time.h a;
    private transient A b;
    private transient int c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f414short = {1512, 1475, 1490, 1475, 1484, 1479, 1489, 1479, 1510, 1475, 1494, 1479, 1410, 1472, 1479, 1476, 1485, 1488, 1479, 1410, 1519, 1479, 1483, 1480, 1483, 1410, 1428, 1410, 1483, 1489, 1410, 1484, 1485, 1494, 1410, 1489, 1495, 1490, 1490, 1485, 1488, 1494, 1479, 1478, 2853, 2818, 2842, 2829, 2816, 2821, 2824, 2892, 2837, 2825, 2829, 2846, 2851, 2826, 2857, 2846, 2829, 2892, 2842, 2829, 2816, 2841, 2825, 593, 614, 629, 564, 633, 609, 615, 608, 564, 630, 625, 564, 606, 629, 612, 629, 634, 625, 615, 625, 593, 614, 629, 1556, 1589, 1571, 1589, 1570, 1593, 1585, 1596, 1593, 1578, 1585, 1572, 1593, 1599, 1598, 1648, 1574, 1593, 1585, 1648, 1571, 1589, 1570, 1593, 1585, 1596, 1593, 1578, 1585, 1572, 1593, 1599, 1598, 1648, 1588, 1589, 1596, 1589, 1591, 1585, 1572, 1589, 2178, 2233, 2212, 2210, 2215, 2215, 2232, 2213, 2211, 2226, 2227, 2295, 2225, 2238, 2226, 2235, 2227, 2285, 2295, 1510, 1501, 1472, 1478, 1475, 1475, 1500, 1473, 1479, 1494, 1495, 1427, 1493, 1498, 1494, 1503, 1495, 1417, 1427};
    static final j$.time.h d = C0079.m7525(1873, 1, 1);

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static A m7782(Object obj) {
        if (C0097.m10823() > 0) {
            return ((z) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7783(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((z) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static A m7784(Object obj) {
        if (C0098.m10857() < 0) {
            return A.i((j$.time.h) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m7785(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((z) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧ۟, reason: not valid java name and contains not printable characters */
    public static C0494g m7786(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return C0494g.D((InterfaceC0489b) obj, (j$.time.l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static A m7787(Object obj) {
        if (C0083.m8022() < 0) {
            return ((A) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۥ, reason: not valid java name and contains not printable characters */
    public static int[] m7788() {
        if (C0092.m8724() <= 0) {
            return y.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۧۨ, reason: contains not printable characters */
    public static z m7789(Object obj, Object obj2, int i) {
        if (C0102.m11109() <= 0) {
            return ((z) obj).L((A) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static z m7790(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((z) obj).K((j$.time.h) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7791(Object obj) {
        if (C0093.m9101() > 0) {
            return ((A) obj).o();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7792() {
        if (C0093.m9101() >= 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7793() {
        if (C0092.m8724() < 0) {
            return f414short;
        }
        return null;
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final o D() {
        return m7782(this);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public final /* bridge */ /* synthetic */ InterfaceC0489b d(long j, j$.time.temporal.r rVar) {
        return C0097.m10832(this, j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0097.m10832(this, j, rVar);
    }

    z(j$.time.h hVar) {
        if (C0097.m10821(hVar, m7792())) {
            throw new DateTimeException(C0102.m11094(m7793(), 0, 44, 1442));
        }
        A aM7784 = m7784(hVar);
        this.b = aM7784;
        this.c = (C0097.m10813(hVar) - C0097.m10813(m7791(aM7784))) + 1;
        this.a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final n a() {
        return C0095.m9203();
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final int hashCode() {
        C0092.m8727(C0095.m9203());
        return C0083.m8056(m7783(this)) ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == C0093.m9075() || rVar == C0084.m8122() || rVar == C0091.m8699() || rVar == C0080.m7563()) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return C0084.m8093((j$.time.temporal.a) rVar);
        }
        return rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0094.m9149(rVar, this);
        }
        if (!C0093.m9074(this, rVar)) {
            throw new j$.time.temporal.v(C0101.m11024(C0087.m8474(m7793(), 132, 19, 2263), rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = m7788()[C0105.m11258(aVar)];
        j$.time.h hVarM7783 = m7783(this);
        if (i == 1) {
            return C0084.m8080(1L, C0094.m9154(hVarM7783));
        }
        A aM7782 = m7782(this);
        if (i != 2) {
            if (i != 3) {
                return C0079.m7473(C0095.m9203(), aVar);
            }
            int iM10813 = C0097.m10813(m7791(aM7782));
            return m7787(aM7782) != null ? C0084.m8080(1L, (C0097.m10813(m7791(r0)) - iM10813) + 1) : C0084.m8080(1L, 999999999 - iM10813);
        }
        A aM7787 = m7787(aM7782);
        int iM11111 = (aM7787 == null || C0097.m10813(m7791(aM7787)) != C0097.m10813(hVarM7783)) ? C0080.m7550(hVarM7783) ? 366 : 365 : C0102.m11111(m7791(aM7787)) - 1;
        if (m7785(this) == 1) {
            iM11111 -= C0102.m11111(m7791(aM7782)) - 1;
        }
        return C0084.m8080(1L, iM11111);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m7788()[C0105.m11258((j$.time.temporal.a) rVar)];
        int iM7785 = m7785(this);
        A aM7782 = m7782(this);
        j$.time.h hVarM7783 = m7783(this);
        switch (i) {
            case 2:
                return iM7785 == 1 ? (C0102.m11111(hVarM7783) - C0102.m11111(m7791(aM7782))) + 1 : C0102.m11111(hVarM7783);
            case 3:
                return iM7785;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.v(C0101.m11024(C0093.m9062(m7793(), 151, 19, 1459), rVar));
            case 8:
                return C0094.m9140(aM7782);
            default:
                return C0104.m11214(hVarM7783, rVar);
        }
    }

    public final z J(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (C0094.m9147(this, aVar) == j) {
                return this;
            }
            int[] iArrM7788 = m7788();
            int i = iArrM7788[C0105.m11258(aVar)];
            j$.time.h hVarM7783 = m7783(this);
            if (i == 3 || i == 8 || i == 9) {
                int iM8732 = C0092.m8732(C0079.m7473(C0095.m9203(), aVar), j, aVar);
                int i2 = iArrM7788[C0105.m11258(aVar)];
                if (i2 == 3) {
                    return m7789(this, m7782(this), iM8732);
                }
                if (i2 == 8) {
                    return m7789(this, C0082.m7986(iM8732), m7785(this));
                }
                if (i2 == 9) {
                    return m7790(this, C0080.m7574(hVarM7783, iM8732));
                }
            }
            return m7790(this, C0105.m11302(hVarM7783, j, rVar));
        }
        return (z) super.d(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final InterfaceC0489b I(j$.time.temporal.p pVar) {
        return (z) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (z) super.I(hVar);
    }

    private z L(A a, int i) {
        C0092.m8727(C0095.m9203());
        if (!(a instanceof A)) {
            throw new ClassCastException(C0096.m10776(m7793(), 67, 23, 532));
        }
        int iM10813 = (C0097.m10813(m7791(a)) + i) - 1;
        if (i != 1 && (iM10813 < -999999999 || iM10813 > 999999999 || iM10813 < C0097.m10813(m7791(a)) || a != m7784(C0079.m7525(iM10813, 1, 1)))) {
            throw new DateTimeException(C0106.m11346(m7793(), 44, 23, 2924));
        }
        return m7790(this, C0080.m7574(m7783(this), iM10813));
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final InterfaceC0492e u(j$.time.l lVar) {
        return m7786(this, lVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b H(long j) {
        return m7790(this, C0084.m8108(m7783(this), j));
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b G(long j) {
        return m7790(this, C0103.m11174(m7783(this), j));
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b F(long j) {
        return m7790(this, C0094.m9137(m7783(this), j));
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public final InterfaceC0489b e(long j, j$.time.temporal.u uVar) {
        return (z) super.e(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (z) super.e(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final InterfaceC0489b E(long j, j$.time.temporal.u uVar) {
        return (z) super.E(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return (z) super.E(j, bVar);
    }

    private z K(j$.time.h hVar) {
        return C0085.m8243(hVar, m7783(this)) ? this : new z(hVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final long t() {
        return C0086.m8288(m7783(this));
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return C0085.m8243(m7783(this), m7783((z) obj));
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0095.m9204(m7793(), 90, 42, 1616));
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }
}
