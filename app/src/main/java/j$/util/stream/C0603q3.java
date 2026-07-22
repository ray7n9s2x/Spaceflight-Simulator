package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0603q3 implements InterfaceC0587n2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C0603q3(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m10455(Object obj, int i) {
        if (C0100.m10983() > 0) {
            ((U2) obj).accept(i);
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        switch (C0106.m11352(this)) {
            case 0:
                C0087.m8446();
                throw null;
            default:
                C0087.m8446();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        switch (C0106.m11352(this)) {
            case 0:
                m10455((U2) C0079.m7491(this), i);
                break;
            default:
                C0105.m11259(C0079.m7491(this), i);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (C0106.m11352(this)) {
            case 0:
                C0092.m8759();
                throw null;
            default:
                C0092.m8759();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (C0106.m11352(this)) {
            case 0:
                C0099.m10866(this, obj);
                break;
            default:
                C0099.m10866(this, obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0106.m11352(this)) {
        }
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (C0106.m11352(this)) {
        }
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
        C0106.m11352(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void l(long j) {
        C0106.m11352(this);
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        switch (C0106.m11352(this)) {
            case 0:
                C0084.m8112(this, num);
                break;
            default:
                C0084.m8112(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        switch (C0106.m11352(this)) {
        }
        return false;
    }
}
