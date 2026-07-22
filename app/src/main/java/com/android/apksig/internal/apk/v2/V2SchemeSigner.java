package com.android.apksig.internal.apk.v2;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V2SchemeSigner {
    public static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f68short = {3176, 3115, 3111, 3110, 3132, 3117, 3110, 3132, 3176, 3116, 3105, 3119, 3117, 3131, 3132, 3176, 3118, 3111, 3130, 3176, 3105, 3183, 3182, 3189, 3105, 3170, 3182, 3180, 3185, 3188, 3189, 3172, 3173, 2702, 2729, 2721, 2724, 2733, 2732, 2792, 2748, 2727, 2792, 2733, 2726, 2731, 2727, 2732, 2733, 2792, 2731, 2733, 2746, 2748, 2721, 2734, 2721, 2731, 2729, 2748, 2733, 2747, 1894, 1863, 1800, 1867, 1869, 1882, 1884, 1857, 1870, 1857, 1867, 1865, 1884, 1869, 1883, 1800, 1867, 1863, 1862, 1870, 1857, 1871, 1885, 1882, 1869, 1868, 1800, 1870, 1863, 1882, 1800, 1883, 1857, 1871, 1862, 1869, 1882, 2262, 2192, 2199, 2207, 2202, 2195, 2194, 755, 713, 711, 718, 709, 722, 640, 643, 763, 746, 753, 666, 745, 723, 733, 724, 731, 718, 719, 712, 735, 666, 745, 729, 722, 735, 727, 735, 666, 716, 648, 666, 725, 724, 726, 707, 666, 713, 719, 714, 714, 725, 712, 718, 713, 666, 731, 666, 727, 731, 706, 723, 727, 719, 727, 666, 725, 732, 666, 651, 650, 662, 666, 1478, 1430, 1428, 1417, 1424, 1423, 1410, 1411, 1410, 2380, 2381, 2399, 1408, 1431, 1413, 1468, 1466, 2928, 2891, 2902, 2896, 2901, 2901, 2890, 2903, 2897, 2880, 2881, 2821, 2894, 2880, 2908, 2821, 2884, 2889, 2882, 2890, 2903, 2892, 2897, 2893, 2888, 2847, 2821};

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v2.V2SchemeSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class V2SignatureSchemeBlock {

        public static final class SignedData {
            public byte[] additionalAttributes;
            public List<byte[]> certificates;
            public List<Pair<Integer, byte[]>> digests;

            public SignedData(AnonymousClass1 anonymousClass1) {
            }
        }

        public static final class Signer {
            public byte[] publicKey;
            public List<Pair<Integer, byte[]>> signatures;
            public byte[] signedData;

            public Signer(AnonymousClass1 anonymousClass1) {
            }
        }
    }

    public static byte[] a(ApkSigningBlockUtils.SignerConfig signerConfig, Map map, boolean z) throws SignatureException {
        byte[] bArrM2445;
        if (C0025.m2084(C0066.m4892(signerConfig))) {
            throw new SignatureException(C0072.m6116(m1137(), 62, 37, 1832));
        }
        byte[] bArrM3975 = C0038.m3975(C0075.m6845((X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0)));
        V2SignatureSchemeBlock.SignedData signedData = new V2SignatureSchemeBlock.SignedData(null);
        try {
            signedData.certificates = C0023.m1918(C0066.m4892(signerConfig));
            ArrayList arrayList = new ArrayList(C0034.m3427(C0064.m4591(signerConfig)));
            Iterator itM4732 = C0065.m4732(C0064.m4591(signerConfig));
            while (C0036.m3657(itM4732)) {
                SignatureAlgorithm signatureAlgorithm = (SignatureAlgorithm) C0071.m6012(itM4732);
                ContentDigestAlgorithm contentDigestAlgorithmM2948 = C0030.m2948(signatureAlgorithm);
                byte[] bArr = (byte[]) C0072.m6108(map, contentDigestAlgorithmM2948);
                if (bArr == null) {
                    StringBuilder sb = new StringBuilder();
                    C0036.m3741(sb, contentDigestAlgorithmM2948);
                    C0077.m7290(sb, C0017.m936(m1137(), 0, 20, 3144));
                    C0036.m3741(sb, signatureAlgorithm);
                    C0077.m7290(sb, C0016.m625(m1137(), 20, 13, 3073));
                    throw new RuntimeException(C0068.m5536(sb));
                }
                C0017.m919(arrayList, C0025.m2158(C0021.m1548(C0078.m7437(signatureAlgorithm)), bArr));
            }
            signedData.digests = arrayList;
            if (z) {
                ByteBuffer byteBufferM3516 = C0035.m3516(12);
                C0064.m4604(byteBufferM3516, C0072.m6217());
                C0038.m4018(byteBufferM3516, 8);
                C0038.m4018(byteBufferM3516, V2SchemeConstants.STRIPPING_PROTECTION_ATTR_ID);
                C0038.m4018(byteBufferM3516, 3);
                bArrM2445 = C0027.m2445(byteBufferM3516);
            } else {
                bArrM2445 = new byte[0];
            }
            signedData.additionalAttributes = bArrM2445;
            V2SignatureSchemeBlock.Signer signer = new V2SignatureSchemeBlock.Signer(null);
            signer.signedData = C0066.m4830(new byte[][]{C0023.m1880(m1135(signedData)), C0032.m3223(m1138(signedData)), m1136(signedData), new byte[0]});
            signer.publicKey = bArrM3975;
            signer.signatures = new ArrayList();
            List<Pair<Integer, byte[]>> listM5550 = C0068.m5550(signerConfig, m1139(signer));
            signer.signatures = listM5550;
            return C0066.m4830(new byte[][]{m1139(signer), C0023.m1880(listM5550), m1140(signer)});
        } catch (CertificateEncodingException e) {
            throw new SignatureException(C0027.m2404(m1137(), 33, 29, 2760), e);
        }
    }

    public static ApkSigningBlockUtils.SigningSchemeBlockAndDigests generateApkSignatureSchemeV2Block(RunnablesExecutor runnablesExecutor, DataSource dataSource, DataSource dataSource2, DataSource dataSource3, List<ApkSigningBlockUtils.SignerConfig> list, boolean z) {
        return C0020.m1392(runnablesExecutor, dataSource, dataSource2, dataSource3, list, z, null);
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۤ, reason: not valid java name and contains not printable characters */
    public static List m1135(Object obj) {
        if (C0019.m1311() == 0) {
            return ((V2SignatureSchemeBlock.SignedData) obj).digests;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m1136(Object obj) {
        if (C0036.m3653() < 0) {
            return ((V2SignatureSchemeBlock.SignedData) obj).additionalAttributes;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1137() {
        if (C0072.m6216() >= 0) {
            return f68short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۧ, reason: not valid java name and contains not printable characters */
    public static List m1138(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((V2SignatureSchemeBlock.SignedData) obj).certificates;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۦ, reason: contains not printable characters */
    public static byte[] m1139(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((V2SignatureSchemeBlock.Signer) obj).signedData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1140(Object obj) {
        if (C0017.m846() > 0) {
            return ((V2SignatureSchemeBlock.Signer) obj).publicKey;
        }
        return null;
    }

    public static ApkSigningBlockUtils.SigningSchemeBlockAndDigests generateApkSignatureSchemeV2Block(RunnablesExecutor runnablesExecutor, DataSource dataSource, DataSource dataSource2, DataSource dataSource3, List<ApkSigningBlockUtils.SignerConfig> list, boolean z, List<byte[]> list2) throws SignatureException, InvalidKeyException {
        Pair pairM7347 = C0078.m7347(runnablesExecutor, dataSource, dataSource2, dataSource3, list);
        List list3 = (List) C0111.m13157(pairM7347);
        Map map = (Map) C0037.m3781(pairM7347);
        String strM1904 = C0023.m1904(m1137(), 99, 7, 2294);
        String strM4022 = C0038.m4022(m1137(), 106, 8, 672);
        if (C0034.m3427(list3) > 10) {
            StringBuilder sb = new StringBuilder(C0069.m5807(m1137(), 114, 55, 698));
            C0021.m1551(sb, C0034.m3427(list3));
            C0077.m7290(sb, C0064.m4545(m1137(), 169, 9, 1510));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        ArrayList arrayList = new ArrayList(C0034.m3427(list3));
        if (list2 != null && C0034.m3427(list2) > 0) {
            C0067.m5504(arrayList, list2);
        }
        Iterator itM4732 = C0065.m4732(list3);
        int i = 0;
        while (C0036.m3657(itM4732)) {
            i++;
            try {
                C0017.m919(arrayList, C0074.m6573((ApkSigningBlockUtils.SignerConfig) C0071.m6012(itM4732), map, z));
            } catch (InvalidKeyException e) {
                throw new InvalidKeyException(C0025.m2086(strM4022, i, strM1904), e);
            } catch (SignatureException e2) {
                throw new SignatureException(C0025.m2086(strM4022, i, strM1904), e2);
            }
        }
        return new ApkSigningBlockUtils.SigningSchemeBlockAndDigests(C0025.m2158(C0066.m4830(new byte[][]{C0032.m3223(arrayList)}), C0021.m1548(1896449818)), (Map) C0037.m3781(pairM7347));
    }

    public static List<SignatureAlgorithm> getSuggestedSignatureAlgorithms(PublicKey publicKey, int i, boolean z, boolean z2) throws InvalidKeyException {
        SignatureAlgorithm signatureAlgorithmM3438;
        String strM5875 = C0070.m5875(publicKey);
        if (C0025.m2111(C0039.m4066(m1137(), 178, 3, 2334), strM5875)) {
            if (C0017.m876(C0022.m1671((RSAKey) publicKey)) <= 3072) {
                ArrayList arrayList = new ArrayList();
                C0017.m919(arrayList, C0067.m5414());
                if (z) {
                    C0017.m919(arrayList, C0032.m3177());
                }
                return arrayList;
            }
            return C0111.m13086(C0069.m5701());
        }
        if (C0025.m2111(C0030.m2840(m1137(), 181, 3, 1476), strM5875)) {
            ArrayList arrayList2 = new ArrayList();
            if (z2) {
                signatureAlgorithmM3438 = C0034.m3410();
            } else {
                signatureAlgorithmM3438 = C0034.m3438();
            }
            C0017.m919(arrayList2, signatureAlgorithmM3438);
            if (z) {
                C0017.m919(arrayList2, C0029.m2818());
            }
            return arrayList2;
        }
        if (C0025.m2111(C0076.m6902(m1137(), 184, 2, 1529), strM5875)) {
            if (C0017.m876(C0068.m5609(C0036.m3693((ECKey) publicKey))) <= 256) {
                ArrayList arrayList3 = new ArrayList();
                C0017.m919(arrayList3, C0029.m2693());
                if (z) {
                    C0017.m919(arrayList3, C0023.m1828());
                }
                return arrayList3;
            }
            return C0111.m13086(C0022.m1722());
        }
        throw new InvalidKeyException(C0032.m3116(C0026.m2321(m1137(), 186, 27, 2853), strM5875));
    }
}
