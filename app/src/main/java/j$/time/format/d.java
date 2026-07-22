package j$.time.format;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class d {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int[] m7880() {
        if (C0079.m7512() >= 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0081.m7841().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0095.m9164())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m7880()[C0105.m11258(C0103.m11136())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m7880()[C0105.m11258(C0106.m11315())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m7880()[C0105.m11258(C0094.m9126())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
