package com.joke.plugin.gson.reflect;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class TypeToken<T> {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f209short = {559, 532, 543, 514, 522, 543, 537, 526, 543, 542, 602, 526, 515, 522, 543, 596, 602, 575, 514, 522, 543, 537, 526, 543, 542, 602, 533, 532, 543, 602, 533, 540, 576, 602, 2732, 2720, 793, 782, 783, 859, 796, 788, 783, 833, 859, 3071, 3059, 2997, 3004, 2977, 3059, 2983, 2986, 2979, 2998, 3059, 2983, 3004, 3000, 2998, 3005, 3049, 3059, 629, 593, 587, 587, 593, 598, 607, 536, 588, 577, 584, 605, 536, 584, 601, 586, 601, 597, 605, 588, 605, 586, 534};
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    public TypeToken() {
        Type typeM970 = C0018.m970(C0030.m2951(this));
        this.type = typeM970;
        this.rawType = C0038.m3971(typeM970);
        this.hashCode = C0037.m3818(typeM970);
    }

    public static TypeToken<?> get(Type type) {
        return new TypeToken<>(type);
    }

    /* JADX INFO: renamed from: ۟ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Class m6097(Object obj) {
        if (C0024.m2011() < 0) {
            return ((TypeToken) obj).rawType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6098() {
        if (C0017.m846() >= 0) {
            return f209short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۤ, reason: not valid java name and contains not printable characters */
    public static Type m6099(Object obj) {
        if (C0031.m3075() > 0) {
            return ((TypeToken) obj).type;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static AssertionError m6100(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            return buildUnexpectedTypeError((Type) obj, (Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6101(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return isAssignableFrom((Type) obj, (GenericArrayType) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟۟۠, reason: contains not printable characters */
    public static boolean m6102(Object obj, Object obj2, Object obj3) {
        if (C0021.m1598() < 0) {
            return matches((Type) obj, (Type) obj2, (Map) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۥۥ, reason: contains not printable characters */
    public static boolean m6103(Object obj, Object obj2, Object obj3) {
        if (C0036.m3653() < 0) {
            return typeEquals((ParameterizedType) obj, (ParameterizedType) obj2, (Map) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۥۦ, reason: not valid java name and contains not printable characters */
    public static int m6104(Object obj) {
        if (C0029.m2791() > 0) {
            return ((TypeToken) obj).hashCode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6105(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() < 0) {
            return isAssignableFrom((Type) obj, (ParameterizedType) obj2, (Map) obj3);
        }
        return false;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return C0019.m1301(this, cls);
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder(C0020.m1443(m6098(), 0, 34, 634));
        for (Class<?> cls : clsArr) {
            C0077.m7290(sb, C0038.m3997(cls));
            C0077.m7290(sb, C0018.m1070(m6098(), 34, 2, 2688));
        }
        C0077.m7290(sb, C0071.m5991(m6098(), 36, 9, 891));
        C0077.m7290(sb, C0038.m3997(C0030.m2951(type)));
        C0077.m7290(sb, C0032.m3209(m6098(), 45, 18, 3027));
        C0077.m7290(sb, C0074.m6524(type));
        C0077.m7289(sb, '.');
        return new AssertionError(C0068.m5536(sb));
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    public static TypeToken<?> getArray(Type type) {
        return new TypeToken<>(C0018.m994(type));
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
        return new TypeToken<>(C0017.m838(null, type, typeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C0063.m4433(m6099(this), m6099((TypeToken) obj));
    }

    public final Class<? super T> getRawType() {
        return m6097(this);
    }

    public final Type getType() {
        return m6099(this);
    }

    public final int hashCode() {
        return m6104(this);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (C0023.m1865(m6099(this), type)) {
            return true;
        }
        Type typeM6099 = m6099(this);
        if (typeM6099 instanceof Class) {
            return C0031.m2999(m6097(this), C0038.m3971(type));
        }
        if (typeM6099 instanceof ParameterizedType) {
            return m6105(type, (ParameterizedType) typeM6099, new HashMap());
        }
        if (typeM6099 instanceof GenericArrayType) {
            return C0031.m2999(m6097(this), C0038.m3971(type)) && m6101(type, (GenericArrayType) m6099(this));
        }
        throw m6100(typeM6099, new Class[]{Class.class, ParameterizedType.class, GenericArrayType.class});
    }

    public final String toString() {
        return C0030.m2833(m6099(this));
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type typeM6547 = C0074.m6547(cls);
        if (!(typeM6547 instanceof Class)) {
            return C0034.m3425(C0023.m1911((ParameterizedType) typeM6547)[0]);
        }
        throw new RuntimeException(C0034.m3431(m6098(), 63, 23, 568));
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        if (!C0023.m1865(type2, type) && (!(type instanceof TypeVariable) || !C0023.m1865(type2, C0072.m6108(map, C0025.m2185((TypeVariable) type))))) {
            return false;
        }
        return true;
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!C0023.m1865(C0029.m2817(parameterizedType), C0029.m2817(parameterizedType2))) {
            return false;
        }
        Type[] typeArrM1911 = C0023.m1911(parameterizedType);
        Type[] typeArrM19112 = C0023.m1911(parameterizedType2);
        for (int i = 0; i < typeArrM1911.length; i++) {
            if (!m6102(typeArrM1911[i], typeArrM19112[i], map)) {
                return false;
            }
        }
        return true;
    }

    public TypeToken(Type type) {
        Type typeM3425 = C0034.m3425((Type) C0027.m2407(type));
        this.type = typeM3425;
        this.rawType = C0038.m3971(typeM3425);
        this.hashCode = C0037.m3818(typeM3425);
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return C0019.m1301(this, C0070.m5860(typeToken));
    }

    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type typeM712 = type;
        Type typeM858 = C0017.m858(genericArrayType);
        if (!(typeM858 instanceof ParameterizedType)) {
            return true;
        }
        if (typeM712 instanceof GenericArrayType) {
            typeM712 = C0017.m858((GenericArrayType) typeM712);
        } else if (typeM712 instanceof Class) {
            typeM712 = (Class) typeM712;
            while (C0111.m13160(typeM712)) {
                typeM712 = C0016.m712(typeM712);
            }
        }
        return m6105(typeM712, (ParameterizedType) typeM858, new HashMap());
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (C0023.m1865(parameterizedType, type)) {
            return true;
        }
        Class clsM3971 = C0038.m3971(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] typeArrM1911 = C0023.m1911(parameterizedType2);
            TypeVariable[] typeVariableArrM4301 = C0063.m4301(clsM3971);
            for (int i = 0; i < typeArrM1911.length; i++) {
                Type type2 = typeArrM1911[i];
                TypeVariable typeVariable = typeVariableArrM4301[i];
                while (type2 instanceof TypeVariable) {
                    type2 = (Type) C0072.m6108(map, C0025.m2185((TypeVariable) type2));
                }
                C0035.m3624(map, C0025.m2185(typeVariable), type2);
            }
            if (m6103(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : C0067.m5519(clsM3971)) {
            if (m6105(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return m6105(C0074.m6547(clsM3971), parameterizedType, new HashMap(map));
    }
}
