package com.android.apksig.internal.asn1;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.jar.C0024;
import com.joke.plugin.gson.internal.bind.C0068;
import com.zfork.entry.C0075;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Asn1TagClass {
    public static final Asn1TagClass APPLICATION;
    public static final Asn1TagClass AUTOMATIC;
    public static final Asn1TagClass CONTEXT_SPECIFIC;
    public static final Asn1TagClass PRIVATE;
    public static final Asn1TagClass UNIVERSAL;
    public static final /* synthetic */ Asn1TagClass[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f87short = {2531, 2552, 2559, 2528, 2547, 2532, 2533, 2551, 2554, 2593, 2608, 2608, 2604, 2601, 2595, 2593, 2612, 2601, 2607, 2606, 1418, 1414, 1415, 1437, 1420, 1425, 1437, 1430, 1434, 1433, 1420, 1418, 1408, 1423, 1408, 1418, 2812, 2814, 2789, 2810, 2797, 2808, 2793, 1756, 1736, 1737, 1746, 1744, 1756, 1737, 1748, 1758};

    static {
        Asn1TagClass asn1TagClass = new Asn1TagClass(C0024.m1945(f87short, 0, 9, 2486), 0);
        UNIVERSAL = asn1TagClass;
        Asn1TagClass asn1TagClass2 = new Asn1TagClass(C0068.m5544(f87short, 9, 11, 2656), 1);
        APPLICATION = asn1TagClass2;
        Asn1TagClass asn1TagClass3 = new Asn1TagClass(C0075.m6791(f87short, 20, 16, 1481), 2);
        CONTEXT_SPECIFIC = asn1TagClass3;
        Asn1TagClass asn1TagClass4 = new Asn1TagClass(C0068.m5544(f87short, 36, 7, 2732), 3);
        PRIVATE = asn1TagClass4;
        Asn1TagClass asn1TagClass5 = new Asn1TagClass(C0019.m1189(f87short, 43, 9, 1693), 4);
        AUTOMATIC = asn1TagClass5;
        a = new Asn1TagClass[]{asn1TagClass, asn1TagClass2, asn1TagClass3, asn1TagClass4, asn1TagClass5};
    }

    public static Asn1TagClass valueOf(String str) {
        return (Asn1TagClass) Enum.valueOf(Asn1TagClass.class, str);
    }

    public static Asn1TagClass[] values() {
        return (Asn1TagClass[]) a.clone();
    }
}
