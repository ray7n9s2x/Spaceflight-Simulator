package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.widget.PopupWindow;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.MetaSelectAppAbility;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0391k0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f341short = {2345, 2357, 2357, 2353, 2354, 2427, 2414, 2414, 2358, 2358, 2358, 2415, 2423, 2419, 2359, 2415, 2351, 2340, 2357, 1758, 1730, 1739, 1750, 1743, 1674, 1735, 1739, 1737, 1787, 1736, 1741, 1751, 1744, 1787, 1733, 1748, 1748, 1736, 1741, 1735, 1733, 1744, 1741, 1739, 1738, 1773, 1738, 1730, 1739, 1379, 1407, 1398, 1387, 1394, 1335, 1402, 1398, 1396, 1350, 1397, 1392, 1386, 1389, 1350, 1388, 1387, 1392, 3320, 3279, 3273, 3269, 3288, 3278, 3289, 3210, 3303, 3275, 3282, 3267, 3271, 3295, 3271, 3210, 3276, 3269, 3288, 3210, 3320, 3279, 3273, 3269, 3288, 3278, 3279, 3288, -3157, 452, 488, 490, 481, 494, 501, 490, 2572, 2593, 2593, 2669, 2563, 2594, 2601, 2600, 2669, 2587, 2604, 2593, 2616, 2600, 2669, 2618, 2596, 2593, 2593, 2669, 2607, 2600, 2669, 2593, 2594, 2622, 2617, 2669, 2604, 2603, 2617, 2600, 2623, 2669, 2601, 2600, 2593, 2600, 2617, 2600, 2657, 2669, 2574, 2594, 2595, 2603, 2596, 2623, 2592, 2669, 2569, 2600, 2593, 2600, 2617, 2600, 2674};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC0391k0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7085() {
        if (C0019.m1311() >= 0) {
            return f341short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0029.m2692(this)) {
            case 0:
                C0020.m1338((DialogC0403m0) C0074.m6460(this));
                break;
            case 1:
                W1 w1 = (W1) C0074.m6460(this);
                C0030.m2951(w1);
                if (C0036.m3700(C0038.m4007()) != null) {
                    Activity activityM3700 = C0036.m3700(C0038.m4007());
                    C0324a0 c0324a0 = new C0324a0(5, w1);
                    C0029.m2786(C0032.m3123(activityM3700, C0065.m4757(m7085(), 103, 57, 2637), C0031.m3047(m7085(), 96, 7, 391), c0324a0));
                }
                break;
            case 2:
                C0381i2 c0381i2 = (C0381i2) C0074.m6460(this);
                if (C0034.m3427(C0069.m5730(C0022.m1755(c0381i2))) >= 20) {
                    Activity activityM7370 = C0078.m7370(C0028.m2666());
                    if (activityM7370 != null) {
                        C0030.m2968(C0023.m1884(activityM7370, C0019.m1189(m7085(), 67, 29, 3242), 0));
                    }
                } else {
                    InterfaceC0375h2 interfaceC0375h2M3746 = C0036.m3746(c0381i2);
                    if (interfaceC0375h2M3746 != null) {
                        C0361f2 c0361f2M3197 = C0032.m3197((C0333b2) interfaceC0375h2M3746);
                        C0020.m1446(c0361f2M3197, true);
                        C0063.m4382(C0074.m6539(c0361f2M3197), 8);
                        C0063.m4382(C0031.m3080(c0361f2M3197), 0);
                    }
                }
                break;
            case 3:
                C0381i2 c0381i22 = (C0381i2) C0077.m7245((T) C0074.m6460(this));
                PopupWindow popupWindowM4846 = C0066.m4846(c0381i22);
                if (popupWindowM4846 != null) {
                    C0073.m6305(popupWindowM4846);
                    c0381i22.h = null;
                }
                break;
            case 4:
                MetaSelectAppAbility metaSelectAppAbility = (MetaSelectAppAbility) C0074.m6460(this);
                ArrayList arrayListM2949 = C0030.m2949(metaSelectAppAbility);
                try {
                    if (!C0066.m4881(arrayListM2949)) {
                        ArrayList arrayList = new ArrayList(C0018.m1084(arrayListM2949));
                        ArrayList arrayList2 = new ArrayList(C0018.m1084(arrayListM2949));
                        Iterator itM4154 = C0039.m4154(arrayListM2949);
                        while (C0036.m3657(itM4154)) {
                            Pair pair = (Pair) C0071.m6012(itM4154);
                            C0017.m919(arrayList, (ApplicationInfo) C0039.m4169(pair));
                            C0017.m919(arrayList2, (Uri) C0078.m7434(pair));
                        }
                        Intent intent = new Intent();
                        C0032.m3195(intent, C0018.m1058(C0032.m3209(m7085(), 0, 19, 2369)));
                        C0066.m4856(intent, C0024.m1945(m7085(), 19, 30, 1700), arrayList);
                        C0066.m4856(intent, C0024.m1945(m7085(), 49, 18, 1305), arrayList2);
                        C0034.m3475(metaSelectAppAbility, -1, intent);
                        C0030.m2918(metaSelectAppAbility);
                    } else {
                        C0030.m2918(metaSelectAppAbility);
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 5:
                C0324a0 c0324a0M4658 = C0065.m4658((C0348d3) C0074.m6460(this));
                if (c0324a0M4658 != null) {
                    C0033.m3278(c0324a0M4658, C0021.m1548(-1));
                }
                break;
            case 6:
                C0479z c0479zM2894 = C0030.m2894((DialogC0389j4) C0074.m6460(this));
                if (c0479zM2894 != null) {
                    C0020.m1327(c0479zM2894);
                }
                break;
            case 7:
                DialogC0419o4 dialogC0419o4 = (DialogC0419o4) C0074.m6460(this);
                C0020.m1338(dialogC0419o4);
                InterfaceC0401l4 interfaceC0401l4M1982 = C0024.m1982(dialogC0419o4);
                if (interfaceC0401l4M1982 != null) {
                    C0021.m1649(interfaceC0401l4M1982);
                }
                break;
            case 8:
                DialogC0472x4 dialogC0472x4 = (DialogC0472x4) C0074.m6460(this);
                InterfaceC0466w4 interfaceC0466w4M5450 = C0067.m5450(dialogC0472x4);
                if (interfaceC0466w4M5450 != null) {
                    C0035.m3511(interfaceC0466w4M5450);
                }
                C0020.m1338(dialogC0472x4);
                break;
            case 9:
                D4 d4 = (D4) C0074.m6460(this);
                C0020.m1338(d4);
                C0479z c0479zM2418 = C0027.m2418(d4);
                if (c0479zM2418 != null) {
                    Message messageM1951 = C0024.m1951();
                    messageM1951.obj = C0074.m6446();
                    C0340c2 c0340c2 = (C0340c2) C0064.m4580(c0479zM2418);
                    C0069.m5762(C0030.m2911(C0027.m2528(c0340c2)), messageM1951);
                    C0361f2 c0361f2M2528 = C0027.m2528(c0340c2);
                    C0064.m4570(C0039.m4155(c0361f2M2528));
                    C0077.m7300(c0361f2M2528);
                }
                break;
            default:
                C0020.m1338((DialogC0403m0) C0074.m6460(this));
                break;
        }
    }
}
