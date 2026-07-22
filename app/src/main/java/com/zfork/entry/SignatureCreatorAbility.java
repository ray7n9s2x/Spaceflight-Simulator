package com.zfork.entry;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0344d;
import com.zfork.multiplatforms.android.bomb.E4;
import com.zfork.multiplatforms.android.bomb.F4;
import com.zfork.multiplatforms.android.bomb.G4;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class SignatureCreatorAbility extends Activity {
    public static final /* synthetic */ int b = 0;
    public C0344d a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        try {
            C0344d c0344dM13136 = C0111.m13136(C0018.m965(this));
            this.a = c0344dM13136;
            C0065.m4703(this, C0074.m6447(c0344dM13136));
            C0065.m4727(C0078.m7316(c0344dM13136), new E4(this, c0344dM13136, 0));
            String strM5451 = C0067.m5451();
            String strM2144 = C0025.m2144();
            C0019.m1180(C0035.m3580(c0344dM13136), strM5451);
            C0019.m1180(C0023.m1900(c0344dM13136), strM2144);
            C0065.m4727(C0075.m6868(c0344dM13136), new E4(this, c0344dM13136, 1));
            C0065.m4727(C0070.m5918(c0344dM13136), new F4(this, 0));
            C0065.m4727(C0023.m1845(c0344dM13136), new F4(this, 1));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uriM13115;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null || (uriM13115 = C0111.m13115(intent)) == null) {
            return;
        }
        C0065.m4734(new Thread(new G4(this, i, uriM13115)));
    }
}
