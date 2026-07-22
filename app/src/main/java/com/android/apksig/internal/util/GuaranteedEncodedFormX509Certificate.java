package com.android.apksig.internal.util;

import com.android.apksig.zip.C0032;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public class GuaranteedEncodedFormX509Certificate extends DelegatingX509Certificate {
    public final byte[] b;
    public int c;

    /* JADX INFO: renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Object m2380(Object obj) {
        if (C0032.m3184() < 0) {
            return ((byte[]) obj).clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return C0073.m6306(C0068.m5664(this), C0064.m4613((X509Certificate) obj));
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // com.android.apksig.internal.util.DelegatingX509Certificate, java.security.cert.Certificate
    public byte[] getEncoded() {
        byte[] bArrM4719 = C0065.m4719(this);
        if (bArrM4719 != null) {
            return (byte[]) m2380(bArrM4719);
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (C0068.m5577(this) == -1) {
            try {
                this.c = C0027.m2466(C0068.m5664(this));
            } catch (CertificateEncodingException unused) {
                this.c = 0;
            }
        }
        return C0068.m5577(this);
    }

    public GuaranteedEncodedFormX509Certificate(X509Certificate x509Certificate, byte[] bArr) {
        byte[] bArr2;
        super(x509Certificate);
        this.c = -1;
        if (bArr != null) {
            bArr2 = (byte[]) m2380(bArr);
        } else {
            bArr2 = null;
        }
        this.b = bArr2;
    }
}
