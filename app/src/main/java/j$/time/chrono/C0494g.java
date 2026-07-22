package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0494g implements InterfaceC0492e, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f404short = {622, 619, 638, 623, 1520, 1517, 1513, 1505, 1703, 1676, 1686, 1675, 1674, 1675, 1672, 1675, 1667, 1693, 1732, 1673, 1677, 1687, 1673, 1669, 1680, 1671, 1676, 1736, 1732, 1686, 1665, 1685, 1681, 1677, 1686, 1665, 1664, 1758, 1732, 1504, 1516, 1453, 1455, 1464, 1465, 1453, 1440, 1526, 1516, 1689, 1720, 1710, 1720, 1711, 1716, 1724, 1713, 1716, 1703, 1724, 1705, 1716, 1714, 1715, 1789, 1707, 1716, 1724, 1789, 1710, 1720, 1711, 1716, 1724, 1713, 1716, 1703, 1724, 1705, 1716, 1714, 1715, 1789, 1721, 1720, 1713, 1720, 1722, 1724, 1705, 1720, 269};
    private final transient InterfaceC0489b a;
    private final transient j$.time.l b;

    /* JADX INFO: renamed from: ۟۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static C0494g m7684(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return C((n) obj, (j$.time.temporal.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static C0494g m7685(Object obj, long j, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((C0494g) obj).E(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static C0494g m7686(Object obj, Object obj2, Object obj3) {
        if (C0095.m9210() > 0) {
            return ((C0494g) obj).I((j$.time.temporal.m) obj2, (j$.time.l) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m7687(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((C0494g) obj).x((InterfaceC0492e) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7688() {
        if (C0092.m8724() < 0) {
            return f404short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0498k m7689(Object obj, Object obj2, Object obj3) {
        if (C0106.m11345() <= 0) {
            return m.C((j$.time.z) obj, (j$.time.A) obj2, (C0494g) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۧ, reason: not valid java name and contains not printable characters */
    public static C0494g m7690(Object obj, long j, Object obj2) {
        if (C0095.m9210() >= 0) {
            return ((C0494g) obj).H(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7691(Object obj) {
        if (C0097.m10823() > 0) {
            return ((C0494g) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int[] m7692() {
        if (C0088.m8503() >= 0) {
            return AbstractC0493f.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.l m7693(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((C0494g) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۨۡ, reason: not valid java name and contains not printable characters */
    public static long m7694(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            return ((C0494g) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۦۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7695(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            return AbstractC0491d.C((n) obj, (j$.time.temporal.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static C0494g m7696(Object obj, Object obj2, long j, long j2, long j3, long j4) {
        if (C0081.m7818() <= 0) {
            return ((C0494g) obj).G((InterfaceC0489b) obj2, j, j2, j3, j4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۧۧ, reason: contains not printable characters */
    public static InterfaceC0489b m7697(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0494g) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m7698(Object obj, Object obj2) {
        if (C0098.m10857() < 0) {
            return ((C0494g) obj).n((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0494g m7699(Object obj, long j) {
        if (C0088.m8503() > 0) {
            return ((C0494g) obj).F(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.l m7700(Object obj) {
        if (C0082.m7983() < 0) {
            return ((C0494g) obj).b;
        }
        return null;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return C0090.m8656(this, tVar);
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final /* synthetic */ int x(InterfaceC0492e interfaceC0492e) {
        return C0080.m7575(this, interfaceC0492e);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return m7690(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return m7685(this, j, uVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m7687(this, (InterfaceC0492e) obj);
    }

    static C0494g D(InterfaceC0489b interfaceC0489b, j$.time.l lVar) {
        return new C0494g(interfaceC0489b, lVar);
    }

    static C0494g C(n nVar, j$.time.temporal.m mVar) {
        C0494g c0494g = (C0494g) mVar;
        if (C0102.m11120(nVar, C0099.m10916(m7697(c0494g)))) {
            return c0494g;
        }
        String strM11279 = C0105.m11279(nVar);
        String strM112792 = C0105.m11279(C0099.m10916(m7697(c0494g)));
        StringBuilder sb = new StringBuilder(C0081.m7837(m7688(), 8, 31, 1764));
        C0101.m11052(sb, strM11279);
        C0101.m11052(sb, C0091.m8679(m7688(), 39, 10, 1484));
        C0101.m11052(sb, strM112792);
        throw new ClassCastException(C0099.m10924(sb));
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final n a() {
        return C0099.m10916(m7697(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return m7684(C0099.m10916(m7697(this)), C0097.m10815(this, j, bVar));
    }

    private C0494g(InterfaceC0489b interfaceC0489b, j$.time.l lVar) {
        C0079.m7494(interfaceC0489b, C0089.m8581(m7688(), 0, 4, 522));
        C0079.m7494(lVar, C0089.m8581(m7688(), 4, 4, 1412));
        this.a = interfaceC0489b;
        this.b = lVar;
    }

    private C0494g I(j$.time.temporal.m mVar, j$.time.l lVar) {
        InterfaceC0489b interfaceC0489bM7697 = m7697(this);
        return (interfaceC0489bM7697 == mVar && m7700(this) == lVar) ? this : new C0494g(m7695(C0099.m10916(interfaceC0489bM7697), mVar), lVar);
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final InterfaceC0489b c() {
        return m7697(this);
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final j$.time.l b() {
        return m7700(this);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && C0103.m11161(rVar, this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return C0084.m8093(aVar) || C0101.m11053(aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!C0101.m11053((j$.time.temporal.a) rVar)) {
                return C0084.m8099(m7697(this), rVar);
            }
            j$.time.l lVarM7700 = m7700(this);
            C0092.m8727(lVarM7700);
            return C0101.m11036(lVarM7700, rVar);
        }
        return C0094.m9149(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return C0101.m11053((j$.time.temporal.a) rVar) ? C0090.m8629(m7700(this), rVar) : C0097.m10845(m7697(this), rVar);
        }
        return C0092.m8732(m7698(this, rVar), m7694(this, rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return C0101.m11053((j$.time.temporal.a) rVar) ? C0103.m11131(m7700(this), rVar) : C0100.m11007(m7697(this), rVar);
        }
        return C0095.m9198(rVar, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return m7686(this, hVar, m7700(this));
    }

    public final C0494g H(long j, j$.time.temporal.r rVar) {
        boolean z = rVar instanceof j$.time.temporal.a;
        InterfaceC0489b interfaceC0489bM7697 = m7697(this);
        if (z) {
            boolean zM11053 = C0101.m11053((j$.time.temporal.a) rVar);
            j$.time.l lVarM7700 = m7700(this);
            if (zM11053) {
                return m7686(this, interfaceC0489bM7697, C0080.m7549(lVarM7700, j, rVar));
            }
            return m7686(this, C0097.m10808(interfaceC0489bM7697, j, rVar), lVarM7700);
        }
        return m7684(C0099.m10916(interfaceC0489bM7697), C0090.m8657(rVar, this, j));
    }

    public final C0494g E(long j, j$.time.temporal.u uVar) {
        boolean z = uVar instanceof j$.time.temporal.b;
        InterfaceC0489b interfaceC0489bM7697 = m7697(this);
        if (z) {
            int i = m7692()[C0105.m11258((j$.time.temporal.b) uVar)];
            j$.time.l lVarM7700 = m7700(this);
            switch (i) {
                case 1:
                    return m7696(this, m7697(this), 0L, 0L, 0L, j);
                case 2:
                    C0494g c0494gM7686 = m7686(this, C0095.m9196(interfaceC0489bM7697, j / 86400000000L, C0095.m9215()), lVarM7700);
                    return m7696(c0494gM7686, m7697(c0494gM7686), 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C0494g c0494gM76862 = m7686(this, C0095.m9196(interfaceC0489bM7697, j / 86400000, C0095.m9215()), lVarM7700);
                    return m7696(c0494gM76862, m7697(c0494gM76862), 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return m7699(this, j);
                case 5:
                    return m7696(this, m7697(this), 0L, j, 0L, 0L);
                case 6:
                    return m7696(this, m7697(this), j, 0L, 0L, 0L);
                case 7:
                    C0494g c0494gM76863 = m7686(this, C0095.m9196(interfaceC0489bM7697, j / 256, C0095.m9215()), lVarM7700);
                    return m7696(c0494gM76863, m7697(c0494gM76863), (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return m7686(this, C0095.m9196(interfaceC0489bM7697, j, uVar), lVarM7700);
            }
        }
        return m7684(C0099.m10916(interfaceC0489bM7697), C0089.m8580(uVar, this, j));
    }

    final C0494g F(long j) {
        return m7696(this, m7697(this), 0L, 0L, j, 0L);
    }

    private C0494g G(InterfaceC0489b interfaceC0489b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.l lVarM7700 = m7700(this);
        if (j5 == 0) {
            return m7686(this, interfaceC0489b, lVarM7700);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM11026 = C0101.m11026(lVarM7700);
        long j10 = j9 + jM11026;
        long jM11106 = C0102.m11106(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jM8641 = C0090.m8641(j10, 86400000000000L);
        if (jM8641 != jM11026) {
            lVarM7700 = C0085.m8231(jM8641);
        }
        return m7686(this, C0095.m9196(interfaceC0489b, jM11106, C0095.m9215()), lVarM7700);
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final InterfaceC0498k p(j$.time.A a) {
        return m7689(a, null, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(C0089.m8600(mVar, C0099.m10861(m7691(this)), C0095.m9191()), C0101.m11026(m7693(this)), C0090.m8636());
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0079.m7503(m7688(), 49, 42, 1757));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C0104.m11197(objectOutput, m7697(this));
        C0104.m11197(objectOutput, m7700(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0492e) && C0080.m7575(this, (InterfaceC0492e) obj) == 0;
    }

    public final int hashCode() {
        return C0099.m10905(m7697(this)) ^ C0079.m7476(m7700(this));
    }

    public final String toString() {
        String strM8685 = C0091.m8685(m7697(this));
        String strM8297 = C0086.m8297(m7700(this));
        StringBuilder sb = new StringBuilder();
        C0101.m11052(sb, strM8685);
        C0101.m11052(sb, C0080.m7573(m7688(), 91, 1, 345));
        C0101.m11052(sb, strM8297);
        return C0099.m10924(sb);
    }
}
