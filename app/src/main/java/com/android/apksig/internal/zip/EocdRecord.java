package com.android.apksig.internal.zip;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import java.nio.ByteBuffer;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class EocdRecord {
    public static ByteBuffer createWithModifiedCentralDirectoryInfo(ByteBuffer byteBuffer, int i, long j, long j2) {
        ByteBuffer byteBufferM3516 = C0035.m3516(C0071.m5984(byteBuffer));
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0067.m5510(byteBufferM3516, C0071.m6043(byteBuffer));
        C0020.m1437(byteBufferM3516);
        C0039.m4143(byteBufferM3516, 8, i);
        C0039.m4143(byteBufferM3516, 10, i);
        C0111.m13104(byteBufferM3516, 12, j);
        C0111.m13104(byteBufferM3516, 16, j2);
        return byteBufferM3516;
    }

    public static ByteBuffer createWithPaddedComment(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBufferM3516 = C0035.m3516(C0071.m5984(byteBuffer) + i);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0067.m5510(byteBufferM3516, C0071.m6043(byteBuffer));
        C0038.m3987(byteBufferM3516);
        C0031.m3085(byteBufferM3516);
        return byteBufferM3516;
    }
}
