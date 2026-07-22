package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.kms.C0030;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0402m {
    public static volatile C0402m b;
    public ArrayList a = new ArrayList();

    public static C0402m b() {
        if (C0070.m5945() == null) {
            synchronized (C0402m.class) {
                try {
                    if (C0070.m5945() == null) {
                        C0402m c0402m = new C0402m();
                        c0402m.a = new ArrayList();
                        b = c0402m;
                    }
                } finally {
                }
            }
        }
        return C0070.m5945();
    }

    public Activity a() {
        ArrayList arrayListM2889 = C0030.m2889(this);
        Activity activity = C0018.m1084(arrayListM2889) > 0 ? (Activity) C0064.m4526(arrayListM2889, C0018.m1084(arrayListM2889) - 1) : null;
        if (activity == null || C0016.m610(activity) || C0074.m6509(activity)) {
            return null;
        }
        return activity;
    }
}
