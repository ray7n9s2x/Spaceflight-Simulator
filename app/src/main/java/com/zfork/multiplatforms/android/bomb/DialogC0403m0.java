package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.zfork.entry.C0075;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0403m0 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f344short = {1743, 1745, 1750, 1756, 1751, 1743, 1312, 1342, 1337, 1331, 1336, 1312};
    public final /* synthetic */ int a;
    public Activity b;
    public WebView c;
    public TextView d;
    public ProgressBar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogC0403m0(Context context, int i, int i2) {
        super(context, i);
        this.a = i2;
    }

    /* JADX INFO: renamed from: ۧۢۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7091() {
        if (C0017.m846() >= 0) {
            return f344short;
        }
        return null;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        switch (C0038.m3976(this)) {
            case 0:
                super.onStart();
                Window windowM3064 = C0031.m3064(this);
                if (windowM3064 != null) {
                    C0034.m3483(windowM3064, new ColorDrawable(0));
                    C0065.m4766(windowM3064, 0.0f);
                    WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
                    Activity activityM5538 = C0068.m5538(this);
                    Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(activityM5538, C0019.m1189(m7091(), 6, 6, 1367)));
                    Point point = new Point();
                    C0035.m3525(displayM5833, point);
                    if (C0068.m5537(point) > C0025.m2215(point)) {
                        layoutParamsM5516.gravity = GravityCompat.END;
                        layoutParamsM5516.width = C0035.m3620(240, activityM5538);
                        layoutParamsM5516.height = -2;
                        layoutParamsM5516.x = C0035.m3620(16, activityM5538);
                    } else {
                        layoutParamsM5516.gravity = 17;
                        layoutParamsM5516.width = C0035.m3620(304, activityM5538);
                        layoutParamsM5516.height = -2;
                    }
                    C0078.m7346(windowM3064, layoutParamsM5516);
                }
                break;
            default:
                super.onStart();
                Window windowM30642 = C0031.m3064(this);
                if (windowM30642 != null) {
                    C0034.m3483(windowM30642, new ColorDrawable(0));
                    C0065.m4766(windowM30642, 0.0f);
                    WindowManager.LayoutParams layoutParamsM55162 = C0067.m5516(windowM30642);
                    Activity activityM55382 = C0068.m5538(this);
                    Display displayM58332 = C0069.m5833((WindowManager) C0026.m2310(activityM55382, C0018.m1070(m7091(), 0, 6, 1720)));
                    Point point2 = new Point();
                    C0035.m3525(displayM58332, point2);
                    if (C0068.m5537(point2) > C0025.m2215(point2)) {
                        layoutParamsM55162.gravity = GravityCompat.END;
                        layoutParamsM55162.width = C0075.m6777(activityM55382, 240.0f);
                        layoutParamsM55162.height = -2;
                        layoutParamsM55162.x = C0075.m6777(activityM55382, 16.0f);
                    } else {
                        layoutParamsM55162.gravity = 17;
                        layoutParamsM55162.width = C0075.m6777(activityM55382, 304.0f);
                        layoutParamsM55162.height = -2;
                    }
                    C0078.m7346(windowM30642, layoutParamsM55162);
                }
                break;
        }
    }
}
