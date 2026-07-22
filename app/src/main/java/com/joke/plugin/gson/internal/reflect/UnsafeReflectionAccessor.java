package com.joke.plugin.gson.internal.reflect;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.JsonIOException;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
final class UnsafeReflectionAccessor extends ReflectionAccessor {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f205short = {3135, 3110, 3125, 3106, 3106, 3129, 3124, 3125, 1584, 1590, 1581, 1645, 1582, 1578, 1584, 1568, 1645, 1558, 1581, 1584, 1570, 1573, 1574, 2533, 2553, 2548, 2500, 2559, 2530, 2544, 2551, 2548, 2628, 2672, 2668, 2669, 2595, 2656, 2668, 2678, 2671, 2663, 2669, 2596, 2679, 2595, 2670, 2668, 2663, 2666, 2661, 2682, 2595, 2661, 2666, 2662, 2671, 2663, 2672, 2595, 2661, 2668, 2673, 2595, 1546, 1633, 1646, 1636, 1568, 1651, 1653, 1646, 1582, 1645, 1641, 1651, 1635, 1582, 1621, 1646, 1651, 1633, 1638, 1637, 1568, 1646, 1647, 1652, 1568, 1638, 1647, 1653, 1646, 1636, 1582, 1546, 1605, 1641, 1652, 1640, 1637, 1650, 1568, 1655, 1650, 1641, 1652, 1637, 1568, 1633, 1568, 1635, 1653, 1651, 1652, 1647, 1645, 1568, 1652, 1657, 1648, 1637, 1568, 1633, 1636, 1633, 1648, 1652, 1637, 1650, 1580, 1568, 1647, 1650, 1568, 1645, 1633, 1643, 1637, 1568, 1638, 1641, 1637, 1644, 1636, 1651, 1568, 1633, 1635, 1635, 1637, 1651, 1651, 1641, 1634, 1644, 1637, 1580, 1568, 1647, 1650, 1568, 1641, 1646, 1635, 1644, 1653, 1636, 1637, 1568, 1651, 1653, 1646, 1582, 1645, 1641, 1651, 1635, 1582, 1621, 1646, 1651, 1633, 1638, 1637, 1582, 2680, 2677, 2685, 2674, 2676, 2659, 2641, 2686, 2674, 2683, 2675, 2648, 2673, 2673, 2660, 2674, 2659, 2789, 2784, 2785, 2775, 2810, 2810, 2809, 2800, 2804, 2811};
    private static Class unsafeClass;
    private final Object theUnsafe = m5688();
    private final Field overrideField = m5692();

    private static Object getUnsafeInstance() {
        try {
            Class clsM4101 = C0039.m4101(C0064.m4545(m5693(), 8, 15, 1603));
            unsafeClass = clsM4101;
            Field fieldM5765 = C0069.m5765(clsM4101, C0030.m2840(m5693(), 23, 9, 2449));
            C0035.m3619(fieldM5765, true);
            return C0067.m5443(fieldM5765, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m5688() {
        if (C0023.m1921() >= 0) {
            return getUnsafeInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m5689(Object obj, Object obj2) {
        if (C0066.m4827() >= 0) {
            return ((UnsafeReflectionAccessor) obj).makeAccessibleWithUnsafe((AccessibleObject) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static Field m5690(Object obj) {
        if (C0016.m717() <= 0) {
            return ((UnsafeReflectionAccessor) obj).overrideField;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m5691(Object obj) {
        if (C0035.m3569() < 0) {
            return ((UnsafeReflectionAccessor) obj).theUnsafe;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Field m5692() {
        if (C0033.m3358() < 0) {
            return getOverrideField();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5693() {
        if (C0038.m4010() >= 0) {
            return f205short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static Class m5694() {
        if (C0072.m6216() >= 0) {
            return unsafeClass;
        }
        return null;
    }

    public boolean makeAccessibleWithUnsafe(AccessibleObject accessibleObject) {
        if (m5691(this) != null && m5690(this) != null) {
            try {
                Long l = (Long) C0070.m5924(C0029.m2690(m5694(), C0111.m13097(m5693(), 186, 17, 2583), new Class[]{Field.class}), m5691(this), new Object[]{m5690(this)});
                C0016.m704(l);
                C0070.m5924(C0029.m2690(m5694(), C0032.m3209(m5693(), 203, 10, 2709), new Class[]{Object.class, C0066.m4824(), C0024.m2007()}), m5691(this), new Object[]{accessibleObject, l, C0018.m1065()});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Field getOverrideField() {
        try {
            return C0069.m5765(AccessibleObject.class, C0024.m1945(m5693(), 0, 8, 3152));
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.joke.plugin.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(AccessibleObject accessibleObject) {
        if (!m5689(this, accessibleObject)) {
            try {
                C0035.m3619(accessibleObject, true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder(C0023.m1904(m5693(), 32, 32, 2563));
                C0036.m3741(sb, accessibleObject);
                C0077.m7290(sb, C0036.m3678(m5693(), 64, 122, 1536));
                throw new JsonIOException(C0068.m5536(sb), e);
            }
        }
    }
}
