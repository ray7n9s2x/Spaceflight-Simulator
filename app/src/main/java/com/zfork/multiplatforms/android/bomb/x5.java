package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 extends InputStream {
    public PushbackInputStream a;
    public long b;
    public byte[] c;
    public long d;

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArrM5795 = C0069.m5795(this);
        if (C0039.m4076(this, bArrM5795, 0, bArrM5795.length) == -1) {
            return -1;
        }
        return bArrM5795[0];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0024.m1958(C0033.m3302(this));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return C0039.m4076(this, bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        long jM2881 = C0030.m2881(this);
        if (jM2881 != -1) {
            long jM6327 = C0073.m6327(this);
            if (jM6327 >= jM2881) {
                return -1;
            }
            long j = jM2881 - jM6327;
            if (i3 > j) {
                i3 = (int) j;
            }
        }
        int iM3212 = C0032.m3212(C0033.m3302(this), bArr, i, i3);
        if (iM3212 > 0) {
            this.b = C0073.m6327(this) + ((long) iM3212);
        }
        return iM3212;
    }
}
