package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatingX509Certificate extends X509Certificate {
    public final X509Certificate a;

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        C0068.m5673(C0077.m7202(this));
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        C0023.m1815(C0077.m7202(this), publicKey);
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        C0068.m5644(C0077.m7202(this), date);
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        return C0017.m831(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        return C0032.m3221(C0077.m7202(this));
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return C0064.m4613(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public List<String> getExtendedKeyUsage() {
        return C0034.m3478(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return C0024.m2044(C0077.m7202(this), str);
    }

    @Override // java.security.cert.X509Certificate
    public Collection<List<?>> getIssuerAlternativeNames() {
        return C0024.m1992(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return C0038.m4017(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return C0035.m3554(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        return C0067.m5528(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return C0020.m1417(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        return C0078.m7401(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return C0069.m5766(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return C0031.m3111(C0077.m7202(this));
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        return C0075.m6845(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return C0034.m3416(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return C0024.m2072(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return C0034.m3448(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return C0037.m3895(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return C0072.m6171(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public Collection<List<?>> getSubjectAlternativeNames() {
        return C0073.m6398(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return C0017.m906(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return C0029.m2796(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        return C0030.m2906(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        return C0074.m6528(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return C0068.m5621(C0077.m7202(this));
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return C0020.m1441(C0077.m7202(this));
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return C0074.m6524(C0077.m7202(this));
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        C0071.m6049(C0077.m7202(this), publicKey, str);
    }

    public DelegatingX509Certificate(X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public void verify(PublicKey publicKey, Provider provider) {
        C0066.m4879(C0077.m7202(this), publicKey, provider);
    }
}
