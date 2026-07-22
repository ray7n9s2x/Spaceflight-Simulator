package j$.util.stream;

import j$.util.C0649u;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public interface E extends BaseStream {
    E a();

    j$.util.A average();

    E b(C0519a c0519a);

    Stream boxed();

    E c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    E d();

    E distinct();

    E e();

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    LongStream i();

    j$.util.F iterator();

    E limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.A max();

    j$.util.A min();

    boolean n();

    E parallel();

    E peek(DoubleConsumer doubleConsumer);

    IntStream r();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator);

    E sequential();

    E skip(long j);

    E sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.T spliterator();

    double sum();

    C0649u summaryStatistics();

    double[] toArray();

    boolean u();
}
