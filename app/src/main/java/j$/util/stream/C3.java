package j$.util.stream;

import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class C3 extends D3 implements j$.util.Z, LongConsumer {
    long f;

    /* JADX INFO: renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static long m9372(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((C3) obj).f;
        }
        return 0L;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0084.m8102(this, consumer);
    }

    @Override // j$.util.stream.G3
    protected final j$.util.f0 c(j$.util.f0 f0Var) {
        return new C3((j$.util.Z) f0Var, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        C0088.m8521((LongConsumer) obj, m9372(this));
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    @Override // j$.util.stream.D3
    protected final AbstractC0573k3 h(int i) {
        return new C0568j3(i);
    }
}
