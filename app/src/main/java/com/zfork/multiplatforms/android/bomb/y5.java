package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 extends OutputStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f376short = {3043, 3024, 3017, 3068, 3031, 3021, 3019, 3008, 3062, 3020, 3021, 3017, 3020, 3021, 3050, 3021, 3019, 3036, 3032, 3028, 2969, 3024, 3018, 2969, 3034, 3029, 3030, 3018, 3036, 3037};
    public long a;
    public OutputStream b;
    public boolean c;

    /* JADX INFO: renamed from: ۣۤۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7145() {
        if (C0016.m717() < 0) {
            return f376short;
        }
        return null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C0037.m3858(this, new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C0037.m3858(this, bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!C0073.m6299(this)) {
            C0036.m3734(C0065.m4706(this), bArr, i, i2);
            this.a = C0035.m3513(this) + ((long) i2);
            return;
        }
        throw new IllegalStateException(C0033.m3330(m7145(), 0, 30, AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN));
    }
}
