package j$.util.concurrent;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.format.C0083;
import j$.util.stream.C0096;
import j$.util.stream.C0097;

/* JADX INFO: loaded from: classes3.dex */
abstract class a extends p {
    final ConcurrentHashMap i;
    l j;

    /* JADX INFO: renamed from: ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static l m8878(Object obj) {
        if (C0091.m8708() > 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static l m8879(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((a) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۡ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8880(Object obj) {
        if (C0083.m8022() < 0) {
            return ((a) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۟ۤ, reason: contains not printable characters */
    public static Object m8881(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0089.m8594() <= 0) {
            return ((ConcurrentHashMap) obj).g(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m8882(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤ۟, reason: not valid java name and contains not printable characters */
    public static l m8883(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((p) obj).a();
        }
        return null;
    }

    a(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        m8883(this);
    }

    public final boolean hasNext() {
        return m8878(this) != null;
    }

    public final boolean hasMoreElements() {
        return m8878(this) != null;
    }

    public final void remove() {
        l lVarM8879 = m8879(this);
        if (lVarM8879 == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        m8881(m8880(this), m8882(lVarM8879), null, null);
    }
}
