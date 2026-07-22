package j$.time;

import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class v {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int[] m8362() {
        if (C0087.m8458() < 0) {
            return b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢۥ, reason: not valid java name and contains not printable characters */
    public static int[] m8363() {
        if (C0097.m10823() > 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0087.m8487().length];
        b = iArr;
        try {
            iArr[C0105.m11258(C0106.m11311())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m8362()[C0105.m11258(C0094.m9152())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m8362()[C0105.m11258(C0087.m8495())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m8362()[C0105.m11258(C0095.m9214())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            m8362()[C0105.m11258(C0100.m10996())] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[C0103.m11144().length];
        a = iArr2;
        try {
            iArr2[C0105.m11258(C0092.m8764())] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            m8363()[C0105.m11258(C0104.m11201())] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            m8363()[C0105.m11258(C0091.m8664())] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
