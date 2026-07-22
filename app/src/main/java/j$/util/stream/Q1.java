package j$.util.stream;

import j$.time.C0089;
import j$.time.format.C0082;
import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes3.dex */
final class Q1 extends AbstractC0644z0 {
    final /* synthetic */ IntBinaryOperator h;
    final /* synthetic */ int i;

    /* JADX INFO: renamed from: ۟۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static int m9663(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((Q1) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۨۤ, reason: contains not printable characters */
    public static IntBinaryOperator m9664(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((Q1) obj).h;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        return new P1(m9663(this), m9664(this));
    }

    Q1(EnumC0548f3 enumC0548f3, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }
}
