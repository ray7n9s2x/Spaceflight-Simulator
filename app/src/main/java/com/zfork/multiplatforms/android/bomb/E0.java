package com.zfork.multiplatforms.android.bomb;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;

/* JADX INFO: loaded from: classes3.dex */
public final class E0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ E0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public E0(V0 v0, Q3 q3, String str) {
        this.a = 1;
        this.b = v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout linearLayoutM2658;
        switch (C0066.m4823(this)) {
            case 0:
                G0 g0 = (G0) C0068.m5610(this);
                C0 c0M1965 = C0024.m1965(g0);
                if (c0M1965 != null && (linearLayoutM2658 = C0028.m2658(g0)) != null && !C0030.m2969(c0M1965)) {
                    ValueAnimator valueAnimatorM2643 = C0028.m2643(new int[]{0, (C0068.m5592(C0018.m1015(g0)) < (C0024.m2075(g0) / 2) - (C0023.m1829(C0039.m4105(linearLayoutM2658)) / 2) ? -C0073.m6402(C0028.m2658(g0)) : C0073.m6402(C0028.m2658(g0))) / 2});
                    C0064.m4541(valueAnimatorM2643, 800L);
                    C0039.m4122(valueAnimatorM2643, new F0(g0));
                    C0027.m2424(valueAnimatorM2643);
                }
                break;
            case 1:
                C0027.m2402((V0) C0068.m5610(this));
                break;
            default:
                K1 k1 = (K1) C0068.m5610(this);
                I1 i1M5935 = C0070.m5935(C0035.m3627(k1));
                if (i1M5935 != null) {
                    C0017.m912(i1M5935, false);
                    O1 o1M3627 = C0035.m3627(k1);
                    C0063.m4312(o1M3627, C0025.m2140(C0070.m5935(o1M3627)));
                }
                break;
        }
    }
}
