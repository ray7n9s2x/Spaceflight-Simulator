package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.EnumC0500d;
import j$.time.Instant;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0650v;
import j$.util.InterfaceC0502b;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.nio.CharBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoublePredicate;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongConsumer;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.stream.ۥۦ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0099 {

    /* JADX INFO: renamed from: ۟ۢ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean f554 = true;

    /* JADX INFO: renamed from: ۟۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10859(Object obj, int i) {
        if (C0083.m8022() < 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10860(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0594p) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static long m10861(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((InterfaceC0489b) obj).t();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m10862(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((java.util.stream.Stream) obj).collect((java.util.stream.Collector) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m10863(Object obj) {
        if (C0089.m8594() <= 0) {
            return Objects.requireNonNull(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m10864(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((ThreadLocal) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10865(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((java.util.stream.IntStream) obj).anyMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m10866(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            C0082.m7967((InterfaceC0587n2) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10867(Object obj) {
        if (C0080.m7553() > 0) {
            return ((ConcurrentHashMap) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m10868(Object obj) {
        if (C0084.m8116() > 0) {
            return ((DoubleStream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m10869(int i) {
        if (C0084.m8116() > 0) {
            return SecureRandom.getSeed(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m10870(Object obj) {
        if (C0097.m10823() > 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int[] m10871(Object obj, int i) {
        if (C0102.m11109() < 0) {
            return Arrays.copyOf((int[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۨ, reason: not valid java name and contains not printable characters */
    public static E m10872(Object obj, long j) {
        if (C0096.m10782() > 0) {
            return ((E) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m10873(Object obj, double d) {
        if (C0084.m8116() >= 0) {
            ((InterfaceC0582m2) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m10874(Object obj) {
        if (C0092.m8724() <= 0) {
            ((j$.time.format.o) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m10875(Object obj, Object obj2, long j) {
        if (C0084.m8116() > 0) {
            return ((Unsafe) obj).getObject(obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m10876(Object obj) {
        if (C0105.m11264() > 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m10877(Object obj, int i) {
        if (m10878() <= 0) {
            return ((IntUnaryOperator) obj).applyAsInt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m10878() {
        return (-1748789) ^ C0095.m9217((Object) "ۡۤۨ");
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Instant m10879(long j, long j2) {
        if (C0090.m8624() >= 0) {
            return Instant.ofEpochSecond(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m10880(Object obj) {
        if (C0094.m9148() > 0) {
            return ((j$.util.concurrent.i) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10881(Object obj, double d) {
        if (C0105.m11264() >= 0) {
            return ((DoublePredicate) obj).test(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Object m10882(Object obj) {
        if (C0084.m8116() > 0) {
            return ((SortedMap) obj).lastKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Stream m10883(Object obj) {
        if (C0091.m8708() > 0) {
            return ((InterfaceC0502b) obj).stream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m10884(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            return AbstractC0496i.d((InterfaceC0498k) obj, (InterfaceC0498k) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۧ, reason: not valid java name and contains not printable characters */
    public static char m10885(Object obj) {
        if (C0092.m8724() < 0) {
            return ((CharBuffer) obj).get();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۢ, reason: not valid java name and contains not printable characters */
    public static double m10886(double d) {
        return C0083.m8022() < 0 ? StrictMath.log(d) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Consumer m10887(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((j$.util.C) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۧ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m10888(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((java.util.stream.Stream) obj).mapToDouble((ToDoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m10889(Object obj) {
        if (C0092.m8724() <= 0) {
            ((j$.time.format.o) obj).v();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m10890(Object obj, long j) {
        if (C0094.m9148() > 0) {
            return ((j$.time.l) obj).P(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.Z m10891(Object obj) {
        if (C0106.m11345() <= 0) {
            return j$.util.X.a((Spliterator.OfLong) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.format.t m10892() {
        if (C0083.m8022() < 0) {
            return j$.time.format.t.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10893(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((Spliterator.OfLong) obj).tryAdvance((LongConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static OptionalLong m10894(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((java.util.stream.LongStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Object m10895(Object obj, Object obj2, long j) {
        if (C0082.m7983() < 0) {
            return ((Unsafe) obj).getObjectVolatile(obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m10896(Object obj) {
        if (C0094.m9148() > 0) {
            return ((C0519a) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m10898(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((I0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10899(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((LongStream) obj).s();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m10900(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m10901(long j) {
        if (C0079.m7512() > 0) {
            return Long.numberOfLeadingZeros(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۥ, reason: not valid java name and contains not printable characters */
    public static Iterator m10902(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((java.util.stream.LongStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m10903(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), m10931(i)));
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

    /* JADX INFO: renamed from: ۡۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m10904(Object obj, int i) {
        if (C0090.m8624() >= 0) {
            ((C0650v) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۡۨۡۨ, reason: not valid java name and contains not printable characters */
    public static int m10905(Object obj) {
        if (C0088.m8503() > 0) {
            return ((InterfaceC0489b) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static j$.sun.nio.cs.c m10906() {
        if (C0094.m9148() >= 0) {
            return j$.sun.nio.cs.c.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m10907(long j) {
        if (C0101.m11044() < 0) {
            return Math.abs(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.LongStream m10908(Object obj) {
        if (C0093.m9101() > 0) {
            return ((java.util.stream.LongStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static int m10909(Object obj) {
        if (C0094.m9148() > 0) {
            return ((H3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۥۦ, reason: not valid java name and contains not printable characters */
    public static Optional m10910(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((Stream) obj).min((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static j$.time.z m10911(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return j$.time.z.E((String) obj, (j$.time.A) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10912(Object obj, Object obj2) {
        if (m10878() < 0) {
            return ((DoubleStream) obj).noneMatch((DoublePredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static double m10913(Object obj, double d, Object obj2) {
        return C0093.m9101() >= 0 ? ((E) obj).reduce(d, (DoubleBinaryOperator) obj2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۤ۠۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m10914(Object obj) {
        if (C0080.m7553() > 0) {
            return ((j$.time.temporal.w) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m10915(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            ((j$.util.N) obj).forEachRemaining((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۦۣ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.n m10916(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((InterfaceC0489b) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static Consumer m10917(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return Consumer$CC.$default$andThen((Consumer) obj, (Consumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10918(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۧ, reason: contains not printable characters */
    public static long m10919(Object obj, int i) {
        if (C0097.m10823() >= 0) {
            return ((IntToLongFunction) obj).applyAsLong(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۦۤ, reason: contains not printable characters */
    public static PrimitiveIterator.OfDouble m10920(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j$.util.D) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۨ, reason: contains not printable characters */
    public static StringBuilder m10921(Object obj, int i) {
        if (C0090.m8624() > 0) {
            return ((StringBuilder) obj).deleteCharAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۧ, reason: contains not printable characters */
    public static Collector.Characteristics m10922() {
        if (C0096.m10782() >= 0) {
            return Collector.Characteristics.CONCURRENT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static LongStream m10923(Object obj) {
        if (C0081.m7818() <= 0) {
            return C0585n0.j((java.util.stream.LongStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m10924(Object obj) {
        if (C0079.m7512() > 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m10925(long j) {
        if (C0088.m8503() > 0) {
            return Long.toString(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m10926(int i) {
        if (C0079.m7512() >= 0) {
            return j$.time.l.J(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.z m10927(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((InterfaceC0498k) obj).q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int m10928(Object obj, int i, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((IntStream) obj).reduce(i, (IntBinaryOperator) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨۤ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.h m10929() {
        if (C0082.m7983() <= 0) {
            return j$.time.h.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.BaseStream m10930(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((java.util.stream.LongStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m10931(int i) {
        if (C0093.m9101() > 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static EnumC0500d m10932(int i) {
        if (C0081.m7818() <= 0) {
            return EnumC0500d.C(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10933(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((Spliterator.OfInt) obj).tryAdvance((IntConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m10934(Object obj, int i, int i2) {
        if (C0080.m7553() > 0) {
            Arrays.sort((int[]) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m10897(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
