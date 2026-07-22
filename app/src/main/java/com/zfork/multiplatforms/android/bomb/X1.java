package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.MotionEvent;
import androidx.core.view.InputDeviceCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptTouchBean;
import java.util.Random;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X1 implements Runnable {
    public final /* synthetic */ C0361f2 a;
    public final /* synthetic */ ScriptActionBean b;
    public final /* synthetic */ ScriptTouchBean c;
    public final /* synthetic */ Activity d;

    public /* synthetic */ X1(C0361f2 c0361f2, ScriptActionBean scriptActionBean, ScriptTouchBean scriptTouchBean, Activity activity) {
        this.a = c0361f2;
        this.b = scriptActionBean;
        this.c = scriptTouchBean;
        this.d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0361f2 c0361f2M3632 = C0035.m3632(this);
        C0030.m2951(c0361f2M3632);
        Random random = new Random();
        ScriptActionBean scriptActionBeanM3019 = C0031.m3019(this);
        int iM3176 = C0032.m3176(random, C0020.m1440(scriptActionBeanM3019));
        boolean z = C0032.m3176(new Random(), 10) % 2 == 0;
        ScriptTouchBean scriptTouchBeanM1294 = C0019.m1294(this);
        float fM4773 = C0065.m4773(scriptTouchBeanM1294);
        float f = iM3176;
        float f2 = z ? fM4773 + f : fM4773 - f;
        float fM13158 = z ? C0111.m13158(scriptTouchBeanM1294) + iM3176 : C0111.m13158(scriptTouchBeanM1294) - iM3176;
        int[] iArrM6139 = C0072.m6139(c0361f2M3632);
        if (iArrM6139 != null && iArrM6139.length == 2) {
            f2 -= iArrM6139[0];
            fM13158 -= iArrM6139[1];
        }
        long jM6236 = C0072.m6236();
        float f3 = f2;
        float f4 = fM13158;
        MotionEvent motionEventM2803 = C0029.m2803(jM6236, jM6236, 0, f3, f4, C0037.m3917(scriptTouchBeanM1294));
        long jM1210 = jM6236 + C0019.m1210(scriptActionBeanM3019);
        MotionEvent motionEventM28032 = C0029.m2803(jM1210, jM1210, 1, f3, f4, C0037.m3917(scriptTouchBeanM1294));
        C0070.m5872(motionEventM2803, InputDeviceCompat.SOURCE_TOUCHSCREEN);
        C0070.m5872(motionEventM28032, InputDeviceCompat.SOURCE_TOUCHSCREEN);
        String strM1028 = C0018.m1028(c0361f2M3632);
        Activity activityM3442 = C0034.m3442(this);
        if (strM1028 == null || C0070.m5838(strM1028, C0078.m7385(activityM3442))) {
            C0016.m693(C0027.m2524(activityM3442), motionEventM2803);
            C0016.m693(C0027.m2524(activityM3442), motionEventM28032);
        }
        if (C0026.m2341(c0361f2M3632)) {
            C0425p4 c0425p4M1859 = C0023.m1859(c0361f2M3632);
            int i = (int) fM13158;
            Z4 z4M1818 = C0023.m1818(c0425p4M1859);
            C0024.m2016(z4M1818, (int) f2, i);
            C0038.m3967(z4M1818).c = true;
            C0037.m3851(c0425p4M1859);
        }
    }
}
