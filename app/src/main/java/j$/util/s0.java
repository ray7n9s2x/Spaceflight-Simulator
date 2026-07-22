package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class s0 implements Z {
    private final long[] a;
    private int b;
    private final int c;
    private final int d;

    /* JADX INFO: renamed from: ۟۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9308(Object obj) {
        if (C0083.m8022() < 0) {
            return ((s0) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m9309(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((s0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m9310(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((s0) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static void m9311(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            ((s0) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9312(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((s0) obj).tryAdvance((LongConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static long[] m9313(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((s0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Z m9314(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((s0) obj).trySplit();
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
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
        return C0084.m8102(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9311(this, (LongConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m9312(this, (LongConsumer) obj);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return m9314(this);
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return m9314(this);
    }

    public s0(long[] jArr, int i, int i2, int i3) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.Z, j$.util.c0, j$.util.f0
    public final Z trySplit() {
        int iM9309 = m9309(this);
        int iM9310 = (m9310(this) + iM9309) >>> 1;
        if (iM9309 >= iM9310) {
            return null;
        }
        this.b = iM9310;
        return new s0(m9313(this), iM9309, iM9310, m9308(this));
    }

    @Override // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer) {
        int iM9309;
        C0092.m8727(longConsumer);
        long[] jArrM9313 = m9313(this);
        int length = jArrM9313.length;
        int iM9310 = m9310(this);
        if (length < iM9310 || (iM9309 = m9309(this)) < 0) {
            return;
        }
        this.b = iM9310;
        if (iM9309 < iM9310) {
            do {
                C0088.m8521(longConsumer, jArrM9313[iM9309]);
                iM9309++;
            } while (iM9309 < iM9310);
        }
    }

    @Override // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer) {
        C0092.m8727(longConsumer);
        int iM9309 = m9309(this);
        if (iM9309 < 0 || iM9309 >= m9310(this)) {
            return false;
        }
        this.b = iM9309 + 1;
        C0088.m8521(longConsumer, m9313(this)[iM9309]);
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9310(this) - m9309(this);
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return m9308(this);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        if (C0100.m10986(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
