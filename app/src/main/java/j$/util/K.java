package j$.util;

import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K implements LongConsumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ K(Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        C0083.m8026(C0085.m8223(this), C0106.m11351(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }
}
