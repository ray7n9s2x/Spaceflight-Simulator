package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ListView;
import androidx.core.view.InputDeviceCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;
import java.util.HashMap;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ Y1(KeyEvent.Callback callback, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        KeyEvent.Callback callbackM4811 = C0066.m4811(this);
        Object objM6311 = C0073.m6311(this);
        Object objM665 = C0016.m665(this);
        int i2 = 1;
        switch (C0075.m6862(this)) {
            case 0:
                ScriptProjectBean scriptProjectBean = (ScriptProjectBean) objM665;
                ScriptProjectAliasBean scriptProjectAliasBean = (ScriptProjectAliasBean) objM6311;
                C0361f2 c0361f2 = (C0361f2) callbackM4811;
                C0030.m2951(c0361f2);
                try {
                    Activity activityM7370 = C0078.m7370(C0028.m2666());
                    if (activityM7370 != null && C0023.m1859(c0361f2) != null) {
                        C0025.m2123(activityM7370, new Z1(c0361f2, i));
                    }
                    if (activityM7370 != null) {
                        c0361f2.D = C0078.m7385(activityM7370);
                    }
                    int iM3252 = C0033.m3252(scriptProjectBean);
                    HashMap mapM3616 = C0035.m3616(c0361f2);
                    if (iM3252 == 0) {
                        while (C0037.m3876(C0018.m1065(), C0067.m5420(mapM3616, C0070.m5853(C0036.m3674(scriptProjectAliasBean))))) {
                            C0037.m3805(c0361f2, C0073.m6309(scriptProjectBean), C0075.m6790(scriptProjectBean));
                            C0069.m5794(C0063.m4307(C0024.m1955(scriptProjectBean)));
                            c0361f2.H = C0064.m4530(c0361f2) + 1;
                        }
                    } else if (iM3252 > 0) {
                        while (i < C0033.m3252(scriptProjectBean)) {
                            C0037.m3805(c0361f2, C0073.m6309(scriptProjectBean), C0075.m6790(scriptProjectBean));
                            C0069.m5794(C0063.m4307(C0024.m1955(scriptProjectBean)));
                            c0361f2.H = i;
                            i++;
                        }
                    }
                    Activity activityM73702 = C0078.m7370(C0028.m2666());
                    if (activityM73702 != null) {
                        C0025.m2123(activityM73702, new Z1(c0361f2, i2));
                    }
                    C0018.m988(c0361f2);
                    C0038.m3969(mapM3616, C0070.m5853(C0073.m6309(scriptProjectBean)), C0036.m3683());
                } catch (Exception e) {
                    C0033.m3347(e);
                    return;
                }
                break;
            case 1:
                C0361f2 c0361f22 = (C0361f2) callbackM4811;
                C0030.m2951(c0361f22);
                ScriptTouchBean scriptTouchBean = (ScriptTouchBean) objM665;
                float fM4773 = C0065.m4773(scriptTouchBean);
                float fM13158 = C0111.m13158(scriptTouchBean);
                int[] iArrM6139 = C0072.m6139(c0361f22);
                if (iArrM6139 != null && iArrM6139.length == 2) {
                    fM4773 -= iArrM6139[0];
                    fM13158 -= iArrM6139[1];
                }
                MotionEvent motionEventM2803 = C0029.m2803(C0072.m6236(), C0072.m6236(), C0068.m5684(scriptTouchBean), fM4773, fM13158, C0037.m3917(scriptTouchBean));
                C0070.m5872(motionEventM2803, InputDeviceCompat.SOURCE_TOUCHSCREEN);
                String strM1028 = C0018.m1028(c0361f22);
                Activity activity = (Activity) objM6311;
                if (strM1028 == null || C0070.m5838(strM1028, C0078.m7385(activity))) {
                    C0016.m693(C0027.m2524(activity), motionEventM2803);
                }
                if (C0026.m2341(c0361f22)) {
                    int iM5684 = C0068.m5684(scriptTouchBean);
                    if (iM5684 == 0) {
                        C0425p4 c0425p4M1859 = C0023.m1859(c0361f22);
                        int iM4773 = (int) C0065.m4773(scriptTouchBean);
                        int iM13158 = (int) C0111.m13158(scriptTouchBean);
                        Z4 z4M1818 = C0023.m1818(c0425p4M1859);
                        C0024.m2016(z4M1818, iM4773, iM13158);
                        C0038.m3967(z4M1818).c = false;
                        C0037.m3851(c0425p4M1859);
                    } else if (iM5684 == 2) {
                        C0425p4 c0425p4M18592 = C0023.m1859(c0361f22);
                        C0075.m6846(C0023.m1818(c0425p4M18592), (int) C0065.m4773(scriptTouchBean), (int) C0111.m13158(scriptTouchBean), false);
                        C0037.m3851(c0425p4M18592);
                    }
                }
                break;
            default:
                ListView listView = (ListView) objM665;
                C0334b3 c0334b3 = (C0334b3) objM6311;
                C0077.m7242();
                MetaSelectAppAbility metaSelectAppAbility = (MetaSelectAppAbility) callbackM4811;
                C0030.m2951(metaSelectAppAbility);
                try {
                    C0019.m1314(listView, c0334b3);
                    C0024.m2020(listView, new Y2(metaSelectAppAbility, c0334b3));
                    C0066.m4890(listView, new Z2(metaSelectAppAbility));
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
