package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class O0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a = 1;
    public Activity b;
    public Object c;

    public /* synthetic */ O0() {
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C0111.m13069(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0111.m13069(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C0111.m13069(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C0111.m13069(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C0111.m13069(this);
    }

    public O0(Activity activity, N0 n0) {
        this.b = activity;
        this.c = n0;
    }

    public void k() {
        Activity activityM1666 = C0022.m1666(this);
        if (activityM1666 == null) {
            return;
        }
        try {
            C0029.m2823(C0069.m5791(activityM1666), this);
        } catch (Exception e) {
            C0033.m3347(e);
        }
    }

    public void l() {
        Activity activityM1666 = C0022.m1666(this);
        if (activityM1666 == null) {
            return;
        }
        try {
            C0064.m4567(C0069.m5791(activityM1666), this);
        } catch (Exception e) {
            C0033.m3347(e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (C0111.m13069(this)) {
            case 0:
                if (C0022.m1666(this) == activity) {
                    this.b = null;
                    N0 n0 = (N0) C0017.m879(this);
                    if (n0 != null) {
                        C0073.m6419(n0);
                        this.c = null;
                        break;
                    }
                }
                break;
            default:
                if (C0022.m1666(this) == activity) {
                    this.b = null;
                    G0 g0 = (G0) C0017.m879(this);
                    if (g0 != null) {
                        C0034.m3412(g0);
                        this.c = null;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        N0 n0;
        G0 g0;
        switch (C0111.m13069(this)) {
            case 0:
                Activity activityM1666 = C0022.m1666(this);
                if (activityM1666 == activity && C0016.m610(activityM1666) && (n0 = (N0) C0017.m879(this)) != null && C0037.m3824(n0)) {
                    C0069.m5711((N0) C0017.m879(this));
                    break;
                }
                break;
            default:
                Activity activityM16662 = C0022.m1666(this);
                if (activityM16662 == activity && C0016.m610(activityM16662) && (g0 = (G0) C0017.m879(this)) != null && C0111.m13042(g0)) {
                    C0032.m3158(g0);
                    break;
                }
                break;
        }
    }
}
