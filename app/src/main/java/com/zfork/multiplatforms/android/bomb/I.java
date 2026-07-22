package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ T1 b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ I(T1 t1, Activity activity, int i) {
        this.a = i;
        this.b = t1;
        this.c = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0071.m6004(this)) {
            case 0:
                AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(C0033.m3367());
                List listM6198 = autoClickPlanBeanM1632 == null ? null : C0072.m6198(autoClickPlanBeanM1632);
                if (listM6198 != null && C0034.m3427(listM6198) > 0) {
                    Iterator itM4732 = C0065.m4732(listM6198);
                    while (C0036.m3657(itM4732)) {
                        C0071.m5962((T1) C0071.m6012(itM4732));
                    }
                }
                C0029.m2698(C0026.m2318(this), C0025.m2171(this), view);
                break;
            default:
                AutoClickPlanBean autoClickPlanBeanM16322 = C0021.m1632(C0033.m3367());
                List listM61982 = autoClickPlanBeanM16322 == null ? null : C0072.m6198(autoClickPlanBeanM16322);
                if (listM61982 != null && C0034.m3427(listM61982) > 0) {
                    Iterator itM47322 = C0065.m4732(listM61982);
                    while (C0036.m3657(itM47322)) {
                        C0071.m5962((T1) C0071.m6012(itM47322));
                    }
                }
                C0029.m2698(C0026.m2318(this), C0025.m2171(this), view);
                break;
        }
    }
}
