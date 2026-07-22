package j$.time.format;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.ArrayList;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class f implements g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f421short = {2532, 2922, 2129, 1686};
    private final g[] a;
    private final boolean b;

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static void m7883(Object obj) {
        if (C0088.m8503() > 0) {
            ((q) obj).g();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7884(Object obj) {
        if (C0093.m9101() >= 0) {
            ((q) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7885(Object obj) {
        if (C0079.m7512() > 0) {
            return ((f) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7886(Object obj, Object obj2, Object obj3) {
        if (C0094.m9148() > 0) {
            return ((g) obj).j((q) obj2, (StringBuilder) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static g[] m7887(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m7888() {
        if (C0080.m7553() >= 0) {
            return f421short;
        }
        return null;
    }

    f(ArrayList arrayList, boolean z) {
        this((g[]) C0103.m11157(arrayList, new g[C0101.m11061(arrayList)]), z);
    }

    f(g[] gVarArr, boolean z) {
        this.a = gVarArr;
        this.b = z;
    }

    public final f a() {
        return !m7885(this) ? this : new f(m7887(this), false);
    }

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        int iM7835 = C0081.m7835(sb);
        boolean zM7885 = m7885(this);
        if (zM7885) {
            m7883(qVar);
        }
        try {
            for (g gVar : m7887(this)) {
                if (!m7886(gVar, qVar, sb)) {
                    C0095.m9200(sb, iM7835);
                    return true;
                }
            }
            if (zM7885) {
                m7884(qVar);
            }
            return true;
        } finally {
            if (zM7885) {
                m7884(qVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        g[] gVarArrM7887 = m7887(this);
        if (gVarArrM7887 != null) {
            boolean zM7885 = m7885(this);
            C0101.m11052(sb, zM7885 ? C0081.m7837(m7888(), 0, 1, 2495) : C0102.m11094(m7888(), 1, 1, 2882));
            for (g gVar : gVarArrM7887) {
                C0082.m7988(sb, gVar);
            }
            C0101.m11052(sb, zM7885 ? C0095.m9204(m7888(), 2, 1, 2060) : C0101.m11060(m7888(), 3, 1, 1727));
        }
        return C0099.m10924(sb);
    }
}
