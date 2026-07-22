package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class G5 extends P4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f249short = {1245, 1161, 2552, 2476, 2534, 1391, 1857, 1862, 1877, 1868, 1820, 1871, 1868, 1872, 1877, 1864, 1820, 1882, 1877, 1872, 1881, 1820, 1880, 1875, 1881, 1871, 1820, 1874, 1875, 1864, 1820, 1881, 1860, 1877, 1871, 1864, 1798, 1820};
    public RandomAccessFile a;
    public File b;
    public int c;
    public boolean d;
    public int e;
    public byte[] f;

    /* JADX INFO: renamed from: ۟ۥۧۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6934() {
        if (C0074.m6454() <= 0) {
            return f249short;
        }
        return null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArrM2507 = C0027.m2507(this);
        if (C0075.m6776(this, bArrM2507, 0, bArrM2507.length) == -1) {
            return -1;
        }
        return bArrM2507[0];
    }

    @Override // com.zfork.multiplatforms.android.bomb.P4
    public final void a(E1 e1) throws IOException {
        if (C0073.m6371(this)) {
            int iM3661 = C0036.m3661(this);
            int iM2135 = C0025.m2135(e1);
            if (iM3661 != iM2135) {
                C0027.m2400(this, iM2135);
                this.e = C0025.m2135(e1);
            }
        }
        C0017.m851(C0067.m5486(this), C0032.m3179(e1));
    }

    public final void b(int i) {
        int iM2448 = C0027.m2448(this);
        File fileM2594 = C0028.m2594(this);
        if (i != iM2448) {
            String strM2544 = C0028.m2544(fileM2594);
            String strM5942 = i >= 9 ? C0070.m5942(m6934(), 0, 2, 1267) : C0036.m3678(m6934(), 2, 3, 2518);
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0032.m3220(strM2544, 0, C0077.m7286(strM2544, C0078.m7427(m6934(), 5, 1, 1345))));
            C0077.m7290(sb, strM5942);
            C0021.m1551(sb, i + 1);
            fileM2594 = new File(C0068.m5536(sb));
        }
        if (C0033.m3343(fileM2594)) {
            C0111.m13119(C0067.m5486(this));
            this.a = new RandomAccessFile(fileM2594, C0069.m5807(m6934(), 6, 1, 1843));
        } else {
            StringBuilder sb2 = new StringBuilder(C0075.m6791(m6934(), 7, 31, 1852));
            C0036.m3741(sb2, fileM2594);
            throw new FileNotFoundException(C0068.m5536(sb2));
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFileM5486 = C0067.m5486(this);
        if (randomAccessFileM5486 != null) {
            C0111.m13119(randomAccessFileM5486);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return C0075.m6776(this, bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int iM5406 = C0067.m5406(C0067.m5486(this), bArr, i, i2);
        if ((iM5406 == i2 && iM5406 != -1) || !C0073.m6371(this)) {
            return iM5406;
        }
        C0027.m2400(this, C0036.m3661(this) + 1);
        this.e = C0036.m3661(this) + 1;
        if (iM5406 < 0) {
            iM5406 = 0;
        }
        int iM54062 = C0067.m5406(C0067.m5486(this), bArr, iM5406, i2 - iM5406);
        return iM54062 > 0 ? iM5406 + iM54062 : iM5406;
    }
}
