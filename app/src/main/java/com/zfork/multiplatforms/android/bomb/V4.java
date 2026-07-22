package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: loaded from: classes3.dex */
public final class V4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f290short = {2774, 2720, 2741, 2737, 2785, 2725, 2720, 2806};
    public final String a;
    public int b;
    public int c;

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7014() {
        if (C0038.m4010() > 0) {
            return f290short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V4.class != C0030.m2951(obj)) {
            return false;
        }
        String strM5444 = C0067.m5444((V4) obj);
        String strM54442 = C0067.m5444(this);
        if (strM54442 == null) {
            if (strM5444 != null) {
                return false;
            }
        } else if (!C0070.m5838(strM54442, strM5444)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String strM5444 = C0067.m5444(this);
        return 31 + (strM5444 == null ? 0 : C0027.m2392(strM5444));
    }

    public final String toString() {
        return C0021.m1531(C0063.m4315(m7014(), 0, 8, 2693), new Object[]{C0021.m1548(C0072.m6138(this)), C0067.m5444(this)});
    }

    public V4(String str) {
        this.a = str;
    }
}
