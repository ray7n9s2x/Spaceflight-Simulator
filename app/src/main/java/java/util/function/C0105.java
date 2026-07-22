package java.util.function;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.D;
import j$.time.chrono.C0081;
import j$.time.chrono.n;
import j$.time.chrono.q;
import j$.time.chrono.v;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.h;
import j$.time.j;
import j$.time.r;
import j$.time.temporal.C0085;
import j$.time.temporal.a;
import j$.time.temporal.w;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.time.zone.d;
import j$.util.A;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.F;
import j$.util.I;
import j$.util.J;
import j$.util.Optional;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.i;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.C0523a3;
import j$.util.stream.C0559i;
import j$.util.stream.C0600q0;
import j$.util.stream.E;
import j$.util.stream.InterfaceC0582m2;
import j$.util.stream.R0;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.AccessibleObject;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountedCompleter;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: java.util.function.۟۠ۨۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0105 {

    /* JADX INFO: renamed from: ۟ۡۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean f566;

    /* JADX INFO: renamed from: ۟۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static double m11249(Object obj, double d) {
        return C0100.m10983() >= 0 ? ((DoubleUnaryOperator) obj).applyAsDouble(d) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static Collector m11250(Object obj) {
        if (C0100.m10983() > 0) {
            return ((C0559i) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11251(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((Stream) obj).flatMapToDouble((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static A m11252(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((E) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static v m11253() {
        if (C0082.m7983() <= 0) {
            return v.BCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Class m11254() {
        if (C0092.m8724() < 0) {
            return Integer.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m11255(double d) {
        if (C0103.m11154() <= 0) {
            return Double.isInfinite(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m11256(Object obj) {
        if (C0096.m10782() > 0) {
            return ((IntStream) obj).findAny();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m11257(Object obj, int i) {
        if (C0088.m8503() >= 0) {
            ((CountedCompleter) obj).addToPendingCount(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m11258(Object obj) {
        if (C0094.m9148() > 0) {
            return ((Enum) obj).ordinal();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m11259(Object obj, int i) {
        if (C0091.m8708() >= 0) {
            ((IntConsumer) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static void m11260(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            ((Spliterator.OfInt) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m11261(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            C0079.m7507((InterfaceC0582m2) obj, (Double) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static IntFunction m11262(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((R0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m11263(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((ConcurrentHashMap) obj).containsValue(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m11264() {
        return 1746864 ^ C0095.m9217((Object) "۟ۥۤ");
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.A m11265(Object obj) {
        if (C0094.m9148() >= 0) {
            return j$.time.A.J((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static r m11266(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            return r.C((j) obj, (j$.time.A) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m11267(Object obj, Object obj2, Object obj3) {
        if (C0093.m9101() >= 0) {
            ((BiConsumer) obj).accept(obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m11268(Object obj) {
        if (C0091.m8708() >= 0) {
            return IntPredicate$CC.$default$negate((IntPredicate) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static f0 m11269(Object obj) {
        if (m11264() >= 0) {
            return ((i) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m11270(Object obj, int i) {
        if (C0083.m8022() <= 0) {
            ((CountedCompleter) obj).setPendingCount(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ۠, reason: not valid java name and contains not printable characters */
    public static w m11271(Object obj) {
        if (C0089.m8594() < 0) {
            return ((j$.time.temporal.r) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m11272(long j, long j2) {
        if (C0091.m8708() >= 0) {
            return Long.compare(j, j2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m11273(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((CopyOnWriteArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m11274(int i) {
        if (C0094.m9148() > 0) {
            return OptionalInt.of(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static q m11275() {
        if (C0099.m10878() < 0) {
            return q.o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfPrimitive m11276(Object obj) {
        if (C0106.m11345() < 0) {
            return ((Spliterator.OfLong) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Stream m11277(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((C0523a3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static A m11278(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((E) obj).max();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String m11279(Object obj) {
        if (C0089.m8594() < 0) {
            return ((n) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static OptionalLong m11280(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((LongStream) obj).max();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m11281(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            ((F) obj).forEachRemaining((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static a m11282() {
        if (C0079.m7512() > 0) {
            return a.MILLI_OF_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.OptionalInt m11283() {
        if (C0088.m8503() >= 0) {
            return j$.util.OptionalInt.empty();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Class m11284(Object obj, boolean z, Object obj2) {
        if (C0098.m10857() <= 0) {
            return Class.forName((String) obj, z, (ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m11285(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((j$.util.stream.Stream) obj).takeWhile((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۧ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11286(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((DoubleStream) obj).map((DoubleUnaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۧ, reason: not valid java name and contains not printable characters */
    public static Double m11287(Object obj) {
        if (C0091.m8708() > 0) {
            return ((F) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Optional m11288(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((j$.util.stream.Stream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static w m11289(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((h) obj).n((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m11290(Object obj, Object obj2) throws IOException {
        if (m11264() > 0) {
            ((DataOutput) obj).writeUTF((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m11291(Object obj, Object obj2) throws IOException {
        if (C0099.m10878() <= 0) {
            ((ObjectOutputStream) obj).writeObject(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m11292(String str) {
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

    /* JADX INFO: renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m11293(Object obj) {
        if (C0090.m8624() > 0) {
            return ((List) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static j m11294(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((D) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥ, reason: not valid java name and contains not printable characters */
    public static f0 m11295(Object obj, int i, int i2) {
        if (C0088.m8503() >= 0) {
            return t0.m((Object[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfInt m11296(Object obj) {
        if (C0080.m7553() >= 0) {
            return I.a((J) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.IntStream m11297(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((j$.util.stream.Stream) obj).q((C0519a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m11298(Object obj) {
        if (C0094.m9148() > 0) {
            return ((h) obj).I();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۧۡ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfInt m11299(Object obj) {
        if (C0092.m8724() < 0) {
            return ((Spliterator.OfInt) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m11300() {
        if (C0104.m11196() >= 0) {
            return OptionalDouble.empty();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m11301(Object obj) {
        if (C0101.m11044() < 0) {
            return ((C0600q0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static h m11302(Object obj, long j, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((h) obj).V(j, (j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧ۠, reason: contains not printable characters */
    public static java.util.Optional m11303(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((Stream) obj).max((Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
    public static void m11304(Object obj, boolean z) {
        if (C0104.m11196() > 0) {
            ((AccessibleObject) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۦۤۦ۟, reason: contains not printable characters */
    public static d m11305() {
        if (C0089.m8594() < 0) {
            return d.STANDARD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۢ, reason: contains not printable characters */
    public static Object m11306(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((j$.util.function.a) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦ, reason: contains not printable characters */
    public static E m11307(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((j$.util.stream.LongStream) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m11308(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            return ((Spliterator) obj).tryAdvance((Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۢۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m11309(Object obj) {
        if (C0089.m8594() < 0) {
            return C0523a3.j((Stream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m11310(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
