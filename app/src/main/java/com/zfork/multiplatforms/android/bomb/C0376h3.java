package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.util.Comparator;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0376h3 implements Comparator {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f329short = {1710, 1701, 1714, 1701, 1770, 1704, 1709, 1702, 1718, 1701, 1718, 1725, 1770, 1716, 1701, 1712, 1708};
    public static final C0376h3 b = new C0376h3(0);

    public /* synthetic */ C0376h3(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m7070() {
        if (C0026.m2298() <= 0) {
            return f329short;
        }
        return null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (C0020.m1404(this)) {
            case 0:
                Throwable thM6315 = C0073.m6315((C0394k3) obj);
                Throwable thM63152 = C0073.m6315((C0394k3) obj2);
                boolean z = thM6315 instanceof UnsatisfiedLinkError;
                boolean z2 = thM63152 instanceof UnsatisfiedLinkError;
                if (z != z2) {
                    return (z2 ? 1 : 0) - (z ? 1 : 0);
                }
                String strM3375 = C0033.m3375(thM6315);
                String strM33752 = C0033.m3375(thM63152);
                int i = 1;
                String strM3209 = C0032.m3209(m7070(), 0, 17, 1732);
                int i2 = (strM3375 == null || !C0028.m2625(strM3375, strM3209)) ? 1 : 0;
                if (strM33752 != null && C0028.m2625(strM33752, strM3209)) {
                    i = 0;
                }
                return i - i2;
            case 1:
                E1 e1 = (E1) obj;
                E1 e12 = (E1) obj2;
                if (C0070.m5838(C0073.m6428(e1), C0073.m6428(e12))) {
                    return 0;
                }
                return C0032.m3179(e1) < C0032.m3179(e12) ? -1 : 1;
            default:
                V v = (V) obj;
                V v2 = (V) obj2;
                int iM4361 = C0063.m4361(v) - C0063.m4361(v2);
                if (iM4361 != 0) {
                    return iM4361;
                }
                int iM4855 = C0066.m4855(C0067.m5444(C0077.m7271(v)), C0067.m5444(C0077.m7271(v2)));
                if (iM4855 != 0) {
                    return iM4855;
                }
                V4 v4M3820 = C0037.m3820(v);
                boolean z3 = v4M3820 == null;
                V4 v4M38202 = C0037.m3820(v2);
                boolean z4 = v4M38202 == null;
                if (z3) {
                    return z4 ? 0 : -1;
                }
                if (z4) {
                    return 1;
                }
                return C0066.m4855(C0067.m5444(v4M3820), C0067.m5444(v4M38202));
        }
    }
}
