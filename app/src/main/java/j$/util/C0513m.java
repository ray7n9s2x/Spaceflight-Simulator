package j$.util;

import j$.time.format.C0083;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0513m implements Consumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C0513m(Consumer consumer) {
        this.a = consumer;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C0083.m8026(C0103.m11138(this), new C0514n((Map.Entry) obj));
    }
}
