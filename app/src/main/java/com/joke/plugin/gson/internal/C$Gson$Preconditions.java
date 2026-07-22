package com.joke.plugin.gson.internal;

import com.android.apksig.kms.C0030;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C$Gson$Preconditions {
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static <T> T checkNotNull(T t) {
        C0030.m2951(t);
        return t;
    }
}
