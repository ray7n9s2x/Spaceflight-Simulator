package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class M1 extends AbstractC0644z0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    /* JADX INFO: renamed from: ۟ۡ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static BiConsumer m9568(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((M1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9569() {
        if (C0096.m10782() > 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Collector m9570(Object obj) {
        if (C0080.m7553() > 0) {
            return ((M1) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟۟, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m9571(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((M1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Supplier m9572(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((M1) obj).j;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        return new N1(m9572(this), m9568(this), m9571(this));
    }

    @Override // j$.util.stream.AbstractC0644z0, j$.util.stream.K3
    public final int d() {
        if (C0085.m8225(C0100.m11010(m9570(this)), C0095.m9177())) {
            return m9569();
        }
        return 0;
    }

    M1(EnumC0548f3 enumC0548f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
