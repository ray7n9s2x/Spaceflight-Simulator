package com.android.apksig.apk;

import com.android.apksig.internal.oid.C0025;

/* JADX INFO: loaded from: classes3.dex */
public class CodenameMinSdkVersionException extends MinSdkVersionException {
    public final String a;

    public String getCodename() {
        return C0025.m2108(this);
    }

    public CodenameMinSdkVersionException(String str, String str2) {
        super(str);
        this.a = str2;
    }
}
