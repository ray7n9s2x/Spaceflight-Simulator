package com.zfork.multiplatforms.android.bomb;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0359f0 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f319short = {627, 611, 610, 611, 610, 611, 610, 2941, 2915, 2916, 2926, 2917, 2941};
    public Context a;
    public C0450u0 b;
    public TextView c;
    public TextView d;
    public TextView e;
    public SeekBar f;

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7059() {
        if (C0032.m3184() < 0) {
            return f319short;
        }
        return null;
    }

    public final View a(int i, Context context) {
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C0035.m3620(1, C0073.m6435(this)));
        layoutParams.topMargin = i;
        C0016.m687(view, layoutParams);
        C0028.m2660(view, C0031.m2985(C0026.m2321(m7059(), 0, 7, 592)));
        return view;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window windowM3064 = C0031.m3064(this);
        if (windowM3064 != null) {
            C0034.m3483(windowM3064, new ColorDrawable(0));
            C0065.m4766(windowM3064, 0.0f);
            WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
            String strM1070 = C0018.m1070(m7059(), 7, 6, 2826);
            Context contextM6435 = C0073.m6435(this);
            Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(contextM6435, strM1070));
            Point point = new Point();
            C0035.m3525(displayM5833, point);
            if (C0068.m5537(point) > C0025.m2215(point)) {
                layoutParamsM5516.gravity = GravityCompat.END;
                layoutParamsM5516.width = C0035.m3620(240, contextM6435);
                layoutParamsM5516.height = -2;
                layoutParamsM5516.x = C0035.m3620(16, contextM6435);
            } else {
                layoutParamsM5516.gravity = 17;
                layoutParamsM5516.width = C0035.m3620(304, contextM6435);
                layoutParamsM5516.height = -2;
            }
            C0078.m7346(windowM3064, layoutParamsM5516);
        }
    }
}
