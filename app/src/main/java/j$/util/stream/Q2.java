package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import java.io.C0104;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class Q2 implements j$.util.f0 {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final /* synthetic */ Z2 f;

    /* JADX INFO: renamed from: ۟۟ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m9665(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((Q2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static Z2 m9666(Object obj) {
        if (C0090.m8624() > 0) {
            return ((Q2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m9667(Object obj) {
        if (C0096.m10782() > 0) {
            return ((Z2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m9668(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((Q2) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m9669(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((Q2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9670(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((Q2) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9671(Object obj) {
        if (C0098.m10857() < 0) {
            return ((Q2) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static long[] m9672(Object obj) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧ, reason: contains not printable characters */
    public static Object[][] m9673(Object obj) {
        if (C0084.m8116() > 0) {
            return ((Z2) obj).f;
        }
        return null;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    Q2(Z2 z2, int i, int i2, int i3, int i4) {
        this.f = z2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArrM9673 = m9673(z2);
        this.e = objArrM9673 == null ? m9667(z2) : objArrM9673[i];
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        int iM9669 = m9669(this);
        int iM9670 = m9670(this);
        int iM9671 = m9671(this);
        if (iM9669 == iM9671) {
            return ((long) iM9670) - ((long) m9668(this));
        }
        long[] jArrM9672 = m9672(m9666(this));
        return ((jArrM9672[iM9671] + ((long) iM9670)) - jArrM9672[iM9669]) - ((long) m9668(this));
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0099.m10863(consumer);
        int iM9669 = m9669(this);
        int iM9671 = m9671(this);
        if (iM9669 >= iM9671 && (iM9669 != iM9671 || m9668(this) >= m9670(this))) {
            return false;
        }
        Object[] objArrM9665 = m9665(this);
        int iM9668 = m9668(this);
        this.c = iM9668 + 1;
        C0083.m8026(consumer, objArrM9665[iM9668]);
        if (m9668(this) == m9665(this).length) {
            this.c = 0;
            int iM96692 = m9669(this) + 1;
            this.a = iM96692;
            Object[][] objArrM9673 = m9673(m9666(this));
            if (objArrM9673 != null && iM96692 <= iM9671) {
                this.e = objArrM9673[iM96692];
            }
        }
        return true;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        Z2 z2M9666;
        C0099.m10863(consumer);
        int iM9669 = m9669(this);
        int iM9670 = m9670(this);
        int iM9671 = m9671(this);
        if (iM9669 < iM9671 || (iM9669 == iM9671 && m9668(this) < iM9670)) {
            int iM9668 = m9668(this);
            while (true) {
                z2M9666 = m9666(this);
                if (iM9669 >= iM9671) {
                    break;
                }
                Object[] objArr = m9673(z2M9666)[iM9669];
                while (iM9668 < objArr.length) {
                    C0083.m8026(consumer, objArr[iM9668]);
                    iM9668++;
                }
                iM9669++;
                iM9668 = 0;
            }
            Object[] objArrM9665 = m9669(this) == iM9671 ? m9665(this) : m9673(z2M9666)[iM9671];
            while (iM9668 < iM9670) {
                C0083.m8026(consumer, objArrM9665[iM9668]);
                iM9668++;
            }
            this.a = iM9671;
            this.c = iM9670;
        }
    }

    @Override // j$.util.f0
    public final j$.util.f0 trySplit() {
        int iM9669 = m9669(this);
        int iM9671 = m9671(this);
        if (iM9669 < iM9671) {
            int i = iM9671 - 1;
            int iM9668 = m9668(this);
            Z2 z2M9666 = m9666(this);
            Q2 q2 = new Q2(z2M9666, iM9669, i, iM9668, m9673(z2M9666)[i].length);
            this.a = iM9671;
            this.c = 0;
            this.e = m9673(z2M9666)[iM9671];
            return q2;
        }
        if (iM9669 != iM9671) {
            return null;
        }
        int iM96682 = m9668(this);
        int iM9670 = (m9670(this) - iM96682) / 2;
        if (iM9670 == 0) {
            return null;
        }
        j$.util.f0 f0VarM11295 = C0105.m11295(m9665(this), iM96682, iM96682 + iM9670);
        this.c = m9668(this) + iM9670;
        return f0VarM11295;
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
