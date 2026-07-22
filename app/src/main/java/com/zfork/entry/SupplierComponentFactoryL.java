package com.zfork.entry;

import android.content.pm.ApplicationInfo;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.V2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class SupplierComponentFactoryL extends SupplierComponentFactory {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f224short = {1613, 713, 710, 716, 730, 711, 705, 716, 646, 713, 728, 728, 646, 745, 715, 732, 705, 734, 705, 732, 721, 764, 704, 730, 717, 713, 716, 2359, 2324, 2341, 2343, 2351, 2341, 2339, 2337, 2313, 2341, 2346, 2341, 2339, 2337, 2358, 2151, 2149, 2164, 2128, 2145, 2147, 2155, 2145, 2151, 2149, 2125, 2145, 2158, 2145, 2151, 2149, 2162, 1924, 1931, 1921, 1943, 1930, 1932, 1921, 1995, 1926, 1930, 1931, 1937, 1920, 1931, 1937, 1995, 1941, 1928, 1995, 1964, 1973, 1924, 1926, 1934, 1924, 1922, 1920, 1960, 1924, 1931, 1924, 1922, 1920, 1943, 1572, 1574, 1591, 1538, 1587, 1587, 1583, 1578, 1568, 1570, 1591, 1578, 1580, 1581, 1546, 1581, 1573, 1580};

    /* JADX INFO: renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6774() {
        if (C0031.m3075() >= 0) {
            return f224short;
        }
        return null;
    }

    public ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        try {
            int iM4330 = C0063.m4330();
            if (iM4330 >= 28) {
                String[] strArr = {C0068.m5544(m6774(), 0, 1, 1537)};
                HashSet hashSetM948 = C0017.m948();
                C0028.m2559(hashSetM948, C0021.m1596(strArr));
                String[] strArr2 = new String[C0038.m4054(hashSetM948)];
                C0037.m3819(hashSetM948, strArr2);
                C0031.m3008(strArr2);
            }
            Class clsM4101 = C0039.m4101(C0077.m7205(m6774(), 1, 26, 680));
            Field fieldM5765 = C0069.m5765(clsM4101, C0032.m3209(m6774(), 27, 15, 2372));
            Method methodM6369 = C0073.m6369(clsM4101, C0070.m5942(m6774(), 42, 17, 2048), null);
            C0035.m3619(fieldM5765, true);
            C0035.m3619(methodM6369, true);
            ClassLoader classLoaderM1337 = C0020.m1337(clsM4101);
            Class clsM3601 = C0035.m3601(classLoaderM1337, C0025.m2151(m6774(), 59, 34, 2021));
            Object objM5924 = C0070.m5924(methodM6369, clsM4101, null);
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            Object objM3423 = C0034.m3423(classLoaderM1337, new Class[]{clsM3601}, new V2(atomicReference, objM5924, atomicReference2));
            if (C0078.m7323(C0111.m13067(fieldM5765), objM3423)) {
                C0018.m1091(fieldM5765, clsM4101, objM3423);
                Method methodM63692 = C0073.m6369(clsM3601, C0031.m3047(m6774(), 93, 18, 1603), new Class[]{String.class, iM4330 >= 33 ? C0066.m4824() : C0072.m6191(), C0072.m6191()});
                C0035.m3619(methodM63692, true);
                C0025.m2115(atomicReference2, methodM63692);
            }
        } catch (Exception unused) {
        }
        return super.instantiateClassLoader(classLoader, applicationInfo);
    }
}
