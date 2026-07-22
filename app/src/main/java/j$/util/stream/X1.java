package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.format.C0083;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class X1 extends AbstractC0527b2 implements InterfaceC0582m2 {
    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static long m9839(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0527b2) obj).b;
        }
        return 0L;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0105.m11261(this, obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return C0106.m11351(m9839(this));
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b = m9839(this) + m9839((AbstractC0527b2) v1);
    }

    @Override // j$.util.stream.AbstractC0527b2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        this.b = m9839(this) + 1;
    }
}
