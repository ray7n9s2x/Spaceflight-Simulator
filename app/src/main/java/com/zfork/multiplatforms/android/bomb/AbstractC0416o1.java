package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0416o1 extends InputStream {
    public final Z0 a;
    public final byte[] b = new byte[1];

    public int b(PushbackInputStream pushbackInputStream) {
        return 0;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArrM5950 = C0070.m5950(this);
        if (C0063.m4426(this, bArrM5950) == -1) {
            return -1;
        }
        return bArrM5950[0];
    }

    public void a(PushbackInputStream pushbackInputStream, int i) {
        C0074.m6575(C0034.m3497(this), pushbackInputStream, i);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0063.m4449(C0034.m3497(this));
    }

    public AbstractC0416o1(Z0 z0) {
        this.a = z0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return C0018.m1078(this, bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return C0064.m4544(C0034.m3497(this), bArr, i, i2);
    }
}
