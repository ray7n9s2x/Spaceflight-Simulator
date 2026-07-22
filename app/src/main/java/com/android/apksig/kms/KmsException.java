package com.android.apksig.kms;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.jar.C0023;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;

/* JADX INFO: loaded from: classes3.dex */
public class KmsException extends RuntimeException {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f131short = {3000, 3006, 2976, 3027, 2405, 2353, 2349, 2359, 2336, 2354, 2405, 2336, 2365, 2342, 2336, 2357, 2353, 2348, 2346, 2347, 2431, 2405};
    public final KmsType a;

    public KmsException(KmsType kmsType, String str) {
        super(str);
        this.a = kmsType;
    }

    /* JADX INFO: renamed from: ۥۥۡۡ, reason: contains not printable characters */
    public static short[] m2827() {
        if (C0019.m1311() >= 0) {
            return f131short;
        }
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(C0068.m5544(m2827(), 0, 4, 3059));
        C0077.m7290(sb, C0074.m6524(C0023.m1857(this)));
        C0077.m7290(sb, C0023.m1904(m2827(), 4, 18, 2373));
        C0077.m7290(sb, super.getMessage());
        return C0068.m5536(sb);
    }

    public KmsException(KmsType kmsType, String str, Throwable th) {
        super(str, th);
        this.a = kmsType;
    }

    public KmsException(KmsType kmsType, Throwable th) {
        super(th);
        this.a = kmsType;
    }
}
