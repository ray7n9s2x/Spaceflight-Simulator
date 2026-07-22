package j$.time.chrono;

import j$.time.C0092;
import j$.time.zone.C0088;
import j$.util.C0100;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class H {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۨۥۡۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7654() {
        if (C0100.m10983() > 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0103.m11144().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0088.m8511())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m7654()[C0105.m11258(C0092.m8764())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m7654()[C0105.m11258(C0104.m11201())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
