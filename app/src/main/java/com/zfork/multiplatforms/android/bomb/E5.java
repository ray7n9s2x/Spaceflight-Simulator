package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class E5 extends OutputStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f240short = {841, 846, 848, 853, 852, 768, 848, 833, 850, 833, 845, 837, 852, 837, 850, 851, 768, 841, 851, 768, 846, 853, 844, 844, 780, 768, 835, 833, 846, 846, 847, 852, 768, 855, 850, 841, 852, 837, 768, 837, 856, 852, 837, 846, 836, 837, 836, 768, 844, 847, 835, 833, 844, 768, 840, 837, 833, 836, 837, 850, 738, 749, 744, 737, 714, 741, 745, 737, 717, 746, 734, 749, 756, 676, 749, 759, 676, 746, 753, 744, 744, 676, 747, 758, 676, 737, 745, 756, 752, 765, 2130, 2121, 2116, 2120, 2122, 2135, 2133, 2114, 2132, 2132, 2114, 2115, 2055, 2132, 2126, 2141, 2114, 2055, 2132, 2127, 2120, 2130, 2123, 2115, 2055, 2117, 2114, 2055, 2132, 2114, 2131, 2055, 2113, 2120, 2133, 2055, 2141, 2126, 2135, 2055, 2114, 2121, 2131, 2133, 2126, 2114, 2132, 2055, 2120, 2113, 2055, 2116, 2120, 2122, 2135, 2133, 2114, 2132, 2132, 2126, 2120, 2121, 2055, 2131, 2142, 2135, 2114, 2055, 2132, 2131, 2120, 2133, 2114, 478, 450, 415, 479, 464, 476, 468, 2185, 2199, 2192, 275, 264, 261, 1516, 1504, 1506, 445, 410, 412, 395, 399, 387, 462, 391, 413, 462, 397, 386, 385, 413, 395, 394};
    public C0404m1 a;
    public D5 b;
    public AbstractC0325a1 c;
    public E1 d;
    public P2 e;
    public E f;
    public C0387j2 g;
    public CRC32 h;
    public C0387j2 i;
    public long j;
    public q5 k;
    public boolean l;
    public boolean m;

    /* JADX INFO: renamed from: ۟ۢۨۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6922() {
        if (C0031.m3075() > 0) {
            return f240short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠۟, reason: not valid java name and contains not printable characters */
    public static Object m6923(Object obj) {
        if (C0017.m846() > 0) {
            return ((byte[]) obj).clone();
        }
        return null;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C0027.m2465(this, new byte[]{(byte) i}, 0, 1);
    }

    public final E1 a() throws IOException {
        C0064.m4529(C0063.m4384(this));
        long jM3513 = C0035.m3513(C0023.m1885(C0038.m3988(C0063.m4384(this))));
        E1 e1M2826 = C0029.m2826(this);
        e1M2826.g = jM3513;
        P2 p2M5525 = C0067.m5525(this);
        p2M5525.g = jM3513;
        long jM7186 = C0077.m7186(this);
        e1M2826.h = jM7186;
        p2M5525.h = jM7186;
        boolean zM6833 = (C0026.m2287(e1M2826) && C0075.m6833(C0031.m3025(e1M2826), 4)) ? C0075.m6833(C0111.m13048(C0066.m4871(e1M2826)), 1) : true;
        CRC32 crc32M1399 = C0020.m1399(this);
        if (zM6833) {
            C0029.m2826(this).f = C0069.m5810(crc32M1399);
            C0067.m5525(this).f = C0069.m5810(crc32M1399);
        }
        D5 d5M3812 = C0037.m3812(this);
        C0017.m919(C0066.m4847(d5M3812), C0067.m5525(this));
        C0017.m919(C0030.m2889(C0020.m1447(d5M3812)), C0029.m2826(this));
        P2 p2M55252 = C0067.m5525(this);
        if (C0020.m1371(p2M55252)) {
            C0387j2 c0387j2M3638 = C0035.m3638(this);
            byte[] bArr = (byte[]) C0068.m5627(c0387j2M3638);
            C0387j2 c0387j2 = (C0387j2) C0036.m3641(c0387j2M3638);
            C0404m1 c0404m1M3946 = C0038.m3946(this);
            if (c0404m1M3946 == null) {
                throw new z5(C0029.m2695(m6922(), 0, 60, 800));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C0069.m5733(c0387j2, byteArrayOutputStream, (int) 134695760);
                C0029.m2742(C0072.m6168(p2M55252), bArr);
                C0067.m5408(byteArrayOutputStream, bArr, 0, 4);
                if (C0063.m4397(p2M55252)) {
                    C0022.m1681(c0387j2, byteArrayOutputStream, C0066.m4817(p2M55252));
                    C0022.m1681(c0387j2, byteArrayOutputStream, C0075.m6881(p2M55252));
                } else {
                    C0029.m2742(C0066.m4817(p2M55252), bArr);
                    C0067.m5408(byteArrayOutputStream, bArr, 0, 4);
                    C0029.m2742(C0075.m6881(p2M55252), bArr);
                    C0067.m5408(byteArrayOutputStream, bArr, 0, 4);
                }
                C0071.m6010(c0404m1M3946, C0077.m7297(byteArrayOutputStream));
                C0069.m5756(byteArrayOutputStream);
            } catch (Throwable th) {
                try {
                    C0069.m5756(byteArrayOutputStream);
                } catch (Throwable th2) {
                    C0072.m6234(th, th2);
                }
                throw th;
            }
        }
        this.j = 0L;
        C0036.m3766(crc32M1399);
        C0027.m2471(C0063.m4384(this));
        this.m = true;
        return C0029.m2826(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0420 A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0433 A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0453 A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046e A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047a A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047f A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x049e A[Catch: all -> 0x0431, TryCatch #0 {all -> 0x0431, blocks: (B:114:0x03c5, B:116:0x040d, B:124:0x0420, B:128:0x0447, B:130:0x0453, B:131:0x045d, B:135:0x0468, B:137:0x046e, B:138:0x0472, B:140:0x047a, B:142:0x047f, B:143:0x0498, B:145:0x049e, B:146:0x04e4, B:127:0x0433), top: B:166:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0526  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.zfork.multiplatforms.android.bomb.F5 r78) {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.E5.b(com.zfork.multiplatforms.android.bomb.F5):void");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!C0065.m4696(this)) {
            C0022.m1752(this);
        }
        D5 d5M3812 = C0037.m3812(this);
        C1 c1M1654 = C0022.m1654(d5M3812);
        C0404m1 c0404m1M3946 = C0038.m3946(this);
        Q4 q4M4091 = C0039.m4091(c0404m1M3946);
        c1M1654.f = q4M4091 instanceof Q4 ? C0071.m6066(C0077.m7170(q4M4091)) : C0072.m6237(c0404m1M3946);
        C0030.m2951(C0023.m1855(this));
        C0035.m3626(C0035.m3638(this), d5M3812, c0404m1M3946);
        C0023.m1924(c0404m1M3946);
        this.l = true;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C0027.m2465(this, bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!C0067.m5423(this)) {
            C0034.m3484(C0020.m1399(this), bArr, i, i2);
            C0016.m688(C0063.m4384(this), bArr, i, i2);
            this.j = C0077.m7186(this) + ((long) i2);
            return;
        }
        throw new IOException(C0018.m1070(m6922(), 179, 16, 494));
    }
}
