package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.EnumC0548f3;
import j$.util.stream.EnumC0554h;
import j$.util.stream.LongStream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalLong;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.LongBinaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.۟۠ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0100 {

    /* JADX INFO: renamed from: ۟۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean f561 = true;

    /* JADX INFO: renamed from: ۟۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static int m10963(Object obj) {
        if (C0081.m7818() < 0) {
            return ((ListIterator) obj).previousIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static Class m10964() {
        if (C0084.m8116() > 0) {
            return Long.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢ۟, reason: not valid java name and contains not printable characters */
    public static IntStream m10965(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((Stream) obj).mapToInt((ToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Collector.Characteristics m10966() {
        if (C0084.m8116() >= 0) {
            return Collector.Characteristics.UNORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static BaseStream m10967(Object obj) {
        if (m10983() > 0) {
            return ((BaseStream) obj).unordered();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10968(Object obj) {
        if (C0094.m9148() > 0) {
            return ((Optional) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m10969(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۡۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.E m10970(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            return ((j$.util.stream.Stream) obj).mapToDouble((ToDoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3[] m10971() {
        if (C0087.m8458() <= 0) {
            return EnumC0548f3.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m10972(Object obj, long j, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((j$.time.temporal.m) obj).e(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m10973(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((j$.util.function.i) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۧ, reason: not valid java name and contains not printable characters */
    public static W m10974(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((V) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static String m10975(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j$.time.chrono.q) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.n m10976() {
        if (C0101.m11044() < 0) {
            return j$.time.n.MAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfPrimitive m10977(Object obj) {
        if (C0080.m7553() > 0) {
            return ((Spliterator.OfDouble) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static java.util.OptionalInt m10978(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((IntStream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.zone.f m10979(Object obj, boolean z) {
        if (C0099.m10878() <= 0) {
            return j$.time.zone.j.a((String) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static W m10980(Object obj, int i, int i2) {
        if (m10983() >= 0) {
            return t0.k((int[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10981(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((OptionalLong) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static LongStream m10982(Object obj) {
        if (C0080.m7553() >= 0) {
            return AbstractC0644z0.W((Z) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m10983() {
        return 1746986 ^ C0095.m9217((Object) "۟ۨۡ");
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۡ, reason: not valid java name and contains not printable characters */
    public static void m10984(Object obj, long j, Object obj2) {
        if (C0082.m7983() <= 0) {
            ((j$.time.temporal.w) obj).b(j, (j$.time.temporal.r) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m10985(Object obj, boolean z) {
        if (C0082.m7983() <= 0) {
            return AbstractC0644z0.g0((f0) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10986(Object obj, int i) {
        if (C0098.m10857() <= 0) {
            return AbstractC0505e.e((f0) obj, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfPrimitive m10987(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((Spliterator.OfInt) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.A m10988(Object obj) {
        if (C0105.m11264() > 0) {
            return ((InterfaceC0498k) obj).g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m10989(Object obj) {
        if (C0098.m10857() < 0) {
            return ((C0519a) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10990(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            return ((List) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static B m10991(Object obj) {
        if (C0092.m8724() < 0) {
            return ((LongStream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10992(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((Collection) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۡ۠, reason: not valid java name and contains not printable characters */
    public static EnumC0554h m10993() {
        if (C0097.m10823() >= 0) {
            return EnumC0554h.CONCURRENT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤۢ, reason: not valid java name and contains not printable characters */
    public static int m10994(Object obj, Object obj2, long j) {
        if (C0087.m8458() <= 0) {
            return ((Unsafe) obj).getIntVolatile(obj2, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m10995(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((Collection) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m10996() {
        if (C0083.m8022() <= 0) {
            return j$.time.temporal.b.ERAS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m10997(Object obj) {
        if (C0087.m8458() <= 0) {
            ((j$.time.format.o) obj).s();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static double m10998(Object obj, Object obj2) {
        return C0093.m9101() > 0 ? ((ToDoubleFunction) obj).applyAsDouble(obj2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static int m10999(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((j$.time.j) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۢۧ, reason: contains not printable characters */
    public static j$.time.j m11000(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return j$.time.j.K((j$.time.h) obj, (j$.time.l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦ, reason: contains not printable characters */
    public static A m11001(Object obj) {
        if (C0080.m7553() > 0) {
            return ((j$.util.stream.IntStream) obj).average();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۨ, reason: contains not printable characters */
    public static j$.time.j m11002(Object obj, long j) {
        if (C0083.m8022() <= 0) {
            return ((j$.time.j) obj).N(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۡۡ, reason: contains not printable characters */
    public static j$.util.stream.Stream m11003(Object obj) {
        if (C0096.m10782() > 0) {
            return ((LongStream) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡ۟, reason: contains not printable characters */
    public static Instant m11004(long j, long j2) {
        if (C0098.m10857() < 0) {
            return Instant.ofEpochSecond(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۦ, reason: contains not printable characters */
    public static B m11005(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return ((LongStream) obj).reduce((LongBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۢ, reason: contains not printable characters */
    public static AbstractMap.SimpleImmutableEntry m11006(Object obj, Object obj2) {
        if (m10983() > 0) {
            return j$.com.android.tools.r8.a.f((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static long m11007(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((j$.time.temporal.o) obj).s((j$.time.temporal.r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m11008(Object obj, boolean z) {
        if (C0084.m8116() >= 0) {
            return ((j$.time.n) obj).D(z);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfLong] */
    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfLong m11009(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((java.util.stream.LongStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧ۟, reason: not valid java name and contains not printable characters */
    public static Set m11010(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((j$.util.stream.Collector) obj).characteristics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m11011(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((Spliterator.OfPrimitive) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfDouble m11012(Object obj) {
        if (C0080.m7553() > 0) {
            return ((Q) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢ۠, reason: not valid java name and contains not printable characters */
    public static LongStream m11013(Object obj) {
        if (C0095.m9210() > 0) {
            return ((LongStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m11014(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((IntStream) obj).sum();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m10962(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
