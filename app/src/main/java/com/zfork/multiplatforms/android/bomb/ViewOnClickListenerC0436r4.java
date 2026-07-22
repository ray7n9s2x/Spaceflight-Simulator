package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0436r4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogC0448t4 b;

    public /* synthetic */ ViewOnClickListenerC0436r4(DialogC0448t4 dialogC0448t4, int i) {
        this.a = i;
        this.b = dialogC0448t4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0064.m4625(this)) {
            case 0:
                DialogC0448t4 dialogC0448t4M13170 = C0111.m13170(this);
                C0408n c0408nM2650 = C0028.m2650(dialogC0448t4M13170);
                if (c0408nM2650 != null) {
                    C0065.m4760(c0408nM2650, C0070.m5858(dialogC0448t4M13170), C0074.m6525(dialogC0448t4M13170));
                }
                C0020.m1338(dialogC0448t4M13170);
                break;
            case 1:
                DialogC0448t4 dialogC0448t4M131702 = C0111.m13170(this);
                C0072.m6111(dialogC0448t4M131702);
                DialogC0472x4 dialogC0472x4M3602 = C0035.m3602(dialogC0448t4M131702);
                if (dialogC0472x4M3602 != null) {
                    C0034.m3489(dialogC0472x4M3602, C0074.m6525(dialogC0448t4M131702), false);
                    C0029.m2786(C0035.m3602(dialogC0448t4M131702));
                }
                break;
            default:
                DialogC0448t4 dialogC0448t4M131703 = C0111.m13170(this);
                C0408n c0408nM26502 = C0028.m2650(dialogC0448t4M131703);
                if (c0408nM26502 != null) {
                    C0065.m4760(c0408nM26502, C0070.m5858(dialogC0448t4M131703), C0074.m6525(dialogC0448t4M131703));
                }
                C0020.m1338(dialogC0448t4M131703);
                break;
        }
    }
}
