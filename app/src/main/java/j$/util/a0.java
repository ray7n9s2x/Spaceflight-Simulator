package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements c0 {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    private /* synthetic */ a0(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ c0 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof b0 ? C0088.m8529((b0) ofPrimitive) : ofPrimitive instanceof Spliterator.OfDouble ? C0083.m8073((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? C0091.m8686((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? C0099.m10891((Spliterator.OfLong) ofPrimitive) : new a0(ofPrimitive);
    }

    @Override // j$.util.f0
    public final /* synthetic */ int characteristics() {
        return C0104.m11199(C0081.m7820(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitiveM7820 = C0081.m7820(this);
        if (obj instanceof a0) {
            obj = C0081.m7820((a0) obj);
        }
        return C0085.m8250(ofPrimitiveM7820, obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long estimateSize() {
        return C0102.m11081(C0081.m7820(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0080.m7561(C0081.m7820(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0106.m11340(C0081.m7820(this), consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ Comparator getComparator() {
        return C0079.m7480(C0081.m7820(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0101.m11019(C0081.m7820(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0095.m9181(C0081.m7820(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0081.m7820(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return C0100.m11011(C0081.m7820(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0105.m11308(C0081.m7820(this), consumer);
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* synthetic */ c0 trySplit() {
        return C0096.m10769(C0087.m8461(C0081.m7820(this)));
    }

    @Override // j$.util.f0
    public final /* synthetic */ f0 trySplit() {
        return C0084.m8094(C0085.m8258(C0081.m7820(this)));
    }
}
