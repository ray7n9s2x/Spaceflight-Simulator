package com.zfork.multiplatforms.android.bomb;

import android.net.Uri;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.SignatureCreatorAbility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G4 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f248short = {267, 265, 274, 269, 282, 271, 286, 341, 278, 272, 264};
    public final /* synthetic */ SignatureCreatorAbility a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ G4(SignatureCreatorAbility signatureCreatorAbility, int i, Uri uri) {
        this.a = signatureCreatorAbility;
        this.b = i;
        this.c = uri;
    }

    /* JADX INFO: renamed from: ۤۤۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6933() {
        if (C0018.m1064() >= 0) {
            return f248short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileInputStream fileInputStream;
        OutputStream outputStreamM1402;
        InputStream inputStreamM2801;
        C0031.m3055();
        SignatureCreatorAbility signatureCreatorAbilityM4838 = C0066.m4838(this);
        C0030.m2951(signatureCreatorAbilityM4838);
        Uri uriM1593 = C0021.m1593(this);
        int iM603 = C0016.m603(this);
        try {
            if (iM603 == 313) {
                File fileM1342 = C0020.m1342();
                if (C0033.m3343(fileM1342)) {
                    try {
                        fileInputStream = new FileInputStream(fileM1342);
                        try {
                            outputStreamM1402 = C0020.m1402(C0028.m2615(signatureCreatorAbilityM4838), uriM1593);
                        } finally {
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        C0016.m667(fileInputStream, outputStreamM1402);
                        if (outputStreamM1402 != null) {
                            C0075.m6780(outputStreamM1402);
                        }
                        C0016.m636(fileInputStream);
                        C0025.m2123(signatureCreatorAbilityM4838, new I4(signatureCreatorAbilityM4838, 0));
                        return;
                    } finally {
                    }
                }
                return;
            }
            if (iM603 != 314) {
                return;
            }
            File file = new File(C0038.m4020(signatureCreatorAbilityM4838), C0072.m6116(m6933(), 0, 11, 379));
            if (C0033.m3343(file)) {
                C0032.m3207(file);
            }
            try {
                inputStreamM2801 = C0029.m2801(C0028.m2615(signatureCreatorAbilityM4838), uriM1593);
            } catch (Exception unused2) {
            }
            if (inputStreamM2801 == null) {
                if (inputStreamM2801 != null) {
                    C0024.m1958(inputStreamM2801);
                    return;
                }
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    C0016.m667(inputStreamM2801, fileOutputStream);
                    C0063.m4304(fileOutputStream);
                    C0024.m1958(inputStreamM2801);
                    C0344d c0344dM2356 = C0026.m2356(signatureCreatorAbilityM4838);
                    o5.g = C0074.m6524(C0035.m3580(c0344dM2356));
                    o5.g = C0074.m6524(C0035.m3580(c0344dM2356));
                    C0025.m2123(signatureCreatorAbilityM4838, new I4(signatureCreatorAbilityM4838, 1));
                } finally {
                }
            } finally {
            }
        } catch (Exception unused3) {
        }
    }
}
