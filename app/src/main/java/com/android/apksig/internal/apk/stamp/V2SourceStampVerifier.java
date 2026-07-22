package com.android.apksig.internal.apk.stamp;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigResult;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V2SourceStampVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f57short = {2202, 2284, 2295, 2290, 2299, 2697, 2734, 2726, 2723, 2730, 2731, 2799, 2747, 2720, 2799, 2720, 2733, 2747, 2734, 2726, 2721, 2799, 2711, 2785, 2810, 2815, 2806, 2799, 2700, 2730, 2749, 2747, 2726, 2729, 2726, 2732, 2734, 2747, 2730, 2697, 2734, 2732, 2747, 2720, 2749, 2742};

    /* JADX INFO: renamed from: ۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m820(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0032.m3184() < 0) {
            SourceStampVerifier.verifyV2SourceStamp((ByteBuffer) obj, (CertificateFactory) obj2, (ApkSignerInfo) obj3, (Map) obj4, (byte[]) obj5, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m821() {
        if (C0026.m2298() < 0) {
            return f57short;
        }
        return null;
    }

    public static HashMap a(Map map) {
        HashMap map2 = new HashMap();
        Iterator itM2001 = C0024.m2001(C0064.m4524(map));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            Map map3 = (Map) C0019.m1293(entry);
            ArrayList arrayList = new ArrayList();
            Iterator itM20012 = C0024.m2001(C0064.m4524(map3));
            while (C0036.m3657(itM20012)) {
                Map.Entry entry2 = (Map.Entry) C0071.m6012(itM20012);
                C0017.m919(arrayList, C0025.m2158(C0021.m1548(C0111.m13089((ContentDigestAlgorithm) C0063.m4368(entry2))), (byte[]) C0019.m1293(entry2)));
            }
            C0039.m4063(arrayList, new Comparator<Pair<Integer, byte[]>>() { // from class: com.android.apksig.internal.apk.stamp.V2SourceStampVerifier.1
                /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
                public static int m822(Object obj, Object obj2, Object obj3) {
                    if (C0068.m5678() > 0) {
                        return ((AnonymousClass1) obj).compare2((Pair<Integer, byte[]>) obj2, (Pair<Integer, byte[]>) obj3);
                    }
                    return 0;
                }

                @Override // java.util.Comparator
                public /* bridge */ /* synthetic */ int compare(Pair<Integer, byte[]> pair, Pair<Integer, byte[]> pair2) {
                    return m822(this, pair, pair2);
                }

                /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
                public int compare2(Pair<Integer, byte[]> pair, Pair<Integer, byte[]> pair2) {
                    return C0025.m2170((Integer) C0111.m13157(pair)) - C0025.m2170((Integer) C0111.m13157(pair2));
                }
            });
            C0038.m3969(map2, (Integer) C0063.m4368(entry), C0073.m6363(arrayList));
        }
        return map2;
    }

    public static ApkSigResult verify(DataSource dataSource, ZipSections zipSections, byte[] bArr, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> map, int i, int i2) {
        ApkSigResult apkSigResult = new ApkSigResult(0);
        ByteBuffer byteBufferM5410 = C0067.m5410(C0016.m644(dataSource, zipSections, 1845461005));
        ApkSignerInfo apkSignerInfo = new ApkSignerInfo();
        C0077.m7162(C0111.m13075(apkSigResult), apkSignerInfo);
        try {
            m820(C0111.m13168(byteBufferM5410), C0074.m6461(C0036.m3678(m821(), 0, 5, 2242)), apkSignerInfo, C0020.m1421(map), bArr, i, i2);
            apkSigResult.verified = (C0017.m935(apkSigResult) || C0035.m3582(apkSigResult)) ? false : true;
        } catch (ApkFormatException | BufferUnderflowException unused) {
            C0037.m3850(apkSignerInfo, 20, new Object[0]);
        } catch (CertificateException e) {
            throw new IllegalStateException(C0078.m7427(m821(), 5, 41, 2767), e);
        }
        return apkSigResult;
    }
}
