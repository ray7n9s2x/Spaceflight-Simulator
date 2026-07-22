package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0650v;
import j$.util.C0653y;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.BiConsumer;
import java.util.function.C0106;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0599q implements DoubleFunction, ToDoubleFunction, IntFunction, DoubleBinaryOperator, Supplier, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0599q(int i) {
        this.a = i;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (C0085.m8257(this)) {
        }
        return C0094.m9150(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (C0085.m8257(this)) {
            case 15:
                break;
            case 20:
                break;
            case 24:
                break;
        }
        return C0097.m10803(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return C0085.m8245(d);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return C0106.m11351(j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return C0080.m7555(d, d2);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (C0085.m8257(this)) {
            case 13:
                return C0080.m7578(i, i2);
            case 16:
                return i + i2;
            default:
                return C0106.m11325(i, i2);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        return C0088.m8519(j, j2);
    }

    public /* synthetic */ Predicate negate() {
        switch (C0085.m8257(this)) {
        }
        return C0090.m8612(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (C0085.m8257(this)) {
        }
        return C0101.m11031(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (C0085.m8257(this)) {
            case 5:
                return C0088.m8502((j$.util.A) obj);
            case 6:
                return C0103.m11166((OptionalInt) obj);
            case 7:
                return C0094.m9141((j$.util.B) obj);
            default:
                return C0100.m10968((Optional) obj);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return C0090.m8616((Double) obj);
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return C0088.m8558((Long) obj);
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return C0081.m7858((Integer) obj);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (C0085.m8257(this)) {
            case 4:
                return new double[3];
            case 18:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (C0085.m8257(this)) {
            case 21:
                C0090.m8623((C0653y) obj, j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (C0085.m8257(this)) {
            case 15:
                C0095.m9168((C0650v) obj, (C0650v) obj2);
                break;
            case 20:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 24:
                C0095.m9190((C0653y) obj, (C0653y) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (C0085.m8257(this)) {
            case 14:
                C0099.m10904((C0650v) obj, i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (C0085.m8257(this)) {
            case 2:
                return new Double[i];
            case 9:
                return new Object[i];
            case 10:
                return new Integer[i];
            case 12:
                return C0102.m11105(i);
            default:
                return new Long[i];
        }
    }
}
