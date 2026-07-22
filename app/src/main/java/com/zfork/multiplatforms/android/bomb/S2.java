package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class S2 extends C0369g3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f280short = {3032, 3038, 3016, 3038, 2944, 3037, 3016, 3039, 3008, 3012, 3038, 3038, 3012, 3010, 3011, 1174, 1159, 1159, 1179, 1182, 1172, 1174, 1155, 1182, 1176, 1177, 1818, 1820, 1802, 1820, 1858, 1820, 1803, 1796, 2382, 2395, 2380, 2387, 2391, 2381, 2381, 2391, 2385, 2384, 3050, 3052, 3066, 3052, 2994, 3055, 3066, 3053, 3058, 3062, 3052, 3052, 3062, 3056, 3057};
    public C0362f3 e;
    public ArrayList f;
    public C0324a0 g;

    /* JADX INFO: renamed from: ۟۠۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m7003(Object obj) {
        if (C0028.m2593() > 0) {
            return Objects.toString(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7004() {
        if (C0027.m2460() >= 0) {
            return f280short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final AbstractC0441s3 b(String str, String str2) {
        C0362f3 c0362f3M2177 = C0025.m2177(this);
        String strM7205 = C0077.m7205(m7004(), 0, 15, 2989);
        if (str != null && C0070.m5838(strM7205, str2)) {
            AbstractC0441s3 abstractC0441s3B = super.b(null, strM7205);
            C0030.m2951(c0362f3M2177);
            return new A(abstractC0441s3B, null, str);
        }
        AbstractC0441s3 abstractC0441s3B2 = super.b(str, str2);
        if (C0070.m5838(C0065.m4757(m7004(), 15, 11, 1271), str2)) {
            ArrayList arrayListM6061 = C0071.m6061(c0362f3M2177);
            ArrayList arrayListM3951 = C0038.m3951(c0362f3M2177);
            ArrayList arrayListM1455 = C0020.m1455(c0362f3M2177);
            C0450u0 c0450u0M3063 = C0031.m3063(c0362f3M2177);
            B b = new B(abstractC0441s3B2, arrayListM6061, false);
            b.e = arrayListM3951;
            b.f = arrayListM1455;
            b.h = c0450u0M3063;
            return b;
        }
        if (C0070.m5838(C0063.m4315(m7004(), 26, 8, 1903), str2)) {
            return new C0369g3(abstractC0441s3B2, C0037.m3915(c0362f3M2177), false);
        }
        if (!C0070.m5838(strM7205, str2)) {
            if (!C0070.m5838(C0036.m3678(m7004(), 34, 10, 2366), str2)) {
                return abstractC0441s3B2;
            }
            C0030.m2951(c0362f3M2177);
            return new S(abstractC0441s3B2);
        }
        if (C0024.m1943(this) == null) {
            this.g = new C0324a0(8, this);
        }
        C0324a0 c0324a0M1943 = C0024.m1943(this);
        C0030.m2951(c0362f3M2177);
        return new A(abstractC0441s3B2, c0324a0M1943, null);
    }

    @Override // com.zfork.multiplatforms.android.bomb.C0369g3, com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void c() {
        ArrayList arrayListM1325 = C0020.m1325(C0025.m2177(this));
        if (arrayListM1325 != null && !C0066.m4881(arrayListM1325)) {
            Iterator itM4154 = C0039.m4154(arrayListM1325);
            while (C0036.m3657(itM4154)) {
                String str = (String) C0071.m6012(itM4154);
                if (!C0068.m5561(C0068.m5675(this), str)) {
                    C0077.m7251(this, str, C0065.m4757(m7004(), 44, 15, 2975));
                }
            }
        }
        super.c();
    }

    @Override // com.zfork.multiplatforms.android.bomb.C0369g3, com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void a(String str, String str2, int i, int i2, Object obj) {
        m7003(obj);
        super.a(str, str2, i, i2, obj);
    }
}
