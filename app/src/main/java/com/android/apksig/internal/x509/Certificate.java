package com.android.apksig.internal.x509;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.IssuerAndSerialNumber;
import com.android.apksig.internal.pkcs7.SignerIdentifier;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
@Asn1Class(type = Asn1Type.SEQUENCE)
public class Certificate {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f125short = {2193, 2230, 2238, 2235, 2226, 2227, 2295, 2211, 2232, 2295, 2215, 2230, 2213, 2212, 2226, 2295, 2228, 2226, 2213, 2211, 2238, 2225, 2238, 2228, 2230, 2211, 2226, 2295, 2292};

    @Asn1Field(index = 0, type = Asn1Type.SEQUENCE)
    public TBSCertificate certificate;

    @Asn1Field(index = 2, type = Asn1Type.BIT_STRING)
    public ByteBuffer signature;

    @Asn1Field(index = 1, type = Asn1Type.SEQUENCE)
    public AlgorithmIdentifier signatureAlgorithm;

    /* JADX INFO: renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static short[] m2672() {
        if (C0019.m1311() <= 0) {
            return f125short;
        }
        return null;
    }

    public static X509Certificate findCertificate(Collection<X509Certificate> collection, SignerIdentifier signerIdentifier) {
        Iterator itM4820 = C0066.m4820(collection);
        while (C0036.m3657(itM4820)) {
            X509Certificate x509Certificate = (X509Certificate) C0071.m6012(itM4820);
            IssuerAndSerialNumber issuerAndSerialNumberM5475 = C0067.m5475(signerIdentifier);
            if (issuerAndSerialNumberM5475 != null) {
                X500Principal x500Principal = new X500Principal(C0071.m6029(C0030.m2907(C0033.m3293(issuerAndSerialNumberM5475))));
                if (C0020.m1357(C0018.m1016(issuerAndSerialNumberM5475), C0034.m3416(x509Certificate)) && C0071.m5972(x500Principal, C0067.m5528(x509Certificate))) {
                    return x509Certificate;
                }
            }
        }
        return null;
    }

    public static List<X509Certificate> parseCertificates(List<Asn1OpaqueObject> list) throws CertificateException {
        if (C0025.m2084(list)) {
            return C0037.m3866();
        }
        ArrayList arrayList = new ArrayList(C0034.m3427(list));
        for (int i = 0; i < C0034.m3427(list); i++) {
            byte[] bArrM6029 = C0071.m6029(C0030.m2907((Asn1OpaqueObject) C0071.m6078(list, i)));
            try {
                C0017.m919(arrayList, new GuaranteedEncodedFormX509Certificate(C0020.m1370(bArrM6029), bArrM6029));
            } catch (CertificateException e) {
                StringBuilder sb = new StringBuilder(C0021.m1650(m2672(), 0, 29, 2263));
                C0021.m1551(sb, i + 1);
                throw new CertificateException(C0068.m5536(sb), e);
            }
        }
        return arrayList;
    }
}
