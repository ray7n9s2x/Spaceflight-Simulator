package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class W3 extends AbstractC0390k {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f293short = {1685, 791, 1364, 1400, 1378, 1403, 1395, 1335, 1401, 1400, 1379, 1335, 1381, 1394, 1402, 1400, 1377, 1394, 1335, 1394, 1401, 1379, 1381, 1390, 1335, 1393, 1381, 1400, 1402, 1335, 1403, 1406, 1380, 1379, 1335, 1400, 1393, 1335, 1396, 1394, 1401, 1379, 1381, 1398, 1403, 1335, 1395, 1406, 1381, 1394, 1396, 1379, 1400, 1381, 1390, 1335, 1407, 1394, 1398, 1395, 1394, 1381, 1380, 774, 826, 827, 801, 882, 827, 801, 882, 819, 882, 801, 802, 830, 827, 806, 882, 819, 800, 817, 826, 827, 804, 823, 892, 882, 776, 827, 802, 882, 820, 827, 830, 823, 882, 820, 829, 800, 831, 819, 806, 882, 822, 829, 823, 801, 882, 828, 829, 806, 882, 819, 830, 830, 829, 805, 882, 807, 802, 822, 819, 806, 827, 828, 821, 882, 801, 802, 830, 827, 806, 893, 801, 802, 819, 828, 828, 823, 822, 882, 820, 827, 830, 823, 801, 494, 493, 492, 485, 418, 493, 500, 487, 496, 484, 494, 493, 501};
    public final D5 b;
    public final C0387j2 c;

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static short[] m7017() {
        if (C0023.m1921() > 0) {
            return f293short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0396l
    public final void b(AbstractC0396l abstractC0396l, N3 n3) throws Throwable {
        Throwable th;
        ArrayList arrayList;
        V3 v3 = (V3) abstractC0396l;
        D5 d5M3846 = C0037.m3846(this);
        if (C0074.m6512(d5M3846)) {
            throw new z5(C0021.m1650(m7017(), 63, 84, 850));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itM4732 = C0065.m4732(C0024.m2052(v3));
        while (C0036.m3657(itM4732)) {
            String str = (String) C0071.m6012(itM4732);
            if (C0018.m972(d5M3846, str) != null) {
                C0017.m919(arrayList2, str);
            }
        }
        if (C0066.m4881(arrayList2)) {
            return;
        }
        File fileM3488 = C0034.m3488(C0078.m7365(C0063.m4386(d5M3846)));
        boolean z = false;
        try {
            Q4 q4 = new Q4(fileM3488);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(C0063.m4386(d5M3846), C0039.m4066(m7017(), 0, 1, 1767));
                try {
                    ArrayList arrayList3 = new ArrayList(C0030.m2889(C0020.m1447(d5M3846)));
                    C0039.m4063(arrayList3, new C0376h3(1));
                    Iterator itM4154 = C0039.m4154(arrayList3);
                    long j = 0;
                    while (true) {
                        boolean zM3657 = C0036.m3657(itM4154);
                        q5 q5Var = (q5) C0077.m7282(v3);
                        if (!zM3657) {
                            C0035.m3626(C0031.m3004(this), d5M3846, q4);
                            try {
                                C0111.m13119(randomAccessFile);
                                try {
                                    C0065.m4685(q4);
                                    C0065.m4782(true, C0063.m4386(d5M3846), fileM3488);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = true;
                                    C0065.m4782(z, C0063.m4386(d5M3846), fileM3488);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                                try {
                                    C0065.m4685(q4);
                                    throw th;
                                } catch (Throwable th4) {
                                    C0072.m6234(th, th4);
                                    throw th;
                                }
                            }
                        }
                        E1 e1 = (E1) C0071.m6012(itM4154);
                        int iM2437 = C0027.m2437(arrayList3, e1);
                        long jM5821 = (iM2437 == C0018.m1084(arrayList3) - 1 ? C0063.m4401(d5M3846) ? C0069.m5821(C0064.m4527(d5M3846)) : C0111.m13113(C0022.m1654(d5M3846)) : C0032.m3179((E1) C0064.m4526(arrayList3, iM2437 + 1))) - C0071.m6066(C0077.m7170(q4));
                        Iterator itM41542 = C0039.m4154(arrayList2);
                        while (C0036.m3657(itM41542)) {
                            String str2 = (String) C0071.m6012(itM41542);
                            if ((!C0072.m6150(str2, C0075.m6791(m7017(), 1, 1, 824)) || !C0019.m1242(C0073.m6428(e1), str2)) && !C0070.m5838(C0073.m6428(e1), str2)) {
                            }
                            C0035.m3541(this, arrayList3, e1, jM5821);
                            if (!C0078.m7411(C0030.m2889(C0020.m1447(d5M3846)), e1)) {
                                throw new z5(C0019.m1189(m7017(), 2, 61, 1303));
                            }
                            j += jM5821;
                            arrayList = arrayList3;
                            C0030.m2951((N3) C0077.m7282(this));
                            arrayList3 = arrayList;
                        }
                        arrayList = arrayList3;
                        C0078.m7329(randomAccessFile, q4, j, jM5821, n3, C0064.m4533(q5Var));
                        j += jM5821;
                        C0030.m2951((N3) C0077.m7282(this));
                        arrayList3 = arrayList;
                    }
                } finally {
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            C0065.m4782(z, C0063.m4386(d5M3846), fileM3488);
            throw th;
        }
    }

    public final void h(ArrayList arrayList, E1 e1, long j) {
        if (j == Long.MIN_VALUE) {
            throw new ArithmeticException(C0070.m5942(m7017(), 147, 13, 386));
        }
        D5 d5M3846 = C0037.m3846(this);
        C0068.m5617(arrayList, d5M3846, e1, -j);
        C1 c1M1654 = C0022.m1654(d5M3846);
        c1M1654.f = C0111.m13113(c1M1654) - j;
        c1M1654.e = C0017.m877(c1M1654) - 1;
        int iM1258 = C0019.m1258(c1M1654);
        if (iM1258 > 0) {
            c1M1654.d = iM1258 - 1;
        }
        if (C0063.m4401(d5M3846)) {
            s5 s5VarM4527 = C0064.m4527(d5M3846);
            s5VarM4527.j = C0069.m5821(s5VarM4527) - j;
            s5VarM4527.g = C0034.m3439(s5VarM4527) - 1;
            r5 r5VarM3714 = C0036.m3714(d5M3846);
            r5VarM3714.c = C0065.m4680(r5VarM3714) - j;
        }
    }

    public W3(D5 d5, C0387j2 c0387j2, C0479z c0479z) {
        super(c0479z);
        this.b = d5;
        this.c = c0387j2;
    }
}
