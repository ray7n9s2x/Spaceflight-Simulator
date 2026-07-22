package com.android.apksig.internal.apk;

import com.android.apksig.C0037;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0036;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public enum ContentDigestAlgorithm {
    CHUNKED_SHA256(1, C0036.m3678(f49short, 0, 7, 1063), 32),
    CHUNKED_SHA512(2, C0032.m3209(f49short, 21, 7, 2467), 64),
    VERITY_CHUNKED_SHA256(3, C0111.m13097(f49short, 42, 7, 1772), 32),
    SHA256(4, C0037.m3829(f49short, 70, 7, 923), 32);


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f49short = {1140, 1135, 1126, 1034, 1045, 1042, 1041, 426, 417, 444, 423, 418, 428, 429, 438, 442, 417, 424, 475, 476, 479, 2544, 2539, 2530, 2446, 2454, 2450, 2449, 1887, 1876, 1865, 1874, 1879, 1881, 1880, 1859, 1871, 1876, 1885, 1833, 1837, 1838, 1727, 1700, 1709, 1729, 1758, 1753, 1754, 1399, 1380, 1395, 1384, 1397, 1400, 1406, 1378, 1385, 1396, 1391, 1386, 1380, 1381, 1406, 1394, 1385, 1376, 1299, 1300, 1303, 968, 979, 986, 950, 937, 942, 941, 2519, 2508, 2501, 2486, 2481, 2482};
    public final int a;
    public final String b;
    public final int c;

    public int getChunkDigestOutputSizeBytes() {
        return this.c;
    }

    public int getId() {
        return this.a;
    }

    public String getJcaMessageDigestAlgorithm() {
        return this.b;
    }

    ContentDigestAlgorithm(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
