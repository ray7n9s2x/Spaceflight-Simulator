package j$.util.concurrent;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.W;
import j$.util.c0;
import j$.util.f0;
import java.io.C0104;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class x implements W {
    long a;
    final long b;
    final int c;
    final int d;

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m9030(Object obj) {
        if (C0106.m11345() < 0) {
            return ((x) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int m9031(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((x) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9032(Object obj) {
        if (C0104.m11196() > 0) {
            return ((x) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9033(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            ((x) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static long m9034(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((x) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m9035(Object obj, int i, int i2) {
        if (C0082.m7983() < 0) {
            return ((z) obj).e(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9036(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((x) obj).tryAdvance((IntConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۡۨ, reason: contains not printable characters */
    public static x m9037(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((x) obj).a();
        }
        return null;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 17728;
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

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9033(this, (IntConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m9036(this, (IntConsumer) obj);
    }

    @Override // j$.util.W, j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ W trySplit() {
        return m9037(this);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return m9037(this);
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return m9037(this);
    }

    x(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public final x a() {
        long jM9034 = m9034(this);
        long jM9030 = (m9030(this) + jM9034) >>> 1;
        if (jM9030 <= jM9034) {
            return null;
        }
        this.a = jM9030;
        return new x(jM9034, jM9030, m9032(this), m9031(this));
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9030(this) - m9034(this);
    }

    @Override // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C0092.m8727(intConsumer);
        long jM9034 = m9034(this);
        if (jM9034 >= m9030(this)) {
            return false;
        }
        C0105.m11259(intConsumer, m9035(C0101.m11046(), m9032(this), m9031(this)));
        this.a = jM9034 + 1;
        return true;
    }

    @Override // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer) {
        C0092.m8727(intConsumer);
        long jM9034 = m9034(this);
        long jM9030 = m9030(this);
        if (jM9034 < jM9030) {
            this.a = jM9030;
            z zVarM11046 = C0101.m11046();
            do {
                C0105.m11259(intConsumer, m9035(zVarM11046, m9032(this), m9031(this)));
                jM9034++;
            } while (jM9034 < jM9030);
        }
    }
}
