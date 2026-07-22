package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.GravityCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0389j4 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f339short = {2039, 2023, 2038, 2029, 2036, 2032, 2011, 2016, 2029, 2021, 2024, 2027, 2019, 2011, 2021, 2023, 2032, 2029, 2027, 2026, 2011, 2017, 2016, 2029, 2032, 1851, 1830, 1830, 1853, 3169, 3185, 3168, 3195, 3170, 3174, 3149, 3187, 3185, 3174, 3195, 3197, 3196, 3149, 3169, 3194, 3187, 3170, 3191, 489, 491, 508, 481, 487, 486, 471, 507, 491, 506, 487, 484, 484, 443, 422, 443, 419, 426, 2492, 2494, 2473, 2484, 2482, 2483, 2434, 2483, 2492, 2480, 2488, 623, 639, 622, 629, 620, 616, 579, 637, 639, 616, 629, 627, 626, 579, 633, 632, 629, 616, 579, 623, 628, 637, 620, 633, 2166, 2164, 2147, 2174, 2168, 2169, 2120, 2164, 2168, 2146, 2169, 2147, 2120, 2147, 2174, 2147, 2171, 2162, 2905, 2907, 2892, 2897, 2903, 2902, 2919, 2907, 2903, 2893, 2902, 2892, 2919, 2908, 2909, 2891, 2907, 907, 905, 926, 899, 901, 900, 949, 905, 901, 927, 900, 926, 2606, 2604, 2619, 2598, 2592, 2593, 2576, 2598, 2593, 2619, 2602, 2621, 2617, 2606, 2595, 2576, 2619, 2598, 2619, 2595, 2602, 1313, 1315, 1332, 1321, 1327, 1326, 1311, 1321, 1326, 1332, 1317, 1330, 1334, 1313, 1324, 1311, 1316, 1317, 1331, 1315, 2537, 2539, 2556, 2529, 2535, 2534, 2519, 2529, 2534, 2556, 2541, 2554, 2558, 2537, 2532, 2519, 2555, 2556, 2537, 2554, 2556, 1402, 1400, 1391, 1394, 1396, 1397, 1348, 1394, 1397, 1391, 1406, 1385, 1389, 1402, 1399, 1348, 1406, 1397, 1407, 904, 906, 925, 896, 902, 903, 950, 925, 896, 900, 908, 950, 925, 896, 925, 901, 908, 2341, 2343, 2352, 2349, 2347, 2346, 2331, 2352, 2349, 2345, 2337, 2331, 2336, 2337, 2359, 2343, 3161, 3163, 3148, 3153, 3159, 3158, 3175, 3148, 3153, 3157, 3165, 1272, 1274, 1261, 1264, 1270, 1271, 1222, 1277, 1276, 1269, 1272, 1248, 1222, 1277, 1276, 1258, 1274, 1133, 1135, 1144, 1125, 1123, 1122, 1107, 1128, 1129, 1120, 1133, 1141, 1107, 1151, 1144, 1133, 1150, 1144, 1855, 1853, 1834, 1847, 1841, 1840, 1793, 1850, 1851, 1842, 1855, 1831, 1793, 1851, 1840, 1850, 3064, 3066, 3053, 3056, 3062, 3063, 3014, 3050, 3057, 3056, 3071, 3053, 3056, 3063, 3070, 3014, 3061, 3064, 3040, 3062, 3052, 3053, 3113, 3115, 3132, 3105, 3111, 3110, 3095, 3131, 3104, 3105, 3118, 3132, 3105, 3110, 3119, 519, 517, 530, 527, 521, 520, 569, 517, 519, 520, 517, 515, 522, 3283, 3281, 3270, 3291, 3293, 3292, 3309, 3265, 3283, 3268, 3287, 1158, 1191, 1196, 1197, 1256, 1261, 1196, 1256, 1248, 1261, 1211, 1249, 1256, 1179, 1197, 1212, 1212, 1185, 1190, 1199, 2878, 2817, 2820, 2825, 2824, 2893, 2862, 2818, 2840, 2819, 2841, 416, 391, 397, 384, 394, 392, 413, 396, 410, 457, 413, 385, 396, 457, 391, 412, 388, 395, 396, 411, 457, 390, 399, 457, 410, 389, 384, 397, 396, 410, 455, 457, 445, 385, 396, 457, 391, 396, 401, 413, 457, 392, 394, 413, 384, 390, 391, 457, 414, 384, 389, 389, 457, 395, 396, 457, 409, 396, 411, 399, 390, 411, 388, 396, 397, 457, 390, 391, 389, 400, 457, 392, 399, 413, 396, 411, 457, 392, 389, 389, 457, 392, 411, 396, 457, 394, 390, 388, 409, 389, 396, 413, 396, 397, 455, 2869, 2826, 2831, 2818, 2819, 2886, 2831, 2824, 2834, 2819, 2836, 2832, 2823, 2826, 1137, 1090, 1101, 1095, 1100, 1102, 1103, 1114, 1027, 1136, 1094, 1103, 1094, 1088, 1111, 1094, 1095, 1027, 1130, 1101, 1111, 1094, 1105, 1109, 1090, 1103, 1027, 1089, 1094, 1111, 1108, 1094, 1094, 1101, 1027, 1102, 1110, 1103, 1111, 1098, 1107, 1103, 1094, 1027, 1104, 1103, 1098, 1095, 1094, 1104, 547, 540, 537, 532, 537, 542, 535, 592, 564, 517, 514, 529, 516, 537, 543, 542, 592, 548, 537, 541, 533, 2788, 2770, 2755, 2711, 2774, 2773, 2776, 2753, 2770, 2711, 2692, 2695, 2695, 2778, 2756, 2711, 2756, 2754, 2768, 2768, 2770, 2756, 2755, 2770, 2771, 2715, 2778, 2754, 2779, 2769, 2754, 2777, 2772, 2755, 2782, 2776, 2777, 2711, 2776, 2772, 2772, 2754, 2757, 2756, 2711, 2752, 2783, 2782, 2779, 2770, 2711, 2756, 2779, 2782, 2771, 2782, 2777, 2768, 2711, 2755, 2776, 2776, 2711, 2769, 2774, 2756, 2755};
    public final ScrollView a;
    public final TextView b;
    public final EditText c;
    public final TextView d;
    public final TextView e;
    public final EditText f;
    public final TextView g;
    public final TextView h;
    public final EditText i;
    public final EditText j;
    public final TextView k;
    public final TextView l;
    public final EditText m;
    public final EditText n;
    public final EditText o;
    public final LinearLayout p;
    public final EditText q;
    public final TextView r;
    public final TextView s;
    public final ScriptRecordType t;
    public final ScriptActionBean u;
    public C0479z v;
    public final int w;
    public final LinearLayout x;
    public final int y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0389j4(Activity activity, ScriptRecordType scriptRecordType, ScriptActionBean scriptActionBean, int i) {
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        int i2 = 1;
        this.t = scriptRecordType;
        this.u = scriptActionBean;
        this.w = i;
        View viewM5715 = C0069.m5715(C0037.m3829(m7083(), 0, 25, 1924));
        if (viewM5715 != null) {
            LinearLayout linearLayout = (LinearLayout) C0029.m2688(viewM5715, C0018.m1070(m7083(), 25, 4, 1865));
            this.x = linearLayout;
            C0039.m4187(linearLayout, C0018.m1059(C0076.m6902(m7083(), 29, 19, 3090)));
            this.a = (ScrollView) C0029.m2688(viewM5715, C0032.m3209(m7083(), 48, 13, 392));
            DisplayMetrics displayMetricsM4797 = C0066.m4797(C0029.m2720(C0027.m2454(this)));
            int iM4161 = C0039.m4161(displayMetricsM4797);
            this.y = iM4161;
            int iM5638 = C0068.m5638(displayMetricsM4797);
            this.z = iM5638;
            if (iM4161 > iM5638) {
                C0016.m687(C0073.m6405(this), new FrameLayout.LayoutParams(C0075.m6777(C0027.m2454(this), 240.0f), C0075.m6777(C0027.m2454(this), 260.0f)));
            }
            ViewGroup.LayoutParams layoutParamsM4105 = C0039.m4105(C0033.m3288(this));
            if (C0024.m2068(this) > C0024.m2045(this)) {
                layoutParamsM4105.height = C0075.m6777(C0027.m2454(this), 160.0f);
            } else {
                layoutParamsM4105.height = C0075.m6777(C0027.m2454(this), 246.0f);
            }
            C0016.m687(C0033.m3288(this), layoutParamsM4105);
            this.b = (TextView) C0029.m2688(viewM5715, C0066.m4828(m7083(), 61, 5, 463));
            EditText editText = (EditText) C0029.m2688(viewM5715, C0074.m6452(m7083(), 66, 11, 2525));
            this.c = editText;
            C0028.m2613(editText, new InputFilter[]{new InputFilter.LengthFilter(30)});
            EditText editTextM4897 = C0066.m4897(this);
            String strM5544 = C0068.m5544(m7083(), 77, 24, 540);
            C0039.m4187(editTextM4897, C0018.m1059(strM5544));
            this.d = (TextView) C0029.m2688(viewM5715, C0029.m2695(m7083(), 101, 18, 2071));
            this.e = (TextView) C0029.m2688(viewM5715, C0024.m1945(m7083(), 119, 17, 2872));
            EditText editText2 = (EditText) C0029.m2688(viewM5715, C0063.m4315(m7083(), 136, 12, 1002));
            this.f = editText2;
            C0039.m4187(editText2, C0018.m1059(strM5544));
            this.g = (TextView) C0029.m2688(viewM5715, C0067.m5418(m7083(), 148, 21, 2639));
            this.h = (TextView) C0029.m2688(viewM5715, C0034.m3431(m7083(), 169, 20, 1344));
            EditText editText3 = (EditText) C0029.m2688(viewM5715, C0076.m6902(m7083(), 189, 21, 2440));
            this.i = editText3;
            C0039.m4187(editText3, C0018.m1059(strM5544));
            EditText editText4 = (EditText) C0029.m2688(viewM5715, C0111.m13097(m7083(), 210, 19, 1307));
            this.j = editText4;
            C0039.m4187(editText4, C0018.m1059(strM5544));
            this.k = (TextView) C0029.m2688(viewM5715, C0028.m2609(m7083(), 229, 17, 1001));
            this.l = (TextView) C0029.m2688(viewM5715, C0074.m6452(m7083(), 246, 16, 2372));
            EditText editText5 = (EditText) C0029.m2688(viewM5715, C0018.m1070(m7083(), 262, 11, 3128));
            this.m = editText5;
            C0039.m4187(editText5, C0018.m1059(strM5544));
            EditText editText6 = (EditText) C0029.m2688(viewM5715, C0023.m1904(m7083(), 290, 18, 1036));
            this.n = editText6;
            C0039.m4187(editText6, C0018.m1059(strM5544));
            EditText editText7 = (EditText) C0029.m2688(viewM5715, C0075.m6791(m7083(), 308, 16, 1886));
            this.o = editText7;
            C0039.m4187(editText7, C0018.m1059(strM5544));
            this.p = (LinearLayout) C0029.m2688(viewM5715, C0023.m1904(m7083(), 324, 22, 2969));
            EditText editText8 = (EditText) C0029.m2688(viewM5715, C0111.m13097(m7083(), 346, 15, 3144));
            this.q = editText8;
            C0039.m4187(editText8, C0018.m1059(strM5544));
            this.r = (TextView) C0029.m2688(viewM5715, C0022.m1728(m7083(), 361, 13, 614));
            this.s = (TextView) C0029.m2688(viewM5715, C0019.m1189(m7083(), 374, 11, 3250));
            C0073.m6392(this, viewM5715);
            C0019.m1180(C0078.m7462(this), C0021.m1531(C0022.m1728(m7083(), 385, 20, 1224), new Object[]{C0021.m1548(i + 1), C0071.m5975(scriptRecordType)}));
            C0019.m1180(C0066.m4897(this), C0078.m7319(scriptActionBean));
            C0019.m1180(C0033.m3325(this), C0078.m7464(C0017.m910(scriptActionBean)));
            C0019.m1180(C0111.m13135(this), C0064.m4588(C0071.m6078(C0021.m1536(scriptActionBean), 0)));
            C0019.m1180(C0016.m648(this), C0064.m4588(C0071.m6078(C0021.m1536(scriptActionBean), 1)));
            C0019.m1180(C0038.m4021(this), C0071.m6033(C0019.m1210(scriptActionBean)));
            C0019.m1180(C0022.m1747(this), C0064.m4588(C0071.m6078(C0035.m3546(scriptActionBean), 0)));
            C0019.m1180(C0068.m5566(this), C0064.m4588(C0071.m6078(C0035.m3546(scriptActionBean), 1)));
            C0019.m1180(C0073.m6326(this), C0078.m7464(C0020.m1440(scriptActionBean)));
            if (scriptRecordType == C0067.m5437()) {
                C0019.m1180(C0063.m4309(this), C0019.m1189(m7083(), 405, 11, 2925));
                C0019.m1180(C0021.m1604(this), C0111.m13097(m7083(), 416, 95, 489));
                C0019.m1180(C0025.m2200(this), C0066.m4828(m7083(), FrameMetricsAggregator.EVERY_DURATION, 14, 2918));
                C0019.m1180(C0077.m7255(this), C0071.m5991(m7083(), 525, 50, 1059));
                C0019.m1180(C0077.m7252(this), C0024.m1945(m7083(), 575, 21, 624));
                C0019.m1180(C0035.m3578(this), C0064.m4545(m7083(), 596, 67, 2743));
                C0063.m4382(C0070.m5876(this), 8);
            }
            C0065.m4727(C0028.m2671(this), new C0347d2(this, i2));
            C0065.m4727(C0078.m7366(this), new ViewOnClickListenerC0391k0(6, this));
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7083() {
        if (C0072.m6216() >= 0) {
            return f339short;
        }
        return null;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window windowM3064 = C0031.m3064(this);
        if (windowM3064 != null) {
            C0034.m3483(windowM3064, new ColorDrawable(0));
            C0065.m4766(windowM3064, 0.0f);
            WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
            if (C0024.m2068(this) > C0024.m2045(this)) {
                layoutParamsM5516.gravity = GravityCompat.END;
                layoutParamsM5516.width = C0075.m6777(C0027.m2454(this), 240.0f);
                layoutParamsM5516.height = C0075.m6777(C0027.m2454(this), 260.0f);
                layoutParamsM5516.x = C0075.m6777(C0027.m2454(this), 16.0f);
            } else {
                layoutParamsM5516.gravity = 17;
                layoutParamsM5516.width = C0075.m6777(C0027.m2454(this), 304.0f);
                layoutParamsM5516.height = -2;
            }
            C0078.m7346(windowM3064, layoutParamsM5516);
        }
    }
}
