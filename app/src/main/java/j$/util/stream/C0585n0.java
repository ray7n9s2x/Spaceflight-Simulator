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
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0653y;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0585n0 implements LongStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f543short = {2273, 2250, 2269, 2250, 2187, 2195, 2176, 2187, 2282, 2299, 2274, 2187, 2255, 2254, 2264, 2270, 2252, 2250, 2265, 2242, 2245, 2252, 2187, 2179, 2247, 2242, 2249, 2265, 2250, 2265, 2258, 2187, 2255, 2254, 2264, 2270, 2252, 2250, 2265, 2242, 2245, 2252, 2178, 2187, 2248, 2250, 2245, 2245, 2244, 2271, 2187, 2248, 2244, 2245, 2269, 2254, 2265, 2271, 2187, 2253, 2265, 2244, 2246, 2187, 2241, 2250, 2269, 2250, 2181, 2270, 2271, 2242, 2247, 2181, 2279, 2244, 2245, 2252, 2296, 2270, 2246, 2246, 2250, 2265, 2258, 2296, 2271, 2250, 2271, 2242, 2264, 2271, 2242, 2248, 2264};
    public final /* synthetic */ java.util.stream.LongStream a;

    private /* synthetic */ C0585n0(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ LongStream j(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0590o0 ? C0081.m7839((C0590o0) longStream) : new C0585n0(longStream);
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m10373() {
        if (C0082.m7983() <= 0) {
            return f543short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.LongStream m10374(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((java.util.stream.LongStream) obj).takeWhile((LongPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۦۡ, reason: contains not printable characters */
    public static java.util.stream.LongStream m10375(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((java.util.stream.LongStream) obj).dropWhile((LongPredicate) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream a() {
        return C0099.m10923(C0094.m9115(C0102.m11067(this), null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ E asDoubleStream() {
        return C0097.m10804(C0079.m7472(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.A average() {
        return C0080.m7543(C0083.m8015(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return C0105.m11309(C0085.m8247(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream c() {
        return C0099.m10923(m10374(C0102.m11067(this), null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0097.m10818(C0102.m11067(this));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return C0091.m8716(C0102.m11067(this), supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return C0084.m8077(C0102.m11067(this));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream d() {
        return C0099.m10923(C0079.m7510(C0102.m11067(this), null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return C0099.m10923(C0086.m8321(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream e() {
        return C0099.m10923(m10375(C0102.m11067(this), null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStreamM11067 = C0102.m11067(this);
        if (obj instanceof C0585n0) {
            obj = C0102.m11067((C0585n0) obj);
        }
        return C0085.m8250(longStreamM11067, obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.B findAny() {
        return C0095.m9186(C0095.m9165(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.B findFirst() {
        return C0095.m9186(C0081.m7850(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        C0097.m10849(C0102.m11067(this), longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        C0083.m8030(C0102.m11067(this), longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean g() {
        return C0080.m7589(C0102.m11067(this), null);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0102.m11067(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0092.m8750(C0102.m11067(this));
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ j$.util.N iterator() {
        return C0101.m11028(C0085.m8261(C0102.m11067(this)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return C0099.m10902(C0102.m11067(this));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ E k() {
        return C0097.m10804(C0091.m8659(C0102.m11067(this), null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return C0099.m10923(C0097.m10816(C0102.m11067(this), j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C0105.m11309(C0101.m11037(C0102.m11067(this), longFunction));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.B max() {
        return C0095.m9186(C0105.m11280(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.B min() {
        return C0095.m9186(C0099.m10894(C0102.m11067(this)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0106.m11316(C0081.m7833(C0102.m11067(this), runnable));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean p() {
        return C0085.m8242(C0102.m11067(this), null);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream parallel() {
        return C0106.m11316(C0094.m9108(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ LongStream parallel() {
        return C0099.m10923(C0099.m10908(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return C0099.m10923(C0091.m8674(C0102.m11067(this), longConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return C0079.m7526(C0102.m11067(this), j, longBinaryOperator);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.B reduce(LongBinaryOperator longBinaryOperator) {
        return C0095.m9186(C0081.m7819(C0102.m11067(this), longBinaryOperator));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean s() {
        return C0096.m10770(C0102.m11067(this), null);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream sequential() {
        return C0106.m11316(C0099.m10930(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ LongStream sequential() {
        return C0099.m10923(C0097.m10811(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return C0099.m10923(C0096.m10771(C0102.m11067(this), j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return C0099.m10923(C0091.m8689(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Z spliterator() {
        return C0099.m10891(C0100.m11009(C0102.m11067(this)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.f0 spliterator() {
        return C0084.m8094(C0091.m8684(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return C0103.m11153(C0102.m11067(this));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream t() {
        return C0080.m7539(C0095.m9175(C0102.m11067(this), null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return C0103.m11158(C0102.m11067(this));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0106.m11316(C0100.m10967(C0102.m11067(this)));
    }

    @Override // j$.util.stream.LongStream
    public final C0653y summaryStatistics() {
        C0097.m10848(C0102.m11067(this));
        throw new Error(C0080.m7573(m10373(), 0, 95, 2219));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b(C0519a c0519a) {
        java.util.stream.LongStream longStreamM11067 = C0102.m11067(this);
        C0519a c0519a2 = new C0519a(9);
        c0519a2.b = c0519a;
        return C0099.m10923(C0102.m11066(longStreamM11067, c0519a2));
    }
}
