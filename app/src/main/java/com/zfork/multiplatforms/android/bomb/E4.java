package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SignatureCreatorAbility b;
    public final /* synthetic */ C0344d c;

    public /* synthetic */ E4(SignatureCreatorAbility signatureCreatorAbility, C0344d c0344d, int i) {
        this.a = i;
        this.b = signatureCreatorAbility;
        this.c = c0344d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0344d c0344dM7273 = C0077.m7273(this);
        SignatureCreatorAbility signatureCreatorAbilityM4562 = C0064.m4562(this);
        switch (C0075.m6814(this)) {
            case 0:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM4562);
                C0065.m4734(new Thread(new H4(signatureCreatorAbilityM4562, c0344dM7273, 1)));
                break;
            default:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM4562);
                C0065.m4734(new Thread(new H4(signatureCreatorAbilityM4562, c0344dM7273, 0)));
                break;
        }
    }
}
