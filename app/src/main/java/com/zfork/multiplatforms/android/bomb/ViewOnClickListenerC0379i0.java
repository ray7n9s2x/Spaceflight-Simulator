package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
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
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPointerBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0379i0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f333short = {2435, 2495, 2482, 2551, 2468, 2491, 2494, 2483, 2494, 2489, 2480, 2551, 2483, 2466, 2469, 2486, 2467, 2494, 2488, 2489, 2551, 2484, 2486, 2489, 2489, 2488, 2467, 2551, 2485, 2482, 2551, 2491, 2482, 2468, 2468, 2551, 2467, 2495, 2486, 2489, 2551, 2532, 2535, 2535, 2490, 2468, 1729, 1789, 1776, 1717, 1784, 1788, 1787, 1788, 1784, 1760, 1784, 1717, 1777, 1760, 1767, 1780, 1761, 1788, 1786, 1787, 1717, 1766, 1760, 1765, 1765, 1786, 1767, 1761, 1776, 1777, 1717, 1783, 1772, 1717, 1757, 1754, 1753, 1745, 1717, 1788, 1766, 1717, 1700, 1701, 1701, 1701, 1766};
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogC0385j0 b;

    public /* synthetic */ ViewOnClickListenerC0379i0(DialogC0385j0 dialogC0385j0, int i) {
        this.a = i;
        this.b = dialogC0385j0;
    }

    /* JADX INFO: renamed from: ۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7076() {
        if (C0075.m6893() >= 0) {
            return f333short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0077.m7258(this)) {
            case 0:
                C0020.m1338(C0074.m6537(this));
                break;
            default:
                DialogC0385j0 dialogC0385j0M6537 = C0074.m6537(this);
                EditText editTextM2750 = C0029.m2750(dialogC0385j0M6537);
                AutoClickPointerBean autoClickPointerBeanM1618 = C0021.m1618(dialogC0385j0M6537);
                if (editTextM2750 != null && !C0038.m3939(C0075.m6801(editTextM2750))) {
                    C0075.m6813(autoClickPointerBeanM1618, C0024.m2019(C0068.m5593(autoClickPointerBeanM1618), C0074.m6524(C0075.m6801(C0029.m2750(dialogC0385j0M6537)))));
                }
                EditText editTextM998 = C0018.m998(dialogC0385j0M6537);
                if (editTextM998 != null && !C0038.m3939(C0075.m6801(editTextM998))) {
                    C0071.m6037(autoClickPointerBeanM1618, C0024.m2019(100, C0074.m6524(C0075.m6801(C0018.m998(dialogC0385j0M6537)))));
                }
                EditText editTextM3922 = C0038.m3922(dialogC0385j0M6537);
                if (editTextM3922 != null && !C0038.m3939(C0075.m6801(editTextM3922))) {
                    C0078.m7403(autoClickPointerBeanM1618, C0024.m2019(150, C0074.m6524(C0075.m6801(C0038.m3922(dialogC0385j0M6537)))));
                }
                EditText editTextM4413 = C0063.m4413(dialogC0385j0M6537);
                if (editTextM4413 != null && !C0038.m3939(C0075.m6801(editTextM4413))) {
                    int iM2019 = C0024.m2019(10, C0074.m6524(C0075.m6801(C0063.m4413(dialogC0385j0M6537))));
                    int iM2273 = C0026.m2273(autoClickPointerBeanM1618);
                    Activity activityM2770 = C0029.m2770(dialogC0385j0M6537);
                    if (iM2273 == 3 && iM2019 < 300) {
                        C0030.m2968(C0023.m1884(activityM2770, C0019.m1189(m7076(), 0, 46, 2519), 0));
                        C0019.m1180(C0063.m4413(dialogC0385j0M6537), C0078.m7464(300));
                    } else if (C0026.m2273(autoClickPointerBeanM1618) == 2 && iM2019 < 1000) {
                        C0030.m2968(C0023.m1884(activityM2770, C0076.m6902(m7076(), 46, 47, 1685), 0));
                        C0019.m1180(C0063.m4413(dialogC0385j0M6537), C0078.m7464(1000));
                    } else {
                        C0034.m3504(autoClickPointerBeanM1618, iM2019);
                    }
                }
                EditText editTextM6157 = C0072.m6157(dialogC0385j0M6537);
                if (editTextM6157 != null && !C0038.m3939(C0075.m6801(editTextM6157))) {
                    C0068.m5654(autoClickPointerBeanM1618, C0024.m2019(100, C0074.m6524(C0075.m6801(C0072.m6157(dialogC0385j0M6537)))));
                }
                EditText editTextM3082 = C0031.m3082(dialogC0385j0M6537);
                if (editTextM3082 != null && !C0038.m3939(C0075.m6801(editTextM3082))) {
                    C0023.m1886(autoClickPointerBeanM1618, C0024.m2019(150, C0074.m6524(C0075.m6801(C0031.m3082(dialogC0385j0M6537)))));
                }
                EditText editTextM2934 = C0030.m2934(dialogC0385j0M6537);
                if (editTextM2934 != null && !C0038.m3939(C0075.m6801(editTextM2934))) {
                    C0064.m4584(autoClickPointerBeanM1618, C0024.m2019(5, C0074.m6524(C0075.m6801(C0030.m2934(dialogC0385j0M6537)))));
                }
                if (!C0037.m3902(C0028.m2556(dialogC0385j0M6537), C0078.m7464(C0068.m5593(autoClickPointerBeanM1618))) || !C0037.m3902(C0037.m3795(dialogC0385j0M6537), C0078.m7464(C0035.m3634(autoClickPointerBeanM1618))) || !C0037.m3902(C0034.m3435(dialogC0385j0M6537), C0078.m7464(C0016.m635(autoClickPointerBeanM1618))) || !C0037.m3902(C0065.m4697(dialogC0385j0M6537), C0078.m7464(C0037.m3776(autoClickPointerBeanM1618))) || !C0037.m3902(C0038.m3982(dialogC0385j0M6537), C0078.m7464(C0027.m2522(autoClickPointerBeanM1618))) || !C0037.m3902(C0078.m7439(dialogC0385j0M6537), C0078.m7464(C0027.m2525(autoClickPointerBeanM1618))) || !C0037.m3902(C0022.m1676(dialogC0385j0M6537), C0078.m7464(C0065.m4713(autoClickPointerBeanM1618)))) {
                    C0033.m3367().h = true;
                }
                C0020.m1338(dialogC0385j0M6537);
                break;
        }
    }
}
