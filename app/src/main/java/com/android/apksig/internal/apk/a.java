package com.android.apksig.internal.apk;

import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.util.RunnablesProvider;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements RunnablesProvider {
    public final /* synthetic */ ApkSigningBlockUtils.ChunkSupplier a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ a(ApkSigningBlockUtils.ChunkSupplier chunkSupplier, ArrayList arrayList) {
        this.a = chunkSupplier;
        this.b = arrayList;
    }

    @Override // com.android.apksig.util.RunnablesProvider
    public final Runnable createRunnable() {
        C0069.m5745();
        return new ApkSigningBlockUtils.ChunkDigester(C0064.m4500(this), C0073.m6426(this), null);
    }
}
