package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectAliasBean;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0326a2 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f302short = {935, 951, 934, 957, 932, 928, 907, 957, 951, 907, 956, 957, 944, 945, 2415, 2431, 2414, 2421, 2412, 2408, 2371, 2421, 2431, 2371, 2415, 2420, 2419, 2411, 2182, 2237, 2237, 2290, 2239, 2227, 2236, 2219, 2290, 2227, 2214, 2214, 2231, 2239, 2210, 2214, 2302, 2290, 2210, 2238, 2231, 2227, 2209, 2231, 2290, 2214, 2208, 2219, 2290, 2227, 2229, 2227, 2235, 2236, 2290, 2238, 2227, 2214, 2231, 2208, 483, 499, 482, 505, 480, 484, 463, 505, 499, 463, 482, 485, 510, 510, 505, 510, 503, 463, 480, 508, 497, 489, 2974, 3007, 3056, 2961, 2995, 2980, 3001, 3007, 3006, 3056, 2978, 2997, 2995, 3007, 2978, 2996, 2997, 2996, 3068, 3056, 2976, 3004, 2997, 2993, 2979, 2997, 3056, 2978, 2997, 2995, 3007, 2978, 2996, 3056, 2993, 2995, 2980, 3001, 3007, 3006, 3070};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0361f2 b;

    public /* synthetic */ ViewOnClickListenerC0326a2(C0361f2 c0361f2, int i) {
        this.a = i;
        this.b = c0361f2;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7028() {
        if (C0078.m7450() >= 0) {
            return f302short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0073.m6423(this)) {
            case 0:
                C0361f2 c0361f2M4349 = C0063.m4349(this);
                Message messageM1951 = C0024.m1951();
                int i = C0077.m7198()[C0030.m2893(C0030.m2868(c0361f2M4349))];
                H hM2911 = C0030.m2911(c0361f2M4349);
                if (i != 1) {
                    if (i == 2) {
                        ArrayList arrayListM4155 = C0039.m4155(c0361f2M4349);
                        if (C0066.m4881(arrayListM4155)) {
                            C0030.m2968(C0023.m1884(C0022.m1755(c0361f2M4349), C0018.m1070(m7028(), 90, 41, 3024), 0));
                            return;
                        }
                        messageM1951.obj = C0073.m6418();
                        C0069.m5762(hM2911, messageM1951);
                        C0077.m7300(c0361f2M4349);
                        DialogC0331b0 dialogC0331b0M7337 = C0078.m7337(c0361f2M4349);
                        if (dialogC0331b0M7337 != null) {
                            C0370g4 c0370g4 = (C0370g4) C0074.m6579(dialogC0331b0M7337);
                            c0370g4.b = arrayListM4155;
                            C0071.m6031(c0370g4);
                            C0030.m2951(C0078.m7337(c0361f2M4349));
                            C0029.m2786(C0078.m7337(c0361f2M4349));
                        }
                        C0078.m7370(C0028.m2666());
                        return;
                    }
                    if (i != 3) {
                        return;
                    }
                }
                messageM1951.obj = C0023.m1844();
                C0069.m5762(hM2911, messageM1951);
                C0034.m3430(c0361f2M4349, C0021.m1573());
                DialogC0331b0 dialogC0331b0M73372 = C0078.m7337(c0361f2M4349);
                if (dialogC0331b0M73372 != null) {
                    C0020.m1338(dialogC0331b0M73372);
                    return;
                }
                return;
            case 1:
                C0361f2 c0361f2M43492 = C0063.m4349(this);
                C0034.m3430(c0361f2M43492, C0030.m2852());
                Message messageM19512 = C0024.m1951();
                messageM19512.obj = C0073.m6418();
                C0069.m5762(C0030.m2911(c0361f2M43492), messageM19512);
                C0063.m4382(c0361f2M43492, 8);
                if (C0078.m7370(C0028.m2666()) != null) {
                    throw null;
                }
                DialogC0331b0 dialogC0331b0M73373 = C0078.m7337(c0361f2M43492);
                if (dialogC0331b0M73373 != null) {
                    C0020.m1338(dialogC0331b0M73373);
                    return;
                }
                return;
            case 2:
                C0361f2 c0361f2M43493 = C0063.m4349(this);
                C0034.m3430(c0361f2M43493, C0065.m4785());
                Message messageM19513 = C0024.m1951();
                messageM19513.obj = C0073.m6418();
                C0069.m5762(C0030.m2911(c0361f2M43493), messageM19513);
                C0063.m4382(c0361f2M43493, 8);
                if (C0078.m7370(C0028.m2666()) != null) {
                    throw null;
                }
                DialogC0331b0 dialogC0331b0M73374 = C0078.m7337(c0361f2M43493);
                if (dialogC0331b0M73374 != null) {
                    C0020.m1338(dialogC0331b0M73374);
                    return;
                }
                return;
            case 3:
                C0361f2 c0361f2M43494 = C0063.m4349(this);
                long jM6518 = C0074.m6518();
                if (jM6518 - C0028.m2668(c0361f2M43494) < 800) {
                    C0030.m2968(C0023.m1884(C0022.m1755(c0361f2M43494), C0070.m5942(m7028(), 28, 40, 2258), 0));
                    return;
                }
                c0361f2M43494.z = jM6518;
                Boolean boolM1065 = C0018.m1065();
                HashMap mapM3616 = C0035.m3616(c0361f2M43494);
                if (C0037.m3876(boolM1065, C0067.m5420(mapM3616, C0070.m5853(C0036.m3674(C0073.m6347(c0361f2M43494)))))) {
                    C0039.m4187(C0021.m1626(c0361f2M43494), C0071.m6091(C0066.m4828(m7028(), 68, 22, 400)));
                    C0018.m988(c0361f2M43494);
                    C0038.m3969(mapM3616, C0070.m5853(C0036.m3674(C0073.m6347(c0361f2M43494))), C0036.m3683());
                    return;
                } else {
                    ScriptProjectAliasBean scriptProjectAliasBeanM6347 = C0073.m6347(c0361f2M43494);
                    if (scriptProjectAliasBeanM6347 != null) {
                        C0063.m4373(c0361f2M43494, scriptProjectAliasBeanM6347);
                        return;
                    }
                    return;
                }
            case 4:
                C0361f2 c0361f2M43495 = C0063.m4349(this);
                if (!C0026.m2341(c0361f2M43495)) {
                    c0361f2M43495.w = true;
                    C0039.m4187(C0078.m7382(c0361f2M43495), C0071.m6091(C0065.m4757(m7028(), 14, 14, 2332)));
                    return;
                }
                c0361f2M43495.w = false;
                C0039.m4187(C0078.m7382(c0361f2M43495), C0071.m6091(C0026.m2321(m7028(), 0, 14, 980)));
                Activity activityM7370 = C0078.m7370(C0028.m2666());
                if (activityM7370 == null || C0023.m1859(c0361f2M43495) == null) {
                    return;
                }
                C0025.m2123(activityM7370, new Z1(c0361f2M43495, 4));
                return;
            default:
                C0361f2 c0361f2M43496 = C0063.m4349(this);
                C0069.m5761(C0035.m3616(c0361f2M43496), C0070.m5853(C0036.m3674(C0073.m6347(c0361f2M43496))));
                if (C0074.m6539(c0361f2M43496) != null) {
                    C0408n c0408nM6120 = C0072.m6120();
                    C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
                    if (c0408n != null) {
                        C0037.m3799(c0408n, true);
                        C0071.m5989((C0408n) C0077.m7207(c0408nM6120), 0, 0);
                    }
                    C0063.m4382(C0031.m3080(c0361f2M43496), 8);
                    C0063.m4382(C0074.m6539(c0361f2M43496), 0);
                }
                C0018.m988(c0361f2M43496);
                return;
        }
    }
}
