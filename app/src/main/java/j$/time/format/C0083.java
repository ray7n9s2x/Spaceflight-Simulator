package j$.time.format;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
import j$.time.chrono.C;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0498k;
import j$.time.chrono.K;
import j$.time.temporal.C0085;
import j$.time.z;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.Collection$EL;
import j$.util.J;
import j$.util.Q;
import j$.util.T;
import j$.util.U;
import j$.util.X;
import j$.util.Z;
import j$.util.c0;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.BaseStream;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0593o3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0582m2;
import j$.util.stream.K0;
import j$.util.stream.Stream;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TimeZone;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.LongStream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.time.format.ۣ۟ۡۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0083 {

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f438 = 18;

    /* JADX INFO: renamed from: ۟۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m8015(Object obj) {
        if (C0097.m10823() > 0) {
            return ((LongStream) obj).average();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static long m8016(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((Instant) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m8017(Object obj, int i, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((ArrayList) obj).set(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static IntStream m8018(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((Stream) obj).mapToInt((ToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8019(Object obj, Object obj2, Object obj3) {
        if (C0089.m8594() < 0) {
            return ((ConcurrentHashMap) obj).remove(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m8020() {
        if (C0101.m11044() < 0) {
            return j$.time.temporal.b.WEEKS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8021(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((Stream) obj).anyMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8022() {
        return (-1748837) ^ C0095.m9217((Object) "ۡۥۤ");
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static List m8023(Object obj) {
        if (C0088.m8503() > 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static f0 m8024(Object obj) {
        if (C0091.m8708() > 0) {
            return Collection$EL.b((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m8025(Object obj, Object obj2) {
        if (m8022() <= 0) {
            return ((j$.time.l) obj).C((j$.time.l) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m8026(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            ((Consumer) obj).accept(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۥ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m8027(Object obj) {
        if (C0079.m7512() > 0) {
            return ((j$.util.function.f) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8028() {
        if (C0103.m11154() < 0) {
            return j$.time.temporal.a.MICRO_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۨ, reason: not valid java name and contains not printable characters */
    public static LongStream m8029(Object obj) {
        if (C0082.m7983() < 0) {
            return ((java.util.stream.IntStream) obj).asLongStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m8030(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            ((LongStream) obj).forEachOrdered((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۣ, reason: not valid java name and contains not printable characters */
    public static long m8031(Object obj) {
        if (C0085.m8230() >= 0) {
            return AbstractC0505e.d((f0) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static List m8032(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((j$.time.zone.f) obj).g((j$.time.j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static Type[] m8033(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((Class) obj).getGenericInterfaces();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfInt m8034(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((U) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static String m8035(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m8036() {
        if (C0089.m8594() < 0) {
            return j$.time.l.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8038(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            return ((List) obj).lastIndexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8039(Object obj, Object obj2, long j, int i, int i2) {
        if (C0092.m8724() <= 0) {
            return ((Unsafe) obj).compareAndSwapInt(obj2, j, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8040(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8041(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            AbstractC0644z0.e((InterfaceC0582m2) obj, (Double) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static K0 m8042(Object obj, int i) {
        if (C0106.m11345() < 0) {
            return ((K0) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۤ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfLong m8043(Object obj) {
        if (C0098.m10857() < 0) {
            return ((Spliterator.OfLong) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m8044(long j) {
        if (C0097.m10823() >= 0) {
            return j$.time.h.P(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m8045(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            ((J) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m8046() {
        if (C0103.m11154() <= 0) {
            return j$.sun.nio.cs.d.a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8047(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            ((PrimitiveIterator.OfLong) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static Set m8048(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((Collector) obj).characteristics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8049(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((BaseStream) obj).isParallel();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8050(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((Enum) obj).compareTo((Enum) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤ۠۠, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.n m8051(Object obj) {
        if (C0106.m11345() < 0) {
            return ((InterfaceC0498k) obj).a();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfInt] */
    /* JADX INFO: renamed from: ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfInt m8052(Object obj) {
        if (C0097.m10823() > 0) {
            return ((java.util.stream.IntStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8053(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((z) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m8054(Object obj) {
        if (C0084.m8116() > 0) {
            return ((ArrayDeque) obj).pollFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static long m8055(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((K) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static int m8056(Object obj) {
        if (C0088.m8503() > 0) {
            return ((j$.time.h) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static int m8057(Object obj) {
        if (C0087.m8458() < 0) {
            return ((Collection) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m8058(Object obj) {
        if (C0082.m7983() <= 0) {
            ((o) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static IntSummaryStatistics m8059(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((java.util.stream.IntStream) obj).summaryStatistics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8060(Object obj, int i) {
        if (C0090.m8624() > 0) {
            Arrays.fill((int[]) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۦۣ, reason: contains not printable characters */
    public static boolean m8061(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            return ((c0) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۨ, reason: contains not printable characters */
    public static Optional m8062() {
        if (C0097.m10823() >= 0) {
            return Optional.empty();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static int m8063(Object obj, int i) {
        if (C0090.m8624() >= 0) {
            return Arrays.binarySearch((int[]) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۤ, reason: contains not printable characters */
    public static j$.util.stream.LongStream m8064(Object obj) {
        if (C0088.m8503() > 0) {
            return ((j$.util.stream.LongStream) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡ۠, reason: contains not printable characters */
    public static Z m8065() {
        if (C0094.m9148() > 0) {
            return t0.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۢ۟, reason: contains not printable characters */
    public static Spliterator.OfLong m8066(Object obj) {
        if (C0095.m9210() > 0) {
            return ((X) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static j$.time.temporal.w m8067(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((C) obj).m((j$.time.temporal.a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۥ, reason: contains not printable characters */
    public static Map m8068(Object obj) {
        if (C0098.m10857() < 0) {
            return Collections.unmodifiableMap((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۤۥ, reason: contains not printable characters */
    public static int m8069(Object obj) {
        if (C0087.m8458() < 0) {
            return ((C0593o3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۢ, reason: contains not printable characters */
    public static IntStream m8070(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((IntStream) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۠ۤ, reason: contains not printable characters */
    public static boolean m8071(Object obj) {
        if (C0101.m11044() < 0) {
            return ((j$.util.stream.LongStream) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String[] m8072() {
        if (C0104.m11196() >= 0) {
            return TimeZone.getAvailableIDs();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۥ, reason: not valid java name and contains not printable characters */
    public static T m8073(Object obj) {
        if (C0084.m8116() >= 0) {
            return Q.a((Spliterator.OfDouble) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟۠, reason: not valid java name and contains not printable characters */
    public static double m8074(double d, double d2) {
        return C0084.m8116() > 0 ? Math.min(d, d2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۨۢۤۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m8075(long j, long j2) {
        if (C0088.m8503() >= 0) {
            return j$.time.temporal.w.k(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m8037(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
