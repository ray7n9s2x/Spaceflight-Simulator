package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Collectors {
    static final Set a;

    /* JADX INFO: renamed from: ۦۧ۠ۢ, reason: contains not printable characters */
    public static Set m9373() {
        if (C0098.m10857() < 0) {
            return a;
        }
        return null;
    }

    static {
        EnumC0554h enumC0554hM10993 = C0100.m10993();
        EnumC0554h enumC0554hM9177 = C0095.m9177();
        EnumC0554h enumC0554hM8617 = C0090.m8617();
        C0087.m8448(C0092.m8776(enumC0554hM10993, enumC0554hM9177, enumC0554hM8617));
        C0087.m8448(C0104.m11211(enumC0554hM10993, enumC0554hM9177));
        a = C0087.m8448(C0087.m8453(enumC0554hM8617));
        C0087.m8448(C0104.m11211(enumC0554hM9177, enumC0554hM8617));
        C0092.m8785();
        C0087.m8448(C0087.m8453(enumC0554hM9177));
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0574l(new C0569k(19), new C0569k(20), new C0569k(0), m9373());
    }

    static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
