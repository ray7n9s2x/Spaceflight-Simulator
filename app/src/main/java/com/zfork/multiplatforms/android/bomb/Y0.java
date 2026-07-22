package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.pkcs7.C0026;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.zfork.entry.C0075;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y0 {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: ۡۨۡۤ, reason: not valid java name and contains not printable characters */
    public static SortedMap m7020(Object obj) {
        if (C0039.m4109() > 0) {
            return DesugarCollections.unmodifiableSortedMap((SortedMap) obj);
        }
        return null;
    }

    static {
        TreeMap treeMap = new TreeMap(C0078.m7408());
        Charset charsetM4776 = C0065.m4776();
        C0075.m6786(treeMap, C0078.m7357(charsetM4776), charsetM4776);
        Charset charsetM6393 = C0073.m6393();
        C0075.m6786(treeMap, C0078.m7357(charsetM6393), charsetM6393);
        Charset charsetM4688 = C0065.m4688();
        C0075.m6786(treeMap, C0078.m7357(charsetM4688), charsetM4688);
        Charset charsetM2251 = C0026.m2251();
        C0075.m6786(treeMap, C0078.m7357(charsetM2251), charsetM2251);
        Charset charsetM1415 = C0020.m1415();
        C0075.m6786(treeMap, C0078.m7357(charsetM1415), charsetM1415);
        Charset charsetM1069 = C0018.m1069();
        C0075.m6786(treeMap, C0078.m7357(charsetM1069), charsetM1069);
        m7020(treeMap);
    }
}
