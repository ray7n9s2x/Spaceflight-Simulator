package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0420p extends AbstractC0396l {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f352short = {2591, 2564, 2585, 2591, 2586, 2586, 2565, 2584, 2590, 2575, 2574, 2634, 2569, 2565, 2567, 2586, 2584, 2575, 2585, 2585, 2563, 2565, 2564, 2634, 2590, 2579, 2586, 2575, 1314, 2117, 781, 770, 775, 782, 805, 778, 774, 782, 802, 773, 817, 770, 795, 843, 771, 778, 792, 843, 799, 772, 843, 777, 782, 843, 792, 782, 799, 843, 770, 773, 843, 785, 770, 795, 827, 778, 793, 778, 774, 782, 799, 782, 793, 792, 843, 796, 771, 782, 773, 843, 778, 783, 783, 770, 773, 780, 843, 792, 799, 793, 782, 778, 774, 2577, 2598, 2613, 2613, 2614, 2593, 2675, 2592, 2618, 2601, 2614, 2675, 2608, 2610, 2621, 2621, 2620, 2599, 2675, 2609, 2614, 2675, 2623, 2614, 2592, 2592, 2675, 2599, 2619, 2610, 2621, 2675, 2662, 2658, 2657, 2675, 2609, 2602, 2599, 2614, 2592, 750, 737, 740, 749, 678, 763, 749, 760, 745, 762, 745, 764, 743, 762, 1876, 1792, 1866, 3060, 2976, 2375, 2428, 2419, 2416, 2430, 2423, 2354, 2406, 2429, 2354, 2401, 2425, 2427, 2402, 2354, 1803, 1865, 1874, 1887, 1870, 1880, 1803, 1887, 1860, 1803, 1886, 1883, 1871, 1866, 1887, 1870, 1803, 1895, 1901, 1891, 826, 829, 805, 818, 831, 826, 823, 883, 826, 829, 803, 806, 807, 883, 803, 818, 801, 818, 830, 822, 807, 822, 801, 800, 895, 883, 816, 818, 829, 829, 828, 807, 883, 806, 803, 823, 818, 807, 822, 883, 831, 828, 816, 818, 831, 883, 821, 826, 831, 822, 883, 827, 822, 818, 823, 822, 801};
    public final D5 b;
    public final C0387j2 c;

    /* JADX INFO: renamed from: ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7101() {
        if (C0027.m2460() >= 0) {
            return f352short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0396l
    public final void b(AbstractC0396l abstractC0396l, N3 n3) throws z5 {
        C0414o c0414o = (C0414o) abstractC0396l;
        F5 f5M7396 = C0078.m7396(c0414o);
        int iM678 = C0016.m678(f5M7396);
        if (iM678 != 1 && iM678 != 2) {
            throw new z5(C0075.m6791(m7101(), 0, 28, 2666));
        }
        f5M7396.c = 1;
        if (!C0072.m6224(C0024.m1972(f5M7396))) {
            throw new z5(C0027.m2404(m7101(), 30, 63, 875));
        }
        String strM1972 = C0024.m1972(f5M7396);
        D5 d5M7190 = C0077.m7190(this);
        E1 e1M972 = C0018.m972(d5M7190, strM1972);
        q5 q5Var = (q5) C0077.m7282(c0414o);
        if (e1M972 != null) {
            C0017.m875(new W3(d5M7190, C0017.m897(this), new C0479z(null, n3, 1)), new V3(C0111.m13086(C0073.m6428(e1M972)), q5Var));
        }
        f5M7396.i = true;
        if (C0075.m6833(C0016.m678(f5M7396), 1)) {
            f5M7396.h = 0L;
        }
        Q4 q4 = new Q4(C0063.m4386(d5M7190), C0074.m6555(d5M7190));
        try {
            E5 e5M4167 = C0039.m4167(this, q4, q5Var);
            try {
                byte[] bArr = new byte[C0064.m4533(q5Var)];
                C0016.m679(e5M4167, f5M7396);
                if (!C0072.m6150(C0024.m1972(f5M7396), C0032.m3209(m7101(), 28, 1, 1293)) && !C0072.m6150(C0024.m1972(f5M7396), C0035.m3603(m7101(), 29, 1, 2073))) {
                    while (true) {
                        int iM3621 = C0035.m3621(C0033.m3257(c0414o), bArr);
                        if (iM3621 == -1) {
                            break;
                        } else {
                            C0027.m2465(e5M4167, bArr, 0, iM3621);
                        }
                    }
                }
                E1 e1M1752 = C0022.m1752(e5M4167);
                if (C0075.m6833(1, C0016.m646(e1M1752))) {
                    C0035.m3547(this, e1M1752, q4);
                }
                C0036.m3744(e5M4167);
                C0065.m4685(q4);
            } finally {
            }
        } catch (Throwable th) {
            try {
                C0065.m4685(q4);
            } catch (Throwable th2) {
                C0072.m6234(th, th2);
            }
            throw th;
        }
    }

    public final E5 c(Q4 q4, q5 q5Var) throws IOException {
        D5 d5M7190 = C0077.m7190(this);
        if (C0033.m3343(C0063.m4386(d5M7190))) {
            C0017.m851(C0077.m7170(q4), C0063.m4401(d5M7190) ? C0069.m5821(C0064.m4527(d5M7190)) : C0111.m13113(C0022.m1654(d5M7190)));
        }
        E5 e5 = new E5();
        e5.f = new E();
        e5.g = new C0387j2(1);
        e5.h = new CRC32();
        C0387j2 c0387j2 = new C0387j2(3);
        e5.i = c0387j2;
        e5.j = 0L;
        e5.m = true;
        if (C0064.m4533(q5Var) < 512) {
            throw new IllegalArgumentException(C0026.m2321(m7101(), 93, 41, 2643));
        }
        C0404m1 c0404m1 = new C0404m1();
        c0404m1.b = 0L;
        c0404m1.a = q4;
        e5.a = c0404m1;
        e5.k = q5Var;
        if (C0036.m3645(c0404m1)) {
            d5M7190.f = true;
            d5M7190.g = C0036.m3645(c0404m1) ? C0067.m5514(q4) : 0L;
        }
        e5.b = d5M7190;
        e5.l = false;
        if (C0036.m3645(c0404m1)) {
            C0069.m5733(c0387j2, c0404m1, (int) 134695760);
        }
        return e5;
    }

    public final void d(E1 e1, Q4 q4) {
        Q4 q42;
        boolean z;
        String strM2993;
        String strM5536;
        C0387j2 c0387j2M897 = C0017.m897(this);
        C0030.m2951(c0387j2M897);
        D5 d5M7190 = C0077.m7190(this);
        if (d5M7190 == null) {
            throw new z5(C0019.m1189(m7101(), 188, 57, 851));
        }
        if (C0025.m2135(e1) != C0018.m1044(q4)) {
            String strM1006 = C0018.m1006(C0063.m4386(d5M7190));
            String strM6471 = C0074.m6471(C0018.m1025(C0063.m4386(d5M7190)));
            if (strM1006 != null) {
                StringBuilder sb = new StringBuilder();
                C0077.m7290(sb, strM1006);
                C0077.m7290(sb, C0039.m4087(C0065.m4757(m7101(), 134, 14, 648)));
                strM2993 = C0068.m5536(sb);
            } else {
                strM2993 = C0031.m2993();
            }
            z = true;
            if (C0025.m2135(e1) < 9) {
                StringBuilder sb2 = new StringBuilder();
                C0077.m7290(sb2, strM2993);
                C0077.m7290(sb2, strM6471);
                C0077.m7290(sb2, C0033.m3330(m7101(), 148, 3, 1914));
                C0021.m1551(sb2, C0025.m2135(e1) + 1);
                strM5536 = C0068.m5536(sb2);
            } else {
                StringBuilder sb3 = new StringBuilder();
                C0077.m7290(sb3, strM2993);
                C0077.m7290(sb3, strM6471);
                C0077.m7290(sb3, C0038.m4022(m7101(), 151, 2, 3034));
                C0021.m1551(sb3, C0025.m2135(e1) + 1);
                strM5536 = C0068.m5536(sb3);
            }
            q42 = new Q4(new File(strM5536));
        } else {
            q42 = q4;
            z = false;
        }
        long jM6066 = C0071.m6066(C0077.m7170(q42));
        C0017.m851(C0077.m7170(q42), C0032.m3179(e1) + 14);
        long jM6168 = C0072.m6168(e1);
        C0387j2 c0387j2 = (C0387j2) C0036.m3641(c0387j2M897);
        byte[] bArr = (byte[]) C0068.m5627(c0387j2M897);
        C0029.m2742(jM6168, bArr);
        C0111.m13166(q42, bArr, 0, 4);
        if (C0075.m6881(e1) >= 4294967295L) {
            C0029.m2742(4294967295L, bArr);
            C0111.m13166(q42, bArr, 0, 4);
            C0111.m13166(q42, bArr, 0, 4);
            int iM2195 = C0025.m2195(e1) + 8;
            if (C0073.m6344(C0077.m7170(q42), iM2195) != iM2195) {
                throw new z5(C0025.m2086(C0027.m2404(m7101(), 153, 15, 2322), iM2195, C0071.m5991(m7101(), 168, 20, 1835)));
            }
            C0022.m1681(c0387j2, q42, C0075.m6881(e1));
            C0022.m1681(c0387j2, q42, C0066.m4817(e1));
        } else {
            C0029.m2742(C0066.m4817(e1), bArr);
            C0111.m13166(q42, bArr, 0, 4);
            C0029.m2742(C0075.m6881(e1), bArr);
            C0111.m13166(q42, bArr, 0, 4);
        }
        if (z) {
            C0065.m4685(q42);
        } else {
            C0017.m851(C0077.m7170(q4), jM6066);
        }
    }

    public C0420p(D5 d5, C0387j2 c0387j2, C0479z c0479z) {
        super(c0479z);
        this.b = d5;
        this.c = c0387j2;
    }
}
