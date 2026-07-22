package j$.util.stream;

import j$.time.format.C0082;
import j$.util.function.C0095;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class V0 extends W0 implements J0 {
    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0082.m7995(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9178(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0106.m11357(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return new C0581m1(this);
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return new C0581m1(this);
    }
}
