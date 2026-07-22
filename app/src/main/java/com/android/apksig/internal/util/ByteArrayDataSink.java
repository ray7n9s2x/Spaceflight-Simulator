package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.ReadableDataSink;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ByteArrayDataSink implements ReadableDataSink {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f111short = {2130, 2133, 2130, 2127, 2130, 2138, 2135, 2075, 2136, 2138, 2123, 2138, 2136, 2130, 2127, 2114, 2049, 2075, 1975, 2819, 2826, 2836, 2826, 2905, 2885, 2911, 2904, 2889, 2895, 2826, 2905, 2883, 2896, 2895, 2826, 2818, 2346, 2339, 2339, 2358, 2336, 2353, 2405, 2413, 2210, 2219, 2208, 2219, 2296, 2274, 2289, 2286, 2219, 2211, 1001, 992, 943, 950, 933, 946, 934, 940, 943, 951, 547, 569, 554, 565, 618, 624, 1366, 1375, 1375, 1354, 1372, 1357, 1283, 1305, 2326, 2337, 2357, 2353, 2349, 2358, 2337, 2336, 2404, 2343, 2341, 2356, 2341, 2343, 2349, 2352, 2365, 2404, 2352, 2347, 2347, 2404, 2344, 2341, 2358, 2339, 2337, 2430, 2404, 890, 886, 827, 823, 814, 876, 886, 868, 871, 866, 865, 866, 878, 869, 864, 866, 865, 2358, 2367, 2367, 2346, 2364, 2349, 2403, 2425, 1511, 1515, 1449, 1470, 1453, 1509, 1447, 1454, 1445, 1452, 1471, 1443, 1521, 1515};
    public byte[] a;
    public int b;

    /* JADX INFO: renamed from: com.android.apksig.internal.util.ByteArrayDataSink$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class SliceDataSource implements DataSource {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f112short = {2725, 2955, 2946, 2972, 2946, 3025, 3021, 3031, 3024, 3009, 3015, 2946, 3025, 3019, 3032, 3015, 2946, 2954, 493, 484, 484, 497, 487, 502, 418, 426, 2997, 3004, 2999, 3004, 3055, 3061, 3046, 3065, 3004, 2996, 1594, 1587, 1660, 1637, 1654, 1633, 1653, 1663, 1660, 1636, 912, 906, 921, 902, 985, 963, 3167, 3158, 3158, 3139, 3157, 3140, 3082, 3088};
        public final int a;
        public final int b;

        public /* synthetic */ SliceDataSource(ByteArrayDataSink byteArrayDataSink, int i, int i2, AnonymousClass1 anonymousClass1) {
            this(i, i2);
        }

        /* JADX INFO: renamed from: ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
        public static ByteArrayDataSink m2369(Object obj) {
            if (C0070.m5903() >= 0) {
                return ByteArrayDataSink.this;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢۡ۟۟, reason: not valid java name and contains not printable characters */
        public static short[] m2370() {
            if (C0035.m3569() < 0) {
                return f112short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡ۠ۤۢ, reason: not valid java name and contains not printable characters */
        public static void m2371(Object obj, long j, long j2) {
            if (C0017.m846() > 0) {
                ((SliceDataSource) obj).a(j, j2);
            }
        }

        /* JADX INFO: renamed from: ۣۢ۠ۦ, reason: not valid java name and contains not printable characters */
        public static int m2372(Object obj) {
            if (C0072.m6216() > 0) {
                return ((SliceDataSource) obj).a;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
        public static int m2373(Object obj) {
            if (C0036.m3653() < 0) {
                return ((SliceDataSource) obj).b;
            }
            return 0;
        }

        @Override // com.android.apksig.util.DataSource
        public void copyTo(long j, int i, ByteBuffer byteBuffer) {
            m2371(this, j, i);
            C0031.m3062(byteBuffer, C0074.m6540(m2369(this)), (int) (((long) m2372(this)) + j), i);
        }

        @Override // com.android.apksig.util.DataSource
        public ByteBuffer getByteBuffer(long j, int i) {
            m2371(this, j, i);
            return C0071.m6043(C0067.m5482(C0074.m6540(m2369(this)), (int) (((long) m2372(this)) + j), i));
        }

        public SliceDataSource(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final void a(long j, long j2) {
            if (j < 0) {
                throw new IndexOutOfBoundsException(C0039.m4094(j, C0066.m4828(m2370(), 52, 8, 3120)));
            }
            if (j2 < 0) {
                throw new IndexOutOfBoundsException(C0039.m4094(j2, C0078.m7427(m2370(), 46, 6, 995)));
            }
            int iM2373 = m2373(this);
            long j3 = iM2373;
            String strM3431 = C0034.m3431(m2370(), 0, 1, 2700);
            String strM3330 = C0033.m3330(m2370(), 1, 17, 2978);
            String strM13097 = C0111.m13097(m2370(), 18, 8, 386);
            if (j > j3) {
                StringBuilder sb = new StringBuilder(strM13097);
                C0078.m7466(sb, j);
                C0077.m7290(sb, strM3330);
                C0021.m1551(sb, iM2373);
                C0077.m7290(sb, strM3431);
                throw new IndexOutOfBoundsException(C0068.m5536(sb));
            }
            long j4 = j + j2;
            String strM936 = C0017.m936(m2370(), 26, 10, 2972);
            if (j4 < j) {
                StringBuilder sb2 = new StringBuilder(strM13097);
                C0078.m7466(sb2, j);
                C0077.m7290(sb2, strM936);
                C0078.m7466(sb2, j2);
                C0077.m7290(sb2, C0039.m4066(m2370(), 36, 10, 1555));
                throw new IndexOutOfBoundsException(C0068.m5536(sb2));
            }
            if (j4 <= iM2373) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(strM13097);
            C0078.m7466(sb3, j);
            C0077.m7290(sb3, strM936);
            C0078.m7466(sb3, j2);
            C0077.m7290(sb3, strM3330);
            C0021.m1551(sb3, iM2373);
            C0077.m7290(sb3, strM3431);
            throw new IndexOutOfBoundsException(C0068.m5536(sb3));
        }

        @Override // com.android.apksig.util.DataSource
        public long size() {
            return m2373(this);
        }

        @Override // com.android.apksig.util.DataSource
        public void feed(long j, long j2, DataSink dataSink) {
            m2371(this, j, j2);
            C0037.m3874(dataSink, C0074.m6540(m2369(this)), (int) (((long) m2372(this)) + j), (int) j2);
        }

        @Override // com.android.apksig.util.DataSource
        public DataSource slice(long j, long j2) {
            m2371(this, j, j2);
            return m2369(this).new SliceDataSource((int) (((long) m2372(this)) + j), (int) j2);
        }
    }

    public ByteArrayDataSink() {
        this(65536);
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m2368() {
        if (C0078.m7450() >= 0) {
            return f111short;
        }
        return null;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i, int i2) {
        String strM4757 = C0065.m4757(m2368(), 124, 8, 2393);
        if (i < 0) {
            throw new IndexOutOfBoundsException(C0071.m6038(i, strM4757));
        }
        if (i > bArr.length) {
            StringBuilder sb = new StringBuilder(strM4757);
            C0021.m1551(sb, i);
            C0077.m7290(sb, C0067.m5418(m2368(), 132, 14, 1483));
            C0021.m1551(sb, bArr.length);
            throw new IndexOutOfBoundsException(C0068.m5536(sb));
        }
        if (i2 == 0) {
            return;
        }
        C0027.m2494(this, i2);
        C0027.m2519(bArr, i, C0030.m2903(this), C0033.m3273(this), i2);
        this.b = C0033.m3273(this) + i2;
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j, int i, ByteBuffer byteBuffer) {
        C0017.m824(this, j, i);
        C0031.m3062(byteBuffer, C0030.m2903(this), (int) j, i);
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j, int i) {
        C0017.m824(this, j, i);
        return C0071.m6043(C0067.m5482(C0030.m2903(this), (int) j, i));
    }

    public ByteArrayDataSink(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C0071.m6038(i, C0022.m1728(m2368(), 0, 18, 2107)));
        }
        this.a = new byte[i];
    }

    public final void a(long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j, C0069.m5807(m2368(), 70, 8, 1337)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j2, C0023.m1904(m2368(), 64, 6, 592)));
        }
        int iM3273 = C0033.m3273(this);
        long j3 = iM3273;
        String strM2404 = C0027.m2404(m2368(), 18, 1, 1950);
        String strM7205 = C0077.m7205(m2368(), 19, 17, 2858);
        String strM3047 = C0031.m3047(m2368(), 36, 8, 2373);
        if (j > j3) {
            StringBuilder sb = new StringBuilder(strM3047);
            C0078.m7466(sb, j);
            C0077.m7290(sb, strM7205);
            C0021.m1551(sb, C0033.m3273(this));
            C0077.m7290(sb, strM2404);
            throw new IndexOutOfBoundsException(C0068.m5536(sb));
        }
        long j4 = j + j2;
        String strM936 = C0017.m936(m2368(), 44, 10, 2187);
        if (j4 < j) {
            StringBuilder sb2 = new StringBuilder(strM3047);
            C0078.m7466(sb2, j);
            C0077.m7290(sb2, strM936);
            C0078.m7466(sb2, j2);
            C0077.m7290(sb2, C0069.m5807(m2368(), 54, 10, 960));
            throw new IndexOutOfBoundsException(C0068.m5536(sb2));
        }
        if (j4 <= iM3273) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(strM3047);
        C0078.m7466(sb3, j);
        C0077.m7290(sb3, strM936);
        C0078.m7466(sb3, j2);
        C0077.m7290(sb3, strM7205);
        C0021.m1551(sb3, C0033.m3273(this));
        C0077.m7290(sb3, strM2404);
        throw new IndexOutOfBoundsException(C0068.m5536(sb3));
    }

    public final void b(int i) {
        if (i <= 0) {
            return;
        }
        long jM3273 = ((long) C0033.m3273(this)) + ((long) i);
        byte[] bArrM2903 = C0030.m2903(this);
        if (jM3273 <= bArrM2903.length) {
            return;
        }
        if (jM3273 <= 2147483647L) {
            this.a = C0078.m7349(C0030.m2903(this), (int) C0024.m2026(jM3273, (int) C0029.m2757(((long) bArrM2903.length) * 2, 2147483647L)));
        } else {
            StringBuilder sb = new StringBuilder(C0028.m2609(m2368(), 78, 29, 2372));
            C0078.m7466(sb, jM3273);
            C0077.m7290(sb, C0034.m3431(m2368(), 107, 17, 854));
            throw new IOException(C0068.m5536(sb));
        }
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return C0033.m3273(this);
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j, long j2, DataSink dataSink) {
        C0017.m824(this, j, j2);
        C0037.m3874(dataSink, C0030.m2903(this), (int) j, (int) j2);
    }

    @Override // com.android.apksig.util.DataSource
    public DataSource slice(long j, long j2) {
        C0017.m824(this, j, j2);
        return new SliceDataSource(this, (int) j, (int) j2, null);
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) {
        if (C0111.m13127(byteBuffer)) {
            if (C0069.m5719(byteBuffer)) {
                C0063.m4420(this, C0027.m2445(byteBuffer), C0035.m3629(byteBuffer) + C0020.m1414(byteBuffer), C0071.m5984(byteBuffer));
                C0037.m3886(byteBuffer, C0075.m6818(byteBuffer));
                return;
            }
            C0027.m2494(this, C0071.m5984(byteBuffer));
            int iM3151 = C0032.m3151(C0071.m5984(byteBuffer), 65536);
            byte[] bArr = new byte[iM3151];
            while (C0111.m13127(byteBuffer)) {
                int iM31512 = C0032.m3151(C0071.m5984(byteBuffer), iM3151);
                C0111.m13057(byteBuffer, bArr, 0, iM31512);
                C0027.m2519(bArr, 0, C0030.m2903(this), C0033.m3273(this), iM31512);
                this.b = C0033.m3273(this) + iM31512;
            }
        }
    }
}
