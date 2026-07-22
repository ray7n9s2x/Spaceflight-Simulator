package j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public interface W extends c0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.c0, j$.util.f0
    W trySplit();
}
