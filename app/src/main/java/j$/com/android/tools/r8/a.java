package j$.com.android.tools.r8;

import j$.time.C0089;
import j$.util.function.c;
import j$.util.function.e;
import j$.util.function.h;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long e(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry f(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(C0099.m10863(str), C0099.m10863(str2));
    }

    public static /* synthetic */ List g(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C0099.m10918(arrayList, C0099.m10863(obj));
        }
        return C0089.m8590(arrayList);
    }

    public static /* synthetic */ boolean h(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!C0097.m10846(unsafe, obj, j, null, obj2)) {
            if (C0099.m10875(unsafe, obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long i(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long j(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long k(long j, long j2) {
        int iM10901 = C0099.m10901(~j2) + C0099.m10901(j2) + C0099.m10901(~j) + C0099.m10901(j);
        if (iM10901 > 65) {
            return j * j2;
        }
        if (iM10901 >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long l(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static c b(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
        C0099.m10863(doubleConsumer2);
        return new c(doubleConsumer, doubleConsumer2);
    }

    public static e c(IntConsumer intConsumer, IntConsumer intConsumer2) {
        C0099.m10863(intConsumer2);
        return new e(intConsumer, intConsumer2);
    }

    public static h d(LongConsumer longConsumer, LongConsumer longConsumer2) {
        C0099.m10863(longConsumer2);
        return new h(longConsumer, longConsumer2);
    }

    public static j$.util.function.a a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        C0099.m10863(biConsumer2);
        return new j$.util.function.a(biConsumer, biConsumer2);
    }
}
