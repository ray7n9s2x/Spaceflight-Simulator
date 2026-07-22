package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class P0 implements L0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f516short = {1529, 1493, 1494, 1494, 1503, 1497, 1486, 1491, 1493, 1492, 1524, 1493, 1502, 1503, 1505, 1439, 1502, 1511, 1505, 1439, 1481, 1511};
    private final Collection a;

    /* JADX INFO: renamed from: ۟ۤۥۤۧ, reason: not valid java name and contains not printable characters */
    public static Collection m9636(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((P0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۢ, reason: contains not printable characters */
    public static L0 m9637(Object obj, long j, long j2, Object obj2) {
        if (C0103.m11154() < 0) {
            return AbstractC0644z0.w((L0) obj, j, j2, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9638() {
        if (C0085.m8230() >= 0) {
            return f516short;
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return m9637(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    P0(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0102.m11114(C0101.m11030(m9636(this)));
    }

    @Override // j$.util.stream.L0
    public final void i(Object[] objArr, int i) {
        int i2 = i;
        Iterator itM10762 = C0096.m10762(m9636(this));
        while (C0087.m8485(itM10762)) {
            objArr[i2] = C0090.m8628(itM10762);
            i2++;
        }
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        Collection collectionM9636 = m9636(this);
        return C0080.m7581(collectionM9636, (Object[]) C0095.m9220(intFunction, C0099.m10876(collectionM9636)));
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return C0099.m10876(m9636(this));
    }

    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        C0104.m11227(m9636(this), consumer);
    }

    public final String toString() {
        Collection collectionM9636 = m9636(this);
        return C0086.m8314(C0105.m11310(m9638(), 0, 22, 1466), new Object[]{C0102.m11105(C0099.m10876(collectionM9636)), collectionM9636});
    }
}
