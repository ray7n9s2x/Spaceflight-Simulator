package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class D3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f238short = {547, 530, 538, 513, 552, 687, 1144};
    public final Object a;
    public final Serializable b;

    /* JADX INFO: renamed from: ۟۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6919() {
        if (C0027.m2460() >= 0) {
            return f238short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D3) {
            D3 d3 = (D3) obj;
            Object objM6238 = C0072.m6238(d3);
            Object objM62382 = C0072.m6238(this);
            if ((objM62382 == null && objM6238 == null) || (objM62382 != null && C0023.m1865(objM62382, objM6238))) {
                Serializable serializableM6508 = C0074.m6508(this);
                Serializable serializableM65082 = C0074.m6508(d3);
                if ((serializableM6508 == null && serializableM65082 == null) || (serializableM6508 != null && C0023.m1865(serializableM6508, serializableM65082))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Serializable serializableM6508 = C0074.m6508(this);
        Object objM6238 = C0072.m6238(this);
        if (objM6238 == null) {
            if (serializableM6508 == null) {
                return 0;
            }
            return C0037.m3818(serializableM6508) + 1;
        }
        if (serializableM6508 == null) {
            return C0037.m3818(objM6238) + 2;
        }
        return C0037.m3818(serializableM6508) + (C0037.m3818(objM6238) * 17);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0070.m5942(m6919(), 0, 5, 627));
        C0036.m3741(sb, C0072.m6238(this));
        C0077.m7290(sb, C0026.m2321(m6919(), 5, 1, 643));
        C0036.m3741(sb, C0074.m6508(this));
        C0077.m7290(sb, C0067.m5418(m6919(), 6, 1, 1061));
        return C0068.m5536(sb);
    }

    public D3(Object obj, Serializable serializable) {
        this.a = obj;
        this.b = serializable;
    }
}
