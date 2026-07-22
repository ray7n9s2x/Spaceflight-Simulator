package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
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
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class M1 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f265short = {835, 844, 894, 832, 852, 853, 846, 834, 845, 840, 834, 842, 894, 839, 845, 846, 832, 853, 894, 834, 845, 840, 834, 842, 894, 835, 832, 834, 842, 783, 849, 847, 838, 2732, 2712, 2713, 2690, 2765, 2734, 2689, 2692, 2702, 2694, 2696, 2719, 2765, 2724, 2691, 2713, 2719, 2690, 3078, 3098, 3098, 3102, 3101, 3156, 3137, 3137, 3081, 3087, 3075, 3083, 3077, 3079, 3074, 3074, 3083, 3100, 3087, 3102, 3102, 3136, 3085, 3073, 3075, 3137, 3101, 3087, 3072, 3082, 3084, 3073, 3094, 3137, 3074, 3079, 3072, 3077, 3083, 3100};

    /* JADX INFO: renamed from: ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6964() {
        if (C0028.m2593() >= 0) {
            return f265short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0036.m3700(C0038.m4007()) != null) {
            Activity activityM3700 = C0036.m3700(C0038.m4007());
            DialogC0403m0 dialogC0403m0 = new DialogC0403m0(activityM3700, R.style.Theme.Black.NoTitleBar.Fullscreen, 0);
            dialogC0403m0.b = activityM3700;
            LinearLayout linearLayout = new LinearLayout(activityM3700);
            C0016.m687(linearLayout, new ViewGroup.LayoutParams(-1, -1));
            C0039.m4187(linearLayout, C0078.m7454(activityM3700));
            C0025.m2098(linearLayout, 1);
            int iM3620 = C0035.m3620(16, activityM3700);
            RelativeLayout relativeLayout = new RelativeLayout(activityM3700);
            C0034.m3509(relativeLayout, C0071.m5977());
            C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(-1, C0035.m3620(45, activityM3700)));
            RelativeLayout relativeLayout2 = new RelativeLayout(activityM3700);
            C0016.m687(relativeLayout2, new RelativeLayout.LayoutParams(C0035.m3620(45, activityM3700), C0035.m3620(45, activityM3700)));
            ImageView imageView = new ImageView(activityM3700);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM3620, iM3620);
            C0111.m13050(layoutParams, 15);
            layoutParams.leftMargin = iM3620;
            C0016.m687(imageView, layoutParams);
            C0030.m2951(C0072.m6184());
            C0016.m713(imageView, C0069.m5749(C0019.m1189(m6964(), 0, 33, 801)));
            C0065.m4689(relativeLayout2, imageView);
            C0065.m4727(relativeLayout2, new ViewOnClickListenerC0391k0(0, dialogC0403m0));
            C0065.m4689(relativeLayout, relativeLayout2);
            dialogC0403m0.d = new TextView(activityM3700);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            C0111.m13050(layoutParams2, 13);
            C0016.m687(C0069.m5740(dialogC0403m0), layoutParams2);
            C0019.m1180(C0069.m5740(dialogC0403m0), C0031.m3047(m6964(), 33, 18, 2797));
            C0027.m2442(C0069.m5740(dialogC0403m0), -1);
            C0016.m722(C0069.m5740(dialogC0403m0), 2, 16.0f);
            C0022.m1661(C0069.m5740(dialogC0403m0), C0035.m3633(1));
            C0065.m4689(relativeLayout, C0069.m5740(dialogC0403m0));
            C0065.m4689(linearLayout, relativeLayout);
            dialogC0403m0.e = new ProgressBar(activityM3700, null, R.attr.progressBarStyleHorizontal);
            C0016.m687(C0028.m2610(dialogC0403m0), new LinearLayout.LayoutParams(-1, C0035.m3620(1, activityM3700)));
            C0065.m4689(linearLayout, C0028.m2610(dialogC0403m0));
            dialogC0403m0.c = new WebView(activityM3700);
            C0030.m2920(C0033.m3359(dialogC0403m0), new LinearLayout.LayoutParams(-1, C0035.m3620(300, activityM3700)));
            C0017.m884(C0022.m1717(C0033.m3359(dialogC0403m0)), true);
            C0069.m5736(C0022.m1717(C0033.m3359(dialogC0403m0)), true);
            C0036.m3716(C0022.m1717(C0033.m3359(dialogC0403m0)), -1);
            C0038.m3973(C0022.m1717(C0033.m3359(dialogC0403m0)), true);
            C0073.m6367(C0022.m1717(C0033.m3359(dialogC0403m0)), true);
            C0077.m7264(C0022.m1717(C0033.m3359(dialogC0403m0)), true);
            C0031.m3097(C0022.m1717(C0033.m3359(dialogC0403m0)), false);
            C0032.m3142(C0022.m1717(C0033.m3359(dialogC0403m0)), 2);
            C0028.m2591(C0022.m1717(C0033.m3359(dialogC0403m0)), false);
            C0026.m2247(C0022.m1717(C0033.m3359(dialogC0403m0)), C0074.m6453());
            C0029.m2725(C0033.m3359(dialogC0403m0), new WebViewClient());
            C0039.m4064(C0033.m3359(dialogC0403m0), new C0397l0(dialogC0403m0, 0));
            C0065.m4689(linearLayout, C0033.m3359(dialogC0403m0));
            C0073.m6392(dialogC0403m0, linearLayout);
            C0075.m6841(C0033.m3359(dialogC0403m0), C0027.m2404(m6964(), 51, 40, 3182));
            C0029.m2786(dialogC0403m0);
        }
    }
}
