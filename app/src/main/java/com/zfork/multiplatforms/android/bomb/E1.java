package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0020;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0070;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class E1 extends AbstractC0384j {
    public int t;
    public int u;
    public byte[] v;
    public long w;
    public String x;

    /* JADX INFO: renamed from: ۡۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6921(Object obj) {
        if (C0063.m4427() > 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0384j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E1.class != C0030.m2951(obj) || !super.equals(obj)) {
            return false;
        }
        E1 e1 = (E1) obj;
        t5 t5VarM3013 = C0031.m3013(this);
        long jM1377 = t5VarM3013 != null ? C0020.m1377(t5VarM3013) : C0032.m3179(this);
        t5 t5VarM30132 = C0031.m3013(e1);
        return jM1377 == (t5VarM30132 != null ? C0020.m1377(t5VarM30132) : C0032.m3179(e1));
    }

    public final int hashCode() {
        String strM6428 = C0073.m6428(this);
        t5 t5VarM3013 = C0031.m3013(this);
        return m6921(new Object[]{strM6428, C0070.m5853(t5VarM3013 != null ? C0020.m1377(t5VarM3013) : C0032.m3179(this))});
    }

    public final String toString() {
        return C0073.m6428(this);
    }

    public E1() {
        this.a = 3;
    }
}
