package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements W {
    public final /* synthetic */ Spliterator.OfInt a;

    private /* synthetic */ U(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ W a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof V ? C0100.m10974((V) ofInt) : new U(ofInt);
    }

    @Override // j$.util.f0
    public final /* synthetic */ int characteristics() {
        return C0104.m11199(C0083.m8034(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofIntM8034 = C0083.m8034(this);
        if (obj instanceof U) {
            obj = C0083.m8034((U) obj);
        }
        return C0085.m8250(ofIntM8034, obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long estimateSize() {
        return C0102.m11081(C0083.m8034(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0096.m10796(C0083.m8034(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0091.m8719(C0083.m8034(this), consumer);
    }

    @Override // j$.util.W
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C0105.m11260(C0083.m8034(this), intConsumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ Comparator getComparator() {
        return C0079.m7480(C0083.m8034(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0101.m11019(C0083.m8034(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0095.m9181(C0083.m8034(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0083.m8034(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return C0104.m11224(C0083.m8034(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0092.m8733(C0083.m8034(this), consumer);
    }

    @Override // j$.util.W
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return C0099.m10933(C0083.m8034(this), intConsumer);
    }

    @Override // j$.util.W, j$.util.c0, j$.util.f0
    public final /* synthetic */ W trySplit() {
        return C0091.m8686(C0105.m11299(C0083.m8034(this)));
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* synthetic */ c0 trySplit() {
        return C0096.m10769(C0100.m10987(C0083.m8034(this)));
    }

    @Override // j$.util.f0
    public final /* synthetic */ f0 trySplit() {
        return C0084.m8094(C0097.m10814(C0083.m8034(this)));
    }
}
