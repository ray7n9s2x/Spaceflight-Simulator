package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
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

/* JADX INFO: loaded from: classes3.dex */
public final class I1 extends FrameLayout {
    public static volatile I1 p;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f253short = {939, 932, 918, 936, 956, 957, 934, 938, 933, 928, 938, 930, 918, 943, 933, 934, 936, 957, 918, 936, 956, 957, 934, 918, 938, 933, 928, 938, 930, 918, 954, 957, 936, 955, 957, 999, 953, 935, 942, 582, 585, 635, 581, 593, 592, 587, 583, 584, 589, 583, 591, 635, 578, 584, 587, 581, 592, 635, 581, 593, 592, 587, 635, 583, 584, 589, 583, 591, 635, 599, 588, 587, 595, 522, 596, 586, 579, 954, 919, 909, 910, 914, 927, 903, 2291, 2300, 2254, 2288, 2276, 2277, 2302, 2290, 2301, 2296, 2290, 2298, 2254, 2295, 2301, 2302, 2288, 2277, 2254, 2288, 2276, 2277, 2302, 2254, 2290, 2301, 2296, 2290, 2298, 2254, 2273, 2302, 2296, 2303, 2277, 2292, 2275, 2239, 2273, 2303, 2294, 2938, 2907, 2896, 2897, 1862, 1865, 1915, 1861, 1873, 1872, 1867, 1863, 1864, 1869, 1863, 1871, 1915, 1858, 1864, 1867, 1861, 1872, 1915, 1861, 1873, 1872, 1867, 1915, 1863, 1864, 1869, 1863, 1871, 1915, 1876, 1864, 1861, 1866, 1802, 1876, 1866, 1859, 2351, 2328, 2334, 2322, 2319, 2329, 531, 540, 558, 528, 516, 517, 542, 530, 541, 536, 530, 538, 558, 528, 516, 517, 542, 558, 530, 541, 536, 530, 538, 558, 537, 532, 541, 513, 607, 513, 543, 534, 2973, 2992, 3001, 2981, 2885, 2890, 2936, 2886, 2898, 2899, 2888, 2884, 2891, 2894, 2884, 2892, 2936, 2881, 2891, 2888, 2886, 2899, 2936, 2886, 2898, 2899, 2888, 2936, 2884, 2891, 2894, 2884, 2892, 2936, 2900, 2886, 2897, 2882, 2825, 2903, 2889, 2880, 1740, 1790, 1769, 1786, 3040, 2977, 3067, 3059, 3059, 3059, 3059, 3059, 3059, 462, 449, 499, 461, 473, 472, 451, 463, 448, 453, 463, 455, 499, 458, 448, 451, 461, 472, 499, 461, 473, 472, 451, 499, 463, 448, 453, 463, 455, 499, 463, 448, 451, 479, 457, 386, 476, 450, 459, 2614, 2564, 2579, 2560, 2629, 2564, 2582, 615, 582, 587, 586, 1675, 1668, 1718, 1672, 1692, 1693, 1670, 1674, 1669, 1664, 1674, 1666, 1718, 1679, 1669, 1670, 1672, 1693, 1718, 1672, 1692, 1693, 1670, 1718, 1674, 1669, 1664, 1674, 1666, 1718, 1665, 1664, 1677, 1676, 1735, 1689, 1671, 1678, 1228, 1249, 1275, 1272, 1252, 1257, 1265, 794, 789, 807, 793, 781, 780, 791, 795, 788, 785, 795, 787, 807, 798, 788, 791, 793, 780, 807, 793, 781, 780, 791, 807, 795, 788, 785, 795, 787, 807, 779, 784, 791, 783, 854, 776, 790, 799};
    public final ImageView a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final RelativeLayout l;
    public boolean m;
    public boolean n;
    public final LinearLayout o;

