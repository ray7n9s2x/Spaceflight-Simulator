package com.android.apksig;

import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;

/* JADX INFO: loaded from: classes3.dex */
public class ApkVerificationIssue {
    public static final int JAR_SIG_NO_SIGNATURES = 36;
    public static final int JAR_SIG_PARSE_EXCEPTION = 37;
    public static final int MALFORMED_APK = 28;
    public static final int SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK = 27;
    public static final int SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING = 25;
    public static final int SOURCE_STAMP_DID_NOT_VERIFY = 21;
    public static final int SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH = 23;
    public static final int SOURCE_STAMP_INVALID_TIMESTAMP = 38;
    public static final int SOURCE_STAMP_MALFORMED_ATTRIBUTE = 31;
    public static final int SOURCE_STAMP_MALFORMED_CERTIFICATE = 18;
    public static final int SOURCE_STAMP_MALFORMED_LINEAGE = 33;
    public static final int SOURCE_STAMP_MALFORMED_SIGNATURE = 20;
    public static final int SOURCE_STAMP_NO_SIGNATURE = 17;
    public static final int SOURCE_STAMP_NO_SUPPORTED_SIGNATURE = 26;
    public static final int SOURCE_STAMP_POR_CERT_MISMATCH = 34;
    public static final int SOURCE_STAMP_POR_DID_NOT_VERIFY = 35;
    public static final int SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST = 24;
    public static final int SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE = 39;
    public static final int SOURCE_STAMP_SIG_MISSING = 30;
    public static final int SOURCE_STAMP_UNKNOWN_ATTRIBUTE = 32;
    public static final int SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM = 19;
    public static final int SOURCE_STAMP_VERIFY_EXCEPTION = 22;
    public static final int UNEXPECTED_EXCEPTION = 29;
    public static final int V2_SIG_MALFORMED_CERTIFICATE = 6;
    public static final int V2_SIG_MALFORMED_DIGEST = 8;
    public static final int V2_SIG_MALFORMED_SIGNATURE = 4;
    public static final int V2_SIG_MALFORMED_SIGNER = 3;
    public static final int V2_SIG_MALFORMED_SIGNERS = 1;
    public static final int V2_SIG_NO_CERTIFICATES = 7;
    public static final int V2_SIG_NO_SIGNATURES = 5;
    public static final int V2_SIG_NO_SIGNERS = 2;
    public static final int V3_SIG_MALFORMED_CERTIFICATE = 14;
    public static final int V3_SIG_MALFORMED_DIGEST = 16;
    public static final int V3_SIG_MALFORMED_SIGNATURE = 12;
    public static final int V3_SIG_MALFORMED_SIGNER = 11;
    public static final int V3_SIG_MALFORMED_SIGNERS = 9;
    public static final int V3_SIG_NO_CERTIFICATES = 15;
    public static final int V3_SIG_NO_SIGNATURES = 13;
    public static final int V3_SIG_NO_SIGNERS = 10;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f19short = {1781, 1745, 1771, 1771, 1773, 1789, 1745, 1788, 1698, 1720, 1945, 1941};
    public final int a;
    public final String b;
    public final Object[] c;

    public ApkVerificationIssue(String str, Object... objArr) {
        this.a = -1;
        this.b = str;
        this.c = objArr;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m516() {
        if (C0071.m6069() >= 0) {
            return f19short;
        }
        return null;
    }

    public int getIssueId() {
        return C0018.m1024(this);
    }

    public Object[] getParams() {
        return C0024.m2027(this);
    }

    public String toString() {
        Object[] objArrM2027 = C0024.m2027(this);
        String strM3873 = C0037.m3873(this);
        if (strM3873 != null) {
            return C0021.m1531(strM3873, objArrM2027);
        }
        StringBuilder sb = new StringBuilder(C0035.m3603(m516(), 0, 10, 1688));
        C0021.m1551(sb, C0018.m1024(this));
        for (Object obj : objArrM2027) {
            C0077.m7290(sb, C0065.m4757(m516(), 10, 2, 1973));
            C0077.m7290(sb, C0074.m6524(obj));
        }
        return C0068.m5536(sb);
    }

    public ApkVerificationIssue(int i, Object... objArr) {
        this.a = i;
        this.b = null;
        this.c = objArr;
    }
}
