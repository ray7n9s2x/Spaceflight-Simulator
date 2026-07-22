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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
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
import com.joke.connectdevice.bean.AutoClickPointerBean;
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
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0385j0 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f335short = {2731, 2786, 2729, 2777, 2808, 2803, 2802, 3015, 3028, 2958, 3013, 3035, 2292, 2191, 2224, 2229, 2232, 2233, 2293, 789, 885, 850, 849, 857, 788, 3000, 3028, 3071, 3045, 3058, 3068, 3061, 2992, 3027, 3068, 3065, 3059, 3067, 3001, 1556, 1647, 1621, 1618, 1627, 1616, 1625, 1564, 1663, 1616, 1621, 1631, 1623, 1557, 3095, 3172, 3154, 3139, 3139, 3166, 3161, 3152, 2872, 2830, 2847, 2891, 2853, 2820, 2831, 2830, 1269, 1242, 1247, 1237, 1245, 1174, 1269, 1241, 1219, 1240, 1218, 827, 772, 769, 780, 781, 840, 811, 775, 797, 774, 796, 2372, 2418, 2421, 2421, 2402, 2409, 2419, 2343, 2372, 2411, 2414, 2404, 2412, 2414, 2409, 2400, 2343, 2372, 2408, 2418, 2409, 2419, 2235, 2204, 2198, 2203, 2193, 2195, 2182, 2199, 2177, 2258, 2182, 2202, 2199, 2258, 2204, 2183, 2207, 2192, 2199, 2176, 2258, 2205, 2196, 2258, 2177, 2206, 2203, 2198, 2199, 2177, 2268, 2258, 2214, 2202, 2199, 2258, 2204, 2199, 2186, 2182, 2258, 2204, 2205, 2198, 2199, 2258, 2181, 2203, 2206, 2206, 2258, 2192, 2199, 2258, 2178, 2199, 2176, 2196, 2205, 2176, 2207, 2199, 2198, 2258, 2205, 2204, 2206, 2187, 2258, 2195, 2196, 2182, 2199, 2176, 2258, 2195, 2206, 2206, 2258, 2195, 2176, 2199, 2258, 2193, 2205, 2207, 2178, 2206, 2199, 2182, 2199, 2198, 2268, 1855, 1804, 1801, 1810, 1800, 645, 682, 687, 677, 685, 742, 687, 680, 690, 675, 692, 688, 679, 682, 1310, 1313, 1316, 1321, 1320, 1389, 1316, 1315, 1337, 1320, 1343, 1339, 1324, 1313, 1746, 1761, 1774, 1764, 1775, 1773, 1772, 1785, 1696, 1779, 1765, 1772, 1765, 1763, 1780, 1765, 1764, 1696, 1769, 1774, 1780, 1765, 1778, 1782, 1761, 1772, 1779, 1696, 1762, 1765, 1780, 1783, 1765, 1765, 1774, 1696, 1773, 1781, 1772, 1780, 1769, 1776, 1772, 1765, 1696, 1763, 1772, 1769, 1763, 1771, 1779, 1710, 3005, 2970, 2944, 2961, 2950, 2946, 2965, 2968, 3028, 2966, 2961, 2944, 2947, 2961, 2961, 2970, 3028, 2969, 2945, 2968, 2944, 2973, 2948, 2968, 2961, 3028, 2951, 2968, 2973, 2960, 2961, 2951, 2990, 2945, 2948, 2958, 2950, 3021, 3001, 2948, 2944, 2952, 2338, 2334, 2323, 2390, 2330, 2329, 2328, 2321, 2323, 2308, 2390, 2306, 2334, 2323, 2390, 2309, 2335, 2328, 2321, 2330, 2323, 2390, 2325, 2330, 2335, 2325, 2333, 2390, 2322, 2307, 2308, 2327, 2306, 2335, 2329, 2328, 2394, 2330, 2327, 2321, 2323, 2308, 2390, 2306, 2334, 2323, 2390, 2304, 2327, 2330, 2307, 2323, 2394, 2327, 2328, 2322, 2390, 2330, 2329, 2328, 2321, 2323, 2308, 2390, 2306, 2334, 2323, 2390, 2325, 2330, 2335, 2325, 2333, 2390, 2306, 2335, 2331, 2323, 2392, 1264, 1231, 1226, 1223, 1226, 1229, 1220, 1155, 1255, 1238, 1233, 1218, 1239, 1226, 1228, 1229, 1155, 1271, 1226, 1230, 1222, 448, 502, 487, 435, 498, 497, 508, 485, 502, 435, 416, 419, 419, 510, 480, 435, 480, 486, 500, 500, 502, 480, 487, 502, 503, 447, 510, 486, 511, 501, 486, 509, 496, 487, 506, 508, 509, 435, 508, 496, 496, 486, 481, 480, 435, 484, 507, 506, 511, 502, 435, 480, 511, 506, 503, 506, 509, 500, 435, 487, 508, 508, 435, 501, 498, 480, 487, 417, 387, 404, 386, 386, 465, 421, 408, 412, 404, 296, 279, 278, 275, 282, 351, 283, 272, 351, 273, 272, 283, 282, 351, 311, 272, 275, 283, 339, 268, 282, 267, 351, 286, 285, 272, 265, 282, 351, 334, 335, 335, 335, 274, 268, 351, 268, 266, 280, 280, 282, 268, 267, 282, 283, 337, 747, 757, 1228, 1261, 1252, 1257, 1265, 1191, 1220, 1257, 1263, 2829, 2858, 2872, 2857, 2878, 2924, 2872, 2852, 2857, 2924, 2876, 2878, 2857, 2874, 2853, 2851, 2873, 2879, 2924, 2863, 2848, 2853, 2863, 2855, 2924, 2853, 2879, 2924, 2863, 2851, 2849, 2876, 2848, 2857, 2872, 2857, 2856, 2912, 2924, 2847, 2872, 2861, 2878, 2872, 2924, 2872, 2852, 2857, 2924, 1688, 1700, 1705, 1772, 1711, 1696, 1701, 1711, 1703, 1772, 1724, 1699, 1727, 1701, 1720, 1701, 1699, 1698, 1772, 1701, 1727, 1772, 1726, 1709, 1698, 1704, 1699, 1697, 1696, 1717, 1772, 1699, 1706, 1706, 1727, 1705, 1720, 1772, 1720, 1699, 1772, 1724, 1726, 1705, 1722, 1705, 1698, 1720, 1772, 1704, 1705, 1720, 1705, 1711, 1720, 1701, 1699, 1698, 848, 856, 2351, 2332, 2323, 2329, 2322, 2320, 2397, 2354, 2331, 2331, 2318, 2328, 2313, 566, 532, 539, 534, 528, 537, 2824, 2840, 2841, 2840, 2841, 2840, 2841, 1086, 1036, 1051, 1032, 1340, 1369, 1369, 1370, 1322, 1318, 1326, 2592, 2608, 2608, 2661, 2661, 2661, 2661, 2661, 2661, 452, 474, 2594, 2663, 2663, 2663, 2663, 2663, 2663, 2663, 2663, 1725, 1787, 1702, 1787, 1702, 1787, 1702, 2767, 2697, 2772, 2697, 2772, 2697, 2772, 1247, 1231, 1230, 1231, 1230, 1231, 1230, 746, 756, 755, 761, 754, 746};
    public final Activity a;
    public final EditText b;
    public final EditText c;
    public final EditText d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public final TextView h;
    public final TextView i;
    public final AutoClickPointerBean j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final EditText q;
    public final String r;
    public final boolean s;

    public static EditText a(Activity activity) {
        EditText editText = new EditText(activity);
        C0034.m3509(editText, C0071.m5977());
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C0035.m3620(4, activity);
            fArr2[i] = C0035.m3620(4, activity);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0111.m13097(m7078(), 713, 9, 2563)));
        C0063.m4341(shapeDrawable, 0, C0035.m3620(2, activity), 0, C0035.m3620(2, activity));
        C0039.m4187(editText, shapeDrawable);
        C0028.m2613(editText, new InputFilter[]{new InputFilter.LengthFilter(10)});
        C0028.m2652(editText, 2);
        C0016.m722(editText, 2, 12.0f);
        C0027.m2442(editText, -1);
        C0066.m4801(editText, 17);
        return editText;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7078() {
        if (C0065.m4647() > 0) {
            return f335short;
        }
        return null;
    }

    public DialogC0385j0(Activity activity, AutoClickPointerBean autoClickPointerBean) {
        String strM13097;
        String strM4757;
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.s = true;
        this.a = activity;
        this.j = autoClickPointerBean;
        int i = 0;
        if (C0017.m939(activity) > C0039.m4103(activity)) {
            this.s = true;
        } else {
            this.s = false;
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        C0016.m687(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        C0025.m2098(linearLayout, 1);
        C0039.m4187(linearLayout, C0078.m7454(activity));
        TextView textView = new TextView(activity);
        C0016.m687(textView, new LinearLayout.LayoutParams(-1, C0035.m3620(45, activity)));
        C0066.m4801(textView, 17);
        C0027.m2442(textView, -1);
        C0016.m722(textView, 2, 16.0f);
        C0022.m1661(textView, C0035.m3633(1));
        if (autoClickPointerBean == null || C0038.m3939(C0022.m1689(autoClickPointerBean))) {
            C0019.m1180(textView, C0036.m3678(m7078(), 61, 8, 2923));
        } else {
            StringBuilder sb = new StringBuilder(C0018.m1070(m7078(), 0, 7, 2711));
            C0077.m7290(sb, C0022.m1689(autoClickPointerBean));
            C0077.m7290(sb, C0077.m7205(m7078(), 7, 5, 3067));
            int iM2273 = C0026.m2273(autoClickPointerBean);
            C0077.m7290(sb, iM2273 != 0 ? iM2273 != 1 ? iM2273 != 2 ? iM2273 != 3 ? C0031.m2993() : C0068.m5544(m7078(), 12, 7, 2268) : C0017.m936(m7078(), 19, 6, 829) : C0026.m2321(m7078(), 25, 14, 2960) : C0036.m3678(m7078(), 39, 14, 1596));
            C0077.m7290(sb, C0036.m3678(m7078(), 53, 8, 3127));
            C0019.m1180(textView, C0017.m942(C0068.m5536(sb)));
        }
        C0065.m4689(linearLayout, textView);
        C0065.m4689(linearLayout, C0035.m3543(this, activity));
        ScrollView scrollView = new ScrollView(activity);
        boolean zM4571 = C0064.m4571(this);
        C0016.m687(scrollView, new LinearLayout.LayoutParams(-1, zM4571 ? -2 : C0035.m3620(200, activity)));
        C0065.m4689(linearLayout, scrollView);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        C0016.m687(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        C0025.m2098(linearLayout2, 1);
        C0067.m5520(scrollView, linearLayout2);
        this.b = C0077.m7260(activity);
        this.k = C0078.m7464(C0068.m5593(autoClickPointerBean));
        C0019.m1180(C0029.m2750(this), C0078.m7464(C0068.m5593(autoClickPointerBean)));
        RelativeLayout relativeLayoutM2477 = C0027.m2477(this, activity, C0026.m2273(autoClickPointerBean) != 3 ? C0068.m5544(m7078(), 69, 11, 1206) : C0029.m2695(m7078(), 80, 11, 872), C0026.m2273(autoClickPointerBean) != 3 ? C0067.m5418(m7078(), 91, 22, 2311) : C0075.m6791(m7078(), 113, 93, 2290), C0029.m2750(this), C0076.m6902(m7078(), 206, 5, 1916));
        this.c = C0077.m7260(activity);
        this.d = C0077.m7260(activity);
        this.l = C0078.m7464(C0035.m3634(autoClickPointerBean));
        C0019.m1180(C0018.m998(this), C0078.m7464(C0035.m3634(autoClickPointerBean)));
        this.m = C0078.m7464(C0016.m635(autoClickPointerBean));
        C0019.m1180(C0038.m3922(this), C0078.m7464(C0016.m635(autoClickPointerBean)));
        RelativeLayout relativeLayoutM6855 = C0075.m6855(this, activity, C0026.m2273(autoClickPointerBean) != 3 ? C0071.m5991(m7078(), 211, 14, 710) : C0066.m4828(m7078(), 225, 14, 1357), C0026.m2273(autoClickPointerBean) != 3 ? C0029.m2695(m7078(), 239, 52, 1664) : C0028.m2609(m7078(), 291, 32, 3060), C0018.m998(this), C0038.m3922(this));
        EditText editTextM7260 = C0077.m7260(activity);
        this.e = editTextM7260;
        C0028.m2613(editTextM7260, new InputFilter[]{new InputFilter.LengthFilter(5)});
        this.p = C0078.m7464(C0027.m2525(autoClickPointerBean));
        C0019.m1180(C0063.m4413(this), C0078.m7464(C0027.m2525(autoClickPointerBean)));
        int iM22732 = C0026.m2273(autoClickPointerBean);
        if (iM22732 == 2) {
            strM13097 = C0111.m13097(m7078(), 500, 10, 497);
            strM4757 = C0065.m4757(m7078(), 510, 46, 383);
        } else if (iM22732 != 3) {
            strM13097 = C0071.m5991(m7078(), 323, 10, 3053);
            strM4757 = C0078.m7427(m7078(), 333, 79, 2422);
        } else {
            strM13097 = C0036.m3678(m7078(), 412, 21, 1187);
            strM4757 = C0039.m4066(m7078(), 433, 67, 403);
        }
        RelativeLayout relativeLayoutM24772 = C0027.m2477(this, activity, strM13097, strM4757, C0063.m4413(this), C0066.m4828(m7078(), 556, 2, 646));
        this.f = C0077.m7260(activity);
        this.g = C0077.m7260(activity);
        this.n = C0078.m7464(C0037.m3776(autoClickPointerBean));
        C0019.m1180(C0072.m6157(this), C0078.m7464(C0037.m3776(autoClickPointerBean)));
        this.o = C0078.m7464(C0027.m2522(autoClickPointerBean));
        C0019.m1180(C0031.m3082(this), C0078.m7464(C0027.m2522(autoClickPointerBean)));
        RelativeLayout relativeLayoutM68552 = C0075.m6855(this, activity, C0037.m3829(m7078(), 558, 9, 1160), C0030.m2840(m7078(), 567, 49, 2892), C0072.m6157(this), C0031.m3082(this));
        this.q = C0077.m7260(activity);
        this.r = C0078.m7464(C0065.m4713(autoClickPointerBean));
        C0019.m1180(C0030.m2934(this), C0078.m7464(C0065.m4713(autoClickPointerBean)));
        RelativeLayout relativeLayoutM24773 = C0027.m2477(this, activity, C0063.m4315(m7078(), 676, 13, 2429), C0072.m6116(m7078(), 616, 58, 1740), C0030.m2934(this), C0037.m3829(m7078(), 674, 2, 800));
        C0065.m4689(linearLayout2, relativeLayoutM2477);
        View viewM3543 = C0035.m3543(this, activity);
        C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM3543), C0035.m3620(20, activity), 0, C0035.m3620(20, activity), 0);
        C0065.m4689(linearLayout2, viewM3543);
        C0065.m4689(linearLayout2, relativeLayoutM6855);
        View viewM35432 = C0035.m3543(this, activity);
        C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM35432), C0035.m3620(20, activity), 0, C0035.m3620(20, activity), 0);
        C0065.m4689(linearLayout2, viewM35432);
        C0065.m4689(linearLayout2, relativeLayoutM24772);
        View viewM35433 = C0035.m3543(this, activity);
        C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM35432), C0035.m3620(20, activity), 0, C0035.m3620(20, activity), 0);
        C0065.m4689(linearLayout2, viewM35433);
        C0065.m4689(linearLayout2, relativeLayoutM68552);
        View viewM35434 = C0035.m3543(this, activity);
        C0037.m3919((LinearLayout.LayoutParams) C0039.m4105(viewM35432), C0035.m3620(20, activity), 0, C0035.m3620(20, activity), 0);
        C0065.m4689(linearLayout2, viewM35434);
        C0065.m4689(linearLayout2, relativeLayoutM24773);
        View viewM35435 = C0035.m3543(this, activity);
        C0065.m4689(linearLayout2, viewM35435);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        C0016.m687(linearLayout3, new LinearLayout.LayoutParams(-1, C0035.m3620(49, activity)));
        C0025.m2098(linearLayout3, 0);
        this.h = new TextView(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        C0016.m687(C0027.m2410(this), layoutParams);
        C0066.m4801(C0027.m2410(this), 17);
        C0019.m1180(C0027.m2410(this), C0033.m3330(m7078(), 689, 6, 629));
        C0027.m2442(C0027.m2410(this), -1);
        C0016.m722(C0027.m2410(this), 2, 14.0f);
        View view = new View(activity);
        C0016.m687(view, new ViewGroup.LayoutParams(C0035.m3620(1, activity), -1));
        C0028.m2660(view, C0031.m2985(C0033.m3330(m7078(), 695, 7, 2859)));
        this.i = new TextView(activity);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 1.0f;
        C0016.m687(C0027.m2406(this), layoutParams2);
        C0066.m4801(C0027.m2406(this), 17);
        C0019.m1180(C0027.m2406(this), C0029.m2695(m7078(), 702, 4, 1133));
        C0027.m2442(C0027.m2406(this), C0031.m2985(C0023.m1904(m7078(), 706, 7, 1311)));
        C0016.m722(C0027.m2406(this), 2, 14.0f);
        C0065.m4689(linearLayout3, C0027.m2410(this));
        C0065.m4689(linearLayout3, view);
        C0065.m4689(linearLayout3, C0027.m2406(this));
        if (zM4571) {
            C0065.m4689(linearLayout2, linearLayout3);
        } else {
            C0065.m4689(linearLayout, linearLayout3);
        }
        C0073.m6392(this, linearLayout);
        C0020.m1439(this, false);
        TextView textViewM2410 = C0027.m2410(this);
        if (textViewM2410 != null) {
            C0065.m4727(textViewM2410, new ViewOnClickListenerC0379i0(this, i));
        }
        TextView textViewM2406 = C0027.m2406(this);
        if (textViewM2406 != null) {
            C0065.m4727(textViewM2406, new ViewOnClickListenerC0379i0(this, 1));
        }
    }

    public final RelativeLayout b(Activity activity, String str, String str2, EditText editText, EditText editText2) {
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        Activity activityM2770 = C0029.m2770(this);
        C0032.m3144(relativeLayout, C0035.m3620(20, activityM2770), C0035.m3620(12, activityM2770), C0035.m3620(20, activityM2770), C0035.m3620(12, activityM2770));
        C0016.m687(relativeLayout, layoutParams);
        TextView textView = new TextView(activity);
        C0034.m3509(textView, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        C0111.m13050(layoutParams2, 15);
        C0111.m13050(layoutParams2, 21);
        C0016.m687(textView, layoutParams2);
        C0019.m1180(textView, C0025.m2151(m7078(), 722, 2, 425));
        C0027.m2442(textView, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C0035.m3620(48, activityM2770), C0035.m3620(27, activityM2770));
        C0072.m6126(layoutParams3, C0035.m3620(6, activityM2770));
        C0037.m3853(layoutParams3, C0035.m3620(3, activityM2770));
        C0111.m13050(layoutParams3, 15);
        C0019.m1232(layoutParams3, 16, C0072.m6212(textView));
        C0016.m687(editText2, layoutParams3);
        View view = new View(activity);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C0035.m3620(8, activityM2770), C0035.m3620(1, activityM2770));
        C0111.m13050(layoutParams4, 15);
        C0019.m1232(layoutParams4, 16, C0072.m6212(editText2));
        C0016.m687(view, layoutParams4);
        C0034.m3509(view, C0071.m5977());
        C0028.m2660(view, C0031.m2985(C0036.m3678(m7078(), 724, 9, 2561)));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C0035.m3620(48, activityM2770), C0035.m3620(27, activityM2770));
        C0072.m6126(layoutParams5, C0035.m3620(3, activityM2770));
        C0111.m13050(layoutParams5, 15);
        C0019.m1232(layoutParams5, 16, C0072.m6212(view));
        C0016.m687(editText, layoutParams5);
        LinearLayout linearLayout = new LinearLayout(activity);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        C0025.m2098(linearLayout, 1);
        C0111.m13050(layoutParams6, 15);
        C0111.m13050(layoutParams6, 20);
        C0019.m1232(layoutParams6, 16, C0072.m6212(editText));
        C0016.m687(linearLayout, layoutParams6);
        TextView textView2 = new TextView(activity);
        C0016.m687(textView2, new ViewGroup.LayoutParams(-2, -2));
        C0019.m1180(textView2, str);
        C0027.m2442(textView2, -1);
        C0022.m1661(textView2, C0035.m3633(1));
        C0016.m722(textView2, 2, 14.0f);
        TextView textView3 = new TextView(activity);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        C0037.m3919(layoutParams7, 0, C0035.m3620(8, activityM2770), 0, 0);
        C0016.m687(textView3, layoutParams7);
        C0019.m1180(textView3, str2);
        C0016.m722(textView3, 2, 10.0f);
        C0027.m2442(textView3, C0031.m2985(C0026.m2321(m7078(), 733, 7, 1694)));
        C0065.m4689(linearLayout, textView2);
        C0065.m4689(linearLayout, textView3);
        C0065.m4689(relativeLayout, textView);
        C0065.m4689(relativeLayout, editText2);
        C0065.m4689(relativeLayout, view);
        C0065.m4689(relativeLayout, editText);
        C0065.m4689(relativeLayout, linearLayout);
        return relativeLayout;
    }

    public final RelativeLayout c(Activity activity, String str, String str2, EditText editText, String str3) {
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        Activity activityM2770 = C0029.m2770(this);
        C0032.m3144(relativeLayout, C0035.m3620(20, activityM2770), C0035.m3620(12, activityM2770), C0035.m3620(20, activityM2770), C0035.m3620(12, activityM2770));
        C0016.m687(relativeLayout, layoutParams);
        TextView textView = new TextView(activity);
        C0034.m3509(textView, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        C0111.m13050(layoutParams2, 15);
        C0111.m13050(layoutParams2, 21);
        C0016.m687(textView, layoutParams2);
        C0019.m1180(textView, str3);
        C0027.m2442(textView, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C0035.m3620(48, activityM2770), C0035.m3620(27, activityM2770));
        C0072.m6126(layoutParams3, C0035.m3620(6, activityM2770));
        C0037.m3853(layoutParams3, C0035.m3620(6, activityM2770));
        C0111.m13050(layoutParams3, 15);
        C0019.m1232(layoutParams3, 16, C0072.m6212(textView));
        C0016.m687(editText, layoutParams3);
        LinearLayout linearLayout = new LinearLayout(activity);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        C0025.m2098(linearLayout, 1);
        C0111.m13050(layoutParams4, 15);
        C0111.m13050(layoutParams4, 20);
        C0019.m1232(layoutParams4, 16, C0072.m6212(editText));
        C0016.m687(linearLayout, layoutParams4);
        TextView textView2 = new TextView(activity);
        C0016.m687(textView2, new ViewGroup.LayoutParams(-2, -2));
        C0019.m1180(textView2, str);
        C0027.m2442(textView2, -1);
        C0022.m1661(textView2, C0035.m3633(1));
        C0016.m722(textView2, 2, 14.0f);
        TextView textView3 = new TextView(activity);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        C0037.m3919(layoutParams5, 0, C0035.m3620(8, activityM2770), 0, 0);
        C0016.m687(textView3, layoutParams5);
        C0019.m1180(textView3, str2);
        C0016.m722(textView3, 2, 10.0f);
        C0027.m2442(textView3, C0031.m2985(C0016.m625(m7078(), 740, 7, 2796)));
        C0065.m4689(linearLayout, textView2);
        C0065.m4689(linearLayout, textView3);
        C0065.m4689(relativeLayout, textView);
        C0065.m4689(relativeLayout, editText);
        C0065.m4689(relativeLayout, linearLayout);
        return relativeLayout;
    }

    public final View d(Activity activity) {
        View view = new View(activity);
        C0016.m687(view, new LinearLayout.LayoutParams(-1, C0035.m3620(1, C0029.m2770(this))));
        C0028.m2660(view, C0031.m2985(C0068.m5544(m7078(), 747, 7, 1276)));
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
            Activity activityM2770 = C0029.m2770(this);
            Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(activityM2770, C0072.m6116(m7078(), 754, 6, 669)));
            Point point = new Point();
            C0035.m3525(displayM5833, point);
            if (C0068.m5537(point) > C0025.m2215(point)) {
                layoutParamsM5516.gravity = GravityCompat.END;
                layoutParamsM5516.width = C0035.m3620(240, activityM2770);
                layoutParamsM5516.height = -2;
                layoutParamsM5516.x = C0035.m3620(16, activityM2770);
            } else {
                layoutParamsM5516.gravity = 17;
                layoutParamsM5516.width = C0035.m3620(304, activityM2770);
                layoutParamsM5516.height = -2;
            }
            C0078.m7346(windowM3064, layoutParamsM5516);
        }
    }
}
