package com.zfork.multiplatforms.android.bomb;

import android.widget.BaseAdapter;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0034;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptRecordBean;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0370g4 extends BaseAdapter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f325short = {278, 262, 279, 268, 277, 273, 314, 268, 273, 256, 264, 314, 260, 262, 273, 268, 266, 267, 314, 278, 269, 260, 277, 256, 1109, 1108, 1113, 1092, 2912, 2941, 2941, 2918, 2553, 2536, 2549, 2553, 575, 559, 574, 549, 572, 568, 531, 549, 568, 553, 545, 531, 572, 574, 547, 572, 553, 574, 568, 565, 736, 752, 737, 762, 739, 743, 716, 762, 743, 758, 766, 716, 739, 737, 764, 761, 758, 752, 743, 716, 767, 762, 736, 743, 2172, 2144, 2157, 2165, 1773, 1789, 1772, 1783, 1774, 1770, 1729, 1783, 1789, 1729, 1774, 1778, 1791, 1767, 2718, 2702, 2719, 2692, 2717, 2713, 2738, 2692, 2702, 2738, 2696, 2697, 2692, 2713, 2738, 2692, 2713, 2696, 2688, 2738, 2689, 2692, 2718, 2713, 1837, 1853, 1836, 1847, 1838, 1834, 1793, 1847, 1834, 1851, 1843, 1793, 1855, 1853, 1834, 1847, 1841, 1840, 3010, 3011, 3018, 3011, 3026, 3011, 1815, 1878, 1810, 1815, 1857, -2330, -941, 892, 876, 893, 870, 895, 891, 848, 870, 876, 848, 874, 875, 870, 891, 2528, 2544, 2529, 2554, 2531, 2535, 2508, 2554, 2544, 2508, 2551, 2550, 2559, 2550, 2535, 2550};
    public final /* synthetic */ int a;
    public List b;
    public Object c;

    public /* synthetic */ C0370g4() {
        this.a = 1;
    }

    /* JADX INFO: renamed from: ۥۣۢۦ, reason: contains not printable characters */
    public static short[] m7065() {
        if (C0111.m13165() <= 0) {
            return f325short;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        switch (C0029.m2743(this)) {
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x02e3  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r63, android.view.View r64, android.view.ViewGroup r65) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0370g4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public /* synthetic */ C0370g4(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (C0029.m2743(this)) {
        }
        return C0034.m3427(C0025.m2173(this));
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (C0029.m2743(this)) {
            case 0:
                return (ScriptRecordBean) C0071.m6078(C0025.m2173(this), i);
            case 1:
                return (ScriptProjectAliasBean) C0071.m6078(C0025.m2173(this), i);
            default:
                return (MatchType) C0071.m6078(C0025.m2173(this), i);
        }
    }
}
