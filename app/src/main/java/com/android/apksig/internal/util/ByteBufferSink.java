package com.android.apksig.internal.util;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferSink implements DataSink {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f114short = {1942, 1969, 1964, 1962, 1977, 1977, 1974, 1980, 1974, 1978, 1969, 1963, 2047, 1964, 1967, 1982, 1980, 1978, 2047, 1974, 1969, 2047, 1968, 1962, 1963, 1967, 1962, 1963, 2047, 1981, 1962, 1977, 1977, 1978, 1965, 2047, 1977, 1968, 1965, 2047, 2933, 2871, 2860, 2849, 2864, 2854, 1576, 1551, 1554, 1556, 1543, 1543, 1544, 1538, 1544, 1540, 1551, 1557, 1601, 1554, 1553, 1536, 1538, 1540, 1601, 1544, 1551, 1601, 1550, 1556, 1557, 1553, 1556, 1557, 1601, 1539, 1556, 1543, 1543, 1540, 1555, 1601, 1543, 1550, 1555, 1601, 3052, 2990, 2997, 3000, 2985, 3007};
    public final ByteBuffer a;

    /* JADX INFO: renamed from: ۟۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2375() {
        if (C0032.m3184() < 0) {
            return f114short;
        }
        return null;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i, int i2) throws IOException {
        try {
            C0031.m3062(C0033.m3270(this), bArr, i, i2);
        } catch (BufferOverflowException e) {
            throw new IOException(C0025.m2086(C0067.m5418(m2375(), 46, 40, 1633), i2, C0069.m5807(m2375(), 86, 6, 3020)), e);
        }
    }

    public ByteBuffer getBuffer() {
        return C0033.m3270(this);
    }

    public ByteBufferSink(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) throws IOException {
        int iM5984 = C0071.m5984(byteBuffer);
        try {
            C0067.m5510(C0033.m3270(this), byteBuffer);
        } catch (BufferOverflowException e) {
            throw new IOException(C0025.m2086(C0039.m4066(m2375(), 0, 40, 2015), iM5984, C0020.m1443(m2375(), 40, 6, 2901)), e);
        }
    }
}
