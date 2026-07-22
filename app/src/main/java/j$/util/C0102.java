package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.BaseStream;
import j$.util.stream.C0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0585n0;
import j$.util.stream.H0;
import j$.util.stream.IntStream;
import j$.util.stream.J0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.۟ۦۢۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0102 {

    /* JADX INFO: renamed from: ۟ۢ۟۠۟, reason: not valid java name and contains not printable characters */
    public static boolean f563 = true;

    /* JADX INFO: renamed from: ۟۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static Stream m11062(Object obj, long j) {
        if (C0101.m11044() < 0) {
            return ((Stream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m11063(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            AbstractC0644z0.r((H0) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m11064(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            ((Spliterator.OfDouble) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static OptionalInt m11065(Object obj) {
        if (C0088.m8503() > 0) {
            return ((IntStream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static LongStream m11066(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((LongStream) obj).flatMap((LongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static LongStream m11067(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((C0585n0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m11068(Object obj) {
        if (C0098.m10857() < 0) {
            return Boolean.getBoolean((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static void m11069(Object obj) throws IOException {
        if (C0103.m11154() <= 0) {
            ((ObjectOutputStream) obj).writeFields();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟۠, reason: not valid java name and contains not printable characters */
    public static int m11070(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((j$.time.l) obj).T();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static IntStream m11071(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((IntStream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static long m11072(Object obj) {
        if (C0090.m8624() > 0) {
            return ((j$.time.temporal.w) obj).f();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦ۟, reason: not valid java name and contains not printable characters */
    public static long m11073(Object obj) {
        if (C0103.m11154() < 0) {
            return ((OptionalLong) obj).getAsLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.s m11074(Object obj, long j, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((j$.time.chrono.s) obj).P(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static BaseStream m11075(Object obj) {
        if (C0084.m8116() > 0) {
            return ((BaseStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m11076(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((StringBuffer) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.j m11077(Object obj, long j, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((j$.time.j) obj).Q(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.t m11078() {
        if (C0104.m11196() >= 0) {
            return j$.time.temporal.n.i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m11079(Object obj, int i) {
        if (C0104.m11196() >= 0) {
            return ((j$.time.l) obj).V(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static Comparator m11080(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((SortedSet) obj).comparator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m11081(Object obj) {
        if (C0094.m9148() > 0) {
            return ((Spliterator) obj).estimateSize();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m11082(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((ConcurrentHashMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m11083(Object obj, Object obj2, long j, long j2, long j3) {
        if (m11109() <= 0) {
            return ((Unsafe) obj).compareAndSwapLong(obj2, j, j2, j3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m11084(Object obj) {
        if (C0101.m11044() < 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۤ, reason: not valid java name and contains not printable characters */
    public static A m11085(Object obj) {
        if (C0090.m8624() > 0) {
            return ((j$.util.stream.E) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static IntStream m11086(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((IntStream) obj).dropWhile((IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m11087(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((Spliterator.OfLong) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۣ, reason: not valid java name and contains not printable characters */
    public static f0 m11088(Object obj) {
        if (C0083.m8022() < 0) {
            return ((InterfaceC0502b) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static long m11089(Object obj) {
        if (C0097.m10823() > 0) {
            return ((j$.time.chrono.s) obj).t();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m11090() {
        if (C0089.m8594() <= 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m11091(int i) {
        if (C0082.m7983() < 0) {
            return Integer.toString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static void m11092(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            ((IntStream) obj).forEach((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static long m11093(long j, long j2) {
        if (C0101.m11044() < 0) {
            return Math.max(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m11095(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j$.util.stream.Stream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m11096(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AtomicReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static void m11097(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            ((InterfaceC0502b) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥۦۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.j m11098(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((j$.time.j) obj).R((j$.time.h) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m11099(Object obj, char c) {
        if (C0098.m10857() < 0) {
            ((j$.time.format.o) obj).e(c);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.j m11100(long j, int i, Object obj) {
        if (C0087.m8458() <= 0) {
            return j$.time.j.L(j, i, (j$.time.A) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ, reason: not valid java name and contains not printable characters */
    public static Comparator m11101(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0504d) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static BigDecimal m11102(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((BigDecimal) obj).add((BigDecimal) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m11103(String str) {
        String strM11090 = m11090();
        String strM110902 = m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
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
        for (int iM87512 = 0; iM87512 < bArrM11190.length; iM87512 = C0092.m8751(m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۤۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static W m11104(Object obj) {
        if (C0100.m10983() > 0) {
            return ((W) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۥ, reason: not valid java name and contains not printable characters */
    public static Integer m11105(int i) {
        if (C0105.m11264() > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static long m11106(long j, long j2) {
        if (C0105.m11264() >= 0) {
            return j$.com.android.tools.r8.a.j(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m11107(Object obj, long j) {
        if (C0090.m8624() >= 0) {
            return ((TimeZone) obj).getOffset(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۤۤ, reason: contains not printable characters */
    public static int m11108(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((j$.sun.misc.a) obj).a((Class) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۢۢ, reason: contains not printable characters */
    public static int m11109() {
        return (-1752504) ^ C0095.m9217((Object) "ۥۢۡ");
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static j$.util.stream.E m11110(Object obj) {
        if (C0081.m7818() < 0) {
            return ((j$.util.stream.E) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨۤ, reason: contains not printable characters */
    public static int m11111(Object obj) {
        if (m11109() < 0) {
            return ((j$.time.h) obj).H();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۟, reason: contains not printable characters */
    public static boolean m11112(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((j$.util.stream.E) obj).h();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۤۦ, reason: contains not printable characters */
    public static int m11113(Object obj) {
        if (C0103.m11154() <= 0) {
            return Arrays.hashCode((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۥۧ, reason: contains not printable characters */
    public static f0 m11114(Object obj) {
        if (C0088.m8503() > 0) {
            return ((BaseStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m11115(char c) {
        if (m11109() <= 0) {
            return Character.isHighSurrogate(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m11116(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((DoubleStream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.LongStream m11117(Object obj) {
        if (C0079.m7512() > 0) {
            return ((IntStream) obj).asLongStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧۨ, reason: not valid java name and contains not printable characters */
    public static J0 m11118(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((C0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int m11119(Object obj, long j) {
        if (C0089.m8594() <= 0) {
            return Arrays.binarySearch((long[]) obj, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m11120(Object obj, Object obj2) {
        if (m11109() < 0) {
            return ((j$.time.chrono.n) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m11121(Object obj) {
        if (C0104.m11196() > 0) {
            return ((PrimitiveIterator.OfDouble) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۧ۠, reason: not valid java name and contains not printable characters */
    public static int m11122(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((Buffer) obj).limit();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m11094(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
