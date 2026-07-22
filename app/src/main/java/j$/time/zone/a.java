package j$.time.zone;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import j$.sun.misc.C0079;
import j$.time.A;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import java.io.C0103;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.function.C0105;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f466short = {1114, 1121, 1124, 1121, 1120, 1144, 1121, 1071, 1148, 1130, 1149, 1126, 1134, 1123, 1126, 1141, 1130, 1131, 1071, 1147, 1142, 1151, 1130, 2402, 2379, 2379, 2398, 2376, 2393, 2398, 2317, 2368, 2392, 2398, 2393, 2317, 2371, 2370, 2393, 2317, 2383, 2376, 2317, 2376, 2396, 2392, 2380, 2369, 2784, 2779, 2782, 2779, 2778, 2754, 2779, 2709, 2758, 2768, 2759, 2780, 2772, 2777, 2780, 2767, 2768, 2769, 2709, 2753, 2764, 2757, 2768};
    private byte a;
    private Serializable b;

    /* JADX INFO: renamed from: ۟۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static f m8380(Object obj) {
        if (C0091.m8708() > 0) {
            return f.j((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8381(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            ((b) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۦ, reason: not valid java name and contains not printable characters */
    public static A m8382(Object obj) {
        if (C0085.m8230() >= 0) {
            return b((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8383(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            ((e) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8384(Object obj, Object obj2) throws IOException {
        if (C0105.m11264() >= 0) {
            ((f) obj).k((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۨ, reason: not valid java name and contains not printable characters */
    public static long m8385(Object obj) {
        if (C0095.m9210() > 0) {
            return a((ObjectInput) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Serializable m8386(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((a) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static e m8387(Object obj) {
        if (C0084.m8116() >= 0) {
            return e.b((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static byte m8388(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((a) obj).a;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۧۧۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8389() {
        if (C0093.m9101() >= 0) {
            return f466short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m8390(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            ((f) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    public a() {
    }

    a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte bM8388 = m8388(this);
        Serializable serializableM8386 = m8386(this);
        C0092.m8730(objectOutput, bM8388);
        if (bM8388 == 1) {
            m8390((f) serializableM8386, objectOutput);
            return;
        }
        if (bM8388 == 2) {
            m8381((b) serializableM8386, objectOutput);
        } else if (bM8388 == 3) {
            m8383((e) serializableM8386, objectOutput);
        } else {
            if (bM8388 == 100) {
                m8384((f) serializableM8386, objectOutput);
                return;
            }
            throw new InvalidClassException(C0087.m8474(m8389(), 48, 23, 2741));
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws StreamCorruptedException {
        Serializable serializableM8380;
        byte bM11126 = C0103.m11126(objectInput);
        this.a = bM11126;
        if (bM11126 == 1) {
            serializableM8380 = m8380(objectInput);
        } else if (bM11126 == 2) {
            long jM8385 = m8385(objectInput);
            A aM8382 = m8382(objectInput);
            A aM83822 = m8382(objectInput);
            if (C0097.m10807(aM8382, aM83822)) {
                throw new IllegalArgumentException(C0091.m8679(m8389(), 23, 25, 2349));
            }
            serializableM8380 = new b(jM8385, aM8382, aM83822);
        } else if (bM11126 == 3) {
            serializableM8380 = m8387(objectInput);
        } else {
            if (bM11126 != 100) {
                throw new StreamCorruptedException(C0096.m10776(m8389(), 0, 23, 1039));
            }
            serializableM8380 = new f(C0096.m10792(C0097.m10822(objectInput)));
        }
        this.b = serializableM8380;
    }

    private Object readResolve() {
        return m8386(this);
    }

    static void d(A a, ObjectOutput objectOutput) {
        int iM8527 = C0088.m8527(a);
        int i = iM8527 % DescriptorProtos.Edition.EDITION_LEGACY_VALUE == 0 ? iM8527 / DescriptorProtos.Edition.EDITION_LEGACY_VALUE : WorkQueueKt.MASK;
        C0092.m8730(objectOutput, i);
        if (i == 127) {
            C0091.m8668(objectOutput, iM8527);
        }
    }

    static A b(ObjectInput objectInput) {
        byte bM11126 = C0103.m11126(objectInput);
        return bM11126 == 127 ? C0090.m8622(C0091.m8693(objectInput)) : C0090.m8622(bM11126 * 900);
    }

    static void c(long j, ObjectOutput objectOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            C0092.m8730(objectOutput, (i >>> 16) & 255);
            C0092.m8730(objectOutput, (i >>> 8) & 255);
            C0092.m8730(objectOutput, i & 255);
            return;
        }
        C0092.m8730(objectOutput, 255);
        C0079.m7508(objectOutput, j);
    }

    static long a(ObjectInput objectInput) {
        int iM11126 = C0103.m11126(objectInput) & 255;
        if (iM11126 == 255) {
            return C0084.m8082(objectInput);
        }
        return (((long) (((iM11126 << 16) + ((C0103.m11126(objectInput) & 255) << 8)) + (C0103.m11126(objectInput) & 255))) * 900) - 4575744000L;
    }
}
