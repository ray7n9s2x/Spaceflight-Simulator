package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
abstract class X2 implements j$.util.c0 {
    int a;
    final int b;
    int c;
    final int d;
    Object e;
    final /* synthetic */ Y2 f;

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9840(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((X2) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.c0 m9841(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((X2) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m9842(Object obj) {
        if (C0095.m9210() > 0) {
            return ((X2) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m9843(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((X2) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.c0 m9844(Object obj, int i, int i2, int i3, int i4) {
        if (C0098.m10857() < 0) {
            return ((X2) obj).c(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m9845(Object obj) {
        if (C0099.m10878() < 0) {
            return ((X2) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m9846(Object obj) {
        if (C0081.m7818() < 0) {
            return ((Y2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m9847(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((X2) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m9848(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0104.m11196() > 0) {
            ((Y2) obj).s(obj2, i, i2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static long[] m9849(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m9850(Object obj, int i, Object obj2, Object obj3) {
        if (C0100.m10983() > 0) {
            ((X2) obj).a(i, obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m9851(Object obj) {
        if (C0099.m10878() < 0) {
            return ((X2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢۢ, reason: not valid java name and contains not printable characters */
    public static Y2 m9852(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((X2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۨ, reason: contains not printable characters */
    public static j$.util.c0 m9853(Object obj, Object obj2, int i, int i2) {
        if (C0082.m7983() <= 0) {
            return ((X2) obj).b(obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۤ, reason: contains not printable characters */
    public static Object m9854(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static void m9855(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            ((X2) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m9856(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((Y2) obj).t(obj2);
        }
        return 0;
    }

    abstract void a(int i, Object obj, Object obj2);

    abstract j$.util.c0 b(Object obj, int i, int i2);

    abstract j$.util.c0 c(int i, int i2, int i3, int i4);

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

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return m9841(this);
    }

    X2(Y2 y2, int i, int i2, int i3, int i4) {
        this.f = y2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArrM9846 = m9846(y2);
        this.e = objArrM9846 == null ? m9854(y2) : objArrM9846[i];
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        int iM9843 = m9843(this);
        int iM9842 = m9842(this);
        int iM9840 = m9840(this);
        if (iM9843 == iM9840) {
            return ((long) iM9842) - ((long) m9845(this));
        }
        long[] jArrM9849 = m9849(m9852(this));
        return ((jArrM9849[iM9840] + ((long) iM9842)) - jArrM9849[iM9843]) - ((long) m9845(this));
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(Object obj) {
        C0099.m10863(obj);
        int iM9843 = m9843(this);
        int iM9840 = m9840(this);
        if (iM9843 >= iM9840 && (iM9843 != iM9840 || m9845(this) >= m9842(this))) {
            return false;
        }
        Object objM9851 = m9851(this);
        int iM9845 = m9845(this);
        this.c = iM9845 + 1;
        m9850(this, iM9845, objM9851, obj);
        int iM98452 = m9845(this);
        Object objM98512 = m9851(this);
        Y2 y2M9852 = m9852(this);
        if (iM98452 == m9856(y2M9852, objM98512)) {
            this.c = 0;
            int iM98432 = m9843(this) + 1;
            this.a = iM98432;
            Object[] objArrM9846 = m9846(y2M9852);
            if (objArrM9846 != null && iM98432 <= iM9840) {
                this.e = objArrM9846[iM98432];
            }
        }
        return true;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(Object obj) {
        Y2 y2M9852;
        C0099.m10863(obj);
        int iM9843 = m9843(this);
        int iM9842 = m9842(this);
        int iM9840 = m9840(this);
        if (iM9843 < iM9840 || (iM9843 == iM9840 && m9845(this) < iM9842)) {
            int iM9845 = m9845(this);
            while (true) {
                y2M9852 = m9852(this);
                if (iM9843 >= iM9840) {
                    break;
                }
                Object obj2 = m9846(y2M9852)[iM9843];
                m9848(y2M9852, obj2, iM9845, m9856(y2M9852, obj2), obj);
                iM9843++;
                iM9845 = 0;
            }
            m9848(y2M9852, m9843(this) == iM9840 ? m9851(this) : m9846(y2M9852)[iM9840], iM9845, iM9842, obj);
            this.a = iM9840;
            this.c = iM9842;
        }
    }

    @Override // j$.util.c0, j$.util.f0
    public final j$.util.c0 trySplit() {
        int iM9843 = m9843(this);
        int iM9840 = m9840(this);
        if (iM9843 < iM9840) {
            int i = iM9840 - 1;
            int iM9845 = m9845(this);
            Y2 y2M9852 = m9852(this);
            j$.util.c0 c0VarM9844 = m9844(this, iM9843, i, iM9845, m9856(y2M9852, m9846(y2M9852)[i]));
            this.a = iM9840;
            this.c = 0;
            this.e = m9846(y2M9852)[iM9840];
            return c0VarM9844;
        }
        if (iM9843 != iM9840) {
            return null;
        }
        int iM98452 = m9845(this);
        int iM9842 = (m9842(this) - iM98452) / 2;
        if (iM9842 == 0) {
            return null;
        }
        j$.util.c0 c0VarM9853 = m9853(this, m9851(this), iM98452, iM9842);
        this.c = m9845(this) + iM9842;
        return c0VarM9853;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m9855(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m9847(this, intConsumer);
    }

    @Override // j$.util.c0, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) m9841(this);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        m9855(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return m9847(this, longConsumer);
    }

    @Override // j$.util.c0, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) m9841(this);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        m9855(this, doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return m9847(this, doubleConsumer);
    }

    @Override // j$.util.c0, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) m9841(this);
    }
}
