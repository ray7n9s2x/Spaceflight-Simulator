package j$.time.zone;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
import j$.time.chrono.AbstractC0496i;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.L;
import j$.time.chrono.v;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.n;
import j$.time.temporal.o;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.w;
import j$.time.y;
import j$.util.A;
import j$.util.AbstractC0505e;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.C0649u;
import j$.util.Comparator$CC;
import j$.util.E;
import j$.util.F;
import j$.util.N;
import j$.util.T;
import j$.util.Z;
import j$.util.b0;
import j$.util.c0;
import j$.util.concurrent.C0093;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.BaseStream;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0519a;
import j$.util.stream.C0540e0;
import j$.util.stream.C0569k;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC0597p2;
import j$.util.stream.J0;
import j$.util.stream.K0;
import j$.util.stream.LongStream;
import j$.util.t0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Optional;
import java.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.time.zone.ۣ۟ۤۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0088 {

    /* JADX INFO: renamed from: ۟ۦۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int f475 = 50;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m8499(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((C0569k) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8500(double d) {
        if (C0101.m11044() < 0) {
            return Double.isNaN(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static v m8501() {
        if (C0106.m11345() <= 0) {
            return v.CE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8502(Object obj) {
        if (C0098.m10857() < 0) {
            return ((A) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static int m8503() {
        return 1754515 ^ C0095.m9217((Object) "ۧۤ۟");
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m8504(String str) {
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

    /* JADX INFO: renamed from: ۟۠۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.b m8505() {
        if (C0105.m11264() >= 0) {
            return j$.time.temporal.b.MILLIS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static F m8506(Object obj) {
        if (C0090.m8624() > 0) {
            return ((E) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m8507(Object obj, int i) {
        if (C0090.m8624() > 0) {
            return Array.newInstance((Class<?>) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8508() {
        if (C0084.m8116() >= 0) {
            return j$.time.temporal.a.OFFSET_SECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8509(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            ((f0) obj).forEachRemaining((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8510(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8511() {
        if (C0083.m8022() <= 0) {
            return j$.time.temporal.a.PROLEPTIC_MONTH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Comparator m8512() {
        if (C0096.m10782() >= 0) {
            return Comparator$CC.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static n m8513(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((n) obj).G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8514(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((AbstractCollection) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Optional m8515(Object obj) {
        if (C0101.m11044() < 0) {
            return ((Stream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤ۠, reason: not valid java name and contains not printable characters */
    public static BaseStream m8516(Object obj) {
        if (C0102.m11109() < 0) {
            return ((BaseStream) obj).unordered();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Comparator m8517(Object obj) {
        if (C0105.m11264() > 0) {
            return ((j$.util.function.b) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static long m8519(long j, long j2) {
        if (C0104.m11196() >= 0) {
            return Math.min(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static Iterator m8520(Object obj) {
        if (C0084.m8116() > 0) {
            return t0.i((f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m8521(Object obj, long j) {
        if (C0098.m10857() < 0) {
            ((LongConsumer) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m8522(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((o) obj).v((t) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.E m8523(Object obj) {
        if (C0096.m10782() > 0) {
            return ((IntStream) obj).asDoubleStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8524(Object obj, Object obj2, long j, long j2, long j3) {
        if (C0094.m9148() > 0) {
            return ((j$.sun.misc.a) obj).d(obj2, j, j2, j3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static long m8525(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((w) obj).d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static long m8526(Object obj, long j, Object obj2) {
        if (C0106.m11345() < 0) {
            return ((LongStream) obj).reduce(j, (LongBinaryOperator) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m8527(Object obj) {
        if (C0084.m8116() > 0) {
            return ((j$.time.A) obj).I();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8528(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            return AbstractC0496i.b((InterfaceC0489b) obj, (InterfaceC0489b) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۢ, reason: not valid java name and contains not printable characters */
    public static c0 m8529(Object obj) {
        if (C0095.m9210() > 0) {
            return ((b0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static Locale m8530(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((j$.time.format.a) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static L m8531() {
        if (C0101.m11044() < 0) {
            return L.BEFORE_BE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static IOException m8532(Object obj) {
        if (C0103.m11154() < 0) {
            return ((UncheckedIOException) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m8533(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0100.m10983() > 0) {
            return ((j$.util.stream.E) obj).collect((Supplier) obj2, (ObjDoubleConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8534(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((AbstractCollection) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۧ, reason: not valid java name and contains not printable characters */
    public static void m8535(Object obj, Object obj2) {
        if (m8503() > 0) {
            ((j$.time.format.o) obj).a((j$.time.format.a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۦ۟, reason: not valid java name and contains not printable characters */
    public static Spliterator m8536(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((java.util.stream.BaseStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m8537(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((ToIntFunction) obj).applyAsInt(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static N m8538(Object obj) {
        if (C0089.m8594() < 0) {
            return t0.h((Z) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m8539(Object obj, Object obj2, Object obj3) {
        if (C0100.m10983() >= 0) {
            return ((j$.util.stream.Stream) obj).reduce(obj2, (BinaryOperator) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static void m8540(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            ((C0649u) obj).b((C0649u) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.stream.E m8541(Object obj, Object obj2) {
        if (C0091.m8708() > 0) {
            return ((j$.util.stream.E) obj).b((C0519a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8542(Object obj) {
        if (C0090.m8624() > 0) {
            return ((CountedCompleter) obj).getPendingCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static y m8543(Object obj, long j, Object obj2) {
        if (C0100.m10983() > 0) {
            return ((y) obj).I(j, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m8544(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            AbstractC0505e.c((Z) obj, (Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۢۧۨ, reason: not valid java name and contains not printable characters */
    public static IntConsumer m8545(Object obj) {
        if (C0100.m10983() > 0) {
            return ((j$.util.function.e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m8546(Object obj, Object obj2, double d) {
        if (C0083.m8022() <= 0) {
            ((ObjDoubleConsumer) obj).accept(obj2, d);
        }
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8547(Object obj, Object obj2) {
        if (C0105.m11264() >= 0) {
            return ((j$.util.stream.Stream) obj).allMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static long m8548(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((f0) obj).getExactSizeIfKnown();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۥۥ۟, reason: not valid java name and contains not printable characters */
    public static BaseStream m8549(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((BaseStream) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۥۡ, reason: contains not printable characters */
    public static long m8550(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AtomicLong) obj).get();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static void m8551(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            ((java.util.stream.IntStream) obj).forEachOrdered((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۠ۧ, reason: contains not printable characters */
    public static Object m8552(Object obj, Object obj2, Object obj3) {
        if (C0098.m10857() < 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۡ, reason: contains not printable characters */
    public static InterfaceC0597p2 m8553(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0540e0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢ, reason: contains not printable characters */
    public static Class m8554(Object obj) {
        if (C0081.m7818() < 0) {
            return ((Class) obj).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۤ, reason: contains not printable characters */
    public static boolean m8555(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((Spliterator.OfDouble) obj).tryAdvance((DoubleConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8556(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return AbstractC0505e.h((T) obj, (Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static n[] m8557() {
        if (C0087.m8458() <= 0) {
            return n.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m8558(Object obj) {
        if (C0099.m10878() < 0) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.o m8559(Object obj, int i) {
        if (C0080.m7553() > 0) {
            return ((j$.time.chrono.n) obj).A(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static long m8560(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((Instant) obj).getEpochSecond();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m8561(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((K0) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8562(Object obj, int i) {
        if (C0090.m8624() >= 0) {
            return ((f0) obj).hasCharacteristics(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static J0 m8563(Object obj) {
        if (C0094.m9148() >= 0) {
            return AbstractC0644z0.Q((J0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static double m8564(Object obj) {
        return C0102.m11109() < 0 ? ((DoubleStream) obj).sum() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m8565(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((j$.time.w) obj).s((r) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8566(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            ((j$.util.stream.Stream) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m8518(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
