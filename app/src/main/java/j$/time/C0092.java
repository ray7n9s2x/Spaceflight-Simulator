package j$.time;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.F;
import j$.util.H;
import j$.util.J;
import j$.util.N;
import j$.util.T;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.function.Function$CC;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0549g;
import j$.util.stream.E;
import j$.util.stream.F0;
import j$.util.stream.LongStream;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BooleanSupplier;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.time.ۢۨ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0092 {

    /* JADX INFO: renamed from: ۥۡۤۦ, reason: contains not printable characters */
    public static boolean f480;

    /* JADX INFO: renamed from: ۟۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static CoderResult m8721(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((j$.sun.nio.cs.e) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m8722(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            AbstractC0644z0.q((F0) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8723(Object obj) {
        if (C0087.m8458() < 0) {
            return ((OptionalInt) obj).getAsInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static int m8724() {
        return (-1749790) ^ C0095.m9217((Object) "ۢۧۦ");
    }

    /* JADX INFO: renamed from: ۟۠۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static Function m8725(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return Function$CC.$default$andThen((Function) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8726(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return ((String) obj).compareTo((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static Class m8727(Object obj) {
        if (C0095.m9210() >= 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۨ, reason: not valid java name and contains not printable characters */
    public static CountedCompleter m8728(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((CountedCompleter) obj).getCompleter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۦ, reason: not valid java name and contains not printable characters */
    public static void m8729(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            ((N) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8730(Object obj, int i) {
        if (C0084.m8116() >= 0) {
            ((DataOutput) obj).writeByte(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۨ, reason: not valid java name and contains not printable characters */
    public static int m8732(Object obj, long j, Object obj2) {
        if (C0087.m8458() < 0) {
            return ((j$.time.temporal.w) obj).a(j, (j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8733(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            return ((Spliterator.OfInt) obj).tryAdvance((Consumer<? super Integer>) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡ۠, reason: not valid java name and contains not printable characters */
    public static void m8734(Object obj) {
        if (C0093.m9101() > 0) {
            ((CountedCompleter) obj).tryComplete();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۦ, reason: not valid java name and contains not printable characters */
    public static r m8735(Object obj, long j, Object obj2) {
        if (C0093.m9101() >= 0) {
            return ((r) obj).D(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۥ, reason: not valid java name and contains not printable characters */
    public static IntStream m8736(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((IntStream) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.m m8737(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            return AbstractC0496i.a((InterfaceC0489b) obj, (j$.time.temporal.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Function m8738(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return Function$CC.$default$compose((Function) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static void m8739(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            AbstractC0505e.a((T) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static J m8740(Object obj) {
        if (C0097.m10823() > 0) {
            return ((j$.util.stream.IntStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m8741(Object obj) {
        if (C0081.m7818() <= 0) {
            return Arrays.hashCode((long[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۥ, reason: not valid java name and contains not printable characters */
    public static l m8742(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((InterfaceC0492e) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static long m8743(Object obj) {
        if (C0088.m8503() > 0) {
            return ((InterfaceC0498k) obj).B();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static long m8744(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((j$.time.temporal.w) obj).e();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8745(Object obj) {
        if (C0094.m9148() > 0) {
            return ((BooleanSupplier) obj).getAsBoolean();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static LongConsumer m8746(Object obj) {
        if (C0099.m10878() < 0) {
            return ((j$.util.function.h) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦ۟, reason: not valid java name and contains not printable characters */
    public static Runtime m8747() {
        if (C0084.m8116() >= 0) {
            return Runtime.getRuntime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢۥ, reason: not valid java name and contains not printable characters */
    public static E m8748(Object obj) {
        if (C0105.m11264() > 0) {
            return ((LongStream) obj).asDoubleStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8749(Object obj) {
        if (C0080.m7553() > 0) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8750(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((BaseStream) obj).isParallel();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8751(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Stream m8752(Object obj) {
        if (m8724() <= 0) {
            return ((Stream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧ۟, reason: not valid java name and contains not printable characters */
    public static double m8753(Object obj) {
        return C0080.m7553() >= 0 ? ((j$.util.A) obj).b() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۤ, reason: not valid java name and contains not printable characters */
    public static long m8754(Object obj, Object obj2, Object obj3) {
        if (C0091.m8708() >= 0) {
            return ((j$.sun.misc.a) obj).j((Class) obj2, (String) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static LongConsumer m8755(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((j$.util.function.h) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static Locale m8756() {
        if (C0100.m10983() > 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.w m8757(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((j) obj).n((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static long m8758(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((Unsafe) obj).objectFieldOffset((Field) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static void m8759() {
        if (C0080.m7553() >= 0) {
            AbstractC0644z0.l();
        }
    }

    /* JADX INFO: renamed from: ۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m8760(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            ((PrimitiveIterator.OfLong) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8761(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            ((F) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.BaseStream m8762(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0549g) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m8763(Object obj) {
        if (C0091.m8708() >= 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢۢ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8764() {
        if (C0089.m8594() <= 0) {
            return j$.time.temporal.a.YEAR_OF_ERA;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Map m8765(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            return Collections.singletonMap(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static l m8766(Object obj, long j) {
        if (C0087.m8458() < 0) {
            return ((l) obj).Q(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8767(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return AbstractC0496i.h((InterfaceC0489b) obj, (j$.time.temporal.r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8768(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return ((j$.util.stream.IntStream) obj).anyMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8769(Object obj, int i, Object obj2) {
        if (C0103.m11154() < 0) {
            return ((IntStream) obj).reduce(i, (IntBinaryOperator) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m8770(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((j$.util.stream.Stream) obj).noneMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۥۣ, reason: not valid java name and contains not printable characters */
    public static j$.time.zone.b m8771(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return ((j$.time.zone.f) obj).f((j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8772(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((j$.util.stream.IntStream) obj).allMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8773(Object obj) {
        if (C0105.m11264() >= 0) {
            ((j$.time.format.o) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m8774() {
        if (C0095.m9210() >= 0) {
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8775(Object obj, Object obj2, int i) {
        if (C0105.m11264() > 0) {
            ((ObjIntConsumer) obj).accept(obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static EnumSet m8776(Object obj, Object obj2, Object obj3) {
        if (C0081.m7818() <= 0) {
            return EnumSet.of((Enum) obj, (Enum) obj2, (Enum) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡ۟, reason: not valid java name and contains not printable characters */
    public static long m8777(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((LongStream) obj).sum();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۡۥ, reason: not valid java name and contains not printable characters */
    public static PrimitiveIterator.OfInt m8778(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((H) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۥ, reason: contains not printable characters */
    public static java.util.stream.LongStream m8779(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((DoubleStream) obj).mapToLong((DoubleToLongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۧ, reason: contains not printable characters */
    public static void m8780(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static F m8781(Object obj) {
        if (C0097.m10823() >= 0) {
            return t0.f((T) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۦ, reason: contains not printable characters */
    public static Stream m8782(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((DoubleStream) obj).mapToObj((DoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۡ, reason: contains not printable characters */
    public static j m8783(Object obj, long j, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((j) obj).M(j, (j$.time.temporal.u) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۨ, reason: contains not printable characters */
    public static j$.util.A m8784(Object obj, Object obj2) {
        if (C0098.m10857() < 0) {
            return ((E) obj).reduce((DoubleBinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۧ, reason: contains not printable characters */
    public static Set m8785() {
        if (C0088.m8503() >= 0) {
            return Collections.emptySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦۡ, reason: contains not printable characters */
    public static int m8786(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((BigDecimal) obj).signum();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۣ۠, reason: contains not printable characters */
    public static void m8787(Object obj, Object obj2, long j) {
        if (C0096.m10782() > 0) {
            ((ObjLongConsumer) obj).accept(obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۦۧ, reason: contains not printable characters */
    public static j$.util.function.h m8788(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return j$.com.android.tools.r8.a.d((LongConsumer) obj, (LongConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static void m8789(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            ((Spliterator.OfDouble) obj).forEachRemaining((Consumer<? super Double>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۧۤ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m8790(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((IntStream) obj).mapToDouble((IntToDoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static IntStream m8791(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((IntStream) obj).filter((IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8792(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            return ((j$.time.temporal.o) obj).f((j$.time.temporal.r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m8793(String str) {
        String strM11090 = C0102.m11090();
        String strM110902 = C0102.m11090();
        for (int i = 0; i < 15; i++) {
            strM11090 = C0102.m11076(C0103.m11168(C0103.m11168(new StringBuffer(), strM11090), C0099.m10931(i)));
            strM110902 = C0102.m11076(C0106.m11355(C0103.m11168(new StringBuffer(), strM110902), ((int) (C0104.m11187() * ((double) 10))) ^ i));
        }
        while (m8751(strM11090) > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m8751(str) / 2);
        for (int i2 = 0; i2 < m8751(str); i2 += 2) {
            C0106.m11329(byteArrayOutputStream, (C0080.m7569(strM11090, C0104.m11233(str, i2)) << 4) | C0080.m7569(strM11090, C0104.m11233(str, i2 + 1)));
        }
        byte[] bArrM11190 = C0104.m11190(byteArrayOutputStream);
        int length = bArrM11190.length;
        int iM8751 = m8751(strM110902);
        for (int i3 = 0; i3 < length; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM8751));
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m8794(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((j$.util.stream.Stream) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8795(Object obj) {
        if (C0094.m9148() > 0) {
            return ((EnumC0500d) obj).getValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m8731(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
