package j$.util.stream;

import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.C0100;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0574l implements Collector {
    private final C0569k a;
    private final C0569k b;
    private final C0569k c;
    private final C0569k d;
    private final Set e;

    /* JADX INFO: renamed from: ۟ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static Set m10297(Object obj) {
        if (C0084.m8116() > 0) {
            return ((C0574l) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۨ, reason: not valid java name and contains not printable characters */
    public static C0569k m10298(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((C0574l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static Set m10299() {
        if (C0097.m10823() > 0) {
            return Collectors.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۦ, reason: not valid java name and contains not printable characters */
    public static C0569k m10300(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0574l) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۟۠, reason: not valid java name and contains not printable characters */
    public static C0569k m10301(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((C0574l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static C0569k m10302(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((C0574l) obj).d;
        }
        return null;
    }

    C0574l(C0569k c0569k, C0569k c0569k2, C0569k c0569k3, Set set) {
        m10299();
        C0569k c0569k4 = new C0569k(1);
        this.a = c0569k;
        this.b = c0569k2;
        this.c = c0569k3;
        this.d = c0569k4;
        this.e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return m10301(this);
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return m10300(this);
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return m10298(this);
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return m10302(this);
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return m10297(this);
    }
}
