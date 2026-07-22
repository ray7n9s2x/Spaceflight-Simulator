package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0366g0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f322short = {1194, 1181, 1179, 1175, 1162, 1180, 1163, 1240, 1167, 1169, 1164, 1168, 1240, 1163, 1177, 1173, 1181, 1240, 1174, 1177, 1173, 1181, 1240, 1177, 1172, 1162, 1181, 1177, 1180, 1153, 1240, 1181, 1152, 1169, 1163, 1164, 1181, 1180, 2398, 2402, 2411, 2415, 2429, 2411, 2350, 2426, 2423, 2430, 2411, 2350, 2407, 2400, 2350, 2428, 2411, 2413, 2401, 2428, 2410, 2350, 2400, 2415, 2403, 2411, 1430, 387};
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogC0373h0 b;

    public /* synthetic */ ViewOnClickListenerC0366g0(DialogC0373h0 dialogC0373h0, int i) {
        this.a = i;
        this.b = dialogC0373h0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static short[] m7062() {
        if (C0037.m3837() < 0) {
            return f322short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0033.m3342(this)) {
            case 0:
                ViewOnClickListenerC0480z0 viewOnClickListenerC0480z0M4453 = C0063.m4453(C0077.m7228(this));
                if (viewOnClickListenerC0480z0M4453 != null) {
                    C0021.m1540(viewOnClickListenerC0480z0M4453, view);
                }
                break;
            case 1:
                DialogC0373h0 dialogC0373h0M7228 = C0077.m7228(this);
                C0020.m1338(dialogC0373h0M7228);
                ViewOnClickListenerC0462w0 viewOnClickListenerC0462w0M3574 = C0035.m3574(dialogC0373h0M7228);
                if (viewOnClickListenerC0462w0M3574 != null) {
                    C0029.m2739(viewOnClickListenerC0462w0M3574, view);
                }
                break;
            default:
                DialogC0373h0 dialogC0373h0M72282 = C0077.m7228(this);
                if (C0032.m3132(dialogC0373h0M72282) != null) {
                    EditText editTextM5641 = C0068.m5641(dialogC0373h0M72282);
                    AutoClickPlanBean autoClickPlanBeanM6476 = C0074.m6476(dialogC0373h0M72282);
                    if (editTextM5641 != null) {
                        boolean zM3939 = C0038.m3939(C0075.m6801(editTextM5641));
                        Activity activityM4432 = C0063.m4432(dialogC0373h0M72282);
                        if (zM3939) {
                            if (activityM4432 != null) {
                                C0030.m2968(C0023.m1884(activityM4432, C0068.m5544(m7062(), 38, 26, 2318), 0));
                            }
                        } else if (!C0034.m3390(C0033.m3367(), C0074.m6524(C0075.m6801(C0068.m5641(dialogC0373h0M72282))), false)) {
                            C0018.m987(autoClickPlanBeanM6476, C0074.m6524(C0075.m6801(C0068.m5641(dialogC0373h0M72282))));
                        } else if (activityM4432 != null) {
                            C0030.m2968(C0023.m1884(activityM4432, C0039.m4066(m7062(), 0, 38, 1272), 0));
                        }
                    }
                    EditText editTextM4744 = C0065.m4744(dialogC0373h0M72282);
                    if (editTextM4744 != null && !C0038.m3939(C0075.m6801(editTextM4744))) {
                        C0032.m3193(autoClickPlanBeanM6476, C0024.m2019(0, C0074.m6524(C0075.m6801(C0065.m4744(dialogC0373h0M72282)))));
                    }
                    EditText editTextM5594 = C0068.m5594(dialogC0373h0M72282);
                    if (editTextM5594 != null && !C0038.m3939(C0075.m6801(editTextM5594))) {
                        C0032.m3241(autoClickPlanBeanM6476, C0024.m2019(1000, C0074.m6524(C0075.m6801(C0068.m5594(dialogC0373h0M72282)))));
                    }
                    if (autoClickPlanBeanM6476 != null && (!C0037.m3902(C0067.m5431(dialogC0373h0M72282), C0064.m4588(C0064.m4632(autoClickPlanBeanM6476))) || !C0037.m3902(C0075.m6806(dialogC0373h0M72282), C0078.m7464(C0016.m673(autoClickPlanBeanM6476))) || !C0037.m3902(C0022.m1690(dialogC0373h0M72282), C0078.m7464(C0038.m3952(autoClickPlanBeanM6476))))) {
                        if (C0069.m5744(dialogC0373h0M72282)) {
                            C0111.m13070(C0032.m3132(dialogC0373h0M72282), C0067.m5418(m7062(), 64, 1, 1446));
                        } else {
                            C0033.m3367().h = true;
                        }
                    }
                    C0111.m13070(C0032.m3132(dialogC0373h0M72282), C0071.m5991(m7062(), 65, 1, 434));
                }
                C0020.m1338(dialogC0373h0M72282);
                break;
        }
    }
}
