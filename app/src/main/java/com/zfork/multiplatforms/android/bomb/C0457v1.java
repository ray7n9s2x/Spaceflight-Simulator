package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.joke.basetoollib.C0063;
import j$.util.Objects;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0457v1 extends TimerTask {
    /* JADX INFO: renamed from: ۦۡۡ, reason: contains not printable characters */
    public static String m7131(Object obj) {
        if (C0024.m2011() < 0) {
            return Objects.toString(obj);
        }
        return null;
    }

    public C0457v1() {
        C0029.m2740();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Activity activityM4418 = C0063.m4418(C0019.m1297());
        m7131(activityM4418);
        if (activityM4418 == null || C0016.m610(activityM4418)) {
            return;
        }
        C0025.m2123(activityM4418, new D0(1, this));
    }
}
