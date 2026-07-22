package j$.util.function;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.D;
import j$.time.chrono.C0081;
import j$.time.chrono.E;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.chrono.K;
import j$.time.chrono.x;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.format.o;
import j$.time.format.v;
import j$.time.j;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.C0085;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.B;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0650v;
import j$.util.C0653y;
import j$.util.M;
import j$.util.N;
import j$.util.Optional;
import j$.util.W;
import j$.util.c0;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0549g;
import j$.util.stream.C0559i;
import j$.util.stream.C0564j;
import j$.util.stream.Collector;
import j$.util.stream.EnumC0554h;
import j$.util.stream.H0;
import j$.util.stream.H3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0592o2;
import j$.util.stream.J0;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.LongToIntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.function.۟ۥۦۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0095 {

    /* JADX INFO: renamed from: ۟ۢ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean f496 = true;

    /* JADX INFO: renamed from: ۟۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static D m9162(Object obj, long j, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((D) obj).D(j, (u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static Function m9163(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((Collector) obj).finisher();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static v m9164() {
        if (C0099.m10878() <= 0) {
            return v.EXCEEDS_PAD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static OptionalLong m9165(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((LongStream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m9166(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۥۤۢ, reason: not valid java name and contains not printable characters */
    public static Stream m9167(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((Stream) obj).peek((Consumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9168(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            ((C0650v) obj).b((C0650v) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Collector m9169(Object obj) {
        if (C0106.m11345() <= 0) {
            return C0559i.a((java.util.stream.Collector) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m9170(Object obj, Object obj2, long j, Object obj3) {
        if (C0079.m7512() >= 0) {
            ((Unsafe) obj).putObjectVolatile(obj2, j, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static n m9171(int i) {
        if (C0106.m11345() <= 0) {
            return n.F(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m9172(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((Stream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.format.a m9173() {
        if (C0091.m8708() > 0) {
            return j$.time.format.a.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m9174(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((IntStream) obj).sum();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m9175(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((LongStream) obj).mapToInt((LongToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m9176(Object obj, double d) {
        if (C0087.m8458() < 0) {
            return ((DoubleFunction) obj).apply(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0554h m9177() {
        if (C0089.m8594() <= 0) {
            return EnumC0554h.UNORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static J0 m9178(Object obj, long j, long j2) {
        if (C0103.m11154() <= 0) {
            return AbstractC0644z0.v((J0) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int m9179(Object obj, int i, int i2) {
        if (C0099.m10878() <= 0) {
            return ((IntBinaryOperator) obj).applyAsInt(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۤ, reason: not valid java name and contains not printable characters */
    public static E m9180(Object obj, long j, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((E) obj).K(j, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9181(Object obj, int i) {
        if (C0094.m9148() >= 0) {
            return ((Spliterator) obj).hasCharacteristics(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m9182() {
        if (C0100.m10983() >= 0) {
            return j$.time.temporal.a.MINUTE_OF_HOUR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m9183(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0093.m9101() > 0) {
            return ((Stream) obj).collect((Supplier) obj2, (BiConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۤ, reason: not valid java name and contains not printable characters */
    public static double m9184(double d) {
        return C0079.m7512() > 0 ? StrictMath.sqrt(d) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9185(Object obj) {
        if (C0080.m7553() >= 0) {
            ((o) obj).r();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۧ, reason: not valid java name and contains not printable characters */
    public static B m9186(Object obj) {
        if (C0079.m7512() >= 0) {
            return AbstractC0505e.n((OptionalLong) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۤ, reason: not valid java name and contains not printable characters */
    public static n m9187() {
        if (C0099.m10878() <= 0) {
            return n.MARCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static Consumer m9188(Object obj) {
        if (C0092.m8724() < 0) {
            return ((H3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0492e m9189(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((InterfaceC0498k) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m9190(Object obj, Object obj2) {
        if (C0098.m10857() < 0) {
            ((C0653y) obj).b((C0653y) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m9191() {
        if (C0091.m8708() >= 0) {
            return j$.time.temporal.a.EPOCH_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9192(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((Stream) obj).anyMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static Collector m9193(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((C0564j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m9194() {
        if (C0084.m8116() > 0) {
            return j$.time.temporal.b.MINUTES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m9195(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            ((PrimitiveIterator.OfDouble) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m9196(Object obj, long j, Object obj2) {
        if (C0087.m8458() < 0) {
            return ((InterfaceC0489b) obj).e(j, (u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.LongStream m9197(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((j$.util.stream.LongStream) obj).peek((LongConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static long m9198(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((r) obj).k((j$.time.temporal.o) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int m9199(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((j) obj).E();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m9200(Object obj, int i) {
        if (m9210() > 0) {
            ((StringBuilder) obj).setLength(i);
        }
    }

    /* JADX INFO: renamed from: ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static byte[] m9201(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((ByteBuffer) obj).array();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static W m9202() {
        if (C0091.m8708() >= 0) {
            return t0.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static x m9203() {
        if (C0090.m8624() >= 0) {
            return x.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static H0 m9205(Object obj, long j, long j2) {
        if (C0105.m11264() > 0) {
            return AbstractC0644z0.u((H0) obj, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m9206(Object obj) {
        if (C0096.m10782() > 0) {
            ((o) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9207(Object obj) {
        if (C0083.m8022() <= 0) {
            return C0549g.j((j$.util.stream.BaseStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۥ, reason: not valid java name and contains not printable characters */
    public static long m9208(Object obj, double d) {
        if (m9210() > 0) {
            return ((DoubleToLongFunction) obj).applyAsLong(d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9209(Object obj, double d) {
        if (C0093.m9101() > 0) {
            return ((StringBuilder) obj).append(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m9210() {
        return 1752609 ^ m9217((Object) "ۥۦۧ");
    }

    /* JADX INFO: renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m9211(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((java.util.stream.IntStream) obj).flatMap((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦ۠, reason: not valid java name and contains not printable characters */
    public static c0 m9212(Object obj) {
        if (C0087.m8458() < 0) {
            return ((c0) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦ, reason: contains not printable characters */
    public static Optional m9213(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((j$.util.stream.Stream) obj).max((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static j$.time.temporal.b m9214() {
        if (C0101.m11044() <= 0) {
            return j$.time.temporal.b.MILLENNIA;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۥۨ, reason: contains not printable characters */
    public static j$.time.temporal.b m9215() {
        if (C0101.m11044() < 0) {
            return j$.time.temporal.b.DAYS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۨ, reason: contains not printable characters */
    public static l m9216() {
        if (C0084.m8116() >= 0) {
            return l.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢ۟, reason: contains not printable characters */
    public static int m9217(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۥۦ, reason: contains not printable characters */
    public static Object m9220(Object obj, int i) {
        if (C0085.m8230() > 0) {
            return ((IntFunction) obj).apply(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m9221(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            C0080.m7588((InterfaceC0592o2) obj, (Long) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static Predicate m9222(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((i) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m9223(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((t) obj).a((j$.time.temporal.o) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥۨ, reason: not valid java name and contains not printable characters */
    public static K m9224(Object obj, long j, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((K) obj).K(j, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static N m9225(Object obj) {
        if (C0080.m7553() > 0) {
            return ((M) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9226(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j$.util.stream.E) obj).u();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m9227(Object obj, Object obj2, Object obj3) {
        if (C0101.m11044() < 0) {
            return ((ConcurrentHashMap) obj).putIfAbsent(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢ۟, reason: contains not printable characters */
    public static Class<?> m9218(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m9204(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۥۧۢ۟, reason: contains not printable characters */
    public static String m9219(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
