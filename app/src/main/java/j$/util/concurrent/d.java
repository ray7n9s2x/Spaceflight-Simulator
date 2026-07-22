package j$.util.concurrent;

import j$.time.C0091;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.io.C0104;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class d extends a implements Iterator {
    /* JADX INFO: renamed from: ۟ۤ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8891(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((a) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static l m8892(Object obj) {
        if (C0091.m8708() > 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m8893(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m8894(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static l m8895(Object obj) {
        if (C0102.m11109() < 0) {
            return ((p) obj).a();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        l lVarM8892 = m8892(this);
        if (lVarM8892 == null) {
            throw new NoSuchElementException();
        }
        Object objM8894 = m8894(lVarM8892);
        Object objM8893 = m8893(lVarM8892);
        this.j = lVarM8892;
        m8895(this);
        return new k(objM8894, objM8893, m8891(this));
    }
}
