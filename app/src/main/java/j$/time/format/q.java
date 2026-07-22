package j$.time.format;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.chrono.InterfaceC0489b;
import j$.time.temporal.C0086;
import j$.time.z;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.Locale;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class q {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f431short = {3029, 3054, 3041, 3042, 3052, 3045, 2976, 3060, 3055, 2976, 3041, 3056, 3056, 3052, 3065, 2976, 3055, 3062, 3045, 3058, 3058, 3049, 3044, 3045, 2976, 3043, 3048, 3058, 3055, 3054, 3055, 3052, 3055, 3047, 3065, 2976, 2983, 723, 724, 662, 657, 663, 661, 641, 647, 657, 724, 640, 668, 657, 724, 640, 657, 665, 644, 667, 646, 661, 664, 724, 667, 662, 670, 657, 663, 640, 724, 662, 657, 669, 666, 659, 724, 658, 667, 646, 665, 661, 640, 640, 657, 656, 724, 663, 667, 666, 640, 661, 669, 666, 647, 724, 656, 661, 640, 657, 724, 658, 669, 657, 664, 656, 647, 724, 662, 641, 640, 724, 656, 667, 657, 647, 724, 666, 667, 640, 724, 646, 657, 644, 646, 657, 647, 657, 666, 640, 724, 661, 724, 643, 668, 667, 664, 657, 724, 656, 661, 640, 657, 718, 724, 2264, 2275, 2284, 2287, 2273, 2280, 2221, 2297, 2274, 2221, 2280, 2293, 2297, 2303, 2284, 2286, 2297, 2221, 2566, 2624, 2644, 2633, 2635, 2566, 2642, 2627, 2635, 2646, 2633, 2644, 2631, 2634, 2566};
    private j$.time.temporal.o a;
    private a b;
    private int c;

    /* JADX INFO: renamed from: ۟۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static a m7958(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((q) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.o m7959(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((q) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧ۠, reason: contains not printable characters */
    public static int m7960(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((q) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7961() {
        if (C0099.m10878() <= 0) {
            return f431short;
        }
        return null;
    }

    q(Instant instant, a aVar) {
        Instant instant2 = instant;
        j$.time.chrono.n nVarM9099 = C0093.m9099(aVar);
        j$.time.temporal.o pVar = instant2;
        if (nVarM9099 != null) {
            j$.time.chrono.n nVar = (j$.time.chrono.n) C0090.m8647(instant2, C0086.m8277());
            z zVar = (z) C0090.m8647(instant2, C0084.m8090());
            InterfaceC0489b interfaceC0489bM11338 = null;
            nVarM9099 = C0097.m10841(nVarM9099, nVar) ? null : nVarM9099;
            C0097.m10841(null, zVar);
            pVar = instant2;
            if (nVarM9099 != null) {
                j$.time.chrono.n nVar2 = nVarM9099 != null ? nVarM9099 : nVar;
                if (nVarM9099 != null) {
                    if (C0090.m8646(instant2, C0095.m9191())) {
                        interfaceC0489bM11338 = C0106.m11338(nVar2, instant2);
                    } else if (nVarM9099 != C0103.m11146() || nVar != null) {
                        for (j$.time.temporal.a aVar2 : C0103.m11144()) {
                            if (C0084.m8093(aVar2) && C0090.m8646(instant2, aVar2)) {
                                StringBuilder sb = new StringBuilder(C0084.m8120(m7961(), 0, 37, 2944));
                                C0082.m7988(sb, nVarM9099);
                                C0101.m11052(sb, C0082.m7966(m7961(), 37, 104, 756));
                                C0082.m7988(sb, instant2);
                                throw new DateTimeException(C0099.m10924(sb));
                            }
                        }
                    }
                }
                pVar = new p(interfaceC0489bM11338, instant2, nVar2, zVar);
            }
        }
        this.a = pVar;
        this.b = aVar;
    }

    final j$.time.temporal.o d() {
        return m7959(this);
    }

    final Locale c() {
        return C0088.m8530(m7958(this));
    }

    final t b() {
        return C0094.m9155(m7958(this));
    }

    final void g() {
        this.c = m7960(this) + 1;
    }

    final void a() {
        this.c = m7960(this) - 1;
    }

    final Object f(b bVar) {
        j$.time.temporal.o oVarM7959 = m7959(this);
        Object objM8522 = C0088.m8522(oVarM7959, bVar);
        if (objM8522 != null || m7960(this) != 0) {
            return objM8522;
        }
        StringBuilder sb = new StringBuilder(C0079.m7503(m7961(), 141, 18, 2189));
        C0082.m7988(sb, bVar);
        C0101.m11052(sb, C0091.m8679(m7961(), 159, 15, 2598));
        C0082.m7988(sb, oVarM7959);
        throw new DateTimeException(C0099.m10924(sb));
    }

    final Long e(j$.time.temporal.r rVar) {
        int iM7960 = m7960(this);
        j$.time.temporal.o oVarM7959 = m7959(this);
        if (iM7960 <= 0 || C0092.m8792(oVarM7959, rVar)) {
            return C0106.m11351(C0100.m11007(oVarM7959, rVar));
        }
        return null;
    }

    public final String toString() {
        return C0087.m8479(m7959(this));
    }
}
