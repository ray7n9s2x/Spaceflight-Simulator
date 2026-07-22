package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Comparable, Serializable {
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f418short = {2687, 2654, 2632, 2654, 2633, 2642, 2650, 2647, 2642, 2625, 2650, 2639, 2642, 2644, 2645, 2587, 2637, 2642, 2650, 2587, 2632, 2654, 2633, 2642, 2650, 2647, 2642, 2625, 2650, 2639, 2642, 2644, 2645, 2587, 2655, 2654, 2647, 2654, 2652, 2650, 2639, 2654, 2077, 2073, 2173, 2078, 2937, 2941, 2675, 2670};
    public static final e c = new e(0, 0);

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static long m7864(Object obj) {
        if (C0090.m8624() > 0) {
            return ((e) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static e m7865(long j, int i) {
        if (C0082.m7983() < 0) {
            return j(j, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7866() {
        if (C0098.m10857() < 0) {
            return f418short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static int m7867(Object obj) {
        if (C0080.m7553() > 0) {
            return ((e) obj).b;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        int iM11272 = C0105.m11272(m7864(this), m7864(eVar));
        return iM11272 != 0 ? iM11272 : m7867(this) - m7867(eVar);
    }

    static {
        C0104.m11208(1000000000L);
    }

    public static e m(long j) {
        return m7865(j, 0);
    }

    public static e n(long j, long j2) {
        return m7865(C0086.m8284(j, C0102.m11106(j2, 1000000000L)), (int) C0090.m8641(j2, 1000000000L));
    }

    private static e j(long j, int i) {
        if ((((long) i) | j) == 0) {
            return C0086.m8317();
        }
        return new e(j, i);
    }

    private e(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long k() {
        return m7864(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m7864(this) == m7864(eVar) && m7867(this) == m7867(eVar);
    }

    public final int hashCode() {
        long jM7864 = m7864(this);
        return (m7867(this) * 51) + ((int) (jM7864 ^ (jM7864 >>> 32)));
    }

    public final String toString() {
        if (this == C0086.m8317()) {
            return C0084.m8120(m7866(), 42, 4, 2125);
        }
        long jM7864 = m7864(this);
        int iM7867 = m7867(this);
        long j = (jM7864 >= 0 || iM7867 <= 0) ? jM7864 : 1 + jM7864;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        C0101.m11052(sb, C0083.m8037(m7866(), 46, 2, 2857));
        if (j2 != 0) {
            C0087.m8489(sb, j2);
            C0089.m8573(sb, 'H');
        }
        if (i != 0) {
            C0099.m10859(sb, i);
            C0089.m8573(sb, 'M');
        }
        if (i2 == 0 && iM7867 == 0 && C0081.m7835(sb) > 2) {
            return C0099.m10924(sb);
        }
        if (jM7864 < 0 && iM7867 > 0 && i2 == 0) {
            C0101.m11052(sb, C0091.m8679(m7866(), 48, 2, 2654));
        } else {
            C0099.m10859(sb, i2);
        }
        if (iM7867 > 0) {
            int iM7835 = C0081.m7835(sb);
            if (jM7864 < 0) {
                C0087.m8489(sb, 2000000000 - ((long) iM7867));
            } else {
                C0087.m8489(sb, ((long) iM7867) + 1000000000);
            }
            while (C0082.m7977(sb, C0081.m7835(sb) - 1) == '0') {
                C0095.m9200(sb, C0081.m7835(sb) - 1);
            }
            C0104.m11242(sb, iM7835, '.');
        }
        C0089.m8573(sb, 'S');
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0086.m8291(m7866(), 0, 42, 2619));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C0079.m7508(objectOutput, m7864(this));
        C0091.m8668(objectOutput, m7867(this));
    }
}
