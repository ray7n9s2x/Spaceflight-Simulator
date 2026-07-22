package j$.util.function;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.D;
import j$.time.chrono.A;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.z;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.format.v;
import j$.time.temporal.C0085;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.w;
import j$.time.y;
import j$.time.zone.C0087;
import j$.util.B;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.G;
import j$.util.Y;
import j$.util.Z;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.F0;
import j$.util.stream.IntStream;
import j$.util.stream.K0;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntToLongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.function.ۣ۟۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0094 {

    /* JADX INFO: renamed from: ۠ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean f495;

    /* JADX INFO: renamed from: ۟۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9108(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((LongStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static F0 m9109(Object obj) {
        if (C0099.m10878() <= 0) {
            return AbstractC0644z0.O((F0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static Set m9110(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static m m9111(Object obj, long j, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((m) obj).j(j, (j$.time.temporal.b) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m9112() {
        if (C0098.m10857() <= 0) {
            return j$.time.temporal.a.SECOND_OF_MINUTE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static F0 m9113(Object obj, long j, long j2) {
        if (C0081.m7818() < 0) {
            return AbstractC0644z0.t((F0) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9114(Object obj) {
        if (C0096.m10782() > 0) {
            return ((BaseStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static LongStream m9115(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((LongStream) obj).map((LongUnaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m9116(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            ((Stream) obj).forEachOrdered((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static IntStream m9117(Object obj, long j) {
        if (C0102.m11109() < 0) {
            return ((IntStream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9118(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            ((K0) obj).e(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static y m9119(Object obj, long j) {
        if (C0081.m7818() < 0) {
            return ((y) obj).F(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.zone.d[] m9120() {
        if (C0098.m10857() <= 0) {
            return j$.time.zone.d.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.h m9121(Object obj, int i) {
        if (C0101.m11044() <= 0) {
            return ((j$.time.h) obj).X(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static t m9122() {
        if (C0104.m11196() >= 0) {
            return n.j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9123(String str) {
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
        while (length > 0) {
            bArrM11190[-1] = (byte) (bArrM11190[-1] ^ C0104.m11233(strM110902, (-1) % iM8751));
        }
        for (int iM87512 = 0; iM87512 < bArrM11190.length; iM87512 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9124(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0102.m11109() < 0) {
            return ((ConcurrentHashMap) obj).replace(obj2, obj3, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m9125(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۤ, reason: not valid java name and contains not printable characters */
    public static v m9126() {
        if (C0104.m11196() >= 0) {
            return v.NOT_NEGATIVE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9127(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((ConcurrentHashMap) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m9128(Object obj) {
        if (C0091.m8708() > 0) {
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static Stream m9129(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((Stream) obj).map((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ۠, reason: not valid java name and contains not printable characters */
    public static LongStream m9130(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((java.util.stream.Stream) obj).mapToLong((ToLongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦ۠, reason: not valid java name and contains not printable characters */
    public static int m9131(Object obj) {
        if (C0099.m10878() < 0) {
            return ((q) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfLong m9132(Object obj) {
        if (m9148() > 0) {
            return Y.a((Z) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۦ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m9133(double d) {
        if (C0085.m8230() > 0) {
            return OptionalDouble.of(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static Consumer m9134(Object obj) {
        if (C0089.m8594() < 0) {
            return ((G) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static String m9135(Object obj) {
        if (C0089.m8594() <= 0) {
            return Arrays.toString((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m9136() {
        if (C0090.m8624() >= 0) {
            return j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m9137(Object obj, long j) {
        if (C0091.m8708() >= 0) {
            return ((j$.time.h) obj).R(j);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.PrimitiveIterator$OfInt] */
    /* JADX INFO: renamed from: ۠ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfInt m9138(Object obj) {
        if (C0105.m11264() > 0) {
            return ((java.util.stream.IntStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9139(Object obj, Object obj2) {
        if (m9148() > 0) {
            return ((CopyOnWriteArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9140(Object obj) {
        if (C0103.m11154() < 0) {
            return ((A) obj).getValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9141(Object obj) {
        if (C0106.m11345() < 0) {
            return ((B) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۥۣ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m9142(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((D) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m9143(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((DoubleStream) obj).peek((DoubleConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m9144(int i, int i2) {
        if (C0085.m8230() > 0) {
            return Integer.toString(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9145(Object obj, Object obj2, long j, int i, int i2) {
        if (C0083.m8022() <= 0) {
            return ((j$.sun.misc.a) obj).c(obj2, j, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static B m9146(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((j$.util.stream.LongStream) obj).max();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۢ, reason: not valid java name and contains not printable characters */
    public static long m9147(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((z) obj).s((r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m9148() {
        return 1752595 ^ C0095.m9217((Object) "ۥۥۨ");
    }

    /* JADX INFO: renamed from: ۤۨۦۨ, reason: not valid java name and contains not printable characters */
    public static w m9149(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            return ((r) obj).s((o) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۨ, reason: contains not printable characters */
    public static Predicate m9150(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            return Predicate$CC.$default$and((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤۢ, reason: contains not printable characters */
    public static LongStream m9151(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            return ((java.util.stream.IntStream) obj).mapToLong((IntToLongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۢ, reason: contains not printable characters */
    public static j$.time.temporal.b m9152() {
        if (C0081.m7818() < 0) {
            return j$.time.temporal.b.DECADES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢۡ, reason: contains not printable characters */
    public static Object m9153(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((PrimitiveIterator.OfLong) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static int m9154(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((j$.time.h) obj).M();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۡ, reason: contains not printable characters */
    public static j$.time.format.t m9155(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((j$.time.format.a) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۥ, reason: contains not printable characters */
    public static Object m9156(Object obj, int i) {
        if (m9148() >= 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static j$.time.h m9157() {
        if (C0100.m10983() >= 0) {
            return j$.time.h.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m9158(Object obj) {
        if (C0090.m8624() > 0) {
            return ((ListIterator) obj).nextIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۢۥ, reason: not valid java name and contains not printable characters */
    public static int m9159(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((Buffer) obj).position();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9160(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((j$.util.stream.LongStream) obj).p();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۨ۟, reason: not valid java name and contains not printable characters */
    public static long m9161(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((ToLongFunction) obj).applyAsLong(obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m9107(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
