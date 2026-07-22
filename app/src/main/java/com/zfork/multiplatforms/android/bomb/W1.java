package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class W1 extends PopupWindow {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f292short = {2736, 2694, 2711, 2755, 2733, 2700, 2695, 2694, 1899, 1806, 1806, 1915, 1802, 1915, 1912, 2719, 2750, 2743, 2750, 2735, 2750, 2811, 2709, 2740, 2751, 2750, 2869, 2839, 2840, 2837, 2835, 2842};
    public final T1 a;

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7016() {
        if (C0025.m2132() > 0) {
            return f292short;
        }
        return null;
    }

    public W1(Activity activity, T1 t1) {
        this.a = t1;
        U1 u1 = new U1(activity);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C0035.m3620(43, activity));
        TextView textView = new TextView(activity);
        u1.a = textView;
        C0034.m3509(textView, C0071.m5977());
        C0027.m2442(C0028.m2619(u1), -1);
        C0016.m687(C0028.m2619(u1), layoutParams);
        C0019.m1180(C0028.m2619(u1), C0016.m625(m7016(), 0, 8, 2787));
        C0016.m722(C0028.m2619(u1), 2, 14.0f);
        C0066.m4801(C0028.m2619(u1), 17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C0035.m3620(43, activity));
        C0019.m1232(layoutParams2, 3, C0072.m6212(C0028.m2619(u1)));
        TextView textView2 = new TextView(activity);
        u1.b = textView2;
        C0034.m3509(textView2, C0071.m5977());
        C0027.m2442(C0037.m3808(u1), C0031.m2985(C0033.m3330(m7016(), 8, 7, 1864)));
        C0016.m687(C0037.m3808(u1), layoutParams2);
        C0019.m1180(C0037.m3808(u1), C0038.m4022(m7016(), 15, 11, 2779));
        C0016.m722(C0037.m3808(u1), 2, 14.0f);
        C0066.m4801(C0037.m3808(u1), 17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C0035.m3620(43, activity));
        C0019.m1232(layoutParams3, 3, C0072.m6212(C0037.m3808(u1)));
        TextView textView3 = new TextView(activity);
        u1.c = textView3;
        C0027.m2442(textView3, -1);
        C0016.m687(C0111.m13144(u1), layoutParams3);
        C0019.m1180(C0111.m13144(u1), C0017.m936(m7016(), 26, 6, 2934));
        C0016.m722(C0111.m13144(u1), 2, 14.0f);
        C0066.m4801(C0111.m13144(u1), 17);
        C0065.m4689(relativeLayout, C0028.m2619(u1));
        C0065.m4689(relativeLayout, C0037.m3808(u1));
        C0065.m4689(relativeLayout, C0111.m13144(u1));
        C0065.m4689(u1, relativeLayout);
        C0039.m4187(u1, C0078.m7454(activity));
        C0075.m6831(this, u1);
        C0029.m2712(this, C0035.m3620(88, activity));
        C0030.m2861(this, C0035.m3620(129, activity));
        C0023.m1804(this, true);
        V1 v1 = new V1(this, activity, 0);
        TextView textViewM2607 = C0028.m2607(u1);
        if (textViewM2607 != null) {
            C0065.m4727(textViewM2607, v1);
        }
        ViewOnClickListenerC0391k0 viewOnClickListenerC0391k0 = new ViewOnClickListenerC0391k0(1, this);
        TextView textViewM3533 = C0035.m3533(u1);
        if (textViewM3533 != null) {
            C0065.m4727(textViewM3533, viewOnClickListenerC0391k0);
        }
        ViewOnClickListenerC0438s0 viewOnClickListenerC0438s0 = new ViewOnClickListenerC0438s0(1, this);
        TextView textViewM1407 = C0020.m1407(u1);
        if (textViewM1407 != null) {
            C0065.m4727(textViewM1407, viewOnClickListenerC0438s0);
        }
    }
}
