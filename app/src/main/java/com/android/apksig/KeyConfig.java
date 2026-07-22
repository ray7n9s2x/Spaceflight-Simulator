package com.android.apksig;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.kms.KmsType;
import java.security.PrivateKey;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KeyConfig {

    /* JADX INFO: renamed from: com.android.apksig.KeyConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public abstract <T> T match(Function<Jca, T> function, Function<Kms, T> function2);

    public static class Jca extends KeyConfig {
        public final PrivateKey privateKey;

        public Jca(PrivateKey privateKey) {
            super(null);
            this.privateKey = privateKey;
        }

        @Override // com.android.apksig.KeyConfig
        public <T> T match(Function<Jca, T> function, Function<Kms, T> function2) {
            return (T) C0017.m895(function, this);
        }
    }

    public static class Kms extends KeyConfig {
        public final String keyAlias;
        public final KmsType kmsType;

        public Kms(KmsType kmsType, String str) {
            super(null);
            this.kmsType = kmsType;
            this.keyAlias = str;
        }

        @Override // com.android.apksig.KeyConfig
        public <T> T match(Function<Jca, T> function, Function<Kms, T> function2) {
            return (T) C0017.m895(function2, this);
        }
    }

    public KeyConfig(AnonymousClass1 anonymousClass1) {
    }
}
