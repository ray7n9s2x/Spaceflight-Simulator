package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
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
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class m implements InterfaceC0498k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f407short = {2369, 2372, 2385, 2368, 2417, 2380, 2376, 2368, 418, 427, 427, 446, 424, 441, 1750, 1731, 1730, 1737, 2220, 2223, 2211, 2209, 2220, 2180, 2209, 2228, 2213, 2196, 2217, 2221, 2213, 2227, 2214, 2215, 2220, 2908, 2901, 2901, 2880, 2902, 2887, 784, 817, 807, 817, 806, 829, 821, 824, 829, 814, 821, 800, 829, 827, 826, 884, 802, 829, 821, 884, 807, 817, 806, 829, 821, 824, 829, 814, 821, 800, 829, 827, 826, 884, 816, 817, 824, 817, 819, 821, 800, 817, 2179, 2216, 2226, 2223, 2222, 2223, 2220, 2223, 2215, 2233, 2272, 2221, 2217, 2227, 2221, 2209, 2228, 2211, 2216, 2284, 2272, 2226, 2213, 2225, 2229, 2217, 2226, 2213, 2212, 2298, 2272, 2028, 2016, 1953, 1955, 1972, 1973, 1953, 1964, 2042, 2016, 1897, 1888, 1888, 1909, 1891, 1906, 846, 3221};
    private final transient C0494g a;
    private final transient j$.time.A b;
    private final transient j$.time.z c;

    /* JADX INFO: renamed from: ۟۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.A m7710(Object obj) {
        if (C0081.m7818() < 0) {
            return ((m) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static long m7711(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((m) obj).B();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0498k m7712(Object obj, long j, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((m) obj).D(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m7713(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            return ((C0494g) obj).w((j$.time.temporal.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7714(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((C0494g) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7715() {
        if (C0099.m10878() < 0) {
            return AbstractC0497j.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static C0494g m7716(Object obj, long j, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((C0494g) obj).E(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static n m7717(Object obj) {
        if (C0104.m11196() > 0) {
            return ((m) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7718(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((C0494g) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0498k m7719(Object obj, Object obj2, Object obj3) {
        if (C0097.m10823() > 0) {
            return C((j$.time.z) obj, (j$.time.A) obj2, (C0494g) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.z m7720(Object obj) {
        if (C0099.m10878() < 0) {
            return ((m) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static m m7721(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return w((n) obj, (j$.time.temporal.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m7722(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((C0494g) obj).n((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0492e m7723(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((m) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7724(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((m) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static C0494g m7725(Object obj, long j, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((C0494g) obj).H(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
    public static String m7726(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((C0494g) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static C0494g m7727(Object obj, long j) {
        if (C0093.m9101() >= 0) {
            return ((C0494g) obj).F(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static C0494g m7728(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((m) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۨ, reason: contains not printable characters */
    public static j$.time.l m7729(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((C0494g) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۧ, reason: contains not printable characters */
    public static j$.time.A m7730(Object obj) {
        if (C0091.m8708() > 0) {
            return ((m) obj).g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7731() {
        if (C0094.m9148() > 0) {
            return f407short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m7732(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((C0494g) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int[] m7733() {
        if (C0091.m8708() >= 0) {
            return AbstractC0499l.a;
        }
        return null;
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final /* synthetic */ long B() {
        return C0093.m9080(this);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return C0081.m7832(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return C0081.m7849(this, tVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return m7712(this, j, uVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return C0099.m10884(this, (InterfaceC0498k) obj);
    }

    static InterfaceC0498k C(j$.time.z zVar, j$.time.A a, C0494g c0494g) {
        C0494g c0494gM7727 = c0494g;
        j$.time.A aM8613 = a;
        C0079.m7494(c0494gM7727, C0093.m9062(m7731(), 18, 13, 2240));
        C0079.m7494(zVar, C0098.m10856(m7731(), 31, 4, 2249));
        if (zVar instanceof j$.time.A) {
            return new m(zVar, (j$.time.A) zVar, c0494gM7727);
        }
        j$.time.zone.f fVarM11198 = C0104.m11198(zVar);
        j$.time.j jVarM7486 = C0079.m7486(c0494gM7727);
        List listM8032 = C0083.m8032(fVarM11198, jVarM7486);
        if (C0091.m8675(listM8032) == 1) {
            aM8613 = (j$.time.A) C0094.m9156(listM8032, 0);
        } else if (C0091.m8675(listM8032) == 0) {
            j$.time.zone.b bVarM8771 = C0092.m8771(fVarM11198, jVarM7486);
            c0494gM7727 = m7727(c0494gM7727, C0082.m8010(C0089.m8568(bVarM8771)));
            aM8613 = C0090.m8613(bVarM8771);
        } else if (aM8613 == null || !C0087.m8455(listM8032, aM8613)) {
            aM8613 = (j$.time.A) C0094.m9156(listM8032, 0);
        }
        C0079.m7494(aM8613, C0105.m11310(m7731(), 35, 6, 2867));
        return new m(zVar, aM8613, c0494gM7727);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == C0101.m11033() || rVar == C0088.m8508()) {
                return C0090.m8651((j$.time.temporal.a) rVar);
            }
            return m7722((C0494g) m7723(this), rVar);
        }
        return C0094.m9149(rVar, this);
    }

    static m w(n nVar, j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar;
        if (C0102.m11120(nVar, m7717(mVar2))) {
            return mVar2;
        }
        String strM11279 = C0105.m11279(nVar);
        String strM112792 = C0105.m11279(m7717(mVar2));
        StringBuilder sb = new StringBuilder(C0096.m10776(m7731(), 83, 31, 2240));
        C0101.m11052(sb, strM11279);
        C0101.m11052(sb, C0099.m10897(m7731(), 114, 10, 1984));
        C0101.m11052(sb, strM112792);
        throw new ClassCastException(C0099.m10924(sb));
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m7715()[C0105.m11258((j$.time.temporal.a) rVar)];
            if (i == 1) {
                return m7711(this);
            }
            if (i == 2) {
                return C0088.m8527(m7730(this));
            }
            return m7732((C0494g) m7723(this), rVar);
        }
        return C0095.m9198(rVar, this);
    }

    private m(j$.time.z zVar, j$.time.A a, C0494g c0494g) {
        this.a = (C0494g) C0079.m7494(c0494g, C0085.m8236(m7731(), 0, 8, 2341));
        this.b = (j$.time.A) C0079.m7494(a, C0087.m8474(m7731(), 8, 6, 461));
        this.c = (j$.time.z) C0079.m7494(zVar, C0094.m9107(m7731(), 14, 4, 1708));
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final j$.time.A g() {
        return m7710(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final InterfaceC0489b c() {
        return m7714((C0494g) m7723(this));
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final j$.time.l b() {
        return m7729((C0494g) m7723(this));
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final InterfaceC0492e y() {
        return m7728(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final j$.time.z q() {
        return m7720(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final n a() {
        return C0099.m10916(m7724(this));
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final InterfaceC0498k h(j$.time.z zVar) {
        return m7719(zVar, m7710(this), m7728(this));
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && C0103.m11161(rVar, this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return m7721(m7717(this), C0090.m8657(rVar, this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = m7733()[C0105.m11258(aVar)];
        if (i == 1) {
            return m7712(this, j - C0093.m9080(this), C0086.m8283());
        }
        j$.time.z zVarM7720 = m7720(this);
        C0494g c0494gM7728 = m7728(this);
        if (i != 2) {
            return m7719(zVarM7720, m7710(this), m7725(c0494gM7728, j, rVar));
        }
        j$.time.A aM8622 = C0090.m8622(C0081.m7859(aVar, j));
        C0092.m8727(c0494gM7728);
        Instant instantM10879 = C0099.m10879(C0103.m11133(c0494gM7728, aM8622), C0106.m11356(m7729(c0494gM7728)));
        n nVarM7717 = m7717(this);
        j$.time.A aM7492 = C0079.m7492(C0104.m11198(zVarM7720), instantM10879);
        C0079.m7494(aM7492, C0099.m10897(m7731(), 124, 6, 1798));
        return new m(zVarM7720, aM7492, (C0494g) C0093.m9079(nVarM7717, C0102.m11100(C0088.m8560(instantM10879), C0096.m10754(instantM10879), aM7492)));
    }

    public final InterfaceC0498k D(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return m7721(m7717(this), m7713(m7716(m7728(this), j, uVar), this));
        }
        return m7721(m7717(this), C0089.m8580(uVar, this, j));
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0106.m11346(m7731(), 41, 42, 852));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C0104.m11197(objectOutput, m7728(this));
        C0104.m11197(objectOutput, m7710(this));
        C0104.m11197(objectOutput, m7720(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0498k) && C0099.m10884(this, (InterfaceC0498k) obj) == 0;
    }

    public final int hashCode() {
        return (m7718(m7728(this)) ^ C0080.m7536(m7710(this))) ^ C0086.m8310(C0083.m8053(m7720(this)), 3);
    }

    public final String toString() {
        String strM7726 = m7726(m7728(this));
        j$.time.A aM7710 = m7710(this);
        String strM7990 = C0082.m7990(aM7710);
        StringBuilder sb = new StringBuilder();
        C0101.m11052(sb, strM7726);
        C0101.m11052(sb, strM7990);
        String strM10924 = C0099.m10924(sb);
        j$.time.z zVarM7720 = m7720(this);
        if (aM7710 == zVarM7720) {
            return strM10924;
        }
        String strM11245 = C0104.m11245(zVarM7720);
        StringBuilder sb2 = new StringBuilder();
        C0101.m11052(sb2, strM10924);
        C0101.m11052(sb2, C0106.m11346(m7731(), 130, 1, 789));
        C0101.m11052(sb2, strM11245);
        C0101.m11052(sb2, C0101.m11060(m7731(), 131, 1, 3272));
        return C0099.m10924(sb2);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return m7721(m7717(this), C0079.m7504(hVar, this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return m7721(m7717(this), C0097.m10815(this, j, bVar));
    }
}
