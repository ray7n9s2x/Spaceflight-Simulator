package j$.time;

import j$.sun.misc.C0079;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class f {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    /* JADX INFO: renamed from: ۟ۦۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int[] m7868() {
        if (C0088.m8503() >= 0) {
            return a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int[] m7869() {
        if (C0079.m7512() >= 0) {
            return b;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0087.m8487().length];
        b = iArr;
        try {
            iArr[C0105.m11258(C0086.m8322())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m7869()[C0105.m11258(C0087.m8490())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m7869()[C0105.m11258(C0088.m8505())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m7869()[C0105.m11258(C0086.m8283())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            m7869()[C0105.m11258(C0095.m9194())] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            m7869()[C0105.m11258(C0085.m8251())] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            m7869()[C0105.m11258(C0103.m11180())] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            m7869()[C0105.m11258(C0095.m9215())] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[C0103.m11144().length];
        a = iArr2;
        try {
            iArr2[C0105.m11258(C0090.m8604())] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            m7868()[C0105.m11258(C0085.m8233())] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            m7868()[C0105.m11258(C0086.m8305())] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            m7868()[C0105.m11258(C0101.m11033())] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
