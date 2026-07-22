package androidx.loader.app.services;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int iM313 = C0006.m313(inputStream, bArr);
            if (iM313 == -1) {
                return C0007.m368(byteArrayOutputStream);
            }
            C0008.m432(byteArrayOutputStream, bArr, 0, iM313);
        }
    }
}
