package j$.time.format;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class i implements g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f423short = {1019, 1009, 1009, 1302, 1329, 1324, 1323, 1342, 1329, 1323, 1399, 1398};

    /* JADX INFO: renamed from: ۢۤۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.temporal.o m7897(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((q) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m7898() {
        if (C0093.m9101() >= 0) {
            return f423short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Long m7899(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((q) obj).e((j$.time.temporal.r) obj2);
        }
        return null;
    }

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        Long lM7899 = m7899(qVar, C0101.m11033());
        j$.time.temporal.o oVarM7897 = m7897(qVar);
        j$.time.temporal.a aVarM8604 = C0090.m8604();
        Long lM11351 = C0092.m8792(oVarM7897, aVarM8604) ? C0106.m11351(C0100.m11007(m7897(qVar), aVarM8604)) : null;
        int i = 0;
        if (lM7899 == null) {
            return false;
        }
        long jM8558 = C0088.m8558(lM7899);
        int iM7859 = C0081.m7859(aVarM8604, lM11351 != null ? C0088.m8558(lM11351) : 0L);
        String strM8474 = C0087.m8474(m7898(), 0, 3, 961);
        if (jM8558 >= -62167219200L) {
            long j = jM8558 - 253402300800L;
            long jM11106 = C0102.m11106(j, 315569520000L) + 1;
            j$.time.j jVarM11100 = C0102.m11100(C0090.m8641(j, 315569520000L) - 62167219200L, 0, C0103.m11137());
            if (jM11106 > 0) {
                C0089.m8573(sb, '+');
                C0087.m8489(sb, jM11106);
            }
            C0082.m7988(sb, jVarM11100);
            if (C0081.m7806(jVarM11100) == 0) {
                C0101.m11052(sb, strM8474);
            }
        } else {
            long j2 = jM8558 + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            j$.time.j jVarM111002 = C0102.m11100(j4 - 62167219200L, 0, C0103.m11137());
            int iM7835 = C0081.m7835(sb);
            C0082.m7988(sb, jVarM111002);
            if (C0081.m7806(jVarM111002) == 0) {
                C0101.m11052(sb, strM8474);
            }
            if (j3 < 0) {
                if (C0100.m10999(jVarM111002) == -10000) {
                    C0093.m9089(sb, iM7835, iM7835 + 2, C0099.m10925(j3 - 1));
                } else if (j4 == 0) {
                    C0091.m8697(sb, iM7835, j3);
                } else {
                    C0091.m8697(sb, iM7835 + 1, C0099.m10907(j3));
                }
            }
        }
        if (iM7859 > 0) {
            C0089.m8573(sb, '.');
            int i2 = 100000000;
            while (true) {
                if (iM7859 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iM7859 / i2;
                C0089.m8573(sb, (char) (i3 + 48));
                iM7859 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        C0089.m8573(sb, 'Z');
        return true;
    }

    public final String toString() {
        return C0089.m8581(m7898(), 3, 9, 1375);
    }
}
