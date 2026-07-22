package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f236short = {2773, 2794, 2815, 2792, 2811, 2798, 2803, 2805, 2804, 2746, 2793, 2799, 2809, 2809, 2815, 2793, 2793, 2740, 2076, 2109, 2096, 2097, 514, 564, 558, 635, 556, 562, 567, 567, 635, 565, 564, 635, 567, 564, 565, 572, 574, 553, 635, 552, 574, 574, 635, 559, 563, 574, 635, 573, 567, 564, 570, 559, 562, 565, 572, 635, 569, 570, 567, 567, 635, 558, 565, 567, 574, 552, 552, 635, 546, 564, 558, 635, 553, 574, 567, 570, 558, 565, 568, 563, 635, 559, 563, 574, 635, 572, 570, 566, 574};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ D0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6917() {
        if (C0111.m13165() < 0) {
            return f236short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        String strM2993 = C0031.m2993();
        Object objM7312 = C0078.m7312(this);
        switch (C0035.m3628(this)) {
            case 0:
                G0 g0 = (G0) objM7312;
                C0030.m2951(g0);
                Activity activityM3700 = C0036.m3700(C0038.m4007());
                if (activityM3700 == null) {
                    g0.i = false;
                    C0034.m3412(g0);
                    break;
                } else if (!C0016.m610(activityM3700) && !C0074.m6509(activityM3700)) {
                    g0.i = true;
                    DialogC0421p0 dialogC0421p0M7361 = C0078.m7361(activityM3700, 4, false);
                    C0072.m6136(dialogC0421p0M7361);
                    C0027.m2463(dialogC0421p0M7361, C0069.m5807(m6917(), 18, 4, 2132));
                    C0019.m1180(C0029.m2784(dialogC0421p0M7361), C0017.m942(C0018.m1070(m6917(), 22, 69, 603)));
                    dialogC0421p0M7361.o = new C0450u0(g0, activityM3700, i);
                    C0029.m2786(dialogC0421p0M7361);
                    break;
                }
                break;
            case 1:
                C0030.m2951((C0457v1) objM7312);
                C0469x1 c0469x1M2740 = C0029.m2740();
                C0069.m5769(c0469x1M2740, C0064.m4498(c0469x1M2740));
                break;
            case 2:
                C0077.m7242();
                C0067.m5522((MetaSelectAppAbility) objM7312, strM2993);
                break;
            case 3:
                C0348d3 c0348d3M2095 = C0025.m2095((C0341c3) objM7312);
                try {
                    c0348d3M2095.f = false;
                    if (C0026.m2269(c0348d3M2095) != null) {
                        C0063.m4382(C0075.m6859(c0348d3M2095), 0);
                        C0063.m4382(C0026.m2269(c0348d3M2095), 8);
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                C0344d c0344d = (C0344d) objM7312;
                C0031.m3055();
                try {
                    C0019.m1180(C0035.m3580(c0344d), strM2993);
                    C0019.m1180(C0023.m1900(c0344d), strM2993);
                    C0019.m1180(C0019.m1240(c0344d), C0077.m7205(m6917(), 0, 18, 2714));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
