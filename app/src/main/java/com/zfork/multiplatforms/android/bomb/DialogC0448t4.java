package com.zfork.multiplatforms.android.bomb;

import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0448t4 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f363short = {542, 512, 519, 525, 518, 542};
    public ImageView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public C0370g4 f;
    public C0408n g;
    public DialogC0472x4 h;
    public int i;
    public LinearLayout j;
    public ScriptProjectBean k;

    /* JADX INFO: renamed from: ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7119() {
        if (C0035.m3569() < 0) {
            return f363short;
        }
        return null;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window windowM3064 = C0031.m3064(this);
        if (windowM3064 != null) {
            C0034.m3483(windowM3064, new ColorDrawable(0));
            C0065.m4766(windowM3064, 0.0f);
            WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
            Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(C0027.m2454(this), C0028.m2609(m7119(), 0, 6, 617)));
            Point point = new Point();
            C0035.m3525(displayM5833, point);
            if (C0068.m5537(point) > C0025.m2215(point)) {
                layoutParamsM5516.gravity = 8388629;
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
    }
}
