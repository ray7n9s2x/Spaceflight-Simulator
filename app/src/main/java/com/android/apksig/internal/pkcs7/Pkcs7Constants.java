package com.android.apksig.internal.pkcs7;

import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Pkcs7Constants {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f108short = {604, 579, 607, 579, 597, 601, 605, 579, 604, 604, 606, 600, 601, 596, 579, 604, 579, 596, 579, 606, 2582, 2569, 2581, 2569, 2591, 2579, 2583, 2569, 2582, 2582, 2580, 2578, 2579, 2590, 2569, 2582, 2569, 2576, 2569, 2582, 566, 553, 565, 553, 575, 563, 567, 553, 566, 566, 564, 562, 563, 574, 553, 566, 553, 574, 553, 563, 1142, 1129, 1141, 1129, 1151, 1139, 1143, 1129, 1142, 1142, 1140, 1138, 1139, 1150, 1129, 1142, 1129, 1136, 1129, 1141};
    public static final String OID_CONTENT_TYPE = C0026.m2321(m2232(), 0, 20, 621);
    public static final String OID_DATA = C0065.m4757(m2232(), 20, 20, 2599);
    public static final String OID_MESSAGE_DIGEST = C0033.m3330(m2232(), 40, 20, 519);
    public static final String OID_SIGNED_DATA = C0032.m3209(m2232(), 60, 20, 1095);

    /* JADX INFO: renamed from: ۟ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2232() {
        if (C0036.m3653() < 0) {
            return f108short;
        }
        return null;
    }
}
