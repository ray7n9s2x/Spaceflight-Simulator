package j$.util.concurrent;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.Map;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
class l implements Map.Entry {
    final int a;
    final Object b;
    volatile Object c;
    volatile l d;

    /* JADX INFO: renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static l m8954(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((l) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m8955(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m8956(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static String m8957(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return t.a(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m8958(Object obj) {
        if (C0104.m11196() > 0) {
            return ((l) obj).c;
        }
        return null;
    }

    l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    l(int i, Object obj, Object obj2, l lVar) {
        this(i, obj, obj2);
        this.d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return m8955(this);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return m8958(this);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return C0090.m8618(m8955(this)) ^ C0090.m8618(m8958(this));
    }

    public final String toString() {
        return m8957(m8955(this), m8958(this));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object objM10870;
        Object objM10785;
        Object objM8955;
        Object objM8958;
        return (obj instanceof Map.Entry) && (objM10870 = C0099.m10870((entry = (Map.Entry) obj))) != null && (objM10785 = C0096.m10785(entry)) != null && (objM10870 == (objM8955 = m8955(this)) || C0085.m8250(objM10870, objM8955)) && (objM10785 == (objM8958 = m8958(this)) || C0085.m8250(objM10785, objM8958));
    }

    l a(int i, Object obj) {
        Object objM8955;
        if (obj == null) {
            return null;
        }
        l lVarM8954 = this;
        do {
            if (m8956(lVarM8954) == i && ((objM8955 = m8955(lVarM8954)) == obj || (objM8955 != null && C0085.m8250(obj, objM8955)))) {
                return lVarM8954;
            }
            lVarM8954 = m8954(lVarM8954);
        } while (lVarM8954 != null);
        return null;
    }
}
