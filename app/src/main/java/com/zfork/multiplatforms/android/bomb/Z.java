package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.util.C0031;
import com.joke.connectdevice.bean.C0064;
import com.joke.script.bean.C0074;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogC0331b0 b;

    public /* synthetic */ Z(DialogC0331b0 dialogC0331b0, int i) {
        this.a = i;
        this.b = dialogC0331b0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0064.m4518(this)) {
            case 0:
                DialogC0331b0 dialogC0331b0M3007 = C0031.m3007(this);
                C0450u0 c0450u0 = (C0450u0) C0074.m6579(dialogC0331b0M3007);
                if (c0450u0 != null) {
                    C0027.m2457(c0450u0, C0021.m1548(0));
                    C0020.m1338(dialogC0331b0M3007);
                }
                break;
            case 1:
                DialogC0331b0 dialogC0331b0M30072 = C0031.m3007(this);
                C0450u0 c0450u02 = (C0450u0) C0074.m6579(dialogC0331b0M30072);
                if (c0450u02 != null) {
                    C0027.m2457(c0450u02, C0021.m1548(1));
                    C0020.m1338(dialogC0331b0M30072);
                }
                break;
            case 2:
                DialogC0331b0 dialogC0331b0M30073 = C0031.m3007(this);
                C0450u0 c0450u03 = (C0450u0) C0074.m6579(dialogC0331b0M30073);
                if (c0450u03 != null) {
                    C0027.m2457(c0450u03, C0021.m1548(2));
                    C0020.m1338(dialogC0331b0M30073);
                }
                break;
            case 3:
                DialogC0331b0 dialogC0331b0M30074 = C0031.m3007(this);
                C0450u0 c0450u04 = (C0450u0) C0074.m6579(dialogC0331b0M30074);
                if (c0450u04 != null) {
                    C0027.m2457(c0450u04, C0021.m1548(3));
                    C0020.m1338(dialogC0331b0M30074);
                }
                break;
            default:
                DialogC0331b0 dialogC0331b0M30075 = C0031.m3007(this);
                C0450u0 c0450u05 = (C0450u0) C0074.m6579(dialogC0331b0M30075);
                if (c0450u05 != null) {
                    C0027.m2457(c0450u05, C0021.m1548(-1));
                    C0020.m1338(dialogC0331b0M30075);
                }
                break;
        }
    }
}
