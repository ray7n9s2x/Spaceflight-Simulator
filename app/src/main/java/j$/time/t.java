package j$.time;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.common.base.Ascii;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.function.C0095;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f448short = {2927, 2844, 2922, 2924, 2842, 2936, 2926, 2839, 2927, 2936, 2941, 2927, 2844, 2922, 2924, 2842, 2936, 2844, 2935, 2922, 2942, 2842, 2924, 2926, 2846, 2926, 2936, 2927, 2936, 2941, 2927, 2844, 2922, 2924, 2842, 2936, 2844, 2935, 2922, 2942, 2842, 2924, 2926, 2826, 2926, 2936, 2927, 2936, 2941, 2927, 2844, 2922, 2924, 2842, 2936, 2844, 2935, 2922, 2942, 2842, 2924, 2926, 2832, 2926, 2936, 2927, 2936, 2941, 2927, 2844, 2922, 2924, 2842, 2936, 2844, 2935, 2922, 2942, 2842, 2924, 2926, 2819, 2926, 2936, 733, 764, 746, 764, 747, 752, 760, 757, 752, 739, 760, 749, 752, 758, 759, 697, 751, 752, 760, 697, 746, 764, 747, 752, 760, 757, 752, 739, 760, 749, 752, 758, 759, 697, 765, 764, 757, 764, 766, 760, 749, 764, 3049, 2953, 3069, 2024};
    public static final t d = new t(0, 0, 0);

    /* JADX INFO: renamed from: ۟۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8189(Object obj) {
        if (C0095.m9210() > 0) {
            return ((t) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8190(Object obj) {
        if (C0085.m8230() > 0) {
            return ((t) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m8191() {
        if (C0087.m8458() < 0) {
            return f448short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m8192(Object obj) {
        if (C0098.m10857() < 0) {
            return ((t) obj).c;
        }
        return 0;
    }

    static {
        C0090.m8611(C0086.m8291(m8191(), 0, 84, 2887), 2);
        C0087.m8472(new Object[]{C0106.m11311(), C0089.m8599(), C0095.m9215()});
    }

    private t(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return m8190(this) == m8190(tVar) && m8189(this) == m8189(tVar) && m8192(this) == m8192(tVar);
    }

    public final int hashCode() {
        return C0086.m8310(m8192(this), 16) + C0086.m8310(m8189(this), 8) + m8190(this);
    }

    public final String toString() {
        if (this == C0081.m7805()) {
            return C0101.m11060(m8191(), 126, 3, AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN);
        }
        StringBuilder sb = new StringBuilder(C0086.m8291(m8191(), 129, 1, 1976));
        int iM8190 = m8190(this);
        if (iM8190 != 0) {
            C0099.m10859(sb, iM8190);
            C0089.m8573(sb, 'Y');
        }
        int iM8189 = m8189(this);
        if (iM8189 != 0) {
            C0099.m10859(sb, iM8189);
            C0089.m8573(sb, 'M');
        }
        int iM8192 = m8192(this);
        if (iM8192 != 0) {
            C0099.m10859(sb, iM8192);
            C0089.m8573(sb, 'D');
        }
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u(Ascii.SO, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0082.m7966(m8191(), 84, 42, 665));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C0091.m8668(objectOutput, m8190(this));
        C0091.m8668(objectOutput, m8189(this));
        C0091.m8668(objectOutput, m8192(this));
    }

    static t a(ObjectInput objectInput) {
        int iM8693 = C0091.m8693(objectInput);
        int iM86932 = C0091.m8693(objectInput);
        int iM86933 = C0091.m8693(objectInput);
        if ((iM8693 | iM86932 | iM86933) == 0) {
            return C0081.m7805();
        }
        return new t(iM8693, iM86932, iM86933);
    }
}
