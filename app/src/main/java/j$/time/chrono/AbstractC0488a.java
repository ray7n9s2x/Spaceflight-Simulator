package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0488a implements n {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f402short = {2134, 2141, 3270, 3292, 1211, 1206, 481, 507, 487, 1813, 1838, 1835, 1838, 1839, 1847, 1838, 1888, 1827, 1832, 1842, 1839, 1838, 1839, 1836, 1839, 1831, 1849, 1914, 1888, 1415, 1468, 1459, 1456, 1470, 1463, 1522, 1446, 1469, 1522, 1469, 1456, 1446, 1459, 1467, 1468, 1522, 1425, 1466, 1440, 1469, 1468, 1469, 1438, 1469, 1457, 1459, 1470, 1430, 1459, 1446, 1463, 1414, 1467, 1471, 1463, 1522, 1460, 1440, 1469, 1471, 1522, 1414, 1463, 1471, 1442, 1469, 1440, 1459, 1470, 1427, 1457, 1457, 1463, 1441, 1441, 1469, 1440, 1512, 1522};
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ۣ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m7664() {
        if (C0096.m10782() >= 0) {
            return b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7665() {
        if (C0083.m8022() < 0) {
            return f402short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۥ, reason: not valid java name and contains not printable characters */
    public static n m7666(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            return k((AbstractC0488a) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m7667() {
        if (C0104.m11196() >= 0) {
            return a;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C0092.m8726(C0105.m11279(this), C0105.m11279((n) obj));
    }

    static {
        String strM9062 = C0093.m9062(m7665(), 0, 2, 2108);
        String strM8291 = C0086.m8291(m7665(), 2, 2, 3212);
        new Locale(strM9062, strM8291, strM8291);
    }

    static n k(AbstractC0488a abstractC0488a, String str) {
        String strM7564;
        n nVar = (n) C0095.m9227(m7667(), str, abstractC0488a);
        if (nVar == null && (strM7564 = C0080.m7564(abstractC0488a)) != null) {
            C0095.m9227(m7664(), strM7564, abstractC0488a);
        }
        return nVar;
    }

    static n j(String str) {
        C0079.m7494(str, C0103.m11135(m7665(), 4, 2, 1234));
        while (true) {
            ConcurrentHashMap concurrentHashMapM7667 = m7667();
            n nVar = (n) C0080.m7547(concurrentHashMapM7667, str);
            if (nVar == null) {
                nVar = (n) C0080.m7547(m7664(), str);
            }
            if (nVar != null) {
                return nVar;
            }
            String strM11094 = C0102.m11094(m7665(), 6, 3, 424);
            if (C0080.m7547(concurrentHashMapM7667, strM11094) != null) {
                Iterator itM8234 = C0085.m8234(C0079.m7481(n.class));
                while (C0087.m8485(itM8234)) {
                    n nVar2 = (n) C0090.m8628(itM8234);
                    if (C0084.m8079(str, C0105.m11279(nVar2)) || C0084.m8079(str, C0080.m7564(nVar2))) {
                        return nVar2;
                    }
                }
                throw new DateTimeException(C0094.m9125(C0106.m11346(m7665(), 9, 20, 1856), str));
            }
            q qVarM11275 = C0105.m11275();
            m7666(qVarM11275, C0105.m11279(qVarM11275));
            x xVarM9203 = C0095.m9203();
            m7666(xVarM9203, C0105.m11279(xVarM9203));
            C cM7562 = C0080.m7562();
            m7666(cM7562, C0105.m11279(cM7562));
            I iM7861 = C0081.m7861();
            m7666(iM7861, C0105.m11279(iM7861));
            try {
                Iterator itM10774 = C0096.m10774(C0083.m8023(new AbstractC0488a[0]));
                while (C0087.m8485(itM10774)) {
                    AbstractC0488a abstractC0488a = (AbstractC0488a) C0090.m8628(itM10774);
                    if (!C0084.m8079(C0105.m11279(abstractC0488a), strM11094)) {
                        m7666(abstractC0488a, C0105.m11279(abstractC0488a));
                    }
                }
                u uVarM11146 = C0103.m11146();
                m7666(uVarM11146, C0105.m11279(uVarM11146));
            } catch (Throwable th) {
                throw new ServiceConfigurationError(C0081.m7807(th), th);
            }
        }
    }

    protected AbstractC0488a() {
    }

    @Override // j$.time.chrono.n
    public InterfaceC0492e o(j$.time.j jVar) {
        try {
            return C0087.m8452(C0106.m11338(this, jVar), C0081.m7844(jVar));
        } catch (DateTimeException e) {
            StringBuilder sb = new StringBuilder(C0096.m10776(m7665(), 29, 60, 1490));
            C0082.m7988(sb, j$.time.j.class);
            throw new DateTimeException(C0099.m10924(sb), e);
        }
    }

    @Override // j$.time.chrono.n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0488a) && C0092.m8726(C0105.m11279(this), C0105.m11279((AbstractC0488a) obj)) == 0;
    }

    @Override // j$.time.chrono.n
    public final int hashCode() {
        return C0090.m8618(C0092.m8727(this)) ^ C0102.m11084(C0105.m11279(this));
    }

    @Override // j$.time.chrono.n
    public final String toString() {
        return C0105.m11279(this);
    }
}
