package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0019;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import j$.util.Objects;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0392k1 {
    public long a;

    /* JADX INFO: renamed from: ۠ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7086(Object obj) {
        if (C0072.m6216() >= 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0392k1) && C0064.m4561(this) == C0064.m4561((C0392k1) obj);
    }

    public final int hashCode() {
        return m7086(new Object[]{C0070.m5853(C0064.m4561(this))});
    }

    public final String toString() {
        return C0019.m1223(C0064.m4561(this));
    }
}
