package java.util.function;

import j$.com.android.tools.r8.a;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.n;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.format.v;
import j$.time.j;
import j$.time.temporal.C0085;
import j$.time.temporal.b;
import j$.time.temporal.l;
import j$.time.temporal.o;
import j$.time.temporal.r;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.Optional;
import j$.util.Z;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.c;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.BaseStream;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0535d0;
import j$.util.stream.C0544f;
import j$.util.stream.C0603q3;
import j$.util.stream.C0612s3;
import j$.util.stream.D;
import j$.util.stream.E;
import j$.util.stream.J0;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: java.util.function.ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0106 {

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int f567 = -87;

    /* JADX INFO: renamed from: ۟۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static b m11311() {
        if (C0090.m8624() >= 0) {
            return b.YEARS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m11312(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0083.m8022() <= 0) {
            return ((IntStream) obj).collect((Supplier) obj2, (ObjIntConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static A m11313(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((j$.time.zone.b) obj).s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static LongStream m11314(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return ((Stream) obj).mapToLong((ToLongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static v m11315() {
        if (C0093.m9101() > 0) {
            return v.NORMAL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static BaseStream m11316(Object obj) {
        if (C0081.m7818() < 0) {
            return C0544f.j((java.util.stream.BaseStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m11317(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static r m11318() {
        if (C0104.m11196() >= 0) {
            return l.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static E m11319(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((E) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.IntStream m11320(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((C0535d0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Z m11321(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((LongStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static long[] m11322(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((LongStream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۤ, reason: not valid java name and contains not printable characters */
    public static CoderResult m11323() {
        if (C0097.m10823() >= 0) {
            return CoderResult.UNDERFLOW;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m11324(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0092.m8751(str) / 2);
        while (C0092.m8751(str) > 0) {
            m11329(byteArrayOutputStream, (C0080.m7569(strM11090, C0104.m11233(str, -2)) << 4) | C0080.m7569(strM11090, C0104.m11233(str, -1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = C0092.m8751(strM110902);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM11190[i2] = (byte) (bArrM11190[i2] ^ C0104.m11233(strM110902, i2 % iM8751));
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m11325(int i, int i2) {
        if (C0094.m9148() > 0) {
            return Math.max(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۠, reason: not valid java name and contains not printable characters */
    public static DoubleStream m11326(Object obj) {
        if (C0081.m7818() < 0) {
            return ((IntStream) obj).asDoubleStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۢ, reason: not valid java name and contains not printable characters */
    public static j m11327(int i) {
        if (C0101.m11044() < 0) {
            return j.J(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m11328(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((Supplier) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static void m11329(Object obj, int i) {
        if (C0091.m8708() >= 0) {
            ((ByteArrayOutputStream) obj).write(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static BigDecimal m11330() {
        if (C0081.m7818() <= 0) {
            return BigDecimal.ONE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m11331(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            return ((List) obj).indexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static Optional m11332(Object obj) {
        if (C0085.m8230() >= 0) {
            return AbstractC0505e.k((java.util.Optional) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m11333(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((n) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static LongConsumer m11334(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0612s3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m11335(Object obj, Object obj2, int i, Object obj3) {
        if (C0104.m11196() > 0) {
            return ((BigDecimal) obj).divide((BigDecimal) obj2, i, (RoundingMode) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m11336(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            ((PrimitiveIterator.OfInt) obj).forEachRemaining((Consumer<? super Integer>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۧۤ, reason: not valid java name and contains not printable characters */
    public static c m11337(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return a.b((DoubleConsumer) obj, (DoubleConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m11338(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((n) obj).l((o) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m11339(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((OptionalInt) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m11340(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            ((Spliterator) obj).forEachRemaining((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Thread m11341() {
        if (C0100.m10983() >= 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static DoubleConsumer m11342(Object obj) {
        if (C0096.m10782() > 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m11343(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AtomicBoolean) obj).get();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m11344(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            ((LongStream) obj).forEachOrdered((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m11345() {
        return (-56525) ^ C0095.m9217((Object) "ۥۣ");
    }

    /* JADX INFO: renamed from: ۥ۠ۨۧ, reason: contains not printable characters */
    public static Object m11347(Object obj, int i) {
        if (C0085.m8230() > 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۧۢ, reason: contains not printable characters */
    public static byte[] m11348(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦ۟, reason: contains not printable characters */
    public static E m11349(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((D) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧ۟, reason: contains not printable characters */
    public static LongStream m11350(Object obj) {
        if (C0101.m11044() < 0) {
            return ((LongStream) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨۥ, reason: contains not printable characters */
    public static Long m11351(long j) {
        if (C0079.m7512() > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۢ, reason: contains not printable characters */
    public static int m11352(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((C0603q3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static String m11353(Object obj) {
        if (C0098.m10857() <= 0) {
            return Arrays.toString((long[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static Object m11354(Object obj) {
        if (C0083.m8022() < 0) {
            return ((j$.util.function.a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static StringBuffer m11355(Object obj, int i) {
        if (C0101.m11044() <= 0) {
            return ((StringBuffer) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m11356(Object obj) {
        if (C0089.m8594() < 0) {
            return ((j$.time.l) obj).H();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m11357(Object obj, Object obj2, int i) {
        if (C0096.m10782() > 0) {
            AbstractC0644z0.p((J0) obj, (Long[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۤۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String m11346(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
