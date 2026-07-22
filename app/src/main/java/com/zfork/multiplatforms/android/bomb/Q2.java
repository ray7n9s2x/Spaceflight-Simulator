package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.zip.C0033;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class Q2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f275short = {1986, 2023, 2027, 2025, 2009, 1986, 1995, 1979, 1600, 1637, 1641, 1643, 1627, 1600, 1609, 1593};
    public final Mac a;
    public final int b;
    public final ByteArrayOutputStream c;

    /* JADX INFO: renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6999() {
        if (C0018.m1064() >= 0) {
            return f275short;
        }
        return null;
    }

    public Q2() {
        String strM1070 = C0018.m1070(m6999(), 0, 8, 1930);
        this.c = new ByteArrayOutputStream(4096);
        try {
            Mac macM7317 = C0078.m7317(strM1070);
            this.a = macM7317;
            this.b = C0033.m3372(macM7317);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(int i) {
        ByteArrayOutputStream byteArrayOutputStreamM6883 = C0075.m6883(this);
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStreamM6883);
        int length = bArrM7297.length - i;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 16;
            C0071.m6063(C0025.m2116(this), bArrM7297, i2, i3 <= length ? 16 : length - i2);
            i2 = i3;
        }
        C0066.m4808(byteArrayOutputStreamM6883);
    }

    public final void b(byte[] bArr) {
        try {
            C0077.m7243(C0025.m2116(this), new SecretKeySpec(bArr, C0033.m3330(m6999(), 8, 8, 1544)));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}
