package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import java.io.C0104;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements T {
    public final /* synthetic */ Spliterator.OfDouble a;

    private /* synthetic */ Q(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ T a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof S ? C0082.m8002((S) ofDouble) : new Q(ofDouble);
    }

    @Override // j$.util.f0
    public final /* synthetic */ int characteristics() {
        return C0104.m11199(C0100.m11012(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDoubleM11012 = C0100.m11012(this);
        if (obj instanceof Q) {
            obj = C0100.m11012((Q) obj);
        }
        return C0085.m8250(ofDoubleM11012, obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long estimateSize() {
        return C0102.m11081(C0100.m11012(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0102.m11064(C0100.m11012(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8789(C0100.m11012(this), consumer);
    }

    @Override // j$.util.T
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0090.m8643(C0100.m11012(this), doubleConsumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ Comparator getComparator() {
        return C0079.m7480(C0100.m11012(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0101.m11019(C0100.m11012(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0095.m9181(C0100.m11012(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0100.m11012(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return C0091.m8691(C0100.m11012(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0085.m8265(C0100.m11012(this), consumer);
    }

    @Override // j$.util.T
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return C0088.m8555(C0100.m11012(this), doubleConsumer);
    }

    @Override // j$.util.T, j$.util.c0, j$.util.f0
    public final /* synthetic */ T trySplit() {
        return C0083.m8073(C0079.m7499(C0100.m11012(this)));
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* synthetic */ c0 trySplit() {
        return C0096.m10769(C0100.m10977(C0100.m11012(this)));
    }

    @Override // j$.util.f0
    public final /* synthetic */ f0 trySplit() {
        return C0084.m8094(C0090.m8654(C0100.m11012(this)));
    }
}
