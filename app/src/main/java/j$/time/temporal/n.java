package j$.time.temporal;

import androidx.appcompat.app.AppCompatDelegate;
import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f457short = {1035, 1068, 1076, 1059, 1070, 1067, 1062, 1122, 1076, 1059, 1070, 1079, 1063, 1122, 1060, 1069, 1072, 1122, 2645, 2653, 2563, 2580, 2585, 2588, 2577, 2645, 2563, 2580, 2585, 2560, 2576, 2566, 2645, 1691, 1672, 1682, 287, 312, 288, 311, 314, 319, 306, 374, 304, 319, 307, 314, 306, 374, 772, 834, 843, 854, 772, 835, 833, 848, 780, 781, 772, 841, 833, 848, 844, 843, 832, 776, 772, 849, 855, 833, 772, 835, 833, 848, 872, 843, 842, 835, 780, 781, 772, 845, 842, 855, 848, 833, 837, 832, 2502, 2557, 2528, 2534, 2531, 2531, 2556, 2529, 2535, 2550, 2551, 2483, 2549, 2554, 2550, 2559, 2551, 2473, 2483, 2271, 2256, 2268, 2261, 2269};
    static final t a = new s(0);
    static final t b = new s(1);
    static final t c = new s(2);
    static final t d = new s(3);
    static final t e = new s(4);
    static final t f = new s(5);
    static final t g = new s(6);

    /* JADX INFO: renamed from: ۟۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8203() {
        if (C0097.m10823() > 0) {
            return f457short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۦ, reason: not valid java name and contains not printable characters */
    public static t m8204() {
        if (C0093.m9101() >= 0) {
            return a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۡ, reason: not valid java name and contains not printable characters */
    public static t m8205() {
        if (C0096.m10782() > 0) {
            return c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۢ, reason: contains not printable characters */
    public static t m8206() {
        if (C0103.m11154() <= 0) {
            return e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۧۥ, reason: contains not printable characters */
    public static t m8207() {
        if (C0096.m10782() >= 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۤ, reason: contains not printable characters */
    public static t m8208() {
        if (C0100.m10983() > 0) {
            return f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static t m8209() {
        if (C0089.m8594() <= 0) {
            return g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static t m8210() {
        if (C0103.m11154() <= 0) {
            return b;
        }
        return null;
    }

    public static t k() {
        return m8204();
    }

    public static w d(o oVar, r rVar) {
        if (!(rVar instanceof a)) {
            C0079.m7494(rVar, C0097.m10853(m8203(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 5, 2233));
            return C0094.m9149(rVar, oVar);
        }
        if (C0092.m8792(oVar, rVar)) {
            return C0090.m8651((a) rVar);
        }
        throw new v(C0101.m11024(C0085.m8236(m8203(), 90, 19, 2451), rVar));
    }

    public static t e() {
        return m8210();
    }

    public static int a(o oVar, r rVar) {
        w wVarM8099 = C0084.m8099(oVar, rVar);
        if (!C0104.m11204(wVarM8099)) {
            StringBuilder sb = new StringBuilder(C0086.m8291(m8203(), 36, 14, 342));
            C0082.m7988(sb, rVar);
            C0101.m11052(sb, C0098.m10856(m8203(), 50, 40, 804));
            throw new v(C0099.m10924(sb));
        }
        long jM11007 = C0100.m11007(oVar, rVar);
        if (C0101.m11040(wVarM8099, jM11007)) {
            return (int) jM11007;
        }
        StringBuilder sb2 = new StringBuilder(C0091.m8679(m8203(), 0, 18, 1090));
        C0082.m7988(sb2, rVar);
        C0101.m11052(sb2, C0091.m8679(m8203(), 18, 15, 2677));
        C0082.m7988(sb2, wVarM8099);
        C0101.m11052(sb2, C0105.m11310(m8203(), 33, 3, 1714));
        C0087.m8489(sb2, jM11007);
        throw new DateTimeException(C0099.m10924(sb2));
    }

    public static t i() {
        return m8205();
    }

    public static t j() {
        return m8206();
    }

    public static t h() {
        return m8207();
    }

    public static Object c(o oVar, t tVar) {
        if (tVar == m8204() || tVar == m8210() || tVar == m8205()) {
            return null;
        }
        return C0095.m9223(tVar, oVar);
    }

    public static t f() {
        return m8208();
    }

    public static t g() {
        return m8209();
    }

    public static m b(m mVar, long j, u uVar) {
        long j2;
        m mVarM10972 = mVar;
        if (j == Long.MIN_VALUE) {
            mVarM10972 = C0100.m10972(mVarM10972, Long.MAX_VALUE, uVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return C0100.m10972(mVarM10972, j2, uVar);
    }
}
