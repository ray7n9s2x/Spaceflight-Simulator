package com.zfork.entry;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0327a3;
import com.zfork.multiplatforms.android.bomb.C0334b3;
import com.zfork.multiplatforms.android.bomb.C0358f;
import com.zfork.multiplatforms.android.bomb.D0;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0391k0;
import com.zfork.multiplatforms.android.bomb.W2;
import com.zfork.multiplatforms.android.bomb.X2;
import com.zfork.multiplatforms.android.bomb.Y1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class MetaSelectAppAbility extends Activity {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f222short = {1735, 1775, 1790, 1771, 3108, 3128, 3121, 3116, 3125, 3184, 3133, 3121, 3123, 3073, 3125, 3131, 3111, 3084, 3131, 3117, 3073, 3117, 3111, 3117, 3114, 3131, 3123, 3073, 3135, 3118, 3118};
    public C0358f b;
    public HandlerThread d;
    public Handler e;
    public boolean a = false;
    public String c = C0031.m2993();
    public final ArrayList f = new ArrayList();
    public final HashSet g = new HashSet();

    /* JADX INFO: renamed from: ۟ۡۥۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6772() {
        if (C0063.m4427() >= 0) {
            return f222short;
        }
        return null;
    }

    public final boolean a(ApplicationInfo applicationInfo, String str, boolean z) {
        if (!z || C0068.m5576(this) || (C0064.m4572(applicationInfo) & 1) == 0) {
            return C0028.m2625(C0033.m3282(C0016.m703(applicationInfo)), str) || C0028.m2625(C0033.m3282(C0020.m1382(C0063.m4440(applicationInfo, C0068.m5667(this)))), str);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        try {
            if (C0063.m4330() >= 30) {
                WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(C0027.m2524(this));
                C0066.m4873(layoutParamsM5516);
                C0078.m7346(C0027.m2524(this), layoutParamsM5516);
            }
            C0358f c0358fM6222 = C0072.m6222(C0018.m965(this));
            Button buttonM5857 = C0070.m5857(c0358fM6222);
            this.b = c0358fM6222;
            HandlerThread handlerThread = new HandlerThread(C0037.m3829(m6772(), 0, 4, 1674));
            this.d = handlerThread;
            C0065.m4734(handlerThread);
            this.e = new Handler(C0018.m1017(handlerThread));
            C0065.m4703(this, C0111.m13040(c0358fM6222));
            C0064.m4542(C0077.m7309(c0358fM6222), new C0327a3(this));
            this.a = C0071.m6046(C0111.m13064(this), C0065.m4757(m6772(), 4, 27, 3166), false);
            C0033.m3331(C0075.m6835(this), new D0(2, this));
            C0065.m4727(buttonM5857, new ViewOnClickListenerC0391k0(4, this));
            C0077.m7203(buttonM5857, new W2(this, c0358fM6222));
        } catch (Exception unused) {
        }
    }

    public final void b(String str) {
        ListView listViewM3369;
        ListAdapter listAdapterM3053;
        try {
            listViewM3369 = C0033.m3369(C0037.m3782(this));
            listAdapterM3053 = C0031.m3053(listViewM3369);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.c = str;
            throw th;
        }
        if (listAdapterM3053 != null && !C0038.m3939(str) && C0019.m1242(str, C0075.m6857(this))) {
            ArrayList arrayListM7409 = C0078.m7409((C0334b3) listAdapterM3053);
            if (!C0066.m4881(arrayListM7409)) {
                int iM1084 = C0018.m1084(arrayListM7409);
                Iterator itM4154 = C0039.m4154(arrayListM7409);
                String strM3282 = C0033.m3282(str);
                while (C0036.m3657(itM4154)) {
                    if (!C0020.m1374(this, (ApplicationInfo) C0071.m6012(itM4154), strM3282, false)) {
                        C0025.m2085(itM4154);
                    }
                }
                if (iM1084 != C0018.m1084(arrayListM7409)) {
                    C0025.m2123(this, new X2(listViewM3369, 0));
                }
            }
            this.c = str;
            return;
        }
        ArrayList arrayList = new ArrayList(C0071.m6018(C0068.m5667(this), 0));
        if (!C0038.m3939(str) || !C0068.m5576(this)) {
            Iterator itM41542 = C0039.m4154(arrayList);
            String strM32822 = C0033.m3282(str);
            while (C0036.m3657(itM41542)) {
                if (!C0020.m1374(this, (ApplicationInfo) C0071.m6012(itM41542), strM32822, true)) {
                    C0025.m2085(itM41542);
                }
            }
        }
        if (listAdapterM3053 != null) {
            ((C0334b3) listAdapterM3053).b = arrayList;
            C0025.m2123(this, new X2(listViewM3369, 1));
        } else {
            C0025.m2123(this, new Y1(this, listViewM3369, new C0334b3(this, arrayList), 2));
        }
        this.c = str;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            C0018.m1037(C0077.m7278(this));
        } catch (Exception unused) {
        }
    }
}
