package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.reflect.C0071;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0441s3 {
    public final AbstractC0441s3 a;

    public void a(String str, String str2, int i, int i2, Object obj) {
        AbstractC0441s3 abstractC0441s3M4335 = C0063.m4335(this);
        if (abstractC0441s3M4335 != null) {
            C0026.m2252(abstractC0441s3M4335, str, str2, i, i2, obj);
        }
    }

    public AbstractC0441s3 b(String str, String str2) {
        AbstractC0441s3 abstractC0441s3M4335 = C0063.m4335(this);
        if (abstractC0441s3M4335 != null) {
            return C0029.m2819(abstractC0441s3M4335, str, str2);
        }
        return null;
    }

    public void c() {
        AbstractC0441s3 abstractC0441s3M4335 = C0063.m4335(this);
        if (abstractC0441s3M4335 != null) {
            C0039.m4171(abstractC0441s3M4335);
        }
    }

    public void d(int i) {
        AbstractC0441s3 abstractC0441s3M4335 = C0063.m4335(this);
        if (abstractC0441s3M4335 != null) {
            C0071.m5968(abstractC0441s3M4335, i);
        }
    }

    public void e(int i, String str) {
        AbstractC0441s3 abstractC0441s3M4335 = C0063.m4335(this);
        if (abstractC0441s3M4335 != null) {
            C0029.m2814(abstractC0441s3M4335, i, str);
        }
    }

    public AbstractC0441s3(AbstractC0441s3 abstractC0441s3) {
        this.a = abstractC0441s3;
    }
}
