package j$.util.concurrent;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.C0102;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class k implements Map.Entry {
    final Object a;
    Object b;
    final ConcurrentHashMap c;

    /* JADX INFO: renamed from: ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8949(Object obj) {
        if (C0083.m8022() < 0) {
            return ((k) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m8950(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0102.m11109() < 0) {
            return ((ConcurrentHashMap) obj).f(obj2, obj3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static String m8951(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            return t.a(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟ۤ, reason: contains not printable characters */
    public static Object m8952(Object obj) {
        if (C0084.m8116() > 0) {
            return ((k) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static Object m8953(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((k) obj).a;
        }
        return null;
    }

    k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.a = obj;
        this.b = obj2;
        this.c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return m8953(this);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return m8952(this);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return C0090.m8618(m8953(this)) ^ C0090.m8618(m8952(this));
    }

    public final String toString() {
        return m8951(m8953(this), m8952(this));
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object objM10870;
        Object objM10785;
        Object objM8953;
        Object objM8952;
        return (obj instanceof Map.Entry) && (objM10870 = C0099.m10870((entry = (Map.Entry) obj))) != null && (objM10785 = C0096.m10785(entry)) != null && (objM10870 == (objM8953 = m8953(this)) || C0085.m8250(objM10870, objM8953)) && (objM10785 == (objM8952 = m8952(this)) || C0085.m8250(objM10785, objM8952));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0092.m8727(obj);
        Object objM8952 = m8952(this);
        this.b = obj;
        m8950(m8949(this), m8953(this), obj, false);
        return objM8952;
    }
}
