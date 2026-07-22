package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V implements Spliterator.OfInt {
    public final /* synthetic */ W a;

    private /* synthetic */ V(W w) {
        this.a = w;
    }

    public static /* synthetic */ Spliterator.OfInt a(W w) {
        if (w == null) {
            return null;
        }
        return w instanceof U ? C0083.m8034((U) w) : new V(w);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return C0080.m7579(C0100.m10974(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        W wM10974 = C0100.m10974(this);
        if (obj instanceof V) {
            obj = C0100.m10974((V) obj);
        }
        return C0085.m8250(wM10974, obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return C0082.m7979(C0100.m10974(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C0080.m7577(C0100.m10974(this), intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8509(C0100.m10974(this), consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        C0093.m9078(C0100.m10974(this), intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return C0097.m10819(C0100.m10974(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0088.m8548(C0100.m10974(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0088.m8562(C0100.m10974(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0100.m10974(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return C0083.m8061(C0100.m10974(this), intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0081.m7848(C0100.m10974(this), consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return C0081.m7828(C0100.m10974(this), intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return C0086.m8319(C0102.m11104(C0100.m10974(this)));
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0085.m8270(C0095.m9212(C0100.m10974(this)));
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0081.m7838(C0079.m7517(C0100.m10974(this)));
    }
}
