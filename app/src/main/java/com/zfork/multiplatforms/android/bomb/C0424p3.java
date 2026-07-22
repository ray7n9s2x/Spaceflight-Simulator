package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.reflect.C0072;
import java.io.IOException;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0424p3 extends Z0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f354short = {2079, 2106, 2087, 2086, 2095, 2152, 2104, 2089, 2107, 2107, 2111, 2087, 2106, 2092, 2153};
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0424p3(x5 x5Var, P2 p2, char[] cArr, int i, boolean z, int i2) {
        super(x5Var, p2, cArr, i, z);
        this.e = i2;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7103() {
        if (C0029.m2791() > 0) {
            return f354short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.Z0
    public final InterfaceC0422p1 b(P2 p2, char[] cArr, boolean z) throws IOException {
        byte bM6110;
        switch (C0111.m13129(this)) {
            case 0:
                return new E();
            default:
                long jM6168 = C0072.m6168(p2);
                long jM1767 = C0022.m1767(p2);
                byte[] bArr = new byte[12];
                C0030.m2853(this, bArr);
                T t = new T(6);
                u5 u5Var = new u5();
                t.b = u5Var;
                String strM13097 = C0111.m13097(m7103(), 0, 15, 2120);
                if (cArr == null || cArr.length <= 0) {
                    throw new z5(strM13097);
                }
                int[] iArrM1609 = C0021.m1609(u5Var);
                iArrM1609[0] = 305419896;
                iArrM1609[1] = 591751049;
                iArrM1609[2] = 878082192;
                for (byte b : C0036.m3680(cArr, z)) {
                    C0073.m6432(u5Var, (byte) (b & 255));
                }
                int i = 0;
                byte b2 = bArr[0];
                while (i < 12) {
                    i++;
                    if (i == 12 && (bM6110 = (byte) (C0072.m6110(u5Var) ^ b2)) != ((byte) (jM6168 >> 24)) && bM6110 != ((byte) (jM1767 >> 8))) {
                        throw new z5(strM13097);
                    }
                    C0073.m6432(u5Var, (byte) (C0072.m6110(u5Var) ^ b2));
                    if (i != 12) {
                        b2 = bArr[i];
                    }
                }
                return t;
        }
    }
}
