package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0496i {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f406short = {520, 559, 567, 544, 557, 552, 549, 609, 551, 552, 548, 557, 549, 609, 614, 520, 559, 562, 565, 544, 559, 565, 530, 548, 546, 558, 559, 549, 562, 614, 609, 551, 558, 563, 609, 550, 548, 565, 617, 616, 609, 556, 548, 565, 553, 558, 549, 621, 609, 564, 562, 548, 609, 550, 548, 565, 525, 558, 559, 550, 617, 616, 609, 552, 559, 562, 565, 548, 544, 549, 2055, 2108, 2081, 2087, 2082, 2082, 2109, 2080, 2086, 2103, 2102, 2162, 2100, 2107, 2103, 2110, 2102, 2152, 2162, 1341, 1332, 1332, 1313, 1335, 1318, 767, 750, 742, 763, 740, 761, 746, 743, 2480, 2481, 2482, 2485, 2465, 2488, 2464, 2459, 2486, 2494};

    /* JADX INFO: renamed from: ۟ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7706() {
        if (C0092.m8724() <= 0) {
            return f406short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨ۠, reason: contains not printable characters */
    public static int[] m7707() {
        if (C0083.m8022() <= 0) {
            return AbstractC0497j.a;
        }
        return null;
    }

    public static boolean i(o oVar, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == C0091.m8664() : rVar != null && C0103.m11161(rVar, oVar);
    }

    public static n p(j$.time.temporal.o oVar) {
        C0079.m7494(oVar, C0089.m8581(m7706(), 95, 8, 651));
        Object objM7494 = (n) C0088.m8522(oVar, C0086.m8277());
        u uVarM11146 = C0103.m11146();
        if (objM7494 == null) {
            objM7494 = C0079.m7494(uVarM11146, C0091.m8679(m7706(), 103, 10, 2516));
        }
        return (n) objM7494;
    }

    public static int e(InterfaceC0498k interfaceC0498k, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m7707()[C0105.m11258((j$.time.temporal.a) rVar)];
            if (i == 1) {
                throw new j$.time.temporal.v(C0089.m8581(m7706(), 0, 70, 577));
            }
            if (i == 2) {
                return C0088.m8527(C0100.m10988(interfaceC0498k));
            }
            return C0097.m10845(C0095.m9189(interfaceC0498k), rVar);
        }
        return C0103.m11167(interfaceC0498k, rVar);
    }

    public static int f(o oVar, j$.time.temporal.a aVar) {
        if (aVar == C0091.m8664()) {
            return C0103.m11169(oVar);
        }
        return C0103.m11167(oVar, aVar);
    }

    public static long g(o oVar, j$.time.temporal.r rVar) {
        if (rVar == C0091.m8664()) {
            return C0103.m11169(oVar);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(C0101.m11024(C0089.m8581(m7706(), 70, 19, 2130), rVar));
        }
        return C0095.m9198(rVar, oVar);
    }

    public static Object m(o oVar, j$.time.temporal.t tVar) {
        if (tVar == C0102.m11078()) {
            return C0100.m10996();
        }
        return C0096.m10784(oVar, tVar);
    }

    public static Object k(InterfaceC0492e interfaceC0492e, j$.time.temporal.t tVar) {
        if (tVar == C0084.m8090() || tVar == C0094.m9122() || tVar == C0081.m7843()) {
            return null;
        }
        if (tVar == C0081.m7795()) {
            return C0092.m8742(interfaceC0492e);
        }
        if (tVar == C0086.m8277()) {
            return C0080.m7551(interfaceC0492e);
        }
        if (tVar == C0102.m11078()) {
            return C0086.m8322();
        }
        return C0095.m9223(tVar, interfaceC0492e);
    }

    public static boolean h(InterfaceC0489b interfaceC0489b, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return C0084.m8093((j$.time.temporal.a) rVar);
        }
        return rVar != null && C0103.m11161(rVar, interfaceC0489b);
    }

    public static long n(InterfaceC0492e interfaceC0492e, j$.time.A a) {
        C0079.m7494(a, C0082.m7966(m7706(), 89, 6, 1362));
        return ((C0099.m10861(C0084.m8087(interfaceC0492e)) * 86400) + ((long) C0102.m11070(C0092.m8742(interfaceC0492e)))) - ((long) C0088.m8527(a));
    }

    public static Object l(InterfaceC0498k interfaceC0498k, j$.time.temporal.t tVar) {
        if (tVar == C0094.m9122() || tVar == C0084.m8090()) {
            return C0099.m10927(interfaceC0498k);
        }
        if (tVar == C0081.m7843()) {
            return C0100.m10988(interfaceC0498k);
        }
        if (tVar == C0081.m7795()) {
            return C0081.m7809(interfaceC0498k);
        }
        if (tVar == C0086.m8277()) {
            return C0083.m8051(interfaceC0498k);
        }
        if (tVar == C0102.m11078()) {
            return C0086.m8322();
        }
        return C0095.m9223(tVar, interfaceC0498k);
    }

    public static int c(InterfaceC0492e interfaceC0492e, InterfaceC0492e interfaceC0492e2) {
        int iM8292 = C0086.m8292(C0084.m8087(interfaceC0492e), C0084.m8087(interfaceC0492e2));
        if (iM8292 != 0) {
            return iM8292;
        }
        int iM8025 = C0083.m8025(C0092.m8742(interfaceC0492e), C0092.m8742(interfaceC0492e2));
        if (iM8025 != 0) {
            return iM8025;
        }
        return C0092.m8726(C0105.m11279((AbstractC0488a) C0080.m7551(interfaceC0492e)), C0105.m11279(C0080.m7551(interfaceC0492e2)));
    }

    public static Object j(InterfaceC0489b interfaceC0489b, j$.time.temporal.t tVar) {
        if (tVar == C0084.m8090() || tVar == C0094.m9122() || tVar == C0081.m7843() || tVar == C0081.m7795()) {
            return null;
        }
        if (tVar == C0086.m8277()) {
            return C0099.m10916(interfaceC0489b);
        }
        if (tVar == C0102.m11078()) {
            return C0095.m9215();
        }
        return C0095.m9223(tVar, interfaceC0489b);
    }

    public static j$.time.temporal.m a(InterfaceC0489b interfaceC0489b, j$.time.temporal.m mVar) {
        return C0089.m8600(mVar, C0099.m10861(interfaceC0489b), C0095.m9191());
    }

    public static long o(InterfaceC0498k interfaceC0498k) {
        return ((C0099.m10861(C0090.m8607(interfaceC0498k)) * 86400) + ((long) C0102.m11070(C0081.m7809(interfaceC0498k)))) - ((long) C0088.m8527(C0100.m10988(interfaceC0498k)));
    }

    public static int d(InterfaceC0498k interfaceC0498k, InterfaceC0498k interfaceC0498k2) {
        int iM11272 = C0105.m11272(C0092.m8743(interfaceC0498k), C0092.m8743(interfaceC0498k2));
        if (iM11272 != 0) {
            return iM11272;
        }
        int iM11356 = C0106.m11356(C0081.m7809(interfaceC0498k)) - C0106.m11356(C0081.m7809(interfaceC0498k2));
        if (iM11356 != 0) {
            return iM11356;
        }
        int iM8327 = C0086.m8327(C0095.m9189(interfaceC0498k), C0095.m9189(interfaceC0498k2));
        if (iM8327 != 0) {
            return iM8327;
        }
        int iM8726 = C0092.m8726(C0097.m10798(C0099.m10927(interfaceC0498k)), C0097.m10798(C0099.m10927(interfaceC0498k2)));
        if (iM8726 != 0) {
            return iM8726;
        }
        return C0092.m8726(C0105.m11279((AbstractC0488a) C0083.m8051(interfaceC0498k)), C0105.m11279(C0083.m8051(interfaceC0498k2)));
    }

    public static int b(InterfaceC0489b interfaceC0489b, InterfaceC0489b interfaceC0489b2) {
        int iM11272 = C0105.m11272(C0099.m10861(interfaceC0489b), C0099.m10861(interfaceC0489b2));
        if (iM11272 != 0) {
            return iM11272;
        }
        return C0092.m8726(C0105.m11279((AbstractC0488a) C0099.m10916(interfaceC0489b)), C0105.m11279(C0099.m10916(interfaceC0489b2)));
    }
}
