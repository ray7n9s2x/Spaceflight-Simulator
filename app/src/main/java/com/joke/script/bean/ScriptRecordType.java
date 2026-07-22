package com.joke.script.bean;

import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import java.io.Serializable;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public enum ScriptRecordType implements Serializable {
    CLICK(C0111.m13097(f217short, 0, 5, 1409)),
    SWIPE(C0035.m3603(f217short, 10, 5, 1691)),
    TEXT(C0026.m2321(f217short, 20, 16, 2678)),
    NUMBER(C0032.m3209(f217short, 40, 19, 3179));


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f217short = {1474, 1517, 1512, 1506, 1514, 2955, 2948, 2945, 2955, 2947, 1736, 1783, 1778, 1791, 1790, 2500, 2496, 2526, 2503, 2514, 2594, 2579, 2574, 2562, 2646, 2564, 2579, 2581, 2585, 2577, 2584, 2591, 2562, 2591, 2585, 2584, 1126, 1143, 1130, 1126, 3119, 3074, 3084, 3074, 3103, 3082, 3079, 3147, 3097, 3086, 3080, 3076, 3084, 3077, 3074, 3103, 3074, 3076, 3077, 2588, 2567, 2591, 2576, 2583, 2560};
    private String value;

    public String getValue() {
        return this.value;
    }

    ScriptRecordType(String str) {
        this.value = str;
    }
}
