package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.pkcs7.C0026;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Q {
    public int a;
    public IntBuffer b;
    public int c;
    public int d;
    public int e;
    public ByteBuffer f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public String[] l;
    public int m;
    public int n;

    public final String a(int i) {
        int iM2354 = C0026.m2354(C0017.m849(this), (i * 5) + 2);
        if (iM2354 >= 0) {
            return C0078.m7455(this)[iM2354];
        }
        return null;
    }
}
