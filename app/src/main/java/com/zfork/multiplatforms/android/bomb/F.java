package com.zfork.multiplatforms.android.bomb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0035;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F {
    static {
        new ArrayList();
    }

    public static Drawable a(String str) {
        return C0021.m1589(C0024.m2031(), str);
    }

    public static Drawable b(String str) {
        return C0035.m3605(C0024.m2031(), str);
    }

    public static View c(String str) {
        return C0028.m2582(C0024.m2031(), str);
    }
}
