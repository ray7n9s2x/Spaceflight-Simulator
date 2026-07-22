package j$.util;

import j$.util.stream.Stream;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0502b {
    void forEach(Consumer consumer);

    Stream parallelStream();

    f0 spliterator();

    Stream stream();
}
