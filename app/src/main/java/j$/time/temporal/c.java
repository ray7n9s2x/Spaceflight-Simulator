package j$.time.temporal;

import j$.time.C0091;
import j$.util.C0102;
import j$.util.stream.C0097;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class c {
    static final /* synthetic */ int[] a;

    /* JADX INFO: renamed from: ۟۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int[] m8193() {
        if (C0102.m11109() <= 0) {
            return a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static i[] m8194() {
        if (C0097.m10823() > 0) {
            return i.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۥ, reason: not valid java name and contains not printable characters */
    public static i m8195() {
        if (C0091.m8708() > 0) {
            return i.QUARTER_YEARS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۤۧ, reason: not valid java name and contains not printable characters */
    public static i m8196() {
        if (C0105.m11264() >= 0) {
            return i.WEEK_BASED_YEARS;
        }
        return null;
    }

    static {
        int[] iArr = new int[m8194().length];
        a = iArr;
        try {
            iArr[C0105.m11258(m8196())] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            m8193()[C0105.m11258(m8195())] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
