package com.android.apksig.internal.apk.v3;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.SigningCertificateLineage;
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
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
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
import j$.util.OptionalInt;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
import java.util.function.ToIntFunction;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class V3SchemeSigner {
    public static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;
    public static final int PROOF_OF_ROTATION_ATTR_ID = 1000370060;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f70short = {318, 319, 301, 267, 284, 270, 2369, 2375, 1260, 1239, 1226, 1228, 1225, 1225, 1238, 1227, 1229, 1244, 1245, 1177, 1234, 1244, 1216, 1177, 1240, 1237, 1246, 1238, 1227, 1232, 1229, 1233, 1236, 1155, 1177, 607, 540, 528, 529, 523, 538, 529, 523, 607, 539, 534, 536, 538, 524, 523, 607, 537, 528, 525, 607, 3251, 3325, 3324, 3303, 3251, 3312, 3324, 3326, 3299, 3302, 3303, 3318, 3319, 291, 260, 268, 265, 256, 257, 325, 273, 266, 325, 256, 267, 262, 266, 257, 256, 325, 262, 256, 279, 273, 268, 259, 268, 262, 260, 273, 256, 278, 1698, 1667, 1740, 1679, 1673, 1694, 1688, 1669, 1674, 1669, 1679, 1677, 1688, 1673, 1695, 1740, 1679, 1667, 1666, 1674, 1669, 1675, 1689, 1694, 1673, 1672, 1740, 1674, 1667, 1694, 1740, 1695, 1669, 1675, 1666, 1673, 1694, 2530, 2468, 2467, 2475, 2478, 2471, 2470, 1481, 1523, 1533, 1524, 1535, 1512, 1466, 1465};
    public final RunnablesExecutor a;
    public final DataSource b;
    public final DataSource c;
    public final DataSource d;
    public final List e;
    public final int f;
    public final OptionalInt g;
    public final boolean h;

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v3.V3SchemeSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        public final DataSource a;
        public final DataSource b;
        public final DataSource c;
        public final List d;
        public RunnablesExecutor e = C0072.m6189();
        public int f = -262969152;
        public OptionalInt g = m1156();
        public boolean h = false;

        /* JADX INFO: renamed from: ۟ۦۡ۠ۨ, reason: not valid java name and contains not printable characters */
        public static OptionalInt m1156() {
            if (C0034.m3450() >= 0) {
                return OptionalInt.empty();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۧۤ۟, reason: contains not printable characters */
        public static OptionalInt m1157(int i) {
            if (C0032.m3184() <= 0) {
                return OptionalInt.of(i);
            }
            return null;
        }

        public V3SchemeSigner build() {
            return new V3SchemeSigner(C0039.m4128(this), C0018.m966(this), C0038.m4032(this), C0019.m1178(this), C0022.m1733(this), C0068.m5542(this), C0021.m1528(this), C0037.m3905(this), null);
        }

        public Builder setBlockId(int i) {
            this.f = i;
            return this;
        }

        public Builder setMinSdkVersionForV31(int i) {
            int i2 = i;
            if (i2 == 34) {
                i2 = 33;
            }
            this.g = m1157(i2);
            return this;
        }

        public Builder setRotationTargetsDevRelease(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setRunnablesExecutor(RunnablesExecutor runnablesExecutor) {
            this.e = runnablesExecutor;
            return this;
        }

        public Builder(DataSource dataSource, DataSource dataSource2, DataSource dataSource3, List<ApkSigningBlockUtils.SignerConfig> list) {
            this.a = dataSource;
            this.b = dataSource2;
            this.c = dataSource3;
            this.d = list;
        }

        public Builder setRotationMinSdkVersion(int i) {
            return C0064.m4603(this, i);
        }
    }

    public static final class V3SignatureSchemeBlock {

        public static final class SignedData {
            public byte[] additionalAttributes;
            public List<byte[]> certificates;
            public List<Pair<Integer, byte[]>> digests;
            public int maxSdkVersion;
            public int minSdkVersion;

            public SignedData(AnonymousClass1 anonymousClass1) {
            }
        }

        public static final class Signer {
            public int maxSdkVersion;
            public int minSdkVersion;
            public byte[] publicKey;
            public List<Pair<Integer, byte[]>> signatures;
            public byte[] signedData;

            public Signer(AnonymousClass1 anonymousClass1) {
            }
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1142(Object obj) {
        if (C0017.m846() > 0) {
            return ((V3SignatureSchemeBlock.SignedData) obj).maxSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m1143(Object obj) {
        if (C0077.m7272() < 0) {
            return ((V3SignatureSchemeBlock.SignedData) obj).certificates;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1144(Object obj) {
        if (C0030.m2940() > 0) {
            return ((V3SignatureSchemeBlock.SignedData) obj).minSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1145(Object obj) {
        if (C0023.m1921() > 0) {
            return ((OptionalInt) obj).isPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static IntStream m1146(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            return ((Stream) obj).mapToInt((ToIntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m1147(Object obj) {
        if (C0020.m1385() <= 0) {
            return ((V3SignatureSchemeBlock.Signer) obj).maxSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۥ, reason: not valid java name and contains not printable characters */
    public static List m1148(Object obj) {
        if (C0023.m1921() > 0) {
            return ((V3SignatureSchemeBlock.SignedData) obj).digests;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1149(Object obj) {
        if (C0023.m1921() > 0) {
            return ((V3SignatureSchemeBlock.SignedData) obj).additionalAttributes;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1150(Object obj) {
        if (C0036.m3653() < 0) {
            return ((V3SignatureSchemeBlock.Signer) obj).minSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۢۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m1151(Object obj) {
        if (C0030.m2940() > 0) {
            return ((V3SignatureSchemeBlock.Signer) obj).signedData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m1152(Object obj) {
        if (C0072.m6216() > 0) {
            return ((V3SignatureSchemeBlock.Signer) obj).publicKey;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static List m1153(Object obj) {
        if (C0025.m2132() > 0) {
            return ((V3SignatureSchemeBlock.Signer) obj).signatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static short[] m1154() {
        if (C0066.m4827() > 0) {
            return f70short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1155(Object obj) {
        if (C0068.m5678() > 0) {
            return ((OptionalInt) obj).getAsInt();
        }
        return 0;
    }

    public ApkSigningBlockUtils.SigningSchemeBlockAndDigests generateApkSignatureSchemeV3BlockAndDigests() throws SignatureException, InvalidKeyException {
        RunnablesExecutor runnablesExecutorM5995 = C0071.m5995(this);
        DataSource dataSourceM4130 = C0039.m4130(this);
        DataSource dataSourceM3028 = C0031.m3028(this);
        DataSource dataSourceM7390 = C0078.m7390(this);
        List listM2080 = C0024.m2080(this);
        Pair pairM7347 = C0078.m7347(runnablesExecutorM5995, dataSourceM4130, dataSourceM3028, dataSourceM7390, listM2080);
        Map map = (Map) C0037.m3781(pairM7347);
        String strM625 = C0016.m625(m1154(), 134, 7, 2498);
        String strM2695 = C0029.m2695(m1154(), 141, 8, 1434);
        ArrayList arrayList = new ArrayList(C0034.m3427(listM2080));
        Iterator itM4732 = C0065.m4732(listM2080);
        int i = 0;
        while (C0036.m3657(itM4732)) {
            i++;
            try {
                C0017.m919(arrayList, C0026.m2293(this, (ApkSigningBlockUtils.SignerConfig) C0071.m6012(itM4732), map));
            } catch (InvalidKeyException e) {
                throw new InvalidKeyException(C0025.m2086(strM2695, i, strM625), e);
            } catch (SignatureException e2) {
                throw new SignatureException(C0025.m2086(strM2695, i, strM625), e2);
            }
        }
        return new ApkSigningBlockUtils.SigningSchemeBlockAndDigests(C0025.m2158(C0066.m4830(new byte[][]{C0032.m3223(arrayList)}), C0021.m1548(C0034.m3458(this))), (Map) C0037.m3781(pairM7347));
    }

    public static ApkSigningBlockUtils.SigningSchemeBlockAndDigests generateApkSignatureSchemeV3Block(RunnablesExecutor runnablesExecutor, DataSource dataSource, DataSource dataSource2, DataSource dataSource3, List<ApkSigningBlockUtils.SignerConfig> list) {
        return C0025.m2154(C0039.m4170(C0074.m6459(C0020.m1416(new Builder(dataSource, dataSource2, dataSource3, list), runnablesExecutor), -262969152)));
    }

    public final byte[] a(ApkSigningBlockUtils.SignerConfig signerConfig, Map map) throws SignatureException {
        if (C0025.m2084(C0066.m4892(signerConfig))) {
            throw new SignatureException(C0016.m625(m1154(), 97, 37, 1772));
        }
        byte[] bArrM3975 = C0038.m3975(C0075.m6845((X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0)));
        V3SignatureSchemeBlock.SignedData signedData = new V3SignatureSchemeBlock.SignedData(null);
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
                    C0077.m7290(sb, C0028.m2609(m1154(), 35, 20, 639));
                    C0036.m3741(sb, signatureAlgorithm);
                    C0077.m7290(sb, C0071.m5991(m1154(), 55, 13, 3219));
                    throw new RuntimeException(C0068.m5536(sb));
                }
                C0017.m919(arrayList, C0025.m2158(C0021.m1548(C0078.m7437(signatureAlgorithm)), bArr));
            }
            signedData.digests = arrayList;
            signedData.minSdkVersion = C0067.m5469(signerConfig);
            signedData.maxSdkVersion = C0024.m1981(signerConfig);
            ArrayList arrayList2 = new ArrayList();
            SigningCertificateLineage signingCertificateLineageM5590 = C0068.m5590(signerConfig);
            if (signingCertificateLineageM5590 != null) {
                C0017.m919(arrayList2, C0027.m2439(signingCertificateLineageM5590));
            }
            boolean zM3130 = C0032.m3130(this);
            int iM3458 = C0034.m3458(this);
            if ((zM3130 || C0032.m3121(signerConfig)) && iM3458 == 462663009) {
                ByteBuffer byteBufferM3516 = C0035.m3516(8);
                C0064.m4604(byteBufferM3516, C0072.m6217());
                C0038.m4018(byteBufferM3516, 4);
                C0038.m4018(byteBufferM3516, V3SchemeConstants.ROTATION_ON_DEV_RELEASE_ATTR_ID);
                C0017.m919(arrayList2, C0027.m2445(byteBufferM3516));
            }
            OptionalInt optionalIntM2280 = C0026.m2280(this);
            if (m1145(optionalIntM2280) && iM3458 == -262969152) {
                int iM1155 = m1155(optionalIntM2280);
                ByteBuffer byteBufferM35162 = C0035.m3516(12);
                C0064.m4604(byteBufferM35162, C0072.m6217());
                C0038.m4018(byteBufferM35162, 8);
                C0038.m4018(byteBufferM35162, V3SchemeConstants.ROTATION_MIN_SDK_VERSION_ATTR_ID);
                C0038.m4018(byteBufferM35162, iM1155);
                C0017.m919(arrayList2, C0027.m2445(byteBufferM35162));
            }
            int iM6372 = C0073.m6372(m1146(C0074.m6565(arrayList2), new C0461w(4)));
            byte[] bArr2 = new byte[iM6372];
            if (iM6372 == 0) {
                bArr2 = new byte[0];
            } else {
                Iterator itM4154 = C0039.m4154(arrayList2);
                int length = 0;
                while (C0036.m3657(itM4154)) {
                    byte[] bArr3 = (byte[]) C0071.m6012(itM4154);
                    C0027.m2519(bArr3, 0, bArr2, length, bArr3.length);
                    length += bArr3.length;
                }
            }
            signedData.additionalAttributes = bArr2;
            V3SignatureSchemeBlock.Signer signer = new V3SignatureSchemeBlock.Signer(null);
            byte[] bArrM7318 = C0078.m7318(C0023.m1880(m1148(signedData)));
            byte[] bArrM73182 = C0078.m7318(C0032.m3223(m1143(signedData)));
            byte[] bArrM73183 = C0078.m7318(m1149(signedData));
            ByteBuffer byteBufferM35163 = C0035.m3516(bArrM7318.length + bArrM73182.length + 8 + bArrM73183.length);
            ByteOrder byteOrderM6217 = C0072.m6217();
            C0064.m4604(byteBufferM35163, byteOrderM6217);
            C0068.m5569(byteBufferM35163, bArrM7318);
            C0068.m5569(byteBufferM35163, bArrM73182);
            C0038.m4018(byteBufferM35163, m1144(signedData));
            C0038.m4018(byteBufferM35163, m1142(signedData));
            C0068.m5569(byteBufferM35163, bArrM73183);
            byte[] bArrM2445 = C0027.m2445(byteBufferM35163);
            signer.signedData = bArrM2445;
            signer.minSdkVersion = C0067.m5469(signerConfig);
            signer.maxSdkVersion = C0024.m1981(signerConfig);
            signer.publicKey = bArrM3975;
            signer.signatures = C0068.m5550(signerConfig, bArrM2445);
            byte[] bArrM73184 = C0078.m7318(m1151(signer));
            byte[] bArrM73185 = C0078.m7318(C0023.m1880(m1153(signer)));
            byte[] bArrM73186 = C0078.m7318(m1152(signer));
            ByteBuffer byteBufferM35164 = C0035.m3516(bArrM73184.length + 8 + bArrM73185.length + bArrM73186.length);
            C0064.m4604(byteBufferM35164, byteOrderM6217);
            C0068.m5569(byteBufferM35164, bArrM73184);
            C0038.m4018(byteBufferM35164, m1150(signer));
            C0038.m4018(byteBufferM35164, m1147(signer));
            C0068.m5569(byteBufferM35164, bArrM73185);
            C0068.m5569(byteBufferM35164, bArrM73186);
            return C0027.m2445(byteBufferM35164);
        } catch (CertificateEncodingException e) {
            throw new SignatureException(C0035.m3603(m1154(), 68, 29, 357), e);
        }
    }

    public V3SchemeSigner(DataSource dataSource, DataSource dataSource2, DataSource dataSource3, List list, RunnablesExecutor runnablesExecutor, int i, OptionalInt optionalInt, boolean z, AnonymousClass1 anonymousClass1) {
        this.b = dataSource;
        this.c = dataSource2;
        this.d = dataSource3;
        this.e = list;
        this.a = runnablesExecutor;
        this.f = i;
        this.g = optionalInt;
        this.h = z;
    }

    public static byte[] generateV3SignerAttribute(SigningCertificateLineage signingCertificateLineage) {
        byte[] bArrM13039 = C0111.m13039(signingCertificateLineage);
        ByteBuffer byteBufferM3516 = C0035.m3516(bArrM13039.length + 8);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0038.m4018(byteBufferM3516, bArrM13039.length + 4);
        C0038.m4018(byteBufferM3516, 1000370060);
        C0068.m5569(byteBufferM3516, bArrM13039);
        return C0027.m2445(byteBufferM3516);
    }

    public static List<SignatureAlgorithm> getSuggestedSignatureAlgorithms(PublicKey publicKey, int i, boolean z, boolean z2) throws InvalidKeyException {
        SignatureAlgorithm signatureAlgorithmM3438;
        String strM5875 = C0070.m5875(publicKey);
        if (C0025.m2111(C0029.m2695(m1154(), 0, 3, 364), strM5875)) {
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
        if (C0025.m2111(C0070.m5942(m1154(), 3, 3, 335), strM5875)) {
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
        if (C0025.m2111(C0019.m1189(m1154(), 6, 2, 2308), strM5875)) {
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
        throw new InvalidKeyException(C0032.m3116(C0074.m6452(m1154(), 8, 27, 1209), strM5875));
    }
}
