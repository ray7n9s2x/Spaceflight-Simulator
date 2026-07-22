package j$.time.format;

import j$.time.chrono.C0081;
import j$.time.z;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0097;
import j$.util.stream.C0099;

/* JADX INFO: loaded from: classes3.dex */
final class m implements g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f427short = {2025, 2012, 2013, 2006, 2017, 2006, 2004, 2010, 2012, 2013, 2042, 2007, 1947, 1946, 1797, 1797, 748};
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7917() {
        if (C0082.m7983() < 0) {
            return f427short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m7918(Object obj) {
        if (C0094.m9148() > 0) {
            return ((m) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m7919(Object obj, Object obj2) {
        if (C0100.m10983() > 0) {
            return ((q) obj).f((b) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static int m7920(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((m) obj).a;
        }
        return 0;
    }

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        switch (m7920(this)) {
            case 0:
                C0101.m11052(sb, (String) m7918(this));
                break;
            default:
                z zVar = (z) m7919(qVar, (b) m7918(this));
                if (zVar != null) {
                    C0101.m11052(sb, C0097.m10798(zVar));
                    break;
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (m7920(this)) {
            case 0:
                String strM8474 = C0087.m8474(m7917(), 14, 2, 1826);
                String str = (String) m7918(this);
                String strM9062 = C0093.m9062(m7917(), 16, 1, 715);
                String strM8098 = C0084.m8098(str, strM9062, strM8474);
                StringBuilder sb = new StringBuilder(strM9062);
                C0101.m11052(sb, strM8098);
                C0101.m11052(sb, strM9062);
                return C0099.m10924(sb);
            default:
                return C0084.m8120(m7917(), 0, 14, 1971);
        }
    }
}
