package j$.time;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.AbstractC0505e;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0504d;
import j$.util.C0653y;
import j$.util.O;
import j$.util.W;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.Predicate$CC;
import j$.util.stream.A0;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.EnumC0554h;
import j$.util.stream.F0;
import j$.util.stream.LongStream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongPredicate;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.time.۟ۥۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0090 {

    /* JADX INFO: renamed from: ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean f477;

    /* JADX INFO: renamed from: ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8604() {
        if (C0080.m7553() > 0) {
            return j$.time.temporal.a.NANO_OF_SECOND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m8605(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0504d) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8606(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((Stream) obj).allMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m8607(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((InterfaceC0498k) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m8608(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            return ((j$.sun.misc.a) obj).b((Class) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8609(Object obj) {
        if (C0106.m11345() < 0) {
            ((CountedCompleter) obj).propagateCompletion();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m8610(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((Class) obj).cast(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m8611(Object obj, int i) {
        if (C0087.m8458() <= 0) {
            return Pattern.compile((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m8612(Object obj) {
        if (C0097.m10823() >= 0) {
            return Predicate$CC.$default$negate((Predicate) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۨ, reason: not valid java name and contains not printable characters */
    public static A m8613(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((j$.time.zone.b) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8614(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            ((O) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8615(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((BigDecimal) obj).compareTo((BigDecimal) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static double m8616(Object obj) {
        return C0106.m11345() < 0 ? ((Double) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0554h m8617() {
        if (C0103.m11154() <= 0) {
            return EnumC0554h.IDENTITY_FINISH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8618(Object obj) {
        if (C0098.m10857() < 0) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.t m8619() {
        if (m8624() >= 0) {
            return j$.time.chrono.t.AH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8620() {
        if (C0079.m7512() > 0) {
            return j$.time.temporal.a.DAY_OF_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۨ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m8621(Object obj) {
        if (C0079.m7512() > 0) {
            return ((DoubleStream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static A m8622(int i) {
        if (C0103.m11154() < 0) {
            return A.L(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m8623(Object obj, long j) {
        if (C0094.m9148() > 0) {
            ((C0653y) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m8624() {
        return 1746842 ^ C0095.m9217((Object) "ۣ۟ۤ");
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8625(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return AbstractC0505e.i((W) obj, (Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m8626(Object obj, int i) {
        if (C0095.m9210() > 0) {
            return Arrays.copyOf((byte[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static DoubleConsumer m8627(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((j$.util.function.c) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m8628(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m8629(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            return ((l) obj).k((j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8630(Object obj) {
        if (C0094.m9148() >= 0) {
            Arrays.sort((long[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static Instant m8631() {
        if (C0094.m9148() > 0) {
            return Instant.EPOCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8632(Object obj, long j) {
        if (C0079.m7512() > 0) {
            return ((LongPredicate) obj).test(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8633(Object obj) {
        if (C0084.m8116() >= 0) {
            ((ConcurrentHashMap) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m8634(Object obj, double d) {
        if (C0105.m11264() > 0) {
            ((DoubleConsumer) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m8635(Object obj, long j) {
        if (C0099.m10878() <= 0) {
            ((j$.time.temporal.a) obj).C(j);
        }
    }

    /* JADX INFO: renamed from: ۡۦۣۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8636() {
        if (C0099.m10878() <= 0) {
            return j$.time.temporal.a.NANO_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۤ۠, reason: not valid java name and contains not printable characters */
    public static F0 m8637(Object obj) {
        if (C0084.m8116() > 0) {
            return ((A0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۨ, reason: not valid java name and contains not printable characters */
    public static double[] m8638(Object obj, int i) {
        if (C0098.m10857() < 0) {
            return Arrays.copyOf((double[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.zone.f m8639(Object obj) {
        if (C0080.m7553() > 0) {
            return j$.time.zone.f.h((A) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int[] m8640(Object obj) {
        if (C0098.m10857() < 0) {
            return ((IntStream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥ۠, reason: not valid java name and contains not printable characters */
    public static long m8641(long j, long j2) {
        if (C0099.m10878() < 0) {
            return j$.com.android.tools.r8.a.i(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m8642(String str) {
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

    /* JADX INFO: renamed from: ۣۦۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8643(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            ((Spliterator.OfDouble) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static double[] m8644(Object obj) {
        if (C0098.m10857() < 0) {
            return ((DoubleStream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.n m8645(Object obj) {
        if (C0102.m11109() < 0) {
            return ((h) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۢ, reason: contains not printable characters */
    public static boolean m8646(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((Instant) obj).f((j$.time.temporal.r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۧ, reason: contains not printable characters */
    public static Object m8647(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((Instant) obj).v((j$.time.temporal.t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۟ۧ, reason: contains not printable characters */
    public static long m8648(Object obj) {
        if (m8624() > 0) {
            return ((LongStream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۤۦ, reason: contains not printable characters */
    public static boolean m8649(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((Stream) obj).noneMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۧ۠, reason: contains not printable characters */
    public static j$.util.stream.Stream m8650(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((j$.util.stream.Stream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨۨ, reason: contains not printable characters */
    public static j$.time.temporal.w m8651(Object obj) {
        if (m8624() >= 0) {
            return ((j$.time.temporal.a) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۢ, reason: contains not printable characters */
    public static int m8653(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((j$.util.function.b) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static Spliterator m8654(Object obj) {
        if (C0102.m11109() < 0) {
            return ((Spliterator.OfDouble) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m8655(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0105.m11264() > 0) {
            return ((LongStream) obj).collect((Supplier) obj2, (ObjLongConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m8656(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return AbstractC0496i.k((InterfaceC0492e) obj, (j$.time.temporal.t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m8657(Object obj, Object obj2, long j) {
        if (C0104.m11196() > 0) {
            return ((j$.time.temporal.r) obj).n((j$.time.temporal.m) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m8658(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨۧ, reason: contains not printable characters */
    public static String m8652(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
