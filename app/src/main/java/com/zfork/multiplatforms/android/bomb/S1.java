package com.zfork.multiplatforms.android.bomb;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class S1 implements View.OnTouchListener {
    public float a;
    public float b;
    public float c;
    public float d;
    public final boolean e;
    public final /* synthetic */ T1 f;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        L lM3367 = C0033.m3367();
        if (C0017.m871(lM3367)) {
            return true;
        }
        int iM2166 = C0025.m2166(motionEvent);
        if (iM2166 == 0) {
            AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(lM3367);
            List listM6198 = autoClickPlanBeanM1632 == null ? null : C0072.m6198(autoClickPlanBeanM1632);
            if (listM6198 != null && C0034.m3427(listM6198) > 0) {
                Iterator itM4732 = C0065.m4732(listM6198);
                while (C0036.m3657(itM4732)) {
                    C0071.m5962((T1) C0071.m6012(itM4732));
                }
            }
            this.a = C0022.m1701(motionEvent);
            this.b = C0016.m602(motionEvent);
            this.c = C0022.m1701(motionEvent);
            this.d = C0016.m602(motionEvent);
        } else if (iM2166 == 1) {
            int iM1701 = (int) (C0022.m1701(motionEvent) - C0026.m2260(this));
            int iM602 = (int) (C0016.m602(motionEvent) - C0027.m2515(this));
            if (C0038.m3989(iM1701) < 10 && C0038.m3989(iM602) < 10) {
                C0017.m829(view);
            }
        } else if (iM2166 == 2) {
            float fM1701 = C0022.m1701(motionEvent);
            float fM602 = C0016.m602(motionEvent);
            T1 t1M4552 = C0064.m4552(this);
            float fM6825 = C0075.m6825(t1M4552);
            if (fM1701 < fM6825) {
                fM1701 = fM6825;
            }
            float fM3133 = C0032.m3133(t1M4552);
            if (fM1701 > fM3133) {
                fM1701 = fM3133;
            }
            float fM7322 = C0078.m7322(t1M4552);
            if (fM602 < fM7322) {
                fM602 = fM7322;
            }
            float fM1910 = C0023.m1910(t1M4552);
            if (fM602 > fM1910) {
                fM602 = fM1910;
            }
            int iM3329 = C0033.m3329(fM1701 - C0068.m5639(this));
            int iM33292 = C0033.m3329(fM602 - C0019.m1273(this));
            if (C0032.m3245(this)) {
                WindowManager.LayoutParams layoutParamsM2191 = C0025.m2191(t1M4552);
                layoutParamsM2191.x = C0068.m5592(layoutParamsM2191) + iM3329;
                layoutParamsM2191.y = C0074.m6451(layoutParamsM2191) + iM33292;
                AutoClickPointerBean autoClickPointerBeanM4770 = C0065.m4770(t1M4552);
                if (autoClickPointerBeanM4770 != null) {
                    int iM6158 = C0072.m6158(autoClickPointerBeanM4770) + iM3329;
                    int iM4439 = C0063.m4439(C0065.m4770(t1M4552)) + iM33292;
                    C0072.m6169(C0065.m4770(t1M4552), iM6158);
                    C0022.m1781(C0065.m4770(t1M4552), iM4439);
                    C0071.m6083(C0065.m4770(t1M4552), C0032.m3133(t1M4552));
                    C0074.m6475(C0065.m4770(t1M4552), C0023.m1910(t1M4552));
                }
                try {
                    C0037.m3792(C0078.m7467(t1M4552), C0030.m2841(t1M4552), layoutParamsM2191);
                } catch (IllegalArgumentException e) {
                    C0033.m3347(e);
                }
                if (C0072.m6227(t1M4552) != null) {
                    C0077.m7167(t1M4552, layoutParamsM2191, true);
                }
            } else {
                WindowManager.LayoutParams layoutParamsM4085 = C0039.m4085(t1M4552);
                layoutParamsM4085.x = C0068.m5592(layoutParamsM4085) + iM3329;
                layoutParamsM4085.y = C0074.m6451(layoutParamsM4085) + iM33292;
                t1M4552.q = C0019.m1196(t1M4552) + iM3329;
                t1M4552.r = C0024.m2009(t1M4552) + iM33292;
                AutoClickPointerBean autoClickPointerBeanM47702 = C0065.m4770(t1M4552);
                if (autoClickPointerBeanM47702 != null) {
                    int iM6843 = C0075.m6843(autoClickPointerBeanM47702) + iM3329;
                    int iM5471 = C0067.m5471(C0065.m4770(t1M4552)) + iM33292;
                    C0028.m2617(C0065.m4770(t1M4552), iM6843);
                    C0066.m4874(C0065.m4770(t1M4552), iM5471);
                    C0078.m7420(C0065.m4770(t1M4552), C0032.m3133(t1M4552));
                    C0021.m1644(C0065.m4770(t1M4552), C0023.m1910(t1M4552));
                }
                try {
                    C0037.m3792(C0078.m7467(t1M4552), C0030.m2884(t1M4552), layoutParamsM4085);
                } catch (IllegalArgumentException e2) {
                    C0033.m3347(e2);
                }
                if (C0072.m6227(t1M4552) != null) {
                    C0077.m7167(t1M4552, layoutParamsM4085, false);
                }
            }
            this.a = fM1701;
            this.b = fM602;
            C0033.m3367().h = true;
        }
        return true;
    }

    public S1(T1 t1, boolean z) {
        this.f = t1;
        this.e = z;
    }
}
