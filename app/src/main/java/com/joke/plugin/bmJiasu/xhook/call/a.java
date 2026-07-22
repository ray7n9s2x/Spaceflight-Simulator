package com.joke.plugin.bmJiasu.xhook.call;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.H0;
import com.zfork.multiplatforms.android.bomb.S0;
import java.io.File;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Handler a;
    public boolean b = false;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f153short = {2577, 2617, 2600, 2621, 2566, 2597, 2619, 2611, 2600, 2617, 2591, 2612, 2606, 2611, 2610, 2611, 2633, 2636, 2631, 2630, 2637, 2624, 2628, 2641, 2571, 2646, 2634, 2264, 2259, 2270, 2266, 2255, 872, 874, 871, 871};
    public static final a c = new a();

    /* JADX INFO: renamed from: ۟۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4912(Object obj, float f) {
        if (C0031.m3075() > 0) {
            ((NativeHandler) obj).setSpeed(f);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4913(Object obj) {
        if (C0038.m4010() >= 0) {
            ((NativeHandler) obj).stop();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m4914() {
        if (C0067.m5468() < 0) {
            return f153short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m4915(Object obj) {
        if (C0016.m717() <= 0) {
            ((NativeHandler) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static NativeHandler m4916() {
        if (C0068.m5678() >= 0) {
            return NativeHandler.a;
        }
        return null;
    }

    public final void a(Context context, boolean z) {
        try {
            if (z) {
                C0077.m7165(C0032.m3209(m4914(), 32, 4, 779));
            } else if (C0033.m3343(new File(C0077.m7196(C0035.m3575(context)), C0069.m5807(m4914(), 16, 11, 2597)))) {
                C0077.m7165(C0067.m5418(m4914(), 27, 5, 2235));
                this.b = true;
                C0033.m3331(C0070.m5859(this), new H0(1));
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(double d) {
        if (C0066.m4907(this)) {
            C0033.m3331(C0070.m5859(this), new S0(d));
        } else {
            try {
                m4912(m4916(), (float) C0035.m3552(d));
            } catch (Throwable unused) {
            }
        }
    }

    public final void c() {
        if (C0066.m4907(this)) {
            C0028.m2623(103, C0111.m13120(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        } else {
            try {
                m4915(m4916());
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        if (C0066.m4907(this)) {
            return;
        }
        try {
            m4913(m4916());
        } catch (Throwable unused) {
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread(C0021.m1650(m4914(), 0, 16, 2652));
        C0065.m4734(handlerThread);
        this.a = new Handler(C0018.m1017(handlerThread));
    }
}
