package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.stamp.C0017;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.entry.C0075;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends AbstractC0441s3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f279short = {3109, 3114, 3110, 3118};
    public final /* synthetic */ int b = 0;

    public /* synthetic */ S() {
    }

    /* JADX INFO: renamed from: ۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m7002() {
        if (C0075.m6893() > 0) {
            return f279short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public AbstractC0441s3 b(String str, String str2) {
        switch (C0037.m3854(this)) {
            case 0:
                return this;
            default:
                return super.b(str, str2);
        }
    }

    public /* synthetic */ S(AbstractC0441s3 abstractC0441s3) {
        super(abstractC0441s3);
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public void a(String str, String str2, int i, int i2, Object obj) {
        switch (C0037.m3854(this)) {
            case 1:
                if (C0070.m5838(C0017.m936(m7002(), 0, 4, 3147), str2)) {
                    boolean z = obj instanceof String;
                }
                super.a(str, str2, i, i2, obj);
                break;
            default:
                super.a(str, str2, i, i2, obj);
                break;
        }
    }
}
