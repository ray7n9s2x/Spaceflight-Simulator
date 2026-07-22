package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class R2 extends U {
    public final /* synthetic */ C0387j2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(C0387j2 c0387j2, Y y) {
        super(y);
        this.b = c0387j2;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final AbstractC0441s3 b(String str, String str2) {
        AbstractC0441s3 abstractC0441s3B = super.b(str, str2);
        C0362f3 c0362f3 = (C0362f3) C0068.m5627(C0039.m4102(this));
        S2 s2 = new S2(abstractC0441s3B, C0069.m5757(c0362f3), false);
        s2.f = new ArrayList();
        s2.e = c0362f3;
        return s2;
    }
}
