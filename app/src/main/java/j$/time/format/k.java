package j$.time.format;

import androidx.core.view.PointerIconCompat;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0106;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes3.dex */
final class k implements g {
    static final k e;
    private final String a;
    private final int b;
    private final int c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f425short = {402, 497, 468, 468, 458, 458, 2037, 1942, 2020, 1971, 1971, 2020, 1965, 1965, 502, 405, 405, 2874, 2905, 2905, 2940, 2940, 1807, 1900, 1900, 1822, 1865, 1865, 3116, 3151, 3151, 3146, 3146, 2039, 1940, 1940, 2022, 1937, 1937, 1353, 1322, 1322, 1327, 1327, 1297, 1297, 364, 271, 271, 381, 266, 266, 381, 308, 308, 2348, 2383, 2383, 2378, 2378, 2388, 2388, 1472, 1443, 1443, 1489, 1446, 1446, 1489, 1464, 1464, 1898, 1801, 1801, 1836, 1836, 1842, 1842, 2079, 2172, 2172, 2062, 2137, 2137, 2062, 2119, 2119, 1278, 1181, 1704, 1739, 1774, 1774, 1015, 916, 998, 945, 945, 1446, 1477, 1472, 1472, 808, 843, 825, 846, 846, 1473, 1442, 1447, 1447, 1433, 1433, 1658, 1561, 1643, 1564, 1564, 1643, 1570, 1570, 2828, 2927, 2922, 2922, 2932, 2932, 924, 1023, 909, 1018, 1018, 909, 996, 996, 1135, 2025, 1930, 1930, 2040, 1935, 1935, 2040, 1969, 1969, 1180, 1720, 1705, 1724, 1724, 1709, 1722, 1702, 2995, 2994, 2962, 3003, 3003, 2990, 3000, 2985, 2953, 3000, 2981, 2985, 1665, 1702, 1726, 1705, 1700, 1697, 1708, 1768, 1714, 1703, 1702, 1709, 1768, 1703, 1710, 1710, 1723, 1709, 1724, 1768, 1720, 1705, 1724, 1724, 1709, 1722, 1702, 1778, 1768, 971, 1246, 1752, 2466, 1613, 1613, 1504, 1481, 1481, 1500, 1482, 1499, 1415, 335, 324, 2845, 2835};
    static final String[] d = {C0096.m10776(m7913(), 14, 3, 477), C0094.m9107(m7913(), 17, 5, 2833), C0089.m8581(m7913(), 22, 6, 1828), C0085.m8236(m7913(), 28, 5, 3079), C0103.m11135(m7913(), 33, 6, 2012), C0094.m9107(m7913(), 39, 7, 1378), C0088.m8518(m7913(), 46, 9, 327), C0081.m7837(m7913(), 55, 7, 2311), C0087.m8474(m7913(), 62, 9, 1515), C0086.m8291(m7913(), 71, 7, 1857), C0080.m7573(m7913(), 78, 9, 2100), C0096.m10776(m7913(), 87, 2, 1237), C0098.m10856(m7913(), 89, 4, 1667), C0100.m10962(m7913(), 93, 5, 988), C0094.m9107(m7913(), 98, 4, 1421), C0089.m8581(m7913(), 102, 5, 771), C0091.m8679(m7913(), 107, 6, 1514), C0085.m8236(m7913(), 113, 8, 1617), C0085.m8236(m7913(), 121, 6, 2855), C0101.m11060(m7913(), WorkQueueKt.MASK, 8, 951), C0098.m10856(m7913(), 0, 6, 441), C0091.m8679(m7913(), 6, 8, 2014)};

