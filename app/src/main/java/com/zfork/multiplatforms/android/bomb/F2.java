package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class F2 extends AbstractC0416o1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f241short = {499, 456, 451, 478, 470, 451, 453, 466, 451, 450, 390, 451, 456, 450, 390, 457, 448, 390, 463, 456, 470, 467, 466, 390, 469, 466, 468, 451, 455, 459};
    public Inflater c;
    public byte[] d;
    public byte[] e;
    public int f;

    /* JADX INFO: renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6926() {
        if (C0032.m3184() <= 0) {
            return f241short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0416o1, java.io.InputStream
    public final int read() {
        byte[] bArrM2285 = C0026.m2285(this);
        if (C0036.m3751(this, bArrM2285, 0, bArrM2285.length) == -1) {
            return -1;
        }
        return bArrM2285[0];
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0416o1
    public final void a(PushbackInputStream pushbackInputStream, int i) {
        Inflater inflaterM7281 = C0077.m7281(this);
        if (inflaterM7281 != null) {
            C0078.m7449(inflaterM7281);
            this.c = null;
        }
        super.a(pushbackInputStream, i);
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0416o1
    public final int b(PushbackInputStream pushbackInputStream) throws IOException {
        int iM2537 = C0028.m2537(C0077.m7281(this));
        if (iM2537 > 0) {
            C0070.m5894(pushbackInputStream, C0017.m867(C0034.m3497(this)), C0066.m4805(this) - iM2537, iM2537);
        }
        return iM2537;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0416o1, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater inflaterM7281 = C0077.m7281(this);
        if (inflaterM7281 != null) {
            C0078.m7449(inflaterM7281);
        }
        super.close();
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0416o1, java.io.InputStream
    public final int read(byte[] bArr) {
        return C0036.m3751(this, bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return -1;
     */
    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0416o1, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r57, int r58, int r59) throws java.io.IOException {
        /*
            r56 = this;
            r8 = r59
            r7 = r58
            r6 = r57
            r5 = r56
        L8:
            java.util.zip.Inflater r0 = com.zfork.multiplatforms.android.bomb.C0077.m7281(r5)     // Catch: java.util.zip.DataFormatException -> L65
            int r0 = com.android.apksig.util.C0031.m3060(r0, r6, r7, r8)     // Catch: java.util.zip.DataFormatException -> L65
            if (r0 != 0) goto L68
            java.util.zip.Inflater r0 = com.zfork.multiplatforms.android.bomb.C0077.m7281(r5)     // Catch: java.util.zip.DataFormatException -> L65
            boolean r0 = com.android.apksig.util.C0031.m3067(r0)     // Catch: java.util.zip.DataFormatException -> L65
            r1 = -1
            if (r0 != 0) goto L67
            java.util.zip.Inflater r0 = com.zfork.multiplatforms.android.bomb.C0077.m7281(r5)     // Catch: java.util.zip.DataFormatException -> L65
            boolean r0 = com.android.apksig.util.C0031.m3092(r0)     // Catch: java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L28
            goto L67
        L28:
            java.util.zip.Inflater r0 = com.zfork.multiplatforms.android.bomb.C0077.m7281(r5)     // Catch: java.util.zip.DataFormatException -> L65
            boolean r0 = org.conscrypt.C0111.m13036(r0)     // Catch: java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L8
            byte[] r0 = com.android.apksig.internal.apk.C0020.m1445(r5)     // Catch: java.util.zip.DataFormatException -> L65
            int r2 = r0.length     // Catch: java.util.zip.DataFormatException -> L65
            com.zfork.multiplatforms.android.bomb.Z0 r3 = com.android.apksig.zip.C0034.m3497(r5)     // Catch: java.util.zip.DataFormatException -> L65
            r4 = 0
            int r2 = com.joke.connectdevice.bean.C0064.m4544(r3, r0, r4, r2)     // Catch: java.util.zip.DataFormatException -> L65
            r5.f = r2     // Catch: java.util.zip.DataFormatException -> L65
            if (r2 == r1) goto L4c
            java.util.zip.Inflater r1 = com.zfork.multiplatforms.android.bomb.C0077.m7281(r5)     // Catch: java.util.zip.DataFormatException -> L65
            com.android.apksig.internal.apk.stamp.C0018.m1009(r1, r0, r4, r2)     // Catch: java.util.zip.DataFormatException -> L65
            goto L8
        L4c:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L65
            short[] r16 = m6926()     // Catch: java.util.zip.DataFormatException -> L65
            r19 = 422(0x1a6, float:5.91E-43)
            r17 = 0
            r18 = 30
            java.lang.String r16 = com.android.apksig.internal.asn1.C0022.m1728(r16, r17, r18, r19)     // Catch: java.util.zip.DataFormatException -> L65
            r7 = r16
            r6.<init>(r7)     // Catch: java.util.zip.DataFormatException -> L65
            throw r6     // Catch: java.util.zip.DataFormatException -> L65
        L65:
            r6 = move-exception
            goto L69
        L67:
            return r1
        L68:
            return r0
        L69:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.F2.read(byte[], int, int):int");
    }
}
