package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0588n3 implements j$.util.f0, Consumer {
    private static final Object d = new Object();
    private final j$.util.f0 a;
    private final ConcurrentHashMap b;
    private Object c;

    /* JADX INFO: renamed from: ۟۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m10385(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((C0588n3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m10386(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0588n3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m10387() {
        if (C0102.m11109() < 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10388(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0588n3) obj).a;
        }
        return null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    C0588n3(j$.util.f0 f0Var) {
        this(f0Var, new ConcurrentHashMap());
    }

    private C0588n3(j$.util.f0 f0Var, ConcurrentHashMap concurrentHashMap) {
        this.a = f0Var;
        this.b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c = obj;
    }

    final void b(Consumer consumer, Object obj) {
        if (C0095.m9227(m10385(this), obj != null ? obj : m10387(), C0087.m8480()) == null) {
            C0083.m8026(consumer, obj);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        while (C0081.m7848(m10388(this), this)) {
            Object objM10386 = m10386(this);
            if (objM10386 == null) {
                objM10386 = m10387();
            }
            if (C0095.m9227(m10385(this), objM10386, C0087.m8480()) == null) {
                C0083.m8026(consumer, m10386(this));
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0088.m8509(m10388(this), new C0600q0(2, this, consumer));
    }

    @Override // j$.util.f0
    public final j$.util.f0 trySplit() {
        j$.util.f0 f0VarM7517 = C0079.m7517(m10388(this));
        if (f0VarM7517 != null) {
            return new C0588n3(f0VarM7517, m10385(this));
        }
        return null;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return C0082.m7979(m10388(this));
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return (C0080.m7579(m10388(this)) & (-16469)) | 1;
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        return C0097.m10819(m10388(this));
    }
}
