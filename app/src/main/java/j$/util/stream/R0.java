package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R0 implements LongFunction, IntFunction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f518short = {1857, 1866, 1885, 1866, 1797, 1886, 1887, 1858, 1863, 1797, 1880, 1887, 1881, 1870, 1866, 1862, 1797, 1890, 1861, 1887, 1912, 1887, 1881, 1870, 1866, 1862};
    public IntFunction a;

    /* JADX INFO: renamed from: ۟۠ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static D0 m9681(long j, Object obj) {
        if (C0102.m11109() <= 0) {
            return AbstractC0644z0.D(j, (IntFunction) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m9682() {
        if (C0091.m8708() >= 0) {
            return f518short;
        }
        return null;
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objM9220 = C0095.m9220(C0105.m11262(this), i);
        if (objM9220 == null) {
            return null;
        }
        if (objM9220 instanceof IntStream) {
            return C0097.m10806((IntStream) objM9220);
        }
        if (objM9220 instanceof java.util.stream.IntStream) {
            return C0080.m7539((java.util.stream.IntStream) objM9220);
        }
        C0086.m8333(C0091.m8679(m9682(), 0, 26, 1835), C0092.m8727(objM9220));
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return m9681(j, C0105.m11262(this));
    }
}
