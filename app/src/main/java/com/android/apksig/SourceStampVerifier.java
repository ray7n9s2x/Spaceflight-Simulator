package com.android.apksig;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.SignatureNotFoundException;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.android.apksig.zip.ZipSections;
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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class SourceStampVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f35short = {2453, 2461, 2444, 2457, 2549, 2449, 2454, 2462, 2551, 2453, 2457, 2454, 2449, 2462, 2461, 2443, 2444, 2550, 2453, 2462, 3192, 3184, 3169, 3188, 3096, 3196, 3195, 3187, 3098, 1042, 1134, 1135, 1149, 1039, 1125, 1138, 1120, 1081, 1106, 1108, 2958, 2985, 2977, 2980, 2989, 2988, 3048, 3004, 2983, 3048, 3002, 2989, 2985, 2988, 3048, 2953, 2968, 2947, 790, 864, 891, 894, 887, 1341, 1338, 1327, 1315, 1342, 1379, 1325, 1323, 1340, 1338, 1379, 1341, 1318, 1327, 1404, 1403, 1400, 1219, 1205, 1198, 1195, 1186, 2878, 2841, 2833, 2836, 2845, 2844, 2904, 2828, 2839, 2904, 2839, 2842, 2828, 2841, 2833, 2838, 2904, 2848, 2902, 2893, 2888, 2881, 2904, 2875, 2845, 2826, 2828, 2833, 2846, 2833, 2843, 2841, 2828, 2845, 2878, 2841, 2843, 2828, 2839, 2826, 2817, 478, 2825, 2840, 2819, 2920, 2854, 2855, 2876, 2920, 2872, 2874, 2855, 2878, 2849, 2860, 2861, 2860};
    public final File a;
    public final DataSource b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: com.android.apksig.SourceStampVerifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f36short = {2097, 2080, 2107, 2160, 2157, 2157, 2160, 2110, 2085, 2108, 2108, 1092, 1109, 1102, 1029, 1048, 1048, 1029, 1099, 1104, 1097, 1097};
        public final File a;
        public final DataSource b;
        public int c = 1;
        public int d = Integer.MAX_VALUE;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException(C0111.m13097(m592(), 11, 11, 1061));
            }
            this.a = file;
            this.b = null;
        }

        /* JADX INFO: renamed from: ۢۧۦۣ, reason: not valid java name and contains not printable characters */
        public static short[] m592() {
            if (C0031.m3075() > 0) {
                return f36short;
            }
            return null;
        }

        public SourceStampVerifier build() {
            return new SourceStampVerifier(C0024.m1929(this), C0029.m2777(this), C0067.m5506(this), C0070.m5910(this), null);
        }

        public Builder setMaxCheckedPlatformVersion(int i) {
            this.d = i;
            return this;
        }

        public Builder setMinCheckedPlatformVersion(int i) {
            this.c = i;
            return this;
        }

        public Builder(DataSource dataSource) {
            if (dataSource != null) {
                this.b = dataSource;
                this.a = null;
                return;
            }
            throw new NullPointerException(C0070.m5942(m592(), 0, 11, 2128));
        }
    }

    public static class Result {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f37short = {307, 264, 269, 264, 265, 273, 264, 326, 295, 278, 269, 309, 271, 257, 308, 259, 277, 275, 266, 274, 326, 309, 271, 257, 264, 271, 264, 257, 326, 292, 266, 265, 261, 269, 326, 309, 261, 270, 259, 267, 259, 326, 303, 258, 326};
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final List e;
        public SourceStampInfo f;
        public final ArrayList g;
        public final ArrayList h;
        public boolean i;

        public static class SignerInfo {
            public static final int INVALID_SDK_VERSION = -1;
            public X509Certificate a;
            public final ArrayList b = new ArrayList();
            public final ArrayList c = new ArrayList();
            public int d = -1;
            public int e = -1;

            public void addVerificationError(int i, Object... objArr) {
                C0017.m919(C0039.m4093(this), new ApkVerificationIssue(i, objArr));
            }

            public void addVerificationWarning(int i, Object... objArr) {
                C0017.m919(C0023.m1807(this), new ApkVerificationIssue(i, objArr));
            }

            public boolean containsErrors() {
                return !C0066.m4881(C0039.m4093(this));
            }

            public List<ApkVerificationIssue> getErrors() {
                return C0039.m4093(this);
            }

            public int getMaxSdkVersion() {
                return C0073.m6349(this);
            }

            public int getMinSdkVersion() {
                return C0063.m4326(this);
            }

            public X509Certificate getSigningCertificate() {
                return C0074.m6458(this);
            }

            public List<ApkVerificationIssue> getWarnings() {
                return C0023.m1807(this);
            }

            public void setMaxSdkVersion(int i) {
                this.e = i;
            }

            public void setMinSdkVersion(int i) {
                this.d = i;
            }

            public void setSigningCertificate(X509Certificate x509Certificate) {
                this.a = x509Certificate;
            }
        }

        public static class SourceStampInfo {
            public final List a;
            public final List b;
            public final ArrayList c;
            public final ArrayList d;
            public final ArrayList e;
            public final long f;

            public boolean containsErrors() {
                return (C0066.m4881(C0016.m661(this)) && C0066.m4881(C0035.m3597(this))) ? false : true;
            }

            public boolean containsInfoMessages() {
                return !C0066.m4881(C0074.m6558(this));
            }

            public X509Certificate getCertificate() {
                List listM1881 = C0023.m1881(this);
                if (C0025.m2084(listM1881)) {
                    return null;
                }
                return (X509Certificate) C0071.m6078(listM1881, 0);
            }

            public List<X509Certificate> getCertificatesInLineage() {
                return C0024.m2058(this);
            }

            public List<ApkVerificationIssue> getErrors() {
                ArrayList arrayList = new ArrayList();
                C0067.m5504(arrayList, C0016.m661(this));
                C0067.m5504(arrayList, C0035.m3597(this));
                return arrayList;
            }

            public List<ApkVerificationIssue> getInfoMessages() {
                return C0074.m6558(this);
            }

            public long getTimestampEpochSeconds() {
                return C0069.m5780(this);
            }

            public List<ApkVerificationIssue> getWarnings() {
                return C0035.m3597(this);
            }

            public SourceStampInfo(ApkSignerInfo apkSignerInfo, AnonymousClass1 anonymousClass1) {
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                ArrayList arrayList2 = new ArrayList();
                this.d = arrayList2;
                ArrayList arrayList3 = new ArrayList();
                this.e = arrayList3;
                this.a = C0039.m4117(apkSignerInfo);
                this.b = C0037.m3778(apkSignerInfo);
                C0067.m5504(arrayList, C0063.m4331(apkSignerInfo));
                C0067.m5504(arrayList2, C0111.m13055(apkSignerInfo));
                C0067.m5504(arrayList3, C0068.m5622(apkSignerInfo));
                this.f = C0070.m5847(apkSignerInfo);
            }
        }

        /* JADX INFO: renamed from: ۣۢ۟۠, reason: not valid java name and contains not printable characters */
        public static short[] m593() {
            if (C0067.m5468() < 0) {
                return f37short;
            }
            return null;
        }

        public void addVerificationError(int i, Object... objArr) {
            C0017.m919(C0075.m6816(this), new ApkVerificationIssue(i, objArr));
        }

        public void addVerificationWarning(int i, Object... objArr) {
            C0017.m919(C0024.m1930(this), new ApkVerificationIssue(i, objArr));
        }

        public boolean containsErrors() {
            if (!C0066.m4881(C0075.m6816(this))) {
                return true;
            }
            Iterator itM4732 = C0065.m4732(C0077.m7180(this));
            while (C0036.m3657(itM4732)) {
                Iterator itM47322 = C0065.m4732((List) C0071.m6012(itM4732));
                while (C0036.m3657(itM47322)) {
                    if (C0031.m3050((SignerInfo) C0071.m6012(itM47322))) {
                        return true;
                    }
                }
            }
            SourceStampInfo sourceStampInfoM3262 = C0033.m3262(this);
            return sourceStampInfoM3262 != null && C0024.m1970(sourceStampInfoM3262);
        }

        public List<ApkVerificationIssue> getAllErrors() {
            ArrayList arrayList = new ArrayList();
            C0067.m5504(arrayList, C0075.m6816(this));
            Iterator itM4732 = C0065.m4732(C0077.m7180(this));
            while (C0036.m3657(itM4732)) {
                Iterator itM47322 = C0065.m4732((List) C0071.m6012(itM4732));
                while (C0036.m3657(itM47322)) {
                    C0067.m5504(arrayList, C0075.m6805((SignerInfo) C0071.m6012(itM47322)));
                }
            }
            SourceStampInfo sourceStampInfoM3262 = C0033.m3262(this);
            if (sourceStampInfoM3262 != null) {
                C0067.m5504(arrayList, C0078.m7313(sourceStampInfoM3262));
            }
            return arrayList;
        }

        public List<ApkVerificationIssue> getAllWarnings() {
            ArrayList arrayList = new ArrayList();
            C0067.m5504(arrayList, C0024.m1930(this));
            Iterator itM4732 = C0065.m4732(C0077.m7180(this));
            while (C0036.m3657(itM4732)) {
                Iterator itM47322 = C0065.m4732((List) C0071.m6012(itM4732));
                while (C0036.m3657(itM47322)) {
                    C0067.m5504(arrayList, C0034.m3453((SignerInfo) C0071.m6012(itM47322)));
                }
            }
            SourceStampInfo sourceStampInfoM3262 = C0033.m3262(this);
            if (sourceStampInfoM3262 != null) {
                C0067.m5504(arrayList, C0038.m3983(sourceStampInfoM3262));
            }
            return arrayList;
        }

        public List<ApkVerificationIssue> getErrors() {
            return C0075.m6816(this);
        }

        public SourceStampInfo getSourceStampInfo() {
            return C0033.m3262(this);
        }

        public List<SignerInfo> getV1SchemeSigners() {
            return C0064.m4519(this);
        }

        public List<SignerInfo> getV2SchemeSigners() {
            return C0063.m4317(this);
        }

        public List<SignerInfo> getV31SchemeSigners() {
            return C0036.m3726(this);
        }

        public List<SignerInfo> getV3SchemeSigners() {
            return C0028.m2612(this);
        }

        public List<ApkVerificationIssue> getWarnings() {
            return C0024.m1930(this);
        }

        public boolean isVerified() {
            return C0078.m7330(this);
        }

        public Result() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.c = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            this.d = arrayList4;
            this.e = C0021.m1596(new List[]{arrayList, arrayList2, arrayList3, arrayList4});
            this.g = new ArrayList();
            this.h = new ArrayList();
        }

        public static void access$000(Result result, ApkSigResult apkSigResult) {
            C0030.m2951(result);
            if (C0016.m707(apkSigResult) == 0) {
                result.i = C0067.m5416(apkSigResult);
                if (!C0025.m2084(C0111.m13075(apkSigResult))) {
                    result.f = new SourceStampInfo((ApkSignerInfo) C0071.m6078(C0111.m13075(apkSigResult), 0), null);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(C0022.m1728(m593(), 0, 45, 358));
            C0021.m1551(sb, C0016.m707(apkSigResult));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
    }

    public static EnumMap a(List list, DataSource dataSource, ZipSections zipSections, Result result) throws ApkFormatException {
        ArrayList arrayList = new ArrayList(1);
        EnumMap enumMap = new EnumMap(ContentDigestAlgorithm.class);
        Iterator itM4732 = C0065.m4732(list);
        CentralDirectoryRecord centralDirectoryRecord = null;
        while (C0036.m3657(itM4732)) {
            CentralDirectoryRecord centralDirectoryRecord2 = (CentralDirectoryRecord) C0071.m6012(itM4732);
            String strM6387 = C0073.m6387(centralDirectoryRecord2);
            if (strM6387 != null) {
                if (centralDirectoryRecord == null && C0070.m5838(C0023.m1904(m591(), 0, 20, 2520), strM6387)) {
                    centralDirectoryRecord = centralDirectoryRecord2;
                } else if (C0019.m1242(strM6387, C0034.m3431(m591(), 20, 9, 3125)) && (C0072.m6150(strM6387, C0039.m4066(m591(), 29, 4, 1084)) || C0072.m6150(strM6387, C0077.m7205(m591(), 33, 4, 1057)) || C0072.m6150(strM6387, C0016.m625(m591(), 37, 3, 1047)))) {
                    C0017.m919(arrayList, centralDirectoryRecord2);
                }
            }
        }
        if (centralDirectoryRecord == null) {
            return enumMap;
        }
        boolean zM4881 = C0066.m4881(arrayList);
        String strM1650 = C0021.m1650(m591(), 40, 18, 3016);
        if (zM4881) {
            C0025.m2147(result, 36, new Object[0]);
        } else {
            Iterator itM4154 = C0039.m4154(arrayList);
            while (C0036.m3657(itM4154)) {
                CentralDirectoryRecord centralDirectoryRecord3 = (CentralDirectoryRecord) C0071.m6012(itM4154);
                try {
                    Iterator itM4820 = C0066.m4820(C0031.m3070(C0074.m6461(C0035.m3603(m591(), 58, 5, 846)), new ByteArrayInputStream(C0021.m1585(dataSource, centralDirectoryRecord3, C0030.m2922(zipSections)))));
                    while (true) {
                        if (C0036.m3657(itM4820)) {
                            Certificate certificate = (Certificate) C0071.m6012(itM4820);
                            if (certificate instanceof X509Certificate) {
                                Result.SignerInfo signerInfo = new Result.SignerInfo();
                                C0021.m1602(signerInfo, (X509Certificate) certificate);
                                C0072.m6154(result, signerInfo);
                                break;
                            }
                        }
                    }
                } catch (ZipFormatException e) {
                    throw new ApkFormatException(strM1650, e);
                } catch (CertificateException e2) {
                    C0025.m2147(result, 37, new Object[]{C0073.m6387(centralDirectoryRecord3), e2});
                }
            }
        }
        try {
            C0064.m4617(enumMap, C0111.m13173(), C0028.m2551(C0021.m1585(dataSource, centralDirectoryRecord, C0030.m2922(zipSections))));
            return enumMap;
        } catch (ZipFormatException e3) {
            throw new ApkFormatException(strM1650, e3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m591() {
        if (C0063.m4427() >= 0) {
            return f35short;
        }
        return null;
    }

    public final void b(ByteBuffer byteBuffer, int i, CertificateFactory certificateFactory, Map map, Result.SignerInfo signerInfo) {
        boolean z = i == 2;
        ByteBuffer byteBufferM13168 = C0111.m13168(byteBuffer);
        ByteBuffer byteBufferM131682 = C0111.m13168(byteBufferM13168);
        ByteBuffer byteBufferM131683 = C0111.m13168(byteBufferM13168);
        if (i == 31) {
            int iM4566 = C0064.m4566(byteBufferM13168);
            int iM45662 = C0064.m4566(byteBufferM13168);
            C0036.m3710(signerInfo, iM4566);
            C0031.m2991(signerInfo, iM45662);
            if (iM45662 < C0068.m5583(this) || C0073.m6380(signerInfo) > C0066.m4825(this)) {
                return;
            }
        }
        while (C0111.m13127(byteBufferM131682)) {
            try {
                ByteBuffer byteBufferM131684 = C0111.m13168(byteBufferM131682);
                int iM45663 = C0064.m4566(byteBufferM131684);
                byte[] bArrM2313 = C0026.m2313(byteBufferM131684);
                SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(iM45663);
                if (signatureAlgorithmM4321 != null) {
                    C0035.m3624(map, C0030.m2948(signatureAlgorithmM4321), bArrM2313);
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                C0029.m2775(signerInfo, z ? 8 : 16, new Object[0]);
                return;
            }
        }
        if (C0111.m13127(byteBufferM131683)) {
            byte[] bArrM23132 = C0026.m2313(byteBufferM131683);
            try {
                C0021.m1602(signerInfo, new GuaranteedEncodedFormX509Certificate((X509Certificate) C0017.m835(certificateFactory, new ByteArrayInputStream(bArrM23132)), bArrM23132));
            } catch (CertificateException unused2) {
                C0029.m2775(signerInfo, z ? 6 : 14, new Object[0]);
                return;
            }
        }
        if (C0034.m3409(signerInfo) == null) {
            C0029.m2775(signerInfo, z ? 7 : 15, new Object[0]);
        }
    }

    public Result verifySourceStamp() {
        return C0025.m2156(this, null);
    }

    public final Result c(DataSource dataSource, String str) {
        CentralDirectoryRecord centralDirectoryRecord;
        SignatureInfo signatureInfoM644;
        SignatureInfo signatureInfoM6442;
        SignatureInfo signatureInfoM6443;
        Result result = new Result();
        try {
            try {
                ZipSections zipSectionsM4556 = C0064.m4556(dataSource);
                List listM4371 = C0063.m4371(dataSource, zipSectionsM4556);
                Iterator itM4732 = C0065.m4732(listM4371);
                while (true) {
                    if (!C0036.m3657(itM4732)) {
                        centralDirectoryRecord = null;
                        break;
                    }
                    centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4732);
                    if (C0070.m5838(C0039.m4066(m591(), 63, 17, 1358), C0073.m6387(centralDirectoryRecord))) {
                        break;
                    }
                }
                int i = 24;
                if (centralDirectoryRecord == null) {
                    try {
                        C0016.m644(dataSource, zipSectionsM4556, 1845461005);
                    } catch (SignatureNotFoundException unused) {
                        i = 25;
                    }
                    C0032.m3128(result, i, new Object[0]);
                    return result;
                }
                byte[] bArrM1585 = C0021.m1585(dataSource, centralDirectoryRecord, C0030.m2922(zipSectionsM4556));
                if (str != null) {
                    String strM6092 = C0071.m6092(bArrM1585);
                    if (!C0025.m2111(str, strM6092)) {
                        C0032.m3128(result, 23, new Object[]{strM6092, str});
                        return result;
                    }
                }
                HashMap map = new HashMap();
                int iM4825 = C0066.m4825(this);
                if (iM4825 >= 33) {
                    try {
                        signatureInfoM6443 = C0016.m644(dataSource, zipSectionsM4556, 462663009);
                    } catch (SignatureNotFoundException unused2) {
                        signatureInfoM6443 = null;
                    }
                    if (signatureInfoM6443 != null) {
                        EnumMap enumMap = new EnumMap(ContentDigestAlgorithm.class);
                        C0023.m1814(this, C0067.m5410(signatureInfoM6443), 31, enumMap, result);
                        C0038.m3969(map, C0021.m1548(31), enumMap);
                    }
                }
                if (iM4825 >= 28) {
                    try {
                        signatureInfoM6442 = C0016.m644(dataSource, zipSectionsM4556, -262969152);
                    } catch (SignatureNotFoundException unused3) {
                        signatureInfoM6442 = null;
                    }
                    if (signatureInfoM6442 != null) {
                        EnumMap enumMap2 = new EnumMap(ContentDigestAlgorithm.class);
                        C0023.m1814(this, C0067.m5410(signatureInfoM6442), 3, enumMap2, result);
                        C0038.m3969(map, C0021.m1548(3), enumMap2);
                    }
                }
                int iM5583 = C0068.m5583(this);
                if (iM4825 >= 24 && (iM5583 < 28 || C0035.m3592(map))) {
                    try {
                        signatureInfoM644 = C0016.m644(dataSource, zipSectionsM4556, 1896449818);
                    } catch (SignatureNotFoundException unused4) {
                        signatureInfoM644 = null;
                    }
                    if (signatureInfoM644 != null) {
                        EnumMap enumMap3 = new EnumMap(ContentDigestAlgorithm.class);
                        C0023.m1814(this, C0067.m5410(signatureInfoM644), 2, enumMap3, result);
                        C0038.m3969(map, C0021.m1548(2), enumMap3);
                    }
                }
                if (iM5583 < 24 || C0035.m3592(map)) {
                    C0038.m3969(map, C0021.m1548(1), C0078.m7458(listM4371, dataSource, zipSectionsM4556, result));
                }
                C0075.m6828(result, C0035.m3536(dataSource, zipSectionsM4556, bArrM1585, map, C0068.m5583(this), C0066.m4825(this)));
                return result;
            } catch (ApkFormatException e) {
                e = e;
                C0032.m3128(result, 28, new Object[]{e});
                return result;
            } catch (ZipFormatException e2) {
                e = e2;
                C0032.m3128(result, 28, new Object[]{e});
                return result;
            } catch (IOException e3) {
                e = e3;
                C0032.m3128(result, 28, new Object[]{e});
                return result;
            } catch (NoSuchAlgorithmException e4) {
                C0032.m3128(result, 29, new Object[]{e4});
                return result;
            }
        } catch (SignatureNotFoundException unused5) {
            C0032.m3128(result, 30, new Object[0]);
            return result;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseSigners(java.nio.ByteBuffer r68, int r69, java.util.Map<com.android.apksig.internal.apk.ContentDigestAlgorithm, byte[]> r70, com.android.apksig.SourceStampVerifier.Result r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.SourceStampVerifier.parseSigners(java.nio.ByteBuffer, int, java.util.Map, com.android.apksig.SourceStampVerifier$Result):void");
    }

    public Result verifySourceStamp(String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                DataSource dataSourceM3385 = C0034.m3385(this);
                if (dataSourceM3385 == null) {
                    File fileM1655 = C0022.m1655(this);
                    if (fileM1655 == null) {
                        throw new IllegalStateException(C0025.m2151(m591(), WorkQueueKt.MASK, 16, 2888));
                    }
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileM1655, C0064.m4545(m591(), 126, 1, 428));
                    try {
                        dataSourceM3385 = C0034.m3388(randomAccessFile2, 0L, C0028.m2600(randomAccessFile2));
                        randomAccessFile = randomAccessFile2;
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile = randomAccessFile2;
                        Result result = new Result();
                        C0032.m3128(result, 29, new Object[]{e});
                        if (randomAccessFile != null) {
                            try {
                                C0022.m1770(randomAccessFile);
                            } catch (IOException unused) {
                            }
                        }
                        return result;
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                C0022.m1770(randomAccessFile);
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                Result resultM2629 = C0028.m2629(this, dataSourceM3385, str);
                if (randomAccessFile != null) {
                    try {
                        C0022.m1770(randomAccessFile);
                    } catch (IOException unused3) {
                    }
                }
                return resultM2629;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public SourceStampVerifier(File file, DataSource dataSource, int i, int i2, AnonymousClass1 anonymousClass1) {
        this.a = file;
        this.b = dataSource;
        this.c = i;
        this.d = i2;
    }
}
