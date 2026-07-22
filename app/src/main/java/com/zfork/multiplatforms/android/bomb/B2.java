package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B2 implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ B2(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (C0018.m1081(this)) {
            case 0:
                byte[] bArrM7425 = C0078.m7425();
                C0025.m2213(bArrM7425, (byte) 0);
                return bArrM7425;
            case 1:
                C0071.m6050();
                return new byte[8192];
            case 2:
                return new byte[8192];
            default:
                return new char[8192];
        }
    }
}
