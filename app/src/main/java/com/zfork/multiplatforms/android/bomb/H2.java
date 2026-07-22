package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class H2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f252short = {1636, 1656, 1656, 1660, 1663, 1590, 1571, 1571, 1633, 1635, 1640, 1645, 1660, 1639, 1642, 1645, 1634, 1663, 1570, 1647, 1635, 1633, 1571, 1659, 1641, 1646, 1619, 1642, 1637, 1632, 1641, 1663, 1571, 1645, 1660, 1660, 1608, 1635, 1659, 1634, 1635, 1645, 1640, 1570, 1656, 1652, 1656};
    public final /* synthetic */ J2 a;

    /* JADX INFO: renamed from: ۟ۡۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6939() {
        if (C0016.m717() < 0) {
            return f252short;
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        J2 j2M4816 = C0066.m4816(this);
        try {
            ArrayList arrayListM3583 = C0035.m3583(j2M4816);
            if (!C0068.m5561(arrayListM3583, activity)) {
                C0017.m919(arrayListM3583, activity);
            }
            if (C0027.m2493(j2M4816)) {
                T tM2649 = C0028.m2649();
                boolean zM4525 = C0064.m4525((HashSet) C0077.m7245(tM2649), C0038.m3997(C0030.m2951(activity)));
                C0038.m4054((HashSet) C0077.m7245(tM2649));
                if (zM4525) {
                    C0030.m2918(activity);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            C0078.m7411(C0035.m3583(C0066.m4816(this)), activity);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0469x1 c0469x1M2740;
        DialogC0445t1 dialogC0445t1M3185;
        J2 j2M4816 = C0066.m4816(this);
        try {
            if ((C0031.m3066(j2M4816) || C0022.m1740(j2M4816) || C0075.m6830(j2M4816)) && C0034.m3394(j2M4816) != null) {
                ArrayList arrayListM2889 = C0030.m2889(C0038.m4007());
                if (C0068.m5561(arrayListM2889, activity)) {
                    C0078.m7411(arrayListM2889, activity);
                }
                ArrayList arrayList = (ArrayList) C0077.m7207(C0028.m2666());
                if (C0068.m5561(arrayList, activity)) {
                    C0078.m7411(arrayList, activity);
                }
                C0034.m3412(C0034.m3394(j2M4816));
                j2M4816.h = null;
            }
            if (C0031.m2978(j2M4816) && (dialogC0445t1M3185 = C0032.m3185((c0469x1M2740 = C0029.m2740()))) != null && C0036.m3676(dialogC0445t1M3185)) {
                C0020.m1338(C0032.m3185(c0469x1M2740));
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        J2 j2M4816 = C0066.m4816(this);
        try {
            C0030.m2951(activity);
            if ((C0031.m3066(j2M4816) || C0022.m1740(j2M4816) || C0075.m6830(j2M4816)) && C0034.m3394(j2M4816) == null) {
                C0034.m3441(C0024.m2031(), activity);
                C0402m c0402mM4007 = C0038.m4007();
                C0030.m2951(c0402mM4007);
                C0324a0 c0324a0 = (C0324a0) C0064.m4580(C0063.m4409());
                if (c0324a0 != null) {
                    C0033.m3278(c0324a0, activity);
                }
                ArrayList arrayListM2889 = C0030.m2889(c0402mM4007);
                if (!C0068.m5561(arrayListM2889, activity)) {
                    C0017.m919(arrayListM2889, activity);
                }
                ArrayList arrayList = (ArrayList) C0077.m7207(C0028.m2666());
                if (!C0068.m5561(arrayList, activity)) {
                    C0017.m919(arrayList, activity);
                }
                G0 g0 = new G0(activity, C0031.m3066(j2M4816), C0022.m1740(j2M4816), C0075.m6830(j2M4816));
                j2M4816.h = g0;
                C0072.m6133(g0);
            }
            if (C0031.m2978(j2M4816)) {
                C0469x1 c0469x1M2740 = C0029.m2740();
                CloudBean cloudBeanM4498 = C0064.m4498(c0469x1M2740);
                if (cloudBeanM4498 == null) {
                    C0063.m4410(C0025.m2151(m6939(), 0, 47, 1548), new n5(new C0451u1(0), 0));
                } else {
                    if (C0071.m6044(c0469x1M2740)) {
                        return;
                    }
                    C0024.m1979(c0469x1M2740, C0033.m3345(cloudBeanM4498), new C0451u1(1));
                }
            }
        } catch (Exception unused) {
        }
    }

    public H2(J2 j2) {
        this.a = j2;
    }
}
