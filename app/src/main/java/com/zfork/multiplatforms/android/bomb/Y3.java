package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Y3 extends AbstractC0390k {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f296short = {2660, 3010, 3015, 3077, 3078, 3086, 3146, 3084, 3075, 3078, 3087, 3146, 3076, 3083, 3079, 3087, 3146, 3101, 3083, 3097, 3146, 3076, 3087, 3075, 3102, 3074, 3087, 3096, 3146, 3083, 3076, 3146, 3087, 3090, 3083, 3081, 3102, 3146, 3079, 3083, 3102, 3081, 3074, 3146, 3076, 3077, 3096, 3146, 3083, 3146, 3098, 3083, 3096, 3102, 3075, 3083, 3078, 3146, 3079, 3083, 3102, 3081, 3074, 1545, 1541, 1567, 1542, 1550, 1610, 1540, 1541, 1566, 1610, 1548, 1539, 1540, 1550, 1610, 1547, 1540, 1555, 1610, 1538, 1551, 1547, 1550, 1551, 1560, 1610, 1565, 1539, 1566, 1538, 1610, 1540, 1547, 1543, 1551, 1616, 1610};
    public final D5 b;
    public final C0387j2 c;
    public final C0387j2 d;

    /* JADX INFO: renamed from: ۥۨ۟, reason: contains not printable characters */
    public static short[] m7021() {
        if (C0075.m6893() > 0) {
            return f296short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0396l
    public final void b(AbstractC0396l abstractC0396l, N3 n3) throws Throwable {
        D5 d5M6047;
        boolean z;
        RandomAccessFile randomAccessFile;
        Throwable th;
        Q4 q4;
        Throwable th2;
        Map.Entry entry;
        q5 q5Var;
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        String str;
        E1 e1M972;
        X3 x3 = (X3) abstractC0396l;
        HashMap mapM4431 = C0063.m4431(x3);
        q5 q5Var2 = (q5) C0077.m7282(x3);
        HashMap map = new HashMap();
        Iterator itM2001 = C0024.m2001(C0025.m2117(mapM4431));
        while (true) {
            boolean zM3657 = C0036.m3657(itM2001);
            d5M6047 = C0071.m6047(this);
            if (!zM3657) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) C0071.m6012(itM2001);
            if (C0072.m6224((String) C0063.m4368(entry2)) && (e1M972 = C0018.m972(d5M6047, (String) C0063.m4368(entry2))) != null) {
                if (C0016.m727(e1M972)) {
                    String str2 = (String) C0019.m1293(entry2);
                    String strM3330 = C0033.m3330(m7021(), 0, 1, 2635);
                    if (!C0072.m6150(str2, strM3330)) {
                        Object objM4368 = C0063.m4368(entry2);
                        StringBuilder sb = new StringBuilder();
                        C0077.m7290(sb, (String) C0019.m1293(entry2));
                        C0077.m7290(sb, strM3330);
                        C0038.m3969(map, objM4368, C0068.m5536(sb));
                    }
                }
                C0038.m3969(map, C0063.m4368(entry2), C0019.m1293(entry2));
            }
        }
        if (C0037.m3811(map) == 0) {
            return;
        }
        File fileM3488 = C0034.m3488(C0078.m7365(C0063.m4386(d5M6047)));
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(C0063.m4386(d5M6047), C0070.m5942(m7021(), 1, 2, 2992));
            try {
                Q4 q42 = new Q4(fileM3488);
                try {
                    ArrayList arrayList3 = new ArrayList(C0030.m2889(C0020.m1447(d5M6047)));
                    C0039.m4063(arrayList3, new C0376h3(1));
                    Iterator itM4154 = C0039.m4154(arrayList3);
                    long j2 = 0;
                    while (C0036.m3657(itM4154)) {
                        E1 e1 = (E1) C0071.m6012(itM4154);
                        try {
                            Iterator itM20012 = C0024.m2001(C0025.m2117(map));
                            while (true) {
                                if (!C0036.m3657(itM20012)) {
                                    entry = null;
                                    break;
                                } else {
                                    entry = (Map.Entry) C0071.m6012(itM20012);
                                    if (C0019.m1242(C0073.m6428(e1), (String) C0063.m4368(entry))) {
                                        break;
                                    }
                                }
                            }
                            C0073.m6428(e1);
                            C0030.m2951(n3);
                            int iM2437 = C0027.m2437(arrayList3, e1);
                            long jM5821 = (iM2437 == C0018.m1084(arrayList3) - 1 ? C0063.m4401(d5M6047) ? C0069.m5821(C0064.m4527(d5M6047)) : C0111.m13113(C0022.m1654(d5M6047)) : C0032.m3179((E1) C0064.m4526(arrayList3, iM2437 + 1))) - C0071.m6066(C0077.m7170(q42));
                            if (entry == null) {
                                try {
                                    C0078.m7329(randomAccessFile2, q42, j2, jM5821, n3, C0064.m4533(q5Var2));
                                    j2 += jM5821;
                                    q5Var = q5Var2;
                                    arrayList = arrayList3;
                                    q4 = q42;
                                    randomAccessFile = randomAccessFile2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    q4 = q42;
                                    randomAccessFile = randomAccessFile2;
                                    try {
                                        try {
                                            C0065.m4685(q4);
                                            throw th2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            z = false;
                                            try {
                                                try {
                                                    C0111.m13119(randomAccessFile);
                                                    throw th;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    C0065.m4782(z, C0063.m4386(d5M6047), fileM3488);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                C0072.m6234(th, th6);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        C0072.m6234(th2, th7);
                                        throw th2;
                                    }
                                }
                            } else {
                                String strM5536 = (String) C0019.m1293(entry);
                                String str3 = (String) C0063.m4368(entry);
                                String strM6428 = C0073.m6428(e1);
                                if (!C0070.m5838(strM6428, str3)) {
                                    if (!C0019.m1242(strM6428, str3)) {
                                        throw new z5(C0030.m2840(m7021(), 3, 60, 3178));
                                    }
                                    String strM6056 = C0071.m6056(strM6428, C0078.m7380(str3));
                                    StringBuilder sb2 = new StringBuilder();
                                    C0077.m7290(sb2, strM5536);
                                    C0077.m7290(sb2, strM6056);
                                    strM5536 = C0068.m5536(sb2);
                                }
                                byte[] bArrM5800 = C0069.m5800(strM5536, null);
                                int length = bArrM5800.length - C0025.m2195(e1);
                                int iM4533 = C0064.m4533(q5Var2);
                                q5Var = q5Var2;
                                C0078.m7329(randomAccessFile2, q42, j2, 26L, n3, iM4533);
                                C0016.m656(C0024.m2078(this), q42, bArrM5800.length);
                                C0078.m7329(randomAccessFile2, q42, j2 + 28, 2L, n3, iM4533);
                                long j3 = 30 + j2;
                                C0111.m13166(q42, bArrM5800, 0, bArrM5800.length);
                                long jM2195 = j3 + ((long) C0025.m2195(e1));
                                long j4 = jM5821 - (jM2195 - j2);
                                try {
                                    C0078.m7329(randomAccessFile2, q42, jM2195, j4, n3, iM4533);
                                    j = jM2195 + j4;
                                    arrayList2 = arrayList3;
                                    arrayList = arrayList3;
                                    str = strM5536;
                                    q4 = q42;
                                    randomAccessFile = randomAccessFile2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    q4 = q42;
                                    randomAccessFile = randomAccessFile2;
                                }
                                try {
                                    C0074.m6551(this, arrayList2, e1, str, bArrM5800, length);
                                    j2 = j;
                                } catch (Throwable th9) {
                                    th = th9;
                                    th2 = th;
                                    C0065.m4685(q4);
                                    throw th2;
                                }
                            }
                            C0030.m2951((N3) C0077.m7282(this));
                            q42 = q4;
                            arrayList3 = arrayList;
                            randomAccessFile2 = randomAccessFile;
                            q5Var2 = q5Var;
                        } catch (Throwable th10) {
                            th = th10;
                            q4 = q42;
                            randomAccessFile = randomAccessFile2;
                            th2 = th;
                            C0065.m4685(q4);
                            throw th2;
                        }
                    }
                    Q4 q43 = q42;
                    randomAccessFile = randomAccessFile2;
                    C0035.m3626(C0111.m13117(this), d5M6047, q43);
                    try {
                        C0065.m4685(q43);
                        try {
                            C0111.m13119(randomAccessFile);
                            C0065.m4782(true, C0063.m4386(d5M6047), fileM3488);
                        } catch (Throwable th11) {
                            th = th11;
                            z = true;
                            C0065.m4782(z, C0063.m4386(d5M6047), fileM3488);
                            throw th;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        z = true;
                        C0111.m13119(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            } catch (Throwable th14) {
                th = th14;
                randomAccessFile = randomAccessFile2;
            }
        } catch (Throwable th15) {
            th = th15;
            z = false;
        }
    }

    public final void h(ArrayList arrayList, E1 e1, String str, byte[] bArr, int i) {
        String strM6428 = C0073.m6428(e1);
        D5 d5M6047 = C0071.m6047(this);
        E1 e1M972 = C0018.m972(d5M6047, strM6428);
        if (e1M972 == null) {
            StringBuilder sb = new StringBuilder(C0020.m1443(m7021(), 63, 37, 1642));
            C0077.m7290(sb, C0073.m6428(e1));
            throw new z5(C0068.m5536(sb));
        }
        e1M972.k = str;
        e1M972.i = bArr.length;
        long j = i;
        C0068.m5617(arrayList, d5M6047, e1M972, j);
        C1 c1M1654 = C0022.m1654(d5M6047);
        c1M1654.f = C0111.m13113(c1M1654) + j;
        if (C0063.m4401(d5M6047)) {
            s5 s5VarM4527 = C0064.m4527(d5M6047);
            s5VarM4527.j = C0069.m5821(s5VarM4527) + j;
            r5 r5VarM3714 = C0036.m3714(d5M6047);
            r5VarM3714.c = C0065.m4680(r5VarM3714) + j;
        }
    }

    public Y3(D5 d5, C0387j2 c0387j2, C0387j2 c0387j22, C0479z c0479z) {
        super(c0479z);
        this.b = d5;
        this.c = c0387j2;
        this.d = c0387j22;
    }
}
