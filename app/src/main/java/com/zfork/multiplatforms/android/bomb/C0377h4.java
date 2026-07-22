package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0377h4 extends AbstractViewOnClickListenerC0465w3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f330short = {2012, 1996, 2013, 1990, 2015, 2011, 2032, 1995, 1990, 1998, 1987, 1984, 1992, 2032, 2011, 1990, 2015, 678, 699, 699, 672, 2345, 2361, 2344, 2355, 2346, 2350, 2309, 2350, 2355, 2346, 2309, 2345, 2354, 2363, 2346, 2367, 2673, 2668, 2677, 2650, 2673, 2668, 2673, 2665, 2656, 1518, 1523, 1514, 1477, 1534, 1535, 1513, 1529, 560, 557, 564, 539, 551, 549, 554, 551, 545, 552, 1484, 1521, 1504, 1533, 1978, 1959, 1982, 1937, 1981, 1967, 1976, 1963, 684, 653, 654, 649, 669, 644, 668, 712, 698, 653, 651, 647, 666, 652, 611, 578, 525, 620, 590, 601, 580, 578, 579, 525, 639, 584, 590, 578, 607, 585, 584, 585, 513, 525, 637, 577, 584, 588, 606, 584, 525, 585, 578, 525, 588, 590, 601, 580, 578, 579, 525, 588, 579, 585, 525, 606, 588, 603, 584, 515};
    public final /* synthetic */ int b;
    public final /* synthetic */ DialogC0331b0 c;

    public /* synthetic */ C0377h4(DialogC0331b0 dialogC0331b0, int i) {
        this.b = i;
        this.c = dialogC0331b0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7071() {
        if (C0075.m6893() > 0) {
            return f330short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractViewOnClickListenerC0465w3
    public final void a() {
        switch (C0016.m620(this)) {
            case 0:
                DialogC0331b0 dialogC0331b0M4177 = C0039.m4177(this);
                C0340c2 c0340c2 = (C0340c2) C0017.m883(dialogC0331b0M4177);
                if (c0340c2 != null) {
                    List listM2173 = C0025.m2173((C0370g4) C0074.m6579(dialogC0331b0M4177));
                    int iM3427 = C0034.m3427(listM2173);
                    C0361f2 c0361f2M2528 = C0027.m2528(c0340c2);
                    if (iM3427 > 0) {
                        Message messageM1951 = C0024.m1951();
                        messageM1951.obj = C0074.m6446();
                        C0069.m5762(C0030.m2911(c0361f2M2528), messageM1951);
                        int iM34272 = C0034.m3427(C0069.m5730(C0022.m1755(c0361f2M2528)));
                        DialogC0472x4 dialogC0472x4M2153 = C0025.m2153(c0361f2M2528);
                        Context contextM1755 = C0022.m1755(c0361f2M2528);
                        StringBuilder sb = new StringBuilder(C0020.m1443(m7071(), 76, 14, 744));
                        C0021.m1551(sb, iM34272 + 1);
                        C0034.m3489(dialogC0472x4M2153, new ScriptProjectBean(contextM1755, C0068.m5536(sb), listM2173), true);
                        C0029.m2786(C0025.m2153(c0361f2M2528));
                        C0077.m7300(c0361f2M2528);
                    } else {
                        C0030.m2968(C0023.m1884(C0022.m1755(c0361f2M2528), C0018.m1070(m7071(), 90, 46, 557), 0));
                    }
                }
                TextView textViewM7279 = C0077.m7279(dialogC0331b0M4177);
                if (textViewM7279 != null) {
                    C0063.m4382(textViewM7279, 8);
                }
                C0020.m1338(dialogC0331b0M4177);
                break;
            default:
                DialogC0331b0 dialogC0331b0M41772 = C0039.m4177(this);
                C0340c2 c0340c22 = (C0340c2) C0017.m883(dialogC0331b0M41772);
                if (c0340c22 != null) {
                    C0361f2 c0361f2M25282 = C0027.m2528(c0340c22);
                    if (C0018.m1084(C0039.m4155(c0361f2M25282)) > 0) {
                        Activity activityM7370 = C0078.m7370(C0028.m2666());
                        if (activityM7370 != null) {
                            D4 d4 = new D4(activityM7370);
                            View viewM5715 = C0069.m5715(C0018.m1070(m7071(), 0, 17, 1967));
                            if (viewM5715 != null) {
                                C0039.m4187((LinearLayout) C0029.m2688(viewM5715, C0077.m7205(m7071(), 17, 4, 724)), C0018.m1059(C0028.m2609(m7071(), 21, 16, 2394)));
                                TextView textView = (TextView) C0029.m2688(viewM5715, C0019.m1189(m7071(), 54, 10, 580));
                                d4.a = textView;
                                C0019.m1180(textView, C0024.m1945(m7071(), 64, 4, 1417));
                                d4.b = (TextView) C0029.m2688(viewM5715, C0026.m2321(m7071(), 68, 8, 1998));
                                C0073.m6392(d4, viewM5715);
                                C0065.m4727(C0027.m2483(d4), new ViewOnClickListenerC0391k0(9, d4));
                                C0065.m4727(C0035.m3521(d4), new C0347d2(d4, 5));
                            }
                            d4.c = new C0479z(c0340c22, d4, 5);
                            C0029.m2786(d4);
                        }
                    } else {
                        Message messageM19512 = C0024.m1951();
                        messageM19512.obj = C0023.m1844();
                        C0069.m5762(C0030.m2911(c0361f2M25282), messageM19512);
                        C0034.m3430(c0361f2M25282, C0021.m1573());
                    }
                }
                TextView textViewM72792 = C0077.m7279(dialogC0331b0M41772);
                if (textViewM72792 != null) {
                    C0063.m4382(textViewM72792, 8);
                }
                C0020.m1338(dialogC0331b0M41772);
                break;
        }
    }
}
