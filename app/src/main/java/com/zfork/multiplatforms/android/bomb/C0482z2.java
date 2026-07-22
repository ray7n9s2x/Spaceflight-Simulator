package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.reflect.C0072;
import j$.util.Objects;
import j$.util.stream.BaseStream;
import j$.util.stream.Stream;
import java.io.Closeable;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0482z2 implements Closeable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f380short = {854, 855, 862, 855, 853, 851, 838, 855};
    public final Stream a;

    /* JADX INFO: renamed from: ۠ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static void m7149(Object obj) {
        if (C0072.m6216() >= 0) {
            ((BaseStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡۥۢ۟, reason: not valid java name and contains not printable characters */
    public static Stream m7150() {
        if (C0036.m3653() < 0) {
            return Stream.CC.empty();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7151() {
        if (C0027.m2460() > 0) {
            return f380short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m7152(Object obj, Object obj2) {
        if (C0023.m1921() >= 0) {
            return Objects.requireNonNull(obj, (String) obj2);
        }
        return null;
    }

    public static C0482z2 a(Stream stream) {
        return stream != null ? new C0482z2(stream) : C0063.m4303(m7150());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m7149(C0028.m2568(this));
    }

    public C0482z2(Stream stream) {
        m7152(stream, C0030.m2840(m7151(), 0, 8, 818));
        this.a = stream;
    }
}
