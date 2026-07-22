package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;

/* JADX INFO: loaded from: classes3.dex */
public final class J1 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f256short = {1367, 1387, 1378, 1382, 1396, 1378, 1319, 1382, 1379, 1379, 1319, 1382, 1395, 1319, 1387, 1378, 1382, 1396, 1395, 1319, 1334, 1319, 1353, 1384, 1379, 1378, 1525, 1481, 1472, 1476, 1494, 1472, 1413, 1476, 1473, 1473, 1413, 1476, 1489, 1413, 1481, 1472, 1476, 1494, 1489, 1413, 1428, 1413, 1515, 1482, 1473, 1472, 3278, 3321, 3327, 3315, 3310, 3320, 3260, 3282, 3325, 3313, 3321, 605, 625, 627, 632, 631, 620, 627, 2682, 2630, 2639, 2635, 2649, 2639, 2570, 2635, 2638, 2638, 2570, 2635, 2654, 2570, 2630, 2639, 2635, 2649, 2654, 2570, 2587, 2570, 2660, 2629, 2638, 2639};
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ O1 c;

    public /* synthetic */ J1(O1 o1, Activity activity, int i) {
        this.a = i;
        this.c = o1;
        this.b = activity;
    }

    /* JADX INFO: renamed from: ۠۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6945() {
        if (C0073.m6356() <= 0) {
            return f256short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0077.m7234(this)) {
            case 0:
                O1 o1M1262 = C0019.m1262(this);
                AutoClickPlanBean autoClickPlanBeanM6542 = C0074.m6542(o1M1262);
                if (autoClickPlanBeanM6542 == null || C0068.m5588(autoClickPlanBeanM6542) == null || C0034.m3427(C0068.m5588(C0074.m6542(o1M1262))) == 0) {
                    C0030.m2968(C0023.m1884(C0018.m1043(this), C0066.m4828(m6945(), 70, 26, 2602), 0));
                } else {
                    C0069.m5722(o1M1262);
                    String strM5642 = C0068.m5642(C0033.m3367());
                    if (!C0038.m3939(C0064.m4632(C0074.m6542(o1M1262)))) {
                        strM5642 = C0064.m4632(C0074.m6542(o1M1262));
                    }
                    DialogC0421p0 dialogC0421p0M7361 = C0078.m7361(C0072.m6192(o1M1262), 6, false);
                    C0019.m1180(C0023.m1811(dialogC0421p0M7361), C0021.m1650(m6945(), 52, 11, 3228));
                    C0072.m6136(dialogC0421p0M7361);
                    C0027.m2463(dialogC0421p0M7361, C0066.m4828(m6945(), 63, 7, 542));
                    if (strM5642 != null) {
                        C0038.m3944(C0018.m1031(dialogC0421p0M7361), strM5642);
                    }
                    C0063.m4382(C0029.m2784(dialogC0421p0M7361), 8);
                    dialogC0421p0M7361.n = true;
                    dialogC0421p0M7361.o = new C0474y0(this, strM5642, dialogC0421p0M7361, 1);
                    C0029.m2786(dialogC0421p0M7361);
                }
                break;
            case 1:
                O1 o1M12622 = C0019.m1262(this);
                AutoClickPlanBean autoClickPlanBeanM65422 = C0074.m6542(o1M12622);
                if (autoClickPlanBeanM65422 == null || C0068.m5588(autoClickPlanBeanM65422) == null || C0034.m3427(C0068.m5588(C0074.m6542(o1M12622))) == 0) {
                    C0030.m2968(C0023.m1884(C0018.m1043(this), C0035.m3603(m6945(), 26, 26, 1445), 0));
                } else {
                    C0069.m5722(o1M12622);
                }
                break;
            default:
                O1 o1M12623 = C0019.m1262(this);
                AutoClickPlanBean autoClickPlanBeanM65423 = C0074.m6542(o1M12623);
                if (autoClickPlanBeanM65423 == null || C0068.m5588(autoClickPlanBeanM65423) == null || C0034.m3427(C0068.m5588(C0074.m6542(o1M12623))) == 0) {
                    C0030.m2968(C0023.m1884(C0018.m1043(this), C0028.m2609(m6945(), 0, 26, 1287), 0));
                } else {
                    if (C0038.m3939(C0064.m4632(C0074.m6542(o1M12623)))) {
                        C0018.m987(C0074.m6542(o1M12623), C0068.m5642(C0033.m3367()));
                    }
                    if (C0036.m3669(o1M12623, C0074.m6542(o1M12623), false)) {
                        C0069.m5722(o1M12623);
                    }
                }
                break;
        }
    }
}
