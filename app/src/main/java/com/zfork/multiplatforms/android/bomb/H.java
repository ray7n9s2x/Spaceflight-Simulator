package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptState;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends Handler {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f250short = {2441, 2457, 2440, 2451, 2442, 2446, 2469, 2451, 2457, 2469, 2440, 2463, 2457, 2453, 2440, 2462, 2451, 2452, 2461, 2469, 2442, 2459, 2447, 2441, 2463, 1728, 1744, 1729, 1754, 1731, 1735, 1772, 1754, 1744, 1772, 1729, 1750, 1744, 1756, 1729, 1751, 1754, 1757, 1748, 525, 570, 572, 560, 557, 571, 566, 561, 568, 2825, 2841, 2824, 2835, 2826, 2830, 2853, 2835, 2841, 2853, 2824, 2847, 2841, 2837, 2824, 2846, 2735, 2698, 2723, 2732, 2726, 2734, 2727, 2736, 2786, 2731, 2732, 2728, 2727, 2721, 2742, 2699, 2732, 2738, 2743, 2742, 2695, 2740, 2727, 2732, 2742, 2715, 2711, 2715, 2754, 2774, 2775, 2764, 2752, 2767, 2762, 2752, 2760, 2226, 2221, 2216, 2213, 2212, 2206, 2233, 2251, 2260, 2257, 2268, 2269, 2279, 2241};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6935() {
        if (C0072.m6216() >= 0) {
            return f250short;
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AutoClickPlanBean autoClickPlanBeanM1632;
        String strM6323;
        switch (C0028.m2574(this)) {
            case 0:
                super.handleMessage(message);
                int iM6549 = C0074.m6549(message);
                L l = (L) C0028.m2547(this);
                switch (iM6549) {
                    case 1001:
                        if (C0036.m3700(C0038.m4007()) != null) {
                            Activity activityM3700 = C0036.m3700(C0038.m4007());
                            MotionEvent motionEvent = (MotionEvent) C0111.m13066(message);
                            if (activityM3700 != null && ((strM6323 = C0073.m6323(l)) == null || C0070.m5838(strM6323, C0078.m7385(activityM3700)))) {
                                C0016.m693(C0027.m2524(activityM3700), motionEvent);
                                StringBuilder sb = new StringBuilder(C0027.m2404(m6935(), 69, 25, 2754));
                                C0018.m1075(sb, C0022.m1701(motionEvent));
                                C0077.m7290(sb, C0032.m3209(m6935(), 94, 3, 2747));
                                C0018.m1075(sb, C0016.m602(motionEvent));
                                C0023.m1864(C0111.m13097(m6935(), 97, 9, 2723), C0068.m5536(sb));
                            }
                            if (C0029.m2694(message) == 3 && (autoClickPlanBeanM1632 = C0021.m1632(l)) != null && C0072.m6198(autoClickPlanBeanM1632) != null && C0034.m3427(C0072.m6198(C0021.m1632(l))) > C0032.m3173(message)) {
                                if (C0016.m650(message) != null) {
                                    Bundle bundleM650 = C0016.m650(message);
                                    String strM2404 = C0027.m2404(m6935(), 106, 7, 2241);
                                    if (C0018.m999(bundleM650, strM2404, -1) != -1) {
                                        C0018.m1051((T1) C0071.m6078(C0072.m6198(C0021.m1632(l)), C0032.m3173(message)), C0020.m1428(C0016.m650(message), strM2404), C0020.m1428(C0016.m650(message), C0034.m3431(m6935(), 113, 7, 2232)), true);
                                    }
                                }
                                C0018.m1051((T1) C0071.m6078(C0072.m6198(C0021.m1632(l)), C0032.m3173(message)), (int) C0022.m1701(motionEvent), (int) C0016.m602(motionEvent), false);
                                break;
                            }
                        }
                        break;
                    case 1002:
                        Object objM13066 = C0111.m13066(message);
                        if (objM13066 != null) {
                            T1 t1 = (T1) objM13066;
                            for (int i = 0; i < C0034.m3427(C0072.m6198(C0021.m1632(l))); i++) {
                                T1 t12 = (T1) C0071.m6078(C0072.m6198(C0021.m1632(l)), i);
                                if (t12 == t1) {
                                    C0038.m4001(t12, true);
                                } else {
                                    C0038.m4001(t12, false);
                                }
                            }
                        }
                        break;
                    case PointerIconCompat.TYPE_HELP /* 1003 */:
                        Object objM130662 = C0111.m13066(message);
                        if (objM130662 != null) {
                            C0030.m2951((T1) objM130662);
                        }
                        break;
                    case 1004:
                        Object objM130663 = C0111.m13066(message);
                        if (objM130663 != null) {
                            C0018.m1051((T1) objM130663, C0029.m2694(message), C0032.m3173(message), true);
                        }
                        break;
                }
                break;
            default:
                super.handleMessage(message);
                ScriptState scriptState = (ScriptState) C0111.m13066(message);
                C0361f2 c0361f2 = (C0361f2) C0028.m2547(this);
                c0361f2.o = scriptState;
                int i2 = C0077.m7198()[C0030.m2893(scriptState)];
                if (i2 == 1) {
                    c0361f2.n = 0L;
                    C0019.m1180(C0065.m4775(c0361f2), C0026.m2321(m6935(), 44, 9, 607));
                    C0039.m4187(C0037.m3868(c0361f2), C0071.m6091(C0067.m5418(m6935(), 53, 16, 2938)));
                    C0071.m6070(C0030.m2911(c0361f2), null);
                    break;
                } else if (i2 == 2) {
                    C0039.m4187(C0037.m3868(c0361f2), C0071.m6091(C0016.m625(m6935(), 25, 19, 1715)));
                    C0019.m1180(C0065.m4775(c0361f2), C0039.m4133(c0361f2, C0032.m3191(c0361f2)));
                    c0361f2.n = C0032.m3191(c0361f2) + 1;
                    Message messageM1951 = C0024.m1951();
                    messageM1951.obj = C0023.m1844();
                    C0070.m5851(C0030.m2911(c0361f2), messageM1951, 1000L);
                    break;
                } else if (i2 == 3) {
                    C0039.m4187(C0037.m3868(c0361f2), C0071.m6091(C0024.m1945(m6935(), 0, 25, 2554)));
                    C0019.m1180(C0065.m4775(c0361f2), C0039.m4133(c0361f2, C0032.m3191(c0361f2)));
                    C0071.m6070(C0030.m2911(c0361f2), null);
                    break;
                }
                break;
        }
    }
}
