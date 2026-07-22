package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.zip.C0029;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.hawk.cheat.C0076;
import j$.util.Objects;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0398l1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f342short = {636, 629, 573, 633, 575, 560, 565, 572, 554, 629, 633, 636, 629, 573, 633, 573, 560, 555, 572, 570, 557, 566, 555, 560, 572, 554, 629, 633, 636, 629, 573, 633, 571, 544, 557, 572, 554};
    public final C0392k1 a;
    public final C0392k1 b;
    public final C0392k1 c;

    /* JADX INFO: renamed from: ۟ۥۦ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7087(Object obj) {
        if (C0072.m6216() > 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7088() {
        if (C0038.m4010() > 0) {
            return f342short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7089(Object obj, Object obj2) {
        if (C0029.m2791() >= 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0398l1)) {
            return false;
        }
        C0398l1 c0398l1 = (C0398l1) obj;
        return m7089(C0078.m7310(this), C0078.m7310(c0398l1)) && m7089(C0072.m6153(this), C0072.m6153(c0398l1)) && m7089(C0069.m5820(this), C0069.m5820(c0398l1));
    }

    public C0398l1() {
        C0392k1 c0392k1 = new C0392k1();
        C0392k1 c0392k12 = new C0392k1();
        C0392k1 c0392k13 = new C0392k1();
        this.a = c0392k1;
        this.b = c0392k12;
        this.c = c0392k13;
    }

    public final int hashCode() {
        return m7087(new Object[]{C0078.m7310(this), C0072.m6153(this), C0069.m5820(this)});
    }

    public final String toString() {
        return C0021.m1531(C0076.m6902(m7088(), 0, 37, 601), new Object[]{C0070.m5853(C0064.m4561(C0069.m5820(this))), C0070.m5853(C0064.m4561(C0072.m6153(this))), C0070.m5853(C0064.m4561(C0078.m7310(this)))});
    }
}
