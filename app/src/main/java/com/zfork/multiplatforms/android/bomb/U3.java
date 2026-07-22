package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
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
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class U3 extends FrameLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f286short = {2363, 2341, 2338, 2344, 2339, 2363, 1584, 1578, 1578, 1571, 1571, 1571, 1571, 1571, 1571, 1687, 1778, 1778, 1668, 1668, 1676, 1677, 1778, 1778, 1266, 1250, 1267, 1256, 1265, 1269, 1246, 1267, 1252, 1250, 1262, 1267, 1253, 1246, 1260, 1248, 1266, 1258, 732, 720, 706, 730, 750, 728, 732, 720, 726, 724, 2004, 1988, 2005, 1998, 2007, 2003, 2040, 1998, 1988, 2040, 2003, 1986, 2015, 2003, 2040, 1994, 1990, 2004, 1996, 2922, 2918, 2932, 2924, 2904, 2931, 2926, 2931, 2923, 2914, 26723, 26927, 31377, 23507, 26878, 22656, 1466, 1462, 1444, 1468, 1416, 1459, 1458, 1444, 1460, 1979, 1963, 1978, 1953, 1976, 1980, 1943, 1978, 1965, 1963, 1959, 1978, 1964, 1943, 1963, 1959, 1958, 1966, 1953, 1978, 1957, 2420, 2409, 2409, 2418, 2693, 2709, 2692, 2719, 2694, 2690, 2729, 2718, 2713, 2715, 2707, 2729, 2693, 2718, 2711, 2694, 2707, 2998, 3003, 2979, 2997, 2991, 2990, 2949, 3003, 3005, 3003, 2995, 2996, 1450, 1447, 1471, 1449, 1459, 1458, 1433, 1461, 1459, 1460, 1443, 3044, 3049, 3057, 3047, 3069, 3068, 3031, 3051, 3049, 3046, 3051, 3053, 3044, 1317, 1343, 1343, 1334, 1334, 1334, 1334, 1334, 1334, 3325, 3274, 3276, 3264, 3293, 3275, 3321, 3270, 3274, 3288, 3201, 3264, 3265, 3323, 3264, 3290, 3276, 3271, 3306, 3289, 3274, 3265, 3291, 3218, 2488, 2491, 2487, 2438, 2487, 2474, 2470, 2118, 2162, 2145, 2157, 2149, 2080, 2164, 2152, 2149, 2080, 2116, 2153, 2151, 2153, 2164, 2145, 2156, 2080, 2147, 2159, 2158, 2164, 2149, 2158, 2164, 2080, 2146, 2149, 2080, 2162, 2149, 2147, 2159, 2151, 2158, 2153, 2170, 2149, 2148, 2094, 1205, 1153, 1170, 1182, 1174, 1235, 1159, 1179, 1174, 1235, 1159, 1174, 1163, 1159, 1235, 1168, 1180, 1181, 1159, 1174, 1181, 1159, 1235, 1169, 1174, 1235, 1153, 1174, 1168, 1180, 1172, 1181, 1178, 1161, 1174, 1175, 1245};
    public final float A;
    public final float B;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Path d;
    public boolean e;
    public T3 f;
    public final Activity g;
    public final long h;
    public ScriptRecordType i;
    public final ArrayList j;
    public final float k;
    public long l;
    public final View m;
    public final View n;
    public final TextView o;
    public final int p;
    public final int q;
    public final FrameLayout.LayoutParams r;
    public final FrameLayout.LayoutParams s;
    public final int t;
    public final int u;
    public final Z4 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public U3(Activity activity) {
        super(activity, null, 0);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new Path();
        new Path();
        this.e = false;
        this.h = C0019.m1185();
        this.i = C0021.m1573();
        this.j = new ArrayList();
        this.k = 0.0f;
        this.l = 0L;
        int iM6777 = C0075.m6777(C0022.m1755(this), 88.0f);
        this.p = iM6777;
        int iM67772 = C0075.m6777(C0022.m1755(this), 129.0f);
        this.q = iM67772;
        this.r = new FrameLayout.LayoutParams(iM6777, iM67772);
        this.s = new FrameLayout.LayoutParams(-2, -2);
        this.t = C0075.m6777(C0022.m1755(this), 10.0f);
        this.u = C0075.m6777(C0022.m1755(this), 10.0f);
        Z4 z4 = new Z4(this);
        this.v = z4;
        this.w = true;
        this.x = false;
        this.y = false;
        this.z = 0L;
        this.g = C0078.m7370(C0028.m2666());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C0032.m3136(C0069.m5833((WindowManager) C0026.m2310(activity, C0064.m4545(m7009(), 0, 6, 2380))), displayMetrics);
        this.A = C0039.m4161(displayMetrics);
        this.B = C0068.m5638(displayMetrics);
        float fM7404 = C0078.m7404(displayMetrics);
        this.k = (fM7404 * 2.0f) + 0.5f;
        C0026.m2303(paint, C0031.m2985(C0064.m4545(m7009(), 6, 9, 1555)));
        String strM6791 = C0075.m6791(m7009(), 15, 9, 1716);
        C0026.m2303(paint2, C0031.m2985(strM6791));
        C0039.m4069(paint2, (1.0f * fM7404) + 0.5f);
        C0063.m4319(paint2, C0016.m701());
        C0026.m2303(paint3, C0031.m2985(strM6791));
        C0030.m2834(this, false);
        C0022.m1753(z4, activity);
        View viewM5715 = C0069.m5715(C0036.m3678(m7009(), 24, 18, 1153));
        this.n = viewM5715;
        ImageView imageView = (ImageView) C0029.m2688(viewM5715, C0070.m5942(m7009(), 42, 10, 689));
        C0039.m4187(imageView, C0071.m6091(C0021.m1650(m7009(), 52, 19, 1959)));
        C0016.m687(imageView, new LinearLayout.LayoutParams(C0075.m6777(activity, 120.0f), C0075.m6777(activity, 120.0f)));
        C0019.m1180((TextView) C0029.m2688(C0030.m2867(this), C0022.m1728(m7009(), 71, 10, 2823)), C0035.m3603(m7009(), 81, 6, 2600));
        this.o = (TextView) C0029.m2688(C0030.m2867(this), C0068.m5544(m7009(), 87, 9, 1495));
        View viewM57152 = C0069.m5715(C0028.m2609(m7009(), 96, 21, 1992));
        this.m = viewM57152;
        C0039.m4187((LinearLayout) C0029.m2688(viewM57152, C0078.m7427(m7009(), 117, 4, 2310)), C0018.m1059(C0038.m4022(m7009(), 121, 17, 2806)));
        TextView textView = (TextView) C0029.m2688(C0034.m3468(this), C0068.m5544(m7009(), 138, 12, 3034));
        TextView textView2 = (TextView) C0029.m2688(C0034.m3468(this), C0029.m2695(m7009(), 150, 11, 1478));
        TextView textView3 = (TextView) C0029.m2688(C0034.m3468(this), C0074.m6452(m7009(), 161, 13, 2952));
        C0065.m4727(textView, new R3(this, 0));
        C0065.m4727(textView2, new R3(this, 1));
        C0065.m4727(textView3, new R3(this, 2));
    }

    /* JADX INFO: renamed from: ۣۤۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7009() {
        if (C0030.m2940() > 0) {
            return f286short;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0313  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r74) {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.U3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawBackground(boolean z) {
        this.y = z;
    }

    public void setLastTimeMillis(long j) {
        this.z = j;
    }

    public void setListener(T3 t3) {
        this.f = t3;
    }

    public void setScriptType(ScriptRecordType scriptRecordType) {
        this.i = scriptRecordType;
        this.w = true;
        C0064.m4570(C0022.m1771(this));
        C0037.m3851(this);
        if (scriptRecordType != C0030.m2852() && scriptRecordType != C0065.m4785()) {
            this.x = true;
            return;
        }
        FrameLayout.LayoutParams layoutParamsM4511 = C0064.m4511(this);
        layoutParamsM4511.gravity = 17;
        this.e = false;
        this.x = false;
        if (C0024.m1969(C0030.m2867(this)) != null) {
            C0024.m2073(this, C0030.m2867(this));
        }
        int i = C0035.m3608()[C0030.m2893(scriptRecordType)];
        if (i == 1) {
            C0019.m1180(C0024.m2040(this), C0065.m4757(m7009(), 254, 37, 1267));
        } else if (i == 2) {
            C0019.m1180(C0024.m2040(this), C0023.m1904(m7009(), 214, 40, 2048));
        }
        C0036.m3702(this, C0030.m2867(this), layoutParamsM4511);
        this.y = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0037.m3785(canvas);
        int i = C0035.m3608()[C0030.m2893(C0071.m6020(this))];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                C0068.m5612(C0063.m4451(this), canvas);
            }
        } else {
            ArrayList arrayListM1771 = C0022.m1771(this);
            if (C0018.m1084(arrayListM1771) > 0) {
                ScriptTouchBean scriptTouchBean = (ScriptTouchBean) C0064.m4526(arrayListM1771, 0);
                ScriptTouchBean scriptTouchBean2 = (ScriptTouchBean) C0064.m4526(arrayListM1771, C0018.m1084(arrayListM1771) - 1);
                int iM3091 = (int) C0031.m3091(C0068.m5562(scriptTouchBean), C0068.m5562(scriptTouchBean2));
                int iM30912 = (int) C0031.m3091(C0021.m1619(scriptTouchBean), C0021.m1619(scriptTouchBean2));
                int iM1735 = (int) C0022.m1735(C0068.m5562(scriptTouchBean), C0068.m5562(scriptTouchBean2));
                int iM17352 = (int) C0022.m1735(C0021.m1619(scriptTouchBean), C0021.m1619(scriptTouchBean2));
                Path pathM3830 = C0037.m3830(this);
                C0026.m2327(pathM3830);
                float f = iM1735;
                float f2 = iM30912;
                Path.Direction directionM13103 = C0111.m13103();
                C0033.m3324(pathM3830, 0.0f, 0.0f, f, f2, directionM13103);
                float f3 = iM17352;
                C0033.m3324(pathM3830, f, 0.0f, C0073.m6402(this), f3, directionM13103);
                float f4 = iM3091;
                C0033.m3324(pathM3830, 0.0f, f2, f4, C0025.m2187(this), directionM13103);
                C0033.m3324(pathM3830, f4, f3, C0073.m6402(this), C0025.m2187(this), directionM13103);
                C0034.m3445(canvas, pathM3830, C0073.m6374(this));
                C0069.m5742(canvas, f4, f2, f, f3, C0018.m1080(this));
                float fM6067 = C0071.m6067(this);
                Paint paintM4422 = C0063.m4422(this);
                C0020.m1397(canvas, f4, f2, fM6067, paintM4422);
                C0020.m1397(canvas, f, f2, C0071.m6067(this), paintM4422);
                C0020.m1397(canvas, f, f3, C0071.m6067(this), paintM4422);
                C0020.m1397(canvas, f4, f3, C0071.m6067(this), paintM4422);
            }
        }
        if (C0020.m1365(this)) {
            C0016.m615(canvas, C0031.m2985(C0037.m3829(m7009(), 174, 9, 1286)));
        }
        C0067.m5455(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0020.m1398(C0063.m4451(this), 0, 0, C0073.m6402(this), C0025.m2187(this));
    }
}
