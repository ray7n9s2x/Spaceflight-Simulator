package j$.util;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.stream.C0096;
import java.io.C0103;
import java.io.C0104;
import java.util.PrimitiveIterator;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements J, InterfaceC0651w {
    public final /* synthetic */ PrimitiveIterator.OfInt a;

    private /* synthetic */ H(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ J a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof I ? C0096.m10773((I) ofInt) : new H(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofIntM8778 = C0092.m8778(this);
        if (obj instanceof H) {
            obj = C0092.m8778((H) obj);
        }
        return C0085.m8250(ofIntM8778, obj);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0085.m8274(C0092.m8778(this), obj);
    }

    @Override // j$.util.J, java.util.Iterator, j$.util.InterfaceC0651w
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0106.m11336(C0092.m8778(this), consumer);
    }

    @Override // j$.util.J
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C0087.m8496(C0092.m8778(this), intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return C0087.m8485(C0092.m8778(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0092.m8778(this));
    }

    @Override // j$.util.J, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return C0082.m7974(C0092.m8778(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return C0104.m11240(C0092.m8778(this));
    }

    @Override // j$.util.J
    public final /* synthetic */ int nextInt() {
        return C0103.m11176(C0092.m8778(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        C0091.m8700(C0092.m8778(this));
    }
}
