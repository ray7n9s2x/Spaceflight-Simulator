package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0396l {
    public final Object a;

    public AbstractC0396l(q5 q5Var) {
        this.a = q5Var;
    }

    public abstract void b(AbstractC0396l abstractC0396l, N3 n3);

    public void a(AbstractC0396l abstractC0396l) throws z5 {
        N3 n3 = (N3) C0077.m7282(this);
        n3.a = 0L;
        n3.b = 0L;
        try {
            C0027.m2428(this, abstractC0396l, n3);
            C0030.m2951(n3);
        } catch (z5 e) {
            C0030.m2951(n3);
            throw e;
        } catch (Exception e2) {
            C0030.m2951(n3);
            throw new z5(e2);
        }
    }

    public AbstractC0396l(C0479z c0479z) {
        this.a = (N3) C0023.m1892(c0479z);
    }
}
