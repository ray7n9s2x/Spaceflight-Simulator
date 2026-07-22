package j$.util.stream;

import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.util.C0101;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class EnumC0538d3 {
    public static final EnumC0538d3 OP;
    public static final EnumC0538d3 SPLITERATOR;
    public static final EnumC0538d3 STREAM;
    public static final EnumC0538d3 TERMINAL_OP;
    public static final EnumC0538d3 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ EnumC0538d3[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f534short = {3062, 3061, 3049, 3052, 3057, 3040, 3063, 3044, 3057, 3050, 3063, 281, 286, 280, 271, 267, 263, 2727, 2744, 447, 430, 441, 422, 418, 421, 426, 423, 436, 420, 443, 1184, 1189, 1190, 1185, 1191, 1200, 1204, 1208, 1194, 1185, 1200, 1191, 1208, 1212, 1211, 1204, 1209, 1194, 1210, 1189};

    public static EnumC0538d3 valueOf(String str) {
        return (EnumC0538d3) Enum.valueOf(EnumC0538d3.class, str);
    }

    public static EnumC0538d3[] values() {
        return (EnumC0538d3[]) a.clone();
    }

    static {
        EnumC0538d3 enumC0538d3 = new EnumC0538d3(C0083.m8037(f534short, 0, 11, 2981), 0);
        SPLITERATOR = enumC0538d3;
        EnumC0538d3 enumC0538d32 = new EnumC0538d3(C0096.m10776(f534short, 11, 6, 330), 1);
        STREAM = enumC0538d32;
        EnumC0538d3 enumC0538d33 = new EnumC0538d3(C0081.m7837(f534short, 17, 2, 2792), 2);
        OP = enumC0538d33;
        EnumC0538d3 enumC0538d34 = new EnumC0538d3(C0101.m11060(f534short, 19, 11, 491), 3);
        TERMINAL_OP = enumC0538d34;
        EnumC0538d3 enumC0538d35 = new EnumC0538d3(C0097.m10853(f534short, 30, 20, 1269), 4);
        UPSTREAM_TERMINAL_OP = enumC0538d35;
        a = new EnumC0538d3[]{enumC0538d3, enumC0538d32, enumC0538d33, enumC0538d34, enumC0538d35};
    }
}
