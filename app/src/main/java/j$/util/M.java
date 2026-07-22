package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements PrimitiveIterator.OfLong {
    public final /* synthetic */ N a;

    private /* synthetic */ M(N n) {
        this.a = n;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(N n) {
        if (n == null) {
            return null;
        }
        return n instanceof L ? C0079.m7513((L) n) : new M(n);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N nM9225 = C0095.m9225(this);
        if (obj instanceof M) {
            obj = C0095.m9225((M) obj);
        }
        return C0085.m8250(nM9225, obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0090.m8614(C0095.m9225(this), longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0099.m10915(C0095.m9225(this), consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        C0092.m8729(C0095.m9225(this), longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return C0087.m8485(C0095.m9225(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0095.m9225(this));
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return C0085.m8267(C0095.m9225(this));
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return C0090.m8628(C0095.m9225(this));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return C0085.m8254(C0095.m9225(this));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        C0091.m8700(C0095.m9225(this));
    }
}
