package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.InputFilter;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
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
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0373h0 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f327short = {548, 570, 573, 567, 572, 548, 261, 306, 308, 312, 293, 307, 375, 260, 306, 291, 291, 318, 313, 304, 2898, 2909, 2927, 2897, 2885, 2884, 2911, 2899, 2908, 2905, 2899, 2907, 2927, 2902, 2908, 2911, 2897, 2884, 2927, 2897, 2885, 2884, 2911, 2927, 2899, 2908, 2905, 2899, 2907, 2927, 2880, 2908, 2897, 2910, 2927, 2900, 2901, 2908, 2901, 2884, 2901, 2846, 2880, 2910, 2903, 2068, 2083, 2085, 2089, 2100, 2082, 2150, 2056, 2087, 2091, 2083, 1739, 1788, 1786, 1782, 1771, 1789, 1721, 1737, 1781, 1784, 1760, 1721, 1754, 1782, 1772, 1783, 1773, 1717, 1721, 1705, 1721, 1700, 1721, 1744, 1783, 1791, 1721, 1749, 1782, 1782, 1769, 2679, 2628, 2625, 2650, 2624, 1010, 977, 977, 974, 926, 1021, 977, 971, 976, 970, 394, 446, 447, 420, 491, 443, 423, 426, 434, 491, 421, 430, 435, 447, 491, 441, 430, 424, 420, 441, 431, 491, 426, 429, 447, 430, 441, 491, 447, 419, 430, 491, 430, 421, 431, 491, 420, 429, 491, 424, 446, 441, 441, 430, 421, 447, 491, 420, 421, 430, 485, 1996, 2002, 2854, 2821, 2821, 2842, 2890, 2819, 2820, 2846, 2831, 2840, 2844, 2827, 2822, 1864, 1898, 1893, 1896, 1902, 1895, 1947, 1931, 1930, 1931, 1930, 1931, 1930, 1295, 1341, 1322, 1337, 1123, 1030, 1030, 1029, 1141, 1145, 1137, 2567, 2583, 2583, 2626, 2626, 2626, 2626, 2626, 2626, 2433, 2503, 2458, 2503, 2458, 2503, 2458, 888, 872, 873, 872, 873, 872, 873};
    public final Activity a;
    public final Point b;
    public final EditText c;
    public final EditText d;
    public final EditText e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final AutoClickPlanBean i;
    public ViewOnClickListenerC0462w0 j;
    public InterfaceC0477y3 k;
    public ViewOnClickListenerC0480z0 l;
    public final int m;
    public final int n;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public boolean s;

    /* JADX INFO: renamed from: ۦۥۢ۟, reason: contains not printable characters */
    public static short[] m7068() {
        if (C0016.m717() < 0) {
            return f327short;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0373h0(Activity activity, AutoClickPlanBean autoClickPlanBean) {
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        int i = 1;
        int i2 = 0;
        this.s = false;
        this.a = activity;
        this.i = autoClickPlanBean;
        Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(activity, C0037.m3829(m7068(), 0, 6, 595)));
        Point point = new Point();
        this.b = point;
        C0035.m3525(displayM5833, point);
        if (C0068.m5537(point) > C0025.m2215(point)) {
            this.m = C0035.m3620(16, activity);
            this.n = C0035.m3620(78, activity);
            this.o = C0035.m3620(8, activity);
        } else {
            this.m = C0035.m3620(20, activity);
            this.n = C0035.m3620(65, activity);
            this.o = C0035.m3620(12, activity);
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        C0016.m687(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        C0025.m2098(linearLayout, 1);
        C0039.m4187(linearLayout, C0078.m7454(activity));
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        C0016.m687(relativeLayout, new LinearLayout.LayoutParams(-1, C0035.m3620(45, activity)));
        TextView textView = new TextView(activity);
        C0034.m3509(textView, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        C0111.m13050(layoutParams, 13);
        C0016.m687(textView, layoutParams);
        C0027.m2442(textView, -1);
        C0016.m722(textView, 2, 16.0f);
        C0022.m1661(textView, C0035.m3633(1));
        C0019.m1180(textView, C0075.m6791(m7068(), 6, 14, 343));
        this.h = new ImageView(activity);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C0035.m3620(18, activity), C0035.m3620(18, activity));
        C0111.m13050(layoutParams2, 21);
        C0111.m13050(layoutParams2, 15);
        int iM4739 = C0065.m4739(this);
        C0072.m6126(layoutParams2, iM4739);
        C0016.m687(C0111.m13140(this), layoutParams2);
        ImageView imageViewM13140 = C0111.m13140(this);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageViewM13140, C0069.m5749(C0024.m1945(m7068(), 20, 45, 2864)));
        C0065.m4689(relativeLayout, textView);
        C0065.m4689(relativeLayout, C0111.m13140(this));
        C0065.m4689(linearLayout, relativeLayout);
        C0065.m4689(linearLayout, C0032.m3226(this, activity));
        TextView textView2 = new TextView(activity);
        C0016.m687(textView2, new LinearLayout.LayoutParams(-2, -2));
        C0027.m2442(textView2, -1);
        C0016.m722(textView2, 2, 14.0f);
        C0022.m1661(textView2, C0035.m3633(1));
        C0019.m1180(textView2, C0031.m3047(m7068(), 65, 11, 2118));
        this.c = new EditText(activity);
        if (C0038.m3939(C0064.m4632(autoClickPlanBean))) {
            L lM3367 = C0033.m3367();
            this.p = C0068.m5642(lM3367);
            C0019.m1180(C0068.m5641(this), C0068.m5642(lM3367));
        } else {
            this.p = C0064.m4632(autoClickPlanBean);
            C0019.m1180(C0068.m5641(this), C0064.m4632(autoClickPlanBean));
        }
        C0027.m2442(C0068.m5641(this), -1);
        C0016.m722(C0068.m5641(this), 2, 12.0f);
        C0028.m2613(C0068.m5641(this), new InputFilter[]{new InputFilter.LengthFilter(30)});
        C0039.m4187(C0068.m5641(this), C0020.m1352(activity, C0035.m3620(8, activity)));
        C0065.m4722(C0068.m5641(this));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        if (C0068.m5537(point) > C0025.m2215(point)) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            C0037.m3853(layoutParams3, iM4739);
            C0072.m6126(layoutParams3, iM4739);
            C0016.m687(linearLayout2, layoutParams3);
            C0063.m4385(linearLayout2, 16);
            C0025.m2098(linearLayout2, 1);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, C0035.m3620(27, activity));
            C0037.m3919(layoutParams4, 0, C0035.m3620(8, activity), 0, 0);
            C0016.m687(C0068.m5641(this), layoutParams4);
        } else {
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, C0035.m3620(51, activity));
            C0037.m3853(layoutParams5, iM4739);
            C0072.m6126(layoutParams5, iM4739);
            C0016.m687(linearLayout2, layoutParams5);
            C0063.m4385(linearLayout2, 16);
            C0025.m2098(linearLayout2, 0);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, C0035.m3620(27, activity));
            layoutParams6.weight = 1.0f;
            C0037.m3853(layoutParams6, C0035.m3620(20, activity));
            C0016.m687(C0068.m5641(this), layoutParams6);
        }
        C0065.m4689(linearLayout2, textView2);
        C0065.m4689(linearLayout2, C0068.m5641(this));
        C0065.m4689(linearLayout, linearLayout2);
        if (C0068.m5537(point) < C0025.m2215(point)) {
            View viewM3226 = C0032.m3226(this, activity);
            C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM3226), C0035.m3620(20, activity), 0, C0035.m3620(20, activity), 0);
            C0065.m4689(linearLayout, viewM3226);
        }
        this.d = C0022.m1726(activity);
        this.q = C0078.m7464(C0016.m673(autoClickPlanBean));
        C0019.m1180(C0065.m4744(this), C0078.m7464(C0016.m673(autoClickPlanBean)));
        RelativeLayout relativeLayoutM2890 = C0030.m2890(this, activity, C0024.m1945(m7068(), 112, 10, 958), C0029.m2695(m7068(), 76, 31, 1689), C0065.m4744(this), C0024.m1945(m7068(), 107, 5, 2612));
        this.e = C0022.m1726(activity);
        this.r = C0078.m7464(C0038.m3952(autoClickPlanBean));
        C0019.m1180(C0068.m5594(this), C0078.m7464(C0038.m3952(autoClickPlanBean)));
        RelativeLayout relativeLayoutM28902 = C0030.m2890(this, activity, C0019.m1189(m7068(), 175, 13, 2922), C0069.m5807(m7068(), 122, 51, 459), C0068.m5594(this), C0034.m3431(m7068(), 173, 2, 1953));
        C0065.m4689(linearLayout, relativeLayoutM2890);
        View viewM32262 = C0032.m3226(this, activity);
        C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM32262), C0035.m3620(20, activity), 0, C0035.m3620(20, activity), 0);
        C0065.m4689(linearLayout, viewM32262);
        C0065.m4689(linearLayout, relativeLayoutM28902);
        View viewM32263 = C0032.m3226(this, activity);
        C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM32263), 0, C0030.m2915(this), 0, 0);
        C0065.m4689(linearLayout, viewM32263);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        C0016.m687(linearLayout3, new LinearLayout.LayoutParams(-1, C0035.m3620(49, activity)));
        C0025.m2098(linearLayout3, 0);
        this.f = new TextView(activity);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1);
        layoutParams7.weight = 1.0f;
        C0016.m687(C0036.m3662(this), layoutParams7);
        C0066.m4801(C0036.m3662(this), 17);
        C0019.m1180(C0036.m3662(this), C0019.m1189(m7068(), 188, 6, 1803));
        C0027.m2442(C0036.m3662(this), -1);
        C0016.m722(C0036.m3662(this), 2, 14.0f);
        View view = new View(activity);
        C0016.m687(view, new ViewGroup.LayoutParams(C0035.m3620(1, activity), -1));
        C0028.m2660(view, C0031.m2985(C0025.m2151(m7068(), 194, 7, 1976)));
        this.g = new TextView(activity);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -1);
        layoutParams8.weight = 1.0f;
        C0016.m687(C0077.m7187(this), layoutParams8);
        C0066.m4801(C0077.m7187(this), 17);
        C0019.m1180(C0077.m7187(this), C0068.m5544(m7068(), 201, 4, 1372));
        C0027.m2442(C0077.m7187(this), C0031.m2985(C0069.m5807(m7068(), 205, 7, 1088)));
        C0016.m722(C0077.m7187(this), 2, 14.0f);
        C0065.m4689(linearLayout3, C0036.m3662(this));
        C0065.m4689(linearLayout3, view);
        C0065.m4689(linearLayout3, C0077.m7187(this));
        C0065.m4689(linearLayout, linearLayout3);
        C0073.m6392(this, linearLayout);
        C0020.m1439(this, false);
        ImageView imageViewM131402 = C0111.m13140(this);
        if (imageViewM131402 != null) {
            C0065.m4727(imageViewM131402, new ViewOnClickListenerC0366g0(this, i2));
        }
        TextView textViewM3662 = C0036.m3662(this);
        if (textViewM3662 != null) {
            C0065.m4727(textViewM3662, new ViewOnClickListenerC0366g0(this, i));
        }
        TextView textViewM7187 = C0077.m7187(this);
        if (textViewM7187 != null) {
            C0065.m4727(textViewM7187, new ViewOnClickListenerC0366g0(this, 2));
        }
    }

    public static ShapeDrawable a(Activity activity, int i) {
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = C0035.m3620(4, activity);
            fArr2[i2] = C0035.m3620(4, activity);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0111.m13097(m7068(), 212, 9, 2596)));
        C0063.m4341(shapeDrawable, i, C0035.m3620(2, activity), 0, C0035.m3620(2, activity));
        return shapeDrawable;
    }

    public static EditText b(Activity activity) {
        EditText editText = new EditText(activity);
        C0034.m3509(editText, C0071.m5977());
        C0039.m4187(editText, C0020.m1352(activity, 0));
        C0028.m2613(editText, new InputFilter[]{new InputFilter.LengthFilter(10)});
        C0028.m2652(editText, 2);
        C0016.m722(editText, 2, 12.0f);
        C0027.m2442(editText, -1);
        C0066.m4801(editText, 17);
        return editText;
    }

    public final RelativeLayout c(Activity activity, String str, String str2, EditText editText, String str3) {
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C0017.m863(this));
        Activity activityM4432 = C0063.m4432(this);
        C0032.m3144(relativeLayout, C0035.m3620(20, activityM4432), C0035.m3620(12, activityM4432), C0035.m3620(20, activityM4432), C0035.m3620(12, activityM4432));
        C0016.m687(relativeLayout, layoutParams);
        TextView textView = new TextView(activity);
        C0034.m3509(textView, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        C0111.m13050(layoutParams2, 15);
        C0111.m13050(layoutParams2, 21);
        C0016.m687(textView, layoutParams2);
        C0027.m2442(textView, -1);
        C0019.m1180(textView, str3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C0035.m3620(48, activityM4432), C0035.m3620(27, activityM4432));
        C0072.m6126(layoutParams3, C0035.m3620(6, activityM4432));
        C0111.m13050(layoutParams3, 15);
        C0019.m1232(layoutParams3, 16, C0072.m6212(textView));
        C0016.m687(editText, layoutParams3);
        LinearLayout linearLayout = new LinearLayout(activity);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        C0025.m2098(linearLayout, 1);
        C0111.m13050(layoutParams4, 15);
        C0111.m13050(layoutParams4, 20);
        C0019.m1232(layoutParams4, 16, C0072.m6212(editText));
        C0072.m6126(layoutParams4, C0035.m3620(8, activityM4432));
        C0016.m687(linearLayout, layoutParams4);
        TextView textView2 = new TextView(activity);
        C0016.m687(textView2, new ViewGroup.LayoutParams(-2, -2));
        C0019.m1180(textView2, str);
        C0027.m2442(textView2, -1);
        C0022.m1661(textView2, C0035.m3633(1));
        C0016.m722(textView2, 2, 14.0f);
        TextView textView3 = new TextView(activity);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        C0037.m3919(layoutParams5, 0, C0035.m3620(8, activityM4432), 0, 0);
        C0016.m687(textView3, layoutParams5);
        C0019.m1180(textView3, str2);
        C0016.m722(textView3, 2, 10.0f);
        C0027.m2442(textView3, C0031.m2985(C0020.m1443(m7068(), 221, 7, 2466)));
        C0065.m4689(linearLayout, textView2);
        C0065.m4689(linearLayout, textView3);
        C0065.m4689(relativeLayout, textView);
        C0065.m4689(relativeLayout, editText);
        C0065.m4689(relativeLayout, linearLayout);
        return relativeLayout;
    }

    public final View d(Activity activity) {
        View view = new View(activity);
        C0016.m687(view, new LinearLayout.LayoutParams(-1, C0035.m3620(1, C0063.m4432(this))));
        C0028.m2660(view, C0031.m2985(C0063.m4315(m7068(), 228, 7, 859)));
        return view;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window windowM3064 = C0031.m3064(this);
        if (windowM3064 != null) {
            C0034.m3483(windowM3064, new ColorDrawable(0));
            C0065.m4766(windowM3064, 0.0f);
            WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
            Point pointM6231 = C0072.m6231(this);
            int iM5537 = C0068.m5537(pointM6231);
            int iM2215 = C0025.m2215(pointM6231);
            Activity activityM4432 = C0063.m4432(this);
            if (iM5537 > iM2215) {
                layoutParamsM5516.gravity = GravityCompat.END;
                layoutParamsM5516.width = C0035.m3620(240, activityM4432);
                layoutParamsM5516.height = -2;
                layoutParamsM5516.x = C0035.m3620(16, activityM4432);
            } else {
                layoutParamsM5516.gravity = 17;
                layoutParamsM5516.width = C0035.m3620(304, activityM4432);
                layoutParamsM5516.height = -2;
            }
            C0078.m7346(windowM3064, layoutParamsM5516);
        }
    }
}
