package com.joke.plugin.gson.internal.bind;

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
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.JsonArray;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonNull;
import com.joke.plugin.gson.JsonObject;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f181short = {3190, 3147, 3139, 3158, 3152, 3143, 3158, 3159, 3091, 2831, 2893, 2906, 2907, 2831, 2904, 2894, 2908, 2831, 1429, 1492, 1473, 1429, 1477, 1492, 1473, 1501, 1429, 1495, 2543, 2514, 2522, 2511, 2505, 2526, 2511, 2510, 2442, 1381, 1319, 1328, 1329, 1381, 1330, 1316, 1334, 1381, 456, 465, 461, 460, 418, 484, 493, 496, 480, 491, 486, 497, 418, 460, 483, 460, 418, 483, 492, 486, 418, 491, 492, 484, 491, 492, 491, 502, 491, 487, 497, 440, 418, 2711, 2730, 2722, 2743, 2737, 2726, 2743, 2742, 2802, 1547, 1609, 1630, 1631, 1547, 1628, 1610, 1624, 1547, 1322, 1303, 1311, 1290, 1292, 1307, 1290, 1291, 1359, 2787, 2721, 2742, 2743, 2787, 2740, 2722, 2736, 2787, 960, 1021, 1013, 992, 998, 1009, 992, 993, 933, 1041, 1107, 1092, 1093, 1041, 1094, 1104, 1090, 1041, 2840, 2849, 2877, 2876, 2816, 2871, 2867, 2870, 2871, 2848, 2930, 2875, 2849, 2930, 2865, 2878, 2877, 2849, 2871, 2870, 1342, 1317, 1340, 1340, 2609, 2568, 2580, 2581, 2607, 2569, 2590, 2590, 2601, 2590, 2586, 2591, 2590, 2569};
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.joke.plugin.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    /* JADX INFO: renamed from: ۟۠ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m5220(Object obj, Object obj2) {
        if (C0071.m6069() >= 0) {
            ((JsonTreeReader) obj).push(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static Reader m5221() {
        if (C0064.m4578() > 0) {
            return UNREADABLE_READER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static void m5222(Object obj, Object obj2) {
        if (C0020.m1385() < 0) {
            ((JsonTreeReader) obj).expect((JsonToken) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String[] m5223(Object obj) {
        if (C0016.m717() < 0) {
            return ((JsonTreeReader) obj).pathNames;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m5224(Object obj) {
        if (C0034.m3450() >= 0) {
            return ((JsonTreeReader) obj).stackSize;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5225() {
        if (C0078.m7450() > 0) {
            return f181short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static int[] m5226(Object obj) {
        if (C0073.m6356() < 0) {
            return ((JsonTreeReader) obj).pathIndices;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m5227(Object obj) {
        if (C0075.m6893() > 0) {
            return ((JsonTreeReader) obj).locationString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m5228() {
        if (C0020.m1385() < 0) {
            return SENTINEL_CLOSED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m5229(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((JsonTreeReader) obj).peekStack();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m5230(Object obj) {
        if (C0020.m1385() < 0) {
            return ((JsonTreeReader) obj).stack;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m5231(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((JsonTreeReader) obj).popStack();
        }
        return null;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stack = new Object[]{m5228()};
        this.stackSize = 1;
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(m5221());
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        m5220(this, jsonElement);
    }

    private String locationString() {
        StringBuilder sb = new StringBuilder(C0067.m5418(m5225(), 18, 9, 1461));
        C0077.m7290(sb, C0025.m2120(this));
        return C0068.m5536(sb);
    }

    private Object peekStack() {
        return m5230(this)[m5224(this) - 1];
    }

    private Object popStack() {
        Object[] objArrM5230 = m5230(this);
        int iM5224 = m5224(this) - 1;
        this.stackSize = iM5224;
        Object obj = objArrM5230[iM5224];
        objArrM5230[iM5224] = null;
        return obj;
    }

    private void push(Object obj) {
        int iM5224 = m5224(this);
        Object[] objArrM5230 = m5230(this);
        if (iM5224 == objArrM5230.length) {
            int i = iM5224 * 2;
            this.stack = C0067.m5421(objArrM5230, i);
            this.pathIndices = C0073.m6314(m5226(this), i);
            this.pathNames = (String[]) C0067.m5421(m5223(this), i);
        }
        Object[] objArrM52302 = m5230(this);
        int iM52242 = m5224(this);
        this.stackSize = iM52242 + 1;
        objArrM52302[iM52242] = obj;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public void beginArray() {
        m5222(this, C0029.m2811());
        m5220(this, C0033.m3311((JsonArray) m5229(this)));
        m5226(this)[m5224(this) - 1] = 0;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public void beginObject() {
        m5222(this, C0111.m13035());
        m5220(this, C0024.m2001(C0018.m1086((JsonObject) m5229(this))));
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public void endArray() {
        m5222(this, C0111.m13111());
        m5231(this);
        m5231(this);
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public void endObject() {
        m5222(this, C0038.m3970());
        m5231(this);
        m5231(this);
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb = new StringBuilder(C0065.m4757(m5225(), 27, 1, 1523));
        int i = 0;
        while (i < m5224(this)) {
            Object[] objArrM5230 = m5230(this);
            Object obj = objArrM5230[i];
            if (obj instanceof JsonArray) {
                i++;
                if (objArrM5230[i] instanceof Iterator) {
                    C0077.m7289(sb, '[');
                    C0021.m1551(sb, m5226(this)[i]);
                    C0077.m7289(sb, ']');
                }
            } else if (obj instanceof JsonObject) {
                i++;
                if (objArrM5230[i] instanceof Iterator) {
                    C0077.m7289(sb, '.');
                    String str = m5223(this)[i];
                    if (str != null) {
                        C0077.m7290(sb, str);
                    }
                }
            }
            i++;
        }
        return C0068.m5536(sb);
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public boolean nextBoolean() {
        m5222(this, C0031.m3035());
        boolean zM13034 = C0111.m13034((JsonPrimitive) m5231(this));
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
        return zM13034;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public String nextName() {
        m5222(this, C0025.m2220());
        Map.Entry entry = (Map.Entry) C0071.m6012((Iterator) m5229(this));
        String str = (String) C0063.m4368(entry);
        m5223(this)[m5224(this) - 1] = str;
        m5220(this, C0019.m1293(entry));
        return str;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public void nextNull() {
        m5222(this, C0028.m2553());
        m5231(this);
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public JsonToken peek() {
        if (m5224(this) == 0) {
            return C0036.m3659();
        }
        Object objM5229 = m5229(this);
        if (objM5229 instanceof Iterator) {
            boolean z = m5230(this)[m5224(this) - 2] instanceof JsonObject;
            Iterator it = (Iterator) objM5229;
            if (!C0036.m3657(it)) {
                return z ? C0038.m3970() : C0111.m13111();
            }
            if (z) {
                return C0025.m2220();
            }
            m5220(this, C0071.m6012(it));
            return C0111.m13043(this);
        }
        if (objM5229 instanceof JsonObject) {
            return C0111.m13035();
        }
        if (objM5229 instanceof JsonArray) {
            return C0029.m2811();
        }
        if (!(objM5229 instanceof JsonPrimitive)) {
            if (objM5229 instanceof JsonNull) {
                return C0028.m2553();
            }
            if (objM5229 == m5228()) {
                throw new IllegalStateException(C0037.m3829(m5225(), 133, 20, 2898));
            }
            throw new AssertionError();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) objM5229;
        if (C0077.m7307(jsonPrimitive)) {
            return C0026.m2284();
        }
        if (C0032.m3180(jsonPrimitive)) {
            return C0031.m3035();
        }
        if (C0028.m2622(jsonPrimitive)) {
            return C0022.m1769();
        }
        throw new AssertionError();
    }

    public void promoteNameToValue() {
        m5222(this, C0025.m2220());
        Map.Entry entry = (Map.Entry) C0071.m6012((Iterator) m5229(this));
        m5220(this, C0019.m1293(entry));
        m5220(this, new JsonPrimitive((String) C0063.m4368(entry)));
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public String toString() {
        return C0067.m5418(m5225(), 157, 14, 2683);
    }

    private void expect(JsonToken jsonToken) {
        if (C0111.m13043(this) == jsonToken) {
            return;
        }
        StringBuilder sb = new StringBuilder(C0068.m5544(m5225(), 0, 9, 3123));
        C0036.m3741(sb, jsonToken);
        C0077.m7290(sb, C0072.m6116(m5225(), 9, 9, 2863));
        C0036.m3741(sb, C0111.m13043(this));
        C0077.m7290(sb, m5227(this));
        throw new IllegalStateException(C0068.m5536(sb));
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public boolean hasNext() {
        JsonToken jsonTokenM13043 = C0111.m13043(this);
        if (jsonTokenM13043 != C0038.m3970() && jsonTokenM13043 != C0111.m13111()) {
            return true;
        }
        return false;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public double nextDouble() {
        JsonToken jsonTokenM13043 = C0111.m13043(this);
        JsonToken jsonTokenM1769 = C0022.m1769();
        if (jsonTokenM13043 != jsonTokenM1769 && jsonTokenM13043 != C0026.m2284()) {
            StringBuilder sb = new StringBuilder(C0065.m4757(m5225(), 28, 9, 2474));
            C0036.m3741(sb, jsonTokenM1769);
            C0077.m7290(sb, C0025.m2151(m5225(), 37, 9, 1349));
            C0036.m3741(sb, jsonTokenM13043);
            C0077.m7290(sb, m5227(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        double dM6014 = C0071.m6014((JsonPrimitive) m5229(this));
        if (!C0111.m13110(this) && (C0017.m923(dM6014) || C0031.m3010(dM6014))) {
            StringBuilder sb2 = new StringBuilder(C0028.m2609(m5225(), 46, 33, 386));
            C0023.m1897(sb2, dM6014);
            throw new NumberFormatException(C0068.m5536(sb2));
        }
        m5231(this);
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
        return dM6014;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public int nextInt() {
        JsonToken jsonTokenM13043 = C0111.m13043(this);
        JsonToken jsonTokenM1769 = C0022.m1769();
        if (jsonTokenM13043 != jsonTokenM1769 && jsonTokenM13043 != C0026.m2284()) {
            StringBuilder sb = new StringBuilder(C0063.m4315(m5225(), 79, 9, 2770));
            C0036.m3741(sb, jsonTokenM1769);
            C0077.m7290(sb, C0076.m6902(m5225(), 88, 9, 1579));
            C0036.m3741(sb, jsonTokenM13043);
            C0077.m7290(sb, m5227(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        int iM4686 = C0065.m4686((JsonPrimitive) m5229(this));
        m5231(this);
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
        return iM4686;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public long nextLong() {
        JsonToken jsonTokenM13043 = C0111.m13043(this);
        JsonToken jsonTokenM1769 = C0022.m1769();
        if (jsonTokenM13043 != jsonTokenM1769 && jsonTokenM13043 != C0026.m2284()) {
            StringBuilder sb = new StringBuilder(C0024.m1945(m5225(), 97, 9, 1391));
            C0036.m3741(sb, jsonTokenM1769);
            C0077.m7290(sb, C0074.m6452(m5225(), 106, 9, 2755));
            C0036.m3741(sb, jsonTokenM13043);
            C0077.m7290(sb, m5227(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        long jM3428 = C0034.m3428((JsonPrimitive) m5229(this));
        m5231(this);
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
        return jM3428;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public String nextString() {
        JsonToken jsonTokenM13043 = C0111.m13043(this);
        JsonToken jsonTokenM2284 = C0026.m2284();
        if (jsonTokenM13043 != jsonTokenM2284 && jsonTokenM13043 != C0022.m1769()) {
            StringBuilder sb = new StringBuilder(C0111.m13097(m5225(), 115, 9, 901));
            C0036.m3741(sb, jsonTokenM2284);
            C0077.m7290(sb, C0039.m4066(m5225(), 124, 9, 1073));
            C0036.m3741(sb, jsonTokenM13043);
            C0077.m7290(sb, m5227(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        String strM2759 = C0029.m2759((JsonPrimitive) m5231(this));
        int iM5224 = m5224(this);
        if (iM5224 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM5224 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
        return strM2759;
    }

    @Override // com.joke.plugin.gson.stream.JsonReader
    public void skipValue() {
        JsonToken jsonTokenM13043 = C0111.m13043(this);
        JsonToken jsonTokenM2220 = C0025.m2220();
        String strM5991 = C0071.m5991(m5225(), 153, 4, 1360);
        if (jsonTokenM13043 == jsonTokenM2220) {
            C0067.m5404(this);
            m5223(this)[m5224(this) - 2] = strM5991;
        } else {
            m5231(this);
            int iM5224 = m5224(this);
            if (iM5224 > 0) {
                m5223(this)[iM5224 - 1] = strM5991;
            }
        }
        int iM52242 = m5224(this);
        if (iM52242 > 0) {
            int[] iArrM5226 = m5226(this);
            int i = iM52242 - 1;
            iArrM5226[i] = iArrM5226[i] + 1;
        }
    }
}
