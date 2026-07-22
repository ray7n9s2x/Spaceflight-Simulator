package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0388j3 implements PrivilegedAction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f338short = {2797, 2796, 2799, 2784, 2791, 2796, 2762, 2789, 2792, 2810, 2810, 1148, 1117, 1118, 1105, 1110, 1117, 1048, 1115, 1108, 1113, 1099, 1099, 1048, 1118, 1113, 1105, 1108, 1117, 1116, 1049};
    public final /* synthetic */ ClassLoader a;
    public final /* synthetic */ byte[] b;

    /* JADX INFO: renamed from: ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7082() {
        if (C0034.m3450() >= 0) {
            return f338short;
        }
        return null;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        byte[] bArrM1906 = C0023.m1906(this);
        try {
            String strM1189 = C0019.m1189(m7082(), 0, 11, 2697);
            Class clsM6191 = C0072.m6191();
            Method methodM6369 = C0073.m6369(ClassLoader.class, strM1189, new Class[]{String.class, byte[].class, clsM6191, clsM6191});
            C0035.m3619(methodM6369, true);
            return (Class) C0070.m5924(methodM6369, C0020.m1343(this), new Object[]{C0038.m3997(AbstractC0406m3.class), bArrM1906, C0021.m1548(0), C0021.m1548(bArrM1906.length)});
        } catch (Exception e) {
            throw new IllegalStateException(C0034.m3431(m7082(), 11, 20, 1080), e);
        }
    }

    public C0388j3(ClassLoader classLoader, byte[] bArr) {
        this.a = classLoader;
        this.b = bArr;
    }
}
