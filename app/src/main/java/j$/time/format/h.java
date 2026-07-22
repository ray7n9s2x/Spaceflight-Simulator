package j$.time.format;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class h extends j {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f422short = {1544, 1632, 1601, 1607, 1613, 1609, 1605, 1608, 1652, 1611, 1613, 1610, 1616, 561, 517, 534, 532, 515, 542, 536, 537, 607, 3070, 774};
    private final boolean g;

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static Enum m7889(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7890(Object obj) {
        if (C0089.m8594() < 0) {
            return ((h) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7891() {
        if (C0083.m8022() <= 0) {
            return f422short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int m7892(Object obj) {
        if (C0090.m8624() > 0) {
            return ((j) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥ۠, reason: not valid java name and contains not printable characters */
    public static t m7893(Object obj) {
        if (C0105.m11264() > 0) {
            return ((q) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m7894(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((j) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۣ, reason: contains not printable characters */
    public static Long m7895(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((q) obj).e((j$.time.temporal.r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m7896(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((j) obj).b;
        }
        return 0;
    }

    h(j$.time.temporal.r rVar, int i, int i2, boolean z, int i3) {
        super(rVar, i, i2, C0094.m9126(), i3);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.j
    final j b() {
        if (m7892(this) == -1) {
            return this;
        }
        return new h(m7889(this), m7896(this), m7894(this), m7890(this), -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.j
    final j c(int i) {
        return new h(m7889(this), m7896(this), m7894(this), m7890(this), m7892(this) + i);
    }

    @Override // j$.time.format.j, j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        Enum enumM7889 = m7889(this);
        Long lM7895 = m7895(qVar, enumM7889);
        if (lM7895 == null) {
            return false;
        }
        t tVarM7893 = m7893(qVar);
        long jM8558 = C0088.m8558(lM7895);
        j$.time.temporal.w wVarM11271 = C0105.m11271(enumM7889);
        C0100.m10984(wVarM11271, jM8558, enumM7889);
        BigDecimal bigDecimalM8477 = C0087.m8477(C0092.m8744(wVarM11271));
        BigDecimal bigDecimalM11102 = C0102.m11102(C0080.m7534(C0087.m8477(C0088.m8525(wVarM11271)), bigDecimalM8477), C0106.m11330());
        BigDecimal bigDecimalM7534 = C0080.m7534(C0087.m8477(jM8558), bigDecimalM8477);
        RoundingMode roundingModeM9082 = C0093.m9082();
        BigDecimal bigDecimalM11335 = C0106.m11335(bigDecimalM7534, bigDecimalM11102, 9, roundingModeM9082);
        BigDecimal bigDecimalM8289 = C0086.m8289();
        if (C0090.m8615(bigDecimalM11335, bigDecimalM8289) != 0) {
            bigDecimalM8289 = C0092.m8786(bigDecimalM11335) == 0 ? new BigDecimal(C0103.m11162(), 0) : C0081.m7811(bigDecimalM11335);
        }
        int iM11172 = C0103.m11172(bigDecimalM8289);
        boolean zM7890 = m7890(this);
        int iM7896 = m7896(this);
        if (iM11172 != 0) {
            String strM11217 = C0104.m11217(C0103.m11156(C0101.m11022(bigDecimalM8289, C0080.m7578(C0106.m11325(C0103.m11172(bigDecimalM8289), iM7896), m7894(this)), roundingModeM9082)), 2);
            C0092.m8727(tVarM7893);
            if (zM7890) {
                C0089.m8573(sb, '.');
            }
            C0101.m11052(sb, strM11217);
            return true;
        }
        if (iM7896 <= 0) {
            return true;
        }
        if (zM7890) {
            C0092.m8727(tVarM7893);
            C0089.m8573(sb, '.');
        }
        for (int i = 0; i < iM7896; i++) {
            C0092.m8727(tVarM7893);
            C0089.m8573(sb, '0');
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        String strM10897 = m7890(this) ? C0099.m10897(m7891(), 0, 13, 1572) : C0102.m11090();
        StringBuilder sb = new StringBuilder(C0105.m11310(m7891(), 13, 9, 631));
        C0082.m7988(sb, m7889(this));
        String strM7966 = C0082.m7966(m7891(), 22, 1, 3026);
        C0101.m11052(sb, strM7966);
        C0099.m10859(sb, m7896(this));
        C0101.m11052(sb, strM7966);
        C0099.m10859(sb, m7894(this));
        C0101.m11052(sb, strM10897);
        C0101.m11052(sb, C0102.m11094(m7891(), 23, 1, 815));
        return C0099.m10924(sb);
    }
}
