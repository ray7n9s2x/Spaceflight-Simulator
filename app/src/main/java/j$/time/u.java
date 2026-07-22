package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class u implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f462short = {1619, 1640, 1645, 1640, 1641, 1649, 1640, 1574, 1653, 1635, 1652, 1647, 1639, 1642, 1647, 1660, 1635, 1634, 1574, 1650, 1663, 1654, 1635, 1765, 1758, 1755, 1758, 1759, 1735, 1758, 1680, 1731, 1749, 1730, 1753, 1745, 1756, 1753, 1738, 1749, 1748, 1680, 1732, 1737, 1728, 1749};
    private byte a;
    private Object b;

    /* JADX INFO: renamed from: ۟۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m8334(Object obj, Object obj2) {
        if (C0090.m8624() >= 0) {
            ((B) obj).I((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8335() {
        if (C0097.m10823() >= 0) {
            return f462short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m8336(Object obj) {
        if (C0087.m8458() < 0) {
            return ((u) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8337(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            ((A) obj).O((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static y m8338(Object obj) {
        if (C0099.m10878() <= 0) {
            return y.G((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static byte m8339(Object obj) {
        if (C0106.m11345() < 0) {
            return ((u) obj).a;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static r m8340(Object obj) {
        if (C0101.m11044() < 0) {
            return r.E((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m8341(Object obj, Object obj2) throws IOException {
        if (C0093.m9101() > 0) {
            ((Instant) obj).H((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static D m8342(Object obj) {
        if (C0087.m8458() <= 0) {
            return D.E((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m8343(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            ((y) obj).J((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m8344(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            ((s) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int m8345() {
        if (C0105.m11264() > 0) {
            return B.c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static s m8346(Object obj) {
        if (C0091.m8708() > 0) {
            return s.E((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8347(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            ((p) obj).D((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۥۧ, reason: not valid java name and contains not printable characters */
    public static l m8348(Object obj) {
        if (C0096.m10782() >= 0) {
            return l.R((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static z m8349(Object obj) {
        if (C0081.m7818() <= 0) {
            return z.D((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡۦ, reason: not valid java name and contains not printable characters */
    public static p m8350(Object obj) {
        if (C0089.m8594() <= 0) {
            return p.C((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static void m8351(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            ((l) obj).W((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m8352(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            ((t) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡۥ, reason: not valid java name and contains not printable characters */
    public static t m8353(Object obj) {
        if (C0080.m7553() >= 0) {
            return t.a((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8354(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            ((r) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m8355(Object obj, Object obj2) {
        if (C0093.m9101() > 0) {
            ((e) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۢ۠, reason: contains not printable characters */
    public static Serializable m8356(byte b, Object obj) {
        if (C0098.m10857() <= 0) {
            return b(b, (ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static void m8357(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            ((j) obj).T((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧۧۢ, reason: contains not printable characters */
    public static void m8358(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            ((w) obj).G((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۦۥ, reason: not valid java name and contains not printable characters */
    public static A m8359(Object obj) {
        if (C0102.m11109() < 0) {
            return A.N((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡۦ, reason: not valid java name and contains not printable characters */
    public static void m8360(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            ((h) obj).Z((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧۨ, reason: not valid java name and contains not printable characters */
    public static void m8361(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            ((D) obj).G((DataOutput) obj2);
        }
    }

    public u() {
    }

    u(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte bM8339 = m8339(this);
        Object objM8336 = m8336(this);
        C0092.m8730(objectOutput, bM8339);
        switch (bM8339) {
            case 1:
                m8355((e) objM8336, objectOutput);
                return;
            case 2:
                m8341((Instant) objM8336, objectOutput);
                return;
            case 3:
                m8360((h) objM8336, objectOutput);
                return;
            case 4:
                m8351((l) objM8336, objectOutput);
                return;
            case 5:
                m8357((j) objM8336, objectOutput);
                return;
            case 6:
                m8361((D) objM8336, objectOutput);
                return;
            case 7:
                m8334((B) objM8336, objectOutput);
                return;
            case 8:
                m8337((A) objM8336, objectOutput);
                return;
            case 9:
                m8344((s) objM8336, objectOutput);
                return;
            case 10:
                m8354((r) objM8336, objectOutput);
                return;
            case 11:
                m8358((w) objM8336, objectOutput);
                return;
            case 12:
                m8343((y) objM8336, objectOutput);
                return;
            case 13:
                m8347((p) objM8336, objectOutput);
                return;
            case 14:
                m8352((t) objM8336, objectOutput);
                return;
            default:
                throw new InvalidClassException(C0104.m11206(m8335(), 23, 23, 1712));
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte bM11126 = C0103.m11126(objectInput);
        this.a = bM11126;
        this.b = m8356(bM11126, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return m8356(C0103.m11126(objectInput), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                C0086.m8317();
                return C0097.m10800(C0084.m8082(objectInput), C0091.m8693(objectInput));
            case 2:
                C0090.m8631();
                return C0099.m10879(C0084.m8082(objectInput), C0091.m8693(objectInput));
            case 3:
                C0094.m9157();
                return C0079.m7525(C0091.m8693(objectInput), C0103.m11126(objectInput), C0103.m11126(objectInput));
            case 4:
                return m8348(objectInput);
            case 5:
                C0084.m8089();
                C0094.m9157();
                return C0100.m11000(C0079.m7525(C0091.m8693(objectInput), C0103.m11126(objectInput), C0103.m11126(objectInput)), m8348(objectInput));
            case 6:
                return m8342(objectInput);
            case 7:
                m8345();
                return m8349(C0097.m10822(objectInput));
            case 8:
                return m8359(objectInput);
            case 9:
                return m8346(objectInput);
            case 10:
                return m8340(objectInput);
            case 11:
                C0081.m7808();
                return C0096.m10783(C0091.m8693(objectInput));
            case 12:
                return m8338(objectInput);
            case 13:
                return m8350(objectInput);
            case 14:
                return m8353(objectInput);
            default:
                throw new StreamCorruptedException(C0086.m8291(m8335(), 0, 23, 1542));
        }
    }

    private Object readResolve() {
        return m8336(this);
    }
}
