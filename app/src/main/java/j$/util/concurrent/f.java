package j$.util.concurrent;

import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.f0;
import j$.util.stream.C0099;
import java.util.Comparator;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class f extends p implements f0 {
    final ConcurrentHashMap i;
    long j;

    /* JADX INFO: renamed from: ۟۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m8908(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m8909(Object obj) {
        if (C0106.m11345() < 0) {
            return ((p) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8910(Object obj) {
        if (C0099.m10878() < 0) {
            return ((f) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ۟, reason: not valid java name and contains not printable characters */
    public static l[] m8911(Object obj) {
        if (C0087.m8458() < 0) {
            return ((p) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۨ, reason: not valid java name and contains not printable characters */
    public static int m8912(Object obj) {
        if (C0081.m7818() < 0) {
            return ((p) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۤۢ, reason: not valid java name and contains not printable characters */
    public static long m8913(Object obj) {
        if (C0092.m8724() < 0) {
            return ((f) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m8914(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۨ, reason: contains not printable characters */
    public static l m8915(Object obj) {
        if (C0084.m8116() > 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۢ, reason: contains not printable characters */
    public static int m8916(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((p) obj).f;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 4353;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    f(l[] lVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.f0
    public final f0 trySplit() {
        int iM8916 = m8916(this);
        int iM8912 = m8912(this);
        int i = (iM8916 + iM8912) >>> 1;
        if (i <= iM8916) {
            return null;
        }
        l[] lVarArrM8911 = m8911(this);
        this.g = i;
        long jM8913 = m8913(this) >>> 1;
        this.j = jM8913;
        return new f(lVarArrM8911, m8909(this), i, iM8912, jM8913, m8910(this));
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0092.m8727(consumer);
        while (true) {
            l lVarM8915 = m8915(this);
            if (lVarM8915 == null) {
                return;
            } else {
                C0083.m8026(consumer, new k(m8908(lVarM8915), m8914(lVarM8915), m8910(this)));
            }
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0092.m8727(consumer);
        l lVarM8915 = m8915(this);
        if (lVarM8915 == null) {
            return false;
        }
        C0083.m8026(consumer, new k(m8908(lVarM8915), m8914(lVarM8915), m8910(this)));
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m8913(this);
    }
}
