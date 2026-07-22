package j$.util.stream;

import j$.time.format.C0083;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0619u0 extends AbstractC0624v0 implements InterfaceC0582m2 {
    /* JADX INFO: renamed from: ۢ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10555(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0624v0) obj).a;
        }
        return false;
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

    @Override // j$.util.stream.AbstractC0624v0, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        if (m10555(this)) {
            return;
        }
        C0099.m10881(null, d);
        throw null;
    }
}
