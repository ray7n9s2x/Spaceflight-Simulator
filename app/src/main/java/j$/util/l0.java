package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import j$.util.stream.C0098;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class l0 implements T {
    private final double[] a;
    private int b;
    private final int c;
    private final int d;

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9277(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((l0) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9278(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((l0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static T m9279(Object obj) {
        if (C0079.m7512() > 0) {
            return ((l0) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static double[] m9280(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((l0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9281(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            return ((l0) obj).tryAdvance((DoubleConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static void m9282(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            ((l0) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9283(Object obj) {
        if (C0093.m9101() > 0) {
            return ((l0) obj).c;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9282(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m9281(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return m9279(this);
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return m9279(this);
    }

    public l0(double[] dArr, int i, int i2, int i3) {
        this.a = dArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.T, j$.util.c0, j$.util.f0
    public final T trySplit() {
        int iM9278 = m9278(this);
        int iM9283 = (m9283(this) + iM9278) >>> 1;
        if (iM9278 >= iM9283) {
            return null;
        }
        this.b = iM9283;
        return new l0(m9280(this), iM9278, iM9283, m9277(this));
    }

    @Override // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int iM9278;
        C0092.m8727(doubleConsumer);
        double[] dArrM9280 = m9280(this);
        int length = dArrM9280.length;
        int iM9283 = m9283(this);
        if (length < iM9283 || (iM9278 = m9278(this)) < 0) {
            return;
        }
        this.b = iM9283;
        if (iM9278 < iM9283) {
            do {
                C0090.m8634(doubleConsumer, dArrM9280[iM9278]);
                iM9278++;
            } while (iM9278 < iM9283);
        }
    }

    @Override // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        C0092.m8727(doubleConsumer);
        int iM9278 = m9278(this);
        if (iM9278 < 0 || iM9278 >= m9283(this)) {
            return false;
        }
        this.b = iM9278 + 1;
        C0090.m8634(doubleConsumer, m9280(this)[iM9278]);
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9283(this) - m9278(this);
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return m9277(this);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        if (C0100.m10986(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
