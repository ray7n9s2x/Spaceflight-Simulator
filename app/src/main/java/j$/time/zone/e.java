package j$.time.zone;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.EnumC0500d;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.temporal.q;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f469short = {516, 518, 519, 541, 513, 3079, 3098, 3102, 3094, 679, 698, 702, 694, 663, 694, 693, 701, 698, 679, 698, 700, 701, 1298, 1301, 1280, 1295, 1285, 1280, 1299, 1285, 1326, 1287, 1287, 1298, 1284, 1301, 986, 979, 979, 966, 976, 961, 1015, 976, 979, 986, 967, 976, 553, 544, 544, 565, 547, 562, 519, 544, 562, 547, 564, 3161, 3172, 3168, 3176, 3117, 3168, 3192, 3198, 3193, 3117, 3183, 3176, 3117, 3168, 3172, 3177, 3171, 3172, 3178, 3173, 3193, 3117, 3194, 3173, 3176, 3171, 3117, 3176, 3171, 3177, 3117, 3170, 3179, 3117, 3177, 3180, 3188, 3117, 3179, 3169, 3180, 3178, 3117, 3172, 3198, 3117, 3193, 3199, 3192, 3176, 1958, 1947, 1951, 1943, 2005, 1921, 2002, 1948, 1939, 1948, 1949, 2015, 1949, 1940, 2015, 1921, 1943, 1937, 1949, 1948, 1942, 2002, 1951, 1927, 1921, 1926, 2002, 1936, 1943, 2002, 1928, 1943, 1920, 1949, 1694, 1723, 1699, 1786, 1717, 1724, 1786, 1719, 1717, 1716, 1710, 1714, 1786, 1715, 1716, 1726, 1715, 1721, 1723, 1710, 1717, 1704, 1786, 1719, 1711, 1705, 1710, 1786, 1720, 1727, 1786, 1720, 1727, 1710, 1709, 1727, 1727, 1716, 1786, 1783, 1768, 1762, 1786, 1723, 1716, 1726, 1786, 1769, 1771, 1786, 1715, 1716, 1721, 1718, 1711, 1705, 1715, 1708, 1727, 1786, 1727, 1698, 1721, 1718, 1711, 1726, 1715, 1716, 1725, 1786, 1696, 1727, 1704, 1717, 629, 596, 578, 596, 579, 600, 592, 605, 600, 587, 592, 581, 600, 606, 607, 529, 583, 600, 592, 529, 578, 596, 579, 600, 592, 605, 600, 587, 592, 581, 600, 606, 607, 529, 597, 596, 605, 596, 598, 592, 581, 596, 2772, 2802, 2785, 2798, 2803, 2793, 2804, 2793, 2799, 2798, 2770, 2805, 2796, 2789, 2779, 1338, 1308, 1293, 1373, 1793, 1848, 1835, 1852, 1826, 1839, 1854, 1902, 1100, 1048, 1027, 1100, 1679, 1667, 2375, 2312, 2313, 2375, 2312, 2325, 2375, 2309, 2306, 2305, 2312, 2325, 2306, 2375, 2315, 2310, 2324, 2323, 2375, 2307, 2310, 2334, 2375, 2312, 2305, 2375, 1146, 1077, 1076, 1146, 1077, 1064, 1146, 1080, 1087, 1084, 1077, 1064, 1087, 1146, 1078, 1083, 1065, 1070, 1146, 1086, 1083, 1059, 1146, 1079, 1075, 1076, 1071, 1065, 1146, 2981, 3050, 3043, 2981, 2953, 3014, 3015, 2953, 3014, 3035, 2953, 3016, 3023, 3037, 3020, 3035, 2953, 475, 410, 399, 475, 928, 934, 936, 930, 930, 1581, 3020, 3008, 2963, 2964, 2945, 2958, 2948, 2945, 2962, 2948, 3008, 2959, 2950, 2950, 2963, 2949, 2964, 3008};
    private final n a;
    private final byte b;
    private final EnumC0500d c;
    private final l d;
    private final boolean e;
    private final d f;
    private final A g;
    private final A h;
    private final A i;

    /* JADX INFO: renamed from: ۟۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static d m8399(Object obj) {
        if (C0102.m11109() < 0) {
            return ((e) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۧ, reason: not valid java name and contains not printable characters */
    public static l m8400(Object obj) {
        if (C0082.m7983() < 0) {
            return ((e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0500d m8401(Object obj) {
        if (C0093.m9101() > 0) {
            return ((e) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8402(Object obj) {
        if (C0085.m8230() > 0) {
            return ((e) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static A m8403(Object obj) {
        if (C0090.m8624() > 0) {
            return ((e) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۨ, reason: not valid java name and contains not printable characters */
    public static n m8404(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤۦ, reason: not valid java name and contains not printable characters */
    public static A m8405(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((e) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static byte m8406(Object obj) {
        if (C0084.m8116() > 0) {
            return ((e) obj).b;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۥ۠, reason: contains not printable characters */
    public static A m8407(Object obj) {
        if (C0085.m8230() > 0) {
            return ((e) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨ, reason: contains not printable characters */
    public static short[] m8408() {
        if (C0096.m10782() >= 0) {
            return f469short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m8409() {
        if (C0084.m8116() >= 0) {
            return c.a;
        }
        return null;
    }

    e(n nVar, int i, EnumC0500d enumC0500d, l lVar, boolean z, d dVar, A a, A a2, A a3) {
        this.a = nVar;
        this.b = (byte) i;
        this.c = enumC0500d;
        this.d = lVar;
        this.e = z;
        this.f = dVar;
        this.g = a;
        this.h = a2;
        this.i = a3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0106.m11346(m8408(), 217, 42, 561));
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        l lVarM8400 = m8400(this);
        boolean zM8402 = m8402(this);
        int iM11070 = zM8402 ? 86400 : C0102.m11070(lVarM8400);
        int iM8527 = C0088.m8527(m8405(this));
        A aM8407 = m8407(this);
        int iM85272 = C0088.m8527(aM8407) - iM8527;
        A aM8403 = m8403(this);
        int iM85273 = C0088.m8527(aM8403) - iM8527;
        int iM8239 = iM11070 % 3600 == 0 ? zM8402 ? 24 : C0085.m8239(lVarM8400) : 31;
        int i = iM8527 % DescriptorProtos.Edition.EDITION_LEGACY_VALUE == 0 ? (iM8527 / DescriptorProtos.Edition.EDITION_LEGACY_VALUE) + 128 : 255;
        int i2 = (iM85272 == 0 || iM85272 == 1800 || iM85272 == 3600) ? iM85272 / 1800 : 3;
        int i3 = (iM85273 == 0 || iM85273 == 1800 || iM85273 == 3600) ? iM85273 / 1800 : 3;
        EnumC0500d enumC0500dM8401 = m8401(this);
        C0091.m8668(objectOutput, (C0086.m8309(m8404(this)) << 28) + ((m8406(this) + 32) << 22) + ((enumC0500dM8401 == null ? 0 : C0092.m8795(enumC0500dM8401)) << 19) + (iM8239 << 14) + (C0105.m11258(m8399(this)) << 12) + (i << 4) + (i2 << 2) + i3);
        if (iM8239 == 31) {
            C0091.m8668(objectOutput, iM11070);
        }
        if (i == 255) {
            C0091.m8668(objectOutput, iM8527);
        }
        if (i2 == 3) {
            C0091.m8668(objectOutput, C0088.m8527(aM8407));
        }
        if (i3 == 3) {
            C0091.m8668(objectOutput, C0088.m8527(aM8403));
        }
    }

    static e b(ObjectInput objectInput) {
        int iM8693 = C0091.m8693(objectInput);
        n nVarM9171 = C0095.m9171(iM8693 >>> 28);
        int i = ((264241152 & iM8693) >>> 22) - 32;
        int i2 = (3670016 & iM8693) >>> 19;
        EnumC0500d enumC0500dM10932 = i2 == 0 ? null : C0099.m10932(i2);
        int i3 = (507904 & iM8693) >>> 14;
        d dVar = C0094.m9120()[(iM8693 & 12288) >>> 12];
        int i4 = (iM8693 & 4080) >>> 4;
        int i5 = (iM8693 & 12) >>> 2;
        int i6 = iM8693 & 3;
        l lVarM11246 = i3 == 31 ? C0104.m11246(C0091.m8693(objectInput)) : C0099.m10926(i3 % 24);
        A aM8622 = C0090.m8622(i4 == 255 ? C0091.m8693(objectInput) : (i4 - 128) * DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
        A aM86222 = i5 == 3 ? C0090.m8622(C0091.m8693(objectInput)) : C0090.m8622((i5 * 1800) + C0088.m8527(aM8622));
        A aM86223 = i6 == 3 ? C0090.m8622(C0091.m8693(objectInput)) : C0090.m8622((i6 * 1800) + C0088.m8527(aM8622));
        boolean z = i3 == 24;
        C0079.m7494(nVarM9171, C0105.m11310(m8408(), 0, 5, 617));
        C0079.m7494(lVarM11246, C0085.m8236(m8408(), 5, 4, 3187));
        C0079.m7494(dVar, C0099.m10897(m8408(), 9, 13, 723));
        C0079.m7494(aM8622, C0101.m11060(m8408(), 22, 14, 1377));
        C0079.m7494(aM86222, C0099.m10897(m8408(), 36, 12, 949));
        C0079.m7494(aM86223, C0085.m8236(m8408(), 48, 11, 582));
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException(C0086.m8291(m8408(), 143, 74, 1754));
        }
        if (z && !C0086.m8331(lVarM11246, C0104.m11195())) {
            throw new IllegalArgumentException(C0098.m10856(m8408(), 59, 50, 3085));
        }
        if (C0106.m11356(lVarM11246) != 0) {
            throw new IllegalArgumentException(C0095.m9204(m8408(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 34, 2034));
        }
        return new e(nVarM9171, i, enumC0500dM10932, lVarM11246, z, dVar, aM8622, aM86222, aM86223);
    }

    public final b a(int i) {
        j$.time.h hVarM8104;
        EnumC0500d enumC0500dM8401 = m8401(this);
        n nVarM8404 = m8404(this);
        byte bM8406 = m8406(this);
        if (bM8406 < 0) {
            C0092.m8727(C0103.m11146());
            hVarM8104 = C0084.m8104(i, nVarM8404, C0100.m11008(nVarM8404, C0079.m7487(i)) + 1 + bM8406);
            if (enumC0500dM8401 != null) {
                hVarM8104 = C0104.m11223(hVarM8104, new q(C0092.m8795(enumC0500dM8401), 1));
            }
        } else {
            hVarM8104 = C0084.m8104(i, nVarM8404, bM8406);
            if (enumC0500dM8401 != null) {
                hVarM8104 = C0104.m11223(hVarM8104, new q(C0092.m8795(enumC0500dM8401), 0));
            }
        }
        if (m8402(this)) {
            hVarM8104 = C0094.m9137(hVarM8104, 1L);
        }
        j$.time.j jVarM11000 = C0100.m11000(hVarM8104, m8400(this));
        d dVarM8399 = m8399(this);
        C0092.m8727(dVarM8399);
        int i2 = m8409()[C0105.m11258(dVarM8399)];
        A aM8407 = m8407(this);
        if (i2 == 1) {
            jVarM11000 = C0100.m11002(jVarM11000, C0088.m8527(aM8407) - C0088.m8527(C0103.m11137()));
        } else if (i2 == 2) {
            jVarM11000 = C0100.m11002(jVarM11000, C0088.m8527(aM8407) - C0088.m8527(m8405(this)));
        }
        return new b(jVarM11000, aM8407, m8403(this));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m8404(this) == m8404(eVar) && m8406(this) == m8406(eVar) && m8401(this) == m8401(eVar) && m8399(this) == m8399(eVar) && C0086.m8331(m8400(this), m8400(eVar)) && m8402(this) == m8402(eVar) && C0097.m10807(m8405(this), m8405(eVar)) && C0097.m10807(m8407(this), m8407(eVar)) && C0097.m10807(m8403(this), m8403(eVar));
    }

    public final int hashCode() {
        int iM11070 = ((C0102.m11070(m8400(this)) + (m8402(this) ? 1 : 0)) << 15) + (C0105.m11258(m8404(this)) << 11) + ((m8406(this) + 32) << 5);
        EnumC0500d enumC0500dM8401 = m8401(this);
        return ((C0080.m7536(m8405(this)) ^ (C0105.m11258(m8399(this)) + (iM11070 + ((enumC0500dM8401 == null ? 7 : C0105.m11258(enumC0500dM8401)) << 2)))) ^ C0080.m7536(m8407(this))) ^ C0080.m7536(m8403(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0095.m9204(m8408(), AndroidBinXmlParser.Chunk.RES_XML_TYPE_END_ELEMENT, 15, 2688));
        A aM8407 = m8407(this);
        A aM8403 = m8403(this);
        C0101.m11052(sb, C0086.m8332(aM8407, aM8403) > 0 ? C0085.m8236(m8408(), 274, 4, 1405) : C0092.m8731(m8408(), 278, 8, 1870));
        C0082.m7988(sb, aM8407);
        C0101.m11052(sb, C0104.m11206(m8408(), 286, 4, 1132));
        C0082.m7988(sb, aM8403);
        C0101.m11052(sb, C0106.m11346(m8408(), 290, 2, 1699));
        n nVarM8404 = m8404(this);
        byte bM8406 = m8406(this);
        EnumC0500d enumC0500dM8401 = m8401(this);
        if (enumC0500dM8401 == null) {
            C0101.m11052(sb, C0086.m8318(nVarM8404));
            C0089.m8573(sb, ' ');
            C0099.m10859(sb, bM8406);
        } else if (bM8406 == -1) {
            C0101.m11052(sb, C0086.m8318(enumC0500dM8401));
            C0101.m11052(sb, C0095.m9204(m8408(), 292, 26, 2407));
            C0101.m11052(sb, C0086.m8318(nVarM8404));
        } else if (bM8406 < 0) {
            C0101.m11052(sb, C0086.m8318(enumC0500dM8401));
            C0101.m11052(sb, C0101.m11060(m8408(), 318, 29, 1114));
            C0099.m10859(sb, (-bM8406) - 1);
            C0101.m11052(sb, C0086.m8291(m8408(), 347, 4, 2949));
            C0101.m11052(sb, C0086.m8318(nVarM8404));
        } else {
            C0101.m11052(sb, C0086.m8318(enumC0500dM8401));
            C0101.m11052(sb, C0082.m7966(m8408(), 351, 13, 2985));
            C0101.m11052(sb, C0086.m8318(nVarM8404));
            C0089.m8573(sb, ' ');
            C0099.m10859(sb, bM8406);
        }
        C0101.m11052(sb, C0094.m9107(m8408(), 364, 4, 507));
        C0101.m11052(sb, m8402(this) ? C0098.m10856(m8408(), 368, 5, 914) : C0086.m8297(m8400(this)));
        C0101.m11052(sb, C0087.m8474(m8408(), 373, 1, 1549));
        C0082.m7988(sb, m8399(this));
        C0101.m11052(sb, C0089.m8581(m8408(), 374, 18, 3040));
        C0082.m7988(sb, m8405(this));
        C0089.m8573(sb, ']');
        return C0099.m10924(sb);
    }
}
