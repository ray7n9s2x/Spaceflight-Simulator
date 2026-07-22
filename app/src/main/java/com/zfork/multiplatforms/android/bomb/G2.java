package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.apk.C0016;
import com.android.apksig.util.C0031;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G2 {
    public static final Charset a;
    public static final Charset b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f247short = {2586, 2587, 2569, 2658, 2679};

    /* JADX INFO: renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6932() {
        if (C0031.m3075() >= 0) {
            return f247short;
        }
        return null;
    }

    static {
        C0077.m7158();
        Charset charsetM666 = C0016.m666(C0066.m4828(m6932(), 0, 5, 2639));
        a = charsetM666;
        b = charsetM666;
    }
}
