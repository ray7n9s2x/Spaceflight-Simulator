package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.zfork.entry.C0075;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0454u4 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f369short = {2755, 2771, 2754, 2777, 2752, 2756, 2799, 2752, 2783, 2752, 2757, 2752, 2759, 2777, 2782, 2772, 2783, 2759, 2799, 2777, 2756, 2773, 2781, 3065, 3044, 3044, 3071, 1719, 1717, 1727, 1721, 1720, 1698, 1673, 1727, 1698, 1715, 1723, 1673, 1715, 1714, 1727, 1698, 1137, 1139, 1145, 1151, 1150, 1124, 1103, 1145, 1124, 1141, 1149, 1103, 1140, 1141, 1148, 1141, 1139, 1124, 3171, 3169, 3179, 3181, 3180, 3190, 3165, 3179, 3190, 3175, 3183, 3165, 3169, 3171, 3169, 3175, 3182, 593, 577, 592, 587, 594, 598, 637, 594, 589, 594, 599, 597, 587, 588, 582, 589, 597, 637, 576, 581};
    public final /* synthetic */ C0370g4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ScriptProjectAliasBean c;
    public final /* synthetic */ C0460v4 d;

    public /* synthetic */ ViewOnClickListenerC0454u4(C0370g4 c0370g4, int i, ScriptProjectAliasBean scriptProjectAliasBean, C0460v4 c0460v4) {
        this.a = c0370g4;
        this.b = i;
        this.c = scriptProjectAliasBean;
        this.d = c0460v4;
    }

    /* JADX INFO: renamed from: ۦۡۨۤ, reason: contains not printable characters */
    public static short[] m7129() {
        if (C0030.m2940() > 0) {
            return f369short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T t = (T) C0023.m1842(C0078.m7376(this));
        if (t != null) {
            ImageView imageViewM5413 = C0067.m5413(C0031.m3009(this));
            View viewM5715 = C0069.m5715(C0072.m6116(m7129(), 0, 23, 2736));
            View viewM2688 = C0029.m2688(viewM5715, C0071.m5991(m7129(), 23, 4, 2955));
            View viewM26882 = C0029.m2688(viewM5715, C0077.m7205(m7129(), 27, 16, 1750));
            View viewM26883 = C0029.m2688(viewM5715, C0024.m1945(m7129(), 43, 18, 1040));
            View viewM26884 = C0029.m2688(viewM5715, C0071.m5991(m7129(), 61, 17, 3074));
            C0039.m4187(viewM2688, C0071.m6091(C0025.m2151(m7129(), 78, 20, 546)));
            PopupWindow popupWindow = new PopupWindow(viewM5715, -2, -2);
            C0381i2 c0381i2 = (C0381i2) C0077.m7245(t);
            c0381i2.h = popupWindow;
            C0068.m5676(popupWindow, imageViewM5413, -C0075.m6777(C0022.m1755(c0381i2), 90.0f), -C0075.m6777(C0022.m1755(c0381i2), 30.0f), GravityCompat.START);
            C0065.m4727(viewM26884, new ViewOnClickListenerC0391k0(3, t));
            ScriptProjectAliasBean scriptProjectAliasBeanM6187 = C0072.m6187(this);
            C0065.m4727(viewM26882, new ViewOnClickListenerC0368g2(t, C0022.m1688(this), scriptProjectAliasBeanM6187, 0));
            C0065.m4727(viewM26883, new V1(t, scriptProjectAliasBeanM6187, 1));
        }
    }
}
