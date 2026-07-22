package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.util.DataSink;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class OutputStreamDataSink implements DataSink {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f118short = {575, 549, 548, 624, 621, 621, 624, 574, 549, 572, 572};
    public final OutputStream a;

    /* JADX INFO: renamed from: ۟ۢۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2382() {
        if (C0063.m4427() >= 0) {
            return f118short;
        }
        return null;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i, int i2) {
        C0036.m3734(C0075.m6822(this), bArr, i, i2);
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) {
        if (C0111.m13127(byteBuffer)) {
            boolean zM5719 = C0069.m5719(byteBuffer);
            OutputStream outputStreamM6822 = C0075.m6822(this);
            if (zM5719) {
                C0036.m3734(outputStreamM6822, C0027.m2445(byteBuffer), C0035.m3629(byteBuffer) + C0020.m1414(byteBuffer), C0071.m5984(byteBuffer));
                C0037.m3886(byteBuffer, C0075.m6818(byteBuffer));
                return;
            }
            int iM3151 = C0032.m3151(C0071.m5984(byteBuffer), 65536);
            byte[] bArr = new byte[iM3151];
            while (C0111.m13127(byteBuffer)) {
                int iM31512 = C0032.m3151(C0071.m5984(byteBuffer), iM3151);
                C0111.m13057(byteBuffer, bArr, 0, iM31512);
                C0036.m3734(outputStreamM6822, bArr, 0, iM31512);
            }
        }
    }

    public OutputStream getOutputStream() {
        return C0075.m6822(this);
    }

    public OutputStreamDataSink(OutputStream outputStream) {
        if (outputStream != null) {
            this.a = outputStream;
            return;
        }
        throw new NullPointerException(C0068.m5544(m2382(), 0, 11, 592));
    }
}
