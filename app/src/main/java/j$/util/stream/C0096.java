package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.InterfaceC0489b;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.List$EL;
import j$.util.Optional;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.lang.reflect.Field;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.OptionalLong;
import java.util.Set;
import java.util.Spliterator;
import java.util.TimeZone;
import java.util.concurrent.ForkJoinTask;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.LongPredicate;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.ۣ۟۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0096 {

    /* JADX INFO: renamed from: ۡۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int f551 = -83;

    /* JADX INFO: renamed from: ۟۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m10750(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            ((java.util.stream.Stream) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m10751(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return AbstractC0496i.j((InterfaceC0489b) obj, (j$.time.temporal.t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m10752(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Field[] m10753(Object obj) {
        if (C0106.m11345() < 0) {
            return ((Class) obj).getDeclaredFields();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m10754(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((Instant) obj).D();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.y m10755(Object obj, long j, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((j$.time.y) obj).D(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m10756(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0088.m8503() > 0) {
            return ((Stream) obj).reduce(obj2, (BiFunction) obj3, (BinaryOperator) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m10757(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((DoubleStream) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10758(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((j$.time.j) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static long[] m10759(Object obj, int i) {
        if (C0101.m11044() <= 0) {
            return Arrays.copyOf((long[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10760(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0595p0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static String m10761(Object obj) {
        if (C0099.m10878() <= 0) {
            return System.getProperty((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m10762(Object obj) {
        if (C0092.m8724() < 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m10763(Object obj, long j, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((j$.time.h) obj).Q(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m10764(Object obj) {
        if (C0092.m8724() < 0) {
            return ((j$.util.function.f) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10765(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((CharBuffer) obj).hasArray();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m10766(Object obj) {
        if (C0088.m8503() > 0) {
            return ((j$.time.j) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m10767(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            ((j$.util.J) obj).forEachRemaining((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static LongStream m10768(Object obj, long j) {
        if (m10782() > 0) {
            return ((LongStream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.c0 m10769(Object obj) {
        if (C0098.m10857() <= 0) {
            return j$.util.a0.a((Spliterator.OfPrimitive) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10770(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((java.util.stream.LongStream) obj).allMatch((LongPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۢ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.LongStream m10771(Object obj, long j) {
        if (C0091.m8708() > 0) {
            return ((java.util.stream.LongStream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ۟, reason: not valid java name and contains not printable characters */
    public static java.util.stream.BaseStream m10772(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((java.util.stream.BaseStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.J m10773(Object obj) {
        if (C0097.m10823() > 0) {
            return ((j$.util.I) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Iterator m10774(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m10775(String str) {
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

    /* JADX INFO: renamed from: ۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static double m10777(Object obj) {
        return C0091.m8708() > 0 ? ((j$.util.F) obj).nextDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10778(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((ListIterator) obj).hasPrevious();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ForkJoinTask m10779(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((ForkJoinTask) obj).fork();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static IntStream m10780(Object obj, long j) {
        if (C0102.m11109() < 0) {
            return ((IntStream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤۦ, reason: not valid java name and contains not printable characters */
    public static OptionalLong m10781(long j) {
        if (C0100.m10983() > 0) {
            return OptionalLong.of(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۦ, reason: not valid java name and contains not printable characters */
    public static int m10782() {
        return 1753704 ^ C0095.m9217((Object) "ۦۦۦ");
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static j$.time.w m10783(int i) {
        if (C0082.m7983() < 0) {
            return j$.time.w.C(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m10784(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return j$.time.temporal.n.c((j$.time.temporal.o) obj, (j$.time.temporal.t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m10785(Object obj) {
        if (C0084.m8116() > 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤ۟, reason: not valid java name and contains not printable characters */
    public static DoubleSummaryStatistics m10786(Object obj) {
        if (C0092.m8724() < 0) {
            return ((DoubleStream) obj).summaryStatistics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۨ, reason: contains not printable characters */
    public static void m10787(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            List$EL.sort((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡۨۨ, reason: contains not printable characters */
    public static j$.time.temporal.a m10788() {
        if (C0090.m8624() > 0) {
            return j$.time.temporal.a.HOUR_OF_AMPM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۧ, reason: contains not printable characters */
    public static void m10789(Object obj) {
        if (C0093.m9101() > 0) {
            ((j$.time.format.o) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۥۤۡ, reason: contains not printable characters */
    public static boolean m10790(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((DoubleStream) obj).anyMatch((DoublePredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤۧۤ, reason: contains not printable characters */
    public static long m10791(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((Stream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۦ۠, reason: contains not printable characters */
    public static TimeZone m10792(Object obj) {
        if (m10782() > 0) {
            return TimeZone.getTimeZone((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۥ, reason: contains not printable characters */
    public static j$.time.temporal.r m10793() {
        if (C0100.m10983() > 0) {
            return j$.time.temporal.j.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static Optional m10794(Object obj) {
        if (C0084.m8116() >= 0) {
            return Optional.d(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static BiConsumer m10795(Object obj) {
        if (C0097.m10823() > 0) {
            return ((java.util.stream.Collector) obj).accumulator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m10796(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            ((Spliterator.OfInt) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m10776(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
