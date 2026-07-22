package j$.util;

import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import java.io.C0103;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class k0 implements f0 {
    private final Object[] a;
    private int b;
    private final int c;
    private final int d;

    /* JADX INFO: renamed from: ۟۠ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m9272(Object obj) {
        if (C0085.m8230() > 0) {
            return ((k0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9273(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((k0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m9274(Object obj) {
        if (C0098.m10857() < 0) {
            return ((k0) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m9275(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((k0) obj).c;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    public k0(Object[] objArr, int i, int i2, int i3) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.f0
    public final f0 trySplit() {
        int iM9273 = m9273(this);
        int iM9275 = (m9275(this) + iM9273) >>> 1;
        if (iM9273 >= iM9275) {
            return null;
        }
        this.b = iM9275;
        return new k0(m9272(this), iM9273, iM9275, m9274(this));
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        int iM9273;
        C0092.m8727(consumer);
        Object[] objArrM9272 = m9272(this);
        int length = objArrM9272.length;
        int iM9275 = m9275(this);
        if (length < iM9275 || (iM9273 = m9273(this)) < 0) {
            return;
        }
        this.b = iM9275;
        if (iM9273 < iM9275) {
            do {
                C0083.m8026(consumer, objArrM9272[iM9273]);
                iM9273++;
            } while (iM9273 < iM9275);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0092.m8727(consumer);
        int iM9273 = m9273(this);
        if (iM9273 < 0 || iM9273 >= m9275(this)) {
            return false;
        }
        this.b = iM9273 + 1;
        C0083.m8026(consumer, m9272(this)[iM9273]);
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9275(this) - m9273(this);
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return m9274(this);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        if (C0100.m10986(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
