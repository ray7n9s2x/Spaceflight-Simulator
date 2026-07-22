package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F4 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f243short = {427, 420, 430, 440, 421, 419, 430, 484, 419, 420, 446, 431, 420, 446, 484, 427, 425, 446, 419, 421, 420, 484, 389, 410, 399, 388, 405, 398, 389, 393, 415, 391, 399, 388, 414, 2082, 2145, 2151, 2175, 1473, 1486, 1476, 1490, 1487, 1481, 1476, 1422, 1481, 1486, 1492, 1477, 1486, 1492, 1422, 1473, 1475, 1492, 1481, 1487, 1486, 1422, 1507, 1522, 1509, 1505, 1524, 1509, 1535, 1508, 1519, 1507, 1525, 1517, 1509, 1518, 1524};
    public final /* synthetic */ int a;
    public final /* synthetic */ SignatureCreatorAbility b;

    public /* synthetic */ F4(SignatureCreatorAbility signatureCreatorAbility, int i) {
        this.a = i;
        this.b = signatureCreatorAbility;
    }

    /* JADX INFO: renamed from: ۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6928() {
        if (C0111.m13165() <= 0) {
            return f243short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SignatureCreatorAbility signatureCreatorAbilityM3842 = C0037.m3842(this);
        switch (C0075.m6885(this)) {
            case 0:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM3842);
                StringBuilder sb = new StringBuilder();
                C0078.m7466(sb, C0074.m6518());
                C0077.m7290(sb, C0031.m3047(m6928(), 35, 4, 2060));
                C0029.m2760(signatureCreatorAbilityM3842, C0019.m1189(m6928(), 39, 37, 1440), 313, C0068.m5536(sb));
                break;
            default:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM3842);
                C0029.m2760(signatureCreatorAbilityM3842, C0032.m3209(m6928(), 0, 35, 458), 314, null);
                break;
        }
    }
}
