package j$.time;

import j$.time.format.C0084;
import j$.util.C0101;
import j$.util.function.C0095;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.function.C0105;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0500d implements j$.time.temporal.o, j$.time.temporal.p {
    public static final EnumC0500d FRIDAY;
    public static final EnumC0500d MONDAY;
    public static final EnumC0500d SATURDAY;
    public static final EnumC0500d SUNDAY;
    public static final EnumC0500d THURSDAY;
    public static final EnumC0500d TUESDAY;
    public static final EnumC0500d WEDNESDAY;
    private static final EnumC0500d[] a;
    private static final /* synthetic */ EnumC0500d[] b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f417short = {3039, 3037, 3036, 3030, 3027, 3019, 501, 500, 484, 498, 485, 480, 504, 683, 697, 696, 690, 697, 687, 696, 701, 677, 3014, 3034, 3015, 3008, 3009, 3030, 3027, 3019, 510, 490, 497, 508, 505, 481, 660, 646, 659, 658, 661, 643, 646, 670, 1228, 1226, 1233, 1243, 1246, 1222, 2212, 2179, 2203, 2188, 2177, 2180, 2185, 2253, 2203, 2188, 2177, 2200, 2184, 2253, 2187, 2178, 2207, 2253, 2217, 2188, 2196, 2210, 2187, 2234, 2184, 2184, 2182, 2263, 2253, 1997, 2038, 2027, 2029, 2024, 2024, 2039, 2026, 2028, 2045, 2044, 1976, 2046, 2033, 2045, 2036, 2044, 1954, 1976};

    public static EnumC0500d valueOf(String str) {
        return (EnumC0500d) Enum.valueOf(EnumC0500d.class, str);
    }

    public static EnumC0500d[] values() {
        return (EnumC0500d[]) b.clone();
    }

    static {
        EnumC0500d enumC0500d = new EnumC0500d(C0095.m9204(f417short, 0, 6, 2962), 0);
        MONDAY = enumC0500d;
        EnumC0500d enumC0500d2 = new EnumC0500d(C0084.m8120(f417short, 6, 7, 417), 1);
        TUESDAY = enumC0500d2;
        EnumC0500d enumC0500d3 = new EnumC0500d(C0101.m11060(f417short, 13, 9, 764), 2);
        WEDNESDAY = enumC0500d3;
        EnumC0500d enumC0500d4 = new EnumC0500d(C0091.m8679(f417short, 22, 8, 2962), 3);
        THURSDAY = enumC0500d4;
        EnumC0500d enumC0500d5 = new EnumC0500d(C0098.m10856(f417short, 30, 6, 440), 4);
        FRIDAY = enumC0500d5;
        EnumC0500d enumC0500d6 = new EnumC0500d(C0104.m11206(f417short, 36, 8, 711), 5);
        SATURDAY = enumC0500d6;
        EnumC0500d enumC0500d7 = new EnumC0500d(C0084.m8120(f417short, 44, 6, 1183), 6);
        SUNDAY = enumC0500d7;
        b = new EnumC0500d[]{enumC0500d, enumC0500d2, enumC0500d3, enumC0500d4, enumC0500d5, enumC0500d6, enumC0500d7};
        a = values();
    }

    public static EnumC0500d C(int i) {
        if (i < 1 || i > 7) {
            throw new DateTimeException(C0099.m10897(f417short, 50, 29, 2285) + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.DAY_OF_WEEK : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return rVar.j();
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(AbstractC0487c.a(C0105.m11310(f417short, 79, 19, 1944), rVar));
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.DAYS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
