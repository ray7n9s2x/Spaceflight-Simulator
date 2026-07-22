package j$.time.zone;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.A;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.Instant;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final A[] b;
    private final long[] c;
    private final j$.time.j[] d;
    private final A[] e;
    private final e[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f470short = {3178, 3171, 3171, 3190, 3168, 3185, 1202, 1171, 1157, 1171, 1156, 1183, 1175, 1178, 1183, 1164, 1175, 1154, 1183, 1177, 1176, 1238, 1152, 1183, 1175, 1238, 1157, 1171, 1156, 1183, 1175, 1178, 1183, 1164, 1175, 1154, 1183, 1177, 1176, 1238, 1170, 1171, 1178, 1171, 1169, 1175, 1154, 1171, 529, 1624, 1645, 1644, 1639, 1616, 1655, 1646, 1639, 1649, 1625, 1654, 1643, 1647, 1639, 1624, 1645, 1644, 1639, 1599, 1061, 1040, 1041, 1050, 1069, 1034, 1043, 1050, 1036, 1060, 1052, 1034, 1037, 1037, 1050, 1041, 1035, 1068, 1035, 1054, 1041, 1051, 1054, 1037, 1051, 1072, 1049, 1049, 1036, 1050, 1035, 1090};
    private static final long[] i = new long[0];
    private static final e[] j = new e[0];
    private static final j$.time.j[] k = new j$.time.j[0];
    private static final b[] l = new b[0];

    /* JADX INFO: renamed from: ۟۟ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8410() {
        if (C0102.m11109() < 0) {
            return f470short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static A m8411(int i2) {
        if (C0093.m9101() >= 0) {
            return i(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8412(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((f) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۥ, reason: not valid java name and contains not printable characters */
    public static j$.time.j[] m8413() {
        if (C0092.m8724() <= 0) {
            return k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۥ, reason: not valid java name and contains not printable characters */
    public static TimeZone m8414(Object obj) {
        if (C0098.m10857() < 0) {
            return ((f) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static j$.time.j[] m8415(Object obj) {
        if (C0103.m11154() < 0) {
            return ((f) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m8416(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            return a((j$.time.j) obj, (b) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m8417(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((f) obj).e((j$.time.j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static long[] m8418(Object obj) {
        if (C0102.m11109() < 0) {
            return ((f) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡ۠, reason: not valid java name and contains not printable characters */
    public static e[] m8419() {
        if (C0082.m7983() <= 0) {
            return j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static A m8420(Object obj) {
        if (C0097.m10823() >= 0) {
            return a.b((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧ۟, reason: not valid java name and contains not printable characters */
    public static long[] m8421(Object obj) {
        if (C0079.m7512() > 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static long m8422(Object obj) {
        if (C0106.m11345() < 0) {
            return a.a((ObjectInput) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8423(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            ((e) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static b[] m8424(Object obj, int i2) {
        if (C0104.m11196() >= 0) {
            return ((f) obj).b(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static A[] m8425(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((f) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static long[] m8426() {
        if (C0089.m8594() < 0) {
            return i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static e m8427(Object obj) {
        if (C0098.m10857() < 0) {
            return e.b((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static A[] m8428(Object obj) {
        if (C0083.m8022() < 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static b[] m8429() {
        if (C0085.m8230() > 0) {
            return l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static e[] m8430(Object obj) {
        if (C0103.m11154() < 0) {
            return ((f) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8431(long j2, Object obj) {
        if (C0082.m7983() <= 0) {
            return c(j2, (A) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۧ, reason: contains not printable characters */
    public static List m8432(Object obj) {
        if (C0095.m9210() > 0) {
            return ((b) obj).v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8433(long j2, Object obj) {
        if (C0101.m11044() < 0) {
            a.c(j2, (ObjectOutput) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8434(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            a.d((A) obj, (ObjectOutput) obj2);
        }
    }

    public final int hashCode() {
        TimeZone timeZoneM8414 = m8414(this);
        return (((((timeZoneM8414 != null ? C0090.m8618(timeZoneM8414) : 0) ^ C0092.m8741(m8421(this))) ^ C0102.m11113(m8428(this))) ^ C0092.m8741(m8418(this))) ^ C0102.m11113(m8425(this))) ^ C0102.m11113(m8430(this));
    }

    public static f h(A a) {
        C0079.m7494(a, C0101.m11060(m8410(), 0, 6, 3077));
        return new f(a);
    }

    private f(long[] jArr, A[] aArr, long[] jArr2, A[] aArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = aArr;
        this.c = jArr2;
        this.e = aArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = m8413();
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], aArr2[i2], aArr2[i3]);
                if (C0097.m10809(bVar)) {
                    C0099.m10918(arrayList, C0089.m8576(bVar));
                    C0099.m10918(arrayList, C0097.m10833(bVar));
                } else {
                    C0099.m10918(arrayList, C0097.m10833(bVar));
                    C0099.m10918(arrayList, C0089.m8576(bVar));
                }
                i2 = i3;
            }
            this.d = (j$.time.j[]) C0103.m11157(arrayList, new j$.time.j[C0101.m11061(arrayList)]);
        }
        this.g = null;
    }

    private f(A a) {
        A[] aArr = {a};
        this.b = aArr;
        long[] jArrM8426 = m8426();
        this.a = jArrM8426;
        this.c = jArrM8426;
        this.d = m8413();
        this.e = aArr;
        this.f = m8419();
        this.g = null;
    }

    f(TimeZone timeZone) {
        A[] aArr = {m8411(C0084.m8126(timeZone))};
        this.b = aArr;
        long[] jArrM8426 = m8426();
        this.a = jArrM8426;
        this.c = jArrM8426;
        this.d = m8413();
        this.e = aArr;
        this.f = m8419();
        this.g = timeZone;
    }

    private static A i(int i2) {
        return C0090.m8622(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0094.m9107(m8410(), 6, 42, 1270));
    }

    private Object writeReplace() {
        return new a(m8414(this) != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        long[] jArrM8421 = m8421(this);
        C0091.m8668(objectOutput, jArrM8421.length);
        for (long j2 : jArrM8421) {
            m8433(j2, objectOutput);
        }
        for (A a : m8428(this)) {
            m8434(a, objectOutput);
        }
        long[] jArrM8418 = m8418(this);
        C0091.m8668(objectOutput, jArrM8418.length);
        for (long j3 : jArrM8418) {
            m8433(j3, objectOutput);
        }
        for (A a2 : m8425(this)) {
            m8434(a2, objectOutput);
        }
        e[] eVarArrM8430 = m8430(this);
        C0092.m8730(objectOutput, eVarArrM8430.length);
        for (e eVar : eVarArrM8430) {
            m8423(eVar, objectOutput);
        }
    }

    final void k(ObjectOutput objectOutput) throws IOException {
        C0105.m11290(objectOutput, C0081.m7797(m8414(this)));
    }

    static f j(ObjectInput objectInput) {
        int iM8693 = C0091.m8693(objectInput);
        long[] jArrM8426 = m8426();
        long[] jArr = iM8693 == 0 ? jArrM8426 : new long[iM8693];
        for (int i2 = 0; i2 < iM8693; i2++) {
            jArr[i2] = m8422(objectInput);
        }
        int i3 = iM8693 + 1;
        A[] aArr = new A[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            aArr[i4] = m8420(objectInput);
        }
        int iM86932 = C0091.m8693(objectInput);
        if (iM86932 != 0) {
            jArrM8426 = new long[iM86932];
        }
        long[] jArr2 = jArrM8426;
        for (int i5 = 0; i5 < iM86932; i5++) {
            jArr2[i5] = m8422(objectInput);
        }
        int i6 = iM86932 + 1;
        A[] aArr2 = new A[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            aArr2[i7] = m8420(objectInput);
        }
        int iM11126 = C0103.m11126(objectInput);
        e[] eVarArrM8419 = iM11126 == 0 ? m8419() : new e[iM11126];
        for (int i8 = 0; i8 < iM11126; i8++) {
            eVarArrM8419[i8] = m8427(objectInput);
        }
        return new f(jArr, aArr, jArr2, aArr2, eVarArrM8419);
    }

    public final A d(Instant instant) {
        TimeZone timeZoneM8414 = m8414(this);
        if (timeZoneM8414 != null) {
            return m8411(C0102.m11107(timeZoneM8414, C0104.m11202(instant)));
        }
        long[] jArrM8418 = m8418(this);
        if (jArrM8418.length == 0) {
            return m8428(this)[0];
        }
        long jM8560 = C0088.m8560(instant);
        int length = m8430(this).length;
        A[] aArrM8425 = m8425(this);
        if (length > 0 && jM8560 > jArrM8418[jArrM8418.length - 1]) {
            b[] bVarArrM8424 = m8424(this, m8431(jM8560, aArrM8425[aArrM8425.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < bVarArrM8424.length; i2++) {
                bVar = bVarArrM8424[i2];
                if (jM8560 < C0093.m9070(bVar)) {
                    return C0106.m11313(bVar);
                }
            }
            return C0090.m8613(bVar);
        }
        int iM11119 = C0102.m11119(jArrM8418, jM8560);
        if (iM11119 < 0) {
            iM11119 = (-iM11119) - 2;
        }
        return aArrM8425[iM11119 + 1];
    }

    public final List g(j$.time.j jVar) {
        Object objM8417 = m8417(this, jVar);
        if (objM8417 instanceof b) {
            return m8432((b) objM8417);
        }
        return C0081.m7826((A) objM8417);
    }

    public final b f(j$.time.j jVar) {
        Object objM8417 = m8417(this, jVar);
        if (objM8417 instanceof b) {
            return (b) objM8417;
        }
        return null;
    }

    private Object e(j$.time.j jVar) {
        Object obj = null;
        A[] aArrM8428 = m8428(this);
        int i2 = 0;
        TimeZone timeZoneM8414 = m8414(this);
        if (timeZoneM8414 != null) {
            b[] bVarArrM8424 = m8424(this, C0100.m10999(jVar));
            if (bVarArrM8424.length == 0) {
                return m8411(C0102.m11107(timeZoneM8414, C0103.m11133(jVar, aArrM8428[0]) * 1000));
            }
            int length = bVarArrM8424.length;
            while (i2 < length) {
                b bVar = bVarArrM8424[i2];
                Object objM8416 = m8416(jVar, bVar);
                if ((objM8416 instanceof b) || C0085.m8250(objM8416, C0106.m11313(bVar))) {
                    return objM8416;
                }
                i2++;
                obj = objM8416;
            }
            return obj;
        }
        if (m8418(this).length == 0) {
            return aArrM8428[0];
        }
        int length2 = m8430(this).length;
        j$.time.j[] jVarArrM8415 = m8415(this);
        if (length2 > 0 && C0085.m8232(jVar, jVarArrM8415[jVarArrM8415.length - 1])) {
            b[] bVarArrM84242 = m8424(this, C0100.m10999(jVar));
            int length3 = bVarArrM84242.length;
            while (i2 < length3) {
                b bVar2 = bVarArrM84242[i2];
                Object objM84162 = m8416(jVar, bVar2);
                if ((objM84162 instanceof b) || C0085.m8250(objM84162, C0106.m11313(bVar2))) {
                    return objM84162;
                }
                i2++;
                obj = objM84162;
            }
            return obj;
        }
        int iM7482 = C0079.m7482(jVarArrM8415, jVar);
        A[] aArrM8425 = m8425(this);
        if (iM7482 == -1) {
            return aArrM8425[0];
        }
        if (iM7482 < 0) {
            iM7482 = (-iM7482) - 2;
        } else if (iM7482 < jVarArrM8415.length - 1) {
            int i3 = iM7482 + 1;
            if (C0096.m10758(jVarArrM8415[iM7482], jVarArrM8415[i3])) {
                iM7482 = i3;
            }
        }
        if ((iM7482 & 1) != 0) {
            return aArrM8425[(iM7482 / 2) + 1];
        }
        j$.time.j jVar2 = jVarArrM8415[iM7482];
        j$.time.j jVar3 = jVarArrM8415[iM7482 + 1];
        int i4 = iM7482 / 2;
        A a = aArrM8425[i4];
        A a2 = aArrM8425[i4 + 1];
        return C0088.m8527(a2) > C0088.m8527(a) ? new b(jVar2, a, a2) : new b(jVar3, a, a2);
    }

    private static Object a(j$.time.j jVar, b bVar) {
        j$.time.j jVarM8576 = C0089.m8576(bVar);
        if (C0097.m10809(bVar)) {
            if (C0097.m10854(jVar, jVarM8576)) {
                return C0106.m11313(bVar);
            }
            return C0097.m10854(jVar, C0097.m10833(bVar)) ? bVar : C0090.m8613(bVar);
        }
        if (C0097.m10854(jVar, jVarM8576)) {
            return C0097.m10854(jVar, C0097.m10833(bVar)) ? C0106.m11313(bVar) : bVar;
        }
        return C0090.m8613(bVar);
    }

    private b[] b(int i2) {
        long j2;
        Integer numM11105 = C0102.m11105(i2);
        ConcurrentHashMap concurrentHashMapM8412 = m8412(this);
        b[] bVarArr = (b[]) C0080.m7547(concurrentHashMapM8412, numM11105);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZoneM8414 = m8414(this);
        if (timeZoneM8414 == null) {
            e[] eVarArrM8430 = m8430(this);
            b[] bVarArr2 = new b[eVarArrM8430.length];
            for (int i3 = 0; i3 < eVarArrM8430.length; i3++) {
                bVarArr2[i3] = C0091.m8662(eVarArrM8430[i3], i2);
            }
            if (i2 < 2100) {
                C0095.m9227(concurrentHashMapM8412, numM11105, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArrM8429 = m8429();
        if (i2 < 1800) {
            return bVarArrM8429;
        }
        long jM11133 = C0103.m11133(C0106.m11327(i2 - 1), m8428(this)[0]);
        int iM11107 = C0102.m11107(timeZoneM8414, jM11133 * 1000);
        long j3 = 31968000 + jM11133;
        while (jM11133 < j3) {
            long j4 = 7776000 + jM11133;
            long j5 = jM11133;
            if (iM11107 != C0102.m11107(timeZoneM8414, j4 * 1000)) {
                jM11133 = j5;
                while (j4 - jM11133 > 1) {
                    int i4 = iM11107;
                    long j6 = j3;
                    long jM11106 = C0102.m11106(j4 + jM11133, 2L);
                    if (C0102.m11107(timeZoneM8414, jM11106 * 1000) == i4) {
                        jM11133 = jM11106;
                    } else {
                        j4 = jM11106;
                    }
                    iM11107 = i4;
                    j3 = j6;
                }
                j2 = j3;
                int i5 = iM11107;
                if (C0102.m11107(timeZoneM8414, jM11133 * 1000) == i5) {
                    jM11133 = j4;
                }
                A aM8411 = m8411(i5);
                iM11107 = C0102.m11107(timeZoneM8414, jM11133 * 1000);
                A aM84112 = m8411(iM11107);
                if (m8431(jM11133, aM84112) == i2) {
                    bVarArrM8429 = (b[]) C0097.m10839(bVarArrM8429, bVarArrM8429.length + 1);
                    bVarArrM8429[bVarArrM8429.length - 1] = new b(jM11133, aM8411, aM84112);
                }
            } else {
                j2 = j3;
                jM11133 = j4;
            }
            j3 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            C0095.m9227(concurrentHashMapM8412, numM11105, bVarArrM8429);
        }
        return bVarArrM8429;
    }

    private static int c(long j2, A a) {
        return C0097.m10813(C0083.m8044(C0102.m11106(j2 + ((long) C0088.m8527(a)), 86400)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C0097.m10841(m8414(this), m8414(fVar)) && C0097.m10817(m8421(this), m8421(fVar)) && C0093.m9088(m8428(this), m8428(fVar)) && C0097.m10817(m8418(this), m8418(fVar)) && C0093.m9088(m8425(this), m8425(fVar)) && C0093.m9088(m8430(this), m8430(fVar));
    }

    public final String toString() {
        String strM10856 = C0098.m10856(m8410(), 48, 1, 588);
        TimeZone timeZoneM8414 = m8414(this);
        if (timeZoneM8414 != null) {
            String strM7797 = C0081.m7797(timeZoneM8414);
            StringBuilder sb = new StringBuilder(C0103.m11135(m8410(), 49, 19, 1538));
            C0101.m11052(sb, strM7797);
            C0101.m11052(sb, strM10856);
            return C0099.m10924(sb);
        }
        A a = m8428(this)[r1.length - 1];
        StringBuilder sb2 = new StringBuilder(C0102.m11094(m8410(), 68, 32, 1151));
        C0082.m7988(sb2, a);
        C0101.m11052(sb2, strM10856);
        return C0099.m10924(sb2);
    }
}
