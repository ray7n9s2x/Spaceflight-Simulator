package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class G implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f398short = {2259, 2280, 2285, 2280, 2281, 2289, 2280, 2214, 2293, 2275, 2292, 2287, 2279, 2282, 2287, 2300, 2275, 2274, 2214, 2290, 2303, 2294, 2275, 1771, 1744, 1749, 1744, 1745, 1737, 1744, 1694, 1741, 1755, 1740, 1751, 1759, 1746, 1751, 1732, 1755, 1754, 1694, 1738, 1735, 1742, 1755};
    private byte a;
    private Object b;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static n m7642(Object obj) {
        if (C0082.m7983() < 0) {
            return AbstractC0488a.j((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m7643(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            ((C0494g) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m7644() {
        if (C0084.m8116() >= 0) {
            return C0495h.e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢ۠, reason: not valid java name and contains not printable characters */
    public static s m7645(Object obj, int i, int i2, int i3) {
        if (C0095.m9210() > 0) {
            return s.K((q) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static byte m7646(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((G) obj).a;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m7647(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((G) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7648() {
        if (C0100.m10983() >= 0) {
            return f398short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۨ, reason: contains not printable characters */
    public static void m7649(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            ((m) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۤۡۧ, reason: contains not printable characters */
    public static void m7650(Object obj, Object obj2) throws IOException {
        if (C0082.m7983() <= 0) {
            ((s) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۤۢ۟, reason: contains not printable characters */
    public static j$.time.h m7651() {
        if (C0079.m7512() > 0) {
            return z.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7652(Object obj, Object obj2) {
        if (C0089.m8594() <= 0) {
            ((C0495h) obj).writeExternal((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7653(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            ((A) obj).E((DataOutput) obj2);
        }
    }

    public G() {
    }

    G(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte bM7646 = m7646(this);
        Object objM7647 = m7647(this);
        C0092.m8730(objectOutput, bM7646);
        switch (bM7646) {
            case 1:
                C0105.m11290(objectOutput, C0105.m11279((AbstractC0488a) objM7647));
                return;
            case 2:
                m7643((C0494g) objM7647, objectOutput);
                return;
            case 3:
                m7649((m) objM7647, objectOutput);
                return;
            case 4:
                z zVar = (z) objM7647;
                C0092.m8727(zVar);
                C0091.m8668(objectOutput, C0103.m11167(zVar, C0104.m11201()));
                C0092.m8730(objectOutput, C0103.m11167(zVar, C0094.m9136()));
                C0092.m8730(objectOutput, C0103.m11167(zVar, C0084.m8118()));
                return;
            case 5:
                m7653((A) objM7647, objectOutput);
                return;
            case 6:
                m7650((s) objM7647, objectOutput);
                return;
            case 7:
                E e = (E) objM7647;
                C0092.m8727(e);
                C0091.m8668(objectOutput, C0103.m11167(e, C0104.m11201()));
                C0092.m8730(objectOutput, C0103.m11167(e, C0094.m9136()));
                C0092.m8730(objectOutput, C0103.m11167(e, C0084.m8118()));
                return;
            case 8:
                K k = (K) objM7647;
                C0092.m8727(k);
                C0091.m8668(objectOutput, C0103.m11167(k, C0104.m11201()));
                C0092.m8730(objectOutput, C0103.m11167(k, C0094.m9136()));
                C0092.m8730(objectOutput, C0103.m11167(k, C0084.m8118()));
                return;
            case 9:
                m7652((C0495h) objM7647, objectOutput);
                return;
            default:
                throw new InvalidClassException(C0095.m9204(m7648(), 23, 23, 1726));
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws StreamCorruptedException {
        Object objM7642;
        byte bM11126 = C0103.m11126(objectInput);
        this.a = bM11126;
        switch (bM11126) {
            case 1:
                C0079.m7490();
                objM7642 = m7642(C0097.m10822(objectInput));
                break;
            case 2:
                objM7642 = C0087.m8452((InterfaceC0489b) C0093.m9086(objectInput), (j$.time.l) C0093.m9086(objectInput));
                break;
            case 3:
                objM7642 = C0093.m9096(C0084.m8127((InterfaceC0492e) C0093.m9086(objectInput), (j$.time.A) C0093.m9086(objectInput)), (j$.time.z) C0093.m9086(objectInput));
                break;
            case 4:
                m7651();
                int iM8693 = C0091.m8693(objectInput);
                byte bM111262 = C0103.m11126(objectInput);
                byte bM111263 = C0103.m11126(objectInput);
                C0092.m8727(C0095.m9203());
                objM7642 = new z(C0079.m7525(iM8693, bM111262, bM111263));
                break;
            case 5:
                C0079.m7483();
                objM7642 = C0082.m7986(C0103.m11126(objectInput));
                break;
            case 6:
                q qVar = (q) C0093.m9086(objectInput);
                int iM86932 = C0091.m8693(objectInput);
                byte bM111264 = C0103.m11126(objectInput);
                byte bM111265 = C0103.m11126(objectInput);
                C0092.m8727(qVar);
                objM7642 = m7645(qVar, iM86932, bM111264, bM111265);
                break;
            case 7:
                int iM86933 = C0091.m8693(objectInput);
                byte bM111266 = C0103.m11126(objectInput);
                byte bM111267 = C0103.m11126(objectInput);
                C0092.m8727(C0080.m7562());
                objM7642 = new E(C0079.m7525(iM86933 + 1911, bM111266, bM111267));
                break;
            case 8:
                int iM86934 = C0091.m8693(objectInput);
                byte bM111268 = C0103.m11126(objectInput);
                byte bM111269 = C0103.m11126(objectInput);
                C0092.m8727(C0081.m7861());
                objM7642 = new K(C0079.m7525(iM86934 - 543, bM111268, bM111269));
                break;
            case 9:
                m7644();
                objM7642 = new C0495h(m7642(C0097.m10822(objectInput)), C0091.m8693(objectInput), C0091.m8693(objectInput), C0091.m8693(objectInput));
                break;
            default:
                throw new StreamCorruptedException(C0102.m11094(m7648(), 0, 23, 2182));
        }
        this.b = objM7642;
    }

    private Object readResolve() {
        return m7647(this);
    }
}
