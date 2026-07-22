package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.io.C0104;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S implements Spliterator.OfDouble {
    public final /* synthetic */ T a;

    private /* synthetic */ S(T t) {
        this.a = t;
    }

    public static /* synthetic */ Spliterator.OfDouble a(T t) {
        if (t == null) {
            return null;
        }
        return t instanceof Q ? C0100.m11012((Q) t) : new S(t);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return C0080.m7579(C0082.m8002(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        T tM8002 = C0082.m8002(this);
        if (obj instanceof S) {
            obj = C0082.m8002((S) obj);
        }
        return C0085.m8250(tM8002, obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return C0082.m7979(C0082.m8002(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0080.m7577(C0082.m8002(this), doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8509(C0082.m8002(this), consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        C0097.m10836(C0082.m8002(this), doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return C0097.m10819(C0082.m8002(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0088.m8548(C0082.m8002(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0088.m8562(C0082.m8002(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0082.m8002(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return C0083.m8061(C0082.m8002(this), doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0081.m7848(C0082.m8002(this), consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return C0104.m11219(C0082.m8002(this), doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return C0089.m8578(C0091.m8712(C0082.m8002(this)));
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0085.m8270(C0095.m9212(C0082.m8002(this)));
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0081.m7838(C0079.m7517(C0082.m8002(this)));
    }
}
