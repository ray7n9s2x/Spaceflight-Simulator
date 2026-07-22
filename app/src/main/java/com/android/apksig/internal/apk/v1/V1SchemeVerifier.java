package com.android.apksig.internal.apk.v1;

import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.Attribute;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.ContentInfo;
import com.android.apksig.internal.pkcs7.Pkcs7DecodingException;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.util.Pair;
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
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
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
import j$.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V1SchemeVerifier {
    public static final String[] a;
    public static final HashMap b;
    public static final HashMap c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f64short = {418, 441, 432, 476, 452, 448, 451, 3053, 3062, 3071, 2963, 2957, 2950, 2954, 3284, 3279, 3270, 3242, 3253, 3250, 3249, 2697, 2706, 2715, 2807, 2795, 1531, 1522, 1411, 834, 857, 848, 3131, 3104, 3113, 3161, 2885, 2893, 2908, 2889, 2853, 2881, 2886, 2894, 2855, 1063, 3026, 3003, 2966, 2968, 2970, 2956, 2955, 487, 495, 510, 491, 391, 483, 484, 492, 389, 487, 491, 484, 483, 492, 495, 505, 510, 388, 487, 492, 503, 464, 472, 477, 468, 469, 401, 453, 478, 401, 451, 468, 464, 469, 401, 468, 479, 453, 451, 456, 395, 401, 3055, 3011, 3022, 3012, 3021, 3024, 3023, 3015, 3014, 2946, 3064, 3051, 3058, 2946, 3015, 3020, 3030, 3024, 3035, 2968, 2946, 1160, 1189, 1195, 1193, 1215, 1208, 1249, 1165, 1184, 1195, 1187, 1214, 1189, 1208, 1188, 1185, 1215, 2389, 2382, 2375, 2342, 2389, 2382, 2375, 2359, 2700, 2711, 2718, 2802, 2798, 1429, 1422, 1415, 1527, 1185, 1189, 1186, 1183, 1192, 1191, 1178, 1193, 1214, 1215, 1189, 1187, 1186, 1260, 1252, 2216, 2209, 2239, 2209, 2284, 2272, 2297, 2258, 2277, 2282, 2263, 2276, 2291, 2290, 2280, 2286, 2287, 2209, 2217, 3237};

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v1.V1SchemeVerifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @Asn1Class(type = Asn1Type.CHOICE)
    public static class ObjectIdentifierChoice {

        @Asn1Field(type = Asn1Type.OBJECT_IDENTIFIER)
        public String value;
    }

    @Asn1Class(type = Asn1Type.CHOICE)
    public static class OctetStringChoice {

        @Asn1Field(type = Asn1Type.OCTET_STRING)
        public byte[] value;
    }

    public static class Result {
        public boolean verified;
        public final List<SignerInfo> signers = new ArrayList();
        public final List<SignerInfo> ignoredSigners = new ArrayList();
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();

        public static class SignerInfo {
            public final String name;
            public final String signatureBlockFileName;
            public final String signatureFileName;
            public final List<X509Certificate> certChain = new ArrayList();
            public final ArrayList a = new ArrayList();
            public final ArrayList b = new ArrayList();

            public static boolean access$600(SignerInfo signerInfo) {
                return !C0066.m4881(C0016.m708(signerInfo));
            }

            public List<ApkVerifier.IssueWithParams> getErrors() {
                return C0016.m708(this);
            }

            public List<ApkVerifier.IssueWithParams> getWarnings() {
                return C0020.m1372(this);
            }

            public SignerInfo(String str, String str2, String str3, AnonymousClass1 anonymousClass1) {
                this.name = str;
                this.signatureBlockFileName = str2;
                this.signatureFileName = str3;
            }
        }

        public static boolean access$000(Result result) {
            if (!C0066.m4881(C0075.m6891(result))) {
                return true;
            }
            Iterator itM4732 = C0065.m4732(C0024.m2041(result));
            while (C0036.m3657(itM4732)) {
                if (C0067.m5446((SignerInfo) C0071.m6012(itM4732))) {
                    return true;
                }
            }
            return false;
        }

        public List<ApkVerifier.IssueWithParams> getErrors() {
            return C0075.m6891(this);
        }

        public List<ApkVerifier.IssueWithParams> getWarnings() {
            return C0023.m1877(this);
        }
    }

    public static class SignedAttributes {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f65short = {484, 469, 464, 460, 457, 451, 449, 468, 453, 384, 467, 457, 455, 462, 453, 452, 384, 449, 468, 468, 466, 457, 450, 469, 468, 453, 410, 384, 972, 1017, 1017, 1023, 996, 1007, 1016, 1017, 1000, 941, 1062, 1134, 1127, 1141, 1062, 1131, 1139, 1130, 1138, 1135, 1142, 1130, 1123, 1062, 1136, 1127, 1130, 1139, 1123, 1141, 1616, 1655, 1663, 1658, 1651, 1650, 1590, 1634, 1657, 1590, 1650, 1651, 1653, 1657, 1650, 1651, 1590, 1625, 1620, 1628, 1619, 1621, 1602, 1590, 1631, 1618, 1619, 1624, 1602, 1631, 1616, 1631, 1619, 1604, 671, 696, 688, 693, 700, 701, 761, 685, 694, 761, 701, 700, 698, 694, 701, 700, 761, 662, 667, 659, 668, 666, 653, 761, 656, 669, 668, 663, 653, 656, 671, 656, 668, 651};
        public final HashMap a;

        /* JADX INFO: renamed from: ۟ۤۡ۠ۡ, reason: not valid java name and contains not printable characters */
        public static HashMap m1110(Object obj) {
            if (C0065.m4647() > 0) {
                return ((SignedAttributes) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡ۟۟ۦ, reason: not valid java name and contains not printable characters */
        public static Asn1OpaqueObject m1111(Object obj, Object obj2) {
            if (C0023.m1921() >= 0) {
                return ((SignedAttributes) obj).a((String) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۨ۟ۥ, reason: not valid java name and contains not printable characters */
        public static short[] m1112() {
            if (C0111.m13165() <= 0) {
                return f65short;
            }
            return null;
        }

        public final Asn1OpaqueObject a(String str) throws Pkcs7DecodingException {
            List list = (List) C0067.m5420(m1110(this), str);
            if (list == null || C0025.m2084(list)) {
                return null;
            }
            if (C0034.m3427(list) <= 1) {
                return (Asn1OpaqueObject) C0071.m6078(list, 0);
            }
            throw new Pkcs7DecodingException(C0074.m6503(C0027.m2404(m1112(), 28, 10, 909), str, C0037.m3829(m1112(), 38, 20, 1030)));
        }

        public SignedAttributes(Collection<Attribute> collection) throws Pkcs7DecodingException {
            HashMap map = new HashMap(C0064.m4608(collection));
            Iterator itM4820 = C0066.m4820(collection);
            while (C0036.m3657(itM4820)) {
                Attribute attribute = (Attribute) C0071.m6012(itM4820);
                if (C0038.m3969(map, C0030.m2854(attribute), C0026.m2333(attribute)) != null) {
                    StringBuilder sb = new StringBuilder(C0070.m5942(m1112(), 0, 28, 416));
                    C0077.m7290(sb, C0030.m2854(attribute));
                    throw new Pkcs7DecodingException(C0068.m5536(sb));
                }
            }
            this.a = map;
        }

        public String getSingleObjectIdentifierValue(String str) throws Pkcs7DecodingException {
            Asn1OpaqueObject asn1OpaqueObjectM1111 = m1111(this, str);
            if (asn1OpaqueObjectM1111 == null) {
                return null;
            }
            try {
                return C0016.m671((ObjectIdentifierChoice) C0036.m3643(C0030.m2907(asn1OpaqueObjectM1111), ObjectIdentifierChoice.class));
            } catch (Asn1DecodingException e) {
                throw new Pkcs7DecodingException(C0030.m2840(m1112(), 58, 34, 1558), e);
            }
        }

        public byte[] getSingleOctetStringValue(String str) throws Pkcs7DecodingException {
            Asn1OpaqueObject asn1OpaqueObjectM1111 = m1111(this, str);
            if (asn1OpaqueObjectM1111 == null) {
                return null;
            }
            try {
                return C0032.m3117((OctetStringChoice) C0036.m3643(C0030.m2907(asn1OpaqueObjectM1111), OctetStringChoice.class));
            } catch (Asn1DecodingException e) {
                throw new Pkcs7DecodingException(C0111.m13097(m1112(), 92, 34, 729), e);
            }
        }
    }

    public static class Signer {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f66short = {688, 700, 1560, 1170, 289, 283, 277, 284, 283, 284, 277, 338, 273, 279, 256, 262, 283, 276, 283, 273, 275, 262, 279, 338, 284, 285, 262, 338, 275, 263, 262, 282, 285, 256, 283, 264, 279, 278, 338, 276, 285, 256, 338, 263, 257, 279, 338, 283, 284, 338, 278, 283, 277, 283, 262, 275, 286, 338, 257, 283, 277, 284, 275, 262, 263, 256, 279, 257, 328, 338, 281, 279, 267, 295, 257, 275, 277, 279, 338, 279, 266, 262, 279, 284, 257, 283, 285, 284, 338, 287, 283, 257, 257, 283, 284, 277, 338, 278, 283, 277, 283, 262, 275, 286, 289, 283, 277, 284, 275, 262, 263, 256, 279, 338, 275, 284, 278, 338, 284, 285, 284, 288, 279, 258, 263, 278, 283, 275, 262, 283, 285, 284, 3312, 3311, 3315, 3311, 3321, 3317, 3313, 3311, 3312, 3312, 3314, 3316, 3317, 3320, 3311, 3312, 3311, 3320, 3311, 3314, 2128, 2161, 2110, 2141, 2161, 2160, 2154, 2171, 2160, 2154, 2110, 2122, 2151, 2158, 2171, 2110, 2167, 2160, 2110, 2157, 2167, 2169, 2160, 2171, 2170, 2110, 2175, 2154, 2154, 2156, 2167, 2172, 2155, 2154, 2171, 2157, 2569, 2582, 2570, 2582, 2560, 2572, 2568, 2582, 2569, 2569, 2571, 2573, 2572, 2561, 2582, 2569, 2582, 2561, 2582, 2572, 2114, 2147, 2092, 2159, 2147, 2146, 2168, 2153, 2146, 2168, 2092, 2152, 2149, 2155, 2153, 2175, 2168, 2092, 2149, 2146, 2092, 2175, 2149, 2155, 2146, 2153, 2152, 2092, 2157, 2168, 2168, 2174, 2149, 2158, 2169, 2168, 2153, 2175, 2108, 2075, 2067, 2070, 2079, 2078, 2138, 2062, 2069, 2138, 2058, 2075, 2056, 2057, 2079, 2138, 2057, 2067, 2077, 2068, 2079, 2078, 2138, 2075, 2062, 2062, 2056, 2067, 2072, 2063, 2062, 2079, 2057, 3065, 3048, 3059, 3019, 2968, 3023, 3025, 3020, 3024, 2968, 3051, 3025, 3039, 3030, 3037, 3036, 2968, 3065, 3020, 3020, 3018, 3025, 3034, 3021, 3020, 3037, 3019, 2968, 3034, 3018, 3031, 3027, 3037, 3030, 2968, 3031, 3030, 2968, 3016, 3028, 3033, 3020, 3038, 3031, 3018, 3029, 3019, 2968, 3023, 3025, 3020, 3024, 2968, 3065, 3048, 3057, 2968, 3060, 3037, 3022, 3037, 3028, 2968, 2948, 2968, 2953, 2945, 1526, 1484, 1474, 1483, 1484, 1483, 1474, 1413, 1478, 1472, 1495, 1489, 1484, 1475, 1484, 1478, 1476, 1489, 1472, 1413, 1485, 1476, 1494, 1413, 1488, 1483, 1494, 1488, 1493, 1493, 1482, 1495, 1489, 1472, 1473, 1413, 1478, 1495, 1484, 1489, 1484, 1478, 1476, 1481, 1413, 1472, 1501, 1489, 1472, 1483, 1494, 1484, 1482, 1483, 1494, 1408, 1466, 1460, 1469, 1466, 1469, 1460, 1523, 1456, 1462, 1441, 1447, 1466, 1461, 1466, 1456, 1458, 1447, 1462, 1523, 1441, 1462, 1461, 1462, 1441, 1462, 1469, 1456, 1462, 1463, 1523, 1466, 1469, 1523, 1408, 1466, 1460, 1469, 1462, 1441, 1434, 1469, 1461, 1468, 1523, 1469, 1468, 1447, 1523, 1461, 1468, 1446, 1469, 1463, 1523, 1466, 1469, 1523, 1408, 1466, 1460, 1469, 1462, 1463, 1431, 1458, 1447, 1458, 423, 395, 390, 396, 389, 408, 391, 399, 398, 458, 432, 419, 442, 458, 399, 388, 414, 408, 403, 464, 458, 3091, 3112, 3125, 3123, 3126, 3126, 3113, 3124, 3122, 3107, 3106, 3174, 3077, 3113, 3112, 3122, 3107, 3112, 3122, 3087, 3112, 3104, 3113, 3176, 3109, 3113, 3112, 3122, 3107, 3112, 3122, 3090, 3135, 3126, 3107, 3196, 3174, 1449, 1462, 1450, 1462, 1440, 1452, 1448, 1462, 1449, 1449, 1451, 1453, 1452, 1441, 1462, 1449, 1462, 1455, 1462, 1450, 2705, 2788, 2696, 2727, 2733, 2747, 2726, 2720, 2733, 2788, 2696, 2713, 2690, 2788, 2714, 2720, 2734, 2727, 2732, 2733, 1618, 2064, 2081, 2102, 2098, 2087, 2102, 2103, 2174, 2065, 2090, 1684, 1678, 1664, 1673, 1683, 1672, 1672, 1675, 1564, 1653, 1624, 1622, 1620, 1602, 1605, 2466, 2507, 2534, 2536, 2538, 2556, 2555, 2466, 2498, 2542, 2529, 2534, 2537, 2538, 2556, 2555, 2925, 2917, 2932, 2913, 2829, 2921, 2926, 2918, 2831, 2925, 2913, 2926, 2921, 2918, 2917, 2931, 2932, 2830, 2925, 2918, 1682, 1787, 1750, 1752, 1754, 1740, 1739, 1682, 1778, 1758, 1745, 1750, 1753, 1754, 1740, 1739, 1682, 1778, 1758, 1750, 1745, 1682, 1790, 1739, 1739, 1741, 1750, 1757, 1738, 1739, 1754, 1740};
        public final String a;
        public final Result.SignerInfo b;
        public final CentralDirectoryRecord c;
        public final CentralDirectoryRecord d;
        public boolean e;
        public byte[] f;
        public HashSet g;

        /* JADX INFO: renamed from: ۟۟ۥۨ۠, reason: not valid java name and contains not printable characters */
        public static void m1113(Object obj) {
            if (C0032.m3184() < 0) {
                ((Signer) obj).setIgnored();
            }
        }

        /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
        public static short[] m1114() {
            if (C0019.m1311() == 0) {
                return f66short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
        public static CentralDirectoryRecord m1115(Object obj) {
            if (C0065.m4647() >= 0) {
                return ((Signer) obj).d;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
        public static byte[] m1116(Object obj) {
            if (C0024.m2011() < 0) {
                return ((Signer) obj).f;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢۦۡۥ, reason: not valid java name and contains not printable characters */
        public static Base64.Encoder m1117() {
            if (C0032.m3184() <= 0) {
                return Base64.getEncoder();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۦۨۥ, reason: not valid java name and contains not printable characters */
        public static List m1118(Object obj, Object obj2) {
            if (C0063.m4427() > 0) {
                return getCertificateChain((List) obj, (X509Certificate) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۢۤۨ, reason: not valid java name and contains not printable characters */
        public static String m1119(Object obj, Object obj2) {
            if (C0034.m3450() >= 0) {
                return ((SignedAttributes) obj).getSingleObjectIdentifierValue((String) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۨۡۢ, reason: not valid java name and contains not printable characters */
        public static boolean m1120(Object obj) {
            if (C0030.m2940() > 0) {
                return ((Signer) obj).e;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۟ۧۧۤۨ, reason: not valid java name and contains not printable characters */
        public static String m1121(Object obj) {
            if (C0066.m4827() >= 0) {
                return ((Signer) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠۠ۧ, reason: not valid java name and contains not printable characters */
        public static HashSet m1122(Object obj) {
            if (C0019.m1311() <= 0) {
                return ((Signer) obj).g;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢ۟۟ۢ, reason: not valid java name and contains not printable characters */
        public static byte[] m1123(Object obj, Object obj2) {
            if (C0021.m1598() < 0) {
                return ((SignedAttributes) obj).getSingleOctetStringValue((String) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
        public static X509Certificate m1124(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
            if (C0026.m2298() < 0) {
                return ((Signer) obj).a((SignedData) obj2, (List) obj3, (SignerInfo) obj4, (byte[]) obj5, i, i2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۥۡۥ, reason: not valid java name and contains not printable characters */
        public static CentralDirectoryRecord m1125(Object obj) {
            if (C0076.m6903() < 0) {
                return ((Signer) obj).c;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
        public static Result.SignerInfo m1126(Object obj) {
            if (C0032.m3184() <= 0) {
                return ((Signer) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۤ۟ۦ, reason: contains not printable characters */
        public static String m1127(Object obj, Object obj2) {
            if (C0069.m5781() < 0) {
                return ((Base64.Encoder) obj).encodeToString((byte[]) obj2);
            }
            return null;
        }

        public final X509Certificate a(SignedData signedData, List list, SignerInfo signerInfo, byte[] bArr, int i, int i2) throws SignatureException, InvalidKeyException {
            boolean z = false;
            String strM4636 = C0064.m4636(C0031.m2982(signerInfo));
            String strM46362 = C0064.m4636(C0022.m1702(signerInfo));
            List listM3728 = C0036.m3728(C0018.m1093(i, i2), C0064.m4555(strM4636, strM46362));
            if (!C0025.m2084(listM3728)) {
                String strM7381 = C0078.m7381(strM4636);
                if (strM7381 == null) {
                    strM7381 = strM4636;
                }
                String strM73812 = C0078.m7381(strM46362);
                if (strM73812 == null) {
                    strM73812 = strM46362;
                }
                StringBuilder sb = new StringBuilder();
                Iterator itM4732 = C0065.m4732(listM3728);
                while (C0036.m3657(itM4732)) {
                    InclusiveIntRange inclusiveIntRange = (InclusiveIntRange) C0071.m6012(itM4732);
                    if (C0064.m4509(sb) > 0) {
                        C0077.m7290(sb, C0031.m3047(m1114(), 0, 2, 668));
                    }
                    if (C0020.m1369(inclusiveIntRange) == C0031.m3087(inclusiveIntRange)) {
                        C0077.m7290(sb, C0078.m7464(C0020.m1369(inclusiveIntRange)));
                    } else if (C0031.m3087(inclusiveIntRange) == Integer.MAX_VALUE) {
                        StringBuilder sb2 = new StringBuilder();
                        C0021.m1551(sb2, C0020.m1369(inclusiveIntRange));
                        C0077.m7290(sb2, C0075.m6791(m1114(), 2, 1, 1587));
                        C0077.m7290(sb, C0068.m5536(sb2));
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        C0021.m1551(sb3, C0020.m1369(inclusiveIntRange));
                        C0077.m7290(sb3, C0068.m5544(m1114(), 3, 1, 1215));
                        C0021.m1551(sb3, C0031.m3087(inclusiveIntRange));
                        C0077.m7290(sb, C0068.m5536(sb3));
                    }
                }
                C0073.m6397(m1126(this), C0072.m6167(), new Object[]{C0073.m6387(m1115(this)), strM4636, strM46362, C0068.m5536(sb), strM7381, strM73812});
                return null;
            }
            X509Certificate x509CertificateM5747 = C0069.m5747(list, C0032.m3246(signerInfo));
            if (x509CertificateM5747 == null) {
                throw new SignatureException(C0036.m3678(m1114(), 401, 68, 1491));
            }
            if (C0020.m1441(x509CertificateM5747)) {
                throw new SignatureException(C0038.m4022(m1114(), 346, 55, 1445));
            }
            boolean[] zArrM1417 = C0020.m1417(x509CertificateM5747);
            if (zArrM1417 != null) {
                boolean z2 = zArrM1417.length >= 1 && zArrM1417[0];
                if (zArrM1417.length >= 2 && zArrM1417[1]) {
                    z = true;
                }
                if (!z2 && !z) {
                    throw new SignatureException(C0024.m1945(m1114(), 4, 128, 370));
                }
            }
            String strM2790 = C0029.m2790(strM4636, strM46362);
            Signature signatureM2131 = C0025.m2131(strM2790);
            PublicKey publicKeyM6845 = C0075.m6845(x509CertificateM5747);
            try {
                C0072.m6123(signatureM2131, publicKeyM6845);
            } catch (InvalidKeyException e) {
                try {
                    PublicKey publicKeyM7387 = C0078.m7387(C0111.m13063(C0070.m5875(publicKeyM6845)), new X509EncodedKeySpec(C0038.m3975(publicKeyM6845)));
                    Signature signatureM21312 = C0025.m2131(strM2790);
                    C0072.m6123(signatureM21312, publicKeyM7387);
                    signatureM2131 = signatureM21312;
                } catch (InvalidKeySpecException unused) {
                    throw e;
                }
            }
            Asn1OpaqueObject asn1OpaqueObjectM3611 = C0035.m3611(signerInfo);
            if (asn1OpaqueObjectM3611 == null) {
                C0027.m2440(signatureM2131, bArr);
            } else {
                if (i < 19) {
                    throw new SignatureException(C0077.m7205(m1114(), 279, 67, 3000));
                }
                try {
                    SignedAttributes signedAttributes = new SignedAttributes(C0075.m6838(C0030.m2907(asn1OpaqueObjectM3611), Attribute.class));
                    if (i2 >= 24) {
                        String strM1119 = m1119(signedAttributes, C0075.m6791(m1114(), 132, 20, 3265));
                        if (strM1119 == null) {
                            throw new SignatureException(C0031.m3047(m1114(), 152, 36, 2078));
                        }
                        if (!C0070.m5838(strM1119, C0035.m3548(C0035.m3568(signedData)))) {
                            return null;
                        }
                    }
                    byte[] bArrM1123 = m1123(signedAttributes, C0019.m1189(m1114(), 188, 20, 2616));
                    if (bArrM1123 == null) {
                        throw new SignatureException(C0026.m2321(m1114(), 208, 38, 2060));
                    }
                    if (!C0073.m6306(bArrM1123, C0016.m653(C0030.m2835(C0064.m4510(strM4636)), bArr))) {
                        return null;
                    }
                    ByteBuffer byteBufferM2907 = C0030.m2907(C0035.m3611(signerInfo));
                    C0075.m6873(signatureM2131, (byte) 49);
                    C0037.m3886(byteBufferM2907, 1);
                    C0078.m7463(signatureM2131, byteBufferM2907);
                } catch (Asn1DecodingException e2) {
                    throw new SignatureException(C0111.m13097(m1114(), 246, 33, 2170), e2);
                }
            }
            if (C0025.m2194(signatureM2131, C0071.m6029(C0071.m6043(C0066.m4870(signerInfo))))) {
                return x509CertificateM5747;
            }
            return null;
        }

        public void setIgnored() {
            this.e = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x038a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void verifySigFileAgainstManifest(byte[] r75, com.android.apksig.internal.jar.ManifestParser.Section r76, java.util.Map<java.lang.String, com.android.apksig.internal.jar.ManifestParser.Section> r77, java.util.Map<java.lang.Integer, java.lang.String> r78, java.util.Set<java.lang.Integer> r79, int r80, int r81) {
            /*
                Method dump skipped, instruction units count: 1032
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.internal.apk.v1.V1SchemeVerifier.Signer.verifySigFileAgainstManifest(byte[], com.android.apksig.internal.jar.ManifestParser$Section, java.util.Map, java.util.Map, java.util.Set, int, int):void");
        }

        public static List<X509Certificate> getCertificateChain(List<X509Certificate> list, X509Certificate x509Certificate) {
            X509Certificate x509Certificate2 = x509Certificate;
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(1);
            C0017.m919(arrayList2, x509Certificate2);
            C0078.m7411(arrayList, x509Certificate2);
            while (!C0077.m7285(C0017.m906(x509Certificate2), C0038.m4017(x509Certificate2))) {
                Principal principalM4017 = C0038.m4017(x509Certificate2);
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= C0018.m1084(arrayList)) {
                        break;
                    }
                    X509Certificate x509Certificate3 = (X509Certificate) C0064.m4526(arrayList, i);
                    if (C0077.m7285(principalM4017, C0017.m906(x509Certificate3))) {
                        C0018.m1092(arrayList, i);
                        C0017.m919(arrayList2, x509Certificate3);
                        x509Certificate2 = x509Certificate3;
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    break;
                }
            }
            return arrayList2;
        }

        public String getName() {
            return m1121(this);
        }

        public Result.SignerInfo getResult() {
            return m1126(this);
        }

        public Set<String> getSigFileEntryNames() {
            return m1122(this);
        }

        public String getSignatureBlockEntryName() {
            return C0073.m6387(m1115(this));
        }

        public String getSignatureFileEntryName() {
            return C0073.m6387(m1125(this));
        }

        public boolean isIgnored() {
            return m1120(this);
        }

        public void verifySigBlockAgainstSigFile(DataSource dataSource, long j, int i, int i2) throws ApkFormatException {
            String strM2321 = C0026.m2321(m1114(), 469, 21, 490);
            CentralDirectoryRecord centralDirectoryRecordM1125 = m1125(this);
            CentralDirectoryRecord centralDirectoryRecordM1115 = m1115(this);
            Result.SignerInfo signerInfoM1126 = m1126(this);
            String strM2840 = C0030.m2840(m1114(), 490, 37, 3142);
            try {
                byte[] bArrM1585 = C0021.m1585(dataSource, centralDirectoryRecordM1115, j);
                try {
                    this.f = C0021.m1585(dataSource, centralDirectoryRecordM1125, j);
                    try {
                        ContentInfo contentInfo = (ContentInfo) C0036.m3643(C0020.m1393(bArrM1585), ContentInfo.class);
                        if (!C0070.m5838(C0025.m2151(m1114(), 527, 20, 1432), C0072.m6160(contentInfo))) {
                            StringBuilder sb = new StringBuilder(strM2840);
                            C0077.m7290(sb, C0072.m6160(contentInfo));
                            throw new Asn1DecodingException(C0068.m5536(sb));
                        }
                        SignedData signedData = (SignedData) C0036.m3643(C0030.m2907(C0018.m969(contentInfo)), SignedData.class);
                        if (C0025.m2084(C0029.m2731(signedData))) {
                            C0073.m6397(signerInfoM1126, C0039.m4148(), new Object[]{C0073.m6387(centralDirectoryRecordM1115)});
                            return;
                        }
                        Iterator itM4732 = C0065.m4732(i < 24 ? C0111.m13086((SignerInfo) C0071.m6078(C0029.m2731(signedData), 0)) : C0029.m2731(signedData));
                        List listM2055 = null;
                        X509Certificate x509Certificate = null;
                        SignerInfo signerInfo = null;
                        while (C0036.m3657(itM4732)) {
                            SignerInfo signerInfo2 = (SignerInfo) C0071.m6012(itM4732);
                            if (listM2055 == null) {
                                try {
                                    listM2055 = C0024.m2055(C0022.m1748(signedData));
                                } catch (CertificateException e) {
                                    C0073.m6397(signerInfoM1126, C0016.m711(), new Object[]{C0073.m6387(centralDirectoryRecordM1115), e});
                                    return;
                                }
                            }
                            List list = listM2055;
                            try {
                                X509Certificate x509Certificate2 = x509Certificate;
                                X509Certificate x509CertificateM1124 = m1124(this, signedData, list, signerInfo2, m1116(this), i, i2);
                                if (C0067.m5446(signerInfoM1126)) {
                                    return;
                                }
                                if (x509CertificateM1124 == null || signerInfo != null) {
                                    x509Certificate = x509Certificate2;
                                } else {
                                    x509Certificate = x509CertificateM1124;
                                    signerInfo = signerInfo2;
                                }
                                listM2055 = list;
                            } catch (Pkcs7DecodingException e2) {
                                C0073.m6397(signerInfoM1126, C0016.m711(), new Object[]{C0073.m6387(centralDirectoryRecordM1115), e2});
                                return;
                            } catch (InvalidKeyException e3) {
                                e = e3;
                                C0073.m6397(signerInfoM1126, C0032.m3159(), new Object[]{C0073.m6387(centralDirectoryRecordM1115), C0073.m6387(centralDirectoryRecordM1125), e});
                                return;
                            } catch (SignatureException e4) {
                                e = e4;
                                C0073.m6397(signerInfoM1126, C0032.m3159(), new Object[]{C0073.m6387(centralDirectoryRecordM1115), C0073.m6387(centralDirectoryRecordM1125), e});
                                return;
                            }
                        }
                        X509Certificate x509Certificate3 = x509Certificate;
                        if (signerInfo == null) {
                            C0073.m6397(signerInfoM1126, C0016.m645(), new Object[]{C0073.m6387(centralDirectoryRecordM1115), C0073.m6387(centralDirectoryRecordM1125)});
                            return;
                        }
                        List listM1118 = m1118(listM2055, x509Certificate3);
                        C0063.m4327(C0034.m3417(signerInfoM1126));
                        C0029.m2793(C0034.m3417(signerInfoM1126), listM1118);
                    } catch (Asn1DecodingException e5) {
                        C0033.m3347(e5);
                        C0073.m6397(signerInfoM1126, C0016.m711(), new Object[]{C0073.m6387(centralDirectoryRecordM1115), e5});
                    }
                } catch (ZipFormatException e6) {
                    StringBuilder sb2 = new StringBuilder(strM2321);
                    C0077.m7290(sb2, C0073.m6387(centralDirectoryRecordM1125));
                    throw new ApkFormatException(C0068.m5536(sb2), e6);
                }
            } catch (ZipFormatException e7) {
                StringBuilder sb3 = new StringBuilder(strM2321);
                C0077.m7290(sb3, C0073.m6387(centralDirectoryRecordM1115));
                throw new ApkFormatException(C0068.m5536(sb3), e7);
            }
        }

        public Signer(String str, CentralDirectoryRecord centralDirectoryRecord, CentralDirectoryRecord centralDirectoryRecord2, Result.SignerInfo signerInfo, AnonymousClass1 anonymousClass1) {
            this.a = str;
            this.b = signerInfo;
            this.d = centralDirectoryRecord;
            this.c = centralDirectoryRecord2;
        }
    }

    public static class Signers {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f67short = {1848, 1861, 1872, 1078, 1086, 1071, 1082, 1110, 1074, 1077, 1085, 1108, 2943, 2935, 2918, 2931, 2847, 2939, 2940, 2932, 2845, 2943, 2931, 2940, 2939, 2932, 2935, 2913, 2918, 2844, 2943, 2932, 1629, 1569, 1568, 1586, 507, 401, 390, 404, 2052, 2159, 2153, 2207, 2213, 2219, 2210, 2221, 2232, 2233, 2238, 2217, 2284, 2222, 2208, 2211, 2223, 2215, 2284, 2218, 2213, 2208, 2217, 2284, 2210, 2221, 2209, 2217, 2284, 2216, 2211, 2217, 2239, 2284, 2210, 2211, 2232, 2284, 2223, 2211, 2210, 2232, 2221, 2213, 2210, 2284, 2217, 2228, 2232, 2217, 2210, 2239, 2213, 2211, 2210, 2294, 2284, 3128, 463, 483, 494, 484, 493, 496, 495, 487, 486, 418, 472, 459, 466, 418, 487, 492, 502, 496, 507, 440, 418};

        public static void access$100(DataSource dataSource, long j, List list, Set set, Map map, Set set2, int i, int i2, Result result) throws ApkFormatException {
            String strM2151;
            String strM1189;
            int i3 = 2;
            HashMap map2 = new HashMap(1);
            ArrayList arrayList = new ArrayList(1);
            Iterator itM4732 = C0065.m4732(list);
            CentralDirectoryRecord centralDirectoryRecord = null;
            while (true) {
                boolean zM3657 = C0036.m3657(itM4732);
                strM2151 = C0025.m2151(m1132(), 0, 3, 1814);
                strM1189 = C0019.m1189(m1132(), 3, 9, 1147);
                if (!zM3657) {
                    break;
                }
                CentralDirectoryRecord centralDirectoryRecord2 = (CentralDirectoryRecord) C0071.m6012(itM4732);
                String strM6387 = C0073.m6387(centralDirectoryRecord2);
                if (C0019.m1242(strM6387, strM1189)) {
                    if (centralDirectoryRecord == null && C0070.m5838(C0033.m3330(m1132(), 12, 20, 2866), strM6387)) {
                        centralDirectoryRecord = centralDirectoryRecord2;
                    } else if (C0072.m6150(strM6387, strM2151)) {
                        C0038.m3969(map2, strM6387, centralDirectoryRecord2);
                    } else if (C0072.m6150(strM6387, C0036.m3678(m1132(), 32, 4, 1651)) || C0072.m6150(strM6387, C0016.m625(m1132(), 36, 4, 469)) || C0072.m6150(strM6387, C0071.m5991(m1132(), 40, 3, 2090))) {
                        C0017.m919(arrayList, centralDirectoryRecord2);
                    }
                }
            }
            if (centralDirectoryRecord == null) {
                C0067.m5409(result, C0028.m2670(), new Object[0]);
                return;
            }
            try {
                byte[] bArrM1585 = C0021.m1585(dataSource, centralDirectoryRecord, j);
                Pair pairM1645 = C0021.m1645(bArrM1585, set, result);
                if (C0111.m13092(result)) {
                    return;
                }
                ManifestParser.Section section = (ManifestParser.Section) C0111.m13157(pairM1645);
                Map map3 = (Map) C0037.m3781(pairM1645);
                ArrayList arrayList2 = new ArrayList(C0018.m1084(arrayList));
                Iterator itM4154 = C0039.m4154(arrayList);
                while (C0036.m3657(itM4154)) {
                    CentralDirectoryRecord centralDirectoryRecord3 = (CentralDirectoryRecord) C0071.m6012(itM4154);
                    String strM63872 = C0073.m6387(centralDirectoryRecord3);
                    int iM5815 = C0069.m5815(strM63872, 46);
                    if (iM5815 == -1) {
                        throw new RuntimeException(C0032.m3232(C0032.m3209(m1132(), 43, 54, 2252), strM63872));
                    }
                    StringBuilder sb = new StringBuilder();
                    C0077.m7290(sb, C0032.m3220(strM63872, 0, iM5815));
                    C0077.m7290(sb, strM2151);
                    String strM5536 = C0068.m5536(sb);
                    CentralDirectoryRecord centralDirectoryRecord4 = (CentralDirectoryRecord) C0067.m5420(map2, strM5536);
                    if (centralDirectoryRecord4 == null) {
                        ApkVerifier.Issue issueM1801 = C0023.m1801();
                        HashMap map4 = map2;
                        Object[] objArr = new Object[i3];
                        objArr[0] = strM63872;
                        objArr[1] = strM5536;
                        C0066.m4911(result, issueM1801, objArr);
                        map2 = map4;
                    } else {
                        HashMap map5 = map2;
                        String strM6056 = C0071.m6056(strM63872, 9);
                        C0017.m919(arrayList2, new Signer(strM6056, centralDirectoryRecord3, centralDirectoryRecord4, new Result.SignerInfo(strM6056, strM63872, C0073.m6387(centralDirectoryRecord4), null), null));
                        map2 = map5;
                        i3 = 2;
                    }
                }
                if (C0066.m4881(arrayList2)) {
                    C0067.m5409(result, C0064.m4535(), new Object[0]);
                    return;
                }
                if (C0018.m1084(arrayList2) > 10) {
                    C0067.m5409(result, C0019.m1239(), new Object[]{C0021.m1548(10), C0021.m1548(C0018.m1084(arrayList2))});
                    return;
                }
                Iterator itM41542 = C0039.m4154(arrayList2);
                while (C0036.m3657(itM41542)) {
                    Signer signer = (Signer) C0071.m6012(itM41542);
                    ArrayList arrayList3 = arrayList2;
                    m1133(signer, dataSource, j, i, i2);
                    if (C0067.m5446(m1130(signer))) {
                        C0077.m7162(C0024.m2041(result), m1130(signer));
                    }
                    arrayList2 = arrayList3;
                }
                ArrayList arrayList4 = arrayList2;
                if (C0111.m13092(result)) {
                    return;
                }
                ArrayList arrayList5 = new ArrayList(C0018.m1084(arrayList4));
                Iterator itM41543 = C0039.m4154(arrayList4);
                while (C0036.m3657(itM41543)) {
                    Signer signer2 = (Signer) C0071.m6012(itM41543);
                    byte[] bArr = bArrM1585;
                    m1128(signer2, bArr, section, map3, map, set2, i, i2);
                    if (m1131(signer2)) {
                        C0077.m7162(C0033.m3326(result), m1130(signer2));
                    } else if (C0067.m5446(m1130(signer2))) {
                        C0077.m7162(C0024.m2041(result), m1130(signer2));
                    } else {
                        C0017.m919(arrayList5, signer2);
                    }
                    bArrM1585 = bArr;
                }
                if (C0111.m13092(result)) {
                    return;
                }
                if (C0066.m4881(arrayList5)) {
                    C0067.m5409(result, C0064.m4535(), new Object[0]);
                    return;
                }
                Set setM4528 = C0064.m4528(dataSource, j, list, map3, arrayList5, i, i2, result);
                if (C0111.m13092(result)) {
                    return;
                }
                HashSet hashSet = new HashSet((C0034.m3427(C0024.m2041(result)) * 2) + 1);
                C0077.m7232(hashSet, C0073.m6387(centralDirectoryRecord));
                Iterator itM2001 = C0024.m2001(setM4528);
                while (C0036.m3657(itM2001)) {
                    Signer signer3 = (Signer) C0071.m6012(itM2001);
                    C0077.m7232(hashSet, m1134(signer3));
                    C0077.m7232(hashSet, m1129(signer3));
                }
                Iterator itM47322 = C0065.m4732(list);
                while (C0036.m3657(itM47322)) {
                    String strM63873 = C0073.m6387((CentralDirectoryRecord) C0071.m6012(itM47322));
                    if (C0019.m1242(strM63873, strM1189) && !C0072.m6150(strM63873, C0025.m2151(m1132(), 97, 1, 3095)) && !C0064.m4525(hashSet, strM63873)) {
                        C0066.m4911(result, C0067.m5488(), new Object[]{strM63873});
                    }
                }
                Iterator itM41544 = C0039.m4154(arrayList5);
                while (C0036.m3657(itM41544)) {
                    Signer signer4 = (Signer) C0071.m6012(itM41544);
                    if (C0063.m4345(setM4528, signer4)) {
                        C0077.m7162(C0024.m2041(result), m1130(signer4));
                    } else {
                        C0077.m7162(C0033.m3326(result), m1130(signer4));
                    }
                }
                result.verified = true;
            } catch (ZipFormatException e) {
                StringBuilder sb2 = new StringBuilder(C0019.m1189(m1132(), 98, 21, 386));
                C0077.m7290(sb2, C0073.m6387(centralDirectoryRecord));
                throw new ApkFormatException(C0068.m5536(sb2), e);
            }
        }

        /* JADX INFO: renamed from: ۟۠ۢۡۦ, reason: not valid java name and contains not printable characters */
        public static void m1128(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
            if (C0035.m3569() <= 0) {
                ((Signer) obj).verifySigFileAgainstManifest((byte[]) obj2, (ManifestParser.Section) obj3, (Map) obj4, (Map) obj5, (Set) obj6, i, i2);
            }
        }

        /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
        public static String m1129(Object obj) {
            if (C0020.m1385() < 0) {
                return ((Signer) obj).getSignatureFileEntryName();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥ۟ۡۡ, reason: not valid java name and contains not printable characters */
        public static Result.SignerInfo m1130(Object obj) {
            if (C0071.m6069() >= 0) {
                return ((Signer) obj).getResult();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۨۧۧ, reason: not valid java name and contains not printable characters */
        public static boolean m1131(Object obj) {
            if (C0039.m4109() > 0) {
                return ((Signer) obj).isIgnored();
            }
            return false;
        }

        /* JADX INFO: renamed from: ۢۦۥۥ, reason: not valid java name and contains not printable characters */
        public static short[] m1132() {
            if (C0077.m7272() <= 0) {
                return f67short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۢ۟ۧ, reason: contains not printable characters */
        public static void m1133(Object obj, Object obj2, long j, int i, int i2) throws ApkFormatException {
            if (C0035.m3569() < 0) {
                ((Signer) obj).verifySigBlockAgainstSigFile((DataSource) obj2, j, i, i2);
            }
        }

        /* JADX INFO: renamed from: ۨۦ۠ۧ, reason: not valid java name and contains not printable characters */
        public static String m1134(Object obj) {
            if (C0039.m4109() >= 0) {
                return ((Signer) obj).getSignatureBlockEntryName();
            }
            return null;
        }
    }

    public static Set access$700(DataSource dataSource, long j, Collection collection, Map map, List list, int i, int i2, Result result) throws IOException, ApkFormatException {
        Iterator it;
        ArrayList arrayList;
        int i3;
        char c2 = 2;
        int i4 = 4;
        char c3 = 0;
        int i5 = 1;
        ArrayList arrayList2 = new ArrayList(collection);
        C0039.m4063(arrayList2, C0033.m3312());
        Iterator itM4154 = C0039.m4154(arrayList2);
        ArrayList arrayList3 = null;
        String str = null;
        while (C0036.m3657(itM4154)) {
            CentralDirectoryRecord centralDirectoryRecord = (CentralDirectoryRecord) C0071.m6012(itM4154);
            String strM6387 = C0073.m6387(centralDirectoryRecord);
            if ((C0019.m1242(strM6387, C0063.m4315(m1109(), 36, 9, 2824)) ? 0 : (C0072.m6150(strM6387, C0066.m4828(m1109(), 45, 1, 1032)) ? 1 : 0) ^ i5) != 0) {
                ManifestParser.Section section = (ManifestParser.Section) C0072.m6108(map, strM6387);
                if (section == null) {
                    ApkVerifier.Issue issueM3996 = C0038.m3996();
                    Object[] objArr = new Object[i5];
                    objArr[c3] = strM6387;
                    C0067.m5409(result, issueM3996, objArr);
                } else {
                    ArrayList arrayList4 = new ArrayList(C0034.m3427(list));
                    Iterator itM4732 = C0065.m4732(list);
                    while (C0036.m3657(itM4732)) {
                        Signer signer = (Signer) C0071.m6012(itM4732);
                        if (C0063.m4345(m1106(signer), strM6387)) {
                            C0017.m919(arrayList4, signer);
                        }
                    }
                    if (C0066.m4881(arrayList4)) {
                        ApkVerifier.Issue issueM3772 = C0036.m3772();
                        Object[] objArr2 = new Object[i5];
                        objArr2[c3] = strM6387;
                        C0067.m5409(result, issueM3772, objArr2);
                    } else {
                        if (arrayList3 == null) {
                            str = strM6387;
                            arrayList3 = arrayList4;
                        } else if (!C0025.m2124(arrayList4, arrayList3)) {
                            ApkVerifier.Issue issueM6147 = C0072.m6147();
                            List listM4731 = C0065.m4731(arrayList3);
                            List listM47312 = C0065.m4731(arrayList4);
                            Object[] objArr3 = new Object[i4];
                            objArr3[c3] = str;
                            objArr3[i5] = listM4731;
                            objArr3[c2] = strM6387;
                            objArr3[3] = listM47312;
                            C0067.m5409(result, issueM6147, objArr3);
                        }
                        ArrayList arrayList5 = new ArrayList(C0036.m3745(section, C0069.m5807(m1109(), 46, 7, 3071), i, i2));
                        if (C0066.m4881(arrayList5)) {
                            ApkVerifier.Issue issueM39962 = C0038.m3996();
                            Object[] objArr4 = new Object[i5];
                            objArr4[c3] = strM6387;
                            C0067.m5409(result, issueM39962, objArr4);
                            it = itM4154;
                        } else {
                            MessageDigest[] messageDigestArr = new MessageDigest[C0018.m1084(arrayList5)];
                            for (int i6 = 0; i6 < C0018.m1084(arrayList5); i6 += i5) {
                                messageDigestArr[i6] = C0030.m2835(C0025.m2134((NamedDigest) C0064.m4526(arrayList5, i6)));
                            }
                            try {
                                it = itM4154;
                                C0069.m5743(dataSource, centralDirectoryRecord, j, C0027.m2416(messageDigestArr));
                                int i7 = 0;
                                while (i7 < C0018.m1084(arrayList5)) {
                                    NamedDigest namedDigest = (NamedDigest) C0064.m4526(arrayList5, i7);
                                    byte[] bArrM3355 = C0033.m3355(messageDigestArr[i7]);
                                    if (C0073.m6306(C0078.m7416(namedDigest), bArrM3355)) {
                                        arrayList = arrayList5;
                                        i3 = 1;
                                    } else {
                                        ApkVerifier.Issue issueM6117 = C0072.m6117();
                                        arrayList = arrayList5;
                                        String strM2134 = C0025.m2134(namedDigest);
                                        String strM1107 = m1107(m1104(), bArrM3355);
                                        String strM11072 = m1107(m1104(), C0078.m7416(namedDigest));
                                        i3 = 1;
                                        C0067.m5409(result, issueM6117, new Object[]{strM6387, strM2134, C0028.m2609(m1109(), 53, 20, 426), strM1107, strM11072});
                                    }
                                    i7 += i3;
                                    arrayList5 = arrayList;
                                }
                            } catch (ZipFormatException e) {
                                throw new ApkFormatException(C0032.m3232(C0020.m1443(m1109(), 95, 21, 2978), strM6387), e);
                            } catch (IOException e2) {
                                throw new IOException(C0032.m3232(C0031.m3047(m1109(), 73, 22, 433), strM6387), e2);
                            }
                        }
                        itM4154 = it;
                        c2 = 2;
                        i4 = 4;
                        c3 = 0;
                        i5 = 1;
                    }
                }
            }
        }
        if (arrayList3 != null) {
            return new HashSet(arrayList3);
        }
        C0067.m5409(result, C0065.m4676(), new Object[0]);
        return C0019.m1184();
    }

    public static Pair<ManifestParser.Section, Map<String, ManifestParser.Section>> parseManifest(byte[] bArr, Set<String> set, Result result) {
        ManifestParser manifestParser = new ManifestParser(bArr);
        ManifestParser.Section sectionM5427 = C0067.m5427(manifestParser);
        List listM874 = C0017.m874(manifestParser);
        HashMap map = new HashMap(C0034.m3427(listM874));
        Iterator itM4732 = C0065.m4732(listM874);
        int i = 0;
        while (C0036.m3657(itM4732)) {
            ManifestParser.Section section = (ManifestParser.Section) C0071.m6012(itM4732);
            i++;
            String strM4549 = C0064.m4549(section);
            if (strM4549 == null) {
                C0067.m5409(result, C0073.m6433(), new Object[]{C0021.m1548(i)});
            } else if (C0038.m3969(map, strM4549, section) != null) {
                C0067.m5409(result, C0037.m3809(), new Object[]{strM4549});
            } else if (!C0063.m4345(set, strM4549)) {
                C0067.m5409(result, C0065.m4684(), new Object[]{strM4549});
            }
        }
        return C0025.m2158(sectionM5427, map);
    }

    public static Result verify(DataSource dataSource, ApkUtils.ZipSections zipSections, Map<Integer, String> map, Set<Integer> set, int i, int i2) throws ApkFormatException {
        if (i > i2) {
            StringBuilder sb = new StringBuilder(C0038.m4022(m1109(), 150, 15, 1228));
            C0021.m1551(sb, i);
            C0077.m7290(sb, C0039.m4066(m1109(), 165, 19, 2177));
            C0021.m1551(sb, i2);
            C0077.m7290(sb, C0031.m3047(m1109(), 184, 1, 3212));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        Result result = new Result();
        List listM1716 = C0022.m1716(dataSource, zipSections);
        HashSet hashSet = new HashSet(C0034.m3427(listM1716));
        Iterator itM4732 = C0065.m4732(listM1716);
        HashSet hashSet2 = null;
        while (C0036.m3657(itM4732)) {
            String strM6387 = C0073.m6387((CentralDirectoryRecord) C0071.m6012(itM4732));
            if (!C0077.m7232(hashSet, strM6387)) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                }
                if (C0026.m2346(hashSet2, strM6387)) {
                    C0067.m5409(result, C0036.m3660(), new Object[]{strM6387});
                }
            }
        }
        if (C0111.m13092(result)) {
            return result;
        }
        m1105(dataSource, C0030.m2922(zipSections), listM1716, hashSet, map, set, i, i2, result);
        return result;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1102(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Signer) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Base64.Decoder m1103() {
        if (C0074.m6454() <= 0) {
            return Base64.getDecoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Base64.Encoder m1104() {
        if (C0017.m846() >= 0) {
            return Base64.getEncoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1105(Object obj, long j, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, Object obj6) throws ApkFormatException {
        if (C0038.m4010() > 0) {
            Signers.access$100((DataSource) obj, j, (List) obj2, (Set) obj3, (Map) obj4, (Set) obj5, i, i2, (Result) obj6);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static Set m1106(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((Signer) obj).getSigFileEntryNames();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static String m1107(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            return ((Base64.Encoder) obj).encodeToString((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m1108(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return ((Base64.Decoder) obj).decode((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1109() {
        if (C0111.m13165() <= 0) {
            return f64short;
        }
        return null;
    }

    public static class NamedDigest {
        public final byte[] digest;
        public final String jcaDigestAlgorithm;

        public NamedDigest(String str, byte[] bArr, AnonymousClass1 anonymousClass1) {
            this.jcaDigestAlgorithm = str;
            this.digest = bArr;
        }
    }

    static {
        String strM7427 = C0078.m7427(m1109(), 0, 7, 497);
        String strM3829 = C0037.m3829(m1109(), 7, 7, AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        String strM1728 = C0022.m1728(m1109(), 14, 7, 3207);
        String strM2695 = C0029.m2695(m1109(), 21, 5, 2778);
        a = new String[]{strM7427, strM3829, strM1728, strM2695};
        HashMap map = new HashMap(8);
        b = map;
        String strM3603 = C0035.m3603(m1109(), 26, 3, 1462);
        C0038.m3969(map, strM3603, strM3603);
        C0038.m3969(map, C0070.m5942(m1109(), 29, 3, 785), strM2695);
        C0038.m3969(map, C0018.m1070(m1109(), 32, 4, 3176), strM2695);
        C0038.m3969(map, strM2695, strM2695);
        C0038.m3969(map, strM1728, strM1728);
        C0038.m3969(map, strM3829, strM3829);
        C0038.m3969(map, strM7427, strM7427);
        HashMap map2 = new HashMap(5);
        c = map2;
        Integer numM1548 = C0021.m1548(0);
        C0038.m3969(map2, strM3603, numM1548);
        C0038.m3969(map2, strM2695, numM1548);
        C0038.m3969(map2, strM1728, numM1548);
        Integer numM15482 = C0021.m1548(9);
        C0038.m3969(map2, strM3829, numM15482);
        C0038.m3969(map2, strM7427, numM15482);
    }

    public static int getMinSdkVersionFromWhichSupportedInManifestOrSignatureFile(String str) {
        Integer num = (Integer) C0067.m5420(C0025.m2178(), C0018.m1005(str, C0077.m7270()));
        if (num != null) {
            return C0025.m2170(num);
        }
        return Integer.MAX_VALUE;
    }

    public static List a(ArrayList arrayList) {
        if (C0025.m2084(arrayList)) {
            return C0037.m3866();
        }
        ArrayList arrayList2 = new ArrayList(C0034.m3427(arrayList));
        Iterator itM4732 = C0065.m4732(arrayList);
        while (C0036.m3657(itM4732)) {
            C0017.m919(arrayList2, m1102((Signer) C0071.m6012(itM4732)));
        }
        return arrayList2;
    }

    public static byte[] access$1100(String str, byte[] bArr, int i, int i2) {
        MessageDigest messageDigestM2835 = C0030.m2835(str);
        C0027.m2508(messageDigestM2835, bArr, i, i2);
        return C0033.m3355(messageDigestM2835);
    }

    public static Collection<NamedDigest> getDigestsToVerify(ManifestParser.Section section, String str, int i, int i2) {
        String strM5536;
        byte[] bArrM7416;
        String str2;
        Base64.Decoder decoderM1103 = m1103();
        ArrayList arrayList = new ArrayList(1);
        if (i < 18) {
            String strM2109 = C0025.m2109(section, C0036.m3678(m1109(), 116, 17, 1228));
            if (strM2109 == null) {
                strM2109 = C0025.m2151(m1109(), 133, 8, 2310);
            }
            StringTokenizer stringTokenizer = new StringTokenizer(strM2109);
            while (true) {
                if (!C0016.m669(stringTokenizer)) {
                    break;
                }
                String strM4353 = C0063.m4353(stringTokenizer);
                StringBuilder sb = new StringBuilder();
                C0077.m7290(sb, strM4353);
                C0077.m7290(sb, str);
                String strM21092 = C0025.m2109(section, C0068.m5536(sb));
                if (strM21092 != null && (str2 = (String) C0067.m5420(C0020.m1373(), C0018.m1005(strM4353, C0077.m7270()))) != null && C0019.m1275(str2) <= i) {
                    C0017.m919(arrayList, new NamedDigest(str2, m1108(decoderM1103, strM21092), null));
                    break;
                }
            }
            if (C0066.m4881(arrayList)) {
                return arrayList;
            }
        }
        if (i2 >= 18) {
            String[] strArrM3838 = C0037.m3838();
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                String str3 = strArrM3838[i3];
                if (C0025.m2111(C0078.m7427(m1109(), 141, 5, 2783), str3)) {
                    strM5536 = C0032.m3116(C0070.m5942(m1109(), 146, 4, 1478), str);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    C0077.m7290(sb2, str3);
                    C0077.m7290(sb2, str);
                    strM5536 = C0068.m5536(sb2);
                }
                String strM21093 = C0025.m2109(section, strM5536);
                if (strM21093 == null) {
                    i3++;
                } else {
                    byte[] bArrM1108 = m1108(decoderM1103, strM21093);
                    Iterator itM4154 = C0039.m4154(arrayList);
                    while (true) {
                        if (C0036.m3657(itM4154)) {
                            NamedDigest namedDigest = (NamedDigest) C0071.m6012(itM4154);
                            if (C0025.m2111(C0025.m2134(namedDigest), str3)) {
                                bArrM7416 = C0078.m7416(namedDigest);
                                break;
                            }
                        } else {
                            bArrM7416 = null;
                            break;
                        }
                    }
                    if (bArrM7416 == null || !C0073.m6306(bArrM7416, bArrM1108)) {
                        C0017.m919(arrayList, new NamedDigest(str3, bArrM1108, null));
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<CentralDirectoryRecord> parseZipCentralDirectory(DataSource dataSource, ApkUtils.ZipSections zipSections) {
        return C0063.m4371(dataSource, zipSections);
    }
}
