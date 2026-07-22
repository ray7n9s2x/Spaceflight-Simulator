package j$.util.concurrent;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.T;
import j$.util.c0;
import j$.util.f0;
import j$.util.stream.C0098;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class w implements T {
    long a;
    final long b;
    final double c;
    final double d;

    /* JADX INFO: renamed from: ۟۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static double m9022(Object obj, double d, double d2) {
        return C0079.m7512() >= 0 ? ((z) obj).d(d, d2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static long m9023(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((w) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static double m9024(Object obj) {
        return C0098.m10857() <= 0 ? ((w) obj).d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧ۟, reason: not valid java name and contains not printable characters */
    public static long m9025(Object obj) {
        if (C0098.m10857() < 0) {
            return ((w) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static w m9026(Object obj) {
        if (C0088.m8503() > 0) {
            return ((w) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۨ, reason: contains not printable characters */
    public static void m9027(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            ((w) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
    public static boolean m9028(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((w) obj).tryAdvance((DoubleConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static double m9029(Object obj) {
        return C0083.m8022() <= 0 ? ((w) obj).c : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 17728;
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

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9027(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m9028(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.T, j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ T trySplit() {
        return m9026(this);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return m9026(this);
    }

    @Override // j$.util.f0
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return m9026(this);
    }

    w(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    public final w a() {
        long jM9025 = m9025(this);
        long jM9023 = (m9023(this) + jM9025) >>> 1;
        if (jM9023 <= jM9025) {
            return null;
        }
        this.a = jM9023;
        return new w(jM9025, jM9023, m9029(this), m9024(this));
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m9023(this) - m9025(this);
    }

    @Override // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        C0092.m8727(doubleConsumer);
        long jM9025 = m9025(this);
        if (jM9025 >= m9023(this)) {
            return false;
        }
        C0090.m8634(doubleConsumer, m9022(C0101.m11046(), m9029(this), m9024(this)));
        this.a = jM9025 + 1;
        return true;
    }

    @Override // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0092.m8727(doubleConsumer);
        long jM9025 = m9025(this);
        long jM9023 = m9023(this);
        if (jM9025 < jM9023) {
            this.a = jM9023;
            z zVarM11046 = C0101.m11046();
            do {
                C0090.m8634(doubleConsumer, m9022(zVarM11046, m9029(this), m9024(this)));
                jM9025++;
            } while (jM9025 < jM9023);
        }
    }
}
