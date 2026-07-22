package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0593o3 implements InterfaceC0582m2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ C0593o3(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۧ, reason: not valid java name and contains not printable characters */
    public static void m10411(Object obj, double d) {
        if (C0080.m7553() >= 0) {
            ((S2) obj).accept(d);
        }
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        switch (C0083.m8069(this)) {
            case 0:
                m10411((S2) C0084.m8107(this), d);
                break;
            default:
                C0090.m8634(C0084.m8107(this), d);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        switch (C0083.m8069(this)) {
            case 0:
                C0089.m8569();
                throw null;
            default:
                C0089.m8569();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (C0083.m8069(this)) {
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
        switch (C0083.m8069(this)) {
            case 0:
                C0105.m11261(this, obj);
                break;
            default:
                C0105.m11261(this, obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0083.m8069(this)) {
        }
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (C0083.m8069(this)) {
        }
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
        C0083.m8069(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void l(long j) {
        C0083.m8069(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        switch (C0083.m8069(this)) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        switch (C0083.m8069(this)) {
            case 0:
                C0083.m8041(this, d);
                break;
            default:
                C0083.m8041(this, d);
                break;
        }
    }
}
