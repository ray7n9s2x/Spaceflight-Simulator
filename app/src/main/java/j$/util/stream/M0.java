package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0091;
import j$.util.C0100;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class M0 {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۤۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int[] m9567() {
        if (C0098.m10857() < 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0100.m10971().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0091.m8670())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m9567()[C0105.m11258(C0079.m7521())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m9567()[C0105.m11258(C0097.m10843())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m9567()[C0105.m11258(C0079.m7527())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
