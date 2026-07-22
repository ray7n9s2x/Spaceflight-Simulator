package j$.util.function;

import j$.time.C0092;
import j$.time.zone.C0088;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements LongConsumer {
    public final /* synthetic */ LongConsumer a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ h(LongConsumer longConsumer, LongConsumer longConsumer2) {
        this.a = longConsumer;
        this.b = longConsumer2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        C0088.m8521(C0092.m8755(this), j);
        C0088.m8521(C0092.m8746(this), j);
    }
}
