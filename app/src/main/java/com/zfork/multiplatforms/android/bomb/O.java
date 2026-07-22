package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends BaseAdapter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f269short = {2181, 2194, 2242, 2240, 2240, 2240, 2240, 2240, 2240, 742, 757, 676, 675, 675, 675, 675, 675, 675, 3001, 2998, 2948, 3002, 2990, 2991, 2996, 3000, 2999, 2994, 3000, 2992, 2948, 3005, 2999, 2996, 3002, 2991, 2948, 3002, 2990, 2991, 2996, 2948, 3000, 2999, 2994, 3000, 2992, 2948, 2987, 2999, 3002, 2997, 2948, 2999, 2994, 2984, 2991, 2948, 3007, 3006, 2999, 3006, 2991, 3006, 3061, 2987, 2997, 3004, 952, 951, 901, 955, 943, 942, 949, 953, 950, 947, 953, 945, 901, 955, 943, 942, 949, 901, 953, 950, 947, 953, 945, 901, 938, 950, 955, 948, 901, 959, 958, 947, 942, 1012, 938, 948, 957};
    public final Context a;
    public List b;
    public C0408n c;
    public T d;

    /* JADX INFO: renamed from: ۟ۥۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6971() {
        if (C0067.m5468() <= 0) {
            return f269short;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List listM2913 = C0030.m2913(this);
        if (listM2913 == null) {
            return 0;
        }
        return C0034.m3427(listM2913);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List listM2913 = C0030.m2913(this);
        if (listM2913 == null) {
            return null;
        }
        return C0071.m6078(listM2913, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        N n;
        View linearLayout;
        Context contextM1968 = C0024.m1968(this);
        if (view == null) {
            n = new N();
            linearLayout = new LinearLayout(contextM1968);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C0035.m3620(44, contextM1968));
            C0025.m2098(linearLayout, 0);
            C0016.m687(linearLayout, layoutParams);
            C0063.m4385(linearLayout, 16);
            LinearLayout linearLayout2 = new LinearLayout(contextM1968);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            C0025.m2098(linearLayout2, 0);
            C0016.m687(linearLayout2, layoutParams2);
            C0063.m4385(linearLayout2, 16);
            LinearLayout linearLayout3 = new LinearLayout(contextM1968);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, C0035.m3620(36, contextM1968));
            layoutParams3.weight = 1.0f;
            C0037.m3919(layoutParams3, 0, 0, C0035.m3620(12, contextM1968), 0);
            C0025.m2098(linearLayout3, 0);
            C0016.m687(linearLayout3, layoutParams3);
            C0063.m4385(linearLayout3, 16);
            TextView textView = new TextView(contextM1968);
            new LinearLayout.LayoutParams(0, -1).weight = 1.0f;
            C0038.m4016(textView, C0035.m3620(8, contextM1968), 0, 0, 0);
            C0027.m2442(textView, -1);
            C0016.m722(textView, 2, 14.0f);
            C0032.m3230(textView, 1);
            C0065.m4689(linearLayout3, textView);
            ImageView imageView = new ImageView(contextM1968);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C0035.m3620(18, contextM1968), C0035.m3620(18, contextM1968));
            C0072.m6126(layoutParams4, C0035.m3620(12, contextM1968));
            C0016.m687(imageView, layoutParams4);
            ImageView imageView2 = new ImageView(contextM1968);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C0035.m3620(18, contextM1968), C0035.m3620(18, contextM1968));
            C0072.m6126(layoutParams5, C0035.m3620(8, contextM1968));
            C0016.m687(imageView2, layoutParams5);
            C0065.m4689(linearLayout2, linearLayout3);
            C0065.m4689(linearLayout2, imageView);
            C0065.m4689(linearLayout2, imageView2);
            C0065.m4689(linearLayout, linearLayout2);
            n.b = linearLayout2;
            n.a = textView;
            n.d = imageView;
            n.c = imageView2;
            C0027.m2403(linearLayout, n);
        } else {
            n = (N) C0021.m1553(view);
            linearLayout = view;
        }
        C0019.m1180(C0039.m4164(n), C0064.m4632((AutoClickPlanBean) C0071.m6078(C0030.m2913(this), i)));
        if (C0074.m6544((AutoClickPlanBean) C0071.m6078(C0030.m2913(this), i))) {
            LinearLayout linearLayoutM654 = C0016.m654(n);
            GradientDrawable gradientDrawable = new GradientDrawable();
            C0077.m7299(gradientDrawable, C0031.m2985(C0071.m5991(m6971(), 0, 9, 2214)));
            C0024.m2014(gradientDrawable, C0035.m3620(6, contextM1968));
            C0039.m4187(linearLayoutM654, gradientDrawable);
        } else {
            LinearLayout linearLayoutM6542 = C0016.m654(n);
            float[] fArr = new float[8];
            float[] fArr2 = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = C0035.m3620(6, contextM1968);
                fArr2[i2] = C0035.m3620(6, contextM1968);
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
            C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0031.m3047(m6971(), 9, 9, 709)));
            C0039.m4187(linearLayoutM6542, shapeDrawable);
        }
        ImageView imageViewM4671 = C0065.m4671(n);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageViewM4671, C0069.m5749(C0070.m5942(m6971(), 18, 50, 3035)));
        C0065.m4727(C0065.m4671(n), new M(this, i, 0));
        ImageView imageViewM4452 = C0063.m4452(n);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageViewM4452, C0069.m5749(C0077.m7205(m6971(), 68, 37, 986)));
        C0065.m4727(C0063.m4452(n), new M(this, i, 1));
        return linearLayout;
    }

    public O(Context context, ArrayList arrayList) {
        this.a = context;
        this.b = arrayList;
    }
}
