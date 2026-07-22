package j$.util.stream;

import j$.time.C0092;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I0 implements LongConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ I0(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$OfLong$$ExternalSyntheticLambda0(long j) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfLong$$ExternalSyntheticLambda0(long j) {
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        C0099.m10898(this);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (C0099.m10898(this)) {
        }
        return C0092.m8788(this, longConsumer);
    }
}
