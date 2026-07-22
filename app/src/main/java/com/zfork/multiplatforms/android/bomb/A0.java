package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f228short = {1512, 1502, 1476, 1425, 1488, 1475, 1492, 1425, 1490, 1476, 1475, 1475, 1492, 1503, 1477, 1501, 1480, 1425, 1490, 1475, 1492, 1488, 1477, 1496, 1503, 1494, 1425, 1488, 1425, 1490, 1501, 1496, 1490, 1498, 1492, 1475, 1425, 1474, 1502, 1501, 1476, 1477, 1496, 1502, 1503, 1439, 1425, 1520, 1475, 1492, 1425, 1480, 1502, 1476, 1425, 1474, 1476, 1475, 1492, 1425, 1480, 1502, 1476, 1425, 1478, 1488, 1503, 1477, 1425, 1477, 1502, 1425, 1492, 1481, 1496, 1477, 1422, 1425, 1528, 1477, 1425, 1496, 1474, 1425, 1475, 1492, 1490, 1502, 1500, 1500, 1492, 1503, 1493, 1492, 1493, 1425, 1477, 1497, 1488, 1477, 1425, 1480, 1502, 1476, 1425, 1474, 1488, 1479, 1492, 1425, 1477, 1497, 1492, 1425, 1474, 1502, 1501, 1476, 1477, 1496, 1502, 1503, 1425, 1491, 1492, 1495, 1502, 1475, 1492, 1425, 1492, 1481, 1496, 1477, 1496, 1503, 1494, 1425, 1477, 1502, 1425, 1488, 1479, 1502, 1496, 1493, 1425, 1501, 1502, 1474, 1496, 1503, 1494, 1425, 1496, 1477, 1439, 2132, 2160, 2156, 2161, 2426, 2380, 2390, 2307, 2370, 2385, 2374, 2307, 2368, 2390, 2385, 2385, 2374, 2381, 2391, 2383, 2394, 2307, 2368, 2385, 2374, 2370, 2391, 2378, 2381, 2372, 2307, 2370, 2307, 2368, 2383, 2378, 2368, 2376, 2374, 2385, 2307, 2384, 2380, 2383, 2390, 2391, 2378, 2380, 2381, 2317, 2307, 2402, 2385, 2374, 2307, 2394, 2380, 2390, 2307, 2384, 2390, 2385, 2374, 2307, 2394, 2380, 2390, 2307, 2388, 2370, 2381, 2391, 2307, 2391, 2380, 2307, 2374, 2395, 2378, 2391, 2332, 2307, 2410, 2391, 2307, 2378, 2384, 2307, 2385, 2374, 2368, 2380, 2382, 2382, 2374, 2381, 2375, 2374, 2375, 2307, 2391, 2379, 2370, 2391, 2307, 2394, 2380, 2390, 2307, 2384, 2370, 2389, 2374, 2307, 2391, 2379, 2374, 2307, 2384, 2380, 2383, 2390, 2391, 2378, 2380, 2381, 2307, 2369, 2374, 2373, 2380, 2385, 2374, 2307, 2374, 2395, 2378, 2391, 2378, 2381, 2372, 2307, 2391, 2380, 2307, 2370, 2389, 2380, 2378, 2375, 2307, 2383, 2380, 2384, 2378, 2381, 2372, 2307, 2378, 2391, 2317, 1797, 1825, 1853, 1824};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ A0(C0 c0, Context context, int i) {
        this.a = i;
        this.b = c0;
        this.c = context;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6905() {
        if (C0070.m5903() > 0) {
            return f228short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0037.m3900(this)) {
            case 0:
                C0 c0M3840 = C0037.m3840(this);
                boolean z = !C0030.m2969(c0M3840);
                c0M3840.v = z;
                C0016.m706(c0M3840, C0073.m6427(this), z);
                break;
            case 1:
                C0 c0M38402 = C0037.m3840(this);
                C0479z c0479zM1659 = C0022.m1659(c0M38402);
                Context contextM6427 = C0073.m6427(this);
                if (c0479zM1659 != null) {
                    O1 o1 = (O1) C0064.m4580(c0479zM1659);
                    if (o1 != null ? C0029.m2708(o1) : false) {
                        C0029.m2786(C0032.m3123(contextM6427, C0069.m5807(m6905(), 161, 157, 2339), C0023.m1904(m6905(), 318, 4, 1876), new C0324a0(1, c0M38402)));
                    }
                }
                C0017.m870(c0M38402, 0, contextM6427);
                break;
            case 2:
                C0 c0M38403 = C0037.m3840(this);
                C0017.m870(c0M38403, 1, C0073.m6427(this));
                if (!C0078.m7334(c0M38403)) {
                    c0M38403.G = true;
                    C0017.m859(c0M38403, true);
                } else {
                    C0017.m859(c0M38403, false);
                }
                break;
            case 3:
                C0 c0M38404 = C0037.m3840(this);
                C0479z c0479zM16592 = C0022.m1659(c0M38404);
                Context contextM64272 = C0073.m6427(this);
                if (c0479zM16592 != null) {
                    O1 o12 = (O1) C0064.m4580(c0479zM16592);
                    if (o12 != null ? C0029.m2708(o12) : false) {
                        C0029.m2786(C0032.m3123(contextM64272, C0032.m3209(m6905(), 0, 157, 1457), C0019.m1189(m6905(), 157, 4, 2053), new C0324a0(1, c0M38404)));
                    }
                }
                C0017.m870(c0M38404, 2, contextM64272);
                if (!C0029.m2762(c0M38404)) {
                    c0M38404.H = true;
                    View viewM2426 = C0027.m2426(c0M38404);
                    if (viewM2426 instanceof C0361f2) {
                        C0018.m1034((C0361f2) viewM2426, true);
                    }
                } else {
                    View viewM24262 = C0027.m2426(c0M38404);
                    if (viewM24262 instanceof C0361f2) {
                        C0018.m1034((C0361f2) viewM24262, false);
                    }
                }
                break;
            case 4:
                C0 c0M38405 = C0037.m3840(this);
                boolean z2 = !C0030.m2969(c0M38405);
                c0M38405.v = z2;
                C0027.m2510(c0M38405, C0073.m6427(this), z2);
                break;
            case 5:
                C0 c0M38406 = C0037.m3840(this);
                boolean z3 = !C0030.m2969(c0M38406);
                c0M38406.v = z3;
                C0027.m2510(c0M38406, C0073.m6427(this), z3);
                break;
            case 6:
                C0 c0M38407 = C0037.m3840(this);
                boolean z4 = !C0030.m2969(c0M38407);
                c0M38407.v = z4;
                C0027.m2510(c0M38407, C0073.m6427(this), z4);
                break;
            case 7:
                C0 c0M38408 = C0037.m3840(this);
                if (!C0030.m2969(c0M38408)) {
                    if (C0029.m2762(c0M38408)) {
                        View viewM24263 = C0027.m2426(c0M38408);
                        if (viewM24263 instanceof C0361f2) {
                            C0018.m1034((C0361f2) viewM24263, false);
                        }
                    } else {
                        c0M38408.H = true;
                        View viewM24264 = C0027.m2426(c0M38408);
                        if (viewM24264 instanceof C0361f2) {
                            C0018.m1034((C0361f2) viewM24264, true);
                        }
                    }
                }
                boolean z5 = !C0030.m2969(c0M38408);
                c0M38408.v = z5;
                C0027.m2510(c0M38408, C0073.m6427(this), z5);
                if (!C0074.m6486(c0M38408)) {
                    TextView textViewM7394 = C0078.m7394(c0M38408);
                    if (textViewM7394 != null) {
                        C0063.m4382(textViewM7394, 8);
                    }
                    View viewM6145 = C0072.m6145(c0M38408);
                    if (viewM6145 != null) {
                        C0063.m4382(viewM6145, 8);
                    }
                }
                break;
            default:
                C0 c0M38409 = C0037.m3840(this);
                boolean z6 = !C0030.m2969(c0M38409);
                c0M38409.v = z6;
                C0027.m2510(c0M38409, C0073.m6427(this), z6);
                break;
        }
    }
}
