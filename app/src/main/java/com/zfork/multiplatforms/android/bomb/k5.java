package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.plugin.gson.internal.reflect.C0070;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k5 {
    public static final i5 a = new i5(1);

    public static int a(int i, String str) {
        if (str == null || C0070.m5838(C0031.m2993(), C0023.m1802(str))) {
            return i;
        }
        try {
            try {
                return C0039.m4116(str);
            } catch (NumberFormatException unused) {
                return C0028.m2552(C0030.m2897(str));
            }
        } catch (NumberFormatException unused2) {
            return i;
        }
    }
}
