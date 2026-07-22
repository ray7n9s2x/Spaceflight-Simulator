package com.zfork.multiplatforms.android.bomb;

import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0384j extends B5 {
    public int b;
    public byte[] c;
    public int d;
    public long e;
    public int i;
    public int j;
    public String k;
    public boolean l;
    public boolean n;
    public t5 o;
    public C0337c p;
    public boolean q;
    public List r;
    public boolean s;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public int m = 1;

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AbstractC0384j)) {
            return C0070.m5838(C0073.m6428(this), C0073.m6428((AbstractC0384j) obj));
        }
        return false;
    }
}
