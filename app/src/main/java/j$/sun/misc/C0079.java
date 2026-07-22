package j$.sun.misc;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.D;
import j$.time.Instant;
import j$.time.chrono.A;
import j$.time.chrono.AbstractC0488a;
import j$.time.chrono.C0081;
import j$.time.chrono.F;
import j$.time.chrono.u;
import j$.time.chrono.x;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.h;
import j$.time.j;
import j$.time.l;
import j$.time.n;
import j$.time.p;
import j$.time.temporal.C0085;
import j$.time.temporal.m;
import j$.time.temporal.o;
import j$.time.temporal.r;
import j$.time.temporal.w;
import j$.time.z;
import j$.time.zone.C0087;
import j$.time.zone.f;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.InterfaceC0654z;
import j$.util.L;
import j$.util.Objects;
import j$.util.Z;
import j$.util.concurrent.C0093;
import j$.util.e0;
import j$.util.f0;
import j$.util.function.C0095;
import j$.util.function.d;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.C0603q3;
import j$.util.stream.E;
import j$.util.stream.EnumC0548f3;
import j$.util.stream.InterfaceC0582m2;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.ServiceLoader;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.sun.misc.ۢۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0079 {

    /* JADX INFO: renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f386 = 19;

    /* JADX INFO: renamed from: ۟۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static DoubleStream m7472(Object obj) {
        if (C0092.m8724() < 0) {
            return ((LongStream) obj).asDoubleStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static w m7473(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            return ((x) obj).m((j$.time.temporal.a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m7474(Object obj) {
        if (C0089.m8594() < 0) {
            return ((DoubleStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m7475(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((Stream) obj).toArray((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m7476(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((l) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.Stream m7477(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((j$.util.stream.Stream) obj).b((C0519a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static n m7478() {
        if (C0081.m7818() < 0) {
            return n.NOVEMBER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m7479(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            ((InterfaceC0654z) obj).forEach((BiConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static Comparator m7480(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((Spliterator) obj).getComparator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static ServiceLoader m7481(Object obj) {
        if (C0091.m8708() > 0) {
            return ServiceLoader.load((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m7482(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            return Arrays.binarySearch((Object[]) obj, obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static A m7483() {
        if (C0089.m8594() <= 0) {
            return A.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7484(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((Collection) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7485(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            ((Z) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static j m7486(Object obj) {
        if (C0097.m10823() > 0) {
            return j.D((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7487(long j) {
        if (C0102.m11109() <= 0) {
            return u.m(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7488(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((Map) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m7489(Object obj, Object obj2, long j, Object obj3) {
        if (C0087.m8458() < 0) {
            return ((a) obj).e(obj2, j, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7490() {
        if (m7512() > 0) {
            return AbstractC0488a.c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static IntConsumer m7491(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0603q3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.A m7492(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((f) obj).d((Instant) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۧ, reason: not valid java name and contains not printable characters */
    public static Function m7493(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((d) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m7494(Object obj, Object obj2) {
        if (C0091.m8708() >= 0) {
            return Objects.requireNonNull(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7495(Object obj) {
        if (C0099.m10878() < 0) {
            ((j$.time.format.o) obj).p();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۧ, reason: not valid java name and contains not printable characters */
    public static int m7496(Object obj) {
        if (C0095.m9210() > 0) {
            return ((ByteBuffer) obj).arrayOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static E m7497(Object obj, long j) {
        if (C0101.m11044() <= 0) {
            return ((E) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۧ, reason: not valid java name and contains not printable characters */
    public static D m7498(Object obj, Object obj2, Object obj3) {
        if (C0087.m8458() <= 0) {
            return D.C((j) obj, (z) obj2, (j$.time.A) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfDouble m7499(Object obj) {
        if (C0097.m10823() > 0) {
            return ((Spliterator.OfDouble) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.LongStream m7500(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((j$.util.stream.LongStream) obj).b((C0519a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static BaseStream m7501(Object obj) {
        if (C0097.m10823() > 0) {
            return ((IntStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static Boolean m7502(boolean z) {
        if (C0081.m7818() <= 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static m m7504(Object obj, Object obj2) {
        if (C0103.m11154() < 0) {
            return ((h) obj).w((m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static w m7505(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((p) obj).n((r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Z m7506(Object obj) {
        if (C0082.m7983() < 0) {
            return ((Z) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m7507(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            ((InterfaceC0582m2) obj).p((Double) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7508(Object obj, long j) throws IOException {
        if (C0105.m11264() > 0) {
            ((DataOutput) obj).writeLong(j);
        }
    }

    /* JADX INFO: renamed from: ۢۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m7509(Object obj) {
        if (C0083.m8022() < 0) {
            return ((Map) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۨۢ, reason: not valid java name and contains not printable characters */
    public static LongStream m7510(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((LongStream) obj).filter((LongPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7511(String str) {
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

    /* JADX INFO: renamed from: ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static int m7512() {
        return 1751437 ^ C0095.m9217((Object) "ۣۤ۟");
    }

    /* JADX INFO: renamed from: ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfLong m7513(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((L) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۥۧ, reason: not valid java name and contains not printable characters */
    public static f0 m7514() {
        if (C0093.m9101() > 0) {
            return t0.e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m7515(Object obj, Object obj2) {
        if (C0098.m10857() < 0) {
            return ((j) obj).k((r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۧۦ, reason: contains not printable characters */
    public static void m7516(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            ((PrimitiveIterator.OfDouble) obj).forEachRemaining((Consumer<? super Double>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static f0 m7517(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((f0) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۨ, reason: contains not printable characters */
    public static F m7518() {
        if (C0105.m11264() > 0) {
            return F.ROC;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۨ, reason: contains not printable characters */
    public static boolean m7519(Object obj) {
        if (C0099.m10878() < 0) {
            return ((r) obj).v();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۨ۠, reason: contains not printable characters */
    public static f0 m7520(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((e0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۡ, reason: contains not printable characters */
    public static EnumC0548f3 m7521() {
        if (C0104.m11196() >= 0) {
            return EnumC0548f3.INT_VALUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۦۦ, reason: contains not printable characters */
    public static j$.util.stream.IntStream m7522(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((j$.util.stream.IntStream) obj).peek((IntConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۡ, reason: contains not printable characters */
    public static j$.util.A m7523() {
        if (C0099.m10878() <= 0) {
            return j$.util.A.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.LongStream m7524(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((E) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static h m7525(int i, int i2, int i3) {
        if (C0091.m8708() > 0) {
            return h.N(i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m7526(Object obj, long j, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((LongStream) obj).reduce(j, (LongBinaryOperator) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m7527() {
        if (C0084.m8116() >= 0) {
            return EnumC0548f3.DOUBLE_VALUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7528(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m7503(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
