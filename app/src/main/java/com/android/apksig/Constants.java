package com.android.apksig;

import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.zfork.multiplatforms.android.bomb.C0077;

/* JADX INFO: loaded from: classes3.dex */
public class Constants {
    public static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;
    public static final int APK_SIGNATURE_SCHEME_V31_BLOCK_ID = 462663009;
    public static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;
    public static final short LIBRARY_PAGE_ALIGNMENT_BYTES = 16384;
    public static final int MAX_APK_SIGNERS = 10;
    public static final int PROOF_OF_ROTATION_ATTR_ID = 1000370060;
    public static final int V1_SOURCE_STAMP_BLOCK_ID = 722016414;
    public static final int V2_SOURCE_STAMP_BLOCK_ID = 1845461005;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V2 = 2;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V3 = 3;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V31 = 31;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V4 = 4;
    public static final int VERSION_JAR_SIGNATURE_SCHEME = 1;
    public static final int VERSION_SOURCE_STAMP = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f25short = {2318, 2310, 2327, 2306, 2414, 2314, 2317, 2309, 2412, 2318, 2306, 2317, 2314, 2309, 2310, 2320, 2327, 2413, 2318, 2309, 1790, 1761, 1789, 1761, 1783, 1787, 1791, 1761, 1790, 1790, 1788, 1786, 1787, 1782, 1761, 1790, 1761, 1790, 1761, 1790};
    public static final String MANIFEST_ENTRY_NAME = C0018.m1070(m532(), 0, 20, 2371);
    public static final String OID_RSA_ENCRYPTION = C0020.m1443(m532(), 20, 20, 1743);

    /* JADX INFO: renamed from: ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m532() {
        if (C0077.m7272() <= 0) {
            return f25short;
        }
        return null;
    }
}
