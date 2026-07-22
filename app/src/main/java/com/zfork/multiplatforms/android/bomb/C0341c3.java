package com.zfork.multiplatforms.android.bomb;

import android.os.Handler;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0033;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.io.File;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0341c3 extends V0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f308short = {515, 512, 524, 516, 527, 595, 593, 591, 512, 529, 522};
    public final String b;
    public final /* synthetic */ C0348d3 c;

    /* JADX INFO: renamed from: ۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7036() {
        if (C0028.m2593() > 0) {
            return f308short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.V0
    public final void b() {
        try {
            C0033.m3331(new Handler(C0018.m1071(C0022.m1755(C0025.m2095(this)))), new D0(3, this));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: IOException -> 0x00a1, TRY_LEAVE, TryCatch #10 {IOException -> 0x00a1, blocks: (B:35:0x0098, B:37:0x009d), top: B:65:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: IOException -> 0x00b2, TRY_LEAVE, TryCatch #5 {IOException -> 0x00b2, blocks: (B:44:0x00a9, B:46:0x00ae), top: B:58:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[SYNTHETIC] */
    @Override // com.zfork.multiplatforms.android.bomb.V0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.zfork.multiplatforms.android.bomb.Q3 r69) throws java.lang.Throwable {
        /*
            r68 = this;
            r18 = r69
            r17 = r68
            r0 = r18
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            java.io.InputStream r3 = com.android.apksig.internal.oid.C0025.m2208(r0)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L90
            long r10 = com.zfork.multiplatforms.android.bomb.C0077.m7221(r0)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            r12 = r17
            java.lang.String r4 = com.android.apksig.zip.C0032.m3146(r12)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            boolean r4 = com.android.apksig.zip.C0033.m3343(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            if (r4 != 0) goto L2e
            com.android.apksig.internal.apk.C0019.m1226(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            goto L2e
        L27:
            r0 = move-exception
        L28:
            r2 = 0
            goto La9
        L2b:
            r0 = move-exception
        L2c:
            r14 = 0
            goto L95
        L2e:
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            short[] r29 = m7036()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            r32 = 609(0x261, float:8.53E-43)
            r30 = 0
            r31 = 11
            java.lang.String r29 = com.android.apksig.internal.apk.stamp.C0018.m1070(r29, r30, r31, r32)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            r4 = r29
            r13.<init>(r0, r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2b
            r4 = 0
        L4d:
            int r0 = com.android.apksig.zip.C0035.m3621(r3, r1)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            r6 = -1
            if (r0 == r6) goto L74
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            long r15 = r4 + r6
            r4 = 0
            com.android.apksig.internal.util.C0028.m2644(r14, r1, r4, r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            android.os.Handler r0 = com.android.apksig.internal.zip.C0029.m2746()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            com.zfork.multiplatforms.android.bomb.U0 r8 = new com.zfork.multiplatforms.android.bomb.U0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            r4 = r8
            r5 = r17
            r6 = r15
            r2 = r8
            r8 = r10
            r4.<init>(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            com.android.apksig.zip.C0033.m3331(r0, r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            r4 = r15
            goto L4d
        L6f:
            r0 = move-exception
            r2 = r14
            goto La9
        L72:
            r0 = move-exception
            goto L95
        L74:
            com.android.apksig.internal.jar.C0023.m1839(r14)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            com.joke.basetoollib.C0063.m4304(r14)     // Catch: java.io.IOException -> L7d
            com.android.apksig.internal.jar.C0024.m1958(r3)     // Catch: java.io.IOException -> L7d
        L7d:
            com.joke.basetoollib.C0063.m4304(r14)     // Catch: java.io.IOException -> L80
        L80:
            r2 = r13
            goto La8
        L82:
            r0 = move-exception
            r12 = r17
            goto L28
        L86:
            r0 = move-exception
            r12 = r17
            goto L2c
        L8a:
            r0 = move-exception
            r12 = r17
            r2 = 0
            r3 = 0
            goto La9
        L90:
            r0 = move-exception
            r12 = r17
            r3 = 0
            goto L2c
        L95:
            com.android.apksig.zip.C0033.m3347(r0)     // Catch: java.lang.Throwable -> L6f
            com.joke.basetoollib.C0063.m4304(r14)     // Catch: java.io.IOException -> La1
            if (r3 == 0) goto La2
            com.android.apksig.internal.jar.C0024.m1958(r3)     // Catch: java.io.IOException -> La1
            goto La2
        La1:
        La2:
            if (r14 == 0) goto La7
            com.joke.basetoollib.C0063.m4304(r14)     // Catch: java.io.IOException -> La7
        La7:
            r2 = 0
        La8:
            return r2
        La9:
            com.joke.basetoollib.C0063.m4304(r2)     // Catch: java.io.IOException -> Lb2
            if (r3 == 0) goto Lb3
            com.android.apksig.internal.jar.C0024.m1958(r3)     // Catch: java.io.IOException -> Lb2
            goto Lb3
        Lb2:
        Lb3:
            if (r2 == 0) goto Lb8
            com.joke.basetoollib.C0063.m4304(r2)     // Catch: java.io.IOException -> Lb8
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0341c3.c(com.zfork.multiplatforms.android.bomb.Q3):java.lang.Object");
    }

    @Override // com.zfork.multiplatforms.android.bomb.V0
    public final void d(Object obj) {
        File file = (File) obj;
        C0348d3 c0348d3M2095 = C0025.m2095(this);
        try {
            c0348d3M2095.f = false;
            if (file == null || C0070.m5960(file) <= 20971520) {
                C0324a0 c0324a0M4658 = C0065.m4658(c0348d3M2095);
                if (c0324a0M4658 != null) {
                    C0033.m3278(c0324a0M4658, C0021.m1548(-1));
                }
            } else {
                C0077.m7172(c0348d3M2095, file);
            }
        } catch (Exception unused) {
        }
    }

    public C0341c3(C0348d3 c0348d3, String str) {
        this.c = c0348d3;
        this.b = str;
    }
}
