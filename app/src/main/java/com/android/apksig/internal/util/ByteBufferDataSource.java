package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferDataSource implements DataSource {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f113short = {2405, 2431, 2412, 2419, 2348, 2358, 728, 724, 647, 667, 641, 646, 663, 657, 724, 647, 669, 654, 657, 718, 724, 1950, 808, 801, 831, 801, 882, 878, 884, 883, 866, 868, 801, 882, 872, 891, 868, 801, 809, 862, 855, 855, 834, 852, 837, 785, 793, 1846, 1855, 1844, 1855, 1900, 1910, 1893, 1914, 1855, 1847, 902, 911, 960, 985, 970, 989, 969, 963, 960, 984, 496, 490, 505, 486, 441, 419, 1957, 1964, 1964, 1977, 1967, 1982, 2032, 2026, 997, 1023, 1004, 1011, 940, 950, 1809, 1821, 1870, 1874, 1864, 1871, 1886, 1880, 1821, 1870, 1876, 1863, 1880, 1799, 1821};
    public final ByteBuffer a;
    public final int b;

    public ByteBufferDataSource(ByteBuffer byteBuffer) {
        this(byteBuffer, true);
    }

    /* JADX INFO: renamed from: ۡۥۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2374() {
        if (C0077.m7272() <= 0) {
            return f113short;
        }
        return null;
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j, int i) {
        ByteBuffer byteBufferM6043;
        long j2 = i;
        if (j < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j, C0029.m2695(m2374(), 73, 8, 1994)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException(C0039.m4094(j2, C0030.m2840(m2374(), 67, 6, 387)));
        }
        int iM4802 = C0066.m4802(this);
        long j3 = iM4802;
        String strM6902 = C0076.m6902(m2374(), 21, 1, 1975);
        String strM5991 = C0071.m5991(m2374(), 22, 17, 769);
        String strM2151 = C0025.m2151(m2374(), 39, 8, 817);
        if (j > j3) {
            StringBuilder sb = new StringBuilder(strM2151);
            C0078.m7466(sb, j);
            C0077.m7290(sb, strM5991);
            C0021.m1551(sb, iM4802);
            C0077.m7290(sb, strM6902);
            throw new IndexOutOfBoundsException(C0068.m5536(sb));
        }
        long j4 = j + j2;
        String strM1189 = C0019.m1189(m2374(), 47, 10, 1823);
        if (j4 < j) {
            StringBuilder sb2 = new StringBuilder(strM2151);
            C0078.m7466(sb2, j);
            C0077.m7290(sb2, strM1189);
            C0078.m7466(sb2, j2);
            C0077.m7290(sb2, C0067.m5418(m2374(), 57, 10, 943));
            throw new IndexOutOfBoundsException(C0068.m5536(sb2));
        }
        if (j4 > j3) {
            StringBuilder sb3 = new StringBuilder(strM2151);
            C0078.m7466(sb3, j);
            C0077.m7290(sb3, strM1189);
            C0078.m7466(sb3, j2);
            C0077.m7290(sb3, strM5991);
            C0021.m1551(sb3, iM4802);
            C0077.m7290(sb3, strM6902);
            throw new IndexOutOfBoundsException(C0068.m5536(sb3));
        }
        int i2 = (int) j;
        int i3 = i + i2;
        synchronized (C0023.m1899(this)) {
            C0037.m3886(C0023.m1899(this), 0);
            C0034.m3392(C0023.m1899(this), i3);
            C0037.m3886(C0023.m1899(this), i2);
            byteBufferM6043 = C0071.m6043(C0023.m1899(this));
        }
        return byteBufferM6043;
    }

    @Override // com.android.apksig.util.DataSource
    public /* bridge */ /* synthetic */ DataSource slice(long j, long j2) {
        return C0033.m3296(this, j, j2);
    }

    public ByteBufferDataSource(ByteBuffer byteBuffer, boolean z) {
        this.a = z ? C0071.m6043(byteBuffer) : byteBuffer;
        this.b = C0071.m5984(byteBuffer);
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j, long j2, DataSink dataSink) {
        int iM4802 = C0066.m4802(this);
        if (j2 >= 0 && j2 <= iM4802) {
            C0017.m841(dataSink, C0018.m1007(this, j, (int) j2));
            return;
        }
        StringBuilder sb = new StringBuilder(C0029.m2695(m2374(), 0, 6, 2326));
        C0078.m7466(sb, j2);
        C0077.m7290(sb, C0035.m3603(m2374(), 6, 15, 756));
        C0021.m1551(sb, iM4802);
        throw new IndexOutOfBoundsException(C0068.m5536(sb));
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return C0066.m4802(this);
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBufferDataSource slice(long j, long j2) {
        int iM4802 = C0066.m4802(this);
        if (j == 0 && j2 == iM4802) {
            return this;
        }
        if (j2 >= 0 && j2 <= iM4802) {
            return new ByteBufferDataSource(C0018.m1007(this, j, (int) j2), false);
        }
        StringBuilder sb = new StringBuilder(C0064.m4545(m2374(), 81, 6, 918));
        C0078.m7466(sb, j2);
        C0077.m7290(sb, C0024.m1945(m2374(), 87, 15, 1853));
        C0021.m1551(sb, iM4802);
        throw new IndexOutOfBoundsException(C0068.m5536(sb));
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j, int i, ByteBuffer byteBuffer) {
        C0067.m5510(byteBuffer, C0018.m1007(this, j, i));
    }
}
