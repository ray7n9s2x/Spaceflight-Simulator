package com.android.apksig.internal.apk.v4;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V4SchemeVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f76short = {1650, 1616, 1604, 1622, 1625, 1605, 1553, 1616, 1631, 1553, 1620, 1609, 1618, 1620, 1601, 1605, 1624, 1630, 1631, 1553, 1620, 1631, 1618, 1630, 1621, 1624, 1631, 1622, 1553, 1605, 1625, 1620, 1553, 1601, 1604, 1619, 1629, 1624, 1618, 1553, 1626, 1620, 1608, 1547, 1553, 2042, 1984, 1998, 1991, 1992, 2013, 2012, 2011, 1996, 1929, 1999, 1984, 1989, 1996, 1929, 1997, 1990, 1996, 2010, 1929, 1991, 1990, 2013, 1929, 1994, 1990, 1991, 2013, 1992, 1984, 1991, 1929, 1992, 1929, 2015, 1949, 1929, 2010, 1984, 1998, 1991, 1992, 2013, 2012, 2011, 1996, 1927};

    public static ApkSigningBlockUtils.Result.SignerInfo a(V4Signature.SigningInfo signingInfo, byte[] bArr) {
        byte[] bArrM2096;
        ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
        signerInfo.index = 0;
        int iM3472 = C0034.m3472(signingInfo);
        byte[] bArrM3995 = C0038.m3995(signingInfo);
        C0077.m7162(C0073.m6301(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.Signature(iM3472, bArrM3995));
        SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(iM3472);
        if (signatureAlgorithmM4321 == null) {
            C0038.m3966(signerInfo, C0036.m3747(), new Object[]{C0021.m1548(iM3472)});
            return signerInfo;
        }
        String str = (String) C0111.m13157(C0024.m2023(signatureAlgorithmM4321));
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) C0037.m3781(C0024.m2023(signatureAlgorithmM4321));
        String strM4402 = C0063.m4402(signatureAlgorithmM4321);
        byte[] bArrM3040 = C0031.m3040(signingInfo);
        try {
            PublicKey publicKeyM7387 = C0078.m7387(C0111.m13063(strM4402), new X509EncodedKeySpec(bArrM3040));
            try {
                Signature signatureM2131 = C0025.m2131(str);
                C0072.m6123(signatureM2131, publicKeyM7387);
                if (algorithmParameterSpec != null) {
                    C0070.m5856(signatureM2131, algorithmParameterSpec);
                }
                C0027.m2440(signatureM2131, bArr);
                if (!C0025.m2194(signatureM2131, bArrM3995)) {
                    C0038.m3966(signerInfo, C0024.m2060(), new Object[]{signatureAlgorithmM4321});
                    return signerInfo;
                }
                C0035.m3624(C0066.m4826(signerInfo), signatureAlgorithmM4321, bArrM3995);
                if (C0026.m2306(signingInfo) == null) {
                    C0038.m3966(signerInfo, C0027.m2449(), new Object[0]);
                    return signerInfo;
                }
                try {
                    GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = new GuaranteedEncodedFormX509Certificate(C0020.m1370(C0026.m2306(signingInfo)), C0026.m2306(signingInfo));
                    C0077.m7162(C0039.m4117(signerInfo), guaranteedEncodedFormX509Certificate);
                    try {
                        bArrM2096 = C0038.m3975(C0111.m13180(guaranteedEncodedFormX509Certificate));
                    } catch (InvalidKeyException e) {
                        PrintStream printStreamM3219 = C0032.m3219();
                        StringBuilder sb = new StringBuilder(C0111.m13097(m1172(), 0, 45, 1585));
                        C0036.m3741(sb, e);
                        C0065.m4767(printStreamM3219, C0068.m5536(sb));
                        C0033.m3347(e);
                        bArrM2096 = C0025.m2096(C0111.m13180(guaranteedEncodedFormX509Certificate));
                    }
                    if (C0073.m6306(bArrM3040, bArrM2096)) {
                        C0077.m7162(C0023.m1795(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.ContentDigest(0, C0069.m5738(signingInfo)));
                        return signerInfo;
                    }
                    C0038.m3966(signerInfo, C0070.m5912(), new Object[]{C0027.m2472(bArrM2096), C0027.m2472(bArrM3040)});
                    return signerInfo;
                } catch (CertificateException e2) {
                    C0038.m3966(signerInfo, C0034.m3451(), new Object[]{e2});
                    return signerInfo;
                }
            } catch (InvalidAlgorithmParameterException e3) {
                e = e3;
                C0038.m3966(signerInfo, C0072.m6170(), new Object[]{signatureAlgorithmM4321, e});
                return signerInfo;
            } catch (InvalidKeyException e4) {
                e = e4;
                C0038.m3966(signerInfo, C0072.m6170(), new Object[]{signatureAlgorithmM4321, e});
                return signerInfo;
            } catch (SignatureException e5) {
                e = e5;
                C0038.m3966(signerInfo, C0072.m6170(), new Object[]{signatureAlgorithmM4321, e});
                return signerInfo;
            }
        } catch (Exception e6) {
            C0038.m3966(signerInfo, C0071.m5990(), new Object[]{e6});
            return signerInfo;
        }
    }

    public static ApkSigningBlockUtils.Result verify(DataSource dataSource, File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            V4Signature v4SignatureM4404 = C0063.m4404(fileInputStream);
            byte[] bArrM5533 = C0068.m5533(fileInputStream);
            C0024.m1958(fileInputStream);
            ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(4);
            if (v4SignatureM4404 == null) {
                C0024.m2064(result, C0020.m1457(), new Object[]{C0075.m6791(m1172(), 45, 47, 1961)});
                return result;
            }
            int iM3081 = C0031.m3081(v4SignatureM4404);
            if (iM3081 != 2) {
                C0068.m5532(result, C0026.m2289(), new Object[]{C0021.m1548(iM3081), C0021.m1548(2)});
            }
            V4Signature.HashingInfo hashingInfoM5911 = C0070.m5911(C0070.m5889(v4SignatureM4404));
            V4Signature.SigningInfos signingInfosM6161 = C0072.m6161(C0065.m4721(v4SignatureM4404));
            V4Signature.SigningInfo signingInfoM6510 = C0074.m6510(signingInfosM6161);
            ApkSigningBlockUtils.Result.SignerInfo signerInfoM5601 = C0068.m5601(signingInfoM6510, C0020.m1456(C0072.m6146(dataSource), hashingInfoM5911, signingInfoM6510));
            C0077.m7162(C0021.m1543(result), signerInfoM5601);
            if (C0077.m7227(result)) {
                return result;
            }
            for (V4Signature.SigningInfoBlock signingInfoBlock : C0070.m5846(signingInfosM6161)) {
                V4Signature.SigningInfo signingInfoM850 = C0017.m850(C0025.m2090(signingInfoBlock));
                C0077.m7162(C0021.m1543(result), C0068.m5601(signingInfoM850, C0020.m1456(C0072.m6146(dataSource), hashingInfoM5911, signingInfoM850)));
                if (C0077.m7227(result)) {
                    return result;
                }
            }
            byte[] bArrM2839 = C0030.m2839(hashingInfoM5911);
            ApkSigningBlockUtils.VerityTreeAndDigest verityTreeAndDigestM1257 = C0019.m1257(dataSource);
            ContentDigestAlgorithm contentDigestAlgorithmM6186 = C0072.m6186(verityTreeAndDigestM1257);
            byte[] bArrM1940 = C0024.m1940(verityTreeAndDigestM1257);
            byte[] bArrM7339 = C0078.m7339(verityTreeAndDigestM1257);
            if (!C0073.m6306(bArrM2839, bArrM1940)) {
                C0038.m3966(signerInfoM5601, C0073.m6342(), new Object[]{contentDigestAlgorithmM6186, C0027.m2472(bArrM2839), C0027.m2472(bArrM1940)});
            } else if (bArrM5533 == null || C0073.m6306(bArrM5533, bArrM7339)) {
                C0035.m3624(C0065.m4718(signerInfoM5601), contentDigestAlgorithmM6186, bArrM1940);
            } else {
                C0038.m3966(signerInfoM5601, C0036.m3651(), new Object[]{contentDigestAlgorithmM6186, C0027.m2472(bArrM2839), C0027.m2472(bArrM1940)});
            }
            if (!C0077.m7227(result)) {
                result.verified = true;
            }
            return result;
        } catch (Throwable th) {
            try {
                C0024.m1958(fileInputStream);
            } catch (Throwable th2) {
                C0072.m6234(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m1172() {
        if (C0031.m3075() >= 0) {
            return f76short;
        }
        return null;
    }
}
