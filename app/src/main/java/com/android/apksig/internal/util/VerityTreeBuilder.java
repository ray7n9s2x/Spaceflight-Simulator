package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class VerityTreeBuilder implements AutoCloseable {
    public final byte[] a;
    public final MessageDigest b;
    public final ThreadPoolExecutor c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f120short = {441, 418, 427, 455, 472, 479, 476, 2575, 2590, 2565, 2670, 2589, 2599, 2601, 2592, 2599, 2592, 2601, 2670, 2572, 2594, 2593, 2605, 2597, 2670, 2621, 2599, 2612, 2603, 2670, 2592, 2593, 2618, 2670, 2607, 2670, 2595, 2619, 2594, 2618, 2599, 2622, 2594, 2603, 2670, 2593, 2600, 2670, 2682, 2686, 2679, 2680, 2676, 2670};
    public static final int d = C0032.m3151(32, C0070.m5861(C0064.m4506()));

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2384() {
        if (C0028.m2593() > 0) {
            return f120short;
        }
        return null;
    }

    public byte[] generateVerityTreeRootHash(DataSource dataSource, DataSource dataSource2, DataSource dataSource3) {
        if (C0072.m6146(dataSource) % 4096 != 0) {
            StringBuilder sb = new StringBuilder(C0026.m2321(m2384(), 7, 47, 2638));
            C0078.m7466(sb, C0072.m6146(dataSource));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        long jM6146 = C0072.m6146(dataSource);
        ByteBuffer byteBufferM3516 = C0035.m3516((int) C0072.m6146(dataSource3));
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0028.m2603(dataSource3, 0L, (int) C0072.m6146(dataSource3), byteBufferM3516);
        C0020.m1437(byteBufferM3516);
        C0067.m5417(byteBufferM3516, jM6146);
        return C0030.m2960(this, new ChainedDataSource(dataSource, dataSource2, C0025.m2149(byteBufferM3516)));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        C0078.m7415(C0027.m2499(this));
    }

    public ByteBuffer generateVerityTree(DataSource dataSource) {
        long j;
        DataSource dataSourceM2149;
        int iM6498 = C0074.m6498(C0026.m2336(this));
        long jM6146 = C0072.m6146(dataSource);
        ArrayList arrayList = new ArrayList();
        do {
            j = iM6498;
            jM6146 = ((jM6146 + 4095) / 4096) * j;
            C0017.m919(arrayList, C0070.m5853(((jM6146 + 4095) / 4096) * 4096));
        } while (jM6146 > 4096);
        int iM1084 = C0018.m1084(arrayList);
        int[] iArr = new int[iM1084 + 1];
        iArr[0] = 0;
        int i = 0;
        while (i < C0018.m1084(arrayList)) {
            int i2 = i + 1;
            int i3 = iArr[i];
            long jM704 = C0016.m704((Long) C0064.m4526(arrayList, (C0018.m1084(arrayList) - i) - 1));
            int i4 = (int) jM704;
            ArrayList arrayList2 = arrayList;
            if (jM704 != i4) {
                throw new ArithmeticException();
            }
            iArr[i2] = i3 + i4;
            i = i2;
            arrayList = arrayList2;
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(iArr[iM1084]);
        int i5 = iM1084 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            int i7 = i6 + 1;
            ByteBufferSink byteBufferSink = new ByteBufferSink(C0023.m1854(byteBufferM3516, iArr[i6], iArr[i7]));
            if (i6 == i5) {
                C0027.m2431(this, dataSource, byteBufferSink);
                dataSourceM2149 = dataSource;
            } else {
                dataSourceM2149 = C0025.m2149(C0023.m1854(C0031.m3032(byteBufferM3516), iArr[i7], iArr[i6 + 2]));
                C0027.m2431(this, dataSourceM2149, byteBufferSink);
            }
            int iM6146 = (int) ((((C0072.m6146(dataSourceM2149) + 4095) / 4096) * j) % 4096);
            if (iM6146 > 0) {
                int i8 = 4096 - iM6146;
                C0037.m3874(byteBufferSink, new byte[i8], 0, i8);
            }
        }
        return byteBufferM3516;
    }

    public VerityTreeBuilder(byte[] bArr) {
        TimeUnit timeUnitM13080 = C0111.m13080();
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(4);
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        int iM3953 = C0038.m3953();
        this.c = new ThreadPoolExecutor(iM3953, iM3953, 0L, timeUnitM13080, arrayBlockingQueue, callerRunsPolicy);
        this.a = bArr;
        this.b = C0030.m2835(C0075.m6791(m2384(), 0, 7, 490));
    }

    public static ByteBuffer b(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBufferM3892 = C0037.m3892(byteBuffer);
        C0037.m3886(byteBufferM3892, 0);
        C0034.m3392(byteBufferM3892, i2);
        C0037.m3886(byteBufferM3892, i);
        return C0071.m6043(byteBufferM3892);
    }

    public final void a(DataSource dataSource, ByteBufferSink byteBufferSink) {
        long jM6146 = C0072.m6146(dataSource);
        long j = 4095;
        long j2 = 4096;
        int i = (int) ((jM6146 + 4095) / 4096);
        byte[][] bArr = new byte[i][];
        Phaser phaser = new Phaser(1);
        long j3 = 0;
        int i2 = 0;
        while (j3 < jM6146) {
            int iM2757 = (int) (C0029.m2757(4194304 + j3, jM6146) - j3);
            long j4 = iM2757;
            int i3 = (int) ((j4 + j) / j2);
            ByteBuffer byteBufferM3516 = C0035.m3516(i3 * 4096);
            C0028.m2603(dataSource, j3, iM2757, byteBufferM3516);
            C0038.m3987(byteBufferM3516);
            RunnableC0353e1 runnableC0353e1 = new RunnableC0353e1(this, byteBufferM3516, i2, bArr, phaser);
            C0022.m1700(phaser);
            C0034.m3490(C0027.m2499(this), runnableC0353e1);
            i2 += i3;
            j3 += j4;
            j = 4095;
            j2 = 4096;
        }
        C0038.m3993(phaser);
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr2 = bArr[i4];
            C0037.m3874(byteBufferSink, bArr2, 0, bArr2.length);
        }
    }

    public byte[] getRootHashFromTree(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM1854 = C0023.m1854(C0031.m3032(byteBuffer), 0, 4096);
        MessageDigest messageDigestM2336 = C0026.m2336(this);
        C0018.m1067(messageDigestM2336);
        byte[] bArrM3248 = C0032.m3248(this);
        if (bArrM3248 != null) {
            C0063.m4423(messageDigestM2336, bArrM3248);
        }
        C0037.m3779(messageDigestM2336, byteBufferM1854);
        return C0033.m3355(messageDigestM2336);
    }

    public byte[] generateVerityTreeRootHash(DataSource dataSource) {
        return C0024.m1942(this, C0022.m1743(this, dataSource));
    }
}
