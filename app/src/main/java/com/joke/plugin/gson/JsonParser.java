package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.MalformedJsonException;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonParser {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f162short = {2312, 2396, 2375, 2312, 2402, 2395, 2375, 2374, 2103, 2064, 2072, 2077, 2068, 2069, 2129, 2049, 2064, 2051, 2050, 2072, 2079, 2070, 2129, 2107, 2082, 2110, 2111, 2129, 2050, 2078, 2052, 2051, 2066, 2068, 2123, 2129, 1097, 1124, 1129, 1069, 1123, 1122, 1145, 1069, 1134, 1122, 1123, 1150, 1144, 1120, 1128, 1069, 1145, 1125, 1128, 1069, 1128, 1123, 1145, 1124, 1151, 1128, 1069, 1129, 1122, 1134, 1144, 1120, 1128, 1123, 1145, 1059};

    public static JsonElement parseReader(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement jsonElementM5936 = C0070.m5936(jsonReader);
            if (!C0063.m4436(jsonElementM5936) && C0022.m1758(jsonReader) != C0036.m3659()) {
                throw new JsonSyntaxException(C0031.m3047(m4996(), 36, 36, 1037));
            }
            return jsonElementM5936;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4996() {
        if (C0064.m4578() >= 0) {
            return f162short;
        }
        return null;
    }

    @Deprecated
    public JsonElement parse(String str) {
        return C0038.m4053(str);
    }

    public static JsonElement parseString(String str) {
        return C0022.m1656(new StringReader(str));
    }

    @Deprecated
    public JsonElement parse(Reader reader) {
        return C0022.m1656(reader);
    }

    @Deprecated
    public JsonParser() {
    }

    @Deprecated
    public JsonElement parse(JsonReader jsonReader) {
        return C0070.m5936(jsonReader);
    }

    public static JsonElement parseReader(JsonReader jsonReader) {
        String strM3829 = C0037.m3829(m4996(), 0, 8, 2344);
        String strM2321 = C0026.m2321(m4996(), 8, 28, 2161);
        boolean zM13110 = C0111.m13110(jsonReader);
        C0031.m3022(jsonReader, true);
        try {
            try {
                return C0032.m3218(jsonReader);
            } catch (OutOfMemoryError e) {
                StringBuilder sb = new StringBuilder(strM2321);
                C0036.m3741(sb, jsonReader);
                C0077.m7290(sb, strM3829);
                throw new JsonParseException(C0068.m5536(sb), e);
            } catch (StackOverflowError e2) {
                StringBuilder sb2 = new StringBuilder(strM2321);
                C0036.m3741(sb2, jsonReader);
                C0077.m7290(sb2, strM3829);
                throw new JsonParseException(C0068.m5536(sb2), e2);
            }
        } finally {
            C0031.m3022(jsonReader, zM13110);
        }
    }
}
