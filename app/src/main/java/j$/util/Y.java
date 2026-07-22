package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements Spliterator.OfLong {
    public final /* synthetic */ Z a;

    private /* synthetic */ Y(Z z) {
        this.a = z;
    }

    public static /* synthetic */ Spliterator.OfLong a(Z z) {
        if (z == null) {
            return null;
        }
        return z instanceof X ? C0083.m8066((X) z) : new Y(z);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return C0080.m7579(C0097.m10850(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Z zM10850 = C0097.m10850(this);
        if (obj instanceof Y) {
            obj = C0097.m10850((Y) obj);
        }
        return C0085.m8250(zM10850, obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return C0082.m7979(C0097.m10850(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0080.m7577(C0097.m10850(this), longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8509(C0097.m10850(this), consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        C0079.m7485(C0097.m10850(this), longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return C0097.m10819(C0097.m10850(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0088.m8548(C0097.m10850(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0088.m8562(C0097.m10850(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0097.m10850(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return C0083.m8061(C0097.m10850(this), longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0081.m7848(C0097.m10850(this), consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return C0091.m8667(C0097.m10850(this), longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return C0094.m9132(C0079.m7506(C0097.m10850(this)));
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0085.m8270(C0095.m9212(C0097.m10850(this)));
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0081.m7838(C0079.m7517(C0097.m10850(this)));
    }
}
