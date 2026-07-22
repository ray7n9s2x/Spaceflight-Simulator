package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.temporal.C0085;
import j$.util.concurrent.C0093;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0548f3 {
    public static final EnumC0548f3 DOUBLE_VALUE;
    public static final EnumC0548f3 INT_VALUE;
    public static final EnumC0548f3 LONG_VALUE;
    public static final EnumC0548f3 REFERENCE;
    private static final /* synthetic */ EnumC0548f3[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f536short = {1273, 1262, 1261, 1262, 1273, 1262, 1253, 1256, 1262, 2696, 2703, 2709, 2718, 2711, 2688, 2701, 2708, 2692, 2038, 2037, 2036, 2045, 2021, 2028, 2043, 2038, 2031, 2047, 2931, 2936, 2914, 2933, 2939, 2930, 2920, 2913, 2934, 2939, 2914, 2930};

    public static EnumC0548f3 valueOf(String str) {
        return (EnumC0548f3) Enum.valueOf(EnumC0548f3.class, str);
    }

    public static EnumC0548f3[] values() {
        return (EnumC0548f3[]) a.clone();
    }

    static {
        EnumC0548f3 enumC0548f3 = new EnumC0548f3(C0097.m10853(f536short, 0, 9, 1195), 0);
        REFERENCE = enumC0548f3;
        EnumC0548f3 enumC0548f32 = new EnumC0548f3(C0080.m7573(f536short, 9, 9, 2753), 1);
        INT_VALUE = enumC0548f32;
        EnumC0548f3 enumC0548f33 = new EnumC0548f3(C0085.m8236(f536short, 18, 10, 1978), 2);
        LONG_VALUE = enumC0548f33;
        EnumC0548f3 enumC0548f34 = new EnumC0548f3(C0093.m9062(f536short, 28, 12, 2871), 3);
        DOUBLE_VALUE = enumC0548f34;
        a = new EnumC0548f3[]{enumC0548f3, enumC0548f32, enumC0548f33, enumC0548f34};
    }
}
