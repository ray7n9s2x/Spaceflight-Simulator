package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0028;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0412n3 implements v5 {
    public static final String c = C0020.m1358('?');
    public final Charset a;
    public final boolean b;

    @Override // com.zfork.multiplatforms.android.bomb.v5
    public final String c(byte[] bArr) {
        CharsetDecoder charsetDecoderM5452;
        boolean zM7429 = C0078.m7429(this);
        Charset charsetM6176 = C0072.m6176(this);
        if (zM7429) {
            CharsetDecoder charsetDecoderM1277 = C0019.m1277(charsetM6176);
            CodingErrorAction codingErrorActionM13142 = C0111.m13142();
            charsetDecoderM5452 = C0067.m5452(C0028.m2638(C0070.m5864(charsetDecoderM1277, codingErrorActionM13142), codingErrorActionM13142), C0078.m7402());
        } else {
            CharsetDecoder charsetDecoderM12772 = C0019.m1277(charsetM6176);
            CodingErrorAction codingErrorActionM4660 = C0065.m4660();
            charsetDecoderM5452 = C0028.m2638(C0070.m5864(charsetDecoderM12772, codingErrorActionM4660), codingErrorActionM4660);
        }
        return C0069.m5767(C0023.m1860(charsetDecoderM5452, C0020.m1393(bArr)));
    }

    public C0412n3(Charset charset, boolean z) {
        this.a = charset;
        this.b = z;
    }
}
