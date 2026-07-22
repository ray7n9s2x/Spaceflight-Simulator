package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.util.C0031;
import com.google.common.base.Ascii;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0440s2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f359short = {1258, 1259, 1256, 1257, 1262, 1263, 1260, 1261, 1250, 1251, 1211, 1208, 1209, 1214, 1215, 1212};
    public static final char[] a = C0031.m2984(C0020.m1443(m7115(), 0, 16, 1242));

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArrM1705 = C0022.m1705();
            C0077.m7289(sb, cArrM1705[(b >>> 4) & 15]);
            C0077.m7289(sb, cArrM1705[b & Ascii.SI]);
        }
        return C0068.m5536(sb);
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7115() {
        if (C0072.m6216() >= 0) {
            return f359short;
        }
        return null;
    }
}
