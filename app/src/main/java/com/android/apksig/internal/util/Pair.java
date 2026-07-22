package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.kms.C0030;
import com.zfork.multiplatforms.android.bomb.C0077;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Pair<A, B> {
    public final Object a;
    public final Object b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pair.class != C0030.m2951(obj)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object objM7181 = C0077.m7181(pair);
        Object objM71812 = C0077.m7181(this);
        if (objM71812 == null) {
            if (objM7181 != null) {
                return false;
            }
        } else if (!C0023.m1865(objM71812, objM7181)) {
            return false;
        }
        Object objM13131 = C0111.m13131(pair);
        Object objM131312 = C0111.m13131(this);
        if (objM131312 == null) {
            if (objM13131 != null) {
                return false;
            }
        } else if (!C0023.m1865(objM131312, objM13131)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object objM7181 = C0077.m7181(this);
        int iM3818 = ((objM7181 == null ? 0 : C0037.m3818(objM7181)) + 31) * 31;
        Object objM13131 = C0111.m13131(this);
        return iM3818 + (objM13131 != null ? C0037.m3818(objM13131) : 0);
    }

    public static <A, B> Pair<A, B> of(A a, B b) {
        return new Pair<>(a, b);
    }

    public A getFirst() {
        return (A) C0077.m7181(this);
    }

    public B getSecond() {
        return (B) C0111.m13131(this);
    }

    public Pair(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
