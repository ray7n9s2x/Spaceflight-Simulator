package j$.util;

import j$.time.C0092;
import j$.time.temporal.C0085;

/* JADX INFO: loaded from: classes3.dex */
public final class Objects {
    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && C0085.m8250(obj, obj2));
    }

    public static int hash(Object... objArr) {
        return C0102.m11113(objArr);
    }

    public static String toString(Object obj) {
        return C0092.m8763(obj);
    }

    public static <T> T requireNonNull(T t) {
        C0092.m8727(t);
        return t;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
