package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z0 extends InputStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f297short = {2253, 2287, 2272, 2272, 2273, 2298, 2222, 2300, 2283, 2287, 2282, 2222, 2280, 2299, 2274, 2274, 2295, 2222, 2279, 2272, 2298, 2273, 2222, 2284, 2295, 2298, 2283, 2222, 2284, 2299, 2280, 2280, 2283, 2300, 1956, 1951, 1940, 1929, 1921, 1940, 1938, 1925, 1940, 1941, 2001, 1972, 1982, 1975, 2001, 1923, 1940, 1936, 1938, 1945, 1940, 1941, 2001, 1926, 1945, 1940, 1951, 2001, 1925, 1923, 1928, 1944, 1951, 1942, 2001, 1925, 1950, 2001, 1923, 1940, 1936, 1941, 2001, 1922, 1925, 1923, 1940, 1936, 1948};
    public final x5 a;
    public final InterfaceC0422p1 b;
    public final byte[] c;
    public final byte[] d = new byte[1];

    /* JADX INFO: renamed from: ۟ۧ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7022() {
        if (C0067.m5468() < 0) {
            return f297short;
        }
        return null;
    }

    public void a(PushbackInputStream pushbackInputStream, int i) {
    }

    public abstract InterfaceC0422p1 b(P2 p2, char[] cArr, boolean z);

    @Override // java.io.InputStream
    public int read() {
        byte[] bArrM3881 = C0037.m3881(this);
        if (C0078.m7338(this, bArrM3881) == -1) {
            return -1;
        }
        return bArrM3881[0] & 255;
    }

    public final void c(byte[] bArr) throws IOException {
        PushbackInputStream pushbackInputStreamM3302 = C0033.m3302(C0063.m4306(this));
        int iM3621 = C0035.m3621(pushbackInputStreamM3302, bArr);
        if (iM3621 == -1) {
            throw new IOException(C0027.m2404(m7022(), 34, 49, 2033));
        }
        if (iM3621 != bArr.length) {
            int length = bArr.length - iM3621;
            int iM3212 = 0;
            for (int i = 0; iM3621 < bArr.length && iM3212 != -1 && i < 15; i++) {
                iM3212 += C0032.m3212(pushbackInputStreamM3302, bArr, iM3621, length);
                if (iM3212 > 0) {
                    iM3621 += iM3212;
                    length -= iM3212;
                }
            }
            if (iM3621 != bArr.length) {
                throw new IOException(C0020.m1443(m7022(), 0, 34, 2190));
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0026.m2263(C0063.m4306(this));
    }

    public Z0(x5 x5Var, P2 p2, char[] cArr, int i, boolean z) {
        this.a = x5Var;
        this.b = C0026.m2343(this, p2, cArr, z);
        if (C0075.m6833(C0016.m646(p2), 2)) {
            this.c = new byte[i];
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return C0064.m4544(this, bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int iM4626 = C0064.m4626(C0063.m4306(this), bArr, i, i2);
        if (iM4626 > 0) {
            byte[] bArrM867 = C0017.m867(this);
            if (bArrM867 != null) {
                C0027.m2519(bArr, 0, bArrM867, 0, iM4626);
            }
            C0023.m1830(C0071.m6006(this), i, bArr, iM4626);
        }
        return iM4626;
    }
}
