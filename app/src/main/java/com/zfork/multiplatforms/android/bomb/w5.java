package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.zip.C0032;
import com.joke.script.bean.C0074;
import j$.util.stream.Stream;
import java.nio.charset.Charset;
import java.util.function.Predicate;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w5 {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: ۦۣۣۢ, reason: contains not printable characters */
    public static boolean m7134(Object obj, Object obj2) {
        if (C0026.m2298() < 0) {
            return ((Stream) obj).anyMatch((Predicate) obj2);
        }
        return false;
    }

    static {
        Charset charsetM1069 = C0018.m1069();
        C0039.m4060();
        if (charsetM1069 == null) {
            C0022.m1684();
        }
        if (charsetM1069 == null) {
            charsetM1069 = C0022.m1684();
        }
        if (charsetM1069 == null) {
            charsetM1069 = C0022.m1684();
        }
        C0111.m13073(C0078.m7357(charsetM1069));
    }

    public static boolean a(String str) {
        Charset charsetM1069 = C0018.m1069();
        return C0025.m2111(C0078.m7357(charsetM1069), str) || m7134(C0074.m6565(C0032.m3178(charsetM1069)), new L4(1, str));
    }
}
