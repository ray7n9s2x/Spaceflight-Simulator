package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.view.View;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0070;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC0480z0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f378short = {2492, 2449, 2449, 2525, 2483, 2450, 2457, 2456, 2525, 2475, 2460, 2449, 2440, 2456, 2525, 2442, 2452, 2449, 2449, 2525, 2463, 2456, 2525, 2449, 2450, 2446, 2441, 2525, 2460, 2459, 2441, 2456, 2447, 2525, 2457, 2456, 2449, 2456, 2441, 2456, 2513, 2525, 2494, 2450, 2451, 2459, 2452, 2447, 2448, 2525, 2489, 2456, 2449, 2456, 2441, 2456, 2498, 691, 671, 669, 662, 665, 642, 669};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnClickListenerC0480z0(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7147() {
        if (C0070.m5903() >= 0) {
            return f378short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0037.m3855(this)) {
            case 0:
                AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(C0033.m3367());
                if (autoClickPlanBeanM1632 != null) {
                    C0028.m2634((C0479z) C0018.m993(this), (Context) C0070.m5886(this), C0065.m4764(autoClickPlanBeanM1632));
                }
                break;
            default:
                if (C0036.m3700(C0038.m4007()) != null) {
                    C0029.m2786(C0032.m3123(C0036.m3700(C0038.m4007()), C0033.m3330(m7147(), 0, 57, 2557), C0025.m2151(m7147(), 57, 7, 752), new C0474y0(this, (DialogC0373h0) C0070.m5886(this), view, 2)));
                }
                break;
        }
    }
}
