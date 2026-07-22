package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class R0 extends OutputStream {
    public final ArrayList a = new ArrayList();
    public int b;
    public int c;
    public byte[] d;
    public int e;

    public final synchronized byte[] b() {
        byte[] bArrM6050;
        int iM6379 = C0073.m6379(this);
        if (iM6379 == 0) {
            bArrM6050 = C0071.m6050();
        } else {
            C0071.m6050();
            byte[] bArr = new byte[iM6379];
            Iterator itM4154 = C0039.m4154(C0018.m1020(this));
            int i = 0;
            while (C0036.m3657(itM4154)) {
                byte[] bArr2 = (byte[]) C0071.m6012(itM4154);
                int iM3151 = C0032.m3151(bArr2.length, iM6379);
                C0027.m2519(bArr2, 0, bArr, i, iM3151);
                i += iM3151;
                iM6379 -= iM3151;
                if (iM6379 == 0) {
                    break;
                }
            }
            bArrM6050 = bArr;
        }
        return bArrM6050;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        if (i < 0 || i > bArr.length || i4 < 0 || (i3 = i + i4) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 == 0) {
            return;
        }
        synchronized (this) {
            int iM6379 = C0073.m6379(this);
            int i5 = iM6379 + i4;
            int iM3371 = iM6379 - C0033.m3371(this);
            while (i4 > 0) {
                int iM3151 = C0032.m3151(i4, C0071.m6027(this).length - iM3371);
                C0027.m2519(bArr, i3 - i4, C0071.m6027(this), iM3371, iM3151);
                i4 -= iM3151;
                if (i4 > 0) {
                    C0077.m7211(this, i5);
                    iM3371 = 0;
                }
            }
            this.e = i5;
        }
    }

    public final void a(int i) {
        int iM6445 = i;
        int iM2664 = C0028.m2664(this);
        ArrayList arrayListM1020 = C0018.m1020(this);
        if (iM2664 < C0018.m1084(arrayListM1020) - 1) {
            this.c = C0033.m3371(this) + C0071.m6027(this).length;
            int iM26642 = C0028.m2664(this) + 1;
            this.b = iM26642;
            this.d = (byte[]) C0064.m4526(arrayListM1020, iM26642);
            return;
        }
        byte[] bArrM6027 = C0071.m6027(this);
        if (bArrM6027 == null) {
            this.c = 0;
        } else {
            iM6445 = C0074.m6445(bArrM6027.length << 1, iM6445 - C0033.m3371(this));
            this.c = C0033.m3371(this) + C0071.m6027(this).length;
        }
        this.b = C0028.m2664(this) + 1;
        C0071.m6050();
        byte[] bArr = new byte[iM6445];
        this.d = bArr;
        C0017.m919(arrayListM1020, bArr);
    }

    public final String toString() {
        return new String(C0022.m1668(this), C0022.m1684());
    }

    public R0() {
        synchronized (this) {
            C0077.m7211(this, 1024);
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        int iM6379 = C0073.m6379(this);
        int iM3371 = iM6379 - C0033.m3371(this);
        if (iM3371 == C0071.m6027(this).length) {
            C0077.m7211(this, iM6379 + 1);
            iM3371 = 0;
        }
        C0071.m6027(this)[iM3371] = (byte) i;
        this.e = C0073.m6379(this) + 1;
    }
}
