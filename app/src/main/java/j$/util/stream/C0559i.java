package j$.util.stream;

import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0559i implements Collector {
    public final /* synthetic */ java.util.stream.Collector a;

    private /* synthetic */ C0559i(java.util.stream.Collector collector) {
        this.a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0564j ? C0095.m9193((C0564j) collector) : new C0559i(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return C0096.m10795(C0105.m11250(this));
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return C0082.m8013(C0083.m8048(C0105.m11250(this)));
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return C0084.m8114(C0105.m11250(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collectorM11250 = C0105.m11250(this);
        if (obj instanceof C0559i) {
            obj = C0105.m11250((C0559i) obj);
        }
        return C0085.m8250(collectorM11250, obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return C0103.m11177(C0105.m11250(this));
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0105.m11250(this));
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return C0085.m8255(C0105.m11250(this));
    }
}
