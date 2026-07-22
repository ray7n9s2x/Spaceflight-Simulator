package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0331b0 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f303short = {1627, 1605, 1602, 1608, 1603, 1627, 518, 534, 535, 534, 535, 534, 535};
    public final /* synthetic */ int a;
    public TextView b;
    public TextView c;
    public TextView d;
    public Object e;
    public Object f;
    public View g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogC0331b0(Context context, int i, int i2) {
        super(context, i);
        this.a = i2;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7029() {
        if (C0018.m1064() > 0) {
            return f303short;
        }
        return null;
    }

    public View b(Activity activity, int i) {
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C0035.m3620(1, (Activity) C0017.m883(this)));
        layoutParams.topMargin = i;
        C0016.m687(view, layoutParams);
        C0028.m2660(view, C0031.m2985(C0033.m3330(m7029(), 6, 7, 549)));
        return view;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        switch (C0074.m6587(this)) {
            case 0:
                super.onStart();
                C0027.m2391(this, (Activity) C0017.m883(this));
                break;
            default:
                super.onStart();
                Window windowM3064 = C0031.m3064(this);
                if (windowM3064 != null) {
                    C0034.m3483(windowM3064, new ColorDrawable(0));
                    C0065.m4766(windowM3064, 0.0f);
                    WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
                    Point point = (Point) C0018.m1012(this);
                    if (C0068.m5537(point) > C0025.m2215(point)) {
                        layoutParamsM5516.gravity = GravityCompat.END;
                        layoutParamsM5516.width = C0075.m6777(C0027.m2454(this), 240.0f);
                        layoutParamsM5516.height = C0075.m6777(C0027.m2454(this), 260.0f);
                        layoutParamsM5516.x = C0075.m6777(C0027.m2454(this), 16.0f);
                    } else {
                        layoutParamsM5516.gravity = 17;
                        layoutParamsM5516.width = C0075.m6777(C0027.m2454(this), 304.0f);
                        layoutParamsM5516.height = -2;
                    }
                    C0078.m7346(windowM3064, layoutParamsM5516);
                }
                break;
        }
    }

    public void a(Activity activity) {
        Window windowM3064 = C0031.m3064(this);
        if (windowM3064 != null) {
            C0034.m3483(windowM3064, new ColorDrawable(0));
            C0065.m4766(windowM3064, 0.0f);
            WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
            Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(activity, C0036.m3678(m7029(), 0, 6, 1580)));
            Point point = new Point();
            C0035.m3525(displayM5833, point);
            if (C0068.m5537(point) > C0025.m2215(point)) {
                layoutParamsM5516.gravity = GravityCompat.END;
                layoutParamsM5516.width = C0035.m3620(240, activity);
                layoutParamsM5516.height = -2;
                layoutParamsM5516.x = C0035.m3620(16, activity);
            } else {
                layoutParamsM5516.gravity = 17;
                layoutParamsM5516.width = C0035.m3620(304, activity);
                layoutParamsM5516.height = -2;
            }
            C0078.m7346(windowM3064, layoutParamsM5516);
        }
    }
}
