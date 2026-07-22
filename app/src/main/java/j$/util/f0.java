package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public interface f0 {
    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer consumer);

    f0 trySplit();
}
