package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0503c;
import j$.util.S;
import j$.util.T;
import j$.util.function.BiFunction$CC;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.C0564j;
import j$.util.stream.E;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: j$.time.۟۟۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0089 {

    /* JADX INFO: renamed from: ۦ۟ۧ۠, reason: contains not printable characters */
    public static int f476 = 4;

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static LongStream m8567(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((Stream) obj).m((C0519a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static e m8568(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((j$.time.zone.b) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m8569() {
        if (C0100.m10983() > 0) {
            AbstractC0644z0.k();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8570(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((Map) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static BiFunction m8571(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return BiFunction$CC.$default$andThen((BiFunction) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m8572(Object obj) {
        if (C0101.m11044() < 0) {
            return ((IntStream) obj).max();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8573(Object obj, char c) {
        if (C0097.m10823() > 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m8574(Object obj) {
        if (C0105.m11264() >= 0) {
            return Arrays.toString((double[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static Long m8575(Object obj) {
        if (C0095.m9210() > 0) {
            return ((PrimitiveIterator.OfLong) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static j m8576(Object obj) {
        if (C0106.m11345() < 0) {
            return ((j$.time.zone.b) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۤ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m8577(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((java.util.stream.Stream) obj).flatMap((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۥ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfDouble m8578(Object obj) {
        if (C0097.m10823() > 0) {
            return S.a((T) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8579(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0092.m8751(str) / 2);
        while (C0092.m8751(str) > 0) {
            C0106.m11329(byteArrayOutputStream, (C0080.m7569(strM11090, C0104.m11233(str, -2)) << 4) | C0080.m7569(strM11090, C0104.m11233(str, -1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM11190[i2] = (byte) (bArrM11190[i2] ^ C0104.m11233(strM110902, i2 % iM8751));
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m8580(Object obj, Object obj2, long j) {
        if (C0079.m7512() >= 0) {
            return ((j$.time.temporal.u) obj).j((j$.time.temporal.m) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static long m8582(Object obj, long j) {
        if (C0087.m8458() < 0) {
            return ((AtomicLong) obj).getAndAdd(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static List m8583() {
        if (C0091.m8708() >= 0) {
            return Collections.emptyList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m8584(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((C0503c) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static IntStream m8585(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            return ((IntStream) obj).peek((IntConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static LongStream m8586(Object obj) {
        if (C0081.m7818() < 0) {
            return ((LongStream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8587(double d, double d2) {
        if (C0096.m10782() > 0) {
            return Double.compare(d, d2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۢۤ, reason: not valid java name and contains not printable characters */
    public static n m8588() {
        if (m8594() < 0) {
            return n.JUNE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Collector m8589(Object obj) {
        if (C0104.m11196() >= 0) {
            return C0564j.a((j$.util.stream.Collector) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static List m8590(Object obj) {
        if (C0099.m10878() < 0) {
            return Collections.unmodifiableList((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m8591(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((DoubleStream) obj).reduce((DoubleBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۤ, reason: not valid java name and contains not printable characters */
    public static SortedMap m8592(Object obj, Object obj2, Object obj3) {
        if (C0105.m11264() > 0) {
            return ((SortedMap) obj).subMap(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m8593(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            ((DoubleStream) obj).forEachOrdered((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int m8594() {
        return (-1747915) ^ C0095.m9217((Object) "۠ۦۢ");
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static boolean m8595(Object obj) {
        if (C0087.m8458() < 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۨۧ, reason: contains not printable characters */
    public static long m8596() {
        if (C0081.m7818() <= 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦ۟, reason: contains not printable characters */
    public static Stream m8597(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((Stream) obj).filter((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۤ, reason: contains not printable characters */
    public static E m8598(Object obj) {
        if (C0092.m8724() < 0) {
            return ((E) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m8599() {
        if (C0091.m8708() > 0) {
            return j$.time.temporal.b.MONTHS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m8600(Object obj, long j, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((j$.time.temporal.m) obj).d(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.B m8601() {
        if (C0090.m8624() >= 0) {
            return j$.util.B.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m8602(Object obj) {
        if (C0100.m10983() >= 0) {
            return AccessController.doPrivileged((PrivilegedAction) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Optional m8603(Object obj) {
        if (C0102.m11109() < 0) {
            return ((java.util.stream.Stream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m8581(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
