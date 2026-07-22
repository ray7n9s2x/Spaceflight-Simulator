package j$.util.stream;

import j$.time.C0090;
import j$.util.C0101;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0627v3 extends AbstractC0637x3 implements j$.util.W {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0647z3
    protected final j$.util.f0 a(j$.util.f0 f0Var, long j, long j2, long j3, long j4) {
        return new C0627v3((j$.util.W) f0Var, j, j2, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0637x3
    protected final Object b() {
        return new G0(1);
    }
}
