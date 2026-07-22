package j$.util;

import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.util.Map;

/* JADX INFO: renamed from: j$.util.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0514n implements Map.Entry {
    private Map.Entry a;

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static Map.Entry m9284(Object obj) {
        if (C0101.m11044() < 0) {
            return ((C0514n) obj).a;
        }
        return null;
    }

    C0514n(Map.Entry entry) {
        this.a = (Map.Entry) C0099.m10863(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return C0099.m10870(m9284(this));
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return C0096.m10785(m9284(this));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return C0097.m10825(m9284(this));
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zM8250;
        boolean zM82502;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entryM9284 = m9284(this);
        Object objM10870 = C0099.m10870(entryM9284);
        Object objM108702 = C0099.m10870(entry);
        if (objM10870 == null) {
            zM8250 = objM108702 == null;
        } else {
            zM8250 = C0085.m8250(objM10870, objM108702);
        }
        if (zM8250) {
            Object objM10785 = C0096.m10785(entryM9284);
            Object objM107852 = C0096.m10785(entry);
            if (objM10785 == null) {
                zM82502 = objM107852 == null;
            } else {
                zM82502 = C0085.m8250(objM10785, objM107852);
            }
            if (zM82502) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0087.m8479(m9284(this));
    }
}
