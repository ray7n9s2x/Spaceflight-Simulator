package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import java.io.OutputStream;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0404m1 extends OutputStream implements C3 {
    public Q4 a;
    public long b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        C0066.m4905(this, new byte[]{(byte) i}, 0, 1);
    }

    @Override // com.zfork.multiplatforms.android.bomb.C3
    public final long b() {
        Q4 q4M4091 = C0039.m4091(this);
        return q4M4091 instanceof Q4 ? C0071.m6066(C0077.m7170(q4M4091)) : C0072.m6237(this);
    }

    public final boolean c() {
        Q4 q4M4091 = C0039.m4091(this);
        return (q4M4091 instanceof Q4) && C0067.m5514(q4M4091) != -1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0065.m4685(C0039.m4091(this));
    }

    @Override // com.zfork.multiplatforms.android.bomb.C3
    public final int a() {
        if (C0036.m3645(this)) {
            return C0018.m1044(C0039.m4091(this));
        }
        return 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C0066.m4905(this, bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C0111.m13166(C0039.m4091(this), bArr, i, i2);
        this.b = C0072.m6237(this) + ((long) i2);
    }
}
