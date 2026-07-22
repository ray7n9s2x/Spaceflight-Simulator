package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0519a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f528short = {1422, 1413, 1426, 1413, 1482, 1425, 1424, 1421, 1416, 1482, 1431, 1424, 1430, 1409, 1413, 1417, 1482, 1440, 1419, 1425, 1414, 1416, 1409, 1463, 1424, 1430, 1409, 1413, 1417, 1416, 1411, 1428, 1411, 1484, 1431, 1430, 1419, 1422, 1484, 1425, 1430, 1424, 1415, 1411, 1423, 1484, 1454, 1421, 1420, 1413, 1457, 1430, 1424, 1415, 1411, 1423, 1482, 1473, 1494, 1473, 1422, 1493, 1492, 1481, 1484, 1422, 1491, 1492, 1490, 1477, 1473, 1485, 1422, 1418, 1523, 1492, 1490, 1477, 1473, 1485};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C0519a(int i) {
        this.a = i;
    }

    public /* synthetic */ C0519a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m9919() {
        if (C0094.m9148() > 0) {
            return f528short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9920(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0553g3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9921(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0524b) obj).I();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۧ, reason: contains not printable characters */
    public static j$.util.f0 m9922(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0553g3) obj).d;
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (C0100.m10989(this)) {
            case 1:
                C0083.m8026((InterfaceC0597p2) C0099.m10896(this), obj);
                break;
            default:
                C0099.m10918((ArrayList) C0099.m10896(this), obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0100.m10989(this)) {
        }
        return C0099.m10917(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return C0092.m8725(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return C0092.m8738(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (C0100.m10989(this)) {
            case 0:
                return m9921((AbstractC0524b) C0099.m10896(this));
            default:
                return (j$.util.f0) C0099.m10896(this);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objM8486 = C0087.m8486((Function) C0099.m10896(this), obj);
        if (objM8486 == null) {
            return null;
        }
        if (objM8486 instanceof Stream) {
            return C0082.m8000((Stream) objM8486);
        }
        if (objM8486 instanceof java.util.stream.Stream) {
            return C0105.m11309((java.util.stream.Stream) objM8486);
        }
        if (objM8486 instanceof IntStream) {
            return C0097.m10806((IntStream) objM8486);
        }
        if (objM8486 instanceof java.util.stream.IntStream) {
            return C0080.m7539((java.util.stream.IntStream) objM8486);
        }
        if (objM8486 instanceof E) {
            return C0103.m11164((E) objM8486);
        }
        if (objM8486 instanceof DoubleStream) {
            return C0097.m10804((DoubleStream) objM8486);
        }
        if (objM8486 instanceof LongStream) {
            return C0091.m8704((LongStream) objM8486);
        }
        if (objM8486 instanceof java.util.stream.LongStream) {
            return C0099.m10923((java.util.stream.LongStream) objM8486);
        }
        C0086.m8333(C0103.m11135(m9919(), 56, 24, 1440), C0092.m8727(objM8486));
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objM9176 = C0095.m9176((DoubleFunction) C0099.m10896(this), d);
        if (objM9176 == null) {
            return null;
        }
        if (objM9176 instanceof E) {
            return C0103.m11164((E) objM9176);
        }
        if (objM9176 instanceof DoubleStream) {
            return C0097.m10804((DoubleStream) objM9176);
        }
        C0086.m8333(C0081.m7837(m9919(), 0, 29, 1508), C0092.m8727(objM9176));
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objM9067 = C0093.m9067((LongFunction) C0099.m10896(this), j);
        if (objM9067 == null) {
            return null;
        }
        if (objM9067 instanceof LongStream) {
            return C0091.m8704((LongStream) objM9067);
        }
        if (objM9067 instanceof java.util.stream.LongStream) {
            return C0099.m10923((java.util.stream.LongStream) objM9067);
        }
        C0086.m8333(C0082.m7966(m9919(), 29, 27, 1506), C0092.m8727(objM9067));
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (C0100.m10989(this)) {
            case 2:
                C0598p3 c0598p3 = (C0598p3) C0099.m10896(this);
                return C0081.m7848(m9922(c0598p3), m9920(c0598p3));
            case 3:
                C0607r3 c0607r3 = (C0607r3) C0099.m10896(this);
                return C0081.m7848(m9922(c0607r3), m9920(c0607r3));
            case 4:
                C0617t3 c0617t3 = (C0617t3) C0099.m10896(this);
                return C0081.m7848(m9922(c0617t3), m9920(c0617t3));
            default:
                I3 i3 = (I3) C0099.m10896(this);
                return C0081.m7848(m9922(i3), m9920(i3));
        }
    }
}
