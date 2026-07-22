package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public interface T extends c0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.c0, j$.util.f0
    T trySplit();
}
