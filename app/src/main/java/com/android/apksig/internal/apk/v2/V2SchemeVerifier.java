package com.android.apksig.internal.apk.v2;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
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
import java.io.PrintStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V2SchemeVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f69short = {798, 828, 808, 826, 821, 809, 893, 828, 819, 893, 824, 805, 830, 824, 813, 809, 820, 818, 819, 893, 824, 819, 830, 818, 825, 820, 819, 826, 893, 809, 821, 824, 893, 813, 808, 831, 817, 820, 830, 893, 822, 824, 804, 871, 893, 2862, 2904, 2883, 2886, 2895, 1911, 1872, 1880, 1885, 1876, 1877, 1809, 1861, 1886, 1809, 1886, 1875, 1861, 1872, 1880, 1887, 1809, 1897, 1823, 1796, 1793, 1800, 1809, 1906, 1876, 1859, 1861, 1880, 1879, 1880, 1874, 1872, 1861, 1876, 1911, 1872, 1874, 1861, 1886, 1859, 1864};

    public static void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, ApkSigningBlockUtils.Result.SignerInfo signerInfo, Set set, Map map, Set set2, int i, int i2) {
        byte[] bArrM2096;
        ByteBuffer byteBufferM5463 = C0067.m5463(byteBuffer);
        byte[] bArr = new byte[C0071.m5984(byteBufferM5463)];
        C0029.m2812(byteBufferM5463, bArr);
        C0020.m1437(byteBufferM5463);
        signerInfo.signedData = bArr;
        ByteBuffer byteBufferM54632 = C0067.m5463(byteBuffer);
        byte[] bArrM6473 = C0074.m6473(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        int i3 = 0;
        while (C0111.m13127(byteBufferM54632)) {
            i3++;
            try {
                ByteBuffer byteBufferM54633 = C0067.m5463(byteBufferM54632);
                int iM4566 = C0064.m4566(byteBufferM54633);
                byte[] bArrM64732 = C0074.m6473(byteBufferM54633);
                C0077.m7162(C0073.m6301(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.Signature(iM4566, bArrM64732));
                SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(iM4566);
                if (signatureAlgorithmM4321 == null) {
                    C0031.m2979(signerInfo, C0077.m7160(), new Object[]{C0021.m1548(iM4566)});
                } else {
                    C0017.m919(arrayList, new ApkSigningBlockUtils.SupportedSignature(signatureAlgorithmM4321, bArrM64732));
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                C0038.m3966(signerInfo, C0027.m2464(), new Object[]{C0021.m1548(i3)});
                return;
            }
        }
        if (C0025.m2084(C0073.m6301(signerInfo))) {
            C0038.m3966(signerInfo, C0035.m3637(), new Object[0]);
            return;
        }
        try {
            Iterator itM4732 = C0065.m4732(C0025.m2150(arrayList, i, i2));
            while (C0036.m3657(itM4732)) {
                ApkSigningBlockUtils.SupportedSignature supportedSignature = (ApkSigningBlockUtils.SupportedSignature) C0071.m6012(itM4732);
                SignatureAlgorithm signatureAlgorithmM3131 = C0032.m3131(supportedSignature);
                String str = (String) C0111.m13157(C0024.m2023(signatureAlgorithmM3131));
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) C0037.m3781(C0024.m2023(signatureAlgorithmM3131));
                try {
                    PublicKey publicKeyM7387 = C0078.m7387(C0111.m13063(C0063.m4402(signatureAlgorithmM3131)), new X509EncodedKeySpec(bArrM6473));
                    try {
                        Signature signatureM2131 = C0025.m2131(str);
                        C0072.m6123(signatureM2131, publicKeyM7387);
                        if (algorithmParameterSpec != null) {
                            C0070.m5856(signatureM2131, algorithmParameterSpec);
                        }
                        C0037.m3886(byteBufferM5463, 0);
                        C0078.m7463(signatureM2131, byteBufferM5463);
                        byte[] bArrM2855 = C0030.m2855(supportedSignature);
                        if (!C0025.m2194(signatureM2131, bArrM2855)) {
                            C0038.m3966(signerInfo, C0036.m3644(), new Object[]{signatureAlgorithmM3131});
                            return;
                        } else {
                            C0035.m3624(C0066.m4826(signerInfo), signatureAlgorithmM3131, bArrM2855);
                            C0026.m2346(set, C0030.m2948(signatureAlgorithmM3131));
                        }
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        C0038.m3966(signerInfo, C0070.m5877(), new Object[]{signatureAlgorithmM3131, e});
                        return;
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        C0038.m3966(signerInfo, C0070.m5877(), new Object[]{signatureAlgorithmM3131, e});
                        return;
                    } catch (SignatureException e3) {
                        e = e3;
                        C0038.m3966(signerInfo, C0070.m5877(), new Object[]{signatureAlgorithmM3131, e});
                        return;
                    }
                } catch (Exception e4) {
                    C0038.m3966(signerInfo, C0078.m7426(), new Object[]{e4});
                    return;
                }
            }
            C0037.m3886(byteBufferM5463, 0);
            ByteBuffer byteBufferM54634 = C0067.m5463(byteBufferM5463);
            ByteBuffer byteBufferM54635 = C0067.m5463(byteBufferM5463);
            ByteBuffer byteBufferM54636 = C0067.m5463(byteBufferM5463);
            int i4 = -1;
            while (C0111.m13127(byteBufferM54635)) {
                int i5 = i4 + 1;
                byte[] bArrM64733 = C0074.m6473(byteBufferM54635);
                try {
                    C0077.m7162(C0039.m4117(signerInfo), new GuaranteedEncodedFormX509Certificate(C0016.m726(bArrM64733, certificateFactory), bArrM64733));
                    i4 = i5;
                } catch (CertificateException e5) {
                    C0038.m3966(signerInfo, C0029.m2805(), new Object[]{C0021.m1548(i5), C0021.m1548(i4 + 2), e5});
                    return;
                }
            }
            if (C0025.m2084(C0039.m4117(signerInfo))) {
                C0038.m3966(signerInfo, C0017.m855(), new Object[0]);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) C0071.m6078(C0039.m4117(signerInfo), 0);
            try {
                bArrM2096 = C0038.m3975(C0075.m6845(x509Certificate));
            } catch (InvalidKeyException e6) {
                PrintStream printStreamM3219 = C0032.m3219();
                StringBuilder sb = new StringBuilder(C0068.m5544(m1141(), 0, 45, 861));
                C0036.m3741(sb, e6);
                C0065.m4767(printStreamM3219, C0068.m5536(sb));
                C0033.m3347(e6);
                bArrM2096 = C0025.m2096(C0075.m6845(x509Certificate));
            }
            if (!C0073.m6306(bArrM6473, bArrM2096)) {
                C0038.m3966(signerInfo, C0077.m7156(), new Object[]{C0027.m2472(bArrM2096), C0027.m2472(bArrM6473)});
                return;
            }
            int i6 = 0;
            while (C0111.m13127(byteBufferM54634)) {
                i6++;
                try {
                    ByteBuffer byteBufferM54637 = C0067.m5463(byteBufferM54634);
                    C0077.m7162(C0023.m1795(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.ContentDigest(C0064.m4566(byteBufferM54637), C0074.m6473(byteBufferM54637)));
                } catch (ApkFormatException | BufferUnderflowException unused2) {
                    C0038.m3966(signerInfo, C0075.m6787(), new Object[]{C0021.m1548(i6)});
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList(C0034.m3427(C0073.m6301(signerInfo)));
            Iterator itM47322 = C0065.m4732(C0073.m6301(signerInfo));
            while (C0036.m3657(itM47322)) {
                C0017.m919(arrayList2, C0021.m1548(C0071.m6048((ApkSigningBlockUtils.Result.SignerInfo.Signature) C0071.m6012(itM47322))));
            }
            ArrayList arrayList3 = new ArrayList(C0034.m3427(C0023.m1795(signerInfo)));
            Iterator itM47323 = C0065.m4732(C0023.m1795(signerInfo));
            while (C0036.m3657(itM47323)) {
                C0017.m919(arrayList3, C0021.m1548(C0026.m2274((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6012(itM47323))));
            }
            if (!C0025.m2124(arrayList2, arrayList3)) {
                C0038.m3966(signerInfo, C0037.m3907(), new Object[]{arrayList2, arrayList3});
                return;
            }
            Set setM2937 = C0030.m2937(map);
            HashSet hashSet = new HashSet(1);
            int i7 = 0;
            while (C0111.m13127(byteBufferM54636)) {
                i7++;
                try {
                    ByteBuffer byteBufferM54638 = C0067.m5463(byteBufferM54636);
                    int iM45662 = C0064.m4566(byteBufferM54638);
                    byte[] bArrM6029 = C0071.m6029(byteBufferM54638);
                    C0077.m7162(C0031.m2988(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute(iM45662, bArrM6029));
                    if (iM45662 != -1091571699) {
                        C0031.m2979(signerInfo, C0030.m2898(), new Object[]{C0021.m1548(iM45662)});
                    } else {
                        int iM45663 = C0064.m4566(C0064.m4604(C0020.m1393(bArrM6029), C0072.m6217()));
                        if (C0063.m4345(setM2937, C0021.m1548(iM45663))) {
                            C0077.m7232(hashSet, C0021.m1548(iM45663));
                        } else {
                            C0031.m2979(signerInfo, C0027.m2509(), new Object[]{C0021.m1548(C0069.m5703(signerInfo)), C0021.m1548(iM45663)});
                        }
                    }
                } catch (ApkFormatException | BufferUnderflowException unused3) {
                    C0038.m3966(signerInfo, C0067.m5483(), new Object[]{C0021.m1548(i7)});
                    return;
                }
            }
            Iterator itM2555 = C0028.m2555(hashSet);
            while (C0036.m3657(itM2555)) {
                Integer num = (Integer) C0071.m6012(itM2555);
                C0030.m2951(num);
                if (!C0063.m4345(set2, num)) {
                    C0038.m3966(signerInfo, C0039.m4099(), new Object[]{C0021.m1548(C0069.m5703(signerInfo)), (String) C0072.m6108(map, num)});
                }
            }
        } catch (ApkSigningBlockUtils.NoSupportedSignaturesException e7) {
            C0038.m3966(signerInfo, C0028.m2560(), new Object[]{e7});
        }
    }

    public static ApkSigningBlockUtils.Result verify(RunnablesExecutor runnablesExecutor, DataSource dataSource, ApkUtils.ZipSections zipSections, Map<Integer, String> map, Set<Integer> set, int i, int i2) {
        ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(2);
        SignatureInfo signatureInfoM1188 = C0019.m1188(dataSource, zipSections, 1896449818, result);
        DataSource dataSourceM6182 = C0072.m6182(dataSource, 0L, C0027.m2479(signatureInfoM1188));
        long jM3263 = C0033.m3263(signatureInfoM1188);
        DataSource dataSourceM61822 = C0072.m6182(dataSource, jM3263, C0029.m2810(signatureInfoM1188) - jM3263);
        ByteBuffer byteBufferM5458 = C0067.m5458(signatureInfoM1188);
        ByteBuffer byteBufferM5410 = C0067.m5410(signatureInfoM1188);
        HashSet hashSet = new HashSet(1);
        C0075.m6811(byteBufferM5410, hashSet, map, set, i, i2, result);
        if (!C0077.m7227(result)) {
            C0031.m3005(runnablesExecutor, dataSourceM6182, dataSourceM61822, byteBufferM5458, hashSet, result);
            if (!C0077.m7227(result)) {
                result.verified = true;
            }
        }
        return result;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1141() {
        if (C0070.m5903() > 0) {
            return f69short;
        }
        return null;
    }

    public static void parseSigners(ByteBuffer byteBuffer, Set<ContentDigestAlgorithm> set, Map<Integer, String> map, Set<Integer> set2, int i, int i2, ApkSigningBlockUtils.Result result) {
        try {
            ByteBuffer byteBufferM5463 = C0067.m5463(byteBuffer);
            if (!C0111.m13127(byteBufferM5463)) {
                C0024.m2064(result, C0077.m7215(), new Object[0]);
                return;
            }
            try {
                CertificateFactory certificateFactoryM6461 = C0074.m6461(C0031.m3047(m1141(), 45, 5, 2934));
                int i3 = 0;
                while (C0111.m13127(byteBufferM5463)) {
                    int i4 = i3 + 1;
                    ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
                    signerInfo.index = i3;
                    C0077.m7162(C0021.m1543(result), signerInfo);
                    try {
                        C0069.m5775(C0067.m5463(byteBufferM5463), certificateFactoryM6461, signerInfo, set, map, set2, i, i2);
                        i3 = i4;
                    } catch (ApkFormatException | BufferUnderflowException unused) {
                        C0038.m3966(signerInfo, C0077.m7218(), new Object[0]);
                        return;
                    }
                }
                if (i3 > 10) {
                    C0024.m2064(result, C0063.m4342(), new Object[]{C0021.m1548(10), C0021.m1548(i3)});
                }
            } catch (CertificateException e) {
                throw new RuntimeException(C0035.m3603(m1141(), 50, 41, 1841), e);
            }
        } catch (ApkFormatException unused2) {
            C0024.m2064(result, C0034.m3406(), new Object[0]);
        }
    }
}
