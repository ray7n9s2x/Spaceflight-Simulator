package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC0492e, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    private final h a;
    private final l b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f442short = {1169, 1194, 1189, 1190, 1192, 1185, 1252, 1200, 1195, 1252, 1195, 1190, 1200, 1189, 1197, 1194, 1252, 1160, 1195, 1191, 1189, 1192, 1152, 1189, 1200, 1185, 1168, 1197, 1193, 1185, 1252, 1186, 1206, 1195, 1193, 1252, 1168, 1185, 1193, 1204, 1195, 1206, 1189, 1192, 1157, 1191, 1191, 1185, 1207, 1207, 1195, 1206, 1278, 1252, 2099, 2172, 2165, 2099, 2151, 2154, 2147, 2166, 2099, 891, 894, 875, 890, 3057, 3052, 3048, 3040, 722, 731, 731, 718, 728, 713, 2259, 2290, 2276, 2290, 2277, 2302, 2294, 2299, 2302, 2285, 2294, 2275, 2302, 2296, 2297, 2231, 2273, 2302, 2294, 2231, 2276, 2290, 2277, 2302, 2294, 2299, 2302, 2285, 2294, 2275, 2302, 2296, 2297, 2231, 2291, 2290, 2299, 2290, 2288, 2294, 2275, 2290, 1538};
    public static final j c = C0100.m11000(C0094.m9157(), C0083.m8036());
    public static final j d = C0100.m11000(C0099.m10929(), C0095.m9216());

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static h m8142(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m8143(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return ((h) obj).C((h) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۢ, reason: not valid java name and contains not printable characters */
    public static j m8144(Object obj, Object obj2, long j, long j2, long j3, long j4) {
        if (C0083.m8022() <= 0) {
            return ((j) obj).O((h) obj2, j, j2, j3, j4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡ۠, reason: not valid java name and contains not printable characters */
    public static l m8145(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((j) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠۠, reason: not valid java name and contains not printable characters */
    public static j m8146(Object obj, Object obj2, Object obj3) {
        if (C0080.m7553() >= 0) {
            return ((j) obj).S((h) obj2, (l) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m8147(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((j) obj).C((j) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m8148() {
        if (C0102.m11109() <= 0) {
            return f442short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m8149() {
        if (C0079.m7512() > 0) {
            return i.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m8150(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            ((h) obj).Z((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m8151(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            ((l) obj).W((DataOutput) obj2);
        }
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final InterfaceC0489b c() {
        return m8142(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C0082.m7976(this, (InterfaceC0492e) obj);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0102.m11077(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0092.m8783(this, j, uVar);
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final j$.time.chrono.n a() {
        return C0090.m8645((h) C0086.m8313(this));
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final InterfaceC0498k p(A a) {
        return C0079.m7498(this, a, null);
    }

    public static j J(int i) {
        return new j(C0079.m7525(i, 12, 31), C0099.m10926(0));
    }

    public static j K(h hVar, l lVar) {
        C0079.m7494(hVar, C0091.m8679(m8148(), 63, 4, 799));
        C0079.m7494(lVar, C0103.m11135(m8148(), 67, 4, 2949));
        return new j(hVar, lVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(C0089.m8600(mVar, C0086.m8288((h) C0086.m8313(this)), C0095.m9191()), C0101.m11026(C0097.m10828(this)), C0090.m8636());
    }

    public static j L(long j, int i, A a) {
        C0079.m7494(a, C0084.m8120(m8148(), 71, 6, 701));
        long j2 = i;
        C0090.m8635(C0090.m8604(), j2);
        long jM8527 = j + ((long) C0088.m8527(a));
        long j3 = 86400;
        return new j(C0083.m8044(C0102.m11106(jM8527, j3)), C0085.m8231((((long) ((int) C0090.m8641(jM8527, j3))) * 1000000000) + j2));
    }

    public static j D(j$.time.temporal.o oVar) {
        if (oVar instanceof j) {
            return (j) oVar;
        }
        if (oVar instanceof D) {
            return C0105.m11294((D) oVar);
        }
        if (oVar instanceof r) {
            return C0091.m8706((r) oVar);
        }
        try {
            return new j(C0080.m7570(oVar), C0081.m7844(oVar));
        } catch (DateTimeException e) {
            String strM8091 = C0084.m8091(C0092.m8727(oVar));
            StringBuilder sb = new StringBuilder(C0084.m8120(m8148(), 0, 54, 1220));
            C0082.m7988(sb, oVar);
            C0101.m11052(sb, C0101.m11060(m8148(), 54, 9, 2067));
            C0101.m11052(sb, strM8091);
            throw new DateTimeException(C0099.m10924(sb), e);
        }
    }

    private j(h hVar, l lVar) {
        this.a = hVar;
        this.b = lVar;
    }

    private j S(h hVar, l lVar) {
        return (m8142(this) == hVar && m8145(this) == lVar) ? this : new j(hVar, lVar);
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
            if (C0101.m11053((j$.time.temporal.a) rVar)) {
                l lVarM8145 = m8145(this);
                C0092.m8727(lVarM8145);
                return C0101.m11036(lVarM8145, rVar);
            }
            return C0105.m11289(m8142(this), rVar);
        }
        return C0094.m9149(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return C0101.m11053((j$.time.temporal.a) rVar) ? C0090.m8629(m8145(this), rVar) : C0093.m9072(m8142(this), rVar);
        }
        return C0103.m11167(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return C0101.m11053((j$.time.temporal.a) rVar) ? C0103.m11131(m8145(this), rVar) : C0104.m11214(m8142(this), rVar);
        }
        return C0095.m9198(rVar, this);
    }

    private int C(j jVar) {
        int iM8143 = m8143(m8142(this), m8142(jVar));
        return iM8143 == 0 ? C0083.m8025(m8145(this), m8145(jVar)) : iM8143;
    }

    public final h P() {
        return m8142(this);
    }

    public final int G() {
        return C0097.m10813(m8142(this));
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final l b() {
        return m8145(this);
    }

    public final int F() {
        return C0103.m11128(m8145(this));
    }

    public final int E() {
        return C0106.m11356(m8145(this));
    }

    public final j R(h hVar) {
        return m8146(this, hVar, m8145(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return m8146(this, hVar, m8145(this));
    }

    public final j Q(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean zM11053 = C0101.m11053((j$.time.temporal.a) rVar);
            l lVarM8145 = m8145(this);
            h hVarM8142 = m8142(this);
            if (zM11053) {
                return m8146(this, hVarM8142, C0080.m7549(lVarM8145, j, rVar));
            }
            return m8146(this, C0105.m11302(hVarM8142, j, rVar), lVarM8145);
        }
        return (j) C0090.m8657(rVar, this, j);
    }

    public final j M(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            int i = m8149()[C0105.m11258((j$.time.temporal.b) uVar)];
            l lVarM8145 = m8145(this);
            h hVarM8142 = m8142(this);
            switch (i) {
                case 1:
                    return m8144(this, m8142(this), 0L, 0L, 0L, j);
                case 2:
                    j jVarM8146 = m8146(this, C0094.m9137(hVarM8142, j / 86400000000L), lVarM8145);
                    return m8144(jVarM8146, m8142(jVarM8146), 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    j jVarM81462 = m8146(this, C0094.m9137(hVarM8142, j / 86400000), lVarM8145);
                    return m8144(jVarM81462, m8142(jVarM81462), 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return C0100.m11002(this, j);
                case 5:
                    return m8144(this, m8142(this), 0L, j, 0L, 0L);
                case 6:
                    return m8144(this, m8142(this), j, 0L, 0L, 0L);
                case 7:
                    j jVarM81463 = m8146(this, C0094.m9137(hVarM8142, j / 256), lVarM8145);
                    return m8144(jVarM81463, m8142(jVarM81463), (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return m8146(this, C0096.m10763(hVarM8142, j, uVar), lVarM8145);
            }
        }
        return (j) C0089.m8580(uVar, this, j);
    }

    public final j N(long j) {
        return m8144(this, m8142(this), 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0092.m8783(C0092.m8783(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0092.m8783(this, -j, bVar);
    }

    private j O(h hVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        l lVarM8145 = m8145(this);
        if (j5 == 0) {
            return m8146(this, hVar, lVarM8145);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM11026 = C0101.m11026(lVarM8145);
        long j10 = (j9 * j8) + jM11026;
        long jM11106 = C0102.m11106(j10, 86400000000000L) + (j7 * j8);
        long jM8641 = C0090.m8641(j10, 86400000000000L);
        if (jM8641 != jM11026) {
            lVarM8145 = C0085.m8231(jM8641);
        }
        return m8146(this, C0094.m9137(hVar, jM11106), lVarM8145);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0097.m10834()) {
            return m8142(this);
        }
        return C0090.m8656(this, tVar);
    }

    @Override // j$.time.chrono.InterfaceC0492e
    public final int x(InterfaceC0492e interfaceC0492e) {
        if (interfaceC0492e instanceof j) {
            return m8147(this, (j) interfaceC0492e);
        }
        return C0080.m7575(this, interfaceC0492e);
    }

    public final boolean H(j jVar) {
        if (jVar instanceof j) {
            return m8147(this, jVar) > 0;
        }
        long jM8288 = C0086.m8288(m8142(this));
        long jM82882 = C0086.m8288(m8142(jVar));
        return jM8288 > jM82882 || (jM8288 == jM82882 && C0101.m11026(m8145(this)) > C0101.m11026(m8145(jVar)));
    }

    public final boolean I(j jVar) {
        if (jVar instanceof j) {
            return m8147(this, jVar) < 0;
        }
        long jM8288 = C0086.m8288(m8142(this));
        long jM82882 = C0086.m8288(m8142(jVar));
        return jM8288 < jM82882 || (jM8288 == jM82882 && C0101.m11026(m8145(this)) < C0101.m11026(m8145(jVar)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C0085.m8243(m8142(this), m8142(jVar)) && C0086.m8331(m8145(this), m8145(jVar));
    }

    public final int hashCode() {
        return C0083.m8056(m8142(this)) ^ C0079.m7476(m8145(this));
    }

    public final String toString() {
        String strM9094 = C0093.m9094(m8142(this));
        String strM8297 = C0086.m8297(m8145(this));
        StringBuilder sb = new StringBuilder();
        C0101.m11052(sb, strM9094);
        C0101.m11052(sb, C0080.m7573(m8148(), 119, 1, 1622));
        C0101.m11052(sb, strM8297);
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0100.m10962(m8148(), 77, 42, 2199));
    }

    final void T(DataOutput dataOutput) {
        m8150(m8142(this), dataOutput);
        m8151(m8145(this), dataOutput);
    }
}
