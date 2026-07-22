package j$.util;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.util.NoSuchElementException;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class h0 implements J, IntConsumer, InterfaceC0651w {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f499short = {1868, 1799, 1866, 1815, 1876, 1878, 1883, 1883, 1886, 1881, 1872, 1815, 1895, 1861, 1886, 1882, 1886, 1859, 1886, 1857, 1874, 1918, 1859, 1874, 1861, 1878, 1859, 1880, 1861, 1817, 1912, 1873, 1918, 1881, 1859, 1817, 1873, 1880, 1861, 1906, 1878, 1876, 1887, 1893, 1874, 1882, 1878, 1886, 1881, 1886, 1881, 1872, 1918, 1881, 1859, 1823, 1878, 1876, 1859, 1886, 1880, 1881, 1805, 1805, 1878, 1876, 1876, 1874, 1863, 1859, 1822, 2140, 2071, 2138, 2055, 2116, 2118, 2123, 2123, 2126, 2121, 2112, 2055, 2167, 2133, 2126, 2122, 2126, 2131, 2126, 2129, 2114, 2158, 2131, 2114, 2133, 2118, 2131, 2120, 2133, 2057, 2152, 2113, 2158, 2121, 2131, 2057, 2121, 2114, 2143, 2131, 2158, 2121, 2131, 2063, 2062};
    boolean a = false;
    int b;
    final /* synthetic */ W c;

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9233(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((h0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m9234(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            v0.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9235(Object obj) {
        if (C0079.m7512() > 0) {
            return ((h0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9236() {
        if (C0097.m10823() > 0) {
            return f499short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static Integer m9237(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((h0) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static void m9238(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            ((h0) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static W m9239(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((h0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m9240(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((h0) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9241(Object obj) {
        if (C0094.m9148() > 0) {
            return ((h0) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9242() {
        if (C0081.m7818() <= 0) {
            return v0.a;
        }
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.O
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9238(this, (IntConsumer) obj);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return m9237(this);
    }

    @Override // j$.util.J
    public final void forEachRemaining(IntConsumer intConsumer) {
        C0099.m10863(intConsumer);
        while (m9241(this)) {
            C0105.m11259(intConsumer, m9240(this));
        }
    }

    @Override // j$.util.J, java.util.Iterator
    public final Integer next() {
        if (m9242()) {
            m9234(h0.class, C0079.m7503(m9236(), 71, 45, 2087));
            throw null;
        }
        return C0102.m11105(m9240(this));
    }

    @Override // j$.util.J, java.util.Iterator, j$.util.InterfaceC0651w
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            m9238(this, (IntConsumer) consumer);
            return;
        }
        C0099.m10863(consumer);
        if (m9242()) {
            m9234(h0.class, C0099.m10897(m9236(), 0, 71, 1847));
            throw null;
        }
        C0099.m10863(consumer);
        m9238(this, new G(consumer));
    }

    h0(W w) {
        this.c = w;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!m9233(this)) {
            C0081.m7828(m9239(this), this);
        }
        return m9233(this);
    }

    @Override // j$.util.J
    public final int nextInt() {
        if (!m9233(this) && !m9241(this)) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return m9235(this);
    }
}
