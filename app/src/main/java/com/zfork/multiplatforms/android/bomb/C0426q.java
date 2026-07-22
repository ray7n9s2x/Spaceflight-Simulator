package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.google.common.base.Ascii;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.IOException;
import java.io.PushbackInputStream;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0426q extends Z0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f355short = {2516, 2531, 2535, 2533, 2542, 2531, 2530, 2470, 2531, 2536, 2530, 2470, 2537, 2528, 2470, 2530, 2535, 2546, 2535, 2470, 2528, 2537, 2548, 2470, 2546, 2542, 2543, 2549, 2470, 2531, 2536, 2546, 2548, 2559, 2474, 2470, 2532, 2547, 2546, 2470, 2535, 2531, 2549, 2470, 2544, 2531, 2548, 2543, 2528, 2543, 2533, 2535, 2546, 2543, 2537, 2536, 2470, 2528, 2535, 2543, 2538, 2531, 2530, 2669, 2634, 2642, 2629, 2632, 2637, 2624, 2564, 2661, 2657, 2679, 2564, 2665, 2629, 2631, 2564, 2630, 2653, 2640, 2625, 2647, 2570, 2564, 2663, 2635, 2641, 2632, 2624, 2564, 2634, 2635, 2640, 2564, 2646, 2625, 2629, 2624, 2564, 2647, 2641, 2626, 2626, 2637, 2631, 2637, 2625, 2634, 2640, 2564, 2624, 2629, 2640, 2629, 3077, 3074, 3098, 3085, 3072, 3077, 3080, 3148, 3079, 3081, 3093, 3148, 3072, 3081, 3074, 3083, 3096, 3076, 3148, 3140, 3074, 3075, 3096, 3148, 3165, 3166, 3156, 3139, 3165, 3157, 3166, 3139, 3166, 3161, 3162, 3141, 1514, 1487, 1490, 1491, 1498, 1437, 1517, 1500, 1486, 1486, 1482, 1490, 1487, 1497, 3172, 3180, 3185, 3189, 3192, 3105, 3182, 3187, 3105, 3183, 3188, 3181, 3181, 3105, 3185, 3168, 3186, 3186, 3190, 3182, 3187, 3173, 3105, 3185, 3187, 3182, 3191, 3176, 3173, 3172, 3173, 3105, 3175, 3182, 3187, 3105, 3136, 3140, 3154, 3105, 3173, 3172, 3170, 3187, 3192, 3185, 3189, 3176, 3182, 3183, 439, 400, 392, 415, 402, 407, 410, 478, 415, 411, 397, 478, 405, 411, 391, 478, 397, 394, 396, 411, 400, 409, 394, 406, 478, 407, 400, 478, 415, 411, 397, 478, 411, 390, 394, 396, 415, 478, 410, 415, 394, 415, 478, 396, 411, 413, 401, 396, 410, 686, 681, 689, 678, 683, 686, 675, 743, 678, 674, 692, 743, 674, 703, 691, 693, 678, 743, 675, 678, 691, 678, 743, 693, 674, 676, 680, 693, 675};
    public byte[] e;
    public byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    /* JADX INFO: renamed from: ۟ۡۧۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7104() {
        if (C0064.m4578() > 0) {
            return f355short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.Z0, java.io.InputStream
    public final int read() {
        byte[] bArrM1663 = C0022.m1663(this);
        if (C0032.m3224(this, bArrM1663, 0, bArrM1663.length) == -1) {
            return -1;
        }
        return bArrM1663[0];
    }

    @Override // com.zfork.multiplatforms.android.bomb.Z0
    public final void a(PushbackInputStream pushbackInputStream, int i) throws IOException {
        byte[] bArr = new byte[10];
        if (C0073.m6412(pushbackInputStream, bArr) != 10) {
            throw new z5(C0077.m7205(m7104(), 63, 53, 2596));
        }
        Q2 q2M5548 = C0068.m5548((C0323a) C0071.m6006(this));
        if (C0069.m5716(C0075.m6883(q2M5548)) > 0) {
            C0077.m7199(q2M5548, i);
        }
        byte[] bArr2 = new byte[10];
        C0027.m2519(C0023.m1790(C0025.m2116(q2M5548)), 0, bArr2, 0, 10);
        if (!C0073.m6306(bArr, bArr2)) {
            throw new IOException(C0030.m2840(m7104(), 0, 63, 2438));
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.Z0
    public final InterfaceC0422p1 b(P2 p2, char[] cArr, boolean z) throws IOException {
        C0337c c0337cM4871 = C0066.m4871(p2);
        if (c0337cM4871 == null) {
            throw new IOException(C0077.m7205(m7104(), 265, 29, 711));
        }
        int iM3155 = C0032.m3155(c0337cM4871);
        if (iM3155 == 0) {
            throw new IOException(C0063.m4315(m7104(), 216, 49, 510));
        }
        byte[] bArr = new byte[C0066.m4877(iM3155)];
        C0030.m2853(this, bArr);
        byte[] bArr2 = new byte[2];
        C0030.m2853(this, bArr2);
        C0323a c0323a = new C0323a();
        c0323a.c = 1;
        c0323a.d = new byte[16];
        c0323a.e = new byte[16];
        if (cArr == null || cArr.length <= 0) {
            throw new z5(C0032.m3209(m7104(), 166, 50, 3073));
        }
        int iM31552 = C0032.m3155(c0337cM4871);
        byte[] bArrM6491 = C0074.m6491(bArr, cArr, iM31552, z);
        byte[] bArr3 = new byte[2];
        C0027.m2519(bArrM6491, C0034.m3398(iM31552) + C0077.m7188(iM31552), bArr3, 0, 2);
        if (!C0073.m6306(bArr2, bArr3)) {
            throw new z5(C0026.m2321(m7104(), 152, 14, 1469));
        }
        int iM7188 = C0077.m7188(iM31552);
        byte[] bArr4 = new byte[iM7188];
        int i = 0;
        C0027.m2519(bArrM6491, 0, bArr4, 0, iM7188);
        C0330b c0330b = new C0330b();
        c0330b.b = null;
        int i2 = iM7188 / 4;
        if ((i2 != 4 && i2 != 6 && i2 != 8) || i2 * 4 != iM7188) {
            throw new z5(C0031.m3047(m7104(), 116, 36, 3180));
        }
        c0330b.a = i2 + 6;
        int[][] iArr = (int[][]) C0078.m7447(C0072.m6191(), new int[]{i2 + 7, 4});
        int i3 = 0;
        while (i < iM7188) {
            iArr[i3 >> 2][i3 & 3] = (bArr4[i] & 255) | ((bArr4[i + 1] & 255) << 8) | ((bArr4[i + 2] & 255) << 16) | (bArr4[i + 3] << Ascii.CAN);
            i += 4;
            i3++;
        }
        int iM6007 = (C0071.m6007(c0330b) + 1) << 2;
        for (int i4 = i2; i4 < iM6007; i4++) {
            int i5 = i4 - 1;
            int iM1410 = iArr[i5 >> 2][i5 & 3];
            int i6 = i4 % i2;
            if (i6 == 0) {
                iM1410 = C0020.m1410(C0029.m2789(iM1410, 8)) ^ C0078.m7351()[(i4 / i2) - 1];
            } else if (i2 > 6 && i6 == 4) {
                iM1410 = C0020.m1410(iM1410);
            }
            int i7 = i4 - i2;
            iArr[i4 >> 2][i4 & 3] = iM1410 ^ iArr[i7 >> 2][i7 & 3];
        }
        c0330b.b = iArr;
        c0323a.a = c0330b;
        int iM3398 = C0034.m3398(iM31552);
        byte[] bArr5 = new byte[iM3398];
        C0027.m2519(bArrM6491, C0077.m7188(iM31552), bArr5, 0, iM3398);
        Q2 q2 = new Q2();
        C0111.m13154(q2, bArr5);
        c0323a.b = q2;
        return c0323a;
    }

    public final void d(int i, byte[] bArr) {
        int iM7423 = C0078.m7423(this);
        int iM5477 = C0067.m5477(this);
        if (iM7423 >= iM5477) {
            iM7423 = iM5477;
        }
        this.l = iM7423;
        C0027.m2519(C0028.m2606(this), C0031.m3041(this), bArr, i, iM7423);
        int iM7400 = C0078.m7400(this);
        int iM3041 = C0031.m3041(this) + iM7400;
        this.g = iM3041;
        if (iM3041 >= 15) {
            this.g = 15;
        }
        int iM54772 = C0067.m5477(this) - iM7400;
        this.h = iM54772;
        if (iM54772 <= 0) {
            this.h = 0;
        }
        this.k = C0068.m5605(this) + iM7400;
        this.i = C0078.m7423(this) - iM7400;
        this.j = C0023.m1849(this) + iM7400;
    }

    @Override // com.zfork.multiplatforms.android.bomb.Z0, java.io.InputStream
    public final int read(byte[] bArr) {
        return C0032.m3224(this, bArr, 0, bArr.length);
    }

    @Override // com.zfork.multiplatforms.android.bomb.Z0, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        this.i = i2;
        this.j = i;
        this.k = 0;
        if (C0067.m5477(this) != 0) {
            C0078.m7445(this, i, bArr);
            int iM5605 = C0068.m5605(this);
            if (iM5605 == i2) {
                return iM5605;
            }
        }
        if (C0078.m7423(this) < 16) {
            byte[] bArrM2606 = C0028.m2606(this);
            int i3 = super.read(bArrM2606, 0, bArrM2606.length);
            this.g = 0;
            if (i3 == -1) {
                this.h = 0;
                int iM56052 = C0068.m5605(this);
                if (iM56052 > 0) {
                    return iM56052;
                }
                return -1;
            }
            this.h = i3;
            C0078.m7445(this, C0023.m1849(this), bArr);
            int iM56053 = C0068.m5605(this);
            if (iM56053 == i2) {
                return iM56053;
            }
        }
        int iM1849 = C0023.m1849(this);
        int iM7423 = C0078.m7423(this);
        int i4 = super.read(bArr, iM1849, iM7423 - (iM7423 % 16));
        if (i4 == -1) {
            int iM56054 = C0068.m5605(this);
            if (iM56054 > 0) {
                return iM56054;
            }
            return -1;
        }
        return i4 + C0068.m5605(this);
    }
}
