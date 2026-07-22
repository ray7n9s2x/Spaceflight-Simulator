package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSupportedSignature;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.joke.plugin.gson.internal.reflect.C0069;
import java.util.Comparator;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0455v implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0455v(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (C0016.m634(this)) {
            case 0:
                C0069.m5796();
                return C0020.m1436(C0078.m7437(C0032.m3131((ApkSupportedSignature) obj)), C0078.m7437(C0032.m3131((ApkSupportedSignature) obj2)));
            default:
                return C0029.m2776((DefaultApkSignerEngine.SignerConfig) obj) - C0029.m2776((DefaultApkSignerEngine.SignerConfig) obj2);
        }
    }
}
