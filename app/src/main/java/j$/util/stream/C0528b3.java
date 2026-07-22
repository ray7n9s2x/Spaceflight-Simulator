package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
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
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0528b3 implements java.util.stream.Stream {
    public final /* synthetic */ Stream a;

    private /* synthetic */ C0528b3(Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ java.util.stream.Stream j(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C0523a3 ? C0105.m11277((C0523a3) stream) : new C0528b3(stream);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return C0088.m8547(C0084.m8123(this), predicate);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return C0083.m8021(C0084.m8123(this), predicate);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0086.m8281(C0084.m8123(this));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return C0082.m7997(C0084.m8123(this), supplier, biConsumer, biConsumer2);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(java.util.stream.Collector collector) {
        return C0101.m11035(C0084.m8123(this), C0095.m9169(collector));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return C0096.m10791(C0084.m8123(this));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream distinct() {
        return C0082.m8000(C0102.m11095(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream dropWhile(Predicate predicate) {
        return C0082.m8000(C0103.m11181(C0084.m8123(this), predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream streamM8123 = C0084.m8123(this);
        if (obj instanceof C0528b3) {
            obj = C0084.m8123((C0528b3) obj);
        }
        return C0085.m8250(streamM8123, obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
        return C0082.m8000(C0089.m8597(C0084.m8123(this), predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return C0104.m11220(C0082.m8009(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return C0104.m11220(C0105.m11288(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
        return C0082.m8000(C0079.m7477(C0084.m8123(this), C0082.m7994(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
        return C0103.m11164(C0081.m7803(C0084.m8123(this), C0082.m7994(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream flatMapToInt(Function function) {
        return C0097.m10806(C0105.m11297(C0084.m8123(this), C0082.m7994(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream flatMapToLong(Function function) {
        return C0091.m8704(C0089.m8567(C0084.m8123(this), C0082.m7994(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0088.m8566(C0084.m8123(this), consumer);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        C0094.m9116(C0084.m8123(this), consumer);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0084.m8123(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0083.m8049(C0084.m8123(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return C0101.m11034(C0084.m8123(this));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream limit(long j) {
        return C0082.m8000(C0080.m7556(C0084.m8123(this), j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream map(Function function) {
        return C0082.m8000(C0094.m9129(C0084.m8123(this), function));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C0103.m11164(C0100.m10970(C0084.m8123(this), toDoubleFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
        return C0097.m10806(C0083.m8018(C0084.m8123(this), toIntFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(ToLongFunction toLongFunction) {
        return C0091.m8704(C0106.m11314(C0084.m8123(this), toLongFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return C0104.m11220(C0095.m9213(C0084.m8123(this), comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return C0104.m11220(C0099.m10910(C0084.m8123(this), comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return C0092.m8770(C0084.m8123(this), predicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return C0095.m9207(C0082.m7999(C0084.m8123(this), runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return C0095.m9207(C0088.m8549(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream peek(Consumer consumer) {
        return C0082.m8000(C0104.m11232(C0084.m8123(this), consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return C0096.m10756(C0084.m8123(this), obj, biFunction, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return C0088.m8539(C0084.m8123(this), obj, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return C0104.m11220(C0084.m8095(C0084.m8123(this), binaryOperator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return C0095.m9207(C0102.m11075(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream skip(long j) {
        return C0082.m8000(C0082.m7971(C0084.m8123(this), j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted() {
        return C0082.m8000(C0090.m8650(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
        return C0082.m8000(C0104.m11213(C0084.m8123(this), comparator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(C0102.m11114(C0084.m8123(this)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream takeWhile(Predicate predicate) {
        return C0082.m8000(C0105.m11285(C0084.m8123(this), predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return C0092.m8794(C0084.m8123(this));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return C0087.m8459(C0084.m8123(this), intFunction);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return C0095.m9207(C0088.m8516(C0084.m8123(this)));
    }
}
