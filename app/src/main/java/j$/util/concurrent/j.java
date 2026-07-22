package j$.util.concurrent;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.f0;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class j extends p implements f0 {
    public final /* synthetic */ int i;
    long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i, int i2, int i3, long j, int i4) {
        super(lVarArr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m8940(Object obj) {
        if (C0105.m11264() > 0) {
            return ((p) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8941(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((p) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۧ, reason: not valid java name and contains not printable characters */
    public static long m8942(Object obj) {
        if (C0100.m10983() > 0) {
            return ((j) obj).j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m8943(Object obj) {
        if (C0096.m10782() > 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static l[] m8944(Object obj) {
        if (C0080.m7553() > 0) {
            return ((p) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ۠, reason: not valid java name and contains not printable characters */
    public static l m8945(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m8946(Object obj) {
        if (C0097.m10823() > 0) {
            return ((p) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m8947(Object obj) {
        if (C0084.m8116() > 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8948(Object obj) {
        if (C0089.m8594() < 0) {
            return ((j) obj).i;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        switch (m8948(this)) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (m8948(this)) {
        }
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (m8948(this)) {
        }
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        switch (m8948(this)) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.f0
    public final f0 trySplit() {
        switch (m8948(this)) {
            case 0:
                int iM8940 = m8940(this);
                int iM8941 = m8941(this);
                int i = (iM8940 + iM8941) >>> 1;
                if (i <= iM8940) {
                    return null;
                }
                l[] lVarArrM8944 = m8944((Object) this);
                this.g = i;
                long jM8942 = m8942(this) >>> 1;
                this.j = jM8942;
                return new j(lVarArrM8944, m8946(this), i, iM8941, jM8942, 0);
            default:
                int iM89402 = m8940(this);
                int iM89412 = m8941(this);
                int i2 = (iM89402 + iM89412) >>> 1;
                if (i2 <= iM89402) {
                    return null;
                }
                l[] lVarArrM89442 = m8944((Object) this);
                this.g = i2;
                long jM89422 = m8942(this) >>> 1;
                this.j = jM89422;
                return new j(lVarArrM89442, m8946(this), i2, iM89412, jM89422, 1);
        }
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        switch (m8948(this)) {
            case 0:
                C0092.m8727(consumer);
                while (true) {
                    l lVarM8945 = m8945(this);
                    if (lVarM8945 != null) {
                        C0083.m8026(consumer, m8943(lVarM8945));
                    }
                    break;
                }
                break;
            default:
                C0092.m8727(consumer);
                while (true) {
                    l lVarM89452 = m8945(this);
                    if (lVarM89452 != null) {
                        C0083.m8026(consumer, m8947(lVarM89452));
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        switch (m8948(this)) {
            case 0:
                C0092.m8727(consumer);
                l lVarM8945 = m8945(this);
                if (lVarM8945 != null) {
                    C0083.m8026(consumer, m8943(lVarM8945));
                    break;
                }
                break;
            default:
                C0092.m8727(consumer);
                l lVarM89452 = m8945(this);
                if (lVarM89452 != null) {
                    C0083.m8026(consumer, m8947(lVarM89452));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        switch (m8948(this)) {
        }
        return m8942(this);
    }
}
