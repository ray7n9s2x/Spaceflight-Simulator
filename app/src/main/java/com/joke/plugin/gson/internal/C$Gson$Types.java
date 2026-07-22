package com.joke.plugin.gson.internal;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.joke.plugin.gson.internal.$Gson$Types, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C$Gson$Types {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f165short = {801, 826, 803, 803, 2520, 2533, 2541, 2552, 2558, 2537, 2552, 2553, 2493, 2556, 2493, 2526, 2545, 2556, 2542, 2542, 2481, 2493, 2509, 2556, 2543, 2556, 2544, 2552, 2537, 2552, 2543, 2548, 2535, 2552, 2553, 2505, 2532, 2541, 2552, 2481, 2493, 2546, 2543, 2493, 2522, 2552, 2547, 2552, 2543, 2548, 2558, 2524, 2543, 2543, 2556, 2532, 2505, 2532, 2541, 2552, 2481, 2493, 2559, 2536, 2537, 2493, 2465, 678, 696, 753, 747, 696, 759, 766, 696, 748, 737, 744, 765, 696};
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    /* JADX INFO: renamed from: com.joke.plugin.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f166short = {532, 530};
        private final Type componentType;

        /* JADX INFO: renamed from: ۟ۢۧۦۡ, reason: not valid java name and contains not printable characters */
        public static Type m5009(Object obj) {
            if (C0071.m6069() >= 0) {
                return ((GenericArrayTypeImpl) obj).componentType;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۥۤۢ, reason: not valid java name and contains not printable characters */
        public static short[] m5010() {
            if (C0030.m2940() >= 0) {
                return f166short;
            }
            return null;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0063.m4433(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return m5009(this);
        }

        public int hashCode() {
            return C0037.m3818(m5009(this));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0030.m2833(m5009(this)));
            C0077.m7290(sb, C0078.m7427(m5010(), 0, 2, 591));
            return C0068.m5536(sb);
        }

        public GenericArrayTypeImpl(Type type) {
            this.componentType = C0034.m3425(type);
        }
    }

    /* JADX INFO: renamed from: com.joke.plugin.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f167short = {740, 2885, 2889, 658};
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        /* JADX INFO: renamed from: ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
        public static Type[] m5011(Object obj) {
            if (C0073.m6356() <= 0) {
                return ((ParameterizedTypeImpl) obj).typeArguments;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡۥۣۨ, reason: not valid java name and contains not printable characters */
        public static Object m5012(Object obj) {
            if (C0037.m3837() < 0) {
                return ((Type[]) obj).clone();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
        public static Type m5013(Object obj) {
            if (C0021.m1598() < 0) {
                return ((ParameterizedTypeImpl) obj).rawType;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۡۧ۟, reason: not valid java name and contains not printable characters */
        public static short[] m5014() {
            if (C0030.m2940() >= 0) {
                return f167short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۧۧۤ, reason: not valid java name and contains not printable characters */
        public static Type m5015(Object obj) {
            if (C0017.m846() >= 0) {
                return ((ParameterizedTypeImpl) obj).ownerType;
            }
            return null;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0063.m4433(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) m5012(m5011(this));
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return m5015(this);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return m5013(this);
        }

        public int hashCode() {
            return (C0035.m3544(m5011(this)) ^ C0037.m3818(m5013(this))) ^ C0021.m1588(m5015(this));
        }

        public String toString() {
            int length = m5011(this).length;
            if (length == 0) {
                return C0030.m2833(m5013(this));
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            C0077.m7290(sb, C0030.m2833(m5013(this)));
            C0077.m7290(sb, C0030.m2840(m5014(), 0, 1, 728));
            C0077.m7290(sb, C0030.m2833(m5011(this)[0]));
            for (int i = 1; i < length; i++) {
                C0077.m7290(sb, C0074.m6452(m5014(), 1, 2, 2921));
                C0077.m7290(sb, C0030.m2833(m5011(this)[i]));
            }
            C0077.m7290(sb, C0111.m13097(m5014(), 3, 1, 684));
            return C0068.m5536(sb);
        }

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            Type typeM3425;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (!C0016.m638(C0073.m6406(cls)) && C0019.m1295(cls) != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C0027.m2523(z2);
            }
            if (type == null) {
                typeM3425 = null;
            } else {
                typeM3425 = C0034.m3425(type);
            }
            this.ownerType = typeM3425;
            this.rawType = C0034.m3425(type2);
            Type[] typeArr2 = (Type[]) m5012(typeArr);
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C0027.m2407(m5011(this)[i]);
                C0018.m990(m5011(this)[i]);
                Type[] typeArrM5011 = m5011(this);
                typeArrM5011[i] = C0034.m3425(typeArrM5011[i]);
            }
        }
    }

    /* JADX INFO: renamed from: com.joke.plugin.gson.internal.$Gson$Types$WildcardTypeImpl */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f168short = {2037, 2026, 1977, 1983, 1978, 1967, 1976, 2026, 2168, 335, 336, 277, 264, 260, 277, 286, 276, 259, 336};
        private final Type lowerBound;
        private final Type upperBound;

        /* JADX INFO: renamed from: ۟ۦ۟ۦۣ, reason: not valid java name and contains not printable characters */
        public static Type[] m5016() {
            if (C0032.m3184() < 0) {
                return C$Gson$Types.EMPTY_TYPE_ARRAY;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢ۟ۢۦ, reason: not valid java name and contains not printable characters */
        public static Type m5017(Object obj) {
            if (C0023.m1921() >= 0) {
                return ((WildcardTypeImpl) obj).lowerBound;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۥ۠ۨ, reason: contains not printable characters */
        public static Type m5018(Object obj) {
            if (C0032.m3184() < 0) {
                return ((WildcardTypeImpl) obj).upperBound;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۢۧۧ, reason: contains not printable characters */
        public static short[] m5019() {
            if (C0039.m4109() >= 0) {
                return f168short;
            }
            return null;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0063.m4433(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type typeM5017 = m5017(this);
            return typeM5017 != null ? new Type[]{typeM5017} : m5016();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{m5018(this)};
        }

        public int hashCode() {
            Type typeM5017 = m5017(this);
            return (typeM5017 != null ? C0037.m3818(typeM5017) + 31 : 1) ^ (C0037.m3818(m5018(this)) + 31);
        }

        public String toString() {
            if (m5017(this) != null) {
                StringBuilder sb = new StringBuilder(C0030.m2840(m5019(), 0, 8, 1994));
                C0077.m7290(sb, C0030.m2833(m5017(this)));
                return C0068.m5536(sb);
            }
            if (m5018(this) == Object.class) {
                return C0030.m2840(m5019(), 8, 1, 2119);
            }
            StringBuilder sb2 = new StringBuilder(C0074.m6452(m5019(), 9, 10, 368));
            C0077.m7290(sb2, C0030.m2833(m5018(this)));
            return C0068.m5536(sb2);
        }

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C0027.m2523(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0027.m2523(z2);
            if (typeArr2.length == 1) {
                C0027.m2407(typeArr2[0]);
                C0018.m990(typeArr2[0]);
                C0027.m2523(typeArr[0] == Object.class);
                this.lowerBound = C0034.m3425(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            C0027.m2407(typeArr[0]);
            C0018.m990(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C0034.m3425(typeArr[0]);
        }
    }

    public static boolean equals(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return C0023.m1865(type, type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return C0018.m981(C0028.m2647(parameterizedType), C0028.m2647(parameterizedType2)) && C0023.m1865(C0029.m2817(parameterizedType), C0029.m2817(parameterizedType2)) && C0035.m3558(C0023.m1911(parameterizedType), C0023.m1911(parameterizedType2));
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return C0063.m4433(C0017.m858((GenericArrayType) type), C0017.m858((GenericArrayType) type2));
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return C0035.m3558(C0021.m1610(wildcardType), C0021.m1610(wildcardType2)) && C0035.m3558(C0070.m5949(wildcardType), C0070.m5949(wildcardType2));
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return C0019.m1271(typeVariable) == C0019.m1271(typeVariable2) && C0070.m5838(C0025.m2185(typeVariable), C0025.m2185(typeVariable2));
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM3199 = C0032.m3199(type, cls, Map.class);
        return typeM3199 instanceof ParameterizedType ? C0023.m1911((ParameterizedType) typeM3199) : new Type[]{Object.class, Object.class};
    }

    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (C0023.m1865(obj, objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return m5007(type, cls, type2, new HashSet());
    }

    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? C0070.m5949((WildcardType) type) : new Type[]{type});
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m5003(Object obj, Object obj2) {
        if (C0075.m6893() >= 0) {
            return indexOf((Object[]) obj, obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static Class m5004(Object obj) {
        if (C0029.m2791() > 0) {
            return declaringClassOf((TypeVariable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Object m5005(Object obj) {
        if (C0071.m6069() > 0) {
            return ((Type[]) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5006() {
        if (C0075.m6893() > 0) {
            return f165short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠۠, reason: not valid java name and contains not printable characters */
    public static Type m5007(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0024.m2011() <= 0) {
            return resolve((Type) obj, (Class) obj2, (Type) obj3, (Collection) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ۠, reason: contains not printable characters */
    public static Type[] m5008() {
        if (C0023.m1921() >= 0) {
            return EMPTY_TYPE_ARRAY;
        }
        return null;
    }

    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return C0111.m13160(cls) ? new GenericArrayTypeImpl(C0034.m3425(C0016.m712(cls))) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(C0028.m2647(parameterizedType), C0029.m2817(parameterizedType), C0023.m1911(parameterizedType));
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(C0017.m858((GenericArrayType) type));
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(C0021.m1610(wildcardType), C0070.m5949(wildcardType));
    }

    public static void checkNotPrimitive(Type type) {
        C0027.m2523(((type instanceof Class) && C0068.m5581((Class) type)) ? false : true);
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && C0023.m1865(obj, obj2));
    }

    public static Type getArrayComponentType(Type type) {
        return type instanceof GenericArrayType ? C0017.m858((GenericArrayType) type) : C0016.m712((Class) type);
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
        Type typeM3199 = C0032.m3199(type, cls, Collection.class);
        if (typeM3199 instanceof WildcardType) {
            typeM3199 = C0021.m1610((WildcardType) typeM3199)[0];
        }
        return typeM3199 instanceof ParameterizedType ? C0023.m1911((ParameterizedType) typeM3199)[0] : Object.class;
    }

    public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> cls3 = cls;
        if (cls2 == cls3) {
            return type;
        }
        if (C0025.m2202(cls2)) {
            Class<?>[] clsArrM5598 = C0068.m5598(cls3);
            int length = clsArrM5598.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls4 = clsArrM5598[i];
                if (cls4 == cls2) {
                    return C0067.m5519(cls3)[i];
                }
                if (C0031.m2999(cls2, cls4)) {
                    return C0067.m5438(C0067.m5519(cls3)[i], clsArrM5598[i], cls2);
                }
            }
        }
        if (!C0025.m2202(cls3)) {
            while (cls3 != Object.class) {
                Class<?> clsM4763 = C0065.m4763(cls3);
                if (clsM4763 == cls2) {
                    return C0074.m6547(cls3);
                }
                if (C0031.m2999(cls2, clsM4763)) {
                    return C0067.m5438(C0074.m6547(cls3), clsM4763, cls2);
                }
                cls3 = clsM4763;
            }
        }
        return cls2;
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type typeM2817 = C0029.m2817((ParameterizedType) type);
            C0027.m2523(typeM2817 instanceof Class);
            return (Class) typeM2817;
        }
        if (type instanceof GenericArrayType) {
            return C0030.m2951(C0032.m3145(C0038.m3971(C0017.m858((GenericArrayType) type)), 0));
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return C0038.m3971(C0021.m1610((WildcardType) type)[0]);
        }
        String strM5418 = type == null ? C0067.m5418(m5006(), 0, 4, 847) : C0038.m3997(C0030.m2951(type));
        StringBuilder sb = new StringBuilder(C0024.m1945(m5006(), 4, 63, 2461));
        C0036.m3741(sb, type);
        C0077.m7290(sb, C0032.m3209(m5006(), 67, 13, 664));
        C0077.m7290(sb, strM5418);
        throw new IllegalArgumentException(C0068.m5536(sb));
    }

    public static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        Type type2 = type;
        if (type2 instanceof WildcardType) {
            type2 = C0021.m1610((WildcardType) type2)[0];
        }
        C0027.m2523(C0031.m2999(cls2, cls));
        return C0074.m6574(type2, cls, C0067.m5438(type2, cls, cls2));
    }

    public static int hashCodeOrZero(Object obj) {
        if (obj != null) {
            return C0037.m3818(obj);
        }
        return 0;
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    private static Type resolve(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type typeM4863 = type2;
        while (typeM4863 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) typeM4863;
            if (C0025.m2113(collection, typeVariable)) {
                return typeM4863;
            }
            C0037.m3814(collection, typeVariable);
            typeM4863 = C0066.m4863(type, cls, typeVariable);
            if (typeM4863 == typeVariable) {
                return typeM4863;
            }
        }
        if (typeM4863 instanceof Class) {
            Class cls2 = (Class) typeM4863;
            if (C0111.m13160(cls2)) {
                Class clsM712 = C0016.m712(cls2);
                Type typeM5007 = m5007(type, cls, clsM712, collection);
                return clsM712 == typeM5007 ? cls2 : C0018.m994(typeM5007);
            }
        }
        if (typeM4863 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) typeM4863;
            Type typeM858 = C0017.m858(genericArrayType);
            Type typeM50072 = m5007(type, cls, typeM858, collection);
            return typeM858 == typeM50072 ? genericArrayType : C0018.m994(typeM50072);
        }
        if (!(typeM4863 instanceof ParameterizedType)) {
            if (typeM4863 instanceof WildcardType) {
                typeM4863 = (WildcardType) typeM4863;
                Type[] typeArrM5949 = C0070.m5949(typeM4863);
                Type[] typeArrM1610 = C0021.m1610(typeM4863);
                if (typeArrM5949.length == 1) {
                    Type typeM50073 = m5007(type, cls, typeArrM5949[0], collection);
                    if (typeM50073 != typeArrM5949[0]) {
                        return C0035.m3553(typeM50073);
                    }
                } else if (typeArrM1610.length == 1) {
                    Type typeM50074 = m5007(type, cls, typeArrM1610[0], collection);
                    if (typeM50074 != typeArrM1610[0]) {
                        return C0067.m5436(typeM50074);
                    }
                }
            }
            return typeM4863;
        }
        ParameterizedType parameterizedType = (ParameterizedType) typeM4863;
        Type typeM2647 = C0028.m2647(parameterizedType);
        Type typeM50075 = m5007(type, cls, typeM2647, collection);
        boolean z = typeM50075 != typeM2647;
        Type[] typeArrM1911 = C0023.m1911(parameterizedType);
        int length = typeArrM1911.length;
        for (int i = 0; i < length; i++) {
            Type typeM50076 = m5007(type, cls, typeArrM1911[i], collection);
            if (typeM50076 != typeArrM1911[i]) {
                if (!z) {
                    typeArrM1911 = (Type[]) m5005(typeArrM1911);
                    z = true;
                }
                typeArrM1911[i] = typeM50076;
            }
        }
        return z ? C0017.m838(typeM50075, C0029.m2817(parameterizedType), typeArrM1911) : parameterizedType;
    }

    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? C0021.m1610((WildcardType) type) : new Type[]{type}, m5008());
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? C0038.m3997((Class) type) : C0074.m6524(type);
    }

    private C$Gson$Types() {
        throw new UnsupportedOperationException();
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclarationM1271 = C0019.m1271(typeVariable);
        if (genericDeclarationM1271 instanceof Class) {
            return (Class) genericDeclarationM1271;
        }
        return null;
    }

    public static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class clsM5004 = m5004(typeVariable);
        if (clsM5004 == null) {
            return typeVariable;
        }
        Type typeM5438 = C0067.m5438(type, cls, clsM5004);
        if (!(typeM5438 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return C0023.m1911((ParameterizedType) typeM5438)[m5003(C0063.m4301(clsM5004), typeVariable)];
    }
}
