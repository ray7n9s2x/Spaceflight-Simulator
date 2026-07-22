package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Q0 extends FilterInputStream {
    public long a;
    public long b;
    public final long c;
    public boolean d;

    /* JADX INFO: renamed from: ۧۧۢۡ, reason: not valid java name and contains not printable characters */
    public static InputStream m6998(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((FilterInputStream) obj).in;
        }
        return null;
    }

    public final synchronized long a() {
        return C0039.m4121(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        C0027.m2480(m6998(this), i);
        this.b = C0039.m4121(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (!C0078.m7378(this)) {
            return C0031.m3016(this);
        }
        C0029.m2774(this);
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        C0036.m3727(m6998(this));
        this.a = C0065.m4693(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jM627;
        long jM2757 = j;
        synchronized (this) {
            long jM674 = C0016.m674(this);
            if (jM674 >= 0) {
                jM2757 = C0029.m2757(jM2757, jM674 - C0029.m2774(this));
            }
            jM627 = C0016.m627(m6998(this), jM2757);
            this.a = C0039.m4121(this) + jM627;
        }
        return jM627;
    }

    public final boolean b() {
        long jM674 = C0016.m674(this);
        return jM674 >= 0 && C0029.m2774(this) >= jM674;
    }

    public final int c() {
        int iM3071 = C0031.m3071(m6998(this));
        int i = iM3071 != -1 ? 1 : -1;
        synchronized (this) {
            if (i != -1) {
                this.a = C0039.m4121(this) + ((long) i);
            }
        }
        return iM3071;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (C0019.m1194(this)) {
            C0024.m1958(m6998(this));
        }
    }

    public final int d(byte[] bArr, int i, int i2) {
        int iM3212 = C0032.m3212(m6998(this), bArr, i, i2);
        synchronized (this) {
            if (iM3212 != -1) {
                this.a = C0039.m4121(this) + ((long) iM3212);
            }
        }
        return iM3212;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return C0017.m925(m6998(this));
    }

    public final String toString() {
        return C0074.m6524(m6998(this));
    }

    public Q0(InputStream inputStream, long j) {
        super(inputStream);
        this.a = 0L;
        this.c = j;
        this.d = true;
        this.d = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (C0078.m7378(this)) {
            C0029.m2774(this);
            return 0;
        }
        return C0064.m4575(m6998(this));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return C0075.m6789(this, bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (C0078.m7378(this)) {
            C0029.m2774(this);
            return -1;
        }
        long jM2757 = i2;
        long jM674 = C0016.m674(this);
        if (jM674 >= 0) {
            jM2757 = C0029.m2757(jM2757, jM674 - C0029.m2774(this));
        }
        return C0111.m13049(this, bArr, i, (int) jM2757);
    }
}
