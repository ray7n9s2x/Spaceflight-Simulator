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
import j$.util.C0649u;
import j$.util.function.C0094;
import java.io.C0103;
import java.io.C0104;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements E {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f503short = {1365, 1406, 1385, 1406, 1343, 1319, 1332, 1343, 1374, 1359, 1366, 1343, 1403, 1402, 1388, 1386, 1400, 1406, 1389, 1398, 1393, 1400, 1343, 1335, 1395, 1398, 1405, 1389, 1406, 1389, 1382, 1343, 1403, 1402, 1388, 1386, 1400, 1406, 1389, 1398, 1393, 1400, 1334, 1343, 1404, 1406, 1393, 1393, 1392, 1387, 1343, 1404, 1392, 1393, 1385, 1402, 1389, 1387, 1343, 1401, 1389, 1392, 1394, 1343, 1397, 1406, 1385, 1406, 1329, 1386, 1387, 1398, 1395, 1329, 1371, 1392, 1386, 1405, 1395, 1402, 1356, 1386, 1394, 1394, 1406, 1389, 1382, 1356, 1387, 1406, 1387, 1398, 1388, 1387, 1398, 1404, 1388};
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ C(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ E j(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof D ? C0106.m11349((D) doubleStream) : new C(doubleStream);
    }

    /* JADX INFO: renamed from: ۟ۤۨۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m9364() {
        if (C0080.m7553() >= 0) {
            return f503short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m9365(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((DoubleStream) obj).takeWhile((DoublePredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m9366(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((DoubleStream) obj).dropWhile((DoublePredicate) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E a() {
        return C0097.m10804(C0105.m11286(C0103.m11149(this), null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A average() {
        return C0080.m7543(C0091.m8702(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream boxed() {
        return C0105.m11309(C0096.m10757(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E c() {
        return C0097.m10804(m9365(C0103.m11149(this), null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C0097.m10818(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return C0080.m7559(C0103.m11149(this), supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ long count() {
        return C0097.m10840(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E d() {
        return C0097.m10804(C0087.m8464(C0103.m11149(this), null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E distinct() {
        return C0097.m10804(C0104.m11243(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E e() {
        return C0097.m10804(m9366(C0103.m11149(this), null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStreamM11149 = C0103.m11149(this);
        if (obj instanceof C) {
            obj = C0103.m11149((C) obj);
        }
        return C0085.m8250(doubleStreamM11149, obj);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A findAny() {
        return C0080.m7543(C0090.m8621(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A findFirst() {
        return C0080.m7543(C0102.m11116(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        C0085.m8259(C0103.m11149(this), doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        C0089.m8593(C0103.m11149(this), doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean h() {
        return C0104.m11185(C0103.m11149(this), null);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ LongStream i() {
        return C0099.m10923(C0092.m8779(C0103.m11149(this), null));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return C0092.m8750(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.F iterator() {
        return C0082.m7992(C0084.m8083(C0103.m11149(this)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return C0079.m7474(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E limit(long j) {
        return C0097.m10804(C0086.m8275(C0103.m11149(this), j));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C0105.m11309(C0092.m8782(C0103.m11149(this), doubleFunction));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A max() {
        return C0080.m7543(C0085.m8266(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A min() {
        return C0080.m7543(C0101.m11049(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean n() {
        return C0096.m10790(C0103.m11149(this), null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0106.m11316(C0081.m7833(C0103.m11149(this), runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream parallel() {
        return C0106.m11316(C0101.m11032(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E parallel() {
        return C0097.m10804(C0097.m10810(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E peek(DoubleConsumer doubleConsumer) {
        return C0097.m10804(C0094.m9143(C0103.m11149(this), doubleConsumer));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ IntStream r() {
        return C0080.m7539(C0103.m11152(C0103.m11149(this), null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return C0087.m8478(C0103.m11149(this), d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return C0080.m7543(C0089.m8591(C0103.m11149(this), doubleBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final /* synthetic */ BaseStream sequential() {
        return C0106.m11316(C0103.m11130(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sequential() {
        return C0097.m10804(C0104.m11209(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E skip(long j) {
        return C0097.m10804(C0101.m11039(C0103.m11149(this), j));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sorted() {
        return C0097.m10804(C0099.m10868(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.T spliterator() {
        return C0083.m8073(C0086.m8280(C0103.m11149(this)));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.f0 spliterator() {
        return C0084.m8094(C0091.m8692(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double sum() {
        return C0088.m8564(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double[] toArray() {
        return C0090.m8644(C0103.m11149(this));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean u() {
        return C0099.m10912(C0103.m11149(this), null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0106.m11316(C0100.m10967(C0103.m11149(this)));
    }

    @Override // j$.util.stream.E
    public final C0649u summaryStatistics() {
        C0096.m10786(C0103.m11149(this));
        throw new Error(C0104.m11206(m9364(), 0, 97, 1311));
    }

    @Override // j$.util.stream.E
    public final E b(C0519a c0519a) {
        DoubleStream doubleStreamM11149 = C0103.m11149(this);
        C0519a c0519a2 = new C0519a(7);
        c0519a2.b = c0519a;
        return C0097.m10804(C0081.m7857(doubleStreamM11149, c0519a2));
    }
}
