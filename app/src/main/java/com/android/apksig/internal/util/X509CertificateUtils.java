package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1EncodingException;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import j$.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertificateUtils {
    public static volatile CertificateFactory a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f121short = {2279, 2279, 2279, 2279, 2279, 2184, 2191, 2189, 2179, 2180, 2282, 2185, 2191, 2200, 2206, 2179, 2188, 2179, 2185, 2187, 2206, 2191, 2279, 2279, 2279, 2279, 2279, 1449, 1449, 1449, 1449, 1449, 1473, 1482, 1472, 1444, 1479, 1473, 1494, 1488, 1485, 1474, 1485, 1479, 1477, 1488, 1473, 1449, 1449, 1449, 1449, 1449, 2701, 2811, 2784, 2789, 2796, 919, 944, 952, 957, 948, 949, 1009, 933, 958, 1009, 946, 931, 948, 944, 933, 948, 1009, 905, 1023, 996, 993, 1000, 1009, 914, 948, 931, 933, 952, 951, 952, 946, 944, 933, 948, 919, 944, 946, 933, 958, 931, 936, 2774, 2794, 2791, 2722, 2802, 2800, 2797, 2804, 2795, 2790, 2791, 2790, 2722, 2795, 2796, 2802, 2807, 2806, 2722, 2785, 2797, 2796, 2806, 2787, 2795, 2796, 2801, 2722, 2806, 2794, 2791, 2722, 2770, 2759, 2767, 2722, 2785, 2791, 2800, 2806, 2795, 2788, 2795, 2785, 2787, 2806, 2791, 2722, 2794, 2791, 2787, 2790, 2791, 2800, 2722, 2805, 2795, 2806, 2794, 2797, 2807, 2806, 2722, 2787, 2722, 2804, 2787, 2798, 2795, 2790, 2722, 2785, 2791, 2800, 2806, 2795, 2788, 2795, 2785, 2787, 2806, 2791, 2722, 2788, 2797, 2797, 2806, 2791, 2800, 576, 636, 625, 564, 612, 614, 635, 610, 637, 624, 625, 624, 564, 637, 634, 612, 609, 608, 564, 631, 635, 634, 608, 629, 637, 634, 615, 564, 608, 636, 625, 564, 580, 593, 601, 564, 631, 625, 614, 608, 637, 626, 637, 631, 629, 608, 625, 564, 636, 625, 629, 624, 625, 614, 564, 630, 609, 608, 564, 624, 635, 625, 615, 564, 634, 635, 608, 564, 631, 635, 634, 608, 629, 637, 634, 564, 615, 609, 626, 626, 637, 631, 637, 625, 634, 608, 564, 624, 629, 608, 629, 564, 626, 635, 614, 564, 608, 636, 625, 564, 626, 635, 635, 608, 625, 614, 514, 574, 563, 630, 565, 563, 548, 546, 575, 560, 575, 565, 567, 546, 563, 532, 547, 560, 560, 563, 548, 630, 565, 567, 568, 568, 569, 546, 630, 564, 563, 630, 568, 547, 570, 570, 888, 863, 855, 850, 859, 858, 798, 842, 849, 798, 846, 863, 844, 845, 859, 798, 861, 859, 844, 842, 855, 856, 855, 861, 863, 842, 859, 2339, 2308, 2316, 2313, 2304, 2305, 2373, 2321, 2314, 2373, 2325, 2308, 2327, 2326, 2304, 2373, 2310, 2304, 2327, 2321, 2316, 2307, 2316, 2310, 2308, 2321, 2304, 2436, 2467, 2475, 2478, 2471, 2470, 2530, 2486, 2477, 2530, 2482, 2467, 2480, 2481, 2471, 2530, 2465, 2471, 2480, 2486, 2475, 2468, 2475, 2465, 2467, 2486, 2471, 2481, 1529, 1502, 1494, 1491, 1498, 1499, 1439, 1483, 1488, 1439, 1485, 1498, 1502, 1499, 1439, 1483, 1495, 1498, 1439, 1494, 1489, 1487, 1482, 1483, 1439, 1484, 1483, 1485, 1498, 1502, 1490};
    public static final byte[] BEGIN_CERT_HEADER = C0066.m4854(C0016.m625(m2386(), 0, 27, 2250));
    public static final byte[] END_CERT_FOOTER = C0066.m4854(C0018.m1070(m2386(), 27, 25, 1412));

    public static X509Certificate generateCertificate(InputStream inputStream) throws CertificateException {
        try {
            return C0020.m1370(C0071.m5981(inputStream));
        } catch (IOException e) {
            throw new CertificateException(C0027.m2404(m2386(), 329, 27, 830), e);
        }
    }

    public static Collection<? extends Certificate> generateCertificates(InputStream inputStream) {
        C0030.m2965();
        return C0038.m4034(inputStream, C0018.m1054());
    }

    /* JADX INFO: renamed from: ۟۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static Base64.Decoder m2385() {
        if (C0019.m1311() == 0) {
            return Base64.getDecoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m2386() {
        if (C0072.m6216() > 0) {
            return f121short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m2387(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            return ((Base64.Decoder) obj).decode((String) obj2);
        }
        return null;
    }

    public static void a() {
        if (C0018.m1054() != null) {
            return;
        }
        synchronized (X509CertificateUtils.class) {
            if (C0018.m1054() != null) {
                return;
            }
            try {
                a = C0074.m6461(C0029.m2695(m2386(), 52, 5, 2773));
            } catch (CertificateException e) {
                throw new RuntimeException(C0020.m1443(m2386(), 57, 41, 977), e);
            }
        }
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws CertificateException {
        char cM5826;
        if (byteBuffer == null) {
            throw new NullPointerException(C0017.m936(m2386(), 293, 36, 598));
        }
        if (C0071.m5984(byteBuffer) < C0032.m3156().length) {
            return byteBuffer;
        }
        C0038.m4045(byteBuffer);
        int i = 0;
        while (true) {
            byte[] bArrM3156 = C0032.m3156();
            if (i >= bArrM3156.length) {
                StringBuilder sb = new StringBuilder();
                while (C0111.m13127(byteBuffer) && (cM5826 = (char) C0069.m5826(byteBuffer)) != '-') {
                    if (!C0064.m4579(cM5826)) {
                        C0077.m7289(sb, cM5826);
                    }
                }
                int i2 = 1;
                while (true) {
                    byte[] bArrM1710 = C0022.m1710();
                    if (i2 >= bArrM1710.length) {
                        byte[] bArrM2387 = m2387(m2385(), C0068.m5536(sb));
                        int iM3629 = C0035.m3629(byteBuffer);
                        while (C0111.m13127(byteBuffer) && C0064.m4579((char) C0069.m5826(byteBuffer))) {
                            iM3629++;
                        }
                        C0037.m3886(byteBuffer, iM3629);
                        return C0020.m1393(bArrM2387);
                    }
                    if (!C0111.m13127(byteBuffer)) {
                        throw new CertificateException(C0029.m2695(m2386(), 187, 106, 532));
                    }
                    if (C0069.m5826(byteBuffer) != bArrM1710[i2]) {
                        throw new CertificateException(C0020.m1443(m2386(), 98, 89, 2690));
                    }
                    i2++;
                }
            } else {
                if (C0069.m5826(byteBuffer) != bArrM3156[i]) {
                    C0016.m685(byteBuffer);
                    return byteBuffer;
                }
                i++;
            }
        }
    }

    public static Collection<? extends Certificate> generateCertificates(InputStream inputStream, CertificateFactory certificateFactory) throws CertificateException {
        try {
            byte[] bArrM5981 = C0071.m5981(inputStream);
            try {
                try {
                    return C0031.m3070(certificateFactory, new ByteArrayInputStream(bArrM5981));
                } catch (Asn1DecodingException | Asn1EncodingException e) {
                    throw new CertificateException(C0024.m1945(m2386(), 383, 28, 2498), e);
                }
            } catch (CertificateException unused) {
                ArrayList arrayList = new ArrayList(1);
                ByteBuffer byteBufferM1393 = C0020.m1393(bArrM5981);
                while (C0111.m13127(byteBufferM1393)) {
                    ByteBuffer byteBufferM3609 = C0035.m3609(byteBufferM1393);
                    int iM3629 = C0035.m3629(byteBufferM3609);
                    X509Certificate x509Certificate = (X509Certificate) C0017.m835(certificateFactory, new ByteArrayInputStream(C0072.m6214((com.android.apksig.internal.x509.Certificate) C0036.m3643(byteBufferM3609, com.android.apksig.internal.x509.Certificate.class))));
                    byte[] bArr = new byte[C0035.m3629(byteBufferM3609) - iM3629];
                    C0037.m3886(byteBufferM3609, iM3629);
                    C0029.m2812(byteBufferM3609, bArr);
                    C0017.m919(arrayList, new GuaranteedEncodedFormX509Certificate(x509Certificate, bArr));
                }
                return arrayList;
            }
        } catch (IOException e2) {
            throw new CertificateException(C0067.m5418(m2386(), 411, 31, 1471), e2);
        }
    }

    public static X509Certificate generateCertificate(byte[] bArr) {
        C0030.m2965();
        return C0016.m726(bArr, C0018.m1054());
    }

    public static X509Certificate generateCertificate(byte[] bArr, CertificateFactory certificateFactory) throws CertificateException {
        try {
            try {
                return (X509Certificate) C0017.m835(certificateFactory, new ByteArrayInputStream(bArr));
            } catch (Asn1DecodingException | Asn1EncodingException | CertificateException e) {
                throw new CertificateException(C0071.m5991(m2386(), 356, 27, 2405), e);
            }
        } catch (CertificateException unused) {
            ByteBuffer byteBufferM3609 = C0035.m3609(C0020.m1393(bArr));
            int iM3629 = C0035.m3629(byteBufferM3609);
            X509Certificate x509Certificate = (X509Certificate) C0017.m835(certificateFactory, new ByteArrayInputStream(C0072.m6214((com.android.apksig.internal.x509.Certificate) C0036.m3643(byteBufferM3609, com.android.apksig.internal.x509.Certificate.class))));
            byte[] bArr2 = new byte[C0035.m3629(byteBufferM3609) - iM3629];
            C0037.m3886(byteBufferM3609, iM3629);
            C0029.m2812(byteBufferM3609, bArr2);
            return new GuaranteedEncodedFormX509Certificate(x509Certificate, bArr2);
        }
    }
}
