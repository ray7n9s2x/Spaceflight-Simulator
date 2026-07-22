package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonSyntaxException;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.DateTypeAdapter.1
        @Override // com.joke.plugin.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (C0034.m3474(typeToken) == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> dateFormats;

    private synchronized Date deserializeToDate(String str) {
        String str2 = str;
        synchronized (this) {
            Iterator itM4732 = C0065.m4732(m5217(this));
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

    /* JADX INFO: renamed from: ۟ۦۣۤۥ, reason: not valid java name and contains not printable characters */
    public static Date m5216(Object obj, Object obj2) {
        if (C0018.m1064() >= 0) {
            return ((DateTypeAdapter) obj).deserializeToDate((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static List m5217(Object obj) {
        if (C0025.m2132() > 0) {
            return ((DateTypeAdapter) obj).dateFormats;
        }
        return null;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) {
        return C0016.m683(this, jsonReader);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) {
        C0029.m2716(this, jsonWriter, date);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) {
        if (C0022.m1758(jsonReader) != C0028.m2553()) {
            return m5216(this, C0078.m7406(jsonReader));
        }
        C0065.m4645(jsonReader);
        return null;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(JsonWriter jsonWriter, Date date) {
        if (date == null) {
            C0034.m3492(jsonWriter);
        } else {
            C0074.m6506(jsonWriter, C0070.m5925((DateFormat) C0071.m6078(m5217(this), 0), date));
        }
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Locale localeM7270 = C0077.m7270();
        C0077.m7162(arrayList, C0030.m2909(2, 2, localeM7270));
        if (!C0026.m2315(C0037.m3890(), localeM7270)) {
            C0077.m7162(arrayList, C0020.m1426(2, 2));
        }
        if (C0027.m2398()) {
            C0077.m7162(arrayList, C0036.m3755(2, 2));
        }
    }
}
