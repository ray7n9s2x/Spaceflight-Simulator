package j$.util;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class q0 implements W {
    private final int[] a;
    private int b;
    private final int c;
    private final int d;

    /* JADX INFO: renamed from: ۟ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9294(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((q0) obj).tryAdvance((IntConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m9295(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            ((q0) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۦ, reason: not valid java name and contains not printable characters */
    public static int[] m9296(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((q0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static W m9297(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((q0) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m9298(Object obj) {
        if (C0083.m8022() < 0) {
            return ((q0) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m9299(Object obj) {
        if (C0096.m10782() > 0) {
            return ((q0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9300(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((q0) obj).d;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
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
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9295(this, (IntConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m9294(this, (IntConsumer) obj);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return m9297(this);
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return m9297(this);
    }

    public q0(int[] iArr, int i, int i2, int i3) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.W, j$.util.c0, j$.util.f0
    public final W trySplit() {
        int iM9299 = m9299(this);
        int iM9298 = (m9298(this) + iM9299) >>> 1;
        if (iM9299 >= iM9298) {
            return null;
        }
        this.b = iM9298;
        return new q0(m9296(this), iM9299, iM9298, m9300(this));
    }

    @Override // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer) {
        int iM9299;
        C0092.m8727(intConsumer);
        int[] iArrM9296 = m9296(this);
        int length = iArrM9296.length;
        int iM9298 = m9298(this);
        if (length < iM9298 || (iM9299 = m9299(this)) < 0) {
            return;
        }
        this.b = iM9298;
        if (iM9299 < iM9298) {
            do {
                C0105.m11259(intConsumer, iArrM9296[iM9299]);
                iM9299++;
            } while (iM9299 < iM9298);
        }
    }

    @Override // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C0092.m8727(intConsumer);
        int iM9299 = m9299(this);
        if (iM9299 < 0 || iM9299 >= m9298(this)) {
            return false;
        }
        this.b = iM9299 + 1;
        C0105.m11259(intConsumer, m9296(this)[iM9299]);
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9298(this) - m9299(this);
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return m9300(this);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        if (C0100.m10986(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
