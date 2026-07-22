package com.android.apksig.internal.util;

import com.android.apksig.internal.zip.C0029;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteBufferUtils {
    public static byte[] toByteArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[C0071.m5984(byteBuffer)];
        C0029.m2812(byteBuffer, bArr);
        return bArr;
    }
}
