package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.util.NoSuchElementException;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class i0 implements N, LongConsumer, InterfaceC0651w {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f500short = {1881, 1810, 1887, 1794, 1857, 1859, 1870, 1870, 1867, 1868, 1861, 1794, 1906, 1872, 1867, 1871, 1867, 1878, 1867, 1876, 1863, 1899, 1878, 1863, 1872, 1859, 1878, 1869, 1872, 1804, 1901, 1860, 1902, 1869, 1868, 1861, 1804, 1860, 1869, 1872, 1895, 1859, 1857, 1866, 1904, 1863, 1871, 1859, 1867, 1868, 1867, 1868, 1861, 1902, 1869, 1868, 1861, 1802, 1859, 1857, 1878, 1867, 1869, 1868, 1816, 1816, 1859, 1857, 1857, 1863, 1874, 1878, 1803, 1478, 1421, 1472, 1437, 1502, 1500, 1489, 1489, 1492, 1491, 1498, 1437, 1517, 1487, 1492, 1488, 1492, 1481, 1492, 1483, 1496, 1524, 1481, 1496, 1487, 1500, 1481, 1490, 1487, 1427, 1522, 1499, 1521, 1490, 1491, 1498, 1427, 1491, 1496, 1477, 1481, 1521, 1490, 1491, 1498, 1429, 1428};
    boolean a = false;
    long b;
    final /* synthetic */ Z c;

    /* JADX INFO: renamed from: ۟۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9246(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            ((i0) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Long m9247(Object obj) {
        if (C0094.m9148() > 0) {
            return ((i0) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Z m9248(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((i0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9249(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((i0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m9250() {
        if (C0079.m7512() > 0) {
            return f500short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static long m9251(Object obj) {
        if (C0089.m8594() < 0) {
            return ((i0) obj).nextLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۦۣ, reason: not valid java name and contains not printable characters */
    public static long m9252(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((i0) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9253(Object obj) {
        if (C0088.m8503() > 0) {
            return ((i0) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۤۡ, reason: contains not printable characters */
    public static void m9254(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            v0.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9255() {
        if (C0095.m9210() >= 0) {
            return v0.a;
        }
        return false;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.O
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9246(this, (LongConsumer) obj);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return m9247(this);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        C0099.m10863(longConsumer);
        while (m9253(this)) {
            C0088.m8521(longConsumer, m9251(this));
        }
    }

    @Override // j$.util.N, java.util.Iterator
    public final Long next() {
        if (m9255()) {
            m9254(i0.class, C0105.m11310(m9250(), 73, 47, 1469));
            throw null;
        }
        return C0106.m11351(m9251(this));
    }

    @Override // j$.util.N, java.util.Iterator, j$.util.InterfaceC0651w
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            m9246(this, (LongConsumer) consumer);
            return;
        }
        C0099.m10863(consumer);
        if (m9255()) {
            m9254(i0.class, C0083.m8037(m9250(), 0, 73, 1826));
            throw null;
        }
        C0099.m10863(consumer);
        m9246(this, new K(consumer));
    }

    i0(Z z) {
        this.c = z;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!m9249(this)) {
            C0091.m8667(m9248(this), this);
        }
        return m9249(this);
    }

    @Override // j$.util.N
    public final long nextLong() {
        if (!m9249(this) && !m9253(this)) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return m9252(this);
    }
}
