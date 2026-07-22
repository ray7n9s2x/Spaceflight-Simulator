package com.android.apksig.internal.apk.stamp;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.r;
import j$.time.Instant;
import j$.util.Comparator$CC;
import java.nio.ByteBuffer;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class V2SourceStampSigner {
    public static final int V2_SOURCE_STAMP_BLOCK_ID = 1845461005;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f56short = {1247, 1256, 1262, 1256, 1252, 1275, 1256, 1257, 1197, 1260, 1251, 1197, 1252, 1251, 1275, 1260, 1249, 1252, 1257, 1197, 1275, 1260, 1249, 1272, 1256, 1197, 1259, 1279, 1250, 1248, 1197, 1220, 1251, 1278, 1273, 1260, 1251, 1273, 1198, 1258, 1256, 1273, 1241, 1252, 1248, 1256, 1278, 1273, 1260, 1248, 1277, 1207, 1197, 1256, 1247, 1230, 1224, 1235, 1247, 1228, 1235, 1236, 1245, 1178, 1230, 1234, 1247, 1178, 1247, 1236, 1241, 1237, 1246, 1247, 1246, 1178, 1244, 1237, 1224, 1239, 1178, 1237, 1244, 1178, 1230, 1234, 1247, 1178, 1225, 1230, 1243, 1239, 1226, 1178, 1241, 1247, 1224, 1230, 1235, 1244, 1235, 1241, 1243, 1230, 1247, 1178, 1244, 1243, 1235, 1238, 1247, 1246, 2443, 2474, 2533, 2470, 2464, 2487, 2481, 2476, 2467, 2476, 2470, 2468, 2481, 2464, 2486, 2533, 2470, 2474, 2475, 2467, 2476, 2466, 2480, 2487, 2464, 2465, 2533, 2467, 2474, 2487, 2533, 2486, 2476, 2466, 2475, 2464, 2487};
    public final ApkSigningBlockUtils.SignerConfig a;
    public final Map b;
    public final boolean c;

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.stamp.V2SourceStampSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        public final ApkSigningBlockUtils.SignerConfig a;
        public final Map b;
        public boolean c = true;

        public V2SourceStampSigner build() {
            return new V2SourceStampSigner(this, null);
        }

        public Builder setSourceStampTimestampEnabled(boolean z) {
            this.c = z;
            return this;
        }

        public Builder(ApkSigningBlockUtils.SignerConfig signerConfig, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> map) {
            this.a = signerConfig;
            this.b = map;
        }
    }

    public static Pair<byte[], Integer> generateSourceStampBlock(ApkSigningBlockUtils.SignerConfig signerConfig, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> map) {
        return C0023.m1838(C0070.m5948(new Builder(signerConfig, map)));
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static Comparator m812(Object obj) {
        if (C0029.m2791() >= 0) {
            return Comparator$CC.comparing((Function) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m813() {
        if (C0063.m4427() > 0) {
            return f56short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static List m814(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((SourceStampBlock) obj).signedDigests;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static long m815(Object obj) {
        if (C0031.m3075() > 0) {
            return ((Instant) obj).getEpochSecond();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Instant m816() {
        if (C0028.m2593() > 0) {
            return Instant.now();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static List m817(Object obj) {
        if (C0073.m6356() < 0) {
            return ((SourceStampBlock) obj).signedStampAttributes;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m818(Object obj) {
        if (C0078.m7450() > 0) {
            return ((SourceStampBlock) obj).stampCertificate;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۤ, reason: contains not printable characters */
    public static byte[] m819(Object obj) {
        if (C0037.m3837() < 0) {
            return ((SourceStampBlock) obj).stampAttributes;
        }
        return null;
    }

    public static final class SourceStampBlock {
        public List<Pair<Integer, byte[]>> signedDigests;
        public List<Pair<Integer, byte[]>> signedStampAttributes;
        public byte[] stampAttributes;
        public byte[] stampCertificate;

        public SourceStampBlock(AnonymousClass1 anonymousClass1) {
        }
    }

    public V2SourceStampSigner(Builder builder, AnonymousClass1 anonymousClass1) {
        this.a = C0019.m1266(builder);
        this.b = C0032.m3211(builder);
        this.c = C0064.m4582(builder);
    }

    public static void a(int i, Map map, ApkSigningBlockUtils.SignerConfig signerConfig, ArrayList arrayList) {
        if (!C0069.m5786(map, C0021.m1548(i))) {
            return;
        }
        Map map2 = (Map) C0072.m6108(map, C0021.m1548(i));
        ArrayList arrayList2 = new ArrayList();
        Iterator itM2001 = C0024.m2001(C0064.m4524(map2));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            C0017.m919(arrayList2, C0025.m2158(C0021.m1548(C0111.m13089((ContentDigestAlgorithm) C0063.m4368(entry))), (byte[]) C0019.m1293(entry)));
        }
        C0039.m4063(arrayList2, m812(new r(6)));
        C0017.m919(arrayList, C0025.m2158(C0021.m1548(i), C0023.m1880(C0068.m5550(signerConfig, C0023.m1880(arrayList2)))));
    }

    public Pair<byte[], Integer> generateSourceStampBlock() throws SignatureException {
        ApkSigningBlockUtils.SignerConfig signerConfigM5849 = C0070.m5849(this);
        if (!C0025.m2084(C0066.m4892(signerConfigM5849))) {
            ArrayList arrayList = new ArrayList();
            Map mapM2401 = C0027.m2401(this);
            C0034.m3476(3, mapM2401, signerConfigM5849, arrayList);
            C0034.m3476(2, mapM2401, signerConfigM5849, arrayList);
            C0034.m3476(1, mapM2401, signerConfigM5849, arrayList);
            C0039.m4063(arrayList, m812(new r(6)));
            SourceStampBlock sourceStampBlock = new SourceStampBlock(null);
            try {
                sourceStampBlock.stampCertificate = C0064.m4613((X509Certificate) C0071.m6078(C0066.m4892(signerConfigM5849), 0));
                sourceStampBlock.signedDigests = arrayList;
                SigningCertificateLineage signingCertificateLineageM5590 = C0068.m5590(signerConfigM5849);
                HashMap map = new HashMap();
                if (C0037.m3813(this)) {
                    long jM815 = m815(m816());
                    if (jM815 > 0) {
                        ByteBuffer byteBufferM3516 = C0035.m3516(8);
                        C0064.m4604(byteBufferM3516, C0072.m6217());
                        C0018.m961(byteBufferM3516, jM815);
                        C0038.m3969(map, C0021.m1548(SourceStampConstants.STAMP_TIME_ATTR_ID), C0027.m2445(byteBufferM3516));
                    } else {
                        throw new IllegalStateException(C0039.m4094(jM815, C0037.m3829(m813(), 0, 53, 1165)));
                    }
                }
                if (signingCertificateLineageM5590 != null) {
                    C0038.m3969(map, C0021.m1548(SourceStampConstants.PROOF_OF_ROTATION_ATTR_ID), C0111.m13039(signingCertificateLineageM5590));
                }
                Iterator itM4820 = C0066.m4820(C0020.m1411(map));
                int length = 0;
                while (C0036.m3657(itM4820)) {
                    length += ((byte[]) C0071.m6012(itM4820)).length + 8;
                }
                ByteBuffer byteBufferM35162 = C0035.m3516(length + 4);
                C0064.m4604(byteBufferM35162, C0072.m6217());
                C0038.m4018(byteBufferM35162, length);
                Iterator itM2001 = C0024.m2001(C0025.m2117(map));
                while (C0036.m3657(itM2001)) {
                    Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
                    C0038.m4018(byteBufferM35162, ((byte[]) C0019.m1293(entry)).length + 4);
                    C0038.m4018(byteBufferM35162, C0025.m2170((Integer) C0063.m4368(entry)));
                    C0068.m5569(byteBufferM35162, (byte[]) C0019.m1293(entry));
                }
                byte[] bArrM2445 = C0027.m2445(byteBufferM35162);
                sourceStampBlock.stampAttributes = bArrM2445;
                sourceStampBlock.signedStampAttributes = C0068.m5550(signerConfigM5849, bArrM2445);
                return C0025.m2158(C0078.m7318(C0066.m4830(new byte[][]{m818(sourceStampBlock), C0023.m1880(m814(sourceStampBlock)), m819(sourceStampBlock), C0023.m1880(m817(sourceStampBlock))})), C0021.m1548(1845461005));
            } catch (CertificateEncodingException e) {
                throw new SignatureException(C0025.m2151(m813(), 53, 59, 1210), e);
            }
        }
        throw new SignatureException(C0031.m3047(m813(), 112, 37, 2501));
    }
}
