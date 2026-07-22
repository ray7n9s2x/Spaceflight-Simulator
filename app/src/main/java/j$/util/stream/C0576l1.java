package j$.util.stream;

import j$.time.C0090;
import j$.util.C0101;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0576l1 extends AbstractC0586n1 implements j$.util.W {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }
}
