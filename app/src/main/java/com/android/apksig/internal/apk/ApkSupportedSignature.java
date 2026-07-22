package com.android.apksig.internal.apk;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSupportedSignature {
    public final SignatureAlgorithm algorithm;
    public final byte[] signature;

    public ApkSupportedSignature(SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this.algorithm = signatureAlgorithm;
        this.signature = bArr;
    }
}
