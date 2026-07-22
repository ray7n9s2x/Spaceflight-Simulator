package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0453u3 extends RandomAccessFile {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f368short = {976, 1732, 883, 848, 844, 841, 852, 768, 838, 841, 844, 837, 768, 846, 853, 845, 834, 837, 850, 768, 1757, 1689, 1682, 1688, 1678, 1757, 1683, 1682, 1673, 1757, 1688, 1669, 1684, 1678, 1673, 2189, 2222, 2226, 2231, 2218, 2302, 2232, 2231, 2226, 2235, 2302, 2235, 2214, 2218, 2235, 2224, 2221, 2231, 2225, 2224, 2302, 2224, 2225, 2218, 2302, 2231, 2224, 2302, 2235, 2214, 2222, 2235, 2237, 2218, 2235, 2234, 2302, 2232, 2225, 2220, 2227, 2239, 2218, 2288, 2302, 2200, 2225, 2219, 2224, 2234, 2276, 2302, 1883, 1822, 1795, 1803, 1822, 1816, 1807, 1822, 1823, 1883, 1812, 1821, 1883, 1821, 1812, 1801, 1814, 1818, 1807, 1857, 1883, 1877, 1867, 1867, 1866, 1879, 1883, 1877, 1867, 1867, 1865, 1879, 1883, 1822, 1807, 1816, 1245, 1246, 1218, 1223, 1242, 1166, 1229, 1217, 1243, 1216, 1242, 1227, 1244, 1166, 1225, 1244, 1227, 1231, 1242, 1227, 1244, 1166, 1242, 1222, 1231, 1216, 1166, 1216, 1243, 1219, 1228, 1227, 1244, 1166, 1217, 1224, 1166, 1245, 1246, 1218, 1223, 1242, 1166, 1224, 1223, 1218, 1227, 1245};
    public final long a;
    public final File[] b;
    public RandomAccessFile c;
    public final byte[] d;
    public int e;
    public final String f;

    /* JADX INFO: renamed from: ۧ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7128() {
        if (C0068.m5678() >= 0) {
            return f368short;
        }
        return null;
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        byte[] bArrM4337 = C0063.m4337(this);
        if (C0068.m5549(this, bArrM4337, 0, bArrM4337.length) == -1) {
            return -1;
        }
        return bArrM4337[0] & 255;
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0453u3(File file, File[] fileArr) throws IOException {
        String strM4545 = C0064.m4545(m7128(), 0, 1, 930);
        super(file, strM4545);
        this.d = new byte[1];
        this.e = 0;
        super.close();
        int i = 1;
        for (File file2 : fileArr) {
            String strM1025 = C0018.m1025(file2);
            String strM6452 = C0074.m6452(m7128(), 1, 1, 1770);
            String strM2993 = !C0028.m2625(strM1025, strM6452) ? C0031.m2993() : C0071.m6056(strM1025, C0077.m7286(strM1025, strM6452) + 1);
            try {
                if (i != C0039.m4116(strM2993)) {
                    StringBuilder sb = new StringBuilder();
                    C0077.m7290(sb, C0017.m936(m7128(), 2, 18, 800));
                    C0021.m1551(sb, i);
                    C0077.m7290(sb, C0023.m1904(m7128(), 20, 15, 1789));
                    throw new IOException(C0068.m5536(sb));
                }
                i++;
            } catch (NumberFormatException unused) {
                throw new IOException(C0074.m6503(C0067.m5418(m7128(), 35, 52, 2270), strM2993, C0037.m3829(m7128(), 87, 36, 1915)));
            }
        }
        this.c = new RandomAccessFile(file, strM4545);
        this.b = fileArr;
        this.a = C0070.m5960(file);
        this.f = strM4545;
    }

    public final void a(int i) {
        if (C0031.m3049(this) == i) {
            return;
        }
        File[] fileArrM681 = C0016.m681(this);
        if (i > fileArrM681.length - 1) {
            throw new IOException(C0069.m5807(m7128(), 123, 48, 1198));
        }
        RandomAccessFile randomAccessFileM1535 = C0021.m1535(this);
        if (randomAccessFileM1535 != null) {
            C0111.m13119(randomAccessFileM1535);
        }
        this.c = new RandomAccessFile(fileArrM681[i], C0030.m2851(this));
        this.e = i;
    }

    @Override // java.io.RandomAccessFile, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFileM1535 = C0021.m1535(this);
        if (randomAccessFileM1535 != null) {
            C0111.m13119(randomAccessFileM1535);
        }
        super.close();
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() {
        return C0071.m6066(C0021.m1535(this));
    }

    @Override // java.io.RandomAccessFile
    public final long length() {
        return C0028.m2600(C0021.m1535(this));
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j) {
        long jM3775 = C0037.m3775(this);
        int i = (int) (j / jM3775);
        if (i != C0031.m3049(this)) {
            C0027.m2427(this, i);
        }
        C0017.m851(C0021.m1535(this), j - (((long) i) * jM3775));
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr) {
        C0071.m5971(this, bArr, 0, bArr.length);
        throw null;
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr) {
        return C0068.m5549(this, bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i, int i2) {
        int iM5406 = C0067.m5406(C0021.m1535(this), bArr, i, i2);
        if (iM5406 != -1) {
            return iM5406;
        }
        int iM3049 = C0031.m3049(this);
        if (iM3049 == C0016.m681(this).length - 1) {
            return -1;
        }
        C0027.m2427(this, iM3049 + 1);
        return C0068.m5549(this, bArr, i, i2);
    }
}
