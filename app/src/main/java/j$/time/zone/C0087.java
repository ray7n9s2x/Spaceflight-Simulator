package j$.time.zone;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.o;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.l;
import j$.time.temporal.C0085;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.w;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.F;
import j$.util.N;
import j$.util.OptionalInt;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0530c0;
import j$.util.stream.E;
import j$.util.stream.G0;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0592o2;
import j$.util.stream.InterfaceC0597p2;
import j$.util.stream.K0;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.U;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.math.BigDecimal;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongUnaryOperator;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.time.zone.۟ۢۧۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0087 {

    /* JADX INFO: renamed from: ۨۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int f474 = -80;

    /* JADX INFO: renamed from: ۟۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m8445(Object obj, Object obj2) {
        if (C0098.m10857() < 0) {
            AbstractC0644z0.i((InterfaceC0592o2) obj, (Long) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static void m8446() {
        if (C0096.m10782() >= 0) {
            AbstractC0644z0.a();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m8447(Object obj, long j) {
        if (C0093.m9101() >= 0) {
            return ((LongUnaryOperator) obj).applyAsLong(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Set m8448(Object obj) {
        if (C0101.m11044() < 0) {
            return Collections.unmodifiableSet((Set) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧ۟, reason: not valid java name and contains not printable characters */
    public static double m8449(Object obj, long j) {
        return C0094.m9148() >= 0 ? ((LongToDoubleFunction) obj).applyAsDouble(j) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8450(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۧۧۨ, reason: not valid java name and contains not printable characters */
    public static F m8451(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((E) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0492e m8452(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((InterfaceC0489b) obj).u((l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static EnumSet m8453(Object obj) {
        if (C0080.m7553() >= 0) {
            return EnumSet.of((Enum) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m8454(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return AbstractC0496i.m((o) obj, (t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8455(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m8456(Object obj) {
        if (C0105.m11264() > 0) {
            return ((G0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠۟, reason: not valid java name and contains not printable characters */
    public static void m8457(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            ((ArrayDeque) obj).addFirst(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m8458() {
        return (-1750552) ^ C0095.m9217((Object) "ۣ۠ۥ");
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m8459(Object obj, Object obj2) {
        if (m8458() <= 0) {
            return ((Stream) obj).toArray((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static A m8460() {
        if (C0105.m11264() > 0) {
            return A.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfPrimitive m8461(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((Spliterator.OfPrimitive) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int[] m8462(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((IntStream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static double m8463(Object obj) {
        return C0085.m8230() >= 0 ? ((OptionalDouble) obj).getAsDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m8464(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((DoubleStream) obj).filter((DoublePredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m8465(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            ((PrimitiveIterator.OfDouble) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m8466(Object obj, char c, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((j$.sun.nio.cs.e) obj).b(c, (CharBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۧ, reason: not valid java name and contains not printable characters */
    public static E m8467(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((IntStream) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۢ, reason: not valid java name and contains not printable characters */
    public static d m8468() {
        if (C0083.m8022() <= 0) {
            return d.UTC;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟۟, reason: not valid java name and contains not printable characters */
    public static double m8469(long j) {
        return C0080.m7553() >= 0 ? Double.longBitsToDouble(j) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8470(char c) {
        if (C0081.m7818() < 0) {
            return Character.isLowSurrogate(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m8471(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((IntStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static List m8472(Object obj) {
        if (C0091.m8708() >= 0) {
            return j$.com.android.tools.r8.a.g((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m8473(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((java.util.stream.IntStream) obj).map((IntUnaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m8475(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0530c0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m8476(Object obj) {
        if (C0095.m9210() > 0) {
            return ((U) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥۢ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m8477(long j) {
        if (C0079.m7512() > 0) {
            return BigDecimal.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۢ, reason: not valid java name and contains not printable characters */
    public static double m8478(Object obj, double d, Object obj2) {
        return C0089.m8594() < 0 ? ((DoubleStream) obj).reduce(d, (DoubleBinaryOperator) obj2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۢۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8479(Object obj) {
        if (C0089.m8594() < 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Boolean m8480() {
        if (C0091.m8708() > 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m8481(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return IntPredicate$CC.$default$and((IntPredicate) obj, (IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8482(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            ((ListIterator) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m8483(Object obj, Object obj2, long j) {
        if (C0080.m7553() >= 0) {
            return ((j$.sun.misc.a) obj).f(obj2, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m8484(Object obj) {
        if (C0099.m10878() < 0) {
            return ((java.util.stream.IntStream) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8485(Object obj) {
        if (C0079.m7512() > 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m8486(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((Function) obj).apply(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۢ, reason: contains not printable characters */
    public static j$.time.temporal.b[] m8487() {
        if (C0100.m10983() > 0) {
            return j$.time.temporal.b.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧ۠, reason: contains not printable characters */
    public static j$.time.temporal.a m8488() {
        if (C0101.m11044() < 0) {
            return j$.time.temporal.a.AMPM_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static StringBuilder m8489(Object obj, long j) {
        if (C0088.m8503() >= 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۦۤ, reason: contains not printable characters */
    public static j$.time.temporal.b m8490() {
        if (C0088.m8503() > 0) {
            return j$.time.temporal.b.MICROS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۡ, reason: contains not printable characters */
    public static int m8491(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return AbstractC0496i.f((o) obj, (j$.time.temporal.a) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۥۧ, reason: contains not printable characters */
    public static N m8492(Object obj) {
        if (C0105.m11264() > 0) {
            return ((LongStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۡ, reason: contains not printable characters */
    public static void m8493(Object obj, int i, Object obj2) {
        if (C0106.m11345() < 0) {
            ((K0) obj).r(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۢۤ, reason: contains not printable characters */
    public static w m8494(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((j$.time.w) obj).n((r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m8495() {
        if (C0085.m8230() >= 0) {
            return j$.time.temporal.b.CENTURIES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m8496(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            ((PrimitiveIterator.OfInt) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8497(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((q) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۡۨ, reason: not valid java name and contains not printable characters */
    public static E m8498(Object obj) {
        if (C0091.m8708() > 0) {
            return ((E) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m8474(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
