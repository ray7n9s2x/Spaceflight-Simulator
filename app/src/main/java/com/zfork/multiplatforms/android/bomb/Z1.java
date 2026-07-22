package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z1 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f298short = {429, 445, 428, 439, 430, 426, 385, 439, 445, 385, 428, 427, 432, 432, 439, 432, 441, 385, 430, 434, 447, 423};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0361f2 b;

    public /* synthetic */ Z1(C0361f2 c0361f2, int i) {
        this.a = i;
        this.b = c0361f2;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7023() {
        if (C0065.m4647() >= 0) {
            return f298short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0063.m4348(this)) {
            case 0:
                C0063.m4382(C0023.m1859(C0035.m3617(this)), 0);
                break;
            case 1:
                C0361f2 c0361f2M3617 = C0035.m3617(this);
                C0039.m4187(C0021.m1626(c0361f2M3617), C0071.m6091(C0072.m6116(m7023(), 0, 22, 478)));
                C0425p4 c0425p4M1859 = C0023.m1859(c0361f2M3617);
                if (c0425p4M1859 != null) {
                    C0063.m4382(c0425p4M1859, 8);
                    C0064.m4570(C0039.m4186(C0023.m1818(c0425p4M1859)));
                }
                break;
            case 2:
                C0022.m1725(C0023.m1818(C0023.m1859(C0035.m3617(this))));
                break;
            case 3:
                C0022.m1725(C0023.m1818(C0023.m1859(C0035.m3617(this))));
                break;
            default:
                C0022.m1725(C0023.m1818(C0023.m1859(C0035.m3617(this))));
                break;
        }
    }
}
