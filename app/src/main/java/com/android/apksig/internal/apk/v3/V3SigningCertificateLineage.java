package com.android.apksig.internal.apk.v3;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.zip.C0029;
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
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import j$.util.Objects;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class V3SigningCertificateLineage {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f73short = {2734, 2697, 2689, 2692, 2701, 2700, 2760, 2716, 2695, 2760, 2701, 2694, 2699, 2695, 2700, 2701, 2760, 2750, 2779, 2747, 2689, 2703, 2694, 2689, 2694, 2703, 2731, 2701, 2714, 2716, 2689, 2702, 2689, 2699, 2697, 2716, 2701, 2724, 2689, 2694, 2701, 2697, 2703, 2701, 2760, 2699, 2701, 2714, 2716, 2689, 2702, 2689, 2699, 2697, 2716, 2701, 1931, 2012, 1987, 1998, 1989, 1931, 2011, 1994, 2009, 2008, 1986, 1989, 1996, 1931, 2045, 1944, 2040, 1986, 1996, 1989, 1986, 1989, 1996, 2024, 1998, 2009, 2015, 1986, 1997, 1986, 1992, 1994, 2015, 1998, 2023, 1986, 1989, 1998, 1994, 1996, 1998, 1931, 1988, 1993, 1985, 1998, 1992, 2015, 3203, 3284, 3275, 3270, 3277, 3203, 3285, 3270, 3281, 3274, 3269, 3290, 3274, 3277, 3268, 3203, 3317, 3216, 3312, 3274, 3268, 3277, 3274, 3277, 3268, 3296, 3270, 3281, 3287, 3274, 3269, 3274, 3264, 3266, 3287, 3270, 3311, 3274, 3277, 3270, 3266, 3268, 3270, 3203, 3276, 3265, 3273, 3270, 3264, 3287, 1029, 1086, 1073, 1074, 1084, 1077, 1136, 1060, 1087, 1136, 1062, 1077, 1058, 1081, 1078, 1065, 1136, 1059, 1081, 1079, 1086, 1073, 1060, 1061, 1058, 1077, 1136, 1087, 1078, 1136, 1075, 1077, 1058, 1060, 1081, 1078, 1081, 1075, 1073, 1060, 1077, 1136, 1139, 2056, 2141, 2139, 2113, 2118, 2127, 2056, 2575, 2613, 2619, 2610, 2613, 2610, 2619, 2684, 2621, 2608, 2619, 2611, 2606, 2613, 2600, 2612, 2609, 2684, 2581, 2584, 2684, 2609, 2613, 2607, 2609, 2621, 2600, 2623, 2612, 2684, 2618, 2611, 2606, 2684, 2623, 2617, 2606, 2600, 2613, 2618, 2613, 2623, 2621, 2600, 2617, 2684, 2687, 2235, 2192, 2205, 2193, 2187, 2192, 2186, 2203, 2188, 2203, 2202, 2270, 2202, 2187, 2190, 2194, 2199, 2205, 2207, 2186, 2203, 2270, 2203, 2192, 2186, 2188, 2199, 2203, 2189, 2270, 2199, 2192, 2270, 2221, 2199, 2201, 2192, 2199, 2192, 2201, 2237, 2203, 2188, 2186, 2199, 2200, 2199, 2205, 2207, 2186, 2203, 2226, 2199, 2192, 2203, 2207, 2201, 2203, 2270, 2207, 2186, 2270, 2205, 2203, 2188, 2186, 2199, 2200, 2199, 2205, 2207, 2186, 2203, 2270, 2269, 3246, 3232, 3232, 3265, 3308, 3308, 3232, 3315, 3305, 3303, 3310, 3305, 3310, 3303, 3232, 3299, 3301, 3314, 3316, 3305, 3302, 3305, 3299, 3297, 3316, 3301, 3315, 3232, 3315, 3304, 3311, 3317, 3308, 3300, 3232, 3298, 3301, 3232, 3317, 3310, 3305, 3313, 3317, 3301, 3081, 3106, 3119, 3107, 3112, 3113, 3112, 3180, 3103, 3109, 3115, 3106, 3109, 3106, 3115, 3087, 3113, 3134, 3128, 3109, 3114, 3109, 3119, 3117, 3128, 3113, 3072, 3109, 3106, 3113, 3117, 3115, 3113, 3180, 3108, 3117, 3135, 3180, 3117, 3180, 3130, 3113, 3134, 3135, 3109, 3107, 3106, 3180, 3112, 3109, 3114, 3114, 3113, 3134, 3113, 3106, 3128, 3180, 3128, 3108, 3117, 3106, 3180, 3117, 3106, 3125, 3180, 3107, 3114, 3180, 3131, 3108, 3109, 3119, 3108, 3180, 3131, 3113, 3180, 3117, 3134, 3113, 3180, 3117, 3131, 3117, 3134, 3113, 1788, 1755, 1747, 1750, 1759, 1758, 1690, 1742, 1749, 1690, 1758, 1759, 1753, 1749, 1758, 1759, 1690, 1753, 1759, 1736, 1742, 1747, 1756, 1747, 1753, 1755, 1742, 1759, 1690, 1689, 2719, 2744, 2736, 2741, 2748, 2749, 2809, 2733, 2742, 2809, 2735, 2748, 2731, 2736, 2751, 2720, 2809, 2730, 2736, 2750, 2743, 2744, 2733, 2732, 2731, 2748, 2809, 2742, 2735, 2748, 2731, 2809, 2730, 2736, 2750, 2743, 2748, 2749, 2809, 2749, 2744, 2733, 2744, 2809, 2751, 2742, 2731, 2809, 2746, 2748, 2731, 2733, 2736, 2751, 2736, 2746, 2744, 2733, 2748, 2809, 2810, 2398, 2425, 2417, 2420, 2429, 2428, 2360, 2412, 2423, 2360, 2408, 2425, 2410, 2411, 2429, 2360, 2382, 2347, 2379, 2417, 2431, 2422, 2417, 2422, 2431, 2395, 2429, 2410, 2412, 2417, 2430, 2417, 2427, 2425, 2412, 2429, 2388, 2417, 2422, 2429, 2425, 2431, 2429, 2360, 2423, 2426, 2418, 2429, 2427, 2412};

    public static class SigningCertificateNode {
        public int flags;
        public final SignatureAlgorithm parentSigAlgorithm;
        public SignatureAlgorithm sigAlgorithm;
        public final byte[] signature;
        public final X509Certificate signingCert;

        /* JADX INFO: renamed from: ۣ۟۟ۥۢ, reason: not valid java name and contains not printable characters */
        public static int m1167(Object obj) {
            if (C0073.m6356() <= 0) {
                return Objects.hash((Object[]) obj);
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SigningCertificateNode)) {
                return false;
            }
            SigningCertificateNode signingCertificateNode = (SigningCertificateNode) obj;
            return C0023.m1865(C0025.m2182(this), C0025.m2182(signingCertificateNode)) && C0071.m5998(this) == C0071.m5998(signingCertificateNode) && C0036.m3756(this) == C0036.m3756(signingCertificateNode) && C0073.m6306(C0033.m3344(this), C0033.m3344(signingCertificateNode)) && C0034.m3500(this) == C0034.m3500(signingCertificateNode);
        }

        public int hashCode() {
            return C0027.m2466(C0033.m3344(this)) + (m1167(new Object[]{C0025.m2182(this), C0071.m5998(this), C0036.m3756(this), C0021.m1548(C0034.m3500(this))}) * 31);
        }

        public SigningCertificateNode(X509Certificate x509Certificate, SignatureAlgorithm signatureAlgorithm, SignatureAlgorithm signatureAlgorithm2, byte[] bArr, int i) {
            this.signingCert = x509Certificate;
            this.parentSigAlgorithm = signatureAlgorithm;
            this.sigAlgorithm = signatureAlgorithm2;
            this.signature = bArr;
            this.flags = i;
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m1166() {
        if (C0018.m1064() > 0) {
            return f73short;
        }
        return null;
    }

    public static byte[] encodeSigningCertificateLineage(List<SigningCertificateNode> list) {
        ArrayList arrayList = new ArrayList();
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            C0017.m919(arrayList, C0075.m6782((SigningCertificateNode) C0071.m6012(itM4732)));
        }
        byte[] bArrM3223 = C0032.m3223(arrayList);
        ByteBuffer byteBufferM3516 = C0035.m3516(bArrM3223.length + 4);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0038.m4018(byteBufferM3516, 1);
        C0068.m5569(byteBufferM3516, bArrM3223);
        return C0027.m2445(byteBufferM3516);
    }

    public static byte[] encodeSigningCertificateNode(SigningCertificateNode signingCertificateNode) {
        SignatureAlgorithm signatureAlgorithmM5998 = C0071.m5998(signingCertificateNode);
        int iM7437 = signatureAlgorithmM5998 != null ? C0078.m7437(signatureAlgorithmM5998) : 0;
        SignatureAlgorithm signatureAlgorithmM3756 = C0036.m3756(signingCertificateNode);
        int iM74372 = signatureAlgorithmM3756 != null ? C0078.m7437(signatureAlgorithmM3756) : 0;
        byte[] bArrM1820 = C0023.m1820(C0025.m2182(signingCertificateNode), iM7437);
        byte[] bArrM7318 = C0078.m7318(C0033.m3344(signingCertificateNode));
        ByteBuffer byteBufferM3516 = C0035.m3516(bArrM1820.length + 8 + bArrM7318.length);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0068.m5569(byteBufferM3516, bArrM1820);
        C0038.m4018(byteBufferM3516, C0034.m3500(signingCertificateNode));
        C0038.m4018(byteBufferM3516, iM74372);
        C0068.m5569(byteBufferM3516, bArrM7318);
        return C0027.m2445(byteBufferM3516);
    }

    public static List<SigningCertificateNode> readSigningCertificateLineage(ByteBuffer byteBuffer) throws IOException {
        String str;
        Throwable th;
        String str2;
        String str3;
        String strM2404 = C0027.m2404(m1166(), 56, 48, 1963);
        ArrayList arrayList = new ArrayList();
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = null;
        if (byteBuffer == null || !C0111.m13127(byteBuffer)) {
            return null;
        }
        C0074.m6550(byteBuffer);
        int i = 0;
        try {
            try {
                try {
                    try {
                        if (C0064.m4566(byteBuffer) != 1) {
                            throw new IllegalArgumentException(C0017.m936(m1166(), 370, 88, 3148));
                        }
                        try {
                            HashSet hashSet = new HashSet();
                            int i2 = 0;
                            while (C0111.m13127(byteBuffer)) {
                                i++;
                                ByteBuffer byteBufferM5463 = C0067.m5463(byteBuffer);
                                ByteBuffer byteBufferM54632 = C0067.m5463(byteBufferM5463);
                                int iM4566 = C0064.m4566(byteBufferM5463);
                                int iM45662 = C0064.m4566(byteBufferM5463);
                                SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(i2);
                                byte[] bArrM6473 = C0074.m6473(byteBufferM5463);
                                String strM4315 = C0063.m4315(m1166(), 104, 50, 3235);
                                if (guaranteedEncodedFormX509Certificate != null) {
                                    String str4 = (String) C0111.m13157(C0024.m2023(signatureAlgorithmM4321));
                                    AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) C0037.m3781(C0024.m2023(signatureAlgorithmM4321));
                                    PublicKey publicKeyM13180 = C0111.m13180(guaranteedEncodedFormX509Certificate);
                                    str3 = strM2404;
                                    Signature signatureM2131 = C0025.m2131(str4);
                                    C0072.m6123(signatureM2131, publicKeyM13180);
                                    if (algorithmParameterSpec != null) {
                                        C0070.m5856(signatureM2131, algorithmParameterSpec);
                                    }
                                    C0078.m7463(signatureM2131, byteBufferM54632);
                                    if (!C0025.m2194(signatureM2131, bArrM6473)) {
                                        StringBuilder sb = new StringBuilder();
                                        C0077.m7290(sb, C0072.m6116(m1166(), 154, 43, 1104));
                                        C0021.m1551(sb, i);
                                        C0077.m7290(sb, C0078.m7427(m1166(), 197, 7, 2088));
                                        C0077.m7290(sb, str4);
                                        C0077.m7290(sb, strM4315);
                                        throw new SecurityException(C0068.m5536(sb));
                                    }
                                } else {
                                    str3 = strM2404;
                                }
                                C0038.m3987(byteBufferM54632);
                                byte[] bArrM64732 = C0074.m6473(byteBufferM54632);
                                int iM45663 = C0064.m4566(byteBufferM54632);
                                if (guaranteedEncodedFormX509Certificate != null && i2 != iM45663) {
                                    StringBuilder sb2 = new StringBuilder();
                                    C0077.m7290(sb2, C0020.m1443(m1166(), 204, 47, 2652));
                                    C0036.m3741(sb2, byteBufferM5463);
                                    C0077.m7290(sb2, strM4315);
                                    throw new SecurityException(C0068.m5536(sb2));
                                }
                                GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate2 = new GuaranteedEncodedFormX509Certificate(C0020.m1370(bArrM64732), bArrM64732);
                                if (C0064.m4525(hashSet, guaranteedEncodedFormX509Certificate2)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    C0077.m7290(sb3, C0077.m7205(m1166(), 251, 75, 2302));
                                    C0021.m1551(sb3, i);
                                    C0077.m7290(sb3, C0029.m2695(m1166(), 326, 44, 3200));
                                    throw new SecurityException(C0068.m5536(sb3));
                                }
                                C0077.m7232(hashSet, guaranteedEncodedFormX509Certificate2);
                                C0017.m919(arrayList, new SigningCertificateNode(guaranteedEncodedFormX509Certificate2, C0063.m4321(iM45663), C0063.m4321(iM45662), bArrM6473, iM4566));
                                guaranteedEncodedFormX509Certificate = guaranteedEncodedFormX509Certificate2;
                                i2 = iM45662;
                                strM2404 = str3;
                            }
                            return arrayList;
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            String str5 = strM2404;
                            th = e;
                            str = str5;
                            throw new SecurityException(C0025.m2086(C0036.m3678(m1166(), 488, 61, 2777), i, str), th);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            String str52 = strM2404;
                            th = e;
                            str = str52;
                            throw new SecurityException(C0025.m2086(C0036.m3678(m1166(), 488, 61, 2777), i, str), th);
                        } catch (NoSuchAlgorithmException e3) {
                            e = e3;
                            String str522 = strM2404;
                            th = e;
                            str = str522;
                            throw new SecurityException(C0025.m2086(C0036.m3678(m1166(), 488, 61, 2777), i, str), th);
                        } catch (SignatureException e4) {
                            e = e4;
                            String str5222 = strM2404;
                            th = e;
                            str = str5222;
                            throw new SecurityException(C0025.m2086(C0036.m3678(m1166(), 488, 61, 2777), i, str), th);
                        }
                    } catch (InvalidAlgorithmParameterException e5) {
                        e = e5;
                    } catch (InvalidKeyException e6) {
                        e = e6;
                    } catch (NoSuchAlgorithmException e7) {
                        e = e7;
                    } catch (SignatureException e8) {
                        e = e8;
                    } catch (CertificateException e9) {
                        e = e9;
                    }
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e10) {
                    str = strM2404;
                    th = e10;
                }
            } catch (ApkFormatException e11) {
                e = e11;
                throw new IOException(C0066.m4828(m1166(), 549, 50, 2328), e);
            } catch (BufferUnderflowException e12) {
                e = e12;
                throw new IOException(C0066.m4828(m1166(), 549, 50, 2328), e);
            }
        } catch (CertificateException e13) {
            e = e13;
            str2 = strM2404;
        }
        throw new SecurityException(C0025.m2086(C0019.m1189(m1166(), 458, 30, 1722), i, str2), e);
    }

    public static byte[] encodeSignedData(X509Certificate x509Certificate, int i) {
        try {
            byte[] bArrM7318 = C0078.m7318(C0064.m4613(x509Certificate));
            ByteBuffer byteBufferM3516 = C0035.m3516(bArrM7318.length + 4);
            C0064.m4604(byteBufferM3516, C0072.m6217());
            C0068.m5569(byteBufferM3516, bArrM7318);
            C0038.m4018(byteBufferM3516, i);
            return C0078.m7318(C0027.m2445(byteBufferM3516));
        } catch (CertificateEncodingException e) {
            throw new RuntimeException(C0072.m6116(m1166(), 0, 56, 2792), e);
        }
    }
}
