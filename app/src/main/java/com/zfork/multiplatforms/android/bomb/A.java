package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC0441s3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f227short = {2495, 2480, 2492, 2484, 2262, 2250, 2250, 2254, 2180, 2193, 2193, 2253, 2269, 2262, 2267, 2259, 2271, 2253, 2192, 2271, 2256, 2266, 2252, 2257, 2263, 2266, 2192, 2269, 2257, 2259, 2193, 2271, 2254, 2261, 2193, 2252, 2267, 2253, 2193, 2271, 2256, 2266, 2252, 2257, 2263, 2266, 1880, 1879, 1883, 1875, 1759, 1738, 1757, 1730, 1734, 1756, 1756, 1734, 1728, 1729, 3077, 3090, 3094, 3091, 3111, 3090, 3077, 3098, 3102, 3076, 3076, 3102, 3096, 3097, 840, 845, 854, 843, 858, 879, 858, 845, 850, 854, 844, 844, 854, 848, 849, 2073, 2061, 2060, 2064, 2071, 2058, 2065, 2060, 2065, 2077, 2059, 1261, 1248, 1251, 1252, 1261};
    public final /* synthetic */ int b = 1;
    public final Object c;

    public A(AbstractC0441s3 abstractC0441s3, C0324a0 c0324a0, String str) {
        super(abstractC0441s3);
        this.c = c0324a0;
        if (str == null || C0077.m7292(str)) {
            return;
        }
        String strM7205 = C0077.m7205(m6904(), 0, 4, 2513);
        G g = new G(strM7205, str);
        super.a(C0023.m1904(m6904(), 4, 42, 2238), strM7205, C0065.m4786(g), C0065.m4683(g), str);
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6904() {
        if (C0024.m2011() < 0) {
            return f227short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void a(String str, String str2, int i, int i2, Object obj) {
        C0324a0 c0324a0;
        Object objM2489 = obj;
        switch (C0026.m2237(this)) {
            case 0:
                if (objM2489 instanceof String) {
                    if (!C0070.m5838(str2, C0023.m1904(m6904(), 50, 10, 1711)) && !C0070.m5838(str2, C0069.m5807(m6904(), 60, 14, 3191))) {
                        C0070.m5838(str2, C0070.m5942(m6904(), 74, 15, 831));
                    }
                    C0070.m5838(C0018.m1070(m6904(), 89, 11, 2168), str2);
                    C0450u0 c0450u0 = (C0450u0) C0028.m2626(this);
                    if (c0450u0 != null && C0070.m5838(C0020.m1443(m6904(), 100, 5, 1153), str2)) {
                        objM2489 = (String) objM2489;
                        T2 t2 = (T2) C0026.m2297(c0450u0);
                        C0030.m2951(t2);
                        if (C0070.m5838((String) C0020.m1329(c0450u0), objM2489)) {
                            objM2489 = C0027.m2489(t2);
                        }
                    }
                }
                super.a(str, str2, i, i2, objM2489);
                break;
            default:
                if ((objM2489 instanceof String) && (c0324a0 = (C0324a0) C0028.m2626(this)) != null) {
                    C0070.m5838(C0034.m3431(m6904(), 46, 4, 1846), str2);
                    String str3 = (String) objM2489;
                    ArrayList arrayListM5675 = C0068.m5675((S2) C0077.m7201(c0324a0));
                    if (!C0068.m5561(arrayListM5675, str3)) {
                        C0017.m919(arrayListM5675, str3);
                    }
                }
                super.a(str, str2, i, i2, objM2489);
                break;
        }
    }

    public A(AbstractC0441s3 abstractC0441s3, C0450u0 c0450u0) {
        super(abstractC0441s3);
        this.c = c0450u0;
    }
}
