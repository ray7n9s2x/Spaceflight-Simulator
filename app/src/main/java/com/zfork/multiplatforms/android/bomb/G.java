package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f244short = {2768, 2754, 2754, 2772, 2757, 2754, 2718, 2753, 2756, 2771, 2781, 2776, 2770, 2719, 2761, 2780, 2781};
    public final String a;
    public int b = -1;
    public int c = 0;
    public final Object d;

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6929() {
        if (C0024.m2011() < 0) {
            return f244short;
        }
        return null;
    }

    public final int a() {
        int iM2170;
        InputStream inputStreamM2886;
        String strM2438;
        int iM3095 = C0031.m3095(this);
        if (iM3095 > 0) {
            return iM3095;
        }
        HashMap mapM4835 = C0066.m4835();
        String strM4363 = C0063.m4363(this);
        Integer num = (Integer) C0067.m5420(mapM4835, strM4363);
        if (num == null || C0025.m2170(num) <= 0) {
            try {
                String strM5544 = C0068.m5544(m6929(), 0, 17, 2737);
                ClassLoader classLoaderM1337 = C0020.m1337(o5.class);
                inputStreamM2886 = classLoaderM1337 != null ? C0030.m2886(classLoaderM1337, strM5544) : null;
                try {
                    strM2438 = C0027.m2438(inputStreamM2886, strM4363);
                } finally {
                }
            } catch (Exception unused) {
            }
            if (strM2438 != null) {
                int iM2721 = C0029.m2721(C0071.m6056(strM2438, 2), 16);
                C0038.m3969(mapM4835, strM4363, C0021.m1548(iM2721));
                if (inputStreamM2886 != null) {
                    C0024.m1958(inputStreamM2886);
                }
                iM2170 = iM2721;
            } else {
                if (inputStreamM2886 != null) {
                    C0024.m1958(inputStreamM2886);
                }
                iM2170 = -1;
            }
            iM2170 = -1;
        } else {
            iM2170 = C0025.m2170(num);
        }
        this.b = iM2170;
        return iM2170;
    }

    public final int b() {
        if (C0066.m4809(this) == 0) {
            Object objM6532 = C0074.m6532(this);
            if (objM6532 instanceof String) {
                this.c = 3;
            } else if (objM6532 instanceof Boolean) {
                this.c = 18;
            }
        }
        return C0066.m4809(this);
    }

    public G(String str, Object obj) {
        this.a = str;
        this.d = obj;
    }
}
