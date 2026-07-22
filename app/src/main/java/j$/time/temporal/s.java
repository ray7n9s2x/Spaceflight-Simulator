package j$.time.temporal;

import androidx.core.view.PointerIconCompat;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.z;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.io.C0103;
import java.io.C0104;

/* JADX INFO: loaded from: classes3.dex */
final class s implements t {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f458short = {957, 926, 914, 912, 925, 933, 920, 924, 916, 2892, 2927, 2915, 2913, 2924, 2884, 2913, 2932, 2917, 2393, 2412, 2413, 2406, 2305, 2356, 2357, 2366, 2324, 2365, 2365, 2344, 2366, 2351, 521, 555, 572, 570, 560, 554, 560, 566, 567, 2624, 2667, 2673, 2668, 2669, 2668, 2671, 2668, 2660, 2682, 2171, 2126, 2127, 2116, 2152, 2117};
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8211(Object obj) {
        if (C0080.m7553() > 0) {
            return ((s) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static t m8212() {
        if (C0095.m9210() >= 0) {
            return n.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static t m8213() {
        if (C0084.m8116() >= 0) {
            return n.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡ۠, reason: contains not printable characters */
    public static short[] m8214() {
        if (C0087.m8458() < 0) {
            return f458short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static t m8215() {
        if (C0102.m11109() < 0) {
            return n.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟۠, reason: not valid java name and contains not printable characters */
    public static t m8216() {
        if (C0097.m10823() >= 0) {
            return n.a;
        }
        return null;
    }

    @Override // j$.time.temporal.t
    public final Object a(o oVar) {
        switch (m8211(this)) {
            case 0:
                return (z) C0088.m8522(oVar, m8216());
            case 1:
                return (j$.time.chrono.n) C0088.m8522(oVar, m8213());
            case 2:
                return (u) C0088.m8522(oVar, m8212());
            case 3:
                a aVarM8508 = C0088.m8508();
                if (C0092.m8792(oVar, aVarM8508)) {
                    return C0090.m8622(C0097.m10845(oVar, aVarM8508));
                }
                return null;
            case 4:
                z zVar = (z) C0088.m8522(oVar, m8216());
                return zVar != null ? zVar : (z) C0088.m8522(oVar, m8215());
            case 5:
                a aVarM9191 = C0095.m9191();
                if (C0092.m8792(oVar, aVarM9191)) {
                    return C0083.m8044(C0100.m11007(oVar, aVarM9191));
                }
                return null;
            default:
                a aVarM8636 = C0090.m8636();
                if (C0092.m8792(oVar, aVarM8636)) {
                    return C0085.m8231(C0100.m11007(oVar, aVarM8636));
                }
                return null;
        }
    }

    public final String toString() {
        switch (m8211(this)) {
            case 0:
                return C0094.m9107(m8214(), 51, 6, 2081);
            case 1:
                return C0095.m9204(m8214(), 41, 10, 2563);
            case 2:
                return C0079.m7503(m8214(), 32, 9, 601);
            case 3:
                return C0093.m9062(m8214(), 22, 10, 2395);
            case 4:
                return C0103.m11135(m8214(), 18, 4, 2307);
            case 5:
                return C0104.m11206(m8214(), 9, 9, 2816);
            default:
                return C0091.m8679(m8214(), 0, 9, PointerIconCompat.TYPE_VERTICAL_TEXT);
        }
    }
}
