package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.function.C0095;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H3 implements InterfaceC0597p2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ H3(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9477(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            ((Z2) obj).accept(obj2);
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        switch (C0099.m10909(this)) {
            case 0:
                C0087.m8446();
                throw null;
            default:
                C0087.m8446();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        switch (C0099.m10909(this)) {
            case 0:
                C0089.m8569();
                throw null;
            default:
                C0089.m8569();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (C0099.m10909(this)) {
            case 0:
                C0092.m8759();
                throw null;
            default:
                C0092.m8759();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (C0099.m10909(this)) {
            case 0:
                m9477((Z2) C0095.m9188(this), obj);
                break;
            default:
                C0083.m8026(C0095.m9188(this), obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0099.m10909(this)) {
        }
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
        C0099.m10909(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void l(long j) {
        C0099.m10909(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        switch (C0099.m10909(this)) {
        }
        return false;
    }
}
