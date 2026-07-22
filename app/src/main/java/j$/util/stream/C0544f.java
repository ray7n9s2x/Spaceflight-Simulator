package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.function.C0094;
import java.util.Iterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0544f implements BaseStream {
    public final /* synthetic */ java.util.stream.BaseStream a;

    private /* synthetic */ C0544f(java.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ BaseStream j(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0549g ? C0092.m8762((C0549g) baseStream) : baseStream instanceof DoubleStream ? C0097.m10804((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? C0080.m7539((java.util.stream.IntStream) baseStream) : baseStream instanceof java.util.stream.LongStream ? C0099.m10923((java.util.stream.LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C0105.m11309((java.util.stream.Stream) baseStream) : new C0544f(baseStream);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0097.m10818(C0097.m10829(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.BaseStream baseStreamM10829 = C0097.m10829(this);
        if (obj instanceof C0544f) {
            obj = C0097.m10829((C0544f) obj);
        }
        return C0085.m8250(baseStreamM10829, obj);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0097.m10829(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0092.m8750(C0097.m10829(this));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return C0091.m8698(C0097.m10829(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0106.m11316(C0081.m7833(C0097.m10829(this), runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream parallel() {
        return C0106.m11316(C0094.m9114(C0097.m10829(this)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream sequential() {
        return C0106.m11316(C0096.m10772(C0097.m10829(this)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.f0 spliterator() {
        return C0084.m8094(C0088.m8536(C0097.m10829(this)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0106.m11316(C0100.m10967(C0097.m10829(this)));
    }
}
