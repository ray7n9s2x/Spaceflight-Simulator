package com.joke.script.bean;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;

/* JADX INFO: loaded from: classes3.dex */
public enum MatchType {
    CONTAIN(C0066.m4828(f216short, 0, 13, 2895)),
    PERFECT(C0030.m2840(f216short, 20, 11, 1908)),
    CLICK(C0025.m2151(f216short, 38, 13, 2667)),
    CONTINUE(C0066.m4828(f216short, 56, 18, 923)),
    JumpNode(C0029.m2695(f216short, 82, 20, 2237)),
    JumpProject(C0019.m1189(f216short, 110, 20, 2585)),
    BREAK(C0032.m3209(f216short, 141, 19, 626));


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f216short = {2828, 2848, 2849, 2875, 2862, 2854, 2849, 2876, 2927, 2843, 2858, 2871, 2875, 1020, 1008, 1009, 1003, 1022, 1014, 1009, 1841, 1804, 1813, 1815, 1792, 1876, 1817, 1813, 1792, 1815, 1820, 2045, 2024, 2047, 2027, 2024, 2030, 2041, 2600, 2567, 2562, 2568, 2560, 2635, 2568, 2564, 2565, 2591, 2574, 2565, 2591, 781, 770, 775, 781, 773, 984, 1012, 1013, 1007, 1010, 1013, 1006, 1022, 955, 990, 995, 1022, 1016, 1006, 1007, 1010, 1012, 1013, 1009, 1021, 1020, 998, 1019, 1020, 999, 1015, 2295, 2248, 2256, 2253, 2205, 2249, 2258, 2205, 2258, 2249, 2261, 2264, 2255, 2205, 2268, 2270, 2249, 2260, 2258, 2259, 2260, 2283, 2291, 2286, 2256, 2289, 2298, 2299, 2643, 2668, 2676, 2665, 2617, 2669, 2678, 2617, 2678, 2669, 2673, 2684, 2667, 2617, 2667, 2684, 2682, 2678, 2667, 2685, 1259, 1236, 1228, 1233, 1265, 1235, 1230, 1227, 1220, 1218, 1237, 571, 540, 518, 535, 512, 512, 519, 514, 518, 594, 567, 522, 535, 529, 519, 518, 539, 541, 540, 2993, 2977, 2998, 2994, 3000};
    private String value;

    public String getValue() {
        return this.value;
    }

    MatchType(String str) {
        this.value = str;
    }
}
