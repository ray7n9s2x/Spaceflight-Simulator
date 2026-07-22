package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends AbstractC0441s3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f291short = {1850, 1845, 1849, 1841, 1908, 1847, 1845, 1850, 1907, 1824, 1908, 1846, 1841, 1908, 1850, 1825, 1848, 1848, 2551, 2545, 2550, 2534, 2213, 2210, 2223, 2224, 2214};
    public final TreeSet b;
    public final ArrayList c;
    public int d;
    public V4 e;
    public V4 f;
    public V4 g;
    public int h;
    public V i;
    public V j;
    public V k;

    public W(String str, String str2) {
        super(null);
        this.b = new TreeSet(C0066.m4891());
        this.c = new ArrayList();
        this.f = str == null ? null : new V4(str);
        this.e = str2 != null ? new V4(str2) : null;
    }

    /* JADX INFO: renamed from: ۨۨ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m7015() {
        if (C0021.m1598() < 0) {
            return f291short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void c() {
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void a(String str, String str2, int i, int i2, Object obj) {
        if (str2 == null) {
            throw new RuntimeException(C0037.m3829(m7015(), 0, 18, 1876));
        }
        V4 v4 = str == null ? null : new V4(str);
        V4 v42 = new V4(str2);
        V v = new V();
        v.c = v4;
        v.b = v42;
        v.d = i;
        v.e = i2;
        if (obj instanceof p5) {
            p5 p5Var = (p5) obj;
            String strM3357 = C0033.m3357(p5Var);
            if (strM3357 != null) {
                v.g = new V4(strM3357);
            }
            v.f = C0021.m1548(C0038.m3949(p5Var));
            int iM1525 = C0021.m1525(p5Var);
            if (iM1525 == 1) {
                this.i = v;
            } else if (iM1525 == 2) {
                this.j = v;
            } else if (iM1525 == 3) {
                this.k = v;
            }
        } else if (i2 == 3) {
            V4 v43 = new V4((String) obj);
            v.g = v43;
            v.f = v43;
        } else {
            v.g = null;
            v.f = obj;
        }
        C0063.m4429(C0036.m3757(this), v);
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final AbstractC0441s3 b(String str, String str2) {
        W w = new W(str, str2);
        C0017.m919(C0039.m4084(this), w);
        return w;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void d(int i) {
        this.d = i;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public final void e(int i, String str) {
        this.g = new V4(str);
        this.h = i;
    }

    public final int f(Y y) {
        V4 v4M979;
        V4 v4M9792;
        V4 v4M7294 = C0077.m7294(this);
        if (v4M7294 == null) {
            C0030.m2951(y);
            v4M979 = null;
        } else {
            HashMap mapM3401 = C0034.m3401(y);
            String strM5444 = C0067.m5444(v4M7294);
            if (!C0111.m13072(mapM3401, strM5444)) {
                C0038.m3969(mapM3401, strM5444, null);
            }
            v4M979 = C0018.m979(y, v4M7294);
        }
        this.f = v4M979;
        this.e = C0018.m979(y, C0074.m6485(this));
        TreeSet treeSetM3757 = C0036.m3757(this);
        Iterator itM2199 = C0025.m2199(treeSetM3757);
        int i = 0;
        while (C0036.m3657(itM2199)) {
            V v = (V) C0071.m6012(itM2199);
            int i2 = i + 1;
            v.a = i;
            V4 v4M3820 = C0037.m3820(v);
            if (v4M3820 == null) {
                v4M9792 = null;
            } else {
                HashMap mapM34012 = C0034.m3401(y);
                String strM54442 = C0067.m5444(v4M3820);
                if (!C0111.m13072(mapM34012, strM54442)) {
                    C0038.m3969(mapM34012, strM54442, null);
                }
                v4M9792 = C0018.m979(y, v4M3820);
            }
            v.c = v4M9792;
            V4 v4M7271 = C0077.m7271(v);
            if (v4M7271 != null) {
                int iM4361 = C0063.m4361(v);
                if (iM4361 != -1) {
                    StringBuilder sb = new StringBuilder();
                    String strM54443 = C0067.m5444(v4M7271);
                    C0077.m7290(sb, strM54443);
                    C0021.m1551(sb, iM4361);
                    String strM5536 = C0068.m5536(sb);
                    HashMap mapM4507 = C0064.m4507(y);
                    V4 v4 = (V4) C0067.m5420(mapM4507, strM5536);
                    if (v4 == null) {
                        v4 = new V4(strM54443);
                        C0017.m919(C0018.m1001(y), C0021.m1548(iM4361));
                        C0017.m919(C0019.m1284(y), v4);
                        C0038.m3969(mapM4507, strM5536, v4);
                    }
                    v.b = v4;
                } else {
                    v.b = C0018.m979(y, v4M7271);
                }
            }
            Object objM865 = C0017.m865(v);
            if (objM865 instanceof V4) {
                v.f = C0018.m979(y, (V4) objM865);
            }
            V4 v4M2005 = C0024.m2005(v);
            if (v4M2005 != null) {
                v.g = C0018.m979(y, v4M2005);
            }
            i = i2;
        }
        this.g = C0018.m979(y, C0066.m4810(this));
        int iM3024 = (C0031.m3024(treeSetM3757) * 20) + 60;
        Iterator itM4154 = C0039.m4154(C0039.m4084(this));
        while (C0036.m3657(itM4154)) {
            iM3024 += C0063.m4380((W) C0071.m6012(itM4154), y);
        }
        return C0066.m4810(this) != null ? iM3024 + 28 : iM3024;
    }

    public final void g(ByteBuffer byteBuffer) {
        int iM6138;
        int iM2917;
        int iM29172;
        int iM29173;
        int iM61382;
        int iM61383;
        int i;
        C0038.m4018(byteBuffer, 1048834);
        TreeSet treeSetM3757 = C0036.m3757(this);
        C0038.m4018(byteBuffer, (C0031.m3024(treeSetM3757) * 20) + 36);
        C0038.m4018(byteBuffer, C0065.m4678(this));
        int iM61384 = -1;
        C0038.m4018(byteBuffer, -1);
        V4 v4M7294 = C0077.m7294(this);
        if (v4M7294 != null) {
            iM6138 = C0072.m6138(v4M7294);
        } else {
            iM6138 = -1;
        }
        C0038.m4018(byteBuffer, iM6138);
        C0038.m4018(byteBuffer, C0072.m6138(C0074.m6485(this)));
        C0038.m4018(byteBuffer, 1310740);
        C0069.m5783(byteBuffer, (short) C0031.m3024(treeSetM3757));
        V vM7359 = C0078.m7359(this);
        if (vM7359 == null) {
            iM2917 = 0;
        } else {
            iM2917 = C0030.m2917(vM7359) + 1;
        }
        C0069.m5783(byteBuffer, (short) iM2917);
        V vM4499 = C0064.m4499(this);
        if (vM4499 == null) {
            iM29172 = 0;
        } else {
            iM29172 = C0030.m2917(vM4499) + 1;
        }
        C0069.m5783(byteBuffer, (short) iM29172);
        V vM1896 = C0023.m1896(this);
        if (vM1896 == null) {
            iM29173 = 0;
        } else {
            iM29173 = C0030.m2917(vM1896) + 1;
        }
        C0069.m5783(byteBuffer, (short) iM29173);
        Iterator itM2199 = C0025.m2199(treeSetM3757);
        while (C0036.m3657(itM2199)) {
            V v = (V) C0071.m6012(itM2199);
            V4 v4M3820 = C0037.m3820(v);
            if (v4M3820 == null) {
                iM61382 = -1;
            } else {
                iM61382 = C0072.m6138(v4M3820);
            }
            C0038.m4018(byteBuffer, iM61382);
            C0038.m4018(byteBuffer, C0072.m6138(C0077.m7271(v)));
            V4 v4M2005 = C0024.m2005(v);
            if (v4M2005 != null) {
                iM61383 = C0072.m6138(v4M2005);
            } else {
                iM61383 = -1;
            }
            C0038.m4018(byteBuffer, iM61383);
            C0038.m4018(byteBuffer, 8 | (C0033.m3361(v) << 24));
            Object objM865 = C0017.m865(v);
            if (objM865 instanceof V4) {
                C0038.m4018(byteBuffer, C0072.m6138((V4) objM865));
            } else if (objM865 instanceof Boolean) {
                if (C0037.m3876(C0018.m1065(), objM865)) {
                    i = -1;
                } else {
                    i = 0;
                }
                C0038.m4018(byteBuffer, i);
            } else if (objM865 instanceof Integer) {
                C0038.m4018(byteBuffer, C0025.m2170((Integer) objM865));
            } else if (objM865 instanceof String) {
                if (C0025.m2111(C0072.m6116(m7015(), 18, 4, 2435), (String) objM865)) {
                    C0038.m4018(byteBuffer, -1);
                } else {
                    if (C0025.m2111(C0029.m2695(m7015(), 22, 5, 2243), (String) C0017.m865(v))) {
                        C0038.m4018(byteBuffer, 0);
                    } else {
                        try {
                            C0038.m4018(byteBuffer, C0025.m2170(C0029.m2781((String) C0017.m865(v))));
                        } catch (Exception e) {
                            C0033.m3347(e);
                        }
                    }
                }
            }
        }
        if (C0066.m4810(this) != null) {
            C0038.m4018(byteBuffer, 1048836);
            C0038.m4018(byteBuffer, 28);
            C0038.m4018(byteBuffer, C0077.m7208(this));
            C0038.m4018(byteBuffer, -1);
            C0038.m4018(byteBuffer, C0072.m6138(C0066.m4810(this)));
            C0038.m4018(byteBuffer, 8);
            C0038.m4018(byteBuffer, 0);
        }
        Iterator itM4154 = C0039.m4154(C0039.m4084(this));
        while (C0036.m3657(itM4154)) {
            C0072.m6114((W) C0071.m6012(itM4154), byteBuffer);
        }
        C0038.m4018(byteBuffer, 1048835);
        C0038.m4018(byteBuffer, 24);
        C0038.m4018(byteBuffer, -1);
        C0038.m4018(byteBuffer, -1);
        V4 v4M72942 = C0077.m7294(this);
        if (v4M72942 != null) {
            iM61384 = C0072.m6138(v4M72942);
        }
        C0038.m4018(byteBuffer, iM61384);
        C0038.m4018(byteBuffer, C0072.m6138(C0074.m6485(this)));
    }
}
