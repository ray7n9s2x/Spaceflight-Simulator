package j$.sun.nio.cs;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.n;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.h;
import j$.time.l;
import j$.time.s;
import j$.time.temporal.C0085;
import j$.time.temporal.o;
import j$.time.temporal.r;
import j$.time.temporal.w;
import j$.time.y;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0503c;
import j$.util.C0649u;
import j$.util.C0653y;
import j$.util.J;
import j$.util.T;
import j$.util.W;
import j$.util.c0;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.i;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0530c0;
import j$.util.stream.C0612s3;
import j$.util.stream.E;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0592o2;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.sun.nio.cs.۟ۡۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0080 {

    /* JADX INFO: renamed from: ۟ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static int f388 = 70;

    /* JADX INFO: renamed from: ۟۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m7534(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            return ((BigDecimal) obj).subtract((BigDecimal) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m7535(String str) {
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
            C0106.m11329(byteArrayOutputStream, (m7569(strM11090, C0104.m11233(str, i2)) << 4) | m7569(strM11090, C0104.m11233(str, i2 + 1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM8751));
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m7536(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((A) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static T m7537(Object obj, int i, int i2) {
        if (C0097.m10823() >= 0) {
            return t0.j((double[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static Function m7538(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((j$.util.function.d) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static IntStream m7539(Object obj) {
        if (C0088.m8503() >= 0) {
            return C0530c0.j((java.util.stream.IntStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m7540(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            Arrays.sort((Object[]) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static CoderResult m7541(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((e) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0649u m7542(Object obj) {
        if (C0082.m7983() < 0) {
            return ((E) obj).summaryStatistics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.A m7543(Object obj) {
        if (C0095.m9210() >= 0) {
            return AbstractC0505e.l((OptionalDouble) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m7544(Object obj, double d) {
        if (m7553() >= 0) {
            ((C0649u) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static double m7545(Object obj) {
        return C0083.m8022() <= 0 ? ((PrimitiveIterator.OfDouble) obj).nextDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7546(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            ((PrimitiveIterator.OfLong) obj).forEachRemaining((Consumer<? super Long>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m7547(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((ConcurrentHashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Collection m7548(Object obj) {
        if (C0094.m9148() > 0) {
            return ((HashMap) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static l m7549(Object obj, long j, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((l) obj).U(j, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7550(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((h) obj).L();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static n m7551(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((InterfaceC0492e) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7552(Object obj) {
        if (C0079.m7512() > 0) {
            return ((C0612s3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m7553() {
        return 1748921 ^ C0095.m9217((Object) "ۡۨ۟");
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static C0653y m7554(Object obj) {
        if (C0083.m8022() < 0) {
            return ((LongStream) obj).summaryStatistics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static double m7555(double d, double d2) {
        return C0083.m8022() <= 0 ? Math.max(d, d2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static Stream m7556(Object obj, long j) {
        if (C0100.m10983() > 0) {
            return ((Stream) obj).limit(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۧ, reason: not valid java name and contains not printable characters */
    public static s m7557(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            return s.C((l) obj, (A) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7558(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0100.m10983() >= 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m7559(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0095.m9210() >= 0) {
            return ((DoubleStream) obj).collect((Supplier) obj2, (ObjDoubleConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static J m7560(Object obj) {
        if (C0083.m8022() < 0) {
            return t0.g((W) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m7561(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            ((Spliterator.OfPrimitive) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static C m7562() {
        if (C0079.m7512() > 0) {
            return C.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m7563() {
        if (C0104.m11196() >= 0) {
            return j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m7564(Object obj) {
        if (C0081.m7818() < 0) {
            return ((n) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Predicate m7565(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((i) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤۥ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m7566(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((java.util.stream.IntStream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m7567() {
        if (C0103.m11154() < 0) {
            return j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m7568(Object obj, int i, int i2, Object obj2, int i3) {
        if (C0099.m10878() <= 0) {
            ((String) obj).getChars(i, i2, (char[]) obj2, i3);
        }
    }

    /* JADX INFO: renamed from: ۢۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m7569(Object obj, int i) {
        if (C0100.m10983() >= 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static h m7570(Object obj) {
        if (C0098.m10857() <= 0) {
            return h.E((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7571(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((InterfaceC0489b) obj).f((r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static IntStream m7572(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((IntStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۧ, reason: not valid java name and contains not printable characters */
    public static h m7574(Object obj, int i) {
        if (C0092.m8724() <= 0) {
            return ((h) obj).Y(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۥ, reason: contains not printable characters */
    public static int m7575(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return AbstractC0496i.c((InterfaceC0492e) obj, (InterfaceC0492e) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۡ, reason: contains not printable characters */
    public static boolean m7576(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((Class) obj).isAssignableFrom((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۦۧ, reason: contains not printable characters */
    public static void m7577(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            ((c0) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠, reason: contains not printable characters */
    public static int m7578(int i, int i2) {
        if (C0079.m7512() > 0) {
            return Math.min(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static int m7579(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((f0) obj).characteristics();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۣۤ, reason: contains not printable characters */
    public static E m7580(Object obj) {
        if (C0088.m8503() > 0) {
            return ((E) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۤ, reason: contains not printable characters */
    public static Object[] m7581(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((Collection) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m7582(Object obj) {
        if (C0089.m8594() < 0) {
            return ((j$.util.function.d) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7583(Object obj) {
        if (C0100.m10983() > 0) {
            return ((Optional) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۦۢ, reason: not valid java name and contains not printable characters */
    public static w m7584(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((y) obj).n((r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m7585(Object obj, long j, long j2) {
        if (C0082.m7983() <= 0) {
            return ((LongBinaryOperator) obj).applyAsLong(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m7586(Object obj) {
        if (C0098.m10857() < 0) {
            return ((java.util.stream.IntStream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m7587(Object obj) {
        if (C0085.m8230() >= 0) {
            ((ObjectInputStream) obj).defaultReadObject();
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m7588(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            ((InterfaceC0592o2) obj).j((Long) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7589(Object obj, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((java.util.stream.LongStream) obj).noneMatch((LongPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۥۨ, reason: not valid java name and contains not printable characters */
    public static int m7590(Object obj) {
        if (C0100.m10983() > 0) {
            return ((C0503c) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static String m7573(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
