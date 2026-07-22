package com.android.apksig.internal.apk.v3;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
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
import com.zfork.multiplatforms.android.bomb.C0461w;
import com.zfork.multiplatforms.android.bomb.C0473y;
import j$.util.OptionalInt;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.io.IOException;
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
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class V3SchemeVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f71short = {1351, 1384, 1318, 1379, 1406, 1381, 1379, 1398, 1394, 1391, 1385, 1384, 1318, 1393, 1383, 1397, 1318, 1379, 1384, 1381, 1385, 1395, 1384, 1394, 1379, 1396, 1379, 1378, 1318, 1393, 1390, 1379, 1384, 1318, 1383, 1394, 1394, 1379, 1387, 1398, 1394, 1391, 1384, 1377, 1318, 1394, 1385, 1318, 1398, 1383, 1396, 1397, 1379, 1318, 1394, 1390, 1379, 1318, 1397, 1391, 1377, 1384, 1379, 1396, 1397, 1318, 1376, 1396, 1385, 1387, 1318, 1394, 1390, 1379, 1318, 1398, 1396, 1385, 1392, 1391, 1378, 1379, 1378, 1318, 1351, 1366, 1357, 1318, 1365, 1391, 1377, 1384, 1383, 1394, 1395, 1396, 1379, 1318, 1365, 1381, 1390, 1379, 1387, 1379, 1318, 1392, 1333, 1318, 1380, 1386, 1385, 1381, 1389, 908, 942, 954, 936, 935, 955, 1007, 942, 929, 1007, 938, 951, 940, 938, 959, 955, 934, 928, 929, 1007, 938, 929, 940, 928, 939, 934, 929, 936, 1007, 955, 935, 938, 1007, 959, 954, 941, 931, 934, 940, 1007, 932, 938, 950, 1013, 1007, 2685, 2571, 2576, 2581, 2588, 2224, 2199, 2207, 2202, 2195, 2194, 2262, 2178, 2201, 2262, 2201, 2196, 2178, 2199, 2207, 2200, 2262, 2222, 2264, 2243, 2246, 2255, 2262, 2229, 2195, 2180, 2178, 2207, 2192, 2207, 2197, 2199, 2178, 2195, 2224, 2199, 2197, 2178, 2201, 2180, 2191, 1918, 1823, 1873, 1872, 1873, 1810, 1873, 1866, 1875, 1875, 1823, 1886, 1871, 1876, 1823, 1886, 1873, 1883, 1823, 1861, 1878, 1871, 1823, 1868, 1882, 1884, 1867, 1878, 1872, 1873, 1868, 1823, 1874, 1866, 1868, 1867, 1823, 1885, 1882, 1823, 1868, 1871, 1882, 1884, 1878, 1881, 1878, 1882, 1883, 1823, 1867, 1872, 1823, 1865, 1882, 1869, 1878, 1881, 1862, 1823, 1886, 1873, 1823, 1918, 1903, 1908, 1816, 1868, 1823, 1865, 1804, 1823, 1868, 1878, 1880, 1873, 1886, 1867, 1866, 1869, 1882, 1868};
    public final RunnablesExecutor a;
    public final DataSource b;
    public final ApkUtils.ZipSections c;
    public final ApkSigningBlockUtils.Result d;
    public final Set e;
    public final int f;
    public final int g;
    public final int h;
    public final OptionalInt i;
    public final boolean j;
    public ByteBuffer k;

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v3.V3SchemeVerifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f72short = {1472, 1531, 1510, 1504, 1509, 1509, 1530, 1511, 1505, 1520, 1521, 1461, 1492, 1477, 1502, 1461, 1478, 1532, 1522, 1531, 1524, 1505, 1504, 1511, 1520, 1461, 1478, 1526, 1533, 1520, 1528, 1520, 1461, 1475, 1446, 1461, 1527, 1529, 1530, 1526, 1534, 1461, 1500, 1489, 1455, 1461, 1445, 1517, 1456, 1445, 1453, 1517};
        public final DataSource b;
        public final ApkUtils.ZipSections c;
        public final ByteBuffer d;
        public Set e;
        public ApkSigningBlockUtils.Result f;
        public int g;
        public final int h;
        public RunnablesExecutor a = C0021.m1564();
        public int i = -262969152;
        public boolean j = true;
        public OptionalInt k = m1163();

        public Builder(DataSource dataSource, ApkUtils.ZipSections zipSections, int i, int i2) {
            this.b = dataSource;
            this.c = zipSections;
            this.g = i;
            this.h = i2;
        }

        /* JADX INFO: renamed from: ۠ۡۨۢ, reason: not valid java name and contains not printable characters */
        public static OptionalInt m1163() {
            if (C0071.m6069() >= 0) {
                return OptionalInt.empty();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤۤ۠ۡ, reason: not valid java name and contains not printable characters */
        public static short[] m1164() {
            if (C0030.m2940() >= 0) {
                return f72short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧ۠ۧ۟, reason: not valid java name and contains not printable characters */
        public static OptionalInt m1165(int i) {
            if (C0024.m2011() <= 0) {
                return OptionalInt.of(i);
            }
            return null;
        }

        public V3SchemeVerifier build() {
            int i;
            int iM3105 = C0031.m3105(this);
            if (iM3105 == -262969152) {
                this.g = C0074.m6445(C0026.m2309(this), 28);
                i = 3;
            } else {
                if (iM3105 != 462663009) {
                    throw new IllegalArgumentException(C0021.m1531(C0034.m3431(m1164(), 0, 52, 1429), new Object[]{C0021.m1548(C0031.m3105(this))}));
                }
                this.g = C0016.m698(this);
                i = 31;
            }
            if (C0030.m2916(this) == null) {
                this.f = new ApkSigningBlockUtils.Result(i);
            }
            if (C0026.m2307(this) == null) {
                this.e = new HashSet(1);
            }
            V3SchemeVerifier v3SchemeVerifier = new V3SchemeVerifier(C0077.m7248(this), C0064.m4638(this), C0078.m7418(this), C0026.m2307(this), C0030.m2916(this), C0026.m2309(this), C0016.m698(this), C0031.m3105(this), C0018.m1073(this), C0074.m6560(this), null);
            ByteBuffer byteBufferM6013 = C0071.m6013(this);
            if (byteBufferM6013 != null) {
                C0026.m2363(v3SchemeVerifier, byteBufferM6013);
            }
            return v3SchemeVerifier;
        }

        public Builder setBlockId(int i) {
            this.i = i;
            return this;
        }

        public Builder setContentDigestsToVerify(Set<ContentDigestAlgorithm> set) {
            this.e = set;
            return this;
        }

        public Builder setFullVerification(boolean z) {
            this.j = z;
            return this;
        }

        public Builder setResult(ApkSigningBlockUtils.Result result) {
            this.f = result;
            return this;
        }

        public Builder setRunnablesExecutor(RunnablesExecutor runnablesExecutor) {
            this.a = runnablesExecutor;
            return this;
        }

        public Builder setRotationMinSdkVersion(int i) {
            this.k = m1165(i);
            return this;
        }

        public Builder(ByteBuffer byteBuffer) {
            this.d = byteBuffer;
        }
    }

    public static void parseSigners(ByteBuffer byteBuffer, Set<ContentDigestAlgorithm> set, ApkSigningBlockUtils.Result result) {
        try {
            C0063.m4322(C0073.m6414(C0077.m7236(C0035.m3595(C0038.m4040(new Builder(byteBuffer), result), set), false)));
        } catch (ApkSigningBlockUtils.SignatureNotFoundException | IOException e) {
            throw new IllegalStateException(C0025.m2151(m1161(), 0, 113, 1286), e);
        }
    }

    public static ApkSigningBlockUtils.Result verify(RunnablesExecutor runnablesExecutor, DataSource dataSource, ApkUtils.ZipSections zipSections, int i, int i2) {
        return C0016.m675(C0073.m6414(C0025.m2192(C0032.m3235(new Builder(dataSource, zipSections, i, i2), runnablesExecutor), -262969152)));
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static IntStream m1158(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return ((Stream) obj).mapToInt((ToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1159(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return ((IntStream) obj).anyMatch((IntPredicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1160(Object obj) {
        if (C0111.m13165() <= 0) {
            return ((OptionalInt) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1161() {
        if (C0024.m2011() < 0) {
            return f71short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1162(Object obj) {
        if (C0032.m3184() < 0) {
            return ((OptionalInt) obj).getAsInt();
        }
        return 0;
    }

    public static boolean signerTargetsDevRelease(ApkSigningBlockUtils.Result.SignerInfo signerInfo) {
        return m1159(m1158(C0074.m6565(C0031.m2988(signerInfo)), new C0461w(5)), new C0473y(1));
    }

    public final void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, ApkSigningBlockUtils.Result.SignerInfo signerInfo) {
        byte[] bArrM2096;
        boolean zM3822;
        OptionalInt optionalIntM2809;
        ByteBuffer byteBufferM5463 = C0067.m5463(byteBuffer);
        byte[] bArr = new byte[C0071.m5984(byteBufferM5463)];
        C0029.m2812(byteBufferM5463, bArr);
        C0020.m1437(byteBufferM5463);
        signerInfo.signedData = bArr;
        int iM4566 = C0064.m4566(byteBuffer);
        int iM45662 = C0064.m4566(byteBuffer);
        signerInfo.minSdkVersion = iM4566;
        signerInfo.maxSdkVersion = iM45662;
        if (iM4566 < 0 || iM4566 > iM45662) {
            C0038.m3966(signerInfo, C0038.m4023(), new Object[]{C0021.m1548(iM4566), C0021.m1548(iM45662)});
        }
        ByteBuffer byteBufferM54632 = C0067.m5463(byteBuffer);
        byte[] bArrM6473 = C0074.m6473(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        int i = 0;
        while (C0111.m13127(byteBufferM54632)) {
            i++;
            try {
                ByteBuffer byteBufferM54633 = C0067.m5463(byteBufferM54632);
                int iM45663 = C0064.m4566(byteBufferM54633);
                byte[] bArrM64732 = C0074.m6473(byteBufferM54633);
                C0077.m7162(C0073.m6301(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.Signature(iM45663, bArrM64732));
                SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(iM45663);
                if (signatureAlgorithmM4321 == null) {
                    C0031.m2979(signerInfo, C0034.m3463(), new Object[]{C0021.m1548(iM45663)});
                } else {
                    C0017.m919(arrayList, new ApkSigningBlockUtils.SupportedSignature(signatureAlgorithmM4321, bArrM64732));
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                C0038.m3966(signerInfo, C0033.m3346(), new Object[]{C0021.m1548(i)});
                return;
            }
        }
        if (C0025.m2084(C0073.m6301(signerInfo))) {
            C0038.m3966(signerInfo, C0064.m4553(), new Object[0]);
            return;
        }
        try {
            Iterator itM4732 = C0065.m4732(C0025.m2150(arrayList, C0035.m3615(signerInfo), C0037.m3877(signerInfo)));
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
                            C0038.m3966(signerInfo, C0024.m2012(), new Object[]{signatureAlgorithmM3131});
                            return;
                        } else {
                            C0035.m3624(C0066.m4826(signerInfo), signatureAlgorithmM3131, bArrM2855);
                            C0026.m2346(C0029.m2772(this), C0030.m2948(signatureAlgorithmM3131));
                        }
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        C0038.m3966(signerInfo, C0020.m1361(), new Object[]{signatureAlgorithmM3131, e});
                        return;
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        C0038.m3966(signerInfo, C0020.m1361(), new Object[]{signatureAlgorithmM3131, e});
                        return;
                    } catch (SignatureException e3) {
                        e = e3;
                        C0038.m3966(signerInfo, C0020.m1361(), new Object[]{signatureAlgorithmM3131, e});
                        return;
                    }
                } catch (Exception e4) {
                    C0038.m3966(signerInfo, C0022.m1729(), new Object[]{e4});
                    return;
                }
            }
            C0037.m3886(byteBufferM5463, 0);
            ByteBuffer byteBufferM54634 = C0067.m5463(byteBufferM5463);
            ByteBuffer byteBufferM54635 = C0067.m5463(byteBufferM5463);
            int iM45664 = C0064.m4566(byteBufferM5463);
            if (iM45664 != iM4566) {
                C0038.m3966(signerInfo, C0030.m2862(), new Object[]{C0021.m1548(iM4566), C0021.m1548(iM45664)});
            }
            int iM45665 = C0064.m4566(byteBufferM5463);
            if (iM45665 != iM45662) {
                C0038.m3966(signerInfo, C0022.m1721(), new Object[]{C0021.m1548(iM45662), C0021.m1548(iM45665)});
            }
            ByteBuffer byteBufferM54636 = C0067.m5463(byteBufferM5463);
            int i2 = -1;
            while (C0111.m13127(byteBufferM54635)) {
                int i3 = i2 + 1;
                byte[] bArrM64733 = C0074.m6473(byteBufferM54635);
                try {
                    C0077.m7162(C0039.m4117(signerInfo), new GuaranteedEncodedFormX509Certificate(C0016.m726(bArrM64733, certificateFactory), bArrM64733));
                    i2 = i3;
                } catch (CertificateException e5) {
                    C0038.m3966(signerInfo, C0077.m7304(), new Object[]{C0021.m1548(i3), C0021.m1548(i2 + 2), e5});
                    return;
                }
            }
            if (C0025.m2084(C0039.m4117(signerInfo))) {
                C0038.m3966(signerInfo, C0070.m5943(), new Object[0]);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) C0071.m6078(C0039.m4117(signerInfo), 0);
            try {
                bArrM2096 = C0038.m3975(C0075.m6845(x509Certificate));
            } catch (InvalidKeyException e6) {
                PrintStream printStreamM3219 = C0032.m3219();
                StringBuilder sb = new StringBuilder(C0069.m5807(m1161(), 113, 45, 975));
                C0036.m3741(sb, e6);
                C0065.m4767(printStreamM3219, C0068.m5536(sb));
                C0033.m3347(e6);
                bArrM2096 = C0025.m2096(C0075.m6845(x509Certificate));
            }
            if (!C0073.m6306(bArrM6473, bArrM2096)) {
                C0038.m3966(signerInfo, C0031.m3079(), new Object[]{C0027.m2472(bArrM2096), C0027.m2472(bArrM6473)});
                return;
            }
            int i4 = 0;
            while (C0111.m13127(byteBufferM54634)) {
                i4++;
                try {
                    ByteBuffer byteBufferM54637 = C0067.m5463(byteBufferM54634);
                    C0077.m7162(C0023.m1795(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.ContentDigest(C0064.m4566(byteBufferM54637), C0074.m6473(byteBufferM54637)));
                } catch (ApkFormatException | BufferUnderflowException unused2) {
                    C0038.m3966(signerInfo, C0071.m6000(), new Object[]{C0021.m1548(i4)});
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
                C0038.m3966(signerInfo, C0031.m3114(), new Object[]{arrayList2, arrayList3});
                return;
            }
            int i5 = 0;
            boolean z = false;
            while (true) {
                boolean zM13127 = C0111.m13127(byteBufferM54636);
                zM3822 = C0037.m3822(this);
                optionalIntM2809 = C0029.m2809(this);
                if (!zM13127) {
                    break;
                }
                i5++;
                try {
                    ByteBuffer byteBufferM54638 = C0067.m5463(byteBufferM54636);
                    int iM45666 = C0064.m4566(byteBufferM54638);
                    byte[] bArrM6029 = C0071.m6029(byteBufferM54638);
                    C0077.m7162(C0031.m2988(signerInfo), new ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute(iM45666, bArrM6029));
                    if (iM45666 == 1000370060) {
                        try {
                            SigningCertificateLineage signingCertificateLineageM2569 = C0028.m2569(bArrM6029);
                            signerInfo.signingCertificateLineage = signingCertificateLineageM2569;
                            if (C0068.m5602(C0030.m2891(signerInfo)) != C0068.m5602(C0026.m2275(signingCertificateLineageM2569, (X509Certificate) C0071.m6078(C0039.m4117(signerInfo), 0)))) {
                                C0038.m3966(signerInfo, C0031.m3073(), new Object[0]);
                            }
                        } catch (IllegalArgumentException unused3) {
                            C0038.m3966(signerInfo, C0031.m3073(), new Object[0]);
                        } catch (SecurityException unused4) {
                            C0038.m3966(signerInfo, C0072.m6124(), new Object[0]);
                        } catch (Exception unused5) {
                            C0038.m3966(signerInfo, C0017.m836(), new Object[0]);
                        }
                    } else if (iM45666 == 1436519170) {
                        if (C0071.m6093(this) >= 33 && zM3822) {
                            int iM45667 = C0064.m4566(C0064.m4604(C0020.m1393(bArrM6029), C0072.m6217()));
                            if (m1160(optionalIntM2809)) {
                                int iM1162 = m1162(optionalIntM2809);
                                if (iM45667 != iM1162) {
                                    C0038.m3966(signerInfo, C0019.m1282(), new Object[]{C0021.m1548(iM45667), C0021.m1548(iM1162)});
                                }
                            } else {
                                C0038.m3966(signerInfo, C0019.m1268(), new Object[]{C0021.m1548(iM45667)});
                            }
                        }
                        z = true;
                    } else if (iM45666 != -1029262406) {
                        C0031.m2979(signerInfo, C0027.m2390(), new Object[]{C0021.m1548(iM45666)});
                    } else if (C0070.m5905(this) != 462663009) {
                        C0031.m2979(signerInfo, C0022.m1776(), new Object[0]);
                    }
                } catch (ApkFormatException | BufferUnderflowException unused6) {
                    C0038.m3966(signerInfo, C0067.m5454(), new Object[]{C0021.m1548(i5)});
                    return;
                }
            }
            if (zM3822 && m1160(optionalIntM2809) && !z) {
                C0031.m2979(signerInfo, C0074.m6499(), new Object[]{C0021.m1548(m1162(optionalIntM2809))});
            }
        } catch (ApkSigningBlockUtils.NoSupportedSignaturesException unused7) {
            C0038.m3966(signerInfo, C0023.m1895(), new Object[0]);
        }
    }

    public V3SchemeVerifier(RunnablesExecutor runnablesExecutor, DataSource dataSource, ApkUtils.ZipSections zipSections, Set set, ApkSigningBlockUtils.Result result, int i, int i2, int i3, OptionalInt optionalInt, boolean z, AnonymousClass1 anonymousClass1) {
        this.a = runnablesExecutor;
        this.b = dataSource;
        this.c = zipSections;
        this.e = set;
        this.d = result;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = optionalInt;
        this.j = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        com.android.apksig.internal.jar.C0024.m2064(r6, com.android.apksig.zip.C0036.m3701(), new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.apksig.internal.apk.ApkSigningBlockUtils.Result verify() {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.internal.apk.v3.V3SchemeVerifier.verify():com.android.apksig.internal.apk.ApkSigningBlockUtils$Result");
    }

    public ApkSigningBlockUtils.Result parseSigners() {
        ApkSigningBlockUtils.Result resultM7266 = C0077.m7266(this);
        try {
            if (C0038.m3943(this) == null) {
                this.k = C0067.m5410(C0019.m1188(C0066.m4909(this), C0032.m3225(this), C0070.m5905(this), resultM7266));
            }
            ByteBuffer byteBufferM5463 = C0067.m5463(C0038.m3943(this));
            if (!C0111.m13127(byteBufferM5463)) {
                C0024.m2064(resultM7266, C0029.m2787(), new Object[0]);
                return resultM7266;
            }
            try {
                CertificateFactory certificateFactoryM6461 = C0074.m6461(C0034.m3431(m1161(), 158, 5, 2597));
                int i = 0;
                while (C0111.m13127(byteBufferM5463)) {
                    int i2 = i + 1;
                    ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
                    signerInfo.index = i;
                    C0077.m7162(C0021.m1543(resultM7266), signerInfo);
                    try {
                        C0037.m3867(this, C0067.m5463(byteBufferM5463), certificateFactoryM6461, signerInfo);
                        i = i2;
                    } catch (ApkFormatException | BufferUnderflowException unused) {
                        C0038.m3966(signerInfo, C0029.m2701(), new Object[0]);
                    }
                }
                return resultM7266;
            } catch (CertificateException e) {
                throw new RuntimeException(C0037.m3829(m1161(), 163, 41, 2294), e);
            }
        } catch (ApkFormatException unused2) {
            C0024.m2064(resultM7266, C0067.m5526(), new Object[0]);
            return resultM7266;
        }
    }
}
