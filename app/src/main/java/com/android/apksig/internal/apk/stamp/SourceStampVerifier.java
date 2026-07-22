package com.android.apksig.internal.apk.stamp;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSupportedSignature;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.NoApkSupportedSignaturesException;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.SourceStampCertificateLineage;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
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
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
class SourceStampVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f53short = {2921, 2930, 2939, 2839, 2824, 2831, 2828, 1930, 1926};

    public static GuaranteedEncodedFormX509Certificate b(ByteBuffer byteBuffer, CertificateFactory certificateFactory, byte[] bArr, ApkSignerInfo apkSignerInfo) {
        byte[] bArrM2313 = C0026.m2313(byteBuffer);
        try {
            GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = new GuaranteedEncodedFormX509Certificate((X509Certificate) C0017.m835(certificateFactory, new ByteArrayInputStream(bArrM2313)), bArrM2313);
            C0077.m7162(C0039.m4117(apkSignerInfo), guaranteedEncodedFormX509Certificate);
            MessageDigest messageDigestM2835 = C0030.m2835(C0026.m2321(m802(), 0, 7, 2874));
            C0063.m4423(messageDigestM2835, bArrM2313);
            byte[] bArrM3355 = C0033.m3355(messageDigestM2835);
            if (C0073.m6306(bArr, bArrM3355)) {
                return guaranteedEncodedFormX509Certificate;
            }
            C0037.m3850(apkSignerInfo, 27, new Object[]{C0071.m6092(bArrM3355), C0071.m6092(bArr)});
            return null;
        } catch (CertificateException e) {
            C0037.m3850(apkSignerInfo, 18, new Object[]{e});
            return null;
        }
    }

    public static void c(byte[] bArr, int i, int i2, GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate, ByteBuffer byteBuffer, ApkSignerInfo apkSignerInfo) {
        ArrayList arrayList = new ArrayList(1);
        int i3 = 0;
        while (C0111.m13127(byteBuffer)) {
            i3++;
            try {
                ByteBuffer byteBufferM13168 = C0111.m13168(byteBuffer);
                int iM4566 = C0064.m4566(byteBufferM13168);
                byte[] bArrM2313 = C0026.m2313(byteBufferM13168);
                SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(iM4566);
                if (signatureAlgorithmM4321 == null) {
                    C0066.m4850(apkSignerInfo, 19, new Object[]{C0021.m1548(iM4566)});
                } else {
                    C0017.m919(arrayList, new ApkSupportedSignature(signatureAlgorithmM4321, bArrM2313));
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                C0037.m3850(apkSignerInfo, 20, new Object[]{C0021.m1548(i3)});
                return;
            }
        }
        if (C0066.m4881(arrayList)) {
            C0037.m3850(apkSignerInfo, 17, new Object[0]);
            return;
        }
        try {
            Iterator itM4732 = C0065.m4732(C0035.m3636(arrayList, i, i2, true));
            while (C0036.m3657(itM4732)) {
                ApkSupportedSignature apkSupportedSignature = (ApkSupportedSignature) C0071.m6012(itM4732);
                SignatureAlgorithm signatureAlgorithmM3131 = C0032.m3131(apkSupportedSignature);
                String str = (String) C0111.m13157(C0024.m2023(signatureAlgorithmM3131));
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) C0037.m3781(C0024.m2023(signatureAlgorithmM3131));
                PublicKey publicKeyM13180 = C0111.m13180(guaranteedEncodedFormX509Certificate);
                try {
                    Signature signatureM2131 = C0025.m2131(str);
                    C0072.m6123(signatureM2131, publicKeyM13180);
                    if (algorithmParameterSpec != null) {
                        C0070.m5856(signatureM2131, algorithmParameterSpec);
                    }
                    C0027.m2440(signatureM2131, bArr);
                    if (!C0025.m2194(signatureM2131, C0030.m2855(apkSupportedSignature))) {
                        C0037.m3850(apkSignerInfo, 21, new Object[]{signatureAlgorithmM3131});
                        return;
                    }
                } catch (InvalidAlgorithmParameterException e) {
                    e = e;
                    C0037.m3850(apkSignerInfo, 22, new Object[]{signatureAlgorithmM3131, e});
                    return;
                } catch (InvalidKeyException e2) {
                    e = e2;
                    C0037.m3850(apkSignerInfo, 22, new Object[]{signatureAlgorithmM3131, e});
                    return;
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    C0037.m3850(apkSignerInfo, 22, new Object[]{signatureAlgorithmM3131, e});
                    return;
                } catch (SignatureException e4) {
                    e = e4;
                    C0037.m3850(apkSignerInfo, 22, new Object[]{signatureAlgorithmM3131, e});
                    return;
                }
            }
        } catch (NoApkSupportedSignaturesException e5) {
            StringBuilder sb = new StringBuilder();
            Iterator itM4154 = C0039.m4154(arrayList);
            while (C0036.m3657(itM4154)) {
                ApkSupportedSignature apkSupportedSignature2 = (ApkSupportedSignature) C0071.m6012(itM4154);
                if (C0064.m4509(sb) > 0) {
                    C0077.m7290(sb, C0022.m1728(m802(), 7, 2, 1958));
                }
                C0036.m3741(sb, C0032.m3131(apkSupportedSignature2));
            }
            C0037.m3850(apkSignerInfo, 26, new Object[]{C0068.m5536(sb), e5});
        }
    }

    public static void verifyV2SourceStamp(ByteBuffer byteBuffer, CertificateFactory certificateFactory, ApkSignerInfo apkSignerInfo, Map<Integer, byte[]> map, byte[] bArr, int i, int i2) {
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509CertificateM805 = m805(byteBuffer, certificateFactory, bArr, apkSignerInfo);
        if (C0068.m5624(apkSignerInfo) || C0030.m2931(apkSignerInfo)) {
            return;
        }
        ByteBuffer byteBufferM13168 = C0111.m13168(byteBuffer);
        HashMap map2 = new HashMap();
        while (C0111.m13127(byteBufferM13168)) {
            ByteBuffer byteBufferM131682 = C0111.m13168(byteBufferM13168);
            C0038.m3969(map2, C0021.m1548(C0064.m4566(byteBufferM131682)), C0111.m13168(byteBufferM131682));
        }
        Iterator itM2001 = C0024.m2001(C0064.m4524(map));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            if (C0025.m2170((Integer) C0063.m4368(entry)) == 31) {
                C0066.m4850(apkSignerInfo, 39, new Object[]{C0021.m1548(31)});
            } else {
                if (!C0111.m13072(map2, C0063.m4368(entry))) {
                    C0037.m3850(apkSignerInfo, 17, new Object[0]);
                    return;
                }
                m803((byte[]) C0019.m1293(entry), i, i2, guaranteedEncodedFormX509CertificateM805, (ByteBuffer) C0067.m5420(map2, C0063.m4368(entry)), apkSignerInfo);
                if (C0068.m5624(apkSignerInfo) || C0030.m2931(apkSignerInfo)) {
                    return;
                }
            }
        }
        if (C0111.m13127(byteBuffer)) {
            ByteBuffer byteBufferM131683 = C0111.m13168(byteBuffer);
            ByteBuffer byteBufferM131684 = C0111.m13168(byteBuffer);
            byte[] bArr2 = new byte[C0071.m5984(byteBufferM131683)];
            C0029.m2812(byteBufferM131683, bArr2);
            C0020.m1437(byteBufferM131683);
            m803(bArr2, i, i2, guaranteedEncodedFormX509CertificateM805, byteBufferM131684, apkSignerInfo);
            if (C0030.m2931(apkSignerInfo) || C0068.m5624(apkSignerInfo)) {
                return;
            }
            ByteBuffer byteBufferM131685 = C0111.m13168(byteBufferM131683);
            int i3 = 0;
            while (C0111.m13127(byteBufferM131685)) {
                i3++;
                try {
                    ByteBuffer byteBufferM131686 = C0111.m13168(byteBufferM131685);
                    int iM4566 = C0064.m4566(byteBufferM131686);
                    byte[] bArrM6029 = C0071.m6029(byteBufferM131686);
                    if (iM4566 == -1654455305) {
                        m804(bArrM6029, guaranteedEncodedFormX509CertificateM805, apkSignerInfo);
                    } else if (iM4566 == -465807034) {
                        long jM2869 = C0030.m2869(C0064.m4604(C0020.m1393(bArrM6029), C0072.m6217()));
                        if (jM2869 > 0) {
                            apkSignerInfo.timestamp = jM2869;
                        } else {
                            C0037.m3850(apkSignerInfo, 38, new Object[]{C0070.m5853(jM2869)});
                        }
                    } else {
                        C0066.m4850(apkSignerInfo, 32, new Object[]{C0021.m1548(iM4566)});
                    }
                } catch (ApkFormatException | BufferUnderflowException unused) {
                    C0037.m3850(apkSignerInfo, 31, new Object[]{C0021.m1548(i3)});
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m802() {
        if (C0073.m6356() < 0) {
            return f53short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m803(Object obj, int i, int i2, Object obj2, Object obj3, Object obj4) {
        if (C0033.m3358() < 0) {
            c((byte[]) obj, i, i2, (GuaranteedEncodedFormX509Certificate) obj2, (ByteBuffer) obj3, (ApkSignerInfo) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m804(Object obj, Object obj2, Object obj3) {
        if (C0033.m3358() <= 0) {
            a((byte[]) obj, (GuaranteedEncodedFormX509Certificate) obj2, (ApkSignerInfo) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۤۨۡ, reason: not valid java name and contains not printable characters */
    public static GuaranteedEncodedFormX509Certificate m805(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0068.m5678() >= 0) {
            return b((ByteBuffer) obj, (CertificateFactory) obj2, (byte[]) obj3, (ApkSignerInfo) obj4);
        }
        return null;
    }

    public static void a(byte[] bArr, GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate, ApkSignerInfo apkSignerInfo) {
        try {
            List listM13099 = C0111.m13099(C0064.m4604(C0020.m1393(bArr), C0072.m6217()));
            for (int i = 0; i < C0034.m3427(listM13099); i++) {
                C0077.m7162(C0037.m3778(apkSignerInfo), C0035.m3586((SourceStampCertificateLineage.SigningCertificateNode) C0071.m6078(listM13099, i)));
            }
            if (C0072.m6195(guaranteedEncodedFormX509Certificate, C0071.m6078(C0037.m3778(apkSignerInfo), C0034.m3427(r5) - 1))) {
                return;
            }
            C0037.m3850(apkSignerInfo, 34, new Object[0]);
        } catch (IllegalArgumentException unused) {
            C0037.m3850(apkSignerInfo, 34, new Object[0]);
        } catch (SecurityException unused2) {
            C0037.m3850(apkSignerInfo, 35, new Object[0]);
        } catch (Exception unused3) {
            C0037.m3850(apkSignerInfo, 33, new Object[0]);
        }
    }

    public static void verifyV1SourceStamp(ByteBuffer byteBuffer, CertificateFactory certificateFactory, ApkSignerInfo apkSignerInfo, byte[] bArr, byte[] bArr2, int i, int i2) {
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509CertificateM805 = m805(byteBuffer, certificateFactory, bArr2, apkSignerInfo);
        if (!C0068.m5624(apkSignerInfo) && !C0030.m2931(apkSignerInfo)) {
            m803(bArr, i, i2, guaranteedEncodedFormX509CertificateM805, C0111.m13168(byteBuffer), apkSignerInfo);
        }
    }
}
