package com.android.apksig.util;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSource {
    void copyTo(long j, int i, ByteBuffer byteBuffer);

    void feed(long j, long j2, DataSink dataSink);

    ByteBuffer getByteBuffer(long j, int i);

    long size();

    DataSource slice(long j, long j2);
}
