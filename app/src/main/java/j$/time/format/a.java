package j$.time.format;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f419short = {379, 257, 573, 606, 606, 603, 603, 613, 613, 2513, 1311, 1341, 1340, 971, 1002, 1018, 2697, 2747, 2746, 478, 482, 511, 802, 790, 781, 2239, 2189, 2200, 1155, 1189, 1214, 2507, 2528, 2543, 1940, 1975, 1968, 3308, 3264, 3283, 1184, 1169, 1171, 1359, 1379, 1403, 2291, 2252, 2263, 1133, 1106, 1099, 840, 892, 878, 1384, 1374, 1355, 2682, 2646, 2625, 302, 271, 278, 3174, 3143, 3137, 3199, 3187, 1646, 1549, 1549, 1544, 1544, 838, 844, 853, 445, 447, 420, 419, 441, 424, 447, 413, 428, 447, 446, 424, 447, 2995, 2992, 3004, 3006, 2995, 3002, 1903, 1902, 1896, 1890, 1894, 1898, 1895, 1880, 1919, 1906, 1895, 1902, 2815, 2792, 2814, 2786, 2785, 2811, 2792, 2815, 2782, 2809, 2804, 2785, 2792, 2591, 2574, 2566, 2587, 2564, 2585, 2570, 2567, 2727, 2742, 2742, 2723, 2728, 2722, 2727, 2724, 2730, 2723, 946};
    private final f a;
    private final Locale b;
    private final t c;
    private final j$.time.chrono.u d;

    /* JADX INFO: renamed from: ۟۠۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static f m7870(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۡ, reason: not valid java name and contains not printable characters */
    public static a m7871(Object obj, Object obj2, Object obj3) {
        if (C0084.m8116() > 0) {
            return ((o) obj).t((u) obj2, (j$.time.chrono.u) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static Locale m7872(Object obj) {
        if (C0082.m7983() < 0) {
            return ((a) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static f m7873(Object obj) {
        if (C0094.m9148() > 0) {
            return ((f) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.u m7874(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((a) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7875() {
        if (C0091.m8708() >= 0) {
            return f419short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7876(Object obj, Object obj2, Object obj3) {
        if (C0095.m9210() >= 0) {
            return ((f) obj).j((q) obj2, (StringBuilder) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m7877(Object obj) {
        if (C0084.m8116() > 0) {
            return ((f) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static t m7878(Object obj) {
        if (C0091.m8708() > 0) {
            return ((a) obj).c;
        }
        return null;
    }

    static {
        o oVar = new o();
        j$.time.temporal.a aVarM11201 = C0104.m11201();
        v vVarM9164 = C0095.m9164();
        C0101.m11059(oVar, aVarM11201, 4, 10, vVarM9164);
        C0102.m11099(oVar, '-');
        j$.time.temporal.a aVarM9136 = C0094.m9136();
        C0086.m8325(oVar, aVarM9136, 2);
        C0102.m11099(oVar, '-');
        j$.time.temporal.a aVarM8118 = C0084.m8118();
        C0086.m8325(oVar, aVarM8118, 2);
        u uVarM7831 = C0081.m7831();
        j$.time.chrono.u uVarM11146 = C0103.m11146();
        a aVarM7871 = m7871(oVar, uVarM7831, uVarM11146);
        o oVar2 = new o();
        C0079.m7495(oVar2);
        C0088.m8535(oVar2, aVarM7871);
        C0096.m10789(oVar2);
        m7871(oVar2, uVarM7831, uVarM11146);
        o oVar3 = new o();
        C0079.m7495(oVar3);
        C0088.m8535(oVar3, aVarM7871);
        C0084.m8076(oVar3);
        C0096.m10789(oVar3);
        m7871(oVar3, uVarM7831, uVarM11146);
        o oVar4 = new o();
        j$.time.temporal.a aVarM10797 = C0097.m10797();
        C0086.m8325(oVar4, aVarM10797, 2);
        C0102.m11099(oVar4, ':');
        j$.time.temporal.a aVarM9182 = C0095.m9182();
        C0086.m8325(oVar4, aVarM9182, 2);
        C0084.m8076(oVar4);
        C0102.m11099(oVar4, ':');
        j$.time.temporal.a aVarM9112 = C0094.m9112();
        C0086.m8325(oVar4, aVarM9112, 2);
        C0084.m8076(oVar4);
        C0086.m8279(oVar4, C0090.m8604());
        a aVarM78712 = m7871(oVar4, uVarM7831, null);
        o oVar5 = new o();
        C0079.m7495(oVar5);
        C0088.m8535(oVar5, aVarM78712);
        C0096.m10789(oVar5);
        m7871(oVar5, uVarM7831, null);
        o oVar6 = new o();
        C0079.m7495(oVar6);
        C0088.m8535(oVar6, aVarM78712);
        C0084.m8076(oVar6);
        C0096.m10789(oVar6);
        m7871(oVar6, uVarM7831, null);
        o oVar7 = new o();
        C0079.m7495(oVar7);
        C0088.m8535(oVar7, aVarM7871);
        C0102.m11099(oVar7, 'T');
        C0088.m8535(oVar7, aVarM78712);
        a aVarM78713 = m7871(oVar7, uVarM7831, uVarM11146);
        o oVar8 = new o();
        C0079.m7495(oVar8);
        C0088.m8535(oVar8, aVarM78713);
        C0095.m9185(oVar8);
        C0096.m10789(oVar8);
        C0100.m10997(oVar8);
        a aVarM78714 = m7871(oVar8, uVarM7831, uVarM11146);
        o oVar9 = new o();
        C0088.m8535(oVar9, aVarM78714);
        C0084.m8076(oVar9);
        C0102.m11099(oVar9, '[');
        C0083.m8058(oVar9);
        C0092.m8773(oVar9);
        C0102.m11099(oVar9, ']');
        m7871(oVar9, uVarM7831, uVarM11146);
        o oVar10 = new o();
        C0088.m8535(oVar10, aVarM78713);
        C0084.m8076(oVar10);
        C0096.m10789(oVar10);
        C0084.m8076(oVar10);
        C0102.m11099(oVar10, '[');
        C0083.m8058(oVar10);
        C0092.m8773(oVar10);
        C0102.m11099(oVar10, ']');
        m7871(oVar10, uVarM7831, uVarM11146);
        o oVar11 = new o();
        C0079.m7495(oVar11);
        C0101.m11059(oVar11, aVarM11201, 4, 10, vVarM9164);
        C0102.m11099(oVar11, '-');
        C0086.m8325(oVar11, C0090.m8620(), 3);
        C0084.m8076(oVar11);
        C0096.m10789(oVar11);
        m7871(oVar11, uVarM7831, uVarM11146);
        o oVar12 = new o();
        C0079.m7495(oVar12);
        C0101.m11059(oVar12, C0093.m9100(), 4, 10, vVarM9164);
        C0091.m8669(oVar12, C0082.m7966(m7875(), 0, 2, 342));
        C0086.m8325(oVar12, C0096.m10793(), 2);
        C0102.m11099(oVar12, '-');
        j$.time.temporal.a aVarM9077 = C0093.m9077();
        C0086.m8325(oVar12, aVarM9077, 1);
        C0084.m8076(oVar12);
        C0096.m10789(oVar12);
        m7871(oVar12, uVarM7831, uVarM11146);
        o oVar13 = new o();
        C0079.m7495(oVar13);
        C0095.m9206(oVar13);
        e = m7871(oVar13, uVarM7831, null);
        o oVar14 = new o();
        C0079.m7495(oVar14);
        C0086.m8325(oVar14, aVarM11201, 4);
        C0086.m8325(oVar14, aVarM9136, 2);
        C0086.m8325(oVar14, aVarM8118, 2);
        C0084.m8076(oVar14);
        C0095.m9185(oVar14);
        C0082.m8008(oVar14, C0086.m8291(m7875(), 2, 7, 534), C0093.m9062(m7875(), 9, 1, 2443));
        C0100.m10997(oVar14);
        m7871(oVar14, uVarM7831, uVarM11146);
        HashMap map = new HashMap();
        Long lM11351 = C0106.m11351(1L);
        C0088.m8552(map, lM11351, C0082.m7966(m7875(), 10, 3, 1362));
        Long lM113512 = C0106.m11351(2L);
        C0088.m8552(map, lM113512, C0106.m11346(m7875(), 13, 3, 927));
        Long lM113513 = C0106.m11351(3L);
        C0088.m8552(map, lM113513, C0088.m8518(m7875(), 16, 3, 2782));
        Long lM113514 = C0106.m11351(4L);
        C0088.m8552(map, lM113514, C0091.m8679(m7875(), 19, 3, 394));
        Long lM113515 = C0106.m11351(5L);
        C0088.m8552(map, lM113515, C0087.m8474(m7875(), 22, 3, 868));
        Long lM113516 = C0106.m11351(6L);
        C0088.m8552(map, lM113516, C0095.m9204(m7875(), 25, 3, 2284));
        Long lM113517 = C0106.m11351(7L);
        C0088.m8552(map, lM113517, C0101.m11060(m7875(), 28, 3, 1232));
        HashMap map2 = new HashMap();
        C0088.m8552(map2, lM11351, C0082.m7966(m7875(), 31, 3, 2433));
        C0088.m8552(map2, lM113512, C0084.m8120(m7875(), 34, 3, 2002));
        C0088.m8552(map2, lM113513, C0079.m7503(m7875(), 37, 3, 3233));
        C0088.m8552(map2, lM113514, C0106.m11346(m7875(), 40, 3, 1249));
        C0088.m8552(map2, lM113515, C0082.m7966(m7875(), 43, 3, 1282));
        C0088.m8552(map2, lM113516, C0092.m8731(m7875(), 46, 3, 2233));
        C0088.m8552(map2, lM113517, C0093.m9062(m7875(), 49, 3, 1063));
        C0088.m8552(map2, C0106.m11351(8L), C0102.m11094(m7875(), 52, 3, 777));
        C0088.m8552(map2, C0106.m11351(9L), C0096.m10776(m7875(), 55, 3, 1339));
        C0088.m8552(map2, C0106.m11351(10L), C0099.m10897(m7875(), 58, 3, 2613));
        C0088.m8552(map2, C0106.m11351(11L), C0095.m9204(m7875(), 61, 3, 352));
        C0088.m8552(map2, C0106.m11351(12L), C0094.m9107(m7875(), 64, 3, 3106));
        o oVar15 = new o();
        C0079.m7495(oVar15);
        C0095.m9185(oVar15);
        C0084.m8076(oVar15);
        C0093.m9098(oVar15, aVarM9077, map);
        C0091.m8669(oVar15, C0083.m8037(m7875(), 67, 2, 3155));
        C0099.m10874(oVar15);
        C0101.m11059(oVar15, aVarM8118, 1, 2, C0094.m9126());
        C0102.m11099(oVar15, ' ');
        C0093.m9098(oVar15, aVarM9136, map2);
        C0102.m11099(oVar15, ' ');
        C0086.m8325(oVar15, aVarM11201, 4);
        C0102.m11099(oVar15, ' ');
        C0086.m8325(oVar15, aVarM10797, 2);
        C0102.m11099(oVar15, ':');
        C0086.m8325(oVar15, aVarM9182, 2);
        C0084.m8076(oVar15);
        C0102.m11099(oVar15, ':');
        C0086.m8325(oVar15, aVarM9112, 2);
        C0099.m10874(oVar15);
        C0102.m11099(oVar15, ' ');
        C0082.m8008(oVar15, C0095.m9204(m7875(), 69, 5, 1605), C0105.m11310(m7875(), 74, 3, 769));
        m7871(oVar15, C0085.m8252(), uVarM11146);
    }

    a(f fVar, Locale locale, u uVar, j$.time.chrono.u uVar2) {
        t tVarM10892 = C0099.m10892();
        this.a = (f) C0079.m7494(fVar, C0100.m10962(m7875(), 77, 13, 461));
        this.b = (Locale) C0079.m7494(locale, C0106.m11346(m7875(), 90, 6, 3039));
        this.c = (t) C0079.m7494(tVarM10892, C0084.m8120(m7875(), 96, 12, 1803));
        this.d = uVar2;
    }

    public final Locale d() {
        return m7872(this);
    }

    public final t c() {
        return m7878(this);
    }

    public final j$.time.chrono.n b() {
        return m7874(this);
    }

    public final String a(Instant instant) {
        StringBuilder sb = new StringBuilder(32);
        C0079.m7494(instant, C0086.m8291(m7875(), 121, 8, 2667));
        C0079.m7494(sb, C0106.m11346(m7875(), 129, 10, 2758));
        try {
            m7876(m7870(this), new q(instant, this), sb);
            return C0099.m10924(sb);
        } catch (IOException e2) {
            throw new DateTimeException(C0081.m7807(e2), e2);
        }
    }

    final f e() {
        return m7873(m7870(this));
    }

    public final String toString() {
        String strM7877 = m7877(m7870(this));
        return C0079.m7528(strM7877, C0093.m9062(m7875(), 139, 1, 1001)) ? strM7877 : C0104.m11200(strM7877, 1, C0092.m8751(strM7877) - 1);
    }
}
