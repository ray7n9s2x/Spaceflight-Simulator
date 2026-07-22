package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements N, InterfaceC0651w {
    public final /* synthetic */ PrimitiveIterator.OfLong a;

    private /* synthetic */ L(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ N a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof M ? C0095.m9225((M) ofLong) : new L(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLongM7513 = C0079.m7513(this);
        if (obj instanceof L) {
            obj = C0079.m7513((L) obj);
        }
        return C0085.m8250(ofLongM7513, obj);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0083.m8047(C0079.m7513(this), obj);
    }

    @Override // j$.util.N, java.util.Iterator, j$.util.InterfaceC0651w
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0080.m7546(C0079.m7513(this), consumer);
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0092.m8760(C0079.m7513(this), longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return C0087.m8485(C0079.m7513(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0079.m7513(this));
    }

    @Override // j$.util.N, java.util.Iterator
    public final /* synthetic */ Long next() {
        return C0089.m8575(C0079.m7513(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return C0094.m9153(C0079.m7513(this));
    }

    @Override // j$.util.N
    public final /* synthetic */ long nextLong() {
        return C0086.m8302(C0079.m7513(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        C0091.m8700(C0079.m7513(this));
    }
}
