package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.joke.plugin.gson.internal.bind.util.C0067;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0325a1 extends OutputStream {
    public final C0430q3 a;

    @Override // java.io.OutputStream
    public void write(int i) {
        C0021.m1571(this, new byte[]{(byte) i});
    }

    public void a() {
        C0023.m1885(C0038.m3988(this)).c = true;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0077.m7253(C0038.m3988(this));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        C0016.m688(this, bArr, 0, bArr.length);
    }

    public AbstractC0325a1(C0430q3 c0430q3) {
        this.a = c0430q3;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C0067.m5407(C0038.m3988(this), bArr, i, i2);
    }
}
