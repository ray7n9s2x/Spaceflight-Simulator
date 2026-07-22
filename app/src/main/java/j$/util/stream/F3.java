package j$.util.stream;

import j$.time.C0089;
import java.util.function.C0105;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class F3 {
    public static final F3 MAYBE_MORE;
    public static final F3 NO_MORE;
    public static final F3 UNLIMITED;
    private static final /* synthetic */ F3[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f507short = {657, 656, 640, 658, 656, 653, 666, 3302, 3306, 3314, 3305, 3310, 3316, 3302, 3300, 3321, 3310, 2941, 2918, 2916, 2913, 2917, 2913, 2940, 2925, 2924};

    static {
        F3 f3 = new F3(C0105.m11310(f507short, 0, 7, 735), 0);
        NO_MORE = f3;
        F3 f32 = new F3(C0089.m8581(f507short, 7, 10, 3243), 1);
        MAYBE_MORE = f32;
        F3 f33 = new F3(C0099.m10897(f507short, 17, 9, 2856), 2);
        UNLIMITED = f33;
        a = new F3[]{f3, f32, f33};
    }

    public static F3 valueOf(String str) {
        return (F3) Enum.valueOf(F3.class, str);
    }

    public static F3[] values() {
        return (F3[]) a.clone();
    }
}
