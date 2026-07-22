package j$.util.stream;

import j$.time.format.C0082;
import j$.time.zone.C0087;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G0 implements IntConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ G0(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$OfInt$$ExternalSyntheticLambda0(int i) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfInt$$ExternalSyntheticLambda0(int i) {
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C0087.m8456(this);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (C0087.m8456(this)) {
        }
        return C0082.m7981(this, intConsumer);
    }
}
