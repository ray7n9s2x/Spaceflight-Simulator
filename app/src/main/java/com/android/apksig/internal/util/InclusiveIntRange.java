package com.android.apksig.internal.util;

import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class InclusiveIntRange {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f117short = {1868, 1207, 1211, 596, 10733, 3034};
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m2381() {
        if (C0068.m5678() >= 0) {
            return f117short;
        }
        return null;
    }

    public static InclusiveIntRange from(int i) {
        return new InclusiveIntRange(i, Integer.MAX_VALUE);
    }

    public static InclusiveIntRange fromTo(int i, int i2) {
        return new InclusiveIntRange(i, i2);
    }

    public int getMax() {
        return C0064.m4563(this);
    }

    public int getMin() {
        return C0069.m5788(this);
    }

    public String toString() {
        String strM6902;
        StringBuilder sb = new StringBuilder(C0066.m4828(m2381(), 0, 1, 1815));
        C0021.m1551(sb, C0069.m5788(this));
        C0077.m7290(sb, C0027.m2404(m2381(), 1, 2, 1179));
        int iM4563 = C0064.m4563(this);
        if (iM4563 < Integer.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            C0021.m1551(sb2, iM4563);
            C0077.m7290(sb2, C0016.m625(m2381(), 3, 1, 521));
            strM6902 = C0068.m5536(sb2);
        } else {
            strM6902 = C0076.m6902(m2381(), 4, 2, 3059);
        }
        C0077.m7290(sb, strM6902);
        return C0068.m5536(sb);
    }

    public InclusiveIntRange(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public List<InclusiveIntRange> getValuesNotIn(List<InclusiveIntRange> list) {
        if (C0025.m2084(list)) {
            return C0111.m13086(this);
        }
        Iterator itM4732 = C0065.m4732(list);
        int iM5788 = C0069.m5788(this);
        ArrayList arrayList = null;
        while (true) {
            boolean zM3657 = C0036.m3657(itM4732);
            int iM4563 = C0064.m4563(this);
            if (zM3657) {
                InclusiveIntRange inclusiveIntRange = (InclusiveIntRange) C0071.m6012(itM4732);
                int iM45632 = C0064.m4563(inclusiveIntRange);
                if (iM5788 <= iM45632) {
                    int iM57882 = C0069.m5788(inclusiveIntRange);
                    if (iM5788 < iM57882) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C0077.m7162(arrayList, C0018.m1093(iM5788, iM57882 - 1));
                    }
                    if (iM45632 >= iM4563) {
                        if (arrayList == null) {
                            return C0037.m3866();
                        }
                        return arrayList;
                    }
                    iM5788 = iM45632 + 1;
                }
            } else {
                if (iM5788 <= iM4563) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    C0077.m7162(arrayList, C0018.m1093(iM5788, iM4563));
                }
                if (arrayList == null) {
                    return C0037.m3866();
                }
                return arrayList;
            }
        }
    }
}
