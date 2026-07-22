package com.joke.plugin.gson.internal;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UnsafeAllocator {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f178short = {1027, 1056, 1073, 1078, 1072, 1059, 1057, 1078, 1122, 1057, 1070, 1059, 1073, 1073, 1122, 1057, 1059, 1068, 1125, 1078, 1122, 1056, 1063, 1122, 1067, 1068, 1073, 1078, 1059, 1068, 1078, 1067, 1059, 1078, 1063, 1062, 1123, 1122, 1025, 1070, 1059, 1073, 1073, 1122, 1068, 1059, 1071, 1063, 1144, 1122, 1587, 1556, 1550, 1567, 1544, 1564, 1563, 1561, 1567, 1626, 1561, 1563, 1556, 1629, 1550, 1626, 1560, 1567, 1626, 1555, 1556, 1545, 1550, 1563, 1556, 1550, 1555, 1563, 1550, 1567, 1566, 1627, 1626, 1587, 1556, 1550, 1567, 1544, 1564, 1563, 1561, 1567, 1626, 1556, 1563, 1559, 1567, 1600, 1626, 2796, 2791, 2805, 2763, 2796, 2801, 2806, 2787, 2796, 2785, 2791, 1531, 1533, 1510, 1446, 1509, 1505, 1531, 1515, 1446, 1501, 1510, 1531, 1513, 1518, 1517, 2324, 2312, 2309, 2357, 2318, 2323, 2305, 2310, 2309, 1963, 1958, 1958, 1957, 1961, 1963, 1982, 1967, 1923, 1956, 1977, 1982, 1963, 1956, 1961, 1967, 1674, 1672, 1689, 1710, 1666, 1667, 1694, 1689, 1695, 1688, 1678, 1689, 1666, 1695, 1700, 1673};

    public static UnsafeAllocator create() {
        String strM3829 = C0037.m3829(m5202(), 99, 11, 2690);
        try {
            try {
                try {
                    Class clsM4101 = C0039.m4101(C0020.m1443(m5202(), 110, 15, 1416));
                    Field fieldM5765 = C0069.m5765(clsM4101, C0064.m4545(m5202(), 125, 9, 2400));
                    C0035.m3619(fieldM5765, true);
                    final Object objM5443 = C0067.m5443(fieldM5765, null);
                    final Method methodM2690 = C0029.m2690(clsM4101, C0030.m2840(m5202(), 134, 16, 1994), new Class[]{Class.class});
                    return new UnsafeAllocator() { // from class: com.joke.plugin.gson.internal.UnsafeAllocator.1
                        /* JADX INFO: renamed from: ۟۟ۧۧ۠, reason: not valid java name and contains not printable characters */
                        public static Object m5203(Object obj) {
                            if (C0023.m1921() >= 0) {
                                return objM5443;
                            }
                            return null;
                        }

                        /* JADX INFO: renamed from: ۦۡۨ۟, reason: contains not printable characters */
                        public static Method m5204(Object obj) {
                            if (C0019.m1311() == 0) {
                                return methodM2690;
                            }
                            return null;
                        }

                        @Override // com.joke.plugin.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls) {
                            C0065.m4752(cls);
                            return (T) C0070.m5924(m5204(this), m5203(this), new Object[]{cls});
                        }
                    };
                } catch (Exception unused) {
                    Method methodM6369 = C0073.m6369(ObjectStreamClass.class, C0025.m2151(m5202(), 150, 16, 1773), new Class[]{Class.class});
                    C0035.m3619(methodM6369, true);
                    final int iM2170 = C0025.m2170((Integer) C0070.m5924(methodM6369, null, new Object[]{Object.class}));
                    final Method methodM63692 = C0073.m6369(ObjectStreamClass.class, strM3829, new Class[]{Class.class, C0072.m6191()});
                    C0035.m3619(methodM63692, true);
                    return new UnsafeAllocator() { // from class: com.joke.plugin.gson.internal.UnsafeAllocator.2
                        /* JADX INFO: renamed from: ۣ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
                        public static int m5205(Object obj) {
                            if (C0037.m3837() <= 0) {
                                return iM2170;
                            }
                            return 0;
                        }

                        /* JADX INFO: renamed from: ۣۨۥۧ, reason: not valid java name and contains not printable characters */
                        public static Method m5206(Object obj) {
                            if (C0029.m2791() >= 0) {
                                return methodM63692;
                            }
                            return null;
                        }

                        @Override // com.joke.plugin.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls) {
                            C0065.m4752(cls);
                            return (T) C0070.m5924(m5206(this), null, new Object[]{cls, C0021.m1548(m5205(this))});
                        }
                    };
                }
            } catch (Exception unused2) {
                final Method methodM63693 = C0073.m6369(ObjectInputStream.class, strM3829, new Class[]{Class.class, Class.class});
                C0035.m3619(methodM63693, true);
                return new UnsafeAllocator() { // from class: com.joke.plugin.gson.internal.UnsafeAllocator.3
                    /* JADX INFO: renamed from: ۟ۤۢۦۨ, reason: not valid java name and contains not printable characters */
                    public static Method m5207(Object obj) {
                        if (C0078.m7450() >= 0) {
                            return methodM63693;
                        }
                        return null;
                    }

                    @Override // com.joke.plugin.gson.internal.UnsafeAllocator
                    public <T> T newInstance(Class<T> cls) {
                        C0065.m4752(cls);
                        return (T) C0070.m5924(m5207(this), null, new Object[]{cls, Object.class});
                    }
                };
            }
        } catch (Exception unused3) {
            return new UnsafeAllocator() { // from class: com.joke.plugin.gson.internal.UnsafeAllocator.4

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f179short = {2484, 2454, 2457, 2457, 2456, 2435, 2519, 2454, 2459, 2459, 2456, 2452, 2454, 2435, 2450, 2519};

                /* JADX INFO: renamed from: ۟ۢ۠ۥ۟, reason: not valid java name and contains not printable characters */
                public static short[] m5208() {
                    if (C0030.m2940() >= 0) {
                        return f179short;
                    }
                    return null;
                }

                @Override // com.joke.plugin.gson.internal.UnsafeAllocator
                public <T> T newInstance(Class<T> cls) {
                    StringBuilder sb = new StringBuilder(C0036.m3678(m5208(), 0, 16, 2551));
                    C0036.m3741(sb, cls);
                    throw new UnsupportedOperationException(C0068.m5536(sb));
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۡۢۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5202() {
        if (C0016.m717() <= 0) {
            return f178short;
        }
        return null;
    }

    public abstract <T> T newInstance(Class<T> cls);

    public static void assertInstantiable(Class<?> cls) {
        int iM6406 = C0073.m6406(cls);
        if (!C0021.m1648(iM6406)) {
            if (!C0038.m4033(iM6406)) {
                return;
            }
            throw new UnsupportedOperationException(C0032.m3232(C0070.m5942(m5202(), 0, 50, 1090), C0038.m3997(cls)));
        }
        throw new UnsupportedOperationException(C0032.m3232(C0029.m2695(m5202(), 50, 49, 1658), C0038.m3997(cls)));
    }
}
