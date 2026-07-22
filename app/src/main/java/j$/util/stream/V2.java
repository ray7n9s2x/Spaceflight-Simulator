package j$.util.stream;

import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import java.io.C0103;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class V2 extends X2 implements j$.util.Z {
    final /* synthetic */ W2 g;

    /* JADX INFO: renamed from: ۟۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static W2 m9795(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((V2) obj).g;
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0084.m8102(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void a(int i, Object obj, Object obj2) {
        C0088.m8521((LongConsumer) obj2, ((long[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    final j$.util.c0 b(Object obj, int i, int i2) {
        return C0085.m8235((long[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V2(W2 w2, int i, int i2, int i3, int i4) {
        super(w2, i, i2, i3, i4);
        this.g = w2;
    }

    @Override // j$.util.stream.X2
    final j$.util.c0 c(int i, int i2, int i3, int i4) {
        return new V2(m9795(this), i, i2, i3, i4);
    }
}
