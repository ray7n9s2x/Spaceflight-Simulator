package j$.util.stream;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0549g implements java.util.stream.BaseStream {
    public final /* synthetic */ BaseStream a;

    private /* synthetic */ C0549g(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ java.util.stream.BaseStream j(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0544f ? C0097.m10829((C0544f) baseStream) : baseStream instanceof E ? C0103.m11164((E) baseStream) : baseStream instanceof IntStream ? C0097.m10806((IntStream) baseStream) : baseStream instanceof LongStream ? C0091.m8704((LongStream) baseStream) : baseStream instanceof Stream ? C0082.m8000((Stream) baseStream) : new C0549g(baseStream);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0086.m8281(C0092.m8762(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStreamM8762 = C0092.m8762(this);
        if (obj instanceof C0549g) {
            obj = C0092.m8762((C0549g) obj);
        }
        return C0085.m8250(baseStreamM8762, obj);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0092.m8762(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0083.m8049(C0092.m8762(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return C0101.m11034(C0092.m8762(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return C0095.m9207(C0082.m7999(C0092.m8762(this), runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return C0095.m9207(C0088.m8549(C0092.m8762(this)));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return C0095.m9207(C0102.m11075(C0092.m8762(this)));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(C0102.m11114(C0092.m8762(this)));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return C0095.m9207(C0088.m8516(C0092.m8762(this)));
    }
}
