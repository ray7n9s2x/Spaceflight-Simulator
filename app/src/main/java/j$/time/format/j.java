package j$.time.format;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
class j implements g {
    final Enum a;
    final int b;
    final int c;
    private final v d;
    final int e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f424short = {1378, 1385, 1385, 1384, 1384, 1388, 1385, 1387, 1384, 1389, 1379, 1390, 1391, 1388, 1388, 1390, 1379, 1387, 1379, 2044, 1983, 1981, 1970, 1970, 1971, 1960, 2044, 1982, 1977, 2044, 1964, 1966, 1973, 1970, 1960, 1977, 1976, 2044, 1981, 1967, 2044, 1960, 1972, 1977, 2044, 1962, 1981, 1968, 1961, 1977, 2044, 1333, 1306, 1302, 1311, 1303, 1363, 421, 486, 484, 491, 491, 490, 497, 421, 487, 480, 421, 491, 480, 482, 484, 497, 492, 499, 480, 421, 484, 486, 486, 490, 503, 481, 492, 491, 482, 421, 497, 490, 421, 497, 493, 480, 421, 470, 492, 482, 491, 470, 497, 508, 489, 480, 901, 960, 989, 966, 960, 960, 961, 982, 901, 977, 973, 960, 901, 968, 964, 989, 972, 968, 976, 968, 901, 981, 983, 972, 971, 977, 901, 978, 972, 961, 977, 973, 901, 970, 963, 901, 1880, 1087, 1032, 1029, 1052, 1036, 1089, 2541};
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: ۟ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static Enum m7900(Object obj) {
        if (C0096.m10782() > 0) {
            return ((j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۦ, reason: not valid java name and contains not printable characters */
    public static t m7901(Object obj) {
        if (C0085.m8230() > 0) {
            return ((q) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m7902(Object obj) {
        if (C0087.m8458() < 0) {
            return ((j) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۡ, reason: not valid java name and contains not printable characters */
    public static v m7903(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7904() {
        if (C0083.m8022() <= 0) {
            return f424short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Long m7905(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            return ((q) obj).e((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7906(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((j) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m7907(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((j) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static long[] m7908() {
        if (C0080.m7553() >= 0) {
            return f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7909() {
        if (C0106.m11345() <= 0) {
            return d.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    j(j$.time.temporal.r rVar, int i, int i2, v vVar) {
        this.a = (Enum) rVar;
        this.b = i;
        this.c = i2;
        this.d = vVar;
        this.e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected j(j$.time.temporal.r rVar, int i, int i2, v vVar, int i3) {
        this.a = (Enum) rVar;
        this.b = i;
        this.c = i2;
        this.d = vVar;
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    j b() {
        return m7906(this) == -1 ? this : new j(m7900(this), m7902(this), m7907(this), m7903(this), -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    j c(int i) {
        int iM7906 = m7906(this) + i;
        return new j(m7900(this), m7902(this), m7907(this), m7903(this), iM7906);
    }

    @Override // j$.time.format.g
    public boolean j(q qVar, StringBuilder sb) {
        Enum enumM7900 = m7900(this);
        Long lM7905 = m7905(qVar, enumM7900);
        if (lM7905 == null) {
            return false;
        }
        long jM8558 = C0088.m8558(lM7905);
        t tVarM7901 = m7901(qVar);
        String strM8120 = jM8558 == Long.MIN_VALUE ? C0084.m8120(m7904(), 0, 19, 1371) : C0099.m10925(C0099.m10907(jM8558));
        int iM8751 = C0092.m8751(strM8120);
        String strM10897 = C0099.m10897(m7904(), 19, 32, 2012);
        String strM11206 = C0104.m11206(m7904(), 51, 6, 1395);
        int iM7907 = m7907(this);
        if (iM8751 > iM7907) {
            StringBuilder sb2 = new StringBuilder(strM11206);
            C0082.m7988(sb2, enumM7900);
            C0101.m11052(sb2, strM10897);
            C0087.m8489(sb2, jM8558);
            C0101.m11052(sb2, C0102.m11094(m7904(), 103, 36, 933));
            C0099.m10859(sb2, iM7907);
            throw new DateTimeException(C0099.m10924(sb2));
        }
        C0092.m8727(tVarM7901);
        int iM7902 = m7902(this);
        v vVarM7903 = m7903(this);
        if (jM8558 >= 0) {
            int i = m7909()[C0105.m11258(vVarM7903)];
            if (i != 1) {
                if (i == 2) {
                    C0089.m8573(sb, '+');
                }
            } else if (iM7902 < 19 && jM8558 >= m7908()[iM7902]) {
                C0089.m8573(sb, '+');
            }
        } else {
            int i2 = m7909()[C0105.m11258(vVarM7903)];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                C0089.m8573(sb, '-');
            } else if (i2 == 4) {
                StringBuilder sb3 = new StringBuilder(strM11206);
                C0082.m7988(sb3, enumM7900);
                C0101.m11052(sb3, strM10897);
                C0087.m8489(sb3, jM8558);
                C0101.m11052(sb3, C0104.m11206(m7904(), 57, 46, 389));
                throw new DateTimeException(C0099.m10924(sb3));
            }
        }
        for (int i3 = 0; i3 < iM7902 - C0092.m8751(strM8120); i3++) {
            C0089.m8573(sb, '0');
        }
        C0101.m11052(sb, strM8120);
        return true;
    }

    public String toString() {
        Enum enumM7900 = m7900(this);
        int iM7907 = m7907(this);
        String strM10962 = C0100.m10962(m7904(), 139, 1, 1905);
        String strM7573 = C0080.m7573(m7904(), 140, 6, 1129);
        v vVarM7903 = m7903(this);
        int iM7902 = m7902(this);
        if (iM7902 == 1 && iM7907 == 19 && vVarM7903 == C0106.m11315()) {
            StringBuilder sb = new StringBuilder(strM7573);
            C0082.m7988(sb, enumM7900);
            C0101.m11052(sb, strM10962);
            return C0099.m10924(sb);
        }
        String strM11135 = C0103.m11135(m7904(), 146, 1, 2497);
        if (iM7902 == iM7907 && vVarM7903 == C0094.m9126()) {
            StringBuilder sb2 = new StringBuilder(strM7573);
            C0082.m7988(sb2, enumM7900);
            C0101.m11052(sb2, strM11135);
            C0099.m10859(sb2, iM7902);
            C0101.m11052(sb2, strM10962);
            return C0099.m10924(sb2);
        }
        StringBuilder sb3 = new StringBuilder(strM7573);
        C0082.m7988(sb3, enumM7900);
        C0101.m11052(sb3, strM11135);
        C0099.m10859(sb3, iM7902);
        C0101.m11052(sb3, strM11135);
        C0099.m10859(sb3, iM7907);
        C0101.m11052(sb3, strM11135);
        C0082.m7988(sb3, vVarM7903);
        C0101.m11052(sb3, strM10962);
        return C0099.m10924(sb3);
    }
}
