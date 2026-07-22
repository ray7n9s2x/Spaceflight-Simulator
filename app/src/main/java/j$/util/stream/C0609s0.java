package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0609s0 extends AbstractC0624v0 implements InterfaceC0587n2 {
    final /* synthetic */ EnumC0629w0 c;
    final /* synthetic */ IntPredicate d;

    /* JADX INFO: renamed from: ۣ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10501(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((EnumC0629w0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10502(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0624v0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10503(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((EnumC0629w0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10504(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((C0609s0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m10505(Object obj) {
        if (C0084.m8116() > 0) {
            return ((C0609s0) obj).d;
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0099.m10866(this, obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        C0084.m8112(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0609s0(EnumC0629w0 enumC0629w0, IntPredicate intPredicate) {
        super(enumC0629w0);
        this.c = enumC0629w0;
        this.d = intPredicate;
    }

    @Override // j$.util.stream.AbstractC0624v0, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        if (m10502(this)) {
            return;
        }
        boolean zM8224 = C0085.m8224(m10505(this), i);
        EnumC0629w0 enumC0629w0M10504 = m10504(this);
        if (zM8224 == m10503(enumC0629w0M10504)) {
            this.a = true;
            this.b = m10501(enumC0629w0M10504);
        }
    }
}
