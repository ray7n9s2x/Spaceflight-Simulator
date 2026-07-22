package com.zfork.multiplatforms.android.bomb;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0381i2 extends RelativeLayout {
    public ImageView a;
    public TextView b;
    public TextView c;
    public C0370g4 d;
    public InterfaceC0375h2 e;
    public DialogC0448t4 f;
    public LinearLayout g;
    public PopupWindow h;

    public int getSize() {
        C0370g4 c0370g4M1983 = C0024.m1983(this);
        if (c0370g4M1983 != null) {
            return C0034.m3427(C0025.m2173(c0370g4M1983));
        }
        return 0;
    }

    public void setBgDrawable(Drawable drawable) {
        LinearLayout linearLayoutM657 = C0016.m657(this);
        if (linearLayoutM657 != null) {
            C0039.m4187(linearLayoutM657, drawable);
        }
    }

    public void setListener(InterfaceC0375h2 interfaceC0375h2) {
        this.e = interfaceC0375h2;
    }

    public final void a() {
        List listM5730 = C0069.m5730(C0022.m1755(this));
        if (C0034.m3427(listM5730) == 0) {
            TextView textViewM4648 = C0065.m4648(this);
            if (textViewM4648 != null) {
                C0063.m4382(textViewM4648, 0);
            }
        } else {
            TextView textViewM46482 = C0065.m4648(this);
            if (textViewM46482 != null) {
                C0063.m4382(textViewM46482, 8);
            }
        }
        C0370g4 c0370g4M1983 = C0024.m1983(this);
        c0370g4M1983.b = listM5730;
        C0071.m6031(c0370g4M1983);
    }
}
