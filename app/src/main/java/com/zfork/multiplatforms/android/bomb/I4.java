package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.zfork.entry.SignatureCreatorAbility;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I4 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f254short = {2605, 2569, 2580, 2571, 2582, 2576, 2628, 2560, 2565, 2576, 2565, 2628, 2583, 2577, 2567, 2567, 2561, 2583, 2583, 2634, 802, 797, 776, 799, 780, 793, 772, 770, 771, 845, 798, 792, 782, 782, 776, 798, 798, 835};
    public final /* synthetic */ int a;
    public final /* synthetic */ SignatureCreatorAbility b;

    public /* synthetic */ I4(SignatureCreatorAbility signatureCreatorAbility, int i) {
        this.a = i;
        this.b = signatureCreatorAbility;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m6943() {
        if (C0019.m1311() >= 0) {
            return f254short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignatureCreatorAbility signatureCreatorAbilityM2557 = C0028.m2557(this);
        switch (C0020.m1380(this)) {
            case 0:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM2557);
                C0030.m2968(C0023.m1884(signatureCreatorAbilityM2557, C0039.m4066(m6943(), 20, 18, 877), 0));
                break;
            default:
                C0031.m3055();
                C0030.m2951(signatureCreatorAbilityM2557);
                C0030.m2968(C0023.m1884(signatureCreatorAbilityM2557, C0038.m4022(m6943(), 0, 20, 2660), 0));
                break;
        }
    }
}
