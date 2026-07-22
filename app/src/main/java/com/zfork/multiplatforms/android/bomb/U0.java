package com.zfork.multiplatforms.android.bomb;

import android.widget.ProgressBar;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.zfork.entry.C0075;

/* JADX INFO: loaded from: classes3.dex */
public final class U0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ C0341c3 c;

    @Override // java.lang.Runnable
    public final void run() {
        float fM6824 = (C0075.m6824(this) * 100.0f) / C0020.m1362(this);
        C0341c3 c0341c3M5804 = C0069.m5804(this);
        C0030.m2951(c0341c3M5804);
        try {
            ProgressBar progressBarM2269 = C0026.m2269(C0025.m2095(c0341c3M5804));
            if (progressBarM2269 != null) {
                C0036.m3677(progressBarM2269, (int) fM6824);
            }
        } catch (Exception unused) {
        }
    }

    public U0(C0341c3 c0341c3, long j, long j2) {
        this.c = c0341c3;
        this.a = j;
        this.b = j2;
    }
}
