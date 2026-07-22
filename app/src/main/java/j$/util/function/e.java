package j$.util.function;

import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import java.util.function.C0105;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements IntConsumer {
    public final /* synthetic */ IntConsumer a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ e(IntConsumer intConsumer, IntConsumer intConsumer2) {
        this.a = intConsumer;
        this.b = intConsumer2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C0105.m11259(C0081.m7802(this), i);
        C0105.m11259(C0088.m8545(this), i);
    }
}
