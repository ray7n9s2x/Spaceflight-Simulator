package j$.util.function;

import j$.time.C0090;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ c(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
        this.a = doubleConsumer;
        this.b = doubleConsumer2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        C0090.m8634(C0106.m11342(this), d);
        C0090.m8634(C0090.m8627(this), d);
    }
}
