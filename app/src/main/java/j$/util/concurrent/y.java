package j$.util.concurrent;

import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.Z;
import j$.util.c0;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class y implements Z {
    long a;
    final long b;
    final long c;
    final long d;

    /* JADX INFO: renamed from: ۟۟ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static long m9038(Object obj) {
        if (C0094.m9148() > 0) {
            return ((y) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m9039(Object obj, long j, long j2) {
        if (C0106.m11345() < 0) {
            return ((z) obj).f(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m9040(Object obj) {
        if (C0102.m11109() < 0) {
            return ((y) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m9041(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((y) obj).tryAdvance((LongConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static y m9042(Object obj) {
        if (C0105.m11264() > 0) {
            return ((y) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9043(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            ((y) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۤۦۥ, reason: not valid java name and contains not printable characters */
    public static long m9044(Object obj) {
        if (C0096.m10782() > 0) {
            return ((y) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۢۧ, reason: not valid java name and contains not printable characters */
    public static long m9045(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((y) obj).c;
        }
        return 0L;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 17728;
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

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9043(this, (LongConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m9041(this, (LongConsumer) obj);
    }

    @Override // j$.util.Z, j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ Z trySplit() {
        return m9042(this);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return m9042(this);
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return m9042(this);
    }

    y(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final y a() {
        long jM9040 = m9040(this);
        long jM9038 = (m9038(this) + jM9040) >>> 1;
        if (jM9038 <= jM9040) {
            return null;
        }
        this.a = jM9038;
        return new y(jM9040, jM9038, m9045(this), m9044(this));
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9038(this) - m9040(this);
    }

    @Override // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer) {
        C0092.m8727(longConsumer);
        long jM9040 = m9040(this);
        if (jM9040 >= m9038(this)) {
            return false;
        }
        C0088.m8521(longConsumer, m9039(C0101.m11046(), m9045(this), m9044(this)));
        this.a = jM9040 + 1;
        return true;
    }

    @Override // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer) {
        C0092.m8727(longConsumer);
        long jM9040 = m9040(this);
        long jM9038 = m9038(this);
        if (jM9040 < jM9038) {
            this.a = jM9038;
            z zVarM11046 = C0101.m11046();
            do {
                C0088.m8521(longConsumer, m9039(zVarM11046, m9045(this), m9044(this)));
                jM9040++;
            } while (jM9040 < jM9038);
        }
    }
}
