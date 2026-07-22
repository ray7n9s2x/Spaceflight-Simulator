package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class M extends Q implements InterfaceC0582m2 {
    final DoubleConsumer b;

    /* JADX INFO: renamed from: ۟۠ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9564(Object obj, Object obj2, Object obj3) {
        if (C0104.m11196() > 0) {
            ((Q) obj).e((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9565(Object obj, Object obj2, Object obj3) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static DoubleConsumer m9566(Object obj) {
        if (C0092.m8724() < 0) {
            return ((M) obj).b;
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0105.m11261(this, obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9565(abstractC0524b, f0Var, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9564(this, abstractC0524b, f0Var);
        return null;
    }

    M(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        C0090.m8634(m9566(this), d);
    }
}
