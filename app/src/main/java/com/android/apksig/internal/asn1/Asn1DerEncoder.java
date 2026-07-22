package com.android.apksig.internal.asn1;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Asn1DerEncoder {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f84short = {2327, 2358, 2360, 2359, 2431, 2347, 2366, 2360, 2431, 2353, 2346, 2354, 2365, 2362, 2349, 2348, 2431, 2353, 2352, 2347, 2431, 2348, 2346, 2351, 2351, 2352, 2349, 2347, 2362, 2363, 2405, 2431, 1499, 1530, 1521, 1520, 1461, 1462, 2277, 2199, 2304, 2388, 2383, 2383, 2304, 2380, 2369, 2386, 2375, 2373, 2330, 2304, 2056, 2095, 2103, 2080, 2093, 2088, 2085, 2145, 2103, 2080, 2093, 2100, 2084, 2145, 2087, 2094, 2099, 2145, 2095, 2094, 2085, 2084, 2145, 2146, 2736, 2730, 1356, 1282, 1283, 1304, 1356, 1282, 1305, 1281, 1289, 1310, 1285, 1295, 1366, 1356, 394, 421, 446, 447, 440, 492, 440, 443, 419, 492, 418, 419, 424, 425, 447, 492, 419, 441, 440, 492, 419, 426, 492, 446, 429, 418, 427, 425, 502, 492, 1032, 3181, 3146, 3154, 3141, 3144, 3149, 3136, 3076, 3154, 3141, 3144, 3153, 3137, 3076, 3138, 3147, 3158, 3076, 3146, 3147, 3136, 3137, 3076, 3079, 3094, 3102, 3076, 759, 726, 733, 732, 665, 666, 651, 665, 727, 726, 717, 665, 727, 716, 724, 732, 715, 720, 730, 643, 665, 3104, 3079, 3103, 3080, 3077, 3072, 3085, 3145, 3103, 3080, 3077, 3100, 3084, 3145, 3087, 3078, 3099, 3145, 3079, 3078, 3085, 3084, 3145, 3146, 3160, 3155, 3145, 2793, 2760, 2755, 2754, 2695, 2692, 2710, 2695, 2761, 2760, 2771, 2695, 2761, 2770, 2762, 2754, 2773, 2766, 2756, 2717, 2695, 451, 462, 454, 457, 463, 472, 428, 453, 456, 457, 450, 472, 453, 458, 453, 457, 478, 428, 481, 505, 511, 504, 428, 495, 483, 482, 504, 493, 485, 482, 428, 493, 504, 428, 480, 489, 493, 511, 504, 428, 504, 507, 483, 428, 482, 483, 488, 489, 511, 438, 428, 1838, 672, 647, 671, 648, 645, 640, 653, 713, 680, 698, 679, 711, 728, 713, 648, 647, 647, 646, 669, 648, 669, 640, 646, 647, 713, 646, 647, 713, 969, 924, 922, 908, 909, 969, 902, 903, 969, 904, 969, 922, 925, 904, 925, 896, 906, 969, 911, 896, 908, 901, 909, 979, 969, 1972, 1939, 1947, 1950, 1943, 1942, 2002, 1926, 1949, 2002, 1920, 1943, 1939, 1942, 2002, 2522, 2935, 2895, 2902, 2894, 2899, 2890, 2902, 2911, 2842, 2900, 2901, 2900, 2839, 2900, 2895, 2902, 2902, 2842, 2908, 2899, 2911, 2902, 2910, 2889, 2842, 2899, 2900, 2842, 2937, 2930, 2933, 2931, 2937, 2943, 2842, 2905, 2902, 2907, 2889, 2889, 2842, 1271, 1261, 2509, 2497, 1858, 1891, 1836, 1890, 1891, 1890, 1825, 1890, 1913, 1888, 1888, 1836, 1898, 1893, 1897, 1888, 1896, 1919, 1836, 1893, 1890, 1836, 1871, 1860, 1859, 1861, 1871, 1865, 1836, 1903, 1888, 1901, 1919, 1919, 1836, 2917, 2884, 2827, 2893, 2882, 2894, 2887, 2895, 2904, 2827, 2890, 2885, 2885, 2884, 2911, 2890, 2911, 2894, 2895, 2827, 2908, 2882, 2911, 2883, 2827, 2122, 2051, 2052, 2122, 2089, 2082, 2085, 2083, 2089, 2095, 2122, 2057, 2054, 2059, 2073, 2073, 2122, 3186, 2335, 2352, 2364, 2357, 2365, 2346, 2425, 2353, 2360, 2351, 2364, 2425, 2349, 2353, 2364, 2425, 2346, 2360, 2356, 2364, 2425, 2352, 2359, 2365, 2364, 2337, 2403, 2425, 1707, 1770, 1765, 1775, 1707, 1701, 1055, 1080, 1072, 1077, 1084, 1085, 1145, 1069, 1078, 1145, 1084, 1079, 1082, 1078, 1085, 1084, 1145, 1276, 1223, 1242, 1244, 1241, 1241, 1222, 1243, 1245, 1228, 1229, 1161, 1226, 1222, 1223, 1245, 1224, 1216, 1223, 1228, 1243, 1161, 1245, 1232, 1241, 1228, 1171, 1161, 3124, 3194, 3195, 3168, 3124, 3189, 3194, 3194, 3195, 3168, 3189, 3168, 3185, 3184, 3124, 3171, 3197, 3168, 3196, 3124};
    public static final Asn1OpaqueObject ASN1_DER_NULL = new Asn1OpaqueObject(new byte[]{5, 0});

    public static final class AnnotatedField {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f85short = {717, 760, 766, 697, 759, 748, 756, 763, 764, 747, 697, 756, 748, 746, 749, 697, 763, 764, 697, 746, 745, 764, 762, 752, 767, 752, 764, 765, 697, 750, 753, 764, 759, 697, 749, 760, 766, 766, 752, 759, 766, 697, 756, 758, 765, 764, 697, 752, 746, 697, 601, 622, 634, 638, 610, 633, 622, 623, 555, 621, 610, 622, 615, 623, 555, 613, 612, 639, 555, 632, 622, 639, 3062, 3021, 3024, 3030, 3027, 3027, 3020, 3025, 3031, 3014, 3015, 2947, 3019, 3018, 3012, 3019, 2947, 3031, 3010, 3012, 2947, 3021, 3030, 3022, 3009, 3014, 3025, 2969, 2947, 1557, 1588, 1594, 1589, 1648, 1577, 1596, 1594, 1648, 1587, 1576, 1584, 1599, 1592, 1583, 1661, 1595, 1586, 1583, 1584, 1661, 1587, 1586, 1577, 1661, 1582, 1576, 1581, 1581, 1586, 1583, 1577, 1592, 1593, 3296, 3291, 3294, 3291, 3290, 3266, 3291, 3221, 3265, 3284, 3282, 3282, 3292, 3291, 3282, 3221, 3288, 3290, 3281, 3280, 3215, 3221};
        public final Field a;
        public final Object b;
        public final Asn1Field c;
        public final Asn1Type d;
        public final Asn1Type e;
        public final int f;
        public final int g;
        public final Asn1Tagging h;
        public final boolean i;

        /* JADX INFO: renamed from: ۟۟۟۠۠, reason: not valid java name and contains not printable characters */
        public static Asn1Type m1489(Object obj) {
            if (C0070.m5903() > 0) {
                return ((AnnotatedField) obj).e;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
        public static short[] m1490() {
            if (C0020.m1385() < 0) {
                return f85short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
        public static Field m1491(Object obj) {
            if (C0078.m7450() > 0) {
                return ((AnnotatedField) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
        public static byte[] m1492(Object obj, Object obj2, Object obj3) {
            if (C0038.m4010() > 0) {
                return JavaToDerConverter.toDer(obj, (Asn1Type) obj2, (Asn1Type) obj3);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۢۦ۠, reason: not valid java name and contains not printable characters */
        public static int[] m1493() {
            if (C0028.m2593() > 0) {
                return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۢۦۦ, reason: not valid java name and contains not printable characters */
        public static int m1494(Object obj) {
            if (C0070.m5903() >= 0) {
                return ((AnnotatedField) obj).f;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۟ۦ۟ۢۡ, reason: not valid java name and contains not printable characters */
        public static boolean m1495(Object obj) {
            if (C0036.m3653() < 0) {
                return ((AnnotatedField) obj).i;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۣۧۦ, reason: not valid java name and contains not printable characters */
        public static Object m1496(Object obj) {
            if (C0111.m13165() < 0) {
                return ((AnnotatedField) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۠ۡۦ, reason: contains not printable characters */
        public static Asn1Field m1497(Object obj) {
            if (C0071.m6069() >= 0) {
                return ((AnnotatedField) obj).c;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۨۨۥ, reason: contains not printable characters */
        public static Asn1Tagging m1498(Object obj) {
            if (C0023.m1921() >= 0) {
                return ((AnnotatedField) obj).h;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۧۢۨ, reason: not valid java name and contains not printable characters */
        public static int m1499(Object obj) {
            if (C0077.m7272() <= 0) {
                return ((AnnotatedField) obj).g;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۨۡ۠ۨ, reason: not valid java name and contains not printable characters */
        public static Asn1Type m1500(Object obj) {
            if (C0032.m3184() <= 0) {
                return ((AnnotatedField) obj).d;
            }
            return null;
        }

        public byte[] toDer() throws Asn1EncodingException {
            Object objM2329 = C0026.m2329(m1496(this), m1491(this));
            if (objM2329 == null) {
                if (m1495(this)) {
                    return null;
                }
                throw new Asn1EncodingException(C0018.m1070(m1490(), 50, 22, 523));
            }
            byte[] bArrM1492 = m1492(objM2329, m1500(this), m1489(this));
            int[] iArrM1493 = m1493();
            Asn1Tagging asn1TaggingM1498 = m1498(this);
            int i = iArrM1493[C0030.m2893(asn1TaggingM1498)];
            if (i == 1) {
                return bArrM1492;
            }
            int iM1494 = m1494(this);
            int iM1499 = m1499(this);
            if (i == 2) {
                return C0072.m6183(iM1494, true, iM1499, new byte[][]{bArrM1492});
            }
            if (i != 3) {
                StringBuilder sb = new StringBuilder(C0077.m7205(m1490(), 135, 22, 3253));
                C0036.m3741(sb, asn1TaggingM1498);
                throw new RuntimeException(C0068.m5536(sb));
            }
            if (C0039.m4127(bArrM1492[0]) == 31) {
                throw new Asn1EncodingException(C0066.m4828(m1490(), 101, 34, 1629));
            }
            if (iM1499 >= 31) {
                StringBuilder sb2 = new StringBuilder(C0031.m3047(m1490(), 72, 29, 2979));
                C0021.m1551(sb2, iM1499);
                throw new Asn1EncodingException(C0068.m5536(sb2));
            }
            byte bM3760 = C0036.m3760(bArrM1492[0], iM1499);
            bArrM1492[0] = bM3760;
            bArrM1492[0] = C0069.m5777(bM3760, iM1494);
            return bArrM1492;
        }

        public Asn1Field getAnnotation() {
            return m1497(this);
        }

        public Field getField() {
            return m1491(this);
        }

        public AnnotatedField(Object obj, Field field, Asn1Field asn1Field) throws Asn1EncodingException {
            int iM7457;
            this.b = obj;
            this.a = field;
            this.c = asn1Field;
            Asn1Type asn1TypeM3713 = C0036.m3713(asn1Field);
            this.d = asn1TypeM3713;
            this.e = C0075.m6796(asn1Field);
            Asn1TagClass asn1TagClassM6778 = C0075.m6778(asn1Field);
            if (asn1TagClassM6778 == C0038.m3941()) {
                if (C0037.m3857(asn1Field) != -1) {
                    asn1TagClassM6778 = C0022.m1736();
                } else {
                    asn1TagClassM6778 = C0074.m6577();
                }
            }
            this.f = C0028.m2608(asn1TagClassM6778);
            if (C0037.m3857(asn1Field) != -1) {
                iM7457 = C0037.m3857(asn1Field);
            } else if (asn1TypeM3713 != C0073.m6400() && asn1TypeM3713 != C0029.m2773()) {
                iM7457 = C0078.m7457(asn1TypeM3713);
            } else {
                iM7457 = -1;
            }
            this.g = iM7457;
            Asn1Tagging asn1TaggingM3540 = C0035.m3540(asn1Field);
            this.h = asn1TaggingM3540;
            if ((asn1TaggingM3540 != C0025.m2100() && asn1TaggingM3540 != C0070.m5928()) || C0037.m3857(asn1Field) != -1) {
                this.i = C0068.m5659(asn1Field);
            } else {
                StringBuilder sb = new StringBuilder(C0032.m3209(m1490(), 0, 50, 665));
                C0036.m3741(sb, asn1TaggingM3540);
                throw new Asn1EncodingException(C0068.m5536(sb));
            }
        }
    }

    public static class ByteArrayLexicographicComparator implements Comparator<byte[]> {
        public static final ByteArrayLexicographicComparator a = new ByteArrayLexicographicComparator();

        /* JADX INFO: renamed from: ۟ۤۧۤۨ, reason: not valid java name and contains not printable characters */
        public static ByteArrayLexicographicComparator m1501() {
            if (C0020.m1385() < 0) {
                return a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
        public static int m1502(Object obj, Object obj2, Object obj3) {
            if (C0032.m3184() <= 0) {
                return ((ByteArrayLexicographicComparator) obj).compare2((byte[]) obj2, (byte[]) obj3);
            }
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return m1502(this, bArr, bArr2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(byte[] bArr, byte[] bArr2) {
            int iM3151 = C0032.m3151(bArr.length, bArr2.length);
            for (int i = 0; i < iM3151; i++) {
                int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
                if (i2 != 0) {
                    return i2;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    public static final class JavaToDerConverter {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f86short = {1792, 1851, 1830, 1824, 1829, 1829, 1850, 1831, 1825, 1840, 1841, 1909, 1846, 1850, 1851, 1827, 1840, 1831, 1830, 1852, 1850, 1851, 1903, 1909, 963, 919, 908, 963, 930, 944, 941, 973, 978, 963};

        public static byte[] toDer(Object obj, Asn1Type asn1Type, Asn1Type asn1Type2) throws Asn1EncodingException {
            byte[] bArr;
            Class clsM2951 = C0030.m2951(obj);
            if (C0023.m1865(Asn1OpaqueObject.class, clsM2951)) {
                ByteBuffer byteBufferM2907 = C0030.m2907((Asn1OpaqueObject) obj);
                byte[] bArr2 = new byte[C0071.m5984(byteBufferM2907)];
                C0029.m2812(byteBufferM2907, bArr2);
                return bArr2;
            }
            if (asn1Type == null || asn1Type == C0029.m2773()) {
                return C0072.m6214(obj);
            }
            switch (m1504()[C0030.m2893(asn1Type)]) {
                case 1:
                    Asn1Class asn1Class = (Asn1Class) C0036.m3675(clsM2951);
                    if (asn1Class != null && C0067.m5524(asn1Class) == C0073.m6400()) {
                        return C0077.m7178(obj);
                    }
                    break;
                case 2:
                    Asn1Class asn1Class2 = (Asn1Class) C0036.m3675(clsM2951);
                    if (asn1Class2 != null && C0067.m5524(asn1Class2) == C0073.m6354()) {
                        return C0022.m1695(obj);
                    }
                    break;
                case 4:
                case 5:
                    if (obj instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) obj;
                        bArr = new byte[C0071.m5984(byteBuffer)];
                        C0029.m2812(C0071.m6043(byteBuffer), bArr);
                    } else {
                        bArr = obj instanceof byte[] ? (byte[]) obj : null;
                    }
                    if (bArr != null) {
                        return C0072.m6183(0, false, C0078.m7457(asn1Type), new byte[][]{bArr});
                    }
                    break;
                case 6:
                    if (obj instanceof Integer) {
                        return C0073.m6358(C0025.m2170((Integer) obj));
                    }
                    if (obj instanceof Long) {
                        return C0069.m5818(C0016.m704((Long) obj));
                    }
                    if (obj instanceof BigInteger) {
                        return C0034.m3498((BigInteger) obj);
                    }
                    break;
                case 7:
                    if (obj instanceof Boolean) {
                        return C0063.m4443(C0065.m4681((Boolean) obj));
                    }
                    break;
                case 8:
                case 9:
                    if (obj instanceof String) {
                        return C0072.m6183(0, false, C0078.m7457(asn1Type), new byte[][]{C0066.m4854((String) obj)});
                    }
                    break;
                case 10:
                    if (obj instanceof String) {
                        return C0073.m6421((String) obj);
                    }
                    break;
                case 11:
                    return C0073.m6341((Collection) obj, asn1Type2);
                case 12:
                    return C0016.m659((Collection) obj, asn1Type2);
            }
            StringBuilder sb = new StringBuilder(C0020.m1443(m1503(), 0, 24, 1877));
            C0077.m7290(sb, C0038.m3997(clsM2951));
            C0077.m7290(sb, C0035.m3603(m1503(), 24, 10, 995));
            C0036.m3741(sb, asn1Type);
            throw new Asn1EncodingException(C0068.m5536(sb));
        }

        /* JADX INFO: renamed from: ۥۨ۠ۦ, reason: contains not printable characters */
        public static short[] m1503() {
            if (C0063.m4427() >= 0) {
                return f86short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
        public static int[] m1504() {
            if (C0023.m1921() >= 0) {
                return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
            }
            return null;
        }
    }

    public static byte[] access$600(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return C0024.m2042(0, false, 1, new byte[][]{bArr});
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Field m1480(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((AnnotatedField) obj).getField();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1481(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((AnnotatedField) obj).toDer();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m1482(Object obj, Object obj2, Object obj3) {
        if (C0018.m1064() >= 0) {
            return JavaToDerConverter.toDer(obj, (Asn1Type) obj2, (Asn1Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1483() {
        if (C0037.m3837() < 0) {
            return f84short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۡ, reason: not valid java name and contains not printable characters */
    public static ByteArrayLexicographicComparator m1484() {
        if (C0017.m846() >= 0) {
            return ByteArrayLexicographicComparator.m1501();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Asn1Field m1485(Object obj) {
        if (C0034.m3450() > 0) {
            return ((AnnotatedField) obj).getAnnotation();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int[] m1486() {
        if (C0068.m5678() > 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.asn1.Asn1DerEncoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging;
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;

        /* JADX INFO: renamed from: ۢۦۡۤ, reason: not valid java name and contains not printable characters */
        public static int[] m1487() {
            if (C0020.m1385() <= 0) {
                return $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤۨۤۧ, reason: not valid java name and contains not printable characters */
        public static int[] m1488() {
            if (C0023.m1921() > 0) {
                return $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0039.m4107().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Tagging = iArr;
            try {
                iArr[C0030.m2893(C0025.m2210())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m1487()[C0030.m2893(C0025.m2100())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m1487()[C0030.m2893(C0070.m5928())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C0074.m6478().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Type = iArr2;
            try {
                iArr2[C0030.m2893(C0073.m6400())] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m1488()[C0030.m2893(C0073.m6354())] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m1488()[C0030.m2893(C0029.m2724())] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                m1488()[C0030.m2893(C0030.m2863())] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m1488()[C0030.m2893(C0067.m5426())] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                m1488()[C0030.m2893(C0019.m1179())] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                m1488()[C0030.m2893(C0072.m6207())] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                m1488()[C0030.m2893(C0066.m4885())] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                m1488()[C0030.m2893(C0069.m5753())] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                m1488()[C0030.m2893(C0070.m5879())] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                m1488()[C0030.m2893(C0032.m3160())] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                m1488()[C0030.m2893(C0019.m1252())] = 12;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static byte[] a(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            throw new IllegalArgumentException(C0071.m6038(i2, C0064.m4545(m1483(), 0, 32, 2399)));
        }
        int i3 = 6;
        byte b = (byte) ((i << 6) | (z ? 32 : 0) | i2);
        int length = 0;
        for (byte[] bArr3 : bArr) {
            length += bArr3.length;
        }
        int length2 = 2;
        if (length < 128) {
            bArr2 = new byte[length + 2];
            bArr2[0] = b;
            bArr2[1] = (byte) length;
        } else {
            if (length <= 255) {
                byte[] bArr4 = new byte[length + 3];
                bArr4[1] = -127;
                bArr4[2] = (byte) length;
                bArr2 = bArr4;
                i3 = 3;
            } else if (length <= 65535) {
                byte[] bArr5 = new byte[length + 4];
                bArr5[1] = -126;
                bArr5[2] = (byte) (length >> 8);
                bArr5[3] = (byte) (length & 255);
                bArr2 = bArr5;
                i3 = 4;
            } else if (length <= 16777215) {
                byte[] bArr6 = new byte[length + 5];
                bArr6[1] = -125;
                bArr6[2] = (byte) (length >> 16);
                bArr6[3] = (byte) ((length >> 8) & 255);
                bArr6[4] = (byte) (length & 255);
                bArr2 = bArr6;
                i3 = 5;
            } else {
                byte[] bArr7 = new byte[length + 6];
                bArr7[1] = -124;
                bArr7[2] = (byte) (length >> 24);
                bArr7[3] = (byte) ((length >> 16) & 255);
                bArr7[4] = (byte) ((length >> 8) & 255);
                bArr7[5] = (byte) (length & 255);
                bArr2 = bArr7;
            }
            bArr2[0] = b;
            length2 = i3;
        }
        for (byte[] bArr8 : bArr) {
            C0027.m2519(bArr8, 0, bArr2, length2, bArr8.length);
            length2 += bArr8.length;
        }
        return bArr2;
    }

    public static byte[] access$700(String str) throws Asn1EncodingException {
        String strM5807 = C0069.m5807(m1483(), 32, 6, 1429);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrM2222 = C0025.m2222(str, C0069.m5807(m1483(), 38, 2, 2233));
        if (strArrM2222.length < 2) {
            throw new Asn1EncodingException(C0032.m3232(C0021.m1650(m1483(), 219, 51, 396), str));
        }
        try {
            int iM4116 = C0039.m4116(strArrM2222[0]);
            if (iM4116 > 6 || iM4116 < 0) {
                throw new Asn1EncodingException(C0071.m6038(iM4116, C0064.m4545(m1483(), 171, 27, 3177)));
            }
            try {
                int iM41162 = C0039.m4116(strArrM2222[1]);
                if (iM41162 >= 40 || iM41162 < 0) {
                    throw new Asn1EncodingException(C0071.m6038(iM41162, C0039.m4066(m1483(), 123, 27, 3108)));
                }
                int i = (iM4116 * 40) + iM41162;
                if (i > 255) {
                    StringBuilder sb = new StringBuilder(C0063.m4315(m1483(), 92, 30, 460));
                    C0021.m1551(sb, iM4116);
                    C0077.m7290(sb, C0070.m5942(m1483(), 122, 1, 1062));
                    C0021.m1551(sb, iM41162);
                    throw new Asn1EncodingException(C0068.m5536(sb));
                }
                C0070.m5921(byteArrayOutputStream, i);
                for (int i2 = 2; i2 < strArrM2222.length; i2++) {
                    String str2 = strArrM2222[i2];
                    try {
                        int iM41163 = C0039.m4116(str2);
                        if (iM41163 < 0) {
                            StringBuilder sb2 = new StringBuilder(C0068.m5544(m1483(), 52, 24, 2113));
                            C0021.m1551(sb2, i2 + 1);
                            C0077.m7290(sb2, C0020.m1443(m1483(), 76, 2, 2698));
                            C0021.m1551(sb2, iM41163);
                            throw new Asn1EncodingException(C0068.m5536(sb2));
                        }
                        if (iM41163 <= 127) {
                            C0070.m5921(byteArrayOutputStream, iM41163);
                        } else if (iM41163 < 16384) {
                            C0070.m5921(byteArrayOutputStream, (iM41163 >> 7) | 128);
                            C0070.m5921(byteArrayOutputStream, iM41163 & WorkQueueKt.MASK);
                        } else {
                            if (iM41163 >= 2097152) {
                                StringBuilder sb3 = new StringBuilder(strM5807);
                                C0021.m1551(sb3, i2 + 1);
                                C0077.m7290(sb3, C0068.m5544(m1483(), 40, 12, 2336));
                                C0021.m1551(sb3, iM41163);
                                throw new Asn1EncodingException(C0068.m5536(sb3));
                            }
                            C0070.m5921(byteArrayOutputStream, (iM41163 >> 14) | 128);
                            C0070.m5921(byteArrayOutputStream, ((iM41163 >> 7) & WorkQueueKt.MASK) | 128);
                            C0070.m5921(byteArrayOutputStream, iM41163 & WorkQueueKt.MASK);
                        }
                    } catch (NumberFormatException unused) {
                        StringBuilder sb4 = new StringBuilder(strM5807);
                        C0021.m1551(sb4, i2 + 1);
                        C0077.m7290(sb4, C0028.m2609(m1483(), 78, 14, 1388));
                        C0077.m7290(sb4, str2);
                        throw new Asn1EncodingException(C0068.m5536(sb4));
                    }
                }
                return C0024.m2042(0, false, 6, new byte[][]{C0077.m7297(byteArrayOutputStream)});
            } catch (NumberFormatException unused2) {
                StringBuilder sb5 = new StringBuilder(C0022.m1728(m1483(), 150, 21, 697));
                C0077.m7290(sb5, strArrM2222[1]);
                throw new Asn1EncodingException(C0068.m5536(sb5));
            }
        } catch (NumberFormatException unused3) {
            StringBuilder sb6 = new StringBuilder(C0066.m4828(m1483(), 198, 21, 2727));
            C0077.m7290(sb6, strArrM2222[0]);
            throw new Asn1EncodingException(C0068.m5536(sb6));
        }
    }

    public static byte[] f(Collection collection, Asn1Type asn1Type, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(C0064.m4608(collection));
        Iterator itM4820 = C0066.m4820(collection);
        while (C0036.m3657(itM4820)) {
            C0017.m919(arrayList, m1482(C0071.m6012(itM4820), asn1Type, null));
        }
        if (z) {
            if (C0018.m1084(arrayList) > 1) {
                C0039.m4063(arrayList, m1484());
            }
            i = 17;
        } else {
            i = 16;
        }
        return C0024.m2042(0, true, i, (byte[][]) C0039.m4172(arrayList, new byte[0][]));
    }

    public static ArrayList b(Object obj) throws Asn1EncodingException {
        Class clsM2951 = C0030.m2951(obj);
        Field[] fieldArrM2655 = C0028.m2655(clsM2951);
        ArrayList arrayList = new ArrayList(fieldArrM2655.length);
        for (Field field : fieldArrM2655) {
            Asn1Field asn1Field = (Asn1Field) C0029.m2715(field);
            if (asn1Field != null) {
                boolean zM638 = C0016.m638(C0066.m4843(field));
                String strM6791 = C0075.m6791(m1483(), 270, 1, 1792);
                if (!zM638) {
                    try {
                        C0017.m919(arrayList, new AnnotatedField(obj, field, asn1Field));
                    } catch (Asn1EncodingException e) {
                        StringBuilder sb = new StringBuilder(C0039.m4066(m1483(), 271, 28, 745));
                        C0077.m7290(sb, C0038.m3997(clsM2951));
                        C0077.m7290(sb, strM6791);
                        C0077.m7290(sb, C0033.m3333(field));
                        throw new Asn1EncodingException(C0068.m5536(sb), e);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    C0077.m7290(sb2, C0038.m3997(Asn1Field.class));
                    C0077.m7290(sb2, C0022.m1728(m1483(), 299, 25, 1001));
                    C0077.m7290(sb2, C0038.m3997(clsM2951));
                    C0077.m7290(sb2, strM6791);
                    C0077.m7290(sb2, C0033.m3333(field));
                    throw new Asn1EncodingException(C0068.m5536(sb2));
                }
            }
        }
        return arrayList;
    }

    public static Object c(Object obj, Field field) throws Asn1EncodingException {
        try {
            return C0067.m5443(field, obj);
        } catch (ReflectiveOperationException e) {
            StringBuilder sb = new StringBuilder(C0037.m3829(m1483(), 324, 15, 2034));
            C0077.m7290(sb, C0038.m3997(C0030.m2951(obj)));
            C0077.m7290(sb, C0024.m1945(m1483(), 339, 1, 2548));
            C0077.m7290(sb, C0033.m3333(field));
            throw new Asn1EncodingException(C0068.m5536(sb), e);
        }
    }

    public static byte[] d(Object obj) throws Asn1EncodingException {
        Class clsM2951 = C0030.m2951(obj);
        ArrayList arrayListM4815 = C0066.m4815(obj);
        if (!C0066.m4881(arrayListM4815)) {
            Iterator itM4154 = C0039.m4154(arrayListM4815);
            AnnotatedField annotatedField = null;
            while (C0036.m3657(itM4154)) {
                AnnotatedField annotatedField2 = (AnnotatedField) C0071.m6012(itM4154);
                if (C0064.m4607(obj, m1480(annotatedField2)) != null) {
                    if (annotatedField == null) {
                        annotatedField = annotatedField2;
                    } else {
                        StringBuilder sb = new StringBuilder(C0039.m4066(m1483(), 340, 41, 2874));
                        C0077.m7290(sb, C0038.m3997(clsM2951));
                        C0077.m7290(sb, C0037.m3829(m1483(), 381, 2, 1229));
                        C0077.m7290(sb, C0033.m3333(m1480(annotatedField)));
                        C0077.m7290(sb, C0064.m4545(m1483(), 383, 2, 2529));
                        C0077.m7290(sb, C0033.m3333(m1480(annotatedField2)));
                        throw new Asn1EncodingException(C0068.m5536(sb));
                    }
                }
            }
            if (annotatedField != null) {
                return m1481(annotatedField);
            }
            throw new Asn1EncodingException(C0032.m3232(C0031.m3047(m1483(), 385, 35, 1804), C0038.m3997(clsM2951)));
        }
        StringBuilder sb2 = new StringBuilder(C0039.m4066(m1483(), 420, 25, 2859));
        C0077.m7290(sb2, C0038.m3997(Asn1Field.class));
        C0077.m7290(sb2, C0029.m2695(m1483(), 445, 17, 2154));
        C0077.m7290(sb2, C0038.m3997(clsM2951));
        throw new Asn1EncodingException(C0068.m5536(sb2));
    }

    public static byte[] e(Object obj, boolean z) throws Asn1EncodingException {
        Class clsM2951 = C0030.m2951(obj);
        ArrayList arrayListM4815 = C0066.m4815(obj);
        C0039.m4063(arrayListM4815, new a(1));
        int iM1084 = C0018.m1084(arrayListM4815);
        String strM1728 = C0022.m1728(m1483(), 462, 1, 3164);
        if (iM1084 > 1) {
            Iterator itM4154 = C0039.m4154(arrayListM4815);
            AnnotatedField annotatedField = null;
            while (C0036.m3657(itM4154)) {
                AnnotatedField annotatedField2 = (AnnotatedField) C0071.m6012(itM4154);
                if (annotatedField != null && C0019.m1209(m1485(annotatedField)) == C0019.m1209(m1485(annotatedField2))) {
                    StringBuilder sb = new StringBuilder(C0026.m2321(m1483(), 463, 28, 2393));
                    C0077.m7290(sb, C0038.m3997(clsM2951));
                    C0077.m7290(sb, strM1728);
                    C0077.m7290(sb, C0033.m3333(m1480(annotatedField)));
                    C0077.m7290(sb, C0032.m3209(m1483(), 491, 6, 1675));
                    C0077.m7290(sb, C0033.m3333(m1480(annotatedField2)));
                    throw new Asn1EncodingException(C0068.m5536(sb));
                }
                annotatedField = annotatedField2;
            }
        }
        ArrayList arrayList = new ArrayList(C0018.m1084(arrayListM4815));
        Iterator itM41542 = C0039.m4154(arrayListM4815);
        int length = 0;
        while (C0036.m3657(itM41542)) {
            AnnotatedField annotatedField3 = (AnnotatedField) C0071.m6012(itM41542);
            try {
                byte[] bArrM1481 = m1481(annotatedField3);
                if (bArrM1481 != null) {
                    C0017.m919(arrayList, bArrM1481);
                    length += bArrM1481.length;
                }
            } catch (Asn1EncodingException e) {
                StringBuilder sb2 = new StringBuilder(C0028.m2609(m1483(), 497, 17, 1113));
                C0077.m7290(sb2, C0038.m3997(clsM2951));
                C0077.m7290(sb2, strM1728);
                C0077.m7290(sb2, C0033.m3333(m1480(annotatedField3)));
                throw new Asn1EncodingException(C0068.m5536(sb2), e);
            }
        }
        if (z) {
            byte[] bArr = new byte[length];
            Iterator itM41543 = C0039.m4154(arrayList);
            int length2 = 0;
            while (C0036.m3657(itM41543)) {
                byte[] bArr2 = (byte[]) C0071.m6012(itM41543);
                C0027.m2519(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
            return bArr;
        }
        return C0024.m2042(0, true, 16, (byte[][]) C0039.m4172(arrayList, new byte[0][]));
    }

    public static byte[] encode(Object obj) throws Asn1EncodingException {
        Class clsM2951 = C0030.m2951(obj);
        Asn1Class asn1Class = (Asn1Class) C0036.m3675(clsM2951);
        if (asn1Class != null) {
            Asn1Type asn1TypeM5524 = C0067.m5524(asn1Class);
            int i = m1486()[C0030.m2893(asn1TypeM5524)];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C0063.m4358(obj, true);
                    }
                    StringBuilder sb = new StringBuilder(C0017.m936(m1483(), 514, 28, 1193));
                    C0036.m3741(sb, asn1TypeM5524);
                    throw new Asn1EncodingException(C0068.m5536(sb));
                }
                return C0063.m4358(obj, false);
            }
            return C0071.m6025(obj);
        }
        StringBuilder sb2 = new StringBuilder();
        C0077.m7290(sb2, C0038.m3997(clsM2951));
        C0077.m7290(sb2, C0023.m1904(m1483(), 542, 20, 3092));
        C0077.m7290(sb2, C0038.m3997(Asn1Class.class));
        throw new Asn1EncodingException(C0068.m5536(sb2));
    }
}
