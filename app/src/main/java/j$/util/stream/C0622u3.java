package j$.util.stream;

import j$.time.C0092;
import j$.time.zone.C0088;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0622u3 extends AbstractC0637x3 implements j$.util.T {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0647z3
    protected final j$.util.f0 a(j$.util.f0 f0Var, long j, long j2, long j3, long j4) {
        return new C0622u3((j$.util.T) f0Var, j, j2, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0637x3
    protected final Object b() {
        return new E0(1);
    }
}
