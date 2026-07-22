package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.Optional;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0523a3 implements Stream {
    public final /* synthetic */ java.util.stream.Stream a;

    private /* synthetic */ C0523a3(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream j(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C0528b3 ? C0084.m8123((C0528b3) stream) : new C0523a3(stream);
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m9933(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((java.util.stream.Stream) obj).takeWhile((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m9934(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((java.util.stream.Stream) obj).dropWhile((Predicate) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return C0090.m8606(C0105.m11277(this), predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return C0095.m9192(C0105.m11277(this), predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream b(C0519a c0519a) {
        return C0105.m11309(C0089.m8577(C0105.m11277(this), C0082.m7994(c0519a)));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0097.m10818(C0105.m11277(this));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return C0099.m10862(C0105.m11277(this), C0089.m8589(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return C0095.m9183(C0105.m11277(this), supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return C0103.m11127(C0105.m11277(this));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return C0105.m11309(C0086.m8278(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return C0105.m11309(m9934(C0105.m11277(this), predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream streamM11277 = C0105.m11277(this);
        if (obj instanceof C0523a3) {
            obj = C0105.m11277((C0523a3) obj);
        }
        return C0085.m8250(streamM11277, obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return C0105.m11309(C0086.m8287(C0105.m11277(this), predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return C0106.m11332(C0089.m8603(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return C0106.m11332(C0088.m8515(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0096.m10750(C0105.m11277(this), consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        C0103.m11150(C0105.m11277(this), consumer);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0105.m11277(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0092.m8750(C0105.m11277(this));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return C0091.m8698(C0105.m11277(this));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return C0105.m11309(C0097.m10805(C0105.m11277(this), j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ LongStream m(C0519a c0519a) {
        return C0099.m10923(C0081.m7830(C0105.m11277(this), C0082.m7994(c0519a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return C0105.m11309(C0081.m7813(C0105.m11277(this), function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ E mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C0097.m10804(C0099.m10888(C0105.m11277(this), toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return C0080.m7539(C0100.m10965(C0105.m11277(this), toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return C0099.m10923(C0094.m9130(C0105.m11277(this), toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return C0106.m11332(C0105.m11303(C0105.m11277(this), comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return C0106.m11332(C0104.m11189(C0105.m11277(this), comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return C0090.m8649(C0105.m11277(this), predicate);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0106.m11316(C0081.m7833(C0105.m11277(this), runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream parallel() {
        return C0106.m11316(C0094.m9114(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return C0105.m11309(C0095.m9167(C0105.m11277(this), consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream q(C0519a c0519a) {
        return C0080.m7539(C0082.m7991(C0105.m11277(this), C0082.m7994(c0519a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return C0106.m11332(C0091.m8694(C0105.m11277(this), binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return C0084.m8128(C0105.m11277(this), obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return C0086.m8330(C0105.m11277(this), obj, binaryOperator);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream sequential() {
        return C0106.m11316(C0096.m10772(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return C0105.m11309(C0102.m11062(C0105.m11277(this), j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return C0105.m11309(C0092.m8752(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return C0105.m11309(C0093.m9097(C0105.m11277(this), comparator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.f0 spliterator() {
        return C0084.m8094(C0088.m8536(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return C0105.m11309(m9933(C0105.m11277(this), predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return C0095.m9172(C0105.m11277(this));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return C0079.m7475(C0105.m11277(this), intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0106.m11316(C0100.m10967(C0105.m11277(this)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ E v(C0519a c0519a) {
        return C0097.m10804(C0105.m11251(C0105.m11277(this), C0082.m7994(c0519a)));
    }
}
