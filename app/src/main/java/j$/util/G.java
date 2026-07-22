package j$.util;

import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.util.function.C0094;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements IntConsumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ G(Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C0083.m8026(C0094.m9134(this), C0102.m11105(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }
}
