package com.android.apksig.kms;

import com.android.apksig.internal.oid.C0025;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KmsType {
    public static final KmsType AWS;
    public static final KmsType GCP;
    public static final /* synthetic */ KmsType[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f133short = {2310, 2320, 2324, 2929, 2933, 2918};

    static {
        KmsType kmsType = new KmsType(C0025.m2151(f133short, 0, 3, 2375), 0);
        AWS = kmsType;
        KmsType kmsType2 = new KmsType(C0066.m4828(f133short, 3, 3, 2870), 1);
        GCP = kmsType2;
        a = new KmsType[]{kmsType, kmsType2};
    }

    public static KmsType valueOf(String str) {
        return (KmsType) Enum.valueOf(KmsType.class, str);
    }

    public static KmsType[] values() {
        return (KmsType[]) a.clone();
    }
}
