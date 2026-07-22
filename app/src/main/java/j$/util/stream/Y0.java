package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
class Y0 implements F0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f524short = {2268, 2299, 2301, 2282, 2286, 2274, 2223, 2300, 2278, 2293, 2282, 2223, 2282, 2295, 2284, 2282, 2282, 2283, 2300, 2223, 2274, 2286, 2295, 2223, 2286, 2301, 2301, 2286, 2294, 2223, 2300, 2278, 2293, 2282, 480, 459, 465, 454, 456, 449, 485, 470, 470, 453, 477, 490, 459, 448, 449, 511, 385, 448, 505, 511, 385, 471, 505};
    final double[] a;
    int b;

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m9865(Object obj) {
        if (C0082.m7983() < 0) {
            return ((Y0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡ۠, reason: not valid java name and contains not printable characters */
    public static double[] m9866(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((Y0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static K0 m9867(Object obj, int i) {
        if (C0091.m8708() > 0) {
            return ((Y0) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۨۥ, reason: contains not printable characters */
    public static short[] m9868() {
        if (C0106.m11345() < 0) {
            return f524short;
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0092.m8722(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0094.m9113(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0091.m8663(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        m9867(this, i);
        throw null;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7836(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < m9865(this); i++) {
            C0090.m8634(doubleConsumer, m9866(this)[i]);
        }
    }

    @Override // j$.util.stream.K0
    public final void r(int i, Object obj) {
        int iM9865 = m9865(this);
        C0080.m7558(m9866(this), 0, (double[]) obj, i, iM9865);
    }

    Y0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0080.m7573(m9868(), 0, 34, 2191));
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    Y0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return C0080.m7537(m9866(this), 0, m9865(this));
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0080.m7537(m9866(this), 0, m9865(this));
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        double[] dArrM9866 = m9866(this);
        int length = dArrM9866.length;
        int iM9865 = m9865(this);
        return length == iM9865 ? dArrM9866 : C0090.m8638(dArrM9866, iM9865);
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return m9865(this);
    }

    public String toString() {
        double[] dArrM9866 = m9866(this);
        return C0086.m8314(C0101.m11060(m9868(), 34, 23, 420), new Object[]{C0102.m11105(dArrM9866.length - m9865(this)), C0089.m8574(dArrM9866)});
    }
}
