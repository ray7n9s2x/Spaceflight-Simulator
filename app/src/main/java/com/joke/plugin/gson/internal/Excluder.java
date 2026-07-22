package com.joke.plugin.gson.internal;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.ExclusionStrategy;
import com.joke.plugin.gson.FieldAttributes;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.Expose;
import com.joke.plugin.gson.annotations.Since;
import com.joke.plugin.gson.annotations.Until;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<ExclusionStrategy> serializationStrategies = C0037.m3866();
    private List<ExclusionStrategy> deserializationStrategies = C0037.m3866();

    /* JADX INFO: renamed from: ۟۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5037(Object obj) {
        if (C0064.m4578() > 0) {
            return ((Excluder) obj).requireExpose;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m5038(Object obj) {
        if (C0038.m4010() > 0) {
            return ((Excluder) obj).modifiers;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5039(Object obj, Object obj2, Object obj3) {
        if (C0036.m3653() < 0) {
            return ((Excluder) obj).isValidVersion((Since) obj2, (Until) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5040(Object obj) {
        if (C0111.m13165() < 0) {
            return ((Excluder) obj).serializeInnerClasses;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static List m5041(Object obj) {
        if (C0065.m4647() > 0) {
            return ((Excluder) obj).serializationStrategies;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5042(Object obj, Object obj2, boolean z) {
        if (C0027.m2460() > 0) {
            return ((Excluder) obj).excludeClassInStrategy((Class) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5043(Object obj, Object obj2) {
        if (C0029.m2791() > 0) {
            return ((Excluder) obj).isInnerClass((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5044(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((Excluder) obj).isValidSince((Since) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static List m5045(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((Excluder) obj).deserializationStrategies;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤۤ, reason: contains not printable characters */
    public static boolean m5046(Object obj, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((Excluder) obj).excludeClassChecks((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static boolean m5047(Object obj, Object obj2) {
        if (C0078.m7450() > 0) {
            return ((Excluder) obj).isValidUntil((Until) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۧ, reason: contains not printable characters */
    public static boolean m5048(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((Excluder) obj).isStatic((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static double m5049(Object obj) {
        return C0066.m4827() >= 0 ? ((Excluder) obj).version : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5050(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return ((Excluder) obj).isAnonymousOrLocal((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m5051clone() {
        return C0029.m2768(this);
    }

    private boolean excludeClassChecks(Class<?> cls) {
        if (m5049(this) == IGNORE_VERSIONS || m5039(this, (Since) C0030.m2921(cls, Since.class), (Until) C0030.m2921(cls, Until.class))) {
            return (!m5040(this) && m5043(this, cls)) || m5050(this, cls);
        }
        return true;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z) {
        Iterator itM4732 = C0065.m4732(z ? m5041(this) : m5045(this));
        while (C0036.m3657(itM4732)) {
            if (C0022.m1706((ExclusionStrategy) C0071.m6012(itM4732), cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrLocal(Class<?> cls) {
        return !C0031.m2999(Enum.class, cls) && (C0067.m5491(cls) || C0070.m5839(cls));
    }

    private boolean isValidSince(Since since) {
        return since == null || C0063.m4336(since) <= m5049(this);
    }

    private boolean isValidUntil(Until until) {
        return until == null || C0026.m2344(until) > m5049(this);
    }

    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean excludeField(Field field, boolean z) {
        Expose expose;
        if ((m5038(this) & C0066.m4843(field)) != 0) {
            return true;
        }
        if ((m5049(this) != IGNORE_VERSIONS && !m5039(this, (Since) C0037.m3791(field, Since.class), (Until) C0037.m3791(field, Until.class))) || C0024.m1960(field)) {
            return true;
        }
        if (m5037(this) && ((expose = (Expose) C0037.m3791(field, Expose.class)) == null || (!z ? C0075.m6808(expose) : C0036.m3711(expose)))) {
            return true;
        }
        if ((!m5040(this) && m5043(this, C0111.m13067(field))) || m5050(this, C0111.m13067(field))) {
            return true;
        }
        List listM5041 = z ? m5041(this) : m5045(this);
        if (C0025.m2084(listM5041)) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        Iterator itM4732 = C0065.m4732(listM5041);
        while (C0036.m3657(itM4732)) {
            if (C0018.m1089((ExclusionStrategy) C0071.m6012(itM4732), fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    private boolean isInnerClass(Class<?> cls) {
        if (C0027.m2450(cls) && !m5048(this, cls)) {
            return true;
        }
        return false;
    }

    private boolean isStatic(Class<?> cls) {
        if ((C0073.m6406(cls) & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean isValidVersion(Since since, Until until) {
        if (m5044(this, since) && m5047(this, until)) {
            return true;
        }
        return false;
    }

    @Override // com.joke.plugin.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final boolean z;
        final boolean z2;
        Class clsM3474 = C0034.m3474(typeToken);
        boolean zM5046 = m5046(this, clsM3474);
        if (!zM5046 && !m5042(this, clsM3474, true)) {
            z = false;
        } else {
            z = true;
        }
        if (!zM5046 && !m5042(this, clsM3474, false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.joke.plugin.gson.internal.Excluder.1
            private TypeAdapter<T> delegate;

            /* JADX INFO: renamed from: ۟۟ۧۨۦ, reason: not valid java name and contains not printable characters */
            public static Excluder m5052(Object obj) {
                if (C0074.m6454() < 0) {
                    return Excluder.this;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۢۢ۠۠, reason: not valid java name and contains not printable characters */
            public static boolean m5053(Object obj) {
                if (C0035.m3569() <= 0) {
                    return z;
                }
                return false;
            }

            /* JADX INFO: renamed from: ۟ۧۡۤ۟, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5054(Object obj) {
                if (C0018.m1064() >= 0) {
                    return ((AnonymousClass1) obj).delegate;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۡۥۨ, reason: not valid java name and contains not printable characters */
            public static boolean m5055(Object obj) {
                if (C0021.m1598() <= 0) {
                    return z2;
                }
                return false;
            }

            /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
            public static TypeToken m5056(Object obj) {
                if (C0071.m6069() >= 0) {
                    return typeToken;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۨۥۦۣ, reason: not valid java name and contains not printable characters */
            public static Gson m5057(Object obj) {
                if (C0076.m6903() <= 0) {
                    return gson;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5058(Object obj) {
                if (C0071.m6069() >= 0) {
                    return ((AnonymousClass1) obj).delegate();
                }
                return null;
            }

            private TypeAdapter<T> delegate() {
                TypeAdapter<T> typeAdapterM5054 = m5054(this);
                if (typeAdapterM5054 != null) {
                    return typeAdapterM5054;
                }
                TypeAdapter<T> typeAdapterM5746 = C0069.m5746(m5057(this), m5052(this), m5056(this));
                this.delegate = typeAdapterM5746;
                return typeAdapterM5746;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public T read(JsonReader jsonReader) {
                if (!m5055(this)) {
                    return (T) C0064.m4557(m5058(this), jsonReader);
                }
                C0038.m3960(jsonReader);
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) {
                if (m5053(this)) {
                    C0034.m3492(jsonWriter);
                } else {
                    C0078.m7431(m5058(this), jsonWriter, t);
                }
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM2768 = C0029.m2768(this);
        excluderM2768.serializeInnerClasses = false;
        return excluderM2768;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        if (!m5046(this, cls) && !m5042(this, cls, z)) {
            return false;
        }
        return true;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM2768 = C0029.m2768(this);
        excluderM2768.requireExpose = true;
        return excluderM2768;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder excluderM2768 = C0029.m2768(this);
        if (z) {
            ArrayList arrayList = new ArrayList(m5041(this));
            excluderM2768.serializationStrategies = arrayList;
            C0077.m7162(arrayList, exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(m5045(this));
            excluderM2768.deserializationStrategies = arrayList2;
            C0077.m7162(arrayList2, exclusionStrategy);
        }
        return excluderM2768;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM2768 = C0029.m2768(this);
        excluderM2768.modifiers = 0;
        for (int i : iArr) {
            excluderM2768.modifiers = i | m5038(excluderM2768);
        }
        return excluderM2768;
    }

    public Excluder withVersion(double d) {
        Excluder excluderM2768 = C0029.m2768(this);
        excluderM2768.version = d;
        return excluderM2768;
    }
}
