package com.zfork.multiplatforms.android.bomb;

import android.animation.ValueAnimator;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;

/* JADX INFO: loaded from: classes3.dex */
public final class F0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ G0 a;

    public F0(G0 g0) {
        this.a = g0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iM2170 = C0025.m2170((Integer) C0026.m2357(valueAnimator));
        C0 c0M1965 = C0024.m1965(C0038.m3961(this));
        if (c0M1965 != null) {
            C0017.m929(c0M1965, iM2170);
        }
    }
}
