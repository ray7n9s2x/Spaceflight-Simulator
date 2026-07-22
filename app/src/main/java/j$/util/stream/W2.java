package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import java.io.C0104;
import java.util.Iterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
class W2 extends Y2 implements LongConsumer {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f522short = {1869, 1798, 1867, 1814, 1877, 1879, 1882, 1882, 1887, 1880, 1873, 1814, 1893, 1862, 1887, 1880, 1875, 1874, 1908, 1859, 1872, 1872, 1875, 1860, 1816, 1913, 1872, 1914, 1881, 1880, 1873, 1816, 1872, 1881, 1860, 1907, 1879, 1877, 1886, 1822, 1909, 1881, 1880, 1861, 1859, 1883, 1875, 1860, 1823, 2638, 2584, 2608, 2567, 2574, 2565, 2572, 2591, 2563, 2646, 2638, 2575, 2631, 2635, 2568, 2563, 2590, 2565, 2560, 2584, 2646, 2638, 2575, 2614, 2638, 2584, 543, 585, 609, 598, 607, 596, 605, 590, 594, 519, 543, 606, 534, 538, 601, 594, 591, 596, 593, 585, 519, 543, 606, 615, 543, 585, 532, 532, 532};

    /* JADX INFO: renamed from: ۟۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m9809(Object obj) {
        if (C0105.m11264() > 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9810() {
        if (C0091.m8708() >= 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m9811(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m9812(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m9813(Object obj) {
        if (C0089.m8594() < 0) {
            return ((Y2) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m9814(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            ((Y2) obj).e(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9815() {
        if (C0099.m10878() < 0) {
            return f522short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m9816(Object obj) {
        if (C0101.m11044() < 0) {
            ((Y2) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۥۤۤ۟, reason: contains not printable characters */
    public static j$.util.Z m9817(Object obj) {
        if (C0085.m8230() > 0) {
            return ((W2) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m9818(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.Y2
    protected final void s(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        for (int i3 = i; i3 < i2; i3++) {
            C0088.m8521(longConsumer, jArr[i3]);
        }
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    public /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return m9817(this);
    }

    @Override // j$.util.stream.Y2
    protected final int t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            m9814(this, (LongConsumer) consumer);
        } else {
            if (m9810()) {
                m9818(C0092.m8727(this), C0094.m9107(m9815(), 0, 49, 1846));
                throw null;
            }
            C0088.m8544((V2) m9817(this), consumer);
        }
    }

    @Override // j$.util.stream.Y2
    protected final Object[] w() {
        return new long[8][];
    }

    @Override // j$.util.stream.Y2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        m9816(this);
        long[] jArr = (long[]) m9809(this);
        int iM9812 = m9812(this);
        this.b = iM9812 + 1;
        jArr[iM9812] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0088.m8538(m9817(this));
    }

    public j$.util.Z y() {
        return new V2(this, 0, m9811(this), 0, m9812(this));
    }

    public final String toString() {
        long[] jArr = (long[]) m9813(this);
        if (jArr.length < 200) {
            return C0086.m8314(C0091.m8679(m9815(), 49, 26, 2667), new Object[]{C0084.m8109(C0092.m8727(this)), C0102.m11105(jArr.length), C0102.m11105(m9811(this)), C0106.m11353(jArr)});
        }
        return C0086.m8314(C0094.m9107(m9815(), 75, 29, 570), new Object[]{C0084.m8109(C0092.m8727(this)), C0102.m11105(jArr.length), C0102.m11105(m9811(this)), C0106.m11353(C0096.m10759(jArr, 200))});
    }
}
