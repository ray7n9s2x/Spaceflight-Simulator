package j$.util.stream;

import java.io.C0104;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0594p implements DoubleConsumer {
    public final /* synthetic */ InterfaceC0597p2 a;

    public /* synthetic */ C0594p(InterfaceC0597p2 interfaceC0597p2) {
        this.a = interfaceC0597p2;
    }

    /* JADX INFO: renamed from: ۦۦۦۡ, reason: contains not printable characters */
    public static void m10412(Object obj, double d) {
        if (C0104.m11196() >= 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        m10412(C0099.m10860(this), d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }
}
