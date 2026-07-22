package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.hawk.cheat.C0076;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f262short = {1229, 3057, 516, 522, 534, 528, 540, 543, 522, 522, 523, 528, 513, 538, 514, 522, 541, 532, 539, 517, 530, 541, 553, 535, 515, 514, 537, 553, 533, 537, 536, 528, 543, 529};
    public final /* synthetic */ M0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ double c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ L0(M0 m0, Context context, double d, boolean z) {
        this.a = m0;
        this.b = context;
        this.c = d;
        this.d = z;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6958() {
        if (C0028.m2593() >= 0) {
            return f262short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0030.m2951(C0039.m4108(this));
        float fM1613 = (float) C0021.m1613(this);
        String strM3232 = C0032.m3232(C0072.m6116(m6958(), 2, 15, 591), C0039.m4156(this) ? C0019.m1189(m6958(), 0, 1, 1276) : C0076.m6902(m6958(), 1, 1, 3011));
        Context contextM7360 = C0078.m7360(this);
        if (contextM7360 == null || C0038.m3939(strM3232)) {
            return;
        }
        SharedPreferences.Editor editorM2261 = C0026.m2261(C0029.m2737(contextM7360, C0017.m936(m6958(), 17, 17, 630), 0));
        C0025.m2107(editorM2261, strM3232, fM1613);
        C0072.m6210(editorM2261);
    }
}
