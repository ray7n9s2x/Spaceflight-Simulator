package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends View {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f272short = {1262, 1272, 1272, 1277, 1277, 1277, 1277, 1277, 1277, 2517, 2522, 2536, 2518, 2498, 2499, 2520, 2516, 2523, 2526, 2516, 2524, 2536, 2518, 2498, 2499, 2520, 2536, 2518, 2501, 2501, 2520, 2496, 2536, 2500, 2523, 2526, 2515, 2514, 2457, 2503, 2521, 2512};
    public final Matrix a;
    public Point b;
    public Point c;
    public final Paint d;
    public Bitmap e;

    /* JADX INFO: renamed from: ۟۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6995() {
        if (C0029.m2791() > 0) {
            return f272short;
        }
        return null;
    }

    public void setEndPoint(Point point) {
        this.c = point;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.e = bitmap;
        C0037.m3851(this);
    }

    public void setStartPoint(Point point) {
        this.b = point;
    }

    public P(Activity activity, Point point, Point point2) {
        super(activity);
        this.b = point;
        this.c = point2;
        Paint paint = new Paint();
        this.d = paint;
        C0026.m2303(paint, C0031.m2985(C0036.m3678(m6995(), 0, 9, 1229)));
        C0039.m4069(C0065.m4657(this), C0035.m3620(10, C0022.m1755(this)));
        C0022.m1755(this);
        C0030.m2951(C0072.m6184());
        this.e = C0027.m2462((BitmapDrawable) C0069.m5749(C0025.m2151(m6995(), 9, 33, 2487)));
        new Rect();
        this.a = new Matrix();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Point pointM4159;
        super.onDraw(canvas);
        if (C0034.m3505(this) != null && (pointM4159 = C0039.m4159(this)) != null) {
            C0070.m5916(canvas, C0068.m5537(r0), C0025.m2215(r0), C0068.m5537(pointM4159), C0025.m2215(pointM4159), C0065.m4657(this));
            Bitmap bitmapM2992 = C0031.m2992(this);
            if (bitmapM2992 != null) {
                float fM1321 = C0020.m1321(bitmapM2992);
                float fM7237 = C0077.m7237(C0031.m2992(this));
                int iM5537 = C0068.m5537(C0039.m4159(this));
                Point pointM3505 = C0034.m3505(this);
                float fM3251 = ((float) C0033.m3251(C0111.m13162(C0025.m2215(r2) - C0025.m2215(pointM3505), iM5537 - C0068.m5537(pointM3505)))) - 90.0f;
                int iM55372 = C0068.m5537(C0034.m3505(this));
                Point pointM41592 = C0039.m4159(this);
                float f = fM1321 / 2.0f;
                float fM5537 = ((iM55372 + C0068.m5537(pointM41592)) / 2.0f) - f;
                float f2 = fM7237 / 2.0f;
                float fM2215 = ((C0025.m2215(r3) + C0025.m2215(pointM41592)) / 2.0f) - f2;
                Matrix matrixM7220 = C0077.m7220(this);
                C0065.m4753(matrixM7220);
                C0066.m4898(matrixM7220, fM3251, f, f2);
                C0018.m1076(matrixM7220, fM5537, fM2215);
                C0063.m4389(canvas, C0031.m2992(this), matrixM7220, null);
            }
        }
    }
}
