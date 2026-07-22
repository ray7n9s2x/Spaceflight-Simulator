package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0340c2 implements InterfaceC0466w4 {
    public final /* synthetic */ C0361f2 a;

    public /* synthetic */ C0340c2(C0361f2 c0361f2) {
        this.a = c0361f2;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0466w4
    public void cancel() {
        C0361f2 c0361f2M2528 = C0027.m2528(this);
        DialogC0331b0 dialogC0331b0M7337 = C0078.m7337(c0361f2M2528);
        if (dialogC0331b0M7337 != null) {
            ArrayList arrayListM4155 = C0039.m4155(c0361f2M2528);
            C0370g4 c0370g4 = (C0370g4) C0074.m6579(dialogC0331b0M7337);
            c0370g4.b = arrayListM4155;
            C0071.m6031(c0370g4);
            C0029.m2786(C0078.m7337(c0361f2M2528));
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0466w4
    public void d(ScriptProjectBean scriptProjectBean) {
        C0030.m2950(C0027.m2528(this), scriptProjectBean, new C0324a0(6, this));
    }
}
