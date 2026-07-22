package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N1 implements InterfaceC0415o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ L1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ DialogC0421p0 d;

    public /* synthetic */ N1(L1 l1, String str, DialogC0421p0 dialogC0421p0, int i) {
        this.a = i;
        this.b = l1;
        this.c = str;
        this.d = dialogC0421p0;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0415o0
    public final void b(DialogC0421p0 dialogC0421p0, int i) {
        switch (C0026.m2244(this)) {
            case 0:
                O1 o1M2942 = C0030.m2942(C0027.m2501(this));
                DialogC0421p0 dialogC0421p0M4656 = C0065.m4656(this);
                if (i != 3) {
                    C0063.m4438(o1M2942);
                    C0031.m3098(C0033.m3367());
                    C0020.m1338(dialogC0421p0M4656);
                } else {
                    String strM1802 = C0023.m1802(C0074.m6524(C0075.m6801(C0018.m1031(dialogC0421p0))));
                    if (C0074.m6542(o1M2942) != null) {
                        boolean zM3939 = C0038.m3939(strM1802);
                        AutoClickPlanBean autoClickPlanBeanM6542 = C0074.m6542(o1M2942);
                        if (zM3939) {
                            C0018.m987(autoClickPlanBeanM6542, C0074.m6489(this));
                        } else {
                            C0018.m987(autoClickPlanBeanM6542, strM1802);
                        }
                        if (C0036.m3669(o1M2942, autoClickPlanBeanM6542, false)) {
                            C0063.m4438(o1M2942);
                            C0031.m3098(C0033.m3367());
                            C0020.m1338(dialogC0421p0M4656);
                        }
                    }
                }
                break;
            default:
                O1 o1M29422 = C0030.m2942(C0027.m2501(this));
                DialogC0421p0 dialogC0421p0M46562 = C0065.m4656(this);
                if (i != 3) {
                    C0063.m4438(o1M29422);
                    C0031.m3098(C0033.m3367());
                    C0020.m1338(dialogC0421p0M46562);
                } else {
                    String strM18022 = C0023.m1802(C0074.m6524(C0075.m6801(C0018.m1031(dialogC0421p0))));
                    if (C0074.m6542(o1M29422) != null) {
                        boolean zM39392 = C0038.m3939(strM18022);
                        AutoClickPlanBean autoClickPlanBeanM65422 = C0074.m6542(o1M29422);
                        if (!zM39392) {
                            C0018.m987(autoClickPlanBeanM65422, strM18022);
                        } else if (C0038.m3939(C0064.m4632(autoClickPlanBeanM65422))) {
                            C0018.m987(autoClickPlanBeanM65422, C0074.m6489(this));
                        } else {
                            C0018.m987(autoClickPlanBeanM65422, C0064.m4632(autoClickPlanBeanM65422));
                        }
                        if (C0036.m3669(o1M29422, autoClickPlanBeanM65422, false)) {
                            C0063.m4438(o1M29422);
                            C0031.m3098(C0033.m3367());
                            C0020.m1338(dialogC0421p0M46562);
                        }
                    }
                }
                break;
        }
    }
}
