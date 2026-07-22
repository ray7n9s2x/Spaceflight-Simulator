package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowManager;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
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
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Z4 extends ColorDrawable implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f299short = {1049, 1043, 1055, 1054, 1071, 1043, 1052, 1049, 1043, 1051, 1071, 1024, 1055, 1027, 465, 475, 471, 470, 487, 475, 468, 465, 475, 467, 487, 456, 471, 459, 487, 459, 460, 473, 458, 460, 2218, 2208, 2220, 2221, 2204, 2208, 2223, 2218, 2208, 2216, 2204, 2227, 2220, 2224, 2204, 2214, 2221, 2215, 2659, 2665, 2661, 2660, 2645, 2670, 2680, 2667, 2685, 2645, 2662, 2659, 2660, 2671, 2983, 3001, 3006, 2996, 3007, 2983};
    public Y4 a;
    public Drawable c;
    public Drawable d;
    public Drawable e;
    public final View i;
    public final ArrayList b = new ArrayList();
    public int f = 0;
    public int g = 0;
    public final Paint h = new Paint(1);

    /* JADX INFO: renamed from: ۟ۡۨۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7024() {
        if (C0069.m5781() <= 0) {
            return f299short;
        }
        return null;
    }

    public final void a() {
        Y4 y4M3967 = C0038.m3967(this);
        if (y4M3967 == null) {
            return;
        }
        y4M3967.d = false;
        C0037.m3920(C0064.m4618(), this);
        C0025.m2203(C0064.m4618(), this);
    }

    public final void b(int i, int i2) {
        Y4 y4 = new Y4();
        y4.a = new Rect();
        y4.b = new Rect();
        y4.c = true;
        y4.d = true;
        y4.e = new Path();
        y4.f = 255;
        this.a = y4;
        y4.e = new Path();
        C0018.m1010(C0025.m2184(C0038.m3967(this)), i, i2);
        C0017.m919(C0039.m4186(this), C0038.m3967(this));
        int iM1909 = C0023.m1909(this);
        int i3 = i - (iM1909 / 2);
        int iM3954 = C0038.m3954(this);
        int i4 = i2 - (iM3954 / 2);
        C0067.m5419(C0028.m2545(C0038.m3967(this)), i3, i4, iM1909 + i3, iM3954 + i4);
        C0067.m5419(C0022.m1704(C0038.m3967(this)), i3, i4, C0023.m1909(this) + i3, C0038.m3954(this) + i4);
    }

    public final void c(Activity activity) {
        this.c = C0071.m6091(C0028.m2609(m7024(), 0, 14, 1136));
        this.f = C0075.m6777(activity, 18.0f);
        this.g = C0075.m6777(activity, 18.0f);
        this.d = C0071.m6091(C0021.m1650(m7024(), 14, 20, 440));
        this.e = C0071.m6091(C0036.m3678(m7024(), 34, 18, 2243));
        Drawable drawableM6091 = C0071.m6091(C0065.m4757(m7024(), 52, 14, 2570));
        if (drawableM6091 instanceof BitmapDrawable) {
            Bitmap bitmapM2462 = C0027.m2462((BitmapDrawable) drawableM6091);
            Paint paintM7372 = C0078.m7372(this);
            Shader.TileMode tileModeM1444 = C0020.m1444();
            C0024.m2032(paintM7372, new BitmapShader(bitmapM2462, tileModeM1444, tileModeM1444));
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C0032.m3136(C0069.m5833((WindowManager) C0026.m2310(activity, C0024.m1945(m7024(), 66, 6, 3024))), displayMetrics);
            C0039.m4069(paintM7372, C0078.m7404(displayMetrics) + 0.5f);
            C0063.m4319(paintM7372, C0016.m701());
        }
    }

    public final void d(int i, int i2, boolean z) {
        Y4 y4M3967 = C0038.m3967(this);
        if (y4M3967 == null) {
            return;
        }
        C0021.m1616(C0025.m2184(y4M3967), i, i2);
        y4M3967.c = z;
        int iM1909 = C0023.m1909(this);
        int i3 = i - (iM1909 / 2);
        int iM3954 = C0038.m3954(this);
        int i4 = i2 - (iM3954 / 2);
        C0067.m5419(C0022.m1704(y4M3967), i3, i4, iM1909 + i3, iM3954 + i4);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        View viewM3319;
        ArrayList arrayListM4186 = C0039.m4186(this);
        if (C0066.m4881(arrayListM4186) || (viewM3319 = C0033.m3319(this)) == null) {
            return;
        }
        for (int iM1084 = C0018.m1084(arrayListM4186) - 1; iM1084 >= 0; iM1084--) {
            Y4 y4 = (Y4) C0064.m4526(arrayListM4186, iM1084);
            if (!C0064.m4501(y4)) {
                int iM5782 = C0069.m5782(y4) - 4;
                y4.f = iM5782;
                if (iM5782 <= 0) {
                    C0018.m1092(arrayListM4186, iM1084);
                }
            }
        }
        C0037.m3851(viewM3319);
        C0025.m2203(C0064.m4618(), this);
    }

    public Z4(View view) {
        this.i = view;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawableM5735;
        C0037.m3785(canvas);
        Iterator itM4154 = C0039.m4154(C0039.m4186(this));
        while (C0036.m3657(itM4154)) {
            Y4 y4 = (Y4) C0071.m6012(itM4154);
            boolean zM1730 = C0022.m1730(y4);
            Rect rectM1704 = C0022.m1704(y4);
            if (zM1730) {
                C0017.m902(C0024.m2017(this), C0069.m5782(y4));
                C0026.m2295(C0024.m2017(this), rectM1704);
                drawableM5735 = C0024.m2017(this);
            } else {
                Paint paintM7372 = C0078.m7372(this);
                C0016.m640(paintM7372, C0069.m5782(y4));
                C0034.m3445(canvas, C0025.m2184(y4), paintM7372);
                C0017.m902(C0071.m6075(this), C0069.m5782(y4));
                C0026.m2295(C0071.m6075(this), C0028.m2545(y4));
                C0065.m4701(C0071.m6075(this), canvas);
                C0017.m902(C0069.m5735(this), C0069.m5782(y4));
                C0026.m2295(C0069.m5735(this), rectM1704);
                drawableM5735 = C0069.m5735(this);
            }
            C0065.m4701(drawableM5735, canvas);
        }
        C0067.m5455(canvas);
    }
}
