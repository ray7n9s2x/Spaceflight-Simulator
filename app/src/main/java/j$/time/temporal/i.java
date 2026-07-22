package j$.time.temporal;

import j$.time.zone.C0087;
import j$.util.stream.C0097;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
enum i implements u {
    WEEK_BASED_YEARS(C0106.m11346(f455short, 0, 14, 397)),
    QUARTER_YEARS(C0097.m10853(f455short, 30, 12, 483));


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f455short = {474, 488, 488, 486, 463, 492, 510, 488, 489, 468, 488, 492, 511, 510, 264, 282, 282, 276, 256, 285, 286, 268, 282, 283, 256, 262, 282, 286, 269, 268, 434, 406, 386, 401, 407, 390, 401, 442, 390, 386, 401, 400, 2318, 2314, 2334, 2317, 2315, 2330, 2317, 2304, 2310, 2330, 2334, 2317, 2316, 1322, 1297, 1293, 1306, 1310, 1308, 1303, 1310, 1309, 1299, 1306};
    private final String a;

    static {
        j$.time.e eVar = j$.time.e.c;
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.u
    public final m j(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.d(j$.com.android.tools.r8.a.e(mVar.k(r0), j), j.c);
        }
        if (i == 2) {
            return mVar.e(j / 4, b.YEARS).e((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException(C0087.m8474(f455short, 55, 11, 1407));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
