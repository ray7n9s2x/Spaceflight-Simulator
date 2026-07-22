package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.util.C0028;
import com.joke.connectdevice.bean.C0064;
import java.util.Enumeration;
import java.util.ResourceBundle;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0328a4 extends ResourceBundle {
    public final ResourceBundle a;

    @Override // java.util.ResourceBundle
    public final Enumeration getKeys() {
        return new Z3();
    }

    @Override // java.util.ResourceBundle
    public final Object handleGetObject(String str) {
        ResourceBundle resourceBundleM2588 = C0028.m2588(this);
        return C0064.m4583(resourceBundleM2588, str) ? C0039.m4180(resourceBundleM2588, str) : str;
    }

    public C0328a4(ResourceBundle resourceBundle) {
        this.a = resourceBundle;
    }
}
