package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.util.C0102;
import j$.util.function.C0094;
import java.io.C0103;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0526b1 extends AbstractC0546f1 implements F0 {
    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static double[] m10017() {
        if (C0090.m8624() >= 0) {
            return AbstractC0644z0.m10682();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static K0 m10018(Object obj, int i) {
        if (C0102.m11109() <= 0) {
            return ((C0526b1) obj).b(i);
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0092.m8722(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0094.m9113(this, j, j2);
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        m10018(this, i);
        throw null;
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7836(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return C0103.m11141();
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0103.m11141();
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        return m10017();
    }
}
