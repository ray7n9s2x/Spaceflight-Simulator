package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.InterfaceC0502b;
import j$.util.Objects;
import j$.util.OptionalInt;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.IntPredicate$CC;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.DataInput;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.stream.DoubleStream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.stream.ۣ۟ۤۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0097 {

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int f552 = 24;

    /* JADX INFO: renamed from: ۟۠۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m10797() {
        if (C0090.m8624() >= 0) {
            return j$.time.temporal.a.HOUR_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m10798(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((j$.time.z) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10799(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.e m10800(long j, long j2) {
        if (C0106.m11345() < 0) {
            return j$.time.e.n(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static E m10801(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((E) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m10802(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.function.a m10803(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            return j$.com.android.tools.r8.a.a((BiConsumer) obj, (BiConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static E m10804(Object obj) {
        if (m10823() > 0) {
            return C.j((DoubleStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m10805(Object obj, long j) {
        if (C0089.m8594() < 0) {
            return ((java.util.stream.Stream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۢ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m10806(Object obj) {
        if (C0094.m9148() > 0) {
            return C0535d0.j((IntStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10807(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((j$.time.A) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m10808(Object obj, long j, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((InterfaceC0489b) obj).d(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10809(Object obj) {
        if (C0092.m8724() < 0) {
            return ((j$.time.zone.b) obj).w();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m10810(Object obj) {
        if (C0080.m7553() > 0) {
            return ((DoubleStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.LongStream m10811(Object obj) {
        if (C0084.m8116() > 0) {
            return ((java.util.stream.LongStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static Iterator m10812(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((java.util.stream.IntStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m10813(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((j$.time.h) obj).J();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۦ, reason: not valid java name and contains not printable characters */
    public static Spliterator m10814(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((Spliterator.OfInt) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m10815(Object obj, long j, Object obj2) {
        if (C0091.m8708() >= 0) {
            return j$.time.temporal.n.b((j$.time.temporal.m) obj, j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.LongStream m10816(Object obj, long j) {
        if (C0082.m7983() < 0) {
            return ((java.util.stream.LongStream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10817(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m10818(Object obj) {
        if (C0100.m10983() >= 0) {
            ((java.util.stream.BaseStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۦ, reason: not valid java name and contains not printable characters */
    public static Comparator m10819(Object obj) {
        if (C0090.m8624() > 0) {
            return ((j$.util.f0) obj).getComparator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۨ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m10820(int i) {
        if (C0099.m10878() < 0) {
            return OptionalInt.of(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10821(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            return ((j$.time.h) obj).K((j$.time.h) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m10822(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((DataInput) obj).readUTF();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m10823() {
        return 1755570 ^ C0095.m9217((Object) "ۨۦۡ");
    }

    /* JADX INFO: renamed from: ۠۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m10824(Object obj, long j) {
        if (C0089.m8594() <= 0) {
            return ((java.util.stream.IntStream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m10825(Object obj) {
        if (C0087.m8458() < 0) {
            return ((Map.Entry) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static Stream m10826(Object obj) {
        if (C0079.m7512() > 0) {
            return AbstractC0505e.g((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m10827(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((CharBuffer) obj).arrayOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m10828(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((j$.time.j) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.BaseStream m10829(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((C0544f) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.A m10830(int i, int i2, int i3) {
        if (C0082.m7983() < 0) {
            return j$.time.A.K(i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.A m10831(double d) {
        if (C0091.m8708() >= 0) {
            return j$.util.A.d(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.z m10832(Object obj, long j, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((j$.time.chrono.z) obj).J(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.j m10833(Object obj) {
        if (C0081.m7818() < 0) {
            return ((j$.time.zone.b) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.t m10834() {
        if (C0104.m11196() >= 0) {
            return j$.time.temporal.n.f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨ۟, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m10835(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((java.util.stream.IntStream) obj).mapToObj((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m10836(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            ((j$.util.T) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m10837(Object obj, long j) {
        if (C0100.m10983() > 0) {
            return ((j$.time.l) obj).O(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.y m10838(Object obj, long j) {
        if (C0101.m11044() <= 0) {
            return ((j$.time.y) obj).E(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Object[] m10839(Object obj, int i) {
        if (C0106.m11345() <= 0) {
            return Arrays.copyOf((Object[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m10840(Object obj) {
        if (C0092.m8724() < 0) {
            return ((DoubleStream) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10841(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨ۟۟, reason: not valid java name and contains not printable characters */
    public static OptionalLong m10842(Object obj) {
        if (C0104.m11196() >= 0) {
            return AbstractC0505e.r((j$.util.B) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۢ, reason: contains not printable characters */
    public static EnumC0548f3 m10843() {
        if (C0094.m9148() > 0) {
            return EnumC0548f3.LONG_VALUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public static CoderResult m10844() {
        if (C0106.m11345() < 0) {
            return CoderResult.OVERFLOW;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟, reason: contains not printable characters */
    public static int m10845(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            return ((j$.time.temporal.o) obj).k((j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۢ۟, reason: contains not printable characters */
    public static boolean m10846(Object obj, Object obj2, long j, Object obj3, Object obj4) {
        if (C0105.m11264() >= 0) {
            return ((Unsafe) obj).compareAndSwapObject(obj2, j, obj3, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static IntPredicate m10847(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            return IntPredicate$CC.$default$or((IntPredicate) obj, (IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۡ, reason: contains not printable characters */
    public static LongSummaryStatistics m10848(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((java.util.stream.LongStream) obj).summaryStatistics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۢ, reason: contains not printable characters */
    public static void m10849(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            ((java.util.stream.LongStream) obj).forEach((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.Z m10850(Object obj) {
        if (C0084.m8116() > 0) {
            return ((j$.util.Y) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧۤ, reason: not valid java name and contains not printable characters */
    public static Stream m10851(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((IntStream) obj).mapToObj((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥ, reason: not valid java name and contains not printable characters */
    public static Stream m10852(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((InterfaceC0502b) obj).parallelStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10854(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            return ((j$.time.j) obj).I((j$.time.j) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۧۤ, reason: not valid java name and contains not printable characters */
    public static long m10855(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((j$.time.chrono.s) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m10853(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
