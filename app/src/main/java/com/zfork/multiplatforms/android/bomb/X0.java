package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.DataSource;
import com.joke.plugin.gson.reflect.C0072;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X0 implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ X0(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (C0037.m3914(this)) {
            case 0:
                return C0072.m6146((DataSource) obj);
            default:
                return C0029.m2798((C0371g5) obj);
        }
    }
}
