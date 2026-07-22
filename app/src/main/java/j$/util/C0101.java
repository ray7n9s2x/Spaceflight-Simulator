package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.AbstractC0487c;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.Predicate$CC;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0545f0;
import j$.util.stream.Collector;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.ۣ۟ۦۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0101 {

    /* JADX INFO: renamed from: ۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean f562;

    /* JADX INFO: renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static LongStream m11015(Object obj) {
        if (C0104.m11196() > 0) {
            return ((IntStream) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m11016(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((ConcurrentHashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m11017(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((j$.util.function.g) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m11018(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static long m11019(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((Spliterator) obj).getExactSizeIfKnown();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static LongStream m11020(Object obj) {
        if (C0095.m9210() > 0) {
            return ((LongStream) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m11021(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۠۟۟, reason: not valid java name and contains not printable characters */
    public static BigDecimal m11022(Object obj, int i, Object obj2) {
        if (C0103.m11154() < 0) {
            return ((BigDecimal) obj).setScale(i, (RoundingMode) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m11023(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((Unsafe) obj).arrayBaseOffset((Class) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m11024(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return AbstractC0487c.a((String) obj, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.w m11025(Object obj, long j) {
        if (C0104.m11196() >= 0) {
            return ((j$.time.w) obj).E(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static long m11026(Object obj) {
        if (C0092.m8724() < 0) {
            return ((j$.time.l) obj).S();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static long m11027(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            return ((j$.time.y) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static N m11028(Object obj) {
        if (C0082.m7983() < 0) {
            return L.a((PrimitiveIterator.OfLong) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m11029(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Stream m11030(Object obj) {
        if (C0089.m8594() < 0) {
            return Collection$EL.stream((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m11031(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return Predicate$CC.$default$or((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static BaseStream m11032(Object obj) {
        if (C0089.m8594() < 0) {
            return ((DoubleStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m11033() {
        if (C0097.m10823() > 0) {
            return j$.time.temporal.a.INSTANT_SECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m11034(Object obj) {
        if (C0082.m7983() < 0) {
            return ((j$.util.stream.BaseStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m11035(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((Stream) obj).collect((Collector) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m11036(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            return j$.time.temporal.n.d((j$.time.temporal.o) obj, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m11037(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((java.util.stream.LongStream) obj).mapToObj((LongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static B m11038(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((LongStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11039(Object obj, long j) {
        if (C0079.m7512() >= 0) {
            return ((DoubleStream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m11040(Object obj, long j) {
        if (C0083.m8022() < 0) {
            return ((j$.time.temporal.w) obj).i(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static B m11041(Object obj) {
        if (C0095.m9210() > 0) {
            return ((LongStream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static java.util.OptionalInt m11042() {
        if (C0102.m11109() <= 0) {
            return java.util.OptionalInt.empty();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static double m11043(Object obj, int i) {
        return C0098.m10857() < 0 ? ((IntToDoubleFunction) obj).applyAsDouble(i) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m11044() {
        return (-1753357) ^ C0095.m9217((Object) "ۦ۠ۦ");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static long m11045(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((j$.time.A) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.concurrent.z m11046() {
        if (C0088.m8503() >= 0) {
            return j$.util.concurrent.z.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static double m11047(Object obj) {
        return C0095.m9210() > 0 ? ((j$.util.stream.E) obj).sum() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m11048(Object obj) {
        if (m11044() < 0) {
            return ((List) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۥۢ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m11049(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((DoubleStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static void m11050(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            ((Spliterator.OfLong) obj).forEachRemaining((Consumer<? super Long>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۦۤ, reason: contains not printable characters */
    public static void m11051(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            AbstractC0505e.b((W) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static StringBuilder m11052(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۦ, reason: contains not printable characters */
    public static boolean m11053(Object obj) {
        if (C0103.m11154() < 0) {
            return ((j$.time.temporal.a) obj).D();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۨ۟, reason: contains not printable characters */
    public static int m11054(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((C0545f0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۦ, reason: contains not printable characters */
    public static long m11055(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((j$.util.concurrent.z) obj).nextLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۡ, reason: contains not printable characters */
    public static Instant m11056(Object obj, long j, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((Instant) obj).F(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m11057(Object obj) {
        if (C0094.m9148() > 0) {
            return ((j$.util.function.f) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۡ, reason: not valid java name and contains not printable characters */
    public static ListIterator m11058(Object obj, int i) {
        if (C0093.m9101() > 0) {
            return ((List) obj).listIterator(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m11059(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0095.m9210() >= 0) {
            ((j$.time.format.o) obj).l((j$.time.temporal.r) obj2, i, i2, (j$.time.format.v) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m11061(Object obj) {
        if (C0080.m7553() > 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m11060(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
