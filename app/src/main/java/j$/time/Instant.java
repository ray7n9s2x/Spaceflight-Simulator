package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.p, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f392short = {1856, 1895, 1914, 1917, 1896, 1895, 1917, 1833, 1900, 1905, 1898, 1900, 1900, 1901, 1914, 1833, 1892, 1888, 1895, 1888, 1892, 1916, 1892, 1833, 1894, 1915, 1833, 1892, 1896, 1905, 1888, 1892, 1916, 1892, 1833, 1888, 1895, 1914, 1917, 1896, 1895, 1917, 906, 939, 957, 939, 956, 935, 943, 930, 935, 948, 943, 954, 935, 929, 928, 1006, 952, 935, 943, 1006, 957, 939, 956, 935, 943, 930, 935, 948, 943, 954, 935, 929, 928, 1006, 938, 939, 930, 939, 937, 943, 954, 939, 2473, 2450, 2447, 2441, 2444, 2444, 2451, 2446, 2440, 2457, 2456, 2524, 2441, 2450, 2453, 2440, 2502, 2524, 564, 527, 530, 532, 529, 529, 526, 531, 533, 516, 517, 577, 519, 520, 516, 525, 517, 603, 577, 1034, 1073, 1068, 1066, 1071, 1071, 1072, 1069, 1067, 1082, 1083, 1151, 1081, 1078, 1082, 1075, 1083, 1125, 1151, 2184, 2227, 2222, 2216, 2221, 2221, 2226, 2223, 2217, 2232, 2233, 2301, 2235, 2228, 2232, 2225, 2233, 2279, 2301};
    public static final Instant EPOCH = new Instant(0, 0);

    /* JADX INFO: renamed from: ۟۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Instant m7614(long j, int i) {
        if (C0100.m10983() >= 0) {
            return C(j, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m7615(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((Instant) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7616() {
        if (C0080.m7553() >= 0) {
            return f392short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int[] m7617() {
        if (C0099.m10878() <= 0) {
            return f.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int[] m7618() {
        if (C0084.m8116() >= 0) {
            return f.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Instant m7619(Object obj, long j, long j2) {
        if (C0103.m11154() < 0) {
            return ((Instant) obj).E(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static long m7620(Object obj) {
        if (C0092.m8724() < 0) {
            return ((Instant) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨۥ۠, reason: not valid java name and contains not printable characters */
    public static C0485a m7621() {
        if (C0090.m8624() >= 0) {
            return C0485a.b;
        }
        return null;
    }

    public static Instant now() {
        C0092.m8727(m7621());
        long jM8596 = C0089.m8596();
        long j = 1000;
        return m7614(C0102.m11106(jM8596, j), ((int) C0090.m8641(jM8596, j)) * DurationKt.NANOS_IN_MILLIS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iM11272 = C0105.m11272(m7620(this), m7620(instant2));
        return iM11272 != 0 ? iM11272 : m7615(this) - m7615(instant2);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0101.m11056(this, j, uVar);
    }

    static {
        C0099.m10879(-31557014167219200L, 0L);
        C0099.m10879(31556889864403199L, 999999999L);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return m7614(C0086.m8284(j, C0102.m11106(j2, 1000000000L)), (int) C0090.m8641(j2, 1000000000L));
    }

    private static Instant C(long j, int i) {
        if ((((long) i) | j) == 0) {
            return C0090.m8631();
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException(C0080.m7573(m7616(), 0, 42, 1801));
        }
        return new Instant(j, i);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == C0101.m11033() || rVar == C0090.m8604() || rVar == C0085.m8233() || rVar == C0086.m8305() : rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return C0101.m11036(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0092.m8732(C0101.m11036(this, rVar), C0095.m9198(rVar, this), rVar);
        }
        int i = m7618()[C0105.m11258((j$.time.temporal.a) rVar)];
        int iM7615 = m7615(this);
        if (i == 1) {
            return iM7615;
        }
        if (i == 2) {
            return iM7615 / 1000;
        }
        if (i == 3) {
            return iM7615 / DurationKt.NANOS_IN_MILLIS;
        }
        if (i == 4) {
            C0081.m7859(C0101.m11033(), m7620(this));
        }
        throw new j$.time.temporal.v(C0101.m11024(C0100.m10962(m7616(), 121, 19, 1119), rVar));
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        int i;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i2 = m7618()[C0105.m11258((j$.time.temporal.a) rVar)];
        int iM7615 = m7615(this);
        if (i2 == 1) {
            return iM7615;
        }
        if (i2 == 2) {
            i = iM7615 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return m7620(this);
                }
                throw new j$.time.temporal.v(C0101.m11024(C0083.m8037(m7616(), 140, 19, 2269), rVar));
            }
            i = iM7615 / DurationKt.NANOS_IN_MILLIS;
        }
        return i;
    }

    public long getEpochSecond() {
        return m7620(this);
    }

    public final int D() {
        return m7615(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) C0090.m8657(rVar, this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        C0090.m8635(aVar, j);
        int i = m7618()[C0105.m11258(aVar)];
        int iM7615 = m7615(this);
        long jM7620 = m7620(this);
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != iM7615) {
                    return m7614(jM7620, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * DurationKt.NANOS_IN_MILLIS;
                if (i3 != iM7615) {
                    return m7614(jM7620, i3);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.v(C0101.m11024(C0089.m8581(m7616(), 102, 19, 609), rVar));
                }
                if (j != jM7620) {
                    return m7614(j, iM7615);
                }
            }
        } else if (j != iM7615) {
            return m7614(jM7620, (int) j);
        }
        return this;
    }

    public final Instant F(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) C0089.m8580(uVar, this, j);
        }
        switch (m7617()[C0105.m11258((j$.time.temporal.b) uVar)]) {
            case 1:
                return m7619(this, 0L, j);
            case 2:
                return m7619(this, j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m7619(this, j / 1000, (j % 1000) * 1000000);
            case 4:
                return m7619(this, j, 0L);
            case 5:
                return m7619(this, C0081.m7854(j, 60), 0L);
            case 6:
                return m7619(this, C0081.m7854(j, 3600), 0L);
            case 7:
                return m7619(this, C0081.m7854(j, 43200), 0L);
            case 8:
                return m7619(this, C0081.m7854(j, 86400), 0L);
            default:
                StringBuilder sb = new StringBuilder(C0079.m7503(m7616(), 84, 18, 2556));
                C0082.m7988(sb, uVar);
                throw new j$.time.temporal.v(C0099.m10924(sb));
        }
    }

    private Instant E(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return C0099.m10879(C0086.m8284(C0086.m8284(m7620(this), j), j2 / 1000000000), ((long) m7615(this)) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0101.m11056(C0101.m11056(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0101.m11056(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0102.m11078()) {
            return C0086.m8322();
        }
        if (tVar == C0086.m8277() || tVar == C0084.m8090() || tVar == C0094.m9122() || tVar == C0081.m7843() || tVar == C0097.m10834() || tVar == C0081.m7795()) {
            return null;
        }
        return C0095.m9223(tVar, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(C0089.m8600(mVar, m7620(this), C0101.m11033()), m7615(this), C0090.m8604());
    }

    public final long G() {
        int iM7615 = m7615(this);
        long jM7620 = m7620(this);
        return (jM7620 >= 0 || iM7615 <= 0) ? C0086.m8284(C0081.m7854(jM7620, 1000), iM7615 / DurationKt.NANOS_IN_MILLIS) : C0086.m8284(C0081.m7854(jM7620 + 1, 1000), (iM7615 / DurationKt.NANOS_IN_MILLIS) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return m7620(this) == m7620(instant) && m7615(this) == m7615(instant);
    }

    public final int hashCode() {
        long jM7620 = m7620(this);
        return (m7615(this) * 51) + ((int) (jM7620 ^ (jM7620 >>> 32)));
    }

    public final String toString() {
        return C0091.m8695(C0095.m9173(), this);
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0100.m10962(m7616(), 42, 42, 974));
    }

    final void H(DataOutput dataOutput) throws IOException {
        C0079.m7508(dataOutput, m7620(this));
        C0091.m8668(dataOutput, m7615(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (Instant) C0092.m8737(hVar, this);
    }
}
