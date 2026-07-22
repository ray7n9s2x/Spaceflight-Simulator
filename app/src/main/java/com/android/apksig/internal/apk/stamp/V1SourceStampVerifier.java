package com.android.apksig.internal.apk.stamp;

import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.r;
import j$.util.Comparator$CC;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V1SourceStampVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f55short = {886, 768, 795, 798, 791, 892, 859, 851, 854, 863, 862, 794, 846, 853, 794, 853, 856, 846, 859, 851, 852, 794, 866, 788, 783, 778, 771, 794, 889, 863, 840, 846, 851, 860, 851, 857, 859, 846, 863, 892, 859, 857, 846, 853, 840, 835};

    /* JADX INFO: renamed from: ۟۠ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m809() {
        if (C0035.m3569() <= 0) {
            return f55short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟۟, reason: not valid java name and contains not printable characters */
    public static Comparator m810(Object obj) {
        if (C0070.m5903() > 0) {
            return Comparator$CC.comparing((Function) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static void m811(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0071.m6069() > 0) {
            SourceStampVerifier.verifyV1SourceStamp((ByteBuffer) obj, (CertificateFactory) obj2, (ApkSignerInfo) obj3, (byte[]) obj4, (byte[]) obj5, i, i2);
        }
    }

    public static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator itM2001 = C0024.m2001(C0064.m4524(map));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            C0017.m919(arrayList, C0025.m2158(C0021.m1548(C0111.m13089((ContentDigestAlgorithm) C0063.m4368(entry))), (byte[]) C0019.m1293(entry)));
        }
        C0039.m4063(arrayList, m810(new r(6)));
        return arrayList;
    }

    public static ApkSigningBlockUtils.Result verify(DataSource dataSource, ApkUtils.ZipSections zipSections, byte[] bArr, Map<ContentDigestAlgorithm, byte[]> map, int i, int i2) {
        ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(0);
        ByteBuffer byteBufferM5410 = C0067.m5410(C0019.m1188(dataSource, zipSections, 722016414, result));
        ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
        C0077.m7162(C0021.m1543(result), signerInfo);
        try {
            m811(C0067.m5463(byteBufferM5410), C0074.m6461(C0034.m3431(m809(), 0, 5, 814)), signerInfo, C0023.m1880(C0029.m2719(map)), bArr, i, i2);
            result.verified = (C0077.m7227(result) || C0032.m3202(result)) ? false : true;
        } catch (ApkFormatException | BufferUnderflowException unused) {
            C0031.m2979(signerInfo, C0078.m7442(), new Object[0]);
        } catch (CertificateException e) {
            throw new IllegalStateException(C0017.m936(m809(), 5, 41, 826), e);
        }
        return result;
    }
}
