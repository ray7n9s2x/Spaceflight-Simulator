package j$.util.stream;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class L2 extends D2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f509short = {1652, 1619, 1621, 1602, 1606, 1610, 1543, 1620, 1614, 1629, 1602, 1543, 1602, 1631, 1604, 1602, 1602, 1603, 1620, 1543, 1610, 1606, 1631, 1543, 1606, 1621, 1621, 1606, 1630, 1543, 1620, 1614, 1629, 1602};
    private ArrayList d;

    /* JADX INFO: renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9556(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((D2) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static short[] m9557() {
        if (C0102.m11109() <= 0) {
            return f509short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9558(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m9559(Object obj, long j) {
        if (C0085.m8230() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۢۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Comparator m9560(Object obj) {
        if (C0085.m8230() > 0) {
            return ((D2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9561(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m9562(Object obj) {
        if (C0102.m11109() < 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۦۦۨۢ, reason: contains not printable characters */
    public static ArrayList m9563(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((L2) obj).d;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0099.m10897(m9557(), 0, 34, 1575));
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        C0096.m10787(m9563(this), m9560(this));
        long jM11061 = C0101.m11061(m9563(this));
        InterfaceC0597p2 interfaceC0597p2M9561 = m9561(this);
        m9559(interfaceC0597p2M9561, jM11061);
        if (!m9556(this)) {
            ArrayList arrayListM9563 = m9563(this);
            C0099.m10863(interfaceC0597p2M9561);
            C0104.m11227(arrayListM9563, new C0519a(1, interfaceC0597p2M9561));
        } else {
            Iterator itM8687 = C0091.m8687(m9563(this));
            while (C0087.m8485(itM8687)) {
                Object objM8628 = C0090.m8628(itM8687);
                if (m9558(interfaceC0597p2M9561)) {
                    break;
                } else {
                    C0083.m8026(interfaceC0597p2M9561, objM8628);
                }
            }
        }
        m9562(interfaceC0597p2M9561);
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C0099.m10918(m9563(this), obj);
    }
}
