package j$.time.format;

import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0097;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public static final w FULL;
    public static final w FULL_STANDALONE;
    public static final w NARROW;
    public static final w NARROW_STANDALONE;
    public static final w SHORT;
    public static final w SHORT_STANDALONE;
    private static final /* synthetic */ w[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f435short = {1019, 1000, 1009, 1009, 471, 452, 477, 477, 462, 450, 453, 464, 479, 469, 464, 477, 478, 479, 468, 2530, 2553, 2558, 2531, 2533, 2010, 1985, 1990, 2011, 2013, 2006, 2010, 2013, 1992, 1991, 1997, 1992, 1989, 1990, 1991, 1996, 1361, 1374, 1357, 1357, 1360, 1352, 2834, 2845, 2830, 2830, 2835, 2827, 2819, 2831, 2824, 2845, 2834, 2840, 2845, 2832, 2835, 2834, 2841};

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) a.clone();
    }

    static {
        w wVar = new w(C0092.m8731(f435short, 0, 4, 957), 0);
        FULL = wVar;
        w wVar2 = new w(C0095.m9204(f435short, 4, 15, 401), 1);
        FULL_STANDALONE = wVar2;
        w wVar3 = new w(C0093.m9062(f435short, 19, 5, 2481), 2);
        SHORT = wVar3;
        w wVar4 = new w(C0097.m10853(f435short, 24, 16, 1929), 3);
        SHORT_STANDALONE = wVar4;
        w wVar5 = new w(C0081.m7837(f435short, 40, 6, 1311), 4);
        NARROW = wVar5;
        w wVar6 = new w(C0081.m7837(f435short, 46, 17, 2908), 5);
        NARROW_STANDALONE = wVar6;
        a = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
    }
}
