package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
abstract class D3 extends G3 implements j$.util.c0 {
    /* JADX INFO: renamed from: ۟۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static void m9377(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            ((D3) obj).e(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m9378(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            ((D3) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static F3 m9379(Object obj) {
        if (C0092.m8724() < 0) {
            return ((G3) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static F3 m9380() {
        if (C0097.m10823() >= 0) {
            return F3.MAYBE_MORE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9381(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((D3) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟۟, reason: not valid java name and contains not printable characters */
    public static long m9382(Object obj, long j) {
        if (C0085.m8230() >= 0) {
            return ((G3) obj).b(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static F3 m9383() {
        if (C0095.m9210() >= 0) {
            return F3.NO_MORE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9384(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((G3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦ۟, reason: contains not printable characters */
    public static int m9385(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((G3) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m9386(Object obj, Object obj2, long j) {
        if (C0098.m10857() < 0) {
            ((AbstractC0573k3) obj).b(obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0573k3 m9387(Object obj, int i) {
        if (C0095.m9210() >= 0) {
            return ((D3) obj).h(i);
        }
        return null;
    }

    protected abstract void e(Object obj);

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    protected abstract AbstractC0573k3 h(int i);

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(Object obj) {
        C0099.m10863(obj);
        while (m9379(this) != m9383() && C0083.m8061((j$.util.c0) m9384(this), this)) {
            if (m9382(this, 1L) == 1) {
                m9377(this, obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(Object obj) {
        C0099.m10863(obj);
        AbstractC0573k3 abstractC0573k3M9387 = null;
        while (true) {
            F3 f3M9379 = m9379(this);
            if (f3M9379 == m9383()) {
                return;
            }
            F3 f3M9380 = m9380();
            j$.util.f0 f0VarM9384 = m9384(this);
            if (f3M9379 == f3M9380) {
                int iM9385 = m9385(this);
                if (abstractC0573k3M9387 == null) {
                    abstractC0573k3M9387 = m9387(this, iM9385);
                } else {
                    abstractC0573k3M9387.b = 0;
                }
                long j = 0;
                while (C0083.m8061((j$.util.c0) f0VarM9384, abstractC0573k3M9387)) {
                    j++;
                    if (j >= iM9385) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    m9386(abstractC0573k3M9387, obj, m9382(this, j));
                }
            } else {
                C0080.m7577((j$.util.c0) f0VarM9384, obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m9378(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m9381(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        m9378(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return m9381(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        m9378(this, doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return m9381(this, doubleConsumer);
    }
}
