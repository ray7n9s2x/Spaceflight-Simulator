package j$.util.stream;

import j$.time.format.C0084;
import j$.time.zone.C0088;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0581m1 extends AbstractC0586n1 implements j$.util.Z {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0084.m8102(this, consumer);
    }
}
