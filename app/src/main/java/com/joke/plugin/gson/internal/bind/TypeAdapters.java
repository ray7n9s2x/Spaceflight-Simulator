package com.joke.plugin.gson.internal.bind;

import androidx.appcompat.app.AppCompatDelegate;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
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
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonIOException;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.JsonSyntaxException;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.SerializedName;
import com.joke.plugin.gson.internal.LazilyParsedNumber;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeAdapters {
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
    public static final TypeAdapter<BigInteger> BIG_INTEGER;
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Number> DOUBLE;
    public static final TypeAdapterFactory ENUM_FACTORY;
    public static final TypeAdapter<Number> FLOAT;
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<Number> LONG;
    public static final TypeAdapter<Number> NUMBER;
    public static final TypeAdapterFactory NUMBER_FACTORY;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<String, T> nameToConstant = new HashMap();
        private final Map<T, String> constantToName = new HashMap();

        /* JADX INFO: renamed from: ۟۟۠ۢۢ, reason: not valid java name and contains not printable characters */
        public static Map m5394(Object obj) {
            if (C0078.m7450() >= 0) {
                return ((EnumTypeAdapter) obj).nameToConstant;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
        public static Map m5395(Object obj) {
            if (C0024.m2011() <= 0) {
                return ((EnumTypeAdapter) obj).constantToName;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
        public static Enum m5396(Object obj, Object obj2) {
            if (C0038.m4010() >= 0) {
                return ((EnumTypeAdapter) obj).read((JsonReader) obj2);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ۟ۦۢۦ, reason: not valid java name and contains not printable characters */
        public static void m5397(Object obj, Object obj2, Object obj3) {
            if (C0063.m4427() > 0) {
                ((EnumTypeAdapter) obj).write((JsonWriter) obj2, (Enum) obj3);
            }
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
            return m5396(this, jsonReader);
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
            m5397(this, jsonWriter, (Enum) obj);
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public T read(JsonReader jsonReader) {
            if (C0022.m1758(jsonReader) != C0028.m2553()) {
                return (T) C0072.m6108(m5394(this), C0078.m7406(jsonReader));
            }
            C0065.m4645(jsonReader);
            return null;
        }

        public void write(JsonWriter jsonWriter, T t) {
            C0074.m6506(jsonWriter, t == null ? null : (String) C0072.m6108(m5395(this), t));
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum r4 : (Enum[]) C0025.m2106(cls)) {
                    String strM7223 = C0077.m7223(r4);
                    SerializedName serializedName = (SerializedName) C0037.m3791(C0073.m6335(cls, strM7223), SerializedName.class);
                    if (serializedName != null) {
                        strM7223 = C0023.m1850(serializedName);
                        for (String str : C0111.m13150(serializedName)) {
                            C0035.m3624(m5394(this), str, r4);
                        }
                    }
                    C0035.m3624(m5394(this), strM7223, r4);
                    C0035.m3624(m5395(this), r4, strM7223);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.31
            /* JADX INFO: renamed from: ۥۡۥ۠, reason: contains not printable characters */
            public static TypeAdapter m5360(Object obj) {
                if (C0016.m717() <= 0) {
                    return typeAdapter;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۧۥۥ, reason: not valid java name and contains not printable characters */
            public static TypeToken m5361(Object obj) {
                if (C0074.m6454() <= 0) {
                    return typeToken;
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken2) {
                if (C0064.m4534(typeToken2, m5361(this))) {
                    return m5360(this);
                }
                return null;
            }
        };
    }

    /* JADX INFO: renamed from: com.joke.plugin.gson.internal.bind.TypeAdapters$36, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass36 {
        static final /* synthetic */ int[] $SwitchMap$com$joke$plugin$gson$stream$JsonToken;

        /* JADX INFO: renamed from: ۟ۦۧۢۧ, reason: not valid java name and contains not printable characters */
        public static int[] m5380() {
            if (C0067.m5468() < 0) {
                return $SwitchMap$com$joke$plugin$gson$stream$JsonToken;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0073.m6345().length];
            $SwitchMap$com$joke$plugin$gson$stream$JsonToken = iArr;
            try {
                iArr[C0030.m2893(C0022.m1769())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m5380()[C0030.m2893(C0031.m3035())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m5380()[C0030.m2893(C0026.m2284())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m5380()[C0030.m2893(C0028.m2553())] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m5380()[C0030.m2893(C0029.m2811())] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m5380()[C0030.m2893(C0111.m13035())] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                m5380()[C0030.m2893(C0036.m3659())] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m5380()[C0030.m2893(C0025.m2220())] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                m5380()[C0030.m2893(C0038.m3970())] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                m5380()[C0030.m2893(C0111.m13111())] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Class> typeAdapterM7296 = C0077.m7296(new TypeAdapter<Class>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.1

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f187short = {492, 473, 473, 456, 448, 477, 473, 456, 457, 397, 473, 450, 397, 457, 456, 478, 456, 479, 452, 460, 449, 452, 471, 456, 397, 460, 397, 455, 460, 475, 460, 387, 449, 460, 451, 458, 387, 494, 449, 460, 478, 478, 387, 397, 491, 450, 479, 458, 450, 473, 397, 473, 450, 397, 479, 456, 458, 452, 478, 473, 456, 479, 397, 460, 397, 473, 468, 477, 456, 397, 460, 457, 460, 477, 473, 456, 479, 402, 741, 720, 720, 705, 713, 724, 720, 705, 704, 644, 720, 715, 644, 727, 705, 726, 717, 709, 712, 717, 734, 705, 644, 718, 709, 722, 709, 650, 712, 709, 714, 707, 650, 743, 712, 709, 727, 727, 670, 644, 2381, 2371, 2341, 2316, 2321, 2308, 2316, 2327, 2371, 2327, 2316, 2371, 2321, 2310, 2308, 2314, 2320, 2327, 2310, 2321, 2371, 2306, 2371, 2327, 2330, 2323, 2310, 2371, 2306, 2311, 2306, 2323, 2327, 2310, 2321, 2396};

            /* JADX INFO: renamed from: ۟ۡۡ۟ۥ, reason: not valid java name and contains not printable characters */
            public static short[] m5301() {
                if (C0066.m4827() > 0) {
                    return f187short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
            public static Class m5302(Object obj, Object obj2) {
                if (C0017.m846() > 0) {
                    return ((AnonymousClass1) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
            public static void m5303(Object obj, Object obj2, Object obj3) {
                if (C0034.m3450() >= 0) {
                    ((AnonymousClass1) obj).write2((JsonWriter) obj2, (Class) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Class read(JsonReader jsonReader) {
                return m5302(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Class cls) {
                m5303(this, jsonWriter, cls);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Class read(JsonReader jsonReader) {
                throw new UnsupportedOperationException(C0076.m6902(m5301(), 0, 78, 429));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Class cls) {
                StringBuilder sb = new StringBuilder(C0070.m5942(m5301(), 78, 40, 676));
                C0077.m7290(sb, C0038.m3997(cls));
                C0077.m7290(sb, C0078.m7427(m5301(), 118, 36, 2403));
                throw new UnsupportedOperationException(C0068.m5536(sb));
            }
        });
        CLASS = typeAdapterM7296;
        CLASS_FACTORY = C0033.m3340(Class.class, typeAdapterM7296);
        TypeAdapter<BitSet> typeAdapterM72962 = C0077.m7296(new TypeAdapter<BitSet>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.2

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f190short = {3169, 3158, 3158, 3147, 3158, 3102, 3076, 3169, 3164, 3156, 3137, 3143, 3152, 3149, 3146, 3139, 3102, 3076, 3142, 3149, 3152, 3159, 3137, 3152, 3076, 3146, 3153, 3145, 3142, 3137, 3158, 3076, 3154, 3141, 3144, 3153, 3137, 3076, 3084, 3093, 3080, 3076, 3092, 3085, 3080, 3076, 3170, 3147, 3153, 3146, 3136, 3102, 3076, 3092, 3123, 3115, 3132, 3121, 3124, 3129, 3197, 3135, 3124, 3113, 3118, 3128, 3113, 3197, 3115, 3132, 3121, 3112, 3128, 3197, 3113, 3108, 3117, 3128, 3175, 3197};

            /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
            public static int[] m5327() {
                if (C0027.m2460() > 0) {
                    return AnonymousClass36.$SwitchMap$com$joke$plugin$gson$stream$JsonToken;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
            public static void m5328(Object obj, Object obj2, Object obj3) {
                if (C0074.m6454() <= 0) {
                    ((AnonymousClass2) obj).write2((JsonWriter) obj2, (BitSet) obj3);
                }
            }

            /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
            public static short[] m5329() {
                if (C0063.m4427() > 0) {
                    return f190short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۨۨۦ, reason: not valid java name and contains not printable characters */
            public static BitSet m5330(Object obj, Object obj2) {
                if (C0028.m2593() > 0) {
                    return ((AnonymousClass2) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ BitSet read(JsonReader jsonReader) {
                return m5330(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, BitSet bitSet) {
                m5328(this, jsonWriter, bitSet);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.BitSet read2(com.joke.plugin.gson.stream.JsonReader r59) {
                /*
                    r58 = this;
                    r8 = r59
                    r7 = r58
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    com.android.apksig.zip.C0034.m3467(r8)
                    com.joke.plugin.gson.stream.JsonToken r1 = com.android.apksig.internal.asn1.C0022.m1758(r8)
                    r2 = 0
                    r3 = 0
                L12:
                    com.joke.plugin.gson.stream.JsonToken r4 = org.conscrypt.C0111.m13111()
                    if (r1 == r4) goto L91
                    int[] r4 = m5327()
                    int r5 = com.android.apksig.kms.C0030.m2893(r1)
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L7f
                    r6 = 2
                    if (r4 == r6) goto L7a
                    r6 = 3
                    if (r4 != r6) goto L55
                    java.lang.String r1 = com.zfork.multiplatforms.android.bomb.C0078.m7406(r8)
                    int r1 = com.android.apksig.C0039.m4116(r1)     // Catch: java.lang.NumberFormatException -> L38
                    if (r1 == 0) goto L36
                    goto L85
                L36:
                    r5 = 0
                    goto L85
                L38:
                    com.joke.plugin.gson.JsonSyntaxException r8 = new com.joke.plugin.gson.JsonSyntaxException
                    short[] r37 = m5329()
                    r40 = 3108(0xc24, float:4.355E-42)
                    r38 = 0
                    r39 = 53
                    java.lang.String r37 = com.android.apksig.zip.C0033.m3330(r37, r38, r39, r40)
                    r0 = r37
                    java.lang.String r0 = com.android.apksig.zip.C0032.m3116(r0, r1)
                    r8.<init>(r0)
                    throw r8
                L55:
                    com.joke.plugin.gson.JsonSyntaxException r8 = new com.joke.plugin.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    short[] r14 = m5329()
                    r17 = 3165(0xc5d, float:4.435E-42)
                    r15 = 53
                    r16 = 27
                    java.lang.String r14 = com.zfork.hawk.cheat.C0076.m6902(r14, r15, r16, r17)
                    r2 = r14
                    r0.<init>(r2)
                    com.android.apksig.zip.C0036.m3741(r0, r1)
                    java.lang.String r0 = com.joke.plugin.gson.internal.bind.C0068.m5536(r0)
                    r8.<init>(r0)
                    throw r8
                L7a:
                    boolean r5 = com.android.apksig.C0038.m4000(r8)
                    goto L85
                L7f:
                    int r1 = com.android.apksig.zip.C0034.m3434(r8)
                    if (r1 == 0) goto L36
                L85:
                    if (r5 == 0) goto L8a
                    com.android.apksig.zip.C0033.m3314(r0, r3)
                L8a:
                    int r3 = r3 + 1
                    com.joke.plugin.gson.stream.JsonToken r1 = com.android.apksig.internal.asn1.C0022.m1758(r8)
                    goto L12
                L91:
                    com.joke.plugin.bmJiasu.xhook.basic.C0066.m4839(r8)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.internal.bind.TypeAdapters.AnonymousClass2.read2(com.joke.plugin.gson.stream.JsonReader):java.util.BitSet");
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, BitSet bitSet) {
                C0035.m3598(jsonWriter);
                int iM3587 = C0035.m3587(bitSet);
                for (int i = 0; i < iM3587; i++) {
                    C0064.m4596(jsonWriter, C0023.m1824(bitSet, i) ? 1L : 0L);
                }
                C0111.m13071(jsonWriter);
            }
        });
        BIT_SET = typeAdapterM72962;
        BIT_SET_FACTORY = C0033.m3340(BitSet.class, typeAdapterM72962);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.3
            /* JADX INFO: renamed from: ۟ۢۢۨۦ, reason: not valid java name and contains not printable characters */
            public static void m5358(Object obj, Object obj2, Object obj3) {
                if (C0073.m6356() <= 0) {
                    ((AnonymousClass3) obj).write2((JsonWriter) obj2, (Boolean) obj3);
                }
            }

            /* JADX INFO: renamed from: ۟ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
            public static Boolean m5359(Object obj, Object obj2) {
                if (C0025.m2132() >= 0) {
                    return ((AnonymousClass3) obj).read((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Boolean read(JsonReader jsonReader) {
                return m5359(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) {
                m5358(this, jsonWriter, bool);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Boolean read(JsonReader jsonReader) {
                JsonToken jsonTokenM1758 = C0022.m1758(jsonReader);
                if (jsonTokenM1758 != C0028.m2553()) {
                    return jsonTokenM1758 == C0026.m2284() ? C0075.m6775(C0025.m2121(C0078.m7406(jsonReader))) : C0075.m6775(C0038.m4000(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Boolean bool) {
                C0025.m2142(jsonWriter, bool);
            }
        };
        BOOLEAN = typeAdapter;
        BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.4

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f201short = {1811, 1800, 1809, 1809};

            /* JADX INFO: renamed from: ۟۠۟۟ۡ, reason: not valid java name and contains not printable characters */
            public static short[] m5381() {
                if (C0034.m3450() >= 0) {
                    return f201short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
            public static Boolean m5382(Object obj, Object obj2) {
                if (C0020.m1385() <= 0) {
                    return ((AnonymousClass4) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
            public static void m5383(Object obj, Object obj2, Object obj3) {
                if (C0067.m5468() < 0) {
                    ((AnonymousClass4) obj).write2((JsonWriter) obj2, (Boolean) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Boolean read(JsonReader jsonReader) {
                return m5382(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) {
                m5383(this, jsonWriter, bool);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Boolean read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0028.m2571(C0078.m7406(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Boolean bool) {
                C0074.m6506(jsonWriter, bool == null ? C0068.m5544(m5381(), 0, 4, 1917) : C0039.m4168(bool));
            }
        };
        BOOLEAN_FACTORY = C0027.m2459(C0024.m2007(), Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.5
            /* JADX INFO: renamed from: ۟ۡۥۤ۟, reason: not valid java name and contains not printable characters */
            public static void m5384(Object obj, Object obj2, Object obj3) {
                if (C0039.m4109() > 0) {
                    ((AnonymousClass5) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
            public static Number m5385(Object obj, Object obj2) {
                if (C0032.m3184() < 0) {
                    return ((AnonymousClass5) obj).read((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5385(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5384(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    return C0111.m13179((byte) C0034.m3434(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        BYTE = typeAdapter2;
        BYTE_FACTORY = C0027.m2459(C0067.m5434(), Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.6
            /* JADX INFO: renamed from: ۤۨۧۥ, reason: not valid java name and contains not printable characters */
            public static Number m5386(Object obj, Object obj2) {
                if (C0030.m2940() >= 0) {
                    return ((AnonymousClass6) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۧ۠ۥۤ, reason: not valid java name and contains not printable characters */
            public static void m5387(Object obj, Object obj2, Object obj3) {
                if (C0076.m6903() <= 0) {
                    ((AnonymousClass6) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5386(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5387(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    return C0026.m2328((short) C0034.m3434(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        SHORT = typeAdapter3;
        SHORT_FACTORY = C0027.m2459(C0064.m4630(), Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.7
            /* JADX INFO: renamed from: ۟ۤ۟ۨۨ, reason: not valid java name and contains not printable characters */
            public static Number m5388(Object obj, Object obj2) {
                if (C0067.m5468() < 0) {
                    return ((AnonymousClass7) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۤۢۥ, reason: contains not printable characters */
            public static void m5389(Object obj, Object obj2, Object obj3) {
                if (C0018.m1064() > 0) {
                    ((AnonymousClass7) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5388(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5389(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    return C0021.m1548(C0034.m3434(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        INTEGER = typeAdapter4;
        INTEGER_FACTORY = C0027.m2459(C0072.m6191(), Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> typeAdapterM72963 = C0077.m7296(new TypeAdapter<AtomicInteger>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.8
            /* JADX INFO: renamed from: ۟۟ۧۥ۟, reason: not valid java name and contains not printable characters */
            public static AtomicInteger m5390(Object obj, Object obj2) {
                if (C0016.m717() <= 0) {
                    return ((AnonymousClass8) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
            public static void m5391(Object obj, Object obj2, Object obj3) {
                if (C0027.m2460() >= 0) {
                    ((AnonymousClass8) obj).write2((JsonWriter) obj2, (AtomicInteger) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ AtomicInteger read(JsonReader jsonReader) {
                return m5390(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) {
                m5391(this, jsonWriter, atomicInteger);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public AtomicInteger read2(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(C0034.m3434(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, AtomicInteger atomicInteger) {
                C0064.m4596(jsonWriter, C0023.m1928(atomicInteger));
            }
        });
        ATOMIC_INTEGER = typeAdapterM72963;
        ATOMIC_INTEGER_FACTORY = C0033.m3340(AtomicInteger.class, typeAdapterM72963);
        TypeAdapter<AtomicBoolean> typeAdapterM72964 = C0077.m7296(new TypeAdapter<AtomicBoolean>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.9
            /* JADX INFO: renamed from: ۟ۡۡۤۦ, reason: not valid java name and contains not printable characters */
            public static AtomicBoolean m5392(Object obj, Object obj2) {
                if (C0066.m4827() >= 0) {
                    return ((AnonymousClass9) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۡۢۧۤ, reason: not valid java name and contains not printable characters */
            public static void m5393(Object obj, Object obj2, Object obj3) {
                if (C0074.m6454() <= 0) {
                    ((AnonymousClass9) obj).write2((JsonWriter) obj2, (AtomicBoolean) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ AtomicBoolean read(JsonReader jsonReader) {
                return m5392(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) {
                m5393(this, jsonWriter, atomicBoolean);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public AtomicBoolean read2(JsonReader jsonReader) {
                return new AtomicBoolean(C0038.m4000(jsonReader));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) {
                C0016.m682(jsonWriter, C0034.m3418(atomicBoolean));
            }
        });
        ATOMIC_BOOLEAN = typeAdapterM72964;
        ATOMIC_BOOLEAN_FACTORY = C0033.m3340(AtomicBoolean.class, typeAdapterM72964);
        TypeAdapter<AtomicIntegerArray> typeAdapterM72965 = C0077.m7296(new TypeAdapter<AtomicIntegerArray>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.10
            /* JADX INFO: renamed from: ۦۧۨ۟, reason: contains not printable characters */
            public static void m5304(Object obj, Object obj2, Object obj3) {
                if (C0027.m2460() > 0) {
                    ((AnonymousClass10) obj).write2((JsonWriter) obj2, (AtomicIntegerArray) obj3);
                }
            }

            /* JADX INFO: renamed from: ۨۦۧ, reason: not valid java name and contains not printable characters */
            public static AtomicIntegerArray m5305(Object obj, Object obj2) {
                if (C0069.m5781() < 0) {
                    return ((AnonymousClass10) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ AtomicIntegerArray read(JsonReader jsonReader) {
                return m5305(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) {
                m5304(this, jsonWriter, atomicIntegerArray);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public AtomicIntegerArray read2(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                C0034.m3467(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    try {
                        C0017.m919(arrayList, C0021.m1548(C0034.m3434(jsonReader)));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                C0066.m4839(jsonReader);
                int iM1084 = C0018.m1084(arrayList);
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(iM1084);
                for (int i = 0; i < iM1084; i++) {
                    C0021.m1554(atomicIntegerArray, i, C0025.m2170((Integer) C0064.m4526(arrayList, i)));
                }
                return atomicIntegerArray;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) {
                C0035.m3598(jsonWriter);
                int iM3784 = C0037.m3784(atomicIntegerArray);
                for (int i = 0; i < iM3784; i++) {
                    C0064.m4596(jsonWriter, C0017.m848(atomicIntegerArray, i));
                }
                C0111.m13071(jsonWriter);
            }
        });
        ATOMIC_INTEGER_ARRAY = typeAdapterM72965;
        ATOMIC_INTEGER_ARRAY_FACTORY = C0033.m3340(AtomicIntegerArray.class, typeAdapterM72965);
        LONG = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.11
            /* JADX INFO: renamed from: ۠ۦۡۧ, reason: not valid java name and contains not printable characters */
            public static Number m5306(Object obj, Object obj2) {
                if (C0030.m2940() > 0) {
                    return ((AnonymousClass11) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۣۨۦ, reason: contains not printable characters */
            public static void m5307(Object obj, Object obj2, Object obj3) {
                if (C0064.m4578() >= 0) {
                    ((AnonymousClass11) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5306(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5307(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    return C0070.m5853(C0033.m3379(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        FLOAT = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.12
            /* JADX INFO: renamed from: ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
            public static Number m5308(Object obj, Object obj2) {
                if (C0072.m6216() > 0) {
                    return ((AnonymousClass12) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣ۠ۥ۟, reason: not valid java name and contains not printable characters */
            public static void m5309(Object obj, Object obj2, Object obj3) {
                if (C0032.m3184() <= 0) {
                    ((AnonymousClass12) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5308(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5309(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0018.m1047((float) C0025.m2110(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        DOUBLE = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.13
            /* JADX INFO: renamed from: ۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
            public static Number m5310(Object obj, Object obj2) {
                if (C0076.m6903() < 0) {
                    return ((AnonymousClass13) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۢۧ۠۠, reason: not valid java name and contains not printable characters */
            public static void m5311(Object obj, Object obj2, Object obj3) {
                if (C0035.m3569() < 0) {
                    ((AnonymousClass13) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5310(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5311(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0111.m13120(C0025.m2110(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        TypeAdapter<Number> typeAdapter5 = new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.14

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f188short = {278, 299, 291, 310, 304, 295, 314, 317, 308, 371, 317, 294, 318, 305, 310, 289, 383, 371, 308, 316, 295, 361, 371};

            /* JADX INFO: renamed from: ۟ۧۢۧۢ, reason: not valid java name and contains not printable characters */
            public static void m5312(Object obj, Object obj2, Object obj3) {
                if (C0039.m4109() >= 0) {
                    ((AnonymousClass14) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
            public static int[] m5313() {
                if (C0018.m1064() > 0) {
                    return AnonymousClass36.$SwitchMap$com$joke$plugin$gson$stream$JsonToken;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۢۧ۟ۤ, reason: not valid java name and contains not printable characters */
            public static short[] m5314() {
                if (C0019.m1311() == 0) {
                    return f188short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
            public static Number m5315(Object obj, Object obj2) {
                if (C0032.m3184() < 0) {
                    return ((AnonymousClass14) obj).read((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m5315(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m5312(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                JsonToken jsonTokenM1758 = C0022.m1758(jsonReader);
                int i = m5313()[C0030.m2893(jsonTokenM1758)];
                if (i == 1 || i == 3) {
                    return new LazilyParsedNumber(C0078.m7406(jsonReader));
                }
                if (i == 4) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                StringBuilder sb = new StringBuilder(C0070.m5942(m5314(), 0, 23, 339));
                C0036.m3741(sb, jsonTokenM1758);
                throw new JsonSyntaxException(C0068.m5536(sb));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                C0071.m5996(jsonWriter, number);
            }
        };
        NUMBER = typeAdapter5;
        NUMBER_FACTORY = C0033.m3340(Number.class, typeAdapter5);
        TypeAdapter<Character> typeAdapter6 = new TypeAdapter<Character>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.15

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f189short = {3045, 3032, 3024, 3013, 3011, 3028, 3017, 3022, 3015, 2944, 3011, 3016, 3009, 3026, 3009, 3011, 3028, 3013, 3026, 2956, 2944, 3015, 3023, 3028, 2970, 2944};

            /* JADX INFO: renamed from: ۟ۥۥۦۧ, reason: not valid java name and contains not printable characters */
            public static void m5316(Object obj, Object obj2, Object obj3) {
                if (C0071.m6069() > 0) {
                    ((AnonymousClass15) obj).write2((JsonWriter) obj2, (Character) obj3);
                }
            }

            /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
            public static short[] m5317() {
                if (C0030.m2940() > 0) {
                    return f189short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۠ۥۣۨ, reason: not valid java name and contains not printable characters */
            public static Character m5318(Object obj, Object obj2) {
                if (C0030.m2940() > 0) {
                    return ((AnonymousClass15) obj).read((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Character read(JsonReader jsonReader) {
                return m5318(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Character ch) {
                m5316(this, jsonWriter, ch);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Character read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                String strM7406 = C0078.m7406(jsonReader);
                if (C0078.m7380(strM7406) == 1) {
                    return C0072.m6228(C0077.m7212(strM7406, 0));
                }
                throw new JsonSyntaxException(C0032.m3232(C0068.m5544(m5317(), 0, 26, 2976), strM7406));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Character ch) {
                C0074.m6506(jsonWriter, ch == null ? null : C0064.m4588(ch));
            }
        };
        CHARACTER = typeAdapter6;
        CHARACTER_FACTORY = C0027.m2459(C0111.m13059(), Character.class, typeAdapter6);
        TypeAdapter<String> typeAdapter7 = new TypeAdapter<String>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.16
            /* JADX INFO: renamed from: ۟ۡۡ۟۠, reason: not valid java name and contains not printable characters */
            public static String m5319(Object obj, Object obj2) {
                if (C0075.m6893() > 0) {
                    return ((AnonymousClass16) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۧ۠ۧۤ, reason: not valid java name and contains not printable characters */
            public static void m5320(Object obj, Object obj2, Object obj3) {
                if (C0034.m3450() >= 0) {
                    ((AnonymousClass16) obj).write2((JsonWriter) obj2, (String) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ String read(JsonReader jsonReader) {
                return m5319(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, String str) {
                m5320(this, jsonWriter, str);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public String read2(JsonReader jsonReader) {
                JsonToken jsonTokenM1758 = C0022.m1758(jsonReader);
                if (jsonTokenM1758 != C0028.m2553()) {
                    return jsonTokenM1758 == C0031.m3035() ? C0077.m7277(C0038.m4000(jsonReader)) : C0078.m7406(jsonReader);
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, String str) {
                C0074.m6506(jsonWriter, str);
            }
        };
        STRING = typeAdapter7;
        BIG_DECIMAL = new TypeAdapter<BigDecimal>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.17
            /* JADX INFO: renamed from: ۣۦۤ۟, reason: not valid java name and contains not printable characters */
            public static void m5321(Object obj, Object obj2, Object obj3) {
                if (C0073.m6356() <= 0) {
                    ((AnonymousClass17) obj).write2((JsonWriter) obj2, (BigDecimal) obj3);
                }
            }

            /* JADX INFO: renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
            public static BigDecimal m5322(Object obj, Object obj2) {
                if (C0029.m2791() >= 0) {
                    return ((AnonymousClass17) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ BigDecimal read(JsonReader jsonReader) {
                return m5322(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, BigDecimal bigDecimal) {
                m5321(this, jsonWriter, bigDecimal);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public BigDecimal read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    return new BigDecimal(C0078.m7406(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, BigDecimal bigDecimal) {
                C0071.m5996(jsonWriter, bigDecimal);
            }
        };
        BIG_INTEGER = new TypeAdapter<BigInteger>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.18
            /* JADX INFO: renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
            public static void m5323(Object obj, Object obj2, Object obj3) {
                if (C0071.m6069() > 0) {
                    ((AnonymousClass18) obj).write2((JsonWriter) obj2, (BigInteger) obj3);
                }
            }

            /* JADX INFO: renamed from: ۢ۠, reason: not valid java name and contains not printable characters */
            public static BigInteger m5324(Object obj, Object obj2) {
                if (C0031.m3075() >= 0) {
                    return ((AnonymousClass18) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ BigInteger read(JsonReader jsonReader) {
                return m5324(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, BigInteger bigInteger) {
                m5323(this, jsonWriter, bigInteger);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public BigInteger read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    return new BigInteger(C0078.m7406(jsonReader));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, BigInteger bigInteger) {
                C0071.m5996(jsonWriter, bigInteger);
            }
        };
        STRING_FACTORY = C0033.m3340(String.class, typeAdapter7);
        TypeAdapter<StringBuilder> typeAdapter8 = new TypeAdapter<StringBuilder>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.19
            /* JADX INFO: renamed from: ۟ۤ۟ۢۨ, reason: not valid java name and contains not printable characters */
            public static void m5325(Object obj, Object obj2, Object obj3) {
                if (C0078.m7450() >= 0) {
                    ((AnonymousClass19) obj).write2((JsonWriter) obj2, (StringBuilder) obj3);
                }
            }

            /* JADX INFO: renamed from: ۢۧۥ, reason: not valid java name and contains not printable characters */
            public static StringBuilder m5326(Object obj, Object obj2) {
                if (C0028.m2593() > 0) {
                    return ((AnonymousClass19) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ StringBuilder read(JsonReader jsonReader) {
                return m5326(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, StringBuilder sb) {
                m5325(this, jsonWriter, sb);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public StringBuilder read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return new StringBuilder(C0078.m7406(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, StringBuilder sb) {
                C0074.m6506(jsonWriter, sb == null ? null : C0068.m5536(sb));
            }
        };
        STRING_BUILDER = typeAdapter8;
        STRING_BUILDER_FACTORY = C0033.m3340(StringBuilder.class, typeAdapter8);
        TypeAdapter<StringBuffer> typeAdapter9 = new TypeAdapter<StringBuffer>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.20
            /* JADX INFO: renamed from: ۥ۟ۤۤ, reason: contains not printable characters */
            public static StringBuffer m5331(Object obj, Object obj2) {
                if (C0077.m7272() < 0) {
                    return ((AnonymousClass20) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۥۦۧۤ, reason: contains not printable characters */
            public static void m5332(Object obj, Object obj2, Object obj3) {
                if (C0030.m2940() >= 0) {
                    ((AnonymousClass20) obj).write2((JsonWriter) obj2, (StringBuffer) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ StringBuffer read(JsonReader jsonReader) {
                return m5331(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, StringBuffer stringBuffer) {
                m5332(this, jsonWriter, stringBuffer);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public StringBuffer read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return new StringBuffer(C0078.m7406(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, StringBuffer stringBuffer) {
                C0074.m6506(jsonWriter, stringBuffer == null ? null : C0077.m7301(stringBuffer));
            }
        };
        STRING_BUFFER = typeAdapter9;
        STRING_BUFFER_FACTORY = C0033.m3340(StringBuffer.class, typeAdapter9);
        TypeAdapter<URL> typeAdapter10 = new TypeAdapter<URL>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.21

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f191short = {637, 614, 639, 639};

            /* JADX INFO: renamed from: ۣ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
            public static short[] m5333() {
                if (C0036.m3653() < 0) {
                    return f191short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
            public static URL m5334(Object obj, Object obj2) {
                if (C0029.m2791() >= 0) {
                    return ((AnonymousClass21) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۢۥۨۥ, reason: not valid java name and contains not printable characters */
            public static void m5335(Object obj, Object obj2, Object obj3) {
                if (C0018.m1064() >= 0) {
                    ((AnonymousClass21) obj).write2((JsonWriter) obj2, (URL) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ URL read(JsonReader jsonReader) {
                return m5334(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, URL url) {
                m5335(this, jsonWriter, url);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public URL read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                String strM7406 = C0078.m7406(jsonReader);
                if (C0070.m5838(C0036.m3678(m5333(), 0, 4, 531), strM7406)) {
                    return null;
                }
                return new URL(strM7406);
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, URL url) {
                C0074.m6506(jsonWriter, url == null ? null : C0031.m3034(url));
            }
        };
        URL = typeAdapter10;
        URL_FACTORY = C0033.m3340(URL.class, typeAdapter10);
        TypeAdapter<URI> typeAdapter11 = new TypeAdapter<URI>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.22

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f192short = {1479, 1500, 1477, 1477};

            /* JADX INFO: renamed from: ۟ۥۨۡۧ, reason: not valid java name and contains not printable characters */
            public static void m5336(Object obj, Object obj2, Object obj3) {
                if (C0037.m3837() < 0) {
                    ((AnonymousClass22) obj).write2((JsonWriter) obj2, (URI) obj3);
                }
            }

            /* JADX INFO: renamed from: ۤ۟۟, reason: not valid java name and contains not printable characters */
            public static short[] m5337() {
                if (C0074.m6454() < 0) {
                    return f192short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۥۧ۠, reason: contains not printable characters */
            public static URI m5338(Object obj, Object obj2) {
                if (C0032.m3184() <= 0) {
                    return ((AnonymousClass22) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ URI read(JsonReader jsonReader) {
                return m5338(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, URI uri) {
                m5336(this, jsonWriter, uri);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public URI read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                try {
                    String strM7406 = C0078.m7406(jsonReader);
                    if (C0070.m5838(C0070.m5942(m5337(), 0, 4, 1449), strM7406)) {
                        return null;
                    }
                    return new URI(strM7406);
                } catch (URISyntaxException e) {
                    throw new JsonIOException(e);
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, URI uri) {
                C0074.m6506(jsonWriter, uri == null ? null : C0033.m3339(uri));
            }
        };
        URI = typeAdapter11;
        URI_FACTORY = C0033.m3340(URI.class, typeAdapter11);
        TypeAdapter<InetAddress> typeAdapter12 = new TypeAdapter<InetAddress>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.23
            /* JADX INFO: renamed from: ۟ۥ۠۠ۨ, reason: not valid java name and contains not printable characters */
            public static void m5339(Object obj, Object obj2, Object obj3) {
                if (C0078.m7450() > 0) {
                    ((AnonymousClass23) obj).write2((JsonWriter) obj2, (InetAddress) obj3);
                }
            }

            /* JADX INFO: renamed from: ۥۧۤۥ, reason: contains not printable characters */
            public static InetAddress m5340(Object obj, Object obj2) {
                if (C0069.m5781() < 0) {
                    return ((AnonymousClass23) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ InetAddress read(JsonReader jsonReader) {
                return m5340(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, InetAddress inetAddress) {
                m5339(this, jsonWriter, inetAddress);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public InetAddress read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0037.m3875(C0078.m7406(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, InetAddress inetAddress) {
                C0074.m6506(jsonWriter, inetAddress == null ? null : C0038.m3992(inetAddress));
            }
        };
        INET_ADDRESS = typeAdapter12;
        INET_ADDRESS_FACTORY = C0016.m695(InetAddress.class, typeAdapter12);
        TypeAdapter<UUID> typeAdapter13 = new TypeAdapter<UUID>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.24
            /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
            public static void m5341(Object obj, Object obj2, Object obj3) {
                if (C0037.m3837() < 0) {
                    ((AnonymousClass24) obj).write2((JsonWriter) obj2, (UUID) obj3);
                }
            }

            /* JADX INFO: renamed from: ۟ۧۥۣۧ, reason: not valid java name and contains not printable characters */
            public static UUID m5342(Object obj, Object obj2) {
                if (C0031.m3075() >= 0) {
                    return ((AnonymousClass24) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ UUID read(JsonReader jsonReader) {
                return m5342(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, UUID uuid) {
                m5341(this, jsonWriter, uuid);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public UUID read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0030.m2905(C0078.m7406(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, UUID uuid) {
                C0074.m6506(jsonWriter, uuid == null ? null : C0068.m5616(uuid));
            }
        };
        UUID = typeAdapter13;
        UUID_FACTORY = C0033.m3340(UUID.class, typeAdapter13);
        TypeAdapter<Currency> typeAdapterM72966 = C0077.m7296(new TypeAdapter<Currency>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.25
            /* JADX INFO: renamed from: ۟ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
            public static Currency m5343(Object obj, Object obj2) {
                if (C0070.m5903() >= 0) {
                    return ((AnonymousClass25) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۥۣۥۤ, reason: contains not printable characters */
            public static void m5344(Object obj, Object obj2, Object obj3) {
                if (C0024.m2011() < 0) {
                    ((AnonymousClass25) obj).write2((JsonWriter) obj2, (Currency) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Currency read(JsonReader jsonReader) {
                return m5343(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Currency currency) {
                m5344(this, jsonWriter, currency);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public Currency read2(JsonReader jsonReader) {
                return C0068.m5560(C0078.m7406(jsonReader));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Currency currency) {
                C0074.m6506(jsonWriter, C0027.m2496(currency));
            }
        });
        CURRENCY = typeAdapterM72966;
        CURRENCY_FACTORY = C0033.m3340(Currency.class, typeAdapterM72966);
        TIMESTAMP_FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.26
            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (C0034.m3474(typeToken) != Timestamp.class) {
                    return null;
                }
                final TypeAdapter typeAdapterM3531 = C0035.m3531(gson, Date.class);
                return (TypeAdapter<T>) new TypeAdapter<Timestamp>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.26.1
                    /* JADX INFO: renamed from: ۟ۢۦۤۤ, reason: not valid java name and contains not printable characters */
                    public static void m5345(Object obj, Object obj2, Object obj3) {
                        if (C0035.m3569() <= 0) {
                            ((AnonymousClass1) obj).write2((JsonWriter) obj2, (Timestamp) obj3);
                        }
                    }

                    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
                    public static TypeAdapter m5346(Object obj) {
                        if (C0075.m6893() > 0) {
                            return typeAdapterM3531;
                        }
                        return null;
                    }

                    /* JADX INFO: renamed from: ۦۢۧۧ, reason: contains not printable characters */
                    public static Timestamp m5347(Object obj, Object obj2) {
                        if (C0026.m2298() <= 0) {
                            return ((AnonymousClass1) obj).read2((JsonReader) obj2);
                        }
                        return null;
                    }

                    @Override // com.joke.plugin.gson.TypeAdapter
                    public /* bridge */ /* synthetic */ Timestamp read(JsonReader jsonReader) {
                        return m5347(this, jsonReader);
                    }

                    @Override // com.joke.plugin.gson.TypeAdapter
                    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Timestamp timestamp) {
                        m5345(this, jsonWriter, timestamp);
                    }

                    @Override // com.joke.plugin.gson.TypeAdapter
                    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
                    public Timestamp read2(JsonReader jsonReader) {
                        Date date = (Date) C0064.m4557(m5346(this), jsonReader);
                        if (date != null) {
                            return new Timestamp(C0033.m3322(date));
                        }
                        return null;
                    }

                    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
                    public void write2(JsonWriter jsonWriter, Timestamp timestamp) {
                        C0078.m7431(m5346(this), jsonWriter, timestamp);
                    }
                };
            }
        };
        TypeAdapter<Calendar> typeAdapter14 = new TypeAdapter<Calendar>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.27

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f193short = {2960, 2965, 2957, 3003, 2962, 3001, 2971, 2970, 2944, 2972, 1492, 1491, 1481, 1486, 1523, 1498, 1528, 1501, 1477, 959, 955, 956, 935, 934, 951, 427, 425, 424, 434, 430, 2413, 2427, 2429, 2417, 2416, 2426, 284, 256, 260, 279, 1176, 1156, 1152, 1171, 3326, 3324, 3325, 3303, 3323, 1075, 1078, 1070, 1048, 1073, 1050, 1080, 1081, 1059, 1087, 2679, 2672, 2666, 2669, 2640, 2681, 2651, 2686, 2662, 633, 637, 634, 609, 608, 625, 3004, 2986, 2988, 2976, 2977, 2987, 2527, 2499, 2503, 2516, 3265, 3267, 3266, 3288, 3268, 1820, 1817, 1793, 1847, 1822, 1845, 1815, 1814, 1804, 1808, 2310, 2305, 2331, 2332, 2337, 2312, 2346, 2319, 2327, 715, 719, 712, 723, 722, 707, 1201, 1191, 1185, 1197, 1196, 1190};
            private static final String DAY_OF_MONTH = C0025.m2151(m5348(), 0, 10, 3060);
            private static final String HOUR_OF_DAY = C0078.m7427(m5348(), 10, 9, 1468);
            private static final String MINUTE = C0072.m6116(m5348(), 19, 6, 978);
            private static final String MONTH = C0075.m6791(m5348(), 25, 5, 454);
            private static final String SECOND = C0028.m2609(m5348(), 30, 6, 2334);
            private static final String YEAR = C0027.m2404(m5348(), 36, 4, 357);

            /* JADX INFO: renamed from: ۟ۧ۠ۡۥ, reason: not valid java name and contains not printable characters */
            public static short[] m5348() {
                if (C0034.m3450() > 0) {
                    return f193short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
            public static Calendar m5349(Object obj, Object obj2) {
                if (C0024.m2011() < 0) {
                    return ((AnonymousClass27) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۨ۟, reason: not valid java name and contains not printable characters */
            public static void m5350(Object obj, Object obj2, Object obj3) {
                if (C0076.m6903() <= 0) {
                    ((AnonymousClass27) obj).write2((JsonWriter) obj2, (Calendar) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Calendar read(JsonReader jsonReader) {
                return m5349(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Calendar calendar) {
                m5350(this, jsonWriter, calendar);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public Calendar read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                C0028.m2645(jsonReader);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (C0022.m1758(jsonReader) != C0038.m3970()) {
                    String strM1077 = C0018.m1077(jsonReader);
                    int iM3434 = C0034.m3434(jsonReader);
                    if (C0070.m5838(C0030.m2840(m5348(), 40, 4, 1249), strM1077)) {
                        i = iM3434;
                    } else if (C0070.m5838(C0037.m3829(m5348(), 44, 5, 3219), strM1077)) {
                        i2 = iM3434;
                    } else if (C0070.m5838(C0017.m936(m5348(), 49, 10, 1111), strM1077)) {
                        i3 = iM3434;
                    } else if (C0070.m5838(C0024.m1945(m5348(), 59, 9, 2591), strM1077)) {
                        i4 = iM3434;
                    } else if (C0070.m5838(C0017.m936(m5348(), 68, 6, 532), strM1077)) {
                        i5 = iM3434;
                    } else if (C0070.m5838(C0030.m2840(m5348(), 74, 6, 3023), strM1077)) {
                        i6 = iM3434;
                    }
                }
                C0026.m2322(jsonReader);
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Calendar calendar) {
                if (calendar == null) {
                    C0034.m3492(jsonWriter);
                    return;
                }
                C0026.m2305(jsonWriter);
                C0031.m3057(jsonWriter, C0070.m5942(m5348(), 80, 4, 2470));
                C0064.m4596(jsonWriter, C0063.m4425(calendar, 1));
                C0031.m3057(jsonWriter, C0022.m1728(m5348(), 84, 5, 3244));
                C0064.m4596(jsonWriter, C0063.m4425(calendar, 2));
                C0031.m3057(jsonWriter, C0016.m625(m5348(), 89, 10, 1912));
                C0064.m4596(jsonWriter, C0063.m4425(calendar, 5));
                C0031.m3057(jsonWriter, C0063.m4315(m5348(), 99, 9, 2414));
                C0064.m4596(jsonWriter, C0063.m4425(calendar, 11));
                C0031.m3057(jsonWriter, C0017.m936(m5348(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 6, 678));
                C0064.m4596(jsonWriter, C0063.m4425(calendar, 12));
                C0031.m3057(jsonWriter, C0035.m3603(m5348(), 114, 6, 1218));
                C0064.m4596(jsonWriter, C0063.m4425(calendar, 13));
                C0075.m6797(jsonWriter);
            }
        };
        CALENDAR = typeAdapter14;
        CALENDAR_FACTORY = C0029.m2702(Calendar.class, GregorianCalendar.class, typeAdapter14);
        TypeAdapter<Locale> typeAdapter15 = new TypeAdapter<Locale>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.28

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f194short = {1373};

            /* JADX INFO: renamed from: ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
            public static void m5351(Object obj, Object obj2, Object obj3) {
                if (C0039.m4109() > 0) {
                    ((AnonymousClass28) obj).write2((JsonWriter) obj2, (Locale) obj3);
                }
            }

            /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
            public static short[] m5352() {
                if (C0035.m3569() < 0) {
                    return f194short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۧۢۥۥ, reason: not valid java name and contains not printable characters */
            public static Locale m5353(Object obj, Object obj2) {
                if (C0029.m2791() >= 0) {
                    return ((AnonymousClass28) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Locale read(JsonReader jsonReader) {
                return m5353(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Locale locale) {
                m5351(this, jsonWriter, locale);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public Locale read2(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(C0078.m7406(jsonReader), C0024.m1945(m5352(), 0, 1, 1282));
                String strM4353 = C0063.m4305(stringTokenizer) ? C0063.m4353(stringTokenizer) : null;
                String strM43532 = C0063.m4305(stringTokenizer) ? C0063.m4353(stringTokenizer) : null;
                String strM43533 = C0063.m4305(stringTokenizer) ? C0063.m4353(stringTokenizer) : null;
                return (strM43532 == null && strM43533 == null) ? new Locale(strM4353) : strM43533 == null ? new Locale(strM4353, strM43532) : new Locale(strM4353, strM43532, strM43533);
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Locale locale) {
                C0074.m6506(jsonWriter, locale == null ? null : C0074.m6492(locale));
            }
        };
        LOCALE = typeAdapter15;
        LOCALE_FACTORY = C0033.m3340(Locale.class, typeAdapter15);
        TypeAdapter<JsonElement> typeAdapter16 = new TypeAdapter<JsonElement>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.29

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f195short = {530, 574, 548, 573, 565, 575, 630, 549, 625, 550, 547, 568, 549, 564, 625};

            /* JADX INFO: renamed from: ۟ۦۢ۟ۨ, reason: not valid java name and contains not printable characters */
            public static int[] m5354() {
                if (C0023.m1921() >= 0) {
                    return AnonymousClass36.$SwitchMap$com$joke$plugin$gson$stream$JsonToken;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۠ۥ۟, reason: not valid java name and contains not printable characters */
            public static short[] m5355() {
                if (C0032.m3184() < 0) {
                    return f195short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۣۥۨ, reason: contains not printable characters */
            public static JsonElement m5356(Object obj, Object obj2) {
                if (C0038.m4010() > 0) {
                    return ((AnonymousClass29) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۨۨۡ, reason: not valid java name and contains not printable characters */
            public static void m5357(Object obj, Object obj2, Object obj3) {
                if (C0019.m1311() <= 0) {
                    ((AnonymousClass29) obj).write2((JsonWriter) obj2, (JsonElement) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ JsonElement read(JsonReader jsonReader) {
                return m5356(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, JsonElement jsonElement) {
                m5357(this, jsonWriter, jsonElement);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public JsonElement read(JsonReader jsonReader) {
                switch (m5354()[C0030.m2893(C0022.m1758(jsonReader))]) {
                    case 1:
                        return new JsonPrimitive(new LazilyParsedNumber(C0078.m7406(jsonReader)));
                    case 2:
                        return new JsonPrimitive(C0075.m6775(C0038.m4000(jsonReader)));
                    case 3:
                        return new JsonPrimitive(C0078.m7406(jsonReader));
                    case 4:
                        C0065.m4645(jsonReader);
                        return C0077.m7274();
                    case 5:
                        JsonArray jsonArray = new JsonArray();
                        C0034.m3467(jsonReader);
                        while (C0078.m7343(jsonReader)) {
                            C0028.m2576(jsonArray, m5356(this, jsonReader));
                        }
                        C0066.m4839(jsonReader);
                        return jsonArray;
                    case 6:
                        JsonObject jsonObject = new JsonObject();
                        C0028.m2645(jsonReader);
                        while (C0078.m7343(jsonReader)) {
                            C0070.m5904(jsonObject, C0018.m1077(jsonReader), m5356(this, jsonReader));
                        }
                        C0026.m2322(jsonReader);
                        return jsonObject;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, JsonElement jsonElement) {
                if (jsonElement == null || C0063.m4436(jsonElement)) {
                    C0034.m3492(jsonWriter);
                    return;
                }
                if (C0063.m4408(jsonElement)) {
                    JsonPrimitive jsonPrimitiveM2238 = C0026.m2238(jsonElement);
                    if (C0028.m2622(jsonPrimitiveM2238)) {
                        C0071.m5996(jsonWriter, C0074.m6457(jsonPrimitiveM2238));
                        return;
                    } else if (C0032.m3180(jsonPrimitiveM2238)) {
                        C0016.m682(jsonWriter, C0111.m13034(jsonPrimitiveM2238));
                        return;
                    } else {
                        C0074.m6506(jsonWriter, C0029.m2759(jsonPrimitiveM2238));
                        return;
                    }
                }
                if (C0029.m2751(jsonElement)) {
                    C0035.m3598(jsonWriter);
                    Iterator itM3311 = C0033.m3311(C0072.m6141(jsonElement));
                    while (C0036.m3657(itM3311)) {
                        m5357(this, jsonWriter, (JsonElement) C0071.m6012(itM3311));
                    }
                    C0111.m13071(jsonWriter);
                    return;
                }
                if (!C0066.m4866(jsonElement)) {
                    StringBuilder sb = new StringBuilder(C0021.m1650(m5355(), 0, 15, 593));
                    C0036.m3741(sb, C0030.m2951(jsonElement));
                    throw new IllegalArgumentException(C0068.m5536(sb));
                }
                C0026.m2305(jsonWriter);
                Iterator itM2001 = C0024.m2001(C0018.m1086(C0036.m3718(jsonElement)));
                while (C0036.m3657(itM2001)) {
                    Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
                    C0031.m3057(jsonWriter, (String) C0063.m4368(entry));
                    m5357(this, jsonWriter, (JsonElement) C0019.m1293(entry));
                }
                C0075.m6797(jsonWriter);
            }
        };
        JSON_ELEMENT = typeAdapter16;
        JSON_ELEMENT_FACTORY = C0016.m695(JsonElement.class, typeAdapter16);
        ENUM_FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.30
            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class clsM3474 = C0034.m3474(typeToken);
                if (C0031.m2999(Enum.class, clsM3474) && clsM3474 != Enum.class) {
                    if (!C0071.m6085(clsM3474)) {
                        clsM3474 = C0065.m4763(clsM3474);
                    }
                    return new EnumTypeAdapter(clsM3474);
                }
                return null;
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.32

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f196short = {1999, 2024, 2026, 2045, 2022, 2043, 2032, 2002, 2045, 2032, 2041, 2028, 1972, 3210, 3271, 3266, 3271, 3286, 3282, 3267, 3284, 3227, 2655};

            /* JADX INFO: renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5362(Object obj) {
                if (C0019.m1311() == 0) {
                    return typeAdapter;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
            public static short[] m5363() {
                if (C0063.m4427() > 0) {
                    return f196short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۨ۟۠۟, reason: not valid java name and contains not printable characters */
            public static Class m5364(Object obj) {
                if (C0070.m5903() >= 0) {
                    return cls;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(C0037.m3829(m5363(), 0, 13, 1929));
                C0077.m7290(sb, C0038.m3997(m5364(this)));
                C0077.m7290(sb, C0021.m1650(m5363(), 13, 9, 3238));
                C0036.m3741(sb, m5362(this));
                C0077.m7290(sb, C0064.m4545(m5363(), 22, 1, 2562));
                return C0068.m5536(sb);
            }

            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (C0034.m3474(typeToken) == m5364(this)) {
                    return m5362(this);
                }
                return null;
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.34

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f198short = {744, 719, 717, 730, 705, 732, 727, 757, 730, 727, 734, 715, 659, 1537, 2212, 2281, 2284, 2281, 2296, 2300, 2285, 2298, 2229, 2830};

            /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
            public static Class m5369(Object obj) {
                if (C0078.m7450() > 0) {
                    return cls;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۥۨۨۨ, reason: not valid java name and contains not printable characters */
            public static short[] m5370() {
                if (C0068.m5678() >= 0) {
                    return f198short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۦۣۨۥ, reason: not valid java name and contains not printable characters */
            public static Class m5371(Object obj) {
                if (C0024.m2011() <= 0) {
                    return cls2;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۤۤۦۤ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5372(Object obj) {
                if (C0074.m6454() <= 0) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(C0067.m5418(m5370(), 0, 13, 686));
                C0077.m7290(sb, C0038.m3997(m5369(this)));
                C0077.m7290(sb, C0071.m5991(m5370(), 13, 1, 1578));
                C0077.m7290(sb, C0038.m3997(m5371(this)));
                C0077.m7290(sb, C0032.m3209(m5370(), 14, 9, 2184));
                C0036.m3741(sb, m5372(this));
                C0077.m7290(sb, C0022.m1728(m5370(), 23, 1, 2899));
                return C0068.m5536(sb);
            }

            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class clsM3474 = C0034.m3474(typeToken);
                if (clsM3474 != m5369(this) && clsM3474 != m5371(this)) {
                    return null;
                }
                return m5372(this);
            }
        };
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.35

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f199short = {1470, 1433, 1435, 1420, 1431, 1418, 1409, 1443, 1420, 1409, 1416, 1437, 1456, 1425, 1437, 1418, 1433, 1418, 1435, 1424, 1409, 1477, 2896, 2845, 2840, 2845, 2828, 2824, 2841, 2830, 2881, 1219};

            /* JADX INFO: renamed from: ۟۠ۢۢۦ, reason: not valid java name and contains not printable characters */
            public static Class m5373(Object obj) {
                if (C0026.m2298() < 0) {
                    return cls;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦۣۡۦ, reason: contains not printable characters */
            public static TypeAdapter m5374(Object obj) {
                if (C0026.m2298() <= 0) {
                    return typeAdapter;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۧۡۤۡ, reason: not valid java name and contains not printable characters */
            public static short[] m5375() {
                if (C0076.m6903() < 0) {
                    return f199short;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(C0066.m4828(m5375(), 0, 22, 1528));
                C0077.m7290(sb, C0038.m3997(m5373(this)));
                C0077.m7290(sb, C0021.m1650(m5375(), 22, 9, 2940));
                C0036.m3741(sb, m5374(this));
                C0077.m7290(sb, C0078.m7427(m5375(), 31, 1, 1182));
                return C0068.m5536(sb);
            }

            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class clsM3474 = C0034.m3474(typeToken);
                if (!C0031.m2999(m5373(this), clsM3474)) {
                    return null;
                }
                return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.35.1

                    /* JADX INFO: renamed from: short, reason: not valid java name */
                    private static final short[] f200short = {850, 879, 871, 882, 884, 867, 882, 883, 823, 886, 823, 754, 688, 679, 678, 754, 677, 691, 673, 754};

                    /* JADX INFO: renamed from: ۟۠۠ۧۨ, reason: not valid java name and contains not printable characters */
                    public static AnonymousClass35 m5376(Object obj) {
                        if (C0027.m2460() >= 0) {
                            return AnonymousClass35.this;
                        }
                        return null;
                    }

                    /* JADX INFO: renamed from: ۟ۥۨۢۧ, reason: not valid java name and contains not printable characters */
                    public static short[] m5377() {
                        if (C0063.m4427() > 0) {
                            return f200short;
                        }
                        return null;
                    }

                    /* JADX INFO: renamed from: ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
                    public static Class m5378(Object obj) {
                        if (C0065.m4647() > 0) {
                            return clsM3474;
                        }
                        return null;
                    }

                    /* JADX INFO: renamed from: ۡۥۨۡ, reason: not valid java name and contains not printable characters */
                    public static TypeAdapter m5379(Object obj) {
                        if (C0068.m5678() > 0) {
                            return typeAdapter;
                        }
                        return null;
                    }

                    @Override // com.joke.plugin.gson.TypeAdapter
                    public T1 read(JsonReader jsonReader) {
                        T1 t1 = (T1) C0064.m4557(m5379(m5376(this)), jsonReader);
                        if (t1 == null || C0078.m7323(m5378(this), t1)) {
                            return t1;
                        }
                        StringBuilder sb = new StringBuilder(C0023.m1904(m5377(), 0, 11, 791));
                        C0077.m7290(sb, C0038.m3997(m5378(this)));
                        C0077.m7290(sb, C0020.m1443(m5377(), 11, 9, 722));
                        C0077.m7290(sb, C0038.m3997(C0030.m2951(t1)));
                        throw new JsonSyntaxException(C0068.m5536(sb));
                    }

                    @Override // com.joke.plugin.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, T1 t1) {
                        C0078.m7431(m5379(m5376(this)), jsonWriter, t1);
                    }
                };
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TypeAdapters.33

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f197short = {2607, 2568, 2570, 2589, 2566, 2587, 2576, 2610, 2589, 2576, 2585, 2572, 2644, 2619, 2476, 2529, 2532, 2529, 2544, 2548, 2533, 2546, 2493, 2854};

            /* JADX INFO: renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
            public static Class m5365(Object obj) {
                if (C0032.m3184() < 0) {
                    return cls;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۧ۠ۥۡ, reason: not valid java name and contains not printable characters */
            public static short[] m5366() {
                if (C0036.m3653() <= 0) {
                    return f197short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۧۤ۟ۤ, reason: not valid java name and contains not printable characters */
            public static Class m5367(Object obj) {
                if (C0068.m5678() >= 0) {
                    return cls2;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۢۢۧ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5368(Object obj) {
                if (C0071.m6069() > 0) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(C0071.m5991(m5366(), 0, 13, 2665));
                C0077.m7290(sb, C0038.m3997(m5367(this)));
                C0077.m7290(sb, C0022.m1728(m5366(), 13, 1, 2576));
                C0077.m7290(sb, C0038.m3997(m5365(this)));
                C0077.m7290(sb, C0018.m1070(m5366(), 14, 9, 2432));
                C0036.m3741(sb, m5368(this));
                C0077.m7290(sb, C0034.m3431(m5366(), 23, 1, 2939));
                return C0068.m5536(sb);
            }

            @Override // com.joke.plugin.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class clsM3474 = C0034.m3474(typeToken);
                if (clsM3474 != m5365(this) && clsM3474 != m5367(this)) {
                    return null;
                }
                return m5368(this);
            }
        };
    }
}
