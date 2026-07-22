package com.android.apksig.internal.util;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.util.DataSink;
import com.android.apksig.zip.C0034;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class RandomAccessFileDataSink implements DataSink {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f119short = {3135, 3128, 3117, 3134, 3128, 3100, 3107, 3135, 3109, 3128, 3109, 3107, 3106, 3190, 3180, 2908, 2899, 2902, 2911, 2842, 2823, 2823, 2842, 2900, 2895, 2902, 2902, 2021, 2028, 2028, 2041, 2031, 2046, 1968, 1962, 2266, 2262, 2196, 2179, 2192, 2264, 2202, 2195, 2200, 2193, 2178, 2206, 2252, 2262, 1828, 1837, 1837, 1848, 1838, 1855, 1905, 1899};
    public final RandomAccessFile a;
    public final FileChannel b;
    public long c;

    public RandomAccessFileDataSink(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, 0L);
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2383() {
        if (C0018.m1064() > 0) {
            return f119short;
        }
        return null;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C0071.m6038(i, C0066.m4828(m2383(), 49, 8, 1867)));
        }
        if (i > bArr.length) {
            StringBuilder sb = new StringBuilder(C0017.m936(m2383(), 27, 8, 1930));
            C0021.m1551(sb, i);
            C0077.m7290(sb, C0038.m4022(m2383(), 35, 14, 2294));
            C0021.m1551(sb, bArr.length);
            throw new IndexOutOfBoundsException(C0068.m5536(sb));
        }
        if (i2 == 0) {
            return;
        }
        synchronized (C0018.m1036(this)) {
            C0017.m851(C0018.m1036(this), C0034.m3507(this));
            C0069.m5727(C0018.m1036(this), bArr, i, i2);
            this.c = C0034.m3507(this) + ((long) i2);
        }
    }

    public RandomAccessFileDataSink(RandomAccessFile randomAccessFile, long j) {
        if (randomAccessFile == null) {
            throw new NullPointerException(C0069.m5807(m2383(), 15, 12, 2874));
        }
        if (j < 0) {
            throw new IllegalArgumentException(C0039.m4094(j, C0024.m1945(m2383(), 0, 15, 3148)));
        }
        this.a = randomAccessFile;
        this.b = C0075.m6888(randomAccessFile);
        this.c = j;
    }

    public RandomAccessFile getFile() {
        return C0018.m1036(this);
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) {
        int iM5984 = C0071.m5984(byteBuffer);
        if (iM5984 == 0) {
            return;
        }
        synchronized (C0018.m1036(this)) {
            try {
                C0017.m851(C0018.m1036(this), C0034.m3507(this));
                while (C0111.m13127(byteBuffer)) {
                    C0018.m985(C0024.m2059(this), byteBuffer);
                }
                this.c = C0034.m3507(this) + ((long) iM5984);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
