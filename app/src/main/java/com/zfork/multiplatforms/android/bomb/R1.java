package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.view.ViewGroup;
import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.RunnablesProvider;
import com.android.apksig.zip.C0033;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.concurrent.Phaser;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ R1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM6308 = C0073.m6308(this);
        Object objM5699 = C0069.m5699(this);
        switch (C0068.m5558(this)) {
            case 0:
                T1 t1 = (T1) objM5699;
                C0030.m2951(t1);
                int i = 0;
                while (true) {
                    L lM3367 = C0033.m3367();
                    int iM1084 = C0018.m1084(C0016.m605(lM3367));
                    ArrayList arrayListM605 = C0016.m605(lM3367);
                    if (i >= iM1084) {
                        C0064.m4570(arrayListM605);
                        t1.o = null;
                        t1.p = null;
                    } else {
                        C0024.m2073((ViewGroup) objM6308, (View) C0064.m4526(arrayListM605, i));
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                C0327a3 c0327a3 = (C0327a3) objM5699;
                C0030.m2951(c0327a3);
                C0077.m7242();
                C0067.m5522(C0074.m6502(c0327a3), (String) objM6308);
                break;
            default:
                C0029.m2705(C0037.m3913((RunnablesProvider) objM5699));
                C0075.m6869((Phaser) objM6308);
                break;
        }
    }
}
