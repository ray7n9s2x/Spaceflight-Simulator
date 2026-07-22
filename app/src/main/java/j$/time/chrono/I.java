package j$.time.chrono;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC0488a implements Serializable {
    private static final long serialVersionUID = 2775954514031616474L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f399short = {1638, 1638, 2228, 2227, 2458, 2449, 1077, 1065, 857, 821, 857, 821, 1917, 1809, 1914, 1809, 2381, 1917, 2427, 1917, 1633, 1615, 1659, 1586, 1623, 1635, 1662, 1625, 1614, 1616, 1647, 1590, 1659, 1608, 1631, 1645, 1615, 1586, 2951, 2976, 2979, 2986, 2999, 2976, 3045, 2951, 2992, 2977, 2977, 2989, 2988, 2998, 2993, 982, 993, 1008, 1020, 1020, 1021, 999, 992, 948, 977, 998, 1013, 1797, 1827, 1804, 1795, 1843, 1834, 1818, 1848, 1833, 1809, 1917, 1884, 1866, 1884, 1867, 1872, 1880, 1877, 1872, 1859, 1880, 1869, 1872, 1878, 1879, 1817, 1871, 1872, 1880, 1817, 1866, 1884, 1867, 1872, 1880, 1877, 1872, 1859, 1880, 1869, 1872, 1878, 1879, 1817, 1885, 1884, 1877, 1884, 1886, 1880, 1869, 1884, 2042, 2013, 1989, 2002, 2015, 2010, 2007, 1939, 2006, 1985, 2002, 1929, 1939, 3284, 3304, 3297, 3305, 3266, 3317, 3300, 3300, 3304, 3305, 3315, 3316, 1102, 1113, 1096, 1096, 1092, 1093, 1119, 1112};
    public static final I d = new I();

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m7655() {
        if (C0095.m9210() > 0) {
            return H.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7656() {
        if (C0084.m8116() > 0) {
            return f399short;
        }
        return null;
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        String strM9107 = C0094.m9107(m7656(), 0, 2, 1572);
        String strM8037 = C0083.m8037(m7656(), 2, 2, 2294);
        String strM8518 = C0088.m8518(m7656(), 4, 2, 2559);
        C0088.m8552(map, strM8518, new String[]{strM9107, strM8037});
        String strM8731 = C0092.m8731(m7656(), 6, 2, 1089);
        C0088.m8552(map, strM8731, new String[]{strM9107, strM8037});
        C0088.m8552(map2, strM8518, new String[]{C0106.m11346(m7656(), 8, 4, 795), C0102.m11094(m7656(), 12, 4, 1855)});
        String strM10897 = C0099.m10897(m7656(), 16, 4, 1875);
        String strM80372 = C0083.m8037(m7656(), 20, 18, 2170);
        C0088.m8552(map2, strM8731, new String[]{strM10897, strM80372});
        C0088.m8552(map3, strM8518, new String[]{C0082.m7966(m7656(), 38, 15, 3013), C0096.m10776(m7656(), 53, 12, 916)});
        C0088.m8552(map3, strM8731, new String[]{C0101.m11060(m7656(), 65, 10, 2331), strM80372});
    }

    @Override // j$.time.chrono.n
    public final o A(int i) {
        if (i == 0) {
            return C0088.m8531();
        }
        if (i == 1) {
            return C0103.m11159();
        }
        StringBuilder sb = new StringBuilder(C0091.m8679(m7656(), 117, 13, 1971));
        C0099.m10859(sb, i);
        throw new DateTimeException(C0099.m10924(sb));
    }

    private I() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return C0100.m10962(m7656(), 130, 12, 3200);
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return C0102.m11094(m7656(), 142, 8, 1068);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0489b l(j$.time.temporal.o oVar) {
        if (oVar instanceof K) {
            return (K) oVar;
        }
        return new K(C0080.m7570(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        int i = m7655()[C0105.m11258(aVar)];
        if (i == 1) {
            j$.time.temporal.w wVarM8651 = C0090.m8651(C0088.m8511());
            return C0084.m8080(C0092.m8744(wVarM8651) + 6516, C0088.m8525(wVarM8651) + 6516);
        }
        if (i == 2) {
            j$.time.temporal.w wVarM86512 = C0090.m8651(C0104.m11201());
            return C0083.m8075((-(C0092.m8744(wVarM86512) + 543)) + 1, C0088.m8525(wVarM86512) + 543);
        }
        if (i == 3) {
            j$.time.temporal.w wVarM86513 = C0090.m8651(C0104.m11201());
            return C0084.m8080(C0092.m8744(wVarM86513) + 543, C0088.m8525(wVarM86513) + 543);
        }
        return C0090.m8651(aVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0104.m11206(m7656(), 75, 42, 1849));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
