package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0369g3 extends AbstractC0441s3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f324short = {650, 662, 662, 658, 728, 717, 717, 657, 641, 650, 647, 655, 643, 657, 716, 643, 652, 646, 656, 653, 651, 646, 716, 641, 653, 655, 717, 643, 658, 649, 717, 656, 647, 657, 717, 643, 652, 646, 656, 653, 651, 646, 1001, 1013, 1013, 1009, 955, 942, 942, 1010, 994, 1001, 996, 1004, 992, 1010, 943, 992, 1007, 997, 1011, 1006, 1000, 997, 943, 994, 1006, 1004, 942, 992, 1009, 1002, 942, 1011, 996, 1010, 942, 992, 1007, 997, 1011, 1006, 1000, 997};
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7064() {
        if (C0023.m1921() >= 0) {
            return f324short;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r59, java.lang.String r60, int r61, int r62, java.lang.Object r63) {
        /*
            r58 = this;
            r12 = r63
            r11 = r62
            r10 = r61
            r9 = r60
            r8 = r59
            r7 = r58
            java.util.ArrayList r0 = com.android.apksig.apk.C0016.m630(r7)
            if (r0 == 0) goto L77
            java.util.Iterator r0 = com.joke.connectdevice.bean.C0065.m4732(r0)
        L16:
            boolean r1 = com.android.apksig.zip.C0036.m3657(r0)
            if (r1 == 0) goto L77
            java.lang.Object r1 = com.joke.plugin.gson.internal.reflect.C0071.m6012(r0)
            com.zfork.multiplatforms.android.bomb.G r1 = (com.zfork.multiplatforms.android.bomb.G) r1
            if (r1 != 0) goto L25
            goto L16
        L25:
            r2 = 0
            if (r8 != 0) goto L2a
            r3 = 0
            goto L41
        L2a:
            short[] r34 = m7064()
            r37 = 738(0x2e2, float:1.034E-42)
            r35 = 0
            r36 = 42
            java.lang.String r34 = com.zfork.multiplatforms.android.bomb.C0077.m7205(r34, r35, r36, r37)
            r3 = r34
            boolean r3 = com.joke.plugin.gson.internal.reflect.C0070.m5838(r8, r3)
        L41:
            if (r3 == 0) goto L50
            java.lang.String r3 = com.joke.basetoollib.C0063.m4363(r1)
            if (r9 != 0) goto L4a
            goto L4e
        L4a:
            boolean r2 = com.joke.plugin.gson.internal.reflect.C0070.m5838(r9, r3)
        L4e:
            if (r2 != 0) goto L58
        L50:
            if (r10 < 0) goto L16
            int r2 = com.joke.connectdevice.bean.C0065.m4786(r1)
            if (r10 != r2) goto L16
        L58:
            java.util.ArrayList r0 = com.joke.plugin.gson.internal.reflect.C0069.m5732(r7)
            com.android.apksig.internal.apk.stamp.C0017.m919(r0, r1)
            java.lang.Object r0 = com.joke.script.bean.C0074.m6532(r1)
            if (r12 == 0) goto L75
            if (r0 == 0) goto L75
            java.lang.Class r2 = com.android.apksig.kms.C0030.m2951(r12)
            java.lang.Class r3 = com.android.apksig.kms.C0030.m2951(r0)
            if (r2 == r3) goto L75
            int r11 = com.joke.connectdevice.bean.C0065.m4683(r1)
        L75:
            r5 = r11
            goto L79
        L77:
            r0 = 0
            goto L75
        L79:
            if (r0 != 0) goto L7d
            r6 = r12
            goto L7e
        L7d:
            r6 = r0
        L7e:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.a(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0369g3.a(java.lang.String, java.lang.String, int, int, java.lang.Object):void");
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractC0441s3
    public void c() {
        if (!C0024.m1962(this)) {
            C0065.m4652(this);
        }
        super.c();
    }

    public final void f() {
        ArrayList arrayListM630 = C0016.m630(this);
        if (arrayListM630 != null) {
            Iterator itM4732 = C0065.m4732(arrayListM630);
            while (C0036.m3657(itM4732)) {
                G g = (G) C0071.m6012(itM4732);
                if (!C0068.m5561(C0069.m5732(this), g)) {
                    C0030.m2951(g);
                    int iM4786 = C0065.m4786(g);
                    int iM4683 = C0065.m4683(g);
                    super.a(C0111.m13097(m7064(), 42, 42, 897), C0063.m4363(g), iM4786, iM4683, C0074.m6532(g));
                }
            }
        }
    }

    public C0369g3(AbstractC0441s3 abstractC0441s3, ArrayList arrayList, boolean z) {
        super(abstractC0441s3);
        this.b = new ArrayList();
        this.c = arrayList;
        this.d = z;
        if (z) {
            C0065.m4652(this);
        }
    }
}
