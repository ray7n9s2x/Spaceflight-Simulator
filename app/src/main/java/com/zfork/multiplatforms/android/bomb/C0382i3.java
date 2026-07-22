package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0035;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0382i3 implements PrivilegedAction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f334short = {1515, 1512, 1510, 1507, 1483, 1518, 1509, 1525, 1510, 1525, 1534};
    public final /* synthetic */ Class a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7077() {
        if (C0073.m6356() < 0) {
            return f334short;
        }
        return null;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        C0394k3 c0394k3;
        boolean zM6162 = C0072.m6162(this);
        String strM6583 = C0074.m6583(this);
        try {
            Method methodM2690 = C0029.m2690(C0017.m868(this), C0039.m4066(m7077(), 0, 11, 1415), new Class[]{String.class, C0024.m2007()});
            C0035.m3619(methodM2690, true);
            C0070.m5924(methodM2690, null, new Object[]{strM6583, C0075.m6775(zM6162)});
            return new C0394k3(strM6583, true, true, null);
        } catch (InvocationTargetException e) {
            c0394k3 = new C0394k3(strM6583, false, true, C0018.m958(e));
            return c0394k3;
        } catch (Throwable th) {
            c0394k3 = new C0394k3(strM6583, false, true, th);
            return c0394k3;
        }
    }

    public C0382i3(Class cls, String str, boolean z) {
        this.a = cls;
        this.b = str;
        this.c = z;
    }
}
