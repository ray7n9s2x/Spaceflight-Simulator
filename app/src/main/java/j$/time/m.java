package j$.time;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class m {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۟ۢۡۥۡ, reason: not valid java name and contains not printable characters */
    public static int[] m8164() {
        if (C0105.m11264() >= 0) {
            return a;
        }
        return null;
    }

    static {
        int[] iArr = new int[C0088.m8557().length];
        a = iArr;
        try {
            iArr[C0105.m11258(C0086.m8316())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m8164()[C0105.m11258(C0082.m8001())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m8164()[C0105.m11258(C0089.m8588())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m8164()[C0105.m11258(C0091.m8676())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            m8164()[C0105.m11258(C0079.m7478())] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            m8164()[C0105.m11258(C0103.m11132())] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            m8164()[C0105.m11258(C0095.m9187())] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            m8164()[C0105.m11258(C0100.m10976())] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            m8164()[C0105.m11258(C0081.m7798())] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            m8164()[C0105.m11258(C0103.m11160())] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            m8164()[C0105.m11258(C0104.m11229())] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            m8164()[C0105.m11258(C0103.m11139())] = 12;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
