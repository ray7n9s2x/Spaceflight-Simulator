package com.android.apksig.kms;

import com.android.apksig.KeyConfig;
import com.android.apksig.SignerEngine;
import com.android.apksig.util.C0031;
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KmsSignerEngine implements SignerEngine {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f132short = {3132, 3072, 3073, 3099, 3144, 3083, 3079, 3084, 3085, 3144, 3096, 3081, 3100, 3072, 3144, 3099, 3072, 3079, 3101, 3076, 3084, 3144, 3078, 3085, 3102, 3085, 3098, 3144, 3082, 3085, 3144, 3085, 3088, 3085, 3083, 3101, 3100, 3085, 3084, 3144, 3073, 3086, 3144, 3089, 3079, 3101, 3144, 3081, 3098, 3085, 3144, 3101, 3099, 3073, 3078, 3087, 3144, 3081, 3144, 3107, 3109, 3131, 3142, 3144, 3144, 3113, 3098, 3085, 3144, 3089, 3079, 3101, 3144, 3101, 3099, 3073, 3078, 3087, 3144, 3100, 3072, 3085, 3144, 3098, 3073, 3087, 3072, 3100, 3144, 3084, 3085, 3096, 3085, 3078, 3084, 3085, 3078, 3083, 3089, 3144, 3136, 3081, 3096, 3075, 3099, 3073, 3087, 3141, 3075, 3077, 3099, 3137, 3159};
    public final String keyAlias;
    public final KmsType kmsType;

    /* JADX INFO: renamed from: ۤۤۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m2828() {
        if (C0031.m3075() >= 0) {
            return f132short;
        }
        return null;
    }

    @Override // com.android.apksig.SignerEngine
    public abstract byte[] sign(byte[] bArr);

    public static KmsSignerEngine fromKmsConfig(KeyConfig.Kms kms, String str) {
        throw new KmsException(C0111.m13083(kms), C0076.m6902(m2828(), 0, 113, 3176));
    }

    public KmsSignerEngine(KmsType kmsType, String str) {
        this.kmsType = kmsType;
        this.keyAlias = str;
    }
}
