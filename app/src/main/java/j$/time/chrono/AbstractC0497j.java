package j$.time.chrono;

import j$.time.zone.C0088;
import j$.util.C0101;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0497j {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۤۢۢۦ, reason: not valid java name and contains not printable characters */
    public static int[] m7708() {
        if (C0081.m7818() < 0) {
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
            m7708()[C0105.m11258(C0088.m8508())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
