package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C0601q1 implements J0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f545short = {2485, 2450, 2452, 2435, 2439, 2443, 2502, 2453, 2447, 2460, 2435, 2502, 2435, 2462, 2437, 2435, 2435, 2434, 2453, 2502, 2443, 2439, 2462, 2502, 2439, 2452, 2452, 2439, 2463, 2502, 2453, 2447, 2460, 2435, 1600, 1635, 1634, 1643, 1613, 1662, 1662, 1645, 1653, 1602, 1635, 1640, 1641, 1623, 1577, 1640, 1617, 1623, 1577, 1663, 1617};
    final long[] a;
    int b;

    /* JADX INFO: renamed from: ۟ۢۡۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m10442() {
        if (C0093.m9101() > 0) {
            return f545short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۡ, reason: not valid java name and contains not printable characters */
    public static long[] m10443(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0601q1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m10444(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((C0601q1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static K0 m10445(Object obj, int i) {
        if (C0084.m8116() > 0) {
            return ((C0601q1) obj).b(i);
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0082.m7995(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9178(this, j, j2);
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
        m10445(this, i);
        throw null;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0106.m11357(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < m10444(this); i++) {
            C0088.m8521(longConsumer, m10443(this)[i]);
        }
    }

    @Override // j$.util.stream.K0
    public final void r(int i, Object obj) {
        int iM10444 = m10444(this);
        C0080.m7558(m10443(this), 0, (long[]) obj, i, iM10444);
    }

    C0601q1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0100.m10962(m10442(), 0, 34, 2534));
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    C0601q1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return C0085.m8235(m10443(this), 0, m10444(this));
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0085.m8235(m10443(this), 0, m10444(this));
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        long[] jArrM10443 = m10443(this);
        int length = jArrM10443.length;
        int iM10444 = m10444(this);
        return length == iM10444 ? jArrM10443 : C0096.m10759(jArrM10443, iM10444);
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return m10444(this);
    }

    public String toString() {
        long[] jArrM10443 = m10443(this);
        return C0086.m8314(C0079.m7503(m10442(), 34, 21, 1548), new Object[]{C0102.m11105(jArrM10443.length - m10444(this)), C0106.m11353(jArrM10443)});
    }
}
