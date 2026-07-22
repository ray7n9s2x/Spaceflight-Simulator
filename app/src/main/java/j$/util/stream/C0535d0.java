package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
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
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0535d0 implements java.util.stream.IntStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f533short = {278, 317, 298, 317, 380, 356, 375, 380, 285, 268, 277, 380, 312, 313, 303, 297, 315, 317, 302, 309, 306, 315, 380, 372, 304, 309, 318, 302, 317, 302, 293, 380, 312, 313, 303, 297, 315, 317, 302, 309, 306, 315, 373, 380, 319, 317, 306, 306, 307, 296, 380, 319, 307, 306, 298, 313, 302, 296, 380, 296, 307, 380, 310, 317, 298, 317, 370, 297, 296, 309, 304, 370, 277, 306, 296, 271, 297, 305, 305, 317, 302, 293, 271, 296, 317, 296, 309, 303, 296, 309, 319, 303};
    public final /* synthetic */ IntStream a;

    private /* synthetic */ C0535d0(IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ java.util.stream.IntStream j(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C0530c0 ? C0087.m8475((C0530c0) intStream) : new C0535d0(intStream);
    }

    /* JADX INFO: renamed from: ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m10060() {
        if (C0084.m8116() >= 0) {
            return f533short;
        }
        return null;
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return C0092.m8772(C0106.m11320(this), intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return C0092.m8768(C0106.m11320(this), intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C0103.m11164(C0088.m8523(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.LongStream asLongStream() {
        return C0091.m8704(C0102.m11117(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalDouble average() {
        return C0104.m11234(C0100.m11001(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return C0082.m8000(C0085.m8241(C0106.m11320(this)));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0086.m8281(C0106.m11320(this));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return C0081.m7815(C0106.m11320(this), supplier, objIntConsumer, biConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return C0084.m8110(C0106.m11320(this));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream distinct() {
        return C0097.m10806(C0102.m11071(C0106.m11320(this)));
    }

    public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
        return C0097.m10806(C0102.m11086(C0106.m11320(this), intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStreamM11320 = C0106.m11320(this);
        if (obj instanceof C0535d0) {
            obj = C0106.m11320((C0535d0) obj);
        }
        return C0085.m8250(intStreamM11320, obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
        return C0097.m10806(C0091.m8707(C0106.m11320(this), intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return C0085.m8246(C0093.m9092(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return C0085.m8246(C0102.m11065(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        C0102.m11092(C0106.m11320(this), intConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        C0081.m7822(C0106.m11320(this), intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0106.m11320(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0083.m8049(C0106.m11320(this));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Integer> iterator() {
        return C0101.m11034(C0106.m11320(this));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Integer> iterator2() {
        return C0105.m11296(C0092.m8740(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream limit(long j) {
        return C0097.m10806(C0096.m10780(C0106.m11320(this), j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
        return C0097.m10806(C0083.m8070(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C0103.m11164(C0087.m8467(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C0091.m8704(C0101.m11015(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
        return C0082.m8000(C0097.m10851(C0106.m11320(this), intFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return C0085.m8246(C0084.m8115(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return C0085.m8246(C0087.m8471(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return C0081.m7845(C0106.m11320(this), intPredicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return C0095.m9207(C0082.m7999(C0106.m11320(this), runnable));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return C0095.m9207(C0088.m8549(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.IntStream parallel() {
        return C0097.m10806(C0081.m7824(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
        return C0097.m10806(C0079.m7522(C0106.m11320(this), intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return C0099.m10928(C0106.m11320(this), i, intBinaryOperator);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return C0085.m8246(C0085.m8264(C0106.m11320(this), intBinaryOperator));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return C0095.m9207(C0102.m11075(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.IntStream sequential() {
        return C0097.m10806(C0080.m7572(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream skip(long j) {
        return C0097.m10806(C0094.m9117(C0106.m11320(this), j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream sorted() {
        return C0097.m10806(C0081.m7862(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Integer> spliterator() {
        return C0086.m8319(C0086.m8301(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Integer> spliterator2() {
        return C0081.m7838(C0102.m11114(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return C0095.m9174(C0106.m11320(this));
    }

    public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
        return C0097.m10806(C0104.m11182(C0106.m11320(this), intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return C0087.m8462(C0106.m11320(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return C0095.m9207(C0088.m8516(C0106.m11320(this)));
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        C0082.m7973(C0106.m11320(this));
        throw new Error(C0093.m9062(m10060(), 0, 92, 348));
    }

    @Override // java.util.stream.IntStream
    public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
        IntStream intStreamM11320 = C0106.m11320(this);
        R0 r0 = new R0();
        r0.a = intFunction;
        return C0097.m10806(C0082.m7969(intStreamM11320, r0));
    }
}
