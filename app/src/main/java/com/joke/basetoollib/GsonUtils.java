package com.joke.basetoollib;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.GsonBuilder;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class GsonUtils {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f146short = {2188, 2189, 2190, 2185, 2205, 2180, 2204, 2223, 2203, 2183, 2182, 2596, 2597, 2604, 2597, 2599, 2593, 2612, 2597, 2567, 2611, 2607, 2606, 2309, 2310, 2318, 2364, 2333, 2304, 2309, 2330, 2350, 2330, 2310, 2311, 561, 612, 551, 549, 554, 611, 560, 612, 557, 554, 567, 560, 549, 554, 560, 557, 549, 560, 545, 612, 553, 545, 618, 618, 618, 476, 477, 468, 477, 479, 473, 460, 477, 511, 459, 471, 470, 1496, 1497, 1498, 1501, 1481, 1488, 1480, 1531, 1487, 1491, 1490, 1166, 1165, 1157, 1207, 1174, 1163, 1166, 1169, 1189, 1169, 1165, 1164, 1590, 1591, 1598, 1591, 1589, 1587, 1574, 1591, 1557, 1569, 1597, 1596};
    private static final String KEY_DEFAULT = C0022.m1728(m4289(), 0, 11, 2280);
    private static final String KEY_DELEGATE = C0018.m1070(m4289(), 11, 12, 2624);
    private static final String KEY_LOG_UTILS = C0070.m5942(m4289(), 23, 12, 2409);
    private static final Map<String, Gson> GSONS = new ConcurrentHashMap();

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) C0019.m1225(C0063.m4450(), str, cls);
    }

    public static Gson getGson(String str) {
        return (Gson) C0072.m6108(m4290(), str);
    }

    public static String toJson(Object obj) {
        return C0065.m4780(C0063.m4450(), obj);
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Gson m4288() {
        if (C0026.m2298() < 0) {
            return createGson();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m4289() {
        if (C0021.m1598() < 0) {
            return f146short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡ۟, reason: contains not printable characters */
    public static Map m4290() {
        if (C0075.m6893() >= 0) {
            return GSONS;
        }
        return null;
    }

    private static Gson createGson() {
        return C0068.m5661(C0073.m6300(C0027.m2444(new GsonBuilder())));
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) C0111.m13100(C0063.m4450(), str, type);
    }

    public static Gson getGson() {
        Map mapM4290 = m4290();
        Gson gson = (Gson) C0072.m6108(mapM4290, C0038.m4022(m4289(), 60, 12, 440));
        if (gson != null) {
            return gson;
        }
        String strM4757 = C0065.m4757(m4289(), 72, 11, 1468);
        Gson gson2 = (Gson) C0072.m6108(mapM4290, strM4757);
        if (gson2 != null) {
            return gson2;
        }
        Gson gsonM4288 = m4288();
        C0035.m3624(mapM4290, strM4757, gsonM4288);
        return gsonM4288;
    }

    public static Gson getGson4LogUtils() {
        Map mapM4290 = m4290();
        String strM2695 = C0029.m2695(m4289(), 83, 12, 1250);
        Gson gson = (Gson) C0072.m6108(mapM4290, strM2695);
        if (gson != null) {
            return gson;
        }
        Gson gsonM5661 = C0068.m5661(C0027.m2444(C0030.m2844(new GsonBuilder())));
        C0035.m3624(mapM4290, strM2695, gsonM5661);
        return gsonM5661;
    }

    public static Type getListType(Type type) {
        return C0070.m5860(C0038.m4026(List.class, new Type[]{type}));
    }

    public static Type getMapType(Type type, Type type2) {
        return C0070.m5860(C0038.m4026(Map.class, new Type[]{type, type2}));
    }

    public static Type getSetType(Type type) {
        return C0070.m5860(C0038.m4026(Set.class, new Type[]{type}));
    }

    public static void setGsonDelegate(Gson gson) {
        if (gson == null) {
            return;
        }
        C0035.m3624(m4290(), C0026.m2321(m4289(), 95, 12, 1618), gson);
    }

    public static String toJson(Object obj, Type type) {
        return C0017.m839(C0063.m4450(), obj, type);
    }

    private GsonUtils() {
        throw new UnsupportedOperationException(C0033.m3330(m4289(), 35, 25, 580));
    }

    public static <T> T fromJson(Gson gson, String str, Class<T> cls) {
        return (T) C0026.m2342(gson, str, cls);
    }

    public static Type getArrayType(Type type) {
        return C0070.m5860(C0039.m4136(type));
    }

    public static Type getType(Type type, Type... typeArr) {
        return C0070.m5860(C0038.m4026(type, typeArr));
    }

    public static void setGson(String str, Gson gson) {
        if (!C0038.m3939(str) && gson != null) {
            C0035.m3624(m4290(), str, gson);
        }
    }

    public static String toJson(Gson gson, Object obj) {
        return C0036.m3712(gson, obj);
    }

    public static <T> T fromJson(Gson gson, String str, Type type) {
        return (T) C0029.m2806(gson, str, type);
    }

    public static String toJson(Gson gson, Object obj, Type type) {
        return C0030.m2871(gson, obj, type);
    }
}
