package com.android.apksig.util;

import com.android.apksig.internal.util.ByteArrayDataSink;
import com.android.apksig.internal.util.MessageDigestSink;
import com.android.apksig.internal.util.OutputStreamDataSink;
import com.android.apksig.internal.util.RandomAccessFileDataSink;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataSinks {
    public static DataSink asDataSink(OutputStream outputStream) {
        return new OutputStreamDataSink(outputStream);
    }

    public static ReadableDataSink newInMemoryDataSink() {
        return new ByteArrayDataSink();
    }

    public static DataSink asDataSink(RandomAccessFile randomAccessFile) {
        return new RandomAccessFileDataSink(randomAccessFile);
    }

    public static ReadableDataSink newInMemoryDataSink(int i) {
        return new ByteArrayDataSink(i);
    }

    public static DataSink asDataSink(MessageDigest... messageDigestArr) {
        return new MessageDigestSink(messageDigestArr);
    }
}
