package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class G0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f245short = {669, 658, 697, 659, 656, 670, 651, 690, 666, 657, 650, 3321, 3303, 3296, 3306, 3297, 3321, 1086, 1076, 1079, 1081, 1068, 1031, 1056, 2313, 2307, 2304, 2318, 2331, 2352, 2326};
    public Activity a;
    public C0 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public LinearLayout e;
    public FrameLayout f;
    public boolean g;
    public boolean h = false;
    public boolean i = false;
    public O0 j;
    public final int k;
    public final int l;
    public final SharedPreferences m;
    public final boolean n;
    public final Handler o;
    public final E0 p;

    /* JADX INFO: renamed from: ۟۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6930() {
        if (C0031.m3075() > 0) {
            return f245short;
        }
        return null;
    }

    public final void c() {
        this.h = false;
        Activity activityM1606 = C0021.m1606(this);
        if (activityM1606 instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) C0017.m899(C0027.m2395(C0027.m2524(activityM1606)), R.id.content);
            FrameLayout frameLayoutM3908 = C0037.m3908(this);
            if (frameLayoutM3908 != null) {
                C0024.m2073(viewGroup, frameLayoutM3908);
            }
        }
    }

    public final void a() {
        if (C0111.m13042(this)) {
            try {
                try {
                    O0 o0M5898 = C0070.m5898(this);
                    if (o0M5898 != null) {
                        C0020.m1379(o0M5898);
                    }
                    C0023.m1919(C0073.m6370(this), C0024.m1965(this));
                } catch (IllegalArgumentException e) {
                    e = e;
                    C0033.m3347(e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    C0033.m3347(e);
                } catch (NullPointerException e3) {
                    e = e3;
                    C0033.m3347(e);
                }
                this.g = false;
            } catch (Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    public final void b() {
        if (C0111.m13042(this)) {
            C0032.m3158(this);
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.j = null;
        this.e = null;
    }

    public final void d() {
        boolean zM13042 = C0111.m13042(this);
        if (zM13042) {
            if (zM13042) {
                C0037.m3792(C0073.m6370(this), C0024.m1965(this), C0018.m1015(this));
                return;
            }
            return;
        }
        Activity activityM1606 = C0021.m1606(this);
        if ((activityM1606 instanceof Activity) && (C0016.m610(activityM1606) || C0074.m6509(C0021.m1606(this)))) {
            return;
        }
        try {
            if (C0024.m1969(C0024.m1965(this)) != null) {
                C0023.m1919(C0073.m6370(this), C0024.m1965(this));
            }
            C0064.m4522(C0073.m6370(this), C0024.m1965(this), C0018.m1015(this));
            this.g = true;
            O0 o0M5898 = C0070.m5898(this);
            if (o0M5898 != null) {
                C0039.m4157(o0M5898);
            }
        } catch (WindowManager.BadTokenException e) {
            e = e;
            C0033.m3347(e);
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
    }

    public G0(Activity activity, boolean z, boolean z2, boolean z3) {
        this.e = null;
        Handler handler = new Handler(C0037.m3783());
        this.o = handler;
        E0 e0 = new E0(0, this);
        this.p = e0;
        this.a = activity;
        SharedPreferences sharedPreferencesM2737 = C0029.m2737(activity, C0031.m3047(m6930(), 0, 11, 767), 0);
        this.m = sharedPreferencesM2737;
        this.c = (WindowManager) C0026.m2310(activity, C0070.m5942(m6930(), 11, 6, 3214));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.packageName = C0038.m3957(activity);
        C0018.m1015(this).flags = 40;
        if ((C0034.m3437(C0067.m5516(C0027.m2524(activity))) & 1024) == 1024) {
            C0018.m1015(this).flags = 1320;
        }
        C0018.m1015(this).gravity = 8388659;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C0032.m3136(C0069.m5833(C0073.m6370(this)), displayMetrics);
        int iM4161 = C0039.m4161(displayMetrics);
        this.k = iM4161;
        int iM5638 = C0068.m5638(displayMetrics);
        this.l = iM5638;
        if (iM4161 > iM5638) {
            this.n = false;
        } else {
            this.n = true;
        }
        WindowManager.LayoutParams layoutParamsM1015 = C0018.m1015(this);
        StringBuilder sb = new StringBuilder(C0069.m5807(m6930(), 17, 7, 1112));
        C0077.m7179(sb, C0078.m7446(this));
        layoutParamsM1015.x = C0069.m5758(sharedPreferencesM2737, C0068.m5536(sb), 0);
        WindowManager.LayoutParams layoutParamsM10152 = C0018.m1015(this);
        StringBuilder sb2 = new StringBuilder(C0074.m6452(m6930(), 24, 7, 2415));
        C0077.m7179(sb2, C0078.m7446(this));
        layoutParamsM10152.y = C0069.m5758(sharedPreferencesM2737, C0068.m5536(sb2), iM5638 / 5);
        C0.K = z;
        C0.L = z2;
        C0.M = z3;
        if (C0022.m1686() == null) {
            synchronized (C0.class) {
                try {
                    if (C0022.m1686() == null) {
                        C0.J = new C0(activity);
                    }
                } finally {
                }
            }
        }
        C0 c0M1686 = C0022.m1686();
        this.b = c0M1686;
        LinearLayout linearLayoutM2727 = C0029.m2727(c0M1686);
        this.e = linearLayoutM2727;
        if (linearLayoutM2727 != null) {
            B1 b1 = new B1();
            C0 c0M1965 = C0024.m1965(this);
            C0068.m5669(c0M1965, new ViewOnTouchListenerC0481z1(b1, new C0479z(this, activity, 4), c0M1965, C0073.m6370(this), C0018.m1015(this)));
        }
        C0026.m2337(handler, e0, 3000L);
        C0031.m3112().b = new C0324a0(2, this);
        O0 o0 = new O0();
        o0.b = activity;
        o0.c = this;
        this.j = o0;
    }
}
