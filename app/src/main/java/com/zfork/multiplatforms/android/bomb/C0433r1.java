package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0433r1 extends AbstractC0441s3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f356short = {266, 261, 265, 257, 758, 762, 760, 699, 751, 755, 762, 743, 766, 699, 742, 764, 754};
    public ArrayList b;
    public boolean c;

    /* JADX INFO: renamed from: ۟ۢۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7107() {
        if (C0039.m4109() > 0) {
            return f356short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void a(String str, String str2, int i, int i2, Object obj) {
        if (C0070.m5838(C0026.m2321(m7107(), 0, 4, 356), str2) && !C0111.m13101(this)) {
            Iterator itM4154 = C0039.m4154(C0111.m13176(this));
            while (true) {
                if (!C0036.m3657(itM4154)) {
                    break;
                }
                C0030.m2951((C0355e3) C0071.m6012(itM4154));
                if (C0070.m5838(C0070.m5942(m7107(), 4, 13, 661), obj)) {
                    this.c = true;
                    break;
                }
            }
        }
        if (C0111.m13101(this)) {
            return;
        }
        super.a(str, str2, i, i2, obj);
    }
}
