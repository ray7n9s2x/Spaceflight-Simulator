package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0345d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f310short = {1140, 1096, 1093, 1024, 1101, 1097, 1102, 1097, 1101, 1109, 1101, 1024, 1092, 1109, 1106, 1089, 1108, 1097, 1103, 1102, 1024, 1107, 1109, 1104, 1104, 1103, 1106, 1108, 1093, 1092, 1024, 1090, 1113, 1024, 1128, 1135, 1132, 1124, 1024, 1097, 1107, 1024, 1041, 1040, 1040, 1040};
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogC0359f0 b;

    public /* synthetic */ ViewOnClickListenerC0345d0(DialogC0359f0 dialogC0359f0, int i) {
        this.a = i;
        this.b = dialogC0359f0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7039() {
        if (C0023.m1921() > 0) {
            return f310short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0038.m3935(this)) {
            case 0:
                C0020.m1338(C0073.m6360(this));
                break;
            default:
                DialogC0359f0 dialogC0359f0M6360 = C0073.m6360(this);
                if (C0072.m6201(C0020.m1401(dialogC0359f0M6360)) >= 1000) {
                    C0450u0 c0450u0M3968 = C0038.m3968(dialogC0359f0M6360);
                    if (c0450u0M3968 != null) {
                        C0027.m2457(c0450u0M3968, C0021.m1548(C0072.m6201(C0020.m1401(dialogC0359f0M6360))));
                    }
                    C0020.m1338(dialogC0359f0M6360);
                } else {
                    C0030.m2968(C0023.m1884(C0073.m6435(dialogC0359f0M6360), C0021.m1650(m7039(), 0, 46, 1056), 0));
                }
                break;
        }
    }
}
