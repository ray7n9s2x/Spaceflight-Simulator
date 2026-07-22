package com.android.apksig.internal.apk.stamp;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.r;
import j$.util.Comparator$CC;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V1SourceStampSigner {
    public static final int V1_SOURCE_STAMP_BLOCK_ID = 722016414;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f54short = {1529, 1486, 1503, 1497, 1474, 1486, 1501, 1474, 1477, 1484, 1419, 1503, 1475, 1486, 1419, 1486, 1477, 1480, 1476, 1487, 1486, 1487, 1419, 1485, 1476, 1497, 1478, 1419, 1476, 1485, 1419, 1503, 1475, 1486, 1419, 1496, 1503, 1482, 1478, 1499, 1419, 1480, 1486, 1497, 1503, 1474, 1485, 1474, 1480, 1482, 1503, 1486, 1419, 1485, 1482, 1474, 1479, 1486, 1487, 2588, 2621, 2674, 2609, 2615, 2592, 2598, 2619, 2612, 2619, 2609, 2611, 2598, 2615, 2593, 2674, 2609, 2621, 2620, 2612, 2619, 2613, 2599, 2592, 2615, 2614, 2674, 2612, 2621, 2592, 2674, 2593, 2619, 2613, 2620, 2615, 2592};

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.stamp.V1SourceStampSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static Pair<byte[], Integer> generateSourceStampBlock(ApkSigningBlockUtils.SignerConfig signerConfig, Map<ContentDigestAlgorithm, byte[]> map) throws SignatureException {
        if (C0025.m2084(C0066.m4892(signerConfig))) {
            throw new SignatureException(C0076.m6902(m808(), 59, 37, 2642));
        }
        ArrayList arrayList = new ArrayList();
        Iterator itM2001 = C0024.m2001(C0064.m4524(map));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            C0017.m919(arrayList, C0025.m2158(C0021.m1548(C0111.m13089((ContentDigestAlgorithm) C0063.m4368(entry))), (byte[]) C0019.m1293(entry)));
        }
        C0039.m4063(arrayList, m807(new r(6)));
        SourceStampBlock sourceStampBlock = new SourceStampBlock(null);
        try {
            sourceStampBlock.stampCertificate = C0064.m4613((X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0));
            List<Pair<Integer, byte[]>> listM5550 = C0068.m5550(signerConfig, C0023.m1880(arrayList));
            sourceStampBlock.signedDigests = listM5550;
            return C0025.m2158(C0078.m7318(C0066.m4830(new byte[][]{m806(sourceStampBlock), C0023.m1880(listM5550)})), C0021.m1548(722016414));
        } catch (CertificateEncodingException e) {
            throw new SignatureException(C0033.m3330(m808(), 0, 59, 1451), e);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m806(Object obj) {
        if (C0033.m3358() < 0) {
            return ((SourceStampBlock) obj).stampCertificate;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۡ, reason: contains not printable characters */
    public static Comparator m807(Object obj) {
        if (C0026.m2298() < 0) {
            return Comparator$CC.comparing((Function) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m808() {
        if (C0026.m2298() < 0) {
            return f54short;
        }
        return null;
    }

    public static final class SourceStampBlock {
        public List<Pair<Integer, byte[]>> signedDigests;
        public byte[] stampCertificate;

        public SourceStampBlock(AnonymousClass1 anonymousClass1) {
        }
    }
}
