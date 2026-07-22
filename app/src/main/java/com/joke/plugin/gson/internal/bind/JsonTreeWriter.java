package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonWriter;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonTreeWriter extends JsonWriter {
    private String pendingName;
    private JsonElement product;
    private final List<JsonElement> stack;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f182short = {1114, 1109, 1110, 1098, 1116, 1117, 3319, 3280, 3293, 3281, 3283, 3278, 3282, 3291, 3274, 3291, 3230, 3290, 3281, 3293, 3275, 3283, 3291, 3280, 3274, 1301, 1320, 1312, 1333, 1331, 1316, 1333, 1332, 1392, 1343, 1342, 1333, 1392, 1306, 1283, 1311, 1310, 1392, 1333, 1340, 1333, 1341, 1333, 1342, 1316, 1392, 1330, 1317, 1316, 1392, 1319, 1329, 1315, 1392, 1411, 1434, 1414, 1415, 1513, 1455, 1446, 1467, 1451, 1440, 1453, 1466, 1513, 1415, 1448, 1415, 1513, 1448, 1447, 1453, 1513, 1440, 1447, 1455, 1440, 1447, 1440, 1469, 1440, 1452, 1466, 1523, 1513, 1247, 1222, 1242, 1243, 1205, 1267, 1274, 1255, 1271, 1276, 1265, 1254, 1205, 1243, 1268, 1243, 1205, 1268, 1275, 1265, 1205, 1276, 1275, 1267, 1276, 1275, 1276, 1249, 1276, 1264, 1254, 1199, 1205};
    private static final Writer UNWRITABLE_WRITER = new Writer() { // from class: com.joke.plugin.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive(C0025.m2151(m5235(), 0, 6, 1081));

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static List m5232(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((JsonTreeWriter) obj).stack;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5233(Object obj, Object obj2) {
        if (C0016.m717() < 0) {
            ((JsonTreeWriter) obj).put((JsonElement) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Writer m5234() {
        if (C0016.m717() <= 0) {
            return UNWRITABLE_WRITER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5235() {
        if (C0073.m6356() <= 0) {
            return f182short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m5236() {
        if (C0030.m2940() >= 0) {
            return SENTINEL_CLOSED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonElement m5237(Object obj) {
        if (C0070.m5903() >= 0) {
            return ((JsonTreeWriter) obj).peek();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۤ۟, reason: contains not printable characters */
    public static JsonElement m5238(Object obj) {
        if (C0029.m2791() > 0) {
            return ((JsonTreeWriter) obj).product;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m5239(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((JsonTreeWriter) obj).pendingName;
        }
        return null;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter, java.io.Flushable
    public void flush() {
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter value(String str) {
        if (str == null) {
            return C0016.m639(this);
        }
        m5233(this, new JsonPrimitive(str));
        return this;
    }

    public JsonTreeWriter() {
        super(m5234());
        this.stack = new ArrayList();
        this.product = C0077.m7274();
    }

    private JsonElement peek() {
        return (JsonElement) C0071.m6078(m5232(this), C0034.m3427(r0) - 1);
    }

    private void put(JsonElement jsonElement) {
        if (m5239(this) != null) {
            if (!C0063.m4436(jsonElement) || C0023.m1870(this)) {
                C0070.m5904((JsonObject) m5237(this), m5239(this), jsonElement);
            }
            this.pendingName = null;
            return;
        }
        if (C0025.m2084(m5232(this))) {
            this.product = jsonElement;
            return;
        }
        JsonElement jsonElementM5237 = m5237(this);
        if (!(jsonElementM5237 instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        C0028.m2576((JsonArray) jsonElementM5237, jsonElement);
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter beginArray() {
        JsonArray jsonArray = new JsonArray();
        m5233(this, jsonArray);
        C0077.m7162(m5232(this), jsonArray);
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter beginObject() {
        JsonObject jsonObject = new JsonObject();
        m5233(this, jsonObject);
        C0077.m7162(m5232(this), jsonObject);
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!C0025.m2084(m5232(this))) {
            throw new IOException(C0021.m1650(m5235(), 6, 19, 3262));
        }
        C0077.m7162(m5232(this), m5236());
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter endArray() {
        if (C0025.m2084(m5232(this)) || m5239(this) != null) {
            throw new IllegalStateException();
        }
        if (!(m5237(this) instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        C0037.m3901(m5232(this), C0034.m3427(r0) - 1);
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter endObject() {
        if (C0025.m2084(m5232(this)) || m5239(this) != null) {
            throw new IllegalStateException();
        }
        if (!(m5237(this) instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        C0037.m3901(m5232(this), C0034.m3427(r0) - 1);
        return this;
    }

    public JsonElement get() {
        if (C0025.m2084(m5232(this))) {
            return m5238(this);
        }
        StringBuilder sb = new StringBuilder(C0017.m936(m5235(), 25, 34, 1360));
        C0036.m3741(sb, m5232(this));
        throw new IllegalStateException(C0068.m5536(sb));
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter name(String str) {
        if (C0025.m2084(m5232(this)) || m5239(this) != null) {
            throw new IllegalStateException();
        }
        if (!(m5237(this) instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.pendingName = str;
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter nullValue() {
        m5233(this, C0077.m7274());
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter value(boolean z) {
        m5233(this, new JsonPrimitive(C0075.m6775(z)));
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return C0016.m639(this);
        }
        m5233(this, new JsonPrimitive(bool));
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter value(double d) {
        if (!C0039.m4080(this) && (C0017.m923(d) || C0031.m3010(d))) {
            StringBuilder sb = new StringBuilder(C0017.m936(m5235(), 59, 33, 1481));
            C0023.m1897(sb, d);
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        m5233(this, new JsonPrimitive(C0111.m13120(d)));
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter value(long j) {
        m5233(this, new JsonPrimitive(C0070.m5853(j)));
        return this;
    }

    @Override // com.joke.plugin.gson.stream.JsonWriter
    public JsonWriter value(Number number) {
        if (number == null) {
            return C0016.m639(this);
        }
        if (!C0039.m4080(this)) {
            double dM1261 = C0019.m1261(number);
            if (C0017.m923(dM1261) || C0031.m3010(dM1261)) {
                StringBuilder sb = new StringBuilder(C0111.m13097(m5235(), 92, 33, 1173));
                C0036.m3741(sb, number);
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
        }
        m5233(this, new JsonPrimitive(number));
        return this;
    }
}
