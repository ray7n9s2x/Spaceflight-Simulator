package com.android.apksig.internal.zip;

import androidx.core.internal.view.SupportMenu;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.android.apksig.zip.ZipSections;
import com.joke.connectdevice.bean.C0064;
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
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.UShort;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZipUtils {
    public static final short COMPRESSION_METHOD_DEFLATED = 8;
    public static final short COMPRESSION_METHOD_STORED = 0;
    public static final short GP_FLAG_DATA_DESCRIPTOR_USED = 8;
    public static final short GP_FLAG_EFS = 2048;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f129short = {2987, 2983, 3006, 2949, 2985, 2987, 2987, 2979, 2984, 2994, 2965, 2991, 3004, 2979, 3068, 3046, 700, 647, 650, 667, 700, 651, 664, 664, 667, 652, 734, 668, 647, 650, 667, 734, 657, 652, 666, 667, 652, 734, 659, 651, 653, 650, 734, 668, 667, 734, 658, 663, 650, 650, 658, 667, 734, 667, 656, 666, 663, 671, 656, 2250, 2434, 2478, 2467, 2473, 2464, 2493, 2466, 2474, 2475, 2543, 2453, 2438, 2463, 2543, 2444, 2474, 2465, 2491, 2493, 2478, 2467, 2543, 2443, 2470, 2493, 2474, 2476, 2491, 2464, 2493, 2486, 2543, 2493, 2474, 2476, 2464, 2493, 2475, 2543, 2540, 1662, 1599, 1578, 1662, 1592, 1591, 1586, 1595, 1662, 1585, 1592, 1592, 1581, 1595, 1578, 1662, 1803, 1816, 1793, 1905, 1810, 1844, 1855, 1829, 1827, 1840, 1853, 1905, 1813, 1848, 1827, 1844, 1842, 1829, 1854, 1827, 1832, 1905, 1829, 1854, 1854, 1905, 1853, 1840, 1827, 1846, 1844, 1899, 1905, 1623, 1611, 1612, 1622, 1555, 1556, 1538, 1620, 1603, 1614, 1623, 1607, 1538, 1613, 1604, 1538, 1613, 1623, 1622, 1538, 1616, 1603, 1612, 1605, 1607, 1560, 1538, 2381, 2385, 2390, 2380, 2315, 2314, 2328, 2382, 2393, 2388, 2381, 2397, 2328, 2391, 2398, 2328, 2391, 2381, 2380, 2328, 2378, 2393, 2390, 2399, 2397, 2306, 2328, 772, 792, 799, 773, 832, 839, 849, 775, 784, 797, 772, 788, 849, 798, 791, 849, 798, 772, 773, 849, 771, 784, 799, 790, 788, 843, 849, 2080, 2108, 2107, 2081, 2150, 2151, 2165, 2083, 2100, 2105, 2080, 2096, 2165, 2106, 2099, 2165, 2106, 2080, 2081, 2165, 2087, 2100, 2107, 2098, 2096, 2159, 2165};

    public static int getUnsignedInt16(ByteBuffer byteBuffer, int i) {
        return C0039.m4059(byteBuffer, i) & UShort.MAX_VALUE;
    }

    public static long getUnsignedInt32(ByteBuffer byteBuffer, int i) {
        return ((long) C0067.m5511(byteBuffer, i)) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2686() {
        if (C0072.m6216() > 0) {
            return f129short;
        }
        return null;
    }

    public static class DeflateResult {
        public final long inputCrc32;
        public final int inputSizeBytes;
        public final byte[] output;

        public DeflateResult(int i, long j, byte[] bArr) {
            this.inputSizeBytes = i;
            this.inputCrc32 = j;
            this.output = bArr;
        }
    }

    public static Pair a(DataSource dataSource, int i) {
        int i2;
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(C0071.m6038(i, C0037.m3829(m2686(), 0, 16, 3014)));
        }
        long jM6146 = C0072.m6146(dataSource);
        if (jM6146 < 22) {
            return null;
        }
        int iM2757 = ((int) C0029.m2757(i, jM6146 - 22)) + 22;
        long j = jM6146 - ((long) iM2757);
        ByteBuffer byteBufferM6568 = C0074.m6568(dataSource, j, iM2757);
        C0064.m4604(byteBufferM6568, C0072.m6217());
        C0074.m6449(byteBufferM6568);
        int iM6516 = C0074.m6516(byteBufferM6568);
        if (iM6516 < 22) {
            i2 = -1;
        } else {
            int i3 = iM6516 - 22;
            int iM3151 = C0032.m3151(i3, SupportMenu.USER_MASK);
            for (int i4 = 0; i4 <= iM3151; i4++) {
                i2 = i3 - i4;
                if (C0067.m5511(byteBufferM6568, i2) == 101010256 && C0067.m5479(byteBufferM6568, i2 + 20) == i4) {
                    break;
                }
            }
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        C0037.m3886(byteBufferM6568, i2);
        ByteBuffer byteBufferM6043 = C0071.m6043(byteBufferM6568);
        C0064.m4604(byteBufferM6043, C0072.m6217());
        return C0025.m2158(byteBufferM6043, C0070.m5853(j + ((long) i2)));
    }

    public static int getUnsignedInt16(ByteBuffer byteBuffer) {
        return C0028.m2656(byteBuffer) & UShort.MAX_VALUE;
    }

    public static long getUnsignedInt32(ByteBuffer byteBuffer) {
        return ((long) C0064.m4566(byteBuffer)) & 4294967295L;
    }

    public static void putUnsignedInt16(ByteBuffer byteBuffer, int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(C0071.m6038(i, C0067.m5418(m2686(), 149, 27, 1570)));
        }
        C0069.m5783(byteBuffer, (short) i);
    }

    public static void putUnsignedInt32(ByteBuffer byteBuffer, long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(C0039.m4094(j, C0021.m1650(m2686(), 176, 27, 2360)));
        }
        C0038.m4018(byteBuffer, (int) j);
    }

    public static void setUnsignedInt16(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException(C0071.m6038(i2, C0017.m936(m2686(), 203, 27, 881)));
        }
        C0037.m3899(byteBuffer, i, (short) i2);
    }

    public static void setUnsignedInt32(ByteBuffer byteBuffer, int i, long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(C0039.m4094(j, C0028.m2609(m2686(), 230, 27, 2133)));
        }
        C0021.m1647(byteBuffer, i, (int) j);
    }

    public static void assertByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (C0033.m3275(byteBuffer) == C0072.m6217()) {
        } else {
            throw new IllegalArgumentException(C0036.m3678(m2686(), 16, 43, 766));
        }
    }

    public static DeflateResult deflate(ByteBuffer byteBuffer) {
        byte[] bArrM2445;
        int iM3629;
        int iM5984 = C0071.m5984(byteBuffer);
        if (C0069.m5719(byteBuffer)) {
            bArrM2445 = C0027.m2445(byteBuffer);
            iM3629 = C0035.m3629(byteBuffer) + C0020.m1414(byteBuffer);
            C0037.m3886(byteBuffer, C0075.m6818(byteBuffer));
        } else {
            bArrM2445 = new byte[iM5984];
            C0029.m2812(byteBuffer, bArrM2445);
            iM3629 = 0;
        }
        CRC32 crc32 = new CRC32();
        C0034.m3484(crc32, bArrM2445, iM3629, iM5984);
        long jM5810 = C0069.m5810(crc32);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(9, true);
        C0023.m1917(deflater, bArrM2445, iM3629, iM5984);
        C0034.m3389(deflater);
        byte[] bArr = new byte[65536];
        while (!C0024.m2054(deflater)) {
            C0067.m5408(byteArrayOutputStream, bArr, 0, C0038.m4024(deflater, bArr));
        }
        return new DeflateResult(iM5984, jM5810, C0077.m7297(byteArrayOutputStream));
    }

    public static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(DataSource dataSource) {
        if (C0072.m6146(dataSource) < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairM5430 = C0067.m5430(dataSource, 0);
        if (pairM5430 != null) {
            return pairM5430;
        }
        return C0067.m5430(dataSource, SupportMenu.USER_MASK);
    }

    public static long getZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer) {
        C0074.m6449(byteBuffer);
        return C0077.m7195(byteBuffer, C0035.m3629(byteBuffer) + 16);
    }

    public static long getZipEocdCentralDirectorySizeBytes(ByteBuffer byteBuffer) {
        C0074.m6449(byteBuffer);
        return C0077.m7195(byteBuffer, C0035.m3629(byteBuffer) + 12);
    }

    public static int getZipEocdCentralDirectoryTotalRecordCount(ByteBuffer byteBuffer) {
        C0074.m6449(byteBuffer);
        return C0067.m5479(byteBuffer, C0035.m3629(byteBuffer) + 10);
    }

    public static List<CentralDirectoryRecord> parseZipCentralDirectory(DataSource dataSource, ZipSections zipSections) throws ApkFormatException {
        long jM3871 = C0037.m3871(zipSections);
        if (jM3871 <= 2147483647L) {
            long jM2922 = C0030.m2922(zipSections);
            ByteBuffer byteBufferM6568 = C0074.m6568(dataSource, jM2922, (int) jM3871);
            C0064.m4604(byteBufferM6568, C0072.m6217());
            int iM2912 = C0030.m2912(zipSections);
            ArrayList arrayList = new ArrayList(iM2912);
            for (int i = 0; i < iM2912; i++) {
                int iM3629 = C0035.m3629(byteBufferM6568);
                try {
                    CentralDirectoryRecord centralDirectoryRecordM2067 = C0024.m2067(byteBufferM6568);
                    if (!C0072.m6150(C0073.m6387(centralDirectoryRecordM2067), C0066.m4828(m2686(), 59, 1, 2277))) {
                        C0017.m919(arrayList, centralDirectoryRecordM2067);
                    }
                } catch (ZipFormatException e) {
                    StringBuilder sb = new StringBuilder(C0027.m2404(m2686(), 60, 40, 2511));
                    C0021.m1551(sb, i + 1);
                    C0077.m7290(sb, C0021.m1650(m2686(), 100, 16, 1630));
                    C0078.m7466(sb, jM2922 + ((long) iM3629));
                    throw new ApkFormatException(C0068.m5536(sb), e);
                }
            }
            return arrayList;
        }
        throw new ApkFormatException(C0039.m4094(jM3871, C0070.m5942(m2686(), 116, 33, 1873)));
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j) {
        C0074.m6449(byteBuffer);
        C0111.m13104(byteBuffer, C0035.m3629(byteBuffer) + 16, j);
    }

    public static void updateZipEocdCommentLen(ByteBuffer byteBuffer) {
        C0074.m6449(byteBuffer);
        C0039.m4143(byteBuffer, C0035.m3629(byteBuffer) + 20, C0071.m5984(byteBuffer) - 22);
    }
}
