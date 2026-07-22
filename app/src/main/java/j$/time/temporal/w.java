package j$.time.temporal;

import androidx.appcompat.app.AppCompatDelegate;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
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
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f459short = {664, 651, 657, 748, 715, 723, 708, 713, 716, 705, 645, 723, 708, 713, 720, 704, 645, 707, 714, 727, 645, 1184, 1192, 1270, 1249, 1260, 1257, 1252, 1184, 1270, 1249, 1260, 1269, 1253, 1267, 1184, 1558, 1585, 1577, 1598, 1587, 1590, 1595, 1663, 1577, 1598, 1587, 1578, 1594, 1663, 1655, 1577, 1598, 1587, 1590, 1595, 1663, 1577, 1598, 1587, 1578, 1594, 1580, 1663, 3134, 3098, 3101, 3098, 3102, 3078, 3102, 3155, 3077, 3090, 3103, 3078, 3094, 3155, 3102, 3078, 3072, 3079, 3155, 3089, 3094, 3155, 3103, 3094, 3072, 3072, 3155, 3079, 3099, 3090, 3101, 3155, 3102, 3090, 3083, 3098, 3102, 3078, 3102, 3155, 3077, 3090, 3103, 3078, 3094, 1643, 1615, 1608, 1615, 1611, 1619, 1611, 1542, 1616, 1607, 1610, 1619, 1603, 1542, 1611, 1619, 1621, 1618, 1542, 1604, 1603, 1542, 1610, 1603, 1621, 1621, 1542, 1618, 1614, 1607, 1608, 1542, 1611, 1607, 1630, 1615, 1611, 1619, 1611, 1542, 1616, 1607, 1610, 1619, 1603, 3122, 3084, 3072, 3085, 3085, 3076, 3090, 3093, 3137, 3084, 3072, 3097, 3080, 3084, 3092, 3084, 3137, 3095, 3072, 3085, 3092, 3076, 3137, 3084, 3092, 3090, 3093, 3137, 3075, 3076, 3137, 3085, 3076, 3090, 3090, 3137, 3093, 3081, 3072, 3087, 3137, 3085, 3072, 3091, 3078, 3076, 3090, 3093, 3137, 3084, 3072, 3097, 3080, 3084, 3092, 3084, 3137, 3095, 3072, 3085, 3092, 3076, 2922, 2894, 2889, 2894, 2890, 2898, 2890, 2823, 2897, 2886, 2891, 2898, 2882, 2823, 2890, 2898, 2900, 2899, 2823, 2885, 2882, 2823, 2891, 2882, 2900, 2900, 2823, 2899, 2895, 2886, 2889, 2823, 2890, 2886, 2911, 2894, 2890, 2898, 2890, 2823, 2897, 2886, 2891, 2898, 2882, 2508, 2546, 2558, 2547, 2547, 2554, 2540, 2539, 2495, 2546, 2558, 2535, 2550, 2546, 2538, 2546, 2495, 2537, 2558, 2547, 2538, 2554, 2495, 2546, 2538, 2540, 2539, 2495, 2557, 2554, 2495, 2547, 2554, 2540, 2540, 2495, 2539, 2551, 2558, 2545, 2495, 2547, 2558, 2541, 2552, 2554, 2540, 2539, 2495, 2546, 2558, 2535, 2550, 2546, 2538, 2546, 2495, 2537, 2558, 2547, 2538, 2554, 2697, 2743, 2747, 2742, 2742, 2751, 2729, 2734, 2810, 2743, 2739, 2740, 2739, 2743, 2735, 2743, 2810, 2732, 2747, 2742, 2735, 2751, 2810, 2743, 2735, 2729, 2734, 2810, 2744, 2751, 2810, 2742, 2751, 2729, 2729, 2810, 2734, 2738, 2747, 2740, 2810, 2742, 2747, 2728, 2749, 2751, 2729, 2734, 2810, 2743, 2739, 2740, 2739, 2743, 2735, 2743, 2810, 2732, 2747, 2742, 2735, 2751, 2443, 2438, 2443};
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    /* JADX INFO: renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static long m8217(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((w) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m8218(Object obj, long j, Object obj2) {
        if (C0094.m9148() >= 0) {
            return ((w) obj).c(j, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static long m8219(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((w) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m8220() {
        if (C0100.m10983() >= 0) {
            return f459short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۡ, reason: not valid java name and contains not printable characters */
    public static long m8221(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((w) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۨۦۦ, reason: not valid java name and contains not printable characters */
    public static long m8222(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((w) obj).b;
        }
        return 0L;
    }

    public static w j(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException(C0089.m8581(m8220(), 64, 45, 3187));
        }
        return new w(j, j, j2, j2);
    }

    public static w k(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException(C0096.m10776(m8220(), 154, 62, 3169));
        }
        if (1 > j2) {
            throw new IllegalArgumentException(C0106.m11346(m8220(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 45, 1574));
        }
        return new w(1L, 1L, j, j2);
    }

    private w(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean g() {
        return m8221(this) == m8222(this) && m8219(this) == m8217(this);
    }

    public final long e() {
        return m8221(this);
    }

    public final long f() {
        return m8219(this);
    }

    public final long d() {
        return m8217(this);
    }

    public final boolean h() {
        return m8221(this) >= -2147483648L && m8217(this) <= 2147483647L;
    }

    public final boolean i(long j) {
        return j >= m8221(this) && j <= m8217(this);
    }

    public final int a(long j, r rVar) {
        if (C0104.m11204(this) && C0101.m11040(this, j)) {
            return (int) j;
        }
        throw new DateTimeException(m8218(this, j, rVar));
    }

    public final void b(long j, r rVar) {
        if (!C0101.m11040(this, j)) {
            throw new DateTimeException(m8218(this, j, rVar));
        }
    }

    private String c(long j, r rVar) {
        String strM8581 = C0089.m8581(m8220(), 0, 3, 689);
        if (rVar != null) {
            StringBuilder sb = new StringBuilder(C0102.m11094(m8220(), 3, 18, 677));
            C0082.m7988(sb, rVar);
            C0101.m11052(sb, C0083.m8037(m8220(), 21, 15, 1152));
            C0082.m7988(sb, this);
            C0101.m11052(sb, strM8581);
            C0087.m8489(sb, j);
            return C0099.m10924(sb);
        }
        StringBuilder sb2 = new StringBuilder(C0082.m7966(m8220(), 36, 28, 1631));
        C0082.m7988(sb2, this);
        C0101.m11052(sb2, strM8581);
        C0087.m8489(sb2, j);
        return C0099.m10924(sb2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        C0080.m7587(objectInputStream);
        long jM8221 = m8221(this);
        long jM8222 = m8222(this);
        if (jM8221 > jM8222) {
            throw new InvalidObjectException(C0082.m7966(m8220(), 323, 62, 2778));
        }
        long jM8219 = m8219(this);
        long jM8217 = m8217(this);
        if (jM8219 > jM8217) {
            throw new InvalidObjectException(C0098.m10856(m8220(), 261, 62, 2463));
        }
        if (jM8222 > jM8217) {
            throw new InvalidObjectException(C0086.m8291(m8220(), 216, 45, 2855));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return m8221(this) == m8221(wVar) && m8222(this) == m8222(wVar) && m8219(this) == m8219(wVar) && m8217(this) == m8217(wVar);
    }

    public final int hashCode() {
        long jM8222 = m8222(this);
        long jM8221 = m8221(this) + (jM8222 << 16) + (jM8222 >> 48);
        long jM8219 = m8219(this);
        long j = jM8221 + (jM8219 << 32) + (jM8219 >> 32);
        long jM8217 = m8217(this);
        long j2 = j + (jM8217 << 48) + (jM8217 >> 16);
        return (int) ((j2 >>> 32) ^ j2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long jM8221 = m8221(this);
        C0087.m8489(sb, jM8221);
        long jM8222 = m8222(this);
        if (jM8221 != jM8222) {
            C0089.m8573(sb, '/');
            C0087.m8489(sb, jM8222);
        }
        C0101.m11052(sb, C0096.m10776(m8220(), 385, 3, 2475));
        long jM8219 = m8219(this);
        C0087.m8489(sb, jM8219);
        long jM8217 = m8217(this);
        if (jM8219 != jM8217) {
            C0089.m8573(sb, '/');
            C0087.m8489(sb, jM8217);
        }
        return C0099.m10924(sb);
    }
}
