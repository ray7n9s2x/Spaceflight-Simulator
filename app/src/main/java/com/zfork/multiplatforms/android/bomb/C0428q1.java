package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0069;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0428q1 extends AbstractC0325a1 {
    public byte[] b;
    public Deflater c;

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0325a1, java.io.OutputStream
    public final void write(byte[] bArr) {
        C0027.m2486(this, bArr, 0, bArr.length);
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0325a1
    public final void a() {
        Deflater deflaterM2550 = C0028.m2550(this);
        if (!C0024.m2054(deflaterM2550)) {
            C0034.m3389(deflaterM2550);
            while (!C0024.m2054(deflaterM2550)) {
                Deflater deflaterM25502 = C0028.m2550(this);
                byte[] bArrM3231 = C0032.m3231(this);
                int iM5741 = C0069.m5741(deflaterM25502, bArrM3231, 0, bArrM3231.length);
                if (iM5741 > 0) {
                    super.write(bArrM3231, 0, iM5741);
                }
            }
        }
        C0066.m4849(deflaterM2550);
        super.a();
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0325a1, java.io.OutputStream
    public final void write(int i) {
        C0027.m2486(this, new byte[]{(byte) i}, 0, 1);
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0325a1, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        Deflater deflaterM2550 = C0028.m2550(this);
        C0023.m1917(deflaterM2550, bArr, i, i2);
        while (!C0029.m2765(deflaterM2550)) {
            Deflater deflaterM25502 = C0028.m2550(this);
            byte[] bArrM3231 = C0032.m3231(this);
            int iM5741 = C0069.m5741(deflaterM25502, bArrM3231, 0, bArrM3231.length);
            if (iM5741 > 0) {
                super.write(bArrM3231, 0, iM5741);
            }
        }
    }
}
