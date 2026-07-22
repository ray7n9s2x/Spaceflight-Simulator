package com.zfork.multiplatforms.android.bomb;

import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends C0369g3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f231short = {3000, 2992, 2977, 2996, 2954, 2993, 2996, 2977, 2996, 2954, 2995, 3001, 2996, 2994, 2214, 2217, 2213, 2221, 2793, 2789, 2791, 2724, 2800, 2796, 2789, 2808, 2785, 2724, 2809, 2787, 2797, 899, 916, 921, 896, 912, 488, 480, 497, 484, 424, 481, 484, 497, 484, 2774, 2782, 2767, 2778, 2788, 2783, 2778, 2767, 2778, 2788, 2781, 2775, 2778, 2780, 779, 771, 786, 775, 843, 770, 775, 786, 775};
    public ArrayList e;
    public ArrayList f;
    public C0355e3 g;
    public C0450u0 h;

    /* JADX INFO: renamed from: ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6909() {
        if (C0073.m6356() <= 0) {
            return f231short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final AbstractC0441s3 b(String str, String str2) {
        ArrayList arrayListM4379;
        if (C0070.m5838(C0030.m2840(m6909(), 0, 14, 3029), str)) {
            AbstractC0441s3 abstractC0441s3B = super.b(null, str2);
            C0355e3 c0355e3M5686 = C0068.m5686(this);
            if (c0355e3M5686 != null) {
                String strM5704 = C0069.m5704(c0355e3M5686);
                ArrayList arrayList = new ArrayList();
                C0017.m919(arrayList, new G(C0064.m4545(m6909(), 14, 4, 2248), C0039.m4066(m6909(), 18, 13, 2698)));
                C0017.m919(arrayList, new G(C0077.m7205(m6909(), 31, 5, PointerIconCompat.TYPE_ALL_SCROLL), strM5704));
                return new U2(abstractC0441s3B, arrayList, true);
            }
        } else {
            if (C0070.m5838(C0026.m2321(m6909(), 36, 9, 389), str2) && (arrayListM4379 = C0063.m4379(this)) != null && !C0066.m4881(arrayListM4379)) {
                C0433r1 c0433r1 = new C0433r1(super.b(str, str2));
                c0433r1.c = false;
                c0433r1.b = arrayListM4379;
                return c0433r1;
            }
            if (C0069.m5708(C0018.m968(), str2)) {
                return new A(super.b(str, str2), C0069.m5790(this));
            }
        }
        return super.b(str, str2);
    }

    @Override // com.zfork.multiplatforms.android.bomb.C0369g3, com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void c() {
        ArrayList arrayListM2474 = C0027.m2474(this);
        if (arrayListM2474 != null) {
            Iterator itM4154 = C0039.m4154(arrayListM2474);
            while (C0036.m3657(itM4154)) {
                this.g = (C0355e3) C0071.m6012(itM4154);
                C0024.m2010(this, C0036.m3678(m6909(), 45, 14, 2747), C0111.m13097(m6909(), 59, 9, 870));
                this.g = null;
            }
        }
        super.c();
    }
}
