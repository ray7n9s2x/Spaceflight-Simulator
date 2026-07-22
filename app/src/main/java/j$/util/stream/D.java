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
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements DoubleStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f504short = {2160, 2139, 2124, 2139, 2074, 2050, 2065, 2074, 2171, 2154, 2163, 2074, 2142, 2143, 2121, 2127, 2141, 2139, 2120, 2131, 2132, 2141, 2074, 2066, 2134, 2131, 2136, 2120, 2139, 2120, 2115, 2074, 2142, 2143, 2121, 2127, 2141, 2139, 2120, 2131, 2132, 2141, 2067, 2074, 2137, 2139, 2132, 2132, 2133, 2126, 2074, 2137, 2133, 2132, 2124, 2143, 2120, 2126, 2074, 2126, 2133, 2074, 2128, 2139, 2124, 2139, 2068, 2127, 2126, 2131, 2134, 2068, 2174, 2133, 2127, 2136, 2134, 2143, 2153, 2127, 2135, 2135, 2139, 2120, 2115, 2153, 2126, 2139, 2126, 2131, 2121, 2126, 2131, 2137, 2121};
    public final /* synthetic */ E a;

    private /* synthetic */ D(E e) {
        this.a = e;
    }

    public static /* synthetic */ DoubleStream j(E e) {
        if (e == null) {
            return null;
        }
        return e instanceof C ? C0103.m11149((C) e) : new D(e);
    }

    /* JADX INFO: renamed from: ۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m9374() {
        if (C0092.m8724() < 0) {
            return f504short;
        }
        return null;
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return C0102.m11112(C0106.m11349(this));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return C0086.m8306(C0106.m11349(this));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble average() {
        return C0104.m11234(C0081.m7825(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return C0082.m8000(C0081.m7796(C0106.m11349(this)));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0086.m8281(C0106.m11349(this));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return C0088.m8533(C0106.m11349(this), supplier, objDoubleConsumer, biConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return C0091.m8673(C0106.m11349(this));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        return C0103.m11164(C0097.m10801(C0106.m11349(this)));
    }

    public final /* synthetic */ DoubleStream dropWhile(DoublePredicate doublePredicate) {
        return C0103.m11164(C0084.m8096(C0106.m11349(this)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        E eM11349 = C0106.m11349(this);
        if (obj instanceof D) {
            obj = C0106.m11349((D) obj);
        }
        return C0085.m8250(eM11349, obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return C0103.m11164(C0080.m7580(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findAny() {
        return C0104.m11234(C0104.m11193(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findFirst() {
        return C0104.m11234(C0105.m11252(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        C0085.m8248(C0106.m11349(this), doubleConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        C0086.m8296(C0106.m11349(this), doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0106.m11349(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0083.m8049(C0106.m11349(this));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Double> iterator() {
        return C0101.m11034(C0106.m11349(this));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Double> iterator2() {
        return C0082.m8007(C0087.m8451(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j) {
        return C0103.m11164(C0099.m10872(C0106.m11349(this), j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return C0103.m11164(C0106.m11319(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return C0097.m10806(C0086.m8304(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C0091.m8704(C0079.m7524(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return C0082.m8000(C0086.m8300(C0106.m11349(this), doubleFunction));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble max() {
        return C0104.m11234(C0105.m11278(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble min() {
        return C0104.m11234(C0102.m11085(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return C0095.m9226(C0106.m11349(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return C0095.m9207(C0082.m7999(C0106.m11349(this), runnable));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return C0095.m9207(C0088.m8549(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        return C0103.m11164(C0085.m8260(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return C0103.m11164(C0081.m7855(C0106.m11349(this), doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return C0099.m10913(C0106.m11349(this), d, doubleBinaryOperator);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return C0104.m11234(C0092.m8784(C0106.m11349(this), doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return C0095.m9207(C0102.m11075(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        return C0103.m11164(C0087.m8498(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j) {
        return C0103.m11164(C0079.m7497(C0106.m11349(this), j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        return C0103.m11164(C0102.m11110(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        return C0089.m8578(C0086.m8308(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Double> spliterator2() {
        return C0081.m7838(C0102.m11114(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return C0101.m11047(C0106.m11349(this));
    }

    public final /* synthetic */ DoubleStream takeWhile(DoublePredicate doublePredicate) {
        return C0103.m11164(C0089.m8598(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return C0081.m7827(C0106.m11349(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return C0095.m9207(C0088.m8516(C0106.m11349(this)));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        C0080.m7542(C0106.m11349(this));
        throw new Error(C0098.m10856(m9374(), 0, 95, 2106));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        E eM11349 = C0106.m11349(this);
        C0519a c0519a = new C0519a(7);
        c0519a.b = doubleFunction;
        return C0103.m11164(C0088.m8541(eM11349, c0519a));
    }
}
