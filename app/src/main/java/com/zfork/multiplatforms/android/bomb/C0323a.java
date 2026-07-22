package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.google.common.base.Ascii;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.ByteArrayOutputStream;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0323a implements InterfaceC0422p1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f300short = {1057, 1083, 1082, 1086, 1083, 1082, 1134, 1068, 1083, 1064, 1064, 1067, 1084, 1134, 1082, 1057, 1057, 1134, 1085, 1062, 1057, 1084, 1082, 2276, 2275, 2301, 2296, 2297, 2221, 2287, 2296, 2283, 2283, 2280, 2303, 2221, 2297, 2274, 2274, 2221, 2302, 2277, 2274, 2303, 2297, 1483, 1487, 1497, 1450, 1519, 1508, 1517, 1507, 1508, 1519, 1450, 1508, 1509, 1534, 1450, 1507, 1508, 1507, 1534, 1507, 1515, 1510, 1507, 1529, 1519, 1518};
    public C0330b a;
    public Q2 b;
    public int c;
    public byte[] d;
    public byte[] e;

    /* JADX INFO: renamed from: ۨ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7025() {
        if (C0036.m3653() < 0) {
            return f300short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0422p1
    public final int b(int i, byte[] bArr, int i2) throws z5 {
        int[] iArrM3217;
        C0323a c0323a = this;
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return i2;
            }
            int i5 = i3 + 16;
            int i6 = i5 <= i4 ? 16 : i4 - i3;
            Q2 q2M5548 = C0068.m5548(c0323a);
            ByteArrayOutputStream byteArrayOutputStreamM6883 = C0075.m6883(q2M5548);
            try {
                if (C0069.m5716(byteArrayOutputStreamM6883) + i6 > 4096) {
                    C0077.m7199(q2M5548, 0);
                }
                C0067.m5408(byteArrayOutputStreamM6883, bArr, i3, i6);
                int iM6580 = C0074.m6580(c0323a);
                byte[] bArrM13171 = C0111.m13171(c0323a);
                C0072.m6200(iM6580, bArrM13171);
                C0330b c0330bM1709 = C0022.m1709(c0323a);
                byte[] bArrM3084 = C0031.m3084(c0323a);
                int[][] iArrM6897 = C0075.m6897(c0330bM1709);
                if (iArrM6897 == null) {
                    throw new z5(C0026.m2321(m7025(), 45, 26, 1418));
                }
                int i7 = 16;
                if (16 > bArrM13171.length) {
                    throw new z5(C0075.m6791(m7025(), 23, 22, 2189));
                }
                if (16 > bArrM3084.length) {
                    throw new z5(C0034.m3431(m7025(), 0, 23, 1102));
                }
                int i8 = bArrM13171[0] & 255;
                c0330bM1709.c = i8;
                int i9 = i8 | ((bArrM13171[1] & 255) << 8);
                c0330bM1709.c = i9;
                int i10 = i9 | ((bArrM13171[2] & 255) << 16);
                c0330bM1709.c = i10;
                int i11 = i10 | (bArrM13171[3] << Ascii.CAN);
                c0330bM1709.c = i11;
                int i12 = bArrM13171[4] & 255;
                c0330bM1709.d = i12;
                int i13 = ((bArrM13171[5] & 255) << 8) | i12;
                c0330bM1709.d = i13;
                int i14 = ((bArrM13171[6] & 255) << 16) | i13;
                c0330bM1709.d = i14;
                int i15 = i14 | (bArrM13171[7] << Ascii.CAN);
                c0330bM1709.d = i15;
                int i16 = bArrM13171[8] & 255;
                c0330bM1709.e = i16;
                int i17 = i16 | ((bArrM13171[9] & 255) << 8);
                c0330bM1709.e = i17;
                int i18 = i17 | ((bArrM13171[10] & 255) << 16);
                c0330bM1709.e = i18;
                int i19 = i18 | (bArrM13171[11] << Ascii.CAN);
                c0330bM1709.e = i19;
                int i20 = bArrM13171[12] & 255;
                c0330bM1709.f = i20;
                int i21 = ((bArrM13171[13] & 255) << 8) | i20;
                c0330bM1709.f = i21;
                int i22 = i21 | ((bArrM13171[14] & 255) << 16);
                c0330bM1709.f = i22;
                int i23 = (bArrM13171[15] << Ascii.CAN) | i22;
                c0330bM1709.f = i23;
                int[] iArr = iArrM6897[0];
                c0330bM1709.c = i11 ^ iArr[0];
                c0330bM1709.d = i15 ^ iArr[1];
                c0330bM1709.e = i19 ^ iArr[2];
                c0330bM1709.f = i23 ^ iArr[3];
                int i24 = 1;
                while (true) {
                    int iM6007 = C0071.m6007(c0330bM1709) - 1;
                    iArrM3217 = C0032.m3217();
                    if (i24 >= iM6007) {
                        break;
                    }
                    int iM2789 = (((iArrM3217[C0071.m5966(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0065.m4787(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0039.m4106(c0330bM1709) >> i7) & 255], i7)) ^ C0029.m2789(iArrM3217[(C0021.m1595(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][0];
                    int iM27892 = (((iArrM3217[C0065.m4787(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0039.m4106(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0021.m1595(c0330bM1709) >> i7) & 255], i7)) ^ C0029.m2789(iArrM3217[(C0071.m5966(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][1];
                    int iM27893 = (((iArrM3217[C0039.m4106(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0021.m1595(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0071.m5966(c0330bM1709) >> i7) & 255], i7)) ^ C0029.m2789(iArrM3217[(C0065.m4787(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][2];
                    int i25 = i24 + 1;
                    int iM27894 = (((C0029.m2789(iArrM3217[(C0071.m5966(c0330bM1709) >> 8) & 255], 24) ^ iArrM3217[C0021.m1595(c0330bM1709) & 255]) ^ C0029.m2789(iArrM3217[(C0065.m4787(c0330bM1709) >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(C0039.m4106(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][3];
                    c0330bM1709.c = (((iArrM3217[iM2789 & 255] ^ C0029.m2789(iArrM3217[(iM27892 >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(iM27893 >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(iM27894 >> 24) & 255], 8)) ^ iArrM6897[i25][0];
                    c0330bM1709.d = (((iArrM3217[iM27892 & 255] ^ C0029.m2789(iArrM3217[(iM27893 >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(iM27894 >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(iM2789 >> 24) & 255], 8)) ^ iArrM6897[i25][1];
                    c0330bM1709.e = (((iArrM3217[iM27893 & 255] ^ C0029.m2789(iArrM3217[(iM27894 >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(iM2789 >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(iM27892 >> 24) & 255], 8)) ^ iArrM6897[i25][2];
                    i24 += 2;
                    c0330bM1709.f = (((iArrM3217[iM27894 & 255] ^ C0029.m2789(iArrM3217[(iM2789 >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(iM27892 >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(iM27893 >> 24) & 255], 8)) ^ iArrM6897[i25][3];
                    i7 = 16;
                    i5 = i5;
                }
                int i26 = i5;
                int iM27895 = (((iArrM3217[C0071.m5966(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0065.m4787(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0039.m4106(c0330bM1709) >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(C0021.m1595(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][0];
                int iM27896 = (((iArrM3217[C0065.m4787(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0039.m4106(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0021.m1595(c0330bM1709) >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(C0071.m5966(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][1];
                int iM27897 = (((iArrM3217[C0039.m4106(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0021.m1595(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0071.m5966(c0330bM1709) >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(C0065.m4787(c0330bM1709) >> 24) & 255], 8)) ^ iArrM6897[i24][2];
                int iM27898 = ((iArrM3217[C0021.m1595(c0330bM1709) & 255] ^ C0029.m2789(iArrM3217[(C0071.m5966(c0330bM1709) >> 8) & 255], 24)) ^ C0029.m2789(iArrM3217[(C0065.m4787(c0330bM1709) >> 16) & 255], 16)) ^ C0029.m2789(iArrM3217[(C0039.m4106(c0330bM1709) >> 24) & 255], 8);
                int i27 = i24 + 1;
                int i28 = iArrM6897[i24][3] ^ iM27898;
                byte[] bArrM4672 = C0065.m4672();
                int i29 = (((bArrM4672[iM27895 & 255] & 255) ^ ((bArrM4672[(iM27896 >> 8) & 255] & 255) << 8)) ^ ((bArrM4672[(iM27897 >> 16) & 255] & 255) << 16)) ^ (bArrM4672[(i28 >> 24) & 255] << Ascii.CAN);
                int[] iArr2 = iArrM6897[i27];
                int i30 = i29 ^ iArr2[0];
                c0330bM1709.c = i30;
                int i31 = ((((bArrM4672[iM27896 & 255] & 255) ^ ((bArrM4672[(iM27897 >> 8) & 255] & 255) << 8)) ^ ((bArrM4672[(i28 >> 16) & 255] & 255) << 16)) ^ (bArrM4672[(iM27895 >> 24) & 255] << Ascii.CAN)) ^ iArr2[1];
                c0330bM1709.d = i31;
                int i32 = ((((bArrM4672[iM27897 & 255] & 255) ^ ((bArrM4672[(i28 >> 8) & 255] & 255) << 8)) ^ ((bArrM4672[(iM27895 >> 16) & 255] & 255) << 16)) ^ (bArrM4672[(iM27896 >> 24) & 255] << Ascii.CAN)) ^ iArr2[2];
                c0330bM1709.e = i32;
                int i33 = (((((bArrM4672[(iM27895 >> 8) & 255] & 255) << 8) ^ (bArrM4672[i28 & 255] & 255)) ^ ((bArrM4672[(iM27896 >> 16) & 255] & 255) << 16)) ^ (bArrM4672[(iM27897 >> 24) & 255] << Ascii.CAN)) ^ iArr2[3];
                c0330bM1709.f = i33;
                bArrM3084[0] = (byte) i30;
                bArrM3084[1] = (byte) (i30 >> 8);
                bArrM3084[2] = (byte) (i30 >> 16);
                bArrM3084[3] = (byte) (i30 >> 24);
                bArrM3084[4] = (byte) i31;
                bArrM3084[5] = (byte) (i31 >> 8);
                bArrM3084[6] = (byte) (i31 >> 16);
                bArrM3084[7] = (byte) (i31 >> 24);
                bArrM3084[8] = (byte) i32;
                bArrM3084[9] = (byte) (i32 >> 8);
                bArrM3084[10] = (byte) (i32 >> 16);
                bArrM3084[11] = (byte) (i32 >> 24);
                bArrM3084[12] = (byte) i33;
                bArrM3084[13] = (byte) (i33 >> 8);
                bArrM3084[14] = (byte) (i33 >> 16);
                bArrM3084[15] = (byte) (i33 >> 24);
                for (int i34 = 0; i34 < i6; i34++) {
                    int i35 = i3 + i34;
                    bArr[i35] = (byte) (bArr[i35] ^ bArrM3084[i34]);
                }
                c0323a = this;
                c0323a.c = C0074.m6580(c0323a) + 1;
                i3 = i26;
            } catch (IllegalStateException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
