package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0444t0 extends RelativeLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f361short = {2934, 2887, 2896, 2900, 2881, 2896, 2837, 2919, 2896, 2902, 2906, 2887, 2897, 2596, 2615, 2615, 2623, 2622, 2625, 2625};
    public O a;
    public RelativeLayout b;
    public RelativeLayout c;
    public ListView d;
    public ProgressBar e;
    public InterfaceC0477y3 f;
    public InterfaceC0477y3 g;
    public InterfaceC0477y3 h;
    public InterfaceC0477y3 i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m7117() {
        if (C0068.m5678() >= 0) {
            return f361short;
        }
        return null;
    }

    public void setOpenIntroListener(View.OnClickListener onClickListener) {
    }

    public final RelativeLayout a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        C0034.m3509(textView, C0071.m5977());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C0035.m3620(171, context), C0035.m3620(36, context));
        C0111.m13050(layoutParams, 8);
        C0037.m3919(layoutParams, 0, 0, C0035.m3620(14, context), C0035.m3620(12, context));
        C0016.m687(textView, layoutParams);
        C0019.m1180(textView, C0035.m3603(m7117(), 0, 13, 2869));
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C0035.m3620(4, context);
            fArr2[i] = C0035.m3620(4, context);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0031.m3047(m7117(), 13, 7, 2567)));
        C0039.m4187(textView, shapeDrawable);
        C0066.m4801(textView, 17);
        C0016.m722(textView, 2, 14.0f);
        C0027.m2442(textView, -1);
        C0065.m4727(textView, new ViewOnClickListenerC0438s0(0, this));
        C0065.m4689(relativeLayout, textView);
        return relativeLayout;
    }

    public final void b() {
        ProgressBar progressBarM4729 = C0065.m4729(this);
        if (progressBarM4729 != null) {
            C0063.m4382(progressBarM4729, 4);
        }
        LinkedHashMap linkedHashMapM7371 = C0078.m7371(C0033.m3367());
        if (linkedHashMapM7371 == null || C0037.m3811(linkedHashMapM7371) == 0) {
            RelativeLayout relativeLayoutM3739 = C0036.m3739(this);
            if (relativeLayoutM3739 != null) {
                C0063.m4382(relativeLayoutM3739, 4);
            }
            RelativeLayout relativeLayoutM5917 = C0070.m5917(this);
            if (relativeLayoutM5917 != null) {
                C0063.m4382(relativeLayoutM5917, 0);
                return;
            }
            return;
        }
        RelativeLayout relativeLayoutM37392 = C0036.m3739(this);
        if (relativeLayoutM37392 != null) {
            C0063.m4382(relativeLayoutM37392, 0);
        }
        RelativeLayout relativeLayoutM59172 = C0070.m5917(this);
        if (relativeLayoutM59172 != null) {
            C0063.m4382(relativeLayoutM59172, 4);
        }
        O oM7261 = C0077.m7261(this);
        if (oM7261 == null) {
            return;
        }
        List listM2913 = C0030.m2913(oM7261);
        if (listM2913 == null) {
            listM2913 = new ArrayList();
        }
        C0063.m4327(listM2913);
        Iterator itM4154 = C0039.m4154(new ArrayList(C0025.m2117(linkedHashMapM7371)));
        while (C0036.m3657(itM4154)) {
            C0077.m7162(listM2913, (AutoClickPlanBean) C0019.m1293((Map.Entry) C0071.m6012(itM4154)));
        }
        O oM72612 = C0077.m7261(this);
        oM72612.b = listM2913;
        C0071.m6031(oM72612);
    }

    public View getEmptyViewVisible() {
        return C0070.m5917(this);
    }

    public O getmAdapter() {
        return C0077.m7261(this);
    }

    public void setEmptyViewVisible(int i) {
        RelativeLayout relativeLayoutM5917 = C0070.m5917(this);
        if (relativeLayoutM5917 != null) {
            C0063.m4382(relativeLayoutM5917, i);
        }
    }

    public void setListViewVisible(int i) {
        RelativeLayout relativeLayoutM3739 = C0036.m3739(this);
        if (relativeLayoutM3739 != null) {
            C0063.m4382(relativeLayoutM3739, i);
        }
    }

    public void setLoadingViewVisible(int i) {
        ProgressBar progressBarM4729 = C0065.m4729(this);
        if (progressBarM4729 != null) {
            C0063.m4382(progressBarM4729, i);
        }
    }

    public void setOnCreatePlanListener(InterfaceC0477y3 interfaceC0477y3) {
        this.f = interfaceC0477y3;
    }

    public void setOnDeleteListener(InterfaceC0477y3 interfaceC0477y3) {
        this.g = interfaceC0477y3;
    }

    public void setOnSelectPlanListener(InterfaceC0477y3 interfaceC0477y3) {
        this.i = interfaceC0477y3;
    }

    public void setmPlanEditListener(InterfaceC0477y3 interfaceC0477y3) {
        this.h = interfaceC0477y3;
    }

    public void setBgDrawable(Drawable drawable) {
        C0039.m4187(this, drawable);
    }
}
