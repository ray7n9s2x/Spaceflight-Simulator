package j$.util.stream;

import j$.util.C0653y;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    LongStream a();

    E asDoubleStream();

    j$.util.A average();

    LongStream b(C0519a c0519a);

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d();

    LongStream distinct();

    LongStream e();

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    boolean g();

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    j$.util.N iterator();

    E k();

    LongStream limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.B max();

    j$.util.B min();

    boolean p();

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.B reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.Z spliterator();

    long sum();

    C0653y summaryStatistics();

    IntStream t();

    long[] toArray();
}
