package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.security.Provider;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0443t {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f360short = {1769, 1765, 1764, 1772, 1763, 1773, 1791, 1784, 1775, 1321, 1312, 1314, 1347, 1331, 1297, 1292, 1301, 1290, 1287, 1286, 1297, 1347, 1280, 1295, 1282, 1296, 1296, 1347, 2279, 2217, 2216, 2227, 2279, 2228, 2226, 2213, 2212, 2219, 2214, 2228, 2228, 2279, 2216, 2209, 2279, 2217, 2208, 2210, 2243, 2227, 2193, 2188, 2197, 2186, 2183, 2182, 2193, 2243, 2176, 2191, 2178, 2192, 2192, 2243, 2189, 2178, 2190, 2182, 2243, 2251, 2254, 2254, 2195, 2193, 2188, 2197, 2186, 2183, 2182, 2193, 2254, 2176, 2191, 2178, 2192, 2192, 2250, 2243, 2190, 2198, 2192, 2199, 2243, 2177, 2182, 2243, 2192, 2195, 2182, 2176, 2186, 2181, 2186, 2182, 2183};
    public String a;
    public String b;
    public Integer c;

    public static void b(C0443t c0443t) {
        Provider provider;
        String strM3910 = C0037.m3910(c0443t);
        if (strM3910 == null) {
            throw new E3(C0066.m4828(m7116(), 45, 60, 2275));
        }
        Class clsM4101 = C0039.m4101(strM3910);
        if (!C0031.m2999(Provider.class, clsM4101)) {
            StringBuilder sb = new StringBuilder(C0075.m6791(m7116(), 9, 19, 1379));
            C0036.m3741(sb, clsM4101);
            C0077.m7290(sb, C0016.m625(m7116(), 28, 17, 2247));
            C0077.m7290(sb, C0038.m3997(Provider.class));
            throw new E3(C0068.m5536(sb));
        }
        if (C0067.m5472(c0443t) != null) {
            try {
                provider = (Provider) C0019.m1220(C0066.m4883(clsM4101, new Class[]{String.class}), new Object[]{C0067.m5472(c0443t)});
            } catch (NoSuchMethodException unused) {
                provider = (Provider) C0070.m5924(C0029.m2690(clsM4101, C0031.m3047(m7116(), 0, 9, 1674), new Class[]{String.class}), (Provider) C0019.m1220(C0066.m4883(clsM4101, null), null), new Object[]{C0067.m5472(c0443t)});
            }
        } else {
            provider = (Provider) C0019.m1220(C0066.m4883(clsM4101, null), null);
        }
        Integer numM6867 = C0075.m6867(c0443t);
        if (numM6867 == null) {
            C0025.m2211(provider);
        } else {
            C0027.m2411(provider, C0025.m2170(numM6867));
        }
    }

    /* JADX INFO: renamed from: ۦۢۧۨ, reason: contains not printable characters */
    public static short[] m7116() {
        if (C0074.m6454() <= 0) {
            return f360short;
        }
        return null;
    }

    public static boolean a(C0443t c0443t) {
        return C0037.m3910(c0443t) == null && C0067.m5472(c0443t) == null && C0075.m6867(c0443t) == null;
    }
}
