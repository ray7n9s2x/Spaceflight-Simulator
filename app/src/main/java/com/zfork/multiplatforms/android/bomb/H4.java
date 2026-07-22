package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SignatureCreatorAbility b;
    public final /* synthetic */ C0344d c;

    public /* synthetic */ H4(SignatureCreatorAbility signatureCreatorAbility, C0344d c0344d, int i) {
        this.a = i;
        this.b = signatureCreatorAbility;
        this.c = c0344d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignatureCreatorAbility signatureCreatorAbilityM2572 = C0028.m2572(this);
        C0344d c0344dM3852 = C0037.m3852(this);
        switch (C0069.m5827(this)) {
            case 0:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM2572);
                try {
                    File fileM1342 = C0020.m1342();
                    if (fileM1342 != null && C0033.m3343(fileM1342)) {
                        C0032.m3207(fileM1342);
                    }
                    o5.f = null;
                    o5.g = null;
                    o5.h = null;
                    break;
                } catch (Exception unused) {
                }
                C0025.m2123(signatureCreatorAbilityM2572, new D0(4, c0344dM3852));
                break;
            default:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM2572);
                try {
                    C0025.m2123(signatureCreatorAbilityM2572, new RunnableC0367g1(signatureCreatorAbilityM2572, c0344dM3852, C0074.m6505(signatureCreatorAbilityM2572, C0074.m6524(C0075.m6801(C0035.m3580(c0344dM3852))), C0074.m6524(C0075.m6801(C0023.m1900(c0344dM3852)))), C0064.m4622()));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
