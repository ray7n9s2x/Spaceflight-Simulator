package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    private final List<DateFormat> dateFormats;
    private final Class<? extends Date> dateType;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f154short = {499, 466, 465, 470, 450, 475, 451, 499, 470, 451, 466, 483, 462, 455, 466, 502, 467, 470, 455, 451, 466, 453, 1296, 1333, 1312, 1329, 1396, 1312, 1325, 1316, 1329, 1396, 1337, 1313, 1319, 1312, 1396, 1334, 1329, 1396, 1339, 1338, 1329, 1396, 1339, 1330, 1396, 1243, 1239, 2480, 2492, 2547, 2542, 2492, 2881, 2819, 2836, 2837, 2881, 2838, 2816, 2834, 2881, 2736, 2705, 2706, 2709, 2689, 2712, 2688, 2736, 2709, 2688, 2705, 2720, 2701, 2692, 2705, 2741, 2704, 2709, 2692, 2688, 2705, 2694, 2780};
    private static final String SIMPLE_NAME = C0025.m2151(m4918(), 0, 22, 439);

    public DefaultDateTypeAdapter(Class<? extends Date> cls) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = m4923(cls);
        Locale localeM7270 = C0077.m7270();
        C0077.m7162(arrayList, C0030.m2909(2, 2, localeM7270));
        if (!C0026.m2315(C0037.m3890(), localeM7270)) {
            C0077.m7162(arrayList, C0020.m1426(2, 2));
        }
        if (C0027.m2398()) {
            C0077.m7162(arrayList, C0036.m3755(2, 2));
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Date m4917(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            return ((DefaultDateTypeAdapter) obj).read2((JsonReader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m4918() {
        if (C0038.m4010() >= 0) {
            return f154short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4919(Object obj, Object obj2, Object obj3) {
        if (C0018.m1064() >= 0) {
            ((DefaultDateTypeAdapter) obj).write2((JsonWriter) obj2, (Date) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Date m4920(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((DefaultDateTypeAdapter) obj).deserializeToDate((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static List m4921(Object obj) {
        if (C0065.m4647() > 0) {
            return ((DefaultDateTypeAdapter) obj).dateFormats;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۨ, reason: not valid java name and contains not printable characters */
    public static Class m4922(Object obj) {
        if (C0035.m3569() < 0) {
            return ((DefaultDateTypeAdapter) obj).dateType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Class m4923(Object obj) {
        if (C0021.m1598() <= 0) {
            return verifyDateType((Class) obj);
        }
        return null;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) {
        return m4917(this, jsonReader);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) {
        m4919(this, jsonWriter, date);
    }

    private Date deserializeToDate(String str) {
        String str2 = str;
        synchronized (m4921(this)) {
            Iterator itM4732 = C0065.m4732(m4921(this));
            while (C0036.m3657(itM4732)) {
                try {
                    return C0073.m6378((DateFormat) C0071.m6012(itM4732), str2);
                } catch (ParseException unused) {
                }
            }
            try {
                return C0023.m1825(str2, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str2, e);
            }
        }
    }

    private static Class<? extends Date> verifyDateType(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb = new StringBuilder(C0032.m3209(m4918(), 22, 25, 1364));
        C0036.m3741(sb, Date.class);
        C0077.m7290(sb, C0021.m1650(m4918(), 47, 2, 1271));
        C0036.m3741(sb, Timestamp.class);
        C0077.m7290(sb, C0063.m4315(m4918(), 49, 5, 2460));
        C0036.m3741(sb, java.sql.Date.class);
        C0077.m7290(sb, C0036.m3678(m4918(), 54, 9, 2913));
        C0036.m3741(sb, cls);
        throw new IllegalArgumentException(C0068.m5536(sb));
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) {
        if (C0022.m1758(jsonReader) == C0028.m2553()) {
            C0065.m4645(jsonReader);
            return null;
        }
        Date dateM4920 = m4920(this, C0078.m7406(jsonReader));
        Class clsM4922 = m4922(this);
        if (clsM4922 == Date.class) {
            return dateM4920;
        }
        if (clsM4922 == Timestamp.class) {
            return new Timestamp(C0033.m3322(dateM4920));
        }
        if (clsM4922 == java.sql.Date.class) {
            return new java.sql.Date(C0033.m3322(dateM4920));
        }
        throw new AssertionError();
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) C0071.m6078(m4921(this), 0);
        boolean z = dateFormat instanceof SimpleDateFormat;
        String strM3829 = C0037.m3829(m4918(), 63, 23, 2804);
        if (z) {
            StringBuilder sb = new StringBuilder(strM3829);
            C0077.m7290(sb, C0078.m7417((SimpleDateFormat) dateFormat));
            C0077.m7289(sb, ')');
            return C0068.m5536(sb);
        }
        StringBuilder sb2 = new StringBuilder(strM3829);
        C0077.m7290(sb2, C0032.m3134(C0030.m2951(dateFormat)));
        C0077.m7289(sb2, ')');
        return C0068.m5536(sb2);
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Date date) {
        if (date == null) {
            C0034.m3492(jsonWriter);
            return;
        }
        synchronized (m4921(this)) {
            C0074.m6506(jsonWriter, C0070.m5925((DateFormat) C0071.m6078(m4921(this), 0), date));
        }
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = m4923(cls);
        Locale localeM7270 = C0077.m7270();
        C0077.m7162(arrayList, new SimpleDateFormat(str, localeM7270));
        if (C0026.m2315(C0037.m3890(), localeM7270)) {
            return;
        }
        C0077.m7162(arrayList, new SimpleDateFormat(str));
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = m4923(cls);
        Locale localeM7270 = C0077.m7270();
        C0077.m7162(arrayList, C0021.m1636(i, localeM7270));
        if (!C0026.m2315(C0037.m3890(), localeM7270)) {
            C0077.m7162(arrayList, C0069.m5764(i));
        }
        if (C0027.m2398()) {
            C0077.m7162(arrayList, C0022.m1687(i));
        }
    }

    public DefaultDateTypeAdapter(int i, int i2) {
        this(Date.class, i, i2);
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = m4923(cls);
        Locale localeM7270 = C0077.m7270();
        C0077.m7162(arrayList, C0030.m2909(i, i2, localeM7270));
        if (!C0026.m2315(C0037.m3890(), localeM7270)) {
            C0077.m7162(arrayList, C0020.m1426(i, i2));
        }
        if (C0027.m2398()) {
            C0077.m7162(arrayList, C0036.m3755(i, i2));
        }
    }
}
