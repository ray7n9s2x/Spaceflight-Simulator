package com.android.apksig;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0033;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class JcaSignerEngine implements SignerEngine {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f32short = {747, 753, 767, 758, 761, 748, 749, 746, 765, 729, 756, 767, 759, 746, 753, 748, 752, 757, 696, 763, 761, 758, 758, 759, 748, 696, 762, 765, 696, 758, 749, 756, 756, 2913, 2915, 2936, 2919, 2928, 2917, 2932, 2906, 2932, 2920, 2865, 2930, 2928, 2943, 2943, 2942, 2917, 2865, 2931, 2932, 2865, 2943, 2916, 2941, 2941};
    public final PrivateKey a;
    public final String b;
    public final AlgorithmParameterSpec c;

    /* JADX INFO: renamed from: ۨۦۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m588() {
        if (C0019.m1311() <= 0) {
            return f32short;
        }
        return null;
    }

    @Override // com.android.apksig.SignerEngine
    public byte[] sign(byte[] bArr) throws SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        Signature signatureM2131 = C0025.m2131(C0021.m1629(this));
        C0039.m4147(signatureM2131, C0111.m13124(this));
        AlgorithmParameterSpec algorithmParameterSpecM4354 = C0063.m4354(this);
        if (algorithmParameterSpecM4354 != null) {
            C0070.m5856(signatureM2131, algorithmParameterSpecM4354);
        }
        C0027.m2440(signatureM2131, bArr);
        return C0020.m1409(signatureM2131);
    }

    public JcaSignerEngine(PrivateKey privateKey, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        if (privateKey != null) {
            if (str != null) {
                this.a = privateKey;
                this.b = str;
                this.c = algorithmParameterSpec;
                return;
            }
            throw new IllegalArgumentException(C0063.m4315(m588(), 0, 33, 664));
        }
        throw new IllegalArgumentException(C0033.m3330(m588(), 33, 25, 2833));
    }
}
