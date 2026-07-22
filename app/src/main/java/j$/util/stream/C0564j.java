package j$.util.stream;

import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0564j implements java.util.stream.Collector {
    public final /* synthetic */ Collector a;

    private /* synthetic */ C0564j(Collector collector) {
        this.a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0559i ? C0105.m11250((C0559i) collector) : new C0564j(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return C0103.m11142(C0095.m9193(this));
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return C0082.m8013(C0100.m11010(C0095.m9193(this)));
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return C0082.m7972(C0095.m9193(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collectorM9193 = C0095.m9193(this);
        if (obj instanceof C0564j) {
            obj = C0095.m9193((C0564j) obj);
        }
        return C0085.m8250(collectorM9193, obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return C0095.m9163(C0095.m9193(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0095.m9193(this));
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return C0104.m11228(C0095.m9193(this));
    }
}
