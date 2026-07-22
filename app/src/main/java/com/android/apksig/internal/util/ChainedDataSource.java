package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.X0;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.ToLongFunction;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ChainedDataSource implements DataSource {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f115short = {1939, 1969, 1969, 1975, 1953, 1953, 2034, 1979, 1953, 2034, 1981, 1959, 1958, 2034, 1981, 1972, 2034, 1968, 1981, 1959, 1980, 1974, 2046, 2034, 1981, 1972, 1972, 1953, 1975, 1958, 2024, 2034, 2032, 2044, 1960, 1971, 1960, 1981, 1968, 1935, 1973, 1958, 1977, 2022, 2044, 3143, 3184, 3172, 3168, 3184, 3174, 3169, 3184, 3185, 3125, 3192, 3194, 3175, 3184, 3125, 3169, 3197, 3188, 3195, 3125, 3188, 3171, 3188, 3196, 3193, 3188, 3191, 3193, 3184, 1278, 1225, 1245, 1241, 1225, 1247, 1240, 1225, 1224, 1164, 1217, 1219, 1246, 1225, 1164, 1240, 1220, 1229, 1218, 1164, 1229, 1242, 1229, 1221, 1216, 1229, 1230, 1216, 1225};
    public final DataSource[] a;
    public final long b;

    /* JADX INFO: renamed from: ۟ۡ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static long m2376(Object obj) {
        if (C0029.m2791() > 0) {
            return ((LongStream) obj).sum();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۨ, reason: not valid java name and contains not printable characters */
    public static LongStream m2377(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((Stream) obj).mapToLong((ToLongFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2378() {
        if (C0019.m1311() == 0) {
            return f115short;
        }
        return null;
    }

    public final Pair a(long j) {
        int i = 0;
        long jM6146 = j;
        while (true) {
            DataSource[] dataSourceArrM4709 = C0065.m4709(this);
            if (i >= dataSourceArrM4709.length) {
                StringBuilder sb = new StringBuilder(C0027.m2404(m2378(), 0, 32, 2002));
                C0078.m7466(sb, j);
                C0077.m7290(sb, C0066.m4828(m2378(), 32, 13, 2012));
                C0078.m7466(sb, C0065.m4748(this));
                throw new IndexOutOfBoundsException(C0068.m5536(sb));
            }
            if (jM6146 < C0072.m6146(dataSourceArrM4709[i])) {
                return C0025.m2158(C0021.m1548(i), C0070.m5853(jM6146));
            }
            jM6146 -= C0072.m6146(dataSourceArrM4709[i]);
            i++;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j, int i, ByteBuffer byteBuffer) {
        C0038.m4036(this, j, i, new ByteBufferSink(byteBuffer));
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j, int i) {
        long j2 = i;
        if (j + j2 > C0065.m4748(this)) {
            throw new IndexOutOfBoundsException(C0030.m2840(m2378(), 74, 29, 1196));
        }
        Pair pairM6008 = C0071.m6008(this, j);
        int iM2170 = C0025.m2170((Integer) C0111.m13157(pairM6008));
        long jM704 = C0016.m704((Long) C0037.m3781(pairM6008));
        long j3 = j2 + jM704;
        DataSource[] dataSourceArrM4709 = C0065.m4709(this);
        if (j3 <= C0072.m6146(dataSourceArrM4709[iM2170])) {
            return C0074.m6568(dataSourceArrM4709[iM2170], jM704, i);
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(i);
        while (iM2170 < dataSourceArrM4709.length && C0111.m13127(byteBufferM3516)) {
            long jM2757 = C0029.m2757(C0072.m6146(dataSourceArrM4709[iM2170]) - jM704, C0071.m5984(byteBufferM3516));
            DataSource dataSource = dataSourceArrM4709[iM2170];
            int i2 = (int) jM2757;
            if (jM2757 != i2) {
                throw new ArithmeticException();
            }
            C0028.m2603(dataSource, jM704, i2, byteBufferM3516);
            iM2170++;
            jM704 = 0;
        }
        C0038.m3987(byteBufferM3516);
        return byteBufferM3516;
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j, long j2, DataSink dataSink) {
        long j3 = j2;
        if (j + j3 > C0065.m4748(this)) {
            throw new IndexOutOfBoundsException(C0017.m936(m2378(), 45, 29, 3093));
        }
        long jM6146 = j;
        for (DataSource dataSource : C0065.m4709(this)) {
            if (jM6146 >= C0072.m6146(dataSource)) {
                jM6146 -= C0072.m6146(dataSource);
            } else {
                long jM61462 = C0072.m6146(dataSource) - jM6146;
                if (jM61462 >= j3) {
                    C0018.m1019(dataSource, jM6146, j3, dataSink);
                    return;
                } else {
                    C0018.m1019(dataSource, jM6146, jM61462, dataSink);
                    j3 -= jM61462;
                    jM6146 = 0;
                }
            }
        }
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return C0065.m4748(this);
    }

    public ChainedDataSource(DataSource... dataSourceArr) {
        this.a = dataSourceArr;
        this.b = m2376(m2377(C0066.m4910(dataSourceArr), new X0(0)));
    }

    @Override // com.android.apksig.util.DataSource
    public DataSource slice(long j, long j2) {
        Pair pairM6008 = C0071.m6008(this, j);
        int iM2170 = C0025.m2170((Integer) C0111.m13157(pairM6008));
        long jM704 = C0016.m704((Long) C0037.m3781(pairM6008));
        DataSource[] dataSourceArrM4709 = C0065.m4709(this);
        DataSource dataSource = dataSourceArrM4709[iM2170];
        if (jM704 + j2 <= C0072.m6146(dataSource)) {
            return C0072.m6182(dataSource, jM704, j2);
        }
        ArrayList arrayList = new ArrayList();
        C0017.m919(arrayList, C0072.m6182(dataSource, jM704, C0072.m6146(dataSource) - jM704));
        Pair pairM60082 = C0071.m6008(this, (j + j2) - 1);
        int iM21702 = C0025.m2170((Integer) C0111.m13157(pairM60082));
        long jM7042 = C0016.m704((Long) C0037.m3781(pairM60082));
        while (true) {
            iM2170++;
            if (iM2170 < iM21702) {
                C0017.m919(arrayList, dataSourceArrM4709[iM2170]);
            } else {
                C0017.m919(arrayList, C0072.m6182(dataSourceArrM4709[iM21702], 0L, jM7042 + 1));
                return new ChainedDataSource((DataSource[]) C0039.m4172(arrayList, new DataSource[0]));
            }
        }
    }
}
