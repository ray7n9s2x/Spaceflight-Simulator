package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickContentBean;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0468x0 implements InterfaceC0477y3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f373short = {2863, 2840, 2846, 2834, 2831, 2841, 2909, 2861, 2833, 2844, 2820, 2836, 2835, 2842, 2897, 2909, 2846, 2844, 2835, 2909, 2835, 2834, 2825, 2909, 2846, 2837, 2844, 2835, 2842, 2840, 2909, 2831, 2840, 2846, 2834, 2831, 2841, 2899, 2585, 2613, 2615, 2620, 2611, 2600, 2615, 2488, 2453, 2453, 2521, 2487, 2454, 2461, 2460, 2521, 2479, 2456, 2453, 2444, 2460, 2521, 2446, 2448, 2453, 2453, 2521, 2459, 2460, 2521, 2453, 2454, 2442, 2445, 2521, 2456, 2463, 2445, 2460, 2443, 2521, 2461, 2460, 2453, 2460, 2445, 2460, 2517, 2521, 2490, 2454, 2455, 2463, 2448, 2443, 2452, 2521, 2493, 2460, 2453, 2460, 2445, 2460, 2502, 1890, 1877, 1875, 1887, 1858, 1876, 1808, 1888, 1884, 1873, 1865, 1881, 1886, 1879, 1820, 1808, 1875, 1873, 1886, 1808, 1886, 1887, 1860, 1808, 1875, 1880, 1873, 1886, 1879, 1877, 1808, 1858, 1877, 1875, 1887, 1858, 1876, 1822};
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ C0479z c;

    public /* synthetic */ C0468x0(C0479z c0479z, Context context, int i) {
        this.a = i;
        this.c = c0479z;
        this.b = context;
    }

    /* JADX INFO: renamed from: ۥۧۢۢ, reason: contains not printable characters */
    public static short[] m7138() {
        if (C0017.m846() > 0) {
            return f373short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0477y3
    public final void a(Object obj) {
        boolean z;
        switch (C0021.m1562(this)) {
            case 0:
                boolean zM871 = C0017.m871(C0033.m3367());
                Context contextM2246 = C0026.m2246(this);
                if (!zM871) {
                    C0039.m4089(C0078.m7358(this), contextM2246);
                } else {
                    C0030.m2968(C0023.m1884(contextM2246, C0023.m1904(m7138(), 102, 38, 1840), 0));
                }
                break;
            case 1:
                Long l = (Long) obj;
                if (C0036.m3700(C0038.m4007()) != null) {
                    Activity activityM3700 = C0036.m3700(C0038.m4007());
                    C0474y0 c0474y0 = new C0474y0(this, C0026.m2246(this), l, 0);
                    C0029.m2786(C0032.m3123(activityM3700, C0076.m6902(m7138(), 45, 57, 2553), C0032.m3209(m7138(), 38, 7, 2650), c0474y0));
                }
                break;
            default:
                AutoClickPlanBean autoClickPlanBean = (AutoClickPlanBean) obj;
                L lM3367 = C0033.m3367();
                boolean zM8712 = C0017.m871(lM3367);
                Context contextM22462 = C0026.m2246(this);
                if (zM8712) {
                    C0030.m2968(C0023.m1884(contextM22462, C0028.m2609(m7138(), 0, 38, 2941), 0));
                    break;
                } else {
                    C0479z c0479zM7358 = C0078.m7358(this);
                    if (autoClickPlanBean != null) {
                        C0031.m3098(lM3367);
                        C0020.m1350(autoClickPlanBean);
                        AutoClickContentBean autoClickContentBean = (AutoClickContentBean) C0078.m7413(C0029.m2780(autoClickPlanBean), AutoClickContentBean.class);
                        boolean z2 = true;
                        if (C0038.m3939(C0064.m4632(autoClickPlanBean)) || C0070.m5838(C0064.m4632(autoClickPlanBean), C0075.m6864(autoClickContentBean))) {
                            z = false;
                        } else {
                            C0018.m987(autoClickPlanBean, C0075.m6864(autoClickContentBean));
                            z = true;
                        }
                        if (C0038.m3952(autoClickPlanBean) != C0036.m3731(autoClickContentBean)) {
                            C0032.m3241(autoClickPlanBean, C0036.m3731(autoClickContentBean));
                            z = true;
                        }
                        if (C0016.m673(autoClickPlanBean) != C0034.m3411(autoClickContentBean)) {
                            C0032.m3193(autoClickPlanBean, C0034.m3411(autoClickContentBean));
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            C0038.m3969(C0078.m7371(lM3367), C0070.m5853(C0065.m4764(autoClickPlanBean)), autoClickPlanBean);
                        }
                        List listM2265 = C0026.m2265(autoClickContentBean);
                        if (listM2265 != null) {
                            Iterator itM4732 = C0065.m4732(listM2265);
                            while (C0036.m3657(itM4732)) {
                                AutoClickPointerBean autoClickPointerBean = (AutoClickPointerBean) C0071.m6012(itM4732);
                                C0030.m2951(C0033.m3367());
                                C0063.m4316(autoClickPlanBean, autoClickPointerBean);
                            }
                        }
                        LinkedHashMap linkedHashMapM7371 = C0078.m7371(C0033.m3367());
                        Iterator itM2001 = C0024.m2001(C0074.m6455(linkedHashMapM7371));
                        while (C0036.m3657(itM2001)) {
                            Long l2 = (Long) C0071.m6012(itM2001);
                            C0030.m2951(l2);
                            AutoClickPlanBean autoClickPlanBean2 = (AutoClickPlanBean) C0067.m5420(linkedHashMapM7371, l2);
                            if (autoClickPlanBean2 != null) {
                                C0019.m1208(autoClickPlanBean2, false);
                            }
                        }
                        C0444t0 c0444t0 = (C0444t0) C0023.m1892(c0479zM7358);
                        if (c0444t0 != null) {
                            C0073.m6383(c0444t0);
                        }
                        C0016.m709(c0479zM7358, contextM22462, autoClickPlanBean);
                        break;
                    }
                }
                break;
        }
    }
}
