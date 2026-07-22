package j$.util.stream;

import j$.time.zone.C0087;
import java.io.C0103;
import java.util.function.LongBinaryOperator;

/* JADX INFO: loaded from: classes3.dex */
final class B1 extends AbstractC0644z0 {
    final /* synthetic */ LongBinaryOperator h;
    final /* synthetic */ long i;

    /* JADX INFO: renamed from: ۢۧۢ۟, reason: not valid java name and contains not printable characters */
    public static long m9361(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((B1) obj).i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۤ, reason: contains not printable characters */
    public static LongBinaryOperator m9362(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((B1) obj).h;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        return new T1(m9361(this), m9362(this));
    }

    B1(EnumC0548f3 enumC0548f3, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }
}
