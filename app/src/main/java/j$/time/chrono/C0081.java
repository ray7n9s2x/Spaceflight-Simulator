package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.W;
import j$.util.a0;
import j$.util.concurrent.C0093;
import j$.util.e0;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.B0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.C0590o0;
import j$.util.stream.C0600q0;
import j$.util.stream.F0;
import j$.util.stream.H0;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.TimeZone;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.time.chrono.۠ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0081 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f415short = {881, 272};

    /* JADX INFO: renamed from: ۟ۤۥۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean f416;

    /* JADX INFO: renamed from: ۟۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m7794(Object obj, Object obj2, long j) {
        if (C0090.m8624() >= 0) {
            return ((j$.sun.misc.a) obj).g(obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.t m7795() {
        if (C0091.m8708() >= 0) {
            return j$.time.temporal.n.g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Stream m7796(Object obj) {
        if (C0080.m7553() > 0) {
            return ((j$.util.stream.E) obj).boxed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m7797(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((TimeZone) obj).getID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.n m7798() {
        if (C0098.m10857() < 0) {
            return j$.time.n.JULY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ObjectOutputStream.PutField m7799(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((ObjectOutputStream) obj).putFields();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static H0 m7800(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((B0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Stream m7801(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((LongStream) obj).mapToObj((LongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static IntConsumer m7802(Object obj) {
        if (C0084.m8116() > 0) {
            return ((j$.util.function.e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.E m7803(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((Stream) obj).v((C0519a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m7804(Object obj) {
        if (C0104.m11196() > 0) {
            return ((n) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static j$.time.t m7805() {
        if (C0093.m9101() > 0) {
            return j$.time.t.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m7806(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((j$.time.j) obj).F();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m7807(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7808() {
        if (C0094.m9148() >= 0) {
            return j$.time.w.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m7809(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((InterfaceC0498k) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static BiConsumer m7810(Object obj) {
        if (C0105.m11264() > 0) {
            return ((j$.util.stream.r) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m7811(Object obj) {
        if (C0079.m7512() > 0) {
            return ((BigDecimal) obj).stripTrailingZeros();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m7812(Object obj, byte b) {
        if (C0105.m11264() > 0) {
            return ((ByteBuffer) obj).put(b);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡ۟, reason: not valid java name and contains not printable characters */
    public static java.util.stream.Stream m7813(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((java.util.stream.Stream) obj).map((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m7814(Object obj) {
        if (C0083.m8022() < 0) {
            return ((ListIterator) obj).previous();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m7815(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0105.m11264() > 0) {
            return ((IntStream) obj).collect((Supplier) obj2, (ObjIntConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7816(Object obj) {
        if (C0084.m8116() > 0) {
            return ((C0600q0) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.B m7817(long j) {
        if (C0096.m10782() > 0) {
            return j$.util.B.d(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m7818() {
        return (-1755420) ^ C0095.m9217((Object) "ۨۢ۠");
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۢ, reason: not valid java name and contains not printable characters */
    public static OptionalLong m7819(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((java.util.stream.LongStream) obj).reduce((LongBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ۟, reason: not valid java name and contains not printable characters */
    public static Spliterator.OfPrimitive m7820(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((a0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static Integer m7821(Object obj) {
        if (C0083.m8022() < 0) {
            return ((j$.util.J) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m7822(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            ((IntStream) obj).forEachOrdered((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.IntStream m7823(Object obj, long j) {
        if (C0083.m8022() < 0) {
            return ((java.util.stream.IntStream) obj).skip(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static IntStream m7824(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((IntStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.A m7825(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((j$.util.stream.E) obj).average();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static List m7826(Object obj) {
        if (C0105.m11264() >= 0) {
            return Collections.singletonList(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static double[] m7827(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((j$.util.stream.E) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7828(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((W) obj).tryAdvance((IntConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static int m7829(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((j$.util.J) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static java.util.stream.LongStream m7830(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((java.util.stream.Stream) obj).flatMapToLong((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.format.u m7831() {
        if (C0092.m8724() <= 0) {
            return j$.time.format.u.STRICT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m7832(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return AbstractC0496i.e((InterfaceC0498k) obj, (j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۢۦ, reason: not valid java name and contains not printable characters */
    public static BaseStream m7833(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((BaseStream) obj).onClose((Runnable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7834(String str) {
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
        String strM7573 = C0080.m7573(m7847(), 0, 1, 784);
        while (C0092.m8751(strM7573) > 0) {
            strM7573 = C0102.m11090();
            if (C0092.m8751(strM7573) == 0) {
                strM7573 = C0103.m11135(m7847(), 1, 1, 369);
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

    /* JADX INFO: renamed from: ۡۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7835(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((StringBuilder) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7836(Object obj, Object obj2, int i) {
        if (C0090.m8624() > 0) {
            AbstractC0644z0.n((F0) obj, (Double[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Spliterator m7838(Object obj) {
        if (C0096.m10782() > 0) {
            return e0.a((f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static LongStream m7839(Object obj) {
        if (C0080.m7553() > 0) {
            return ((C0590o0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m7840(Object obj, long j, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((j$.time.l) obj).M(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.format.v[] m7841() {
        if (C0085.m8230() >= 0) {
            return j$.time.format.v.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦ۠, reason: not valid java name and contains not printable characters */
    public static OptionalInt m7842(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((java.util.stream.IntStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۧۧ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.t m7843() {
        if (C0095.m9210() >= 0) {
            return j$.time.temporal.n.h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۨۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.l m7844(Object obj) {
        if (C0090.m8624() > 0) {
            return j$.time.l.E((j$.time.temporal.o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m7845(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((IntStream) obj).noneMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7846(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((Spliterator.OfLong) obj).tryAdvance((Consumer<? super Long>) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۦۦ, reason: contains not printable characters */
    public static short[] m7847() {
        if (C0085.m8230() >= 0) {
            return f415short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۧۦ, reason: contains not printable characters */
    public static boolean m7848(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((f0) obj).tryAdvance((Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۦ۠, reason: contains not printable characters */
    public static Object m7849(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return AbstractC0496i.l((InterfaceC0498k) obj, (j$.time.temporal.t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static OptionalLong m7850(Object obj) {
        if (C0097.m10823() > 0) {
            return ((java.util.stream.LongStream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡ۠, reason: contains not printable characters */
    public static LongStream m7851(Object obj) {
        if (C0088.m8503() > 0) {
            return ((LongStream) obj).distinct();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۦ, reason: contains not printable characters */
    public static Spliterator m7852(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((Spliterator.OfLong) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۢۧ, reason: contains not printable characters */
    public static Object m7853(Object obj) {
        if (C0098.m10857() < 0) {
            return ((Optional) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۥ, reason: contains not printable characters */
    public static long m7854(long j, long j2) {
        if (C0080.m7553() >= 0) {
            return j$.com.android.tools.r8.a.k(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static j$.util.stream.E m7855(Object obj, Object obj2) {
        if (m7818() < 0) {
            return ((j$.util.stream.E) obj).peek((DoubleConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static void m7856(Object obj, Object obj2, int i) {
        if (C0085.m8230() >= 0) {
            AbstractC0644z0.o((H0) obj, (Integer[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۦۤۤ, reason: contains not printable characters */
    public static DoubleStream m7857(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            return ((DoubleStream) obj).flatMap((DoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠۟, reason: contains not printable characters */
    public static int m7858(Object obj) {
        if (C0087.m8458() < 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m7859(Object obj, long j) {
        if (C0088.m8503() > 0) {
            return ((j$.time.temporal.a) obj).w(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۦۧ, reason: not valid java name and contains not printable characters */
    public static LongStream m7860(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((LongStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static I m7861() {
        if (C0100.m10983() > 0) {
            return I.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۢ, reason: not valid java name and contains not printable characters */
    public static IntStream m7862(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((IntStream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m7863(Object obj) {
        if (C0091.m8708() > 0) {
            return System.identityHashCode(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7837(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
