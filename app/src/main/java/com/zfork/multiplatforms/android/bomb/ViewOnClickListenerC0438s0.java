package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.joke.plugin.gson.C0073;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC0438s0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC0438s0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0025.m2218(this)) {
            case 0:
                InterfaceC0477y3 interfaceC0477y3M6856 = C0075.m6856((C0444t0) C0026.m2255(this));
                if (interfaceC0477y3M6856 != null) {
                    C0111.m13070(interfaceC0477y3M6856, C0021.m1548(1));
                }
                break;
            default:
                C0073.m6305((W1) C0026.m2255(this));
                break;
        }
    }
}
