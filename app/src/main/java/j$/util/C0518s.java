package j$.util;

import j$.sun.misc.C0079;
import j$.time.format.C0083;
import j$.util.concurrent.C0093;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: j$.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C0518s extends C0510j implements Set {
    private static final long serialVersionUID = -9215047833775013803L;

    /* JADX INFO: renamed from: ۣ۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static Collection m9307(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0510j) obj).a;
        }
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || C0079.m7484(m9307(this), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C0083.m8057(m9307(this));
    }
}
