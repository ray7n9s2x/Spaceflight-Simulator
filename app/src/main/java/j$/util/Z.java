package j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public interface Z extends c0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.c0, j$.util.f0
    Z trySplit();
}
