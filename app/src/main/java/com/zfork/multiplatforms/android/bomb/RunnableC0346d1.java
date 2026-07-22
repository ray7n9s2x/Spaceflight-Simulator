package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0346d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConsumerAbility b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0346d1(ConsumerAbility consumerAbility, String str, int i) {
        this.a = i;
        this.b = consumerAbility;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConsumerAbility consumerAbilityM2331 = C0026.m2331(this);
        String strM2662 = C0028.m2662(this);
        switch (C0074.m6552(this)) {
            case 0:
                C0023.m1832();
                C0030.m2951(consumerAbilityM2331);
                try {
                    C0019.m1180(C0075.m6861(C0070.m5902(consumerAbilityM2331)), strM2662);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                C0023.m1832();
                C0030.m2951(consumerAbilityM2331);
                try {
                    C0019.m1180(C0029.m2699(C0070.m5902(consumerAbilityM2331)), strM2662);
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
