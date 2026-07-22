package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
class O0 implements L0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f514short = {971, 1004, 1002, 1021, 1017, 1013, 952, 1003, 1009, 994, 1021, 952, 1021, 992, 1019, 1021, 1021, 1020, 1003, 952, 1013, 1017, 992, 952, 1017, 1002, 1002, 1017, 993, 952, 1003, 1009, 994, 1021, 1871, 1916, 1916, 1903, 1911, 1856, 1889, 1898, 1899, 1877, 1835, 1898, 1875, 1877, 1835, 1917, 1875};
    final Object[] a;
    int b;

    /* JADX INFO: renamed from: ۟۠ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static int m9609(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((O0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m9610() {
        if (C0099.m10878() <= 0) {
            return f514short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۥ, reason: contains not printable characters */
    public static Object[] m9611(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((O0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۨ, reason: contains not printable characters */
    public static L0 m9612(Object obj, long j, long j2, Object obj2) {
        if (C0091.m8708() > 0) {
            return AbstractC0644z0.w((L0) obj, j, j2, (IntFunction) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return m9612(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    O0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0083.m8037(m9610(), 0, 34, 920));
        }
        this.a = (Object[]) C0095.m9220(intFunction, (int) j);
        this.b = 0;
    }

    O0(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0105.m11295(m9611(this), 0, m9609(this));
    }

    @Override // j$.util.stream.L0
    public final void i(Object[] objArr, int i) {
        C0080.m7558(m9611(this), 0, objArr, i, m9609(this));
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArrM9611 = m9611(this);
        if (objArrM9611.length == m9609(this)) {
            return objArrM9611;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return m9609(this);
    }

    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < m9609(this); i++) {
            C0083.m8026(consumer, m9611(this)[i]);
        }
    }

    public String toString() {
        Object[] objArrM9611 = m9611(this);
        return C0086.m8314(C0091.m8679(m9610(), 34, 17, 1806), new Object[]{C0102.m11105(objArrM9611.length - m9609(this)), C0094.m9135(objArrM9611)});
    }
}
