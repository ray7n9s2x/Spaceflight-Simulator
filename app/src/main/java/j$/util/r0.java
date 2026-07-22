package j$.util;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.C0105;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
class r0 implements f0 {
    private final Collection a;
    private Iterator b = null;
    private final int c;
    private long d;
    private int e;

    /* JADX INFO: renamed from: ۟ۡۡۦ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m9302(Object obj) {
        if (C0102.m11109() < 0) {
            return ((r0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m9303(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((r0) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9304(Object obj) {
        if (C0081.m7818() < 0) {
            return ((r0) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m9305(Object obj) {
        if (C0091.m8708() > 0) {
            return ((r0) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۥ, reason: not valid java name and contains not printable characters */
    public static Collection m9306(Object obj) {
        if (C0088.m8503() > 0) {
            return ((r0) obj).a;
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    public r0(int i, Collection collection) {
        this.a = collection;
        this.c = i | 16448;
    }

    @Override // j$.util.f0
    public final f0 trySplit() {
        long jM9305;
        Iterator itM9302 = m9302(this);
        if (itM9302 == null) {
            Collection collectionM9306 = m9306(this);
            Iterator itM10762 = C0096.m10762(collectionM9306);
            this.b = itM10762;
            jM9305 = C0099.m10876(collectionM9306);
            this.d = jM9305;
            itM9302 = itM10762;
        } else {
            jM9305 = m9305(this);
        }
        if (jM9305 <= 1 || !C0087.m8485(itM9302)) {
            return null;
        }
        int iM9303 = m9303(this) + 1024;
        if (iM9303 > jM9305) {
            iM9303 = (int) jM9305;
        }
        if (iM9303 > 33554432) {
            iM9303 = 33554432;
        }
        Object[] objArr = new Object[iM9303];
        int i = 0;
        do {
            objArr[i] = C0090.m8628(itM9302);
            i++;
            if (i >= iM9303) {
                break;
            }
        } while (C0087.m8485(itM9302));
        this.e = i;
        long jM93052 = m9305(this);
        if (jM93052 != Long.MAX_VALUE) {
            this.d = jM93052 - ((long) i);
        }
        return new k0(objArr, 0, i, m9304(this));
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0092.m8727(consumer);
        Iterator itM9302 = m9302(this);
        if (itM9302 == null) {
            Iterator itM10762 = C0096.m10762(m9306(this));
            this.b = itM10762;
            this.d = C0099.m10876(r0);
            itM9302 = itM10762;
        }
        C0084.m8088(itM9302, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0092.m8727(consumer);
        if (m9302(this) == null) {
            this.b = C0096.m10762(m9306(this));
            this.d = C0099.m10876(r0);
        }
        if (!C0087.m8485(m9302(this))) {
            return false;
        }
        C0083.m8026(consumer, C0090.m8628(m9302(this)));
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        if (m9302(this) == null) {
            Collection collectionM9306 = m9306(this);
            this.b = C0096.m10762(collectionM9306);
            long jM10876 = C0099.m10876(collectionM9306);
            this.d = jM10876;
            return jM10876;
        }
        return m9305(this);
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return m9304(this);
    }

    @Override // j$.util.f0
    public Comparator getComparator() {
        if (C0100.m10986(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
