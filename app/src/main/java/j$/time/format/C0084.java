package j$.time.format;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.chrono.E;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.zone.C0087;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.Z;
import j$.util.concurrent.C0093;
import j$.util.d0;
import j$.util.f0;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0528b3;
import j$.util.stream.C0593o3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0587n2;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.DataInput;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.time.format.ۣۣۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0084 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f439short = {1307, 1196};

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean f440 = true;

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8076(Object obj) {
        if (C0090.m8624() >= 0) {
            ((o) obj).o();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m8077(Object obj) {
        if (C0083.m8022() < 0) {
            return ((LongStream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Stream m8078(Object obj) {
        if (C0097.m10823() >= 0) {
            return AbstractC0505e.f((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8079(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m8080(long j, long j2) {
        if (C0102.m11109() < 0) {
            return j$.time.temporal.w.j(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8081(Object obj, long j, long j2) {
        if (C0087.m8458() <= 0) {
            return ((AtomicLong) obj).compareAndSet(j, j2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static long m8082(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((DataInput) obj).readLong();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.PrimitiveIterator$OfDouble] */
    /* JADX INFO: renamed from: ۟ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfDouble m8083(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((DoubleStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۤ, reason: not valid java name and contains not printable characters */
    public static long m8084(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((j$.time.j) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m8085(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((Optional) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m8086(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((E) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m8087(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((InterfaceC0492e) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8088(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            AbstractC0505e.s((Iterator) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.j m8089() {
        if (C0090.m8624() > 0) {
            return j$.time.j.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.t m8090() {
        if (C0104.m11196() >= 0) {
            return j$.time.temporal.n.k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8091(Object obj) {
        if (C0091.m8708() > 0) {
            return ((Class) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m8092(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            ((Spliterator.OfLong) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8093(Object obj) {
        if (C0081.m7818() < 0) {
            return ((j$.time.temporal.a) obj).v();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۣ, reason: not valid java name and contains not printable characters */
    public static f0 m8094(Object obj) {
        if (m8116() >= 0) {
            return d0.a((Spliterator) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠۟, reason: not valid java name and contains not printable characters */
    public static Optional m8095(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((Stream) obj).reduce((BinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.E m8096(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((j$.util.stream.E) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static long m8097(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            return ((j$.time.p) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m8098(Object obj, Object obj2, Object obj3) {
        if (C0091.m8708() > 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m8099(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((j$.time.temporal.o) obj).n((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.s m8100(Object obj, long j, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((j$.time.s) obj).D(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static j$.time.j m8101() {
        if (C0100.m10983() > 0) {
            return j$.time.j.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8102(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return AbstractC0505e.j((Z) obj, (Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m8103(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.h m8104(int i, Object obj, int i2) {
        if (C0090.m8624() >= 0) {
            return j$.time.h.O(i, (j$.time.n) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8105(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((List) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8106(Object obj, Object obj2, long j) {
        if (C0098.m10857() < 0) {
            ((ObjectOutputStream.PutField) obj).put((String) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static DoubleConsumer m8107(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((C0593o3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m8108(Object obj, long j) {
        if (C0099.m10878() < 0) {
            return ((j$.time.h) obj).T(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m8109(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((Class) obj).getSimpleName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static long m8110(Object obj) {
        if (C0082.m7983() < 0) {
            return ((IntStream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8111(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m8112(Object obj, Object obj2) {
        if (m8116() > 0) {
            AbstractC0644z0.g((InterfaceC0587n2) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8113() {
        if (C0101.m11044() < 0) {
            return f439short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m8114(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((Collector) obj).combiner();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m8115(Object obj) {
        if (C0105.m11264() > 0) {
            return ((IntStream) obj).max();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۧ, reason: contains not printable characters */
    public static int m8116() {
        return 1746808 ^ C0095.m9217((Object) "۟ۡۧ");
    }

    /* JADX INFO: renamed from: ۥۦۨۧ, reason: contains not printable characters */
    public static void m8117(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            ((java.util.stream.IntStream) obj).forEach((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨ۠ۢ, reason: contains not printable characters */
    public static j$.time.temporal.a m8118() {
        if (C0091.m8708() >= 0) {
            return j$.time.temporal.a.DAY_OF_MONTH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۧ, reason: contains not printable characters */
    public static j$.time.temporal.w m8119(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            return ((j$.time.chrono.q) obj).G((j$.time.temporal.a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static String m8121(String str) {
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
        String strM9204 = C0095.m9204(m8113(), 0, 1, 1402);
        while (C0092.m8751(strM9204) > 0) {
            strM9204 = C0102.m11090();
            if (C0092.m8751(strM9204) == 0) {
                strM9204 = C0087.m8474(m8113(), 1, 1, 1229);
            }
        }
        int iM8751 = C0092.m8751(strM9204);
        int iM87512 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < iM8751; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM87512));
        }
        for (int iM87513 = 0; iM87513 < bArrM11190.length; iM87513 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۦۦۨۡ, reason: contains not printable characters */
    public static j$.time.temporal.a m8122() {
        if (C0093.m9101() >= 0) {
            return j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Stream m8123(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((C0528b3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m8124(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((Set) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Optional m8125() {
        if (C0081.m7818() < 0) {
            return Optional.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8126(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((TimeZone) obj).getRawOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧ۟۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0498k m8127(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((InterfaceC0492e) obj).p((A) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m8128(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0098.m10857() <= 0) {
            return ((java.util.stream.Stream) obj).reduce(obj2, (BiFunction) obj3, (BinaryOperator) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۨ, reason: contains not printable characters */
    public static String m8120(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
