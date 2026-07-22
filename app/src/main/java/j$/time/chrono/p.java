package j$.time.chrono;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0084;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class p {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7734() {
        if (C0080.m7553() >= 0) {
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
            m7734()[C0105.m11258(C0090.m8620())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            m7734()[C0105.m11258(C0091.m8699())] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            m7734()[C0105.m11258(C0104.m11201())] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            m7734()[C0105.m11258(C0092.m8764())] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            m7734()[C0105.m11258(C0091.m8664())] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
