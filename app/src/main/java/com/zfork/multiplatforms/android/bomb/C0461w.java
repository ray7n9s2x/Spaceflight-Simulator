package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.internal.bind.util.C0067;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0461w implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0461w(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (C0028.m2630(this)) {
            case 0:
                C0035.m3549();
                return C0035.m3615((ApkSigningBlockUtils.Result.SignerInfo) obj);
            case 1:
                return C0023.m1916((ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute) obj);
            case 2:
                C0078.m7393();
                return C0067.m5469((ApkSigningBlockUtils.SignerConfig) obj);
            case 3:
                C0078.m7393();
                return C0067.m5469((ApkSigningBlockUtils.SignerConfig) obj);
            case 4:
                return ((byte[]) obj).length;
            default:
                return C0023.m1916((ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute) obj);
        }
    }
}
