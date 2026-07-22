package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.view.View;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0474y0 implements InterfaceC0415o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0474y0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0415o0
    public final void b(DialogC0421p0 dialogC0421p0, int i) {
        switch (C0019.m1205(this)) {
            case 0:
                C0468x0 c0468x0 = (C0468x0) C0078.m7331(this);
                if (i != 3) {
                    C0030.m2951(c0468x0);
                } else {
                    C0028.m2634(C0078.m7358(c0468x0), (Context) C0024.m2033(this), C0016.m704((Long) C0037.m3827(this)));
                }
                break;
            case 1:
                J1 j1 = (J1) C0078.m7331(this);
                C0030.m2951(j1);
                DialogC0421p0 dialogC0421p02 = (DialogC0421p0) C0037.m3827(this);
                if (i != 3) {
                    C0020.m1338(dialogC0421p02);
                } else {
                    String strM1802 = C0023.m1802(C0074.m6524(C0075.m6801(C0018.m1031(dialogC0421p0))));
                    O1 o1M1262 = C0019.m1262(j1);
                    if (C0074.m6542(o1M1262) != null) {
                        boolean zM3939 = C0038.m3939(strM1802);
                        AutoClickPlanBean autoClickPlanBeanM6542 = C0074.m6542(o1M1262);
                        if (zM3939) {
                            C0018.m987(autoClickPlanBeanM6542, (String) C0024.m2033(this));
                        } else {
                            C0018.m987(autoClickPlanBeanM6542, strM1802);
                        }
                        if (C0036.m3669(o1M1262, autoClickPlanBeanM6542, true)) {
                            C0020.m1338(dialogC0421p02);
                        }
                    }
                }
                break;
            default:
                ViewOnClickListenerC0480z0 viewOnClickListenerC0480z0 = (ViewOnClickListenerC0480z0) C0078.m7331(this);
                C0030.m2951(viewOnClickListenerC0480z0);
                if (i == 3) {
                    C0020.m1338((DialogC0373h0) C0024.m2033(this));
                    ViewOnClickListenerC0480z0 viewOnClickListenerC0480z0M4795 = C0066.m4795(C0030.m2942((L1) C0018.m993(viewOnClickListenerC0480z0)));
                    if (viewOnClickListenerC0480z0M4795 != null) {
                        C0021.m1540(viewOnClickListenerC0480z0M4795, (View) C0037.m3827(this));
                    }
                }
                break;
        }
    }
}
