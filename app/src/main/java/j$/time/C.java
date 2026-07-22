package j$.time;

import j$.time.zone.C0088;
import j$.util.C0101;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class C {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۣ۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static int[] m7601() {
        if (C0103.m11154() < 0) {
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
            m7601()[C0105.m11258(C0088.m8508())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
