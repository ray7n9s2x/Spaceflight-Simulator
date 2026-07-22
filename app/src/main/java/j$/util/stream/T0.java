package j$.util.stream;

import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.util.function.C0094;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class T0 extends W0 implements F0 {
    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0092.m8722(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0094.m9113(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7836(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final Object c(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return new C0571k1(this);
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return new C0571k1(this);
    }
}
