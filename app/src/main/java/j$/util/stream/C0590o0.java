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
import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0590o0 implements java.util.stream.LongStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f544short = {3152, 3195, 3180, 3195, 3130, 3106, 3121, 3130, 3163, 3146, 3155, 3130, 3198, 3199, 3177, 3183, 3197, 3195, 3176, 3187, 3188, 3197, 3130, 3122, 3190, 3187, 3192, 3176, 3195, 3176, 3171, 3130, 3198, 3199, 3177, 3183, 3197, 3195, 3176, 3187, 3188, 3197, 3123, 3130, 3193, 3195, 3188, 3188, 3189, 3182, 3130, 3193, 3189, 3188, 3180, 3199, 3176, 3182, 3130, 3182, 3189, 3130, 3184, 3195, 3180, 3195, 3124, 3183, 3182, 3187, 3190, 3124, 3158, 3189, 3188, 3197, 3145, 3183, 3191, 3191, 3195, 3176, 3171, 3145, 3182, 3195, 3182, 3187, 3177, 3182, 3187, 3193, 3177};
    public final /* synthetic */ LongStream a;

    private /* synthetic */ C0590o0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ java.util.stream.LongStream j(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0585n0 ? C0102.m11067((C0585n0) longStream) : new C0590o0(longStream);
    }

    /* JADX INFO: renamed from: ۟ۦۦۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m10400() {
        if (C0089.m8594() < 0) {
            return f544short;
        }
        return null;
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return C0099.m10899(C0081.m7839(this));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return C0094.m9160(C0081.m7839(this));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C0103.m11164(C0092.m8748(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        return C0104.m11234(C0103.m11145(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return C0082.m8000(C0100.m11003(C0081.m7839(this)));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0086.m8281(C0081.m7839(this));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return C0090.m8655(C0081.m7839(this), supplier, objLongConsumer, biConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return C0090.m8648(C0081.m7839(this));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream distinct() {
        return C0091.m8704(C0081.m7851(C0081.m7839(this)));
    }

    public final /* synthetic */ java.util.stream.LongStream dropWhile(LongPredicate longPredicate) {
        return C0091.m8704(C0083.m8064(C0081.m7839(this)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStreamM7839 = C0081.m7839(this);
        if (obj instanceof C0590o0) {
            obj = C0081.m7839((C0590o0) obj);
        }
        return C0085.m8250(longStreamM7839, obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream filter(LongPredicate longPredicate) {
        return C0091.m8704(C0103.m11171(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return C0097.m10842(C0101.m11041(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return C0097.m10842(C0100.m10991(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        C0091.m8701(C0081.m7839(this), longConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        C0106.m11344(C0081.m7839(this), longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0081.m7839(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0083.m8049(C0081.m7839(this));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Long> iterator() {
        return C0101.m11034(C0081.m7839(this));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Long> iterator2() {
        return C0104.m11230(C0087.m8492(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream limit(long j) {
        return C0091.m8704(C0096.m10768(C0081.m7839(this), j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream map(LongUnaryOperator longUnaryOperator) {
        return C0091.m8704(C0101.m11020(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C0103.m11164(C0105.m11307(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return C0097.m10806(C0091.m8678(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return C0082.m8000(C0081.m7801(C0081.m7839(this), longFunction));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return C0097.m10842(C0094.m9146(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return C0097.m10842(C0101.m11038(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return C0083.m8071(C0081.m7839(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return C0095.m9207(C0082.m7999(C0081.m7839(this), runnable));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return C0095.m9207(C0088.m8549(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.LongStream parallel() {
        return C0091.m8704(C0100.m11013(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream peek(LongConsumer longConsumer) {
        return C0091.m8704(C0095.m9197(C0081.m7839(this), longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return C0088.m8526(C0081.m7839(this), j, longBinaryOperator);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return C0097.m10842(C0100.m11005(C0081.m7839(this), longBinaryOperator));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return C0095.m9207(C0102.m11075(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.LongStream sequential() {
        return C0091.m8704(C0081.m7860(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream skip(long j) {
        return C0091.m8704(C0104.m11207(C0081.m7839(this), j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream sorted() {
        return C0091.m8704(C0089.m8586(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return C0094.m9132(C0106.m11321(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return C0081.m7838(C0102.m11114(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return C0092.m8777(C0081.m7839(this));
    }

    public final /* synthetic */ java.util.stream.LongStream takeWhile(LongPredicate longPredicate) {
        return C0091.m8704(C0106.m11350(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return C0106.m11322(C0081.m7839(this));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return C0095.m9207(C0088.m8516(C0081.m7839(this)));
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        C0080.m7554(C0081.m7839(this));
        throw new Error(C0094.m9107(m10400(), 0, 93, 3098));
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.LongStream flatMap(LongFunction longFunction) {
        LongStream longStreamM7839 = C0081.m7839(this);
        C0519a c0519a = new C0519a(9);
        c0519a.b = longFunction;
        return C0091.m8704(C0079.m7500(longStreamM7839, c0519a));
    }
}
