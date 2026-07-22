package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Q4 extends OutputStream implements C3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f276short = {1223, 1220, 1240, 1245, 1216, 1172, 1240, 1233, 1242, 1235, 1216, 1244, 1172, 1240, 1233, 1223, 1223, 1172, 1216, 1244, 1237, 1242, 1172, 1241, 1245, 1242, 1245, 1241, 1217, 1241, 1172, 1237, 1240, 1240, 1243, 1219, 1233, 1232, 1172, 1223, 1220, 1240, 1245, 1216, 1172, 1240, 1233, 1242, 1235, 1216, 1244, 1172, 1243, 1234, 1172, 1154, 1153, 1153, 1159, 1154, 1172, 1270, 1229, 1216, 1233, 1223, 555, 558, 2864, 2879, 2874, 2867, 2936, 2853, 2867, 2854, 2871, 2852, 2871, 2850, 2873, 2852, 1575, 1651, 1593, 3258, 3310, 918, 915, 1956, 1958, 1961, 1961, 1960, 1971, 2023, 1973, 1954, 1961, 1958, 1962, 1954, 2023, 1961, 1954, 1968, 1963, 1982, 2023, 1956, 1973, 1954, 1958, 1971, 1954, 1955, 2023, 1972, 1975, 1963, 1966, 1971, 2023, 1953, 1966, 1963, 1954, 1760, 1763, 1791, 1786, 1767, 1715, 1781, 1786, 1791, 1782, 1705, 1715, 2570, 2635, 2630, 2648, 2639, 2635, 2638, 2643, 2570, 2639, 2642, 2627, 2649, 2654, 2649, 2570, 2627, 2628, 2570, 2654, 2626, 2639, 2570, 2633, 2655, 2648, 2648, 2639, 2628, 2654, 2570, 2638, 2627, 2648, 2639, 2633, 2654, 2629, 2648, 2643, 2566, 2570, 2633, 2635, 2628, 2628, 2629, 2654, 2570, 2648, 2639, 2628, 2635, 2631, 2639, 2570, 2654, 2626, 2627, 2649, 2570, 2636, 2627, 2630, 2639};
    public RandomAccessFile a;
    public final long b;
    public File c;
    public int d;
    public long e;
    public final C0387j2 f;

    public Q4(File file) {
        this(file, -1L);
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7000() {
        if (C0018.m1064() > 0) {
            return f276short;
        }
        return null;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C0111.m13166(this, new byte[]{(byte) i}, 0, 1);
    }

    public Q4(File file, long j) throws z5 {
        this.f = new C0387j2(3);
        if (j >= 0 && j < 65536) {
            throw new z5(C0063.m4315(m7000(), 0, 66, 1204));
        }
        this.a = new RandomAccessFile(file, C0023.m1904(m7000(), 66, 2, 601));
        this.b = j;
        this.c = file;
        this.d = 0;
        this.e = 0L;
    }

    @Override // com.zfork.multiplatforms.android.bomb.C3
    public final int a() {
        return C0018.m1044(this);
    }

    @Override // com.zfork.multiplatforms.android.bomb.C3
    public final long b() {
        return C0071.m6066(C0077.m7170(this));
    }

    public final void c() {
        String strM5536;
        String strM6471 = C0074.m6471(C0018.m1025(C0016.m720(this)));
        String strM4158 = C0039.m4158(C0016.m720(this));
        if (C0018.m1006(C0016.m720(this)) == null) {
            strM5536 = C0031.m2993();
        } else {
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0018.m1006(C0016.m720(this)));
            C0077.m7290(sb, C0039.m4087(C0075.m6791(m7000(), 68, 14, 2902)));
            strM5536 = C0068.m5536(sb);
        }
        StringBuilder sb2 = new StringBuilder(C0029.m2695(m7000(), 82, 3, 1545));
        C0021.m1551(sb2, C0018.m1044(this) + 1);
        String strM55362 = C0068.m5536(sb2);
        if (C0018.m1044(this) >= 9) {
            StringBuilder sb3 = new StringBuilder(C0069.m5807(m7000(), 85, 2, 3220));
            C0021.m1551(sb3, C0018.m1044(this) + 1);
            strM55362 = C0068.m5536(sb3);
        }
        StringBuilder sb4 = new StringBuilder();
        C0077.m7290(sb4, strM5536);
        C0077.m7290(sb4, strM6471);
        C0077.m7290(sb4, strM55362);
        File file = new File(C0068.m5536(sb4));
        C0111.m13119(C0077.m7170(this));
        if (C0033.m3343(file)) {
            StringBuilder sb5 = new StringBuilder(C0016.m625(m7000(), WorkQueueKt.MASK, 12, 1683));
            C0077.m7290(sb5, C0018.m1025(file));
            C0077.m7290(sb5, C0066.m4828(m7000(), 139, 65, 2602));
            throw new IOException(C0068.m5536(sb5));
        }
        if (!C0024.m1967(C0016.m720(this), file)) {
            throw new IOException(C0026.m2321(m7000(), 89, 38, 1991));
        }
        this.c = new File(strM4158);
        this.a = new RandomAccessFile(C0016.m720(this), C0032.m3209(m7000(), 87, 2, 996));
        this.d = C0018.m1044(this) + 1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0111.m13119(C0077.m7170(this));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C0111.m13166(this, bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        long jM5514 = C0067.m5514(this);
        if (jM5514 == -1) {
            C0069.m5727(C0077.m7170(this), bArr, i, i2);
            this.e = C0027.m2420(this) + ((long) i2);
            return;
        }
        long jM2420 = C0027.m2420(this);
        if (jM2420 >= jM5514) {
            C0021.m1523(this);
            C0069.m5727(C0077.m7170(this), bArr, i, i2);
            this.e = i2;
            return;
        }
        long j = i2;
        if (jM2420 + j > jM5514) {
            C0030.m2951(C0071.m6023(this));
            int iM5546 = C0068.m5546(0, bArr);
            for (int i3 : C0067.m5480(12)) {
                if (i3 != 8 && C0074.m6557(i3) == iM5546) {
                    C0021.m1523(this);
                    C0069.m5727(C0077.m7170(this), bArr, i, i2);
                    this.e = j;
                    return;
                }
            }
            C0069.m5727(C0077.m7170(this), bArr, i, (int) (jM5514 - C0027.m2420(this)));
            C0021.m1523(this);
            RandomAccessFile randomAccessFileM7170 = C0077.m7170(this);
            long jM24202 = jM5514 - C0027.m2420(this);
            C0069.m5727(randomAccessFileM7170, bArr, i + ((int) jM24202), (int) (j - jM24202));
            this.e = j - (jM5514 - C0027.m2420(this));
            return;
        }
        C0069.m5727(C0077.m7170(this), bArr, i, i2);
        this.e = C0027.m2420(this) + j;
    }
}
