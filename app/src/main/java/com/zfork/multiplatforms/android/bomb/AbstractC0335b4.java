package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import java.io.InputStream;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0335b4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f306short = {3185, 3188, 3171, 3181, 3176, 3170, 2510, 2499, 2506, 2527, 965, 970, 966, 974, 1264, 1277, 653, 664, 664, 670};
    public static final HashMap a = new HashMap();

    public static String a(InputStream inputStream, String str) {
        DocumentBuilder documentBuilderM5906;
        Document documentM3685;
        if (inputStream == null) {
            return null;
        }
        try {
            documentBuilderM5906 = C0070.m5906(C0019.m1204());
        } catch (ParserConfigurationException unused) {
            documentBuilderM5906 = null;
        }
        if (documentBuilderM5906 == null) {
            return null;
        }
        try {
            documentM3685 = C0036.m3685(documentBuilderM5906, inputStream);
        } catch (Exception unused2) {
            documentM3685 = null;
        }
        if (documentM3685 == null) {
            return null;
        }
        NodeList nodeListM6089 = C0071.m6089(documentM3685, C0028.m2609(m7033(), 0, 6, 3073));
        int iM2669 = C0028.m2669(nodeListM6089);
        for (int i = 0; i < iM2669; i++) {
            NamedNodeMap namedNodeMapM1594 = C0021.m1594(C0021.m1566(nodeListM6089, i));
            int iM6226 = C0072.m6226(namedNodeMapM1594);
            String str2 = null;
            String str3 = null;
            String str4 = null;
            for (int i2 = 0; i2 < iM6226; i2++) {
                Node nodeM6581 = C0074.m6581(namedNodeMapM1594, i2);
                if (nodeM6581 != null) {
                    String strM3709 = C0036.m3709(nodeM6581);
                    String strM3612 = C0035.m3612(nodeM6581);
                    if (C0070.m5838(C0074.m6452(m7033(), 6, 4, 2490), strM3709)) {
                        str3 = strM3612;
                    } else if (C0070.m5838(C0016.m625(m7033(), 10, 4, 939), strM3709)) {
                        str2 = strM3612;
                    } else if (C0070.m5838(C0022.m1728(m7033(), 14, 2, 1177), strM3709)) {
                        str4 = strM3612;
                    }
                }
            }
            if (str2 == null || !C0070.m5838(str2, str) || str3 == null || !C0070.m5838(str3, C0070.m5942(m7033(), 16, 4, 748))) {
                str4 = null;
            }
            if (str4 != null) {
                return str4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7033() {
        if (C0030.m2940() >= 0) {
            return f306short;
        }
        return null;
    }
}
