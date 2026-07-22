package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.util.DataSink;
import com.android.apksig.zip.C0035;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class MessageDigestSink implements DataSink {
    public final MessageDigest[] a;

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i, int i2) {
        for (MessageDigest messageDigest : C0019.m1267(this)) {
            C0027.m2508(messageDigest, bArr, i, i2);
        }
    }

    public MessageDigestSink(MessageDigest[] messageDigestArr) {
        this.a = messageDigestArr;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) {
        int iM3629 = C0035.m3629(byteBuffer);
        for (MessageDigest messageDigest : C0019.m1267(this)) {
            C0037.m3886(byteBuffer, iM3629);
            C0037.m3779(messageDigest, byteBuffer);
        }
    }
}
