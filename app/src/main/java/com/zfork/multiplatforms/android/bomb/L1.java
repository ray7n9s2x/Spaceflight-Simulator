package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class L1 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f263short = {1859, 1903, 1901, 1894, 1897, 1906, 1901, 415, 429, 442, 425, 492, 414, 425, 431, 419, 446, 424};
    public final /* synthetic */ int a;
    public final /* synthetic */ O1 b;

    public /* synthetic */ L1(O1 o1, int i) {
        this.a = i;
        this.b = o1;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6959() {
        if (C0063.m4427() >= 0) {
            return f263short;
        }
        return null;
    }

    public L1(O1 o1, Activity activity) {
        this.a = 0;
        this.b = o1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View viewM1843;
        switch (C0078.m7314(this)) {
            case 0:
                O1 o1M2942 = C0030.m2942(this);
                I1 i1M5935 = C0070.m5935(o1M2942);
                if (i1M5935 != null) {
                    C0017.m912(i1M5935, !C0025.m2140(i1M5935));
                    C0063.m4312(o1M2942, C0025.m2140(C0070.m5935(o1M2942)));
                    if (((C0479z) C0023.m1892(C0063.m4409())) != null) {
                        C0024.m2021(true);
                    }
                    break;
                }
                break;
            case 1:
                O1 o1M29422 = C0030.m2942(this);
                I1 i1M59352 = C0070.m5935(o1M29422);
                if (i1M59352 != null) {
                    C0030.m2945(i1M59352, !C0023.m1926(i1M59352));
                    I1 i1M59353 = C0070.m5935(o1M29422);
                    C0016.m697(i1M59353, C0023.m1926(i1M59353));
                    L lM3367 = C0033.m3367();
                    AutoClickPlanBean autoClickPlanBeanM1632 = C0021.m1632(lM3367);
                    if (!C0023.m1926(C0070.m5935(o1M29422))) {
                        C0030.m2951(lM3367);
                        if (autoClickPlanBeanM1632 != null && C0072.m6198(autoClickPlanBeanM1632) != null) {
                            Iterator itM4732 = C0065.m4732(C0072.m6198(autoClickPlanBeanM1632));
                            while (C0036.m3657(itM4732)) {
                                C0022.m1658((T1) C0071.m6012(itM4732));
                            }
                            break;
                        }
                    } else {
                        C0030.m2951(lM3367);
                        if (autoClickPlanBeanM1632 != null && C0072.m6198(autoClickPlanBeanM1632) != null) {
                            Iterator itM47322 = C0065.m4732(C0072.m6198(autoClickPlanBeanM1632));
                            while (C0036.m3657(itM47322)) {
                                C0077.m7166((T1) C0071.m6012(itM47322));
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (C0036.m3700(C0038.m4007()) != null) {
                    DialogC0373h0 dialogC0373h0 = new DialogC0373h0(C0036.m3700(C0038.m4007()), C0074.m6542(C0030.m2942(this)));
                    dialogC0373h0.k = new E();
                    dialogC0373h0.l = new ViewOnClickListenerC0480z0(this, dialogC0373h0, 1);
                    C0029.m2786(dialogC0373h0);
                    C0479z c0479z = (C0479z) C0023.m1892(C0063.m4409());
                    if (c0479z != null) {
                        C0020.m1331(c0479z);
                    }
                }
                break;
            case 3:
                O1 o1M29423 = C0030.m2942(this);
                I1 i1M59354 = C0070.m5935(o1M29423);
                if (i1M59354 != null && (viewM1843 = C0023.m1843(i1M59354)) != null && C0016.m655(viewM1843) == 0) {
                    C0063.m4382(viewM1843, 8);
                }
                AutoClickPlanBean autoClickPlanBeanM6542 = C0074.m6542(o1M29423);
                if (autoClickPlanBeanM6542 == null || C0068.m5588(autoClickPlanBeanM6542) == null || C0034.m3427(C0068.m5588(C0074.m6542(o1M29423))) == 0) {
                    C0063.m4438(o1M29423);
                    C0031.m3098(C0033.m3367());
                } else {
                    L lM33672 = C0033.m3367();
                    String strM5642 = C0068.m5642(lM33672);
                    if (!C0038.m3939(C0064.m4632(C0074.m6542(o1M29423)))) {
                        strM5642 = C0064.m4632(C0074.m6542(o1M29423));
                    }
                    Long lM5853 = C0070.m5853(C0065.m4764(C0074.m6542(o1M29423)));
                    LinkedHashMap linkedHashMapM7371 = C0078.m7371(lM33672);
                    AutoClickPlanBean autoClickPlanBean = linkedHashMapM7371 == null ? null : (AutoClickPlanBean) C0067.m5420(linkedHashMapM7371, lM5853);
                    String strM4066 = C0039.m4066(m6959(), 0, 7, 1792);
                    String strM2609 = C0028.m2609(m6959(), 7, 11, 460);
                    if (autoClickPlanBean != null) {
                        Long lM58532 = C0070.m5853(C0065.m4764(C0074.m6542(o1M29423)));
                        LinkedHashMap linkedHashMapM73712 = C0078.m7371(lM33672);
                        if ((linkedHashMapM73712 != null ? (AutoClickPlanBean) C0067.m5420(linkedHashMapM73712, lM58532) : null) != null && C0026.m2340(lM33672)) {
                            DialogC0421p0 dialogC0421p0M7361 = C0078.m7361(C0072.m6192(o1M29423), 8, false);
                            C0019.m1180(C0023.m1811(dialogC0421p0M7361), strM2609);
                            C0072.m6136(dialogC0421p0M7361);
                            C0027.m2463(dialogC0421p0M7361, strM4066);
                            String strM4632 = C0064.m4632(C0074.m6542(o1M29423));
                            if (strM4632 != null) {
                                C0038.m3944(C0018.m1031(dialogC0421p0M7361), strM4632);
                            }
                            C0016.m722(C0029.m2784(dialogC0421p0M7361), 2, 12.0f);
                            dialogC0421p0M7361.n = true;
                            dialogC0421p0M7361.o = new N1(this, strM5642, dialogC0421p0M7361, 1);
                            C0029.m2786(dialogC0421p0M7361);
                        } else {
                            C0063.m4438(o1M29423);
                            C0031.m3098(lM33672);
                        }
                    } else {
                        DialogC0421p0 dialogC0421p0M73612 = C0078.m7361(C0072.m6192(o1M29423), 8, false);
                        C0019.m1180(C0023.m1811(dialogC0421p0M73612), strM2609);
                        C0072.m6136(dialogC0421p0M73612);
                        C0027.m2463(dialogC0421p0M73612, strM4066);
                        if (strM5642 != null) {
                            C0038.m3944(C0018.m1031(dialogC0421p0M73612), strM5642);
                        }
                        C0016.m722(C0029.m2784(dialogC0421p0M73612), 2, 12.0f);
                        dialogC0421p0M73612.n = true;
                        dialogC0421p0M73612.o = new N1(this, strM5642, dialogC0421p0M73612, 0);
                        C0029.m2786(dialogC0421p0M73612);
                    }
                }
                break;
            default:
                C0024.m2048(C0030.m2942(this));
                C0479z c0479z2 = (C0479z) C0023.m1892(C0063.m4409());
                if (c0479z2 != null) {
                    C0020.m1331(c0479z2);
                }
                break;
        }
    }
}
