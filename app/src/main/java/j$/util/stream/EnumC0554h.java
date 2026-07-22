package j$.util.stream;

import j$.time.format.C0082;
import j$.util.function.C0095;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0554h {
    public static final EnumC0554h CONCURRENT;
    public static final EnumC0554h IDENTITY_FINISH;
    public static final EnumC0554h UNORDERED;
    private static final /* synthetic */ EnumC0554h[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f539short = {2705, 2717, 2716, 2705, 2695, 2688, 2688, 2711, 2716, 2694, 2674, 2665, 2664, 2677, 2659, 2658, 2677, 2658, 2659, 2704, 2717, 2716, 2711, 2701, 2704, 2701, 2688, 2694, 2719, 2704, 2711, 2704, 2698, 2705};

    public static EnumC0554h valueOf(String str) {
        return (EnumC0554h) Enum.valueOf(EnumC0554h.class, str);
    }

    public static EnumC0554h[] values() {
        return (EnumC0554h[]) a.clone();
    }

    static {
        EnumC0554h enumC0554h = new EnumC0554h(C0098.m10856(f539short, 0, 10, 2770), 0);
        CONCURRENT = enumC0554h;
        EnumC0554h enumC0554h2 = new EnumC0554h(C0095.m9204(f539short, 10, 9, 2599), 1);
        UNORDERED = enumC0554h2;
        EnumC0554h enumC0554h3 = new EnumC0554h(C0082.m7966(f539short, 19, 15, 2777), 2);
        IDENTITY_FINISH = enumC0554h3;
        a = new EnumC0554h[]{enumC0554h, enumC0554h2, enumC0554h3};
    }
}
