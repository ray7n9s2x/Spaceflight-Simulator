package com.android.apksig.internal.asn1.ber;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
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
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class InputStreamBerDataValueReader implements BerDataValueReader {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f92short = {893, 890, 820, 809, 809, 820, 890, 865, 888, 888, 442, 399, 393, 462, 384, 411, 387, 396, 395, 412, 462, 410, 385, 385, 462, 386, 399, 412, 393, 395, 264, 302, 297, 306, 319, 317, 296, 313, 312, 380, 296, 317, 315, 380, 306, 297, 305, 318, 313, 302, 2049, 2086, 2092, 2093, 2094, 2081, 2086, 2081, 2108, 2093, 2149, 2084, 2093, 2086, 2095, 2108, 2080, 2152, 2091, 2087, 2086, 2108, 2093, 2086, 2108, 2107, 2152, 2108, 2087, 2087, 2152, 2084, 2087, 2086, 2095, 2869, 2835, 2836, 2831, 2818, 2816, 2837, 2820, 2821, 2881, 2824, 2831, 2821, 2820, 2823, 2824, 2831, 2824, 2837, 2820, 2892, 2829, 2820, 2831, 2822, 2837, 2825, 2881, 2818, 2830, 2831, 2837, 2820, 2831, 2837, 2834, 2907, 2881, 2876, 2942, 2917, 2920, 2937, 2927, 2876, 2926, 2937, 2941, 2936, 2608, 2580, 2574, 2574, 2580, 2579, 2586, 2653, 2577, 2584, 2579, 2586, 2569, 2581, 2418, 2389, 2397, 2392, 2385, 2384, 2324, 2368, 2395, 2324, 2374, 2385, 2389, 2384, 2324, 2384, 2389, 2368, 2389, 2324, 2370, 2389, 2392, 2369, 2385, 561, 536, 531, 538, 521, 533, 605, 521, 530, 530, 605, 529, 540, 527, 538, 536, 2942, 2904, 2911, 2884, 2889, 2891, 2910, 2895, 2894, 2826, 2886, 2895, 2884, 2893, 2910, 2882, 1289, 1312, 1323, 1314, 1329, 1325, 1381, 1329, 1322, 1322, 1381, 1321, 1316, 1335, 1314, 1312, 1407, 1381, 2577, 2643, 2632, 2629, 2644, 2626, 1712, 1687, 1693, 1692, 1695, 1680, 1687, 1680, 1677, 1692, 1748, 1685, 1692, 1687, 1694, 1677, 1681, 1753, 1690, 1686, 1687, 1677, 1692, 1687, 1677, 1674, 1753, 1677, 1686, 1686, 1753, 1685, 1686, 1687, 1694, 2983, 2945, 2950, 2973, 2960, 2962, 2951, 2966, 2967, 3027, 2970, 2973, 2967, 2966, 2965, 2970, 2973, 2970, 2951, 2966, 3038, 2975, 2966, 2973, 2964, 2951, 2971, 3027, 2960, 2972, 2973, 2951, 2966, 2973, 2951, 2944, 3017, 3027, 2889, 2827, 2832, 2845, 2828, 2842, 2889, 2843, 2828, 2824, 2829, 2393, 2431, 2424, 2403, 2414, 2412, 2425, 2408, 2409, 2349, 2409, 2408, 2411, 2404, 2403, 2404, 2425, 2408, 2336, 2401, 2408, 2403, 2410, 2425, 2405, 2349, 2414, 2402, 2403, 2425, 2408, 2403, 2425, 2430, 2359, 2349, 3306, 3240, 3251, 3262, 3247, 3257, 3306, 3256, 3247, 3243, 3246, 3302, 3306, 2986, 3047, 3043, 3065, 3065, 3043, 3044, 3053};
    public final InputStream a;

    /* JADX INFO: renamed from: com.android.apksig.internal.asn1.ber.InputStreamBerDataValueReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class RecordingInputStream extends InputStream {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f93short = {2354, 2366, 2349, 2356, 2416, 2349, 2362, 2348, 2362, 2347, 2431, 2353, 2352, 2347, 2431, 2348, 2346, 2351, 2351, 2352, 2349, 2347, 2362, 2363};
        public final InputStream a;
        public final ByteArrayOutputStream b = new ByteArrayOutputStream();

        /* JADX INFO: renamed from: ۟۠ۥۢۦ, reason: not valid java name and contains not printable characters */
        public static InputStream m1520(Object obj) {
            if (C0031.m3075() >= 0) {
                return ((RecordingInputStream) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
        public static short[] m1521() {
            if (C0111.m13165() <= 0) {
                return f93short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۤۤۤ, reason: contains not printable characters */
        public static ByteArrayOutputStream m1522(Object obj) {
            if (C0024.m2011() < 0) {
                return ((RecordingInputStream) obj).b;
            }
            return null;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            int iM3071 = C0031.m3071(m1520(this));
            if (iM3071 != -1) {
                C0070.m5921(m1522(this), iM3071);
            }
            return iM3071;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new IOException(C0066.m4828(m1521(), 0, 24, 2399));
        }

        public int getReadByteCount() {
            return C0069.m5716(m1522(this));
        }

        public byte[] getReadBytes() {
            return C0077.m7297(m1522(this));
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            InputStream inputStreamM1520 = m1520(this);
            if (j <= 0) {
                return C0016.m627(inputStreamM1520, j);
            }
            byte[] bArr = new byte[4096];
            int iM3212 = C0032.m3212(inputStreamM1520, bArr, 0, (int) C0029.m2757(4096, j));
            if (iM3212 > 0) {
                C0067.m5408(m1522(this), bArr, 0, iM3212);
            }
            if (iM3212 < 0) {
                return 0L;
            }
            return iM3212;
        }

        public RecordingInputStream(InputStream inputStream, AnonymousClass1 anonymousClass1) {
            this.a = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return super.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            int iM3621 = C0035.m3621(m1520(this), bArr);
            if (iM3621 > 0) {
                C0067.m5408(m1522(this), bArr, 0, iM3621);
            }
            return iM3621;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int iM3212 = C0032.m3212(m1520(this), bArr, i, i2);
            if (iM3212 > 0) {
                C0067.m5408(m1522(this), bArr, i, iM3212);
            }
            return iM3212;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m1515(Object obj) {
        if (C0020.m1385() < 0) {
            return ((RecordingInputStream) obj).getReadBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int m1516(Object obj) {
        if (C0019.m1311() == 0) {
            return ((RecordingInputStream) obj).getReadByteCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1517(Object obj) {
        if (C0065.m4647() >= 0) {
            return c((RecordingInputStream) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1518() {
        if (C0076.m6903() < 0) {
            return f92short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m1519(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((RecordingInputStream) obj).read();
        }
        return 0;
    }

    public static BerDataValue a(InputStream inputStream) throws BerDataValueFormatException {
        int iM1516;
        int i;
        int iM1517;
        int iM1519;
        RecordingInputStream recordingInputStream = new RecordingInputStream(inputStream, null);
        try {
            int iM15192 = m1519(recordingInputStream);
            if (iM15192 == -1) {
                return null;
            }
            byte b = (byte) iM15192;
            int iM4127 = C0039.m4127(b);
            if (iM4127 == 31) {
                iM4127 = 0;
                do {
                    iM1519 = m1519(recordingInputStream);
                    if (iM1519 == -1) {
                        throw new BerDataValueFormatException(C0031.m3047(m1518(), 30, 20, 348));
                    }
                    if (iM4127 > 16777215) {
                        throw new BerDataValueFormatException(C0068.m5544(m1518(), 10, 20, 494));
                    }
                    iM4127 = (iM4127 << 7) | (iM1519 & WorkQueueKt.MASK);
                } while ((iM1519 & 128) != 0);
            }
            int i2 = iM4127;
            int iM15193 = m1519(recordingInputStream);
            if (iM15193 == -1) {
                throw new BerDataValueFormatException(C0026.m2321(m1518(), 134, 14, 2685));
            }
            boolean zM13122 = C0111.m13122(b);
            if ((iM15193 & 128) == 0) {
                iM1517 = iM15193 & WorkQueueKt.MASK;
                iM1516 = m1516(recordingInputStream);
                C0016.m664(recordingInputStream, iM1517);
            } else if ((iM15193 & 255) != 128) {
                iM1517 = C0038.m4011(recordingInputStream, iM15193);
                iM1516 = m1516(recordingInputStream);
                C0016.m664(recordingInputStream, iM1517);
            } else {
                iM1516 = m1516(recordingInputStream);
                if (zM13122) {
                    iM1517 = m1517(recordingInputStream);
                } else {
                    int i3 = 0;
                    loop1: while (true) {
                        boolean z = false;
                        while (true) {
                            int iM3071 = C0031.m3071(recordingInputStream);
                            if (iM3071 == -1) {
                                throw new BerDataValueFormatException(C0025.m2086(C0017.m936(m1518(), 85, 38, 2913), i3, C0077.m7205(m1518(), 123, 11, 2844)));
                            }
                            i = i3 + 1;
                            if (i < 0) {
                                throw new BerDataValueFormatException(C0063.m4315(m1518(), 50, 35, 2120));
                            }
                            if (iM3071 == 0) {
                                if (z) {
                                    iM1517 = i3 - 1;
                                    break loop1;
                                }
                                z = true;
                                i3 = i;
                            }
                        }
                        i3 = i;
                    }
                }
            }
            byte[] bArrM1515 = m1515(recordingInputStream);
            return new BerDataValue(C0020.m1393(bArrM1515), C0067.m5482(bArrM1515, iM1516, iM1517), C0111.m13045(b), zM13122, i2);
        } catch (IOException e) {
            throw new BerDataValueFormatException(C0037.m3829(m1518(), 148, 25, 2356), e);
        }
    }

    public static int b(InputStream inputStream, int i) throws BerDataValueFormatException {
        int i2 = i & WorkQueueKt.MASK;
        if (i2 > 4) {
            throw new BerDataValueFormatException(C0025.m2086(C0034.m3431(m1518(), 205, 18, 1349), i2, C0068.m5544(m1518(), 223, 6, 2609)));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iM3071 = C0031.m3071(inputStream);
            if (iM3071 == -1) {
                throw new BerDataValueFormatException(C0026.m2321(m1518(), 189, 16, 2858));
            }
            if (i3 > 8388607) {
                throw new BerDataValueFormatException(C0031.m3047(m1518(), 173, 16, 637));
            }
            i3 = (i3 << 8) | (iM3071 & 255);
        }
        return i3;
    }

    public static void d(InputStream inputStream, int i) {
        int i2 = i;
        long j = 0;
        while (i2 > 0) {
            int iM627 = (int) C0016.m627(inputStream, i2);
            if (iM627 <= 0) {
                StringBuilder sb = new StringBuilder(C0026.m2321(m1518(), 313, 36, 2317));
                C0078.m7466(sb, j);
                C0077.m7290(sb, C0029.m2695(m1518(), 349, 13, 3274));
                C0021.m1551(sb, i2);
                C0077.m7290(sb, C0076.m6902(m1518(), 362, 8, 2954));
                throw new BerDataValueFormatException(C0068.m5536(sb));
            }
            i2 -= iM627;
            j += (long) iM627;
        }
    }

    @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
    public BerDataValue readDataValue() {
        return C0036.m3732(C0036.m3724(this));
    }

    public InputStreamBerDataValueReader(InputStream inputStream) {
        if (inputStream != null) {
            this.a = inputStream;
            return;
        }
        throw new NullPointerException(C0030.m2840(m1518(), 0, 10, 788));
    }

    public static int c(RecordingInputStream recordingInputStream) throws BerDataValueFormatException {
        int iM1516 = m1516(recordingInputStream);
        while (true) {
            BerDataValue berDataValueM3732 = C0036.m3732(recordingInputStream);
            if (berDataValueM3732 != null) {
                if (m1516(recordingInputStream) > 0) {
                    ByteBuffer byteBufferM2543 = C0028.m2543(berDataValueM3732);
                    if (C0071.m5984(byteBufferM2543) == 2 && C0077.m7224(byteBufferM2543, 0) == 0 && C0077.m7224(byteBufferM2543, 1) == 0) {
                        return (m1516(recordingInputStream) - iM1516) - 2;
                    }
                } else {
                    throw new BerDataValueFormatException(C0078.m7427(m1518(), 229, 35, 1785));
                }
            } else {
                StringBuilder sb = new StringBuilder(C0066.m4828(m1518(), 264, 38, 3059));
                C0021.m1551(sb, m1516(recordingInputStream) - iM1516);
                C0077.m7290(sb, C0028.m2609(m1518(), 302, 11, 2921));
                throw new BerDataValueFormatException(C0068.m5536(sb));
            }
        }
    }
}
