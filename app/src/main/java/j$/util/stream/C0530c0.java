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
import j$.util.C0650v;
import j$.util.OptionalInt;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0530c0 implements IntStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f531short = {2396, 2423, 2400, 2423, 2358, 2350, 2365, 2358, 2391, 2374, 2399, 2358, 2418, 2419, 2405, 2403, 2417, 2423, 2404, 2431, 2424, 2417, 2358, 2366, 2426, 2431, 2420, 2404, 2423, 2404, 2415, 2358, 2418, 2419, 2405, 2403, 2417, 2423, 2404, 2431, 2424, 2417, 2367, 2358, 2421, 2423, 2424, 2424, 2425, 2402, 2358, 2421, 2425, 2424, 2400, 2419, 2404, 2402, 2358, 2416, 2404, 2425, 2427, 2358, 2428, 2423, 2400, 2423, 2360, 2403, 2402, 2431, 2426, 2360, 2399, 2424, 2402, 2373, 2403, 2427, 2427, 2423, 2404, 2415, 2373, 2402, 2423, 2402, 2431, 2405, 2402, 2431, 2421, 2405};
    public final /* synthetic */ java.util.stream.IntStream a;

    private /* synthetic */ C0530c0(java.util.stream.IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ IntStream j(java.util.stream.IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C0535d0 ? C0106.m11320((C0535d0) intStream) : new C0530c0(intStream);
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۧ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m10034(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((java.util.stream.IntStream) obj).takeWhile((IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m10035(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((java.util.stream.IntStream) obj).dropWhile((IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m10036() {
        if (C0081.m7818() < 0) {
            return f531short;
        }
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream a() {
        return C0080.m7539(C0087.m8473(C0087.m8475(this), null));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return C0104.m11235(C0087.m8475(this), intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return C0099.m10865(C0087.m8475(this), intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ E asDoubleStream() {
        return C0097.m10804(C0106.m11326(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ LongStream asLongStream() {
        return C0099.m10923(C0083.m8029(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ j$.util.A average() {
        return C0080.m7543(C0104.m11221(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ Stream boxed() {
        return C0105.m11309(C0087.m8484(C0087.m8475(this)));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0097.m10818(C0087.m8475(this));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return C0106.m11312(C0087.m8475(this), supplier, objIntConsumer, biConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ long count() {
        return C0104.m11225(C0087.m8475(this));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream distinct() {
        return C0080.m7539(C0080.m7586(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream dropWhile(IntPredicate intPredicate) {
        return C0080.m7539(m10035(C0087.m8475(this), intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.IntStream intStreamM8475 = C0087.m8475(this);
        if (obj instanceof C0530c0) {
            obj = C0087.m8475((C0530c0) obj);
        }
        return C0085.m8250(intStreamM8475, obj);
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ E f() {
        return C0097.m10804(C0092.m8790(C0087.m8475(this), null));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
        return C0080.m7539(C0092.m8791(C0087.m8475(this), intPredicate));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return C0104.m11215(C0105.m11256(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return C0104.m11215(C0100.m10978(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        C0084.m8117(C0087.m8475(this), intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        C0088.m8551(C0087.m8475(this), intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0087.m8475(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0092.m8750(C0087.m8475(this));
    }

    @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ j$.util.J iterator() {
        return C0085.m8226(C0094.m9138(C0087.m8475(this)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return C0097.m10812(C0087.m8475(this));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ LongStream l() {
        return C0099.m10923(C0094.m9151(C0087.m8475(this), null));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream limit(long j) {
        return C0080.m7539(C0097.m10824(C0087.m8475(this), j));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
        return C0105.m11309(C0097.m10835(C0087.m8475(this), intFunction));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return C0104.m11215(C0089.m8572(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return C0104.m11215(C0081.m7842(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return C0086.m8307(C0087.m8475(this), intPredicate);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0106.m11316(C0081.m7833(C0087.m8475(this), runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream parallel() {
        return C0106.m11316(C0104.m11248(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ IntStream parallel() {
        return C0080.m7539(C0104.m11183(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
        return C0080.m7539(C0089.m8585(C0087.m8475(this), intConsumer));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return C0092.m8769(C0087.m8475(this), i, intBinaryOperator);
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return C0104.m11215(C0082.m8004(C0087.m8475(this), intBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream sequential() {
        return C0106.m11316(C0079.m7501(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ IntStream sequential() {
        return C0080.m7539(C0092.m8736(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream skip(long j) {
        return C0080.m7539(C0081.m7823(C0087.m8475(this), j));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream sorted() {
        return C0080.m7539(C0080.m7566(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.W spliterator() {
        return C0091.m8686(C0083.m8052(C0087.m8475(this)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.f0 spliterator() {
        return C0084.m8094(C0086.m8285(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return C0100.m11014(C0087.m8475(this));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ IntStream takeWhile(IntPredicate intPredicate) {
        return C0080.m7539(m10034(C0087.m8475(this), intPredicate));
    }

    @Override // j$.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return C0090.m8640(C0087.m8475(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0106.m11316(C0100.m10967(C0087.m8475(this)));
    }

    @Override // j$.util.stream.IntStream
    public final C0650v summaryStatistics() {
        C0083.m8059(C0087.m8475(this));
        throw new Error(C0093.m9062(m10036(), 0, 94, 2326));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream o(R0 r0) {
        java.util.stream.IntStream intStreamM8475 = C0087.m8475(this);
        R0 r02 = new R0();
        r02.a = r0;
        return C0080.m7539(C0095.m9211(intStreamM8475, r02));
    }
}
