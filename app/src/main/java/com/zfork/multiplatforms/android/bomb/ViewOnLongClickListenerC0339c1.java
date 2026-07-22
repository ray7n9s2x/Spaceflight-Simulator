package com.zfork.multiplatforms.android.bomb;

import android.content.Intent;
import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.connectdevice.bean.C0064;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.MetaSelectAppAbility;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0339c1 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f307short = {1115, 1108, 1118, 1096, 1109, 1107, 1118, 1044, 1107, 1108, 1102, 1119, 1108, 1102, 1044, 1115, 1113, 1102, 1107, 1109, 1108, 1044, 1141, 1130, 1151, 1140, 1125, 1150, 1141, 1145, 1135, 1143, 1151, 1140, 1134, 1125, 1134, 1128, 1151, 1151, 1479, 1499, 1490, 1487, 1494, 1427, 1502, 1490, 1488, 1506, 1494, 1496, 1476, 1519, 1496, 1486, 1506, 1486, 1476, 1486, 1481, 1496, 1488, 1506, 1500, 1485, 1485};
    public final /* synthetic */ int a;
    public final /* synthetic */ ConsumerAbility b;

    public /* synthetic */ ViewOnLongClickListenerC0339c1(ConsumerAbility consumerAbility, int i) {
        this.a = i;
        this.b = consumerAbility;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7035() {
        if (C0039.m4109() >= 0) {
            return f307short;
        }
        return null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ConsumerAbility consumerAbilityM4049 = C0038.m4049(this);
        switch (C0064.m4602(this)) {
            case 0:
                C0023.m1832();
                C0030.m2951(consumerAbilityM4049);
                C0016.m651(consumerAbilityM4049, C0033.m3269(new Intent(consumerAbilityM4049, (Class<?>) MetaSelectAppAbility.class), C0018.m1070(m7035(), 40, 27, 1469), true), 9913);
                break;
            default:
                C0023.m1832();
                C0030.m2951(consumerAbilityM4049);
                C0029.m2760(consumerAbilityM4049, C0032.m3209(m7035(), 0, 40, 1082), 9914, null);
                break;
        }
        return true;
    }
}
