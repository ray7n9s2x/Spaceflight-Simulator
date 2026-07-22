package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
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
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class K0 extends LinearLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f259short = {2865, 2834, 2823, 2823, 2822, 2857, 2823, 2843, 2030, 2017, 2047, 2024, 2023, 2003, 2029, 2041, 2040, 2019, 2003, 2031, 2019, 2018, 2026, 2021, 2027, 1008, 2894, 1643, 1637, 1657, 1663, 1651, 1648, 1637, 1637, 1636, 1663, 1646, 1653, 1645, 1637, 1650, 2363, 2356, 2310, 2345, 2357, 2348, 2366, 2352, 2359, 2310, 2355, 2352, 2360, 2346, 2348, 2310, 2346, 2353, 2352, 2367, 2349, 2365, 2358, 2350, 2359, 2423, 2345, 2359, 2366, 1028, 1058, 1077, 1059, 1061, 1078, 1076, 1059, 3258, 3249, 3246, 3321, 920, 919, 933, 906, 918, 911, 925, 915, 916, 933, 912, 915, 923, 905, 911, 933, 905, 914, 915, 924, 910, 911, 906, 980, 906, 916, 925, 2371, 2406, 2406, 444, 435, 385, 430, 434, 427, 441, 439, 432, 385, 436, 439, 447, 429, 427, 385, 429, 426, 447, 428, 426, 496, 430, 432, 441, 1633, 1606, 1619, 1600, 1606, 2214, 2217, 2203, 2228, 2216, 2225, 2211, 2221, 2218, 2203, 2222, 2221, 2213, 2231, 2225, 2203, 2217, 2219, 2230, 2209, 2203, 2230, 2213, 2224, 2209, 2282, 2228, 2218, 2211, 616, 586, 599, 576, 1252, 3134, 3121, 3075, 3121, 3133, 3131, 3125, 3135, 3075, 3125, 3135, 3123, 3122, 3075, 3119, 3116, 3129, 3129, 3128, 3075, 3112, 3109, 3116, 3129, 3075, 3135, 3123, 3118, 3129, 3182, 3186, 3116, 3122, 3131, 3305, 3302, 3284, 3302, 3306, 3308, 3298, 3304, 3284, 3298, 3304, 3300, 3301, 3284, 3320, 3323, 3310, 3310, 3311, 3284, 3327, 3314, 3323, 3310, 3284, 3304, 3300, 3321, 3310, 3258, 3237, 3323, 3301, 3308, 1766, 1738, 1751, 1728, 1684, 1696, 1676, 1681, 1670, 1745, 1514, 1423, 1423, 1423, 1423, 1423, 1423, 732, 710, 719, 710, 719, 710, 719, 2212, 2184, 2197, 2178, 2262, 2247, 2213, 2182, 2196, 2178, 2179, 2247, 2184, 2185, 2247, 2228, 2206, 2196, 2195, 2178, 2186, 2247, 2195, 2190, 2186, 2178, 2249, 3056, 3071, 3021, 3071, 3059, 3061, 3067, 3057, 3021, 3067, 3057, 3069, 3068, 3021, 3041, 3042, 3063, 3063, 3062, 3021, 3057, 3066, 3063, 3057, 3065, 3021, 3045, 3066, 3067, 3046, 3063, 3004, 3042, 3068, 3061, 1704, 1668, 1689, 1678, 1753, 1739, 1705, 1674, 1688, 1678, 1679, 1739, 1668, 1669, 1739, 1706, 1691, 1691, 1671, 1666, 1672, 1674, 1695, 1666, 1668, 1669, 1739, 1677, 1689, 1674, 1670, 1678, 1739, 1689, 1674, 1695, 1678, 1733, 2085, 2085, 2124, 2147, 2085, 2134, 2165, 2144, 2144, 2145, 2085, 2125, 2148, 2150, 2158, 2085, 2155, 2154, 2161, 2085, 2162, 2154, 2167, 2158, 2156, 2155, 2146, 2089, 2085, 2161, 2167, 2172, 2085, 2166, 2162, 2156, 2161, 2150, 2157, 2156, 2155, 2146, 2085, 2151, 2144, 2161, 2162, 2144, 2144, 2155, 2085, 2118, 2122, 2135, 2112, 2134, 2091, 2085, 2113, 2156, 2147, 2147, 2144, 2167, 2144, 2155, 2161, 2085, 2150, 2154, 2167, 2144, 2085, 2152, 2148, 2172, 2085, 2166, 2160, 2165, 2165, 2154, 2167, 2161, 2085, 2152, 2154, 2167, 2144, 2085, 2148, 2165, 2165, 2153, 2156, 2150, 2148, 2161, 2156, 2154, 2155, 2166, 2091, 2507, 2500, 2550, 2500, 2504, 2510, 2496, 2506, 2550, 2496, 2506, 2502, 2503, 2550, 2522, 2521, 2508, 2508, 2509, 2550, 2525, 2512, 2521, 2508, 2550, 2497, 2496, 2503, 2525, 2439, 2521, 2503, 2510, 2798, 2785, 2771, 2812, 2784, 2809, 2795, 2789, 2786, 2771, 2790, 2789, 2797, 2815, 2809, 2771, 2815, 2808, 2787, 2812, 2722, 2812, 2786, 2795, 1495, 1510, 1522, 1524, 1506, 605, 594, 608, 591, 595, 586, 600, 598, 593, 608, 597, 598, 606, 588, 586, 608, 588, 587, 606, 589, 587, 529, 591, 593, 600, 1411, 1444, 1457, 1442, 1444, 300, 273, 264, 267, 834, 884, 878, 828, 887, 887, 827, 885, 894, 894, 895, 827, 879, 884, 827, 873, 894, 872, 879, 890, 873, 879, 827, 879, 883, 894, 827, 892, 890, 886, 894, 827, 879, 884, 827, 888, 883, 890, 885, 892, 894, 827, 856, 852, 841, 862, 821, 885, 834, 852, 851, 838, 853, 851, 3152, 3163, 3140, 3091};
    public double a;
    public TextView b;
    public P0 c;
    public boolean d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final GridLayout h;
    public final LinearLayout i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final LinearLayout o;

    /* JADX INFO: renamed from: ۧۧۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6953() {
        if (C0070.m5903() >= 0) {
            return f259short;
        }
        return null;
    }

    public void setSpeedValue(float f) {
        this.a = f;
        C0037.m3912(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(Context context) {
        super(context);
        int i = 2;
        int i2 = 1;
        this.a = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        int i3 = 0;
        this.d = false;
        this.n = false;
        this.j = C0039.m4142(50, context);
        this.k = C0039.m4142(42, context);
        this.l = C0039.m4142(14, context);
        this.m = C0039.m4142(8, context);
        String strM5807 = C0069.m5807(m6953(), 0, 8, 2914);
        boolean zM3939 = C0038.m3939(strM5807);
        String strM4022 = C0038.m4022(m6953(), 8, 17, 1932);
        boolean zM4848 = zM3939 ? false : C0066.m4848(C0029.m2737(context, strM4022, 0), strM5807, false);
        this.n = zM4848;
        String strM3232 = C0032.m3232(C0064.m4545(m6953(), 27, 15, 1568), zM4848 ? C0065.m4757(m6953(), 25, 1, 961) : C0075.m6791(m6953(), 26, 1, 2940));
        float fM3780 = C0038.m3939(strM3232) ? 0.0f : C0037.m3780(C0029.m2737(context, strM4022, 0), strM3232, 0.0f);
        if (zM4848) {
            if (fM3780 <= 0.0f) {
                this.a = 1.0d;
            } else {
                this.a = fM3780;
            }
        } else if (fM3780 == 0.0f) {
            this.a = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            this.a = fM3780;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.i = linearLayout;
        C0025.m2098(linearLayout, 0);
        LinearLayout linearLayoutM2245 = C0026.m2245(this, context, C0039.m4139(this, context, C0070.m5942(m6953(), 42, 29, 2393)), C0036.m3699(context, C0068.m5544(m6953(), 71, 8, 1111)));
        C0065.m4727(linearLayoutM2245, new J0(this, i3));
        TextView textViewM3699 = C0036.m3699(context, C0021.m1531(C0064.m4545(m6953(), 79, 4, 3231), new Object[]{C0111.m13120(C0034.m3443(this))}));
        this.g = textViewM3699;
        C0016.m722(textViewM3699, 2, 14.0f);
        LinearLayout linearLayoutM22452 = C0026.m2245(this, context, null, C0023.m1912(this));
        LinearLayout linearLayoutM22453 = C0026.m2245(this, context, C0039.m4139(this, context, C0075.m6791(m6953(), 83, 27, PointerIconCompat.TYPE_ZOOM_IN)), C0036.m3699(context, C0030.m2840(m6953(), 110, 3, 2306)));
        C0065.m4727(linearLayoutM22453, new J0(this, i2));
        this.e = C0039.m4139(this, context, C0064.m4545(m6953(), 113, 25, 478));
        TextView textViewM36992 = C0036.m3699(context, C0069.m5807(m6953(), 138, 5, 1586));
        this.f = textViewM36992;
        LinearLayout linearLayoutM22454 = C0026.m2245(this, context, C0075.m6784(this), textViewM36992);
        C0065.m4727(linearLayoutM22454, new J0(this, i));
        LinearLayout linearLayoutM22455 = C0026.m2245(this, context, C0039.m4139(this, context, C0022.m1728(m6953(), 143, 29, 2244)), C0036.m3699(context, C0028.m2609(m6953(), 172, 4, 549)));
        C0065.m4727(linearLayoutM22455, new J0(this, 3));
        C0065.m4689(C0078.m7374(this), linearLayoutM2245);
        C0065.m4689(C0078.m7374(this), linearLayoutM22452);
        C0065.m4689(C0078.m7374(this), linearLayoutM22453);
        C0065.m4689(C0078.m7374(this), linearLayoutM22454);
        C0065.m4689(C0078.m7374(this), linearLayoutM22455);
        C0016.m687(C0078.m7374(this), new ViewGroup.LayoutParams(-2, -2));
        C0039.m4187(C0078.m7374(this), C0075.m6795(context));
        C0065.m4689(this, C0078.m7374(this));
        GridLayout gridLayout = new GridLayout(context);
        C0039.m4187(gridLayout, C0075.m6795(context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        C0037.m3919(layoutParams, 0, C0039.m4142(2, context), 0, 0);
        C0016.m687(gridLayout, layoutParams);
        C0071.m5978(gridLayout, 2);
        double[] dArr = new double[8];
        for (int i4 = 0; i4 < 8; i4++) {
            dArr[i4] = ((double) i4) + 0.5d;
        }
        dArr[5] = 10.0d;
        dArr[6] = 15.0d;
        dArr[7] = 20.0d;
        for (int i5 = 0; i5 < 8; i5++) {
            double d = dArr[i5];
            TextView textView = new TextView(context);
            C0073.m6362(textView, C0039.m4142(120, context));
            C0022.m1707(textView, C0039.m4142(33, context));
            C0066.m4801(textView, 17);
            C0027.m2442(textView, -1);
            C0016.m722(textView, 2, 14.0f);
            String strM1341 = C0020.m1341(d);
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, strM1341);
            C0077.m7290(sb, C0029.m2695(m6953(), 176, 1, 1212));
            C0019.m1180(textView, C0068.m5536(sb));
            C0065.m4727(textView, new J0(this, 4));
            C0065.m4689(gridLayout, textView);
        }
        this.h = gridLayout;
        C0063.m4382(gridLayout, 8);
        C0065.m4689(this, C0068.m5574(this));
        boolean zM700 = C0016.m700(this);
        String strM1189 = C0019.m1189(m6953(), 177, 34, 3164);
        String strM1070 = C0018.m1070(m6953(), 211, 34, 3211);
        LinearLayout linearLayoutM22456 = C0026.m2245(this, context, C0039.m4139(this, context, zM700 ? strM1070 : strM1189), C0036.m3699(context, zM700 ? C0016.m625(m6953(), 245, 5, 1701) : C0021.m1650(m6953(), 250, 5, 1763)));
        C0065.m4689(C0078.m7374(this), linearLayoutM22456);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C0039.m4142(2, context);
        C0039.m4187(linearLayout2, C0075.m6795(context));
        C0025.m2098(linearLayout2, 1);
        C0016.m687(linearLayout2, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iM4142 = C0039.m4142(12, context);
        C0025.m2098(linearLayout3, 0);
        C0016.m687(linearLayout3, layoutParams3);
        C0032.m3144(linearLayout3, iM4142, iM4142, iM4142, 0);
        ImageView imageView = new ImageView(context);
        int iM41422 = C0039.m4142(16, context);
        C0016.m687(imageView, new LinearLayout.LayoutParams(iM41422, iM41422));
        C0039.m4187(imageView, C0039.m4124(strM1070));
        int iM41423 = C0039.m4142(8, context);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        C0016.m687(textView2, layoutParams4);
        C0038.m4016(textView2, iM41423, 0, 0, 0);
        String strM1650 = C0021.m1650(m6953(), 255, 7, 1481);
        String strM6116 = C0072.m6116(m6953(), 262, 7, 767);
        C0027.m2442(textView2, zM700 ? C0031.m2985(strM1650) : C0031.m2985(strM6116));
        C0016.m722(textView2, 2, 11.0f);
        C0019.m1180(textView2, C0076.m6902(m6953(), 269, 27, 2279));
        ImageView imageView2 = new ImageView(context);
        C0016.m687(imageView2, new LinearLayout.LayoutParams(iM41422, iM41422));
        String strM2840 = C0030.m2840(m6953(), 296, 35, 2962);
        C0016.m713(imageView2, C0039.m4124(strM2840));
        if (!zM700) {
            C0037.m3860(imageView2, 8);
        }
        C0065.m4689(linearLayout3, imageView);
        C0065.m4689(linearLayout3, textView2);
        C0065.m4689(linearLayout3, imageView2);
        C0065.m4689(linearLayout2, linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        C0025.m2098(linearLayout4, 0);
        C0016.m687(linearLayout4, layoutParams5);
        C0032.m3144(linearLayout4, iM4142, iM41422, iM4142, 0);
        ImageView imageView3 = new ImageView(context);
        C0016.m687(imageView3, new LinearLayout.LayoutParams(iM41422, iM41422));
        C0039.m4187(imageView3, C0039.m4124(strM1189));
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
        layoutParams6.weight = 1.0f;
        C0016.m687(textView3, layoutParams6);
        C0038.m4016(textView3, iM41423, 0, 0, 0);
        C0027.m2442(textView3, zM700 ? C0031.m2985(strM6116) : C0031.m2985(strM1650));
        C0016.m722(textView3, 2, 11.0f);
        C0019.m1180(textView3, C0076.m6902(m6953(), 331, 38, 1771));
        ImageView imageView4 = new ImageView(context);
        C0016.m687(imageView4, new LinearLayout.LayoutParams(iM41422, iM41422));
        C0016.m713(imageView4, C0039.m4124(strM2840));
        if (zM700) {
            C0037.m3860(imageView4, 8);
        }
        C0065.m4689(linearLayout4, imageView3);
        C0065.m4689(linearLayout4, textView3);
        C0065.m4689(linearLayout4, imageView4);
        C0065.m4689(linearLayout2, linearLayout4);
        TextView textView4 = new TextView(context);
        C0016.m687(textView4, new LinearLayout.LayoutParams(-2, -2));
        C0038.m4016(textView4, iM4142, iM4142, iM4142, iM41423);
        C0027.m2442(textView4, C0031.m2985(strM6116));
        C0016.m722(textView4, 2, 10.0f);
        SpannableString spannableString = new SpannableString(C0065.m4757(m6953(), 369, 103, 2053));
        Drawable drawableM4124 = C0039.m4124(C0027.m2404(m6953(), 472, 33, 2473));
        int iM41424 = C0039.m4142(12, context);
        C0020.m1398(drawableM4124, 0, 0, iM41424, iM41424);
        C0072.m6218(spannableString, new W0(drawableM4124), 0, 1, 1);
        C0019.m1180(textView4, spannableString);
        C0065.m4689(linearLayout2, textView4);
        C0065.m4727(linearLayout3, new I0(this, 1));
        C0065.m4727(linearLayout4, new I0(this, 2));
        this.o = linearLayout2;
        C0063.m4382(linearLayout2, 8);
        C0065.m4689(this, C0034.m3384(this));
        C0065.m4727(linearLayoutM22456, new I0(this, 0));
        C0016.m687(this, new ViewGroup.LayoutParams(-2, -2));
        C0025.m2098(this, 1);
    }

    public static void a(K0 k0, boolean z) {
        if (z) {
            ImageView imageViewM6784 = C0075.m6784(k0);
            if (imageViewM6784 != null) {
                C0016.m713(imageViewM6784, C0039.m4124(C0039.m4066(m6953(), 505, 24, 2700)));
            }
            TextView textViewM3684 = C0036.m3684(k0);
            if (textViewM3684 != null) {
                C0019.m1180(textViewM3684, C0072.m6116(m6953(), 529, 5, 1415));
                return;
            }
            return;
        }
        ImageView imageViewM67842 = C0075.m6784(k0);
        if (imageViewM67842 != null) {
            C0016.m713(imageViewM67842, C0039.m4124(C0018.m1070(m6953(), 534, 25, 575)));
        }
        TextView textViewM36842 = C0036.m3684(k0);
        if (textViewM36842 != null) {
            C0019.m1180(textViewM36842, C0030.m2840(m6953(), 559, 5, 1488));
        }
    }

    public static TextView d(Context context, String str) {
        TextView textView = new TextView(context);
        C0016.m687(textView, new LinearLayout.LayoutParams(-2, -2));
        C0027.m2442(textView, -1);
        C0016.m722(textView, 2, 9.0f);
        C0019.m1180(textView, str);
        return textView;
    }

    public final ImageView b(Context context, String str) {
        ImageView imageView = new ImageView(context);
        int iM2304 = C0026.m2304(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM2304, iM2304);
        layoutParams.bottomMargin = C0036.m3679(this);
        C0016.m687(imageView, layoutParams);
        C0016.m713(imageView, C0039.m4124(str));
        return imageView;
    }

    public final LinearLayout c(Context context, ImageView imageView, TextView textView) {
        LinearLayout linearLayout = new LinearLayout(context);
        C0016.m687(linearLayout, new LinearLayout.LayoutParams(C0024.m2003(this), C0038.m4037(this)));
        C0025.m2098(linearLayout, 1);
        C0063.m4385(linearLayout, 17);
        if (imageView != null) {
            C0065.m4689(linearLayout, imageView);
        }
        if (textView != null) {
            C0065.m4689(linearLayout, textView);
        }
        return linearLayout;
    }

    public final void f() {
        TextView textViewM1912 = C0023.m1912(this);
        if (textViewM1912 != null) {
            C0019.m1180(textViewM1912, C0021.m1531(C0022.m1728(m6953(), 622, 4, 3189), new Object[]{C0111.m13120(C0034.m3443(this))}));
        }
    }

    public void setBgDrawable(Drawable drawable) {
        LinearLayout linearLayoutM7374 = C0078.m7374(this);
        if (linearLayoutM7374 != null) {
            C0039.m4187(linearLayoutM7374, drawable);
        }
    }

    public void setSpeedChangeListener(P0 p0) {
        this.c = p0;
    }

    public final void e() {
        Activity activityM3700 = C0036.m3700(C0038.m4007());
        if (activityM3700 != null) {
            DialogC0421p0 dialogC0421p0M7361 = C0078.m7361(activityM3700, 2, false);
            C0019.m1180(C0023.m1811(dialogC0421p0M7361), C0037.m3829(m6953(), 564, 4, 376));
            C0019.m1180(C0029.m2784(dialogC0421p0M7361), C0017.m942(C0030.m2840(m6953(), 568, 47, 795)));
            C0072.m6136(dialogC0421p0M7361);
            C0027.m2463(dialogC0421p0M7361, C0024.m1945(m6953(), 615, 7, 807));
            dialogC0421p0M7361.o = new C0324a0(3, this);
            C0029.m2786(dialogC0421p0M7361);
        }
    }
}
