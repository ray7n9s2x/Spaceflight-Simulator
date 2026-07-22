package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.script.bean.C0074;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0447t3 extends P4 {
    public C0453u3 a;

    @Override // java.io.InputStream
    public final int read() {
        return C0032.m3154(C0035.m3585(this));
    }

    @Override // com.zfork.multiplatforms.android.bomb.P4
    public final void a(E1 e1) {
        C0032.m3170(C0035.m3585(this), C0032.m3179(e1));
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0453u3 c0453u3M3585 = C0035.m3585(this);
        if (c0453u3M3585 != null) {
            C0074.m6534(c0453u3M3585);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return C0068.m5549(C0035.m3585(this), bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return C0068.m5549(C0035.m3585(this), bArr, i, i2);
    }
}
