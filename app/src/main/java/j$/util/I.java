package j$.util;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.stream.C0096;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I implements PrimitiveIterator.OfInt {
    public final /* synthetic */ J a;

    private /* synthetic */ I(J j) {
        this.a = j;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(J j) {
        if (j == null) {
            return null;
        }
        return j instanceof H ? C0092.m8778((H) j) : new I(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        J jM10773 = C0096.m10773(this);
        if (obj instanceof I) {
            obj = C0096.m10773((I) obj);
        }
        return C0085.m8250(jM10773, obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C0090.m8614(C0096.m10773(this), intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0096.m10767(C0096.m10773(this), consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        C0083.m8045(C0096.m10773(this), intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return C0087.m8485(C0096.m10773(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0096.m10773(this));
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return C0081.m7821(C0096.m10773(this));
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return C0090.m8628(C0096.m10773(this));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return C0081.m7829(C0096.m10773(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        C0091.m8700(C0096.m10773(this));
    }
}
