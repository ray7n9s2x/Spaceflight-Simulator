package j$.util.concurrent;

import j$.util.function.C0095;
import java.io.C0104;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class h extends a implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(lVarArr, i, i2, concurrentHashMap);
        this.k = i3;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static l m8923(Object obj) {
        if (C0104.m11196() > 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m8924(Object obj) {
        if (C0105.m11264() > 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8925(Object obj) {
        if (C0095.m9210() > 0) {
            return ((h) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m8926(Object obj) {
        if (C0104.m11196() > 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۤ, reason: not valid java name and contains not printable characters */
    public static l m8927(Object obj) {
        if (C0093.m9101() > 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m8928(Object obj) {
        if (C0106.m11345() < 0) {
            return ((h) obj).next();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (m8925(this)) {
            case 0:
                l lVarM8927 = m8927(this);
                if (lVarM8927 == null) {
                    throw new NoSuchElementException();
                }
                this.j = lVarM8927;
                m8923(this);
                return m8926(lVarM8927);
            default:
                l lVarM89272 = m8927(this);
                if (lVarM89272 == null) {
                    throw new NoSuchElementException();
                }
                Object objM8924 = m8924(lVarM89272);
                this.j = lVarM89272;
                m8923(this);
                return objM8924;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (m8925(this)) {
        }
        return m8928(this);
    }
}
