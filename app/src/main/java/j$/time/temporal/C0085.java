package j$.time.temporal;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.DesugarArrays;
import j$.util.H;
import j$.util.J;
import j$.util.K;
import j$.util.N;
import j$.util.Z;
import j$.util.b0;
import j$.util.c0;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.d0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0599q;
import j$.util.stream.E;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.time.temporal.ۣۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0085 {

    /* JADX INFO: renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean f460 = true;

    /* JADX INFO: renamed from: ۟۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static Consumer m8223(Object obj) {
        if (C0099.m10878() < 0) {
            return ((K) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8224(Object obj, int i) {
        if (C0093.m9101() > 0) {
            return ((IntPredicate) obj).test(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8225(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((Set) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static J m8226(Object obj) {
        if (C0099.m10878() <= 0) {
            return H.a((PrimitiveIterator.OfInt) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8227(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return AbstractC0496i.i((j$.time.chrono.o) obj, (r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static Comparator m8228(Object obj) {
        if (C0083.m8022() < 0) {
            return ((SortedMap) obj).comparator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static r m8229() {
        if (C0088.m8503() > 0) {
            return j.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8230() {
        return 1754604 ^ C0095.m9217((Object) "ۧۤۥ");
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m8231(long j) {
        if (C0089.m8594() <= 0) {
            return j$.time.l.K(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8232(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((j$.time.j) obj).H((j$.time.j) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۦ, reason: not valid java name and contains not printable characters */
    public static a m8233() {
        if (C0087.m8458() <= 0) {
            return a.MICRO_OF_SECOND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m8234(Object obj) {
        if (C0079.m7512() > 0) {
            return ((ServiceLoader) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Z m8235(Object obj, int i, int i2) {
        if (C0092.m8724() < 0) {
            return t0.l((long[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8237(char c, char c2) {
        if (C0097.m10823() >= 0) {
            return Character.toCodePoint(c, c2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m8238(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((A) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8239(Object obj) {
        if (C0096.m10782() > 0) {
            return ((j$.time.l) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8240(Object obj, char c, Object obj2, int i, int i2) {
        if (C0103.m11154() < 0) {
            return ((j$.sun.nio.cs.e) obj).c(c, (char[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡ۟, reason: not valid java name and contains not printable characters */
    public static Stream m8241(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((IntStream) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8242(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((LongStream) obj).anyMatch((LongPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8243(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            return ((j$.time.h) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۤ, reason: not valid java name and contains not printable characters */
    public static Character m8244(char c) {
        if (C0088.m8503() >= 0) {
            return Character.valueOf(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ۠, reason: not valid java name and contains not printable characters */
    public static Double m8245(double d) {
        if (C0088.m8503() >= 0) {
            return Double.valueOf(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۨ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m8246(Object obj) {
        if (C0081.m7818() <= 0) {
            return AbstractC0505e.q((j$.util.OptionalInt) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m8247(Object obj) {
        if (C0096.m10782() > 0) {
            return ((LongStream) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m8248(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            ((E) obj).forEach((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static Collector.Characteristics m8249() {
        if (C0096.m10782() >= 0) {
            return Collector.Characteristics.IDENTITY_FINISH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8250(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static b m8251() {
        if (C0089.m8594() <= 0) {
            return b.HOURS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.format.u m8252() {
        if (C0095.m9210() >= 0) {
            return j$.time.format.u.SMART;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۧ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.l m8253(Object obj, long j) {
        if (C0092.m8724() <= 0) {
            return ((j$.time.l) obj).N(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۦۦ, reason: not valid java name and contains not printable characters */
    public static long m8254(Object obj) {
        if (C0081.m7818() < 0) {
            return ((N) obj).nextLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Supplier m8255(Object obj) {
        if (C0096.m10782() > 0) {
            return ((Collector) obj).supplier();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m8256(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
        }
        while (C0092.m8751(strM11090) > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0092.m8751(str) / 2);
        for (int i2 = 0; i2 < C0092.m8751(str); i2 += 2) {
            C0106.m11329(byteArrayOutputStream, (C0080.m7569(strM11090, C0104.m11233(str, i2)) << 4) | C0080.m7569(strM11090, C0104.m11233(str, i2 + 1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM8751));
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۢۦۦۢ, reason: not valid java name and contains not printable characters */
    public static int m8257(Object obj) {
        if (C0101.m11044() < 0) {
            return ((C0599q) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۥۦ, reason: not valid java name and contains not printable characters */
    public static Spliterator m8258(Object obj) {
        if (C0082.m7983() < 0) {
            return ((Spliterator.OfPrimitive) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8259(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            ((DoubleStream) obj).forEach((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static E m8260(Object obj) {
        if (C0098.m10857() < 0) {
            return ((E) obj).parallel();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.PrimitiveIterator$OfLong] */
    /* JADX INFO: renamed from: ۤۥ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfLong m8261(Object obj) {
        if (C0091.m8708() > 0) {
            return ((LongStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۥۥ, reason: contains not printable characters */
    public static Stream m8262(Object obj) {
        if (C0083.m8022() < 0) {
            return DesugarArrays.stream((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۥ, reason: contains not printable characters */
    public static Spliterator m8263(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((d0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨۢ, reason: contains not printable characters */
    public static j$.util.OptionalInt m8264(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((IntStream) obj).reduce((IntBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥ, reason: contains not printable characters */
    public static boolean m8265(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            return ((Spliterator.OfDouble) obj).tryAdvance((Consumer<? super Double>) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
    public static OptionalDouble m8266(Object obj) {
        if (m8230() >= 0) {
            return ((DoubleStream) obj).max();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Long m8267(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((N) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۦ, reason: not valid java name and contains not printable characters */
    public static long m8268(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return AbstractC0496i.g((j$.time.chrono.o) obj, (r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Field m8269(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((Class) obj).getDeclaredField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfPrimitive m8270(Object obj) {
        if (C0083.m8022() <= 0) {
            return b0.a((c0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m8271(Object obj, Object obj2, Object obj3) {
        if (C0094.m9148() > 0) {
            return ((ConcurrentHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۤ, reason: not valid java name and contains not printable characters */
    public static long m8272() {
        if (C0097.m10823() > 0) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8273(int i, int i2) {
        if (C0106.m11345() <= 0) {
            return Integer.compare(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۨۦ, reason: not valid java name and contains not printable characters */
    public static void m8274(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            ((PrimitiveIterator.OfInt) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8236(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
