package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
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
import com.android.apksig.zip.C0033;
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
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class T1 implements N0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f284short = {1705, 1719, 1712, 1722, 1713, 1705, 759, 559};
    public Activity a;
    public P1 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public boolean e;
    public O0 f;
    public AutoClickPointerBean g;
    public W1 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public P1 m;
    public WindowManager.LayoutParams n;
    public P o;
    public FrameLayout p;
    public int q;
    public int r;
    public final int s;

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7007() {
        if (C0074.m6454() <= 0) {
            return f284short;
        }
        return null;
    }

    public static void c(T1 t1, WindowManager.LayoutParams layoutParams, boolean z) {
        WindowManager.LayoutParams layoutParamsM4085 = layoutParams;
        Point pointM626 = C0016.m626(t1, z ? layoutParamsM4085 : C0025.m2191(t1));
        if (z) {
            layoutParamsM4085 = C0039.m4085(t1);
        }
        C0069.m5731(C0072.m6227(t1), C0016.m626(t1, layoutParamsM4085));
        C0026.m2267(C0072.m6227(t1), pointM626);
        C0037.m3851(C0072.m6227(t1));
    }

    public static WindowManager.LayoutParams e(Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.gravity = 8388659;
        layoutParams.packageName = C0038.m3957(activity);
        layoutParams.flags = 1320;
        return layoutParams;
    }

    @Override // com.zfork.multiplatforms.android.bomb.N0
    public final boolean a() {
        return C0067.m5460(this);
    }

    @Override // com.zfork.multiplatforms.android.bomb.N0
    public final void b() {
        if (C0067.m5460(this)) {
            C0077.m7166(this);
        }
        this.a = null;
        this.b = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.n = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.N0
    public final void cancel() {
        Activity activityM1666;
        if (C0067.m5460(this)) {
            try {
                try {
                    O0 o0M6332 = C0073.m6332(this);
                    if (o0M6332 != null && (activityM1666 = C0022.m1666(o0M6332)) != null) {
                        try {
                            C0064.m4567(C0069.m5791(activityM1666), o0M6332);
                        } catch (Exception e) {
                            C0033.m3347(e);
                        }
                    }
                    C0023.m1919(C0078.m7467(this), C0030.m2884(this));
                    P1 p1M2841 = C0030.m2841(this);
                    if (p1M2841 != null) {
                        C0023.m1919(C0078.m7467(this), p1M2841);
                    }
                    if (C0036.m3700(C0038.m4007()) != null && C0018.m1084(C0016.m605(C0033.m3367())) != 0) {
                        Activity activityM3700 = C0036.m3700(C0038.m4007());
                        C0025.m2123(activityM3700, new R1(this, (ViewGroup) C0027.m2395(C0027.m2524(activityM3700)), 0));
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    C0033.m3347(e);
                } catch (IllegalStateException e3) {
                    e = e3;
                    C0033.m3347(e);
                } catch (NullPointerException e4) {
                    e = e4;
                    C0033.m3347(e);
                }
                this.e = false;
            } catch (Throwable th) {
                this.e = false;
                throw th;
            }
        }
    }

    public final void d(int i, int i2, boolean z) {
        P1 p1M2884 = C0030.m2884(this);
        if (p1M2884 != null) {
            try {
                WindowManager.LayoutParams layoutParamsM4085 = C0039.m4085(this);
                layoutParamsM4085.x = i;
                layoutParamsM4085.y = i2;
                if (z) {
                    layoutParamsM4085.x = C0019.m1196(this);
                    layoutParamsM4085.y = C0024.m2009(this);
                }
                C0037.m3792(C0078.m7467(this), p1M2884, layoutParamsM4085);
            } catch (IllegalArgumentException e) {
                C0033.m3347(e);
            }
        }
    }

    public final void f() {
        W1 w1M1952 = C0024.m1952(this);
        if (w1M1952 == null || !C0037.m3878(w1M1952)) {
            return;
        }
        C0073.m6305(C0024.m1952(this));
        this.h = null;
    }

    public final Point g(WindowManager.LayoutParams layoutParams) {
        Point point = new Point();
        int iM5592 = C0068.m5592(layoutParams);
        int iM2319 = C0026.m2319(this);
        point.x = (iM5592 + iM2319) - C0075.m6825(this);
        point.y = (C0074.m6451(layoutParams) + iM2319) - C0078.m7322(this);
        return point;
    }

    public final void h(boolean z) {
        P1 p1M2884 = C0030.m2884(this);
        if (p1M2884 != null) {
            C0031.m3043(p1M2884, z);
        }
        P1 p1M2841 = C0030.m2841(this);
        if (p1M2841 != null) {
            C0031.m3043(p1M2841, z);
        }
    }

    public final void i(String str) {
        P1 p1M2884 = C0030.m2884(this);
        if (p1M2884 != null) {
            AutoClickPointerBean autoClickPointerBeanM4770 = C0065.m4770(this);
            C0068.m5556(p1M2884, (autoClickPointerBeanM4770 == null || C0026.m2273(autoClickPointerBeanM4770) != 3) ? str : C0032.m3116(C0026.m2321(m7007(), 6, 1, 676), str));
        }
        P1 p1M2841 = C0030.m2841(this);
        if (p1M2841 != null) {
            StringBuilder sb = new StringBuilder(C0018.m1070(m7007(), 7, 1, 618));
            C0077.m7290(sb, str);
            C0068.m5556(p1M2841, C0068.m5536(sb));
        }
        AutoClickPointerBean autoClickPointerBeanM47702 = C0065.m4770(this);
        if (autoClickPointerBeanM47702 != null) {
            C0029.m2733(autoClickPointerBeanM47702, str);
        }
    }

    public final void j() {
        Activity activityM1666;
        boolean zM5460 = C0067.m5460(this);
        if (zM5460) {
            if (zM5460) {
                C0037.m3792(C0078.m7467(this), C0030.m2884(this), C0039.m4085(this));
                P1 p1M2841 = C0030.m2841(this);
                if (p1M2841 != null) {
                    C0037.m3792(C0078.m7467(this), p1M2841, C0025.m2191(this));
                    return;
                }
                return;
            }
            return;
        }
        Activity activityM2397 = C0027.m2397(this);
        if ((activityM2397 instanceof Activity) && (C0016.m610(activityM2397) || C0074.m6509(C0027.m2397(this)))) {
            return;
        }
        try {
            if (C0024.m1969(C0030.m2884(this)) != null) {
                C0023.m1919(C0078.m7467(this), C0030.m2884(this));
            }
            C0064.m4522(C0078.m7467(this), C0030.m2884(this), C0039.m4085(this));
            P1 p1M28412 = C0030.m2841(this);
            if (p1M28412 != null) {
                if (C0024.m1969(p1M28412) != null) {
                    C0023.m1919(C0078.m7467(this), C0030.m2841(this));
                }
                C0064.m4522(C0078.m7467(this), C0030.m2841(this), C0025.m2191(this));
                if (C0037.m3807(C0065.m4770(this)) == 0) {
                    C0024.m2063(this, C0027.m2397(this));
                }
            }
            this.e = true;
            O0 o0M6332 = C0073.m6332(this);
            if (o0M6332 == null || (activityM1666 = C0022.m1666(o0M6332)) == null) {
                return;
            }
            try {
                C0029.m2823(C0069.m5791(activityM1666), o0M6332);
            } catch (Exception e) {
                C0033.m3347(e);
            }
        } catch (WindowManager.BadTokenException e2) {
            e = e2;
            C0033.m3347(e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            C0033.m3347(e);
        } catch (IllegalStateException e4) {
            e = e4;
            C0033.m3347(e);
        } catch (NullPointerException e5) {
            e = e5;
            C0033.m3347(e);
        }
    }

    public final void k(Activity activity, View view) {
        AutoClickPointerBean autoClickPointerBeanM4770;
        P1 p1M2841;
        if (C0024.m1952(this) == null) {
            W1 w1 = new W1(activity, this);
            this.h = w1;
            C0023.m1804(w1, true);
        }
        if (C0037.m3878(C0024.m1952(this)) || (autoClickPointerBeanM4770 = C0065.m4770(this)) == null) {
            return;
        }
        if (C0026.m2273(autoClickPointerBeanM4770) == 3 && (p1M2841 = C0030.m2841(this)) != null && view == p1M2841) {
            C0077.m7185(C0024.m1952(this), C0027.m2395(C0027.m2524(activity)), 8388659, C0072.m6158(C0065.m4770(this)) - (C0068.m5620(C0024.m1952(this)) / 2), (C0063.m4439(C0065.m4770(this)) - C0018.m1013(C0024.m1952(this))) - C0025.m2187(C0030.m2841(this)));
        } else {
            C0077.m7185(C0024.m1952(this), C0027.m2395(C0027.m2524(activity)), 8388659, C0075.m6843(C0065.m4770(this)) - (C0068.m5620(C0024.m1952(this)) / 2), (C0067.m5471(C0065.m4770(this)) - C0018.m1013(C0024.m1952(this))) - C0025.m2187(C0030.m2884(this)));
        }
    }

    public final void l(Activity activity) {
        Point pointM626 = C0016.m626(this, C0039.m4085(this));
        Point pointM6262 = C0016.m626(this, C0025.m2191(this));
        Activity activityM3700 = C0036.m3700(C0038.m4007());
        if (activityM3700 != null) {
            FrameLayout frameLayout = new FrameLayout(activityM3700);
            this.p = frameLayout;
            C0016.m687(frameLayout, new ViewGroup.LayoutParams(C0032.m3133(this), C0023.m1910(this)));
            this.o = new P(activity, pointM626, pointM6262);
            C0016.m687(C0072.m6227(this), new FrameLayout.LayoutParams(-1, -1));
            C0065.m4689(C0111.m13094(this), C0072.m6227(this));
            ViewGroup viewGroup = (ViewGroup) C0027.m2395(C0027.m2524(activityM3700));
            C0073.m6402(viewGroup);
            C0025.m2187(viewGroup);
            C0073.m6402(C0072.m6227(this));
            C0025.m2187(C0072.m6227(this));
            C0065.m4689(viewGroup, C0111.m13094(this));
            C0017.m919(C0016.m605(C0033.m3367()), C0111.m13094(this));
        }
    }

    public T1(Activity activity, AutoClickPointerBean autoClickPointerBean) {
        this.s = 0;
        this.a = activity;
        this.b = new P1(activity);
        this.g = autoClickPointerBean;
        this.c = (WindowManager) C0026.m2310(activity, C0016.m625(m7007(), 0, 6, 1758));
        this.d = C0019.m1230(activity);
        if (C0036.m3700(C0038.m4007()) != null) {
            Activity activityM3700 = C0036.m3700(C0038.m4007());
            int[] iArr = new int[2];
            C0017.m918(C0027.m2395(C0027.m2524(activityM3700)), iArr);
            int iM6402 = C0073.m6402(C0027.m2395(C0027.m2524(activityM3700)));
            int iM2187 = C0025.m2187(C0027.m2395(C0027.m2524(activityM3700)));
            int i = iArr[0];
            this.i = i;
            int i2 = iArr[1];
            this.k = i2;
            int i3 = i + iM6402;
            this.j = i3;
            int i4 = i2 + iM2187;
            this.l = i4;
            int iM6843 = iM6402 / 2;
            int iM5471 = iM2187 / 2;
            AutoClickPointerBean autoClickPointerBeanM4770 = C0065.m4770(this);
            if (autoClickPointerBeanM4770 != null) {
                C0038.m3972(autoClickPointerBeanM4770, i3);
                C0070.m5844(C0065.m4770(this), i4);
                iM6843 = C0075.m6843(C0065.m4770(this)) != 0 ? C0075.m6843(C0065.m4770(this)) : iM6843;
                if (C0067.m5471(C0065.m4770(this)) != 0) {
                    iM5471 = C0067.m5471(C0065.m4770(this));
                }
            }
            C0035.m3620(22, activity);
            C0035.m3620(22, activity);
            C0039.m4085(this).x = (iArr[0] + iM6843) - (C0035.m3620(22, activity) / 2);
            C0039.m4085(this).y = (iArr[1] + iM5471) - (C0035.m3620(22, activity) / 2);
            WindowManager.LayoutParams layoutParamsM4085 = C0039.m4085(this);
            this.q = C0068.m5592(layoutParamsM4085);
            this.r = C0074.m6451(layoutParamsM4085);
            AutoClickPointerBean autoClickPointerBeanM47702 = C0065.m4770(this);
            if (autoClickPointerBeanM47702 != null) {
                C0078.m7420(autoClickPointerBeanM47702, i3);
                C0021.m1644(C0065.m4770(this), i4);
                C0028.m2617(C0065.m4770(this), iM6843);
                C0066.m4874(C0065.m4770(this), iM5471);
            }
        }
        P1 p1M2884 = C0030.m2884(this);
        if (p1M2884 != null) {
            C0070.m5884(p1M2884, new S1(this, false));
        }
        if (C0026.m2273(autoClickPointerBean) == 3) {
            this.m = new P1(activity);
            this.n = C0019.m1230(activity);
            if (C0036.m3700(C0038.m4007()) != null) {
                Activity activityM37002 = C0036.m3700(C0038.m4007());
                int[] iArr2 = new int[2];
                C0017.m918(C0027.m2395(C0027.m2524(activityM37002)), iArr2);
                int iM64022 = C0073.m6402(C0027.m2395(C0027.m2524(activityM37002)));
                int iM21872 = C0025.m2187(C0027.m2395(C0027.m2524(activityM37002)));
                int iM3620 = C0035.m3620(20, activity) + (iM64022 / 2);
                int iM36202 = C0035.m3620(45, activity) + (iM21872 / 2);
                AutoClickPointerBean autoClickPointerBeanM47703 = C0065.m4770(this);
                if (autoClickPointerBeanM47703 != null) {
                    iM3620 = C0072.m6158(autoClickPointerBeanM47703) != 0 ? C0072.m6158(C0065.m4770(this)) : iM3620;
                    if (C0063.m4439(C0065.m4770(this)) != 0) {
                        iM36202 = C0063.m4439(C0065.m4770(this));
                    }
                }
                int iM36203 = C0035.m3620(22, activity) / 2;
                this.s = iM36203;
                WindowManager.LayoutParams layoutParamsM2191 = C0025.m2191(this);
                layoutParamsM2191.x = (iArr2[0] + iM3620) - iM36203;
                layoutParamsM2191.y = (iArr2[1] + iM36202) - iM36203;
                AutoClickPointerBean autoClickPointerBeanM47704 = C0065.m4770(this);
                if (autoClickPointerBeanM47704 != null) {
                    C0071.m6083(autoClickPointerBeanM47704, C0032.m3133(this));
                    C0074.m6475(C0065.m4770(this), C0023.m1910(this));
                    C0072.m6169(C0065.m4770(this), iM3620);
                    C0022.m1781(C0065.m4770(this), iM36202);
                }
            }
            P1 p1M2841 = C0030.m2841(this);
            if (p1M2841 != null) {
                C0070.m5884(p1M2841, new S1(this, true));
            }
        }
        this.f = new O0(activity, this);
    }
}
