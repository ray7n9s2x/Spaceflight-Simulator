package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.zip.C0029;
import com.joke.script.bean.C0074;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class S4 {
    public static final S4 a;
    public static final S4 b;
    public static final /* synthetic */ S4[] c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f281short = {1359, 1374, 491, 506, 484, 494, 1020, 1014};

    /* JADX INFO: Fake field, exist only in values array */
    S4 EF3;

    static {
        S4 s4 = new S4(C0074.m6452(f281short, 0, 2, 1292), 0);
        S4 s42 = new S4(C0029.m2695(f281short, 2, 4, 424), 1);
        a = s42;
        S4 s43 = new S4(C0038.m4022(f281short, 6, 2, 944), 2);
        b = s43;
        c = new S4[]{s4, s42, s43};
    }

    public static S4 valueOf(String str) {
        return (S4) Enum.valueOf(S4.class, str);
    }

    public static S4[] values() {
        return (S4[]) c.clone();
    }
}
