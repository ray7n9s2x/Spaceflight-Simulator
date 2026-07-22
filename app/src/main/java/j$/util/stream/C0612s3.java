package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0612s3 implements InterfaceC0592o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ C0612s3(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    /* JADX INFO: renamed from: ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m10519(Object obj, long j) {
        if (C0099.m10878() <= 0) {
            ((W2) obj).accept(j);
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        switch (C0080.m7552(this)) {
            case 0:
                C0087.m8446();
                throw null;
            default:
                C0087.m8446();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        switch (C0080.m7552(this)) {
            case 0:
                C0089.m8569();
                throw null;
            default:
                C0089.m8569();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (C0080.m7552(this)) {
            case 0:
                m10519((W2) C0106.m11334(this), j);
                break;
            default:
                C0088.m8521(C0106.m11334(this), j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (C0080.m7552(this)) {
            case 0:
                C0095.m9221(this, obj);
                break;
            default:
                C0095.m9221(this, obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0080.m7552(this)) {
        }
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (C0080.m7552(this)) {
        }
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        switch (C0080.m7552(this)) {
            case 0:
                C0087.m8445(this, l);
                break;
            default:
                C0087.m8445(this, l);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
        C0080.m7552(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void l(long j) {
        C0080.m7552(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        switch (C0080.m7552(this)) {
        }
        return false;
    }
}
