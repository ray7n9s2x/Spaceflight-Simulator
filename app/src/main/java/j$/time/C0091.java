package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.chrono.F;
import j$.time.chrono.InterfaceC0489b;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.InterfaceC0651w;
import j$.util.T;
import j$.util.U;
import j$.util.W;
import j$.util.Z;
import j$.util.c0;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.AbstractC0644z0;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.C0590o0;
import j$.util.stream.C0600q0;
import j$.util.stream.E;
import j$.util.stream.EnumC0548f3;
import j$.util.stream.IntStream;
import j$.util.stream.K0;
import java.io.ByteArrayOutputStream;
import java.io.C0103;
import java.io.C0104;
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.LongToDoubleFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.time.۟ۧ۠ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0091 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f478short = {1958, 3137};

    /* JADX INFO: renamed from: ۥ۟ۤۦ, reason: contains not printable characters */
    public static boolean f479;

    /* JADX INFO: renamed from: ۣ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static DoubleStream m8659(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((LongStream) obj).mapToDouble((LongToDoubleFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m8660(Object obj, double d) {
        if (C0080.m7553() > 0) {
            return ((DoubleToIntFunction) obj).applyAsInt(d);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8661(Object obj, Object obj2, Object obj3) {
        if (C0095.m9210() >= 0) {
            return ((AtomicReference) obj).compareAndSet(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.zone.b m8662(Object obj, int i) {
        if (C0085.m8230() > 0) {
            return ((j$.time.zone.e) obj).a(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m8663(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return AbstractC0644z0.m((K0) obj, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8664() {
        if (C0089.m8594() < 0) {
            return j$.time.temporal.a.ERA;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8665(Object obj) {
        if (C0087.m8458() < 0) {
            return Arrays.toString((int[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m8666(Object obj) {
        if (C0104.m11196() > 0) {
            Arrays.sort((int[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8667(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((Z) obj).tryAdvance((LongConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۥ, reason: not valid java name and contains not printable characters */
    public static void m8668(Object obj, int i) {
        if (C0093.m9101() >= 0) {
            ((DataOutput) obj).writeInt(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8669(Object obj, Object obj2) {
        if (C0084.m8116() >= 0) {
            ((j$.time.format.o) obj).f((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m8670() {
        if (C0090.m8624() >= 0) {
            return EnumC0548f3.REFERENCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8671(Object obj, int i, int i2, Object obj2) {
        if (C0089.m8594() <= 0) {
            Arrays.sort((Object[]) obj, i, i2, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m8672(Object obj, boolean z) {
        if (C0100.m10983() > 0) {
            return ((n) obj).C(z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static long m8673(Object obj) {
        if (C0104.m11196() > 0) {
            return ((E) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static LongStream m8674(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((LongStream) obj).peek((LongConsumer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8675(Object obj) {
        if (C0099.m10878() < 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۧ, reason: not valid java name and contains not printable characters */
    public static n m8676() {
        if (C0090.m8624() >= 0) {
            return n.SEPTEMBER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8677(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۤ, reason: not valid java name and contains not printable characters */
    public static IntStream m8678(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((j$.util.stream.LongStream) obj).t();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۧ, reason: not valid java name and contains not printable characters */
    public static Class m8680() {
        if (C0098.m10857() < 0) {
            return Boolean.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.format.w m8681() {
        if (C0104.m11196() >= 0) {
            return j$.time.format.w.FULL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۦ, reason: not valid java name and contains not printable characters */
    public static int m8682(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((j$.util.stream.r) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Double m8683(Object obj) {
        if (C0089.m8594() < 0) {
            return ((PrimitiveIterator.OfDouble) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢ۠, reason: not valid java name and contains not printable characters */
    public static Spliterator m8684(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((LongStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8685(Object obj) {
        if (C0081.m7818() < 0) {
            return ((InterfaceC0489b) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۥ, reason: not valid java name and contains not printable characters */
    public static W m8686(Object obj) {
        if (C0089.m8594() <= 0) {
            return U.a((Spliterator.OfInt) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m8687(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static F m8688() {
        if (C0084.m8116() > 0) {
            return F.BEFORE_ROC;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static LongStream m8689(Object obj) {
        if (C0082.m7983() < 0) {
            return ((LongStream) obj).sorted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m8690(Object obj, Object obj2) {
        if (C0103.m11154() < 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8691(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((Spliterator.OfDouble) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static Spliterator m8692(Object obj) {
        if (C0098.m10857() < 0) {
            return ((DoubleStream) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static int m8693(Object obj) {
        if (C0085.m8230() > 0) {
            return ((DataInput) obj).readInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۦۡ, reason: not valid java name and contains not printable characters */
    public static Optional m8694(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((Stream) obj).reduce((BinaryOperator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m8695(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            return ((j$.time.format.a) obj).a((Instant) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m8696(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            ((Spliterator.OfLong) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۢۥۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8697(Object obj, int i, long j) {
        if (C0079.m7512() >= 0) {
            return ((StringBuilder) obj).insert(i, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m8698(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((BaseStream) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m8699() {
        if (C0083.m8022() < 0) {
            return j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m8700(Object obj) {
        if (C0098.m10857() <= 0) {
            ((Iterator) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m8701(Object obj, Object obj2) {
        if (C0105.m11264() >= 0) {
            ((j$.util.stream.LongStream) obj).forEach((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static OptionalDouble m8702(Object obj) {
        if (C0104.m11196() > 0) {
            return ((DoubleStream) obj).average();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤ۠, reason: not valid java name and contains not printable characters */
    public static Optional m8703(Object obj) {
        if (C0093.m9101() >= 0) {
            return Optional.of(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۥۡ, reason: not valid java name and contains not printable characters */
    public static LongStream m8704(Object obj) {
        if (C0080.m7553() >= 0) {
            return C0590o0.j((j$.util.stream.LongStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8705(int i) {
        if (C0087.m8458() < 0) {
            return Modifier.isStatic(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static j m8706(Object obj) {
        if (C0085.m8230() > 0) {
            return ((r) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static IntStream m8707(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((IntStream) obj).filter((IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۤ, reason: contains not printable characters */
    public static int m8708() {
        return 1746758 ^ C0095.m9217((Object) "۟ۢۧ");
    }

    /* JADX INFO: renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static String m8709(String str) {
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
        String strM8291 = C0086.m8291(m8711(), 0, 1, 1991);
        while (C0092.m8751(strM8291) > 0) {
            strM8291 = C0102.m11090();
            if (C0092.m8751(strM8291) == 0) {
                strM8291 = C0081.m7837(m8711(), 1, 1, 3104);
            }
        }
        int iM8751 = C0092.m8751(strM8291);
        int iM87512 = C0092.m8751(strM110902);
        for (int i3 = 0; i3 < iM8751; i3++) {
            bArrM11190[i3] = (byte) (bArrM11190[i3] ^ C0104.m11233(strM110902, i3 % iM87512));
        }
        for (int iM87513 = 0; iM87513 < bArrM11190.length; iM87513 = C0092.m8751(C0102.m11090()) + 1) {
        }
        return new String(bArrM11190);
    }

    /* JADX INFO: renamed from: ۥۡۨۦ, reason: contains not printable characters */
    public static Object m8710(Object obj) {
        if (C0088.m8503() > 0) {
            return ((C0600q0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static short[] m8711() {
        if (C0092.m8724() < 0) {
            return f478short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۥۣ, reason: contains not printable characters */
    public static T m8712(Object obj) {
        if (C0090.m8624() > 0) {
            return ((T) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢ, reason: contains not printable characters */
    public static Object m8713(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((Field) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۨ, reason: contains not printable characters */
    public static c0 m8714(Object obj) {
        if (C0089.m8594() < 0) {
            return ((K0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static void m8715(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            ((InterfaceC0651w) obj).forEachRemaining((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m8716(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0090.m8624() >= 0) {
            return ((LongStream) obj).collect((Supplier) obj2, (ObjLongConsumer) obj3, (BiConsumer) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m8717(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((ListIterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥۧ, reason: not valid java name and contains not printable characters */
    public static Collection m8718(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((Map) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8719(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            ((Spliterator.OfInt) obj).forEachRemaining((Consumer<? super Integer>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8720(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((z) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static String m8679(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
