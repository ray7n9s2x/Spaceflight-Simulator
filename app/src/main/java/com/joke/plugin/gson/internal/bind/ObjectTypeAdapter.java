package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.joke.plugin.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (C0034.m3474(typeToken) == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };
    private final Gson gson;

    /* JADX INFO: renamed from: ۟ۤۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int[] m5251() {
        if (C0019.m1311() >= 0) {
            return AnonymousClass2.$SwitchMap$com$joke$plugin$gson$stream$JsonToken;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Gson m5252(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((ObjectTypeAdapter) obj).gson;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.joke.plugin.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$joke$plugin$gson$stream$JsonToken;

        /* JADX INFO: renamed from: ۦۡۢۡ, reason: contains not printable characters */
        public static int[] m5253() {
            if (C0030.m2940() > 0) {
                return $SwitchMap$com$joke$plugin$gson$stream$JsonToken;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0073.m6345().length];
            $SwitchMap$com$joke$plugin$gson$stream$JsonToken = iArr;
            try {
                iArr[C0030.m2893(C0029.m2811())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m5253()[C0030.m2893(C0111.m13035())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m5253()[C0030.m2893(C0026.m2284())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m5253()[C0030.m2893(C0022.m1769())] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m5253()[C0030.m2893(C0031.m3035())] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m5253()[C0030.m2893(C0028.m2553())] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            C0034.m3492(jsonWriter);
            return;
        }
        TypeAdapter typeAdapterM3531 = C0035.m3531(m5252(this), C0030.m2951(obj));
        if (!(typeAdapterM3531 instanceof ObjectTypeAdapter)) {
            C0078.m7431(typeAdapterM3531, jsonWriter, obj);
        } else {
            C0026.m2305(jsonWriter);
            C0075.m6797(jsonWriter);
        }
    }

    public ObjectTypeAdapter(Gson gson) {
        this.gson = gson;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public Object read(JsonReader jsonReader) {
        switch (m5251()[C0030.m2893(C0022.m1758(jsonReader))]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                C0034.m3467(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    C0017.m919(arrayList, C0024.m2022(this, jsonReader));
                }
                C0066.m4839(jsonReader);
                return arrayList;
            case 2:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                C0028.m2645(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    C0035.m3624(linkedTreeMap, C0018.m1077(jsonReader), C0024.m2022(this, jsonReader));
                }
                C0026.m2322(jsonReader);
                return linkedTreeMap;
            case 3:
                return C0078.m7406(jsonReader);
            case 4:
                return C0111.m13120(C0025.m2110(jsonReader));
            case 5:
                return C0075.m6775(C0038.m4000(jsonReader));
            case 6:
                C0065.m4645(jsonReader);
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
