package j$.util;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.util.PrimitiveIterator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements PrimitiveIterator.OfDouble {
    public final /* synthetic */ F a;

    private /* synthetic */ E(F f) {
        this.a = f;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(F f) {
        if (f == null) {
            return null;
        }
        return f instanceof D ? C0099.m10920((D) f) : new E(f);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        F fM8506 = C0088.m8506(this);
        if (obj instanceof E) {
            obj = C0088.m8506((E) obj);
        }
        return C0085.m8250(fM8506, obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0090.m8614(C0088.m8506(this), doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0105.m11281(C0088.m8506(this), consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        C0092.m8761(C0088.m8506(this), doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return C0087.m8485(C0088.m8506(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0088.m8506(this));
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return C0105.m11287(C0088.m8506(this));
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return C0090.m8628(C0088.m8506(this));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return C0096.m10777(C0088.m8506(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        C0091.m8700(C0088.m8506(this));
    }
}
