package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0458v2 extends IOException implements Iterable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f371short = {3111, 3118, 3174, 3106, 3175, 3194, 3169, 3175, 3186, 3190, 3179, 3181, 3180, 3114, 3185, 3115, 3128, 3106, 3111, 3185};
    public final List a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0458v2(String str, List list) {
        List list2 = list;
        String strM1531 = str;
        if (strM1531 == null) {
            strM1531 = C0021.m1531(C0031.m3047(m7132(), 0, 20, 3074), new Object[]{C0021.m1548(list2 != null ? C0034.m3427(list2) : 0), list2});
        }
        super(strM1531, (list2 != null ? C0034.m3427(list2) : 0) == 0 ? null : (Throwable) C0071.m6078(list2, 0));
        this.a = list2 == null ? C0037.m3866() : list2;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7132() {
        if (C0035.m3569() < 0) {
            return f371short;
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0039.m4154(new ArrayList(C0019.m1291(this)));
    }
}
