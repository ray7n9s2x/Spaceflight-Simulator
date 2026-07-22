package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C0556h1 implements H0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f540short = {421, 386, 388, 403, 407, 411, 470, 389, 415, 396, 403, 470, 403, 398, 405, 403, 403, 402, 389, 470, 411, 407, 398, 470, 407, 388, 388, 407, 399, 470, 389, 415, 396, 403, 2602, 2573, 2583, 2594, 2577, 2577, 2562, 2586, 2605, 2572, 2567, 2566, 2616, 2630, 2567, 2622, 2616, 2630, 2576, 2622};
    final int[] a;
    int b;

    /* JADX INFO: renamed from: ۟ۤۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m10181(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((C0556h1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m10182() {
        if (C0104.m11196() >= 0) {
            return f540short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static K0 m10183(Object obj, int i) {
        if (C0106.m11345() < 0) {
            return ((C0556h1) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m10184(Object obj) {
        if (C0085.m8230() > 0) {
            return ((C0556h1) obj).a;
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0102.m11063(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9205(this, j, j2);
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
        m10183(this, i);
        throw null;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7856(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < m10181(this); i++) {
            C0105.m11259(intConsumer, m10184(this)[i]);
        }
    }

    @Override // j$.util.stream.K0
    public final void r(int i, Object obj) {
        int iM10181 = m10181(this);
        C0080.m7558(m10184(this), 0, (int[]) obj, i, iM10181);
    }

    C0556h1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0093.m9062(m10182(), 0, 34, 502));
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    C0556h1(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return C0100.m10980(m10184(this), 0, m10181(this));
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0100.m10980(m10184(this), 0, m10181(this));
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        int[] iArrM10184 = m10184(this);
        int length = iArrM10184.length;
        int iM10181 = m10181(this);
        return length == iM10181 ? iArrM10184 : C0099.m10871(iArrM10184, iM10181);
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return m10181(this);
    }

    public String toString() {
        int[] iArrM10184 = m10184(this);
        return C0086.m8314(C0096.m10776(m10182(), 34, 20, 2659), new Object[]{C0102.m11105(iArrM10184.length - m10181(this)), C0091.m8665(iArrM10184)});
    }
}
