package j$.util.stream;

import java.io.C0103;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E0 implements DoubleConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ E0(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$OfDouble$$ExternalSyntheticLambda0(double d) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0(double d) {
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        C0103.m11163(this);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (C0103.m11163(this)) {
        }
        return C0106.m11337(this, doubleConsumer);
    }
}
