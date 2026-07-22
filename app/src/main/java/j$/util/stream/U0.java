package j$.util.stream;

import j$.time.chrono.C0081;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class U0 extends W0 implements H0 {
    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0102.m11063(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9205(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7856(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return new C0576l1(this);
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return new C0576l1(this);
    }
}
