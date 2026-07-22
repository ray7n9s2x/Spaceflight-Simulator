package com.android.apksig.internal.asn1;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Asn1Tagging {
    public static final Asn1Tagging EXPLICIT;
    public static final Asn1Tagging IMPLICIT;
    public static final Asn1Tagging NORMAL;
    public static final /* synthetic */ Asn1Tagging[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f88short = {2675, 2674, 2671, 2672, 2684, 2673, 2863, 2866, 2874, 2854, 2851, 2857, 2851, 2878, 2800, 2804, 2793, 2805, 2800, 2810, 2800, 2797};

    static {
        Asn1Tagging asn1Tagging = new Asn1Tagging(C0038.m4022(f88short, 0, 6, 2621), 0);
        NORMAL = asn1Tagging;
        Asn1Tagging asn1Tagging2 = new Asn1Tagging(C0018.m1070(f88short, 6, 8, 2922), 1);
        EXPLICIT = asn1Tagging2;
        Asn1Tagging asn1Tagging3 = new Asn1Tagging(C0023.m1904(f88short, 14, 8, 2745), 2);
        IMPLICIT = asn1Tagging3;
        a = new Asn1Tagging[]{asn1Tagging, asn1Tagging2, asn1Tagging3};
    }

    public static Asn1Tagging valueOf(String str) {
        return (Asn1Tagging) Enum.valueOf(Asn1Tagging.class, str);
    }

    public static Asn1Tagging[] values() {
        return (Asn1Tagging[]) a.clone();
    }
}
