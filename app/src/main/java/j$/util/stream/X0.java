package j$.util.stream;

import j$.time.C0091;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class X0 extends N0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f523short = {2355, 2324, 2322, 2309, 2305, 2317, 2368, 2323, 2313, 2330, 2309, 2368, 2309, 2328, 2307, 2309, 2309, 2308, 2323, 2368, 2317, 2305, 2328, 2368, 2305, 2322, 2322, 2305, 2329, 2368, 2323, 2313, 2330, 2309, 1671, 1707, 1706, 1703, 1674, 1707, 1696, 1697, 1695, 1761, 1719, 1770, 1761, 1719, 1689, 2158, 2114, 2115, 2126, 2147, 2114, 2121, 2120, 2166, 2142, 2116, 2135, 2120, 2064, 2056, 2121, 2160};

    /* JADX INFO: renamed from: ۟۠ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m9829(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            ((L0) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۨ, reason: not valid java name and contains not printable characters */
    public static N0 m9830(Object obj, Object obj2, Object obj3) {
        if (C0100.m10983() >= 0) {
            return AbstractC0644z0.I((EnumC0548f3) obj, (L0) obj2, (L0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static long m9831(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((N0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static L0 m9832(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((N0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m9833(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m9834(Object obj, Object obj2, int i) {
        if (C0102.m11109() <= 0) {
            ((X0) obj).i((Object[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۢۨۥۤ, reason: not valid java name and contains not printable characters */
    public static L0 m9835(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((N0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static L0 m9836(Object obj, long j, long j2, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((L0) obj).h(j, j2, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9837(Object obj, Object obj2, int i) {
        if (C0101.m11044() < 0) {
            ((L0) obj).i((Object[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9838() {
        if (C0093.m9101() > 0) {
            return f523short;
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return new C0591o1(this);
    }

    @Override // j$.util.stream.L0
    public final void i(Object[] objArr, int i) {
        C0099.m10863(objArr);
        L0 l0M9832 = m9832(this);
        m9837(l0M9832, objArr, i);
        m9837(m9835(this), objArr, i + ((int) m9833(l0M9832)));
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        long jM9831 = m9831(this);
        if (jM9831 >= 2147483639) {
            throw new IllegalArgumentException(C0093.m9062(m9838(), 0, 34, 2400));
        }
        Object[] objArr = (Object[]) C0095.m9220(intFunction, (int) jM9831);
        m9834(this, objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        m9829(m9832(this), consumer);
        m9829(m9835(this), consumer);
    }

    @Override // j$.util.stream.L0
    public final L0 h(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == m9831(this)) {
            return this;
        }
        long jM9833 = m9833(m9832(this));
        if (j >= jM9833) {
            return m9836(m9835(this), j - jM9833, j2 - jM9833, intFunction);
        }
        if (j2 > jM9833) {
            return m9830(C0091.m8670(), m9836(m9832(this), j, jM9833, intFunction), m9836(m9835(this), 0L, j2 - jM9833, intFunction));
        }
        return m9836(m9832(this), j, j2, intFunction);
    }

    public final String toString() {
        return m9831(this) < 32 ? C0086.m8314(C0097.m10853(m9838(), 34, 15, 1732), new Object[]{m9832(this), m9835(this)}) : C0086.m8314(C0091.m8679(m9838(), 49, 17, 2093), new Object[]{C0106.m11351(m9831(this))});
    }
}
