package j$.util.concurrent;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.EnumC0500d;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.I;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.OptionalInt;
import j$.util.W;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0587n2;
import j$.util.stream.InterfaceC0592o2;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalLong;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.function.C0106;
import java.util.function.IntConsumer;
import java.util.function.LongFunction;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.concurrent.۟۟ۦۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0093 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f492short = {2872, 3166};

    /* JADX INFO: renamed from: ۥۦۧ۟, reason: contains not printable characters */
    public static boolean f493;

    /* JADX INFO: renamed from: ۟۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9061(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((Collection) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.sun.misc.a m9063() {
        if (C0090.m8624() >= 0) {
            return j$.sun.misc.a.h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m9064(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((SortedMap) obj).firstKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m9065(Object obj) {
        if (C0103.m11154() < 0) {
            return ((Map) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0500d m9066(Object obj) {
        if (C0097.m10823() > 0) {
            return ((j$.time.h) obj).G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m9067(Object obj, long j) {
        if (C0094.m9148() > 0) {
            return ((LongFunction) obj).apply(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۢ, reason: not valid java name and contains not printable characters */
    public static String m9068(String str) {
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
        String strM7573 = C0080.m7573(m9095(), 0, 1, 2905);
        while (C0092.m8751(strM7573) > 0) {
            strM7573 = C0102.m11090();
            if (C0092.m8751(strM7573) == 0) {
                strM7573 = C0085.m8236(m9095(), 1, 1, 3135);
            }
        }
        int iM8751 = C0092.m8751(strM7573);
        int iM87512 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < iM8751; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM87512));
        }
        for (int iM87513 = 0; iM87513 < bArrM11190.length; iM87513 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m9069(Object obj, Object obj2, Object obj3) {
        if (C0079.m7512() >= 0) {
            ((ObjectOutputStream.PutField) obj).put((String) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m9070(Object obj) {
        if (C0102.m11109() < 0) {
            return ((j$.time.zone.b) obj).B();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9071(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((Unsafe) obj).arrayIndexScale((Class) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m9072(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((j$.time.h) obj).k((j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m9073(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((ObjectInputStream) obj).readObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9074(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((j$.time.chrono.z) obj).f((j$.time.temporal.r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m9075() {
        if (C0082.m7983() < 0) {
            return j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m9076(Object obj, int i) {
        if (C0101.m11044() <= 0) {
            ((InterfaceC0587n2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m9077() {
        if (C0079.m7512() >= 0) {
            return j$.time.temporal.a.DAY_OF_WEEK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9078(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            ((W) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0492e m9079(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((j$.time.chrono.n) obj).o((j$.time.j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m9080(Object obj) {
        if (C0096.m10782() > 0) {
            return AbstractC0496i.o((InterfaceC0498k) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m9081(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((I) obj).m((j$.time.temporal.a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static RoundingMode m9082() {
        if (C0103.m11154() <= 0) {
            return RoundingMode.FLOOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static int m9083(Object obj, int i) {
        if (C0082.m7983() <= 0) {
            return ((AtomicInteger) obj).addAndGet(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static OptionalLong m9084() {
        if (C0091.m8708() >= 0) {
            return OptionalLong.empty();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static double m9085(Object obj) {
        return C0089.m8594() <= 0 ? ((z) obj).nextDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m9086(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((ObjectInput) obj).readObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m9087(Object obj) {
        if (C0094.m9148() > 0) {
            LockSupport.park(obj);
        }
    }

    /* JADX INFO: renamed from: ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9088(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            return Arrays.equals((Object[]) obj, (Object[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۨۡ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9089(Object obj, int i, int i2, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((StringBuilder) obj).replace(i, i2, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Buffer m9090(Object obj, int i) {
        if (C0095.m9210() >= 0) {
            return ((CharBuffer) obj).position(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Type[] m9091(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((ParameterizedType) obj).getActualTypeArguments();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static OptionalInt m9092(Object obj) {
        if (C0092.m8724() < 0) {
            return ((IntStream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m9093(Object obj, long j) {
        if (C0091.m8708() > 0) {
            ((InterfaceC0592o2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m9094(Object obj) {
        if (C0080.m7553() > 0) {
            return ((j$.time.h) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m9095() {
        if (C0100.m10983() >= 0) {
            return f492short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0498k m9096(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((InterfaceC0498k) obj).h((j$.time.z) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۥۨ, reason: not valid java name and contains not printable characters */
    public static Stream m9097(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((Stream) obj).sorted((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m9098(Object obj, Object obj2, Object obj3) {
        if (C0082.m7983() <= 0) {
            ((j$.time.format.o) obj).i((j$.time.temporal.a) obj2, (HashMap) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۨۤ, reason: contains not printable characters */
    public static j$.time.chrono.n m9099(Object obj) {
        if (C0085.m8230() > 0) {
            return ((j$.time.format.a) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۡ, reason: contains not printable characters */
    public static j$.time.temporal.r m9100() {
        if (C0101.m11044() <= 0) {
            return j$.time.temporal.j.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۤۤ, reason: contains not printable characters */
    public static int m9101() {
        return 1752563 ^ C0095.m9217((Object) "ۥۢۡ");
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9102(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((OptionalInt) obj).getAsInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9062(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
