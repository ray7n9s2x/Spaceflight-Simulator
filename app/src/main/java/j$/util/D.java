package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements F, InterfaceC0651w {
    public final /* synthetic */ PrimitiveIterator.OfDouble a;

    private /* synthetic */ D(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ F a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof E ? C0088.m8506((E) ofDouble) : new D(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDoubleM10920 = C0099.m10920(this);
        if (obj instanceof D) {
            obj = C0099.m10920((D) obj);
        }
        return C0085.m8250(ofDoubleM10920, obj);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0095.m9195(C0099.m10920(this), obj);
    }

    @Override // j$.util.F, java.util.Iterator, j$.util.InterfaceC0651w
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0079.m7516(C0099.m10920(this), consumer);
    }

    @Override // j$.util.F
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0087.m8465(C0099.m10920(this), doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return C0087.m8485(C0099.m10920(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0099.m10920(this));
    }

    @Override // j$.util.F, java.util.Iterator
    public final /* synthetic */ Double next() {
        return C0091.m8683(C0099.m10920(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return C0102.m11121(C0099.m10920(this));
    }

    @Override // j$.util.F
    public final /* synthetic */ double nextDouble() {
        return C0080.m7545(C0099.m10920(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        C0091.m8700(C0099.m10920(this));
    }
}
