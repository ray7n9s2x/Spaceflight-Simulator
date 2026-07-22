package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
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
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0491d implements InterfaceC0489b, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f403short = {1899, 1856, 1882, 1863, 1862, 1863, 1860, 1863, 1871, 1873, 1800, 1861, 1857, 1883, 1861, 1865, 1884, 1867, 1856, 1796, 1800, 1869, 1872, 1880, 1869, 1867, 1884, 1869, 1868, 1810, 1800, 2265, 2261, 2196, 2198, 2177, 2176, 2196, 2201, 2255, 2261, 1356, 1399, 1386, 1388, 1385, 1385, 1398, 1387, 1389, 1404, 1405, 1337, 1407, 1392, 1404, 1397, 1405, 1315, 1337, 3305, 3282, 3279, 3273, 3276, 3276, 3283, 3278, 3272, 3289, 3288, 3228, 3273, 3282, 3285, 3272, 3206, 3228, 1239, 787, 2393, 2372};

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7669(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return C((n) obj, (j$.time.temporal.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7670(Object obj, long j) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0491d) obj).F(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static C0494g m7671(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            return C0494g.D((InterfaceC0489b) obj, (j$.time.l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static o m7672(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0491d) obj).D();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7673(Object obj, long j) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0491d) obj).H(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7674(Object obj, long j) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0491d) obj).G(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int[] m7675() {
        if (C0094.m9148() >= 0) {
            return AbstractC0490c.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۠۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7676(Object obj, long j, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((AbstractC0491d) obj).E(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static long m7677(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0491d) obj).t();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m7678(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0491d) obj).z((InterfaceC0489b) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7679(Object obj, long j, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((AbstractC0491d) obj).e(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۥ, reason: contains not printable characters */
    public static InterfaceC0489b m7680(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0491d) obj).I((j$.time.temporal.p) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣ, reason: contains not printable characters */
    public static short[] m7681() {
        if (C0083.m8022() < 0) {
            return f403short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۤ, reason: contains not printable characters */
    public static InterfaceC0489b m7682(Object obj, long j, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0491d) obj).d(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    abstract InterfaceC0489b F(long j);

    abstract InterfaceC0489b G(long j);

    abstract InterfaceC0489b H(long j);

    @Override // j$.time.chrono.InterfaceC0489b, j$.time.temporal.o
    public /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return C0092.m8767(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return C0103.m11167(this, rVar);
    }

    @Override // j$.time.temporal.o
    public /* synthetic */ j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return C0101.m11036(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return C0096.m10751(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final /* synthetic */ j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0092.m8737(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final /* synthetic */ int z(InterfaceC0489b interfaceC0489b) {
        return C0088.m8528(this, interfaceC0489b);
    }

    @Override // j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return m7682(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return m7679(this, j, uVar);
    }

    @Override // j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return m7676(this, j, bVar);
    }

    @Override // j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m m(j$.time.h hVar) {
        return m7680(this, hVar);
    }

    static InterfaceC0489b C(n nVar, j$.time.temporal.m mVar) {
        InterfaceC0489b interfaceC0489b = (InterfaceC0489b) mVar;
        if (C0102.m11120(nVar, C0099.m10916(interfaceC0489b))) {
            return interfaceC0489b;
        }
        String strM11279 = C0105.m11279(nVar);
        String strM112792 = C0105.m11279(C0099.m10916(interfaceC0489b));
        StringBuilder sb = new StringBuilder(C0083.m8037(m7681(), 0, 31, 1832));
        C0101.m11052(sb, strM11279);
        C0101.m11052(sb, C0097.m10853(m7681(), 31, 10, 2293));
        C0101.m11052(sb, strM112792);
        throw new ClassCastException(C0099.m10924(sb));
    }

    AbstractC0491d() {
    }

    @Override // j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public InterfaceC0489b e(long j, j$.time.temporal.u uVar) {
        boolean z = uVar instanceof j$.time.temporal.b;
        String strM7503 = C0079.m7503(m7681(), 60, 18, 3260);
        if (!z) {
            if (!z) {
                return m7669(C0099.m10916(this), C0089.m8580(uVar, this, j));
            }
            StringBuilder sb = new StringBuilder(strM7503);
            C0082.m7988(sb, uVar);
            throw new j$.time.temporal.v(C0099.m10924(sb));
        }
        switch (m7675()[C0105.m11258((j$.time.temporal.b) uVar)]) {
            case 1:
                return m7670(this, j);
            case 2:
                return m7670(this, C0081.m7854(j, 7));
            case 3:
                return m7674(this, j);
            case 4:
                return m7673(this, j);
            case 5:
                return m7673(this, C0081.m7854(j, 10));
            case 6:
                return m7673(this, C0081.m7854(j, 100));
            case 7:
                return m7673(this, C0081.m7854(j, 1000));
            case 8:
                j$.time.temporal.a aVarM8664 = C0091.m8664();
                return m7682(this, C0086.m8284(C0100.m11007(this, aVarM8664), j), aVarM8664);
            default:
                StringBuilder sb2 = new StringBuilder(strM7503);
                C0082.m7988(sb2, uVar);
                throw new j$.time.temporal.v(C0099.m10924(sb2));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m7678(this, (InterfaceC0489b) obj);
    }

    public o D() {
        return C0088.m8559(C0099.m10916(this), C0103.m11167(this, C0091.m8664()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0489b) && C0088.m8528(this, (InterfaceC0489b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public int hashCode() {
        long jM7677 = m7677(this);
        return C0106.m11333(C0099.m10916(this)) ^ ((int) (jM7677 ^ (jM7677 >>> 32)));
    }

    public InterfaceC0489b I(j$.time.temporal.p pVar) {
        return m7669(C0099.m10916(this), C0104.m11212(pVar, this));
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public String toString() {
        long jM11007 = C0100.m11007(this, C0092.m8764());
        long jM110072 = C0100.m11007(this, C0094.m9136());
        long jM110073 = C0100.m11007(this, C0084.m8118());
        StringBuilder sb = new StringBuilder(30);
        C0101.m11052(sb, C0081.m7804(C0099.m10916(this)));
        String strM9062 = C0093.m9062(m7681(), 78, 1, 1271);
        C0101.m11052(sb, strM9062);
        C0082.m7988(sb, m7672(this));
        C0101.m11052(sb, strM9062);
        C0087.m8489(sb, jM11007);
        String strM10853 = C0097.m10853(m7681(), 79, 1, 830);
        String strM10962 = C0100.m10962(m7681(), 80, 2, 2420);
        C0101.m11052(sb, jM110072 < 10 ? strM10962 : strM10853);
        C0087.m8489(sb, jM110072);
        if (jM110073 < 10) {
            strM10853 = strM10962;
        }
        C0101.m11052(sb, strM10853);
        C0087.m8489(sb, jM110073);
        return C0099.m10924(sb);
    }

    @Override // j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public InterfaceC0489b d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(C0101.m11024(C0094.m9107(m7681(), 41, 19, 1305), rVar));
        }
        return m7669(C0099.m10916(this), C0090.m8657(rVar, this, j));
    }

    public InterfaceC0489b E(long j, j$.time.temporal.u uVar) {
        return m7669(C0099.m10916(this), C0097.m10815(this, j, uVar));
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public InterfaceC0492e u(j$.time.l lVar) {
        return m7671(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public long t() {
        return C0100.m11007(this, C0095.m9191());
    }
}
