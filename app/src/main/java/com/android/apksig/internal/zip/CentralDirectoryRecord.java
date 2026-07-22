package com.android.apksig.internal.zip;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Comparator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class CentralDirectoryRecord {
    public final ByteBuffer a;
    public final short b;
    public final short c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f126short = {1190, 1209, 1189, 1260, 1270, 2643, 2655, 2579, 2582, 2578, 2582, 2571, 2629, 2655, 2959, 3021, 3030, 3035, 3018, 3036, 2150, 2113, 2143, 2138, 2139, 2063, 2139, 2112, 2112, 2063, 2140, 2119, 2112, 2141, 2139, 2049, 2063, 2145, 2122, 2122, 2123, 2069, 2063, 2789, 2727, 2748, 2737, 2720, 2742, 2793, 2789, 2724, 2739, 2724, 2732, 2729, 2724, 2727, 2729, 2720, 2815, 2789, 571, 538, 513, 597, 532, 597, 566, 528, 539, 513, 519, 532, 537, 597, 561, 540, 519, 528, 534, 513, 538, 519, 524, 597, 519, 528, 534, 538, 519, 529, 603, 597, 550, 540, 530, 539, 532, 513, 512, 519, 528, 591, 597, 581, 525, 3171, 3140, 3162, 3167, 3166, 3082, 3166, 3141, 3141, 3082, 3161, 3138, 3141, 3160, 3166, 3076, 3082, 3172, 3151, 3151, 3150, 3082, 3147, 3166, 3082, 3142, 3151, 3147, 3161, 3166, 3088, 3082, 3102, 3100, 3082, 3144, 3155, 3166, 3151, 3161, 3078, 3082, 3147, 3164, 3147, 3139, 3142, 3147, 3144, 3142, 3151, 3088, 3082};
    public static final Comparator<CentralDirectoryRecord> BY_LOCAL_FILE_HEADER_OFFSET_COMPARATOR = new ByLocalFileHeaderOffsetComparator(null);

    /* JADX INFO: renamed from: com.android.apksig.internal.zip.CentralDirectoryRecord$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ByLocalFileHeaderOffsetComparator implements Comparator<CentralDirectoryRecord> {
        /* JADX INFO: renamed from: ۦۣۣۨ, reason: contains not printable characters */
        public static int m2674(Object obj, Object obj2, Object obj3) {
            if (C0077.m7272() < 0) {
                return ((ByLocalFileHeaderOffsetComparator) obj).compare2((CentralDirectoryRecord) obj2, (CentralDirectoryRecord) obj3);
            }
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(CentralDirectoryRecord centralDirectoryRecord, CentralDirectoryRecord centralDirectoryRecord2) {
            return m2674(this, centralDirectoryRecord, centralDirectoryRecord2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(CentralDirectoryRecord centralDirectoryRecord, CentralDirectoryRecord centralDirectoryRecord2) {
            long jM3759 = C0036.m3759(centralDirectoryRecord);
            long jM37592 = C0036.m3759(centralDirectoryRecord2);
            if (jM3759 > jM37592) {
                return 1;
            }
            return jM3759 < jM37592 ? -1 : 0;
        }

        public ByLocalFileHeaderOffsetComparator(AnonymousClass1 anonymousClass1) {
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m2673() {
        if (C0039.m4109() >= 0) {
            return f126short;
        }
        return null;
    }

    public String getName() {
        return C0075.m6844(this);
    }

    public static CentralDirectoryRecord createWithDeflateCompressedData(String str, int i, int i2, long j, long j2, long j3, long j4) {
        byte[] bArrM2092 = C0025.m2092(str, C0018.m1069());
        ByteBuffer byteBufferM3516 = C0035.m3516(bArrM2092.length + 46);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0038.m4018(byteBufferM3516, 33639248);
        C0019.m1183(byteBufferM3516, 20);
        C0019.m1183(byteBufferM3516, 20);
        C0069.m5783(byteBufferM3516, ZipUtils.GP_FLAG_EFS);
        C0069.m5783(byteBufferM3516, (short) 8);
        C0019.m1183(byteBufferM3516, i);
        C0019.m1183(byteBufferM3516, i2);
        C0037.m3845(byteBufferM3516, j);
        C0037.m3845(byteBufferM3516, j2);
        C0037.m3845(byteBufferM3516, j3);
        C0019.m1183(byteBufferM3516, bArrM2092.length);
        C0019.m1183(byteBufferM3516, 0);
        C0019.m1183(byteBufferM3516, 0);
        C0019.m1183(byteBufferM3516, 0);
        C0019.m1183(byteBufferM3516, 0);
        C0037.m3845(byteBufferM3516, 0L);
        C0037.m3845(byteBufferM3516, j4);
        C0068.m5569(byteBufferM3516, bArrM2092);
        if (!C0111.m13127(byteBufferM3516)) {
            C0020.m1437(byteBufferM3516);
            return new CentralDirectoryRecord(byteBufferM3516, ZipUtils.GP_FLAG_EFS, (short) 8, i, i2, j, j2, j3, j4, str, bArrM2092.length);
        }
        StringBuilder sb = new StringBuilder(C0023.m1904(m2673(), 0, 5, 1238));
        C0021.m1551(sb, C0035.m3629(byteBufferM3516));
        C0077.m7290(sb, C0036.m3678(m2673(), 5, 9, 2687));
        C0021.m1551(sb, C0075.m6818(byteBufferM3516));
        throw new RuntimeException(C0068.m5536(sb));
    }

    public static String getName(ByteBuffer byteBuffer, int i, int i2) {
        byte[] bArrM2445;
        int iM1414;
        if (C0069.m5719(byteBuffer)) {
            bArrM2445 = C0027.m2445(byteBuffer);
            iM1414 = C0020.m1414(byteBuffer) + i;
        } else {
            bArrM2445 = new byte[i2];
            int iM3629 = C0035.m3629(byteBuffer);
            try {
                C0037.m3886(byteBuffer, i);
                C0029.m2812(byteBuffer, bArrM2445);
                C0037.m3886(byteBuffer, iM3629);
                iM1414 = 0;
            } catch (Throwable th) {
                C0037.m3886(byteBuffer, iM3629);
                throw th;
            }
        }
        return new String(bArrM2445, iM1414, i2, C0018.m1069());
    }

    public static CentralDirectoryRecord getRecord(ByteBuffer byteBuffer) throws ZipFormatException {
        C0074.m6449(byteBuffer);
        int iM5984 = C0071.m5984(byteBuffer);
        String strM7205 = C0077.m7205(m2673(), 14, 6, 2991);
        if (iM5984 < 46) {
            StringBuilder sb = new StringBuilder(C0017.m936(m2673(), 107, 53, 3114));
            C0021.m1551(sb, C0071.m5984(byteBuffer));
            C0077.m7290(sb, strM7205);
            throw new ZipFormatException(C0068.m5536(sb), new BufferUnderflowException());
        }
        int iM3629 = C0035.m3629(byteBuffer);
        int iM4566 = C0064.m4566(byteBuffer);
        if (iM4566 != 33639248) {
            StringBuilder sb2 = new StringBuilder(C0064.m4545(m2673(), 62, 45, 629));
            C0077.m7290(sb2, C0029.m2713(((long) iM4566) & 4294967295L));
            throw new ZipFormatException(C0068.m5536(sb2));
        }
        C0037.m3886(byteBuffer, iM3629 + 8);
        short sM2656 = C0028.m2656(byteBuffer);
        short sM26562 = C0028.m2656(byteBuffer);
        int iM6899 = C0075.m6899(byteBuffer);
        int iM68992 = C0075.m6899(byteBuffer);
        long jM1578 = C0021.m1578(byteBuffer);
        long jM15782 = C0021.m1578(byteBuffer);
        long jM15783 = C0021.m1578(byteBuffer);
        int iM68993 = C0075.m6899(byteBuffer);
        int iM68994 = C0075.m6899(byteBuffer);
        int iM68995 = C0075.m6899(byteBuffer);
        C0037.m3886(byteBuffer, iM3629 + 42);
        long jM15784 = C0021.m1578(byteBuffer);
        C0037.m3886(byteBuffer, iM3629);
        int i = iM68993 + 46 + iM68994 + iM68995;
        if (i > C0071.m5984(byteBuffer)) {
            StringBuilder sb3 = new StringBuilder(C0027.m2404(m2673(), 20, 23, 2095));
            C0021.m1551(sb3, i);
            C0077.m7290(sb3, C0067.m5418(m2673(), 43, 19, 2757));
            C0021.m1551(sb3, C0071.m5984(byteBuffer));
            C0077.m7290(sb3, strM7205);
            throw new ZipFormatException(C0068.m5536(sb3), new BufferUnderflowException());
        }
        String strM1572 = C0021.m1572(byteBuffer, iM3629 + 46, iM68993);
        C0037.m3886(byteBuffer, iM3629);
        int iM6818 = C0075.m6818(byteBuffer);
        int i2 = iM3629 + i;
        try {
            C0034.m3392(byteBuffer, i2);
            ByteBuffer byteBufferM6043 = C0071.m6043(byteBuffer);
            C0034.m3392(byteBuffer, iM6818);
            C0037.m3886(byteBuffer, i2);
            return new CentralDirectoryRecord(byteBufferM6043, sM2656, sM26562, iM6899, iM68992, jM1578, jM15782, jM15783, jM15784, strM1572, iM68993);
        } catch (Throwable th) {
            C0034.m3392(byteBuffer, iM6818);
            throw th;
        }
    }

    public void copyTo(ByteBuffer byteBuffer) {
        C0067.m5510(byteBuffer, C0071.m6043(C0069.m5799(this)));
    }

    public CentralDirectoryRecord createWithModifiedLocalFileHeaderOffset(long j) {
        ByteBuffer byteBufferM5799 = C0069.m5799(this);
        ByteBuffer byteBufferM3516 = C0035.m3516(C0071.m5984(byteBufferM5799));
        C0067.m5510(byteBufferM3516, C0071.m6043(byteBufferM5799));
        C0020.m1437(byteBufferM3516);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0111.m13104(byteBufferM3516, 42, j);
        return new CentralDirectoryRecord(byteBufferM3516, C0036.m3652(this), C0026.m2332(this), C0067.m5411(this), C0026.m2366(this), C0020.m1332(this), C0018.m1072(this), C0078.m7419(this), j, C0075.m6844(this), C0078.m7363(this));
    }

    public long getCompressedSize() {
        return C0018.m1072(this);
    }

    public short getCompressionMethod() {
        return C0026.m2332(this);
    }

    public long getCrc32() {
        return C0020.m1332(this);
    }

    public short getGpFlags() {
        return C0036.m3652(this);
    }

    public int getLastModificationDate() {
        return C0026.m2366(this);
    }

    public int getLastModificationTime() {
        return C0067.m5411(this);
    }

    public long getLocalFileHeaderOffset() {
        return C0038.m4038(this);
    }

    public int getNameSizeBytes() {
        return C0078.m7363(this);
    }

    public int getSize() {
        return C0071.m5984(C0069.m5799(this));
    }

    public long getUncompressedSize() {
        return C0078.m7419(this);
    }

    public CentralDirectoryRecord(ByteBuffer byteBuffer, short s, short s2, int i, int i2, long j, long j2, long j3, long j4, String str, int i3) {
        this.a = byteBuffer;
        this.b = s;
        this.c = s2;
        this.e = i2;
        this.d = i;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = str;
        this.k = i3;
    }
}
