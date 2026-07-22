package com.zfork.multiplatforms.android.bomb;

import android.app.AlertDialog;
import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0386j1 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f336short = {1394, 1352, 1353, 1357, 1352, 1353, 3153, 3194, 3197, 3197, 3169, 3191, 3122, 3191, 3198, 3122, 3187, 3174, 3174, 3168, 3195, 3184, 3175, 3174, 3191, 3122, 3174, 3179, 3170, 3191, 2643, 2664, 2671, 2674, 2687, 2613, 2626, 882, 894, 882, 894, 866, 817, 893, 868, 880, 1886, 1833, 1869, 1834, 1804, 1792, 1800, 1869, 1826, 1795, 1800, 525, 553, 547, 571};
    public final /* synthetic */ int a;
    public final /* synthetic */ ConsumerAbility b;
    public final /* synthetic */ C0351e c;

    public /* synthetic */ ViewOnClickListenerC0386j1(ConsumerAbility consumerAbility, C0351e c0351e, int i) {
        this.a = i;
        this.b = consumerAbility;
        this.c = c0351e;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m7079() {
        if (C0073.m6356() < 0) {
            return f336short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0351e c0351eM2577 = C0028.m2577(this);
        ConsumerAbility consumerAbilityM2225 = C0025.m2225(this);
        switch (C0030.m2856(this)) {
            case 0:
                C0023.m1832();
                C0030.m2951(consumerAbilityM2225);
                try {
                    AlertDialog.Builder builder = new AlertDialog.Builder(consumerAbilityM2225);
                    C0021.m1597(builder, C0064.m4545(m7079(), 6, 24, 3090));
                    C0016.m684(builder, new String[]{C0038.m4022(m7079(), 30, 7, 2566), C0018.m1070(m7079(), 37, 9, 785), C0038.m4022(m7079(), 46, 11, 1901)}, C0033.m3285(consumerAbilityM2225), new DialogInterfaceOnClickListenerC0374h1(consumerAbilityM2225, c0351eM2577));
                    C0021.m1549(builder, C0070.m5942(m7079(), 57, 4, 578), new DialogInterfaceOnClickListenerC0380i1());
                    C0022.m1662(builder);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                C0023.m1832();
                C0030.m2951(consumerAbilityM2225);
                C0019.m1180(C0075.m6861(c0351eM2577), C0034.m3431(m7079(), 0, 6, 1341));
                C0065.m4734(new Thread(new RunnableC0360f1(consumerAbilityM2225, 1)));
                C0019.m1180(C0033.m3382(c0351eM2577), C0031.m2993());
                break;
        }
    }
}
