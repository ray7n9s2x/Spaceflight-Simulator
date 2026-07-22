package j$.time;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.LocationRequest;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.AbstractC0496i;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.stream.C0098;
import java.io.C0104;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements j$.time.temporal.o, j$.time.temporal.p {
    public static final n APRIL;
    public static final n AUGUST;
    public static final n DECEMBER;
    public static final n FEBRUARY;
    public static final n JANUARY;
    public static final n JULY;
    public static final n JUNE;
    public static final n MARCH;
    public static final n MAY;
    public static final n NOVEMBER;
    public static final n OCTOBER;
    public static final n SEPTEMBER;
    private static final n[] a;
    private static final /* synthetic */ n[] b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f444short = {631, 636, 627, 616, 636, 623, 612, 1333, 1334, 1329, 1313, 1318, 1330, 1313, 1322, 616, 612, 631, 614, 621, 777, 792, 794, 769, 772, 2972, 2960, 2952, 3063, 3048, 3059, 3064, 2560, 2591, 2566, 2579, 1110, 1090, 1104, 1090, 1092, 1091, 867, 885, 864, 868, 885, 893, 882, 885, 866, 416, 428, 443, 416, 429, 426, 445, 580, 581, 604, 591, 583, 584, 591, 600, 279, 278, 272, 278, 286, 273, 278, 257, 2650, 2685, 2661, 2674, 2687, 2682, 2679, 2611, 2661, 2674, 2687, 2662, 2678, 2611, 2677, 2684, 2657, 2611, 2654, 2684, 2685, 2663, 2683, 2652, 2677, 2634, 2678, 2674, 2657, 2601, 2611, 939, 912, 909, 907, 910, 910, 913, 908, 906, 923, 922, 990, 920, 919, 923, 914, 922, 964, 990, 2774, 2803, 2813, 2786, 2788, 2787, 2810, 2802, 2809, 2787, 2743, 2808, 2809, 2811, 2798, 2743, 2788, 2786, 2791, 2791, 2808, 2789, 2787, 2802, 2803, 2743, 2808, 2809, 2743, 2782, 2756, 2776, 2743, 2803, 2806, 2787, 2802, 2746, 2787, 2814, 2810, 2802};

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) b.clone();
    }

    static {
        n nVar = new n(C0104.m11206(f444short, 0, 7, 573), 0);
        JANUARY = nVar;
        n nVar2 = new n(C0093.m9062(f444short, 7, 8, 1395), 1);
        FEBRUARY = nVar2;
        n nVar3 = new n(C0080.m7573(f444short, 15, 5, 549), 2);
        MARCH = nVar3;
        n nVar4 = new n(C0092.m8731(f444short, 20, 5, 840), 3);
        APRIL = nVar4;
        n nVar5 = new n(C0083.m8037(f444short, 25, 3, 3025), 4);
        MAY = nVar5;
        n nVar6 = new n(C0102.m11094(f444short, 28, 4, AuthApiStatusCodes.AUTH_URL_RESOLUTION), 5);
        JUNE = nVar6;
        n nVar7 = new n(C0085.m8236(f444short, 32, 4, 2634), 6);
        JULY = nVar7;
        n nVar8 = new n(C0098.m10856(f444short, 36, 6, 1047), 7);
        AUGUST = nVar8;
        n nVar9 = new n(C0092.m8731(f444short, 42, 9, 816), 8);
        SEPTEMBER = nVar9;
        n nVar10 = new n(C0079.m7503(f444short, 51, 7, 495), 9);
        OCTOBER = nVar10;
        n nVar11 = new n(C0080.m7573(f444short, 58, 8, 522), 10);
        NOVEMBER = nVar11;
        n nVar12 = new n(C0086.m8291(f444short, 66, 8, 339), 11);
        DECEMBER = nVar12;
        b = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        a = values();
    }

    public static n F(int i) {
        if (i < 1 || i > 12) {
            throw new DateTimeException(C0086.m8291(f444short, 74, 31, 2579) + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.j();
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(AbstractC0487c.a(C0079.m7503(f444short, LocationRequest.PRIORITY_NO_POWER, 19, 1022), rVar));
        }
        return rVar.k(this);
    }

    public final n G() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int D(boolean z) {
        int i = m.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int E() {
        int i = m.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int C(boolean z) {
        switch (m.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.u.d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!AbstractC0496i.p(mVar).equals(j$.time.chrono.u.d)) {
            throw new DateTimeException(C0093.m9062(f444short, 124, 42, 2711));
        }
        return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
