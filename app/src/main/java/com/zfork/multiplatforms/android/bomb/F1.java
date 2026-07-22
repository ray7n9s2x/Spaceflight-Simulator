package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.pkcs7.C0026;
import com.joke.connectdevice.bean.C0065;
import j$.time.Instant;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F1 {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: ۣ۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static Instant m6924() {
        if (C0077.m7272() < 0) {
            return Instant.EPOCH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m6925(Object obj) {
        if (C0026.m2298() < 0) {
            C0065.m4698(AbstractC0343c5.m7037((Instant) obj));
        }
    }

    static {
        m6925(m6924());
        C0038.m3928(C0038.m4008(), 1L);
        C0038.m3928(C0111.m13080(), 1L);
    }
}
