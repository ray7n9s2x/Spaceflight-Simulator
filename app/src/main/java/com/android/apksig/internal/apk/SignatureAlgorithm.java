package com.android.apksig.internal.apk;

import androidx.core.view.InputDeviceCompat;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.conscrypt.C0111;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RSA_PSS_WITH_SHA256' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class SignatureAlgorithm {
    public static final SignatureAlgorithm DETDSA_WITH_SHA256;
    public static final SignatureAlgorithm DSA_WITH_SHA256;
    public static final SignatureAlgorithm ECDSA_WITH_SHA256;
    public static final SignatureAlgorithm ECDSA_WITH_SHA512;
    public static final SignatureAlgorithm RSA_PKCS1_V1_5_WITH_SHA256;
    public static final SignatureAlgorithm RSA_PKCS1_V1_5_WITH_SHA512;
    public static final SignatureAlgorithm RSA_PSS_WITH_SHA256;
    public static final SignatureAlgorithm RSA_PSS_WITH_SHA512;
    public static final SignatureAlgorithm VERITY_DSA_WITH_SHA256;
    public static final SignatureAlgorithm VERITY_ECDSA_WITH_SHA256;
    public static final SignatureAlgorithm VERITY_RSA_PKCS1_V1_5_WITH_SHA256;
    public static final /* synthetic */ SignatureAlgorithm[] g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f50short = {2631, 2652, 2645, 2617, 2598, 2593, 2594, 2636, 2630, 2631, 2608, 439, 428, 421, 470, 465, 466, 403, 397, 400, 396, 438, 439, 421, 459, 436, 439, 439, 1886, 1887, 1869, 1875, 1884, 1887, 1887, 1875, 1883, 1861, 1880, 1860, 1875, 1887, 1860, 1869, 1854, 1849, 1850, 2749, 2748, 2734, 2091, 2096, 2105, 2133, 2125, 2121, 2122, 892, 886, 887, 768, 2005, 1998, 1991, 1971, 1975, 1972, 2033, 2031, 2034, 2030, 2004, 2005, 1991, 1961, 2006, 2005, 2005, 1032, 1033, 1051, 1029, 1034, 1033, 1033, 1029, 1037, 1043, 1038, 1042, 1029, 1033, 1042, 1051, 1135, 1131, 1128, 593, 592, 578, 504, 483, 490, 409, 414, 413, 476, 450, 479, 451, 505, 504, 490, 3186, 3187, 3169, 3199, 3184, 3179, 3171, 3187, 3089, 3199, 3190, 3089, 3199, 3093, 3199, 3191, 3177, 3188, 3176, 3199, 3187, 3176, 3169, 3090, 3093, 3094, 3264, 3265, 3283, 2720, 2747, 2738, 2758, 2754, 2753, 2692, 2714, 2695, 2715, 2721, 2720, 2738, 2019, 2018, 2032, 2030, 2017, 2042, 2034, 2018, 1920, 2030, 2023, 1920, 2030, 1924, 2030, 2022, 2040, 2021, 2041, 2030, 2018, 2041, 2032, 1924, 1920, 1923, 1063, 1062, 1076, 269, 278, 287, 364, 363, 360, 297, 311, 298, 310, 283, 285, 282, 269, 287, 1987, 1989, 1986, 2005, 1991, 2009, 2001, 1999, 2002, 1998, 2009, 2005, 1998, 1991, 1972, 1971, 1968, 964, 962, 2985, 2994, 3003, 3023, 3019, 3016, 2957, 2963, 2958, 2962, 3007, 3001, 3006, 2985, 3003, 2400, 2406, 2401, 2422, 2404, 2426, 2418, 2412, 2417, 2413, 2426, 2422, 2413, 2404, 2320, 2324, 2327, 420, 418, 848, 843, 834, 817, 822, 821, 884, 874, 887, 875, 839, 848, 834, 782, 793, 779, 789, 797, 771, 798, 770, 789, 793, 770, 779, 888, 895, 892, 964, 979, 961, 571, 544, 553, 602, 605, 606, 543, 513, 540, 512, 556, 525, 540, 556, 571, 553, 2541, 2540, 2557, 2541, 2554, 2536, 2550, 2558, 2528, 2557, 2529, 2550, 2554, 2529, 2536, 2459, 2460, 2463, 1709, 1722, 1704, 1714, 1697, 1718, 1709, 1712, 1725, 1723, 1718, 1719, 1701, 1723, 1716, 1711, 1703, 1719, 1749, 1723, 1714, 1749, 1723, 1745, 1723, 1715, 1709, 1712, 1708, 1723, 1719, 1708, 1701, 1750, 1745, 1746, 2889, 2888, 2906, 1123, 1136, 1127, 1148, 1121, 1132, 1130, 1136, 1142, 1137, 1126, 1140, 1130, 1122, 1148, 1121, 1149, 1130, 1126, 1149, 1140, 1031, 1024, 1027, 780, 778, 869, 886, 865, 890, 871, 874, 876, 887, 864, 882, 876, 868, 890, 871, 891, 876, 864, 891, 882, 769, 774, 773, 774, 785, 771};
    public final int a;
    public final String b;
    public final ContentDigestAlgorithm c;
    public final Pair d;
    public final int e;
    public final int f;

    static {
        ContentDigestAlgorithm contentDigestAlgorithm = ContentDigestAlgorithm.CHUNKED_SHA256;
        SignatureAlgorithm signatureAlgorithm = new SignatureAlgorithm(C0032.m3209(f50short, 28, 19, 1804), 0, InputDeviceCompat.SOURCE_KEYBOARD, contentDigestAlgorithm, C0070.m5942(f50short, 47, 3, 2799), Pair.of(C0030.m2840(f50short, 11, 17, 484), new PSSParameterSpec(C0035.m3603(f50short, 0, 7, 2580), C0068.m5544(f50short, 7, 4, 2561), MGF1ParameterSpec.SHA256, 32, 1)), 24, 23);
        RSA_PSS_WITH_SHA256 = signatureAlgorithm;
        ContentDigestAlgorithm contentDigestAlgorithm2 = ContentDigestAlgorithm.CHUNKED_SHA512;
        SignatureAlgorithm signatureAlgorithm2 = new SignatureAlgorithm(C0022.m1728(f50short, 78, 19, 1114), 1, AndroidBinXmlParser.Chunk.RES_XML_TYPE_START_ELEMENT, contentDigestAlgorithm2, C0033.m3330(f50short, 97, 3, 515), Pair.of(C0028.m2609(f50short, 61, 17, 1926), new PSSParameterSpec(C0067.m5418(f50short, 50, 7, 2168), C0023.m1904(f50short, 57, 4, 817), MGF1ParameterSpec.SHA512, 64, 1)), 24, 23);
        RSA_PSS_WITH_SHA512 = signatureAlgorithm2;
        String strM5418 = C0067.m5418(f50short, 100, 13, 427);
        SignatureAlgorithm signatureAlgorithm3 = new SignatureAlgorithm(C0075.m6791(f50short, 113, 26, 3104), 2, AndroidBinXmlParser.Chunk.RES_XML_TYPE_END_ELEMENT, contentDigestAlgorithm, C0033.m3330(f50short, 139, 3, 3218), Pair.of(strM5418, null), 24, 1);
        RSA_PKCS1_V1_5_WITH_SHA256 = signatureAlgorithm3;
        SignatureAlgorithm signatureAlgorithm4 = new SignatureAlgorithm(C0064.m4545(f50short, ModuleDescriptor.MODULE_VERSION, 26, 1969), 3, 260, contentDigestAlgorithm2, C0078.m7427(f50short, 181, 3, 1141), Pair.of(C0111.m13097(f50short, 142, 13, 2803), null), 24, 1);
        RSA_PKCS1_V1_5_WITH_SHA512 = signatureAlgorithm4;
        String strM2151 = C0025.m2151(f50short, 184, 15, 350);
        SignatureAlgorithm signatureAlgorithm5 = new SignatureAlgorithm(C0065.m4757(f50short, 199, 17, 1926), 4, InputDeviceCompat.SOURCE_DPAD, contentDigestAlgorithm, C0021.m1650(f50short, 216, 2, 897), Pair.of(strM2151, null), 24, 11);
        ECDSA_WITH_SHA256 = signatureAlgorithm5;
        SignatureAlgorithm signatureAlgorithm6 = new SignatureAlgorithm(C0025.m2151(f50short, 233, 17, 2341), 5, 514, contentDigestAlgorithm2, C0069.m5807(f50short, 250, 2, 481), Pair.of(C0034.m3431(f50short, 218, 15, 3066), null), 24, 11);
        ECDSA_WITH_SHA512 = signatureAlgorithm6;
        String strM3047 = C0031.m3047(f50short, 252, 13, 771);
        SignatureAlgorithm signatureAlgorithm7 = new SignatureAlgorithm(C0027.m2404(f50short, 265, 15, 842), 6, 769, contentDigestAlgorithm, C0072.m6116(f50short, 280, 3, 896), Pair.of(strM3047, null), 24, 1);
        DSA_WITH_SHA256 = signatureAlgorithm7;
        SignatureAlgorithm signatureAlgorithm8 = new SignatureAlgorithm(C0021.m1650(f50short, 299, 18, 2473), 7, 769, contentDigestAlgorithm, C0077.m7205(f50short, 317, 3, 1769), Pair.of(C0077.m7205(f50short, 283, 16, 616), null), 24, 1);
        DETDSA_WITH_SHA256 = signatureAlgorithm8;
        ContentDigestAlgorithm contentDigestAlgorithm3 = ContentDigestAlgorithm.VERITY_CHUNKED_SHA256;
        SignatureAlgorithm signatureAlgorithm9 = new SignatureAlgorithm(C0064.m4545(f50short, 320, 33, 1764), 8, 1057, contentDigestAlgorithm3, C0065.m4757(f50short, 353, 3, 2843), Pair.of(strM5418, null), 28, 1);
        VERITY_RSA_PKCS1_V1_5_WITH_SHA256 = signatureAlgorithm9;
        SignatureAlgorithm signatureAlgorithm10 = new SignatureAlgorithm(C0076.m6902(f50short, 356, 24, 1077), 9, 1059, contentDigestAlgorithm3, C0026.m2321(f50short, 380, 2, 841), Pair.of(strM2151, null), 28, 11);
        VERITY_ECDSA_WITH_SHA256 = signatureAlgorithm10;
        SignatureAlgorithm signatureAlgorithm11 = new SignatureAlgorithm(C0035.m3603(f50short, 382, 22, 819), 10, 1061, contentDigestAlgorithm3, C0026.m2321(f50short, 404, 3, 834), Pair.of(strM3047, null), 28, 1);
        VERITY_DSA_WITH_SHA256 = signatureAlgorithm11;
        g = new SignatureAlgorithm[]{signatureAlgorithm, signatureAlgorithm2, signatureAlgorithm3, signatureAlgorithm4, signatureAlgorithm5, signatureAlgorithm6, signatureAlgorithm7, signatureAlgorithm8, signatureAlgorithm9, signatureAlgorithm10, signatureAlgorithm11};
    }

    public static SignatureAlgorithm valueOf(String str) {
        return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
    }

    public static SignatureAlgorithm[] values() {
        return (SignatureAlgorithm[]) g.clone();
    }

    public ContentDigestAlgorithm getContentDigestAlgorithm() {
        return this.c;
    }

    public int getId() {
        return this.a;
    }

    public String getJcaKeyAlgorithm() {
        return this.b;
    }

    public int getJcaSigAlgMinSdkVersion() {
        return this.f;
    }

    public Pair<String, ? extends AlgorithmParameterSpec> getJcaSignatureAlgorithmAndParams() {
        return this.d;
    }

    public int getMinSdkVersion() {
        return this.e;
    }

    public SignatureAlgorithm(String str, int i, int i2, ContentDigestAlgorithm contentDigestAlgorithm, String str2, Pair pair, int i3, int i4) {
        this.a = i2;
        this.c = contentDigestAlgorithm;
        this.b = str2;
        this.d = pair;
        this.e = i3;
        this.f = i4;
    }

    public static SignatureAlgorithm findById(int i) {
        for (SignatureAlgorithm signatureAlgorithm : values()) {
            if (signatureAlgorithm.getId() == i) {
                return signatureAlgorithm;
            }
        }
        return null;
    }
}
