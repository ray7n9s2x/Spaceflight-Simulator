package j$.util.stream;

import j$.time.format.C0084;
import j$.time.zone.C0088;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0632w3 extends AbstractC0637x3 implements j$.util.Z {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0084.m8102(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0647z3
    protected final j$.util.f0 a(j$.util.f0 f0Var, long j, long j2, long j3, long j4) {
        return new C0632w3((j$.util.Z) f0Var, j, j2, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0637x3
    protected final Object b() {
        return new I0(1);
    }
}
