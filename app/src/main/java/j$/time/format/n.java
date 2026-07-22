package j$.time.format;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.Locale;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class n implements g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f428short = {1770, 625, 576, 605, 593, 525, 1817};
    private final j$.time.temporal.a a;
    private final w b;
    private final c c;
    private volatile j d;

    /* JADX INFO: renamed from: ۟۟ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m7921() {
        if (C0098.m10857() < 0) {
            return f428short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static Locale m7922(Object obj) {
        if (C0095.m9210() > 0) {
            return ((q) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7923(Object obj, Object obj2, Object obj3) {
        if (C0106.m11345() <= 0) {
            return ((j) obj).j((q) obj2, (StringBuilder) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.a m7924(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((n) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.o m7925(Object obj) {
        if (C0083.m8022() < 0) {
            return ((q) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m7926(Object obj, long j, Object obj2) {
        if (C0099.m10878() < 0) {
            return ((s) obj).a(j, (w) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static w m7927(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((n) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static s m7928(Object obj) {
        if (C0099.m10878() < 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static c m7929(Object obj) {
        if (C0088.m8503() > 0) {
            return ((n) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static j m7930(Object obj) {
        if (C0083.m8022() < 0) {
            return ((n) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۨ, reason: contains not printable characters */
    public static Long m7931(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((q) obj).e((j$.time.temporal.r) obj2);
        }
        return null;
    }

    n(j$.time.temporal.a aVar, w wVar, c cVar) {
        this.a = aVar;
        this.b = wVar;
        this.c = cVar;
    }

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        String strM7926;
        Long lM7931 = m7931(qVar, m7924(this));
        if (lM7931 == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) C0088.m8522(m7925(qVar), C0086.m8277());
        if (nVar == null || nVar == C0103.m11146()) {
            c cVarM7929 = m7929(this);
            long jM8558 = C0088.m8558(lM7931);
            w wVarM7927 = m7927(this);
            m7922(qVar);
            strM7926 = m7926(m7928(cVarM7929), jM8558, wVarM7927);
        } else {
            c cVarM79292 = m7929(this);
            long jM85582 = C0088.m8558(lM7931);
            w wVarM79272 = m7927(this);
            m7922(qVar);
            strM7926 = m7926(m7928(cVarM79292), jM85582, wVarM79272);
        }
        if (strM7926 != null) {
            C0101.m11052(sb, strM7926);
            return true;
        }
        if (m7930(this) == null) {
            this.d = new j(m7924(this), 1, 19, C0106.m11315());
        }
        return m7923(m7930(this), qVar, sb);
    }

    public final String toString() {
        w wVarM8681 = C0091.m8681();
        String strM10962 = C0100.m10962(m7921(), 0, 1, 1731);
        String strM10856 = C0098.m10856(m7921(), 1, 5, 549);
        j$.time.temporal.a aVarM7924 = m7924(this);
        w wVarM7927 = m7927(this);
        if (wVarM7927 == wVarM8681) {
            StringBuilder sb = new StringBuilder(strM10856);
            C0082.m7988(sb, aVarM7924);
            C0101.m11052(sb, strM10962);
            return C0099.m10924(sb);
        }
        StringBuilder sb2 = new StringBuilder(strM10856);
        C0082.m7988(sb2, aVarM7924);
        C0101.m11052(sb2, C0080.m7573(m7921(), 6, 1, 1845));
        C0082.m7988(sb2, wVarM7927);
        C0101.m11052(sb2, strM10962);
        return C0099.m10924(sb2);
    }
}
