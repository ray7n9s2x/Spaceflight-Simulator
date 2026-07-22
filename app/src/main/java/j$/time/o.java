package j$.time;

import j$.time.format.C0084;
import j$.util.function.C0094;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class o {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۧۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int[] m8165() {
        if (C0103.m11154() < 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0103.m11144().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0084.m8118())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m8165()[C0105.m11258(C0094.m9136())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
