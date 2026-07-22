package j$.util.stream;

import j$.time.C0092;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.util.function.C0106;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class Z1 extends AbstractC0527b2 implements InterfaceC0592o2 {
    /* JADX INFO: renamed from: ۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static long m9903(Object obj) {
        if (C0093.m9101() > 0) {
            return ((AbstractC0527b2) obj).b;
        }
        return 0L;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0095.m9221(this, obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return C0106.m11351(m9903(this));
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b = m9903(this) + m9903((AbstractC0527b2) v1);
    }

    @Override // j$.util.stream.AbstractC0527b2, j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b = m9903(this) + 1;
    }
}
