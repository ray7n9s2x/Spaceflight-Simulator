package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
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

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0421p0 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f353short = {1398, 1355, 1362, 1361, 2419, 2400, 2400, 2400, 2400, 2400, 2400, 2873, 2869, 2868, 2862, 2879, 2868, 2862, 885, 879, 870, 879, 870, 879, 870, 2397, 2394, 2372, 2369, 2368, 1792, 1818, 1818, 1818, 1818, 1818, 1818, 1586, 1561, 1560, 1617, 1538, 1622, 1540, 1555, 1563, 1567, 1560, 1554, 1622, 1559, 1553, 1559, 1567, 1560, 1622, 1560, 1555, 1550, 1538, 1622, 1538, 1567, 1563, 1555, 927, 985, 900, 985, 900, 985, 900, 3124, 3094, 3097, 3092, 3090, 3099, 1933, 1953, 1955, 1960, 1959, 1980, 1955, 3172, 3179, 3161, 3175, 3187, 3186, 3177, 3173, 3178, 3183, 3173, 3181, 3161, 3170, 3183, 3175, 3178, 3177, 3169, 3161, 3172, 3169, 3112, 3198, 3179, 3178, 2835, 2844, 2862, 2832, 2820, 2821, 2846, 2834, 2845, 2840, 2834, 2842, 2862, 2845, 2832, 2824, 2846, 2820, 2821, 2862, 2834, 2845, 2840, 2834, 2842, 2862, 2845, 2836, 2839, 2821, 2862, 2835, 2838, 2911, 2825, 2844, 2845, 2304, 2319, 2365, 2307, 2327, 2326, 2317, 2305, 2318, 2315, 2305, 2313, 2365, 2318, 2307, 2331, 2317, 2327, 2326, 2365, 2305, 2318, 2315, 2305, 2313, 2365, 2320, 2315, 2309, 2314, 2326, 2365, 2304, 2309, 2380, 2330, 2319, 2318, 1074, 1085, 1039, 1073, 1061, 1060, 1087, 1075, 1084, 1081, 1075, 1083, 1039, 1084, 1073, 1065, 1087, 1061, 1060, 1039, 1075, 1084, 1081, 1075, 1083, 1039, 1074, 1079, 1150, 1064, 1085, 1084, 499, 508, 462, 496, 484, 485, 510, 498, 509, 504, 498, 506, 462, 500, 501, 504, 485, 485, 500, 489, 485, 462, 499, 502, 447, 489, 508, 509, 2890, 2885, 2935, 2889, 2909, 2908, 2887, 2891, 2884, 2881, 2891, 2883, 2935, 2886, 2887, 2935, 2891, 2880, 2893, 2891, 2883, 2890, 2887, 2896, 2822, 2904, 2886, 2895, 2903, 2933, 2938, 2935, 2929, 2936};
    public TextView a;
    public TextView b;
    public Button c;
    public Button d;
    public ImageView e;
    public EditText f;
    public RelativeLayout g;
    public LinearLayout h;
    public TextView i;
    public TextView j;
    public boolean k;
    public int l;
    public LinearLayout m;
    public boolean n;
    public InterfaceC0415o0 o;

    public static DialogC0421p0 a(Context context, int i, boolean z) {
        int i2 = 0;
        DialogC0421p0 dialogC0421p0 = new DialogC0421p0(context, R.style.Theme.Material.Dialog.NoActionBar);
        dialogC0421p0.l = i;
        dialogC0421p0.m = new LinearLayout(context);
        C0016.m687(C0018.m1021(dialogC0421p0), new LinearLayout.LayoutParams(-1, -2));
        C0025.m2098(C0018.m1021(dialogC0421p0), 1);
        ScrollView scrollView = new ScrollView(context);
        C0016.m687(scrollView, new LinearLayout.LayoutParams(C0035.m3620(290, context), -2));
        C0039.m4153(scrollView, false);
        C0065.m4689(C0018.m1021(dialogC0421p0), scrollView);
        LinearLayout linearLayout = new LinearLayout(context);
        C0016.m687(linearLayout, new LinearLayout.LayoutParams(C0035.m3620(290, context), -2));
        C0025.m2098(linearLayout, 1);
        C0067.m5520(scrollView, linearLayout);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        C0016.m687(relativeLayout, new LinearLayout.LayoutParams(-1, -2));
        C0032.m3144(relativeLayout, C0035.m3620(20, context), C0035.m3620(20, context), C0035.m3620(20, context), 0);
        C0065.m4689(linearLayout, relativeLayout);
        TextView textView = new TextView(context);
        dialogC0421p0.a = textView;
        C0016.m687(textView, new RelativeLayout.LayoutParams(-2, -2));
        C0019.m1180(C0023.m1811(dialogC0421p0), C0016.m625(m7102(), 0, 4, 1314));
        C0034.m3509(C0023.m1811(dialogC0421p0), C0071.m5977());
        TextView textViewM1811 = C0023.m1811(dialogC0421p0);
        String strM4828 = C0066.m4828(m7102(), 4, 7, 2384);
        C0027.m2442(textViewM1811, C0031.m2985(strM4828));
        C0077.m7171(C0023.m1811(dialogC0421p0), 18.0f);
        C0032.m3230(C0023.m1811(dialogC0421p0), 1);
        C0063.m4407(C0023.m1811(dialogC0421p0), C0075.m6875());
        C0066.m4801(C0023.m1811(dialogC0421p0), 1);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C0039.m4105(C0023.m1811(dialogC0421p0));
        C0111.m13050(layoutParams, 14);
        C0036.m3702(relativeLayout, C0023.m1811(dialogC0421p0), layoutParams);
        ImageView imageView = new ImageView(context);
        dialogC0421p0.e = imageView;
        C0037.m3860(imageView, 8);
        C0016.m687(C0034.m3486(dialogC0421p0), new RelativeLayout.LayoutParams(-2, -2));
        C0032.m3144(C0034.m3486(dialogC0421p0), C0035.m3620(8, context), 0, C0035.m3620(8, context), 0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) C0039.m4105(C0034.m3486(dialogC0421p0));
        C0019.m1232(layoutParams2, 1, C0072.m6212(C0023.m1811(dialogC0421p0)));
        C0019.m1232(layoutParams2, 6, C0072.m6212(C0023.m1811(dialogC0421p0)));
        C0019.m1232(layoutParams2, 8, C0072.m6212(C0023.m1811(dialogC0421p0)));
        C0036.m3702(relativeLayout, C0034.m3486(dialogC0421p0), layoutParams2);
        TextView textView2 = new TextView(context);
        dialogC0421p0.b = textView2;
        C0016.m687(textView2, new LinearLayout.LayoutParams(-1, -2));
        C0019.m1180(C0029.m2784(dialogC0421p0), C0017.m936(m7102(), 11, 7, 2906));
        TextView textViewM2784 = C0029.m2784(dialogC0421p0);
        String strM5544 = C0068.m5544(m7102(), 18, 7, 854);
        C0027.m2442(textViewM2784, C0031.m2985(strM5544));
        C0077.m7171(C0029.m2784(dialogC0421p0), 16.0f);
        C0067.m5523(C0029.m2784(dialogC0421p0), C0035.m3620(4, context), 1.0f);
        C0038.m4016(C0029.m2784(dialogC0421p0), C0035.m3620(20, context), C0035.m3620(16, context), C0035.m3620(20, context), 0);
        C0065.m4689(linearLayout, C0029.m2784(dialogC0421p0));
        dialogC0421p0.f = new EditText(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0035.m3620(40, context));
        layoutParams3.leftMargin = C0035.m3620(20, context);
        layoutParams3.rightMargin = C0035.m3620(20, context);
        layoutParams3.topMargin = C0035.m3620(12, context);
        C0016.m687(C0018.m1031(dialogC0421p0), layoutParams3);
        C0038.m3944(C0018.m1031(dialogC0421p0), C0026.m2321(m7102(), 25, 5, 2356));
        EditText editTextM1031 = C0018.m1031(dialogC0421p0);
        String strM625 = C0016.m625(m7102(), 30, 7, 1827);
        C0067.m5485(editTextM1031, C0031.m2985(strM625));
        C0027.m2442(C0018.m1031(dialogC0421p0), C0031.m2985(strM4828));
        C0077.m7171(C0018.m1031(dialogC0421p0), 16.0f);
        C0066.m4807(C0018.m1031(dialogC0421p0), true);
        C0066.m4801(C0018.m1031(dialogC0421p0), 16);
        C0032.m3144(C0018.m1031(dialogC0421p0), C0035.m3620(5, context), 0, 0, 0);
        C0027.m2518(C0018.m1031(dialogC0421p0), C0035.m3620(10, context));
        C0065.m4689(linearLayout, C0018.m1031(dialogC0421p0));
        FrameLayout frameLayout = new FrameLayout(context);
        C0016.m687(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        C0032.m3144(frameLayout, C0035.m3620(20, context), C0035.m3620(4, context), C0035.m3620(20, context), 0);
        C0065.m4689(linearLayout, frameLayout);
        TextView textView3 = new TextView(context);
        dialogC0421p0.j = textView3;
        C0016.m687(textView3, new FrameLayout.LayoutParams(-2, -2));
        C0019.m1180(C0034.m3440(dialogC0421p0), C0066.m4828(m7102(), 37, 28, 1654));
        C0027.m2442(C0034.m3440(dialogC0421p0), C0031.m2985(strM625));
        C0077.m7171(C0034.m3440(dialogC0421p0), 14.0f);
        C0027.m2518(C0034.m3440(dialogC0421p0), C0035.m3620(4, context));
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) C0039.m4105(C0034.m3440(dialogC0421p0));
        layoutParams4.gravity = 16;
        C0036.m3702(frameLayout, C0034.m3440(dialogC0421p0), layoutParams4);
        dialogC0421p0.g = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = C0035.m3620(20, context);
        C0016.m687(C0073.m6366(dialogC0421p0), layoutParams5);
        C0065.m4689(linearLayout, C0073.m6366(dialogC0421p0));
        View view = new View(context);
        C0034.m3509(view, C0071.m5977());
        C0016.m687(view, new RelativeLayout.LayoutParams(-1, C0035.m3620(1, context)));
        String strM1070 = C0018.m1070(m7102(), 65, 7, 956);
        C0028.m2660(view, C0031.m2985(strM1070));
        C0065.m4689(C0073.m6366(dialogC0421p0), view);
        dialogC0421p0.h = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, C0035.m3620(48, context));
        C0019.m1232(layoutParams6, 3, C0072.m6212(view));
        C0016.m687(C0029.m2689(dialogC0421p0), layoutParams6);
        C0025.m2098(C0029.m2689(dialogC0421p0), 0);
        C0065.m4689(C0073.m6366(dialogC0421p0), C0029.m2689(dialogC0421p0));
        Button button = new Button(context);
        dialogC0421p0.c = button;
        C0016.m687(button, new LinearLayout.LayoutParams(0, -1, 1.0f));
        C0019.m1180(C0017.m952(dialogC0421p0), C0020.m1443(m7102(), 72, 6, 3191));
        C0033.m3284(C0017.m952(dialogC0421p0), false);
        C0027.m2442(C0017.m952(dialogC0421p0), C0031.m2985(strM5544));
        C0077.m7171(C0017.m952(dialogC0421p0), 16.0f);
        C0066.m4801(C0017.m952(dialogC0421p0), 17);
        C0039.m4187(C0017.m952(dialogC0421p0), new ColorDrawable(0));
        C0065.m4689(C0029.m2689(dialogC0421p0), C0017.m952(dialogC0421p0));
        View view2 = new View(context);
        C0016.m687(view2, new LinearLayout.LayoutParams(C0035.m3620(1, context), -1));
        C0028.m2660(view2, C0031.m2985(strM1070));
        C0065.m4689(C0029.m2689(dialogC0421p0), view2);
        Button button2 = new Button(context);
        dialogC0421p0.d = button2;
        C0016.m687(button2, new LinearLayout.LayoutParams(0, -1, 1.0f));
        Button buttonM5489 = C0067.m5489(dialogC0421p0);
        String strM5807 = C0069.m5807(m7102(), 78, 7, 1998);
        C0019.m1180(buttonM5489, strM5807);
        C0033.m3284(C0067.m5489(dialogC0421p0), false);
        C0027.m2442(C0067.m5489(dialogC0421p0), C0031.m2985(strM4828));
        C0077.m7171(C0067.m5489(dialogC0421p0), 16.0f);
        C0066.m4801(C0067.m5489(dialogC0421p0), 17);
        C0039.m4187(C0067.m5489(dialogC0421p0), new ColorDrawable(0));
        C0065.m4689(C0029.m2689(dialogC0421p0), C0067.m5489(dialogC0421p0));
        TextView textView4 = new TextView(context);
        dialogC0421p0.i = textView4;
        C0063.m4382(textView4, 8);
        C0016.m687(C0073.m6351(dialogC0421p0), new RelativeLayout.LayoutParams(-1, C0035.m3620(48, context)));
        C0019.m1180(C0073.m6351(dialogC0421p0), strM5807);
        C0027.m2442(C0073.m6351(dialogC0421p0), C0031.m2985(strM4828));
        C0077.m7171(C0073.m6351(dialogC0421p0), 16.0f);
        C0066.m4801(C0073.m6351(dialogC0421p0), 17);
        C0039.m4187(C0073.m6351(dialogC0421p0), new ColorDrawable(0));
        C0065.m4689(C0073.m6366(dialogC0421p0), C0073.m6351(dialogC0421p0));
        C0073.m6392(dialogC0421p0, C0018.m1021(dialogC0421p0));
        LinearLayout linearLayoutM1021 = C0018.m1021(dialogC0421p0);
        C0030.m2951(C0072.m6184());
        C0039.m4187(linearLayoutM1021, C0069.m5749(C0072.m6116(m7102(), 85, 26, 3078)));
        Button buttonM952 = C0017.m952(dialogC0421p0);
        C0030.m2951(C0072.m6184());
        C0039.m4187(buttonM952, C0069.m5749(C0037.m3829(m7102(), 111, 37, 2929)));
        Button buttonM54892 = C0067.m5489(dialogC0421p0);
        C0030.m2951(C0072.m6184());
        C0039.m4187(buttonM54892, C0069.m5749(C0075.m6791(m7102(), 148, 38, 2402)));
        TextView textViewM6351 = C0073.m6351(dialogC0421p0);
        C0030.m2951(C0072.m6184());
        C0039.m4187(textViewM6351, C0069.m5749(C0016.m625(m7102(), 186, 32, 1104)));
        EditText editTextM10312 = C0018.m1031(dialogC0421p0);
        C0030.m2951(C0072.m6184());
        C0039.m4187(editTextM10312, C0069.m5749(C0077.m7205(m7102(), 218, 28, 401)));
        TextView textViewM3440 = C0034.m3440(dialogC0421p0);
        C0030.m2951(C0072.m6184());
        C0039.m4132(textViewM3440, C0069.m5749(C0033.m3330(m7102(), 246, 28, 2856)), null, null, null);
        C0020.m1439(dialogC0421p0, z);
        C0017.m944(dialogC0421p0, z);
        switch (i) {
            case 3:
                C0063.m4382(C0018.m1031(dialogC0421p0), 8);
                C0063.m4382(C0034.m3440(dialogC0421p0), 8);
                C0063.m4382(C0029.m2689(dialogC0421p0), 8);
                C0063.m4382(C0073.m6351(dialogC0421p0), 0);
                break;
            case 4:
                C0063.m4382(C0018.m1031(dialogC0421p0), 8);
                C0063.m4382(C0073.m6351(dialogC0421p0), 8);
                C0063.m4382(C0029.m2689(dialogC0421p0), 0);
                break;
            case 5:
                C0063.m4382(C0018.m1031(dialogC0421p0), 8);
                C0063.m4382(C0034.m3440(dialogC0421p0), 8);
                C0063.m4382(C0073.m6366(dialogC0421p0), 8);
                break;
            case 6:
                C0063.m4382(C0034.m3440(dialogC0421p0), 8);
                C0063.m4382(C0073.m6351(dialogC0421p0), 8);
                C0063.m4382(C0029.m2689(dialogC0421p0), 0);
                break;
            case 7:
                C0063.m4382(C0018.m1031(dialogC0421p0), 8);
                C0063.m4382(C0029.m2689(dialogC0421p0), 8);
                C0063.m4382(C0073.m6351(dialogC0421p0), 0);
                break;
            case 8:
                C0063.m4382(C0034.m3440(dialogC0421p0), 8);
                C0063.m4382(C0073.m6351(dialogC0421p0), 8);
                C0063.m4382(C0029.m2689(dialogC0421p0), 0);
                C0063.m4382(C0029.m2784(dialogC0421p0), 8);
                C0028.m2613(C0018.m1031(dialogC0421p0), new InputFilter[]{new InputFilter.LengthFilter(20)});
                break;
            default:
                C0063.m4382(C0018.m1031(dialogC0421p0), 8);
                C0063.m4382(C0034.m3440(dialogC0421p0), 8);
                C0063.m4382(C0073.m6351(dialogC0421p0), 8);
                C0063.m4382(C0029.m2689(dialogC0421p0), 0);
                break;
        }
        C0065.m4727(C0017.m952(dialogC0421p0), new ViewOnClickListenerC0409n0(dialogC0421p0, i2));
        C0065.m4727(C0073.m6351(dialogC0421p0), new ViewOnClickListenerC0409n0(dialogC0421p0, 1));
        C0065.m4727(C0067.m5489(dialogC0421p0), new ViewOnClickListenerC0409n0(dialogC0421p0, 2));
        C0065.m4727(C0034.m3440(dialogC0421p0), new ViewOnClickListenerC0409n0(dialogC0421p0, 3));
        return dialogC0421p0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7102() {
        if (C0066.m4827() >= 0) {
            return f353short;
        }
        return null;
    }

    public final void b() {
        C0019.m1180(C0017.m952(this), C0019.m1189(m7102(), 274, 6, 2836));
    }

    public final void c(String str) {
        int iM3991 = C0038.m3991(this);
        if (iM3991 == 3) {
            C0019.m1180(C0073.m6351(this), str);
        } else if (iM3991 == 7) {
            C0019.m1180(C0073.m6351(this), str);
        } else {
            C0019.m1180(C0067.m5489(this), str);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window windowM3064 = C0031.m3064(this);
        C0034.m3483(windowM3064, new ColorDrawable(0));
        WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
        layoutParamsM5516.gravity = 17;
        C0078.m7346(windowM3064, layoutParamsM5516);
    }
}
