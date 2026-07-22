package java.io;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
import j$.time.chrono.AbstractC0488a;
import j$.time.chrono.C0081;
import j$.time.e;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.h;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.C0085;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.z;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.time.zone.f;
import j$.time.zone.j;
import j$.util.A;
import j$.util.AbstractC0505e;
import j$.util.B;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.Collection$EL;
import j$.util.M;
import j$.util.N;
import j$.util.OptionalInt;
import j$.util.T;
import j$.util.W;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0595p0;
import j$.util.stream.Collector;
import j$.util.stream.E;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CoderResult;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongToIntFunction;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: java.io.ۦۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0104 {

    /* JADX INFO: renamed from: ۦۥۧ, reason: contains not printable characters */
    public static int f565 = 33;

    /* JADX INFO: renamed from: ۟۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static IntStream m11182(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            return ((IntStream) obj).takeWhile((IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m11183(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((java.util.stream.IntStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static e m11184(long j) {
        if (C0105.m11264() >= 0) {
            return e.m(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m11185(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            return ((DoubleStream) obj).allMatch((DoublePredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Class m11186(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((Field) obj).getType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static double m11187() {
        return C0102.m11109() < 0 ? Math.random() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static long m11188(Object obj) {
        if (m11196() > 0) {
            return ((B) obj).b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Optional m11189(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((Stream) obj).min((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m11190(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static void m11191(Object obj, long j) {
        if (C0079.m7512() >= 0) {
            ((AtomicLong) obj).set(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int m11192(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((Field) obj).getModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤ۠, reason: not valid java name and contains not printable characters */
    public static A m11193(Object obj) {
        if (m11196() > 0) {
            return ((E) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m11194(Object obj, boolean z) {
        if (C0106.m11345() <= 0) {
            ((AtomicBoolean) obj).set(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static l m11195() {
        if (C0094.m9148() > 0) {
            return l.g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m11196() {
        return 1751535 ^ C0095.m9217((Object) "ۣۤ۠");
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static void m11197(Object obj, Object obj2) throws IOException {
        if (C0100.m10983() >= 0) {
            ((ObjectOutput) obj).writeObject(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۡ, reason: not valid java name and contains not printable characters */
    public static f m11198(Object obj) {
        if (C0099.m10878() < 0) {
            return ((z) obj).C();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m11199(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((Spliterator) obj).characteristics();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m11200(Object obj, int i, int i2) {
        if (C0099.m10878() <= 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static a m11201() {
        if (C0088.m8503() > 0) {
            return a.YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static long m11202(Object obj) {
        if (C0084.m8116() > 0) {
            return ((Instant) obj).G();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static long m11203(double d) {
        if (C0084.m8116() > 0) {
            return Double.doubleToLongBits(d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m11204(Object obj) {
        if (C0099.m10878() < 0) {
            return ((w) obj).h();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m11205(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((AbstractC0488a) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۧ, reason: not valid java name and contains not printable characters */
    public static LongStream m11207(Object obj, long j) {
        if (C0085.m8230() >= 0) {
            return ((LongStream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۥ, reason: not valid java name and contains not printable characters */
    public static BigInteger m11208(long j) {
        if (C0102.m11109() <= 0) {
            return BigInteger.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11209(Object obj) {
        if (C0089.m8594() < 0) {
            return ((DoubleStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m11210(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (m11187() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0092.m8751(str) / 2);
        for (int i2 = 0; i2 < C0092.m8751(str); i2 += 2) {
            C0106.m11329(byteArrayOutputStream, (C0080.m7569(strM11090, m11233(str, i2)) << 4) | C0080.m7569(strM11090, m11233(str, i2 + 1)));
        }
        byte[] bArrM11190 = m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        while (length > 0) {
            bArrM11190[-1] = (byte) (bArrM11190[-1] ^ m11233(strM110902, (-1) % iM8751));
        }
        for (int iM87512 = 0; iM87512 < bArrM11190.length; iM87512 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static EnumSet m11211(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return EnumSet.of((Enum) obj, (Enum) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static m m11212(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((p) obj).w((m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m11213(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((j$.util.stream.Stream) obj).sorted((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m11214(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((h) obj).s((r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static OptionalInt m11215(Object obj) {
        if (C0103.m11154() <= 0) {
            return AbstractC0505e.m((java.util.OptionalInt) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m11216(int i) {
        if (C0085.m8230() > 0) {
            return Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m11217(Object obj, int i) {
        if (C0090.m8624() >= 0) {
            return ((String) obj).substring(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۣ, reason: not valid java name and contains not printable characters */
    public static int m11218(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((C0595p0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m11219(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((T) obj).tryAdvance((DoubleConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Optional m11220(Object obj) {
        if (C0080.m7553() >= 0) {
            return AbstractC0505e.o((j$.util.Optional) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m11221(Object obj) {
        if (C0079.m7512() > 0) {
            return ((java.util.stream.IntStream) obj).average();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static CoderResult m11222(int i) {
        if (C0097.m10823() > 0) {
            return CoderResult.malformedForLength(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static h m11223(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((h) obj).W((p) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m11224(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((Spliterator.OfInt) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m11225(Object obj) {
        if (C0105.m11264() > 0) {
            return ((java.util.stream.IntStream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static Set m11226(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((ConcurrentHashMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۧۤ, reason: not valid java name and contains not printable characters */
    public static void m11227(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            Collection$EL.a((Collection) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥۥۦ, reason: not valid java name and contains not printable characters */
    public static Supplier m11228(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((Collector) obj).supplier();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static n m11229() {
        if (C0087.m8458() < 0) {
            return n.OCTOBER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۡ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfLong m11230(Object obj) {
        if (C0097.m10823() > 0) {
            return M.a((N) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m11231(Object obj, long j) {
        if (C0088.m8503() >= 0) {
            return ((LongToIntFunction) obj).applyAsInt(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m11232(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            return ((j$.util.stream.Stream) obj).peek((Consumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۥ, reason: not valid java name and contains not printable characters */
    public static char m11233(Object obj, int i) {
        if (C0101.m11044() < 0) {
            return ((String) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m11234(Object obj) {
        if (C0091.m8708() > 0) {
            return AbstractC0505e.p((A) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m11235(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            return ((java.util.stream.IntStream) obj).allMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m11236(Object obj) {
        if (C0085.m8230() >= 0) {
            j.d((j) obj);
        }
    }

    /* JADX INFO: renamed from: ۤۦۨۨ, reason: not valid java name and contains not printable characters */
    public static void m11237(Object obj, Object obj2, boolean z) {
        if (C0081.m7818() <= 0) {
            ((ObjectOutputStream.PutField) obj).put((String) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۥۣۤ, reason: contains not printable characters */
    public static int m11238(int i) {
        if (C0103.m11154() <= 0) {
            return Math.abs(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static boolean m11239(Object obj) {
        if (C0098.m10857() < 0) {
            return ((ByteBuffer) obj).hasArray();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۦ۠, reason: contains not printable characters */
    public static Object m11240(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((PrimitiveIterator.OfInt) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢ, reason: contains not printable characters */
    public static IntStream m11241(Object obj) {
        if (C0093.m9101() > 0) {
            return AbstractC0644z0.U((W) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠۟, reason: contains not printable characters */
    public static void m11242(Object obj, int i, char c) {
        if (C0101.m11044() < 0) {
            ((StringBuilder) obj).setCharAt(i, c);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠ۧ, reason: contains not printable characters */
    public static DoubleStream m11243(Object obj) {
        if (C0099.m10878() < 0) {
            return ((DoubleStream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m11244(Object obj, Object obj2, long j, Object obj3) {
        if (C0084.m8116() > 0) {
            return j$.com.android.tools.r8.a.h((Unsafe) obj, obj2, j, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۢۡ, reason: not valid java name and contains not printable characters */
    public static String m11245(Object obj) {
        if (C0103.m11154() < 0) {
            return ((z) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static l m11246(long j) {
        if (C0101.m11044() < 0) {
            return l.L(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.w m11247(Object obj, long j, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((j$.time.w) obj).D(j, (u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۢ۟, reason: not valid java name and contains not printable characters */
    public static BaseStream m11248(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((java.util.stream.IntStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m11206(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
