package j$.time.zone;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class h implements PrivilegedAction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f471short = {2414, 2405, 2418, 2405, 2346, 2416, 2413, 2409, 2401, 2346, 2430, 2411, 2410, 2401, 2346, 2368, 2401, 2402, 2405, 2417, 2408, 2416, 2398, 2411, 2410, 2401, 2390, 2417, 2408, 2401, 2423, 2388, 2422, 2411, 2418, 2413, 2400, 2401, 2422};
    final /* synthetic */ ArrayList a;

    /* JADX INFO: renamed from: ۟ۡۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m8435(Object obj) {
        if (C0083.m8022() < 0) {
            return ((Class) obj).newInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8436() {
        if (C0085.m8230() > 0) {
            return f471short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8437(Object obj) {
        if (C0089.m8594() < 0) {
            return ((h) obj).a;
        }
        return null;
    }

    h(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String strM10761 = C0096.m10761(C0103.m11135(m8436(), 0, 39, 2308));
        if (strM10761 != null) {
            try {
                j jVar = (j) C0090.m8610(j.class, m8435(C0105.m11284(strM10761, true, C0099.m10900(j.class))));
                C0104.m11236(jVar);
                C0099.m10918(m8437(this), jVar);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        C0104.m11236(new i());
        return null;
    }
}
