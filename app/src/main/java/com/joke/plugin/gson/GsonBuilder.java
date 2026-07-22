package com.joke.plugin.gson;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List<TypeAdapterFactory> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<TypeAdapterFactory> hierarchyFactories;
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private boolean lenient;
    private LongSerializationPolicy longSerializationPolicy;
    private boolean prettyPrinting;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;

    public GsonBuilder() {
        this.excluder = C0066.m4832();
        this.longSerializationPolicy = C0026.m2271();
        this.fieldNamingPolicy = C0019.m1318();
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4960(Object obj) {
        if (C0071.m6069() > 0) {
            return ((Gson) obj).htmlSafe;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4961(Object obj) {
        if (C0017.m846() > 0) {
            return ((GsonBuilder) obj).dateStyle;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4962(Object obj) {
        if (C0032.m3184() < 0) {
            return ((GsonBuilder) obj).complexMapKeySerialization;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4963(Object obj) {
        if (C0035.m3569() < 0) {
            return ((GsonBuilder) obj).generateNonExecutableJson;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4964(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((GsonBuilder) obj).timeStyle;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Excluder m4965(Object obj) {
        if (C0028.m2593() > 0) {
            return ((Gson) obj).excluder;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static Map m4966(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((Gson) obj).instanceCreators;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4967(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((GsonBuilder) obj).prettyPrinting;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static Map m4968(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((GsonBuilder) obj).instanceCreators;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m4969(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0111.m13165() < 0) {
            ((GsonBuilder) obj).addTypeAdaptersForDate((String) obj2, i, i2, (List) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۦ, reason: not valid java name and contains not printable characters */
    public static List m4970(Object obj) {
        if (C0065.m4647() > 0) {
            return ((Gson) obj).builderHierarchyFactories;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4971(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((GsonBuilder) obj).serializeSpecialFloatingPointValues;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static LongSerializationPolicy m4972(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((Gson) obj).longSerializationPolicy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4973(Object obj) {
        if (C0066.m4827() > 0) {
            return ((Gson) obj).complexMapKeySerialization;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static List m4974(Object obj) {
        if (C0065.m4647() >= 0) {
            return ((Gson) obj).builderFactories;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4975(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((Gson) obj).serializeNulls;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static FieldNamingStrategy m4976(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((Gson) obj).fieldNamingStrategy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4977(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((GsonBuilder) obj).serializeNulls;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static List m4978(Object obj) {
        if (C0036.m3653() < 0) {
            return ((GsonBuilder) obj).factories;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4979(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((GsonBuilder) obj).lenient;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4980(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Gson) obj).prettyPrinting;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4981(Object obj) {
        if (C0030.m2940() > 0) {
            return ((GsonBuilder) obj).datePattern;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4982(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((Gson) obj).timeStyle;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۧۢ, reason: not valid java name and contains not printable characters */
    public static List m4983(Object obj) {
        if (C0020.m1385() < 0) {
            return ((GsonBuilder) obj).hierarchyFactories;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4984(Object obj) {
        if (C0039.m4109() > 0) {
            return ((Gson) obj).datePattern;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4985(Object obj) {
        if (C0026.m2298() < 0) {
            return ((Gson) obj).serializeSpecialFloatingPointValues;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4986(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Gson) obj).dateStyle;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4987(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((GsonBuilder) obj).escapeHtmlChars;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۡ, reason: contains not printable characters */
    public static Excluder m4988(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((GsonBuilder) obj).excluder;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥ, reason: contains not printable characters */
    public static FieldNamingStrategy m4989(Object obj) {
        if (C0021.m1598() < 0) {
            return ((GsonBuilder) obj).fieldNamingPolicy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4990(Object obj) {
        if (C0077.m7272() < 0) {
            return ((Gson) obj).generateNonExecutableJson;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4991(Object obj) {
        if (C0064.m4578() > 0) {
            return ((Gson) obj).lenient;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static LongSerializationPolicy m4992(Object obj) {
        if (C0016.m717() < 0) {
            return ((GsonBuilder) obj).longSerializationPolicy;
        }
        return null;
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
        for (ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.excluder = C0071.m5983(m4988(this), exclusionStrategy, true, true);
        }
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    private void addTypeAdaptersForDate(String str, int i, int i2, List<TypeAdapterFactory> list) {
        DefaultDateTypeAdapter defaultDateTypeAdapter;
        DefaultDateTypeAdapter defaultDateTypeAdapter2;
        DefaultDateTypeAdapter defaultDateTypeAdapter3;
        if (str != null && !C0070.m5838(C0031.m2993(), C0023.m1802(str))) {
            defaultDateTypeAdapter = new DefaultDateTypeAdapter((Class<? extends Date>) Date.class, str);
            defaultDateTypeAdapter2 = new DefaultDateTypeAdapter((Class<? extends Date>) Timestamp.class, str);
            defaultDateTypeAdapter3 = new DefaultDateTypeAdapter((Class<? extends Date>) java.sql.Date.class, str);
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            DefaultDateTypeAdapter defaultDateTypeAdapter4 = new DefaultDateTypeAdapter(Date.class, i, i2);
            defaultDateTypeAdapter = defaultDateTypeAdapter4;
            defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(Timestamp.class, i, i2);
            defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, i, i2);
        }
        C0077.m7162(list, C0033.m3340(Date.class, defaultDateTypeAdapter));
        C0077.m7162(list, C0033.m3340(Timestamp.class, defaultDateTypeAdapter2));
        C0077.m7162(list, C0033.m3340(java.sql.Date.class, defaultDateTypeAdapter3));
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        this.excluder = C0071.m5983(m4988(this), exclusionStrategy, false, true);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        this.excluder = C0071.m5983(m4988(this), exclusionStrategy, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = new ArrayList(C0034.m3427(m4983(this)) + C0034.m3427(m4978(this)) + 3);
        C0067.m5504(arrayList, m4978(this));
        C0025.m2201(arrayList);
        ArrayList arrayList2 = new ArrayList(m4983(this));
        C0025.m2201(arrayList2);
        C0067.m5504(arrayList, arrayList2);
        m4969(this, m4981(this), m4961(this), m4964(this), arrayList);
        return new Gson(m4988(this), m4989(this), m4968(this), m4977(this), m4962(this), m4963(this), m4987(this), m4967(this), m4979(this), m4971(this), m4992(this), m4981(this), m4961(this), m4964(this), m4978(this), m4983(this), arrayList);
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = C0038.m3926(m4988(this));
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        this.excluder = C0077.m7295(m4988(this), iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = C0032.m3129(m4988(this));
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z = obj instanceof JsonSerializer;
        C0027.m2523(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
        if (obj instanceof InstanceCreator) {
            C0035.m3624(m4968(this), type, (InstanceCreator) obj);
        }
        if (z || (obj instanceof JsonDeserializer)) {
            C0077.m7162(m4978(this), C0031.m3038(C0031.m3033(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            C0077.m7162(m4978(this), C0065.m4644(C0031.m3033(type), (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        C0077.m7162(m4978(this), typeAdapterFactory);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z = obj instanceof JsonSerializer;
        C0027.m2523(z || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter));
        if ((obj instanceof JsonDeserializer) || z) {
            C0077.m7162(m4983(this), C0074.m6586(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            C0077.m7162(m4978(this), C0016.m695(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
        this.fieldNamingPolicy = fieldNamingPolicy;
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
        this.longSerializationPolicy = longSerializationPolicy;
        return this;
    }

    public GsonBuilder setVersion(double d) {
        this.excluder = C0038.m3985(m4988(this), d);
        return this;
    }

    public GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.excluder = C0066.m4832();
        this.longSerializationPolicy = C0026.m2271();
        this.fieldNamingPolicy = C0019.m1318();
        HashMap map = new HashMap();
        this.instanceCreators = map;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.excluder = m4965(gson);
        this.fieldNamingPolicy = m4976(gson);
        C0034.m3460(map, m4966(gson));
        this.serializeNulls = m4975(gson);
        this.complexMapKeySerialization = m4973(gson);
        this.generateNonExecutableJson = m4990(gson);
        this.escapeHtmlChars = m4960(gson);
        this.prettyPrinting = m4980(gson);
        this.lenient = m4991(gson);
        this.serializeSpecialFloatingPointValues = m4985(gson);
        this.longSerializationPolicy = m4972(gson);
        this.datePattern = m4984(gson);
        this.dateStyle = m4986(gson);
        this.timeStyle = m4982(gson);
        C0029.m2793(arrayList, m4974(gson));
        C0029.m2793(arrayList2, m4970(gson));
    }
}
