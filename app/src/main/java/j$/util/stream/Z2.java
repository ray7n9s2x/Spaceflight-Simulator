package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import java.io.C0104;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
class Z2 extends AbstractC0534d implements Consumer, Iterable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f527short = {1672, 1707, 1714, 1717, 1726, 1727, 1689, 1710, 1725, 1725, 1726, 1705, 1761};
    protected Object[] e = new Object[1 << 4];
    protected Object[][] f;

    /* JADX INFO: renamed from: ۟ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9904() {
        if (C0100.m10983() > 0) {
            return f527short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9905(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((Z2) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static int m9906(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9907(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0534d) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m9908(Object obj) {
        if (C0082.m7983() < 0) {
            return ((Z2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m9909(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m9910(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            ((Z2) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long[] m9911(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object[][] m9912(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((Z2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m9913(Object obj, long j) {
        if (C0102.m11109() <= 0) {
            ((Z2) obj).s(j);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(m9905(this));
    }

    Z2() {
    }

    protected final void s(long j) {
        long length;
        int iM9909 = m9909(this);
        if (iM9909 == 0) {
            length = m9908(this).length;
        } else {
            length = m9911(this)[iM9909] + ((long) m9912(this)[iM9909].length);
        }
        if (j > length) {
            if (m9912(this) == null) {
                Object[][] objArr = new Object[8][];
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = m9908(this);
            }
            int i = iM9909 + 1;
            while (j > length) {
                Object[][] objArrM9912 = m9912(this);
                if (i >= objArrM9912.length) {
                    int length2 = objArrM9912.length * 2;
                    this.f = (Object[][]) C0097.m10839(objArrM9912, length2);
                    this.d = C0096.m10759(m9911(this), length2);
                }
                int iM9907 = m9907(this);
                if (i != 0 && i != 1) {
                    iM9907 = C0080.m7578((iM9907 + i) - 1, 30);
                }
                int i2 = 1 << iM9907;
                Object[][] objArrM99122 = m9912(this);
                objArrM99122[i] = new Object[i2];
                long[] jArrM9911 = m9911(this);
                int i3 = i - 1;
                jArrM9911[i] = jArrM9911[i3] + ((long) objArrM99122[i3].length);
                length += (long) i2;
                i++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC0534d
    public final void clear() {
        Object[][] objArrM9912 = m9912(this);
        if (objArrM9912 != null) {
            this.e = objArrM9912[0];
            int i = 0;
            while (true) {
                Object[] objArrM9908 = m9908(this);
                if (i >= objArrM9908.length) {
                    break;
                }
                objArrM9908[i] = null;
                i++;
            }
            this.f = null;
            this.d = null;
        } else {
            for (int i2 = 0; i2 < m9906(this); i2++) {
                m9908(this)[i2] = null;
            }
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0088.m8520(m9905(this));
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i = 0; i < m9909(this); i++) {
            for (Object obj : m9912(this)[i]) {
                C0083.m8026(consumer, obj);
            }
        }
        for (int i2 = 0; i2 < m9906(this); i2++) {
            C0083.m8026(consumer, m9908(this)[i2]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int iM9906 = m9906(this);
        Object[] objArrM9908 = m9908(this);
        if (iM9906 == objArrM9908.length) {
            if (m9912(this) == null) {
                Object[][] objArr = new Object[8][];
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = objArrM9908;
            }
            int iM9909 = m9909(this);
            int i = iM9909 + 1;
            Object[][] objArrM9912 = m9912(this);
            if (i >= objArrM9912.length || objArrM9912[i] == null) {
                if (iM9909 == 0) {
                    length = objArrM9908.length;
                } else {
                    length = ((long) objArrM9912[iM9909].length) + m9911(this)[iM9909];
                }
                m9913(this, length + 1);
            }
            this.b = 0;
            int iM99092 = m9909(this) + 1;
            this.c = iM99092;
            this.e = m9912(this)[iM99092];
        }
        Object[] objArrM99082 = m9908(this);
        int iM99062 = m9906(this);
        this.b = iM99062 + 1;
        objArrM99082[iM99062] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C0099.m10863(arrayList);
        m9910(this, new C0519a(10, arrayList));
        String strM8479 = C0087.m8479(arrayList);
        StringBuilder sb = new StringBuilder(C0098.m10856(m9904(), 0, 13, 1755));
        C0101.m11052(sb, strM8479);
        return C0099.m10924(sb);
    }

    @Override // java.lang.Iterable
    public j$.util.f0 spliterator() {
        return new Q2(this, 0, m9909(this), 0, m9906(this));
    }
}
