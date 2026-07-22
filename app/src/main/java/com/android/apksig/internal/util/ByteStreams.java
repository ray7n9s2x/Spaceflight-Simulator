package com.android.apksig.internal.util;

import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteStreams {
    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int iM3621 = C0035.m3621(inputStream, bArr);
            if (iM3621 == -1) {
                return C0077.m7297(byteArrayOutputStream);
            }
            C0067.m5408(byteArrayOutputStream, bArr, 0, iM3621);
        }
    }
}
