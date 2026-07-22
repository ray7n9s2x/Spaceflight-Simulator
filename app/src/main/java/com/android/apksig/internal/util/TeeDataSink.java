package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.util.DataSink;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.internal.bind.C0068;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class TeeDataSink implements DataSink {
    public final DataSink[] a;

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i, int i2) {
        for (DataSink dataSink : C0068.m5663(this)) {
            C0037.m3874(dataSink, bArr, i, i2);
        }
    }

    public TeeDataSink(DataSink[] dataSinkArr) {
        this.a = dataSinkArr;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) {
        int iM3629 = C0035.m3629(byteBuffer);
        int i = 0;
        while (true) {
            DataSink[] dataSinkArrM5663 = C0068.m5663(this);
            if (i >= dataSinkArrM5663.length) {
                return;
            }
            if (i > 0) {
                C0037.m3886(byteBuffer, iM3629);
            }
            C0017.m841(dataSinkArrM5663[i], byteBuffer);
            i++;
        }
    }
}
