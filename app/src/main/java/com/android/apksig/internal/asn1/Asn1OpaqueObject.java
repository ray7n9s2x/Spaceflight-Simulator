package com.android.apksig.internal.asn1;

import com.android.apksig.internal.apk.C0020;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Asn1OpaqueObject {
    public final ByteBuffer a;

    public Asn1OpaqueObject(ByteBuffer byteBuffer) {
        this.a = C0071.m6043(byteBuffer);
    }

    public ByteBuffer getEncoded() {
        return C0071.m6043(C0064.m4551(this));
    }

    public Asn1OpaqueObject(byte[] bArr) {
        this.a = C0020.m1393(bArr);
    }
}
