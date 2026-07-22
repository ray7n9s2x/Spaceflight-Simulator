package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0649u;
import j$.util.C0650v;
import j$.util.C0653y;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0569k implements BinaryOperator, Function, BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, IntFunction, DoubleBinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0569k(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static C0 m10271(long j) {
        if (C0093.m9101() >= 0) {
            return AbstractC0644z0.V(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static B0 m10272(long j) {
        if (C0104.m11196() > 0) {
            return AbstractC0644z0.T(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m10273(Object obj, double d) {
        if (C0105.m11264() >= 0) {
            Collectors.a((double[]) obj, d);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static A0 m10274(long j) {
        if (C0090.m8624() >= 0) {
            return AbstractC0644z0.J(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Set m10275() {
        if (C0098.m10857() <= 0) {
            return Collectors.a;
        }
        return null;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (C0088.m8499(this)) {
            case 2:
                break;
            case 4:
                break;
            case 20:
                break;
            case 24:
                break;
            case 25:
                break;
        }
        return C0097.m10803(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (C0088.m8499(this)) {
            case 0:
                break;
            case 11:
                break;
            case 13:
                break;
            case 15:
                break;
        }
        return C0089.m8571(this, function);
    }

    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m10276andThen(Function function) {
        return C0092.m8725(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (C0088.m8499(this)) {
            case 10:
                return m10274(j);
            case 11:
            default:
                return m10271(j);
            case 12:
                return m10272(j);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        m10275();
        return obj;
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return C0083.m8074(d, d2);
    }

    public /* synthetic */ Function compose(Function function) {
        return C0092.m8738(this, function);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (C0088.m8499(this)) {
            case 3:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                m10273(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 4:
            default:
                C0080.m7544((C0649u) obj, d);
                break;
            case 5:
                double[] dArr2 = (double[]) obj;
                m10273(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (C0088.m8499(this)) {
            case 6:
                return new G();
            case 7:
                return new H();
            case 8:
                return new I();
            case 9:
                return new J();
            case 18:
                return new C0649u();
            case 19:
                return new ArrayList();
            case 21:
                return new C0650v();
            case 22:
                return new C0653y();
            case 23:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (C0088.m8499(this)) {
            case 2:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                m10273(dArr, dArr2[0]);
                m10273(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 4:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                m10273(dArr3, dArr4[0]);
                m10273(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 20:
                C0097.m10799((List) obj, obj2);
                break;
            case 24:
                C0091.m8677((LinkedHashSet) obj, obj2);
                break;
            case 25:
                C0088.m8534((LinkedHashSet) obj, (LinkedHashSet) obj2);
                break;
            default:
                C0088.m8540((C0649u) obj, (C0649u) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (C0088.m8499(this)) {
            case 0:
                List list = (List) obj;
                m10275();
                C0100.m10990(list, (List) obj2);
                return list;
            case 11:
                return new T0((F0) obj, (F0) obj2);
            case 13:
                return new U0((H0) obj, (H0) obj2);
            case 15:
                return new V0((J0) obj, (J0) obj2);
            default:
                return new X0((L0) obj, (L0) obj2);
        }
    }
}
