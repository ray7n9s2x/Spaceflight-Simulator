package j$.util.stream;

import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.function.C0094;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0604r0 extends AbstractC0624v0 {
    final /* synthetic */ EnumC0629w0 c;
    final /* synthetic */ Predicate d;

    /* JADX INFO: renamed from: ۟۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10456(Object obj) {
        if (C0081.m7818() < 0) {
            return ((EnumC0629w0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10457(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((EnumC0629w0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۤ, reason: contains not printable characters */
    public static boolean m10458(Object obj) {
        if (C0083.m8022() < 0) {
            return ((AbstractC0624v0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۢۧ, reason: contains not printable characters */
    public static Predicate m10459(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((C0604r0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10460(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((C0604r0) obj).c;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0604r0(EnumC0629w0 enumC0629w0, Predicate predicate) {
        super(enumC0629w0);
        this.c = enumC0629w0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (m10458(this)) {
            return;
        }
        boolean zM8320 = C0086.m8320(m10459(this), obj);
        EnumC0629w0 enumC0629w0M10460 = m10460(this);
        if (zM8320 == m10457(enumC0629w0M10460)) {
            this.a = true;
            this.b = m10456(enumC0629w0M10460);
        }
    }
}