    /* JADX INFO: renamed from: ۟۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m7910(Object obj) {
        if (C0096.m10782() > 0) {
            return ((k) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static Long m7911(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((q) obj).e((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۧ, reason: not valid java name and contains not printable characters */
    public static int m7912(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((k) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7913() {
        if (C0098.m10857() < 0) {
            return f425short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۣ, reason: contains not printable characters */
    public static int m7914(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((k) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String[] m7915() {
        if (C0103.m11154() < 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m7916(boolean z, int i, Object obj) {
        if (C0081.m7818() <= 0) {
            a(z, i, (StringBuilder) obj);
        }
    }

    static {
        String strM8120 = C0084.m8120(m7913(), 135, 1, 1077);
        String strM7503 = C0079.m7503(m7913(), 136, 9, 1986);
        e = new k(strM7503, strM8120);
        new k(strM7503, C0102.m11094(m7913(), 145, 1, 1196));
    }

    k(String str, String str2) {
        C0079.m7494(str, C0106.m11346(m7913(), 146, 7, 1736));
        C0079.m7494(str2, C0081.m7837(m7913(), 153, 12, 3037));
        int i = 0;
        while (true) {
            String[] strArrM7915 = m7915();
            if (i < 22) {
                if (C0084.m8079(strArrM7915[i], str)) {
                    this.b = i;
                    this.c = i % 11;
                    this.a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException(C0094.m9125(C0099.m10897(m7913(), 165, 29, 1736), str));
            }
        }
    }

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        Long lM7911 = m7911(qVar, C0088.m8508());
        boolean z = false;
        if (lM7911 == null) {
            return false;
        }
        long jM8558 = C0088.m8558(lM7911);
        int i = (int) jM8558;
        if (jM8558 != i) {
            throw new ArithmeticException();
        }
        String strM7910 = m7910(this);
        if (i == 0) {
            C0101.m11052(sb, strM7910);
        } else {
            int iM11238 = C0104.m11238((i / 3600) % 100);
            int iM112382 = C0104.m11238((i / 60) % 60);
            int iM112383 = C0104.m11238(i % 60);
            int iM7835 = C0081.m7835(sb);
            C0101.m11052(sb, i < 0 ? C0084.m8120(m7913(), 195, 1, 1267) : C0099.m10897(m7913(), 196, 1, 1779));
            if (m7912(this) >= 11 && iM11238 < 10) {
                C0089.m8573(sb, (char) (iM11238 + 48));
            } else {
                m7916(false, iM11238, sb);
            }
            int iM7914 = m7914(this);
            if ((iM7914 >= 3 && iM7914 <= 8) || ((iM7914 >= 9 && iM112383 > 0) || (iM7914 >= 1 && iM112382 > 0))) {
                m7916(iM7914 > 0 && iM7914 % 2 == 0, iM112382, sb);
                iM11238 += iM112382;
                if (iM7914 == 7 || iM7914 == 8 || (iM7914 >= 5 && iM112383 > 0)) {
                    if (iM7914 > 0 && iM7914 % 2 == 0) {
                        z = true;
                    }
                    m7916(z, iM112383, sb);
                    iM11238 += iM112383;
                }
            }
            if (iM11238 == 0) {
                C0095.m9200(sb, iM7835);
                C0101.m11052(sb, strM7910);
            }
        }
        return true;
    }

    private static void a(boolean z, int i, StringBuilder sb) {
        C0101.m11052(sb, z ? C0083.m8037(m7913(), 194, 1, PointerIconCompat.TYPE_VERTICAL_TEXT) : C0102.m11090());
        C0089.m8573(sb, (char) ((i / 10) + 48));
        C0089.m8573(sb, (char) ((i % 10) + 48));
    }

    public final String toString() {
        String strM8098 = C0084.m8098(m7910(this), C0092.m8731(m7913(), 197, 1, 2437), C0091.m8679(m7913(), 198, 2, 1642));
        String str = m7915()[m7912(this)];
        StringBuilder sb = new StringBuilder(C0091.m8679(m7913(), 200, 7, 1455));
        C0101.m11052(sb, str);
        C0101.m11052(sb, C0079.m7503(m7913(), 207, 2, 355));
        C0101.m11052(sb, strM8098);
        C0101.m11052(sb, C0094.m9107(m7913(), 209, 2, 2874));
        return C0099.m10924(sb);
    }
}
