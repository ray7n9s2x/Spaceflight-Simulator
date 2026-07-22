package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.oid.C0025;
import com.android.apksig.kms.C0030;
import com.joke.plugin.gson.internal.bind.C0068;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2 extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Supplier b;

    public /* synthetic */ C2(Supplier supplier, int i) {
        this.a = i;
        this.b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (C0068.m5666(this)) {
            case 0:
                C0030.m2951((B2) C0025.m2186(this));
                return new byte[8192];
            default:
                C0030.m2951((B2) C0025.m2186(this));
                return new char[8192];
        }
    }
}
