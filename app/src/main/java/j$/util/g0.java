package j$.util;

import j$.time.chrono.C0081;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.stream.C0099;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class g0 implements Iterator, Consumer {
    boolean a = false;
    Object b;
    final /* synthetic */ f0 c;

    /* JADX INFO: renamed from: ۟ۡۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m9228(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((g0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9229(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((g0) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static f0 m9230(Object obj) {
        if (C0093.m9101() > 0) {
            return ((g0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9231(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((g0) obj).hasNext();
        }
        return false;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    g0(f0 f0Var) {
        this.c = f0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = true;
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!m9229(this)) {
            C0081.m7848(m9230(this), this);
        }
        return m9229(this);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!m9229(this) && !m9231(this)) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return m9228(this);
    }
}
