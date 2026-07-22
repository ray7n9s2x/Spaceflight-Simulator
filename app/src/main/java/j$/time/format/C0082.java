package j$.time.format;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0492e;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0650v;
import j$.util.D;
import j$.util.E;
import j$.util.F;
import j$.util.Optional;
import j$.util.S;
import j$.util.T;
import j$.util.concurrent.C0093;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.BaseStream;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.C0528b3;
import j$.util.stream.Collector;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0587n2;
import j$.util.stream.J0;
import j$.util.stream.R0;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.time.format.۟ۡۢۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0082 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f436short = {1577, 1433};

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean f437 = true;

    /* JADX INFO: renamed from: ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7967(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            ((InterfaceC0587n2) obj).m((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static int m7968() {
        if (C0099.m10878() <= 0) {
            return ForkJoinPool.getCommonPoolParallelism();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static IntStream m7969(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((IntStream) obj).o((R0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m7970(Object obj, Object obj2, Object obj3) {
        if (C0101.m11044() <= 0) {
            return ((BiFunction) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static Stream m7971(Object obj, long j) {
        if (C0101.m11044() < 0) {
            return ((Stream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m7972(Object obj) {
        if (C0094.m9148() > 0) {
            return ((Collector) obj).combiner();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۥ, reason: not valid java name and contains not printable characters */
    public static C0650v m7973(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((IntStream) obj).summaryStatistics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۨ, reason: not valid java name and contains not printable characters */
    public static Integer m7974(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((PrimitiveIterator.OfInt) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static CharBuffer m7975(Object obj, char c) {
        if (C0093.m9101() > 0) {
            return ((CharBuffer) obj).put(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۡ, reason: not valid java name and contains not printable characters */
    public static int m7976(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((j$.time.j) obj).x((InterfaceC0492e) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static char m7977(Object obj, int i) {
        if (C0101.m11044() < 0) {
            return ((StringBuilder) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7978() {
        if (C0106.m11345() <= 0) {
            return f436short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static long m7979(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((f0) obj).estimateSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡ۟, reason: not valid java name and contains not printable characters */
    public static String m7980(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0092.m8751(str) / 2);
        for (int i2 = 0; i2 < C0092.m8751(str); i2 += 2) {
            C0106.m11329(byteArrayOutputStream, (C0080.m7569(strM11090, C0104.m11233(str, i2)) << 4) | C0080.m7569(strM11090, C0104.m11233(str, i2 + 1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        String strM11206 = C0104.m11206(m7978(), 0, 1, 1608);
        while (C0092.m8751(strM11206) > 0) {
            strM11206 = C0102.m11090();
            if (C0092.m8751(strM11206) == 0) {
                strM11206 = C0093.m9062(m7978(), 1, 1, 1528);
            }
        }
        int iM8751 = C0092.m8751(strM11206);
        int iM87512 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < iM8751; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM87512));
        }
        for (int iM87513 = 0; iM87513 < bArrM11190.length; iM87513 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.function.e m7981(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return j$.com.android.tools.r8.a.c((IntConsumer) obj, (IntConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m7982(Object obj) {
        if (C0104.m11196() > 0) {
            return ((j$.time.n) obj).E();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m7983() {
        return (-1753665) ^ C0095.m9217((Object) "ۦۨ۠");
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m7984() {
        if (C0079.m7512() >= 0) {
            return j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static A m7985() {
        if (C0102.m11109() <= 0) {
            return A.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.A m7986(int i) {
        if (C0080.m7553() > 0) {
            return j$.time.chrono.A.A(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7987(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((Buffer) obj).hasRemaining();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۦۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m7988(Object obj, Object obj2) {
        if (C0105.m11264() >= 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m7989(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((j$.sun.misc.a) obj).k((Field) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m7990(Object obj) {
        if (C0079.m7512() > 0) {
            return ((A) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦۤ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m7991(Object obj, Object obj2) {
        if (m7983() < 0) {
            return ((java.util.stream.Stream) obj).flatMapToInt((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static F m7992(Object obj) {
        if (C0087.m8458() < 0) {
            return D.a((PrimitiveIterator.OfDouble) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7993(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((Runtime) obj).availableProcessors();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static C0519a m7994(Object obj) {
        if (C0093.m9101() >= 0) {
            return AbstractC0644z0.S((Function) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m7995(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            AbstractC0644z0.s((J0) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.w m7996(Object obj, long j, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((j$.time.w) obj).F(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m7997(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0091.m8708() >= 0) {
            return ((Stream) obj).collect((Supplier) obj2, (BiConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۨ, reason: not valid java name and contains not printable characters */
    public static void m7998(Object obj, Object obj2, int i) {
        if (C0103.m11154() < 0) {
            ((ObjectOutputStream.PutField) obj).put((String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۤۧۡۢ, reason: not valid java name and contains not printable characters */
    public static BaseStream m7999(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((BaseStream) obj).onClose((Runnable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m8000(Object obj) {
        if (C0088.m8503() >= 0) {
            return C0528b3.j((Stream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۢ, reason: contains not printable characters */
    public static j$.time.n m8001() {
        if (C0084.m8116() > 0) {
            return j$.time.n.APRIL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static T m8002(Object obj) {
        if (C0101.m11044() < 0) {
            return ((S) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۟ۨ, reason: contains not printable characters */
    public static void m8003(Object obj, int i, int i2) {
        if (C0106.m11345() < 0) {
            Arrays.sort((long[]) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۡۦ, reason: contains not printable characters */
    public static OptionalInt m8004(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((java.util.stream.IntStream) obj).reduce((IntBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۡ, reason: contains not printable characters */
    public static boolean m8005(Object obj) {
        if (C0087.m8458() < 0) {
            return ((OptionalDouble) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۦۥ, reason: contains not printable characters */
    public static void m8006(Object obj, Object obj2, long j, Object obj3) {
        if (C0105.m11264() >= 0) {
            ((j$.sun.misc.a) obj).l(obj2, j, obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۧۨۧ, reason: contains not printable characters */
    public static PrimitiveIterator.OfDouble m8007(Object obj) {
        if (C0085.m8230() > 0) {
            return E.a((F) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m8008(Object obj, Object obj2, Object obj3) {
        if (C0089.m8594() <= 0) {
            ((o) obj).g((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static Optional m8009(Object obj) {
        if (C0094.m9148() > 0) {
            return ((Stream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۢ, reason: not valid java name and contains not printable characters */
    public static long m8010(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((j$.time.e) obj).k();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۥۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m8011() {
        if (C0102.m11109() < 0) {
            return j$.time.temporal.b.FOREVER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۦ, reason: not valid java name and contains not printable characters */
    public static ListIterator m8012(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((List) obj).listIterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static Set m8013(Object obj) {
        if (C0081.m7818() <= 0) {
            return AbstractC0644z0.R((Set) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۣ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8014() {
        if (C0090.m8624() >= 0) {
            return j$.time.temporal.a.SECOND_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m7966(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
