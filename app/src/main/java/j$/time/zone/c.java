package j$.time.zone;

import j$.util.function.C0094;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class c {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۟ۥۤۦۥ, reason: not valid java name and contains not printable characters */
    public static int[] m8398() {
        if (C0088.m8503() > 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0094.m9120().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0087.m8468())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m8398()[C0105.m11258(C0105.m11305())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
