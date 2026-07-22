package com.android.apksig;

import com.android.apksig.zip.C0036;
import com.zfork.multiplatforms.android.bomb.J4;
import com.zfork.multiplatforms.android.bomb.K4;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class SignerEngineFactory {
    public static SignerEngine getImplementation(KeyConfig keyConfig, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return (SignerEngine) C0036.m3647(keyConfig, new J4(str, algorithmParameterSpec), new K4(str));
    }
}
