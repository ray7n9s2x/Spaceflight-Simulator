package j$.time.format;

import j$.time.C0089;
import j$.time.C0091;
import j$.util.C0101;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0098;
import java.util.function.C0105;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class l implements g {
    public static final l INSENSITIVE;
    public static final l LENIENT;
    public static final l SENSITIVE;
    public static final l STRICT;
    private static final /* synthetic */ l[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f426short = {1470, 1448, 1443, 1470, 1444, 1465, 1444, 1467, 1448, 636, 635, 614, 624, 635, 614, 636, 609, 636, 611, 624, 2968, 2975, 2969, 2946, 2952, 2975, 482, 491, 480, 487, 491, 480, 506, 2030, 2015, 1996, 1997, 2011, 2029, 1994, 1996, 2007, 2013, 1994, 1942, 2008, 2015, 2002, 1997, 2011, 1943, 1096, 1139, 1135, 1144, 1148, 1150, 1141, 1148, 1151, 1137, 1144, 922, 939, 952, 953, 943, 921, 958, 952, 931, 937, 958, 994, 958, 952, 959, 943, 995, 1388, 1373, 1358, 1359, 1369, 1407, 1373, 1359, 1369, 1391, 1369, 1362, 1359, 1365, 1352, 1365, 1354, 1369, 1300, 1370, 1373, 1360, 1359, 1369, 1301, 2775, 2790, 2805, 2804, 2786, 2756, 2790, 2804, 2786, 2772, 2786, 2793, 2804, 2798, 2803, 2798, 2801, 2786, 2735, 2803, 2805, 2802, 2786, 2734};

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        return true;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) a.clone();
    }

    static {
        l lVar = new l(C0098.m10856(f426short, 0, 9, 1517), 0);
        SENSITIVE = lVar;
        l lVar2 = new l(C0101.m11060(f426short, 9, 11, 565), 1);
        INSENSITIVE = lVar2;
        l lVar3 = new l(C0095.m9204(f426short, 20, 6, 3019), 2);
        STRICT = lVar3;
        l lVar4 = new l(C0091.m8679(f426short, 26, 7, 430), 3);
        LENIENT = lVar4;
        a = new l[]{lVar, lVar2, lVar3, lVar4};
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return C0089.m8581(f426short, 104, 24, 2695);
        }
        if (iOrdinal == 1) {
            return C0105.m11310(f426short, 79, 25, 1340);
        }
        if (iOrdinal == 2) {
            return C0094.m9107(f426short, 62, 17, 970);
        }
        if (iOrdinal == 3) {
            return C0105.m11310(f426short, 33, 18, 1982);
        }
        throw new IllegalStateException(C0089.m8581(f426short, 51, 11, 1053));
    }
}