    /* JADX INFO: renamed from: ۟ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6940() {
        if (C0077.m7272() <= 0) {
            return f253short;
        }
        return null;
    }

    public I1(Activity activity) {
        super(activity);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(-2, -2));
        RelativeLayout relativeLayout2 = new RelativeLayout(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C0035.m3620(50, activity));
        C0034.m3509(relativeLayout2, C0071.m5977());
        C0016.m687(relativeLayout2, layoutParams);
        this.a = new ImageView(activity);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C0035.m3620(34, activity), C0035.m3620(34, activity));
        C0111.m13050(layoutParams2, 15);
        C0037.m3853(layoutParams2, C0035.m3620(8, activity));
        C0072.m6126(layoutParams2, C0035.m3620(4, activity));
        C0016.m687(C0065.m4695(this), layoutParams2);
        ImageView imageViewM4695 = C0065.m4695(this);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageViewM4695, C0069.m5749(C0066.m4828(m6940(), 0, 39, 969)));
        C0034.m3509(C0065.m4695(this), C0071.m5977());
        C0065.m4689(relativeLayout2, C0065.m4695(this));
        ImageView imageView = new ImageView(activity);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageView, C0069.m5749(C0075.m6791(m6940(), 39, 38, 548)));
        this.b = imageView;
        TextView textView = new TextView(activity);
        C0019.m1180(textView, C0066.m4828(m6940(), 77, 7, 1022));
        this.f = textView;
        ImageView imageViewM4742 = C0065.m4742(this);
        LinearLayout linearLayout = new LinearLayout(activity);
        C0016.m687(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        C0025.m2098(linearLayout, 1);
        C0063.m4385(linearLayout, 17);
        if (imageViewM4742 != null) {
            C0016.m687(imageViewM4742, new ViewGroup.LayoutParams(C0035.m3620(14, activity), C0035.m3620(14, activity)));
        }
        C0027.m2442(textView, -1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = C0035.m3620(8, activity);
        C0016.m687(textView, layoutParams3);
        C0016.m722(textView, 2, 9.0f);
        C0066.m4801(textView, 17);
        if (imageViewM4742 != null) {
            C0065.m4689(linearLayout, imageViewM4742);
        }
        C0065.m4689(linearLayout, textView);
        this.g = linearLayout;
        C0034.m3509(linearLayout, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C0035.m3620(42, activity), -1);
        C0019.m1232(layoutParams4, 17, C0072.m6212(C0065.m4695(this)));
        C0016.m687(C0032.m3166(this), layoutParams4);
        C0065.m4689(relativeLayout2, C0032.m3166(this));
        LinearLayout linearLayoutM4448 = C0063.m4448(activity, C0031.m3047(m6940(), 84, 41, 2193), C0036.m3678(m6940(), 125, 4, 2868));
        this.h = linearLayoutM4448;
        C0034.m3509(linearLayoutM4448, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C0035.m3620(42, activity), -1);
        C0019.m1232(layoutParams5, 17, C0072.m6212(C0032.m3166(this)));
        C0016.m687(C0025.m2118(this), layoutParams5);
        C0065.m4689(relativeLayout2, C0025.m2118(this));
        LinearLayout linearLayoutM44482 = C0063.m4448(activity, C0039.m4066(m6940(), 129, 38, 1828), C0030.m2840(m6940(), 167, 6, 2429));
        this.i = linearLayoutM44482;
        C0034.m3509(linearLayoutM44482, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(C0035.m3620(42, activity), -1);
        C0019.m1232(layoutParams6, 17, C0072.m6212(C0025.m2118(this)));
        C0016.m687(C0067.m5493(this), layoutParams6);
        C0065.m4689(relativeLayout2, C0067.m5493(this));
        LinearLayout linearLayoutM44483 = C0063.m4448(activity, C0071.m5991(m6940(), 173, 32, 625), C0111.m13097(m6940(), 205, 4, 3029));
        this.o = linearLayoutM44483;
        C0034.m3509(linearLayoutM44483, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(C0035.m3620(42, activity), -1);
        C0019.m1232(layoutParams7, 17, C0072.m6212(C0067.m5493(this)));
        C0016.m687(C0067.m5501(this), layoutParams7);
        C0065.m4689(relativeLayout2, C0067.m5501(this));
        String strM2321 = C0026.m2321(m6940(), 209, 38, 2855);
        String strM1650 = C0021.m1650(m6940(), 247, 4, 1695);
        LinearLayout linearLayoutM44484 = C0063.m4448(activity, strM2321, strM1650);
        this.j = linearLayoutM44484;
        C0034.m3509(linearLayoutM44484, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C0035.m3620(42, activity), -1);
        C0019.m1232(layoutParams8, 17, C0072.m6212(C0067.m5501(this)));
        C0072.m6126(layoutParams8, C0035.m3620(8, activity));
        C0016.m687(C0037.m3911(this), layoutParams8);
        C0065.m4689(relativeLayout2, C0037.m3911(this));
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 1 || i == 6 || i == 7) {
                fArr[i] = C0035.m3620(25, activity);
                fArr2[i] = C0035.m3620(25, activity);
            } else {
                fArr[i] = C0035.m3620(8, activity);
                fArr2[i] = C0035.m3620(8, activity);
            }
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0020.m1443(m6940(), 251, 9, 3011)));
        C0039.m4187(relativeLayout2, shapeDrawable);
        this.l = new RelativeLayout(activity);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(C0035.m3620(20, activity), -2);
        C0019.m1232(layoutParams9, 17, C0072.m6212(relativeLayout2));
        C0019.m1232(layoutParams9, 6, C0072.m6212(relativeLayout2));
        C0019.m1232(layoutParams9, 8, C0072.m6212(relativeLayout2));
        C0037.m3919(layoutParams9, C0035.m3620(8, activity), C0035.m3620(15, activity), 0, C0035.m3620(15, activity));
        C0016.m687(C0068.m5677(this), layoutParams9);
        C0039.m4187(C0068.m5677(this), C0078.m7454(activity));
        this.c = new ImageView(activity);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(C0035.m3620(7, activity), C0035.m3620(7, activity));
        C0111.m13050(layoutParams10, 13);
        C0016.m687(C0024.m2000(this), layoutParams10);
        ImageView imageViewM2000 = C0024.m2000(this);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageViewM2000, C0069.m5749(C0027.m2404(m6940(), 260, 39, 428)));
        C0034.m3509(C0024.m2000(this), C0071.m5977());
        C0065.m4689(C0068.m5677(this), C0024.m2000(this));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        C0016.m687(linearLayout2, new ViewGroup.LayoutParams(-2, -2));
        C0025.m2098(linearLayout2, 1);
        C0039.m4187(linearLayout2, C0078.m7454(activity));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(C0035.m3620(60, activity), C0035.m3620(30, activity));
        TextView textView2 = new TextView(activity);
        this.d = textView2;
        C0027.m2442(textView2, -1);
        C0016.m687(C0031.m2974(this), layoutParams11);
        C0019.m1180(C0031.m2974(this), strM1650);
        C0016.m722(C0031.m2974(this), 2, 12.0f);
        C0066.m4801(C0031.m2974(this), 17);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(C0035.m3620(60, activity), C0035.m3620(30, activity));
        layoutParams12.gravity = 17;
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        C0027.m2442(textView3, -1);
        C0016.m687(C0073.m6368(this), layoutParams12);
        C0019.m1180(C0073.m6368(this), C0027.m2404(m6940(), 299, 7, 2661));
        C0016.m722(C0073.m6368(this), 2, 12.0f);
        C0066.m4801(C0073.m6368(this), 17);
        C0065.m4689(linearLayout2, C0031.m2974(this));
        C0065.m4689(linearLayout2, C0073.m6368(this));
        this.k = linearLayout2;
        C0034.m3509(linearLayout2, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -2);
        C0019.m1232(layoutParams13, 3, C0072.m6212(relativeLayout2));
        C0019.m1232(layoutParams13, 19, C0072.m6212(relativeLayout2));
        C0037.m3919(layoutParams13, 0, C0035.m3620(2, activity), 0, 0);
        C0016.m687(C0027.m2452(this), layoutParams13);
        C0063.m4382(C0027.m2452(this), 8);
        C0065.m4689(relativeLayout, relativeLayout2);
        C0065.m4689(relativeLayout, C0068.m5677(this));
        C0065.m4689(relativeLayout, C0027.m2452(this));
        C0065.m4689(this, relativeLayout);
    }

    public static LinearLayout a(Activity activity, String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(activity);
        C0016.m687(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        C0025.m2098(linearLayout, 1);
        C0063.m4385(linearLayout, 17);
        ImageView imageView = new ImageView(activity);
        C0016.m687(imageView, new ViewGroup.LayoutParams(C0035.m3620(14, activity), C0035.m3620(14, activity)));
        C0030.m2951(C0072.m6184());
        C0016.m713(imageView, C0069.m5749(str));
        TextView textView = new TextView(activity);
        C0027.m2442(textView, -1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C0035.m3620(8, activity);
        C0016.m687(textView, layoutParams);
        C0019.m1180(textView, str2);
        C0016.m722(textView, 2, 9.0f);
        C0066.m4801(textView, 17);
        C0065.m4689(linearLayout, imageView);
        C0065.m4689(linearLayout, textView);
        return linearLayout;
    }

    public View getAddPointerLayout() {
        return C0025.m2118(this);
    }

    public View getHelpLayout() {
        return C0067.m5501(this);
    }

    public View getHidePointerLayout() {
        return C0032.m3166(this);
    }

    public ImageView getIvClose() {
        return C0024.m2000(this);
    }

    public RelativeLayout getIvCloseContainer() {
        return C0068.m5677(this);
    }

    public ImageView getIvHidePointer() {
        return C0065.m4742(this);
    }

    public ImageView getIvStartOrStop() {
        return C0065.m4695(this);
    }

    public View getSaveExpandLayout() {
        return C0027.m2452(this);
    }

    public View getSaveLayout() {
        return C0037.m3911(this);
    }

    public View getSettingLayout() {
        return C0067.m5493(this);
    }

    public TextView getTvHidePointer() {
        return C0036.m3655(this);
    }

    public TextView getTvSave() {
        return C0031.m2974(this);
    }

    public TextView getTvSaveAs() {
        return C0073.m6368(this);
    }

    public void setAutoClickStart(boolean z) {
        this.m = z;
    }

    public void setClickPointerHide(boolean z) {
        this.n = z;
    }

    public void setPointerHideView(boolean z) {
        if (z) {
            TextView textViewM3655 = C0036.m3655(this);
            if (textViewM3655 != null) {
                C0019.m1180(textViewM3655, C0030.m2840(m6940(), 306, 4, 559));
            }
            ImageView imageViewM4742 = C0065.m4742(this);
            if (imageViewM4742 != null) {
                C0022.m1755(this);
                C0030.m2951(C0072.m6184());
                C0016.m713(imageViewM4742, C0069.m5749(C0067.m5418(m6940(), 310, 38, 1769)));
                return;
            }
            return;
        }
        TextView textViewM36552 = C0036.m3655(this);
        if (textViewM36552 != null) {
            C0019.m1180(textViewM36552, C0067.m5418(m6940(), 348, 7, 1160));
        }
        ImageView imageViewM47422 = C0065.m4742(this);
        if (imageViewM47422 != null) {
            C0022.m1755(this);
            C0030.m2951(C0072.m6184());
            C0016.m713(imageViewM47422, C0069.m5749(C0033.m3330(m6940(), 355, 38, 888)));
        }
    }
}
