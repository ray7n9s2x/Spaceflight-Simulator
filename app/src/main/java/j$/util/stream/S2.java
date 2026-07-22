package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import java.util.Iterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
class S2 extends Y2 implements DoubleConsumer {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f519short = {1122, 1065, 1124, 1081, 1146, 1144, 1141, 1141, 1136, 1143, 1150, 1081, 1098, 1129, 1136, 1143, 1148, 1149, 1115, 1132, 1151, 1151, 1148, 1131, 1079, 1110, 1151, 1117, 1142, 1132, 1147, 1141, 1148, 1079, 1151, 1142, 1131, 1116, 1144, 1146, 1137, 1073, 1114, 1142, 1143, 1130, 1132, 1140, 1148, 1131, 1072, 2098, 2148, 2124, 2171, 2162, 2169, 2160, 2147, 2175, 2090, 2098, 2163, 2107, 2103, 2164, 2175, 2146, 2169, 2172, 2148, 2090, 2098, 2163, 2122, 2098, 2148, 2087, 2161, 2137, 2158, 2151, 2156, 2149, 2166, 2154, 2111, 2087, 2150, 2094, 2082, 2145, 2154, 2167, 2156, 2153, 2161, 2111, 2087, 2150, 2143, 2087, 2161, 2092, 2092, 2092};

    /* JADX INFO: renamed from: ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m9727() {
        if (C0096.m10782() > 0) {
            return f519short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۡ, reason: not valid java name and contains not printable characters */
    public static void m9728(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m9729(Object obj) {
        if (C0079.m7512() > 0) {
            return ((S2) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9730() {
        if (C0084.m8116() >= 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m9731(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9732(Object obj) {
        if (C0082.m7983() < 0) {
            ((Y2) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۦ۟۠ۥ, reason: contains not printable characters */
    public static Object m9733(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static void m9734(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            ((Y2) obj).e(obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9735(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m9736(Object obj) {
        if (C0105.m11264() > 0) {
            return ((Y2) obj).d();
        }
        return null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.Y2
    protected final void s(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        for (int i3 = i; i3 < i2; i3++) {
            C0090.m8634(doubleConsumer, dArr[i3]);
        }
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    public /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return m9729(this);
    }

    @Override // j$.util.stream.Y2
    protected final int t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            m9734(this, (DoubleConsumer) consumer);
        } else {
            if (m9730()) {
                m9728(C0092.m8727(this), C0081.m7837(m9727(), 0, 51, 1049));
                throw null;
            }
            C0092.m8739((R2) m9729(this), consumer);
        }
    }

    @Override // j$.util.stream.Y2
    protected final Object[] w() {
        return new double[8][];
    }

    @Override // j$.util.stream.Y2
    public final Object c(int i) {
        return new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        m9732(this);
        double[] dArr = (double[]) m9733(this);
        int iM9735 = m9735(this);
        this.b = iM9735 + 1;
        dArr[iM9735] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0092.m8781(m9729(this));
    }

    public j$.util.T y() {
        return new R2(this, 0, m9731(this), 0, m9735(this));
    }

    public final String toString() {
        double[] dArr = (double[]) m9736(this);
        if (dArr.length < 200) {
            return C0086.m8314(C0089.m8581(m9727(), 51, 26, 2071), new Object[]{C0084.m8109(C0092.m8727(this)), C0102.m11105(dArr.length), C0102.m11105(m9731(this)), C0089.m8574(dArr)});
        }
        return C0086.m8314(C0091.m8679(m9727(), 77, 29, 2050), new Object[]{C0084.m8109(C0092.m8727(this)), C0102.m11105(dArr.length), C0102.m11105(m9731(this)), C0089.m8574(C0090.m8638(dArr, 200))});
    }
}
