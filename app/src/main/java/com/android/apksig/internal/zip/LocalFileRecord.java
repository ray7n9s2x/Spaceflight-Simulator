package com.android.apksig.internal.zip;

import androidx.core.app.FrameMetricsAggregator;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteBufferSink;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
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
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class LocalFileRecord {
    public final String a;
    public final int b;
    public final ByteBuffer c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final boolean h;
    public final long i;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f127short = {768, 780, 879, 872, 780, 863, 856, 845, 862, 856, 790, 780, 2684, 2672, 2579, 2580, 2666, 2672, 434, 444, 464, 474, 468, 422, 444, 1338, 1281, 1292, 1280, 1282, 1311, 1309, 1290, 1308, 1308, 1290, 1291, 1359, 1308, 1286, 1301, 1290, 1359, 1282, 1286, 1308, 1282, 1294, 1307, 1292, 1287, 1359, 1293, 1290, 1307, 1304, 1290, 1290, 1281, 1359, 1315, 1280, 1292, 1294, 1283, 1359, 1321, 1286, 1283, 1290, 1359, 1319, 1290, 1294, 1291, 1290, 1309, 1359, 1294, 1281, 1291, 1359, 1324, 1290, 1281, 1307, 1309, 1294, 1283, 1359, 1323, 1286, 1309, 1290, 1292, 1307, 1280, 1309, 1302, 1359, 1289, 1280, 1309, 1359, 1290, 1281, 1307, 1309, 1302, 1359, 1302, 1338, 1336, 1317, 1319, 1328, 1318, 1318, 1328, 1329, 1397, 1318, 1340, 1327, 1328, 1397, 1336, 1340, 1318, 1336, 1332, 1313, 1334, 1341, 1397, 1335, 1328, 1313, 1314, 1328, 1328, 1339, 1397, 1305, 1338, 1334, 1332, 1337, 1397, 1299, 1340, 1337, 1328, 1397, 1309, 1328, 1332, 1329, 1328, 1319, 1397, 1332, 1339, 1329, 1397, 1302, 1328, 1339, 1313, 1319, 1332, 1337, 1397, 1297, 1340, 1319, 1328, 1334, 1313, 1338, 1319, 1324, 1397, 1331, 1338, 1319, 1397, 1328, 1339, 1313, 1319, 1324, 1397, 918, 903, 918, 1016, 998, 999, 1013, 952, 956, 934, 952, 948, 929, 950, 957, 1013, 951, 944, 929, 930, 944, 944, 955, 1013, 921, 954, 950, 948, 953, 1013, 915, 956, 953, 944, 1013, 925, 944, 948, 945, 944, 935, 1013, 948, 955, 945, 1013, 918, 944, 955, 929, 935, 948, 953, 1013, 913, 956, 935, 944, 950, 929, 954, 935, 940, 1013, 947, 954, 935, 1013, 944, 955, 929, 935, 940, 1013, 3034, 2965, 2956, 2975, 2952, 2966, 2971, 2954, 2953, 3034, 2957, 2963, 2958, 2962, 3034, 3001, 2975, 2964, 2958, 2952, 2971, 2966, 3034, 3006, 2963, 2952, 2975, 2969, 2958, 2965, 2952, 2947, 3028, 3034, 3006, 2971, 2958, 2971, 3034, 3006, 2975, 2953, 2969, 2952, 2963, 2954, 2958, 2965, 2952, 3034, 2975, 2964, 2974, 3008, 3034, 2784, 2757, 2768, 2757, 2692, 2784, 2753, 2775, 2759, 2774, 2765, 2772, 2768, 2763, 2774, 2692, 2763, 2754, 2692, 2241, 2274, 2286, 2284, 2273, 2221, 2251, 2276, 2273, 2280, 2221, 2245, 2280, 2284, 2281, 2280, 2303, 2221, 2281, 2284, 2297, 2284, 2221, 2274, 2283, 2221, 1171, 1244, 1221, 1238, 1217, 1247, 1234, 1219, 1216, 1171, 1220, 1242, 1223, 1243, 1171, 1264, 1238, 1245, 1223, 1217, 1234, 1247, 1171, 1271, 1242, 1217, 1238, 1232, 1223, 1244, 1217, 1226, 1181, 1171, 1279, 1269, 1275, 1171, 1239, 1234, 1223, 1234, 1171, 1216, 1223, 1234, 1217, 1223, 1161, 1171, 600, 596, 568, 562, 572, 596, 528, 533, 512, 533, 596, 529, 538, 528, 590, 596, 1436, 1459, 1471, 1463, 1522, 1471, 1467, 1441, 1471, 1459, 1446, 1457, 1466, 1522, 1456, 1463, 1446, 1445, 1463, 1463, 1468, 1522, 1438, 1469, 1457, 1459, 1470, 1522, 1428, 1467, 1470, 1463, 1522, 1434, 1463, 1459, 1462, 1463, 1440, 1522, 1459, 1468, 1462, 1522, 1425, 1463, 1468, 1446, 1440, 1459, 1470, 1522, 1430, 1467, 1440, 1463, 1457, 1446, 1469, 1440, 1451, 1532, 1522, 1438, 1428, 1434, 1512, 1522, 1520, 1411, 1421, 1409, 1506, 1509, 1435, 1409, 1411, 2026, 3042, 3021, 3009, 3017, 2956, 3009, 3013, 3039, 3009, 3021, 3032, 3023, 3012, 2956, 3022, 3017, 3032, 3035, 3017, 3017, 3010, 2956, 3040, 3011, 3023, 3021, 3008, 2956, 3050, 3013, 3008, 3017, 2956, 3044, 3017, 3021, 3016, 3017, 3038, 2956, 3021, 3010, 3016, 2956, 3055, 3017, 3010, 3032, 3038, 3021, 3008, 2956, 3048, 3013, 3038, 3017, 3023, 3032, 3011, 3038, 3029, 2956, 3018, 3011, 3038, 2956, 3017, 3010, 3032, 3038, 3029, 3209, 3275, 3280, 3293, 3276, 3290, 3205, 3209, 3306, 3309, 3219, 3209, 1860, 1798, 1821, 1808, 1793, 1815, 618, 591, 602, 591, 526, 618, 587, 605, 589, 604, 583, 606, 602, 577, 604, 526, 606, 604, 587, 605, 587, 576, 589, 587, 526, 579, 583, 605, 579, 591, 602, 589, 582, 526, 588, 587, 602, 601, 587, 587, 576, 526, 610, 577, 589, 591, 578, 526, 616, 583, 578, 587, 526, 614, 587, 591, 586, 587, 604, 526, 591, 576, 586, 526, 621, 587, 576, 602, 604, 591, 578, 526, 618, 583, 604, 587, 589, 602, 577, 604, 599, 526, 584, 577, 604, 526, 587, 576, 602, 604, 599, 526, 2670, 2639, 2644, 2560, 2625, 2560, 2668, 2639, 2627, 2625, 2636, 2560, 2662, 2633, 2636, 2629, 2560, 2664, 2629, 2625, 2628, 2629, 2642, 2560, 2642, 2629, 2627, 2639, 2642, 2628, 2560, 2630, 2639, 2642, 2560, 2629, 2638, 2644, 2642, 2649, 2560, 755, 765, 654, 692, 698, 691, 700, 681, 680, 687, 696, 743, 765, 749, 677, 622, 585, 577, 580, 589, 588, 520, 604, 583, 520, 602, 589, 585, 588, 520, 612, 583, 587, 585, 580, 520, 622, 577, 580, 589, 520, 608, 589, 585, 588, 589, 602, 520, 583, 590, 520, 470, 501, 505, 507, 502, 442, 476, 499, 502, 511, 442, 466, 511, 507, 510, 511, 488, 442, 501, 508, 442, 404, 465, 460, 448, 465, 474, 464, 455, 404, 470, 465, 461, 475, 474, 464, 404, 455, 448, 469, 454, 448, 404, 475, 466, 404, 503, 465, 474, 448, 454, 469, 472, 404, 496, 477, 454, 465, 471, 448, 475, 454, 461, 410, 404, 504, 498, 508, 404, 465, 474, 464, 398, 404, 3249, 3301, 3326, 3326, 3249, 3325, 3312, 3299, 3318, 3316, 3243, 3249, 838, 857, 837, 780, 790, 1886, 1874, 1822, 1819, 1823, 1819, 1798, 1864, 1874, 2838, 2867, 2854, 2867, 2930, 2877, 2868, 2930, 2871, 2876, 2854, 2848, 2859, 2930, 2848, 2843, 2832, 2829, 2821, 2832, 2838, 2817, 2832, 2833, 2901, 2822, 2844, 2831, 2832, 2901, 2842, 2835, 2901, 2816, 2843, 2838, 2842, 2840, 2821, 2823, 2832, 2822, 2822, 2832, 2833, 2901, 2833, 2836, 2817, 2836, 2901, 2842, 2835, 2901, 643, 653, 744, 725, 733, 712, 718, 729, 712, 713, 663, 653, 3174, 3108, 3135, 3122, 3107, 3125, 3178, 3174, 3111, 3109, 3122, 3123, 3111, 3114, 3196, 3174, 1970, 2032, 2027, 2022, 2039, 2017, 1871, 1794, 1806, 1795, 1801, 1792, 1821, 1794, 1802, 1803, 1813, 1842, 1850, 1855, 1846, 1847, 1907, 1831, 1852, 1907, 1825, 1846, 1842, 1847, 1907, 1847, 1842, 1831, 
    1842, 1907, 1852, 1845, 1907, 2490, 2486, 2484, 2473, 2475, 2492, 2474, 2474, 2492, 2493, 2904, 2883, 2894, 2882, 2880, 2909, 2911, 2888, 2910, 2910, 2888, 2889, 3053, 2984, 2979, 3001, 3007, 2996, 3053};
    public static final ByteBuffer j = C0035.m3516(0);

    /* JADX INFO: renamed from: com.android.apksig.internal.zip.LocalFileRecord$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class InflateSinkAdapter implements DataSink, Closeable {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f128short = {919, 952, 955, 935, 945, 944, 864, 839, 847, 842, 835, 834, 774, 850, 841, 774, 847, 840, 832, 842, 839, 850, 835, 774, 834, 839, 850, 839, 1933, 1954, 1953, 1981, 1963, 1962};
        public final DataSink a;
        public Inflater b = new Inflater(true);
        public byte[] c;
        public byte[] d;
        public long e;
        public boolean f;

        /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
        public static long m2678(Object obj) {
            if (C0029.m2791() >= 0) {
                return ((InflateSinkAdapter) obj).e;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
        public static DataSink m2679(Object obj) {
            if (C0074.m6454() < 0) {
                return ((InflateSinkAdapter) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۦۡۤ, reason: not valid java name and contains not printable characters */
        public static boolean m2680(Object obj) {
            if (C0065.m4647() >= 0) {
                return ((InflateSinkAdapter) obj).f;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۟ۧۧۤۦ, reason: not valid java name and contains not printable characters */
        public static byte[] m2681(Object obj) {
            if (C0026.m2298() < 0) {
                return ((InflateSinkAdapter) obj).d;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡ۠۟ۢ, reason: not valid java name and contains not printable characters */
        public static Inflater m2682(Object obj) {
            if (C0075.m6893() >= 0) {
                return ((InflateSinkAdapter) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢ۟ۢۤ, reason: not valid java name and contains not printable characters */
        public static void m2683(Object obj, Object obj2, int i, int i2) throws IOException {
            if (C0039.m4109() > 0) {
                ((InflateSinkAdapter) obj).consume((byte[]) obj2, i, i2);
            }
        }

        /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
        public static short[] m2684() {
            if (C0033.m3358() <= 0) {
                return f128short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
        public static byte[] m2685(Object obj) {
            if (C0070.m5903() >= 0) {
                return ((InflateSinkAdapter) obj).c;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f = true;
            this.d = null;
            this.c = null;
            Inflater inflaterM2682 = m2682(this);
            if (inflaterM2682 != null) {
                C0078.m7449(inflaterM2682);
                this.b = null;
            }
        }

        @Override // com.android.apksig.util.DataSink
        public void consume(ByteBuffer byteBuffer) throws IOException {
            if (m2680(this)) {
                throw new IllegalStateException(C0032.m3209(m2684(), 0, 6, 980));
            }
            if (C0069.m5719(byteBuffer)) {
                m2683(this, C0027.m2445(byteBuffer), C0035.m3629(byteBuffer) + C0020.m1414(byteBuffer), C0071.m5984(byteBuffer));
                C0037.m3886(byteBuffer, C0075.m6818(byteBuffer));
                return;
            }
            if (m2681(this) == null) {
                this.d = new byte[65536];
            }
            while (C0111.m13127(byteBuffer)) {
                int iM3151 = C0032.m3151(C0071.m5984(byteBuffer), m2681(this).length);
                C0111.m13057(byteBuffer, m2681(this), 0, iM3151);
                m2683(this, m2681(this), 0, iM3151);
            }
        }

        public long getOutputByteCount() {
            return m2678(this);
        }

        public InflateSinkAdapter(DataSink dataSink, AnonymousClass1 anonymousClass1) {
            this.a = dataSink;
        }

        @Override // com.android.apksig.util.DataSink
        public void consume(byte[] bArr, int i, int i2) throws IOException {
            if (!m2680(this)) {
                C0018.m1009(m2682(this), bArr, i, i2);
                if (m2685(this) == null) {
                    this.c = new byte[65536];
                }
                while (!C0031.m3067(m2682(this))) {
                    try {
                        int iM5650 = C0068.m5650(m2682(this), m2685(this));
                        if (iM5650 == 0) {
                            return;
                        }
                        C0037.m3874(m2679(this), m2685(this), 0, iM5650);
                        this.e = m2678(this) + ((long) iM5650);
                    } catch (DataFormatException e) {
                        throw new IOException(C0020.m1443(m2684(), 6, 22, 806), e);
                    }
                }
                return;
            }
            throw new IllegalStateException(C0069.m5807(m2684(), 28, 6, 1998));
        }
    }

    public static LocalFileRecord getRecord(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j2) {
        return C0069.m5816(dataSource, centralDirectoryRecord, j2, true, true);
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m2675() {
        if (C0070.m5903() >= 0) {
            return f127short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static void m2676(Object obj) {
        if (C0067.m5468() <= 0) {
            ((InflateSinkAdapter) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۦۣ۟ۧ, reason: contains not printable characters */
    public static long m2677(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((InflateSinkAdapter) obj).getOutputByteCount();
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5 A[Catch: IOException -> 0x00fd, TryCatch #3 {IOException -> 0x00fd, blocks: (B:29:0x0100, B:22:0x00cd, B:24:0x00d5, B:25:0x00fc, B:28:0x00ff, B:4:0x0042, B:8:0x0060, B:21:0x00cc, B:20:0x00c9, B:5:0x004a, B:12:0x0067, B:13:0x00c0, B:16:0x00c3), top: B:42:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff A[Catch: IOException -> 0x00fd, TryCatch #3 {IOException -> 0x00fd, blocks: (B:29:0x0100, B:22:0x00cd, B:24:0x00d5, B:25:0x00fc, B:28:0x00ff, B:4:0x0042, B:8:0x0060, B:21:0x00cc, B:20:0x00c9, B:5:0x004a, B:12:0x0067, B:13:0x00c0, B:16:0x00c3), top: B:42:0x0040, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void outputUncompressedData(com.android.apksig.util.DataSource r67, com.android.apksig.util.DataSink r68) throws java.io.IOException, com.android.apksig.zip.ZipFormatException {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.internal.zip.LocalFileRecord.outputUncompressedData(com.android.apksig.util.DataSource, com.android.apksig.util.DataSink):void");
    }

    public static LocalFileRecord a(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j2, boolean z, boolean z2) throws IOException, ZipFormatException {
        long j3;
        DataSource dataSource2;
        ByteBuffer byteBufferM2986;
        String strM6387 = C0073.m6387(centralDirectoryRecord);
        int iM6882 = C0075.m6882(centralDirectoryRecord);
        int i = iM6882 + 30;
        long jM3759 = C0036.m3759(centralDirectoryRecord);
        long j4 = ((long) i) + jM3759;
        String strM1443 = C0020.m1443(m2675(), 0, 12, 812);
        if (j4 > j2) {
            StringBuilder sb = new StringBuilder(C0077.m7205(m2675(), 784, 21, 410));
            C0077.m7290(sb, strM6387);
            C0077.m7290(sb, C0020.m1443(m2675(), 805, 53, 436));
            C0078.m7466(sb, j4);
            C0077.m7290(sb, strM1443);
            C0078.m7466(sb, j2);
            throw new ZipFormatException(C0068.m5536(sb));
        }
        try {
            ByteBuffer byteBufferM6568 = C0074.m6568(dataSource, jM3759, i);
            ByteOrder byteOrderM6217 = C0072.m6217();
            C0064.m4604(byteBufferM6568, byteOrderM6217);
            int iM4566 = C0064.m4566(byteBufferM6568);
            if (iM4566 != 67324752) {
                StringBuilder sb2 = new StringBuilder(C0077.m7205(m2675(), 692, 41, 2592));
                C0077.m7290(sb2, strM6387);
                C0077.m7290(sb2, C0019.m1189(m2675(), 733, 15, 733));
                C0077.m7290(sb2, C0029.m2713(((long) iM4566) & 4294967295L));
                throw new ZipFormatException(C0068.m5536(sb2));
            }
            int iM4059 = C0039.m4059(byteBufferM6568, 6) & 8;
            boolean z3 = iM4059 != 0;
            boolean z4 = (C0026.m2316(centralDirectoryRecord) & 8) != 0;
            String strM2695 = C0029.m2695(m2675(), 12, 6, 2640);
            String strM4022 = C0038.m4022(m2675(), 18, 7, 412);
            if (z3 != z4) {
                StringBuilder sb3 = new StringBuilder(C0031.m3047(m2675(), 600, 92, 558));
                C0077.m7290(sb3, strM6387);
                C0077.m7290(sb3, strM4022);
                C0077.m7179(sb3, z3);
                C0077.m7290(sb3, strM2695);
                C0077.m7179(sb3, z4);
                throw new ZipFormatException(C0068.m5536(sb3));
            }
            boolean z5 = z3;
            long jM7192 = C0077.m7192(centralDirectoryRecord);
            long jM2711 = C0029.m2711(centralDirectoryRecord);
            long jM6320 = C0073.m6320(centralDirectoryRecord);
            if (z5) {
                j3 = jM3759;
            } else {
                j3 = jM3759;
                long jM7195 = C0077.m7195(byteBufferM6568, 14);
                if (jM7195 != jM7192) {
                    StringBuilder sb4 = new StringBuilder(C0039.m4066(m2675(), 193, 74, 981));
                    C0077.m7290(sb4, strM6387);
                    C0077.m7290(sb4, strM4022);
                    C0078.m7466(sb4, jM7195);
                    C0077.m7290(sb4, strM2695);
                    C0078.m7466(sb4, jM7192);
                    throw new ZipFormatException(C0068.m5536(sb4));
                }
                long jM71952 = C0077.m7195(byteBufferM6568, 18);
                if (jM71952 != jM2711) {
                    StringBuilder sb5 = new StringBuilder(C0037.m3829(m2675(), 110, 83, 1365));
                    C0077.m7290(sb5, strM6387);
                    C0077.m7290(sb5, strM4022);
                    C0078.m7466(sb5, jM71952);
                    C0077.m7290(sb5, strM2695);
                    C0078.m7466(sb5, jM2711);
                    throw new ZipFormatException(C0068.m5536(sb5));
                }
                long jM71953 = C0077.m7195(byteBufferM6568, 22);
                if (jM71953 != jM6320) {
                    StringBuilder sb6 = new StringBuilder(C0025.m2151(m2675(), 25, 85, 1391));
                    C0077.m7290(sb6, strM6387);
                    C0077.m7290(sb6, strM4022);
                    C0078.m7466(sb6, jM71953);
                    C0077.m7290(sb6, strM2695);
                    C0078.m7466(sb6, jM6320);
                    throw new ZipFormatException(C0068.m5536(sb6));
                }
            }
            int iM5479 = C0067.m5479(byteBufferM6568, 26);
            if (iM5479 > iM6882) {
                StringBuilder sb7 = new StringBuilder(C0069.m5807(m2675(), FrameMetricsAggregator.EVERY_DURATION, 71, 2988));
                C0077.m7290(sb7, strM6387);
                C0077.m7290(sb7, strM4022);
                C0021.m1551(sb7, iM5479);
                C0077.m7290(sb7, C0063.m4315(m2675(), 582, 12, 3241));
                C0021.m1551(sb7, iM6882);
                C0077.m7290(sb7, C0035.m3603(m2675(), 594, 6, 1892));
                throw new ZipFormatException(C0068.m5536(sb7));
            }
            String strM1572 = C0021.m1572(byteBufferM6568, 30, iM5479);
            if (!C0070.m5838(strM6387, strM1572)) {
                StringBuilder sb8 = new StringBuilder(C0022.m1728(m2675(), 433, 69, 1490));
                C0077.m7290(sb8, strM1572);
                C0077.m7290(sb8, C0029.m2695(m2675(), 502, 8, 1441));
                C0077.m7290(sb8, strM6387);
                C0077.m7290(sb8, C0065.m4757(m2675(), 510, 1, 1992));
                throw new ZipFormatException(C0068.m5536(sb8));
            }
            int iM54792 = C0067.m5479(byteBufferM6568, 28);
            long j5 = j3 + 30 + ((long) iM5479);
            long j6 = ((long) iM54792) + j5;
            boolean z6 = C0077.m7235(centralDirectoryRecord) != 0;
            long j7 = z6 ? jM2711 : jM6320;
            long j8 = j6 + j7;
            if (j8 > j2) {
                StringBuilder sb9 = new StringBuilder(C0035.m3603(m2675(), 341, 26, 2189));
                C0077.m7290(sb9, strM6387);
                C0077.m7290(sb9, C0071.m5991(m2675(), 367, 50, 1203));
                C0078.m7466(sb9, j6);
                C0077.m7290(sb9, C0071.m5991(m2675(), 417, 16, 628));
                C0078.m7466(sb9, j8);
                C0077.m7290(sb9, strM1443);
                C0078.m7466(sb9, j2);
                throw new ZipFormatException(C0068.m5536(sb9));
            }
            if (!z || iM54792 <= 0) {
                dataSource2 = dataSource;
                byteBufferM2986 = C0031.m2986();
            } else {
                dataSource2 = dataSource;
                byteBufferM2986 = C0074.m6568(dataSource2, j5, iM54792);
            }
            if (z2 && iM4059 != 0) {
                long j9 = 12 + j8;
                String strM6116 = C0072.m6116(m2675(), 267, 55, 3066);
                String strM5942 = C0070.m5942(m2675(), 322, 19, 2724);
                if (j9 > j2) {
                    StringBuilder sb10 = new StringBuilder(strM5942);
                    C0077.m7290(sb10, strM6387);
                    C0077.m7290(sb10, strM6116);
                    C0078.m7466(sb10, j8);
                    C0077.m7290(sb10, strM1443);
                    C0078.m7466(sb10, j2);
                    throw new ZipFormatException(C0068.m5536(sb10));
                }
                ByteBuffer byteBufferM65682 = C0074.m6568(dataSource2, j8, 4);
                C0064.m4604(byteBufferM65682, byteOrderM6217);
                if (C0064.m4566(byteBufferM65682) == 134695760) {
                    j9 = 16 + j8;
                    if (j9 > j2) {
                        StringBuilder sb11 = new StringBuilder(strM5942);
                        C0077.m7290(sb11, strM6387);
                        C0077.m7290(sb11, strM6116);
                        C0078.m7466(sb11, j8);
                        C0077.m7290(sb11, strM1443);
                        C0078.m7466(sb11, j2);
                        throw new ZipFormatException(C0068.m5536(sb11));
                    }
                }
                j8 = j9;
            }
            return new LocalFileRecord(strM6387, iM6882, byteBufferM2986, j3, j8 - j3, iM5479 + 30 + iM54792, j7, z6, jM6320);
        } catch (IOException e) {
            throw new IOException(C0032.m3116(C0024.m1945(m2675(), 748, 36, 552), strM6387), e);
        }
    }

    public static long outputRecordWithDeflateCompressedData(String str, int i, int i2, byte[] bArr, long j2, long j3, DataSink dataSink) {
        byte[] bArrM2092 = C0025.m2092(str, C0018.m1069());
        ByteBuffer byteBufferM3516 = C0035.m3516(bArrM2092.length + 30);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0038.m4018(byteBufferM3516, 67324752);
        C0019.m1183(byteBufferM3516, 20);
        C0069.m5783(byteBufferM3516, ZipUtils.GP_FLAG_EFS);
        C0069.m5783(byteBufferM3516, (short) 8);
        C0019.m1183(byteBufferM3516, i);
        C0019.m1183(byteBufferM3516, i2);
        C0037.m3845(byteBufferM3516, j2);
        C0037.m3845(byteBufferM3516, bArr.length);
        C0037.m3845(byteBufferM3516, j3);
        C0019.m1183(byteBufferM3516, bArrM2092.length);
        C0019.m1183(byteBufferM3516, 0);
        C0068.m5569(byteBufferM3516, bArrM2092);
        if (C0111.m13127(byteBufferM3516)) {
            StringBuilder sb = new StringBuilder(C0025.m2151(m2675(), 870, 5, 822));
            C0021.m1551(sb, C0035.m3629(byteBufferM3516));
            C0077.m7290(sb, C0029.m2695(m2675(), 875, 9, 1906));
            C0021.m1551(sb, C0075.m6818(byteBufferM3516));
            throw new RuntimeException(C0068.m5536(sb));
        }
        C0020.m1437(byteBufferM3516);
        long jM5984 = C0071.m5984(byteBufferM3516);
        C0017.m841(dataSink, byteBufferM3516);
        long length = jM5984 + ((long) bArr.length);
        C0037.m3874(dataSink, bArr, 0, bArr.length);
        return length;
    }

    public int getDataStartOffsetInRecord() {
        return C0075.m6815(this);
    }

    public ByteBuffer getExtra() {
        ByteBuffer byteBufferM4621 = C0064.m4621(this);
        return C0074.m6516(byteBufferM4621) > 0 ? C0071.m6043(byteBufferM4621) : byteBufferM4621;
    }

    public int getExtraFieldStartOffsetInsideRecord() {
        return C0077.m7250(this) + 30;
    }

    public String getName() {
        return C0037.m3834(this);
    }

    public long getSize() {
        return C0033.m3277(this);
    }

    public long getStartOffsetInArchive() {
        return C0111.m13046(this);
    }

    public boolean isDataCompressed() {
        return C0025.m2130(this);
    }

    public LocalFileRecord(String str, int i, ByteBuffer byteBuffer, long j2, long j3, int i2, long j4, boolean z, long j5) {
        this.a = str;
        this.b = i;
        this.c = byteBuffer;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = j4;
        this.h = z;
        this.i = j5;
    }

    public static byte[] getUncompressedData(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j2) throws IOException {
        long jM6320 = C0073.m6320(centralDirectoryRecord);
        String strM4828 = C0066.m4828(m2675(), 858, 12, 3217);
        if (jM6320 <= 2147483647L) {
            try {
                byte[] bArr = new byte[(int) C0073.m6320(centralDirectoryRecord)];
                C0069.m5743(dataSource, centralDirectoryRecord, j2, new ByteBufferSink(C0020.m1393(bArr)));
                return bArr;
            } catch (OutOfMemoryError e) {
                StringBuilder sb = new StringBuilder();
                C0077.m7290(sb, C0073.m6387(centralDirectoryRecord));
                C0077.m7290(sb, strM4828);
                C0078.m7466(sb, C0073.m6320(centralDirectoryRecord));
                throw new IOException(C0068.m5536(sb), e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        C0077.m7290(sb2, C0073.m6387(centralDirectoryRecord));
        C0077.m7290(sb2, strM4828);
        C0078.m7466(sb2, C0073.m6320(centralDirectoryRecord));
        throw new IOException(C0068.m5536(sb2));
    }

    public long outputRecord(DataSource dataSource, DataSink dataSink) {
        long jM3883 = C0037.m3883(this);
        C0018.m1019(dataSource, C0072.m6106(this), jM3883, dataSink);
        return jM3883;
    }

    public long outputRecordWithModifiedExtra(DataSource dataSource, ByteBuffer byteBuffer, DataSink dataSink) {
        long jM6106 = C0072.m6106(this);
        int iM3800 = C0037.m3800(this);
        int iM5984 = C0071.m5984(byteBuffer);
        ByteBuffer byteBufferM3516 = C0035.m3516(iM3800 + iM5984);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0028.m2603(dataSource, jM6106, iM3800, byteBufferM3516);
        C0067.m5510(byteBufferM3516, C0071.m6043(byteBuffer));
        C0020.m1437(byteBufferM3516);
        C0039.m4143(byteBufferM3516, 28, iM5984);
        long jM5984 = C0071.m5984(byteBufferM3516);
        C0017.m841(dataSink, byteBufferM3516);
        long jM3883 = C0037.m3883(this);
        int iM6815 = C0075.m6815(this);
        long j2 = jM3883 - ((long) iM6815);
        C0018.m1019(dataSource, jM6106 + ((long) iM6815), j2, dataSink);
        return jM5984 + j2;
    }

    public static void outputUncompressedData(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j2, DataSink dataSink) {
        C0026.m2286(C0069.m5816(dataSource, centralDirectoryRecord, j2, false, false), dataSource, dataSink);
    }
}
