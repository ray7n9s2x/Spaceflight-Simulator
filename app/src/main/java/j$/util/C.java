package j$.util;

import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.stream.C0099;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements DoubleConsumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C(Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        C0083.m8026(C0099.m10887(this), C0085.m8245(d));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }
}
