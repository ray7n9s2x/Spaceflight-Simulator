package com.zfork.multiplatforms.android.bomb;

import android.content.DialogInterface;
import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.zfork.entry.ConsumerAbility;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0374h1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f328short = {1540, 1540, 1540, 1629, 1605, 1601, 1541, 1629, 1565, 1558, 1543, 1448, 1427, 1433, 1432, 1435, 1428, 1427, 1432, 1433, 1501, 1493, 1486, 1465, 1501, 1466, 1436, 1424, 1432, 1501, 1458, 1427, 1432, 1492, 1914, 1878, 1882, 1878, 1866, 1817, 1909, 1868, 1880, 2586, 2593, 2598, 2619, 2614, 2684, 2571};
    public final /* synthetic */ ConsumerAbility a;
    public final /* synthetic */ C0351e b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0374h1(ConsumerAbility consumerAbility, C0351e c0351e) {
        this.a = consumerAbility;
        this.b = c0351e;
    }

    /* JADX INFO: renamed from: ۦۤۦۨ, reason: contains not printable characters */
    public static short[] m7069() {
        if (C0018.m1064() >= 0) {
            return f328short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0351e c0351eM4687 = C0065.m4687(this);
        C0035.m3556(this).c = i;
        try {
            C0019.m1180(C0019.m1281(c0351eM4687), i != 0 ? i != 1 ? i != 2 ? C0111.m13097(m7069(), 0, 11, 1651) : C0035.m3603(m7069(), 11, 23, 1533) : C0063.m4315(m7069(), 34, 9, 1849) : C0021.m1650(m7069(), 43, 7, 2639));
            C0037.m3836(dialogInterface);
        } catch (Exception unused) {
        }
    }
}
