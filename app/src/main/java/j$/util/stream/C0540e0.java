package j$.util.stream;

import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0088;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0540e0 implements LongConsumer {
    public final /* synthetic */ InterfaceC0597p2 a;

    public /* synthetic */ C0540e0(InterfaceC0597p2 interfaceC0597p2) {
        this.a = interfaceC0597p2;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m10082(Object obj, long j) {
        if (C0081.m7818() < 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        m10082(C0088.m8553(this), j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }
}
