package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0021;

/* JADX INFO: loaded from: classes3.dex */
public final class u5 {
    public static final int[] b = new int[256];
    public final int[] a = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (i2 & 1) == 1 ? (i2 >>> 1) ^ (-306674912) : i2 >>> 1;
            }
            C0039.m4179()[i] = i2;
        }
    }

    public final byte a() {
        int i = C0021.m1609(this)[2] | 2;
        return (byte) ((i * (i ^ 1)) >>> 8);
    }

    public final void b(byte b2) {
        int[] iArrM1609 = C0021.m1609(this);
        int i = iArrM1609[0];
        int[] iArrM4179 = C0039.m4179();
        int i2 = iArrM4179[(b2 ^ i) & 255] ^ (i >>> 8);
        iArrM1609[0] = i2;
        int i3 = iArrM1609[1] + (i2 & 255);
        iArrM1609[1] = i3;
        int i4 = (i3 * 134775813) + 1;
        iArrM1609[1] = i4;
        int i5 = iArrM1609[2];
        iArrM1609[2] = iArrM4179[(i5 ^ ((byte) (i4 >> 24))) & 255] ^ (i5 >>> 8);
    }
}
