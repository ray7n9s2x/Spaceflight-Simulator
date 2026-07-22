package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
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
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0462w0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f372short = {2194, 2291, 2185, 2177, 2177, 2177, 2177, 2177, 2177, 2868, 2852, 2869, 2862, 2871, 2867, 2840, 2862, 2852, 2840, 2852, 2859, 2862, 2852, 2860, 2840, 2853, 2854, 2852, 2860, 1271, 1216, 1222, 1226, 1239, 1217, 1216, 1239, 1157, 1260, 1227, 1233, 1239, 1226, 1470, 1442, 1442, 1446, 1445, 1516, 1529, 1529, 1457, 1463, 1467, 1459, 1469, 1471, 1466, 1466, 1459, 1444, 1463, 1446, 1446, 1528, 1461, 1465, 1467, 1529, 1445, 1463, 1464, 1458, 1460, 1465, 1454, 1529, 1444, 1459, 1461, 1465, 1444, 1458, 1459, 1444};
    public final /* synthetic */ int a;

    public /* synthetic */ ViewOnClickListenerC0462w0(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7133() {
        if (C0077.m7272() < 0) {
            return f372short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        switch (C0072.m6188(this)) {
            case 0:
                C0030.m2951((C0479z) C0023.m1892(C0063.m4409()));
                C0024.m2021(false);
                break;
            case 1:
                C0027.m2475();
                break;
            case 2:
                Activity activityM7370 = C0078.m7370(C0028.m2666());
                if (activityM7370 != null) {
                    DialogC0403m0 dialogC0403m0 = new DialogC0403m0(activityM7370, R.style.Theme.Black.NoTitleBar.Fullscreen, i);
                    dialogC0403m0.b = activityM7370;
                    LinearLayout linearLayout = new LinearLayout(activityM7370);
                    C0016.m687(linearLayout, new ViewGroup.LayoutParams(-1, -1));
                    float[] fArr = new float[8];
                    float[] fArr2 = new float[8];
                    for (int i2 = 0; i2 < 8; i2++) {
                        fArr[i2] = C0075.m6777(activityM7370, 8.0f);
                        fArr2[i2] = C0075.m6777(activityM7370, 8.0f);
                    }
                    float f = 0;
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(f, f, f, f), fArr2));
                    C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0026.m2321(m7133(), 0, 9, 2225)));
                    C0039.m4187(linearLayout, shapeDrawable);
                    C0025.m2098(linearLayout, 1);
                    int iM6777 = C0075.m6777(activityM7370, 16.0f);
                    RelativeLayout relativeLayout = new RelativeLayout(activityM7370);
                    C0034.m3509(relativeLayout, C0071.m5977());
                    C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(-1, C0075.m6777(activityM7370, 45.0f)));
                    RelativeLayout relativeLayout2 = new RelativeLayout(activityM7370);
                    C0016.m687(relativeLayout2, new RelativeLayout.LayoutParams(C0075.m6777(activityM7370, 45.0f), C0075.m6777(activityM7370, 45.0f)));
                    ImageView imageView = new ImageView(activityM7370);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM6777, iM6777);
                    C0111.m13050(layoutParams, 15);
                    layoutParams.leftMargin = iM6777;
                    C0016.m687(imageView, layoutParams);
                    C0016.m713(imageView, C0071.m6091(C0022.m1728(m7133(), 9, 20, 2887)));
                    C0065.m4689(relativeLayout2, imageView);
                    C0065.m4727(relativeLayout2, new ViewOnClickListenerC0391k0(10, dialogC0403m0));
                    C0065.m4689(relativeLayout, relativeLayout2);
                    dialogC0403m0.d = new TextView(activityM7370);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    C0111.m13050(layoutParams2, 13);
                    C0016.m687(C0069.m5740(dialogC0403m0), layoutParams2);
                    C0019.m1180(C0069.m5740(dialogC0403m0), C0064.m4545(m7133(), 29, 14, 1189));
                    C0027.m2442(C0069.m5740(dialogC0403m0), -1);
                    C0016.m722(C0069.m5740(dialogC0403m0), 2, 16.0f);
                    C0022.m1661(C0069.m5740(dialogC0403m0), C0035.m3633(1));
                    C0065.m4689(relativeLayout, C0069.m5740(dialogC0403m0));
                    C0065.m4689(linearLayout, relativeLayout);
                    dialogC0403m0.e = new ProgressBar(activityM7370, null, R.attr.progressBarStyleHorizontal);
                    C0016.m687(C0028.m2610(dialogC0403m0), new LinearLayout.LayoutParams(-1, C0075.m6777(activityM7370, 1.0f)));
                    C0065.m4689(linearLayout, C0028.m2610(dialogC0403m0));
                    dialogC0403m0.c = new WebView(activityM7370);
                    C0030.m2920(C0033.m3359(dialogC0403m0), new LinearLayout.LayoutParams(-1, C0075.m6777(activityM7370, 300.0f)));
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
                    C0039.m4064(C0033.m3359(dialogC0403m0), new C0397l0(dialogC0403m0, i));
                    C0065.m4689(linearLayout, C0033.m3359(dialogC0403m0));
                    C0073.m6392(dialogC0403m0, linearLayout);
                    C0075.m6841(C0033.m3359(dialogC0403m0), C0024.m1945(m7133(), 43, 42, 1494));
                    C0029.m2786(dialogC0403m0);
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0462w0(DialogC0331b0 dialogC0331b0) {
        this.a = 3;
    }
}
