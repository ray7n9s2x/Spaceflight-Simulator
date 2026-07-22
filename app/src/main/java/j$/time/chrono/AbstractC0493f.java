package j$.time.chrono;

import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0493f {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۣۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int[] m7683() {
        if (C0105.m11264() >= 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0087.m8487().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0086.m8322())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m7683()[C0105.m11258(C0087.m8490())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m7683()[C0105.m11258(C0088.m8505())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m7683()[C0105.m11258(C0086.m8283())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            m7683()[C0105.m11258(C0095.m9194())] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            m7683()[C0105.m11258(C0085.m8251())] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            m7683()[C0105.m11258(C0103.m11180())] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
