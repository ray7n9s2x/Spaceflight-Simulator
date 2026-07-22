package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0527b2 extends W1 implements V1 {
    long b;

    public /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.b = 0L;
    }
}
