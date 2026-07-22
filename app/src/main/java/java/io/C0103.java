package java.io;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.L;
import j$.time.chrono.u;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.format.v;
import j$.time.h;
import j$.time.j;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.C0085;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.o;
import j$.time.temporal.r;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0504d;
import j$.util.C0513m;
import j$.util.OptionalInt;
import j$.util.T;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.Collector;
import j$.util.stream.D;
import j$.util.stream.E;
import j$.util.stream.E0;
import j$.util.stream.LongStream;
import j$.util.t0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: java.io.ۣ۟ۨۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0103 {

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean f564;

    /* JADX INFO: renamed from: ۟۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m11123(Object obj, Object obj2, Object obj3) {
        if (C0100.m10983() > 0) {
            return ((EnumMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m11124(Object obj) {
        if (C0097.m10823() > 0) {
            return ((j) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static Spliterator m11125(Object obj) {
        if (C0079.m7512() > 0) {
            return ((Spliterator) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static byte m11126(Object obj) {
        if (C0105.m11264() > 0) {
            return ((DataInput) obj).readByte();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static long m11127(Object obj) {
        if (C0082.m7983() < 0) {
            return ((Stream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m11128(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((l) obj).I();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m11129(Object obj, int i, int i2) {
        if (C0101.m11044() <= 0) {
            return ((List) obj).subList(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static BaseStream m11130(Object obj) {
        if (C0102.m11109() < 0) {
            return ((DoubleStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static long m11131(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((l) obj).s((r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static n m11132() {
        if (C0082.m7983() <= 0) {
            return n.JANUARY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static long m11133(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            return AbstractC0496i.n((InterfaceC0492e) obj, (A) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static E m11134(Object obj) {
        if (C0099.m10878() <= 0) {
            return AbstractC0644z0.K((T) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static v m11136() {
        if (C0082.m7983() <= 0) {
            return v.ALWAYS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static A m11137() {
        if (C0102.m11109() < 0) {
            return A.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static Consumer m11138(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0513m) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static n m11139() {
        if (C0083.m8022() <= 0) {
            return n.DECEMBER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m11140(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((ListIterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static T m11141() {
        if (C0100.m10983() >= 0) {
            return t0.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static BiConsumer m11142(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((Collector) obj).accumulator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m11143(Object obj) {
        if (C0082.m7983() <= 0) {
            LockSupport.unpark((Thread) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۡ, reason: not valid java name and contains not printable characters */
    public static a[] m11144() {
        if (C0091.m8708() >= 0) {
            return a.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.A m11145(Object obj) {
        if (C0080.m7553() > 0) {
            return ((LongStream) obj).average();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static u m11146() {
        if (C0092.m8724() <= 0) {
            return u.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m11147(Object obj) {
        if (C0102.m11109() < 0) {
            return ((C0504d) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static SortedMap m11148(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((SortedMap) obj).tailMap(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11149(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m11150(Object obj, Object obj2) {
        if (m11154() <= 0) {
            ((Stream) obj).forEachOrdered((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Type m11151(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((ParameterizedType) obj).getRawType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static IntStream m11152(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((DoubleStream) obj).mapToInt((DoubleToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static long m11153(Object obj) {
        if (C0093.m9101() > 0) {
            return ((java.util.stream.LongStream) obj).sum();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m11154() {
        return (-1753657) ^ C0095.m9217((Object) "ۦۥۨ");
    }

    /* JADX INFO: renamed from: ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static char[] m11155(Object obj) {
        if (C0084.m8116() > 0) {
            return ((CharBuffer) obj).array();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static String m11156(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((BigDecimal) obj).toPlainString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m11157(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static long[] m11158(Object obj) {
        if (C0105.m11264() > 0) {
            return ((java.util.stream.LongStream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static L m11159() {
        if (C0106.m11345() < 0) {
            return L.BE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static n m11160() {
        if (C0094.m9148() > 0) {
            return n.AUGUST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m11161(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((r) obj).m((o) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static BigInteger m11162() {
        if (C0091.m8708() >= 0) {
            return BigInteger.ZERO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m11163(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((E0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11164(Object obj) {
        if (m11154() <= 0) {
            return D.j((E) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۤ, reason: contains not printable characters */
    public static String m11165(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(m11168(m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
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
        for (int iM87512 = 0; iM87512 < bArrM11190.length; iM87512 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۥۨ۟ۧ, reason: contains not printable characters */
    public static boolean m11166(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((OptionalInt) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static int m11167(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return j$.time.temporal.n.a((o) obj, (r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۥ, reason: contains not printable characters */
    public static StringBuffer m11168(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((StringBuffer) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۣ, reason: contains not printable characters */
    public static int m11169(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((j$.time.chrono.o) obj).getValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۠۠, reason: contains not printable characters */
    public static void m11170(Object obj, int i, int i2) {
        if (C0079.m7512() > 0) {
            Arrays.sort((double[]) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۥۣ, reason: contains not printable characters */
    public static LongStream m11171(Object obj) {
        if (C0088.m8503() > 0) {
            return ((LongStream) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧۤ, reason: contains not printable characters */
    public static int m11172(Object obj) {
        if (C0085.m8230() > 0) {
            return ((BigDecimal) obj).scale();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m11173(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨۦ, reason: not valid java name and contains not printable characters */
    public static h m11174(Object obj, long j) {
        if (C0088.m8503() >= 0) {
            return ((h) obj).S(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static double m11175(Object obj, double d, double d2) {
        return C0094.m9148() > 0 ? ((DoubleBinaryOperator) obj).applyAsDouble(d, d2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m11176(Object obj) {
        if (C0093.m9101() > 0) {
            return ((PrimitiveIterator.OfInt) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۧۦ, reason: not valid java name and contains not printable characters */
    public static Function m11177(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((java.util.stream.Collector) obj).finisher();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Set m11178(Object obj) {
        if (C0089.m8594() < 0) {
            return ((Map) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m11179(Object obj) {
        if (C0101.m11044() <= 0) {
            Arrays.sort((double[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۥۢۦ, reason: not valid java name and contains not printable characters */
    public static b m11180() {
        if (C0085.m8230() > 0) {
            return b.HALF_DAYS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m11181(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            return ((j$.util.stream.Stream) obj).dropWhile((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String m11135(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
