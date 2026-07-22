package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements InterfaceC0477y3, InterfaceC0422p1, v5 {
    public static E a;
    public static boolean c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f239short = {1311, 1374, 1284, 1292, 1292, 1292, 1292, 1292, 1292, 2578, 2563, 2568, 2647, 2647, 2647, 2647, 2647, 2647, 1173, 1159, 1168, 1155, 1222, 1174, 1162, 1159, 1160, 1244, 1222, 629, 609, 608, 635, 631, 632, 637, 631, 639};
    public static final E b = new E();

    /* JADX INFO: renamed from: ۣۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6920() {
        if (C0025.m2132() > 0) {
            return f239short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0422p1
    public int b(int i, byte[] bArr, int i2) {
        return i2;
    }

    @Override // com.zfork.multiplatforms.android.bomb.v5
    public String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 0) {
                break;
            }
            C0077.m7289(sb, (char) (b2 & 255));
        }
        return C0068.m5536(sb);
    }

    public int d(int i, byte[] bArr, int i2) {
        return i2;
    }

    public synchronized boolean h() {
        return C0020.m1403();
    }

    public synchronized void i() {
        if (C0020.m1403()) {
            try {
                C0072.m6202(C0072.m6135(), true);
            } catch (Throwable unused) {
            }
        }
    }

    public static ShapeDrawable e(Context context) {
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C0035.m3620(8, context);
            fArr2[i] = C0035.m3620(8, context);
        }
        float f = 0;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(f, f, f, f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0016.m625(m6920(), 0, 9, 1340)));
        return shapeDrawable;
    }

    public static ShapeDrawable f(Context context) {
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C0035.m3620(6, context);
            fArr2[i] = C0035.m3620(6, context);
        }
        float f = 0;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(f, f, f, f), fArr2));
        C0026.m2303(C0034.m3383(shapeDrawable), C0031.m2985(C0026.m2321(m6920(), 9, 9, 2609)));
        return shapeDrawable;
    }

    public static E j() {
        if (C0023.m1808() == null) {
            synchronized (E.class) {
                try {
                    if (C0023.m1808() == null) {
                        a = new E();
                    }
                } finally {
                }
            }
        }
        return C0023.m1808();
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0477y3
    public void a(Object obj) {
        StringBuilder sb = new StringBuilder(C0025.m2151(m6920(), 18, 11, 1254));
        C0077.m7290(sb, (String) obj);
        C0023.m1864(C0020.m1443(m6920(), 29, 9, 532), C0068.m5536(sb));
    }

    public static Drawable g(String str) {
        return C0021.m1589(C0024.m2031(), str);
    }
}
