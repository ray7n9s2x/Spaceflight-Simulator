package com.android.apksig.internal.apk.v1;

import com.android.apksig.C0038;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public enum DigestAlgorithm {
    SHA1(C0069.m5807(f60short, 0, 5, 2342)),
    SHA256(C0067.m5418(f60short, 9, 7, 2574));

    public final String a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f60short = {2421, 2414, 2407, 2315, 2327, 1557, 1550, 1543, 1655, 2653, 2630, 2639, 2595, 2620, 2619, 2616, 1559, 1548, 1541, 1654, 1649, 1650};
    public static Comparator<DigestAlgorithm> BY_STRENGTH_COMPARATOR = new Comparator<DigestAlgorithm>(null) { // from class: com.android.apksig.internal.apk.v1.DigestAlgorithm.StrengthComparator

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f61short = {735, 740, 761, 767, 762, 762, 741, 760, 766, 751, 750, 682, 747, 742, 749, 741, 760, 739, 766, 738, 743, 688, 682};

        /* JADX INFO: renamed from: ۧۧۦۣ, reason: not valid java name and contains not printable characters */
        public static short[] m1094() {
            if (C0031.m3075() > 0) {
                return f61short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۨۤۧ, reason: not valid java name and contains not printable characters */
        public static int m1095(Object obj, Object obj2, Object obj3) {
            if (C0038.m4010() > 0) {
                return ((StrengthComparator) obj).compare2((DigestAlgorithm) obj2, (DigestAlgorithm) obj3);
            }
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(DigestAlgorithm digestAlgorithm, DigestAlgorithm digestAlgorithm2) {
            return m1095(this, digestAlgorithm, digestAlgorithm2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(DigestAlgorithm digestAlgorithm, DigestAlgorithm digestAlgorithm2) {
            int iM2893 = C0030.m2893(digestAlgorithm);
            String strM3603 = C0035.m3603(m1094(), 0, 23, 650);
            if (iM2893 == 0) {
                int iM28932 = C0030.m2893(digestAlgorithm2);
                if (iM28932 == 0) {
                    return 0;
                }
                if (iM28932 == 1) {
                    return -1;
                }
                StringBuilder sb = new StringBuilder(strM3603);
                C0036.m3741(sb, digestAlgorithm2);
                throw new RuntimeException(C0068.m5536(sb));
            }
            if (iM2893 != 1) {
                StringBuilder sb2 = new StringBuilder(strM3603);
                C0036.m3741(sb2, digestAlgorithm);
                throw new RuntimeException(C0068.m5536(sb2));
            }
            int iM28933 = C0030.m2893(digestAlgorithm2);
            if (iM28933 == 0) {
                return 1;
            }
            if (iM28933 == 1) {
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(strM3603);
            C0036.m3741(sb3, digestAlgorithm2);
            throw new RuntimeException(C0068.m5536(sb3));
        }
    };

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v1.DigestAlgorithm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public String getJcaMessageDigestAlgorithm() {
        return this.a;
    }

    DigestAlgorithm(String str) {
        this.a = str;
    }
}
