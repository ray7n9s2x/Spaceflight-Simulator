package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.kms.C0030;
import com.joke.plugin.gson.reflect.C0072;
import java.io.OutputStream;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0430q3 extends OutputStream {
    public final y5 a;
    public final E b = new E();

    @Override // java.io.OutputStream
    public void write(int i) {
        C0111.m13145(C0023.m1885(this), i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0030.m2951(C0023.m1885(this));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        C0072.m6193(C0023.m1885(this), bArr);
    }

    public C0430q3(y5 y5Var, F5 f5, boolean z) {
        this.a = y5Var;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C0030.m2951(C0026.m2272(this));
        C0037.m3858(C0023.m1885(this), bArr, i, i2);
    }
}
