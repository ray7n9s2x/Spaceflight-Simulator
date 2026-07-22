package com.android.apksig.internal.apk.stamp;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class SourceStampCertificateLineage {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f51short = {1994, 1949, 1922, 1935, 1924, 1994, 1946, 1931, 1944, 1945, 1923, 1924, 1933, 1994, 1977, 1925, 1951, 1944, 1929, 1935, 1977, 1950, 1931, 1927, 1946, 1961, 1935, 1944, 1950, 1923, 1932, 1923, 1929, 1931, 1950, 1935, 1958, 1923, 1924, 1935, 1931, 1933, 1935, 1994, 1925, 1928, 1920, 1935, 1929, 1950, 1737, 1727, 1700, 1697, 1704, 1266, 1189, 1210, 1207, 1212, 1266, 1188, 1207, 1184, 1211, 1204, 1195, 1211, 1212, 1205, 1266, 1153, 1213, 1191, 1184, 1201, 1207, 1153, 1190, 1203, 1215, 1186, 1169, 1207, 1184, 1190, 1211, 1204, 1211, 1201, 1203, 1190, 1207, 1182, 1211, 1212, 1207, 1203, 1205, 1207, 1266, 1213, 1200, 1208, 1207, 1201, 1190, 470, 493, 482, 481, 495, 486, 419, 503, 492, 419, 501, 486, 497, 490, 485, 506, 419, 496, 490, 484, 493, 482, 503, 502, 497, 486, 419, 492, 485, 419, 480, 486, 497, 503, 490, 485, 490, 480, 482, 503, 486, 419, 416, 1078, 1123, 1125, 1151, 1144, 1137, 1078, 872, 850, 860, 853, 850, 853, 860, 795, 858, 855, 860, 852, 841, 850, 847, 851, 854, 795, 882, 895, 795, 854, 850, 840, 854, 858, 847, 856, 851, 795, 861, 852, 841, 795, 856, 862, 841, 847, 850, 861, 850, 856, 858, 847, 862, 795, 792, 2645, 2686, 2675, 2687, 2661, 2686, 2660, 2677, 2658, 2677, 2676, 2608, 2676, 2661, 2656, 2684, 2681, 2675, 2673, 2660, 2677, 2608, 2677, 2686, 2660, 2658, 2681, 2677, 2659, 2608, 2681, 2686, 2608, 2627, 2681, 2679, 2686, 2681, 2686, 2679, 2643, 2677, 2658, 2660, 2681, 2678, 2681, 2675, 2673, 2660, 2677, 2652, 2681, 2686, 2677, 2673, 2679, 2677, 2608, 2673, 2660, 2608, 2675, 2677, 2658, 2660, 2681, 2678, 2681, 2675, 2673, 2660, 2677, 2608, 2611, 561, 575, 575, 606, 627, 627, 575, 620, 630, 632, 625, 630, 625, 632, 575, 636, 634, 621, 619, 630, 633, 630, 636, 638, 619, 634, 620, 575, 620, 631, 624, 618, 627, 635, 575, 637, 634, 575, 618, 625, 630, 622, 618, 634, 590, 613, 616, 612, 623, 622, 623, 555, 600, 610, 620, 613, 610, 613, 620, 584, 622, 633, 639, 610, 621, 610, 616, 618, 639, 622, 583, 610, 613, 622, 618, 620, 622, 555, 611, 618, 632, 555, 618, 555, 637, 622, 633, 632, 610, 612, 613, 555, 623, 610, 621, 621, 622, 633, 622, 613, 639, 555, 639, 611, 618, 613, 555, 618, 613, 626, 555, 612, 621, 555, 636, 611, 610, 616, 611, 555, 636, 622, 555, 618, 633, 622, 555, 618, 636, 618, 633, 622, 2552, 2527, 2519, 2514, 2523, 2522, 2462, 2506, 2513, 2462, 2522, 2523, 2525, 2513, 2522, 2523, 2462, 2525, 2523, 2508, 2506, 2519, 2520, 2519, 2525, 2527, 2506, 2523, 2462, 2461, 313, 286, 278, 275, 282, 283, 351, 267, 272, 351, 265, 282, 269, 278, 281, 262, 351, 268, 278, 280, 273, 286, 267, 266, 269, 282, 351, 272, 265, 282, 269, 351, 268, 278, 280, 273, 282, 283, 351, 283, 286, 267, 286, 351, 281, 272, 269, 351, 284, 282, 269, 267, 278, 281, 278, 284, 286, 267, 282, 351, 348, 3198, 3161, 3153, 3156, 3165, 3164, 3096, 3148, 3159, 3096, 3144, 3161, 3146, 3147, 3165, 3096, 3179, 3159, 3149, 3146, 3163, 3165, 3179, 3148, 3161, 3157, 3144, 3195, 3165, 3146, 3148, 3153, 3166, 3153, 3163, 3161, 3148, 3165, 3188, 3153, 3158, 3165, 3161, 3167, 3165, 3096, 3159, 3162, 3154, 3165, 3163, 3148, 792, 831, 823, 818, 827, 826, 894, 810, 817, 894, 817, 828, 810, 831, 823, 816, 894, 774, 880, 875, 878, 871, 894, 797, 827, 812, 810, 823, 824, 823, 829, 831, 810, 827, 792, 831, 829, 810, 817, 812, 807};

    public static class SigningCertificateNode {
        public int flags;
        public final SignatureAlgorithm parentSigAlgorithm;
        public SignatureAlgorithm sigAlgorithm;
        public final byte[] signature;
        public final X509Certificate signingCert;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SigningCertificateNode)) {
                return false;
            }
            SigningCertificateNode signingCertificateNode = (SigningCertificateNode) obj;
            return C0023.m1865(C0035.m3586(this), C0035.m3586(signingCertificateNode)) && C0074.m6493(this) == C0074.m6493(signingCertificateNode) && C0071.m6054(this) == C0071.m6054(signingCertificateNode) && C0073.m6306(C0074.m6472(this), C0074.m6472(signingCertificateNode)) && C0069.m5813(this) == C0069.m5813(signingCertificateNode);
        }

        public int hashCode() {
            X509Certificate x509CertificateM3586 = C0035.m3586(this);
            int iM3818 = ((x509CertificateM3586 == null ? 0 : C0037.m3818(x509CertificateM3586)) + 31) * 31;
            SignatureAlgorithm signatureAlgorithmM6493 = C0074.m6493(this);
            int iM38182 = (iM3818 + (signatureAlgorithmM6493 == null ? 0 : C0037.m3818(signatureAlgorithmM6493))) * 31;
            SignatureAlgorithm signatureAlgorithmM6054 = C0071.m6054(this);
            return ((C0027.m2466(C0074.m6472(this)) + ((iM38182 + (signatureAlgorithmM6054 != null ? C0037.m3818(signatureAlgorithmM6054) : 0)) * 31)) * 31) + C0069.m5813(this);
        }

        public SigningCertificateNode(X509Certificate x509Certificate, SignatureAlgorithm signatureAlgorithm, SignatureAlgorithm signatureAlgorithm2, byte[] bArr, int i) {
            this.signingCert = x509Certificate;
            this.parentSigAlgorithm = signatureAlgorithm;
            this.sigAlgorithm = signatureAlgorithm2;
            this.signature = bArr;
            this.flags = i;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m800() {
        if (C0074.m6454() < 0) {
            return f51short;
        }
        return null;
    }

    public static List<SigningCertificateNode> readSigningCertificateLineage(ByteBuffer byteBuffer) throws IOException {
        String str;
        Throwable th;
        String str2;
        String str3;
        String strM6116 = C0072.m6116(m800(), 0, 50, 2026);
        ArrayList arrayList = new ArrayList();
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = null;
        if (byteBuffer == null || !C0111.m13127(byteBuffer)) {
            return null;
        }
        C0074.m6567(byteBuffer);
        try {
            CertificateFactory certificateFactoryM6461 = C0074.m6461(C0111.m13097(m800(), 50, 5, 1681));
            int i = 0;
            try {
                try {
                    try {
                        try {
                            if (C0064.m4566(byteBuffer) != 1) {
                                throw new IllegalArgumentException(C0037.m3829(m800(), 323, 88, 523));
                            }
                            try {
                                HashSet hashSet = new HashSet();
                                int i2 = 0;
                                while (C0111.m13127(byteBuffer)) {
                                    i++;
                                    ByteBuffer byteBufferM13168 = C0111.m13168(byteBuffer);
                                    ByteBuffer byteBufferM131682 = C0111.m13168(byteBufferM13168);
                                    int iM4566 = C0064.m4566(byteBufferM13168);
                                    int iM45662 = C0064.m4566(byteBufferM13168);
                                    SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(i2);
                                    byte[] bArrM2313 = C0026.m2313(byteBufferM13168);
                                    String strM61162 = C0072.m6116(m800(), 55, 52, 1234);
                                    if (guaranteedEncodedFormX509Certificate != null) {
                                        String str4 = (String) C0111.m13157(C0024.m2023(signatureAlgorithmM4321));
                                        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) C0037.m3781(C0024.m2023(signatureAlgorithmM4321));
                                        PublicKey publicKeyM13180 = C0111.m13180(guaranteedEncodedFormX509Certificate);
                                        str3 = strM6116;
                                        Signature signatureM2131 = C0025.m2131(str4);
                                        C0072.m6123(signatureM2131, publicKeyM13180);
                                        if (algorithmParameterSpec != null) {
                                            C0070.m5856(signatureM2131, algorithmParameterSpec);
                                        }
                                        C0078.m7463(signatureM2131, byteBufferM131682);
                                        if (!C0025.m2194(signatureM2131, bArrM2313)) {
                                            StringBuilder sb = new StringBuilder();
                                            C0077.m7290(sb, C0035.m3603(m800(), 107, 43, 387));
                                            C0021.m1551(sb, i);
                                            C0077.m7290(sb, C0070.m5942(m800(), 150, 7, 1046));
                                            C0077.m7290(sb, str4);
                                            C0077.m7290(sb, strM61162);
                                            throw new SecurityException(C0068.m5536(sb));
                                        }
                                    } else {
                                        str3 = strM6116;
                                    }
                                    C0038.m3987(byteBufferM131682);
                                    byte[] bArrM23132 = C0026.m2313(byteBufferM131682);
                                    int iM45663 = C0064.m4566(byteBufferM131682);
                                    if (guaranteedEncodedFormX509Certificate != null && i2 != iM45663) {
                                        StringBuilder sb2 = new StringBuilder();
                                        C0077.m7290(sb2, C0028.m2609(m800(), 157, 47, 827));
                                        C0036.m3741(sb2, byteBufferM13168);
                                        C0077.m7290(sb2, strM61162);
                                        throw new SecurityException(C0068.m5536(sb2));
                                    }
                                    GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate2 = new GuaranteedEncodedFormX509Certificate((X509Certificate) C0017.m835(certificateFactoryM6461, new ByteArrayInputStream(bArrM23132)), bArrM23132);
                                    if (C0064.m4525(hashSet, guaranteedEncodedFormX509Certificate2)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        C0077.m7290(sb3, C0070.m5942(m800(), 204, 75, 2576));
                                        C0021.m1551(sb3, i);
                                        C0077.m7290(sb3, C0071.m5991(m800(), 279, 44, 543));
                                        throw new SecurityException(C0068.m5536(sb3));
                                    }
                                    C0077.m7232(hashSet, guaranteedEncodedFormX509Certificate2);
                                    C0017.m919(arrayList, new SigningCertificateNode(guaranteedEncodedFormX509Certificate2, C0063.m4321(iM45663), C0063.m4321(iM45662), bArrM2313, iM4566));
                                    guaranteedEncodedFormX509Certificate = guaranteedEncodedFormX509Certificate2;
                                    i2 = iM45662;
                                    strM6116 = str3;
                                }
                                return arrayList;
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                String str5 = strM6116;
                                th = e;
                                str = str5;
                                throw new SecurityException(C0025.m2086(C0032.m3209(m800(), 441, 61, 383), i, str), th);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                String str52 = strM6116;
                                th = e;
                                str = str52;
                                throw new SecurityException(C0025.m2086(C0032.m3209(m800(), 441, 61, 383), i, str), th);
                            } catch (NoSuchAlgorithmException e3) {
                                e = e3;
                                String str522 = strM6116;
                                th = e;
                                str = str522;
                                throw new SecurityException(C0025.m2086(C0032.m3209(m800(), 441, 61, 383), i, str), th);
                            } catch (SignatureException e4) {
                                e = e4;
                                String str5222 = strM6116;
                                th = e;
                                str = str5222;
                                throw new SecurityException(C0025.m2086(C0032.m3209(m800(), 441, 61, 383), i, str), th);
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
                        str = strM6116;
                        th = e10;
                    }
                } catch (ApkFormatException e11) {
                    e = e11;
                    throw new IOException(C0067.m5418(m800(), 502, 52, 3128), e);
                } catch (BufferUnderflowException e12) {
                    e = e12;
                    throw new IOException(C0067.m5418(m800(), 502, 52, 3128), e);
                }
            } catch (CertificateException e13) {
                e = e13;
                str2 = strM6116;
            }
            throw new SecurityException(C0025.m2086(C0074.m6452(m800(), 411, 30, 2494), i, str2), e);
        } catch (CertificateException e14) {
            throw new IllegalStateException(C0067.m5418(m800(), 554, 41, 862), e14);
        }
    }
}
