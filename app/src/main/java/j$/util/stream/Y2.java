package j$.util.stream;

import androidx.credentials.CredentialOption;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import java.io.C0103;
import java.io.C0104;
import java.util.Spliterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class Y2 extends AbstractC0534d implements Iterable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f525short = {2132, 2163, 2165, 2146, 2150, 2154, 2087, 2164, 2158, 2173, 2146, 2087, 2146, 2175, 2148, 2146, 2146, 2147, 2164, 2087, 2154, 2150, 2175, 2087, 2150, 2165, 2165, 2150, 2174, 2087, 2164, 2158, 2173, 2146, 1972, 1983, 1973, 1955, 2032, 1982, 1983, 1956, 2032, 1974, 1977, 1956};
    Object e;
    Object[] f;

    /* JADX INFO: renamed from: ۟۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m9870(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0534d) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m9871(Object obj) {
        if (C0079.m7512() > 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int m9872(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            return ((Y2) obj).t(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m9873() {
        if (C0094.m9148() > 0) {
            return f525short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۡ, reason: not valid java name and contains not printable characters */
    public static long m9874(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0534d) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۢ, reason: not valid java name and contains not printable characters */
    public static int m9875(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m9876(Object obj) {
        if (C0083.m8022() < 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9877(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((Y2) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9878(Object obj, int i, Object obj2) {
        if (C0102.m11109() < 0) {
            ((Y2) obj).r(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static long[] m9879(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m9880(Object obj, int i) {
        if (C0088.m8503() > 0) {
            return ((Y2) obj).c(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۢ, reason: contains not printable characters */
    public static void m9881(Object obj, long j) {
        if (C0101.m11044() <= 0) {
            ((Y2) obj).v(j);
        }
    }

    /* JADX INFO: renamed from: ۥۤ۟ۥ, reason: contains not printable characters */
    public static Object[] m9882(Object obj) {
        if (C0089.m8594() < 0) {
            return ((Y2) obj).w();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static Object[] m9883(Object obj) {
        if (C0084.m8116() > 0) {
            return ((Y2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9884(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0104.m11196() > 0) {
            ((Y2) obj).s(obj2, i, i2, obj3);
        }
    }

    public abstract Object c(int i);

    protected abstract void s(Object obj, int i, int i2, Object obj2);

    public abstract j$.util.f0 spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(m9877(this));
    }

    protected abstract int t(Object obj);

    protected abstract Object[] w();

    Y2(int i) {
        super(i);
        this.e = m9880(this, 1 << m9870(this));
    }

    Y2() {
        this.e = m9880(this, 16);
    }

    protected final void v(long j) {
        long jM9872;
        int iM9876 = m9876(this);
        if (iM9876 == 0) {
            jM9872 = m9872(this, m9871(this));
        } else {
            jM9872 = ((long) m9872(this, m9883(this)[iM9876])) + m9879(this)[iM9876];
        }
        if (j > jM9872) {
            if (m9883(this) == null) {
                Object[] objArrM9882 = m9882(this);
                this.f = objArrM9882;
                this.d = new long[8];
                objArrM9882[0] = m9871(this);
            }
            int iM98762 = m9876(this) + 1;
            while (j > jM9872) {
                Object[] objArrM9883 = m9883(this);
                if (iM98762 >= objArrM9883.length) {
                    int length = objArrM9883.length * 2;
                    this.f = C0097.m10839(objArrM9883, length);
                    this.d = C0096.m10759(m9879(this), length);
                }
                int iM9870 = m9870(this);
                if (iM98762 != 0 && iM98762 != 1) {
                    iM9870 = C0080.m7578((iM9870 + iM98762) - 1, 30);
                }
                int i = 1 << iM9870;
                m9883(this)[iM98762] = m9880(this, i);
                long[] jArrM9879 = m9879(this);
                int i2 = iM98762 - 1;
                jArrM9879[iM98762] = jArrM9879[i2] + ((long) m9872(this, m9883(this)[i2]));
                jM9872 += (long) i;
                iM98762++;
            }
        }
    }

    protected final int u(long j) {
        if (m9876(this) == 0) {
            if (j < m9875(this)) {
                return 0;
            }
            throw new IndexOutOfBoundsException(C0099.m10925(j));
        }
        if (j >= m9874(this)) {
            throw new IndexOutOfBoundsException(C0099.m10925(j));
        }
        for (int i = 0; i <= m9876(this); i++) {
            if (j < m9879(this)[i] + ((long) m9872(this, m9883(this)[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(C0099.m10925(j));
    }

    public void r(int i, Object obj) {
        int iM9872 = i;
        long j = iM9872;
        long jM9874 = m9874(this) + j;
        if (jM9874 > m9872(this, obj) || jM9874 < j) {
            throw new IndexOutOfBoundsException(C0092.m8731(m9873(), 34, 12, CredentialOption.PRIORITY_DEFAULT));
        }
        if (m9876(this) == 0) {
            C0080.m7558(m9871(this), 0, obj, iM9872, m9875(this));
            return;
        }
        for (int i2 = 0; i2 < m9876(this); i2++) {
            Object obj2 = m9883(this)[i2];
            C0080.m7558(obj2, 0, obj, iM9872, m9872(this, obj2));
            iM9872 += m9872(this, m9883(this)[i2]);
        }
        int iM9875 = m9875(this);
        if (iM9875 > 0) {
            C0080.m7558(m9871(this), 0, obj, iM9872, iM9875);
        }
    }

    public Object d() {
        long jM9874 = m9874(this);
        if (jM9874 >= 2147483639) {
            throw new IllegalArgumentException(C0103.m11135(m9873(), 0, 34, 2055));
        }
        Object objM9880 = m9880(this, (int) jM9874);
        m9878(this, 0, objM9880);
        return objM9880;
    }

    protected final void x() {
        long jM9872;
        if (m9875(this) == m9872(this, m9871(this))) {
            if (m9883(this) == null) {
                Object[] objArrM9882 = m9882(this);
                this.f = objArrM9882;
                this.d = new long[8];
                objArrM9882[0] = m9871(this);
            }
            int iM9876 = m9876(this);
            int i = iM9876 + 1;
            Object[] objArrM9883 = m9883(this);
            if (i >= objArrM9883.length || objArrM9883[i] == null) {
                if (iM9876 == 0) {
                    jM9872 = m9872(this, m9871(this));
                } else {
                    jM9872 = ((long) m9872(this, objArrM9883[iM9876])) + m9879(this)[iM9876];
                }
                m9881(this, jM9872 + 1);
            }
            this.b = 0;
            int iM98762 = m9876(this) + 1;
            this.c = iM98762;
            this.e = m9883(this)[iM98762];
        }
    }

    @Override // j$.util.stream.AbstractC0534d
    public final void clear() {
        Object[] objArrM9883 = m9883(this);
        if (objArrM9883 != null) {
            this.e = objArrM9883[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void e(Object obj) {
        for (int i = 0; i < m9876(this); i++) {
            Object obj2 = m9883(this)[i];
            m9884(this, obj2, 0, m9872(this, obj2), obj);
        }
        m9884(this, m9871(this), 0, m9875(this), obj);
    }
}
