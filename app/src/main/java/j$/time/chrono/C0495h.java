package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0495h implements Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f405short = {2017, 2026, 2032, 2029, 2028, 2029, 2969, 3000, 2990, 3000, 2991, 2996, 3004, 2993, 2996, 2983, 3004, 2985, 2996, 2994, 2995, 3069, 2987, 2996, 3004, 3069, 2990, 3000, 2991, 2996, 3004, 2993, 2996, 2983, 3004, 2985, 2996, 2994, 2995, 3069, 3001, 3000, 2993, 3000, 3002, 3004, 2985, 3000, 2917, 2837, 2933, 2817, 1322, 1370};
    private final n a;
    final int b;
    final int c;
    final int d;

    static {
        C0087.m8472(new Object[]{C0106.m11311(), C0089.m8599(), C0095.m9215()});
    }

    /* JADX INFO: renamed from: ۟۠ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static n m7701(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((C0495h) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7702() {
        if (C0103.m11154() <= 0) {
            return f405short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7703(Object obj) {
        if (C0087.m8458() < 0) {
            return ((C0495h) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m7704(Object obj) {
        if (C0100.m10983() > 0) {
            return ((C0495h) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m7705(Object obj) {
        if (C0099.m10878() < 0) {
            return ((C0495h) obj).b;
        }
        return 0;
    }

    C0495h(n nVar, int i, int i2, int i3) {
        C0079.m7494(nVar, C0089.m8581(m7702(), 0, 6, 1922));
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        n nVarM7701 = m7701(this);
        int iM7704 = m7704(this);
        int iM7703 = m7703(this);
        int iM7705 = m7705(this);
        if (iM7705 == 0 && iM7703 == 0 && iM7704 == 0) {
            String strM7804 = C0081.m7804(nVarM7701);
            StringBuilder sb = new StringBuilder();
            C0101.m11052(sb, strM7804);
            C0101.m11052(sb, C0091.m8679(m7702(), 48, 4, 2885));
            return C0099.m10924(sb);
        }
        StringBuilder sb2 = new StringBuilder();
        C0101.m11052(sb2, C0081.m7804(nVarM7701));
        C0101.m11052(sb2, C0079.m7503(m7702(), 52, 2, 1290));
        if (iM7705 != 0) {
            C0099.m10859(sb2, iM7705);
            C0089.m8573(sb2, 'Y');
        }
        if (iM7703 != 0) {
            C0099.m10859(sb2, iM7703);
            C0089.m8573(sb2, 'M');
        }
        if (iM7704 != 0) {
            C0099.m10859(sb2, iM7704);
            C0089.m8573(sb2, 'D');
        }
        return C0099.m10924(sb2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0495h)) {
            return false;
        }
        C0495h c0495h = (C0495h) obj;
        return m7705(this) == m7705(c0495h) && m7703(this) == m7703(c0495h) && m7704(this) == m7704(c0495h) && C0102.m11120(m7701(this), m7701(c0495h));
    }

    public final int hashCode() {
        return C0106.m11333(m7701(this)) ^ (C0086.m8310(m7704(this), 16) + (C0086.m8310(m7703(this), 8) + m7705(this)));
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0106.m11346(m7702(), 6, 42, 3037));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C0105.m11290(objectOutput, C0105.m11279(m7701(this)));
        C0091.m8668(objectOutput, m7705(this));
        C0091.m8668(objectOutput, m7703(this));
        C0091.m8668(objectOutput, m7704(this));
    }
}
