package j$.time;

import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.util.C0101;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0485a extends AbstractC0486b implements Serializable {
    static final C0485a b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f393short = {1959, 1933, 1927, 1920, 1937, 1945, 1975, 1944, 1947, 1943, 1951, 1967, 1180};
    private final A a;

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m7622() {
        if (C0101.m11044() <= 0) {
            return f393short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۢ, reason: not valid java name and contains not printable characters */
    public static A m7623(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((C0485a) obj).a;
        }
        return null;
    }

    static {
        C0089.m8596();
        b = new C0485a(C0103.m11137());
    }

    C0485a(A a) {
        this.a = a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0485a)) {
            return false;
        }
        return C0097.m10807(m7623(this), m7623((C0485a) obj));
    }

    public final int hashCode() {
        return C0080.m7536(m7623(this)) + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0081.m7837(m7622(), 0, 12, 2036));
        C0082.m7988(sb, m7623(this));
        C0101.m11052(sb, C0098.m10856(m7622(), 12, 1, 1217));
        return C0099.m10924(sb);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        C0080.m7587(objectInputStream);
    }
}
