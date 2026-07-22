package com.zfork.multiplatforms.android.bomb;

import android.content.Intent;
import android.view.View;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.MetaSelectAppAbility;
import com.zfork.entry.SignatureCreatorAbility;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0332b1 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f304short = {1783, 1784, 1778, 1764, 1785, 1791, 1778, 1720, 1791, 1784, 1762, 1779, 1784, 1762, 1720, 1783, 1781, 1762, 1791, 1785, 1784, 1720, 1753, 1734, 1747, 1752, 1737, 1746, 1753, 1749, 1731, 1755, 1747, 1752, 1730, 2788, 2795, 2785, 2807, 2794, 2796, 2785, 2731, 2796, 2795, 2801, 2784, 2795, 2801, 2731, 2788, 2790, 2801, 2796, 2794, 2795, 2731, 2762, 2773, 2752, 2763, 2778, 2753, 2762, 2758, 2768, 2760, 2752, 2763, 2769, 2778, 2769, 2775, 2752, 2752};
    public final /* synthetic */ int a;
    public final /* synthetic */ ConsumerAbility b;

    public /* synthetic */ ViewOnClickListenerC0332b1(ConsumerAbility consumerAbility, int i) {
        this.a = i;
        this.b = consumerAbility;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7030() {
        if (C0026.m2298() <= 0) {
            return f304short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strM6452 = C0074.m6452(m7030(), 0, 35, 1686);
        ConsumerAbility consumerAbilityM724 = C0016.m724(this);
        switch (C0036.m3725(this)) {
            case 0:
                C0023.m1832();
                C0030.m2951(consumerAbilityM724);
                C0016.m651(consumerAbilityM724, new Intent(consumerAbilityM724, (Class<?>) MetaSelectAppAbility.class), 9913);
                break;
            case 1:
                C0023.m1832();
                C0030.m2951(consumerAbilityM724);
                C0070.m5954(consumerAbilityM724, new Intent(consumerAbilityM724, (Class<?>) SignatureCreatorAbility.class));
                break;
            case 2:
                C0023.m1832();
                C0030.m2951(consumerAbilityM724);
                C0029.m2760(consumerAbilityM724, strM6452, 9909, null);
                break;
            case 3:
                C0023.m1832();
                C0030.m2951(consumerAbilityM724);
                C0029.m2760(consumerAbilityM724, strM6452, 9910, null);
                break;
            case 4:
                C0023.m1832();
                C0030.m2951(consumerAbilityM724);
                C0029.m2760(consumerAbilityM724, C0064.m4545(m7030(), 35, 40, 2693), 9915, null);
                break;
            default:
                C0023.m1832();
                C0030.m2951(consumerAbilityM724);
                C0029.m2760(consumerAbilityM724, strM6452, 9912, null);
                break;
        }
    }
}
