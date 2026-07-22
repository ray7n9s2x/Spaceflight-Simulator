package com.android.apksig;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.SignatureNotFoundException;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.apk.v3.V3SchemeVerifier;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.location.LocationRequest;
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
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0461w;
import com.zfork.multiplatforms.android.bomb.C0467x;
import com.zfork.multiplatforms.android.bomb.C0473y;
import com.zfork.multiplatforms.android.bomb.r;
import j$.util.OptionalInt;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ApkVerifier {
    public static final HashMap g;
    public final File a;
    public final DataSource b;
    public final File c;
    public final Integer d;
    public final int e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f20short = {1512, 1529, 1506, 1417, 1530, 1472, 1486, 1479, 1480, 1501, 1500, 1499, 1484, 1417, 1530, 1482, 1473, 1484, 1476, 1484, 1417, 1503, 1435, 1154, 1171, 1160, 1251, 1168, 1194, 1188, 1197, 1186, 1207, 1206, 1201, 1190, 1251, 1168, 1184, 1195, 1190, 1198, 1190, 1251, 1205, 1264, 3066, 3037, 3029, 3024, 3033, 3032, 2972, 3016, 3027, 2972, 3033, 3026, 3039, 3027, 3032, 3033, 2972, 3069, 3052, 3063, 2972, 3023, 3029, 3035, 3026, 3033, 3022, 2972, 3039, 3033, 3022, 3016, 300, 267, 259, 262, 271, 270, 330, 286, 261, 330, 280, 271, 267, 270, 330, 299, 260, 270, 280, 261, 259, 270, 295, 267, 260, 259, 268, 271, 281, 286, 324, 274, 263, 262, 2004, 2012, 1997, 2008, 1972, 2000, 2007, 2015, 1974, 2004, 2008, 2007, 2000, 2015, 2012, 1994, 1997, 1975, 2004, 2015, 748, 715, 707, 710, 719, 718, 650, 734, 709, 650, 728, 719, 715, 718, 650, 747, 762, 737, 1212, 1211, 1198, 1186, 1215, 1250, 1196, 1194, 1213, 1211, 1250, 1212, 1191, 1198, 1277, 1274, 1273, 2475, 2444, 2436, 2433, 2440, 2441, 2509, 2457, 2434, 2509, 2463, 2440, 2444, 2441, 2509, 2476, 2493, 2470, 1013, 978, 986, 991, 982, 983, 915, 967, 988, 915, 982, 989, 976, 988, 983, 982, 915, 1017, 1010, 993, 915, 960, 986, 980, 989, 982, 961, 915, 1267, 1200, 1206, 1185, 1191, 1184, 913, 950, 958, 955, 946, 947, 1015, 931, 952, 1015, 946, 953, 948, 952, 947, 946, 1015, 918, 903, 924, 1015, 900, 958, 944, 953, 950, 931, 930, 933, 946, 1015, 900, 948, 959, 946, 954, 946, 1015, 929, 997, 1015, 932, 958, 944, 953, 946, 933, 1015, 1023, 958, 953, 947, 946, 943, 1005, 1015, 2568, 2561, 2626, 2628, 2643, 2645, 2642, 1733, 1762, 1770, 1775, 1766, 1767, 1699, 1783, 1772, 1699, 1766, 1773, 1760, 1772, 1767, 1766, 1699, 1730, 1747, 1736, 1699, 1744, 1770, 1764, 1773, 1762, 1783, 1782, 1777, 1766, 1699, 1744, 1760, 1771, 1766, 1774, 1766, 1699, 1781, 1712, 1699, 1776, 1770, 1764, 1773, 1766, 1777, 1699, 1760, 1766, 1777, 1783, 3102, 3196, 3176, 3131, 3105, 3119, 3110, 3113, 3132, 3133, 3130, 3117, 3176, 3109, 3133, 3131, 3132, 3176, 3114, 3117, 3176, 3113, 3108, 3131, 3111, 3176, 3134, 3117, 3130, 3105, 3118, 3105, 3117, 3116, 3176, 3135, 3105, 3132, 3104, 3176, 3102, 3194, 3175, 3102, 3195, 1384, 1401, 1378, 1289, 1375, 1356, 1371, 1344, 1359, 1344, 1356, 1357, 1285, 1289, 1355, 1372, 1373, 1289, 1345, 1352, 1370, 1289, 1351, 1350, 1373, 1289, 1375, 1356, 1371, 1344, 1359, 1344, 1356, 1357, 1289, 1372, 1370, 1344, 1351, 1358, 1289, 1352, 1351, 1360, 1289, 1350, 1359, 1289, 1375, 1304, 1285, 1289, 1375, 1307, 1289, 1350, 1371, 1289, 1375, 1306, 1289, 1370, 1354, 1345, 1356, 1348, 1356, 1370, 2499, 2543, 2530, 2536, 2529, 2556, 2531, 2539, 2538, 2478, 2511, 2526, 2501, 2484, 2478, 2528, 2529, 2554, 2478, 2543, 2478, 2516, 2503, 2526, 2478, 2543, 2556, 2541, 2534, 2535, 2552, 2539, 2504, 701, 692, 682, 692, 761, 757, 748, 711, 752, 767, 706, 753, 742, 743, 765, 763, 762, 692, 700, 2812, 2808, 2815, 2754, 2805, 2810, 2759, 2804, 2787, 2786, 2808, 2814, 2815, 2737, 2745, 1654, 1650, 1653, 1608, 1663, 1648, 1613, 1662, 1641, 1640, 1650, 1652, 1653, 1595, 1654, 1646, 1640, 1647, 1595, 1653, 1652, 1647, 1595, 1657, 1662, 1595, 1653, 1662, 1660, 1658, 1647, 1650, 1645, 1662, 1569, 1595, 1252, 1248, 1255, 1242, 1261, 1250, 1247, 1260, 1275, 1274, 1248, 1254, 1255, 1193, 1263, 1275, 1254, 1252, 1193, 1224, 1241, 1218, 1193, 1185, 1719, 1712, 1701, 1705, 1716, 1769, 1703, 1697, 1718, 1712, 1769, 1719, 1708, 1701, 1782, 1777, 1778, 1709, 2240, 2257, 2250, 2209, 2287, 2286, 2293, 2209, 2289, 2291, 2286, 2295, 2280, 2277, 2276, 2277, 2483, 2969, 2952, 2963, 3064, 2998, 2999, 2988, 3064, 2984, 2986, 2999, 2990, 2993, 3004, 3005, 3004};
    public static final HashSet f = new HashSet(C0021.m1596(new Issue[]{C0017.m836(), C0077.m7216(), C0072.m6124(), C0031.m3073()}));

    /* JADX INFO: renamed from: com.android.apksig.ApkVerifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ApkVerificationIssueAdapter {
        static final Map<Integer, Issue> sVerificationIssueIdToIssue;

        /* JADX INFO: renamed from: ۡ۟۠ۨ, reason: not valid java name and contains not printable characters */
        public static Map m523() {
            if (C0077.m7272() < 0) {
                return sVerificationIssueIdToIssue;
            }
            return null;
        }

        static {
            HashMap map = new HashMap();
            sVerificationIssueIdToIssue = map;
            C0035.m3624(map, C0021.m1548(1), C0034.m3406());
            C0035.m3624(map, C0021.m1548(2), C0077.m7215());
            C0035.m3624(map, C0021.m1548(3), C0077.m7218());
            C0035.m3624(map, C0021.m1548(4), C0027.m2464());
            C0035.m3624(map, C0021.m1548(5), C0035.m3637());
            C0035.m3624(map, C0021.m1548(6), C0029.m2805());
            C0035.m3624(map, C0021.m1548(7), C0017.m855());
            C0035.m3624(map, C0021.m1548(8), C0075.m6787());
            C0035.m3624(map, C0021.m1548(9), C0067.m5526());
            C0035.m3624(map, C0021.m1548(10), C0029.m2787());
            C0035.m3624(map, C0021.m1548(11), C0029.m2701());
            C0035.m3624(map, C0021.m1548(12), C0033.m3346());
            C0035.m3624(map, C0021.m1548(13), C0064.m4553());
            C0035.m3624(map, C0021.m1548(14), C0077.m7304());
            C0035.m3624(map, C0021.m1548(15), C0070.m5943());
            C0035.m3624(map, C0021.m1548(16), C0071.m6000());
            C0035.m3624(map, C0021.m1548(17), C0023.m1810());
            C0035.m3624(map, C0021.m1548(18), C0023.m1876());
            C0035.m3624(map, C0021.m1548(19), C0071.m6088());
            C0035.m3624(map, C0021.m1548(20), C0078.m7442());
            C0035.m3624(map, C0021.m1548(21), C0063.m4365());
            C0035.m3624(map, C0021.m1548(22), C0027.m2433());
            C0035.m3624(map, C0021.m1548(23), C0063.m4414());
            C0035.m3624(map, C0021.m1548(24), C0018.m1039());
            C0035.m3624(map, C0021.m1548(25), C0021.m1590());
            C0035.m3624(map, C0021.m1548(26), C0078.m7326());
            C0035.m3624(map, C0021.m1548(27), C0075.m6823());
            C0035.m3624(map, C0021.m1548(28), C0067.m5494());
            C0035.m3624(map, C0021.m1548(29), C0069.m5713());
            C0035.m3624(map, C0021.m1548(30), C0063.m4398());
            C0035.m3624(map, C0021.m1548(31), C0031.m3078());
            C0035.m3624(map, C0021.m1548(32), C0030.m2892());
            C0035.m3624(map, C0021.m1548(33), C0073.m6425());
            C0035.m3624(map, C0021.m1548(34), C0028.m2657());
            C0035.m3624(map, C0021.m1548(35), C0068.m5613());
            C0035.m3624(map, C0021.m1548(36), C0064.m4535());
            C0035.m3624(map, C0021.m1548(37), C0016.m711());
            C0035.m3624(map, C0021.m1548(38), C0019.m1251());
            C0035.m3624(map, C0021.m1548(39), C0071.m5970());
        }

        public static List<IssueWithParams> getIssuesFromVerificationIssues(List<? extends ApkVerificationIssue> list) {
            ArrayList arrayList = new ArrayList(C0034.m3427(list));
            Iterator itM4732 = C0065.m4732(list);
            while (C0036.m3657(itM4732)) {
                ApkVerificationIssue apkVerificationIssue = (ApkVerificationIssue) C0071.m6012(itM4732);
                if (apkVerificationIssue instanceof IssueWithParams) {
                    C0017.m919(arrayList, (IssueWithParams) apkVerificationIssue);
                } else {
                    C0017.m919(arrayList, new IssueWithParams((Issue) C0072.m6108(m523(), C0021.m1548(C0017.m828(apkVerificationIssue))), C0021.m1556(apkVerificationIssue)));
                }
            }
            return arrayList;
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f21short = {924, 909, 918, 989, 960, 960, 989, 915, 904, 913, 913, 2629, 2644, 2639, 2564, 2585, 2585, 2564, 2634, 2641, 2632, 2632};
        public final File a;
        public final DataSource b;
        public File c;
        public Integer d;
        public int e = Integer.MAX_VALUE;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException(C0035.m3603(m524(), 11, 11, 2596));
            }
            this.a = file;
            this.b = null;
        }

        /* JADX INFO: renamed from: ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
        public static short[] m524() {
            if (C0028.m2593() >= 0) {
                return f21short;
            }
            return null;
        }

        public ApkVerifier build() {
            return new ApkVerifier(C0017.m915(this), C0017.m947(this), C0038.m4041(this), C0030.m2947(this), C0036.m3771(this), null);
        }

        public Builder setMaxCheckedPlatformVersion(int i) {
            this.e = i;
            return this;
        }

        public Builder setV4SignatureFile(File file) {
            this.c = file;
            return this;
        }

        public Builder setMinCheckedPlatformVersion(int i) {
            this.d = C0021.m1548(i);
            return this;
        }

        public Builder(DataSource dataSource) {
            if (dataSource != null) {
                this.b = dataSource;
                this.a = null;
                return;
            }
            throw new NullPointerException(C0025.m2151(m524(), 0, 11, PointerIconCompat.TYPE_GRABBING));
        }
    }

    public static class ByteArray {
        public final byte[] a;
        public final int b;

        /* JADX INFO: renamed from: ۟ۥ۠ۥۦ, reason: not valid java name and contains not printable characters */
        public static int m525(Object obj) {
            if (C0111.m13165() < 0) {
                return ((ByteArray) obj).b;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۟ۦۤ۠۠, reason: not valid java name and contains not printable characters */
        public static byte[] m526(Object obj) {
            if (C0063.m4427() > 0) {
                return ((ByteArray) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
        public static int m527(Object obj) {
            if (C0021.m1598() <= 0) {
                return ((ByteArray) obj).hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ByteArray)) {
                return false;
            }
            ByteArray byteArray = (ByteArray) obj;
            return m527(this) == m527(byteArray) && C0073.m6306(m526(this), m526(byteArray));
        }

        public int hashCode() {
            return m525(this);
        }

        public ByteArray(byte[] bArr, AnonymousClass1 anonymousClass1) {
            this.a = bArr;
            this.b = C0027.m2466(bArr);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'V2_SIG_MALFORMED_SIGNERS' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Issue {
        public static final Issue APK_SIG_BLOCK_UNKNOWN_ENTRY_ID;
        public static final Issue JAR_SIG_DID_NOT_VERIFY;
        public static final Issue JAR_SIG_DUPLICATE_MANIFEST_SECTION;
        public static final Issue JAR_SIG_DUPLICATE_SIG_FILE_SECTION;
        public static final Issue JAR_SIG_DUPLICATE_ZIP_ENTRY;
        public static final Issue JAR_SIG_MALFORMED_CERTIFICATE;
        public static final Issue JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY;
        public static final Issue JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY;
        public static final Issue JAR_SIG_MAX_SIGNATURES_EXCEEDED;
        public static final Issue JAR_SIG_MISSING;
        public static final Issue JAR_SIG_MISSING_APK_SIG_REFERENCED;
        public static final Issue JAR_SIG_MISSING_FILE;
        public static final Issue JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE;
        public static final Issue JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST;
        public static final Issue JAR_SIG_NO_APK_SIG_STRIP_PROTECTION;
        public static final Issue JAR_SIG_NO_MANIFEST;
        public static final Issue JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE;
        public static final Issue JAR_SIG_NO_SIGNATURES;
        public static final Issue JAR_SIG_NO_SIGNED_ZIP_ENTRIES;
        public static final Issue JAR_SIG_NO_SIGNERS;
        public static final Issue JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST;
        public static final Issue JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE;
        public static final Issue JAR_SIG_PARSE_EXCEPTION;
        public static final Issue JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID;
        public static final Issue JAR_SIG_UNNNAMED_MANIFEST_SECTION;
        public static final Issue JAR_SIG_UNNNAMED_SIG_FILE_SECTION;
        public static final Issue JAR_SIG_UNPROTECTED_ZIP_ENTRY;
        public static final Issue JAR_SIG_UNSUPPORTED_SIG_ALG;
        public static final Issue JAR_SIG_VERIFY_EXCEPTION;
        public static final Issue JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY;
        public static final Issue JAR_SIG_ZIP_ENTRY_NOT_SIGNED;
        public static final Issue JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH;
        public static final Issue MALFORMED_APK;
        public static final Issue MIN_SIG_SCHEME_FOR_TARGET_SDK_NOT_MET;
        public static final Issue NO_SIG_FOR_TARGET_SANDBOX_VERSION;
        public static final Issue SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK;
        public static final Issue SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING;
        public static final Issue SOURCE_STAMP_DID_NOT_VERIFY;
        public static final Issue SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH;
        public static final Issue SOURCE_STAMP_INVALID_TIMESTAMP;
        public static final Issue SOURCE_STAMP_MALFORMED_ATTRIBUTE;
        public static final Issue SOURCE_STAMP_MALFORMED_CERTIFICATE;
        public static final Issue SOURCE_STAMP_MALFORMED_LINEAGE;
        public static final Issue SOURCE_STAMP_MALFORMED_SIGNATURE;
        public static final Issue SOURCE_STAMP_NO_SIGNATURE;
        public static final Issue SOURCE_STAMP_NO_SUPPORTED_SIGNATURE;
        public static final Issue SOURCE_STAMP_POR_CERT_MISMATCH;
        public static final Issue SOURCE_STAMP_POR_DID_NOT_VERIFY;
        public static final Issue SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST;
        public static final Issue SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE;
        public static final Issue SOURCE_STAMP_SIG_MISSING;
        public static final Issue SOURCE_STAMP_UNKNOWN_ATTRIBUTE;
        public static final Issue SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM;
        public static final Issue SOURCE_STAMP_VERIFY_EXCEPTION;
        public static final Issue UNEXPECTED_EXCEPTION;
        public static final Issue V2_SIG_APK_DIGEST_DID_NOT_VERIFY;
        public static final Issue V2_SIG_DID_NOT_VERIFY;
        public static final Issue V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE;
        public static final Issue V2_SIG_MALFORMED_CERTIFICATE;
        public static final Issue V2_SIG_MALFORMED_DIGEST;
        public static final Issue V2_SIG_MALFORMED_PUBLIC_KEY;
        public static final Issue V2_SIG_MALFORMED_SIGNATURE;
        public static final Issue V2_SIG_MALFORMED_SIGNER;
        public static final Issue V2_SIG_MALFORMED_SIGNERS;
        public static final Issue V2_SIG_MAX_SIGNATURES_EXCEEDED;
        public static final Issue V2_SIG_MISSING;
        public static final Issue V2_SIG_MISSING_APK_SIG_REFERENCED;
        public static final Issue V2_SIG_NO_CERTIFICATES;
        public static final Issue V2_SIG_NO_SIGNATURES;
        public static final Issue V2_SIG_NO_SIGNERS;
        public static final Issue V2_SIG_NO_SUPPORTED_SIGNATURES;
        public static final Issue V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD;
        public static final Issue V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS;
        public static final Issue V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE;
        public static final Issue V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID;
        public static final Issue V2_SIG_UNKNOWN_SIG_ALGORITHM;
        public static final Issue V2_SIG_VERIFY_EXCEPTION;
        public static final Issue V31_BLOCK_FOUND_WITHOUT_V3_BLOCK;
        public static final Issue V31_BLOCK_MISSING;
        public static final Issue V31_ROTATION_MIN_SDK_ATTR_MISSING;
        public static final Issue V31_ROTATION_MIN_SDK_MISMATCH;
        public static final Issue V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER;
        public static final Issue V3_INCONSISTENT_LINEAGES;
        public static final Issue V3_INCONSISTENT_SDK_VERSIONS;
        public static final Issue V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD;
        public static final Issue V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD;
        public static final Issue V3_MISSING_SDK_VERSIONS;
        public static final Issue V3_SIG_APK_DIGEST_DID_NOT_VERIFY;
        public static final Issue V3_SIG_DID_NOT_VERIFY;
        public static final Issue V3_SIG_INVALID_SDK_VERSIONS;
        public static final Issue V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE;
        public static final Issue V3_SIG_MALFORMED_CERTIFICATE;
        public static final Issue V3_SIG_MALFORMED_DIGEST;
        public static final Issue V3_SIG_MALFORMED_LINEAGE;
        public static final Issue V3_SIG_MALFORMED_PUBLIC_KEY;
        public static final Issue V3_SIG_MALFORMED_SIGNATURE;
        public static final Issue V3_SIG_MALFORMED_SIGNER;
        public static final Issue V3_SIG_MALFORMED_SIGNERS;
        public static final Issue V3_SIG_MULTIPLE_PAST_SIGNERS;
        public static final Issue V3_SIG_MULTIPLE_SIGNERS;
        public static final Issue V3_SIG_NO_CERTIFICATES;
        public static final Issue V3_SIG_NO_SIGNATURES;
        public static final Issue V3_SIG_NO_SIGNERS;
        public static final Issue V3_SIG_NO_SUPPORTED_SIGNATURES;
        public static final Issue V3_SIG_PAST_SIGNERS_MISMATCH;
        public static final Issue V3_SIG_POR_CERT_MISMATCH;
        public static final Issue V3_SIG_POR_DID_NOT_VERIFY;
        public static final Issue V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD;
        public static final Issue V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS;
        public static final Issue V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE;
        public static final Issue V3_SIG_UNKNOWN_SIG_ALGORITHM;
        public static final Issue V3_SIG_VERIFY_EXCEPTION;
        public static final Issue V41_SIG_NEEDS_TWO_SIGNERS;
        public static final Issue V4_SIG_APK_ROOT_DID_NOT_VERIFY;
        public static final Issue V4_SIG_APK_TREE_DID_NOT_VERIFY;
        public static final Issue V4_SIG_DID_NOT_VERIFY;
        public static final Issue V4_SIG_MALFORMED_CERTIFICATE;
        public static final Issue V4_SIG_MALFORMED_PUBLIC_KEY;
        public static final Issue V4_SIG_MALFORMED_SIGNERS;
        public static final Issue V4_SIG_MULTIPLE_SIGNERS;
        public static final Issue V4_SIG_NO_CERTIFICATE;
        public static final Issue V4_SIG_NO_SIGNATURES;
        public static final Issue V4_SIG_NO_SUPPORTED_SIGNATURES;
        public static final Issue V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD;
        public static final Issue V4_SIG_UNEXPECTED_DIGESTS;
        public static final Issue V4_SIG_UNKNOWN_SIG_ALGORITHM;
        public static final Issue V4_SIG_V2_V3_DIGESTS_MISMATCH;
        public static final Issue V4_SIG_V2_V3_SIGNERS_MISMATCH;
        public static final Issue V4_SIG_VERIFY_EXCEPTION;
        public static final Issue V4_SIG_VERSION_NOT_CURRENT;
        public static final /* synthetic */ Issue[] b;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f22short = {1024, 1057, 1134, 1028, 1039, 1052, 1134, 1085, 1063, 1065, 1056, 1071, 1082, 1083, 1084, 1067, 1085, 2684, 2679, 2660, 2665, 2661, 2687, 2673, 2665, 2680, 2681, 2665, 2661, 2687, 2673, 2680, 2679, 2658, 2659, 2660, 2675, 2661, 970, 987, 960, 939, 984, 994, 1004, 997, 1002, 1023, 1022, 1017, 1006, 939, 984, 1000, 995, 1006, 998, 1006, 939, 1021, 954, 939, 996, 997, 999, 1010, 939, 1016, 1022, 1019, 1019, 996, 1017, 1023, 1016, 939, 1002, 939, 998, 1002, 1011, 994, 998, 1022, 998, 939, 996, 1005, 939, 942, 954, 943, 1007, 939, 1016, 994, 1004, 997, 1006, 1017, 1016, 935, 939, 1005, 996, 1022, 997, 1007, 939, 942, 953, 943, 1007, 540, 535, 516, 521, 517, 543, 529, 521, 539, 535, 526, 521, 517, 543, 529, 536, 535, 514, 515, 516, 531, 517, 521, 531, 526, 533, 531, 531, 530, 531, 530, 945, 912, 991, 949, 958, 941, 991, 922, 913, 907, 909, 918, 922, 908, 991, 924, 912, 905, 922, 909, 922, 923, 991, 925, 902, 991, 949, 958, 941, 991, 908, 918, 920, 913, 926, 907, 906, 909, 922, 908, 1993, 1986, 2001, 2012, 2000, 1994, 1988, 2012, 1997, 1996, 2012, 2000, 1994, 1988, 1997, 1990, 1991, 2012, 2009, 1994, 2003, 2012, 1990, 1997, 2007, 2001, 1994, 1990, 2000, 1726, 1679, 1674, 1686, 1683, 1689, 1691, 1678, 1695, 1754, 1695, 1684, 1678, 1672, 1667, 1728, 1754, 1759, 1739, 1758, 1673, 1382, 1389, 1406, 1395, 1407, 1381, 1387, 1395, 1384, 1401, 1404, 1376, 1381, 1391, 1389, 1400, 1385, 1395, 1398, 1381, 1404, 1395, 1385, 1378, 1400, 1406, 1397, 478, 495, 490, 502, 499, 505, 507, 494, 511, 442, 489, 511, 505, 494, 499, 501, 500, 442, 499, 500, 442, 471, 479, 462, 475, 439, 467, 468, 476, 437, 471, 475, 468, 467, 476, 479, 457, 462, 436, 471, 476, 416, 442, 447, 427, 446, 489, 3194, 3185, 3170, 3183, 3171, 3193, 3191, 3183, 3188, 3173, 3168, 3196, 3193, 3187, 3185, 3172, 3189, 3183, 3197, 3185, 3198, 3193, 3190, 3189, 3171, 3172, 3183, 3171, 3189, 3187, 3172, 3193, 3199, 3198, 2311, 2347, 2342, 2348, 2341, 2360, 2343, 2351, 2350, 2410, 2311, 2319, 2334, 2315, 2407, 2307, 2308, 2316, 2405, 2311, 2315, 2308, 2307, 2316, 2319, 2329, 2334, 2404, 2311, 2316, 2416, 2410, 2339, 2340, 2364, 2339, 2350, 2367, 2347, 2342, 2410, 2361, 2351, 2345, 2366, 2339, 2341, 2340, 2410, 2409, 2415, 2427, 2414, 2350, 2410, 2350, 2341, 2351, 2361, 2410, 2340, 2341, 2366, 2410, 2338, 2347, 2364, 2351, 2410, 2347, 2410, 2340, 2347, 2343, 2351, 2408, 2403, 2416, 2429, 2417, 2411, 2405, 2429, 2423, 2412, 2412, 2412, 2403, 2415, 2407, 2406, 2429, 2415, 2403, 2412, 2411, 2404, 2407, 2417, 2422, 2429, 2417, 2407, 2401, 2422, 2411, 2413, 2412, 2481, 2461, 2448, 2458, 2451, 2446, 2449, 2457, 2456, 2524, 2521, 2509, 2520, 2447, 2502, 2524, 2453, 2450, 2442, 2453, 2456, 2441, 2461, 2448, 2524, 2447, 2457, 2463, 2440, 2453, 2451, 2450, 2524, 2527, 2521, 2510, 2520, 2456, 2524, 2456, 2451, 2457, 2447, 2524, 2450, 2451, 2440, 2524, 2452, 2461, 2442, 2457, 2524, 2461, 2524, 2450, 2461, 2449, 2457, 593, 602, 585, 580, 584, 594, 604, 580, 590, 597, 597, 597, 602, 598, 606, 607, 580, 584, 594, 604, 580, 605, 594, 599, 606, 580, 584, 606, 600, 591, 594, 596, 597, 1998, 2026, 2032, 2032, 2026, 2029, 2020, 1955, 1998, 1990, 2007, 1986, 1966, 1994, 1997, 1989, 1964, 1998, 1986, 1997, 1994, 1989, 1990, 2000, 2007, 1965, 1998, 1989, 3151, 3140, 3159, 3162, 3158, 3148, 3138, 3162, 3147, 3146, 3162, 3144, 3140, 3147, 3148, 3139, 3136, 3158, 3153, 3094, 3074, 3095, 3136, 3091, 3158, 3165, 3143, 3137, 3146, 3091, 3137, 3158, 3157, 3158, 3137, 3158, 3165, 3152, 3158, 3159, 3091, 3153, 3146, 3091, 3198, 3190, 3175, 3186, 3102, 3194, 3197, 3189, 3100, 3198, 3186, 3197, 3194, 3189, 3190, 3168, 3175, 3101, 3198, 3189, 3091, 3165, 3164, 3143, 3091, 3157, 3164, 3142, 3165, 3159, 3091, 3162, 3165, 3091, 3143, 3163, 3158, 3091, 3186, 3171, 3192, 2374, 2381, 2398, 2387, 2399, 2373, 2379, 2387, 2369, 2373, 2399, 2399, 2373, 2370, 2379, 2387, 2390, 2373, 2396, 2387, 2377, 2370, 2392, 2398, 2389, 2387, 2398, 2377, 2378, 2377, 2398, 2377, 2370, 2383, 2377, 2376, 2387, 2373, 2370, 2387, 2369, 2381, 2370, 2373, 2378, 2377, 2399, 2392, 1880, 1913, 1846, 1906, 1919, 1905, 1907, 1893, 1890, 1846, 1904, 1913, 1892, 1846, 1843, 1831, 1842, 1893, 1846, 1919, 1912, 1846, 1883, 1875, 1858, 1879, 1851, 1887, 1880, 1872, 1849, 1883, 1879, 1880, 1887, 1872, 1875, 1861, 1858, 1848, 1883, 1872, 1902, 1893, 1910, 1915, 1911, 1901, 1891, 1915, 1898, 1899, 1915, 1918, 1901, 1908, 1915, 1889, 1898, 1904, 1910, 1917, 1915, 1888, 1901, 1891, 1889, 1911, 1904, 1915, 1901, 1898, 1915, 1897, 1893, 1898, 1901, 1890, 1889, 1911, 1904, 2997, 2964, 3035, 2975, 2962, 2972, 2974, 2952, 2959, 3035, 2973, 2964, 2953, 3035, 3038, 3018, 3039, 2952, 3035, 2962, 2965, 3035, 3038, 3017, 3039, 2952, 1710, 1701, 1718, 1723, 1719, 1709, 1699, 1723, 1706, 1707, 1723, 1726, 1709, 1716, 1723, 1697, 1706, 1712, 1718, 1725, 1723, 1696, 1709, 1699, 1697, 1719, 1712, 1723, 1709, 1706, 1723, 1719, 1709, 1699, 1723, 1698, 1709, 1704, 1697, 1990, 2002, 1991, 1936, 1987, 1926, 1933, 1943, 1937, 1946, 1987, 1933, 1932, 1943, 1987, 1936, 1930, 1924, 1933, 1926, 1927, 2368, 2379, 2392, 2389, 2393, 2371, 2381, 2389, 2384, 2371, 2394, 2389, 2383, 2372, 2398, 2392, 2387, 2389, 2372, 2373, 2398, 2389, 2393, 2371, 2381, 2372, 2383, 2382, 709, 750, 756, 754, 745, 741, 755, 672, 677, 689, 676, 755, 672, 737, 750, 740, 672, 677, 691, 676, 755, 672, 737, 754, 741, 672, 755, 745, 743, 750, 741, 740, 672, 759, 745, 756, 744, 672, 740, 745, 742, 742, 741, 754, 741, 750, 756, 672, 755, 741, 756, 755, 672, 751, 742, 672, 755, 745, 743, 750, 741, 754, 755, 672, 698, 672, 700, 677, 690, 676, 755, 702, 672, 758, 755, 672, 700, 677, 692, 676, 755, 702, 1443, 1448, 1467, 1462, 1466, 1440, 1454, 1462, 1459, 1440, 1465, 1462, 1452, 1447, 1469, 1467, 1456, 1462, 1466, 1440, 
        1454, 1447, 1452, 1467, 1466, 1462, 1444, 1440, 1466, 1444, 1448, 1469, 1450, 1441, 1051, 1036, 1050, 1101, 1054, 1114, 1111, 1113, 1115, 1101, 1098, 1054, 1105, 1112, 1054, 1051, 1039, 1050, 1101, 1054, 1114, 1105, 1115, 1101, 1054, 1104, 1105, 1098, 1054, 1107, 1119, 1098, 1117, 1110, 1054, 1098, 1110, 1115, 1054, 1114, 1111, 1113, 1115, 1101, 1098, 1054, 1101, 1102, 1115, 1117, 1111, 1112, 1111, 1115, 1114, 1054, 1111, 1104, 1054, 1051, 1037, 1050, 1101, 1040, 1054, 1147, 1094, 1102, 1115, 1117, 1098, 1115, 1114, 1028, 1054, 1026, 1051, 1035, 1050, 1101, 1024, 1042, 1054, 1119, 1117, 1098, 1099, 1119, 1106, 1028, 1054, 1026, 1051, 1034, 1050, 1101, 1024, 2329, 2322, 2305, 2316, 2304, 2330, 2324, 2316, 2313, 2330, 2307, 2316, 2326, 2333, 2311, 2305, 2314, 2316, 2327, 2330, 2324, 2326, 2304, 2311, 2316, 2327, 2330, 2327, 2316, 2333, 2332, 2311, 2316, 2309, 2326, 2305, 2330, 2325, 2314, 2034, 2022, 2035, 1956, 2039, 1971, 1982, 1968, 1970, 1956, 1955, 2039, 1976, 1969, 2039, 1946, 1938, 1923, 1942, 2042, 1950, 1945, 1937, 2040, 1946, 1942, 1945, 1950, 1937, 1938, 1924, 1923, 2041, 1946, 1937, 2039, 1978, 1974, 1982, 1977, 2039, 1956, 1970, 1972, 1955, 1982, 1976, 1977, 2039, 1971, 1976, 1970, 1956, 2039, 1977, 1976, 1955, 2039, 1978, 1974, 1955, 1972, 1983, 2039, 1955, 1983, 1970, 2039, 1971, 1982, 1968, 1970, 1956, 1955, 2039, 1956, 1959, 1970, 1972, 1982, 1969, 1982, 1970, 1971, 2039, 1982, 1977, 2039, 2034, 2021, 2035, 1956, 2041, 2039, 1938, 1967, 1959, 1970, 1972, 1955, 1970, 1971, 2029, 2039, 2027, 2034, 2019, 2035, 1956, 2025, 2043, 2039, 1974, 1972, 1955, 1954, 1974, 1979, 2029, 2039, 2027, 2034, 2020, 2035, 1956, 2025, 1798, 1805, 1822, 1811, 1823, 1797, 1803, 1811, 1793, 1805, 1794, 1797, 1802, 1801, 1823, 1816, 1811, 1793, 1805, 1797, 1794, 1811, 1823, 1801, 1807, 1816, 1797, 1795, 1794, 1811, 1800, 1797, 1803, 1801, 1823, 1816, 1811, 1800, 1797, 1800, 1811, 1794, 1795, 1816, 1811, 1818, 1801, 1822, 1797, 1802, 1813, 850, 837, 851, 772, 855, 787, 798, 784, 786, 772, 771, 855, 792, 785, 855, 826, 818, 803, 822, 858, 830, 825, 817, 856, 826, 822, 825, 830, 817, 818, 804, 803, 857, 826, 817, 855, 772, 786, 788, 771, 798, 792, 793, 855, 785, 792, 773, 855, 850, 838, 851, 772, 855, 787, 792, 786, 772, 855, 793, 792, 771, 855, 794, 790, 771, 788, 799, 855, 771, 799, 786, 855, 787, 798, 784, 786, 772, 771, 855, 772, 775, 786, 788, 798, 785, 798, 786, 787, 855, 798, 793, 855, 850, 836, 851, 772, 857, 855, 818, 783, 775, 786, 788, 771, 786, 787, 845, 855, 843, 850, 834, 851, 772, 841, 859, 855, 790, 788, 771, 770, 790, 795, 845, 855, 843, 850, 835, 851, 772, 841, 416, 427, 440, 437, 441, 419, 429, 437, 423, 427, 420, 419, 428, 431, 441, 446, 437, 441, 431, 425, 446, 419, 421, 420, 437, 430, 419, 429, 431, 441, 446, 437, 430, 419, 430, 437, 420, 421, 446, 437, 444, 431, 440, 419, 428, 435, 885, 865, 884, 803, 880, 820, 831, 821, 803, 880, 830, 831, 804, 880, 803, 800, 821, 819, 825, 822, 809, 880, 820, 825, 823, 821, 803, 804, 880, 831, 822, 880, 797, 789, 772, 785, 893, 793, 798, 790, 895, 797, 785, 798, 793, 790, 789, 771, 772, 894, 797, 790, 894, 880, 772, 824, 825, 803, 880, 803, 828, 831, 807, 803, 880, 820, 831, 807, 830, 880, 806, 821, 802, 825, 822, 825, 819, 817, 804, 825, 831, 830, 894, 2798, 2789, 2806, 2811, 2807, 2797, 2787, 2811, 2794, 2795, 2811, 2793, 2789, 2794, 2797, 2786, 2785, 2807, 2800, 2811, 2784, 2797, 2787, 2785, 2807, 2800, 2811, 2797, 2794, 2811, 2807, 2797, 2787, 2811, 2786, 2797, 2792, 2785, 1873, 1856, 1883, 1840, 1913, 1891, 1840, 1891, 1913, 1911, 1918, 1909, 1908, 1840, 1893, 1891, 1913, 1918, 1911, 1840, 1873, 1856, 1883, 1840, 1859, 1913, 1911, 1918, 1905, 1892, 1893, 1890, 1909, 1840, 1859, 1907, 1912, 1909, 1917, 1909, 1840, 1894, 1826, 1840, 1906, 1893, 1892, 1840, 1892, 1912, 1909, 1891, 1909, 1840, 1891, 1913, 1911, 1918, 1905, 1892, 1893, 1890, 1909, 1891, 1840, 1917, 1905, 1897, 1840, 1906, 1909, 1840, 1891, 1892, 1890, 1913, 1888, 1888, 1909, 1908, 1840, 1895, 1913, 1892, 1912, 1919, 1893, 1892, 1840, 1906, 1909, 1913, 1918, 1911, 1840, 1908, 1909, 1892, 1909, 1907, 1892, 1909, 1908, 1840, 1906, 1909, 1907, 1905, 1893, 1891, 1909, 1840, 1845, 1825, 1844, 1891, 1840, 1908, 1919, 1909, 1891, 1840, 1918, 1919, 1892, 1840, 1907, 1919, 1918, 1892, 1905, 1913, 1918, 1840, 1905, 1918, 1892, 1913, 1853, 1891, 1892, 1890, 1913, 1888, 1888, 1913, 1918, 1911, 1840, 1888, 1890, 1919, 1892, 1909, 1907, 1892, 1913, 1919, 1918, 1891, 1854, 2524, 2519, 2500, 2505, 2501, 2527, 2513, 2505, 2520, 2521, 2505, 2519, 2502, 2525, 2505, 2501, 2527, 2513, 2505, 2501, 2498, 2500, 2527, 2502, 2505, 2502, 2500, 2521, 2498, 2515, 2517, 2498, 2527, 2521, 2520, 2688, 2737, 2722, 2724, 2745, 2737, 2748, 2800, 2714, 2705, 2690, 2800, 2723, 2745, 2743, 2750, 2737, 2724, 2725, 2722, 2741, 2814, 2800, 2710, 2751, 2725, 2750, 2740, 2794, 2800, 2805, 2785, 2804, 2723, 2812, 2800, 2749, 2745, 2723, 2723, 2745, 2750, 2743, 2794, 2800, 2805, 2786, 2804, 2723, 3142, 3149, 3166, 3155, 3167, 3141, 3147, 3155, 3137, 3141, 3167, 3167, 3141, 3138, 3147, 3155, 3146, 3141, 3136, 3145, 2262, 2289, 2297, 2300, 2293, 2292, 2224, 2276, 2303, 2224, 2278, 2293, 2274, 2297, 2294, 2281, 2224, 2266, 2257, 2242, 2224, 2275, 2297, 2295, 2302, 2289, 2276, 2277, 2274, 2293, 2224, 2229, 2209, 2228, 2275, 2224, 2289, 2295, 2289, 2297, 2302, 2275, 2276, 2224, 2229, 2210, 2228, 2275, 2218, 2224, 2229, 2211, 2228, 2275, 307, 312, 299, 294, 298, 304, 318, 294, 303, 316, 299, 304, 319, 288, 294, 316, 289, 314, 316, 297, 301, 304, 310, 311, 1212, 1207, 1188, 1238, 1157, 1183, 1169, 1176, 1175, 1154, 1155, 1156, 1171, 1238, 1235, 1223, 1234, 1157, 1238, 1155, 1157, 1171, 1157, 1238, 1170, 1183, 1169, 1171, 1157, 1154, 1238, 1175, 1178, 
        1169, 1177, 1156, 1183, 1154, 1182, 1179, 1238, 1235, 1219, 1234, 1157, 1238, 1175, 1176, 1170, 1238, 1157, 1183, 1169, 1176, 1175, 1154, 1155, 1156, 1171, 1238, 1175, 1178, 1169, 1177, 1156, 1183, 1154, 1182, 1179, 1238, 1235, 1216, 1234, 1157, 1238, 1153, 1182, 1183, 1173, 1182, 1238, 1183, 1157, 1238, 1176, 1177, 1154, 1238, 1157, 1155, 1158, 1158, 1177, 1156, 1154, 1171, 1170, 1238, 1177, 1176, 1238, 1207, 1190, 1215, 1238, 1210, 1171, 1152, 1171, 1178, 1246, 1157, 1247, 1238, 1235, 1218, 1234, 1157, 1238, 1168, 1177, 1156, 1238, 1153, 1182, 1183, 1173, 1182, 1238, 1154, 1182, 1183, 1157, 1238, 1207, 1190, 1213, 1238, 1183, 1157, 1238, 1172, 1171, 1183, 1176, 1169, 1238, 1152, 1171, 1156, 1183, 1168, 1183, 1171, 1170, 2296, 2291, 2272, 2285, 2273, 2299, 2293, 2285, 2279, 2300, 2273, 2279, 2274, 2274, 2301, 2272, 2278, 2295, 2294, 2285, 2273, 2299, 2293, 2285, 2291, 2302, 2293, 1530, 1501, 1493, 1488, 1497, 1496, 1436, 1480, 1491, 1436, 1484, 1501, 1486, 1487, 1497, 1436, 1526, 1533, 1518, 1436, 1487, 1493, 1499, 1490, 1501, 1480, 1481, 1486, 1497, 1436, 1433, 1421, 1432, 1487, 1414, 1436, 1433, 1422, 1432, 1487, 2186, 2177, 2194, 2207, 2195, 2185, 2183, 2207, 2192, 2177, 2194, 2195, 2181, 2207, 2181, 2200, 2179, 2181, 2192, 2196, 2185, 2191, 2190, 1516, 1472, 1485, 1479, 1486, 1491, 1484, 1476, 1477, 1409, 1474, 1476, 1491, 1493, 1480, 1479, 1480, 1474, 1472, 1493, 1476, 1409, 1480, 1487, 1409, 1515, 1504, 1523, 1409, 1490, 1480, 1478, 1487, 1472, 1493, 1492, 1491, 1476, 1409, 1412, 1424, 1413, 1490, 1435, 1409, 1412, 1427, 1413, 1490, 3158, 3165, 3150, 3139, 3151, 3157, 3163, 3139, 3153, 3165, 3152, 3162, 3155, 3150, 3153, 3161, 3160, 3139, 3167, 3161, 3150, 3144, 3157, 3162, 3157, 3167, 3165, 3144, 3161, 1378, 1385, 1402, 1288, 1371, 1345, 1359, 1350, 1353, 1372, 1373, 1370, 1357, 1288, 1293, 1305, 1292, 1371, 1288, 1356, 1345, 1356, 1288, 1350, 1351, 1372, 1288, 1374, 1357, 1370, 1345, 1358, 1361, 1288, 1353, 1359, 1353, 1345, 1350, 1371, 1372, 1288, 1293, 1306, 1292, 1371, 1841, 1850, 1833, 1828, 1832, 1842, 1852, 1828, 1855, 1842, 1855, 1828, 1845, 1844, 1839, 1828, 1837, 1854, 1833, 1842, 1853, 1826, 2771, 2776, 2763, 2745, 2794, 2800, 2814, 2807, 2808, 2797, 2796, 2795, 2812, 2745, 2748, 2728, 2749, 2794, 2745, 2810, 2806, 2807, 2797, 2808, 2800, 2807, 2794, 2745, 2807, 2806, 2745, 2794, 2800, 2814, 2807, 2812, 2795, 2794, 2768, 2779, 2760, 2757, 2761, 2771, 2781, 2757, 2772, 2773, 2757, 2761, 2771, 2781, 2772, 2783, 2760, 2761, 1691, 1706, 1711, 1715, 1718, 1724, 1726, 1707, 1722, 1791, 1708, 1722, 1724, 1707, 1718, 1712, 1713, 1791, 1718, 1713, 1791, 1786, 1774, 1787, 1708, 1765, 1791, 1786, 1773, 1787, 1708, 1910, 1917, 1902, 1891, 1903, 1909, 1915, 1891, 1912, 1897, 1900, 1904, 1909, 1919, 1917, 1896, 1913, 1891, 1903, 1909, 1915, 1891, 1914, 1909, 1904, 1913, 1891, 1903, 1913, 1919, 1896, 1909, 1907, 1906, 1052, 1072, 1085, 1079, 1086, 1059, 1084, 1076, 1077, 1137, 1140, 1120, 1141, 1058, 1131, 1137, 1084, 1080, 1058, 1058, 1080, 1087, 1078, 1137, 1026, 1080, 1078, 1087, 1072, 1061, 1060, 1059, 1076, 1148, 1031, 1076, 1059, 1058, 1080, 1086, 1087, 1137, 1072, 1061, 1061, 1059, 1080, 1075, 1060, 1061, 1076, 2671, 2660, 2679, 2682, 2678, 2668, 2658, 2682, 2664, 2668, 2678, 2678, 2668, 2667, 2658, 2682, 2675, 2656, 2679, 2678, 2668, 2666, 2667, 2682, 2660, 2673, 2673, 2679, 2682, 2668, 2667, 2682, 2678, 2668, 2658, 2682, 2659, 2668, 2665, 2656, 1886, 1877, 1862, 1844, 1895, 1917, 1907, 1914, 1909, 1888, 1889, 1894, 1905, 1844, 1841, 1829, 1840, 1895, 1844, 1894, 1905, 1906, 1905, 1894, 1905, 1914, 1911, 1905, 1895, 1844, 1889, 1914, 1919, 1914, 1915, 1891, 1914, 1844, 1877, 1860, 1887, 1844, 1895, 1917, 1907, 1914, 1909, 1888, 1889, 1894, 1905, 1844, 1895, 1911, 1916, 1905, 1913, 1905, 1844, 1885, 1872, 1838, 1844, 1841, 1830, 1840, 1904, 1629, 1622, 1605, 1608, 1604, 1630, 1616, 1608, 1602, 1625, 1628, 1625, 1624, 1600, 1625, 1608, 1622, 1607, 1628, 1608, 1604, 1630, 1616, 1608, 1604, 1620, 1631, 1618, 1626, 1618, 1608, 1630, 1619, 2218, 2209, 2226, 2240, 2195, 2185, 2183, 2190, 2177, 2196, 2197, 2194, 2181, 2240, 2245, 2257, 2244, 2195, 2240, 2185, 2190, 2180, 2185, 2179, 2177, 2196, 2181, 2195, 2240, 2196, 2184, 2181, 2240, 2209, 2224, 2219, 2240, 2185, 2195, 2240, 2195, 2185, 2183, 2190, 2181, 2180, 2240, 2197, 2195, 2185, 2190, 2183, 2240, 2245, 2259, 2244, 2195, 2240, 2178, 2197, 2196, 2240, 2190, 2191, 2240, 2195, 2197, 2179, 2184, 2240, 2195, 2185, 2183, 2190, 2177, 2196, 2197, 2194, 2181, 2240, 2199, 2177, 2195, 2240, 2182, 2191, 2197, 2190, 2180, 2254, 2240, 2227, 2185, 2183, 2190, 2177, 2196, 2197, 2194, 2181, 2240, 2195, 2196, 2194, 2185, 2192, 2192, 2181, 2180, 2271, 2356, 2367, 2348, 2337, 2349, 2359, 2361, 2337, 2355, 2359, 2349, 2349, 2359, 2352, 2361, 2337, 2367, 2350, 2357, 2337, 2349, 2359, 2361, 2337, 2348, 2363, 2360, 2363, 2348, 2363, 2352, 2365, 2363, 2362, 1249, 1269, 1248, 1207, 1252, 1194, 1195, 1200, 1252, 1204, 1206, 1195, 1200, 1185, 1191, 1200, 1185, 1184, 1252, 1190, 1213, 1252, 1207, 1197, 1187, 1194, 1189, 1200, 1201, 1206, 1185, 1258, 1252, 1169, 1194, 1189, 1201, 1200, 1196, 1195, 1206, 1197, 1214, 1185, 1184, 1252, 1193, 1195, 1184, 1197, 1186, 1197, 1191, 1189, 1200, 1197, 1195, 1194, 1207, 1252, 1200, 1195, 1252, 1200, 1196, 1197, 1207, 1252, 1166, 1157, 1174, 1252, 1185, 1194, 1200, 1206, 1213, 1252, 1203, 1197, 1192, 1192, 1252, 1194, 1195, 1200, 1252, 1190, 1185, 1252, 1184, 1185, 1200, 1185, 1191, 1200, 1185, 1184, 1258, 1252, 1152, 1185, 1192, 1185, 1200, 1185, 1252, 1195, 1206, 1252, 1193, 1195, 1202, 1185, 1252, 1200, 1196, 1185, 1252, 1185, 1194, 1200, 1206, 1213, 1252, 1195, 1201, 1200, 1207, 1197, 1184, 1185, 1252, 1195, 1186, 1252, 1161, 1153, 1168, 1157, 1257, 1165, 1162, 1154, 1259, 1258, 403, 408, 395, 390, 394, 400, 414, 390, 396, 407, 393, 395, 406, 397, 412, 410, 397, 412, 413, 390, 387, 400, 393, 390, 412, 407, 397, 395, 384, 2099, 2066, 2141, 2103, 2108, 2095, 2141, 2062, 2068, 2074, 2067, 
        2076, 2057, 2056, 2063, 2072, 2141, 2075, 2063, 2066, 2064, 2141, 2057, 2069, 2068, 2062, 2141, 2062, 2068, 2074, 2067, 2072, 2063, 2941, 2934, 2917, 2920, 2916, 2942, 2928, 2920, 2938, 2942, 2916, 2916, 2942, 2937, 2928, 2290, 2262, 2252, 2252, 2262, 2257, 2264, 2207, 2302, 2287, 2292, 2207, 2284, 2262, 2264, 2257, 2270, 2251, 2250, 2253, 2266, 2207, 2284, 2268, 2263, 2266, 2258, 2266, 2207, 2249, 2189, 2207, 2252, 2262, 2264, 2257, 2270, 2251, 2250, 2253, 2266, 2207, 2253, 2266, 2254, 2250, 2262, 2253, 2266, 2267, 2207, 2265, 2256, 2253, 2207, 2251, 2270, 2253, 2264, 2266, 2251, 2207, 2252, 2270, 2257, 2267, 2269, 2256, 2247, 2207, 2249, 2266, 2253, 2252, 2262, 2256, 2257, 2207, 2202, 2190, 2203, 2267, 1669, 1668, 1684, 1688, 1666, 1676, 1684, 1677, 1668, 1689, 1684, 1695, 1674, 1689, 1676, 1678, 1695, 1684, 1688, 1674, 1669, 1679, 1673, 1668, 1683, 1684, 1693, 1678, 1689, 1688, 1666, 1668, 1669, 2010, 2031, 2044, 2025, 2027, 2042, 1966, 2013, 1994, 1989, 1966, 2040, 2027, 2044, 2045, 2023, 2017, 2016, 1966, 1963, 1983, 1962, 2026, 1966, 2044, 2027, 2047, 2043, 2023, 2044, 2027, 2045, 1966, 2031, 1966, 2019, 2023, 2016, 2023, 2019, 2043, 2019, 1966, 2017, 2024, 1966, 2045, 2023, 2025, 2016, 2031, 2042, 2043, 2044, 2027, 1966, 2045, 2029, 2022, 2027, 2019, 2027, 1966, 2040, 1963, 1980, 1962, 2026, 1973, 1966, 2042, 2022, 2027, 1966, 1999, 2014, 1989, 1966, 2023, 2045, 1966, 2016, 2017, 2042, 1966, 2045, 2023, 2025, 2016, 2027, 2026, 1966, 2041, 2023, 2042, 2022, 1966, 2042, 2022, 2023, 2045, 1966, 2017, 2044, 1966, 2031, 1966, 2018, 2031, 2042, 2027, 2044, 1966, 2045, 2023, 2025, 2016, 2031, 2042, 2043, 2044, 2027, 1966, 2045, 2029, 2022, 2027, 2019, 2027, 2857, 2861, 2858, 2875, 2871, 2861, 2851, 2875, 2871, 2855, 2860, 2849, 2857, 2849, 2875, 2850, 2859, 2870, 2875, 2864, 2853, 2870, 2851, 2849, 2864, 2875, 2871, 2848, 2863, 2875, 2858, 2859, 2864, 2875, 2857, 2849, 2864, 2821, 2852, 2923, 2826, 2843, 2816, 2923, 2840, 2850, 2860, 2853, 2858, 2879, 2878, 2873, 2862, 2923, 2840, 2856, 2851, 2862, 2854, 2862, 2923, 2877, 2937, 2923, 2872, 2850, 2860, 2853, 2858, 2879, 2878, 2873, 2862, 2923, 2861, 2873, 2852, 2854, 2923, 2879, 2851, 2850, 2872, 2923, 2872, 2850, 2860, 2853, 2862, 2873, 3306, 3214, 3299, 3311, 3317, 3323, 3299, 3313, 3317, 3311, 3311, 3317, 3314, 3323, 1629, 1593, 1620, 1624, 1602, 1612, 1620, 1606, 1610, 1607, 1613, 1604, 1625, 1606, 1614, 1615, 1620, 1624, 1602, 1612, 1605, 1614, 1625, 1624, 2958, 2978, 2991, 2981, 2988, 2993, 2990, 2982, 2983, 3043, 2991, 2986, 2992, 2999, 3043, 2988, 2981, 3043, 2992, 2986, 2980, 2989, 2982, 2993, 2992, 685, 713, 676, 680, 690, 700, 676, 694, 698, 695, 701, 692, 681, 694, 702, 703, 676, 680, 690, 700, 693, 702, 681, 3130, 3094, 3099, 3089, 3096, 3077, 3098, 3090, 3091, 3159, 3076, 3102, 3088, 3097, 3090, 3077, 3159, 3093, 3099, 3096, 3092, 3100, 455, 419, 462, 450, 472, 470, 462, 476, 464, 477, 471, 478, 451, 476, 468, 469, 462, 449, 452, 467, 477, 472, 466, 462, 474, 468, 456, 2653, 2673, 2684, 2678, 2687, 2658, 2685, 2677, 2676, 2608, 2656, 2661, 2674, 2684, 2681, 2675, 2608, 2683, 2677, 2665, 2602, 2608, 2613, 2593, 2612, 2659, 2691, 2791, 2698, 2694, 2716, 2706, 2698, 2712, 2708, 2713, 2707, 2714, 2695, 2712, 2704, 2705, 2698, 2710, 2704, 2695, 2689, 2716, 2707, 2716, 2710, 2708, 2689, 2704, 2135, 2171, 2166, 2172, 2165, 2152, 2167, 2175, 2174, 2106, 2169, 2175, 2152, 2158, 2163, 2172, 2163, 2169, 2171, 2158, 2175, 2106, 2105, 2111, 2088, 2110, 2174, 2080, 2106, 2111, 2089, 2110, 2153, 2301, 2257, 2268, 2262, 2271, 2242, 2269, 2261, 2260, 2192, 2289, 2272, 2299, 2192, 2275, 2265, 2263, 2270, 2257, 2244, 2245, 2242, 2261, 2192, 2275, 2259, 2264, 2261, 2269, 2261, 2192, 2246, 2178, 2192, 2243, 2265, 2263, 2270, 2257, 2244, 2245, 2242, 2261, 2192, 2242, 2261, 2259, 2271, 2242, 2260, 2192, 2195, 2197, 2177, 2196, 2260, 1671, 1763, 1678, 1666, 1688, 1686, 1678, 1692, 1680, 1693, 1687, 1694, 1667, 1692, 1684, 1685, 1678, 1666, 1688, 1686, 1695, 1680, 1669, 1668, 1667, 1684, 2749, 2705, 2716, 2710, 2719, 2690, 2717, 2709, 2708, 2768, 2737, 2720, 2747, 2768, 2723, 2713, 2711, 2718, 2705, 2692, 2693, 2690, 2709, 2768, 2723, 2707, 2712, 2709, 2717, 2709, 2768, 2694, 2754, 2768, 2708, 2713, 2711, 2709, 2691, 2692, 2768, 2690, 2709, 2707, 2719, 2690, 2708, 2768, 2771, 2773, 2753, 2772, 2708, 1968, 2004, 1977, 1973, 1967, 1953, 1977, 1963, 1959, 1962, 1952, 1961, 1972, 1963, 1955, 1954, 1977, 1954, 1967, 1953, 1955, 1973, 1970, 3171, 3079, 3178, 3174, 3196, 3186, 3178, 3192, 3188, 3193, 3187, 3194, 3175, 3192, 3184, 3185, 3178, 3188, 3185, 3185, 3196, 3169, 3196, 3194, 3195, 3188, 3193, 3178, 3188, 3169, 3169, 3175, 3196, 3191, 3168, 3169, 3184, 2455, 2491, 2486, 2492, 2485, 2472, 2487, 2495, 2494, 2554, 2491, 2494, 2494, 2483, 2478, 2483, 2485, 2484, 2491, 2486, 2554, 2491, 2478, 2478, 2472, 2483, 2488, 2479, 2478, 2495, 2554, 2553, 2559, 2539, 2558, 2494};
        public final String a;

        static {
            Issue issue = new Issue(C0019.m1189(f22short, 17, 21, 2614), 0, C0072.m6116(f22short, 0, 17, 1102));
            JAR_SIG_NO_SIGNATURES = issue;
            Issue issue2 = new Issue(C0025.m2151(f22short, 113, 31, 598), 1, C0026.m2321(f22short, 38, 75, 907));
            JAR_SIG_MAX_SIGNATURES_EXCEEDED = issue2;
            Issue issue3 = new Issue(C0076.m6902(f22short, 184, 29, 1923), 2, C0019.m1189(f22short, 144, 40, 1023));
            JAR_SIG_NO_SIGNED_ZIP_ENTRIES = issue3;
            Issue issue4 = new Issue(C0078.m7427(f22short, 234, 27, 1324), 3, C0028.m2609(f22short, 213, 21, 1786));
            JAR_SIG_DUPLICATE_ZIP_ENTRY = issue4;
            Issue issue5 = new Issue(C0066.m4828(f22short, 308, 34, 3120), 4, C0037.m3829(f22short, 261, 47, 410));
            JAR_SIG_DUPLICATE_MANIFEST_SECTION = issue5;
            Issue issue6 = new Issue(C0029.m2695(f22short, 417, 33, 2338), 5, C0070.m5942(f22short, 342, 75, 2378));
            JAR_SIG_UNNNAMED_MANIFEST_SECTION = issue6;
            Issue issue7 = new Issue(C0069.m5807(f22short, 509, 33, 539), 6, C0028.m2609(f22short, 450, 59, 2556));
            JAR_SIG_UNNNAMED_SIG_FILE_SECTION = issue7;
            Issue issue8 = new Issue(C0063.m4315(f22short, 570, 19, 3077), 7, C0018.m1070(f22short, 542, 28, 1923));
            JAR_SIG_NO_MANIFEST = issue8;
            Issue issue9 = new Issue(C0021.m1650(f22short, 655, 48, 2316), 8, C0066.m4828(f22short, 589, 66, 3123));
            JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST = issue9;
            Issue issue10 = new Issue(C0025.m2151(f22short, 745, 39, 1828), 9, C0035.m3603(f22short, 703, 42, 1814));
            JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST = issue10;
            Issue issue11 = new Issue(C0069.m5807(f22short, 810, 39, 1764), 10, C0111.m13097(f22short, 784, 26, 3067));
            JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE = issue11;
            Issue issue12 = new Issue(C0024.m1945(f22short, 870, 28, 2314), 11, C0064.m4545(f22short, 849, 21, 2019));
            JAR_SIG_ZIP_ENTRY_NOT_SIGNED = issue12;
            Issue issue13 = new Issue(C0068.m5544(f22short, 980, 34, 1513), 12, C0111.m13097(f22short, 898, 82, 640));
            JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH = issue13;
            Issue issue14 = new Issue(C0066.m4828(f22short, 1111, 39, 2387), 13, C0025.m2151(f22short, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 97, 1086));
            JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY = issue14;
            Issue issue15 = new Issue(C0026.m2321(f22short, 1276, 51, 1868), 14, C0018.m1070(f22short, 1150, 126, 2007));
            JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY = issue15;
            Issue issue16 = new Issue(C0065.m4757(f22short, 1457, 46, 490), 15, C0039.m4066(f22short, 1327, 130, 887));
            JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY = issue16;
            Issue issue17 = new Issue(C0075.m6791(f22short, 1586, 38, 2724), 16, C0020.m1443(f22short, 1503, 83, 848));
            JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE = issue17;
            Issue issue18 = new Issue(C0034.m3431(f22short, 1785, 35, 2454), 17, C0023.m1904(f22short, 1624, 161, 1808));
            JAR_SIG_NO_APK_SIG_STRIP_PROTECTION = issue18;
            Issue issue19 = new Issue(C0078.m7427(f22short, 1869, 20, 3084), 18, C0033.m3330(f22short, 1820, 49, 2768));
            JAR_SIG_MISSING_FILE = issue19;
            Issue issue20 = new Issue(C0063.m4315(f22short, 1943, 24, 377), 19, C0075.m6791(f22short, 1889, 54, 2192));
            JAR_SIG_VERIFY_EXCEPTION = issue20;
            Issue issue21 = new Issue(C0018.m1070(f22short, 2122, 27, 2226), 20, C0024.m1945(f22short, 1967, ModuleDescriptor.MODULE_VERSION, 1270));
            JAR_SIG_UNSUPPORTED_SIG_ALG = issue21;
            Issue issue22 = new Issue(C0034.m3431(f22short, 2189, 23, 2240), 21, C0075.m6791(f22short, 2149, 40, 1468));
            JAR_SIG_PARSE_EXCEPTION = issue22;
            Issue issue23 = new Issue(C0016.m625(f22short, 2261, 29, 3100), 22, C0038.m4022(f22short, 2212, 49, 1441));
            JAR_SIG_MALFORMED_CERTIFICATE = issue23;
            Issue issue24 = new Issue(C0066.m4828(f22short, 2336, 22, 1915), 23, C0077.m7205(f22short, 2290, 46, 1320));
            JAR_SIG_DID_NOT_VERIFY = issue24;
            Issue issue25 = new Issue(C0026.m2321(f22short, 2396, 18, 2714), 24, C0027.m2404(f22short, 2358, 38, 2713));
            JAR_SIG_NO_SIGNERS = issue25;
            Issue issue26 = new Issue(C0025.m2151(f22short, 2445, 34, 1852), 25, C0065.m4757(f22short, 2414, 31, 1759));
            JAR_SIG_DUPLICATE_SIG_FILE_SECTION = issue26;
            Issue issue27 = new Issue(C0035.m3603(f22short, 2530, 40, 2597), 26, C0072.m6116(f22short, 2479, 51, 1105));
            JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE = issue27;
            Issue issue28 = new Issue(C0033.m3330(f22short, 2637, 33, 1559), 27, C0026.m2321(f22short, 2570, 67, 1812));
            JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID = issue28;
            Issue issue29 = new Issue(C0072.m6116(f22short, 2780, 34, 2430), 28, C0039.m4066(f22short, 2670, 110, 2272));
            JAR_SIG_MISSING_APK_SIG_REFERENCED = issue29;
            Issue issue30 = new Issue(C0038.m4022(f22short, 2960, 29, 473), 29, C0068.m5544(f22short, 2814, 146, 1220));
            JAR_SIG_UNPROTECTED_ZIP_ENTRY = issue30;
            Issue issue31 = new Issue(C0020.m1443(f22short, 3022, 15, 2871), 30, C0074.m6452(f22short, 2989, 33, 2173));
            JAR_SIG_MISSING = issue31;
            Issue issue32 = new Issue(C0032.m3209(f22short, 3119, 33, 1739), 31, C0065.m4757(f22short, 3037, 82, 2239));
            NO_SIG_FOR_TARGET_SANDBOX_VERSION = issue32;
            Issue issue33 = new Issue(C0071.m5991(f22short, 3281, 37, 2916), 32, C0074.m6452(f22short, 3152, 129, 1934));
            MIN_SIG_SCHEME_FOR_TARGET_SDK_NOT_MET = issue33;
            Issue issue34 = new Issue(C0016.m625(f22short, 3371, 14, 3260), 33, C0063.m4315(f22short, 3318, 53, 2891));
            V2_SIG_MISSING = issue34;
            String strM3678 = C0036.m3678(f22short, 3385, 24, 1547);
            String strM13097 = C0111.m13097(f22short, 3409, 25, 3011);
            Issue issue35 = new Issue(strM3678, 34, strM13097);
            V2_SIG_MALFORMED_SIGNERS = issue35;
            String strM5807 = C0069.m5807(f22short, 3434, 23, 763);
            String strM2404 = C0027.m2404(f22short, 3457, 22, 3191);
            Issue issue36 = new Issue(strM5807, 35, strM2404);
            V2_SIG_MALFORMED_SIGNER = issue36;
            String strM5942 = C0070.m5942(f22short, 3479, 27, 401);
            String strM6791 = C0075.m6791(f22short, 3506, 26, 2576);
            Issue issue37 = new Issue(strM5942, 36, strM6791);
            V2_SIG_MALFORMED_PUBLIC_KEY = issue37;
            String strM3431 = C0034.m3431(f22short, 3532, 28, 2773);
            String strM130972 = C0111.m13097(f22short, 3560, 33, 2074);
            Issue issue38 = new Issue(strM3431, 37, strM130972);
            V2_SIG_MALFORMED_CERTIFICATE = issue38;
            Issue issue39 = new Issue(C0064.m4545(f22short, 3649, 26, 1745), 38, C0078.m7427(f22short, 3593, 56, 2224));
            V2_SIG_MALFORMED_SIGNATURE = issue39;
            Issue issue40 = new Issue(C0033.m3330(f22short, 3728, 23, 2022), 39, C0070.m5942(f22short, 3675, 53, 2800));
            V2_SIG_MALFORMED_DIGEST = issue40;
            String strM4828 = C0066.m4828(f22short, 3751, 37, 3125);
            String strM7205 = C0077.m7205(f22short, 3788, 36, 2522);
            Issue issue41 = new Issue(strM4828, 40, strM7205);
            V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE = issue41;
            Issue issue42 = new Issue("V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID", 41, "APK Signature Scheme v2 signer: %1$s references unknown APK signature scheme ID: %2$d");
            V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID = issue42;
            Issue issue43 = new Issue("V2_SIG_MISSING_APK_SIG_REFERENCED", 42, "APK Signature Scheme v2 signature %1$s indicates the APK is signed using %2$s but no such signature was found. Signature stripped?");
            V2_SIG_MISSING_APK_SIG_REFERENCED = issue43;
            Issue issue44 = new Issue("V2_SIG_MAX_SIGNATURES_EXCEEDED", 43, "APK Signature Scheme V2 only supports a maximum of %1$d signers, found %2$d");
            V2_SIG_MAX_SIGNATURES_EXCEEDED = issue44;
            Issue issue45 = new Issue("V2_SIG_NO_SIGNERS", 44, "No signers in APK Signature Scheme v2 signature");
            V2_SIG_NO_SIGNERS = issue45;
            Issue issue46 = new Issue("V2_SIG_UNKNOWN_SIG_ALGORITHM", 45, "Unknown signature algorithm: %1$#x");
            V2_SIG_UNKNOWN_SIG_ALGORITHM = issue46;
            Issue issue47 = new Issue("V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE", 46, "Unknown additional attribute: ID %1$#x");
            V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE = issue47;
            Issue issue48 = new Issue("V2_SIG_VERIFY_EXCEPTION", 47, "Failed to verify %1$s signature: %2$s");
            V2_SIG_VERIFY_EXCEPTION = issue48;
            Issue issue49 = new Issue("V2_SIG_DID_NOT_VERIFY", 48, "%1$s signature over signed-data did not verify");
            V2_SIG_DID_NOT_VERIFY = issue49;
            Issue issue50 = new Issue("V2_SIG_NO_SIGNATURES", 49, "No signatures");
            V2_SIG_NO_SIGNATURES = issue50;
            Issue issue51 = new Issue("V2_SIG_NO_SUPPORTED_SIGNATURES", 50, "No supported signatures: %1$s");
            V2_SIG_NO_SUPPORTED_SIGNATURES = issue51;
            Issue issue52 = new Issue("V2_SIG_NO_CERTIFICATES", 51, "No certificates");
            V2_SIG_NO_CERTIFICATES = issue52;
            Issue issue53 = new Issue("V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD", 52, "Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>");
            V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD = issue53;
            Issue issue54 = new Issue("V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS", 53, "Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s");
            V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS = issue54;
            Issue issue55 = new Issue("V2_SIG_APK_DIGEST_DID_NOT_VERIFY", 54, "APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>");
            V2_SIG_APK_DIGEST_DID_NOT_VERIFY = issue55;
            Issue issue56 = new Issue("V3_SIG_MALFORMED_SIGNERS", 55, strM13097);
            V3_SIG_MALFORMED_SIGNERS = issue56;
            Issue issue57 = new Issue("V3_SIG_MALFORMED_SIGNER", 56, strM2404);
            V3_SIG_MALFORMED_SIGNER = issue57;
            Issue issue58 = new Issue("V3_SIG_MALFORMED_PUBLIC_KEY", 57, strM6791);
            V3_SIG_MALFORMED_PUBLIC_KEY = issue58;
            Issue issue59 = new Issue("V3_SIG_MALFORMED_CERTIFICATE", 58, strM130972);
            V3_SIG_MALFORMED_CERTIFICATE = issue59;
            Issue issue60 = new Issue("V3_SIG_MALFORMED_SIGNATURE", 59, "Malformed APK Signature Scheme v3 signature record #%1$d");
            V3_SIG_MALFORMED_SIGNATURE = issue60;
            Issue issue61 = new Issue("V3_SIG_MALFORMED_DIGEST", 60, "Malformed APK Signature Scheme v3 digest record #%1$d");
            V3_SIG_MALFORMED_DIGEST = issue61;
            Issue issue62 = new Issue("V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE", 61, strM7205);
            V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE = issue62;
            Issue issue63 = new Issue("V3_SIG_NO_SIGNERS", 62, "No signers in APK Signature Scheme v3 signature");
            V3_SIG_NO_SIGNERS = issue63;
            Issue issue64 = new Issue("V3_SIG_MULTIPLE_SIGNERS", 63, "Multiple APK Signature Scheme v3 signatures found for a single  platform version.");
            V3_SIG_MULTIPLE_SIGNERS = issue64;
            Issue issue65 = new Issue("V3_SIG_MULTIPLE_PAST_SIGNERS", 64, "Multiple signatures found for pre-v3 signing with an APK  Signature Scheme v3 signer.  Only one allowed.");
            V3_SIG_MULTIPLE_PAST_SIGNERS = issue65;
            Issue issue66 = new Issue("V3_SIG_PAST_SIGNERS_MISMATCH", 65, "v3 signer differs from v1/v2 signer without proper signing certificate lineage.");
            V3_SIG_PAST_SIGNERS_MISMATCH = issue66;
            Issue issue67 = new Issue("V3_SIG_UNKNOWN_SIG_ALGORITHM", 66, "Unknown signature algorithm: %1$#x");
            V3_SIG_UNKNOWN_SIG_ALGORITHM = issue67;
            Issue issue68 = new Issue("V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE", 67, "Unknown additional attribute: ID %1$#x");
            V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE = issue68;
            Issue issue69 = new Issue("V3_SIG_VERIFY_EXCEPTION", 68, "Failed to verify %1$s signature: %2$s");
            V3_SIG_VERIFY_EXCEPTION = issue69;
            Issue issue70 = new Issue("V3_SIG_INVALID_SDK_VERSIONS", 69, "Invalid SDK Version parameter(s) encountered in APK Signature scheme v3 signature: minSdkVersion %1$s maxSdkVersion: %2$s");
            V3_SIG_INVALID_SDK_VERSIONS = issue70;
            Issue issue71 = new Issue("V3_SIG_DID_NOT_VERIFY", 70, "%1$s signature over signed-data did not verify");
            V3_SIG_DID_NOT_VERIFY = issue71;
            Issue issue72 = new Issue("V3_SIG_NO_SIGNATURES", 71, "No signatures");
            V3_SIG_NO_SIGNATURES = issue72;
            Issue issue73 = new Issue("V3_SIG_NO_SUPPORTED_SIGNATURES", 72, "No supported signatures");
            V3_SIG_NO_SUPPORTED_SIGNATURES = issue73;
            Issue issue74 = new Issue("V3_SIG_NO_CERTIFICATES", 73, "No certificates");
            V3_SIG_NO_CERTIFICATES = issue74;
            Issue issue75 = new Issue("V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD", 74, "minSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>");
            V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD = issue75;
            Issue issue76 = new Issue("V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD", 75, "maxSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>");
            V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD = issue76;
            Issue issue77 = new Issue("V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD", 76, "Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>");
            V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD = issue77;
            Issue issue78 = new Issue("V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS", 77, "Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s");
            V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS = issue78;
            Issue issue79 = new Issue("V3_SIG_APK_DIGEST_DID_NOT_VERIFY", 78, "APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>");
            V3_SIG_APK_DIGEST_DID_NOT_VERIFY = issue79;
            Issue issue80 = new Issue("V3_SIG_POR_DID_NOT_VERIFY", 79, "SigningCertificateLineage attribute containd a proof-of-rotation record with signature(s) that did not verify.");
            V3_SIG_POR_DID_NOT_VERIFY = issue80;
            Issue issue81 = new Issue("V3_SIG_MALFORMED_LINEAGE", 80, "Failed to parse the SigningCertificateLineage structure in the APK Signature Scheme v3 signature's additional attributes section.");
            V3_SIG_MALFORMED_LINEAGE = issue81;
            Issue issue82 = new Issue("V3_SIG_POR_CERT_MISMATCH", 81, "APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage.");
            V3_SIG_POR_CERT_MISMATCH = issue82;
            Issue issue83 = new Issue("V3_INCONSISTENT_SDK_VERSIONS", 82, "APK Signature Scheme v3 signers supported min/max SDK versions are not continuous.");
            V3_INCONSISTENT_SDK_VERSIONS = issue83;
            Issue issue84 = new Issue("V3_MISSING_SDK_VERSIONS", 83, "APK Signature Scheme v3 signers supported min/max SDK versions do not cover the entire desired range.  Found min:  %1$s max %2$s");
            V3_MISSING_SDK_VERSIONS = issue84;
            Issue issue85 = new Issue("V3_INCONSISTENT_LINEAGES", 84, "SigningCertificateLineages targeting different platform versions using APK Signature Scheme v3 are not all a part of the same overall lineage.");
            V3_INCONSISTENT_LINEAGES = issue85;
            Issue issue86 = new Issue("V31_BLOCK_MISSING", 85, "The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but a v3.1 block was not found");
            V31_BLOCK_MISSING = issue86;
            Issue issue87 = new Issue("V31_ROTATION_MIN_SDK_MISMATCH", 86, "The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but the v3.1 block targets %2$s for rotation");
            V31_ROTATION_MIN_SDK_MISMATCH = issue87;
            Issue issue88 = new Issue("V31_ROTATION_MIN_SDK_ATTR_MISSING", 87, "APK supports key rotation starting from SDK version %1$s, but the v3 signer does not contain the attribute to detect if this signature is stripped");
            V31_ROTATION_MIN_SDK_ATTR_MISSING = issue88;
            Issue issue89 = new Issue("V31_BLOCK_FOUND_WITHOUT_V3_BLOCK", 88, "The APK contains a v3.1 signing block without a v3.0 base block");
            V31_BLOCK_FOUND_WITHOUT_V3_BLOCK = issue89;
            Issue issue90 = new Issue("V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER", 89, "The rotation-targets-dev-release attribute is only supported on v3.1 signers; this attribute will be ignored by the platform in a v3.0 signer");
            V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER = issue90;
            Issue issue91 = new Issue("APK_SIG_BLOCK_UNKNOWN_ENTRY_ID", 90, "APK Signing Block contains unknown entry: ID %1$#x");
            APK_SIG_BLOCK_UNKNOWN_ENTRY_ID = issue91;
            Issue issue92 = new Issue("V4_SIG_MALFORMED_SIGNERS", 91, "V4 signature has malformed signer block");
            V4_SIG_MALFORMED_SIGNERS = issue92;
            Issue issue93 = new Issue("V4_SIG_UNKNOWN_SIG_ALGORITHM", 92, "V4 signature has unknown signing algorithm: %1$#x");
            V4_SIG_UNKNOWN_SIG_ALGORITHM = issue93;
            Issue issue94 = new Issue("V4_SIG_NO_SIGNATURES", 93, "V4 signature has no signature found");
            V4_SIG_NO_SIGNATURES = issue94;
            Issue issue95 = new Issue("V4_SIG_NO_SUPPORTED_SIGNATURES", 94, "V4 signature has no supported signature");
            V4_SIG_NO_SUPPORTED_SIGNATURES = issue95;
            Issue issue96 = new Issue("V4_SIG_DID_NOT_VERIFY", 95, "%1$s signature over signed-data did not verify");
            V4_SIG_DID_NOT_VERIFY = issue96;
            Issue issue97 = new Issue("V4_SIG_VERIFY_EXCEPTION", 96, "Failed to verify %1$s signature: %2$s");
            V4_SIG_VERIFY_EXCEPTION = issue97;
            Issue issue98 = new Issue("V4_SIG_MALFORMED_PUBLIC_KEY", 97, strM6791);
            V4_SIG_MALFORMED_PUBLIC_KEY = issue98;
            Issue issue99 = new Issue("V4_SIG_MALFORMED_CERTIFICATE", 98, "V4 signature has malformed certificate");
            V4_SIG_MALFORMED_CERTIFICATE = issue99;
            Issue issue100 = new Issue("V4_SIG_NO_CERTIFICATE", 99, "V4 signature has no certificate");
            V4_SIG_NO_CERTIFICATE = issue100;
            Issue issue101 = new Issue("V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD", 100, "V4 signature has mismatched certificate and signature: <%1$s> vs <%2$s>");
            V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD = issue101;
            Issue issue102 = new Issue("V4_SIG_APK_ROOT_DID_NOT_VERIFY", 101, "V4 signature's hash tree root (content digest) did not verity");
            V4_SIG_APK_ROOT_DID_NOT_VERIFY = issue102;
            Issue issue103 = new Issue("V4_SIG_APK_TREE_DID_NOT_VERIFY", 102, "V4 signature's hash tree did not verity");
            V4_SIG_APK_TREE_DID_NOT_VERIFY = issue103;
            Issue issue104 = new Issue("V4_SIG_MULTIPLE_SIGNERS", 103, "V4 signature only supports one signer");
            V4_SIG_MULTIPLE_SIGNERS = issue104;
            Issue issue105 = new Issue("V41_SIG_NEEDS_TWO_SIGNERS", 104, "V4.1 signature requires two signers");
            V41_SIG_NEEDS_TWO_SIGNERS = issue105;
            Issue issue106 = new Issue("V4_SIG_V2_V3_SIGNERS_MISMATCH", LocationRequest.PRIORITY_NO_POWER, "V4 signature and V2/V3 signature have mismatched certificates");
            V4_SIG_V2_V3_SIGNERS_MISMATCH = issue106;
            Issue issue107 = new Issue("V4_SIG_V2_V3_DIGESTS_MISMATCH", 106, "V4 signature and V%1$d signature have mismatched digests, V%1$d digest: %2$s, V4 digest: %3$s");
            V4_SIG_V2_V3_DIGESTS_MISMATCH = issue107;
            Issue issue108 = new Issue("V4_SIG_UNEXPECTED_DIGESTS", 107, "V4 signature does not have the expected number of digests, found %1$d");
            V4_SIG_UNEXPECTED_DIGESTS = issue108;
            Issue issue109 = new Issue("V4_SIG_VERSION_NOT_CURRENT", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, "V4 signature format version %1$d is different from the tool's current version %2$d");
            V4_SIG_VERSION_NOT_CURRENT = issue109;
            Issue issue110 = new Issue("SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, "Neither the source stamp certificate digest file nor the signature block are present in the APK");
            SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING = issue110;
            Issue issue111 = new Issue("SOURCE_STAMP_SIG_MISSING", 110, "No SourceStamp signature");
            SOURCE_STAMP_SIG_MISSING = issue111;
            Issue issue112 = new Issue("SOURCE_STAMP_MALFORMED_CERTIFICATE", 111, "Malformed certificate: %1$s");
            SOURCE_STAMP_MALFORMED_CERTIFICATE = issue112;
            Issue issue113 = new Issue("SOURCE_STAMP_MALFORMED_SIGNATURE", 112, "Malformed SourceStamp signature");
            SOURCE_STAMP_MALFORMED_SIGNATURE = issue113;
            Issue issue114 = new Issue("SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM", 113, "Unknown signature algorithm: %1$#x");
            SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM = issue114;
            Issue issue115 = new Issue("SOURCE_STAMP_VERIFY_EXCEPTION", 114, "Failed to verify %1$s signature: %2$s");
            SOURCE_STAMP_VERIFY_EXCEPTION = issue115;
            Issue issue116 = new Issue("SOURCE_STAMP_DID_NOT_VERIFY", 115, "%1$s signature over signed-data did not verify");
            SOURCE_STAMP_DID_NOT_VERIFY = issue116;
            Issue issue117 = new Issue("SOURCE_STAMP_NO_SIGNATURE", 116, "No signature");
            SOURCE_STAMP_NO_SIGNATURE = issue117;
            Issue issue118 = new Issue("SOURCE_STAMP_NO_SUPPORTED_SIGNATURE", 117, "Signature(s) {%1$s} not supported: %2$s");
            SOURCE_STAMP_NO_SUPPORTED_SIGNATURE = issue118;
            Issue issue119 = new Issue("SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK", 118, "Certificate mismatch between SourceStamp block in APK signing block and SourceStamp file in APK: <%1$s> vs <%2$s>");
            SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK = issue119;
            Issue issue120 = new Issue("SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST", 119, "A source stamp signature block was found without a corresponding certificate digest in the APK");
            SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST = issue120;
            Issue issue121 = new Issue("SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH", 120, "The source stamp certificate digest in the APK, %1$s, does not match the expected digest, %2$s");
            SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH = issue121;
            Issue issue122 = new Issue("SOURCE_STAMP_MALFORMED_ATTRIBUTE", 121, "Malformed stamp attribute #%1$d");
            SOURCE_STAMP_MALFORMED_ATTRIBUTE = issue122;
            Issue issue123 = new Issue("SOURCE_STAMP_UNKNOWN_ATTRIBUTE", 122, "Unknown stamp attribute: ID %1$#x");
            SOURCE_STAMP_UNKNOWN_ATTRIBUTE = issue123;
            Issue issue124 = new Issue("SOURCE_STAMP_MALFORMED_LINEAGE", 123, "Failed to parse the SigningCertificateLineage structure in the source stamp attributes section.");
            SOURCE_STAMP_MALFORMED_LINEAGE = issue124;
            Issue issue125 = new Issue("SOURCE_STAMP_POR_CERT_MISMATCH", 124, "APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage.");
            SOURCE_STAMP_POR_CERT_MISMATCH = issue125;
            Issue issue126 = new Issue("SOURCE_STAMP_POR_DID_NOT_VERIFY", 125, "Source stamp SigningCertificateLineage attribute contains a proof-of-rotation record with signature(s) that did not verify.");
            SOURCE_STAMP_POR_DID_NOT_VERIFY = issue126;
            Issue issue127 = new Issue("SOURCE_STAMP_INVALID_TIMESTAMP", 126, "The source stamp timestamp attribute has an invalid value: %1$d");
            SOURCE_STAMP_INVALID_TIMESTAMP = issue127;
            Issue issue128 = new Issue("SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE", WorkQueueKt.MASK, "No digests are available in the source stamp for signature scheme: %1$d");
            SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE = issue128;
            Issue issue129 = new Issue("MALFORMED_APK", 128, "Malformed APK; the following exception was caught when attempting to parse the APK: %1$s");
            MALFORMED_APK = issue129;
            Issue issue130 = new Issue("UNEXPECTED_EXCEPTION", 129, "An unexpected exception was caught when verifying the signature: %1$s");
            UNEXPECTED_EXCEPTION = issue130;
            b = new Issue[]{issue, issue2, issue3, issue4, issue5, issue6, issue7, issue8, issue9, issue10, issue11, issue12, issue13, issue14, issue15, issue16, issue17, issue18, issue19, issue20, issue21, issue22, issue23, issue24, issue25, issue26, issue27, issue28, issue29, issue30, issue31, issue32, issue33, issue34, issue35, issue36, issue37, issue38, issue39, issue40, issue41, issue42, issue43, issue44, issue45, issue46, issue47, issue48, issue49, issue50, issue51, issue52, issue53, issue54, issue55, issue56, issue57, issue58, issue59, issue60, issue61, issue62, issue63, issue64, issue65, issue66, issue67, issue68, issue69, issue70, issue71, issue72, issue73, issue74, issue75, issue76, issue77, issue78, issue79, issue80, issue81, issue82, issue83, issue84, issue85, issue86, issue87, issue88, issue89, issue90, issue91, issue92, issue93, issue94, issue95, issue96, issue97, issue98, issue99, issue100, issue101, issue102, issue103, issue104, issue105, issue106, issue107, issue108, issue109, issue110, issue111, issue112, issue113, issue114, issue115, issue116, issue117, issue118, issue119, issue120, issue121, issue122, issue123, issue124, issue125, issue126, issue127, issue128, issue129, issue130};
        }

        public static Issue valueOf(String str) {
            return (Issue) Enum.valueOf(Issue.class, str);
        }

        public static Issue[] values() {
            return (Issue[]) b.clone();
        }

        public Issue(String str, int i, String str2) {
            this.a = str2;
        }
    }

    public static class IssueWithParams extends ApkVerificationIssue {
        public final Issue d;
        public final Object[] e;

        /* JADX INFO: renamed from: ۟ۤ۟ۦۥ, reason: not valid java name and contains not printable characters */
        public static Object m528(Object obj) {
            if (C0075.m6893() >= 0) {
                return ((Object[]) obj).clone();
            }
            return null;
        }

        public Issue getIssue() {
            return C0074.m6584(this);
        }

        @Override // com.android.apksig.ApkVerificationIssue
        public Object[] getParams() {
            return (Object[]) m528(C0027.m2531(this));
        }

        @Override // com.android.apksig.ApkVerificationIssue
        public String toString() {
            return C0021.m1531(C0027.m2517(C0074.m6584(this)), C0027.m2531(this));
        }

        public IssueWithParams(Issue issue, Object[] objArr) {
            super(C0029.m2723(issue), objArr);
            this.d = issue;
            this.e = objArr;
        }
    }

    public static class Result {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f23short = {2521, 2530, 2535, 2530, 2531, 2555, 2530, 2476, 2527, 2533, 2539, 2530, 2533, 2530, 2539, 2476, 2510, 2528, 2531, 2543, 2535, 2476, 2527, 2543, 2532, 2537, 2529, 2537, 2476, 2501, 2536, 2755, 2808, 2813, 2808, 2809, 2785, 2808, 2742, 2775, 2790, 2813, 2757, 2815, 2801, 2756, 2803, 2789, 2787, 2810, 2786, 2742, 2757, 2815, 2801, 2808, 2815, 2808, 2801, 2742, 2772, 2810, 2809, 2805, 2813, 2742, 2757, 2805, 2814, 2803, 2811, 2803, 2742, 2783, 2802, 2742};
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final ArrayList f = new ArrayList();
        public final ArrayList g = new ArrayList();
        public final ArrayList h = new ArrayList();
        public final ArrayList i = new ArrayList();
        public SourceStampInfo j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public SigningCertificateLineage s;

        public static class SourceStampInfo {
            public final List a;
            public final List b;
            public final List c;
            public final List d;
            public final List e;
            public final SourceStampVerificationStatus f;
            public final long g;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class SourceStampVerificationStatus {
                public static final SourceStampVerificationStatus CERT_DIGEST_MISMATCH;
                public static final SourceStampVerificationStatus STAMP_MISSING;
                public static final SourceStampVerificationStatus STAMP_NOT_VERIFIED;
                public static final SourceStampVerificationStatus STAMP_VERIFICATION_FAILED;
                public static final SourceStampVerificationStatus STAMP_VERIFIED;
                public static final SourceStampVerificationStatus VERIFICATION_ERROR;
                public static final /* synthetic */ SourceStampVerificationStatus[] a;

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f24short = {2131, 2132, 2113, 2125, 2128, 2143, 2134, 2117, 2130, 2121, 2118, 2121, 2117, 2116, 418, 421, 432, 444, 417, 430, 423, 436, 419, 440, 439, 440, 434, 432, 421, 440, 446, 447, 430, 439, 432, 440, 445, 436, 437, 1433, 1439, 1416, 1422, 1413, 1438, 1427, 1437, 1439, 1417, 1422, 1413, 1431, 1427, 1417, 1431, 1435, 1422, 1433, 1426, 2844, 2843, 2830, 2818, 2847, 2832, 2818, 2822, 2844, 2844, 2822, 2817, 2824, 2935, 2928, 2917, 2921, 2932, 2939, 2922, 2923, 2928, 2939, 2930, 2913, 2934, 2925, 2914, 2925, 2913, 2912, 1008, 995, 1012, 1007, 992, 1007, 997, 999, 1010, 1007, 1001, 1000, 1017, 995, 1012, 1012, 1001, 1012};

                static {
                    SourceStampVerificationStatus sourceStampVerificationStatus = new SourceStampVerificationStatus(C0025.m2151(f24short, 0, 14, 2048), 0);
                    STAMP_VERIFIED = sourceStampVerificationStatus;
                    SourceStampVerificationStatus sourceStampVerificationStatus2 = new SourceStampVerificationStatus(C0025.m2151(f24short, 14, 25, 497), 1);
                    STAMP_VERIFICATION_FAILED = sourceStampVerificationStatus2;
                    SourceStampVerificationStatus sourceStampVerificationStatus3 = new SourceStampVerificationStatus(C0030.m2840(f24short, 39, 20, 1498), 2);
                    CERT_DIGEST_MISMATCH = sourceStampVerificationStatus3;
                    SourceStampVerificationStatus sourceStampVerificationStatus4 = new SourceStampVerificationStatus(C0019.m1189(f24short, 59, 13, 2895), 3);
                    STAMP_MISSING = sourceStampVerificationStatus4;
                    SourceStampVerificationStatus sourceStampVerificationStatus5 = new SourceStampVerificationStatus(C0031.m3047(f24short, 72, 18, 2852), 4);
                    STAMP_NOT_VERIFIED = sourceStampVerificationStatus5;
                    SourceStampVerificationStatus sourceStampVerificationStatus6 = new SourceStampVerificationStatus(C0033.m3330(f24short, 90, 18, 934), 5);
                    VERIFICATION_ERROR = sourceStampVerificationStatus6;
                    a = new SourceStampVerificationStatus[]{sourceStampVerificationStatus, sourceStampVerificationStatus2, sourceStampVerificationStatus3, sourceStampVerificationStatus4, sourceStampVerificationStatus5, sourceStampVerificationStatus6};
                }

                public static SourceStampVerificationStatus valueOf(String str) {
                    return (SourceStampVerificationStatus) Enum.valueOf(SourceStampVerificationStatus.class, str);
                }

                public static SourceStampVerificationStatus[] values() {
                    return (SourceStampVerificationStatus[]) a.clone();
                }
            }

            public SourceStampInfo(ApkSignerInfo apkSignerInfo, AnonymousClass1 anonymousClass1) {
                this.a = C0039.m4117(apkSignerInfo);
                this.b = C0037.m3778(apkSignerInfo);
                List listM3465 = C0034.m3465(C0063.m4331(apkSignerInfo));
                this.c = listM3465;
                List listM34652 = C0034.m3465(C0111.m13055(apkSignerInfo));
                this.d = listM34652;
                this.e = C0034.m3465(C0068.m5622(apkSignerInfo));
                if (C0025.m2084(listM3465) && C0025.m2084(listM34652)) {
                    this.f = C0019.m1289();
                } else {
                    this.f = C0029.m2761();
                }
                this.g = C0070.m5847(apkSignerInfo);
            }

            public boolean containsErrors() {
                return !C0025.m2084(C0066.m4845(this));
            }

            public boolean containsInfoMessages() {
                return !C0025.m2084(C0018.m1000(this));
            }

            public X509Certificate getCertificate() {
                List listM3256 = C0033.m3256(this);
                if (C0025.m2084(listM3256)) {
                    return null;
                }
                return (X509Certificate) C0071.m6078(listM3256, 0);
            }

            public List<X509Certificate> getCertificatesInLineage() {
                return C0031.m3113(this);
            }

            public List<IssueWithParams> getErrors() {
                return C0066.m4845(this);
            }

            public List<IssueWithParams> getInfoMessages() {
                return C0018.m1000(this);
            }

            public SourceStampVerificationStatus getSourceStampVerificationStatus() {
                return C0037.m3833(this);
            }

            public long getTimestampEpochSeconds() {
                return C0039.m4152(this);
            }

            public List<IssueWithParams> getWarnings() {
                return C0065.m4654(this);
            }

            public SourceStampInfo(SourceStampVerificationStatus sourceStampVerificationStatus) {
                this.a = C0037.m3866();
                this.b = C0037.m3866();
                this.c = C0037.m3866();
                this.d = C0037.m3866();
                this.e = C0037.m3866();
                this.f = sourceStampVerificationStatus;
                this.g = 0L;
            }
        }

        public static class V1SchemeSignerInfo {
            public final String a;
            public final List b;
            public final String c;
            public final String d;
            public final List e;
            public final List f;

            public boolean containsErrors() {
                return !C0025.m2084(C0035.m3572(this));
            }

            public X509Certificate getCertificate() {
                List listM2732 = C0029.m2732(this);
                if (C0025.m2084(listM2732)) {
                    return null;
                }
                return (X509Certificate) C0071.m6078(listM2732, 0);
            }

            public List<X509Certificate> getCertificateChain() {
                return C0029.m2732(this);
            }

            public List<IssueWithParams> getErrors() {
                return C0035.m3572(this);
            }

            public String getName() {
                return C0023.m1805(this);
            }

            public String getSignatureBlockFileName() {
                return C0038.m3921(this);
            }

            public String getSignatureFileName() {
                return C0036.m3754(this);
            }

            public List<IssueWithParams> getWarnings() {
                return C0034.m3510(this);
            }

            public V1SchemeSignerInfo(V1SchemeVerifier.Result.SignerInfo signerInfo, AnonymousClass1 anonymousClass1) {
                this.a = C0077.m7184(signerInfo);
                this.b = C0034.m3417(signerInfo);
                this.c = C0022.m1773(signerInfo);
                this.d = C0038.m4048(signerInfo);
                this.e = C0018.m971(signerInfo);
                this.f = C0034.m3407(signerInfo);
            }

            public static void access$400(V1SchemeSignerInfo v1SchemeSignerInfo, Issue issue, Object[] objArr) {
                C0030.m2951(v1SchemeSignerInfo);
                C0077.m7162(C0035.m3572(v1SchemeSignerInfo), new IssueWithParams(issue, objArr));
            }
        }

        public static class V2SchemeSignerInfo {
            public final int a;
            public final List b;
            public final List c;
            public final List d;
            public final List e;

            public boolean containsErrors() {
                return !C0025.m2084(C0029.m2804(this));
            }

            public X509Certificate getCertificate() {
                List listM13068 = C0111.m13068(this);
                if (C0025.m2084(listM13068)) {
                    return null;
                }
                return (X509Certificate) C0071.m6078(listM13068, 0);
            }

            public List<X509Certificate> getCertificates() {
                return C0111.m13068(this);
            }

            public List<ApkSigningBlockUtils.Result.SignerInfo.ContentDigest> getContentDigests() {
                return C0038.m3942(this);
            }

            public List<IssueWithParams> getErrors() {
                return C0029.m2804(this);
            }

            public int getIndex() {
                return C0036.m3691(this);
            }

            public List<IssueWithParams> getWarnings() {
                return C0016.m658(this);
            }

            public V2SchemeSignerInfo(ApkSigningBlockUtils.Result.SignerInfo signerInfo, AnonymousClass1 anonymousClass1) {
                this.a = C0069.m5703(signerInfo);
                this.b = C0039.m4117(signerInfo);
                this.c = C0111.m13133(signerInfo);
                this.d = C0031.m2971(signerInfo);
                this.e = C0023.m1795(signerInfo);
            }

            public static void access$500(V2SchemeSignerInfo v2SchemeSignerInfo, Issue issue, Object[] objArr) {
                C0030.m2951(v2SchemeSignerInfo);
                C0077.m7162(C0029.m2804(v2SchemeSignerInfo), new IssueWithParams(issue, objArr));
            }
        }

        public static class V3SchemeSignerInfo {
            public final int a;
            public final List b;
            public final List c;
            public final List d;
            public final List e;
            public final int f;
            public final int g;
            public final boolean h;
            public final SigningCertificateLineage i;

            /* JADX INFO: renamed from: ۤۧ۟ۥ, reason: not valid java name and contains not printable characters */
            public static IntStream m530(Object obj, Object obj2) {
                if (C0021.m1598() <= 0) {
                    return ((Stream) obj).mapToInt((ToIntFunction) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
            public static boolean m531(Object obj, Object obj2) {
                if (C0069.m5781() < 0) {
                    return ((IntStream) obj).anyMatch((IntPredicate) obj2);
                }
                return false;
            }

            public boolean containsErrors() {
                return !C0025.m2084(C0033.m3305(this));
            }

            public X509Certificate getCertificate() {
                List listM7288 = C0077.m7288(this);
                if (C0025.m2084(listM7288)) {
                    return null;
                }
                return (X509Certificate) C0071.m6078(listM7288, 0);
            }

            public List<X509Certificate> getCertificates() {
                return C0077.m7288(this);
            }

            public List<ApkSigningBlockUtils.Result.SignerInfo.ContentDigest> getContentDigests() {
                return C0077.m7176(this);
            }

            public List<IssueWithParams> getErrors() {
                return C0033.m3305(this);
            }

            public int getIndex() {
                return C0111.m13123(this);
            }

            public int getMaxSdkVersion() {
                return C0071.m5982(this);
            }

            public int getMinSdkVersion() {
                return C0067.m5467(this);
            }

            public boolean getRotationTargetsDevRelease() {
                return C0026.m2281(this);
            }

            public SigningCertificateLineage getSigningCertificateLineage() {
                return C0066.m4794(this);
            }

            public List<IssueWithParams> getWarnings() {
                return C0037.m3893(this);
            }

            public V3SchemeSignerInfo(ApkSigningBlockUtils.Result.SignerInfo signerInfo, AnonymousClass1 anonymousClass1) {
                this.a = C0069.m5703(signerInfo);
                this.b = C0039.m4117(signerInfo);
                this.c = C0111.m13133(signerInfo);
                this.d = C0031.m2971(signerInfo);
                this.e = C0023.m1795(signerInfo);
                this.f = C0035.m3615(signerInfo);
                this.g = C0037.m3877(signerInfo);
                this.i = C0030.m2891(signerInfo);
                this.h = m531(m530(C0074.m6565(C0031.m2988(signerInfo)), new C0461w(1)), new C0473y(0));
            }
        }

        public static class V4SchemeSignerInfo {
            public final int a;
            public final List b;
            public final List c;
            public final List d;
            public final List e;

            public boolean containsErrors() {
                return !C0025.m2084(C0021.m1615(this));
            }

            public X509Certificate getCertificate() {
                List listM4778 = C0065.m4778(this);
                if (C0025.m2084(listM4778)) {
                    return null;
                }
                return (X509Certificate) C0071.m6078(listM4778, 0);
            }

            public List<X509Certificate> getCertificates() {
                return C0065.m4778(this);
            }

            public List<ApkSigningBlockUtils.Result.SignerInfo.ContentDigest> getContentDigests() {
                return C0028.m2541(this);
            }

            public List<IssueWithParams> getErrors() {
                return C0021.m1615(this);
            }

            public int getIndex() {
                return C0026.m2320(this);
            }

            public List<IssueWithParams> getWarnings() {
                return C0067.m5405(this);
            }

            public V4SchemeSignerInfo(ApkSigningBlockUtils.Result.SignerInfo signerInfo, AnonymousClass1 anonymousClass1) {
                this.a = C0069.m5703(signerInfo);
                this.b = C0039.m4117(signerInfo);
                this.c = C0111.m13133(signerInfo);
                this.d = C0031.m2971(signerInfo);
                this.e = C0023.m1795(signerInfo);
            }
        }

        /* JADX INFO: renamed from: ۣ۟ۥۥۢ, reason: not valid java name and contains not printable characters */
        public static short[] m529() {
            if (C0037.m3837() <= 0) {
                return f23short;
            }
            return null;
        }

        public void addError(Issue issue, Object... objArr) {
            C0017.m919(C0078.m7444(this), new IssueWithParams(issue, objArr));
        }

        public void addWarning(Issue issue, Object... objArr) {
            C0017.m919(C0024.m1995(this), new IssueWithParams(issue, objArr));
        }

        public boolean containsErrors() {
            if (!C0066.m4881(C0078.m7444(this))) {
                return true;
            }
            if (C0039.m4137(this) && !C0066.m4881(C0024.m1995(this))) {
                return true;
            }
            ArrayList arrayListM1712 = C0022.m1712(this);
            if (!C0066.m4881(arrayListM1712)) {
                Iterator itM4154 = C0039.m4154(arrayListM1712);
                while (C0036.m3657(itM4154)) {
                    V1SchemeSignerInfo v1SchemeSignerInfo = (V1SchemeSignerInfo) C0071.m6012(itM4154);
                    if (C0019.m1320(v1SchemeSignerInfo)) {
                        return true;
                    }
                    if (C0039.m4137(this) && !C0025.m2084(C0064.m4576(v1SchemeSignerInfo))) {
                        return true;
                    }
                }
            }
            ArrayList arrayListM1719 = C0022.m1719(this);
            if (!C0066.m4881(arrayListM1719)) {
                Iterator itM41542 = C0039.m4154(arrayListM1719);
                while (C0036.m3657(itM41542)) {
                    V2SchemeSignerInfo v2SchemeSignerInfo = (V2SchemeSignerInfo) C0071.m6012(itM41542);
                    if (C0073.m6331(v2SchemeSignerInfo)) {
                        return true;
                    }
                    if (C0039.m4137(this) && !C0025.m2084(C0069.m5803(v2SchemeSignerInfo))) {
                        return true;
                    }
                }
            }
            ArrayList arrayListM3570 = C0035.m3570(this);
            if (!C0066.m4881(arrayListM3570)) {
                Iterator itM41543 = C0039.m4154(arrayListM3570);
                while (C0036.m3657(itM41543)) {
                    V3SchemeSignerInfo v3SchemeSignerInfo = (V3SchemeSignerInfo) C0071.m6012(itM41543);
                    if (C0038.m4046(v3SchemeSignerInfo)) {
                        return true;
                    }
                    if (C0039.m4137(this) && !C0025.m2084(C0074.m6494(v3SchemeSignerInfo))) {
                        return true;
                    }
                }
            }
            ArrayList arrayListM2453 = C0027.m2453(this);
            if (!C0066.m4881(arrayListM2453)) {
                Iterator itM41544 = C0039.m4154(arrayListM2453);
                while (C0036.m3657(itM41544)) {
                    V3SchemeSignerInfo v3SchemeSignerInfo2 = (V3SchemeSignerInfo) C0071.m6012(itM41544);
                    if (C0038.m4046(v3SchemeSignerInfo2)) {
                        return true;
                    }
                    if (C0039.m4137(this) && !C0025.m2084(C0074.m6494(v3SchemeSignerInfo2))) {
                        return true;
                    }
                }
            }
            SourceStampInfo sourceStampInfoM2169 = C0025.m2169(this);
            if (sourceStampInfoM2169 == null) {
                return false;
            }
            if (C0037.m3888(sourceStampInfoM2169)) {
                return true;
            }
            return C0039.m4137(this) && !C0025.m2084(C0036.m3668(C0025.m2169(this)));
        }

        public List<IssueWithParams> getAllErrors() {
            ArrayList arrayList = new ArrayList();
            C0067.m5504(arrayList, C0078.m7444(this));
            if (C0039.m4137(this)) {
                C0067.m5504(arrayList, C0024.m1995(this));
            }
            ArrayList arrayListM1712 = C0022.m1712(this);
            if (!C0066.m4881(arrayListM1712)) {
                Iterator itM4154 = C0039.m4154(arrayListM1712);
                while (C0036.m3657(itM4154)) {
                    V1SchemeSignerInfo v1SchemeSignerInfo = (V1SchemeSignerInfo) C0071.m6012(itM4154);
                    C0067.m5504(arrayList, C0071.m6077(v1SchemeSignerInfo));
                    if (C0039.m4137(this)) {
                        C0067.m5504(arrayList, C0064.m4576(v1SchemeSignerInfo));
                    }
                }
            }
            ArrayList arrayListM1719 = C0022.m1719(this);
            if (!C0066.m4881(arrayListM1719)) {
                Iterator itM41542 = C0039.m4154(arrayListM1719);
                while (C0036.m3657(itM41542)) {
                    V2SchemeSignerInfo v2SchemeSignerInfo = (V2SchemeSignerInfo) C0071.m6012(itM41542);
                    C0067.m5504(arrayList, C0023.m1812(v2SchemeSignerInfo));
                    if (C0039.m4137(this)) {
                        C0067.m5504(arrayList, C0069.m5803(v2SchemeSignerInfo));
                    }
                }
            }
            ArrayList arrayListM3570 = C0035.m3570(this);
            if (!C0066.m4881(arrayListM3570)) {
                Iterator itM41543 = C0039.m4154(arrayListM3570);
                while (C0036.m3657(itM41543)) {
                    V3SchemeSignerInfo v3SchemeSignerInfo = (V3SchemeSignerInfo) C0071.m6012(itM41543);
                    C0067.m5504(arrayList, C0030.m2943(v3SchemeSignerInfo));
                    if (C0039.m4137(this)) {
                        C0067.m5504(arrayList, C0074.m6494(v3SchemeSignerInfo));
                    }
                }
            }
            ArrayList arrayListM2453 = C0027.m2453(this);
            if (!C0066.m4881(arrayListM2453)) {
                Iterator itM41544 = C0039.m4154(arrayListM2453);
                while (C0036.m3657(itM41544)) {
                    V3SchemeSignerInfo v3SchemeSignerInfo2 = (V3SchemeSignerInfo) C0071.m6012(itM41544);
                    C0067.m5504(arrayList, C0030.m2943(v3SchemeSignerInfo2));
                    if (C0039.m4137(this)) {
                        C0067.m5504(arrayList, C0074.m6494(v3SchemeSignerInfo2));
                    }
                }
            }
            SourceStampInfo sourceStampInfoM2169 = C0025.m2169(this);
            if (sourceStampInfoM2169 != null) {
                C0067.m5504(arrayList, C0065.m4643(sourceStampInfoM2169));
                if (C0039.m4137(this)) {
                    C0067.m5504(arrayList, C0036.m3668(C0025.m2169(this)));
                }
            }
            return arrayList;
        }

        public List<IssueWithParams> getErrors() {
            boolean zM4137 = C0039.m4137(this);
            ArrayList arrayListM7444 = C0078.m7444(this);
            if (!zM4137) {
                return arrayListM7444;
            }
            ArrayList arrayList = new ArrayList();
            C0067.m5504(arrayList, arrayListM7444);
            C0067.m5504(arrayList, C0024.m1995(this));
            return arrayList;
        }

        public List<X509Certificate> getSignerCertificates() {
            return C0038.m4019(this);
        }

        public SigningCertificateLineage getSigningCertificateLineage() {
            return C0071.m6079(this);
        }

        public SourceStampInfo getSourceStampInfo() {
            return C0025.m2169(this);
        }

        public List<V1SchemeSignerInfo> getV1SchemeIgnoredSigners() {
            return C0020.m1420(this);
        }

        public List<V1SchemeSignerInfo> getV1SchemeSigners() {
            return C0022.m1712(this);
        }

        public List<V2SchemeSignerInfo> getV2SchemeSigners() {
            return C0022.m1719(this);
        }

        public List<V3SchemeSignerInfo> getV31SchemeSigners() {
            return C0027.m2453(this);
        }

        public List<V3SchemeSignerInfo> getV3SchemeSigners() {
            return C0035.m3570(this);
        }

        public List<V4SchemeSignerInfo> getV4SchemeSigners() {
            return C0033.m3291(this);
        }

        public List<IssueWithParams> getWarnings() {
            return C0024.m1995(this);
        }

        public boolean isSourceStampVerified() {
            return C0025.m2224(this);
        }

        public boolean isVerified() {
            return C0030.m2836(this);
        }

        public boolean isVerifiedUsingV1Scheme() {
            return C0068.m5632(this);
        }

        public boolean isVerifiedUsingV2Scheme() {
            return C0075.m6812(this);
        }

        public boolean isVerifiedUsingV31Scheme() {
            return C0078.m7395(this);
        }

        public boolean isVerifiedUsingV3Scheme() {
            return C0077.m7246(this);
        }

        public boolean isVerifiedUsingV4Scheme() {
            return C0065.m4736(this);
        }

        public void setWarningsAsErrors(boolean z) {
            this.r = z;
        }

        public static void access$000(Result result, ApkSigningBlockUtils.Result result2) {
            C0030.m2951(result);
            if (result2 != null) {
                if (C0077.m7227(result2)) {
                    C0067.m5504(C0078.m7444(result), C0039.m4126(result2));
                }
                if (C0032.m3202(result2)) {
                    C0067.m5504(C0024.m1995(result), C0067.m5422(result2));
                }
                int iM707 = C0016.m707(result2);
                if (iM707 != 0) {
                    if (iM707 != 31) {
                        if (iM707 != 2) {
                            if (iM707 != 3) {
                                if (iM707 == 4) {
                                    result.p = C0067.m5416(result2);
                                    Iterator itM4732 = C0065.m4732(C0021.m1543(result2));
                                    while (C0036.m3657(itM4732)) {
                                        C0017.m919(C0033.m3291(result), new V4SchemeSignerInfo((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6012(itM4732), null));
                                    }
                                    return;
                                }
                                throw new IllegalArgumentException(C0071.m5991(m529(), 0, 31, 2444));
                            }
                            result.n = C0067.m5416(result2);
                            Iterator itM47322 = C0065.m4732(C0021.m1543(result2));
                            while (C0036.m3657(itM47322)) {
                                C0017.m919(C0035.m3570(result), new V3SchemeSignerInfo((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6012(itM47322), null));
                            }
                            if (C0071.m6079(result) == null) {
                                result.s = C0019.m1217(result2);
                                return;
                            }
                            return;
                        }
                        result.m = C0067.m5416(result2);
                        Iterator itM47323 = C0065.m4732(C0021.m1543(result2));
                        while (C0036.m3657(itM47323)) {
                            C0017.m919(C0022.m1719(result), new V2SchemeSignerInfo((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6012(itM47323), null));
                        }
                        return;
                    }
                    result.o = C0067.m5416(result2);
                    Iterator itM47324 = C0065.m4732(C0021.m1543(result2));
                    while (C0036.m3657(itM47324)) {
                        C0017.m919(C0027.m2453(result), new V3SchemeSignerInfo((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6012(itM47324), null));
                    }
                    result.s = C0019.m1217(result2);
                    return;
                }
                result.q = C0067.m5416(result2);
                if (!C0025.m2084(C0021.m1543(result2))) {
                    result.j = new SourceStampInfo((ApkSignerInfo) C0071.m6078(C0021.m1543(result2), 0), null);
                }
            }
        }

        public static void access$100(Result result, V1SchemeVerifier.Result result2) {
            C0030.m2951(result);
            result.l = C0019.m1227(result2);
            C0067.m5504(C0078.m7444(result), C0020.m1367(result2));
            C0067.m5504(C0024.m1995(result), C0025.m2125(result2));
            Iterator itM4732 = C0065.m4732(C0024.m2041(result2));
            while (C0036.m3657(itM4732)) {
                C0017.m919(C0022.m1712(result), new V1SchemeSignerInfo((V1SchemeVerifier.Result.SignerInfo) C0071.m6012(itM4732), null));
            }
            Iterator itM47322 = C0065.m4732(C0033.m3326(result2));
            while (C0036.m3657(itM47322)) {
                C0017.m919(C0020.m1420(result), new V1SchemeSignerInfo((V1SchemeVerifier.Result.SignerInfo) C0071.m6012(itM47322), null));
            }
        }

        public static void access$200(Result result, ApkSigResult apkSigResult) {
            C0030.m2951(result);
            if (C0016.m707(apkSigResult) == 0) {
                result.q = C0067.m5416(apkSigResult);
                if (!C0025.m2084(C0111.m13075(apkSigResult))) {
                    result.j = new SourceStampInfo((ApkSignerInfo) C0071.m6078(C0111.m13075(apkSigResult), 0), null);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(C0034.m3431(m529(), 31, 45, 2710));
            C0021.m1551(sb, C0016.m707(apkSigResult));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
    }

    public static void a(List list, List list2, Result result) {
        try {
            if (C0073.m6306(C0064.m4613((X509Certificate) C0071.m6078(list2, 0)), C0064.m4613((X509Certificate) C0071.m6078(list, 0)))) {
                return;
            }
            C0021.m1612(result, C0019.m1304(), new Object[0]);
        } catch (CertificateEncodingException e) {
            throw new RuntimeException(C0023.m1904(m519(), 46, 32, AuthApiStatusCodes.AUTH_TOKEN_ERROR), e);
        }
    }

    public static void b(List list, List list2, byte[] bArr, Result result) {
        if (C0034.m3427(list) != 1) {
            C0021.m1612(result, C0031.m3065(), new Object[0]);
        }
        C0071.m5976(list2, C0032.m3213((Result.V3SchemeSignerInfo) C0071.m6078(list, 0)), result);
        List listM6052 = C0071.m6052((Result.V3SchemeSignerInfo) C0071.m6078(list, 0));
        HashMap map = new HashMap();
        C0078.m7340(listM6052, map);
        byte[] bArrM2654 = C0028.m2654(map);
        if (C0073.m6306(bArr, bArrM2654)) {
            return;
        }
        C0021.m1612(result, C0023.m1834(), new Object[]{C0021.m1548(3), C0027.m2472(bArrM2654), C0027.m2472(bArr)});
    }

    public static ApkSigningBlockUtils.Result g(DataSource dataSource, ApkUtils.ZipSections zipSections, HashSet hashSet, Map map, HashMap map2, int i, int i2, int i3) {
        if (i != 2 && i != 3 && i != 31) {
            return null;
        }
        ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(i);
        try {
            SignatureInfo signatureInfoM1188 = C0019.m1188(dataSource, zipSections, i != 3 ? i != 31 ? 1896449818 : 462663009 : -262969152, result);
            C0077.m7232(hashSet, C0021.m1548(i));
            HashSet hashSet2 = new HashSet(1);
            if (i == 2) {
                C0075.m6811(C0067.m5410(signatureInfoM1188), hashSet2, map, hashSet, i2, i3, result);
            } else {
                C0034.m3487(C0067.m5410(signatureInfoM1188), hashSet2, result);
            }
            EnumMap enumMap = new EnumMap(ContentDigestAlgorithm.class);
            Iterator itM4732 = C0065.m4732(C0021.m1543(result));
            while (C0036.m3657(itM4732)) {
                Iterator itM47322 = C0065.m4732(C0023.m1795((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6012(itM4732)));
                while (C0036.m3657(itM47322)) {
                    ApkSigningBlockUtils.Result.SignerInfo.ContentDigest contentDigest = (ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6012(itM47322);
                    SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(C0026.m2274(contentDigest));
                    if (signatureAlgorithmM4321 != null) {
                        C0064.m4617(enumMap, C0030.m2948(signatureAlgorithmM4321), C0037.m3823(contentDigest));
                    }
                }
            }
            C0038.m3969(map2, C0021.m1548(i), enumMap);
            return result;
        } catch (ApkSigningBlockUtils.SignatureNotFoundException unused) {
            return null;
        }
    }

    public static SigningCertificateLineage getLineageFromResult(Result result, int i, int i2) {
        if ((i2 != 3 && i2 != 31) || C0067.m5445(result)) {
            return null;
        }
        List listM13164 = i2 == 3 ? C0111.m13164(result) : C0038.m3931(result);
        if (C0025.m2084(listM13164)) {
            return null;
        }
        Result.V3SchemeSignerInfo v3SchemeSignerInfo = (Result.V3SchemeSignerInfo) C0071.m6078(listM13164, 0);
        SigningCertificateLineage signingCertificateLineageM977 = C0018.m977(v3SchemeSignerInfo);
        if (signingCertificateLineageM977 != null || C0111.m13169(v3SchemeSignerInfo) == null) {
            return signingCertificateLineageM977;
        }
        try {
            return C0034.m3397(new SigningCertificateLineage.Builder(C0068.m5674(new SigningCertificateLineage.SignerConfig.Builder((KeyConfig) null, C0111.m13169(v3SchemeSignerInfo)))));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static Stream m517(Object obj, Object obj2) {
        if (C0025.m2132() > 0) {
            return ((Stream) obj).map((Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int m518(Object obj, int i) {
        if (C0020.m1385() <= 0) {
            return ((OptionalInt) obj).orElse(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m519() {
        if (C0069.m5781() < 0) {
            return f20short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m520(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return ((Stream) obj).anyMatch((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m521(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((IntStream) obj).min();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static IntStream m522(Object obj, Object obj2) {
        if (C0074.m6454() <= 0) {
            return ((Stream) obj).mapToInt((ToIntFunction) obj2);
        }
        return null;
    }

    public Result verify() throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            DataSource dataSourceM5457 = C0067.m5457(this);
            if (dataSourceM5457 == null) {
                File fileM6527 = C0074.m6527(this);
                if (fileM6527 == null) {
                    throw new IllegalStateException(C0018.m1070(m519(), 592, 16, 2177));
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileM6527, C0030.m2840(m519(), 591, 1, 1759));
                try {
                    dataSourceM5457 = C0034.m3388(randomAccessFile2, 0L, C0028.m2600(randomAccessFile2));
                    randomAccessFile = randomAccessFile2;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        C0022.m1770(randomAccessFile);
                    }
                    throw th;
                }
            }
            Result resultM6213 = C0072.m6213(this, dataSourceM5457);
            if (randomAccessFile != null) {
                C0022.m1770(randomAccessFile);
            }
            return resultM6213;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Result verifySourceStamp() {
        return C0027.m2530(this, null);
    }

    static {
        HashMap map = new HashMap(2);
        C0038.m3969(map, C0021.m1548(2), C0070.m5942(m519(), 0, 23, 1449));
        C0038.m3969(map, C0021.m1548(3), C0069.m5807(m519(), 23, 23, 1219));
        g = map;
    }

    public static boolean compareDigests(Map<ContentDigestAlgorithm, byte[]> map, Map<ContentDigestAlgorithm, byte[]> map2) {
        HashSet hashSet = new HashSet(C0030.m2937(map));
        C0018.m1040(hashSet, C0030.m2937(map2));
        if (C0036.m3648(hashSet)) {
            return false;
        }
        Iterator itM2555 = C0028.m2555(hashSet);
        while (C0036.m3657(itM2555)) {
            ContentDigestAlgorithm contentDigestAlgorithm = (ContentDigestAlgorithm) C0071.m6012(itM2555);
            if (!C0073.m6306((byte[]) C0072.m6108(map, contentDigestAlgorithm), (byte[]) C0072.m6108(map2, contentDigestAlgorithm))) {
                return false;
            }
        }
        return true;
    }

    public static Result d(Result.SourceStampInfo.SourceStampVerificationStatus sourceStampVerificationStatus, Issue issue, Object... objArr) {
        Result result = new Result();
        C0021.m1612(result, issue, objArr);
        C0022.m1777(result, new Result.SourceStampInfo(sourceStampVerificationStatus));
        return result;
    }

    public static EnumMap f(List list, DataSource dataSource, ApkUtils.ZipSections zipSections) throws ApkFormatException {
        CentralDirectoryRecord centralDirectoryRecord;
        EnumMap enumMap = new EnumMap(ContentDigestAlgorithm.class);
        Iterator itM4732 = C0065.m4732(list);
        while (true) {
            if (!C0036.m3657(itM4732)) {
                centralDirectoryRecord = null;
                break;
            }
            centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4732);
            if (C0070.m5838(C0036.m3678(m519(), 112, 20, 1945), C0073.m6387(centralDirectoryRecord))) {
                break;
            }
        }
        if (centralDirectoryRecord == null) {
            return enumMap;
        }
        try {
            C0064.m4617(enumMap, C0111.m13173(), C0026.m2259(C0021.m1585(dataSource, centralDirectoryRecord, C0030.m2922(zipSections))));
            return enumMap;
        } catch (ZipFormatException e) {
            throw new ApkFormatException(C0064.m4545(m519(), 132, 18, 682), e);
        }
    }

    public static Map<ContentDigestAlgorithm, byte[]> getContentDigestsFromResult(Result result, int i) {
        HashMap map = new HashMap();
        if (i != 2 && i != 3 && i != 31) {
            return map;
        }
        if (i == 2) {
            Iterator itM4732 = C0065.m4732(C0017.m837(result));
            while (C0036.m3657(itM4732)) {
                C0072.m6149(C0021.m1579((Result.V2SchemeSignerInfo) C0071.m6012(itM4732)), map);
            }
        } else if (i == 3) {
            Iterator itM47322 = C0065.m4732(C0111.m13164(result));
            while (C0036.m3657(itM47322)) {
                C0072.m6149(C0071.m6052((Result.V3SchemeSignerInfo) C0071.m6012(itM47322)), map);
            }
        } else if (i == 31) {
            Iterator itM47323 = C0065.m4732(C0038.m3931(result));
            while (C0036.m3657(itM47323)) {
                C0072.m6149(C0071.m6052((Result.V3SchemeSignerInfo) C0071.m6012(itM47323)), map);
            }
        }
        return map;
    }

    public static Result getSigningBlockResult(DataSource dataSource, ApkUtils.ZipSections zipSections, int i, int i2) {
        HashMap map = new HashMap();
        Map mapM2127 = C0025.m2127(i);
        HashSet hashSet = new HashSet(2);
        Result result = new Result();
        C0025.m2183(result, C0037.m3864(dataSource, zipSections, hashSet, mapM2127, map, i2, i, i));
        return result;
    }

    public static HashMap h(ApkSigningBlockUtils.Result result) {
        HashMap map = new HashMap();
        Iterator itM4732 = C0065.m4732(C0021.m1543(result));
        while (C0036.m3657(itM4732)) {
            C0078.m7340(C0023.m1795((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6012(itM4732)), map);
        }
        return map;
    }

    public static Map j(int i) {
        HashMap mapM2864 = C0030.m2864();
        if (i >= 28) {
            return mapM2864;
        }
        if (i < 24) {
            return C0070.m5897();
        }
        HashMap map = new HashMap(1);
        C0038.m3969(map, C0021.m1548(2), (String) C0067.m5420(mapM2864, C0021.m1548(2)));
        return map;
    }

    public final Result k(DataSource dataSource) throws ApkFormatException {
        HashSet hashSet;
        int i;
        HashMap map;
        int i2;
        ByteBuffer byteBufferM2492;
        List list;
        int i3;
        int i4;
        X509Certificate x509Certificate;
        CentralDirectoryRecord centralDirectoryRecord;
        int iM518;
        ApkSigningBlockUtils.Result resultM6470;
        int i5 = 0;
        try {
            ApkUtils.ZipSections zipSectionsM3656 = C0036.m3656(dataSource);
            int iM3029 = C0031.m3029(this, dataSource, zipSectionsM3656);
            Result result = new Result();
            HashMap map2 = new HashMap();
            int iM4513 = C0064.m4513(this);
            Map mapM2127 = C0025.m2127(iM4513);
            HashSet hashSet2 = new HashSet(2);
            if (iM4513 >= 24) {
                RunnablesExecutor runnablesExecutorM1564 = C0021.m1564();
                if (iM4513 >= 33) {
                    try {
                        ApkSigningBlockUtils.Result resultM675 = C0016.m675(C0073.m6414(C0025.m2192(C0032.m3235(new V3SchemeVerifier.Builder(dataSource, zipSectionsM3656, C0074.m6445(iM3029, 33), iM4513), runnablesExecutorM1564), 462663009)));
                        C0077.m7232(hashSet2, C0021.m1548(31));
                        iM518 = m518(m521(m522(C0074.m6565(C0021.m1543(resultM675)), new C0461w(i5))), 0);
                        try {
                            C0025.m2183(result, resultM675);
                            C0038.m3969(map2, C0021.m1548(31), C0111.m13061(resultM675));
                        } catch (ApkSigningBlockUtils.SignatureNotFoundException unused) {
                        }
                    } catch (ApkSigningBlockUtils.SignatureNotFoundException unused2) {
                        iM518 = 0;
                    }
                    if (C0029.m2703(result)) {
                        return result;
                    }
                } else {
                    iM518 = 0;
                }
                if (iM4513 >= 28) {
                    try {
                        V3SchemeVerifier.Builder builderM2192 = C0025.m2192(C0032.m3235(new V3SchemeVerifier.Builder(dataSource, zipSectionsM3656, C0074.m6445(iM3029, 28), iM4513), runnablesExecutorM1564), -262969152);
                        if (iM518 > 0) {
                            C0019.m1312(builderM2192, iM518);
                        }
                        ApkSigningBlockUtils.Result resultM6752 = C0016.m675(C0073.m6414(builderM2192));
                        C0077.m7232(hashSet2, C0021.m1548(3));
                        C0025.m2183(result, resultM6752);
                        C0038.m3969(map2, C0021.m1548(3), C0111.m13061(resultM6752));
                    } catch (ApkSigningBlockUtils.SignatureNotFoundException unused3) {
                        if (C0064.m4525(hashSet2, C0021.m1548(31))) {
                            C0021.m1612(result, C0039.m4166(), new Object[0]);
                        }
                    }
                    if (C0029.m2703(result)) {
                        return result;
                    }
                }
                if (iM3029 < 28 || C0036.m3648(hashSet2)) {
                    try {
                        i2 = 24;
                        i = iM4513;
                        map = map2;
                        try {
                            resultM6470 = C0074.m6470(runnablesExecutorM1564, dataSource, zipSectionsM3656, mapM2127, hashSet2, C0074.m6445(iM3029, 24), i);
                            hashSet = hashSet2;
                        } catch (ApkSigningBlockUtils.SignatureNotFoundException unused4) {
                            hashSet = hashSet2;
                        }
                    } catch (ApkSigningBlockUtils.SignatureNotFoundException unused5) {
                        hashSet = hashSet2;
                        i = iM4513;
                        map = map2;
                        i2 = 24;
                    }
                    try {
                        C0077.m7232(hashSet, C0021.m1548(2));
                        C0025.m2183(result, resultM6470);
                        C0038.m3969(map, C0021.m1548(2), C0111.m13061(resultM6470));
                    } catch (ApkSigningBlockUtils.SignatureNotFoundException unused6) {
                    }
                    if (C0029.m2703(result)) {
                        return result;
                    }
                } else {
                    hashSet = hashSet2;
                    i = iM4513;
                    map = map2;
                    i2 = 24;
                }
                File fileM1902 = C0023.m1902(this);
                if (fileM1902 != null) {
                    ApkSigningBlockUtils.Result resultM6865 = C0075.m6865(dataSource, fileM1902);
                    C0077.m7232(hashSet, C0021.m1548(4));
                    C0025.m2183(result, resultM6865);
                    if (C0029.m2703(result)) {
                        return result;
                    }
                }
            } else {
                hashSet = hashSet2;
                i = iM4513;
                map = map2;
                i2 = 24;
            }
            int i6 = i;
            if (i6 >= 26) {
                ByteBuffer byteBufferM24922 = C0027.m2492(dataSource, zipSectionsM3656);
                int iM5554 = C0068.m5554(C0071.m6043(byteBufferM24922));
                if (iM5554 > 1 && C0036.m3648(hashSet)) {
                    C0021.m1612(result, C0063.m4400(), new Object[]{C0021.m1548(iM5554)});
                }
                byteBufferM2492 = byteBufferM24922;
            } else {
                byteBufferM2492 = null;
            }
            List listM1716 = C0022.m1716(dataSource, zipSectionsM3656);
            if (iM3029 < i2 || C0036.m3648(hashSet)) {
                list = listM1716;
                i3 = i6;
                C0028.m2562(result, C0019.m1228(dataSource, zipSectionsM3656, mapM2127, hashSet, iM3029, i6));
                C0038.m3969(map, C0021.m1548(1), C0067.m5440(list, dataSource, zipSectionsM3656));
            } else {
                list = listM1716;
                i3 = i6;
            }
            if (C0029.m2703(result)) {
                return result;
            }
            try {
                try {
                    Iterator itM4732 = C0065.m4732(list);
                    while (true) {
                        if (!C0036.m3657(itM4732)) {
                            centralDirectoryRecord = null;
                            break;
                        }
                        centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4732);
                        if (C0070.m5838(C0017.m936(m519(), 150, 17, 1231), C0073.m6387(centralDirectoryRecord))) {
                            break;
                        }
                    }
                    if (centralDirectoryRecord != null) {
                        HashMap map3 = map;
                        i4 = 30;
                        try {
                            C0069.m5819(result, C0035.m3536(dataSource, zipSectionsM3656, C0021.m1585(dataSource, centralDirectoryRecord, C0030.m2922(zipSectionsM3656)), map3, C0074.m6445(iM3029, 30), i3));
                        } catch (SignatureNotFoundException unused7) {
                            C0030.m2848(result, C0063.m4398(), new Object[0]);
                        }
                    } else {
                        i4 = 30;
                    }
                } catch (SignatureNotFoundException unused8) {
                    i4 = 30;
                }
                if (C0029.m2703(result)) {
                    return result;
                }
                if (C0111.m13037(result) && C0023.m1823(result)) {
                    ArrayList arrayList = new ArrayList(C0074.m6563(result));
                    ArrayList arrayList2 = new ArrayList(C0017.m837(result));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator itM4154 = C0039.m4154(arrayList);
                    while (C0036.m3657(itM4154)) {
                        Result.V1SchemeSignerInfo v1SchemeSignerInfo = (Result.V1SchemeSignerInfo) C0071.m6012(itM4154);
                        try {
                            C0017.m919(arrayList3, new ByteArray(C0064.m4613(C0031.m3015(v1SchemeSignerInfo)), null));
                        } catch (CertificateEncodingException e) {
                            StringBuilder sb = new StringBuilder(C0076.m6902(m519(), 185, 28, 947));
                            C0077.m7290(sb, C0020.m1418(v1SchemeSignerInfo));
                            C0077.m7290(sb, C0030.m2840(m519(), 213, 6, 1235));
                            throw new IllegalStateException(C0068.m5536(sb), e);
                        }
                    }
                    Iterator itM41542 = C0039.m4154(arrayList2);
                    while (C0036.m3657(itM41542)) {
                        Result.V2SchemeSignerInfo v2SchemeSignerInfo = (Result.V2SchemeSignerInfo) C0071.m6012(itM41542);
                        try {
                            C0017.m919(arrayList4, new ByteArray(C0064.m4613(C0071.m6021(v2SchemeSignerInfo)), null));
                        } catch (CertificateEncodingException e2) {
                            StringBuilder sb2 = new StringBuilder(C0017.m936(m519(), 219, 56, 983));
                            C0021.m1551(sb2, C0031.m3056(v2SchemeSignerInfo));
                            C0077.m7290(sb2, C0034.m3431(m519(), 275, 7, 2593));
                            throw new IllegalStateException(C0068.m5536(sb2), e2);
                        }
                    }
                    int i7 = 0;
                    while (true) {
                        if (i7 >= C0018.m1084(arrayList3)) {
                            break;
                        }
                        if (!C0068.m5561(arrayList4, (ByteArray) C0064.m4526(arrayList3, i7))) {
                            C0027.m2488((Result.V1SchemeSignerInfo) C0064.m4526(arrayList, i7), C0023.m1819(), new Object[0]);
                            break;
                        }
                        i7++;
                    }
                    int i8 = 0;
                    while (true) {
                        if (i8 >= C0018.m1084(arrayList4)) {
                            break;
                        }
                        if (!C0068.m5561(arrayList3, (ByteArray) C0064.m4526(arrayList4, i8))) {
                            C0020.m1427((Result.V2SchemeSignerInfo) C0064.m4526(arrayList2, i8), C0032.m3208(), new Object[0]);
                            break;
                        }
                        i8++;
                    }
                }
                if (C0073.m6411(result) && (C0111.m13037(result) || C0023.m1823(result))) {
                    SigningCertificateLineage signingCertificateLineageM4444 = C0063.m4444(result);
                    if (C0111.m13037(result)) {
                        List listM6563 = C0074.m6563(result);
                        if (C0034.m3427(listM6563) != 1) {
                            C0021.m1612(result, C0068.m5658(), new Object[0]);
                        }
                        x509Certificate = (X509Certificate) C0071.m6078(C0016.m652((Result.V1SchemeSignerInfo) C0071.m6078(listM6563, 0)), 0);
                    } else {
                        List listM837 = C0017.m837(result);
                        if (C0034.m3427(listM837) != 1) {
                            C0021.m1612(result, C0068.m5658(), new Object[0]);
                        }
                        x509Certificate = (X509Certificate) C0071.m6078(C0063.m4338((Result.V2SchemeSignerInfo) C0071.m6078(listM837, 0)), 0);
                    }
                    if (signingCertificateLineageM4444 == null) {
                        List listM13164 = C0111.m13164(result);
                        if (C0034.m3427(listM13164) != 1) {
                            C0021.m1612(result, C0031.m3099(), new Object[0]);
                        }
                        try {
                            if (!C0073.m6306(C0064.m4613(x509Certificate), C0064.m4613((X509Certificate) C0071.m6078(C0032.m3213((Result.V3SchemeSignerInfo) C0071.m6078(listM13164, 0)), 0)))) {
                                C0021.m1612(result, C0024.m1990(), new Object[0]);
                            }
                        } catch (CertificateEncodingException e3) {
                            throw new RuntimeException(C0039.m4066(m519(), 282, 52, 1667), e3);
                        }
                    } else {
                        try {
                            if (C0068.m5602(C0026.m2275(signingCertificateLineageM4444, x509Certificate)) != 1) {
                                C0021.m1612(result, C0024.m1990(), new Object[0]);
                            }
                        } catch (IllegalArgumentException unused9) {
                            C0021.m1612(result, C0024.m1990(), new Object[0]);
                        }
                    }
                }
                if (C0032.m3172(result)) {
                    List listM3150 = C0032.m3150(result);
                    List listM2829 = C0030.m2829((Result.V4SchemeSignerInfo) C0071.m6078(listM3150, 0));
                    if (C0034.m3427(listM2829) != 1) {
                        C0021.m1612(result, C0039.m4073(), new Object[]{C0021.m1548(C0034.m3427(listM2829))});
                        if (C0025.m2084(listM2829)) {
                            return result;
                        }
                    }
                    byte[] bArrM3823 = C0037.m3823((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6078(listM2829, 0));
                    if (C0073.m6411(result)) {
                        boolean zM2631 = C0028.m2631(result);
                        if (C0034.m3427(listM3150) != (zM2631 ? 2 : 1)) {
                            C0021.m1612(result, zM2631 ? C0032.m3227() : C0031.m3065(), new Object[0]);
                            return result;
                        }
                        C0028.m2549(C0111.m13164(result), C0018.m957((Result.V4SchemeSignerInfo) C0071.m6078(listM3150, 0)), bArrM3823, result);
                        if (zM2631) {
                            List listM28292 = C0030.m2829((Result.V4SchemeSignerInfo) C0071.m6078(listM3150, 1));
                            if (C0034.m3427(listM28292) != 1) {
                                C0021.m1612(result, C0039.m4073(), new Object[]{C0021.m1548(C0034.m3427(listM28292))});
                                if (C0025.m2084(listM28292)) {
                                    return result;
                                }
                            }
                            C0028.m2549(C0038.m3931(result), C0018.m957((Result.V4SchemeSignerInfo) C0071.m6078(listM3150, 1)), C0037.m3823((ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6078(listM28292, 0)), result);
                        }
                    } else {
                        if (!C0023.m1823(result)) {
                            throw new RuntimeException(C0016.m625(m519(), 334, 45, 3144));
                        }
                        if (C0034.m3427(listM3150) != 1) {
                            C0021.m1612(result, C0031.m3065(), new Object[0]);
                        }
                        List listM8372 = C0017.m837(result);
                        if (C0034.m3427(listM8372) != 1) {
                            C0021.m1612(result, C0031.m3065(), new Object[0]);
                        }
                        C0071.m5976(C0018.m957((Result.V4SchemeSignerInfo) C0071.m6078(listM3150, 0)), C0063.m4338((Result.V2SchemeSignerInfo) C0071.m6078(listM8372, 0)), result);
                        List listM1579 = C0021.m1579((Result.V2SchemeSignerInfo) C0071.m6078(listM8372, 0));
                        HashMap map4 = new HashMap();
                        C0078.m7340(listM1579, map4);
                        byte[] bArrM2654 = C0028.m2654(map4);
                        if (!C0073.m6306(bArrM3823, bArrM2654)) {
                            C0021.m1612(result, C0023.m1834(), new Object[]{C0021.m1548(2), C0027.m2472(bArrM2654), C0027.m2472(bArrM3823)});
                        }
                    }
                }
                if (byteBufferM2492 == null) {
                    try {
                        byteBufferM2492 = C0027.m2492(dataSource, zipSectionsM3656);
                    } catch (ApkFormatException unused10) {
                    }
                }
                if (byteBufferM2492 != null) {
                    int iM7254 = C0077.m7254(C0071.m6043(byteBufferM2492));
                    int i9 = iM7254 >= i4 ? 2 : 1;
                    if (i9 > 1 && i3 >= iM7254 && (i9 == 2 ? !C0023.m1823(result) : i9 == 3) && !C0073.m6411(result) && !C0028.m2631(result)) {
                        C0021.m1612(result, C0069.m5779(), new Object[]{C0021.m1548(iM7254), C0021.m1548(i9)});
                    }
                }
                if (C0029.m2703(result)) {
                    return result;
                }
                C0072.m6208(result);
                if (C0028.m2631(result)) {
                    List listM3931 = C0038.m3931(result);
                    C0070.m5937(result, C0111.m13169((Result.V3SchemeSignerInfo) C0071.m6078(listM3931, C0034.m3427(listM3931) - 1)));
                } else if (C0073.m6411(result)) {
                    List listM131642 = C0111.m13164(result);
                    C0070.m5937(result, C0111.m13169((Result.V3SchemeSignerInfo) C0071.m6078(listM131642, C0034.m3427(listM131642) - 1)));
                } else if (C0023.m1823(result)) {
                    Iterator itM47322 = C0065.m4732(C0017.m837(result));
                    while (C0036.m3657(itM47322)) {
                        C0070.m5937(result, C0071.m6021((Result.V2SchemeSignerInfo) C0071.m6012(itM47322)));
                    }
                } else {
                    if (!C0111.m13037(result)) {
                        throw new RuntimeException(C0031.m3047(m519(), 379, 68, 1321));
                    }
                    Iterator itM47323 = C0065.m4732(C0074.m6563(result));
                    while (C0036.m3657(itM47323)) {
                        C0070.m5937(result, C0031.m3015((Result.V1SchemeSignerInfo) C0071.m6012(itM47323)));
                    }
                }
                return result;
            } catch (ZipFormatException e4) {
                throw new ApkFormatException(C0072.m6116(m519(), 167, 18, 2541), e4);
            }
        } catch (ZipFormatException e5) {
            throw new ApkFormatException(C0025.m2151(m519(), 447, 32, 2446), e5);
        }
    }

    public final int l(DataSource dataSource, ApkUtils.ZipSections zipSections) {
        String strM2151 = C0025.m2151(m519(), 479, 1, 2529);
        String strM5418 = C0067.m5418(m519(), 480, 19, 660);
        int iM4513 = C0064.m4513(this);
        Integer numM3696 = C0036.m3696(this);
        if (numM3696 == null) {
            int iM5655 = C0068.m5655(C0071.m6043(C0027.m2492(dataSource, zipSections)));
            if (iM5655 <= iM4513) {
                return iM5655;
            }
            StringBuilder sb = new StringBuilder(C0064.m4545(m519(), 550, 24, 1161));
            C0021.m1551(sb, iM5655);
            C0077.m7290(sb, strM5418);
            C0021.m1551(sb, iM4513);
            C0077.m7290(sb, strM2151);
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        if (C0025.m2170(numM3696) < 0) {
            StringBuilder sb2 = new StringBuilder(C0075.m6791(m519(), 514, 36, 1563));
            C0036.m3741(sb2, numM3696);
            throw new IllegalArgumentException(C0068.m5536(sb2));
        }
        if (numM3696 == null || C0025.m2170(numM3696) <= iM4513) {
            return C0025.m2170(numM3696);
        }
        StringBuilder sb3 = new StringBuilder(C0111.m13097(m519(), 499, 15, 2705));
        C0036.m3741(sb3, numM3696);
        C0077.m7290(sb3, strM5418);
        C0021.m1551(sb3, iM4513);
        C0077.m7290(sb3, strM2151);
        throw new IllegalArgumentException(C0068.m5536(sb3));
    }

    public final Result m(DataSource dataSource, String str) {
        CentralDirectoryRecord centralDirectoryRecord;
        Result result;
        HashSet hashSet;
        HashMap map;
        int i;
        int i2;
        HashMap map2;
        int iM4513 = C0064.m4513(this);
        try {
            ApkUtils.ZipSections zipSectionsM3656 = C0036.m3656(dataSource);
            int iM3029 = C0031.m3029(this, dataSource, zipSectionsM3656);
            List listM1716 = C0022.m1716(dataSource, zipSectionsM3656);
            Iterator itM4732 = C0065.m4732(listM1716);
            while (true) {
                if (!C0036.m3657(itM4732)) {
                    centralDirectoryRecord = null;
                    break;
                }
                centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4732);
                if (C0070.m5838(C0033.m3330(m519(), 574, 17, 1732), C0073.m6387(centralDirectoryRecord))) {
                    break;
                }
            }
            if (centralDirectoryRecord == null) {
                try {
                    C0019.m1188(dataSource, zipSectionsM3656, 1845461005, new ApkSigningBlockUtils.Result(0));
                    return C0025.m2137(C0031.m3094(), C0018.m1039(), new Object[0]);
                } catch (ApkSigningBlockUtils.SignatureNotFoundException unused) {
                    return C0025.m2137(C0017.m905(), C0021.m1590(), new Object[0]);
                }
            }
            byte[] bArrM1585 = C0021.m1585(dataSource, centralDirectoryRecord, C0030.m2922(zipSectionsM3656));
            if (str != null) {
                String strM2472 = C0027.m2472(bArrM1585);
                if (!C0025.m2111(str, strM2472)) {
                    return C0025.m2137(C0039.m4079(), C0063.m4414(), new Object[]{strM2472, str});
                }
            }
            HashMap map3 = new HashMap();
            Map mapM2127 = C0025.m2127(iM4513);
            HashSet hashSet2 = new HashSet(2);
            Result result2 = new Result();
            if (iM4513 >= 28) {
                i = 28;
                result = result2;
                hashSet = hashSet2;
                map = map3;
                ApkSigningBlockUtils.Result resultM3864 = C0037.m3864(dataSource, zipSectionsM3656, hashSet2, mapM2127, map3, 3, C0074.m6445(iM3029, 28), C0064.m4513(this));
                if (resultM3864 != null && C0077.m7227(resultM3864)) {
                    C0025.m2183(result, resultM3864);
                    C0022.m1777(result, new Result.SourceStampInfo(C0063.m4378()));
                    return result;
                }
            } else {
                result = result2;
                hashSet = hashSet2;
                map = map3;
                i = 28;
            }
            if (iM4513 < 24 || (iM3029 >= i && !C0036.m3648(hashSet))) {
                i2 = 24;
            } else {
                i2 = 24;
                ApkSigningBlockUtils.Result resultM38642 = C0037.m3864(dataSource, zipSectionsM3656, hashSet, mapM2127, map, 2, C0074.m6445(iM3029, 24), C0064.m4513(this));
                if (resultM38642 != null && C0077.m7227(resultM38642)) {
                    C0025.m2183(result, resultM38642);
                    C0022.m1777(result, new Result.SourceStampInfo(C0063.m4378()));
                    return result;
                }
            }
            if (iM3029 < i2 || C0036.m3648(hashSet)) {
                map2 = map;
                C0038.m3969(map2, C0021.m1548(1), C0067.m5440(listM1716, dataSource, zipSectionsM3656));
            } else {
                map2 = map;
            }
            ApkSigResult apkSigResultM3536 = C0035.m3536(dataSource, zipSectionsM3656, bArrM1585, map2, iM3029, C0064.m4513(this));
            C0069.m5819(result, apkSigResultM3536);
            if (C0067.m5416(apkSigResultM3536)) {
                C0072.m6208(result);
            } else {
                C0028.m2539(result, true);
            }
            return result;
        } catch (ApkFormatException e) {
            e = e;
            return C0025.m2137(C0063.m4378(), C0067.m5494(), new Object[]{e});
        } catch (SignatureNotFoundException unused2) {
            return C0025.m2137(C0031.m3094(), C0063.m4398(), new Object[0]);
        } catch (ZipFormatException e2) {
            e = e2;
            return C0025.m2137(C0063.m4378(), C0067.m5494(), new Object[]{e});
        } catch (IOException e3) {
            e = e3;
            return C0025.m2137(C0063.m4378(), C0067.m5494(), new Object[]{e});
        } catch (NoSuchAlgorithmException e4) {
            return C0025.m2137(C0063.m4378(), C0069.m5713(), new Object[]{e4});
        }
    }

    public Result verifySourceStamp(String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                DataSource dataSourceM5457 = C0067.m5457(this);
                if (dataSourceM5457 == null) {
                    File fileM6527 = C0074.m6527(this);
                    if (fileM6527 == null) {
                        throw new IllegalStateException(C0033.m3330(m519(), 609, 16, 3032));
                    }
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileM6527, C0111.m13097(m519(), 608, 1, 2497));
                    try {
                        dataSourceM5457 = C0034.m3388(randomAccessFile2, 0L, C0028.m2600(randomAccessFile2));
                        randomAccessFile = randomAccessFile2;
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile = randomAccessFile2;
                        Result resultM2137 = C0025.m2137(C0063.m4378(), C0069.m5713(), new Object[]{e});
                        if (randomAccessFile != null) {
                            try {
                                C0022.m1770(randomAccessFile);
                            } catch (IOException unused) {
                            }
                        }
                        return resultM2137;
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
                Result resultM6384 = C0073.m6384(this, dataSourceM5457, str);
                if (randomAccessFile != null) {
                    try {
                        C0022.m1770(randomAccessFile);
                    } catch (IOException unused3) {
                    }
                }
                return resultM6384;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public ApkVerifier(File file, DataSource dataSource, File file2, Integer num, int i, AnonymousClass1 anonymousClass1) {
        this.a = file;
        this.b = dataSource;
        this.c = file2;
        this.d = num;
        this.e = i;
    }

    public static void c(List list, HashMap map) {
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            ApkSigningBlockUtils.Result.SignerInfo.ContentDigest contentDigest = (ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6012(itM4732);
            SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(C0026.m2274(contentDigest));
            if (signatureAlgorithmM4321 != null) {
                C0038.m3969(map, C0030.m2948(signatureAlgorithmM4321), C0037.m3823(contentDigest));
            }
        }
    }

    public static boolean containsLineageErrors(Result result) {
        if (!C0029.m2703(result)) {
            return false;
        }
        return m520(m517(C0074.m6565(C0029.m2735(result)), new r(2)), new C0467x(0));
    }

    public static ByteBuffer e(DataSource dataSource, ApkUtils.ZipSections zipSections) throws ApkFormatException {
        try {
            return C0068.m5551(C0022.m1716(dataSource, zipSections), C0072.m6182(dataSource, 0L, C0030.m2922(zipSections)));
        } catch (ZipFormatException e) {
            throw new ApkFormatException(C0063.m4315(m519(), 78, 34, 362), e);
        }
    }

    public static void i(List list, HashMap map) {
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            ApkSigningBlockUtils.Result.SignerInfo.ContentDigest contentDigest = (ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6012(itM4732);
            SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(C0026.m2274(contentDigest));
            if (signatureAlgorithmM4321 != null) {
                C0038.m3969(map, C0030.m2948(signatureAlgorithmM4321), C0037.m3823(contentDigest));
            }
        }
    }
}
