package com.zfork.multiplatforms.android.bomb;

import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends U {
    public ArrayList b;
    public HashMap c;
    public ArrayList d;
    public HashMap e;
    public ArrayList f;
    public ArrayList g;
    public W4 h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f295short = {913, 904, 925, 924, 943, 913, 901, 900, 927, 943, 981, 960, 962, 916, 1940, 1941, 1927, 2028, 2041, 2856, 2857, 2875, 2896, 2892, 2891, 2865, 2872};
    public static final C0376h3 i = new C0376h3(2);

    /* JADX INFO: renamed from: ۟ۥۨۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7019() {
        if (C0019.m1311() >= 0) {
            return f295short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void c() {
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final AbstractC0441s3 b(String str, String str2) {
        W w = new W(str, str2);
        C0017.m919(C0038.m3955(this), w);
        return w;
    }

    @Override // com.zfork.multiplatforms.android.bomb.U
    public final void f(String str, int i2, String str2) {
        C0038.m3969(C0034.m3401(this), str2, new X(str == null ? null : new V4(str), new V4(str2), i2));
    }

    public final byte[] g() throws IOException {
        ArrayList arrayListM3955 = C0038.m3955(this);
        Iterator itM4154 = C0039.m4154(arrayListM3955);
        int iM4380 = 0;
        while (C0036.m3657(itM4154)) {
            iM4380 += C0063.m4380((W) C0071.m6012(itM4154), this);
        }
        HashMap mapM3401 = C0034.m3401(this);
        Iterator itM2001 = C0024.m2001(C0025.m2117(mapM3401));
        int i2 = 0;
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            X x = (X) C0019.m1293(entry);
            if (x == null) {
                x = new X(null, new V4((String) C0063.m4368(entry)), 0);
                C0033.m3283(entry, x);
            }
            if (C0037.m3841(x) == null) {
                x.b = new V4(C0021.m1531(C0031.m3047(m7019(), 0, 14, PointerIconCompat.TYPE_TEXT), new Object[]{C0021.m1548(i2)}));
                i2++;
            }
            x.b = C0018.m979(this, C0037.m3841(x));
            x.c = C0018.m979(this, C0020.m1452(x));
        }
        int iM3811 = (C0037.m3811(mapM3401) * 48) + iM4380;
        ArrayList arrayListM1284 = C0019.m1284(this);
        W4 w4M5999 = C0071.m5999(this);
        C0032.m3119(w4M5999, arrayListM1284);
        this.g = null;
        C0032.m3119(w4M5999, C0068.m5660(this));
        this.d = null;
        Iterator itM1066 = C0018.m1066(w4M5999);
        while (C0036.m3657(itM1066)) {
            if (C0078.m7380(C0067.m5444((V4) C0071.m6012(itM1066))) > 32767) {
                w4M5999.b = false;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0066.m4808(byteArrayOutputStream);
        HashMap map = new HashMap();
        Iterator itM10662 = C0018.m1066(w4M5999);
        int i3 = 0;
        int length = 0;
        while (C0036.m3657(itM10662)) {
            V4 v4 = (V4) C0071.m6012(itM10662);
            int i4 = i3 + 1;
            v4.c = i3;
            String strM5444 = C0067.m5444(v4);
            Integer num = (Integer) C0067.m5420(map, strM5444);
            if (num != null) {
                v4.b = C0025.m2170(num);
            } else {
                v4.b = length;
                C0038.m3969(map, strM5444, C0021.m1548(length));
                if (C0026.m2258(w4M5999)) {
                    int iM7380 = C0078.m7380(strM5444);
                    byte[] bArrM1344 = C0020.m1344(strM5444, C0072.m6116(m7019(), 14, 5, 1985));
                    int length2 = bArrM1344.length;
                    if (iM7380 > 127) {
                        length++;
                        C0070.m5921(byteArrayOutputStream, (iM7380 >> 8) | 128);
                    }
                    C0070.m5921(byteArrayOutputStream, iM7380);
                    if (length2 > 127) {
                        length++;
                        C0070.m5921(byteArrayOutputStream, (length2 >> 8) | 128);
                    }
                    C0070.m5921(byteArrayOutputStream, length2);
                    C0033.m3292(byteArrayOutputStream, bArrM1344);
                    C0070.m5921(byteArrayOutputStream, 0);
                    length += length2 + 3;
                } else {
                    int iM73802 = C0078.m7380(strM5444);
                    byte[] bArrM13442 = C0020.m1344(strM5444, C0033.m3330(m7019(), 19, 8, 2941));
                    if (iM73802 > 32767) {
                        int i5 = (iM73802 >> 16) | 32768;
                        C0070.m5921(byteArrayOutputStream, i5);
                        C0070.m5921(byteArrayOutputStream, i5 >> 8);
                        length += 2;
                    }
                    C0070.m5921(byteArrayOutputStream, iM73802);
                    C0070.m5921(byteArrayOutputStream, iM73802 >> 8);
                    C0033.m3292(byteArrayOutputStream, bArrM13442);
                    C0070.m5921(byteArrayOutputStream, 0);
                    C0070.m5921(byteArrayOutputStream, 0);
                    length += bArrM13442.length + 4;
                    i3 = i4;
                }
            }
            i3 = i4;
        }
        w4M5999.a = C0077.m7297(byteArrayOutputStream);
        int iM1847 = (C0023.m1847(w4M5999) * 4) + 20 + C0026.m2296(w4M5999).length;
        int i6 = iM1847 % 4;
        if (i6 != 0) {
            iM1847 += 4 - i6;
        }
        ArrayList arrayListM1001 = C0018.m1001(this);
        int iM1084 = (C0018.m1084(arrayListM1001) * 4) + 8 + iM1847 + 8 + iM3811 + 8;
        ByteBuffer byteBufferM4604 = C0064.m4604(C0035.m3516(iM1084), C0072.m6217());
        C0038.m4018(byteBufferM4604, 524291);
        C0038.m4018(byteBufferM4604, iM1084);
        int iM18472 = (C0023.m1847(w4M5999) * 4) + 20 + C0026.m2296(w4M5999).length;
        int i7 = iM18472 % 4;
        int i8 = i7 != 0 ? 4 - i7 : 0;
        C0038.m4018(byteBufferM4604, 1835009);
        C0038.m4018(byteBufferM4604, iM18472 + i8 + 8);
        C0038.m4018(byteBufferM4604, C0023.m1847(w4M5999));
        C0038.m4018(byteBufferM4604, 0);
        C0038.m4018(byteBufferM4604, C0026.m2258(w4M5999) ? 256 : 0);
        C0038.m4018(byteBufferM4604, (C0023.m1847(w4M5999) * 4) + 28);
        C0038.m4018(byteBufferM4604, 0);
        Iterator itM10663 = C0018.m1066(w4M5999);
        while (C0036.m3657(itM10663)) {
            C0038.m4018(byteBufferM4604, C0077.m7280((V4) C0071.m6012(itM10663)));
        }
        C0068.m5569(byteBufferM4604, C0026.m2296(w4M5999));
        C0068.m5569(byteBufferM4604, new byte[i8]);
        C0038.m4018(byteBufferM4604, 524672);
        C0038.m4018(byteBufferM4604, (C0018.m1084(arrayListM1001) * 4) + 8);
        Iterator itM41542 = C0039.m4154(arrayListM1001);
        while (C0036.m3657(itM41542)) {
            C0038.m4018(byteBufferM4604, C0025.m2170((Integer) C0071.m6012(itM41542)));
        }
        Stack stack = new Stack();
        Iterator itM20012 = C0024.m2001(C0025.m2117(mapM3401));
        while (C0036.m3657(itM20012)) {
            X x2 = (X) C0019.m1293((Map.Entry) C0071.m6012(itM20012));
            C0075.m6863(stack, x2);
            C0038.m4018(byteBufferM4604, 1048832);
            C0038.m4018(byteBufferM4604, 24);
            C0038.m4018(byteBufferM4604, -1);
            C0038.m4018(byteBufferM4604, -1);
            C0038.m4018(byteBufferM4604, C0072.m6138(C0037.m3841(x2)));
            C0038.m4018(byteBufferM4604, C0072.m6138(C0020.m1452(x2)));
        }
        Iterator itM41543 = C0039.m4154(arrayListM3955);
        while (C0036.m3657(itM41543)) {
            C0072.m6114((W) C0071.m6012(itM41543), byteBufferM4604);
        }
        while (C0023.m1847(stack) > 0) {
            X x3 = (X) C0017.m921(stack);
            C0038.m4018(byteBufferM4604, 1048833);
            C0038.m4018(byteBufferM4604, 24);
            C0038.m4018(byteBufferM4604, C0066.m4842(x3));
            C0038.m4018(byteBufferM4604, -1);
            C0038.m4018(byteBufferM4604, C0072.m6138(C0037.m3841(x3)));
            C0038.m4018(byteBufferM4604, C0072.m6138(C0020.m1452(x3)));
        }
        return C0027.m2445(byteBufferM4604);
    }

    public final V4 h(V4 v4) {
        if (v4 == null) {
            return null;
        }
        int iM2155 = C0025.m2155(C0068.m5660(this), v4);
        if (iM2155 >= 0) {
            return (V4) C0064.m4526(C0068.m5660(this), iM2155);
        }
        V4 v42 = new V4(C0067.m5444(v4));
        C0017.m919(C0068.m5660(this), v42);
        return v42;
    }
}
