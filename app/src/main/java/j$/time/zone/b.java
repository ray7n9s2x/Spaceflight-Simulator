package j$.time.zone;

import com.android.apksig.internal.apk.AndroidBinXmlParser;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f467short = {1106, 1139, 1125, 1139, 1124, 1151, 1143, 1146, 1151, 1132, 1143, 1122, 1151, 1145, 1144, 1078, 1120, 1151, 1143, 1078, 1125, 1139, 1124, 1151, 1143, 1146, 1151, 1132, 1143, 1122, 1151, 1145, 1144, 1078, 1138, 1139, 1146, 1139, 1137, 1143, 1122, 1139, 1254, 1216, 1235, 1244, 1217, 1243, 1222, 1243, 1245, 1244, 1257, 1376, 1350, 1367, 918, 943, 956, 939, 949, 952, 937, 702, 767, 746, 702, 416, 500, 495, 416};
    private final long a;
    private final j$.time.j b;
    private final A c;
    private final A d;

    /* JADX INFO: renamed from: ۟۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static A m8391(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((b) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static A m8392(Object obj) {
        if (C0083.m8022() < 0) {
            return ((b) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8393(long j, Object obj) {
        if (C0093.m9101() >= 0) {
            a.c(j, (ObjectOutput) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8394(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            a.d((A) obj, (ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.j m8395(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static short[] m8396() {
        if (C0096.m10782() > 0) {
            return f467short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۨ, reason: not valid java name and contains not printable characters */
    public static long m8397(Object obj) {
        if (C0098.m10857() < 0) {
            return ((b) obj).a;
        }
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C0105.m11272(m8397(this), m8397((b) obj));
    }

    b(j$.time.j jVar, A a, A a2) {
        C0092.m8727(jVar);
        this.a = C0103.m11133(jVar, a);
        this.b = jVar;
        this.c = a;
        this.d = a2;
    }

    b(long j, A a, A a2) {
        this.a = j;
        this.b = C0102.m11100(j, 0, a);
        this.c = a;
        this.d = a2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0099.m10897(m8396(), 0, 42, 1046));
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        m8393(m8397(this), objectOutput);
        m8394(m8391(this), objectOutput);
        m8394(m8392(this), objectOutput);
    }

    public final long B() {
        return m8397(this);
    }

    public final j$.time.j k() {
        return m8395(this);
    }

    public final A s() {
        return m8391(this);
    }

    public final A n() {
        return m8392(this);
    }

    public final j$.time.j j() {
        return C0100.m11002(m8395(this), C0088.m8527(m8392(this)) - C0088.m8527(m8391(this)));
    }

    public final j$.time.e m() {
        return C0104.m11184(C0088.m8527(m8392(this)) - C0088.m8527(m8391(this)));
    }

    public final boolean w() {
        return C0088.m8527(m8392(this)) > C0088.m8527(m8391(this));
    }

    final List v() {
        return C0097.m10809(this) ? C0089.m8583() : C0087.m8472(new Object[]{m8391(this), m8392(this)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m8397(this) == m8397(bVar) && C0097.m10807(m8391(this), m8391(bVar)) && C0097.m10807(m8392(this), m8392(bVar));
    }

    public final int hashCode() {
        return (C0103.m11124(m8395(this)) ^ C0080.m7536(m8391(this))) ^ C0086.m8310(C0080.m7536(m8392(this)), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0095.m9204(m8396(), 42, 11, 1202));
        C0101.m11052(sb, C0097.m10809(this) ? C0092.m8731(m8396(), 53, 3, 1319) : C0102.m11094(m8396(), 56, 7, 985));
        C0101.m11052(sb, C0093.m9062(m8396(), 63, 4, 670));
        C0082.m7988(sb, m8395(this));
        C0082.m7988(sb, m8391(this));
        C0101.m11052(sb, C0084.m8120(m8396(), 67, 4, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP));
        C0082.m7988(sb, m8392(this));
        C0089.m8573(sb, ']');
        return C0099.m10924(sb);
    }
}
