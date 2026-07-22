package com.android.apksig.internal.pkcs7;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
@Asn1Class(type = Asn1Type.SEQUENCE)
public class AlgorithmIdentifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f107short = {2946, 3001, 2980, 2978, 2983, 2983, 3000, 2981, 2979, 2994, 2995, 3063, 2995, 3006, 2992, 2994, 2980, 2979, 3063, 2998, 3003, 2992, 3000, 2981, 3006, 2979, 3007, 3002, 3053, 3063, 2655, 2624, 2652, 2624, 2646, 2650, 2654, 2624, 2655, 2655, 2653, 2651, 2650, 2647, 2624, 2655, 2624, 2655, 2624, 2655, 695, 694, 676, 3091, 3084, 3088, 3084, 3098, 3094, 3090, 3084, 3091, 3090, 3090, 3094, 3090, 3084, 3094, 3084, 3091, 3205, 3218, 3200, 385, 414, 386, 414, 392, 388, 384, 414, 385, 384, 384, 388, 389, 414, 386, 414, 385, 3013, 3011, 3012, 3027, 3009, 2503, 2524, 2517, 2489, 720, 715, 706, 628, 618, 631, 619, 2431, 2372, 2393, 2399, 2394, 2394, 2373, 2392, 2398, 2383, 2382, 2314, 2400, 2409, 2411, 2314, 2425, 2371, 2381, 2372, 2379, 2398, 2399, 2392, 2383, 2314, 2379, 2374, 2381, 2373, 2392, 2371, 2398, 2370, 2375, 2314, 2308, 2314, 2414, 2371, 2381, 2383, 2393, 2398, 2314, 2379, 2374, 2381, 2373, 2392, 2371, 2398, 2370, 2375, 2320, 2314, 2545, 2557, 2478, 2484, 2490, 2483, 2492, 2473, 2472, 2479, 2488, 2557, 2492, 2481, 2490, 2482, 2479, 2484, 2473, 2485, 2480, 2535, 2557, 1793, 1821, 1794, 1797, 1821, 1803, 1799, 1795, 1821, 1794, 1821, 1794, 1795, 1794, 1821, 1792, 1821, 1799, 1821, 1793, 1821, 1794, 2075, 2080, 2109, 2107, 2110, 2110, 2081, 2108, 2106, 2091, 2090, 2158, 2090, 2087, 2089, 2091, 2109, 2106, 2158, 2095, 2082, 2089, 2081, 2108, 2087, 2106, 2086, 2083, 2164, 2158, 2576, 2575, 2578, 2575, 2576, 2581, 2575, 2578, 2575, 2579, 2575, 2579, 2583, 3071, 3012, 3023, 3026, 3034, 3023, 3017, 3038, 3023, 3022, 2954, 3022, 3011, 3021, 3023, 3033, 3038, 2954, 3019, 3014, 3021, 3013, 3032, 3011, 3038, 3010, 3015, 2960, 2954, 464, 459, 450, 433, 438, 437, 3275, 3280, 3289, 3241, 2844, 2845, 2831, 2203, 2180, 2200, 2180, 2194, 2206, 2202, 2180, 2203, 2203, 2201, 2207, 2206, 2195, 2180, 2203, 2180, 2203, 2180, 2203, 1976, 1967, 1981, 2342, 2362, 2341, 2338, 2362, 2348, 2336, 2340, 2362, 2341, 2362, 2341, 2340, 2341, 2362, 2343, 2362, 2336, 2362, 2343, 2362, 2342, 1680, 1679, 1683, 1679, 1689, 1685, 1681, 1679, 1680, 1681, 1681, 1685, 1681, 1679, 1685, 1679, 1680, 1133, 1139, 1134, 1138, 1118, 1151, 1134, 1118, 1097, 1115, 1361, 1359, 1362, 1358, 1378, 1397, 1383, 2663, 2657, 2403, 2429, 2400, 2428, 2385, 2391, 2384, 2375, 2389, 3210, 3221, 3209, 3221, 3203, 3215, 3211, 3221, 3210, 3211, 3211, 3215, 3214, 3221, 3209, 3221, 3210, 673, 666, 647, 641, 644, 644, 667, 646, 640, 657, 656, 724, 671, 657, 653, 724, 661, 664, 659, 667, 646, 669, 640, 668, 665, 718, 724, 799, 769, 796, 768, 826, 827, 809};

    @Asn1Field(index = 0, type = Asn1Type.OBJECT_IDENTIFIER)
    public String algorithm;

    @Asn1Field(index = 1, optional = true, type = Asn1Type.ANY)
    public Asn1OpaqueObject parameters;

    public AlgorithmIdentifier() {
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2229() {
        if (C0016.m717() <= 0) {
            return f107short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int[] m2230() {
        if (C0033.m3358() <= 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.pkcs7.AlgorithmIdentifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;

        /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
        public static int[] m2231() {
            if (C0076.m6903() <= 0) {
                return $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0073.m6333().length];
            $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm = iArr;
            try {
                iArr[C0030.m2893(C0066.m4884())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m2231()[C0030.m2893(C0028.m2546())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AlgorithmIdentifier(String str, Asn1OpaqueObject asn1OpaqueObject) {
        this.algorithm = str;
        this.parameters = asn1OpaqueObject;
    }

    public static String getJcaDigestAlgorithm(String str) throws SignatureException {
        String str2 = (String) C0072.m6108(C0021.m1560(), str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(C0032.m3116(C0021.m1650(m2229(), 0, 30, 3031), str));
    }

    public static String getJcaSignatureAlgorithm(String str, String str2) throws SignatureException {
        String strM3678;
        String str3 = (String) C0072.m6108(C0037.m3918(), str2);
        if (str3 != null) {
            return str3;
        }
        if (C0070.m5838(C0072.m6116(m2229(), 30, 20, 2670), str2)) {
            strM3678 = C0028.m2609(m2229(), 50, 3, 741);
        } else if (C0070.m5838(C0023.m1904(m2229(), 53, 17, 3106), str2)) {
            strM3678 = C0033.m3330(m2229(), 70, 3, 3265);
        } else {
            if (!C0070.m5838(C0077.m7205(m2229(), 73, 17, 432), str2)) {
                StringBuilder sb = new StringBuilder(C0111.m13097(m2229(), 106, 56, 2346));
                C0077.m7290(sb, str);
                C0077.m7290(sb, C0030.m2840(m2229(), 162, 23, 2525));
                C0077.m7290(sb, str2);
                throw new SignatureException(C0068.m5536(sb));
            }
            strM3678 = C0036.m3678(m2229(), 90, 5, 2944);
        }
        String strM4510 = C0064.m4510(str);
        if (C0019.m1242(strM4510, C0016.m625(m2229(), 95, 4, 2452))) {
            StringBuilder sb2 = new StringBuilder(C0065.m4757(m2229(), 99, 3, 643));
            C0077.m7290(sb2, C0071.m6056(strM4510, 4));
            strM4510 = C0068.m5536(sb2);
        }
        StringBuilder sb3 = new StringBuilder();
        C0077.m7290(sb3, strM4510);
        C0077.m7290(sb3, C0078.m7427(m2229(), 102, 4, 515));
        C0077.m7290(sb3, strM3678);
        return C0068.m5536(sb3);
    }

    public static AlgorithmIdentifier getSignerInfoDigestAlgorithmOid(DigestAlgorithm digestAlgorithm) {
        int i = m2230()[C0030.m2893(digestAlgorithm)];
        if (i == 1) {
            return new AlgorithmIdentifier(C0032.m3209(m2229(), 237, 13, 2593), C0068.m5648());
        }
        if (i == 2) {
            return new AlgorithmIdentifier(C0070.m5942(m2229(), 185, 22, 1843), C0068.m5648());
        }
        StringBuilder sb = new StringBuilder(C0075.m6791(m2229(), 207, 30, 2126));
        C0036.m3741(sb, digestAlgorithm);
        throw new IllegalArgumentException(C0068.m5536(sb));
    }

    public static Pair<String, AlgorithmIdentifier> getSignerInfoSignatureAlgorithm(PublicKey publicKey, DigestAlgorithm digestAlgorithm, boolean z) throws InvalidKeyException {
        String strM936;
        AlgorithmIdentifier algorithmIdentifier;
        String strM1650;
        String strM5875 = C0070.m5875(publicKey);
        int[] iArrM2230 = m2230();
        int i = iArrM2230[C0030.m2893(digestAlgorithm)];
        String strM7205 = C0077.m7205(m2229(), 250, 29, 2986);
        if (i != 1) {
            if (i == 2) {
                strM936 = C0026.m2321(m2229(), 279, 6, 387);
            } else {
                StringBuilder sb = new StringBuilder(strM7205);
                C0036.m3741(sb, digestAlgorithm);
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
        } else {
            strM936 = C0017.m936(m2229(), 285, 4, 3224);
        }
        boolean zM2111 = C0025.m2111(C0067.m5418(m2229(), 289, 3, 2894), strM5875);
        String strM4315 = C0063.m4315(m2229(), 292, 20, 2218);
        if (!zM2111 && !C0070.m5838(strM4315, strM5875)) {
            if (C0025.m2111(C0067.m5418(m2229(), 312, 3, 2044), strM5875)) {
                int i2 = iArrM2230[C0030.m2893(digestAlgorithm)];
                if (i2 != 1) {
                    if (i2 == 2) {
                        algorithmIdentifier = new AlgorithmIdentifier(C0023.m1904(m2229(), 315, 22, 2324), C0068.m5648());
                    } else {
                        StringBuilder sb2 = new StringBuilder(strM7205);
                        C0036.m3741(sb2, digestAlgorithm);
                        throw new IllegalArgumentException(C0068.m5536(sb2));
                    }
                } else {
                    algorithmIdentifier = new AlgorithmIdentifier(C0077.m7205(m2229(), 337, 17, 1697), C0068.m5648());
                }
                if (z) {
                    strM1650 = C0024.m1945(m2229(), 354, 10, 1050);
                } else {
                    strM1650 = C0021.m1650(m2229(), 364, 7, 1318);
                }
                return C0025.m2158(C0032.m3232(strM936, strM1650), algorithmIdentifier);
            }
            if (C0025.m2111(C0068.m5544(m2229(), 371, 2, 2594), strM5875)) {
                return C0025.m2158(C0032.m3232(strM936, C0036.m3678(m2229(), 373, 9, 2324)), new AlgorithmIdentifier(C0029.m2695(m2229(), 382, 17, 3259), C0068.m5648()));
            }
            throw new InvalidKeyException(C0032.m3116(C0038.m4022(m2229(), 399, 27, 756), strM5875));
        }
        return C0025.m2158(C0032.m3232(strM936, C0038.m4022(m2229(), 426, 7, 872)), new AlgorithmIdentifier(strM4315, C0068.m5648()));
    }
}
