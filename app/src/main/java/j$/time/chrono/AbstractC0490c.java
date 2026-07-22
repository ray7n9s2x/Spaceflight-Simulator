package j$.time.chrono;

import j$.time.C0089;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0490c {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7668() {
        if (C0083.m8022() <= 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0087.m8487().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0095.m9215())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m7668()[C0105.m11258(C0083.m8020())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m7668()[C0105.m11258(C0089.m8599())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m7668()[C0105.m11258(C0106.m11311())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            m7668()[C0105.m11258(C0094.m9152())] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            m7668()[C0105.m11258(C0087.m8495())] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            m7668()[C0105.m11258(C0095.m9214())] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            m7668()[C0105.m11258(C0100.m10996())] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
