package j$.util.stream;

import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
abstract class W0 extends N0 implements K0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f521short = {699, 668, 666, 653, 649, 645, 712, 667, 641, 658, 653, 712, 653, 656, 651, 653, 653, 652, 667, 712, 645, 649, 656, 712, 649, 666, 666, 649, 657, 712, 667, 641, 658, 653, 2039, 1953, 1929, 2039, 1953, 2044, 2039, 1953, 1935, 1279, 1193, 1153, 1193, 1203, 1184, 1215, 1255, 1279, 1214, 1159};

    /* JADX INFO: renamed from: ۟۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static long m9802(Object obj) {
        if (C0106.m11345() < 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m9803() {
        if (C0084.m8116() >= 0) {
            return f521short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static L0 m9804(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((N0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡ۟, reason: not valid java name and contains not printable characters */
    public static L0 m9805(Object obj) {
        if (C0081.m7818() < 0) {
            return ((N0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m9806(Object obj, int i, Object obj2) {
        if (C0105.m11264() > 0) {
            ((W0) obj).r(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static long m9807(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((N0) obj).count();
        }
        return 0L;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0091.m8663(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        C0094.m9118((K0) m9804(this), obj);
        C0094.m9118((K0) m9805(this), obj);
    }

    @Override // j$.util.stream.K0
    public final void r(int i, Object obj) {
        L0 l0M9804 = m9804(this);
        C0087.m8493((K0) l0M9804, i, obj);
        C0087.m8493((K0) m9805(this), i + ((int) m9802((K0) l0M9804)), obj);
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        long jM9807 = m9807(this);
        if (jM9807 >= 2147483639) {
            throw new IllegalArgumentException(C0096.m10776(m9803(), 0, 34, 744));
        }
        Object objM8282 = C0086.m8282(this, (int) jM9807);
        m9806(this, 0, objM8282);
        return objM8282;
    }

    public final String toString() {
        return m9807(this) < 32 ? C0086.m8314(C0088.m8518(m9803(), 34, 9, 2002), new Object[]{C0084.m8091(C0092.m8727(this)), m9804(this), m9805(this)}) : C0086.m8314(C0088.m8518(m9803(), 43, 11, 1242), new Object[]{C0084.m8091(C0092.m8727(this)), C0106.m11351(m9807(this))});
    }
}
