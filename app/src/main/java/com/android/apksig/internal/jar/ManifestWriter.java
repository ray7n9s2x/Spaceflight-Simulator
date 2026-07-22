package com.android.apksig.internal.jar;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.common.base.Ascii;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.jar.Attributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ManifestWriter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f99short = {2479, 2485, 279, 312, 308, 316, 3070, 3026, 3037, 3031, 3026, 3015, 3036, 3009, 3018, 2963, 1410, 1475, 1494, 1494, 1488, 1483, 1472, 1495, 1494, 1479, 1410, 1487, 1483, 1489, 1489, 1483, 1484, 1477};
    public static final byte[] a = {Ascii.CR, 10};

    /* JADX INFO: renamed from: ۟ۧۢۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1787() {
        if (C0064.m4578() > 0) {
            return f99short;
        }
        return null;
    }

    public static void a(OutputStream outputStream, String str, String str2) {
        int iM3151;
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, str);
        C0077.m7290(sb, C0075.m6791(m1787(), 0, 2, 2453));
        C0077.m7290(sb, str2);
        byte[] bArrM2092 = C0025.m2092(C0068.m5536(sb), C0018.m1069());
        int length = bArrM2092.length;
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArrM4052 = C0038.m4052();
            if (length <= 0) {
                C0033.m3292(outputStream, bArrM4052);
                return;
            }
            if (z) {
                iM3151 = C0032.m3151(length, 70);
            } else {
                C0033.m3292(outputStream, bArrM4052);
                C0072.m6156(outputStream, 32);
                iM3151 = C0032.m3151(length, 69);
            }
            C0036.m3734(outputStream, bArrM2092, i, iM3151);
            i += iM3151;
            length -= iM3151;
            z = false;
        }
    }

    public static void writeIndividualSection(OutputStream outputStream, String str, Attributes attributes) {
        C0030.m2880(outputStream, C0030.m2840(m1787(), 2, 4, 345), str);
        if (!C0022.m1673(attributes)) {
            C0033.m3254(outputStream, C0070.m5863(attributes));
        }
        C0075.m6781(outputStream);
    }

    public static void writeMainSection(OutputStream outputStream, Attributes attributes) {
        Attributes.Name nameM7440 = C0078.m7440();
        String strM2004 = C0024.m2004(attributes, nameM7440);
        if (strM2004 == null) {
            StringBuilder sb = new StringBuilder(C0025.m2151(m1787(), 6, 10, 2995));
            C0036.m3741(sb, nameM7440);
            C0077.m7290(sb, C0026.m2321(m1787(), 16, 18, 1442));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        C0024.m2043(outputStream, nameM7440, strM2004);
        if (C0035.m3564(attributes) > 1) {
            SortedMap sortedMapM5863 = C0070.m5863(attributes);
            C0065.m4661(sortedMapM5863, C0075.m6874(nameM7440));
            C0033.m3254(outputStream, sortedMapM5863);
        }
        C0075.m6781(outputStream);
    }

    public static void writeSectionDelimiter(OutputStream outputStream) {
        C0033.m3292(outputStream, C0038.m4052());
    }

    public static SortedMap<String, String> getAttributesSortedByName(Attributes attributes) {
        Set setM2279 = C0026.m2279(attributes);
        TreeMap treeMap = new TreeMap();
        Iterator itM2001 = C0024.m2001(setM2279);
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            C0075.m6786(treeMap, C0074.m6524(C0063.m4368(entry)), C0074.m6524(C0019.m1293(entry)));
        }
        return treeMap;
    }

    public static void writeAttribute(OutputStream outputStream, Attributes.Name name, String str) {
        C0030.m2880(outputStream, C0075.m6874(name), str);
    }

    public static void writeAttributes(OutputStream outputStream, SortedMap<String, String> sortedMap) {
        Iterator itM2001 = C0024.m2001(C0033.m3380(sortedMap));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            C0030.m2880(outputStream, (String) C0063.m4368(entry), (String) C0019.m1293(entry));
        }
    }
}
