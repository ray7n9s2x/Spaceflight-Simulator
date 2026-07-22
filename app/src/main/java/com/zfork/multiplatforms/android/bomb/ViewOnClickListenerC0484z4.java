package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.MatchType;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0484z4 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f382short = {1290, 1306, 1291, 1296, 1289, 1293, 1318, 1296, 1306, 1318, 1290, 1289, 1296, 1303, 1303, 1308, 1291, 1318, 1292, 1289, 435, 419, 434, 425, 432, 436, 415, 425, 419, 415, 435, 432, 425, 430, 430, 421, 434, 415, 420, 431, 439, 430, 2356, 2340, 2357, 2350, 2359, 2355, 2328, 2350, 2340, 2328, 2356, 2359, 2350, 2345, 2345, 2338, 2357, 2328, 2354, 2359, 819, 803, 818, 809, 816, 820, 799, 809, 803, 799, 819, 816, 809, 814, 814, 805, 818, 799, 804, 815, 823, 814, 2122, 2138, 2123, 2128, 2121, 2125, 2150, 2128, 2138, 2150, 2122, 2121, 2128, 2135, 2135, 2140, 2123, 2150, 2124, 2121, 2943, 2927, 2942, 2917, 2940, 2936, 2899, 2917, 2927, 2899, 2943, 2940, 2917, 2914, 2914, 2921, 2942, 2899, 2920, 2915, 2939, 2914, 2496, 2512, 2497, 2522, 2499, 2503, 2540, 2522, 2512, 2540, 2496, 2499, 2522, 2525, 2525, 2518, 2497, 2540, 2502, 2499, 2106, 2090, 2107, 2080, 2105, 2109, 2070, 2080, 2090, 2070, 2106, 2105, 2080, 2087, 2087, 2092, 2107, 2070, 2093, 2086, 2110, 2087};
    public final /* synthetic */ int a;
    public final /* synthetic */ C4 b;

    public /* synthetic */ ViewOnClickListenerC0484z4(C4 c4, int i) {
        this.a = i;
        this.b = c4;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7154() {
        if (C0070.m5903() >= 0) {
            return f382short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0032.m3127(this)) {
            case 0:
                C4 c4M5517 = C0067.m5517(this);
                C0020.m1338(c4M5517);
                C0479z c0479zM2105 = C0025.m2105(c4M5517);
                if (c0479zM2105 != null) {
                    C0020.m1327(c0479zM2105);
                }
                break;
            case 1:
                C4 c4M55172 = C0067.m5517(this);
                C0027.m2441(C0024.m1953(c4M55172), !C0018.m1055(r0));
                if (!C0018.m1055(C0024.m1953(c4M55172))) {
                    C0039.m4187(C0068.m5579(c4M55172), C0071.m6091(C0064.m4545(m7154(), 146, 22, 2121)));
                    C0063.m4382(C0032.m3163(c4M55172), 8);
                } else {
                    C0039.m4187(C0068.m5579(c4M55172), C0071.m6091(C0077.m7205(m7154(), 126, 20, 2483)));
                    C0063.m4382(C0032.m3163(c4M55172), 0);
                }
                break;
            case 2:
                C4 c4M55173 = C0067.m5517(this);
                C0027.m2441(C0028.m2599(c4M55173), !C0018.m1055(r0));
                if (!C0018.m1055(C0028.m2599(c4M55173))) {
                    C0039.m4187(C0073.m6319(c4M55173), C0071.m6091(C0111.m13097(m7154(), 104, 22, 2828)));
                    C0063.m4382(C0036.m3767(c4M55173), 8);
                    MatchType matchTypeM2870 = C0030.m2870(c4M55173);
                    if (matchTypeM2870 == C0032.m3242() || matchTypeM2870 == C0028.m2536()) {
                        C0063.m4382(C0034.m3457(c4M55173), 0);
                    }
                } else {
                    C0039.m4187(C0073.m6319(c4M55173), C0071.m6091(C0038.m4022(m7154(), 84, 20, 2105)));
                    C0063.m4382(C0036.m3767(c4M55173), 0);
                    C0063.m4382(C0034.m3457(c4M55173), 8);
                }
                break;
            case 3:
                C4 c4M55174 = C0067.m5517(this);
                C0027.m2441(C0025.m2168(c4M55174), !C0018.m1055(r0));
                if (!C0018.m1055(C0025.m2168(c4M55174))) {
                    C0039.m4187(C0039.m4175(c4M55174), C0071.m6091(C0024.m1945(m7154(), 62, 22, 832)));
                    C0063.m4382(C0020.m1453(c4M55174), 8);
                } else {
                    C0039.m4187(C0039.m4175(c4M55174), C0071.m6091(C0065.m4757(m7154(), 42, 20, 2375)));
                    C0063.m4382(C0020.m1453(c4M55174), 0);
                }
                break;
            default:
                C4 c4M55175 = C0067.m5517(this);
                C0027.m2441(C0024.m2049(c4M55175), !C0018.m1055(r0));
                if (!C0018.m1055(C0024.m2049(c4M55175))) {
                    C0039.m4187(C0111.m13138(c4M55175), C0071.m6091(C0070.m5942(m7154(), 20, 22, 448)));
                    C0063.m4382(C0019.m1310(c4M55175), 8);
                } else {
                    C0039.m4187(C0111.m13138(c4M55175), C0071.m6091(C0069.m5807(m7154(), 0, 20, 1401)));
                    C0063.m4382(C0019.m1310(c4M55175), 0);
                }
                break;
        }
    }
}
