package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.util.RunnablesProvider;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.speedfloatingball.bean.CloudBean;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Timer;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0451u1 implements InterfaceC0471x3, RunnablesExecutor {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f366short = {1719, 1723, 1721, 1786, 1715, 1727, 1786, 1703, 1700, 1713, 1713, 1712, 1786, 1718, 1723, 1723, 1703, 1696, 1713, 1702, 1786, 1696, 1723, 1723, 1720, 1719, 1720, 1725, 1716, 2190, 2209, 2212, 2221, 2280, 2220, 2215, 2221, 2235, 2280, 2214, 2215, 2236, 2280, 2221, 2224, 2209, 2235, 2236, 2290, 2280, 304, 274, 285, 285, 284, 263, 339, 279, 278, 287, 278, 263, 278, 339, 277, 282, 287, 278, 329, 339};
    public final /* synthetic */ int a;

    public /* synthetic */ C0451u1(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m7124(Object obj, Object obj2) {
        if (C0070.m5903() >= 0) {
            return Objects.requireNonNull(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡۤ, reason: contains not printable characters */
    public static short[] m7125() {
        if (C0034.m3450() > 0) {
            return f366short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static C0398l1 m7126(Object obj, Object obj2, Object obj3) {
        if (C0066.m4827() > 0) {
            return J3.a((Path) obj, (LinkOption[]) obj2, (R4[]) obj3);
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0471x3
    public void a(Object obj) {
        switch (C0018.m1088(this)) {
            case 0:
                CloudBean cloudBean = (CloudBean) obj;
                C0469x1 c0469x1M2740 = C0029.m2740();
                try {
                    c0469x1M2740.b = cloudBean;
                    if (cloudBean != null) {
                        if (C0033.m3345(cloudBean) == null || C0025.m2084(C0033.m3345(C0064.m4498(c0469x1M2740)))) {
                            ArrayList arrayList = new ArrayList();
                            C0017.m919(arrayList, C0068.m5544(m7125(), 0, 25, 1748));
                            C0032.m3188(C0064.m4498(c0469x1M2740), arrayList);
                        }
                        C0024.m1979(c0469x1M2740, C0033.m3345(C0064.m4498(c0469x1M2740)), new C0451u1(2));
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                C0469x1 c0469x1M27402 = C0029.m2740();
                if (!C0065.m4681((Boolean) obj)) {
                    C0069.m5769(c0469x1M27402, C0064.m4498(c0469x1M27402));
                }
                break;
            default:
                C0469x1 c0469x1M27403 = C0029.m2740();
                if (!C0065.m4681((Boolean) obj)) {
                    try {
                        C0021.m1635(new Timer(), new C0457v1(), ((long) C0036.m3753(C0064.m4498(c0469x1M27403))) * 1000);
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
        }
    }

    public void b(Object obj) {
        File file = (File) obj;
        m7124(file, C0017.m936(m7125(), 25, 4, 1745));
        try {
            C0398l1 c0398l1M7126 = m7126(C0027.m2458(file), C0078.m7391(), new R4[]{C0028.m2581()});
            if (C0064.m4561(C0069.m5820(c0398l1M7126)) >= 1 || C0064.m4561(C0072.m6153(c0398l1M7126)) >= 1) {
                return;
            }
            StringBuilder sb = new StringBuilder(C0067.m5418(m7125(), 29, 21, 2248));
            C0036.m3741(sb, file);
            throw new FileNotFoundException(C0068.m5536(sb));
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder(C0039.m4066(m7125(), 50, 20, 371));
            C0036.m3741(sb2, file);
            throw new IOException(C0068.m5536(sb2), e);
        }
    }

    @Override // com.android.apksig.util.RunnablesExecutor
    public void execute(RunnablesProvider runnablesProvider) {
        C0065.m4691();
        C0029.m2705(C0037.m3913(runnablesProvider));
    }
}
