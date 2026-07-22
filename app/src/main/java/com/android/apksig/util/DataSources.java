package com.android.apksig.util;

import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.FileChannelDataSource;
import com.android.apksig.kms.C0030;
import com.zfork.entry.C0075;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataSources {
    public static DataSource asDataSource(ByteBuffer byteBuffer) {
        C0030.m2951(byteBuffer);
        return new ByteBufferDataSource(byteBuffer);
    }

    public static DataSource asDataSource(RandomAccessFile randomAccessFile) {
        return C0075.m6884(C0075.m6888(randomAccessFile));
    }

    public static DataSource asDataSource(RandomAccessFile randomAccessFile, long j, long j2) {
        return C0026.m2317(C0075.m6888(randomAccessFile), j, j2);
    }

    public static DataSource asDataSource(FileChannel fileChannel) {
        C0030.m2951(fileChannel);
        return new FileChannelDataSource(fileChannel);
    }

    public static DataSource asDataSource(FileChannel fileChannel, long j, long j2) {
        C0030.m2951(fileChannel);
        return new FileChannelDataSource(fileChannel, j, j2);
    }
}
