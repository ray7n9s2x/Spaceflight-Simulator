package com.zfork.multiplatforms.android.bomb;

import android.view.KeyEvent;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import java.nio.ByteBuffer;
import java.util.HashSet;
import org.conscrypt.C0111;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements InterfaceC0477y3, InterfaceC0401l4, InterfaceC0466w4, InterfaceC0422p1 {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f282short = {289, 288, 299, 366, 289, 296, 366, 314, 294, 299, 366, 295, 288, 318, 315, 314, 366, 318, 303, 316, 303, 291, 299, 314, 299, 316, 317, 366, 313, 299, 316, 299, 366, 288, 315, 290, 290, 366, 295, 288, 366, 317, 314, 303, 288, 298, 303, 316, 298, 366, 298, 299, 301, 316, 311, 318, 314, 366, 298, 303, 314, 303, 418, 419, 433, 474, 463, 2615, 2614, 2596, 2639, 2643, 2644, 2606, 2599};
    public static final S c = new S();

    private final void g() {
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7005() {
        if (C0019.m1311() == 0) {
            return f282short;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.zfork.multiplatforms.android.bomb.R2 r72) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.T.e(com.zfork.multiplatforms.android.bomb.R2):void");
    }

    public /* synthetic */ T(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0477y3
    public void a(Object obj) {
        AutoClickPlanBean autoClickPlanBean = (AutoClickPlanBean) obj;
        InterfaceC0477y3 interfaceC0477y3M2163 = C0025.m2163((C0444t0) C0077.m7245(this));
        if (interfaceC0477y3M2163 != null) {
            C0111.m13070(interfaceC0477y3M2163, autoClickPlanBean);
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0422p1
    public int b(int i, byte[] bArr, int i2) throws z5 {
        if (i < 0 || i2 < 0) {
            throw new z5(C0023.m1904(m7005(), 0, 62, 334));
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            u5 u5Var = (u5) C0077.m7245(this);
            byte bM6110 = (byte) ((i4 ^ C0072.m6110(u5Var)) & 255);
            C0073.m6432(u5Var, bM6110);
            bArr[i3] = bM6110;
        }
        return i2;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0401l4
    public void c(int i, String str) {
        DialogC0419o4 dialogC0419o4 = (DialogC0419o4) C0077.m7245(this);
        C0020.m1338(dialogC0419o4);
        InterfaceC0401l4 interfaceC0401l4M1982 = C0024.m1982(dialogC0419o4);
        if (interfaceC0401l4M1982 != null) {
            C0018.m989(interfaceC0401l4M1982, i, str);
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0401l4
    public void cancel() {
        switch (C0039.m4104(this)) {
            case 4:
                break;
            default:
                C0029.m2786((DialogC0448t4) C0077.m7245(this));
                break;
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0466w4
    public void d(ScriptProjectBean scriptProjectBean) {
        C0070.m5957();
        DialogC0448t4 dialogC0448t4 = (DialogC0448t4) C0077.m7245(this);
        C0020.m1338(C0035.m3602(dialogC0448t4));
        ScriptProjectBean scriptProjectBeanM6525 = C0074.m6525(dialogC0448t4);
        scriptProjectBeanM6525.projectName = C0021.m1527(scriptProjectBean);
        scriptProjectBeanM6525.count = C0033.m3252(scriptProjectBean);
        scriptProjectBeanM6525.interval = C0024.m1955(scriptProjectBean);
        C0019.m1180(C0025.m2167(dialogC0448t4), C0021.m1527(scriptProjectBean));
        C0063.m4313(C0027.m2454(dialogC0448t4), scriptProjectBean);
        C0029.m2786(dialogC0448t4);
    }

    public void f(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < C0025.m2196(jSONArray); i++) {
                String strM5623 = C0068.m5623(jSONArray, i, C0031.m2993());
                if (!C0038.m3939(strM5623)) {
                    C0077.m7232((HashSet) C0077.m7245(this), strM5623);
                }
            }
        } catch (Exception unused) {
        }
    }

    public T(byte[] bArr) {
        this.a = 0;
        ByteBuffer byteBufferM1393 = C0020.m1393(bArr);
        Q q = new Q();
        q.d = -1;
        q.f = C0064.m4604(byteBufferM1393, C0072.m6217());
        this.b = q;
    }
}
