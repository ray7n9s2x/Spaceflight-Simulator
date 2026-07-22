package com.android.apksig.internal.util;

import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class FileChannelDataSource implements DataSource {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f116short = {1844, 1838, 1853, 1826, 1917, 1895, 3075, 3082, 3082, 3103, 3081, 3096, 3158, 3148, 1935, 3078, 3087, 3089, 3087, 3164, 3136, 3162, 3165, 3148, 3146, 3087, 3164, 3142, 3157, 3146, 3087, 3079, 2612, 2621, 2621, 2600, 2622, 2607, 2683, 2675, 669, 660, 671, 660, 711, 733, 718, 721, 660, 668, 2427, 2418, 2365, 2340, 2359, 2336, 2356, 2366, 2365, 2341, 2326, 2316, 2335, 2304, 2399, 2373, 2340, 2349, 2349, 2360, 2350, 2367, 2417, 2411, 1435, 1440, 1451, 1462, 1470, 1451, 1453, 1466, 1451, 1450, 1518, 1419, 1409, 1416, 1518, 1451, 1440, 1453, 1441, 1467, 1440, 1466, 1451, 1468, 1451, 1450, 1039, 1045, 1030, 1049, 1094, 1116};
    public final FileChannel a;
    public final long b;
    public final long c;

    public FileChannelDataSource(FileChannel fileChannel) {
        this.a = fileChannel;
        this.b = 0L;
        this.c = -1L;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2379() {
        if (C0063.m4427() >= 0) {
            return f116short;
        }
        return null;
    }

    @Override // com.android.apksig.util.DataSource
    public /* bridge */ /* synthetic */ DataSource slice(long j, long j2) {
        return C0032.m3205(this, j, j2);
    }

    public static void a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j, C0066.m4828(m2379(), 66, 8, 2379)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j2, C0019.m1189(m2379(), 60, 6, 2405)));
        }
        String strM2404 = C0027.m2404(m2379(), 14, 1, 1958);
        String strM2840 = C0030.m2840(m2379(), 15, 17, 3119);
        String strM3603 = C0035.m3603(m2379(), 32, 8, 2651);
        if (j > j3) {
            StringBuilder sb = new StringBuilder(strM3603);
            C0078.m7466(sb, j);
            C0077.m7290(sb, strM2840);
            C0078.m7466(sb, j3);
            C0077.m7290(sb, strM2404);
            throw new IndexOutOfBoundsException(C0068.m5536(sb));
        }
        long j4 = j + j2;
        String strM2151 = C0025.m2151(m2379(), 40, 10, 692);
        if (j4 < j) {
            StringBuilder sb2 = new StringBuilder(strM3603);
            C0078.m7466(sb2, j);
            C0077.m7290(sb2, strM2151);
            C0078.m7466(sb2, j2);
            C0077.m7290(sb2, C0067.m5418(m2379(), 50, 10, 2386));
            throw new IndexOutOfBoundsException(C0068.m5536(sb2));
        }
        if (j4 <= j3) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(strM3603);
        C0078.m7466(sb3, j);
        C0077.m7290(sb3, strM2151);
        C0078.m7466(sb3, j2);
        C0077.m7290(sb3, strM2840);
        C0078.m7466(sb3, j3);
        C0077.m7290(sb3, strM2404);
        throw new IndexOutOfBoundsException(C0068.m5536(sb3));
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C0071.m6038(i, C0111.m13097(m2379(), 100, 6, 1148)));
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(i);
        C0066.m4904(this, j, i, byteBufferM3516);
        C0020.m1437(byteBufferM3516);
        return byteBufferM3516;
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        long jM5615 = C0068.m5615(this);
        if (jM5615 != -1) {
            return jM5615;
        }
        try {
            return C0018.m1002(C0029.m2691(this));
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public FileChannelDataSource slice(long j, long j2) {
        long jM1419 = C0020.m1419(this);
        C0020.m1391(j, j2, jM1419);
        if (j == 0 && j2 == jM1419) {
            return this;
        }
        return new FileChannelDataSource(C0029.m2691(this), C0023.m1841(this) + j, j2);
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j, int i, ByteBuffer byteBuffer) {
        int iM2399;
        int i2 = i;
        C0020.m1391(j, i2, C0020.m1419(this));
        if (i2 == 0) {
            return;
        }
        if (i2 <= C0071.m5984(byteBuffer)) {
            long jM1841 = C0023.m1841(this) + j;
            int iM6818 = C0075.m6818(byteBuffer);
            try {
                C0034.m3392(byteBuffer, C0035.m3629(byteBuffer) + i2);
                while (i2 > 0) {
                    synchronized (C0029.m2691(this)) {
                        C0024.m1933(C0029.m2691(this), jM1841);
                        iM2399 = C0027.m2399(C0029.m2691(this), byteBuffer);
                    }
                    jM1841 += (long) iM2399;
                    i2 -= iM2399;
                }
                return;
            } finally {
                C0034.m3392(byteBuffer, iM6818);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j, long j2, DataSink dataSink) {
        long j3 = j2;
        C0020.m1391(j, j3, C0020.m1419(this));
        if (j3 == 0) {
            return;
        }
        long jM1841 = C0023.m1841(this) + j;
        ByteBuffer byteBufferM3408 = C0034.m3408((int) C0029.m2757(j3, 1048576L));
        while (j3 > 0) {
            int iM2757 = (int) C0029.m2757(j3, C0074.m6516(byteBufferM3408));
            C0034.m3392(byteBufferM3408, iM2757);
            synchronized (C0029.m2691(this)) {
                try {
                    C0024.m1933(C0029.m2691(this), jM1841);
                    int i = iM2757;
                    while (i > 0) {
                        int iM2399 = C0027.m2399(C0029.m2691(this), byteBufferM3408);
                        if (iM2399 >= 0) {
                            i -= iM2399;
                        } else {
                            throw new IOException(C0035.m3603(m2379(), 74, 26, 1486));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0020.m1437(byteBufferM3408);
            C0017.m841(dataSink, byteBufferM3408);
            C0020.m1405(byteBufferM3408);
            long j4 = iM2757;
            jM1841 += j4;
            j3 -= j4;
        }
    }

    public FileChannelDataSource(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j2, C0016.m625(m2379(), 6, 8, 3180)));
        }
        if (j2 >= 0) {
            this.a = fileChannel;
            this.b = j;
            this.c = j2;
            return;
        }
        throw new IndexOutOfBoundsException(C0039.m4094(j2, C0018.m1070(m2379(), 0, 6, 1863)));
    }
}
