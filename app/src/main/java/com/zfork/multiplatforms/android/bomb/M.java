package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ O c;

    public /* synthetic */ M(O o, int i, int i2) {
        this.a = i2;
        this.c = o;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0038.m3994(this)) {
            case 0:
                O oM1934 = C0024.m1934(this);
                C0408n c0408nM7377 = C0078.m7377(oM1934);
                if (c0408nM7377 != null) {
                    C0065.m4724(c0408nM7377, C0070.m5853(C0065.m4764((AutoClickPlanBean) C0071.m6078(C0030.m2913(oM1934), C0069.m5723(this)))));
                }
                break;
            default:
                O oM19342 = C0024.m1934(this);
                T tM7315 = C0078.m7315(oM19342);
                if (tM7315 != null) {
                    C0029.m2758(tM7315, (AutoClickPlanBean) C0071.m6078(C0030.m2913(oM19342), C0069.m5723(this)));
                }
                break;
        }
    }
}
