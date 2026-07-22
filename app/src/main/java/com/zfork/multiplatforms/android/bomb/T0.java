package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.script.bean.C0074;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f283short = {956, 958, 943, 910, 937, 951, 993, 2762, 2782, 2783, 1383, 1381, 1396};
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ V0 b;
    public final /* synthetic */ Object c;

    public T0(V0 v0, Object obj) {
        this.b = v0;
        this.c = obj;
    }

    /* JADX INFO: renamed from: ۦۡۡ۠, reason: contains not printable characters */
    public static short[] m7006() {
        if (C0028.m2593() >= 0) {
            return f283short;
        }
        return null;
    }

    public T0(E e, String str, V0 v0) {
        this.c = str;
        this.b = v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Exception e;
        Q3 q3;
        String strM3375;
        switch (C0031.m2997(this)) {
            case 0:
                C0026.m2360(C0111.m13079(this), C0066.m4880(this));
                break;
            default:
                StringBuilder sb = new StringBuilder(C0034.m3431(m7006(), 0, 7, 987));
                String str = (String) C0066.m4880(this);
                C0077.m7290(sb, str);
                C0036.m3736(C0020.m1443(m7006(), 7, 3, 2726), C0068.m5536(sb));
                try {
                    String strM625 = C0016.m625(m7006(), 10, 3, 1312);
                    httpURLConnection = (HttpURLConnection) C0021.m1546(new URL(str));
                    C0078.m7460(httpURLConnection, 10000);
                    C0021.m1526(httpURLConnection, 15000);
                    C0037.m3821(httpURLConnection, strM625);
                    try {
                        C0074.m6514(httpURLConnection, true);
                        C0023.m1853(httpURLConnection);
                        q3 = new Q3();
                        q3.c = C0063.m4375(httpURLConnection);
                        q3.d = C0030.m2899(httpURLConnection);
                        q3.a = C0027.m2490(httpURLConnection);
                        q3.b = C0029.m2728(httpURLConnection);
                    } catch (Exception e2) {
                        e = e2;
                        if (httpURLConnection != null) {
                            C0068.m5618(httpURLConnection);
                        }
                        Q3 q32 = new Q3();
                        q32.e = e;
                        q3 = q32;
                    }
                } catch (Exception e3) {
                    httpURLConnection = null;
                    e = e3;
                }
                int iM1192 = C0019.m1192(q3);
                V0 v0M13079 = C0111.m13079(this);
                if (iM1192 != 200) {
                    InputStream inputStreamM2208 = C0025.m2208(q3);
                    if (inputStreamM2208 != null) {
                        strM3375 = C0023.m1914(inputStreamM2208);
                    } else {
                        InputStream inputStreamM1408 = C0020.m1408(q3);
                        if (inputStreamM1408 != null) {
                            strM3375 = C0023.m1914(inputStreamM1408);
                        } else {
                            Exception excM7456 = C0078.m7456(q3);
                            strM3375 = excM7456 != null ? C0033.m3375(excM7456) : C0031.m2993();
                        }
                    }
                    C0033.m3331(C0029.m2746(), new E0(v0M13079, q3, strM3375));
                } else {
                    C0033.m3331(C0029.m2746(), new T0(v0M13079, C0018.m984(v0M13079, q3)));
                }
                break;
        }
    }
}
