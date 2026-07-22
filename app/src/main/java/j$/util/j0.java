package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.util.NoSuchElementException;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class j0 implements F, DoubleConsumer, InterfaceC0651w {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f501short = {1131, 1056, 1133, 1072, 1139, 1137, 1148, 1148, 1145, 1150, 1143, 1072, 1088, 1122, 1145, 1149, 1145, 1124, 1145, 1126, 1141, 1113, 1124, 1141, 1122, 1137, 1124, 1151, 1122, 1086, 1119, 1142, 1108, 1151, 1125, 1138, 1148, 1141, 1086, 1142, 1151, 1122, 1109, 1137, 1139, 1144, 1090, 1141, 1149, 1137, 1145, 1150, 1145, 1150, 1143, 1108, 1151, 1125, 1138, 1148, 1141, 1080, 1137, 1139, 1124, 1145, 1151, 1150, 1066, 1066, 1137, 1139, 1139, 1141, 1120, 1124, 1081, 256, 331, 262, 347, 280, 282, 279, 279, 274, 277, 284, 347, 299, 265, 274, 278, 274, 271, 274, 269, 286, 306, 271, 286, 265, 282, 271, 276, 265, 341, 308, 285, 319, 276, 270, 281, 279, 286, 341, 277, 286, 259, 271, 311, 276, 277, 284, 339, 338};
    boolean a = false;
    double b;
    final /* synthetic */ T c;

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static double m9260(Object obj) {
        return C0106.m11345() <= 0 ? ((j0) obj).nextDouble() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m9261() {
        if (C0098.m10857() <= 0) {
            return f501short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9262(Object obj) {
        if (C0103.m11154() < 0) {
            return ((j0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static T m9263(Object obj) {
        if (C0103.m11154() < 0) {
            return ((j0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9264() {
        if (C0097.m10823() > 0) {
            return v0.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static double m9265(Object obj) {
        return C0094.m9148() >= 0 ? ((j0) obj).b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9266(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            v0.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9267(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((j0) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static Double m9268(Object obj) {
        if (C0105.m11264() > 0) {
            return ((j0) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m9269(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            ((j0) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.O
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m9269(this, (DoubleConsumer) obj);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return m9268(this);
    }

    @Override // j$.util.F
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0099.m10863(doubleConsumer);
        while (m9267(this)) {
            C0090.m8634(doubleConsumer, m9260(this));
        }
    }

    @Override // j$.util.F, java.util.Iterator
    public final Double next() {
        if (m9264()) {
            m9266(j0.class, C0080.m7573(m9261(), 77, 49, 379));
            throw null;
        }
        return C0085.m8245(m9260(this));
    }

    @Override // j$.util.F, java.util.Iterator, j$.util.InterfaceC0651w
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            m9269(this, (DoubleConsumer) consumer);
            return;
        }
        C0099.m10863(consumer);
        if (m9264()) {
            m9266(j0.class, C0103.m11135(m9261(), 0, 77, 1040));
            throw null;
        }
        C0099.m10863(consumer);
        m9269(this, new C(consumer));
    }

    j0(T t) {
        this.c = t;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!m9262(this)) {
            C0104.m11219(m9263(this), this);
        }
        return m9262(this);
    }

    @Override // j$.util.F
    public final double nextDouble() {
        if (!m9262(this) && !m9267(this)) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return m9265(this);
    }
}
