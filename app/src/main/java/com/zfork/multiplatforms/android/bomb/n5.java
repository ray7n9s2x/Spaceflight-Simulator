package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.joke.plugin.gson.internal.reflect.C0071;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 extends V0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f348short = {838, 833, 841, 844, 853, 850, 837};
    public final /* synthetic */ int b;
    public final /* synthetic */ InterfaceC0471x3 c;

    public /* synthetic */ n5(InterfaceC0471x3 interfaceC0471x3, int i) {
        this.b = i;
        this.c = interfaceC0471x3;
    }

    /* JADX INFO: renamed from: ۥ۠ۤ۟, reason: contains not printable characters */
    public static short[] m7097() {
        if (C0027.m2460() >= 0) {
            return f348short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.V0
    public final void b() {
        switch (C0111.m13152(this)) {
            case 0:
                try {
                    C0078.m7367((C0451u1) C0017.m938(this), null);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                C0027.m2457((C0450u0) C0017.m938(this), null);
                break;
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.V0
    public final Object c(Q3 q3) {
        try {
            return C0023.m1914(C0025.m2208(q3));
        } catch (Exception unused) {
            throw new RuntimeException(C0071.m5991(m7097(), 0, 7, 800));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:7:0x0019, B:10:0x0025, B:12:0x0034, B:14:0x0046, B:15:0x004a), top: B:19:0x0019 }] */
    @Override // com.zfork.multiplatforms.android.bomb.V0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r55) {
        /*
            r54 = this;
            r4 = r55
            r3 = r54
            int r0 = org.conscrypt.C0111.m13152(r3)
            switch(r0) {
                case 0: goto L17;
                default: goto Lb;
            }
        Lb:
            java.lang.String r4 = (java.lang.String) r4
            com.zfork.multiplatforms.android.bomb.x3 r0 = com.android.apksig.internal.apk.stamp.C0017.m938(r3)
            com.zfork.multiplatforms.android.bomb.u0 r0 = (com.zfork.multiplatforms.android.bomb.C0450u0) r0
            com.android.apksig.internal.util.C0027.m2457(r0, r4)
            return
        L17:
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = com.android.apksig.C0038.m3939(r4)     // Catch: java.lang.Exception -> L4e
            com.zfork.multiplatforms.android.bomb.x3 r1 = com.android.apksig.internal.apk.stamp.C0017.m938(r3)
            com.zfork.multiplatforms.android.bomb.u1 r1 = (com.zfork.multiplatforms.android.bomb.C0451u1) r1
            if (r0 != 0) goto L4a
            com.joke.plugin.gson.Gson r0 = new com.joke.plugin.gson.Gson     // Catch: java.lang.Exception -> L4e
            r0.<init>()     // Catch: java.lang.Exception -> L4e
            java.lang.Class<com.joke.speedfloatingball.bean.BaseEntity> r2 = com.joke.speedfloatingball.bean.BaseEntity.class
            java.lang.Object r4 = com.android.apksig.internal.pkcs7.C0026.m2342(r0, r4, r2)     // Catch: java.lang.Exception -> L4e
            com.joke.speedfloatingball.bean.BaseEntity r4 = (com.joke.speedfloatingball.bean.BaseEntity) r4     // Catch: java.lang.Exception -> L4e
            if (r4 == 0) goto L4a
            java.lang.Object r4 = com.android.apksig.C0037.m3844(r4)     // Catch: java.lang.Exception -> L4e
            java.lang.String r4 = com.android.apksig.zip.C0036.m3712(r0, r4)     // Catch: java.lang.Exception -> L4e
            java.lang.Class<com.joke.speedfloatingball.bean.CloudBean> r2 = com.joke.speedfloatingball.bean.CloudBean.class
            java.lang.Object r4 = com.android.apksig.internal.pkcs7.C0026.m2342(r0, r4, r2)     // Catch: java.lang.Exception -> L4e
            com.joke.speedfloatingball.bean.CloudBean r4 = (com.joke.speedfloatingball.bean.CloudBean) r4     // Catch: java.lang.Exception -> L4e
            if (r4 == 0) goto L4a
            com.zfork.multiplatforms.android.bomb.C0078.m7367(r1, r4)     // Catch: java.lang.Exception -> L4e
            goto L4e
        L4a:
            r4 = 0
            com.zfork.multiplatforms.android.bomb.C0078.m7367(r1, r4)     // Catch: java.lang.Exception -> L4e
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.n5.d(java.lang.Object):void");
    }
}
