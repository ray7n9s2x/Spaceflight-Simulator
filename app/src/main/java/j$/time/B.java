package j$.time;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.function.C0094;
import java.io.C0104;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class B extends z {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f390short = {1098, 1119, 1118, 1109, 1145, 1108, 2747, 2716, 2692, 2707, 2718, 2715, 2710, 2770, 2747, 2742, 2770, 2708, 2717, 2688, 2770, 2688, 2711, 2709, 2715, 2717, 2716, 2783, 2704, 2707, 2689, 2711, 2710, 2770, 2728, 2717, 2716, 2711, 2747, 2710, 2782, 2770, 2715, 2716, 2692, 2707, 2718, 2715, 2710, 2770, 2708, 2717, 2688, 2719, 2707, 2694, 2760, 2770, 1415, 1446, 1456, 1446, 1457, 1450, 1442, 1455, 1450, 1465, 1442, 1463, 1450, 1452, 1453, 1507, 1461, 1450, 1442, 1507, 1456, 1446, 1457, 1450, 1442, 1455, 1450, 1465, 1442, 1463, 1450, 1452, 1453, 1507, 1447, 1446, 1455, 1446, 1444, 1442, 1463, 1446};
    private final String a;
    private final transient j$.time.zone.f b;

    /* JADX INFO: renamed from: ۟۠ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static j$.time.zone.f m7598(Object obj) {
        if (C0087.m8458() < 0) {
            return ((B) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7599() {
        if (C0081.m7818() < 0) {
            return f390short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۡ, reason: contains not printable characters */
    public static String m7600(Object obj) {
        if (C0087.m8458() < 0) {
            return ((B) obj).a;
        }
        return null;
    }

    static B H(String str) {
        j$.time.zone.f fVarM10979;
        C0079.m7494(str, C0100.m10962(m7599(), 0, 6, 1072));
        int iM8751 = C0092.m8751(str);
        String strM8474 = C0087.m8474(m7599(), 6, 52, 2802);
        if (iM8751 >= 2) {
            for (int i = 0; i < iM8751; i++) {
                char cM11233 = C0104.m11233(str, i);
                if ((cM11233 < 'a' || cM11233 > 'z') && ((cM11233 < 'A' || cM11233 > 'Z') && ((cM11233 != '/' || i == 0) && ((cM11233 < '0' || cM11233 > '9' || i == 0) && ((cM11233 != '~' || i == 0) && ((cM11233 != '.' || i == 0) && ((cM11233 != '_' || i == 0) && ((cM11233 != '+' || i == 0) && (cM11233 != '-' || i == 0))))))))) {
                    throw new DateTimeException(C0094.m9125(strM8474, str));
                }
            }
            try {
                fVarM10979 = C0100.m10979(str, true);
            } catch (j$.time.zone.g unused) {
                fVarM10979 = null;
            }
            return new B(str, fVarM10979);
        }
        throw new DateTimeException(C0094.m9125(strM8474, str));
    }

    B(String str, j$.time.zone.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    @Override // j$.time.z
    public final String i() {
        return m7600(this);
    }

    @Override // j$.time.z
    public final j$.time.zone.f C() {
        j$.time.zone.f fVarM7598 = m7598(this);
        return fVarM7598 != null ? fVarM7598 : C0100.m10979(m7600(this), false);
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0087.m8474(m7599(), 58, 42, 1475));
    }

    @Override // j$.time.z
    final void G(ObjectOutput objectOutput) throws IOException {
        C0092.m8730(objectOutput, 7);
        C0105.m11290(objectOutput, m7600(this));
    }

    final void I(DataOutput dataOutput) {
        C0105.m11290(dataOutput, m7600(this));
    }
}
