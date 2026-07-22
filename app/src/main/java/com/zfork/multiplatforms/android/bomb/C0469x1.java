package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.view.Window;
import android.view.WindowManager;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0469x1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f374short = {583, 598, 596, 604, 598, 592, 594, 635, 606, 580, 579, 535, 525, 535, 1639, 1651, 1650, 1620, 1647, 1636, 1660, 1637, 1639, 1636, 1642, 1647};
    public DialogC0445t1 a;
    public CloudBean b;
    public boolean c;

    /* JADX INFO: renamed from: ۟ۧ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7139() {
        if (C0111.m13165() < 0) {
            return f374short;
        }
        return null;
    }

    public final void a(List list, InterfaceC0471x3 interfaceC0471x3) {
        PackageInfo packageInfoM888;
        Activity activityM4418 = C0063.m4418(C0019.m1297());
        if (activityM4418 == null) {
            C0069.m5832(interfaceC0471x3, C0036.m3683());
            return;
        }
        if (list == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= C0034.m3427(list)) {
                break;
            }
            StringBuilder sb = new StringBuilder(C0016.m625(m7139(), 0, 14, 567));
            C0077.m7290(sb, (String) C0071.m6078(list, i));
            C0023.m1864(C0066.m4828(m7139(), 14, 12, 1547), C0068.m5536(sb));
            try {
                packageInfoM888 = C0017.m888(C0068.m5667(activityM4418), (String) C0071.m6078(list, i), 0);
            } catch (Exception unused) {
                packageInfoM888 = null;
            }
            if (packageInfoM888 != null) {
                this.c = true;
                break;
            }
            i++;
        }
        C0069.m5832(interfaceC0471x3, C0075.m6775(C0071.m6044(this)));
    }

    public final void b(CloudBean cloudBean) {
        Activity activityM4418 = C0063.m4418(C0019.m1297());
        if (activityM4418 != null) {
            DialogC0445t1 dialogC0445t1M3185 = C0032.m3185(this);
            if (dialogC0445t1M3185 != null) {
                if (C0036.m3676(dialogC0445t1M3185)) {
                    return;
                }
                C0029.m2786(C0032.m3185(this));
                return;
            }
            DialogC0445t1 dialogC0445t1 = new DialogC0445t1(activityM4418, R.style.Theme.Material.Dialog.NoActionBar);
            Window windowM3064 = C0031.m3064(dialogC0445t1);
            if (windowM3064 != null) {
                WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
                layoutParamsM5516.width = C0078.m7433(activityM4418, 260.0f);
                layoutParamsM5516.height = -2;
                layoutParamsM5516.dimAmount = 0.0f;
                C0078.m7346(windowM3064, layoutParamsM5516);
                C0077.m7257(windowM3064, R.color.transparent);
            }
            C0324a0 c0324a0 = new C0324a0(4, dialogC0445t1);
            C0348d3 c0348d3 = new C0348d3(activityM4418);
            c0348d3.f = false;
            try {
                c0348d3.e = c0324a0;
                c0348d3.c = cloudBean;
                C0031.m3031(c0348d3);
            } catch (Exception unused) {
            }
            C0073.m6392(dialogC0445t1, c0348d3);
            this.a = dialogC0445t1;
            C0020.m1439(dialogC0445t1, false);
            C0017.m944(C0032.m3185(this), false);
            C0025.m2160(C0031.m3064(C0032.m3185(this)), 17);
            C0029.m2786(C0032.m3185(this));
        }
    }
}
