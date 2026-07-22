package j$.util.stream;

import j$.time.C0092;
import j$.time.zone.C0088;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0571k1 extends AbstractC0586n1 implements j$.util.T {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }
}
