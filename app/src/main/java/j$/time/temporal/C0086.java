package j$.time.temporal;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0508h;
import j$.util.InterfaceC0654z;
import j$.util.T;
import j$.util.V;
import j$.util.W;
import j$.util.concurrent.C0093;
import j$.util.concurrent.z;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.BaseStream;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.E;
import j$.util.stream.H0;
import j$.util.stream.K0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.CoderResult;
import java.util.Comparator;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.concurrent.ForkJoinTask;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.time.temporal.ۧۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0086 {

    /* JADX INFO: renamed from: ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static int f461 = -72;

    /* JADX INFO: renamed from: ۟۟۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m8275(Object obj, long j) {
        if (C0104.m11196() > 0) {
            return ((DoubleStream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static byte m8276(Object obj) {
        if (C0082.m7983() < 0) {
            return ((ByteBuffer) obj).get();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static t m8277() {
        if (C0103.m11154() <= 0) {
            return n.e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Stream m8278(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((Stream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m8279(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            ((j$.time.format.o) obj).b((a) obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfDouble] */
    /* JADX INFO: renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfDouble m8280(Object obj) {
        if (C0084.m8116() > 0) {
            return ((DoubleStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8281(Object obj) {
        if (C0094.m9148() >= 0) {
            ((BaseStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m8282(Object obj, int i) {
        if (C0095.m9210() > 0) {
            return ((K0) obj).c(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۤ, reason: not valid java name and contains not printable characters */
    public static b m8283() {
        if (C0092.m8724() < 0) {
            return b.SECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static long m8284(long j, long j2) {
        if (C0084.m8116() >= 0) {
            return j$.com.android.tools.r8.a.e(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۧ, reason: not valid java name and contains not printable characters */
    public static Spliterator m8285(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((IntStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤ۠, reason: not valid java name and contains not printable characters */
    public static CoderResult m8286(int i) {
        if (C0079.m7512() > 0) {
            return CoderResult.unmappableForLength(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Stream m8287(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((Stream) obj).filter((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۣ, reason: not valid java name and contains not printable characters */
    public static long m8288(Object obj) {
        if (C0104.m11196() > 0) {
            return ((j$.time.h) obj).t();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m8289() {
        if (C0094.m9148() >= 0) {
            return BigDecimal.ZERO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m8290(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((j$.time.h) obj).z((InterfaceC0489b) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8292(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((InterfaceC0489b) obj).z((InterfaceC0489b) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static int m8293(Object obj, Object obj2, Object obj3) {
        if (C0090.m8624() >= 0) {
            return ((Comparator) obj).compare(obj2, obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8294(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            ((ThreadLocal) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8295(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((Map) obj).containsValue(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8296(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            ((E) obj).forEachOrdered((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m8297(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((j$.time.l) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۢ, reason: not valid java name and contains not printable characters */
    public static SortedMap m8298(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((SortedMap) obj).headMap(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m8299(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((ForkJoinTask) obj).invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m8300(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((E) obj).mapToObj((DoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۨ, reason: not valid java name and contains not printable characters */
    public static W m8301(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((j$.util.stream.IntStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static long m8302(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((PrimitiveIterator.OfLong) obj).nextLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m8303(Object obj, Object obj2, Object obj3) {
        if (C0082.m7983() <= 0) {
            return ((InterfaceC0654z) obj).getOrDefault(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.IntStream m8304(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((E) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static a m8305() {
        if (C0089.m8594() < 0) {
            return a.MILLI_OF_SECOND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8306(Object obj) {
        if (C0090.m8624() > 0) {
            return ((E) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8307(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((IntStream) obj).noneMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static T m8308(Object obj) {
        if (C0079.m7512() > 0) {
            return ((E) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8309(Object obj) {
        if (C0106.m11345() < 0) {
            return ((j$.time.n) obj).getValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m8310(int i, int i2) {
        if (C0101.m11044() <= 0) {
            return Integer.rotateLeft(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static int m8311(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((z) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m8312() {
        return 1746863 ^ C0095.m9217((Object) "۟ۤ۠");
    }

    /* JADX INFO: renamed from: ۡۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m8313(Object obj) {
        if (C0085.m8230() > 0) {
            return ((j$.time.j) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m8314(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m8315(String str) {
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
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM8751));
        }
        for (int iM87512 = 0; iM87512 < bArrM11190.length; iM87512 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۣۥۨ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.n m8316() {
        if (C0102.m11109() < 0) {
            return j$.time.n.FEBRUARY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.e m8317() {
        if (C0080.m7553() > 0) {
            return j$.time.e.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m8318(Object obj) {
        if (C0100.m10983() > 0) {
            return ((Enum) obj).name();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfInt m8319(Object obj) {
        if (C0105.m11264() >= 0) {
            return V.a((W) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8320(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((Predicate) obj).test(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۧۥ, reason: not valid java name and contains not printable characters */
    public static LongStream m8321(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((LongStream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۦۥ, reason: not valid java name and contains not printable characters */
    public static b m8322() {
        if (C0089.m8594() <= 0) {
            return b.NANOS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static j$.time.chrono.n m8323(Object obj) {
        if (C0087.m8458() <= 0) {
            return AbstractC0496i.p((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡ۠, reason: contains not printable characters */
    public static Buffer m8324(Object obj, int i) {
        if (C0080.m7553() > 0) {
            return ((ByteBuffer) obj).position(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
    public static void m8325(Object obj, Object obj2, int i) {
        if (C0091.m8708() > 0) {
            ((j$.time.format.o) obj).k((r) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۦۦۤۢ, reason: contains not printable characters */
    public static a m8326() {
        if (C0082.m7983() <= 0) {
            return a.MINUTE_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۤۧ, reason: contains not printable characters */
    public static int m8327(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((InterfaceC0492e) obj).x((InterfaceC0492e) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m8328(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((j$.time.j) obj).P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static H0 m8329(Object obj) {
        if (C0088.m8503() >= 0) {
            return AbstractC0644z0.P((H0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m8330(Object obj, Object obj2, Object obj3) {
        if (C0105.m11264() > 0) {
            return ((Stream) obj).reduce(obj2, (BinaryOperator) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8331(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((j$.time.l) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8332(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((A) obj).H((A) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8333(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            C0508h.a((String) obj, (Serializable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m8291(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
