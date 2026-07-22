package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import java.io.PrintStream;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class L2 extends X509ExtendedTrustManager {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f264short = {3194, 3164, 3147, 3149, 3152, 3167, 3152, 3162, 3160, 3149, 3164, 3097, 3098, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319, 2319};
    public final /* synthetic */ PrintStream a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ O2 c;

    /* JADX INFO: renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6960() {
        if (C0068.m5678() >= 0) {
            return f264short;
        }
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        O2 o2M6324 = C0073.m6324(this);
        for (int i = 0; i < x509CertificateArr.length; i++) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            try {
                boolean zM6357 = C0073.m6357(o2M6324);
                PrintStream printStreamM4374 = C0063.m4374(this);
                if (zM6357) {
                    C0071.m6086(o2M6324, x509Certificate, printStreamM4374);
                } else {
                    StringBuilder sb = new StringBuilder();
                    C0077.m7290(sb, C0064.m4545(m6960(), 0, 13, 3129));
                    C0021.m1551(sb, i);
                    C0065.m4767(printStreamM4374, C0068.m5536(sb));
                    C0065.m4767(printStreamM4374, C0072.m6116(m6960(), 13, 36, 2354));
                    C0028.m2580(x509Certificate, printStreamM4374);
                    C0068.m5629(printStreamM4374);
                }
            } catch (Exception e) {
                if (C0034.m3433(o2M6324)) {
                    C0033.m3347(e);
                }
            }
        }
        if (x509CertificateArr.length > 0) {
            C0018.m1079(this)[0] = true;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    public L2(O2 o2, PrintStream printStream, boolean[] zArr) {
        this.c = o2;
        this.a = printStream;
        this.b = zArr;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C0019.m1306(this, x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C0019.m1306(this, x509CertificateArr, str);
    }
}
