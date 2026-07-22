package com.android.apksig.util;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSink {
    void consume(ByteBuffer byteBuffer);

    void consume(byte[] bArr, int i, int i2);
}
