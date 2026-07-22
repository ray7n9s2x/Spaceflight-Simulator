package j$.util;

import j$.sun.misc.C0079;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class EnumC0507g implements Comparator, InterfaceC0506f {
    public static final EnumC0507g INSTANCE;
    private static final /* synthetic */ EnumC0507g[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f497short = {3297, 3302, 3323, 3324, 3305, 3302, 3307, 3309};

    public static EnumC0507g valueOf(String str) {
        return (EnumC0507g) Enum.valueOf(EnumC0507g.class, str);
    }

    public static EnumC0507g[] values() {
        return (EnumC0507g[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC0507g enumC0507g = new EnumC0507g(C0079.m7503(f497short, 0, 8, 3240), 0);
        INSTANCE = enumC0507g;
        a = new EnumC0507g[]{enumC0507g};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C0504d(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        return AbstractC0505e.t(this, Comparator$CC.comparing(function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return AbstractC0505e.t(this, Comparator$CC.comparingLong(toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return AbstractC0505e.t(this, new C0504d(comparator, function, 1));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return AbstractC0505e.t(this, new C0503c(0, toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return AbstractC0505e.t(this, new C0503c(1, toDoubleFunction));
    }
}
