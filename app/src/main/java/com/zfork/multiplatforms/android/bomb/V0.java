package com.zfork.multiplatforms.android.bomb;

import android.os.Handler;
import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0024;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.script.bean.C0074;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f287short = {1346, 1347, 1361, 1306, 1295, 2757};
    public static final Handler a = new Handler(C0037.m3783());

    /* JADX INFO: renamed from: ۤۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7010() {
        if (C0017.m846() > 0) {
            return f287short;
        }
        return null;
    }

    public abstract void b();

    public abstract Object c(Q3 q3);

    public abstract void d(Object obj);

    public static String a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C0019.m1189(m7010(), 0, 5, 1335)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String strM6530 = C0074.m6530(bufferedReader);
                if (strM6530 == null) {
                    C0024.m1958(inputStream);
                    return C0068.m5536(sb);
                }
                StringBuilder sb2 = new StringBuilder();
                C0077.m7290(sb2, strM6530);
                C0077.m7290(sb2, C0037.m3829(m7010(), 5, 1, 2767));
                C0077.m7290(sb, C0068.m5536(sb2));
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
