package j$.time.format;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
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
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private o a;
    private final o b;
    private final ArrayList c;
    private final boolean d;
    private int e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f429short = {1112, 1112, 3180, 3183, 3171, 3169, 3180, 3173, 488, 481, 508, 483, 495, 506, 506, 491, 508, 504, 503, 507, 498, 506, 1639, 1608, 1604, 1613, 1605, 1537, 1612, 1620, 1618, 1621, 1537, 1609, 1600, 1623, 1604, 1537, 1600, 1537, 1607, 1608, 1625, 1604, 1605, 1537, 1618, 1604, 1621, 1537, 1614, 1607, 1537, 1623, 1600, 1613, 1620, 1604, 1618, 1563, 1537, 2336, 2341, 2360, 2345, 2366, 2349, 2336, 1916, 1907, 1919, 1910, 1918, 1951, 1934, 1939, 1951, 1959, 1924, 1924, 1920, 1950, 1947, 1231, 1216, 1228, 1221, 1229, 993, 989, 976, 917, 962, 988, 977, 961, 989, 917, 984, 960, 966, 961, 917, 983, 976, 917, 979, 967, 986, 984, 917, 900, 917, 961, 986, 917, 900, 908, 917, 988, 987, 982, 985, 960, 966, 988, 963, 976, 917, 983, 960, 961, 917, 962, 980, 966, 917, 2124, 2115, 2127, 2118, 2126, 2355, 2345, 2343, 2350, 2323, 2356, 2361, 2348, 2341, 3169, 3165, 3152, 3093, 3160, 3156, 3149, 3164, 3160, 3136, 3160, 3093, 3138, 3164, 3153, 3137, 3165, 3093, 3160, 3136, 3142, 3137, 3093, 3152, 3149, 3158, 3152, 3152, 3153, 3093, 3162, 3143, 3093, 3152, 3140, 3136, 3156, 3161, 3093, 3137, 3165, 3152, 3093, 3160, 3164, 3163, 3164, 3160, 3136, 3160, 3093, 3138, 3164, 3153, 3137, 3165, 3093, 3159, 3136, 3137, 3093, 1688, 1668, 1688, 2199, 2219, 2214, 2275, 2222, 2210, 2235, 2218, 2222, 2230, 2222, 2275, 2228, 2218, 2215, 2231, 2219, 2275, 2222, 2230, 2224, 2231, 2275, 2209, 2214, 2275, 2213, 2225, 2220, 2222, 2275, 2290, 2275, 2231, 2220, 2275, 2290, 2298, 2275, 2218, 2221, 2208, 2223, 2230, 2224, 2218, 2229, 2214, 2275, 2209, 2230, 2231, 2275, 2228, 2210, 2224, 2275, 1341, 1281, 1292, 1353, 1284, 1280, 1287, 1280, 1284, 1308, 1284, 1353, 1310, 1280, 1293, 1309, 1281, 1353, 1284, 1308, 1306, 1309, 1353, 1291, 1292, 1353, 1295, 1307, 1286, 1284, 1353, 1368, 1353, 1309, 1286, 1353, 1368, 1360, 1353, 1280, 1287, 1290, 1285, 1308, 1306, 1280, 1311, 1292, 1353, 1291, 1308, 1309, 1353, 1310, 1288, 1306, 1353, 2984, 2954, 2949, 2949, 2948, 2975, 3019, 2952, 2954, 2951, 2951, 3019, 2948, 2971, 2975, 2946, 2948, 2949, 2954, 2951, 2990, 2949, 2959, 3011, 3010, 3019, 2954, 2968, 3019, 2975, 2947, 2958, 2969, 2958, 3019, 2972, 2954, 2968, 3019, 2949, 2948, 3019, 2971, 2969, 2958, 2973, 2946, 2948, 2974, 2968, 3019, 2952, 2954, 2951, 2951, 3019, 2975, 2948, 3019, 2948, 2971, 2975, 2946, 2948, 2949, 2954, 2951, 3000, 2975, 2954, 2969, 2975, 3011, 3010};
    private static final b f = new b();

    /* JADX INFO: renamed from: ۟۠ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static j m7932(Object obj) {
        if (C0096.m10782() > 0) {
            return ((j) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7933() {
        if (C0083.m8022() < 0) {
            return f429short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static l m7934() {
        if (C0089.m8594() < 0) {
            return l.LENIENT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m7935(Object obj) {
        if (C0102.m11109() < 0) {
            return ((o) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static b m7936() {
        if (C0083.m8022() <= 0) {
            return f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7937(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            ((o) obj).j((j) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m7938(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((o) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static j m7939(Object obj, int i) {
        if (C0084.m8116() > 0) {
            return ((j) obj).c(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m7940(Object obj) {
        if (C0102.m11109() < 0) {
            return ((j) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۥ۠, reason: not valid java name and contains not printable characters */
    public static v m7941(Object obj) {
        if (C0083.m8022() <= 0) {
            return j.m7903((j) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static o m7942(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((o) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static a m7943(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0105.m11264() > 0) {
            return ((o) obj).u((Locale) obj2, (u) obj3, (j$.time.chrono.u) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۥ, reason: contains not printable characters */
    public static l m7944() {
        if (C0088.m8503() >= 0) {
            return l.STRICT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤۦ, reason: contains not printable characters */
    public static k m7945() {
        if (C0093.m9101() > 0) {
            return k.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢۧ, reason: contains not printable characters */
    public static l m7946() {
        if (C0096.m10782() > 0) {
            return l.SENSITIVE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۢ, reason: contains not printable characters */
    public static int m7947(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            return ((o) obj).d((g) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static o m7948(Object obj) {
        if (C0088.m8503() > 0) {
            return ((o) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥۨ, reason: contains not printable characters */
    public static f m7949(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((a) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static l m7950() {
        if (C0106.m11345() < 0) {
            return l.INSENSITIVE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m7951(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((o) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m7952(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((j) obj).b;
        }
        return 0;
    }

    static {
        HashMap map = new HashMap();
        C0088.m8552(map, C0085.m8244('G'), C0091.m8664());
        C0088.m8552(map, C0085.m8244('y'), C0092.m8764());
        C0088.m8552(map, C0085.m8244('u'), C0104.m11201());
        Character chM8244 = C0085.m8244('Q');
        j$.time.temporal.r rVarM8229 = C0085.m8229();
        C0088.m8552(map, chM8244, rVarM8229);
        C0088.m8552(map, C0085.m8244('q'), rVarM8229);
        Character chM82442 = C0085.m8244('M');
        j$.time.temporal.a aVarM9136 = C0094.m9136();
        C0088.m8552(map, chM82442, aVarM9136);
        C0088.m8552(map, C0085.m8244('L'), aVarM9136);
        C0088.m8552(map, C0085.m8244('D'), C0090.m8620());
        C0088.m8552(map, C0085.m8244('d'), C0084.m8118());
        C0088.m8552(map, C0085.m8244('F'), C0093.m9075());
        Character chM82443 = C0085.m8244('E');
        j$.time.temporal.a aVarM9077 = C0093.m9077();
        C0088.m8552(map, chM82443, aVarM9077);
        C0088.m8552(map, C0085.m8244('c'), aVarM9077);
        C0088.m8552(map, C0085.m8244('e'), aVarM9077);
        C0088.m8552(map, C0085.m8244('a'), C0087.m8488());
        C0088.m8552(map, C0085.m8244('H'), C0097.m10797());
        C0088.m8552(map, C0085.m8244('k'), C0082.m7984());
        C0088.m8552(map, C0085.m8244('K'), C0096.m10788());
        C0088.m8552(map, C0085.m8244('h'), C0080.m7567());
        C0088.m8552(map, C0085.m8244('m'), C0095.m9182());
        C0088.m8552(map, C0085.m8244('s'), C0094.m9112());
        Character chM82444 = C0085.m8244('S');
        j$.time.temporal.a aVarM8604 = C0090.m8604();
        C0088.m8552(map, chM82444, aVarM8604);
        C0088.m8552(map, C0085.m8244('A'), C0105.m11282());
        C0088.m8552(map, C0085.m8244('n'), aVarM8604);
        C0088.m8552(map, C0085.m8244('N'), C0090.m8636());
        C0088.m8552(map, C0085.m8244('g'), C0106.m11318());
    }

    public o() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    private o(o oVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = oVar;
        this.d = true;
    }

    public final void q() {
        m7947(this, m7946());
    }

    public final void p() {
        m7947(this, m7950());
    }

    public final void s() {
        m7947(this, m7944());
    }

    public final void r() {
        m7947(this, m7934());
    }

    public final void k(j$.time.temporal.r rVar, int i) {
        C0079.m7494(rVar, C0079.m7503(m7933(), 83, 5, 1193));
        if (i < 1 || i > 19) {
            StringBuilder sb = new StringBuilder(C0099.m10897(m7933(), 88, 49, 949));
            C0099.m10859(sb, i);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        m7937(this, new j(rVar, i, i, C0094.m9126()));
    }

    public final void l(j$.time.temporal.r rVar, int i, int i2, v vVar) {
        if (i == i2 && vVar == C0094.m9126()) {
            C0086.m8325(this, rVar, i2);
            return;
        }
        C0079.m7494(rVar, C0099.m10897(m7933(), 137, 5, 2090));
        C0079.m7494(vVar, C0087.m8474(m7933(), 142, 9, 2368));
        if (i < 1 || i > 19) {
            StringBuilder sb = new StringBuilder(C0082.m7966(m7933(), 272, 57, 1385));
            C0099.m10859(sb, i);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        if (i2 < 1 || i2 > 19) {
            StringBuilder sb2 = new StringBuilder(C0099.m10897(m7933(), 215, 57, 2243));
            C0099.m10859(sb2, i2);
            throw new IllegalArgumentException(C0099.m10924(sb2));
        }
        if (i2 < i) {
            StringBuilder sb3 = new StringBuilder(C0096.m10776(m7933(), 151, 61, 3125));
            C0099.m10859(sb3, i2);
            C0101.m11052(sb3, C0091.m8679(m7933(), 212, 3, 1720));
            C0099.m10859(sb3, i);
            throw new IllegalArgumentException(C0099.m10924(sb3));
        }
        m7937(this, new j(rVar, i, i2, vVar));
    }

    private void j(j jVar) {
        j jVarM7932;
        o oVarM7948 = m7948(this);
        int iM7938 = m7938(oVarM7948);
        if (iM7938 >= 0) {
            j jVar2 = (j) C0106.m11347(m7935(oVarM7948), iM7938);
            int iM7952 = m7952(jVar);
            int iM7940 = m7940(jVar);
            if (iM7952 == iM7940 && m7941(jVar) == C0094.m9126()) {
                jVarM7932 = m7939(jVar2, iM7940);
                m7947(this, m7932(jVar));
                m7948(this).e = iM7938;
            } else {
                jVarM7932 = m7932(jVar2);
                m7948(this).e = m7947(this, jVar);
            }
            C0083.m8017(m7935(m7948(this)), iM7938, jVarM7932);
            return;
        }
        oVarM7948.e = m7947(this, jVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        h hVar = new h(aVar, 0, 9, true, 0);
        C0079.m7494(aVar, C0080.m7573(m7933(), 17, 5, 414));
        if (C0099.m10914(C0090.m8651(aVar))) {
            m7947(this, hVar);
        } else {
            StringBuilder sb = new StringBuilder(C0081.m7837(m7933(), 22, 39, 1569));
            C0082.m7988(sb, aVar);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
    }

    public final void i(j$.time.temporal.a aVar, HashMap map) {
        C0079.m7494(aVar, C0080.m7573(m7933(), 68, 5, 1818));
        C0079.m7494(map, C0100.m10962(m7933(), 73, 10, 2027));
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w wVarM8681 = C0091.m8681();
        m7947(this, new n(aVar, wVarM8681, new c(new s(C0092.m8765(wVarM8681, linkedHashMap)))));
    }

    public final void c() {
        m7947(this, new i());
    }

    public final void h() {
        m7947(this, m7945());
    }

    public final void g(String str, String str2) {
        m7947(this, new k(str, str2));
    }

    public final void m() {
        m7947(this, new m(1, m7936()));
    }

    public final void e(char c) {
        m7947(this, new e(c));
    }

    public final void f(String str) {
        C0079.m7494(str, C0085.m8236(m7933(), 61, 7, 2380));
        if (C0084.m8111(str)) {
            return;
        }
        if (C0092.m8751(str) == 1) {
            m7947(this, new e(C0104.m11233(str, 0)));
        } else {
            m7947(this, new m(0, str));
        }
    }

    public final void a(a aVar) {
        C0079.m7494(aVar, C0095.m9204(m7933(), 8, 9, 398));
        m7947(this, m7949(aVar));
    }

    public final void o() {
        o oVarM7948 = m7948(this);
        oVarM7948.e = -1;
        this.a = new o(oVarM7948);
    }

    public final void n() {
        o oVarM7948 = m7948(this);
        if (m7942(oVarM7948) == null) {
            throw new IllegalStateException(C0094.m9107(m7933(), 329, 74, 3051));
        }
        if (C0101.m11061(m7935(oVarM7948)) > 0) {
            o oVarM79482 = m7948(this);
            f fVar = new f(m7935(oVarM79482), m7951(oVarM79482));
            this.a = m7942(m7948(this));
            m7947(this, fVar);
            return;
        }
        this.a = m7942(m7948(this));
    }

    private int d(g gVar) {
        C0079.m7494(gVar, C0097.m10853(m7933(), 0, 2, 1064));
        o oVarM7948 = m7948(this);
        C0092.m8727(oVarM7948);
        C0099.m10918(m7935(oVarM7948), gVar);
        m7948(this).e = -1;
        return C0101.m11061(m7935(r2)) - 1;
    }

    public final void v() {
        m7943(this, C0092.m8756(), C0085.m8252(), null);
    }

    final a t(u uVar, j$.time.chrono.u uVar2) {
        return m7943(this, C0092.m8756(), uVar, uVar2);
    }

    private a u(Locale locale, u uVar, j$.time.chrono.u uVar2) {
        C0079.m7494(locale, C0102.m11094(m7933(), 2, 6, 3072));
        while (m7942(m7948(this)) != null) {
            C0099.m10874(this);
        }
        f fVar = new f(m7935(this), false);
        C0099.m10892();
        return new a(fVar, locale, uVar, uVar2);
    }
}
