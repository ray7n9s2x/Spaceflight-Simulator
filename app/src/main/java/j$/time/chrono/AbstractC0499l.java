package j$.time.chrono;

import j$.time.zone.C0088;
import j$.util.C0101;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.time.chrono.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0499l {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۦ۟ۥ۠, reason: contains not printable characters */
    public static int[] m7709() {
        if (C0104.m11196() > 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0103.m11144().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0101.m11033())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m7709()[C0105.m11258(C0088.m8508())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
